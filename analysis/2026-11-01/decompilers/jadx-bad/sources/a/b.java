package a;

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
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class b extends ContextThemeWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f7c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Configuration f8d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Locale f9e = Locale.getDefault();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Configuration f10a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Resources f11b;

    class a extends b {
        private Object mPackageInfo;

        a(Context context) {
            super(context);
            try {
                Context baseContext = getBaseContext();
                Class<?> cls = Class.forName("android.app.ContextImpl");
                if (cls.isInstance(baseContext)) {
                    Field declaredField = cls.getDeclaredField("mPackageInfo");
                    declaredField.setAccessible(true);
                    this.mPackageInfo = declaredField.get(baseContext);
                    e1.d("WBContext: " + this.mPackageInfo);
                }
            } catch (Throwable th) {
                e1.a(th);
            }
        }
    }

    /* JADX INFO: renamed from: a.b$b, reason: collision with other inner class name */
    class RunnableC0001b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f12a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Intent f13b;

        RunnableC0001b(Context context, Intent intent) {
            this.f12a = context;
            this.f13b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f12a.startActivity(this.f13b);
            } catch (Throwable th) {
                e1.s("Failed startActivity from UI thread: " + this.f13b, th);
            }
        }
    }

    public b(Context context) {
        super(context, 2131361794);
        this.f10a = null;
        this.f11b = null;
    }

    public static void a(Context context) {
        if (context instanceof b) {
            b bVar = (b) context;
            try {
                LayoutInflater.from(bVar);
            } catch (AssertionError e2) {
                try {
                    LayoutInflater.from(bVar.getBaseContext());
                    e1.l("Failed use fix for LayoutInflater", e2);
                    f7c = false;
                } catch (AssertionError e3) {
                    e1.l("Can not get LayoutInflater", e3);
                }
            }
            e1.i("Check LayoutInflater - ok");
        }
    }

    private boolean b(Intent intent) {
        String[] strArr = {"am", "start", intent.toUri(5)};
        e1.p("Try exec intent: " + intent + "; " + Arrays.toString(strArr));
        try {
            Process processI = Tools.I(strArr);
            processI.getInputStream().close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processI.getErrorStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append('\n');
            }
            bufferedReader.close();
            if (sb.length() <= 0) {
                return true;
            }
            e1.p("Failed exec intent: " + intent + "; " + Arrays.toString(strArr) + ":\n" + sb.toString());
            return false;
        } catch (Throwable th) {
            e1.s("Failed exec intent: " + intent + "; " + Arrays.toString(strArr), th);
            return false;
        }
    }

    public static Configuration c(Configuration configuration) {
        ConfigListAdapter.q(configuration, f9e);
        return new Configuration(configuration);
    }

    public static b d(Context context) {
        try {
            Class.forName("com.wobian.wv.wb.WBContext");
            return new a(context);
        } catch (Throwable unused) {
            return new b(context);
        }
    }

    public static boolean e() {
        return f7c;
    }

    public static Configuration f(Configuration configuration) {
        Configuration configurationC = c(configuration);
        g(configurationC, null);
        return configurationC;
    }

    public static void g(Configuration configuration, Locale locale) {
        if (locale != null) {
            f9e = locale;
        }
        if (configuration == null) {
            configuration = f8d;
        }
        if (configuration == null) {
            configuration = Tools.f0().getResources().getConfiguration();
        }
        Configuration configurationC = c(configuration);
        if (configurationC.equals(f8d)) {
            return;
        }
        f8d = configurationC;
    }

    public static boolean h(Throwable th, Context context, Intent intent) {
        String message = th.getMessage();
        if (n2.e() || message == null || !message.contains("Looper.prepare()")) {
            return false;
        }
        n2.i(new RunnableC0001b(context, intent));
        return true;
    }

    public static Context i(Context context) {
        return (context == null || (context instanceof b)) ? context : d(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public boolean bindService(Intent intent, ServiceConnection serviceConnection, int i) {
        try {
            return super.bindService(intent, serviceConnection, i);
        } catch (IllegalArgumentException e2) {
            e1.a(e2);
            return false;
        }
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public File getCacheDir() {
        try {
            return super.getCacheDir();
        } catch (NullPointerException e2) {
            e1.a(e2);
            return Tools.b0();
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public File getExternalCacheDir() {
        try {
            return super.getExternalCacheDir();
        } catch (ArrayIndexOutOfBoundsException e2) {
            e1.a(e2);
            return null;
        } catch (NullPointerException e3) {
            e1.a(e3);
            return null;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public File getExternalFilesDir(String str) {
        try {
            return super.getExternalFilesDir(str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            e1.a(e2);
            return null;
        } catch (NullPointerException e3) {
            e1.a(e3);
            return null;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public File getFilesDir() {
        try {
            return super.getFilesDir();
        } catch (NullPointerException e2) {
            e1.a(e2);
            return Tools.p0();
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public PackageManager getPackageManager() {
        try {
            return super.getPackageManager();
        } catch (NullPointerException e2) {
            e1.a(e2);
            return Tools.B0();
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public String getPackageName() {
        try {
            return super.getPackageName();
        } catch (NullPointerException e2) {
            e1.a(e2);
            return Tools.C0();
        }
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Configuration configuration = f8d;
        Configuration configuration2 = this.f10a;
        Resources resources = this.f11b;
        Resources resources2 = null;
        Context contextCreateConfigurationContext = null;
        resources2 = null;
        if (configuration2 != configuration || (resources != null && !resources.getConfiguration().equals(configuration2))) {
            this.f10a = configuration;
            Resources resources3 = super.getResources();
            if (configuration != null) {
                try {
                    resources3.updateConfiguration(configuration, null);
                    if (resources != null && resources != resources3) {
                        resources.updateConfiguration(configuration, null);
                    }
                } catch (Throwable th) {
                    e1.l("Failed set locale", th);
                }
                try {
                    contextCreateConfigurationContext = createConfigurationContext(configuration);
                } catch (Throwable th2) {
                    e1.a(th2);
                }
                resources = contextCreateConfigurationContext == null ? resources3 : contextCreateConfigurationContext.getResources();
                resources2 = resources3;
            } else {
                resources = resources3;
                resources2 = resources;
            }
        }
        if (resources == null) {
            resources = resources2 == null ? super.getResources() : resources2;
        }
        this.f11b = resources;
        return resources;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public SharedPreferences getSharedPreferences(String str, int i) {
        return f2.a(super.getSharedPreferences(str, i));
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        return f.a(super.getSystemService(str));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        try {
            super.startActivity(intent);
        } catch (Throwable th) {
            if ((intent == null || !"android.intent.action.WEB_SEARCH".equals(intent.getAction())) && !h(th, this, intent) && !b(intent)) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public boolean startInstrumentation(ComponentName componentName, String str, Bundle bundle) {
        try {
            return super.startInstrumentation(componentName, str, bundle);
        } catch (Throwable th) {
            e1.a(th);
            return false;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        try {
            super.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException e2) {
            e1.a(e2);
        }
    }
}
