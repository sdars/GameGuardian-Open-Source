package luaj.lib;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile java.lang.reflect.Field f1790a;

    public static java.lang.String a(java.io.File r0) {
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.io.IOException -> L5
            goto L9
        L5:
            java.lang.String r0 = r0.getAbsolutePath()
        L9:
            return r0
    }

    public static boolean b(java.io.FileDescriptor r1, luaj.lib.e r2, boolean r3) {
            r0 = 1
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = g(r1)
            if (r1 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            boolean r1 = r2.m(r1, r3)
            r1 = r1 ^ r0
            return r1
    }

    static int c(java.io.FileDescriptor r2) {
            java.lang.Class<java.io.FileDescriptor> r0 = java.io.FileDescriptor.class
            java.lang.reflect.Field r1 = luaj.lib.d.f1790a
            if (r1 != 0) goto L1b
            java.lang.String r1 = "descriptor"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> Le
        Lc:
            r1 = r0
            goto L15
        Le:
            java.lang.String r1 = "fd"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            goto Lc
        L15:
            r0 = 1
            r1.setAccessible(r0)
            luaj.lib.d.f1790a = r1
        L1b:
            int r2 = r1.getInt(r2)
            return r2
    }

    public static java.lang.String d(java.lang.String r2) {
            java.lang.String r0 = "/data/data/"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "/data/user/0/"
            r0.append(r1)
            r1 = 11
            java.lang.String r2 = r2.substring(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
        L1f:
            return r2
    }

    public static java.io.FileInputStream e(java.io.File r4, luaj.lib.e r5) {
            if (r5 != 0) goto L8
            java.io.FileInputStream r5 = new java.io.FileInputStream
            r5.<init>(r4)
            return r5
        L8:
            java.lang.String r4 = a(r4)
            r0 = 1
            boolean r1 = r5.m(r4, r0)
            r2 = 0
            if (r1 == 0) goto L15
            return r2
        L15:
            java.io.FileInputStream r1 = new java.io.FileInputStream
            java.io.File r3 = new java.io.File
            r3.<init>(r4)
            r1.<init>(r3)
            java.io.FileDescriptor r4 = r1.getFD()
            boolean r4 = b(r4, r5, r0)
            if (r4 != 0) goto L2d
            r1.close()     // Catch: java.io.IOException -> L2c
        L2c:
            return r2
        L2d:
            return r1
    }

    public static java.io.RandomAccessFile f(java.io.File r7, luaj.lib.e r8) {
            r0 = 0
            java.lang.String r2 = "rw"
            if (r8 != 0) goto Lf
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile
            r8.<init>(r7, r2)
            r8.setLength(r0)
            return r8
        Lf:
            java.lang.String r7 = a(r7)
            r3 = 0
            boolean r4 = r8.m(r7, r3)
            r5 = 0
            if (r4 == 0) goto L1c
            return r5
        L1c:
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile
            java.io.File r6 = new java.io.File
            r6.<init>(r7)
            r4.<init>(r6, r2)
            java.io.FileDescriptor r7 = r4.getFD()
            boolean r7 = b(r7, r8, r3)
            if (r7 != 0) goto L34
            r4.close()     // Catch: java.io.IOException -> L33
        L33:
            return r5
        L34:
            r4.setLength(r0)
            return r4
    }

    public static java.lang.String g(java.io.FileDescriptor r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r0.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "/proc/self/fd/"
            r0.append(r1)     // Catch: java.lang.Throwable -> L1a
            int r2 = c(r2)     // Catch: java.lang.Throwable -> L1a
            r0.append(r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = h(r2)     // Catch: java.lang.Throwable -> L1a
            return r2
        L1a:
            r2 = 0
            return r2
    }

    private static java.lang.String h(java.lang.String r1) {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L10
            java.nio.file.Path r0 = luaj.lib.a.a(r1, r0)     // Catch: java.lang.Throwable -> L10
            java.nio.file.Path r0 = luaj.lib.b.a(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = luaj.lib.c.a(r0)     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            java.lang.String r1 = android.system.Os.readlink(r1)     // Catch: java.lang.Throwable -> L15
            return r1
        L15:
            r1 = 0
            return r1
    }
}
