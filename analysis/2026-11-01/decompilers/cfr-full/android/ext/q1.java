/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.app.AlertDialog;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.ext.Config;
import android.ext.Tools;
import android.ext.b2;
import android.ext.e1;
import android.ext.f;
import android.ext.f1;
import android.ext.g0;
import android.ext.n2;
import android.ext.p0;
import android.ext.r;
import android.ext.t2;
import android.ext.z;
import android.net.Uri;
import android.os.Build;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class q1 {
    final Context a = r.n;
    private StringBuilder b = new StringBuilder();
    private int c = -1;
    private Map d;

    public q1() {
        HashMap<String, Integer> hashMap;
        this.d = hashMap = new HashMap<String, Integer>();
        hashMap.put("android.permission.SYSTEM_ALERT_WINDOW", 24);
    }

    private int a() {
        return 0x8000000;
    }

    private int c(int n3) {
        try {
            ApplicationInfo applicationInfo = this.a.getApplicationInfo();
            AppOpsManager appOpsManager = (AppOpsManager)this.a.getSystemService("appops");
            Class<Integer> clazz = Integer.TYPE;
            int n4 = (Integer)AppOpsManager.class.getMethod("checkOp", clazz, clazz, String.class).invoke((Object)appOpsManager, n3, applicationInfo.uid, applicationInfo.packageName);
            return n4;
        }
        catch (Throwable throwable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MIUI-checkOp(");
            stringBuilder.append(n3);
            stringBuilder.append(") failed");
            e1.g(stringBuilder.toString(), throwable);
            StringBuilder stringBuilder2 = this.b;
            stringBuilder = new StringBuilder();
            stringBuilder.append("\nMIUI-checkOp(");
            stringBuilder.append(n3);
            stringBuilder.append(") failed:\n");
            stringBuilder2.append(stringBuilder.toString());
            this.b.append(e1.n(throwable));
            return -1;
        }
    }

    private boolean d(String object) {
        boolean bl;
        block3: {
            block2: {
                block5: {
                    block4: {
                        this.b.append("\nMIUI-checkPermission ");
                        this.b.append((String)object);
                        this.b.append(" - ");
                        object = (Integer)this.d.get(object);
                        bl = true;
                        if (object != null) break block4;
                        this.b.append("unknown - ");
                        break block3;
                    }
                    if ((Integer)object != 24 || this.c != 5) break block5;
                    int n3 = this.a();
                    if ((this.a.getApplicationInfo().flags & n3) != n3) break block2;
                    break block3;
                }
                try {
                    int n4 = this.c((Integer)object);
                    if (n4 != 0) break block2;
                    break block3;
                }
                catch (Throwable throwable) {
                    e1.g("MIUI-checkPermission failed", throwable);
                    this.b.append("failed:\n");
                    this.b.append(e1.n(throwable));
                    this.b.append('\n');
                }
            }
            bl = false;
        }
        this.b.append(bl);
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void e() {
        BufferedReader bufferedReader;
        Object object;
        Object object2;
        block7: {
            try {
                object2 = Tools.I(new String[]{"getprop"});
                object = new InputStreamReader(((Process)object2).getInputStream());
                bufferedReader = new BufferedReader((Reader)object);
                this.b.append("\ngetprop:\n");
                break block7;
            }
            catch (Throwable throwable) {}
            e1.l("MIUI-detect", throwable);
            this.b.append("\nMIUI-detect failed:\n");
            this.b.append(e1.n(throwable));
            return;
        }
        while ((object2 = bufferedReader.readLine()) != null) {
            if (((String)object2).contains("ro.product.device") && ((String)object2).contains("_sprout")) {
                this.c = -1;
                break;
            }
            if (((String)object2).contains("fpc.fp.miui.") || ((String)object2).contains("ro.ril.miui.imei")) continue;
            if (((String)object2).contains("miui") || ((String)object2).contains("MIUI")) {
                object = new StringBuilder();
                ((StringBuilder)object).append("MIUI found: ");
                ((StringBuilder)object).append((String)object2);
                e1.d(((StringBuilder)object).toString());
                this.b.append((String)object2);
                this.b.append('\n');
                if (this.c == -1) {
                    this.c = 0;
                }
            }
            if (!((String)object2).contains("ro.miui.ui.version.name")) continue;
            if (((String)object2).contains("V5")) {
                this.c = 5;
            }
            if (!((String)object2).contains("V6")) continue;
            this.c = 6;
        }
        bufferedReader.close();
    }

    private void f(String object) {
        this.b.append("\nMIUI-fixPermission ");
        this.b.append((String)object);
        this.b.append(" - ");
        object = (Integer)this.d.get(object);
        if (object == null) {
            this.b.append("unknown");
            return;
        }
        if ((Integer)object == 24 && this.c == 5) {
            try {
                Tools.B0().setApplicationEnabledSetting(Tools.C0(), 0x8000000, this.a());
                this.b.append("success 1");
            }
            catch (Throwable throwable) {
                e1.g("MIUI-fixPermission failed", throwable);
                this.b.append("failed 1:\n");
                this.b.append(e1.n(throwable));
                this.b.append('\n');
            }
        }
        try {
            ApplicationInfo applicationInfo = this.a.getApplicationInfo();
            Class<Integer> clazz = Integer.TYPE;
            AppOpsManager.class.getMethod("setMode", clazz, clazz, String.class, clazz).invoke((Object)((AppOpsManager)this.a.getSystemService("appops")), object, applicationInfo.uid, applicationInfo.packageName, 0);
            this.b.append("success 2");
        }
        catch (Throwable throwable) {
            e1.g("MIUI-fixPermission failed", throwable);
            this.b.append("failed 2:\n");
            this.b.append(e1.n(throwable));
            this.b.append('\n');
        }
    }

    private void i() {
        StringBuilder stringBuilder;
        String[] stringArray = this.b.toString();
        this.b = stringBuilder = new StringBuilder();
        stringBuilder.append("MIUI\nGG: ");
        stringBuilder = this.b;
        float f4 = 1.0f;
        stringBuilder.append(117.200005f * f4 - 15.8f);
        this.b.append(" [");
        this.b.append((int)(f4 * 17130.1f - 975.1f + 0.5f));
        this.b.append("]\nAndroid: ");
        this.b.append(Build.VERSION.RELEASE);
        this.b.append("\nSDK: ");
        this.b.append(Build.VERSION.SDK_INT);
        this.b.append("\nappInfo.flags: ");
        stringBuilder = this.b;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("0x");
        stringBuilder2.append(t2.e(8, this.a.getApplicationInfo().flags));
        stringBuilder.append(stringBuilder2.toString());
        this.b.append("\ncheckOp(OP_SYSTEM_ALERT_WINDOW): ");
        this.b.append(this.c(24));
        this.b.append((String)stringArray);
        stringArray = this.b.toString().split("[\\r\\n]+");
        int n3 = stringArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            e1.d(stringArray[i3]);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b() {
        block4: {
            Throwable throwable2;
            block7: {
                Object object;
                AlertDialog.Builder builder;
                block6: {
                    block5: {
                        try {
                            this.e();
                            if (this.c == -1) {
                                return;
                            }
                            if ((Config.c & 2L) != 0L) {
                                return;
                            }
                            if (this.d("android.permission.SYSTEM_ALERT_WINDOW")) break block4;
                            this.f("android.permission.SYSTEM_ALERT_WINDOW");
                            builder = f.c(this.a).setNeutralButton((CharSequence)b2.f(2131296963), f1.w(2L));
                            if (this.d("android.permission.SYSTEM_ALERT_WINDOW")) break block5;
                            z.H(builder);
                            String string2 = b2.f(2131296455);
                            object = new DialogInterface.OnClickListener(this){
                                final q1 a;
                                {
                                    this.a = q12;
                                }

                                public void onClick(DialogInterface dialogInterface, int n3) {
                                    try {
                                        dialogInterface = new Intent("android.intent.action.VIEW", Uri.parse((String)Tools.removeNewLinesChars(this.a.g())));
                                        this.a.a.startActivity((Intent)dialogInterface);
                                    }
                                    catch (Throwable throwable) {
                                        e1.s("Failed call activity", throwable);
                                    }
                                }
                            };
                            builder.setPositiveButton((CharSequence)string2, (DialogInterface.OnClickListener)object);
                            break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    object = builder.setMessage((CharSequence)b2.f(2131296777));
                    String string3 = b2.f(2131296904);
                    p0 p02 = new p0(1200, true);
                    object.setPositiveButton((CharSequence)string3, (DialogInterface.OnClickListener)p02).setNegativeButton((CharSequence)b2.f(2131296805), null);
                }
                object = new Runnable(this, builder){
                    final AlertDialog.Builder a;
                    final q1 b;
                    {
                        this.b = q12;
                        this.a = builder;
                    }

                    @Override
                    public void run() {
                        try {
                            AlertDialog alertDialog = this.a.create();
                            f.w(alertDialog);
                            Tools.u1(alertDialog);
                        }
                        catch (Throwable throwable) {
                            e1.l("Failed show miui dialog", throwable);
                        }
                    }
                };
                n2.i((Runnable)object);
                break block4;
            }
            e1.l("MIUI-check", throwable2);
            this.b.append("\nMIUI-check failed:\n");
            this.b.append(e1.n(throwable2));
        }
        this.i();
    }

    String g() {
        String string2 = this.c != 6 ? "kwws=22zzz1|rxwxeh1frp2zdwfkBy@3[{m:N}:ZmT" : "kwws=22zzz1|rxwxeh1frp2zdwfkBy@k]ifLW:7SV;";
        return string2;
    }

    public void h() {
        new g0(new Runnable(this){
            final q1 a;
            {
                this.a = q12;
            }

            @Override
            public void run() {
                this.a.b();
            }
        }, "runCheck").start();
    }
}

