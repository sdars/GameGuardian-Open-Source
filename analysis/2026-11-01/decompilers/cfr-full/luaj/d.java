/*
 * Decompiled with CFR 0.152.
 */
package luaj;

import android.ext.e1;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import luaj.LuaValue;

public class d
extends RuntimeException {
    protected int a;
    protected String b;
    protected String c;
    protected int d;
    protected String e;
    protected Throwable f;
    LuaValue g;
    protected String h;
    public String i;

    public d(String string2) {
        super(string2);
        this.i = null;
        this.a = 1;
    }

    public d(String string2, int n3) {
        super(string2);
        this.i = null;
        this.a = n3;
    }

    public d(String string2, int n3, String string3) {
        super(string3);
        this.i = null;
        this.a = 1;
        this.c = string2;
        this.d = n3;
        this.d();
    }

    public d(String string2, Throwable throwable) {
        super(string2);
        this.i = null;
        this.f = throwable;
        this.a = 1;
    }

    public d(Throwable throwable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("vm error: ");
        stringBuilder.append(throwable);
        super(stringBuilder.toString());
        this.i = null;
        this.f = throwable;
        this.a = 1;
    }

    public d(LuaValue luaValue) {
        super(luaValue.g0());
        this.i = null;
        this.g = luaValue;
        this.a = 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String a() {
        block8: {
            Object object;
            Object object2;
            block9: {
                Throwable throwable2;
                block7: {
                    Closeable closeable;
                    int n3;
                    block6: {
                        object2 = this.c;
                        if (object2 == null || this.d < 0) break block8;
                        try {
                            int n4 = ((String)object2).length();
                            n3 = 1;
                            object = object2;
                            if (n4 <= 0) break block6;
                            object = object2;
                            if (((String)object2).charAt(0) != '@') break block6;
                            object = ((String)object2).substring(1);
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    if (((File)(object2 = new File((String)object))).exists()) {
                        closeable = new FileInputStream((File)object2);
                        object = new BufferedInputStream((InputStream)closeable);
                    } else {
                        object = new ByteArrayInputStream(((String)object).getBytes());
                    }
                    closeable = new InputStreamReader((InputStream)object);
                    object2 = new BufferedReader((Reader)closeable);
                    while (n3 < this.d && ((BufferedReader)object2).readLine() != null) {
                        ++n3;
                    }
                    object = n3 == this.d ? this.c(((BufferedReader)object2).readLine()) : "failed read line";
                    break block9;
                }
                e1.l("Failed read source", throwable2);
                object = "failed read source";
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(this.b);
            ((StringBuilder)object2).append('\n');
            ((StringBuilder)object2).append('`');
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append('`');
            return ((StringBuilder)object2).toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        stringBuilder.append('\n');
        return stringBuilder.toString();
    }

    private String c(String string2) {
        CharSequence charSequence = string2;
        if (string2 != null) {
            charSequence = string2;
            if (string2.length() > 124) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(string2.substring(0, 124));
                ((StringBuilder)charSequence).append("...");
                charSequence = ((StringBuilder)charSequence).toString();
            }
        }
        return charSequence;
    }

    public LuaValue b() {
        Object object = this.g;
        if (object != null) {
            return object;
        }
        object = this.getMessage();
        object = object != null ? LuaValue.K2((String)object) : null;
        return object;
    }

    public void d() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.c(this.c));
        stringBuilder.append(":");
        stringBuilder.append(this.d);
        this.b = stringBuilder.toString();
    }

    @Override
    public Throwable getCause() {
        return this.f;
    }

    @Override
    public String getMessage() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            CharSequence charSequence2 = this.i;
            if (charSequence2 != null && !((String)charSequence).startsWith((String)charSequence2)) {
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append(this.i);
                ((StringBuilder)charSequence2).append(this.e);
                charSequence2 = ((StringBuilder)charSequence2).toString();
            } else {
                charSequence2 = this.e;
            }
            return charSequence2;
        }
        charSequence = this.h;
        String string2 = charSequence;
        if (charSequence == null) {
            string2 = super.getMessage();
        }
        if (string2 == null) {
            return null;
        }
        if (this.b != null) {
            StringBuilder stringBuilder = new StringBuilder();
            charSequence = this.i;
            charSequence = charSequence != null && !string2.startsWith((String)charSequence) ? this.i : "";
            stringBuilder.append((String)charSequence);
            stringBuilder.append(this.a());
            stringBuilder.append('\n');
            stringBuilder.append(string2);
            return stringBuilder.toString();
        }
        String string3 = this.i;
        charSequence = string2;
        if (string3 != null) {
            if (string2.startsWith(string3)) {
                charSequence = string2;
            } else {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(this.i);
                ((StringBuilder)charSequence).append(string2);
                charSequence = ((StringBuilder)charSequence).toString();
            }
        }
        return charSequence;
    }

    public static class a
    extends d {
        public a(Throwable throwable) {
            super(throwable);
        }
    }

    public static class b
    extends d {
        public b(String string2, Throwable throwable) {
            super(string2, throwable);
        }
    }
}

