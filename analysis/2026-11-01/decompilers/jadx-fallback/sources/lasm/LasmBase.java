package lasm;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class LasmBase {

    static class Const extends lasm.LasmBase.Internal {
        Const(e.f r2) {
                r1 = this;
                int r0 = lasm.LasmBase.e(r2)
                r1.<init>(r2, r0)
                return
        }
    }

    static class Internal extends luaj.LuaValue {
        int P;
        e.f Q;

        Internal(e.f r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.Q = r1
                r0.P = r2
                return
        }

        @Override // luaj.LuaValue
        public int C2() {
                r1 = this;
                int r0 = r1.P
                return r0
        }

        @Override // luaj.LuaValue
        public java.lang.String D2() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    static class U extends lasm.LasmBase.Internal {
        U(e.f r2) {
                r1 = this;
                r0 = 1
                int r0 = lasm.LasmBase.f(r2, r0)
                r1.<init>(r2, r0)
                return
        }
    }

    static class V extends lasm.LasmBase.Internal {
        V(e.f r2) {
                r1 = this;
                r0 = 1
                int r0 = lasm.LasmBase.f(r2, r0)
                r1.<init>(r2, r0)
                return
        }
    }

    public LasmBase() {
            r0 = this;
            r0.<init>()
            return
    }

    static void a(lasm.LasmBase.V r0, lasm.LasmBase.V r1, int r2) {
            return
    }

    static void b(lasm.LasmBase.V r3, lasm.LasmBase.V r4) {
            int r0 = r3.P
            int r1 = r4.P
            if (r0 != r1) goto L7
            return
        L7:
            e.b r0 = new e.b
            e.f r4 = r4.Q
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Register must be "
            r1.append(r2)
            e.f r3 = r3.Q
            java.lang.String r3 = r3.f1549f
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r4, r3)
            throw r0
    }

    public static java.lang.String c(java.lang.Throwable r6, java.lang.String r7, boolean r8) {
            boolean r0 = r6 instanceof e.b
            r1 = 0
            if (r0 == 0) goto Le
            e.b r6 = (e.b) r6
            e.f r6 = r6.f1533a
        L9:
            int r0 = r6.f1545b
            int r6 = r6.f1546c
            goto L26
        Le:
            boolean r0 = r6 instanceof e.d
            if (r0 == 0) goto L19
            e.d r6 = (e.d) r6
            e.f r6 = r6.f1533a
            e.f r6 = r6.f1550g
            goto L9
        L19:
            boolean r0 = r6 instanceof lasm.c
            if (r0 == 0) goto L24
            lasm.c r6 = (lasm.c) r6
            int r0 = r6.f1641b
            int r6 = r6.f1642c
            goto L26
        L24:
            r6 = 0
            r0 = 0
        L26:
            java.lang.String r2 = ""
            if (r0 <= 0) goto L99
            java.io.BufferedReader r3 = new java.io.BufferedReader
            java.io.InputStreamReader r4 = new java.io.InputStreamReader
            java.io.FileInputStream r5 = new java.io.FileInputStream
            r5.<init>(r7)
            r4.<init>(r5)
            r3.<init>(r4)
            r7 = 0
        L3a:
            java.lang.String r4 = r3.readLine()
            if (r4 == 0) goto L96
            int r7 = r7 + 1
            if (r7 != r0) goto L3a
            java.lang.String r7 = "\n"
            if (r8 == 0) goto L6e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            int r6 = r6 + (-1)
            java.lang.String r0 = r4.substring(r1, r6)
            r8.append(r0)
            r0 = 8291(0x2063, float:1.1618E-41)
            r8.append(r0)
            java.lang.String r6 = r4.substring(r6)
            r8.append(r6)
            r8.append(r7)
        L68:
            java.lang.String r6 = r8.toString()
            r2 = r6
            goto L96
        L6e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r4)
            r8.append(r7)
            java.lang.String r7 = new java.lang.String
            int r6 = r6 + (-1)
            char[] r6 = new char[r6]
            r7.<init>(r6)
            java.lang.String r6 = "\u0000"
            java.lang.String r0 = "_"
            java.lang.String r6 = r7.replace(r6, r0)
            r8.append(r6)
            java.lang.String r6 = "^\n"
            r8.append(r6)
            goto L68
        L96:
            r3.close()
        L99:
            return r2
    }

    static int d(e.f r4) {
            java.lang.String r0 = r4.f1549f     // Catch: java.lang.NumberFormatException -> Lf
            r1 = 2
            java.lang.String r0 = r0.substring(r1)     // Catch: java.lang.NumberFormatException -> Lf
            r1 = 16
            long r0 = java.lang.Long.parseLong(r0, r1)     // Catch: java.lang.NumberFormatException -> Lf
            int r4 = (int) r0
            return r4
        Lf:
            r0 = move-exception
            e.b r1 = new e.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed parse '"
            r2.append(r3)
            java.lang.String r3 = r4.f1549f
            r2.append(r3)
            java.lang.String r3 = "' as hex"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r4, r2, r0)
            throw r1
    }

    static int e(e.f r1) {
            r0 = 0
            int r1 = f(r1, r0)
            return r1
    }

    static int f(e.f r3, int r4) {
            java.lang.String r0 = r3.f1549f     // Catch: java.lang.NumberFormatException -> Lb
            java.lang.String r4 = r0.substring(r4)     // Catch: java.lang.NumberFormatException -> Lb
            int r3 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> Lb
            return r3
        Lb:
            r4 = move-exception
            e.b r0 = new e.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed parse '"
            r1.append(r2)
            java.lang.String r2 = r3.f1549f
            r1.append(r2)
            java.lang.String r2 = "' as integer"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r3, r1, r4)
            throw r0
    }

    static int g(e.f r4, int r5) {
            r0 = 0
            int r0 = f(r4, r0)
            if (r0 > r5) goto L8
            return r0
        L8:
            e.b r1 = new e.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "'"
            r2.append(r3)
            java.lang.String r3 = r4.f1549f
            r2.append(r3)
            java.lang.String r3 = "' parsed as "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " out of possible range [0; "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = "]"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r4, r5)
            throw r1
    }

    static long h(e.f r4) {
            java.lang.String r0 = r4.f1549f     // Catch: java.lang.NumberFormatException -> L7
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L7
            return r0
        L7:
            r0 = move-exception
            e.b r1 = new e.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed parse '"
            r2.append(r3)
            java.lang.String r3 = r4.f1549f
            r2.append(r3)
            java.lang.String r3 = "' as long"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r4, r2, r0)
            throw r1
    }

    static luaj.LuaValue i(e.f r4) {
            java.lang.String r0 = r4.f1549f     // Catch: java.lang.NumberFormatException -> L9
            luaj.LuaNumber r1 = luaj.LuaValue.f1675g     // Catch: java.lang.NumberFormatException -> L9
            luaj.LuaValue r4 = luaj.LuaValue.P1(r0, r1)     // Catch: java.lang.NumberFormatException -> L9
            return r4
        L9:
            r0 = move-exception
            e.b r1 = new e.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed parse '"
            r2.append(r3)
            java.lang.String r3 = r4.f1549f
            r2.append(r3)
            java.lang.String r3 = "' as Lua number"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r4, r2, r0)
            throw r1
    }

    static luaj.LuaString j(e.f r16) {
            r0 = r16
            int r1 = r0.f1544a
            r2 = 56
            if (r1 != r2) goto La
            r0 = 0
            return r0
        La:
            java.lang.String r1 = r0.f1549f
            byte[] r1 = r1.getBytes()
            f.a r2 = new f.a
            int r3 = r1.length
            r4 = 2
            int r3 = r3 - r4
            r2.<init>(r3)
            int r3 = r1.length
            r5 = 1
            int r3 = r3 - r5
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
        L1f:
            java.lang.String r11 = "hex"
            java.lang.String r12 = "unicode"
            r13 = 3
            if (r7 >= r3) goto L174
            r15 = r1[r7]
            if (r8 == 0) goto L168
            r6 = 4
            r14 = 48
            if (r8 == r5) goto L110
            if (r8 == r4) goto L59
            if (r8 == r13) goto L44
            if (r8 == r6) goto L3a
            r6 = 6
            if (r8 == r6) goto L59
            goto L16e
        L3a:
            r6 = 32
            if (r15 == r6) goto L171
            switch(r15) {
                case 9: goto L171;
                case 10: goto L171;
                case 11: goto L171;
                case 12: goto L171;
                case 13: goto L171;
                default: goto L41;
            }
        L41:
            r8 = 0
            goto L16e
        L44:
            if (r14 > r15) goto L55
            r6 = 57
            if (r15 > r6) goto L55
            int r9 = r9 * 10
            int r15 = r15 + (-48)
            int r9 = r9 + r15
            int r10 = r10 + 1
            if (r10 >= r13) goto L57
            goto L171
        L55:
            int r7 = r7 + (-1)
        L57:
            byte r15 = (byte) r9
            goto L41
        L59:
            int r9 = r9 * 16
            r6 = -1
            if (r10 != r6) goto L65
            r6 = 123(0x7b, float:1.72E-43)
            if (r15 == r6) goto Lc5
        L62:
            int r10 = r10 + 100
            goto Lc5
        L65:
            r6 = 6
            if (r8 != r6) goto La5
            r6 = 125(0x7d, float:1.75E-43)
            if (r15 != r6) goto La5
            int r9 = r9 / 16
            r6 = 1114111(0x10ffff, float:1.561202E-39)
            if (r9 > r6) goto L79
            r2.f(r9)
            r8 = 0
            goto L171
        L79:
            e.b r1 = new e.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UTF-8 value too large: 0x"
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r9)
            r2.append(r3)
            java.lang.String r3 = " (max allowed = 0x"
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r6)
            r2.append(r3)
            java.lang.String r3 = ")"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r0, r2)
            throw r1
        La5:
            if (r14 > r15) goto Laf
            r6 = 57
            if (r15 > r6) goto Laf
            int r6 = r15 + (-48)
        Lad:
            int r9 = r9 + r6
            goto Lc5
        Laf:
            r6 = 97
            if (r6 > r15) goto Lba
            r6 = 102(0x66, float:1.43E-43)
            if (r15 > r6) goto Lba
            int r6 = r15 + (-87)
            goto Lad
        Lba:
            r6 = 65
            if (r6 > r15) goto L62
            r6 = 70
            if (r15 > r6) goto L62
            int r6 = r15 + (-55)
            goto Lad
        Lc5:
            int r10 = r10 + r5
            if (r10 >= r8) goto Lca
            goto L171
        Lca:
            if (r10 != r4) goto Lcd
            goto L57
        Lcd:
            int r1 = r0.f1546c
            int r1 = r1 + r7
            r0.f1546c = r1
            e.b r1 = new e.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid char '"
            r2.append(r3)
            r2.append(r15)
            java.lang.String r3 = "' (code 0x"
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r15)
            r2.append(r3)
            java.lang.String r3 = ") in "
            r2.append(r3)
            r3 = 6
            if (r8 != r3) goto Lf6
            r11 = r12
        Lf6:
            r2.append(r11)
            java.lang.String r4 = " escape sequence, must be "
            r2.append(r4)
            if (r8 != r3) goto L103
            java.lang.String r3 = "\\u{XXX}"
            goto L105
        L103:
            java.lang.String r3 = "\\xXX"
        L105:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r0, r2)
            throw r1
        L110:
            r8 = -1
            if (r14 > r15) goto L11c
            r11 = 57
            if (r15 > r11) goto L11c
            int r9 = r15 + (-48)
            r8 = 3
            r10 = 1
            goto L171
        L11c:
            r11 = 97
            if (r15 == r11) goto L165
            r11 = 98
            if (r15 == r11) goto L161
            r11 = 102(0x66, float:1.43E-43)
            if (r15 == r11) goto L15d
            r11 = 110(0x6e, float:1.54E-43)
            if (r15 == r11) goto L159
            r11 = 114(0x72, float:1.6E-43)
            if (r15 == r11) goto L155
            r11 = 120(0x78, float:1.68E-43)
            if (r15 == r11) goto L147
            r11 = 122(0x7a, float:1.71E-43)
            if (r15 == r11) goto L145
            switch(r15) {
                case 116: goto L141;
                case 117: goto L147;
                case 118: goto L13d;
                default: goto L13b;
            }
        L13b:
            goto L41
        L13d:
            r15 = 11
            goto L41
        L141:
            r15 = 9
            goto L41
        L145:
            r8 = 4
            goto L171
        L147:
            r6 = 117(0x75, float:1.64E-43)
            if (r15 != r6) goto L14d
            r10 = -1
            goto L14e
        L14d:
            r10 = 0
        L14e:
            if (r15 != r6) goto L152
            r8 = 6
            goto L153
        L152:
            r8 = 2
        L153:
            r9 = 0
            goto L171
        L155:
            r15 = 13
            goto L41
        L159:
            r15 = 10
            goto L41
        L15d:
            r15 = 12
            goto L41
        L161:
            r15 = 8
            goto L41
        L165:
            r15 = 7
            goto L41
        L168:
            r6 = 92
            if (r15 != r6) goto L16e
            r8 = 1
            goto L171
        L16e:
            r2.a(r15)
        L171:
            int r7 = r7 + r5
            goto L1f
        L174:
            if (r8 != r13) goto L17a
            byte r3 = (byte) r9
            r2.a(r3)
        L17a:
            r3 = 6
            if (r8 == r3) goto L185
            if (r8 != r4) goto L180
            goto L185
        L180:
            luaj.LuaString r0 = r2.l()
            return r0
        L185:
            int r2 = r0.f1546c
            int r1 = r1.length
            int r1 = r1 - r5
            int r2 = r2 + r1
            r0.f1546c = r2
            e.b r1 = new e.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unfinished "
            r2.append(r3)
            r3 = 6
            if (r8 != r3) goto L19c
            r11 = r12
        L19c:
            r2.append(r11)
            java.lang.String r3 = " escape sequence"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r0, r2)
            throw r1
    }
}
