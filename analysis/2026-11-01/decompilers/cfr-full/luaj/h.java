/*
 * Decompiled with CFR 0.152.
 */
package luaj;

import f.b;
import f.d;
import java.io.File;
import luaj.LuaString;
import luaj.LuaValue;

public class h {
    private static final d[] n = new d[0];
    private static final h[] o = new h[0];
    public LuaValue[] a;
    public int[] b;
    public h[] c = o;
    public int[] d;
    public b[] e;
    public d[] f = n;
    public LuaString g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    int m = -1;

    public LuaString a(int n3, int n4) {
        Object object;
        int n5 = n3;
        for (int i3 = 0; i3 < ((b[])(object = this.e)).length; ++i3) {
            object = object[i3];
            if (object.b > n4) break;
            n3 = n5--;
            if (n4 < object.c) {
                n3 = n5;
                if (n5 == 0) {
                    return object.a;
                }
            }
            n5 = n3;
        }
        return null;
    }

    public String b() {
        Object object;
        Object object2;
        block10: {
            block9: {
                object2 = this.g;
                if (object2 == null) {
                    return "null";
                }
                object = ((LuaString)object2).g0();
                if (!((String)object).startsWith("/")) break block9;
                object2 = object;
                if (new File((String)object).exists()) break block10;
            }
            object2 = object;
            if (((String)object).length() > 124) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(((String)object).substring(0, 124));
                ((StringBuilder)object2).append("...");
                object2 = ((StringBuilder)object2).toString();
            }
        }
        if (!((String)object2).startsWith("@") && !((String)object2).startsWith("=")) {
            object = object2;
            if (((String)object2).startsWith("")) {
                object = "=?";
            }
        } else {
            object = ((String)object2).substring(1);
        }
        return object;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.g);
        stringBuilder.append(':');
        stringBuilder.append(this.h);
        stringBuilder.append('-');
        stringBuilder.append(this.i);
        return stringBuilder.toString();
    }
}

