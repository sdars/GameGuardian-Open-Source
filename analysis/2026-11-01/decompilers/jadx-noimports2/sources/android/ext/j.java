package android.ext;

/* JADX INFO: loaded from: classes.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.ext.z1.d f1019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f1020b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile java.lang.Runnable f1021c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f1022d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1023e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.String f1024f = null;

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.MainService.instance.i.U();
        }
    }

    class b implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.util.List f1026b;

        b(int i, java.util.List list) {
            this.f1025a = i;
            this.f1026b = list;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            if (i == this.f1025a) {
                android.ext.ConfigListAdapter.t(catch_.me_.if_.you_.can_.R.string.help_game_not_listed_title);
                return;
            }
            android.ext.j.this.f((android.ext.z1.d) this.f1026b.get(i));
            android.ext.j.this.f1020b = true;
            android.ext.Tools.D(dialogInterface);
            java.lang.Runnable runnable = android.ext.j.this.f1021c;
            if (runnable != null) {
                android.ext.j.this.f1021c = null;
                runnable.run();
            }
        }
    }

    public j(android.app.ActivityManager activityManager, android.content.pm.PackageManager packageManager) {
        new android.ext.z1(activityManager, packageManager);
    }

    private static void h() {
        android.ext.n2.d().post(new android.ext.j.a());
    }

    public boolean a(boolean z, java.lang.Runnable runnable) {
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

    public void c(boolean z, java.lang.String str) {
        if (this.f1022d) {
            if (z && android.ext.MainService.instance.i.d0()) {
                android.ext.Tools.I1(catch_.me_.if_.you_.can_.R.string.data_collecting_in_progress, 0);
                return;
            }
            return;
        }
        this.f1022d = true;
        this.f1023e = z;
        this.f1024f = str;
        if (z) {
            android.ext.Tools.I1(catch_.me_.if_.you_.can_.R.string.start_collecting_data, 0);
        }
        h();
    }

    public void d(java.util.List list) {
        boolean z;
        boolean z2;
        if (this.f1022d) {
            try {
                if (list.size() == 0) {
                    android.ext.e1.p("listProcesses empty");
                    if (this.f1023e || this.f1019a == null) {
                        android.ext.Tools.H1(catch_.me_.if_.you_.can_.R.string.failed_find_package_name);
                        if (android.ext.Config.C) {
                            android.ext.ConfigListAdapter.t(catch_.me_.if_.you_.can_.R.string.help_game_not_listed_title);
                        }
                    }
                } else {
                    if (this.f1019a == null) {
                        z = false;
                        break;
                    }
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        } else if (((android.ext.z1.d) it.next()).f1437f == this.f1019a.f1437f) {
                            z = true;
                            break;
                        }
                    }
                    if (this.f1024f != null) {
                        java.util.Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            }
                            android.ext.z1.d dVar = (android.ext.z1.d) it2.next();
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
                        f((android.ext.z1.d) list.get(0));
                    }
                    if (android.ext.Config.C && android.ext.Config.G == 0) {
                        android.ext.Config.G = (((android.ext.z1.d) list.get(0)).n && android.ext.Config.E.contains("64")) ? (byte) 1 : (byte) 2;
                    }
                    if (this.f1023e) {
                        int size = list.size();
                        android.ext.z1.c cVar = new android.ext.z1.c(1, "stub");
                        cVar.f1428d = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.help_game_not_listed_title);
                        cVar.h = true;
                        android.ext.z1.d dVar2 = new android.ext.z1.d(cVar, 1, 1, "stub", 0, false, 0);
                        dVar2.f1436e = android.ext.Tools.o0(catch_.me_.if_.you_.can_.R.drawable.ic_help_circle_outline_white_24dp);
                        list.add(dVar2);
                        android.ext.a2 a2Var = new android.ext.a2(list);
                        android.ext.z1.p(list);
                        android.ext.f.o(android.ext.f.c(android.ext.Tools.k0()).setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.reset)).setAdapter(a2Var, new android.ext.j.b(size, list)));
                    }
                }
                this.f1022d = false;
            } catch (java.lang.Throwable th) {
                this.f1022d = false;
                throw th;
            }
        }
    }

    public boolean e() {
        return this.f1020b;
    }

    void f(android.ext.z1.d dVar) {
        dVar.h();
        dVar.k();
        this.f1019a = dVar;
        android.ext.e1.d("used: " + dVar.d());
        android.ext.MainService.instance.Q0(dVar);
    }

    public void g() {
        this.f1020b = false;
    }
}
