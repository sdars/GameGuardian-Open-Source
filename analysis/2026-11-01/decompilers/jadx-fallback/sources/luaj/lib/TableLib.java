package luaj.lib;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class TableLib extends luaj.lib.TwoArgFunction {

    static class concat extends luaj.lib.TableLibFunction {
        concat() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r4) {
                r3 = this;
                luaj.LuaTable r0 = r4.H0()
                luaj.LuaString r1 = luaj.LuaValue.L
                r2 = 1
                int r4 = r4.s1()
                luaj.LuaValue r4 = r0.W2(r1, r2, r4)
                return r4
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r3, luaj.LuaValue r4) {
                r2 = this;
                luaj.LuaTable r0 = r3.H0()
                luaj.LuaString r4 = r4.G0()
                r1 = 1
                int r3 = r3.s1()
                luaj.LuaValue r3 = r0.W2(r4, r1, r3)
                return r3
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r2, luaj.LuaValue r3, luaj.LuaValue r4) {
                r1 = this;
                luaj.LuaTable r0 = r2.H0()
                luaj.LuaString r3 = r3.G0()
                int r4 = r4.A0()
                int r2 = r2.s1()
                luaj.LuaValue r2 = r0.W2(r3, r4, r2)
                return r2
        }

        @Override // luaj.lib.LibFunction
        public luaj.LuaValue call(luaj.LuaValue r1, luaj.LuaValue r2, luaj.LuaValue r3, luaj.LuaValue r4) {
                r0 = this;
                luaj.LuaTable r1 = r1.H0()
                luaj.LuaString r2 = r2.G0()
                int r3 = r3.A0()
                int r4 = r4.A0()
                luaj.LuaValue r1 = r1.W2(r2, r3, r4)
                return r1
        }
    }

    static class insert extends luaj.lib.VarArgFunction {
        insert() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r11) {
                r10 = this;
                int r0 = r11.U()
                r1 = 3
                r2 = 2
                if (r0 == r2) goto L2b
                if (r0 != r1) goto Lb
                goto L2b
            Lb:
                luaj.d r0 = new luaj.d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "wrong number of arguments to 'table.insert': "
                r1.append(r2)
                int r11 = r11.U()
                r1.append(r11)
                java.lang.String r11 = " (must be 2 or 3)"
                r1.append(r11)
                java.lang.String r11 = r1.toString()
                r0.<init>(r11)
                throw r0
            L2b:
                r3 = 1
                luaj.LuaTable r4 = r11.I(r3)
                int r5 = r4.s1()
                java.lang.String r6 = " >= "
                r7 = 16777215(0xffffff, float:2.3509886E-38)
                if (r5 >= r7) goto L92
                int r5 = r5 + r3
                if (r0 != r2) goto L40
                r8 = r5
                goto L44
            L40:
                int r8 = r11.D(r2)
            L44:
                if (r8 < r3) goto L48
                if (r8 <= r5) goto L66
            L48:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r9 = "position out of bounds: "
                r3.append(r9)
                r3.append(r8)
                java.lang.String r9 = " not between 1 and "
                r3.append(r9)
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                java.lang.String r5 = "table.insert"
                luaj.LuaValue.l0(r2, r5, r3)
            L66:
                if (r8 >= r7) goto L75
                if (r0 != r2) goto L6b
                r1 = 2
            L6b:
                luaj.LuaValue r11 = r11.v(r1)
                r4.q3(r8, r11)
                luaj.LuaValue r11 = luaj.LuaValue.f1674f
                return r11
            L75:
                luaj.d r11 = new luaj.d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "position too big: "
                r0.append(r1)
                r0.append(r8)
                r0.append(r6)
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                r11.<init>(r0)
                throw r11
            L92:
                luaj.d r11 = new luaj.d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "array too big: "
                r0.append(r1)
                r0.append(r5)
                r0.append(r6)
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                r11.<init>(r0)
                throw r11
        }
    }

    static class move extends luaj.lib.VarArgFunction {
        move() {
                r0 = this;
                r0.<init>()
                return
        }

        private static long X2(long r3, long r5) {
                long r0 = r3 - r5
                long r5 = r5 ^ r3
                long r3 = r3 ^ r0
                long r3 = r3 & r5
                r5 = 0
                int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r2 >= 0) goto L11
                r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                return r3
            L11:
                return r0
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r17) {
                r16 = this;
                r0 = r17
                r1 = 1
                luaj.LuaTable r2 = r0.I(r1)
                r3 = 2
                long r3 = r0.F(r3)
                r5 = 3
                long r5 = r0.F(r5)
                r7 = 4
                long r7 = r0.F(r7)
                r9 = 5
                luaj.LuaTable r0 = r0.c0(r9, r2)
                int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r9 > 0) goto Lf1
                long r9 = X2(r5, r3)
                r11 = 16777214(0xfffffe, double:8.289045E-317)
                int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r13 > 0) goto Lca
                r11 = 0
                int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r13 <= 0) goto L43
                r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                long r11 = r11 - r7
                int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r13 > 0) goto L3b
                goto L43
            L3b:
                luaj.d r0 = new luaj.d
                java.lang.String r1 = "move: destination wrap around"
                r0.<init>(r1)
                throw r0
            L43:
                int r9 = (int) r3
                long r9 = (long) r9
                int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r11 != 0) goto L50
                int r9 = (int) r5
                long r9 = (long) r9
                int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r11 != 0) goto L50
                goto L51
            L50:
                r1 = 0
            L51:
                r9 = 1
                if (r2 != r0) goto La6
                int r11 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r11 <= 0) goto L82
                int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r11 >= 0) goto L5e
                goto L82
            L5e:
                int r11 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r11 < 0) goto Lf1
                long r12 = r5 - r3
                long r12 = r12 + r7
                luaj.LuaLong r12 = luaj.LuaLong.I2(r12)
                if (r1 == 0) goto L71
                int r13 = (int) r5
                luaj.LuaValue r13 = r2.c3(r13)
                goto L79
            L71:
                luaj.LuaLong r13 = luaj.LuaLong.I2(r5)
                luaj.LuaValue r13 = r2.U0(r13)
            L79:
                r0.j2(r12, r13)
                if (r11 != 0) goto L80
                goto Lf1
            L80:
                long r5 = r5 - r9
                goto L5e
            L82:
                r11 = r3
            L83:
                int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r13 > 0) goto Lf1
                long r14 = r11 - r3
                long r14 = r14 + r7
                luaj.LuaLong r14 = luaj.LuaLong.I2(r14)
                if (r1 == 0) goto L96
                int r15 = (int) r11
                luaj.LuaValue r15 = r2.c3(r15)
                goto L9e
            L96:
                luaj.LuaLong r15 = luaj.LuaLong.I2(r11)
                luaj.LuaValue r15 = r2.U0(r15)
            L9e:
                r0.j2(r14, r15)
                if (r13 != 0) goto La4
                goto Lf1
            La4:
                long r11 = r11 + r9
                goto L83
            La6:
                r11 = r3
            La7:
                int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r13 > 0) goto Lf1
                long r14 = r11 - r3
                long r14 = r14 + r7
                luaj.LuaLong r14 = luaj.LuaLong.I2(r14)
                if (r1 == 0) goto Lba
                int r15 = (int) r11
                luaj.LuaValue r15 = r2.c3(r15)
                goto Lc2
            Lba:
                luaj.LuaLong r15 = luaj.LuaLong.I2(r11)
                luaj.LuaValue r15 = r2.U0(r15)
            Lc2:
                r0.j2(r14, r15)
                if (r13 != 0) goto Lc8
                goto Lf1
            Lc8:
                long r11 = r11 + r9
                goto La7
            Lca:
                luaj.d r0 = new luaj.d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "too many elements to move: "
                r1.append(r2)
                r1.append(r9)
                java.lang.String r2 = " (max is "
                r1.append(r2)
                r2 = 16777215(0xffffff, double:8.2890456E-317)
                r1.append(r2)
                r2 = 41
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            Lf1:
                return r0
        }
    }

    static class pack extends luaj.lib.VarArgFunction {
        pack() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r3) {
                r2 = this;
                r0 = 1
                luaj.LuaTable r0 = luaj.LuaValue.t2(r3, r0)
                java.lang.String r1 = "n"
                int r3 = r3.U()
                r0.g2(r1, r3)
                return r0
        }
    }

    static class remove extends luaj.lib.VarArgFunction {
        remove() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r6) {
                r5 = this;
                r0 = 1
                luaj.LuaTable r1 = r6.I(r0)
                int r2 = r1.s1()
                r3 = 2
                int r6 = r6.Y(r3, r2)
                if (r6 == r2) goto L36
                if (r6 < r0) goto L16
                int r0 = r2 + 1
                if (r6 <= r0) goto L36
            L16:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = "position out of bounds: "
                r0.append(r4)
                r0.append(r6)
                java.lang.String r4 = " not between 1 and "
                r0.append(r4)
                int r4 = r2 + 1
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                java.lang.String r4 = "table.remove"
                luaj.LuaValue.l0(r3, r4, r0)
            L36:
                r0 = 16777215(0xffffff, float:2.3509886E-38)
                if (r6 >= r0) goto L40
                luaj.LuaValue r6 = r1.z3(r6, r2)
                return r6
            L40:
                luaj.d r1 = new luaj.d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "position too big: "
                r2.append(r3)
                r2.append(r6)
                java.lang.String r6 = " >= "
                r2.append(r6)
                r2.append(r0)
                java.lang.String r6 = r2.toString()
                r1.<init>(r6)
                throw r1
        }
    }

    static class sort extends luaj.lib.VarArgFunction {
        sort() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r4) {
                r3 = this;
                r0 = 1
                luaj.LuaTable r0 = r4.I(r0)
                r1 = 2
                boolean r2 = r4.Q(r1)
                if (r2 == 0) goto Lf
                luaj.LuaValue r4 = luaj.LuaValue.f1671c
                goto L13
            Lf:
                luaj.LuaFunction r4 = r4.C(r1)
            L13:
                r0.D3(r4)
                luaj.LuaValue r4 = luaj.LuaValue.f1674f
                return r4
        }
    }

    static class unpack extends luaj.lib.VarArgFunction {
        unpack() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r8) {
                r7 = this;
                r0 = 1
                luaj.LuaTable r0 = r8.I(r0)
                r1 = 3
                luaj.LuaValue r2 = r8.v(r1)
                boolean r2 = r2.l1()
                if (r2 == 0) goto L16
                int r2 = r0.s1()
                long r2 = (long) r2
                goto L18
            L16:
                r2 = 0
            L18:
                r4 = 2
                r5 = 1
                long r4 = r8.a0(r4, r5)
                long r1 = r8.a0(r1, r2)
                luaj.Varargs r8 = r0.F3(r4, r1)
                return r8
        }
    }

    public TableLib() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue r4, luaj.LuaValue r5) {
            r3 = this;
            luaj.LuaTable r4 = new luaj.LuaTable
            r4.<init>()
            luaj.lib.TableLib$concat r0 = new luaj.lib.TableLib$concat
            r0.<init>()
            java.lang.String r1 = "concat"
            r4.i2(r1, r0)
            luaj.lib.TableLib$insert r0 = new luaj.lib.TableLib$insert
            r0.<init>()
            java.lang.String r1 = "insert"
            r4.i2(r1, r0)
            luaj.lib.TableLib$move r0 = new luaj.lib.TableLib$move
            r0.<init>()
            java.lang.String r1 = "move"
            r4.i2(r1, r0)
            luaj.lib.TableLib$pack r0 = new luaj.lib.TableLib$pack
            r0.<init>()
            java.lang.String r1 = "pack"
            r4.i2(r1, r0)
            luaj.lib.TableLib$remove r0 = new luaj.lib.TableLib$remove
            r0.<init>()
            java.lang.String r1 = "remove"
            r4.i2(r1, r0)
            luaj.lib.TableLib$sort r0 = new luaj.lib.TableLib$sort
            r0.<init>()
            java.lang.String r1 = "sort"
            r4.i2(r1, r0)
            luaj.lib.TableLib$unpack r0 = new luaj.lib.TableLib$unpack
            r0.<init>()
            java.lang.String r1 = "unpack"
            r4.i2(r1, r0)
            java.lang.String r0 = "table"
            r5.i2(r0, r4)
            java.lang.String r1 = "package"
            luaj.LuaValue r2 = r5.T0(r1)
            boolean r2 = r2.l1()
            if (r2 != 0) goto L69
            luaj.LuaValue r5 = r5.T0(r1)
            java.lang.String r1 = "loaded"
            luaj.LuaValue r5 = r5.T0(r1)
            r5.i2(r0, r4)
        L69:
            luaj.LuaValue r4 = luaj.LuaValue.f1671c
            return r4
    }
}
