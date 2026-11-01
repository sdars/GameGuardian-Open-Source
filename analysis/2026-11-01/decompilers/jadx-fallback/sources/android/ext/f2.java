package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class f2 implements android.content.SharedPreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final android.content.SharedPreferences f978a;

    private f2(android.content.SharedPreferences r1) {
            r0 = this;
            r0.<init>()
            r0.f978a = r1
            return
    }

    public static android.content.SharedPreferences a(android.content.SharedPreferences r1) {
            boolean r0 = r1 instanceof android.ext.f2
            if (r0 != 0) goto La
            android.ext.f2 r0 = new android.ext.f2
            r0.<init>(r1)
            r1 = r0
        La:
            return r1
    }

    @Override // android.content.SharedPreferences
    public boolean contains(java.lang.String r2) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.f978a     // Catch: java.lang.Throwable -> L7
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = move-exception
            android.ext.e1.a(r2)
            r2 = 0
            return r2
    }

    @Override // android.content.SharedPreferences
    public android.content.SharedPreferences.Editor edit() {
            r1 = this;
            android.content.SharedPreferences r0 = r1.f978a
            android.content.SharedPreferences$Editor r0 = r0.edit()
            return r0
    }

    @Override // android.content.SharedPreferences
    public java.util.Map getAll() {
            r1 = this;
            android.content.SharedPreferences r0 = r1.f978a
            java.util.Map r0 = r0.getAll()
            return r0
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(java.lang.String r2, boolean r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.f978a     // Catch: java.lang.Throwable -> L7
            boolean r2 = r0.getBoolean(r2, r3)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = move-exception
            android.ext.e1.a(r2)
            return r3
    }

    @Override // android.content.SharedPreferences
    public float getFloat(java.lang.String r2, float r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.f978a     // Catch: java.lang.Throwable -> L7
            float r2 = r0.getFloat(r2, r3)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = move-exception
            android.ext.e1.a(r2)
            return r3
    }

    @Override // android.content.SharedPreferences
    public int getInt(java.lang.String r2, int r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.f978a     // Catch: java.lang.Throwable -> L7
            int r2 = r0.getInt(r2, r3)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = move-exception
            android.ext.e1.a(r2)
            return r3
    }

    @Override // android.content.SharedPreferences
    public long getLong(java.lang.String r2, long r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.f978a     // Catch: java.lang.Throwable -> L7
            long r2 = r0.getLong(r2, r3)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = move-exception
            android.ext.e1.a(r2)
            return r3
    }

    @Override // android.content.SharedPreferences
    public java.lang.String getString(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.f978a     // Catch: java.lang.Throwable -> L7
            java.lang.String r2 = r0.getString(r2, r3)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = move-exception
            android.ext.e1.a(r2)
            return r3
    }

    @Override // android.content.SharedPreferences
    public java.util.Set getStringSet(java.lang.String r2, java.util.Set r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.f978a     // Catch: java.lang.Throwable -> L7
            java.util.Set r2 = r0.getStringSet(r2, r3)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = move-exception
            android.ext.e1.a(r2)
            return r3
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener r2) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.f978a     // Catch: java.lang.Throwable -> L6
            r0.registerOnSharedPreferenceChangeListener(r2)     // Catch: java.lang.Throwable -> L6
            goto La
        L6:
            r2 = move-exception
            android.ext.e1.a(r2)
        La:
            return
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener r2) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.f978a     // Catch: java.lang.Throwable -> L6
            r0.unregisterOnSharedPreferenceChangeListener(r2)     // Catch: java.lang.Throwable -> L6
            goto La
        L6:
            r2 = move-exception
            android.ext.e1.a(r2)
        La:
            return
    }
}
