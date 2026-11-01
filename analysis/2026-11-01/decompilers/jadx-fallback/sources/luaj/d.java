package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class d extends java.lang.RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f1706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected java.lang.String f1707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected java.lang.String f1708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f1709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected java.lang.String f1710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected java.lang.Throwable f1711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    luaj.LuaValue f1712g;
    protected java.lang.String h;
    public java.lang.String i;

    public static class a extends luaj.d {
        public a(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public static class b extends luaj.d {
        public b(java.lang.String r1, java.lang.Throwable r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    public d(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.i = r1
            r1 = 1
            r0.f1706a = r1
            return
    }

    public d(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.i = r1
            r0.f1706a = r2
            return
    }

    public d(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r3)
            r3 = 0
            r0.i = r3
            r3 = 1
            r0.f1706a = r3
            r0.f1708c = r1
            r0.f1709d = r2
            r0.d()
            return
    }

    public d(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.i = r1
            r0.f1711f = r2
            r1 = 1
            r0.f1706a = r1
            return
    }

    public d(java.lang.Throwable r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "vm error: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r0 = 0
            r2.i = r0
            r2.f1711f = r3
            r3 = 1
            r2.f1706a = r3
            return
    }

    public d(luaj.LuaValue r2) {
            r1 = this;
            java.lang.String r0 = r2.g0()
            r1.<init>(r0)
            r0 = 0
            r1.i = r0
            r1.f1712g = r2
            r2 = 1
            r1.f1706a = r2
            return
    }

    private java.lang.String a() {
            r5 = this;
            java.lang.String r0 = r5.f1708c
            r1 = 10
            if (r0 == 0) goto L8f
            int r2 = r5.f1709d
            if (r2 >= 0) goto Lc
            goto L8f
        Lc:
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L21
            r3 = 1
            if (r2 <= 0) goto L23
            r2 = 0
            char r2 = r0.charAt(r2)     // Catch: java.lang.Throwable -> L21
            r4 = 64
            if (r2 != r4) goto L23
            java.lang.String r0 = r0.substring(r3)     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            r0 = move-exception
            goto L6b
        L23:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L21
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L21
            boolean r4 = r2.exists()     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L39
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L21
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L21
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L21
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L21
            goto L43
        L39:
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L21
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L21
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L21
            r0 = r2
        L43:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L21
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L21
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L21
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L21
        L4d:
            int r0 = r5.f1709d     // Catch: java.lang.Throwable -> L21
            if (r3 >= r0) goto L5b
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L58
            goto L5b
        L58:
            int r3 = r3 + 1
            goto L4d
        L5b:
            int r0 = r5.f1709d     // Catch: java.lang.Throwable -> L21
            if (r3 != r0) goto L68
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = r5.c(r0)     // Catch: java.lang.Throwable -> L21
            goto L72
        L68:
            java.lang.String r0 = "failed read line"
            goto L72
        L6b:
            java.lang.String r2 = "Failed read source"
            android.ext.e1.l(r2, r0)
            java.lang.String r0 = "failed read source"
        L72:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r5.f1707b
            r2.append(r3)
            r2.append(r1)
            r1 = 96
            r2.append(r1)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
        L8f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r5.f1707b
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private java.lang.String c(java.lang.String r4) {
            r3 = this;
            if (r4 == 0) goto L20
            int r0 = r4.length()
            r1 = 124(0x7c, float:1.74E-43)
            if (r0 <= r1) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 0
            java.lang.String r4 = r4.substring(r2, r1)
            r0.append(r4)
            java.lang.String r4 = "..."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L20:
            return r4
    }

    public luaj.LuaValue b() {
            r1 = this;
            luaj.LuaValue r0 = r1.f1712g
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = r1.getMessage()
            if (r0 == 0) goto L10
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public void d() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.f1708c
            java.lang.String r1 = r2.c(r1)
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            int r1 = r2.f1709d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.f1707b = r0
            return
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
            r1 = this;
            java.lang.Throwable r0 = r1.f1711f
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r3 = this;
            java.lang.String r0 = r3.f1710e
            if (r0 == 0) goto L26
            java.lang.String r1 = r3.i
            if (r1 == 0) goto L23
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto Lf
            goto L23
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.i
            r0.append(r1)
            java.lang.String r1 = r3.f1710e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L25
        L23:
            java.lang.String r0 = r3.f1710e
        L25:
            return r0
        L26:
            java.lang.String r0 = r3.h
            if (r0 != 0) goto L2e
            java.lang.String r0 = super.getMessage()
        L2e:
            if (r0 != 0) goto L32
            r0 = 0
            return r0
        L32:
            java.lang.String r1 = r3.f1707b
            if (r1 == 0) goto L62
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.i
            if (r2 == 0) goto L49
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L46
            goto L49
        L46:
            java.lang.String r2 = r3.i
            goto L4b
        L49:
            java.lang.String r2 = ""
        L4b:
            r1.append(r2)
            java.lang.String r2 = r3.a()
            r1.append(r2)
            r2 = 10
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L62:
            java.lang.String r1 = r3.i
            if (r1 == 0) goto L7e
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L6d
            goto L7e
        L6d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.i
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L7e:
            return r0
    }
}
