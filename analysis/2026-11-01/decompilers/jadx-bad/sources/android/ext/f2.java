package android.ext;

import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class f2 implements SharedPreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SharedPreferences f978a;

    private f2(SharedPreferences sharedPreferences) {
        this.f978a = sharedPreferences;
    }

    public static SharedPreferences a(SharedPreferences sharedPreferences) {
        return !(sharedPreferences instanceof f2) ? new f2(sharedPreferences) : sharedPreferences;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        try {
            return this.f978a.contains(str);
        } catch (Throwable th) {
            e1.a(th);
            return false;
        }
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return this.f978a.edit();
    }

    @Override // android.content.SharedPreferences
    public Map getAll() {
        return this.f978a.getAll();
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        try {
            return this.f978a.getBoolean(str, z);
        } catch (Throwable th) {
            e1.a(th);
            return z;
        }
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f2) {
        try {
            return this.f978a.getFloat(str, f2);
        } catch (Throwable th) {
            e1.a(th);
            return f2;
        }
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        try {
            return this.f978a.getInt(str, i);
        } catch (Throwable th) {
            e1.a(th);
            return i;
        }
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        try {
            return this.f978a.getLong(str, j);
        } catch (Throwable th) {
            e1.a(th);
            return j;
        }
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        try {
            return this.f978a.getString(str, str2);
        } catch (Throwable th) {
            e1.a(th);
            return str2;
        }
    }

    @Override // android.content.SharedPreferences
    public Set getStringSet(String str, Set set) {
        try {
            return this.f978a.getStringSet(str, set);
        } catch (Throwable th) {
            e1.a(th);
            return set;
        }
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        try {
            this.f978a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        try {
            this.f978a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        } catch (Throwable th) {
            e1.a(th);
        }
    }
}
