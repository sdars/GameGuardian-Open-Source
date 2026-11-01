package luaj.lib;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class Utf8Lib extends luaj.lib.TwoArgFunction {

    static class CodesAux extends luaj.lib.VarArgFunction {
        private int T;
        private final luaj.LuaString U;

        public CodesAux(luaj.LuaString r1) {
                r0 = this;
                r0.<init>()
                r0.U = r1
                r1 = 0
                r0.T = r1
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r4) {
                r3 = this;
                int r4 = r3.T
                luaj.LuaString r0 = r3.U
                int r1 = r0.Q
                int r2 = r0.R
                int r2 = r2 + r1
                if (r4 < r2) goto Le
                luaj.LuaValue r4 = luaj.LuaValue.f1671c
                return r4
            Le:
                byte[] r0 = r0.P
                int r1 = r1 + r4
                int r0 = luaj.lib.Utf8Lib.Y2(r0, r1, r2)
                int r1 = r0 >> 28
                r2 = 268435455(0xfffffff, float:2.5243547E-29)
                r0 = r0 & r2
                r2 = 5
                if (r1 == r2) goto L32
                int r1 = r1 + r4
                r3.T = r1
                int r4 = r4 + 1
                long r1 = (long) r4
                luaj.LuaLong r4 = luaj.LuaValue.I2(r1)
                long r0 = (long) r0
                luaj.LuaLong r0 = luaj.LuaValue.I2(r0)
                luaj.Varargs r4 = luaj.LuaValue.N2(r4, r0)
                return r4
            L32:
                luaj.LuaString r4 = r3.U
                int r4 = r4.Q
                int r0 = r0 - r4
                int r0 = r0 + 1
                luaj.d r4 = luaj.lib.Utf8Lib.Z2(r0)
                throw r4
        }
    }

    static final class _char extends luaj.lib.VarArgFunction {
        _char() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r14) {
                r13 = this;
                int r0 = r14.U()
                if (r0 != 0) goto L9
                luaj.LuaString r14 = luaj.LuaValue.L
                return r14
            L9:
                int r1 = r0 * 4
                byte[] r2 = new byte[r1]
                r3 = 0
                r4 = 1
                r5 = 1
                r6 = 0
            L11:
                if (r5 > r0) goto L78
                int r7 = r14.D(r5)
                r8 = 1114111(0x10ffff, float:1.561202E-39)
                if (r7 < 0) goto L1e
                if (r7 <= r8) goto L43
            L1e:
                java.lang.String r9 = r13.T2()
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "'"
                r10.append(r11)
                r10.append(r7)
                java.lang.String r11 = "': value out of range [0; "
                r10.append(r11)
                r10.append(r8)
                java.lang.String r8 = "]"
                r10.append(r8)
                java.lang.String r8 = r10.toString()
                luaj.LuaValue.l0(r5, r9, r8)
            L43:
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 > r8) goto L4a
                r8 = 1
                r9 = 0
                goto L5e
            L4a:
                r8 = 2047(0x7ff, float:2.868E-42)
                if (r7 > r8) goto L52
                r8 = 2
                r9 = 192(0xc0, float:2.69E-43)
                goto L5e
            L52:
                r8 = 65535(0xffff, float:9.1834E-41)
                if (r7 > r8) goto L5b
                r8 = 3
                r9 = 224(0xe0, float:3.14E-43)
                goto L5e
            L5b:
                r8 = 4
                r9 = 240(0xf0, float:3.36E-43)
            L5e:
                int r10 = r8 + (-1)
            L60:
                if (r10 <= 0) goto L70
                int r11 = r6 + r10
                r12 = r7 & 63
                r12 = r12 | 128(0x80, float:1.8E-43)
                byte r12 = (byte) r12
                r2[r11] = r12
                int r7 = r7 >> 6
                int r10 = r10 + (-1)
                goto L60
            L70:
                r7 = r7 | r9
                byte r7 = (byte) r7
                r2[r6] = r7
                int r6 = r6 + r8
                int r5 = r5 + 1
                goto L11
            L78:
                if (r6 >= r1) goto L7e
                byte[] r2 = java.util.Arrays.copyOf(r2, r6)
            L7e:
                luaj.LuaString r14 = luaj.LuaString.p3(r2, r3, r6)
                return r14
        }
    }

    static final class codepoint extends luaj.lib.VarArgFunction {
        codepoint() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r13) {
                r12 = this;
                r0 = 1
                luaj.LuaString r1 = r13.H(r0)
                int r2 = r1.R
                r3 = 2
                int r4 = r13.Y(r3, r0)
                int r4 = luaj.lib.StringLib.c3(r4, r2)
                r5 = 3
                int r13 = r13.Y(r5, r4)
                int r13 = luaj.lib.StringLib.c3(r13, r2)
                if (r4 < r0) goto L1f
                int r6 = r2 + 1
                if (r4 <= r6) goto L26
            L1f:
                java.lang.String r6 = r12.T2()
                luaj.lib.Utf8Lib.a3(r6, r3, r4, r2)
            L26:
                if (r13 <= r2) goto L2f
                java.lang.String r3 = r12.T2()
                luaj.lib.Utf8Lib.X2(r3, r5, r13, r2)
            L2f:
                if (r4 <= r13) goto L34
                luaj.LuaValue r13 = luaj.LuaValue.f1674f
                return r13
            L34:
                int r2 = r13 - r4
                int r2 = r2 + r0
                luaj.LuaValue[] r3 = new luaj.LuaValue[r2]
                byte[] r5 = r1.P
                int r6 = r1.Q
                int r1 = r1.R
                int r1 = r1 + r6
                int r4 = r4 - r0
                r7 = 0
            L42:
                if (r4 >= r13) goto L66
                int r8 = r6 + r4
                int r8 = luaj.lib.Utf8Lib.Y2(r5, r8, r1)
                int r9 = r8 >> 28
                r10 = 268435455(0xfffffff, float:2.5243547E-29)
                r8 = r8 & r10
                r10 = 5
                if (r9 == r10) goto L5f
                int r4 = r4 + r9
                int r9 = r7 + 1
                long r10 = (long) r8
                luaj.LuaLong r8 = luaj.LuaValue.I2(r10)
                r3[r7] = r8
                r7 = r9
                goto L42
            L5f:
                int r8 = r8 - r6
                int r8 = r8 + r0
                luaj.d r13 = luaj.lib.Utf8Lib.Z2(r8)
                throw r13
            L66:
                if (r7 != 0) goto L6b
                luaj.LuaValue r13 = luaj.LuaValue.f1674f
                return r13
            L6b:
                if (r7 >= r2) goto L74
                java.lang.Object[] r13 = java.util.Arrays.copyOf(r3, r7)
                r3 = r13
                luaj.LuaValue[] r3 = (luaj.LuaValue[]) r3
            L74:
                luaj.Varargs r13 = luaj.LuaValue.O2(r3)
                return r13
        }
    }

    static final class codes extends luaj.lib.VarArgFunction {
        codes() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r2) {
                r1 = this;
                r0 = 1
                luaj.LuaString r2 = r2.H(r0)
                luaj.lib.Utf8Lib$CodesAux r0 = new luaj.lib.Utf8Lib$CodesAux
                r0.<init>(r2)
                return r0
        }
    }

    static final class len extends luaj.lib.VarArgFunction {
        len() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r10) {
                r9 = this;
                r0 = 1
                luaj.LuaString r1 = r10.H(r0)
                int r2 = r1.R
                r3 = 2
                int r4 = r10.Y(r3, r0)
                int r4 = luaj.lib.StringLib.c3(r4, r2)
                r5 = -1
                r6 = 3
                int r10 = r10.Y(r6, r5)
                int r10 = luaj.lib.StringLib.c3(r10, r2)
                if (r4 < r0) goto L20
                int r5 = r2 + 1
                if (r4 <= r5) goto L27
            L20:
                java.lang.String r5 = r9.T2()
                luaj.lib.Utf8Lib.a3(r5, r3, r4, r2)
            L27:
                if (r10 <= r2) goto L30
                java.lang.String r3 = r9.T2()
                luaj.lib.Utf8Lib.X2(r3, r6, r10, r2)
            L30:
                if (r4 <= r10) goto L35
                luaj.LuaNumber r10 = luaj.LuaValue.f1675g
                return r10
            L35:
                byte[] r2 = r1.P
                int r3 = r1.Q
                int r1 = r1.R
                int r1 = r1 + r3
                int r4 = r4 - r0
                r5 = 0
            L3e:
                if (r4 >= r10) goto L61
                int r6 = r3 + r4
                int r6 = luaj.lib.Utf8Lib.Y2(r2, r6, r1)
                int r7 = r6 >> 28
                r8 = 5
                if (r7 != r8) goto L5d
                luaj.LuaValue r10 = luaj.LuaValue.f1671c
                r1 = 268435455(0xfffffff, float:2.5243547E-29)
                r1 = r1 & r6
                int r1 = r1 - r3
                int r1 = r1 + r0
                long r0 = (long) r1
                luaj.LuaLong r0 = luaj.LuaValue.I2(r0)
                luaj.Varargs r10 = luaj.LuaValue.N2(r10, r0)
                return r10
            L5d:
                int r4 = r4 + r7
                int r5 = r5 + 1
                goto L3e
            L61:
                long r0 = (long) r5
                luaj.LuaLong r10 = luaj.LuaValue.I2(r0)
                return r10
        }
    }

    static final class offset extends luaj.lib.VarArgFunction {
        offset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r9) {
                r8 = this;
                r0 = 1
                luaj.LuaString r1 = r9.H(r0)
                int r2 = r1.R
                r3 = 2
                int r3 = r9.D(r3)
                if (r3 < 0) goto L10
                r4 = 1
                goto L12
            L10:
                int r4 = r2 + 1
            L12:
                r5 = 3
                int r9 = r9.Y(r5, r4)
                int r9 = luaj.lib.StringLib.c3(r9, r2)
                if (r9 < r0) goto L21
                int r4 = r2 + 1
                if (r9 <= r4) goto L28
            L21:
                java.lang.String r4 = r8.T2()
                luaj.lib.Utf8Lib.a3(r4, r5, r9, r2)
            L28:
                byte[] r4 = r1.P
                int r1 = r1.Q
                int r9 = r9 + (-1)
                r5 = 128(0x80, float:1.8E-43)
                if (r3 != 0) goto L41
            L32:
                if (r9 <= 0) goto La3
                if (r9 >= r2) goto La3
                int r6 = r1 + r9
                r6 = r4[r6]
                r6 = r6 & 192(0xc0, float:2.69E-43)
                if (r6 != r5) goto La3
                int r9 = r9 + (-1)
                goto L32
            L41:
                if (r9 >= r2) goto L78
                int r6 = r1 + r9
                r7 = r4[r6]
                r7 = r7 & 192(0xc0, float:2.69E-43)
                if (r7 == r5) goto L4c
                goto L78
            L4c:
                luaj.d r0 = new luaj.d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "initial position ("
                r1.append(r2)
                r1.append(r9)
                java.lang.String r9 = ") is a continuation byte (0x"
                r1.append(r9)
                r9 = r4[r6]
                r9 = r9 & 255(0xff, float:3.57E-43)
                java.lang.String r9 = java.lang.Integer.toHexString(r9)
                r1.append(r9)
                java.lang.String r9 = ")"
                r1.append(r9)
                java.lang.String r9 = r1.toString()
                r0.<init>(r9)
                throw r0
            L78:
                if (r3 >= 0) goto L8f
            L7a:
                if (r3 >= 0) goto La3
                if (r9 <= 0) goto La3
            L7e:
                int r9 = r9 + (-1)
                if (r9 <= 0) goto L8c
                if (r9 >= r2) goto L8c
                int r6 = r1 + r9
                r6 = r4[r6]
                r6 = r6 & 192(0xc0, float:2.69E-43)
                if (r6 == r5) goto L7e
            L8c:
                int r3 = r3 + 1
                goto L7a
            L8f:
                int r3 = r3 + (-1)
                if (r3 <= 0) goto La3
                if (r9 >= r2) goto La3
            L95:
                int r9 = r9 + r0
                if (r9 < 0) goto L8f
                if (r9 >= r2) goto L8f
                int r6 = r1 + r9
                r6 = r4[r6]
                r6 = r6 & 192(0xc0, float:2.69E-43)
                if (r6 == r5) goto L95
                goto L8f
            La3:
                if (r3 != 0) goto Lac
                int r9 = r9 + r0
                long r0 = (long) r9
                luaj.LuaLong r9 = luaj.LuaValue.I2(r0)
                goto Lae
            Lac:
                luaj.LuaValue r9 = luaj.LuaValue.f1671c
            Lae:
                return r9
        }
    }

    public Utf8Lib() {
            r0 = this;
            r0.<init>()
            return
    }

    static void X2(java.lang.String r2, int r3, int r4, int r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "'"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "': final position out of string length ["
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = "]"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            luaj.LuaValue.l0(r3, r2, r4)
            return
    }

    static int Y2(byte[] r8, int r9, int r10) {
            r0 = r8[r9]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            r2 = 1342177280(0x50000000, float:8.589935E9)
            r3 = 127(0x7f, float:1.78E-43)
            if (r0 > r3) goto Le
            r3 = -1
            r4 = 1
            goto L31
        Le:
            r4 = 192(0xc0, float:2.69E-43)
            if (r0 >= r4) goto L15
            r8 = r9 | r2
            return r8
        L15:
            r4 = 224(0xe0, float:3.14E-43)
            if (r0 >= r4) goto L1d
            r0 = r0 ^ 192(0xc0, float:2.69E-43)
            r4 = 2
            goto L31
        L1d:
            r3 = 240(0xf0, float:3.36E-43)
            if (r0 >= r3) goto L27
            r0 = r0 ^ 224(0xe0, float:3.14E-43)
            r4 = 3
            r3 = 2047(0x7ff, float:2.868E-42)
            goto L31
        L27:
            r3 = 248(0xf8, float:3.48E-43)
            if (r0 >= r3) goto L5c
            r0 = r0 ^ 240(0xf0, float:3.36E-43)
            r4 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
        L31:
            if (r1 >= r4) goto L4d
            if (r1 < r10) goto L38
            r8 = r9 | r2
            return r8
        L38:
            int r5 = r9 + r1
            r5 = r8[r5]
            r6 = r5 & 192(0xc0, float:2.69E-43)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 == r7) goto L45
            r8 = r9 | r2
            return r8
        L45:
            int r0 = r0 << 6
            r5 = r5 & 63
            r0 = r0 | r5
            int r1 = r1 + 1
            goto L31
        L4d:
            r8 = 1114111(0x10ffff, float:1.561202E-39)
            if (r0 > r8) goto L59
            if (r0 > r3) goto L55
            goto L59
        L55:
            int r8 = r4 << 28
            r8 = r8 | r0
            return r8
        L59:
            r8 = r9 | r2
            return r8
        L5c:
            r8 = r9 | r2
            return r8
    }

    static luaj.d Z2(int r3) {
            luaj.d r0 = new luaj.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invalid UTF-8 code at "
            r1.append(r2)
            int r3 = r3 + 1
            r1.append(r3)
            java.lang.String r3 = " byte"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            return r0
    }

    static void a3(java.lang.String r2, int r3, int r4, int r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "'"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "': position out of range [1; "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = "]"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            luaj.LuaValue.l0(r3, r2, r4)
            return
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue r4, luaj.LuaValue r5) {
            r3 = this;
            luaj.LuaTable r4 = new luaj.LuaTable
            r4.<init>()
            luaj.lib.Utf8Lib$_char r0 = new luaj.lib.Utf8Lib$_char
            r0.<init>()
            java.lang.String r1 = "char"
            r4.i2(r1, r0)
            r0 = 14
            byte[] r0 = new byte[r0]
            r0 = {x0068: FILL_ARRAY_DATA , data: [91, 0, 45, 127, -62, 45, -12, 93, 91, -128, 45, -65, 93, 42} // fill-array
            luaj.LuaString r0 = luaj.LuaString.o3(r0)
            java.lang.String r1 = "charpattern"
            r4.i2(r1, r0)
            luaj.lib.Utf8Lib$codes r0 = new luaj.lib.Utf8Lib$codes
            r0.<init>()
            java.lang.String r1 = "codes"
            r4.i2(r1, r0)
            luaj.lib.Utf8Lib$codepoint r0 = new luaj.lib.Utf8Lib$codepoint
            r0.<init>()
            java.lang.String r1 = "codepoint"
            r4.i2(r1, r0)
            luaj.lib.Utf8Lib$len r0 = new luaj.lib.Utf8Lib$len
            r0.<init>()
            java.lang.String r1 = "len"
            r4.i2(r1, r0)
            luaj.lib.Utf8Lib$offset r0 = new luaj.lib.Utf8Lib$offset
            r0.<init>()
            java.lang.String r1 = "offset"
            r4.i2(r1, r0)
            java.lang.String r0 = "utf8"
            r5.i2(r0, r4)
            java.lang.String r1 = "package"
            luaj.LuaValue r2 = r5.T0(r1)
            boolean r2 = r2.l1()
            if (r2 != 0) goto L65
            luaj.LuaValue r5 = r5.T0(r1)
            java.lang.String r1 = "loaded"
            luaj.LuaValue r5 = r5.T0(r1)
            r5.i2(r0, r4)
        L65:
            luaj.LuaValue r4 = luaj.LuaValue.f1671c
            return r4
    }
}
