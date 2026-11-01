/*
 * Decompiled with CFR 0.152.
 */
package luaj;

import android.ext.Script;
import java.util.Locale;
import luaj.LuaString;
import luaj.LuaValue;

public abstract class LuaFunction
extends LuaValue {
    public static LuaValue P;
    private static final String Q;

    static {
        Q = Script.class.getName();
    }

    public static String U2(String string2) {
        StringBuilder stringBuilder;
        int n3;
        int n4 = string2.lastIndexOf(36);
        int n5 = string2.lastIndexOf(46);
        int n6 = Math.max(n5, n4);
        int n7 = n3 = n6 + 1;
        if (string2.charAt(n3) == '_') {
            n7 = n6 + 2;
        }
        String string3 = string2.substring(n7);
        if (string2.startsWith(Q)) {
            string2 = "gg.";
        } else if (n4 > n5 && string2.contains("Lib$") && !string2.contains("BaseLib$")) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(string2.substring(n5 + 1, n4 - 3).toLowerCase(Locale.ENGLISH));
            stringBuilder.append('.');
            string2 = stringBuilder.toString();
        } else {
            string2 = null;
        }
        if (string2 == null) {
            string2 = string3;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(string3);
            string2 = stringBuilder.toString();
        }
        return string2;
    }

    @Override
    public int C2() {
        return 6;
    }

    @Override
    public String D2() {
        return "function";
    }

    @Override
    public LuaFunction G1(LuaFunction luaFunction) {
        return this;
    }

    public String S2() {
        return LuaFunction.U2(this.getClass().getName());
    }

    public String T2() {
        return this.S2();
    }

    @Override
    public LuaValue V0() {
        return P;
    }

    @Override
    public String g0() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("function: ");
        stringBuilder.append(this.S2());
        return stringBuilder.toString();
    }

    @Override
    public boolean g1() {
        return true;
    }

    @Override
    public LuaString q2() {
        return LuaValue.K2(this.g0());
    }

    @Override
    public LuaFunction y0() {
        return this;
    }
}

