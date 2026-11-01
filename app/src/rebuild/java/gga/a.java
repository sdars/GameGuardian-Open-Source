package gga;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.e1;
import android.ext.f2;
import android.ext.n2;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f0a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AlertDialog f1b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f2c = null;

    /* JADX INFO: renamed from: gga.a$a, reason: collision with other inner class name */
    class RunnableC0000a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f3a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f4b;

        RunnableC0000a(Intent intent, int i) {
            this.f3a = intent;
            this.f4b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            gga.this.startActivityForResult(this.f3a, this.f4b);
        }
    }

    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            gga.this.a();
        }
    }

    private Context b() {
        if (this.f2c == null) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                return null;
            }
            this.f2c = gga.b.i(baseContext);
        }
        return this.f2c;
    }

    private void c() {
        try {
            AlertDialog alertDialog = this.f1b;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    public void a() {
        try {
            super.finish();
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(gga.b.i(context));
    }

    @Override // android.app.Activity
    public View findViewById(int i) {
        View view = this.f0a;
        return view == null ? super.findViewById(i) : view.findViewById(i);
    }

    @Override // android.app.Activity
    public void finish() {
        c();
        a();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        Context contextB = b();
        return contextB == null ? super.getAssets() : contextB.getAssets();
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
        } catch (SecurityException e4) {
            e1.a(e4);
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
        } catch (SecurityException e4) {
            e1.a(e4);
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
        Context contextB = b();
        return contextB == null ? super.getResources() : contextB.getResources();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public SharedPreferences getSharedPreferences(String str, int i) {
        return f2.a(super.getSharedPreferences(str, i));
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        try {
            return ggf.a(super.getSystemService(str));
        } catch (NullPointerException e2) {
            e1.a(e2);
            return null;
        }
    }

    @Override // android.app.Activity
    public boolean moveTaskToBack(boolean z) {
        try {
            c();
            return super.moveTaskToBack(z);
        } catch (Throwable th) {
            e1.a(th);
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        c();
        try {
            super.onDestroy();
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        e1.d("Activity onLowMemory");
        super.onLowMemory();
        MainService.t0(-1);
    }

    @Override // android.app.Activity
    protected void onPause() {
        try {
            super.onPause();
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        try {
            super.onPostCreate(bundle);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        try {
            super.onPostResume();
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.app.Activity
    protected void onRestart() {
        try {
            super.onRestart();
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        try {
            super.onResume();
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        try {
            super.onStart();
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        try {
            super.onStop();
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        e1.d("Activity onTrimMemory: " + i);
        super.onTrimMemory(i);
        MainService.t0(i);
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        RuntimeException runtimeException = new RuntimeException();
        try {
            super.setContentView(i);
        } catch (RuntimeException e2) {
            if (runtimeException != e2) {
                try {
                    e1.l("Failed call super setContentView", e2);
                } catch (RuntimeException e3) {
                    try {
                        View viewF = ggd.f(i, null);
                        this.f0a = viewF;
                        AlertDialog alertDialogCreate = android.ext.f.c(this).setView(viewF).setTitle(getTitle()).setCancelable(false).create();
                        try {
                            alertDialogCreate.setOnCancelListener(new b());
                            alertDialogCreate.setCancelable(true);
                        } catch (Throwable th) {
                            e1.a(th);
                        }
                        this.f1b = alertDialogCreate;
                        alertDialogCreate.show();
                    } catch (Throwable th2) {
                        e1.l("Failed fix call setContentView", th2);
                        e3.addSuppressed(th2);
                        throw e3;
                    }
                }
            } else {
                runtimeException = e2;
            }
            try {
                getWindow().setContentView(i);
                try {
                    getActionBar();
                } catch (RuntimeException e4) {
                    if (runtimeException != e4) {
                        e1.l("Failed call setup action bar", e4);
                    } else {
                        runtimeException = e4;
                    }
                }
            } catch (RuntimeException e5) {
                if (runtimeException != e5) {
                    e1.l("Failed fix call setContentView", e5);
                }
                e2.addSuppressed(e5);
                throw e2;
            }
        }
        if (e1.n(runtimeException).contains(getPackageName())) {
            this.f0a = null;
            super.setContentView(i - 1);
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        String str;
        try {
            super.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            e1.a(e2);
        } catch (SecurityException e3) {
            if (intent.getAction().equals("android.intent.action.UNINSTALL_PACKAGE")) {
                str = "android.intent.action.DELETE";
            } else {
                if (!intent.getAction().equals("android.intent.action.INSTALL_PACKAGE")) {
                    throw e3;
                }
                str = "android.intent.action.VIEW";
            }
            intent.setAction(str);
            startActivity(intent);
        } catch (RuntimeException e4) {
            if (!gga.b.h(e4, this, intent)) {
                throw e4;
            }
        }
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        String str;
        try {
            super.startActivityForResult(intent, i);
        } catch (ActivityNotFoundException e2) {
            e1.a(e2);
        } catch (SecurityException e3) {
            if (intent.getAction().equals("android.intent.action.UNINSTALL_PACKAGE")) {
                str = "android.intent.action.DELETE";
            } else {
                if (!intent.getAction().equals("android.intent.action.INSTALL_PACKAGE")) {
                    throw e3;
                }
                str = "android.intent.action.VIEW";
            }
            intent.setAction(str);
            startActivityForResult(intent, i);
        } catch (RuntimeException e4) {
            String message = e4.getMessage();
            if (n2.e() || message == null || !message.contains("Looper.prepare()")) {
                throw e4;
            }
            n2.i(new RunnableC0000a(intent, i));
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

    @Override // android.app.Activity
    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        try {
            super.onCreate(bundle, persistableBundle);
        } catch (Throwable th) {
            e1.a(th);
        }
    }
}
