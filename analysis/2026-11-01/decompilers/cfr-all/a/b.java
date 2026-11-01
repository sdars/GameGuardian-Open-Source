/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.content.SharedPreferences
 *  android.content.pm.PackageManager
 *  android.content.res.AssetManager
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.view.ContextThemeWrapper
 *  android.view.LayoutInflater
 */
package a;

import a.f;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.ext.ConfigListAdapter;
import android.ext.Tools;
import android.ext.e1;
import android.ext.f2;
import android.ext.n2;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Locale;

public class b
extends ContextThemeWrapper {
    private static volatile boolean c = true;
    private static Configuration d;
    private static Locale e;
    private Configuration a = null;
    private Resources b = null;

    static {
        e = Locale.getDefault();
    }

    public b(Context context) {
        super(context, 2131361794);
    }

    public static void a(Context context) {
        if (context instanceof b) {
            b b4 = (b)context;
            try {
                LayoutInflater.from((Context)b4);
            }
            catch (AssertionError assertionError) {
                try {
                    LayoutInflater.from((Context)b4.getBaseContext());
                    e1.l("Failed use fix for LayoutInflater", (Throwable)((Object)assertionError));
                    c = false;
                }
                catch (AssertionError assertionError2) {
                    e1.l("Can not get LayoutInflater", (Throwable)((Object)assertionError2));
                }
            }
            e1.i("Check LayoutInflater - ok");
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean b(Intent intent) {
        Throwable throwable2;
        Object[] objectArray;
        Object object;
        block4: {
            Object object2;
            object = intent.toUri(5);
            objectArray = new String[]{"am", "start", object};
            object = new StringBuilder();
            ((StringBuilder)object).append("Try exec intent: ");
            ((StringBuilder)object).append(intent);
            ((StringBuilder)object).append("; ");
            ((StringBuilder)object).append(Arrays.toString(objectArray));
            e1.p(((StringBuilder)object).toString());
            try {
                Object object3 = Tools.I((String[])objectArray);
                ((Process)object3).getInputStream().close();
                object2 = new InputStreamReader(((Process)object3).getErrorStream());
                object = new BufferedReader((Reader)object2);
                object2 = new StringBuilder();
                while ((object3 = ((BufferedReader)object).readLine()) != null) {
                    ((StringBuilder)object2).append((String)object3);
                    ((StringBuilder)object2).append('\n');
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            ((BufferedReader)object).close();
            if (((StringBuilder)object2).length() > 0) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Failed exec intent: ");
                ((StringBuilder)object).append(intent);
                ((StringBuilder)object).append("; ");
                ((StringBuilder)object).append(Arrays.toString(objectArray));
                ((StringBuilder)object).append(":\n");
                ((StringBuilder)object).append(((StringBuilder)object2).toString());
                e1.p(((StringBuilder)object).toString());
                return false;
            }
            return true;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Failed exec intent: ");
        ((StringBuilder)object).append(intent);
        ((StringBuilder)object).append("; ");
        ((StringBuilder)object).append(Arrays.toString(objectArray));
        e1.s(((StringBuilder)object).toString(), throwable2);
        return false;
    }

    public static Configuration c(Configuration configuration) {
        ConfigListAdapter.q(configuration, e);
        return new Configuration(configuration);
    }

    public static b d(Context context) {
        try {
            Class.forName("com.wobian.wv.wb.WBContext");
            b b4 = new b(context){
                private Object mPackageInfo;
                {
                    try {
                        object = this.getBaseContext();
                        AnnotatedElement annotatedElement = Class.forName("android.app.ContextImpl");
                        if (((Class)annotatedElement).isInstance(object)) {
                            annotatedElement = ((Class)annotatedElement).getDeclaredField("mPackageInfo");
                            ((AccessibleObject)annotatedElement).setAccessible(true);
                            this.mPackageInfo = ((Field)annotatedElement).get(object);
                            ((StringBuilder)object).append("WBContext: ");
                            ((StringBuilder)object).append(this.mPackageInfo);
                            e1.d(((StringBuilder)object).toString());
                        }
                    }
                    catch (Throwable throwable) {
                        e1.a(throwable);
                    }
                }
            };
            return b4;
        }
        catch (Throwable throwable) {
            return new b(context);
        }
    }

    public static boolean e() {
        return c;
    }

    public static Configuration f(Configuration configuration) {
        configuration = a.b.c(configuration);
        a.b.g(configuration, null);
        return configuration;
    }

    public static void g(Configuration object, Locale locale) {
        if (locale != null) {
            e = locale;
        }
        locale = object;
        if (object == null) {
            locale = d;
        }
        object = locale;
        if (locale == null) {
            object = Tools.f0().getResources().getConfiguration();
        }
        if (!(object = a.b.c(object)).equals(d)) {
            d = object;
        }
    }

    public static boolean h(Throwable object, Context context, Intent intent) {
        object = ((Throwable)object).getMessage();
        if (!n2.e() && object != null && ((String)object).contains("Looper.prepare()")) {
            n2.i(new Runnable(context, intent){
                final Context a;
                final Intent b;
                {
                    this.a = context;
                    this.b = intent;
                }

                @Override
                public void run() {
                    try {
                        this.a.startActivity(this.b);
                    }
                    catch (Throwable throwable) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Failed startActivity from UI thread: ");
                        stringBuilder.append(this.b);
                        e1.s(stringBuilder.toString(), throwable);
                    }
                }
            });
            return true;
        }
        return false;
    }

    public static Context i(Context context) {
        Object object = context;
        if (context != null) {
            object = context;
            if (!(context instanceof b)) {
                object = a.b.d(context);
            }
        }
        return object;
    }

    public boolean bindService(Intent intent, ServiceConnection serviceConnection, int n3) {
        boolean bl;
        try {
            bl = super.bindService(intent, serviceConnection, n3);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            e1.a(illegalArgumentException);
            bl = false;
        }
        return bl;
    }

    public AssetManager getAssets() {
        return this.getResources().getAssets();
    }

    public File getCacheDir() {
        try {
            File file = super.getCacheDir();
            return file;
        }
        catch (NullPointerException nullPointerException) {
            e1.a(nullPointerException);
            return Tools.b0();
        }
    }

    public File getExternalCacheDir() {
        try {
            File file = super.getExternalCacheDir();
            return file;
        }
        catch (NullPointerException nullPointerException) {
            e1.a(nullPointerException);
            return null;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            e1.a(arrayIndexOutOfBoundsException);
            return null;
        }
    }

    public File getExternalFilesDir(String object) {
        try {
            object = super.getExternalFilesDir((String)object);
            return object;
        }
        catch (NullPointerException nullPointerException) {
            e1.a(nullPointerException);
            return null;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            e1.a(arrayIndexOutOfBoundsException);
            return null;
        }
    }

    public File getFilesDir() {
        try {
            File file = super.getFilesDir();
            return file;
        }
        catch (NullPointerException nullPointerException) {
            e1.a(nullPointerException);
            return Tools.p0();
        }
    }

    public PackageManager getPackageManager() {
        try {
            PackageManager packageManager = super.getPackageManager();
            return packageManager;
        }
        catch (NullPointerException nullPointerException) {
            e1.a(nullPointerException);
            return Tools.B0();
        }
    }

    public String getPackageName() {
        try {
            String string2 = super.getPackageName();
            return string2;
        }
        catch (NullPointerException nullPointerException) {
            e1.a(nullPointerException);
            return Tools.C0();
        }
    }

    public Resources getResources() {
        Resources resources;
        Resources resources2;
        Resources resources3;
        block12: {
            Resources resources4;
            Configuration configuration;
            block11: {
                configuration = d;
                Configuration configuration2 = this.a;
                resources4 = this.b;
                Resources resources5 = null;
                resources3 = null;
                if (configuration2 != configuration) break block11;
                resources2 = resources4;
                resources = resources5;
                if (resources4 == null) break block12;
                resources2 = resources4;
                resources = resources5;
                if (resources4.getConfiguration().equals(configuration2)) break block12;
            }
            this.a = configuration;
            resources2 = super.getResources();
            if (configuration != null) {
                block10: {
                    resources2.updateConfiguration(configuration, null);
                    if (resources4 == null || resources4 == resources2) break block10;
                    try {
                        resources4.updateConfiguration(configuration, null);
                    }
                    catch (Throwable throwable) {
                        e1.l("Failed set locale", throwable);
                    }
                }
                try {
                    resources = this.createConfigurationContext(configuration);
                }
                catch (Throwable throwable) {
                    e1.a(throwable);
                    resources = resources3;
                }
                resources = resources == null ? resources2 : resources.getResources();
                resources3 = resources2;
                resources2 = resources;
                resources = resources3;
            } else {
                resources = resources2;
            }
        }
        resources3 = resources2;
        if (resources2 == null) {
            resources3 = resources == null ? super.getResources() : resources;
        }
        this.b = resources3;
        return resources3;
    }

    public SharedPreferences getSharedPreferences(String string2, int n3) {
        return f2.a(super.getSharedPreferences(string2, n3));
    }

    public Object getSystemService(String string2) {
        return f.a(super.getSystemService(string2));
    }

    public void startActivity(Intent intent) {
        block3: {
            try {
                super.startActivity(intent);
            }
            catch (Throwable throwable) {
                if (intent != null && "android.intent.action.WEB_SEARCH".equals(intent.getAction())) {
                    return;
                }
                if (a.b.h(throwable, (Context)this, intent) || this.b(intent)) break block3;
                throw throwable;
            }
        }
    }

    public boolean startInstrumentation(ComponentName componentName, String string2, Bundle bundle) {
        try {
            boolean bl = super.startInstrumentation(componentName, string2, bundle);
            return bl;
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            return false;
        }
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        try {
            super.unregisterReceiver(broadcastReceiver);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            e1.a(illegalArgumentException);
        }
    }
}

