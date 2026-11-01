package android.ext;

import android.app.AlertDialog;
import android.app.AlertDialog$Builder;
import android.content.Context;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnShowListener;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager$BadTokenException;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListView;
import catch_.me_.if_.you_.can_.R$id;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Runnable f759a = new f$a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile int f760b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f761c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f762d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static ArrayList f763e = new ArrayList();

    public static AlertDialog$Builder b() {
        return c(Tools.f0());
    }

    public static AlertDialog$Builder c(Context context) {
        return new AlertDialog$Builder(context);
    }

    public static void d() {
        Iterator it = f763e.iterator();
        while (it.hasNext()) {
            AlertDialog alertDialog = (AlertDialog) ((WeakReference) it.next()).get();
            if (alertDialog != null) {
                try {
                    if (alertDialog.isShowing()) {
                        Tools.D(alertDialog);
                    }
                } catch (Throwable th) {
                    e1.s("Failed dismiss dialog: " + alertDialog, th);
                }
            }
        }
        if (MainService.instance != null) {
            MainService.instance.t();
        }
    }

    private static void e(AlertDialog alertDialog) {
        Window window = alertDialog.getWindow();
        window.setCallback(new g3(window.getCallback()));
        if (h()) {
            window.clearFlags(16777216);
            return;
        }
        window.setType(m2.b());
        Tools.R(window);
        if ((Config.B & 2) != 0) {
            window.addFlags(16777216);
        } else {
            window.clearFlags(16777216);
        }
    }

    private static void f(AlertDialog alertDialog) {
        ListView listView;
        try {
            listView = alertDialog.getListView();
        } catch (Throwable th) {
            e1.a(th);
            listView = null;
        }
        if (listView == null) {
            return;
        }
        try {
            AdapterView$OnItemClickListener onItemClickListener = listView.getOnItemClickListener();
            if (onItemClickListener == null || (onItemClickListener instanceof f$p)) {
                return;
            }
            listView.setOnItemClickListener(new f$p(alertDialog, onItemClickListener, null));
        } catch (Throwable th2) {
            e1.a(th2);
        }
    }

    static void g() {
        if (MainService.instance == null) {
            return;
        }
        f760b--;
        if (f760b <= 0) {
            n2.d().removeCallbacks(f759a);
            MainService.instance.h0.c();
            f760b = 0;
        }
    }

    private static boolean h() {
        return MainService.instance == null;
    }

    public static void i(AlertDialog alertDialog) {
        if (alertDialog.getWindow().getAttributes().type < 2000) {
            return;
        }
        ArrayList<WeakReference> arrayList = f763e;
        ArrayList arrayList2 = new ArrayList();
        for (WeakReference weakReference : arrayList) {
            AlertDialog alertDialog2 = (AlertDialog) weakReference.get();
            if (alertDialog2 != null && alertDialog2 != alertDialog) {
                arrayList2.add(weakReference);
            }
        }
        arrayList2.add(new WeakReference(alertDialog));
        f763e = arrayList2;
        arrayList.clear();
        arrayList.trimToSize();
    }

    private static void j(AlertDialog alertDialog, f$n f_n, Runnable runnable) {
        ListView listView = alertDialog.getListView();
        if (listView == null) {
            return;
        }
        AdapterView$OnItemClickListener onItemClickListener = listView.getOnItemClickListener();
        if (onItemClickListener instanceof f$o) {
            return;
        }
        listView.setOnItemClickListener(new f$o(onItemClickListener, f_n, runnable, null));
    }

    public static void k(AlertDialog alertDialog, DialogInterface$OnDismissListener dialogInterface$OnDismissListener) {
        List list;
        AlertDialog alertDialog2;
        int i = 0;
        f$j f_j = null;
        while (true) {
            list = f762d;
            if (i >= list.size()) {
                break;
            }
            f$j f_j2 = (f$j) list.get(i);
            if (f_j2 == null || (alertDialog2 = (AlertDialog) f_j2.f779a.get()) == null) {
                list.remove(i);
                i--;
            } else if (alertDialog2 == alertDialog) {
                f_j = f_j2;
            }
            i++;
        }
        if (f_j == null) {
            f$k f_k = new f$k(null);
            alertDialog.setOnDismissListener(f_k);
            f_j = new f$j(alertDialog, f_k);
            list.add(f_j);
        }
        ((f$k) f_j.f780b.get()).a(dialogInterface$OnDismissListener);
    }

    public static void l(AlertDialog alertDialog, DialogInterface$OnShowListener dialogInterface$OnShowListener) {
        List list;
        AlertDialog alertDialog2;
        int i = 0;
        f$l f_l = null;
        while (true) {
            list = f761c;
            if (i >= list.size()) {
                break;
            }
            f$l f_l2 = (f$l) list.get(i);
            if (f_l2 == null || (alertDialog2 = (AlertDialog) f_l2.f782a.get()) == null) {
                list.remove(i);
                i--;
            } else if (alertDialog2 == alertDialog) {
                f_l = f_l2;
            }
            i++;
        }
        if (f_l == null) {
            f$m f_m = new f$m(null);
            alertDialog.setOnShowListener(f_m);
            f_l = new f$l(alertDialog, f_m);
            list.add(f_l);
        }
        ((f$m) f_l.f783b.get()).a(dialogInterface$OnShowListener);
    }

    public static AlertDialog m(AlertDialog alertDialog) {
        n(alertDialog, null);
        return alertDialog;
    }

    public static AlertDialog n(AlertDialog alertDialog, android.widget.EditText editText) {
        if (editText != null) {
            editText.setOnEditorActionListener(new EditorActionListener(alertDialog));
        }
        e(alertDialog);
        n2.i(new f$g(alertDialog));
        return alertDialog;
    }

    public static void o(AlertDialog$Builder alertDialog$Builder) {
        q(alertDialog$Builder, null);
    }

    public static void p(AlertDialog$Builder alertDialog$Builder, Context context) {
        q(alertDialog$Builder, null);
    }

    public static void q(AlertDialog$Builder alertDialog$Builder, EditText editText) {
        n2.i(new f$i(alertDialog$Builder, editText));
    }

    public static void r(AlertDialog alertDialog, Runnable runnable, boolean z) {
        l(alertDialog, new f$b(runnable));
        if (z) {
            k(alertDialog, new f$c(runnable));
        }
        n2.d().postDelayed(runnable, 3000L);
        e1.d(runnable + ": 10_");
        m(alertDialog);
        e1.d(runnable + ": 20_");
    }

    public static void s(AlertDialog$Builder alertDialog$Builder) {
        f0.m0(new f$h(alertDialog$Builder));
    }

    static void t(AlertDialog alertDialog) {
        l(alertDialog, null);
        alertDialog.show();
        if (h()) {
            return;
        }
        f(alertDialog);
        Window window = alertDialog.getWindow();
        View decorView = window.getDecorView();
        InternalKeyboard internalKeyboard = (InternalKeyboard) decorView.findViewById(R$id.keyboard);
        if (internalKeyboard != null) {
            internalKeyboard.g(window);
        }
        window.setSoftInputMode(((Tools.Q0(decorView) && (internalKeyboard == null || (Config.B & 1) == 0)) ? 5 : 2) | 16);
        Tools.S(decorView);
        ShowApp.i(window);
        Handler handlerD = n2.d();
        Runnable runnable = f759a;
        handlerD.removeCallbacks(runnable);
        handlerD.postDelayed(runnable, 100L);
        if (f760b <= 0) {
            f760b = 1;
        } else {
            f760b++;
        }
        k(alertDialog, null);
        i(alertDialog);
    }

    public static void u(AlertDialog alertDialog, Runnable runnable, Runnable runnable2) {
        f$n f_n = new f$n(null);
        Handler handlerD = n2.d();
        f$d f_d = new f$d(alertDialog, f_n, runnable2);
        l(alertDialog, new f$e(f_n, handlerD, f_d, alertDialog, runnable));
        k(alertDialog, new f$f(f_n));
        handlerD.postDelayed(f_d, 3000L);
        m(alertDialog);
    }

    static void v() {
        if (MainService.instance == null) {
            return;
        }
        MainService.instance.h0.p();
        if (MainService.instance.f0 == MainService.instance.c0) {
            return;
        }
        MainService.instance.h0.m();
    }

    public static void w(AlertDialog alertDialog) {
        try {
            alertDialog.show();
        } catch (WindowManager$BadTokenException unused) {
            m(alertDialog);
        }
    }
}
