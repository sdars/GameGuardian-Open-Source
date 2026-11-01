package android.ext;

import android.app.AlertDialog;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import catch_.me_.if_.you_.can_.R;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f1198a = r.n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private StringBuilder f1199b = new StringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1200c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f1201d;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q1.this.b();
        }
    }

    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                q1.this.f1198a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(Tools.removeNewLinesChars(q1.this.g()))));
            } catch (Throwable th) {
                e1.s("Failed call activity", th);
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AlertDialog.Builder f1204a;

        c(AlertDialog.Builder builder) {
            this.f1204a = builder;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AlertDialog alertDialogCreate = this.f1204a.create();
                ggf.w(alertDialogCreate);
                Tools.u1(alertDialogCreate);
            } catch (Throwable th) {
                e1.l("Failed show miui dialog", th);
            }
        }
    }

    public q1() {
        HashMap map = new HashMap();
        this.f1201d = map;
        map.put("android.permission.SYSTEM_ALERT_WINDOW", 24);
    }

    private int a() {
        return 134217728;
    }

    private int c(int i) {
        try {
            ApplicationInfo applicationInfo = this.f1198a.getApplicationInfo();
            AppOpsManager appOpsManager = (AppOpsManager) this.f1198a.getSystemService("appops");
            Class cls = Integer.TYPE;
            return ((Integer) AppOpsManager.class.getMethod("checkOp", cls, cls, String.class).invoke(appOpsManager, Integer.valueOf(i), Integer.valueOf(applicationInfo.uid), applicationInfo.packageName)).intValue();
        } catch (Throwable th) {
            e1.g("MIUI-checkOp(" + i + ") failed", th);
            this.f1199b.append("\nMIUI-checkOp(" + i + ") failed:\n");
            this.f1199b.append(e1.n(th));
            return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006c  */
    private boolean d(String str) {
        this.f1199b.append("\nMIUI-checkPermission ");
        this.f1199b.append(str);
        this.f1199b.append(" - ");
        Integer num = (Integer) this.f1201d.get(str);
        boolean z = true;
        if (num == null) {
            this.f1199b.append("unknown - ");
        } else if (num.intValue() == 24 && this.f1200c == 5) {
            int iA = a();
            if ((this.f1198a.getApplicationInfo().flags & iA) != iA) {
                z = false;
            }
        } else {
            try {
                if (c(num.intValue()) != 0) {
                    z = false;
                }
            } catch (Throwable th) {
                e1.g("MIUI-checkPermission failed", th);
                this.f1199b.append("failed:\n");
                this.f1199b.append(e1.n(th));
                this.f1199b.append('\n');
            }
        }
        this.f1199b.append(z);
        return z;
    }

    private void e() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Tools.I(new String[]{"getprop"}).getInputStream()));
            this.f1199b.append("\ngetprop:\n");
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    if (line.contains("ro.product.device") && line.contains("_sprout")) {
                        this.f1200c = -1;
                        break;
                    }
                    if (!line.contains("fpc.fp.miui.") && !line.contains("ro.ril.miui.imei")) {
                        if (line.contains("miui") || line.contains("MIUI")) {
                            e1.d("MIUI found: " + line);
                            this.f1199b.append(line);
                            this.f1199b.append('\n');
                            if (this.f1200c == -1) {
                                this.f1200c = 0;
                            }
                        }
                        if (line.contains("ro.miui.ui.version.name")) {
                            if (line.contains("V5")) {
                                this.f1200c = 5;
                            }
                            if (line.contains("V6")) {
                                this.f1200c = 6;
                            }
                        }
                    }
                } else {
                    break;
                }
            }
            bufferedReader.close();
        } catch (Throwable th) {
            e1.l("MIUI-detect", th);
            this.f1199b.append("\nMIUI-detect failed:\n");
            this.f1199b.append(e1.n(th));
        }
    }

    private void f(String str) {
        this.f1199b.append("\nMIUI-fixPermission ");
        this.f1199b.append(str);
        this.f1199b.append(" - ");
        Integer num = (Integer) this.f1201d.get(str);
        if (num == null) {
            this.f1199b.append("unknown");
            return;
        }
        if (num.intValue() == 24 && this.f1200c == 5) {
            try {
                Tools.B0().setApplicationEnabledSetting(Tools.C0(), 134217728, a());
                this.f1199b.append("success 1");
            } catch (Throwable th) {
                e1.g("MIUI-fixPermission failed", th);
                this.f1199b.append("failed 1:\n");
                this.f1199b.append(e1.n(th));
                this.f1199b.append('\n');
            }
        }
        try {
            ApplicationInfo applicationInfo = this.f1198a.getApplicationInfo();
            Class cls = Integer.TYPE;
            AppOpsManager.class.getMethod("setMode", cls, cls, String.class, cls).invoke((AppOpsManager) this.f1198a.getSystemService("appops"), num, Integer.valueOf(applicationInfo.uid), applicationInfo.packageName, 0);
            this.f1199b.append("success 2");
        } catch (Throwable th2) {
            e1.g("MIUI-fixPermission failed", th2);
            this.f1199b.append("failed 2:\n");
            this.f1199b.append(e1.n(th2));
            this.f1199b.append('\n');
        }
    }

    private void i() {
        String string = this.f1199b.toString();
        StringBuilder sb = new StringBuilder();
        this.f1199b = sb;
        sb.append("MIUI\nGG: ");
        float f2 = 1;
        this.f1199b.append((117.200005f * f2) - 15.8f);
        this.f1199b.append(" [");
        this.f1199b.append((int) (((f2 * 17130.1f) - 975.1f) + 0.5f));
        this.f1199b.append("]\nAndroid: ");
        this.f1199b.append(Build.VERSION.RELEASE);
        this.f1199b.append("\nSDK: ");
        this.f1199b.append(Build.VERSION.SDK_INT);
        this.f1199b.append("\nappInfo.flags: ");
        this.f1199b.append("0x" + t2.e(8, this.f1198a.getApplicationInfo().flags));
        this.f1199b.append("\ncheckOp(OP_SYSTEM_ALERT_WINDOW): ");
        this.f1199b.append(c(24));
        this.f1199b.append(string);
        for (String str : this.f1199b.toString().split("[\\r\\n]+")) {
            e1.d(str);
        }
    }

    public void b() {
        try {
            e();
            if (this.f1200c == -1 || (Config.f30c & 2) != 0) {
                return;
            }
            if (!d("android.permission.SYSTEM_ALERT_WINDOW")) {
                f("android.permission.SYSTEM_ALERT_WINDOW");
                AlertDialog.Builder neutralButton = ggf.c(this.f1198a).setNeutralButton(b2.f(R.string.skip), f1.w(2L));
                if (d("android.permission.SYSTEM_ALERT_WINDOW")) {
                    neutralButton.setMessage(b2.f(R.string.miui_restart)).setPositiveButton(b2.f(R.string.restart), new p0(1200, true)).setNegativeButton(b2.f(R.string.no), (DialogInterface.OnClickListener) null);
                } else {
                    z.H(neutralButton);
                    neutralButton.setPositiveButton(b2.f(R.string.fix_it), new b());
                }
                n2.i(new c(neutralButton));
            }
        } catch (Throwable th) {
            e1.l("MIUI-check", th);
            this.f1199b.append("\nMIUI-check failed:\n");
            this.f1199b.append(e1.n(th));
        }
        i();
    }

    String g() {
        return this.f1200c != 6 ? "kwws=22zzz1|rxwxeh1frp2zdwfkBy@3[{m:N}:ZmT" : "kwws=22zzz1|rxwxeh1frp2zdwfkBy@k]ifLW:7SV;";
    }

    public void h() {
        new g0(new a(), "runCheck").start();
    }
}
