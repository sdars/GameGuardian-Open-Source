package luaj.lib;

/* JADX INFO: loaded from: classes.dex */
public class TableLib extends luaj.lib.TwoArgFunction {

    static class concat extends luaj.lib.TableLibFunction {
        concat() {
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue) {
            return luaValue.H0().W2(luaj.LuaValue.L, 1, luaValue.s1());
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
            return luaValue.H0().W2(luaValue2.G0(), 1, luaValue.s1());
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2, luaj.LuaValue luaValue3) {
            return luaValue.H0().W2(luaValue2.G0(), luaValue3.A0(), luaValue.s1());
        }

        @Override // luaj.lib.LibFunction
        public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2, luaj.LuaValue luaValue3, luaj.LuaValue luaValue4) {
            return luaValue.H0().W2(luaValue2.G0(), luaValue3.A0(), luaValue4.A0());
        }
    }

    static class insert extends luaj.lib.VarArgFunction {
        insert() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            int iU = varargs.U();
            if (iU != 2 && iU != 3) {
                throw new luaj.d("wrong number of arguments to 'table.insert': " + varargs.U() + " (must be 2 or 3)");
            }
            luaj.LuaTable luaTableI = varargs.I(1);
            int iS1 = luaTableI.s1();
            if (iS1 >= 16777215) {
                throw new luaj.d("array too big: " + iS1 + " >= 16777215");
            }
            int i = iS1 + 1;
            int iD = iU == 2 ? i : varargs.D(2);
            if (iD < 1 || iD > i) {
                luaj.LuaValue.l0(2, "table.insert", "position out of bounds: " + iD + " not between 1 and " + i);
            }
            if (iD < 16777215) {
                luaTableI.q3(iD, varargs.v(iU == 2 ? 2 : 3));
                return luaj.LuaValue.f1676f;
            }
            throw new luaj.d("position too big: " + iD + " >= 16777215");
        }
    }

    static class move extends luaj.lib.VarArgFunction {
        move() {
        }

        private static long X2(long j, long j2) {
            long j3 = j - j2;
            if (((j ^ j3) & (j2 ^ j)) < 0) {
                return Long.MAX_VALUE;
            }
            return j3;
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            luaj.LuaTable luaTableI = varargs.I(1);
            long jF = varargs.F(2);
            long jF2 = varargs.F(3);
            long jF3 = varargs.F(4);
            luaj.LuaTable luaTableC0 = varargs.c0(5, luaTableI);
            if (jF <= jF2) {
                long jX2 = X2(jF2, jF);
                if (jX2 > 16777214) {
                    throw new luaj.d("too many elements to move: " + jX2 + " (max is 16777215)");
                }
                if (jF3 > 0 && jX2 > Long.MAX_VALUE - jF3) {
                    throw new luaj.d("move: destination wrap around");
                }
                boolean z = ((long) ((int) jF)) == jF && ((long) ((int) jF2)) == jF2;
                if (luaTableI != luaTableC0) {
                    for (long j = jF; j <= jF2; j++) {
                        luaTableC0.j2(luaj.LuaLong.I2((j - jF) + jF3), z ? luaTableI.c3((int) j) : luaTableI.U0(luaj.LuaLong.I2(j)));
                        if (j == jF2) {
                            break;
                        }
                    }
                } else if (jF3 <= jF || jF2 < jF3) {
                    for (long j2 = jF; j2 <= jF2; j2++) {
                        luaTableC0.j2(luaj.LuaLong.I2((j2 - jF) + jF3), z ? luaTableI.c3((int) j2) : luaTableI.U0(luaj.LuaLong.I2(j2)));
                        if (j2 == jF2) {
                            break;
                        }
                    }
                } else {
                    while (jF2 >= jF) {
                        luaTableC0.j2(luaj.LuaLong.I2((jF2 - jF) + jF3), z ? luaTableI.c3((int) jF2) : luaTableI.U0(luaj.LuaLong.I2(jF2)));
                        if (jF2 == jF) {
                            break;
                        }
                        jF2--;
                    }
                }
            }
            return luaTableC0;
        }
    }

    static class pack extends luaj.lib.VarArgFunction {
        pack() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            luaj.LuaTable luaTableT2 = luaj.LuaValue.t2(varargs, 1);
            luaTableT2.g2("n", varargs.U());
            return luaTableT2;
        }
    }

    static class remove extends luaj.lib.VarArgFunction {
        remove() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            luaj.LuaTable luaTableI = varargs.I(1);
            int iS1 = luaTableI.s1();
            int iY = varargs.Y(2, iS1);
            if (iY != iS1 && (iY < 1 || iY > iS1 + 1)) {
                luaj.LuaValue.l0(2, "table.remove", "position out of bounds: " + iY + " not between 1 and " + (iS1 + 1));
            }
            if (iY < 16777215) {
                return luaTableI.z3(iY, iS1);
            }
            throw new luaj.d("position too big: " + iY + " >= 16777215");
        }
    }

    static class sort extends luaj.lib.VarArgFunction {
        sort() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            varargs.I(1).D3(varargs.Q(2) ? luaj.LuaValue.f1673c : varargs.C(2));
            return luaj.LuaValue.f1676f;
        }
    }

    static class unpack extends luaj.lib.VarArgFunction {
        unpack() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            luaj.LuaTable luaTableI = varargs.I(1);
            return luaTableI.F3(varargs.a0(2, 1L), varargs.a0(3, varargs.v(3).l1() ? luaTableI.s1() : 0L));
        }
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
        luaj.LuaTable luaTable = new luaj.LuaTable();
        luaTable.i2("concat", new luaj.lib.TableLib.concat());
        luaTable.i2("insert", new luaj.lib.TableLib.insert());
        luaTable.i2("move", new luaj.lib.TableLib.move());
        luaTable.i2("pack", new luaj.lib.TableLib.pack());
        luaTable.i2("remove", new luaj.lib.TableLib.remove());
        luaTable.i2("sort", new luaj.lib.TableLib.sort());
        luaTable.i2("unpack", new luaj.lib.TableLib.unpack());
        luaValue2.i2("table", luaTable);
        if (!luaValue2.T0("package").l1()) {
            luaValue2.T0("package").T0("loaded").i2("table", luaTable);
        }
        return luaj.LuaValue.f1673c;
    }
}
