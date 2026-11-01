package luaj;

import android.ext.e1;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class d extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f1706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f1707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f1708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f1709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f1710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Throwable f1711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    LuaValue f1712g;
    protected String h;
    public String i;

    public static class a extends d {
        public a(Throwable th) {
            super(th);
        }
    }

    public static class b extends d {
        public b(String str, Throwable th) {
            super(str, th);
        }
    }

    public d(String str) {
        super(str);
        this.i = null;
        this.f1706a = 1;
    }

    private String a() {
        String strC;
        String strSubstring = this.f1708c;
        if (strSubstring == null || this.f1709d < 0) {
            return this.f1707b + '\n';
        }
        try {
            int i = 1;
            if (strSubstring.length() > 0 && strSubstring.charAt(0) == '@') {
                strSubstring = strSubstring.substring(1);
            }
            File file = new File(strSubstring);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(file.exists() ? new BufferedInputStream(new FileInputStream(file)) : new ByteArrayInputStream(strSubstring.getBytes())));
            while (i < this.f1709d && bufferedReader.readLine() != null) {
                i++;
            }
            strC = i == this.f1709d ? c(bufferedReader.readLine()) : "failed read line";
        } catch (Throwable th) {
            e1.l("Failed read source", th);
            strC = "failed read source";
        }
        return this.f1707b + "\n`" + strC + '`';
    }

    private String c(String str) {
        if (str == null || str.length() <= 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public LuaValue b() {
        LuaValue luaValue = this.f1712g;
        if (luaValue != null) {
            return luaValue;
        }
        String message = getMessage();
        if (message != null) {
            return LuaValue.K2(message);
        }
        return null;
    }

    public void d() {
        this.f1707b = c(this.f1708c) + ":" + this.f1709d;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f1711f;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str = this.f1710e;
        if (str != null) {
            String str2 = this.i;
            if (str2 == null || str.startsWith(str2)) {
                return this.f1710e;
            }
            return this.i + this.f1710e;
        }
        String message = this.h;
        if (message == null) {
            message = super.getMessage();
        }
        if (message == null) {
            return null;
        }
        if (this.f1707b != null) {
            StringBuilder sb = new StringBuilder();
            String str3 = this.i;
            sb.append((str3 == null || message.startsWith(str3)) ? "" : this.i);
            sb.append(a());
            sb.append('\n');
            sb.append(message);
            return sb.toString();
        }
        String str4 = this.i;
        if (str4 == null || message.startsWith(str4)) {
            return message;
        }
        return this.i + message;
    }

    public d(String str, int i) {
        super(str);
        this.i = null;
        this.f1706a = i;
    }

    public d(String str, int i, String str2) {
        super(str2);
        this.i = null;
        this.f1706a = 1;
        this.f1708c = str;
        this.f1709d = i;
        d();
    }

    public d(String str, Throwable th) {
        super(str);
        this.i = null;
        this.f1711f = th;
        this.f1706a = 1;
    }

    public d(Throwable th) {
        super("vm error: " + th);
        this.i = null;
        this.f1711f = th;
        this.f1706a = 1;
    }

    public d(LuaValue luaValue) {
        super(luaValue.g0());
        this.i = null;
        this.f1712g = luaValue;
        this.f1706a = 1;
    }
}
