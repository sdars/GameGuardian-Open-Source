package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class g2 implements android.content.SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final android.content.SharedPreferences.Editor f988a;

    public g2() {
            r1 = this;
            r1.<init>()
            android.content.SharedPreferences r0 = android.ext.Tools.M0()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r1.f988a = r0
            return
    }

    public g2(android.content.SharedPreferences.Editor r1) {
            r0 = this;
            r0.<init>()
            r0.f988a = r1
            return
    }

    public android.ext.g2 a() {
            r1 = this;
            android.content.SharedPreferences$Editor r0 = r1.f988a
            r0.clear()
            return r1
    }

    @Override // android.content.SharedPreferences.Editor
    public void apply() {
            r1 = this;
            android.content.SharedPreferences$Editor r0 = r1.f988a
            r0.apply()
            return
    }

    public android.ext.g2 b(java.lang.String r2, boolean r3) {
            r1 = this;
            android.content.SharedPreferences$Editor r0 = r1.f988a
            r0.putBoolean(r2, r3)
            return r1
    }

    public android.ext.g2 c(java.lang.String r1, boolean r2, boolean r3) {
            r0 = this;
            if (r2 != r3) goto L8
            android.content.SharedPreferences$Editor r2 = r0.f988a
            r2.remove(r1)
            goto Ld
        L8:
            android.content.SharedPreferences$Editor r3 = r0.f988a
            r3.putBoolean(r1, r2)
        Ld:
            return r0
    }

    @Override // android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ android.content.SharedPreferences.Editor clear() {
            r1 = this;
            android.ext.g2 r0 = r1.a()
            return r0
    }

    @Override // android.content.SharedPreferences.Editor
    public boolean commit() {
            r1 = this;
            android.content.SharedPreferences$Editor r0 = r1.f988a
            boolean r0 = r0.commit()
            return r0
    }

    public android.ext.g2 d(java.lang.String r2, float r3) {
            r1 = this;
            android.content.SharedPreferences$Editor r0 = r1.f988a
            r0.putFloat(r2, r3)
            return r1
    }

    public android.ext.g2 e(java.lang.String r1, float r2, float r3) {
            r0 = this;
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 != 0) goto La
            android.content.SharedPreferences$Editor r2 = r0.f988a
            r2.remove(r1)
            goto Lf
        La:
            android.content.SharedPreferences$Editor r3 = r0.f988a
            r3.putFloat(r1, r2)
        Lf:
            return r0
    }

    public android.ext.g2 f(java.lang.String r2, int r3) {
            r1 = this;
            android.content.SharedPreferences$Editor r0 = r1.f988a
            r0.putInt(r2, r3)
            return r1
    }

    public android.ext.g2 g(java.lang.String r1, int r2, int r3) {
            r0 = this;
            if (r2 != r3) goto L8
            android.content.SharedPreferences$Editor r2 = r0.f988a
            r2.remove(r1)
            goto Ld
        L8:
            android.content.SharedPreferences$Editor r3 = r0.f988a
            r3.putInt(r1, r2)
        Ld:
            return r0
    }

    public android.ext.g2 h(java.lang.String r2, long r3) {
            r1 = this;
            android.content.SharedPreferences$Editor r0 = r1.f988a
            r0.putLong(r2, r3)
            return r1
    }

    public android.ext.g2 i(java.lang.String r2, long r3, long r5) {
            r1 = this;
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto La
            android.content.SharedPreferences$Editor r3 = r1.f988a
            r3.remove(r2)
            goto Lf
        La:
            android.content.SharedPreferences$Editor r5 = r1.f988a
            r5.putLong(r2, r3)
        Lf:
            return r1
    }

    public android.ext.g2 j(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.content.SharedPreferences$Editor r0 = r1.f988a
            r0.putString(r2, r3)
            return r1
    }

    public android.ext.g2 k(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto Lc
            android.content.SharedPreferences$Editor r2 = r0.f988a
            r2.remove(r1)
            goto L11
        Lc:
            android.content.SharedPreferences$Editor r3 = r0.f988a
            r3.putString(r1, r2)
        L11:
            return r0
    }

    public android.ext.g2 l(java.lang.String r2, java.util.Set r3) {
            r1 = this;
            android.content.SharedPreferences$Editor r0 = r1.f988a
            r0.putStringSet(r2, r3)
            return r1
    }

    public android.ext.g2 m(java.lang.String r2) {
            r1 = this;
            android.content.SharedPreferences$Editor r0 = r1.f988a
            r0.remove(r2)
            return r1
    }

    @Override // android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ android.content.SharedPreferences.Editor putBoolean(java.lang.String r1, boolean r2) {
            r0 = this;
            android.ext.g2 r1 = r0.b(r1, r2)
            return r1
    }

    @Override // android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ android.content.SharedPreferences.Editor putFloat(java.lang.String r1, float r2) {
            r0 = this;
            android.ext.g2 r1 = r0.d(r1, r2)
            return r1
    }

    @Override // android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ android.content.SharedPreferences.Editor putInt(java.lang.String r1, int r2) {
            r0 = this;
            android.ext.g2 r1 = r0.f(r1, r2)
            return r1
    }

    @Override // android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ android.content.SharedPreferences.Editor putLong(java.lang.String r1, long r2) {
            r0 = this;
            android.ext.g2 r1 = r0.h(r1, r2)
            return r1
    }

    @Override // android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ android.content.SharedPreferences.Editor putString(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            android.ext.g2 r1 = r0.j(r1, r2)
            return r1
    }

    @Override // android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ android.content.SharedPreferences.Editor putStringSet(java.lang.String r1, java.util.Set r2) {
            r0 = this;
            android.ext.g2 r1 = r0.l(r1, r2)
            return r1
    }

    @Override // android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ android.content.SharedPreferences.Editor remove(java.lang.String r1) {
            r0 = this;
            android.ext.g2 r1 = r0.m(r1)
            return r1
    }
}
