/*
 * Decompiled with CFR 0.152.
 */
package luaj.lib;

import luaj.LuaLong;
import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;
import luaj.d;
import luaj.lib.TableLibFunction;
import luaj.lib.TwoArgFunction;
import luaj.lib.VarArgFunction;

public class TableLib
extends TwoArgFunction {
    @Override
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        luaValue = new LuaTable();
        luaValue.i2("concat", new concat());
        luaValue.i2("insert", new insert());
        luaValue.i2("move", new move());
        luaValue.i2("pack", new pack());
        luaValue.i2("remove", new remove());
        luaValue.i2("sort", new sort());
        luaValue.i2("unpack", new unpack());
        luaValue2.i2("table", luaValue);
        if (!luaValue2.T0("package").l1()) {
            luaValue2.T0("package").T0("loaded").i2("table", luaValue);
        }
        return LuaValue.c;
    }

    static class concat
    extends TableLibFunction {
        concat() {
        }

        @Override
        public LuaValue call(LuaValue luaValue) {
            return luaValue.H0().W2(LuaValue.L, 1, luaValue.s1());
        }

        @Override
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            return luaValue.H0().W2(luaValue2.G0(), 1, luaValue.s1());
        }

        @Override
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
            return luaValue.H0().W2(luaValue2.G0(), luaValue3.A0(), luaValue.s1());
        }

        @Override
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3, LuaValue luaValue4) {
            return luaValue.H0().W2(luaValue2.G0(), luaValue3.A0(), luaValue4.A0());
        }
    }

    static class insert
    extends VarArgFunction {
        insert() {
        }

        @Override
        public Varargs invoke(Varargs object) {
            int n3 = ((Varargs)object).U();
            int n4 = 3;
            if (n3 != 2 && n3 != 3) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("wrong number of arguments to 'table.insert': ");
                stringBuilder.append(((Varargs)object).U());
                stringBuilder.append(" (must be 2 or 3)");
                throw new d(stringBuilder.toString());
            }
            LuaTable luaTable = ((Varargs)object).I(1);
            int n5 = luaTable.s1();
            if (n5 < 0xFFFFFF) {
                int n6 = n5 + 1;
                n5 = n3 == 2 ? n6 : ((Varargs)object).D(2);
                if (n5 < 1 || n5 > n6) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("position out of bounds: ");
                    stringBuilder.append(n5);
                    stringBuilder.append(" not between 1 and ");
                    stringBuilder.append(n6);
                    LuaValue.l0(2, "table.insert", stringBuilder.toString());
                }
                if (n5 < 0xFFFFFF) {
                    if (n3 == 2) {
                        n4 = 2;
                    }
                    luaTable.q3(n5, ((Varargs)object).v(n4));
                    return LuaValue.f;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("position too big: ");
                ((StringBuilder)object).append(n5);
                ((StringBuilder)object).append(" >= ");
                ((StringBuilder)object).append(0xFFFFFF);
                throw new d(((StringBuilder)object).toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("array too big: ");
            ((StringBuilder)object).append(n5);
            ((StringBuilder)object).append(" >= ");
            ((StringBuilder)object).append(0xFFFFFF);
            throw new d(((StringBuilder)object).toString());
        }
    }

    static class move
    extends VarArgFunction {
        move() {
        }

        private static long X2(long l3, long l4) {
            long l5 = l3 - l4;
            if (((l3 ^ l5) & (l4 ^ l3)) < 0L) {
                return Long.MAX_VALUE;
            }
            return l5;
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public Varargs invoke(Varargs object) {
            long l3;
            boolean bl = true;
            LuaTable luaTable = ((Varargs)object).I(1);
            long l4 = ((Varargs)object).F(2);
            long l5 = ((Varargs)object).F(3);
            long l6 = ((Varargs)object).F(4);
            LuaTable luaTable2 = ((Varargs)object).c0(5, luaTable);
            if (l4 > l5) return luaTable2;
            long l7 = move.X2(l5, l4);
            if (l7 > 0xFFFFFEL) {
                object = new StringBuilder();
                ((StringBuilder)object).append("too many elements to move: ");
                ((StringBuilder)object).append(l7);
                ((StringBuilder)object).append(" (max is ");
                ((StringBuilder)object).append(0xFFFFFFL);
                ((StringBuilder)object).append(')');
                throw new d(((StringBuilder)object).toString());
            }
            if (l6 > 0L) {
                if (l7 > Long.MAX_VALUE - l6) throw new d("move: destination wrap around");
            }
            if ((long)((int)l4) != l4 || (long)((int)l5) != l5) {
                bl = false;
            }
            if (luaTable == luaTable2) {
                long l8;
                if (l6 > l4) {
                    l7 = l5;
                    if (l5 < l6) {
                    } else {
                        long l9;
                        while ((l9 = l7 == l4 ? 0 : (l7 < l4 ? -1 : 1)) >= 0) {
                            LuaLong luaLong = LuaLong.I2(l7 - l4 + l6);
                            object = bl ? luaTable.c3((int)l7) : luaTable.U0(LuaLong.I2(l7));
                            luaTable2.j2(luaLong, (LuaValue)object);
                            if (l9 == false) {
                                return luaTable2;
                            }
                            --l7;
                        }
                        return luaTable2;
                    }
                }
                l7 = l4;
                while ((l8 = l7 == l5 ? 0 : (l7 < l5 ? -1 : 1)) <= 0) {
                    LuaLong luaLong = LuaLong.I2(l7 - l4 + l6);
                    object = bl ? luaTable.c3((int)l7) : luaTable.U0(LuaLong.I2(l7));
                    luaTable2.j2(luaLong, (LuaValue)object);
                    if (l8 == false) {
                        return luaTable2;
                    }
                    ++l7;
                }
                return luaTable2;
            }
            l7 = l4;
            while ((l3 = l7 == l5 ? 0 : (l7 < l5 ? -1 : 1)) <= 0) {
                LuaLong luaLong = LuaLong.I2(l7 - l4 + l6);
                object = bl ? luaTable.c3((int)l7) : luaTable.U0(LuaLong.I2(l7));
                luaTable2.j2(luaLong, (LuaValue)object);
                if (l3 == false) {
                    return luaTable2;
                }
                ++l7;
            }
            return luaTable2;
        }
    }

    static class pack
    extends VarArgFunction {
        pack() {
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            LuaTable luaTable = LuaValue.t2(varargs, 1);
            luaTable.g2("n", varargs.U());
            return luaTable;
        }
    }

    static class remove
    extends VarArgFunction {
        remove() {
        }

        @Override
        public Varargs invoke(Varargs object) {
            LuaTable luaTable = ((Varargs)object).I(1);
            int n3 = luaTable.s1();
            int n4 = ((Varargs)object).Y(2, n3);
            if (n4 != n3 && (n4 < 1 || n4 > n3 + 1)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("position out of bounds: ");
                ((StringBuilder)object).append(n4);
                ((StringBuilder)object).append(" not between 1 and ");
                ((StringBuilder)object).append(n3 + 1);
                LuaValue.l0(2, "table.remove", ((StringBuilder)object).toString());
            }
            if (n4 < 0xFFFFFF) {
                return luaTable.z3(n4, n3);
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("position too big: ");
            ((StringBuilder)object).append(n4);
            ((StringBuilder)object).append(" >= ");
            ((StringBuilder)object).append(0xFFFFFF);
            throw new d(((StringBuilder)object).toString());
        }
    }

    static class sort
    extends VarArgFunction {
        sort() {
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            LuaTable luaTable = varargs.I(1);
            varargs = varargs.Q(2) ? LuaValue.c : varargs.C(2);
            luaTable.D3((LuaValue)varargs);
            return LuaValue.f;
        }
    }

    static class unpack
    extends VarArgFunction {
        unpack() {
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            LuaTable luaTable = varargs.I(1);
            long l3 = varargs.v(3).l1() ? (long)luaTable.s1() : 0L;
            return luaTable.F3(varargs.a0(2, 1L), varargs.a0(3, l3));
        }
    }
}

