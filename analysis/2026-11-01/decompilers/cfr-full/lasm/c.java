/*
 * Decompiled with CFR 0.152.
 */
package lasm;

public class c
extends Error {
    int a;
    int b;
    int c;

    public c(String string2, int n3) {
        super(string2);
        this.a = n3;
    }

    public c(boolean bl, int n3, int n4, int n5, String string2, char c4, int n6) {
        this(lasm.c.a(bl, n3, n4, n5, string2, c4), n6);
        this.b = n4;
        this.c = n5;
    }

    protected static String a(boolean bl, int n3, int n4, int n5, String string2, char c4) {
        CharSequence charSequence;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Lexical error at line ");
        stringBuilder.append(n4);
        stringBuilder.append(", column ");
        stringBuilder.append(n5);
        stringBuilder.append(".  Encountered: ");
        if (bl) {
            charSequence = "<EOF> ";
        } else {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("\"");
            ((StringBuilder)charSequence).append(lasm.c.b(String.valueOf(c4)));
            ((StringBuilder)charSequence).append("\"");
            ((StringBuilder)charSequence).append(" (");
            ((StringBuilder)charSequence).append((int)c4);
            ((StringBuilder)charSequence).append("), ");
            charSequence = ((StringBuilder)charSequence).toString();
        }
        stringBuilder.append((String)charSequence);
        stringBuilder.append("after : \"");
        stringBuilder.append(lasm.c.b(string2));
        stringBuilder.append("\"");
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    protected static final String b(String string2) {
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
                                                    String string3 = ((StringBuilder)charSequence).toString();
                                                    charSequence = new StringBuilder();
                                                    ((StringBuilder)charSequence).append("\\u");
                                                    ((StringBuilder)charSequence).append(string3.substring(string3.length() - 4, string3.length()));
                                                    charSequence = ((StringBuilder)charSequence).toString();
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

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

