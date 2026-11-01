package d;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class c extends android.content.ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String[] f1516a = null;

    static {
            java.lang.String r0 = "_display_name"
            java.lang.String r1 = "_size"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            d.c.f1516a = r0
            return
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.Object[] a(java.lang.Object[] r2, int r3) {
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            return r0
    }

    private static java.lang.String[] b(java.lang.String[] r2, int r3) {
            java.lang.String[] r0 = new java.lang.String[r3]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            return r0
    }

    private static java.io.File c(android.net.Uri r3) {
            java.lang.String r3 = r3.getPath()
            if (r3 == 0) goto L2c
            java.lang.String r0 = ".apk"
            boolean r0 = r3.endsWith(r0)
            if (r0 != 0) goto Lf
            goto L2c
        Lf:
            java.lang.String r0 = "/"
            boolean r1 = r3.startsWith(r0)
            if (r1 != 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
        L26:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            goto L42
        L2c:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "/wrong_path/"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
        L42:
            return r0
    }

    public static android.net.Uri d(android.content.Context r1, java.lang.String r2, java.io.File r3) {
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = "content"
            android.net.Uri$Builder r1 = r1.scheme(r0)
            android.net.Uri$Builder r1 = r1.authority(r2)
            java.lang.String r2 = r3.getAbsolutePath()
            android.net.Uri$Builder r1 = r1.encodedPath(r2)
            android.net.Uri r1 = r1.build()
            return r1
    }

    @Override // android.content.ContentProvider
    public void attachInfo(android.content.Context r1, android.content.pm.ProviderInfo r2) {
            r0 = this;
            super.attachInfo(r1, r2)
            boolean r1 = r2.exported
            if (r1 != 0) goto L14
            boolean r1 = r2.grantUriPermissions
            if (r1 == 0) goto Lc
            return
        Lc:
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.String r2 = "Provider must grant uri permissions"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.String r2 = "Provider must not be exported"
            r1.<init>(r2)
            throw r1
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri r1, java.lang.String r2, java.lang.String[] r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri r1) {
            r0 = this;
            java.lang.String r1 = "application/vnd.android.package-archive"
            return r1
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri r1, android.content.ContentValues r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "No external inserts"
            r1.<init>(r2)
            throw r1
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.content.ContentProvider
    public android.os.ParcelFileDescriptor openFile(android.net.Uri r1, java.lang.String r2) {
            r0 = this;
            java.io.File r1 = c(r1)
            r2 = 268435456(0x10000000, float:2.524355E-29)
            android.os.ParcelFileDescriptor r1 = android.os.ParcelFileDescriptor.open(r1, r2)
            return r1
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri r6, java.lang.String[] r7, java.lang.String r8, java.lang.String[] r9, java.lang.String r10) {
            r5 = this;
            java.io.File r6 = c(r6)
            if (r7 != 0) goto L8
            java.lang.String[] r7 = d.c.f1516a
        L8:
            int r8 = r7.length
            java.lang.String[] r8 = new java.lang.String[r8]
            int r9 = r7.length
            java.lang.Object[] r9 = new java.lang.Object[r9]
            int r10 = r7.length
            r0 = 0
            r1 = 0
        L11:
            if (r0 >= r10) goto L43
            r2 = r7[r0]
            java.lang.String r3 = "_display_name"
            boolean r4 = r3.equals(r2)
            if (r4 == 0) goto L29
            r8[r1] = r3
            int r2 = r1 + 1
            java.lang.String r3 = r6.getName()
            r9[r1] = r3
        L27:
            r1 = r2
            goto L40
        L29:
            java.lang.String r3 = "_size"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L40
            r8[r1] = r3
            int r2 = r1 + 1
            long r3 = r6.length()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r9[r1] = r3
            goto L27
        L40:
            int r0 = r0 + 1
            goto L11
        L43:
            java.lang.String[] r6 = b(r8, r1)
            java.lang.Object[] r7 = a(r9, r1)
            android.database.MatrixCursor r8 = new android.database.MatrixCursor
            r9 = 1
            r8.<init>(r6, r9)
            r8.addRow(r7)
            return r8
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri r1, android.content.ContentValues r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "No external updates"
            r1.<init>(r2)
            throw r1
    }
}
