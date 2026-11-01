package android.ext;

import android.app.ActivityManager;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import catch_.me_.if_.you_.can_.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private z1.d f1019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f1020b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile Runnable f1021c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f1022d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1023e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f1024f = null;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainService.instance.i.U();
        }
    }

    class b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f1026b;

        b(int i, List list) {
            this.f1025a = i;
            this.f1026b = list;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == this.f1025a) {
                ConfigListAdapter.t(R.string.help_game_not_listed_title);
                return;
            }
            j.this.f((z1.d) this.f1026b.get(i));
            j.this.f1020b = true;
            Tools.D(dialogInterface);
            Runnable runnable = j.this.f1021c;
            if (runnable != null) {
                j.this.f1021c = null;
                runnable.run();
            }
        }
    }

    public j(ActivityManager activityManager, PackageManager packageManager) {
        new z1(activityManager, packageManager);
    }

    private static void h() {
        n2.d().post(new a());
    }

    public boolean a(boolean z, Runnable runnable) {
        this.f1021c = null;
        if (this.f1020b) {
            if (z) {
                b(false);
            }
            return true;
        }
        b(true);
        this.f1021c = runnable;
        return false;
    }

    public void b(boolean z) {
        c(z, null);
    }

    public void c(boolean z, String str) {
        if (this.f1022d) {
            if (z && MainService.instance.i.d0()) {
                Tools.I1(R.string.data_collecting_in_progress, 0);
                return;
            }
            return;
        }
        this.f1022d = true;
        this.f1023e = z;
        this.f1024f = str;
        if (z) {
            Tools.I1(R.string.start_collecting_data, 0);
        }
        h();
    }

    public void d(List list) {
        boolean z;
        boolean z2;
        if (this.f1022d) {
            try {
                if (list.size() == 0) {
                    e1.p("listProcesses empty");
                    if (this.f1023e || this.f1019a == null) {
                        Tools.H1(R.string.failed_find_package_name);
                        if (Config.C) {
                            ConfigListAdapter.t(R.string.help_game_not_listed_title);
                        }
                    }
                } else {
                    if (this.f1019a == null) {
                        z = false;
                        break;
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        } else if (((z1.d) it.next()).f1437f == this.f1019a.f1437f) {
                            z = true;
                            break;
                        }
                    }
                    if (this.f1024f != null) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            }
                            z1.d dVar = (z1.d) it2.next();
                            if (dVar.f1434c.equals(this.f1024f)) {
                                f(dVar);
                                z = true;
                                z2 = true;
                                break;
                            }
                        }
                        if (z2) {
                            this.f1023e = false;
                        }
                    }
                    if (!z) {
                        f((z1.d) list.get(0));
                    }
                    if (Config.C && Config.G == 0) {
                        Config.G = (((z1.d) list.get(0)).n && Config.E.contains("64")) ? (byte) 1 : (byte) 2;
                    }
                    if (this.f1023e) {
                        int size = list.size();
                        z1.c cVar = new z1.c(1, "stub");
                        cVar.f1428d = b2.f(R.string.help_game_not_listed_title);
                        cVar.h = true;
                        z1.d dVar2 = new z1.d(cVar, 1, 1, "stub", 0, false, 0);
                        dVar2.f1436e = Tools.o0(R.drawable.ic_help_circle_outline_white_24dp);
                        list.add(dVar2);
                        a2 a2Var = new a2(list);
                        z1.p(list);
                        f.o(ggf.c(Tools.k0()).setCustomTitle(Tools.g0(R.string.reset)).setAdapter(a2Var, new b(size, list)));
                    }
                }
                this.f1022d = false;
            } catch (Throwable th) {
                this.f1022d = false;
                throw th;
            }
        }
    }

    public boolean e() {
        return this.f1020b;
    }

    void f(z1.d dVar) {
        dVar.h();
        dVar.k();
        this.f1019a = dVar;
        e1.d("used: " + dVar.d());
        MainService.instance.Q0(dVar);
    }

    public void g() {
        this.f1020b = false;
    }
}
