/*
 * Decompiled with CFR 0.152.
 */
package e;

import e.f;

public class d
extends Exception {
    public f a;
    public int[][] b;
    public String[] c;
    protected String d = System.getProperty("line.separator", "\n");

    public d() {
    }

    public d(f f4, int[][] nArray, String[] stringArray) {
        super(e.d.b(f4, nArray, stringArray));
        this.a = f4;
        this.b = nArray;
        this.c = stringArray;
    }

    public d(String string2) {
        super(string2);
    }

    public d(String string2, Throwable throwable) {
        super(string2, throwable);
    }

    /*
     * Enabled aggressive block sorting
     */
    static String a(String string2) {
        StringBuffer stringBuffer = new StringBuffer();
        int n3 = 0;
        while (true) {
            block11: {
                CharSequence charSequence;
                block16: {
                    block12: {
                        block13: {
                            block14: {
                                block15: {
                                    if (n3 >= string2.length()) {
                                        return stringBuffer.toString();
                                    }
                                    char c4 = string2.charAt(n3);
                                    if (c4 == '\u0000') break block11;
                                    if (c4 == '\"') break block12;
                                    if (c4 == '\'') break block13;
                                    if (c4 == '\\') break block14;
                                    if (c4 == '\f') break block15;
                                    if (c4 != '\r') {
                                        switch (c4) {
                                            default: {
                                                char c5 = string2.charAt(n3);
                                                if (c5 >= ' ' && c5 <= '~') {
                                                    stringBuffer.append(c5);
                                                    break block11;
                                                } else {
                                                    charSequence = new StringBuilder();
                                                    ((StringBuilder)charSequence).append("0000");
                                                    ((StringBuilder)charSequence).append(Integer.toString(c5, 16));
                                                    charSequence = ((StringBuilder)charSequence).toString();
                                                    StringBuilder stringBuilder = new StringBuilder();
                                                    stringBuilder.append("\\u");
                                                    stringBuilder.append(((String)charSequence).substring(((String)charSequence).length() - 4, ((String)charSequence).length()));
                                                    charSequence = stringBuilder.toString();
                                                    break;
                                                }
                                            }
                                            case '\n': {
                                                charSequence = "\\n";
                                                break;
                                            }
                                            case '\t': {
                                                charSequence = "\\t";
                                                break;
                                            }
                                            case '\b': {
                                                charSequence = "\\b";
                                                break;
                                            }
                                        }
                                        break block16;
                                    } else {
                                        charSequence = "\\r";
                                    }
                                    break block16;
                                }
                                charSequence = "\\f";
                                break block16;
                            }
                            charSequence = "\\\\";
                            break block16;
                        }
                        charSequence = "\\'";
                        break block16;
                    }
                    charSequence = "\\\"";
                }
                stringBuffer.append((String)charSequence);
            }
            ++n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String b(f object, int[][] object2, String[] object3) {
        Object object4;
        int n3;
        Object object5;
        String string2 = System.getProperty("line.separator", "\n");
        StringBuffer stringBuffer = new StringBuffer();
        int n4 = 0;
        for (int i3 = 0; i3 < ((Object)object2).length; ++i3) {
            object5 = object2[i3];
            n3 = n4;
            if (n4 < ((Object)object5).length) {
                n3 = ((Object)object5).length;
            }
            for (n4 = 0; n4 < ((Object)(object5 = object2[i3])).length; ++n4) {
                stringBuffer.append((String)object3[object5[n4]]);
                stringBuffer.append(' ');
            }
            if (object5[((Object)object5).length - 1] != false) {
                stringBuffer.append("...");
            }
            stringBuffer.append(string2);
            stringBuffer.append("    ");
            n4 = n3;
        }
        f f4 = ((f)object).g;
        object5 = "Encountered \"";
        n3 = 0;
        while (true) {
            object4 = object5;
            if (n3 >= n4) break;
            object4 = object5;
            if (n3 != 0) {
                object4 = new StringBuilder();
                ((StringBuilder)object4).append((String)object5);
                ((StringBuilder)object4).append(" ");
                object4 = ((StringBuilder)object4).toString();
            }
            if (f4.a == 0) {
                object5 = new StringBuilder();
                ((StringBuilder)object5).append((String)object4);
                ((StringBuilder)object5).append((String)object3[0]);
                object4 = ((StringBuilder)object5).toString();
                break;
            }
            object5 = new StringBuilder();
            ((StringBuilder)object5).append((String)object4);
            ((StringBuilder)object5).append(" ");
            ((StringBuilder)object5).append((String)object3[f4.a]);
            object4 = ((StringBuilder)object5).toString();
            object5 = new StringBuilder();
            ((StringBuilder)object5).append((String)object4);
            ((StringBuilder)object5).append(" \"");
            object4 = ((StringBuilder)object5).toString();
            object5 = new StringBuilder();
            ((StringBuilder)object5).append((String)object4);
            ((StringBuilder)object5).append(e.d.a(f4.f));
            object5 = ((StringBuilder)object5).toString();
            object4 = new StringBuilder();
            ((StringBuilder)object4).append((String)object5);
            ((StringBuilder)object4).append(" \"");
            object5 = ((StringBuilder)object4).toString();
            f4 = f4.g;
            ++n3;
        }
        object3 = new StringBuilder();
        ((StringBuilder)object3).append((String)object4);
        ((StringBuilder)object3).append("\" at line ");
        ((StringBuilder)object3).append(((f)object).g.b);
        ((StringBuilder)object3).append(", column ");
        ((StringBuilder)object3).append(((f)object).g.c);
        object = ((StringBuilder)object3).toString();
        object3 = new StringBuilder();
        ((StringBuilder)object3).append((String)object);
        ((StringBuilder)object3).append(".");
        ((StringBuilder)object3).append(string2);
        object3 = ((StringBuilder)object3).toString();
        if (((Object)object2).length == 1) {
            object = new StringBuilder();
            ((StringBuilder)object).append((String)object3);
            object2 = "Was expecting:";
        } else {
            object = new StringBuilder();
            ((StringBuilder)object).append((String)object3);
            object2 = "Was expecting one of:";
        }
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("    ");
        object = ((StringBuilder)object).toString();
        object2 = new StringBuilder();
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append(stringBuffer.toString());
        return ((StringBuilder)object2).toString();
    }
}

