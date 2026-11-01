package android.ext;

import android.content.SharedPreferences;
import java.util.Set;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class g2 implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SharedPreferences.Editor f988a;

    public g2() {
        this.f988a = Tools.M0().edit();
    }

    @Override // android.content.SharedPreferences.Editor
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g2 clear() {
        this.f988a.clear();
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public void apply() {
        this.f988a.apply();
    }

    @Override // android.content.SharedPreferences.Editor
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g2 putBoolean(String str, boolean z) {
        this.f988a.putBoolean(str, z);
        return this;
    }

    public g2 c(String str, boolean z, boolean z2) {
        if (z == z2) {
            this.f988a.remove(str);
        } else {
            this.f988a.putBoolean(str, z);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public boolean commit() {
        return this.f988a.commit();
    }

    @Override // android.content.SharedPreferences.Editor
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public g2 putFloat(String str, float f2) {
        this.f988a.putFloat(str, f2);
        return this;
    }

    public g2 e(String str, float f2, float f3) {
        if (f2 == f3) {
            this.f988a.remove(str);
        } else {
            this.f988a.putFloat(str, f2);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public g2 putInt(String str, int i) {
        this.f988a.putInt(str, i);
        return this;
    }

    public g2 g(String str, int i, int i2) {
        if (i == i2) {
            this.f988a.remove(str);
        } else {
            this.f988a.putInt(str, i);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public g2 putLong(String str, long j) {
        this.f988a.putLong(str, j);
        return this;
    }

    public g2 i(String str, long j, long j2) {
        if (j == j2) {
            this.f988a.remove(str);
        } else {
            this.f988a.putLong(str, j);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public g2 putString(String str, String str2) {
        this.f988a.putString(str, str2);
        return this;
    }

    public g2 k(String str, String str2, String str3) {
        if (str2.equals(str3)) {
            this.f988a.remove(str);
        } else {
            this.f988a.putString(str, str2);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public g2 putStringSet(String str, Set set) {
        this.f988a.putStringSet(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public g2 remove(String str) {
        this.f988a.remove(str);
        return this;
    }

    public g2(SharedPreferences.Editor editor) {
        this.f988a = editor;
    }
}
