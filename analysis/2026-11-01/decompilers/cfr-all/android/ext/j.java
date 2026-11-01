/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.pm.PackageManager
 *  android.widget.ListAdapter
 */
package android.ext;

import android.app.ActivityManager;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.ext.Config;
import android.ext.ConfigListAdapter;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.a2;
import android.ext.b2;
import android.ext.e1;
import android.ext.f;
import android.ext.n2;
import android.ext.z1;
import android.widget.ListAdapter;
import java.util.List;

class j {
    private z1.d a;
    volatile boolean b = false;
    volatile Runnable c = null;
    private volatile boolean d = false;
    private boolean e = false;
    private String f = null;

    public j(ActivityManager activityManager, PackageManager packageManager) {
        new z1(activityManager, packageManager);
    }

    private static void h() {
        n2.d().post(new Runnable(){

            @Override
            public void run() {
                MainService.instance.i.U();
            }
        });
    }

    public boolean a(boolean bl, Runnable runnable) {
        this.c = null;
        if (!this.b) {
            this.b(true);
            this.c = runnable;
            return false;
        }
        if (bl) {
            this.b(false);
        }
        return true;
    }

    public void b(boolean bl) {
        this.c(bl, null);
    }

    public void c(boolean bl, String string2) {
        if (this.d) {
            if (bl) {
                if (!MainService.instance.i.d0()) {
                    return;
                }
                Tools.I1(2131296365, 0);
            }
            return;
        }
        this.d = true;
        this.e = bl;
        this.f = string2;
        if (bl) {
            Tools.I1(2131296991, 0);
        }
        j.h();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void d(List list) {
        Throwable throwable2;
        block14: {
            block13: {
                int n3;
                Object object;
                block12: {
                    if (!this.d) return;
                    try {
                        if (list.size() != 0) break block12;
                        e1.p("listProcesses empty");
                        if (!this.e && this.a != null) break block13;
                    }
                    catch (Throwable throwable2) {
                        break block14;
                    }
                    Tools.H1(2131296436);
                    if (Config.C) {
                        ConfigListAdapter.t(2131296621);
                    }
                    break block13;
                }
                if (this.a != null) {
                    object = list.iterator();
                    while (object.hasNext()) {
                        if (((z1.d)object.next()).f != this.a.f) continue;
                        n3 = 1;
                        break;
                    }
                } else {
                    n3 = 0;
                }
                int n4 = n3;
                if (this.f != null) {
                    boolean bl;
                    block15: {
                        for (Object object2 : list) {
                            if (!((z1.d)object2).c.equals(this.f)) continue;
                            this.f((z1.d)object2);
                            n3 = 1;
                            bl = true;
                            break block15;
                        }
                        bl = false;
                    }
                    n4 = n3;
                    if (bl) {
                        this.e = false;
                        n4 = n3;
                    }
                }
                if (n4 == 0) {
                    this.f((z1.d)list.get(0));
                }
                if (Config.C && Config.G == 0) {
                    int n5 = ((z1.d)list.get((int)0)).n && Config.E.contains("64") ? 1 : 2;
                    Config.G = (byte)n5;
                }
                if (this.e) {
                    Object object2;
                    n3 = list.size();
                    object2 = new z1.c(1, "stub");
                    ((z1.c)object2).d = b2.f(2131296621);
                    ((z1.c)object2).h = true;
                    object = new z1.d((z1.c)object2, 1, 1, "stub", 0, false, 0);
                    ((z1.d)object).e = Tools.o0(2130968623);
                    list.add(object);
                    object2 = new a2(list);
                    z1.p(list);
                    object = android.ext.f.c(Tools.k0()).setCustomTitle(Tools.g0(2131296897));
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this, n3, list){
                        final int a;
                        final List b;
                        final j c;
                        {
                            this.c = j3;
                            this.a = n3;
                            this.b = list;
                        }

                        public void onClick(DialogInterface object, int n3) {
                            if (n3 == this.a) {
                                ConfigListAdapter.t(2131296621);
                                return;
                            }
                            this.c.f((z1.d)this.b.get(n3));
                            this.c.b = true;
                            Tools.D((DialogInterface)object);
                            object = this.c.c;
                            if (object != null) {
                                this.c.c = null;
                                object.run();
                            }
                        }
                    };
                    android.ext.f.o(object.setAdapter((ListAdapter)object2, onClickListener));
                }
            }
            this.d = false;
            return;
        }
        this.d = false;
        throw throwable2;
    }

    public boolean e() {
        return this.b;
    }

    void f(z1.d d4) {
        d4.h();
        d4.k();
        this.a = d4;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("used: ");
        stringBuilder.append(d4.d());
        e1.d(stringBuilder.toString());
        MainService.instance.Q0(d4);
    }

    public void g() {
        this.b = false;
    }
}

