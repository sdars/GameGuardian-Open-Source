package luaj.lib;

import android.ext.MainService;
import android.ext.e1;
import android.ext.t2;
import android.ext.z1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Locale;
import luaj.LuaClosure;
import luaj.LuaDouble;
import luaj.LuaFunction;
import luaj.LuaLong;
import luaj.LuaNumber;
import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
public class StringLib extends TwoArgFunction {
    private static final LuaString T = LuaValue.K2("^$*+?.([%-");
    static final byte[] U = new byte[256];

    static class GMatchAux extends VarArgFunction {
        private final int T;
        private final b U;
        private int V = 0;
        private int W = -1;

        public GMatchAux(Varargs varargs, LuaString luaString, LuaString luaString2) {
            this.T = luaString.s1();
            this.U = new b(varargs, luaString, luaString2);
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            while (this.V <= this.T) {
                this.U.p();
                int iG = this.U.g(this.V, 0);
                if (iG >= 0 && iG != this.W) {
                    int i = this.V;
                    this.V = iG;
                    this.W = iG;
                    return this.U.n(true, i, iG);
                }
                this.V++;
            }
            return LuaValue.f1673c;
        }
    }

    static final class _byte extends VarArgFunction {
        _byte() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaString luaStringH = varargs.H(1);
            int i = luaStringH.R;
            int iC3 = StringLib.c3(varargs.Y(2, 1), i);
            int iC4 = StringLib.c3(varargs.Y(3, iC3), i);
            if (iC3 <= 0) {
                iC3 = 1;
            }
            if (iC4 <= i) {
                i = iC4;
            }
            if (iC3 > i) {
                return LuaValue.f1676f;
            }
            int i2 = (i - iC3) + 1;
            if (iC3 + i2 <= i) {
                LuaValue.R0("string slice too long");
            }
            LuaValue[] luaValueArr = new LuaValue[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                luaValueArr[i3] = LuaValue.I2(luaStringH.g3((iC3 + i3) - 1));
            }
            return LuaValue.O2(luaValueArr);
        }
    }

    static final class _char extends VarArgFunction {
        _char() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            int iU = varargs.U();
            byte[] bArr = new byte[iU];
            int i = 0;
            int i2 = 1;
            while (i < iU) {
                int iD = varargs.D(i2);
                if (iD < 0 || iD >= 256) {
                    LuaValue.k0(i2, "invalid value for string.char [0; 255]: " + iD);
                }
                bArr[i] = (byte) iD;
                i++;
                i2++;
            }
            return LuaString.o3(bArr);
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f1772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f1773c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f1774d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f1775e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f1776f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f1777g;
        public final int h;
        public final int i;
        public final String j;

        public a(Varargs varargs, LuaString luaString, int i) {
            int iS1 = luaString.s1();
            int iG3 = 0;
            int i2 = i;
            boolean z = true;
            int iG4 = 0;
            while (z) {
                if (i2 < iS1) {
                    iG4 = luaString.g3(i2);
                    i2++;
                } else {
                    iG4 = 0;
                }
                if (iG4 == 32) {
                    this.f1774d = true;
                } else if (iG4 == 35) {
                    this.f1775e = true;
                } else if (iG4 == 43) {
                    this.f1773c = true;
                } else if (iG4 == 45) {
                    this.f1771a = true;
                } else if (iG4 != 48) {
                    z = false;
                } else {
                    this.f1772b = true;
                }
            }
            if (i2 - i > 5) {
                LuaValue.R0("invalid format (repeated flags)");
            }
            this.f1776f = -1;
            if (Character.isDigit((char) iG4)) {
                this.f1776f = iG4 - 48;
                if (i2 < iS1) {
                    iG4 = luaString.g3(i2);
                    i2++;
                } else {
                    iG4 = 0;
                }
                if (Character.isDigit((char) iG4)) {
                    this.f1776f = (this.f1776f * 10) + (iG4 - 48);
                    if (i2 < iS1) {
                        iG4 = luaString.g3(i2);
                        i2++;
                    } else {
                        iG4 = 0;
                    }
                }
            }
            this.f1777g = -1;
            if (iG4 == 46) {
                if (i2 < iS1) {
                    iG4 = luaString.g3(i2);
                    i2++;
                } else {
                    iG4 = 0;
                }
                if (Character.isDigit((char) iG4)) {
                    this.f1777g = iG4 - 48;
                    if (i2 < iS1) {
                        iG4 = luaString.g3(i2);
                        i2++;
                    } else {
                        iG4 = 0;
                    }
                    if (Character.isDigit((char) iG4)) {
                        this.f1777g = (this.f1777g * 10) + (iG4 - 48);
                        if (i2 < iS1) {
                            iG3 = luaString.g3(i2);
                            i2++;
                        }
                        iG4 = iG3;
                    }
                }
            }
            if (Character.isDigit((char) iG4)) {
                LuaValue.R0("invalid format (width or precision too long) at pos " + i2);
            }
            this.f1772b &= !this.f1771a;
            this.h = iG4;
            this.i = i2 - i;
            this.j = luaString.j3(i - 1, i2).g0();
        }

        public static final void e(f.a aVar, char c2, int i) {
            byte b2 = (byte) c2;
            while (true) {
                int i2 = i - 1;
                if (i <= 0) {
                    return;
                }
                aVar.a(b2);
                i = i2;
            }
        }

        public void a(f.a aVar, byte b2) {
            aVar.a(b2);
        }

        public void b(f.a aVar, double d2) {
            String strValueOf;
            if (Double.isNaN(d2)) {
                strValueOf = "nan";
            } else if (Double.isInfinite(d2)) {
                strValueOf = d2 < 0.0d ? "-inf" : "inf";
            } else {
                strValueOf = null;
            }
            if (strValueOf == null) {
                try {
                    strValueOf = String.format(Locale.US, this.j, Double.valueOf(d2));
                } catch (Throwable th) {
                    e1.s("Failed format double " + d2 + " with '" + this.j + '\'', th);
                    strValueOf = String.valueOf(d2);
                }
            } else if (this.h < 97) {
                strValueOf = strValueOf.toUpperCase(Locale.US);
            }
            aVar.b(strValueOf);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x004b  */
        public void c(f.a aVar, long j) {
            String hexString;
            int i;
            int i2;
            int i3;
            if (j == 0 && this.f1777g == 0) {
                hexString = "";
            } else {
                int i4 = this.h;
                if (i4 == 88) {
                    hexString = Long.toHexString(j);
                } else if (i4 != 111) {
                    if (i4 != 117) {
                        if (i4 == 120) {
                            hexString = Long.toHexString(j);
                        }
                    } else if (j < 0) {
                        long j2 = (j >>> 1) / 5;
                        hexString = Long.toString(j2) + (j - (10 * j2));
                    }
                    hexString = Long.toString(j);
                } else {
                    hexString = Long.toOctalString(j);
                }
                if (this.h == 88) {
                    hexString = hexString.toUpperCase(Locale.US);
                }
            }
            int length = hexString.length();
            if (j < 0) {
                i = length;
                length--;
            } else {
                i = (this.f1773c || this.f1774d) ? length + 1 : length;
            }
            int i5 = this.f1777g;
            if (i5 > length) {
                i2 = i5 - length;
            } else {
                i2 = (i5 == -1 && this.f1772b && (i3 = this.f1776f) > i) ? i3 - i : 0;
            }
            int i6 = i + i2;
            int i7 = this.f1776f;
            int i8 = i7 > i6 ? i7 - i6 : 0;
            if (!this.f1771a) {
                e(aVar, ' ', i8);
            }
            if (j < 0) {
                if (i2 > 0) {
                    aVar.a((byte) 45);
                    hexString = hexString.substring(1);
                }
            } else if (this.f1773c) {
                aVar.a((byte) 43);
            } else if (this.f1774d) {
                aVar.a((byte) 32);
            }
            if (i2 > 0) {
                e(aVar, '0', i2);
            }
            aVar.b(hexString);
            if (this.f1771a) {
                e(aVar, ' ', i8);
            }
        }

        public void d(f.a aVar, LuaString luaString) {
            int iS1 = luaString.s1();
            int i = this.f1776f;
            int i2 = this.f1777g;
            if (i2 == -1) {
                i2 = iS1;
            }
            if (iS1 > i2) {
                iS1 = i2;
            }
            if (iS1 < i && !this.f1771a) {
                byte b2 = (byte) (this.f1772b ? 48 : 32);
                for (int i3 = i - iS1; i3 > 0; i3--) {
                    aVar.a(b2);
                }
            }
            aVar.e(luaString.P, luaString.Q, iS1);
            if (iS1 >= i || !this.f1771a) {
                return;
            }
            byte b3 = (byte) (this.f1772b ? 48 : 32);
            for (int i4 = i - iS1; i4 > 0; i4--) {
                aVar.a(b3);
            }
        }
    }

    static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final LuaString f1779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final LuaString f1780c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Varargs f1781d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1782e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int[] f1783f = new int[32];

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int[] f1784g = new int[32];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1778a = 200;

        b(Varargs varargs, LuaString luaString, LuaString luaString2) {
            this.f1779b = luaString;
            this.f1780c = luaString2;
            this.f1781d = varargs;
        }

        private void a(f.a aVar, LuaString luaString, int i, int i2) {
            String str;
            int iS1 = luaString.s1();
            int i3 = 0;
            while (i3 < iS1) {
                byte bG3 = (byte) luaString.g3(i3);
                if (bG3 != 37) {
                    aVar.a(bG3);
                } else {
                    int i4 = i3 + 1;
                    byte bG4 = (byte) (i4 < iS1 ? luaString.g3(i4) : 0);
                    char c2 = (char) bG4;
                    if (Character.isDigit(c2)) {
                        aVar.c(bG4 == 48 ? this.f1779b.j3(i, i2) : o(bG4 - 49, i, i2).q2());
                    } else {
                        if (bG4 != 37) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("invalid use of '%' in replacement string: after '%' must be '0'-'9' or '%', but found ");
                            if (i4 < iS1) {
                                str = "symbol '" + c2 + "' with code " + ((int) bG4) + " at pos " + (i3 + 2);
                            } else {
                                str = "end of string";
                            }
                            sb.append(str);
                            LuaValue.R0(sb.toString());
                        }
                        aVar.a(bG4);
                    }
                    i3 = i4;
                }
                i3++;
            }
        }

        private int c() {
            for (int i = this.f1782e - 1; i >= 0; i--) {
                if (this.f1784g[i] == -1) {
                    return i;
                }
            }
            LuaValue.R0("invalid pattern capture");
            return 0;
        }

        private int d(int i) {
            int i2 = i - 49;
            if (i2 < 0 || i2 >= this.f1782e || this.f1784g[i2] == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid capture index %");
                sb.append(i - 48);
                LuaValue.R0(sb.toString());
            }
            return i2;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x003f  */
        /* JADX WARN: Code duplicated, block: B:30:0x0041  */
        static boolean i(int i, int i2) {
            boolean z;
            char lowerCase = Character.toLowerCase((char) i2);
            byte b2 = StringLib.U[i];
            if (lowerCase != 'a') {
                if (lowerCase != 'g') {
                    if (lowerCase != 'l') {
                        if (lowerCase != 'p') {
                            if (lowerCase != 's') {
                                if (lowerCase != 'u') {
                                    if (lowerCase != 'z') {
                                        if (lowerCase != 'c') {
                                            if (lowerCase != 'd') {
                                                if (lowerCase != 'w') {
                                                    if (lowerCase != 'x') {
                                                        return i2 == i;
                                                    }
                                                    if ((b2 & (-128)) != 0) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                } else if ((b2 & 9) != 0) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                            } else if ((b2 & 8) != 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                        } else if ((b2 & 64) != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                    } else if (i == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                } else if ((b2 & 4) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else if ((b2 & 32) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else if ((b2 & 16) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else if ((b2 & 2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if ((b2 & 25) != 0) {
                    z = true;
                } else {
                    z = false;
                }
            } else if ((b2 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (lowerCase == i2) {
                return z;
            }
            return !z;
        }

        private LuaValue o(int i, int i2, int i3) {
            if (i >= this.f1782e) {
                if (i == 0) {
                    return this.f1779b.j3(i2, i3);
                }
                return LuaValue.R0("invalid capture index %" + (i + 1));
            }
            int i4 = this.f1784g[i];
            if (i4 == -1) {
                return LuaValue.R0("unfinished capture");
            }
            if (i4 == -2) {
                return LuaValue.I2(this.f1783f[i] + 1);
            }
            int i5 = this.f1783f[i];
            return this.f1779b.j3(i5, i4 + i5);
        }

        public void b(f.a aVar, int i, int i2, LuaValue luaValue) {
            LuaValue luaValueU0;
            int iC2 = luaValue.C2();
            if (iC2 == 3 || iC2 == 4) {
                a(aVar, luaValue.q2(), i, i2);
                return;
            }
            if (iC2 == 5) {
                luaValueU0 = luaValue.U0(o(0, i, i2));
            } else {
                if (iC2 != 6) {
                    LuaValue.R0("bad argument: string/function/table expected");
                    return;
                }
                luaValueU0 = luaValue.invoke(n(true, i, i2)).w();
            }
            if (!luaValueU0.w2()) {
                luaValueU0 = this.f1779b.j3(i, i2);
            } else if (!luaValueU0.n1()) {
                LuaValue.R0("invalid replacement value (a " + luaValueU0.D2() + ')');
            }
            aVar.c(luaValueU0.q2());
        }

        int e(int i) {
            int i2 = i + 1;
            int iG3 = this.f1780c.g3(i);
            if (iG3 == 37) {
                if (i2 == this.f1780c.s1()) {
                    LuaValue.R0("malformed pattern (ends with '%')");
                }
                return i + 2;
            }
            if (iG3 != 91) {
                return i2;
            }
            if (i2 != this.f1780c.s1() && this.f1780c.g3(i2) == 94) {
                i2 = i + 2;
            }
            while (true) {
                if (i2 == this.f1780c.s1()) {
                    LuaValue.R0("malformed pattern (missing ']')");
                }
                int i3 = i2 + 1;
                i2 = (this.f1780c.g3(i2) != 37 || i3 >= this.f1780c.s1()) ? i3 : i2 + 2;
                if (i2 != this.f1780c.s1() && this.f1780c.g3(i2) == 93) {
                    return i2 + 1;
                }
            }
        }

        int f(int i, int i2) {
            int iC = c();
            this.f1784g[iC] = i - this.f1783f[iC];
            int iG = g(i, i2);
            if (iG == -1) {
                this.f1784g[iC] = -1;
            }
            return iG;
        }

        /* JADX WARN: Code duplicated, block: B:113:0x016f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:114:0x0166 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:115:0x0160 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:116:0x014a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:117:0x0145 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:118:0x0143 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:76:0x0124  */
        /* JADX WARN: Code duplicated, block: B:79:0x012d A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:6:0x000e, B:10:0x001c, B:71:0x010a, B:73:0x0116, B:77:0x0125, B:79:0x012d, B:90:0x0147, B:92:0x014c, B:97:0x0160, B:99:0x0168, B:100:0x016f, B:18:0x0036, B:21:0x003f, B:23:0x0049, B:25:0x0051, B:26:0x0059, B:27:0x005e, B:29:0x0068, B:30:0x006d, B:34:0x007b, B:36:0x0088, B:41:0x0096, B:42:0x009c, B:44:0x00a6, B:47:0x00b5, B:51:0x00c5, B:55:0x00d4, B:57:0x00dc, B:54:0x00ce, B:50:0x00bd, B:46:0x00b0, B:61:0x00e6, B:64:0x00ef, B:65:0x00f3, B:67:0x00fd), top: B:104:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:82:0x0137  */
        /* JADX WARN: Code duplicated, block: B:84:0x013b  */
        /* JADX WARN: Code duplicated, block: B:86:0x013f  */
        /* JADX WARN: Code duplicated, block: B:90:0x0147 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:6:0x000e, B:10:0x001c, B:71:0x010a, B:73:0x0116, B:77:0x0125, B:79:0x012d, B:90:0x0147, B:92:0x014c, B:97:0x0160, B:99:0x0168, B:100:0x016f, B:18:0x0036, B:21:0x003f, B:23:0x0049, B:25:0x0051, B:26:0x0059, B:27:0x005e, B:29:0x0068, B:30:0x006d, B:34:0x007b, B:36:0x0088, B:41:0x0096, B:42:0x009c, B:44:0x00a6, B:47:0x00b5, B:51:0x00c5, B:55:0x00d4, B:57:0x00dc, B:54:0x00ce, B:50:0x00bd, B:46:0x00b0, B:61:0x00e6, B:64:0x00ef, B:65:0x00f3, B:67:0x00fd), top: B:104:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:99:0x0168 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:6:0x000e, B:10:0x001c, B:71:0x010a, B:73:0x0116, B:77:0x0125, B:79:0x012d, B:90:0x0147, B:92:0x014c, B:97:0x0160, B:99:0x0168, B:100:0x016f, B:18:0x0036, B:21:0x003f, B:23:0x0049, B:25:0x0051, B:26:0x0059, B:27:0x005e, B:29:0x0068, B:30:0x006d, B:34:0x007b, B:36:0x0088, B:41:0x0096, B:42:0x009c, B:44:0x00a6, B:47:0x00b5, B:51:0x00c5, B:55:0x00d4, B:57:0x00dc, B:54:0x00ce, B:50:0x00bd, B:46:0x00b0, B:61:0x00e6, B:64:0x00ef, B:65:0x00f3, B:67:0x00fd), top: B:104:0x000e }] */
        int g(int i, int i2) {
            int iE;
            boolean z;
            int iG;
            int i3 = this.f1778a;
            this.f1778a = i3 - 1;
            if (i3 == 0) {
                LuaValue.R0("pattern too complex");
            }
            while (i2 != this.f1780c.s1()) {
                try {
                    int iG3 = this.f1780c.g3(i2);
                    int iG4 = 0;
                    int iL = -1;
                    if (iG3 != 36) {
                        if (iG3 == 37) {
                            int i4 = i2 + 1;
                            if (i4 == this.f1780c.s1()) {
                                LuaValue.R0("malformed pattern (ends with '%')");
                            }
                            int iG5 = this.f1780c.g3(i4);
                            if (iG5 == 98) {
                                i = j(i, i2 + 2);
                                if (i != -1) {
                                    i2 += 4;
                                }
                            } else if (iG5 != 102) {
                                int iG6 = this.f1780c.g3(i4);
                                if (Character.isDigit((char) iG6)) {
                                    int iH = h(i, iG6);
                                    if (iH != -1) {
                                        i = g(iH, i2 + 2);
                                        break;
                                    }
                                }
                            } else {
                                int i5 = i2 + 2;
                                if (i5 == this.f1780c.s1() || this.f1780c.g3(i5) != 91) {
                                    LuaValue.R0("missing '[' after '%f' in pattern");
                                }
                                iE = e(i5);
                                int iG7 = i == 0 ? 0 : this.f1779b.g3(i - 1);
                                if (i != this.f1779b.s1()) {
                                    iG4 = this.f1779b.g3(i);
                                }
                                int i6 = iE - 1;
                                if (!k(iG7, i5, i6)) {
                                    if (!k(iG4, i5, i6)) {
                                    }
                                    i2 = iE;
                                }
                            }
                            this.f1778a++;
                            return iL;
                        }
                        if (iG3 == 40) {
                            int i7 = i2 + 1;
                            if (i7 < this.f1780c.s1() && this.f1780c.g3(i7) == 41) {
                                i = r(i, i2 + 2, -2);
                                break;
                            }
                            i = r(i, i7, -1);
                            break;
                        }
                        if (iG3 == 41) {
                            i = f(i, i2 + 1);
                            break;
                        }
                        iE = e(i2);
                        if (i < this.f1779b.s1() || !q(this.f1779b.g3(i), i2, iE)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        iG4 = iE < this.f1780c.s1() ? this.f1780c.g3(iE) : 0;
                        if (iG4 != 42) {
                            i = l(i, i2, iE);
                            break;
                        }
                        if (iG4 != 43) {
                            if (iG4 != 45) {
                                i = m(i, i2, iE);
                                break;
                            }
                            if (iG4 == 63) {
                                if (!z) {
                                    i++;
                                    i2 = iE;
                                }
                            } else {
                                if (!z && (iG = g(i + 1, iE + 1)) != -1) {
                                    this.f1778a++;
                                    return iG;
                                }
                                i2 = iE + 1;
                            }
                        } else if (z) {
                            iL = l(i + 1, i2, iE);
                        }
                        this.f1778a++;
                        return iL;
                    }
                    if (i2 + 1 != this.f1780c.s1()) {
                        iE = e(i2);
                        if (i < this.f1779b.s1()) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (iE < this.f1780c.s1()) {
                        }
                        if (iG4 != 42) {
                            i = l(i, i2, iE);
                            break;
                        }
                        if (iG4 != 43) {
                            if (iG4 != 45) {
                                i = m(i, i2, iE);
                                break;
                            }
                            if (iG4 == 63) {
                                if (!z) {
                                }
                                i2 = iE + 1;
                            } else if (!z) {
                                i++;
                                i2 = iE;
                            }
                        } else if (z) {
                            iL = l(i + 1, i2, iE);
                        }
                        this.f1778a++;
                        return iL;
                    }
                    if (i != this.f1779b.s1()) {
                        i = -1;
                        break;
                    }
                    break;
                } catch (Throwable th) {
                    this.f1778a++;
                    throw th;
                }
            }
            this.f1778a++;
            return i;
        }

        int h(int i, int i2) {
            int iD = d(i2);
            int i3 = this.f1784g[iD];
            if (this.f1779b.s1() - i < i3) {
                return -1;
            }
            LuaString luaString = this.f1779b;
            if (LuaString.W2(luaString, this.f1783f[iD], luaString, i, i3)) {
                return i + i3;
            }
            return -1;
        }

        int j(int i, int i2) {
            int iG3;
            int iS1 = this.f1780c.s1();
            if (i2 == iS1 || i2 + 1 == iS1) {
                LuaValue.R0("malformed pattern (missing arguments to '%b')");
            }
            int iS2 = this.f1779b.s1();
            if (i >= iS2 || this.f1779b.g3(i) != (iG3 = this.f1780c.g3(i2))) {
                return -1;
            }
            int i3 = 1;
            int iG4 = this.f1780c.g3(i2 + 1);
            while (true) {
                int i4 = i + 1;
                if (i4 >= iS2) {
                    return -1;
                }
                if (this.f1779b.g3(i4) == iG4) {
                    i3--;
                    if (i3 == 0) {
                        return i + 2;
                    }
                } else if (this.f1779b.g3(i4) == iG3) {
                    i3++;
                }
                i = i4;
            }
        }

        boolean k(int i, int i2, int i3) {
            boolean z;
            int i4;
            int i5 = i2 + 1;
            if (this.f1780c.g3(i5) == 94) {
                i2 = i5;
                z = false;
            } else {
                z = true;
            }
            while (true) {
                int i6 = i2 + 1;
                if (i6 >= i3) {
                    return !z;
                }
                if (this.f1780c.g3(i6) == 37) {
                    i2 += 2;
                    if (i(i, this.f1780c.g3(i2))) {
                        return z;
                    }
                } else if (this.f1780c.g3(i2 + 2) != 45 || (i4 = i2 + 3) >= i3) {
                    if (this.f1780c.g3(i6) == i) {
                        return z;
                    }
                    i2 = i6;
                } else {
                    if (this.f1780c.g3(i2 + 1) <= i && i <= this.f1780c.g3(i4)) {
                        return z;
                    }
                    i2 = i4;
                }
            }
        }

        int l(int i, int i2, int i3) {
            int i4 = 0;
            while (true) {
                int i5 = i + i4;
                if (i5 >= this.f1779b.s1() || !q(this.f1779b.g3(i5), i2, i3)) {
                    break;
                }
                i4++;
            }
            while (i4 >= 0) {
                int iG = g(i + i4, i3 + 1);
                if (iG != -1) {
                    return iG;
                }
                i4--;
            }
            return -1;
        }

        int m(int i, int i2, int i3) {
            while (true) {
                int iG = g(i, i3 + 1);
                if (iG != -1) {
                    return iG;
                }
                if (i >= this.f1779b.s1() || !q(this.f1779b.g3(i), i2, i3)) {
                    return -1;
                }
                i++;
            }
        }

        Varargs n(boolean z, int i, int i2) {
            int i3 = this.f1782e;
            if (i3 == 0 && z) {
                i3 = 1;
            }
            if (i3 == 0) {
                return LuaValue.f1676f;
            }
            if (i3 == 1) {
                return o(0, i, i2);
            }
            LuaValue[] luaValueArr = new LuaValue[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                luaValueArr[i4] = o(i4, i, i2);
            }
            return LuaValue.O2(luaValueArr);
        }

        void p() {
            this.f1782e = 0;
            this.f1778a = 200;
        }

        boolean q(int i, int i2, int i3) {
            int iG3 = this.f1780c.g3(i2);
            if (iG3 == 37) {
                return i(i, this.f1780c.g3(i2 + 1));
            }
            if (iG3 == 46) {
                return true;
            }
            if (iG3 != 91) {
                return this.f1780c.g3(i2) == i;
            }
            return k(i, i2, i3 - 1);
        }

        int r(int i, int i2, int i3) {
            int i4 = this.f1782e;
            if (i4 >= 32) {
                LuaValue.R0("too many captures");
            }
            this.f1783f[i4] = i;
            this.f1784g[i4] = i3;
            this.f1782e = i4 + 1;
            int iG = g(i, i2);
            if (iG == -1) {
                this.f1782e--;
            }
            return iG;
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final byte f1785a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final String f1788d;
        final byte[] j;
        final ByteBuffer k;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f1786b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1787c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1789e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        char f1790f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f1791g = 0;
        int h = 0;
        int i = 0;

        public c(String str) {
            byte[] bArr = new byte[8];
            this.j = bArr;
            this.k = ByteBuffer.wrap(bArr);
            this.f1788d = str;
            z1.d dVar = MainService.instance.v0;
            this.f1785a = (dVar == null || !dVar.n) ? (byte) 4 : (byte) 8;
        }

        public String toString() {
            return "PackState [size_t=" + ((int) this.f1785a) + ", islittle=" + this.f1786b + ", maxalign=" + this.f1787c + ", fmt=" + this.f1788d + ", pos=" + this.f1789e + ", last=" + this.f1790f + ", align=" + this.f1791g + ", ntoalign=" + this.h + ", size=" + this.i + "]";
        }
    }

    static final class dump extends VarArgFunction {
        dump() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaFunction luaFunctionC = varargs.C(1);
            if (!(luaFunctionC instanceof LuaClosure)) {
                throw new luaj.d("unable to dump given function");
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                g.b.a(((LuaClosure) luaFunctionC).R, byteArrayOutputStream, varargs.V(2, false), varargs.V(3, false));
                return LuaString.o3(byteArrayOutputStream.toByteArray());
            } catch (IOException e2) {
                return LuaValue.R0(e2.getMessage());
            }
        }
    }

    static final class find extends VarArgFunction {
        find() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            return StringLib.d3(varargs, true);
        }
    }

    static final class format extends VarArgFunction {
        format() {
        }

        /* JADX WARN: Code duplicated, block: B:46:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:47:0x0106  */
        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            String strG0;
            LuaString luaStringH = varargs.H(1);
            int iS1 = luaStringH.s1();
            f.a aVar = new f.a(iS1);
            a aVar2 = null;
            int i = 0;
            int i2 = 1;
            while (i < iS1) {
                int i3 = i + 1;
                int iG3 = luaStringH.g3(i);
                if (iG3 != 10) {
                    if (iG3 != 37) {
                        aVar.a((byte) iG3);
                    } else if (i3 < iS1) {
                        if (luaStringH.g3(i3) != 37) {
                            i2++;
                            a aVar3 = new a(varargs, luaStringH, i3);
                            i3 += aVar3.i;
                            int i4 = aVar3.h;
                            switch (i4) {
                                case 65:
                                case 69:
                                case 71:
                                case 97:
                                    aVar3.b(aVar, varargs.B(i2));
                                    break;
                                case 88:
                                case 105:
                                case 111:
                                case 117:
                                case 120:
                                    aVar3.c(aVar, varargs.F(i2));
                                    break;
                                case 113:
                                    LuaValue luaValueV = varargs.v(i2);
                                    int iC2 = luaValueV.C2();
                                    if (iC2 == 0 || iC2 == 1) {
                                        strG0 = luaValueV.g0();
                                    } else if (iC2 == 3) {
                                        if (luaValueV instanceof LuaDouble) {
                                            if (aVar2 == null) {
                                                aVar2 = new a(varargs, LuaString.K2("%a"), 1);
                                            }
                                            aVar2.b(aVar, luaValueV.x0());
                                        } else if ((luaValueV instanceof LuaLong) && luaValueV.z2() == Long.MIN_VALUE) {
                                            strG0 = "0x8000000000000000";
                                        } else {
                                            aVar.d(luaValueV);
                                        }
                                    } else if (iC2 == 4) {
                                        StringLib.X2(aVar, varargs.H(i2));
                                    } else {
                                        LuaValue.l0(i2, "string.format", "'" + luaValueV + "': value has no literal form");
                                    }
                                    break;
                                case 115:
                                    LuaString luaStringD3 = BaseLib.d3(varargs.v(i2));
                                    if (aVar3.f1777g == -1 && luaStringD3.s1() >= 100) {
                                        aVar.c(luaStringD3);
                                    } else {
                                        aVar3.d(aVar, luaStringD3.G0());
                                    }
                                    break;
                                default:
                                    switch (i4) {
                                        case 99:
                                            aVar3.a(aVar, (byte) varargs.D(i2));
                                            break;
                                        case 100:
                                            aVar3.c(aVar, varargs.F(i2));
                                            break;
                                        case 101:
                                        case 102:
                                        case 103:
                                            aVar3.b(aVar, varargs.B(i2));
                                            break;
                                        default:
                                            LuaValue.R0("invalid option '%" + ((char) aVar3.h) + "' to 'string.format'");
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            i += 2;
                            aVar.a((byte) 37);
                        }
                    }
                    i = i3;
                } else {
                    strG0 = "\n";
                }
                aVar.b(strG0);
                i = i3;
            }
            return aVar.l();
        }
    }

    static final class gmatch extends VarArgFunction {
        gmatch() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            return new GMatchAux(varargs, varargs.H(1), varargs.H(2));
        }
    }

    static final class gsub extends VarArgFunction {
        gsub() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaString luaStringH = varargs.H(1);
            int iS1 = luaStringH.s1();
            LuaString luaStringH2 = varargs.H(2);
            LuaValue luaValueV = varargs.v(3);
            int iY = varargs.Y(4, iS1 + 1);
            int i = 0;
            int i2 = (luaStringH2.s1() <= 0 || luaStringH2.T2(0) != 94) ? 0 : 1;
            f.a aVar = new f.a(iS1);
            b bVar = new b(varargs, luaStringH, luaStringH2);
            int i3 = 0;
            int i4 = -1;
            while (i < iY) {
                bVar.p();
                int iG = bVar.g(i3, i2);
                if (iG != -1 && iG != i4) {
                    i++;
                    bVar.b(aVar, i3, iG, luaValueV);
                    i3 = iG;
                    i4 = i3;
                } else {
                    if (i3 >= iS1) {
                        break;
                    }
                    aVar.a((byte) luaStringH.g3(i3));
                    i3++;
                }
                if (i2 != 0) {
                    break;
                }
            }
            aVar.c(luaStringH.j3(i3, iS1));
            return LuaValue.N2(aVar.l(), LuaValue.I2(i));
        }
    }

    static final class len extends OneArgFunction {
        len() {
        }

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue) {
            return luaValue.G0().r1();
        }
    }

    static final class lower extends OneArgFunction {
        lower() {
        }

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue) {
            return LuaValue.K2(luaValue.B0().toLowerCase(Locale.US));
        }
    }

    static final class match extends VarArgFunction {
        match() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            return StringLib.d3(varargs, false);
        }
    }

    static final class pack extends VarArgFunction {
        pack() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0036. Please report as an issue. */
        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            boolean z;
            String str;
            long jFloatToRawIntBits;
            int iS1;
            String strE = varargs.E(1);
            c cVar = new c(strE);
            f.a aVar = new f.a();
            int length = strE.length();
            byte b2 = 0;
            int i = 0;
            int i2 = 1;
            while (cVar.f1789e < length) {
                byte bY2 = StringLib.Y2(cVar, i);
                int i3 = cVar.h;
                int i4 = cVar.i;
                int i5 = i + i3 + i4;
                if (i3 > 0) {
                    aVar.e(new byte[i3], b2, i3);
                }
                int i6 = i2 + 1;
                switch (bY2) {
                    case 0:
                    case 8:
                        i5 = i5;
                        i = i5;
                        break;
                    case 1:
                    case 2:
                        long jF = varargs.F(i6);
                        if (i4 < 8) {
                            int i7 = i4 * 8;
                            if (bY2 == 1) {
                                long j = 1 << (i7 - 1);
                                z = (-j) <= jF && jF < j;
                                str = "integer overflow";
                            } else {
                                z = ((~((1 << i7) - 1)) & jF) == 0;
                                str = "unsigned overflow";
                            }
                            x(z, i6, str);
                        }
                        StringLib.b3(cVar, aVar, jF);
                        i2 = i6;
                        i = i5;
                        break;
                    case 3:
                        jFloatToRawIntBits = Float.floatToRawIntBits((float) varargs.B(i6));
                        StringLib.b3(cVar, aVar, jFloatToRawIntBits);
                        i2 = i6;
                        i = i5;
                        break;
                    case 4:
                        LuaString luaStringH = varargs.H(i6);
                        int iS2 = luaStringH.s1();
                        x(iS2 <= i4, i6, "string longer (" + iS2 + ") than given size (" + i4 + ")");
                        aVar.c(luaStringH);
                        int i8 = i4 - iS2;
                        if (i8 > 0) {
                            aVar.e(new byte[i8], b2, i8);
                        }
                        i2 = i6;
                        i = i5;
                        break;
                    case 5:
                        LuaString luaStringH2 = varargs.H(i6);
                        iS1 = luaStringH2.s1();
                        x(i4 >= cVar.f1785a || ((long) iS1) < (1 << (i4 * 8)), i6, "string length (" + iS1 + ") does not fit in given size (" + i4 + " bytes)");
                        StringLib.b3(cVar, aVar, (long) iS1);
                        aVar.c(luaStringH2);
                        i = i5 + iS1;
                        i2 = i6;
                        break;
                    case 6:
                        LuaString luaStringH3 = varargs.H(i6);
                        int iS3 = luaStringH3.s1();
                        x(luaStringH3.g0().indexOf(b2) == -1, i6, "string contains zeros");
                        aVar.c(luaStringH3);
                        aVar.a(b2);
                        iS1 = iS3 + 1;
                        i = i5 + iS1;
                        i2 = i6;
                        break;
                    case 7:
                        aVar.a(b2);
                        i5 = i5;
                        i = i5;
                        break;
                    case 9:
                        jFloatToRawIntBits = Double.doubleToRawLongBits(varargs.B(i6));
                        StringLib.b3(cVar, aVar, jFloatToRawIntBits);
                        i2 = i6;
                        i = i5;
                        break;
                    case 10:
                        LuaNumber luaNumberG = varargs.G(i6);
                        cVar.i = 8;
                        boolean z2 = luaNumberG instanceof LuaLong;
                        StringLib.b3(cVar, aVar, z2 ? luaNumberG.z2() : Double.doubleToRawLongBits(luaNumberG.x2()));
                        cVar.i = 1;
                        StringLib.b3(cVar, aVar, z2 ? 1L : 0L);
                        i2 = i6;
                        i = i5;
                        break;
                    default:
                        i2 = i6;
                        i = i5;
                        break;
                }
                b2 = 0;
            }
            return aVar.l();
        }
    }

    static final class packsize extends VarArgFunction {
        packsize() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            String strE = varargs.E(1);
            c cVar = new c(strE);
            int length = strE.length();
            int i = 0;
            while (cVar.f1789e < length) {
                byte bY2 = StringLib.Y2(cVar, i);
                int i2 = cVar.i + cVar.h;
                x(i <= Integer.MAX_VALUE - i2, 1, "format result too large at pos " + cVar.f1789e);
                i += i2;
                if (bY2 == 5 || bY2 == 6) {
                    LuaValue.k0(1, t2.f("variable-length format option '%c' at pos %d", Character.valueOf(cVar.f1790f), Integer.valueOf(cVar.f1789e)));
                }
            }
            return LuaValue.I2(i);
        }
    }

    static final class rep extends VarArgFunction {
        rep() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaString luaStringH = varargs.H(1);
            int iD = varargs.D(2);
            if (iD <= 0) {
                return LuaValue.L;
            }
            LuaString luaStringB0 = varargs.b0(3, LuaValue.L);
            int iS1 = luaStringH.s1();
            int iS2 = luaStringB0.s1();
            int i = iS1 + iS2;
            if (i < iS1 || i > Integer.MAX_VALUE / iD) {
                throw new luaj.d("resulting string too large");
            }
            byte[] bArr = new byte[(i * (iD - 1)) + iS1];
            byte[] bArr2 = luaStringH.P;
            int i2 = luaStringH.Q;
            byte[] bArr3 = luaStringB0.P;
            int i3 = luaStringB0.Q;
            int i4 = 0;
            while (true) {
                int i5 = iD - 1;
                System.arraycopy(bArr2, i2, bArr, i4, iS1);
                if (iD <= 1) {
                    return LuaString.o3(bArr);
                }
                i4 += iS1;
                if (iS2 > 0) {
                    System.arraycopy(bArr3, i3, bArr, i4, iS2);
                    i4 += iS2;
                }
                iD = i5;
            }
        }
    }

    static final class reverse extends OneArgFunction {
        reverse() {
        }

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue) {
            LuaString luaStringG0 = luaValue.G0();
            int iS1 = luaStringG0.s1();
            if (iS1 == 0) {
                return LuaValue.L;
            }
            byte[] bArr = new byte[iS1];
            byte[] bArr2 = luaStringG0.P;
            int i = iS1 - 1;
            int i2 = luaStringG0.Q;
            int i3 = iS1 + i2;
            while (i2 < i3) {
                bArr[i] = bArr2[i2];
                i2++;
                i--;
            }
            return LuaString.o3(bArr);
        }
    }

    static final class sub extends VarArgFunction {
        sub() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaString luaStringH = varargs.H(1);
            int iS1 = luaStringH.s1();
            int iC3 = StringLib.c3(varargs.D(2), iS1);
            int iC4 = StringLib.c3(varargs.Y(3, -1), iS1);
            if (iC3 < 1) {
                iC3 = 1;
            }
            if (iC4 <= iS1) {
                iS1 = iC4;
            }
            return iC3 <= iS1 ? luaStringH.j3(iC3 - 1, iS1) : LuaValue.L;
        }
    }

    static final class unpack extends VarArgFunction {
        unpack() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaValue luaValueJ2;
            long jE3;
            byte b2 = 1;
            String strE = varargs.E(1);
            LuaString luaStringH = varargs.H(2);
            int iS1 = luaStringH.s1();
            char c2 = 3;
            int iC3 = StringLib.c3(varargs.Y(3, 1), iS1);
            int i = iC3 - 1;
            x(i >= 0 && i <= iS1, 3, "initial position (" + iC3 + ") out of string (length = " + iS1 + ")");
            c cVar = new c(strE);
            int length = strE.length();
            ArrayList arrayList = new ArrayList();
            while (cVar.f1789e < length) {
                byte bY2 = StringLib.Y2(cVar, i);
                int i2 = cVar.h;
                int i3 = cVar.i;
                int i4 = i + i2;
                int i5 = i4 + i3;
                if (i5 > iS1) {
                    Object[] objArr = new Object[4];
                    objArr[0] = Integer.valueOf(iS1);
                    objArr[b2] = Character.valueOf(cVar.f1790f);
                    objArr[2] = Integer.valueOf(i5);
                    objArr[c2] = Integer.valueOf(cVar.f1789e);
                    LuaValue.k0(2, t2.f("data string too short (%d) for option '%c' (need %d) at pos %d", objArr));
                }
                switch (bY2) {
                    case 1:
                    case 2:
                        arrayList.add(LuaLong.I2(StringLib.e3(cVar, luaStringH, i4, bY2 == b2)));
                        break;
                    case 3:
                        luaValueJ2 = LuaDouble.J2(Float.intBitsToFloat((int) StringLib.e3(cVar, luaStringH, i4, false)));
                        arrayList.add(luaValueJ2);
                        b2 = 1;
                        break;
                    case 4:
                        luaValueJ2 = luaStringH.j3(i4, i5);
                        arrayList.add(luaValueJ2);
                        b2 = 1;
                        break;
                    case 5:
                        int iE3 = (int) StringLib.e3(cVar, luaStringH, i4, false);
                        i4 += iE3;
                        int i6 = i4 + i3;
                        x(i6 <= iS1, 2, "data string too short (" + iS1 + " but need " + i6 + ") at pos " + cVar.f1789e);
                        luaValueJ2 = luaStringH.j3(i5, iE3 + i5);
                        arrayList.add(luaValueJ2);
                        b2 = 1;
                        break;
                    case 6:
                        int iC4 = luaStringH.c3((byte) 0, i4);
                        boolean z = iC4 != -1;
                        Object[] objArr2 = new Object[2];
                        objArr2[0] = Character.valueOf(cVar.f1790f);
                        objArr2[b2] = Integer.valueOf(cVar.f1789e);
                        x(z, 2, t2.f("zero char not found for option '%c' at pos %d", objArr2));
                        arrayList.add(luaStringH.j3(i4, iC4));
                        i4 = iC4 + 1;
                        break;
                    case 9:
                        jE3 = StringLib.e3(cVar, luaStringH, i4, false);
                        arrayList.add(luaValueI2);
                        break;
                    case 10:
                        cVar.i = 8;
                        jE3 = StringLib.e3(cVar, luaStringH, i4, false);
                        cVar.i = b2;
                        LuaValue luaValueI2 = StringLib.e3(cVar, luaStringH, i4 + 8, false) == 1 ? LuaLong.I2(jE3) : LuaDouble.J2(Double.longBitsToDouble(jE3));
                        arrayList.add(luaValueI2);
                        break;
                }
                i = i4 + i3;
                c2 = 3;
            }
            arrayList.add(LuaValue.I2(i + b2));
            return LuaValue.O2((LuaValue[]) arrayList.toArray(new LuaValue[arrayList.size()]));
        }
    }

    static final class upper extends OneArgFunction {
        upper() {
        }

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue) {
            return LuaValue.K2(luaValue.B0().toUpperCase(Locale.US));
        }
    }

    static {
        for (int i = 0; i < 128; i++) {
            char c2 = (char) i;
            byte[] bArr = U;
            byte b2 = (byte) (((c2 < ' ' || c2 == 127) ? 64 : 0) | (Character.isDigit(c2) ? 8 : 0) | (Character.isLowerCase(c2) ? 2 : 0) | (Character.isUpperCase(c2) ? 4 : 0));
            bArr[i] = b2;
            if ((c2 >= 'a' && c2 <= 'f') || ((c2 >= 'A' && c2 <= 'F') || (c2 >= '0' && c2 <= '9'))) {
                bArr[i] = (byte) (b2 | (-128));
            }
            if ((c2 >= '!' && c2 <= '/') || ((c2 >= ':' && c2 <= '@') || ((c2 >= '[' && c2 <= '`') || (c2 >= '{' && c2 <= '~')))) {
                bArr[i] = (byte) (bArr[i] | 16);
            }
            byte b3 = bArr[i];
            if ((b3 & 6) != 0) {
                bArr[i] = (byte) (b3 | 1);
            }
        }
        byte[] bArr2 = U;
        bArr2[32] = 32;
        bArr2[13] = (byte) (bArr2[13] | 32);
        bArr2[10] = (byte) (bArr2[10] | 32);
        bArr2[9] = (byte) (bArr2[9] | 32);
        bArr2[11] = (byte) (bArr2[11] | 32);
        bArr2[12] = (byte) (bArr2[12] | 32);
    }

    static void X2(f.a aVar, LuaString luaString) {
        aVar.a((byte) 34);
        int iS1 = luaString.s1();
        for (int i = 0; i < iS1; i++) {
            int iG3 = luaString.g3(i);
            if (iG3 == 10 || iG3 == 34 || iG3 == 92) {
                aVar.a((byte) 92);
            } else {
                if (iG3 <= 31 || iG3 == 127) {
                    aVar.a((byte) 92);
                    int i2 = i + 1;
                    if (i2 == iS1 || luaString.g3(i2) < 48 || luaString.g3(i2) > 57) {
                        aVar.b(Integer.toString(iG3));
                    } else {
                        aVar.a((byte) 48);
                        aVar.a((byte) ((char) ((iG3 / 10) + 48)));
                        iG3 = (char) ((iG3 % 10) + 48);
                    }
                }
            }
            aVar.a((byte) iG3);
        }
        aVar.a((byte) 34);
    }

    static byte Y2(c cVar, int i) {
        byte bA3 = a3(cVar);
        int i2 = cVar.f1791g;
        if (bA3 == 8) {
            if (cVar.f1788d.length() <= cVar.f1789e) {
                LuaValue.k0(1, "no next option for option 'X' at pos " + cVar.f1789e);
            }
            if (a3(cVar) == 4 || (i2 = cVar.f1791g) == 0) {
                LuaValue.k0(1, t2.f("invalid next option '%c' for option 'X' at pos %d", Character.valueOf(cVar.f1790f), Integer.valueOf(cVar.f1789e)));
            }
            cVar.i = 0;
        }
        if (i2 <= 1 || bA3 == 4) {
            cVar.h = 0;
        } else {
            int i3 = cVar.f1787c;
            if (i2 > i3) {
                cVar.f1791g = i3;
                i2 = i3;
            }
            int i4 = i2 - 1;
            if ((i2 & i4) != 0) {
                LuaValue.k0(1, t2.f("format option '%c' asks for alignment not power of 2 at pos %d", Character.valueOf(cVar.f1790f), Integer.valueOf(cVar.f1789e)));
            }
            cVar.h = (i2 - (i & i4)) & i4;
        }
        return bA3;
    }

    static int Z2(c cVar, int i, boolean z) {
        char cCharAt;
        String str = cVar.f1788d;
        int length = str.length();
        int i2 = cVar.f1789e;
        if (i2 < length && (cCharAt = str.charAt(i2)) <= '9' && cCharAt >= '0') {
            i = 0;
            do {
                i = (i * 10) + (cCharAt - '0');
                i2++;
                if (i2 >= length || (cCharAt = str.charAt(i2)) > '9' || cCharAt < '0') {
                    break;
                }
            } while (i <= 214748363);
            cVar.f1789e = i2;
        }
        if (z && (i > 8 || i <= 0)) {
            LuaValue.R0(t2.f("integral size (%d) out of limits [1,%d] at pos %d", Integer.valueOf(i), 8, Integer.valueOf(cVar.f1789e)));
        }
        return i;
    }

    static byte a3(c cVar) {
        String str = cVar.f1788d;
        int i = cVar.f1789e;
        cVar.f1789e = i + 1;
        char cCharAt = str.charAt(i);
        cVar.f1790f = cCharAt;
        int i2 = 4;
        int i3 = 1;
        try {
            switch (cCharAt) {
                case ' ':
                    break;
                case '!':
                    cVar.f1787c = Z2(cVar, cVar.f1785a, true);
                    break;
                case '<':
                case '=':
                    cVar.f1786b = true;
                    break;
                case '>':
                    cVar.f1786b = false;
                    break;
                case 'B':
                    cVar.i = 1;
                    cVar.f1791g = 1;
                    return (byte) 2;
                case 'H':
                    cVar.i = 2;
                    cVar.f1791g = cCharAt != 'c' ? 2 : 1;
                    return (byte) 2;
                case 'I':
                    int iZ2 = Z2(cVar, 4, true);
                    cVar.i = iZ2;
                    if (cCharAt == 'c') {
                        i2 = 1;
                    } else if (iZ2 < 8) {
                        i2 = iZ2;
                    }
                    cVar.f1791g = i2;
                    return (byte) 2;
                case 'J':
                    cVar.i = 8;
                    cVar.f1791g = cCharAt == 'c' ? 1 : 4;
                    return (byte) 2;
                case 'L':
                    cVar.i = 8;
                    cVar.f1791g = cCharAt == 'c' ? 1 : 4;
                    return (byte) 2;
                case 'T':
                    byte b2 = cVar.f1785a;
                    cVar.i = b2;
                    if (cCharAt == 'c') {
                        i2 = 1;
                    } else if (b2 < 8) {
                        i2 = b2;
                    }
                    cVar.f1791g = i2;
                    return (byte) 2;
                case 'X':
                    cVar.i = 0;
                    cVar.f1791g = cCharAt != 'c' ? 0 : 1;
                    return (byte) 8;
                case 'b':
                    cVar.i = 1;
                    cVar.f1791g = 1;
                    return (byte) 1;
                case 'c':
                    int iZ3 = Z2(cVar, -1, false);
                    if (iZ3 == -1) {
                        LuaValue.R0("missing size for format option 'c' at pos " + cVar.f1789e);
                    }
                    cVar.i = iZ3;
                    if (cCharAt != 'c') {
                        i3 = iZ3 >= 8 ? 4 : iZ3;
                    }
                    cVar.f1791g = i3;
                    return (byte) 4;
                case 'd':
                    cVar.i = 8;
                    cVar.f1791g = cCharAt == 'c' ? 1 : 4;
                    return (byte) 9;
                case 'f':
                    cVar.i = 4;
                    cVar.f1791g = cCharAt == 'c' ? 1 : 4;
                    return (byte) 3;
                case 'h':
                    cVar.i = 2;
                    cVar.f1791g = cCharAt == 'c' ? 1 : 2;
                    return (byte) 1;
                case 'i':
                    int iZ4 = Z2(cVar, 4, true);
                    cVar.i = iZ4;
                    if (cCharAt == 'c') {
                        i2 = 1;
                    } else if (iZ4 < 8) {
                        i2 = iZ4;
                    }
                    cVar.f1791g = i2;
                    return (byte) 1;
                case 'j':
                    cVar.i = 8;
                    cVar.f1791g = cCharAt == 'c' ? 1 : 4;
                    return (byte) 1;
                case 'l':
                    cVar.i = 8;
                    cVar.f1791g = cCharAt == 'c' ? 1 : 4;
                    return (byte) 1;
                case 'n':
                    cVar.i = 9;
                    cVar.f1791g = cCharAt == 'c' ? 1 : 4;
                    return (byte) 10;
                case 's':
                    int iZ5 = Z2(cVar, cVar.f1785a, true);
                    cVar.i = iZ5;
                    if (cCharAt == 'c') {
                        i2 = 1;
                    } else if (iZ5 < 8) {
                        i2 = iZ5;
                    }
                    cVar.f1791g = i2;
                    return (byte) 5;
                case 'x':
                    cVar.i = 1;
                    cVar.f1791g = 1;
                    return (byte) 7;
                case 'z':
                    cVar.i = 0;
                    cVar.f1791g = cCharAt != 'c' ? 0 : 1;
                    return (byte) 6;
                default:
                    LuaValue.R0(t2.f("invalid format option '%c' at pos %d", Character.valueOf(cCharAt), Integer.valueOf(cVar.f1789e)));
                    break;
            }
            cVar.i = 0;
            cVar.f1791g = cCharAt != 'c' ? 0 : 1;
            return (byte) 0;
        } catch (Throwable th) {
            cVar.i = 0;
            if (cCharAt == 'c') {
                i2 = 1;
            } else if (0 < 8) {
                i2 = 0;
            }
            cVar.f1791g = i2;
            throw th;
        }
    }

    static void b3(c cVar, f.a aVar, long j) {
        cVar.k.order(cVar.f1786b ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN).putLong(0, j);
        aVar.e(cVar.j, cVar.f1786b ? 0 : 8 - cVar.i, cVar.i);
    }

    static int c3(int i, int i2) {
        return i >= 0 ? i : i2 + i + 1;
    }

    static Varargs d3(Varargs varargs, boolean z) {
        boolean z2;
        int i;
        LuaString luaStringH = varargs.H(1);
        LuaString luaStringH2 = varargs.H(2);
        int iS1 = luaStringH.s1();
        int iC3 = c3(varargs.Y(3, 1), iS1);
        if (iC3 < 1) {
            iC3 = 1;
        } else if (iC3 > iS1 + 1) {
            return LuaValue.f1673c;
        }
        int i2 = iC3 - 1;
        if (z && (varargs.v(4).w2() || luaStringH2.e3(T) == -1)) {
            int iD3 = luaStringH.d3(luaStringH2, i2);
            if (iD3 != -1) {
                return LuaValue.N2(LuaValue.I2(iD3 + 1), LuaValue.I2(iD3 + luaStringH2.s1()));
            }
        } else {
            b bVar = new b(varargs, luaStringH, luaStringH2);
            if (luaStringH2.s1() <= 0 || luaStringH2.g3(0) != 94) {
                z2 = false;
                i = 0;
            } else {
                z2 = true;
                i = 1;
            }
            while (true) {
                bVar.p();
                int iG = bVar.g(i2, i);
                if (iG != -1) {
                    return z ? LuaValue.M2(LuaValue.I2(i2 + 1), LuaValue.I2(iG), bVar.n(false, i2, iG)) : bVar.n(true, i2, iG);
                }
                int i3 = i2 + 1;
                if (i2 >= iS1 || z2) {
                    break;
                }
                i2 = i3;
            }
        }
        return LuaValue.f1673c;
    }

    static long e3(c cVar, LuaString luaString, int i, boolean z) {
        int i2;
        int i3 = cVar.i;
        if (i3 == 1) {
            long j = luaString.P[luaString.Q + i];
            return !z ? j & 255 : j;
        }
        byte[] bArr = cVar.j;
        if (i3 < 8) {
            if (!cVar.f1786b) {
                i2 = 8 - i3;
                int i4 = i2;
                while (true) {
                    i4--;
                    if (i4 < 0) {
                        break;
                    }
                    bArr[i4] = 0;
                }
            } else {
                int i5 = i3 - 1;
                while (true) {
                    i5++;
                    if (i5 >= 8) {
                        break;
                    }
                    bArr[i5] = 0;
                }
                i2 = 0;
            }
        } else {
            i2 = 0;
        }
        luaString.U2(i, bArr, i2, i3);
        long j2 = cVar.k.order(cVar.f1786b ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN).getLong(0);
        if (i3 >= 8 || !z) {
            return j2;
        }
        long j3 = 1 << ((i3 * 8) - 1);
        return (j2 ^ j3) - j3;
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        LuaTable luaTable = new LuaTable();
        luaTable.i2("byte", new _byte());
        luaTable.i2("char", new _char());
        luaTable.i2("dump", new dump());
        luaTable.i2("find", new find());
        luaTable.i2("format", new format());
        luaTable.i2("gmatch", new gmatch());
        luaTable.i2("gsub", new gsub());
        luaTable.i2("len", new len());
        luaTable.i2("lower", new lower());
        luaTable.i2("match", new match());
        luaTable.i2("pack", new pack());
        luaTable.i2("packsize", new packsize());
        luaTable.i2("rep", new rep());
        luaTable.i2("reverse", new reverse());
        luaTable.i2("sub", new sub());
        luaTable.i2("unpack", new unpack());
        luaTable.i2("upper", new upper());
        luaValue2.i2("string", luaTable);
        if (!luaValue2.T0("package").l1()) {
            luaValue2.T0("package").T0("loaded").i2("string", luaTable);
        }
        if (LuaString.U == null) {
            LuaString.U = LuaValue.u2(new LuaValue[]{LuaValue.l, luaTable});
        }
        return luaTable;
    }
}
