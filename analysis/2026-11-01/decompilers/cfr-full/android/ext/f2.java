/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.content.SharedPreferences;
import android.ext.e1;
import java.util.Map;
import java.util.Set;

public class f2
implements SharedPreferences {
    final SharedPreferences a;

    private f2(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public static SharedPreferences a(SharedPreferences sharedPreferences) {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (!(sharedPreferences instanceof f2)) {
            sharedPreferences2 = new f2(sharedPreferences);
        }
        return sharedPreferences2;
    }

    public boolean contains(String string2) {
        try {
            boolean bl = this.a.contains(string2);
            return bl;
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            return false;
        }
    }

    public SharedPreferences.Editor edit() {
        return this.a.edit();
    }

    public Map getAll() {
        return this.a.getAll();
    }

    public boolean getBoolean(String string2, boolean bl) {
        try {
            boolean bl2 = this.a.getBoolean(string2, bl);
            return bl2;
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            return bl;
        }
    }

    public float getFloat(String string2, float f4) {
        try {
            float f5 = this.a.getFloat(string2, f4);
            return f5;
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            return f4;
        }
    }

    public int getInt(String string2, int n3) {
        try {
            int n4 = this.a.getInt(string2, n3);
            return n4;
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            return n3;
        }
    }

    public long getLong(String string2, long l3) {
        try {
            long l4 = this.a.getLong(string2, l3);
            return l4;
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            return l3;
        }
    }

    public String getString(String string2, String string3) {
        try {
            string2 = this.a.getString(string2, string3);
            return string2;
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            return string3;
        }
    }

    public Set getStringSet(String object, Set set) {
        try {
            object = this.a.getStringSet((String)object, set);
            return object;
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            return set;
        }
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        try {
            this.a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        try {
            this.a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }
}

