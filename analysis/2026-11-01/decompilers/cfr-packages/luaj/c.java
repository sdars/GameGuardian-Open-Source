/*
 * Decompiled with CFR 0.152.
 */
package luaj;

import luaj.LuaFunction;
import luaj.d;

public class c
extends d {
    public final int j;
    public final String k;
    public final String l;

    public c(int n3, String string2, String string3) {
        super((String)null);
        this.j = n3;
        this.k = string3;
        this.l = this.e(string2);
        this.h = this.f();
    }

    c(c c4) {
        super(null, c4);
        this.j = c4.j - 1;
        this.k = c4.k;
        this.l = c4.l;
        this.h = this.f();
    }

    private String e(String string2) {
        String string3 = string2;
        if (string2 == null) {
            StackTraceElement[] stackTraceElementArray = this.getStackTrace();
            string3 = string2;
            if (stackTraceElementArray != null) {
                int n3 = stackTraceElementArray.length;
                int n4 = 1;
                while (true) {
                    string3 = string2;
                    if (n4 >= n3) break;
                    string3 = stackTraceElementArray[n4].getClassName();
                    if (string3 != null) {
                        if (string3.endsWith("LuaClosure")) {
                            string3 = string2;
                            break;
                        }
                        if (string3.contains("Lib$")) {
                            string3 = LuaFunction.U2(string3);
                            break;
                        }
                    }
                    ++n4;
                }
            }
        }
        return string3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private String f() {
        CharSequence charSequence;
        StringBuilder stringBuilder;
        if (this.l == null) {
            stringBuilder = new StringBuilder();
            if (this.j == 0) {
                charSequence = "calling method on bad self";
            } else {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("bad argument #");
                ((StringBuilder)charSequence).append(this.j);
                ((StringBuilder)charSequence).append(": ");
                charSequence = ((StringBuilder)charSequence).toString();
            }
            stringBuilder.append((String)charSequence);
            charSequence = this.k;
        } else {
            stringBuilder = new StringBuilder();
            if (this.j == 0) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("calling '");
                ((StringBuilder)charSequence).append(this.l);
                ((StringBuilder)charSequence).append("' on bad self");
                charSequence = ((StringBuilder)charSequence).toString();
            } else {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("bad argument #");
                ((StringBuilder)charSequence).append(this.j);
                ((StringBuilder)charSequence).append(" to '");
                ((StringBuilder)charSequence).append(this.l);
                ((StringBuilder)charSequence).append("'");
                charSequence = ((StringBuilder)charSequence).toString();
            }
            stringBuilder.append((String)charSequence);
            stringBuilder.append(" (");
            stringBuilder.append(this.k);
            charSequence = ")";
        }
        stringBuilder.append((String)charSequence);
        return stringBuilder.toString();
    }
}

