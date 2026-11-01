package android.lang;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public final class ProcessBuilder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f1454d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String[] f1455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.io.File f1456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.util.Map f1457c;

    static {
            return
    }

    public ProcessBuilder(java.lang.String... r1) {
            r0 = this;
            r0.<init>()
            r0.f1455a = r1
            return
    }

    public static java.lang.Process c(java.lang.String[] r1, java.lang.String[] r2, java.io.File r3) {
            boolean r0 = android.lang.ProcessBuilder.f1454d
            if (r0 != 0) goto La
            r0 = 1
            android.lang.ProcessBuilder.f1454d = r0
            android.ext.e0.l()
        La:
            android.lang.ProcessBuilder r0 = new android.lang.ProcessBuilder
            r0.<init>(r1)
            android.lang.ProcessBuilder r1 = r0.b(r2)
            android.lang.ProcessBuilder r1 = r1.a(r3)
            java.lang.Process r1 = r1.d()
            return r1
    }

    public static native boolean loaded();

    public android.lang.ProcessBuilder a(java.io.File r1) {
            r0 = this;
            r0.f1456b = r1
            return r0
    }

    android.lang.ProcessBuilder b(java.lang.String[] r8) {
            r7 = this;
            if (r8 == 0) goto L39
            int r0 = r8.length
            java.util.Map r0 = android.lang.ProcessEnvironment.i(r0)
            r7.f1457c = r0
            int r0 = r8.length
            r1 = 0
            r2 = 0
        Lc:
            if (r2 >= r0) goto L39
            r3 = r8[r2]
            int r4 = r3.indexOf(r1)
            r5 = -1
            if (r4 == r5) goto L1f
            java.lang.String r4 = "\u0000.*"
            java.lang.String r6 = ""
            java.lang.String r3 = r3.replaceFirst(r4, r6)
        L1f:
            r4 = 61
            int r4 = r3.indexOf(r4, r1)
            if (r4 == r5) goto L36
            java.util.Map r5 = r7.f1457c
            java.lang.String r6 = r3.substring(r1, r4)
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)
            r5.put(r6, r3)
        L36:
            int r2 = r2 + 1
            goto Lc
        L39:
            return r7
    }

    public java.lang.Process d() {
            r8 = this;
            java.lang.String[] r0 = r8.f1455a
            java.lang.Object r0 = r0.clone()
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lb:
            if (r3 >= r1) goto L15
            r4 = r0[r3]
            r4.getClass()
            int r3 = r3 + 1
            goto Lb
        L15:
            r1 = r0[r2]
            java.lang.SecurityManager r3 = java.lang.System.getSecurityManager()
            if (r3 == 0) goto L20
            r3.checkExec(r1)
        L20:
            java.io.File r4 = r8.f1456b
            if (r4 != 0) goto L26
            r4 = 0
            goto L2a
        L26:
            java.lang.String r4 = r4.toString()
        L2a:
            r5 = 1
        L2b:
            int r6 = r0.length
            if (r5 >= r6) goto L41
            r6 = r0[r5]
            int r6 = r6.indexOf(r2)
            if (r6 >= 0) goto L39
            int r5 = r5 + 1
            goto L2b
        L39:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "invalid null character in command"
            r0.<init>(r1)
            throw r0
        L41:
            java.util.Map r5 = r8.f1457c     // Catch: java.lang.IllegalArgumentException -> L48 java.io.IOException -> L4a
            java.lang.Process r0 = android.lang.a.b(r0, r5, r4, r2)     // Catch: java.lang.IllegalArgumentException -> L48 java.io.IOException -> L4a
            return r0
        L48:
            r0 = move-exception
            goto L4b
        L4a:
            r0 = move-exception
        L4b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = ": "
            r2.append(r5)
            java.lang.String r5 = r0.getMessage()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            boolean r5 = r0 instanceof java.io.IOException
            java.lang.String r6 = ""
            if (r5 == 0) goto L6e
            if (r3 == 0) goto L6e
            r3.checkRead(r1)     // Catch: java.lang.SecurityException -> L6c
            goto L6e
        L6c:
            r0 = move-exception
            r2 = r6
        L6e:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Cannot run program \""
            r5.append(r7)
            r5.append(r1)
            r1 = 34
            r5.append(r1)
            if (r4 != 0) goto L85
            goto L9b
        L85:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = " (in directory \""
            r1.append(r6)
            r1.append(r4)
            java.lang.String r4 = "\")"
            r1.append(r4)
            java.lang.String r6 = r1.toString()
        L9b:
            r5.append(r6)
            r5.append(r2)
            java.lang.String r1 = r5.toString()
            r3.<init>(r1, r0)
            throw r3
    }
}
