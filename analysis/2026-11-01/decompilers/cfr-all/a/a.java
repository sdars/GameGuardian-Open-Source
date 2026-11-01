/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.content.ActivityNotFoundException
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.pm.PackageManager
 *  android.content.res.AssetManager
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.os.PersistableBundle
 *  android.view.View
 */
package a;

import a.b;
import a.d;
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
import android.ext.f;
import android.ext.f2;
import android.ext.n2;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import java.io.File;

public abstract class a
extends Activity {
    private View a = null;
    private AlertDialog b = null;
    private Context c = null;

    private Context b() {
        if (this.c == null) {
            Context context = this.getBaseContext();
            if (context == null) {
                return null;
            }
            this.c = a.b.i(context);
        }
        return this.c;
    }

    private void c() {
        block3: {
            AlertDialog alertDialog = this.b;
            if (alertDialog == null) break block3;
            try {
                alertDialog.dismiss();
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
        }
    }

    public void a() {
        try {
            super.finish();
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    protected void attachBaseContext(Context context) {
        super.attachBaseContext(a.b.i(context));
    }

    public View findViewById(int n3) {
        View view = this.a;
        view = view == null ? super.findViewById(n3) : view.findViewById(n3);
        return view;
    }

    public void finish() {
        this.c();
        this.a();
    }

    public AssetManager getAssets() {
        Context context = this.b();
        context = context == null ? super.getAssets() : context.getAssets();
        return context;
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
        catch (SecurityException securityException) {
            e1.a(securityException);
            return null;
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
        catch (SecurityException securityException) {
            e1.a(securityException);
            return null;
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
        Context context = this.b();
        context = context == null ? super.getResources() : context.getResources();
        return context;
    }

    public SharedPreferences getSharedPreferences(String string2, int n3) {
        return f2.a(super.getSharedPreferences(string2, n3));
    }

    public Object getSystemService(String object) {
        try {
            object = a.f.a(super.getSystemService((String)object));
            return object;
        }
        catch (NullPointerException nullPointerException) {
            e1.a(nullPointerException);
            return null;
        }
    }

    public boolean moveTaskToBack(boolean bl) {
        try {
            this.c();
            bl = super.moveTaskToBack(bl);
            return bl;
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            this.finish();
            return true;
        }
    }

    protected void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        try {
            super.onCreate(bundle, persistableBundle);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    public void onDestroy() {
        this.c();
        try {
            super.onDestroy();
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    public void onLowMemory() {
        e1.d("Activity onLowMemory");
        super.onLowMemory();
        MainService.t0(-1);
    }

    protected void onPause() {
        try {
            super.onPause();
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    protected void onPostCreate(Bundle bundle) {
        try {
            super.onPostCreate(bundle);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    protected void onPostResume() {
        try {
            super.onPostResume();
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    protected void onRestart() {
        try {
            super.onRestart();
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    protected void onResume() {
        try {
            super.onResume();
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    protected void onStart() {
        try {
            super.onStart();
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    protected void onStop() {
        try {
            super.onStop();
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    public void onTrimMemory(int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Activity onTrimMemory: ");
        stringBuilder.append(n3);
        e1.d(stringBuilder.toString());
        super.onTrimMemory(n3);
        MainService.t0(n3);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setContentView(int var1_1) {
        var2_2 = new RuntimeException();
        try {
            super.setContentView(var1_1);
            ** GOTO lbl62
        }
        catch (RuntimeException var4_4) {
            if (var2_2 != var4_4) {
                var3_7 = var2_2;
                e1.l("Failed call super setContentView", var4_4);
            } else {
                var2_2 = var4_4;
            }
            this.getWindow().setContentView(var1_1);
            try {
                this.getActionBar();
            }
            catch (RuntimeException var4_6) {
                if (var2_2 != var4_6) {
                    var3_7 = var2_2;
                    e1.l("Failed call setup action bar", var4_6);
                    ** GOTO lbl62
                } else {
                    var2_2 = var4_6;
                }
                ** GOTO lbl62
                catch (RuntimeException var5_9) {
                    if (var2_2 == var5_9) ** GOTO lbl35
                    var3_7 = var2_2;
                    try {
                        block20: {
                            e1.l("Failed fix call setContentView", var5_9);
                            break block20;
lbl35:
                            // 1 sources

                            var2_2 = var5_9;
                        }
                        var3_7 = var2_2;
                        var4_4.addSuppressed(var5_9);
                        var3_7 = var2_2;
                        throw var4_4;
                    }
                    catch (RuntimeException var2_3) {}
                }
            }
            this.a = var4_5 = d.f(var1_1, null);
            var4_5 = f.c((Context)this).setView(var4_5).setTitle(this.getTitle()).setCancelable(false).create();
            {
                catch (Throwable var3_8) {
                    e1.l("Failed fix call setContentView", var3_8);
                    var2_3.addSuppressed(var3_8);
                    throw var2_3;
                }
            }
            try {
                var5_10 = new DialogInterface.OnCancelListener(this){
                    final a a;
                    {
                        this.a = a4;
                    }

                    public void onCancel(DialogInterface dialogInterface) {
                        this.a.a();
                    }
                };
                var4_5.setOnCancelListener(var5_10);
                var4_5.setCancelable(true);
                ** GOTO lbl59
            }
            catch (Throwable var5_11) {
                e1.a(var5_11);
lbl59:
                // 2 sources

                this.b = var4_5;
                var4_5.show();
                var2_2 = var3_7;
lbl62:
                // 5 sources

                if (e1.n(var2_2).contains(this.getPackageName())) {
                    this.a = null;
                    super.setContentView(var1_1 - 1);
                }
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void startActivity(Intent intent) {
        try {
            super.startActivity(intent);
            return;
        }
        catch (RuntimeException runtimeException) {
            if (!a.b.h(runtimeException, (Context)this, intent)) throw runtimeException;
            return;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            e1.a(activityNotFoundException);
            return;
        }
        catch (SecurityException securityException) {
            String string2;
            if (intent.getAction().equals("android.intent.action.UNINSTALL_PACKAGE")) {
                string2 = "android.intent.action.DELETE";
            } else {
                if (!intent.getAction().equals("android.intent.action.INSTALL_PACKAGE")) throw securityException;
                string2 = "android.intent.action.VIEW";
            }
            intent.setAction(string2);
            this.startActivity(intent);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void startActivityForResult(Intent intent, int n3) {
        try {
            super.startActivityForResult(intent, n3);
            return;
        }
        catch (RuntimeException runtimeException) {
            String string2 = runtimeException.getMessage();
            if (n2.e()) throw runtimeException;
            if (string2 == null) throw runtimeException;
            if (!string2.contains("Looper.prepare()")) throw runtimeException;
            n2.i(new Runnable(this, intent, n3){
                final Intent a;
                final int b;
                final a c;
                {
                    this.c = a4;
                    this.a = intent;
                    this.b = n3;
                }

                @Override
                public void run() {
                    this.c.startActivityForResult(this.a, this.b);
                }
            });
            return;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            e1.a(activityNotFoundException);
            return;
        }
        catch (SecurityException securityException) {
            String string3;
            if (intent.getAction().equals("android.intent.action.UNINSTALL_PACKAGE")) {
                string3 = "android.intent.action.DELETE";
            } else {
                if (!intent.getAction().equals("android.intent.action.INSTALL_PACKAGE")) throw securityException;
                string3 = "android.intent.action.VIEW";
            }
            intent.setAction(string3);
            this.startActivityForResult(intent, n3);
            return;
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
}

