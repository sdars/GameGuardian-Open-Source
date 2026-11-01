/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

public abstract class r1 {
    public static int a(Object object, Object object2) {
        object = object.toString();
        object2 = object2.toString();
        char c4 = ((String)object).length();
        char c5 = ((String)object2).length();
        char c6 = '\u0000';
        char c7 = '\u0000';
        block0: while (true) {
            char c8 = c6 >= c4 ? (char)'\u0000' : ((String)object).charAt(c6);
            char c9 = c7 >= c5 ? (char)'\u0000' : ((String)object2).charAt(c7);
            char c10 = '\u0000';
            char c11 = c6;
            while (true) {
                if (c8 != ' ' && c8 != '0') {
                    char c12 = '\u0000';
                    c6 = c7;
                    while (true) {
                        if (c9 != ' ' && c9 != '0') {
                            if (c8 <= '9' && c9 <= '9' && '0' <= c8 && '0' <= c9 && (c7 = r1.b(((String)object).substring(c11), ((String)object2).substring(c6))) != '\u0000') {
                                return c7;
                            }
                            if (c8 == '\u0000' && c9 == '\u0000') {
                                return c10 - c12;
                            }
                            if (c8 < c9) {
                                return -1;
                            }
                            if (c8 > c9) {
                                return 1;
                            }
                            c7 = c11 + 1;
                            c8 = c6 + 1;
                            c6 = c7;
                            c7 = c8;
                            continue block0;
                        }
                        c7 = c9 == '0' ? c12 + 1 : (char)'\u0000';
                        if (++c6 >= c5) {
                            c9 = '\u0000';
                            c12 = c7;
                            continue;
                        }
                        c9 = ((String)object2).charAt(c6);
                        c12 = c7;
                    }
                }
                c6 = c8 == '0' ? c10 + 1 : (char)'\u0000';
                if (++c11 >= c4) {
                    c8 = '\u0000';
                    c10 = c6;
                    continue;
                }
                c8 = ((String)object).charAt(c11);
                c10 = c6;
            }
            break;
        }
    }

    private static int b(String string2, String string3) {
        int n3 = string2.length();
        int n4 = string3.length();
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        while (true) {
            char c4 = n5 >= n3 ? (char)'\u0000' : string2.charAt(n5);
            char c5 = n6 >= n4 ? (char)'\u0000' : string3.charAt(n6);
            int n8 = c4 <= '9' && '0' <= c4 ? 0 : 1;
            boolean bl = c5 > '9' || '0' > c5;
            if (n8 != 0 && bl) {
                return n7;
            }
            if (n8 != 0) {
                return -1;
            }
            if (bl) {
                return 1;
            }
            if (c4 == '\u0000' && c5 == '\u0000') {
                return n7;
            }
            n8 = n7;
            if (n7 == 0) {
                if (c4 < c5) {
                    n8 = -1;
                } else {
                    n8 = n7;
                    if (c4 > c5) {
                        n8 = 1;
                    }
                }
            }
            ++n5;
            ++n6;
            n7 = n8;
        }
    }
}

