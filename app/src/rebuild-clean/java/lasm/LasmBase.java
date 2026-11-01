package lasm;

import gge.d;
import gge.f;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import luaj.LuaString;
import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
public abstract class LasmBase {

    static class Const extends Internal {
        Const(f fVar) {
            super(fVar, LasmBase.e(fVar));
        }
    }

    static class Internal extends LuaValue {
        int P;
        f Q;

        Internal(f fVar, int i) {
            this.Q = fVar;
            this.P = i;
        }

        @Override // luaj.LuaValue
        public int C2() {
            return this.P;
        }

        @Override // luaj.LuaValue
        public String D2() {
            return null;
        }
    }

    static class U extends Internal {
        U(f fVar) {
            super(fVar, LasmBase.f(fVar, 1));
        }
    }

    static class V extends Internal {
        V(f fVar) {
            super(fVar, LasmBase.f(fVar, 1));
        }
    }

    static void a(V v, V v2, int i) {
    }

    static void b(V v, V v2) throws e.b {
        if (v.P == v2.P) {
            return;
        }
        throw new e.b(v2.Q, "Register must be " + v.Q.f1551f);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0096 A[SYNTHETIC] */
    public static String c(Throwable th, String str, boolean z) throws IOException {
        int i;
        int i2;
        f fVar;
        String string;
        BufferedReader bufferedReader;
        int i3;
        String line;
        StringBuilder sb;
        if (!(th instanceof e.b)) {
            if (th instanceof d) {
                fVar = ((d) th).f1535a.f1552g;
            } else if (th instanceof c) {
                c cVar = (c) th;
                i2 = cVar.f1643b;
                i = cVar.f1644c;
            } else {
                i = 0;
                i2 = 0;
            }
            string = "";
            if (i2 > 0) {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
                i3 = 0;
                do {
                    line = bufferedReader.readLine();
                    if (line != null) {
                        i3++;
                    }
                    bufferedReader.close();
                } while (i3 != i2);
                if (z) {
                    sb = new StringBuilder();
                    sb.append("\n");
                    int i4 = i - 1;
                    sb.append(line.substring(0, i4));
                    sb.append((char) 8291);
                    sb.append(line.substring(i4));
                    sb.append("\n");
                } else {
                    sb = new StringBuilder();
                    sb.append("\n");
                    sb.append(line);
                    sb.append("\n");
                    sb.append(new String(new char[i - 1]).replace("\u0000", "_"));
                    sb.append("^\n");
                }
                string = sb.toString();
                bufferedReader.close();
            }
            return string;
        }
        fVar = ((e.b) th).f1535a;
        i2 = fVar.f1547b;
        i = fVar.f1548c;
        string = "";
        if (i2 > 0) {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
            i3 = 0;
            do {
                line = bufferedReader.readLine();
                if (line != null) {
                    i3++;
                }
                bufferedReader.close();
            } while (i3 != i2);
            if (z) {
                sb = new StringBuilder();
                sb.append("\n");
                int i5 = i - 1;
                sb.append(line.substring(0, i5));
                sb.append((char) 8291);
                sb.append(line.substring(i5));
                sb.append("\n");
            } else {
                sb = new StringBuilder();
                sb.append("\n");
                sb.append(line);
                sb.append("\n");
                sb.append(new String(new char[i - 1]).replace("\u0000", "_"));
                sb.append("^\n");
            }
            string = sb.toString();
            bufferedReader.close();
        }
        return string;
    }

    static int d(f fVar) throws e.b {
        try {
            return (int) Long.parseLong(fVar.f1551f.substring(2), 16);
        } catch (NumberFormatException e2) {
            throw new e.b(fVar, "Failed parse '" + fVar.f1551f + "' as hex", e2);
        }
    }

    static int e(f fVar) {
        return f(fVar, 0);
    }

    static int f(f fVar, int i) throws e.b {
        try {
            return Integer.parseInt(fVar.f1551f.substring(i));
        } catch (NumberFormatException e2) {
            throw new e.b(fVar, "Failed parse '" + fVar.f1551f + "' as integer", e2);
        }
    }

    static int g(f fVar, int i) throws e.b {
        int iF = f(fVar, 0);
        if (iF <= i) {
            return iF;
        }
        throw new e.b(fVar, "'" + fVar.f1551f + "' parsed as " + iF + " out of possible range [0; " + i + "]");
    }

    static long h(f fVar) throws e.b {
        try {
            return Long.parseLong(fVar.f1551f);
        } catch (NumberFormatException e2) {
            throw new e.b(fVar, "Failed parse '" + fVar.f1551f + "' as long", e2);
        }
    }

    static LuaValue i(f fVar) throws e.b {
        try {
            return LuaValue.P1(fVar.f1551f, LuaValue.f1677g);
        } catch (NumberFormatException e2) {
            throw new e.b(fVar, "Failed parse '" + fVar.f1551f + "' as Lua number", e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x014b  */
    /* JADX WARN: Code duplicated, block: B:101:0x014d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0150  */
    /* JADX WARN: Code duplicated, block: B:104:0x0152  */
    /* JADX WARN: Code duplicated, block: B:114:0x016e A[PHI: r7 r8 r9 r10 r15
      0x016e: PHI (r7v4 int) = (r7v1 int), (r7v5 int), (r7v1 int) binds: [B:112:0x016a, B:22:0x0041, B:17:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x016e: PHI (r8v4 int) = (r8v1 int), (r8v11 int), (r8v1 int) binds: [B:112:0x016a, B:22:0x0041, B:17:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x016e: PHI (r9v3 int) = (r9v1 int), (r9v6 int), (r9v1 int) binds: [B:112:0x016a, B:22:0x0041, B:17:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x016e: PHI (r10v3 int) = (r10v1 int), (r10v8 int), (r10v1 int) binds: [B:112:0x016a, B:22:0x0041, B:17:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x016e: PHI (r15v1 byte) = (r15v0 byte), (r15v9 byte), (r15v0 byte) binds: [B:112:0x016a, B:22:0x0041, B:17:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00af  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:57:0x00be  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:70:0x0100  */
    /* JADX WARN: Code duplicated, block: B:71:0x0103  */
    /* JADX WARN: Code duplicated, block: B:98:0x0147  */
    /* JADX WARN: Switch 'out' block B:114:0x016e for B:21:0x003e already processed. Defaulting to fallback option. */
    static LuaString j(f fVar) throws e.b {
        int i;
        String str;
        if (fVar.f1546a == 56) {
            return null;
        }
        byte[] bytes = fVar.f1551f.getBytes();
        f.a aVar = new f.a(bytes.length - 2);
        int length = bytes.length - 1;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i2 >= length) {
                if (i3 == 3) {
                    aVar.a((byte) i4);
                }
                if (i3 != 6 && i3 != 2) {
                    return aVar.l();
                }
                fVar.f1548c += bytes.length - 1;
                StringBuilder sb = new StringBuilder();
                sb.append("Unfinished ");
                sb.append(i3 == 6 ? "unicode" : "hex");
                sb.append(" escape sequence");
                throw new e.b(fVar, sb.toString());
            }
            byte b2 = bytes[i2];
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        i4 *= 16;
                        if (i5 == -1) {
                            if (b2 != 123) {
                                i5 += 100;
                            }
                            i5++;
                            if (i5 >= i3) {
                                if (i5 != 2) {
                                    fVar.f1548c += i2;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Invalid char '");
                                    sb2.append((int) b2);
                                    sb2.append("' (code 0x");
                                    sb2.append(Integer.toHexString(b2));
                                    sb2.append(") in ");
                                    sb2.append(i3 == 6 ? "unicode" : "hex");
                                    sb2.append(" escape sequence, must be ");
                                    if (i3 == 6) {
                                        str = "\\u{XXX}";
                                    } else {
                                        str = "\\xXX";
                                    }
                                    sb2.append(str);
                                    throw new e.b(fVar, sb2.toString());
                                }
                                b2 = (byte) i4;
                                i3 = 0;
                                aVar.a(b2);
                            } else {
                                continue;
                            }
                        } else if (i3 == 6 || b2 != 125) {
                            if (48 > b2 && b2 <= 57) {
                                i = b2 - 48;
                            } else if (97 <= b2 || b2 > 102) {
                                if (65 <= b2 || b2 > 70) {
                                    i5 += 100;
                                } else {
                                    i = b2 - 55;
                                }
                                i5++;
                                if (i5 >= i3) {
                                    if (i5 != 2) {
                                        fVar.f1548c += i2;
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("Invalid char '");
                                        sb3.append((int) b2);
                                        sb3.append("' (code 0x");
                                        sb3.append(Integer.toHexString(b2));
                                        sb3.append(") in ");
                                        sb3.append(i3 == 6 ? "unicode" : "hex");
                                        sb3.append(" escape sequence, must be ");
                                        if (i3 == 6) {
                                            str = "\\u{XXX}";
                                        } else {
                                            str = "\\xXX";
                                        }
                                        sb3.append(str);
                                        throw new e.b(fVar, sb3.toString());
                                    }
                                    b2 = (byte) i4;
                                    i3 = 0;
                                    aVar.a(b2);
                                } else {
                                    continue;
                                }
                            } else {
                                i = b2 - 87;
                            }
                            i4 += i;
                            i5++;
                            if (i5 >= i3) {
                                if (i5 != 2) {
                                    fVar.f1548c += i2;
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("Invalid char '");
                                    sb4.append((int) b2);
                                    sb4.append("' (code 0x");
                                    sb4.append(Integer.toHexString(b2));
                                    sb4.append(") in ");
                                    sb4.append(i3 == 6 ? "unicode" : "hex");
                                    sb4.append(" escape sequence, must be ");
                                    if (i3 == 6) {
                                        str = "\\u{XXX}";
                                    } else {
                                        str = "\\xXX";
                                    }
                                    sb4.append(str);
                                    throw new e.b(fVar, sb4.toString());
                                }
                                b2 = (byte) i4;
                                i3 = 0;
                                aVar.a(b2);
                            } else {
                                continue;
                            }
                        } else {
                            i4 /= 16;
                            if (i4 > 1114111) {
                                throw new e.b(fVar, "UTF-8 value too large: 0x" + Integer.toHexString(i4) + " (max allowed = 0x" + Integer.toHexString(1114111) + ")");
                            }
                            aVar.f(i4);
                            i3 = 0;
                        }
                    } else if (i3 == 3) {
                        if (48 > b2 || b2 > 57) {
                            i2--;
                        } else {
                            i4 = (i4 * 10) + (b2 - 48);
                            i5++;
                            if (i5 < 3) {
                            }
                        }
                        b2 = (byte) i4;
                        i3 = 0;
                        aVar.a(b2);
                    } else if (i3 != 4) {
                        if (i3 != 6) {
                            aVar.a(b2);
                        } else {
                            i4 *= 16;
                            if (i5 == -1) {
                                if (b2 != 123) {
                                    i5 += 100;
                                }
                                i5++;
                                if (i5 >= i3) {
                                    if (i5 != 2) {
                                        fVar.f1548c += i2;
                                        StringBuilder sb5 = new StringBuilder();
                                        sb5.append("Invalid char '");
                                        sb5.append((int) b2);
                                        sb5.append("' (code 0x");
                                        sb5.append(Integer.toHexString(b2));
                                        sb5.append(") in ");
                                        sb5.append(i3 == 6 ? "unicode" : "hex");
                                        sb5.append(" escape sequence, must be ");
                                        if (i3 == 6) {
                                            str = "\\u{XXX}";
                                        } else {
                                            str = "\\xXX";
                                        }
                                        sb5.append(str);
                                        throw new e.b(fVar, sb5.toString());
                                    }
                                    b2 = (byte) i4;
                                    i3 = 0;
                                    aVar.a(b2);
                                } else {
                                    continue;
                                }
                            } else {
                                if (i3 == 6) {
                                }
                                if (48 > b2) {
                                    if (97 <= b2) {
                                        if (65 <= b2) {
                                        }
                                        i5 += 100;
                                        i5++;
                                        if (i5 >= i3) {
                                            if (i5 != 2) {
                                                fVar.f1548c += i2;
                                                StringBuilder sb6 = new StringBuilder();
                                                sb6.append("Invalid char '");
                                                sb6.append((int) b2);
                                                sb6.append("' (code 0x");
                                                sb6.append(Integer.toHexString(b2));
                                                sb6.append(") in ");
                                                sb6.append(i3 == 6 ? "unicode" : "hex");
                                                sb6.append(" escape sequence, must be ");
                                                if (i3 == 6) {
                                                    str = "\\u{XXX}";
                                                } else {
                                                    str = "\\xXX";
                                                }
                                                sb6.append(str);
                                                throw new e.b(fVar, sb6.toString());
                                            }
                                            b2 = (byte) i4;
                                            i3 = 0;
                                            aVar.a(b2);
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        if (65 <= b2) {
                                        }
                                        i5 += 100;
                                        i5++;
                                        if (i5 >= i3) {
                                            if (i5 != 2) {
                                                fVar.f1548c += i2;
                                                StringBuilder sb7 = new StringBuilder();
                                                sb7.append("Invalid char '");
                                                sb7.append((int) b2);
                                                sb7.append("' (code 0x");
                                                sb7.append(Integer.toHexString(b2));
                                                sb7.append(") in ");
                                                sb7.append(i3 == 6 ? "unicode" : "hex");
                                                sb7.append(" escape sequence, must be ");
                                                if (i3 == 6) {
                                                    str = "\\u{XXX}";
                                                } else {
                                                    str = "\\xXX";
                                                }
                                                sb7.append(str);
                                                throw new e.b(fVar, sb7.toString());
                                            }
                                            b2 = (byte) i4;
                                            i3 = 0;
                                            aVar.a(b2);
                                        } else {
                                            continue;
                                        }
                                    }
                                } else if (97 <= b2) {
                                    if (65 <= b2) {
                                    }
                                    i5 += 100;
                                    i5++;
                                    if (i5 >= i3) {
                                        if (i5 != 2) {
                                            fVar.f1548c += i2;
                                            StringBuilder sb8 = new StringBuilder();
                                            sb8.append("Invalid char '");
                                            sb8.append((int) b2);
                                            sb8.append("' (code 0x");
                                            sb8.append(Integer.toHexString(b2));
                                            sb8.append(") in ");
                                            sb8.append(i3 == 6 ? "unicode" : "hex");
                                            sb8.append(" escape sequence, must be ");
                                            if (i3 == 6) {
                                                str = "\\u{XXX}";
                                            } else {
                                                str = "\\xXX";
                                            }
                                            sb8.append(str);
                                            throw new e.b(fVar, sb8.toString());
                                        }
                                        b2 = (byte) i4;
                                        i3 = 0;
                                        aVar.a(b2);
                                    } else {
                                        continue;
                                    }
                                } else {
                                    if (65 <= b2) {
                                    }
                                    i5 += 100;
                                    i5++;
                                    if (i5 >= i3) {
                                        if (i5 != 2) {
                                            fVar.f1548c += i2;
                                            StringBuilder sb9 = new StringBuilder();
                                            sb9.append("Invalid char '");
                                            sb9.append((int) b2);
                                            sb9.append("' (code 0x");
                                            sb9.append(Integer.toHexString(b2));
                                            sb9.append(") in ");
                                            sb9.append(i3 == 6 ? "unicode" : "hex");
                                            sb9.append(" escape sequence, must be ");
                                            if (i3 == 6) {
                                                str = "\\u{XXX}";
                                            } else {
                                                str = "\\xXX";
                                            }
                                            sb9.append(str);
                                            throw new e.b(fVar, sb9.toString());
                                        }
                                        b2 = (byte) i4;
                                        i3 = 0;
                                        aVar.a(b2);
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    } else if (b2 != 32) {
                        switch (b2) {
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                                continue;
                            default:
                                i3 = 0;
                                aVar.a(b2);
                                break;
                        }
                    }
                } else if (48 > b2 || b2 > 57) {
                    if (b2 == 97) {
                        b2 = 7;
                    } else if (b2 == 98) {
                        b2 = 8;
                    } else if (b2 == 102) {
                        b2 = 12;
                    } else if (b2 == 110) {
                        b2 = 10;
                    } else if (b2 == 114) {
                        b2 = 13;
                    } else if (b2 == 120) {
                        if (b2 == 117) {
                            i5 = -1;
                        } else {
                            i5 = 0;
                        }
                        if (b2 == 117) {
                            i3 = 6;
                        } else {
                            i3 = 2;
                        }
                        i4 = 0;
                    } else if (b2 != 122) {
                        switch (b2) {
                            case 116:
                                b2 = 9;
                                break;
                            case 117:
                                if (b2 == 117) {
                                    i5 = -1;
                                } else {
                                    i5 = 0;
                                }
                                if (b2 == 117) {
                                    i3 = 6;
                                } else {
                                    i3 = 2;
                                }
                                i4 = 0;
                                break;
                            case 118:
                                b2 = 11;
                                break;
                        }
                    } else {
                        i3 = 4;
                    }
                    i3 = 0;
                    aVar.a(b2);
                } else {
                    i4 = b2 - 48;
                    i3 = 3;
                    i5 = 1;
                }
            } else if (b2 == 92) {
                i3 = 1;
            } else {
                aVar.a(b2);
            }
            i2++;
        }
    }
}
