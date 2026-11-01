package android.ext;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import catch_.me_.if_.you_.can_.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Runnable f759a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile int f760b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f761c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f762d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static ArrayList f763e = new ArrayList();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.v();
        }
    }

    class b implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f764a;

        b(Runnable runnable) {
            this.f764a = runnable;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            e1.d(this.f764a + ": 30_");
            n2.d().removeCallbacks(this.f764a);
        }
    }

    class c implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f765a;

        c(Runnable runnable) {
            this.f765a = runnable;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            e1.d(this.f765a + ": 40_");
            n2.d().postDelayed(this.f765a, 5000L);
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AlertDialog f766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Runnable f768c;

        d(AlertDialog alertDialog, n nVar, Runnable runnable) {
            this.f766a = alertDialog;
            this.f767b = nVar;
            this.f768c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f766a.isShowing()) {
                this.f767b.a();
                return;
            }
            if (this.f767b.c()) {
                e1.d("Fail-closed dialog was not shown");
                Runnable runnable = this.f768c;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    class e implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Handler f770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Runnable f771c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AlertDialog f772d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Runnable f773e;

        e(n nVar, Handler handler, Runnable runnable, AlertDialog alertDialog, Runnable runnable2) {
            this.f769a = nVar;
            this.f770b = handler;
            this.f771c = runnable;
            this.f772d = alertDialog;
            this.f773e = runnable2;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            this.f769a.f785a = true;
            this.f770b.removeCallbacks(this.f771c);
            f.j(this.f772d, this.f769a, this.f773e);
        }
    }

    /* JADX INFO: renamed from: android.ext.f$f, reason: collision with other inner class name */
    class DialogInterfaceOnDismissListenerC0015f implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f774a;

        DialogInterfaceOnDismissListenerC0015f(n nVar) {
            this.f774a = nVar;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            this.f774a.a();
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AlertDialog f775a;

        g(AlertDialog alertDialog) {
            this.f775a = alertDialog;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f.t(this.f775a);
            } catch (Throwable th) {
                e1.l("Failed show dialog on service", th);
            }
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AlertDialog.Builder f776a;

        h(AlertDialog.Builder builder) {
            this.f776a = builder;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.q(this.f776a, null);
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AlertDialog.Builder f777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f778b;

        i(AlertDialog.Builder builder, EditText editText) {
            this.f777a = builder;
            this.f778b = editText;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.n(this.f777a.create(), this.f778b);
        }
    }

    private static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference f779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeakReference f780b;

        public j(AlertDialog alertDialog, k kVar) {
            this.f779a = new WeakReference(alertDialog);
            this.f780b = new WeakReference(kVar);
        }
    }

    private static class k implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f781a;

        private k() {
            this.f781a = new ArrayList();
        }

        public void a(DialogInterface.OnDismissListener onDismissListener) {
            if (onDismissListener == null || this.f781a.contains(onDismissListener)) {
                return;
            }
            this.f781a.add(onDismissListener);
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            f.g();
            for (DialogInterface.OnDismissListener onDismissListener : this.f781a) {
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
            }
        }

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    private static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference f782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeakReference f783b;

        public l(AlertDialog alertDialog, m mVar) {
            this.f782a = new WeakReference(alertDialog);
            this.f783b = new WeakReference(mVar);
        }
    }

    private static class m implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f784a;

        private m() {
            this.f784a = new ArrayList();
        }

        public void a(DialogInterface.OnShowListener onShowListener) {
            if (onShowListener == null || this.f784a.contains(onShowListener)) {
                return;
            }
            this.f784a.add(onShowListener);
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Tools.N((AlertDialog) dialogInterface);
            for (DialogInterface.OnShowListener onShowListener : this.f784a) {
                if (onShowListener != null) {
                    onShowListener.onShow(dialogInterface);
                }
            }
        }

        /* synthetic */ m(a aVar) {
            this();
        }
    }

    private static class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile boolean f785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f786b;

        private n() {
            this.f785a = false;
            this.f786b = false;
        }

        synchronized void a() {
            try {
                this.f786b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        synchronized boolean b() {
            try {
                if (this.f786b) {
                    return false;
                }
                this.f786b = true;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }

        synchronized boolean c() {
            try {
                if (!this.f786b && !this.f785a) {
                    this.f786b = true;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }

        /* synthetic */ n(a aVar) {
            this();
        }
    }

    private static class o implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AdapterView.OnItemClickListener f787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n f788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f789c;

        private o(AdapterView.OnItemClickListener onItemClickListener, n nVar, Runnable runnable) {
            this.f787a = onItemClickListener;
            this.f788b = nVar;
            this.f789c = runnable;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            boolean zB = this.f788b.b();
            AdapterView.OnItemClickListener onItemClickListener = this.f787a;
            if (onItemClickListener != null) {
                try {
                    onItemClickListener.onItemClick(adapterView, view, i, j);
                } catch (Throwable th) {
                    e1.a(th);
                }
            }
            if (!zB || this.f789c == null) {
                return;
            }
            n2.d().post(this.f789c);
        }

        /* synthetic */ o(AdapterView.OnItemClickListener onItemClickListener, n nVar, Runnable runnable, a aVar) {
            this(onItemClickListener, nVar, runnable);
        }
    }

    private static class p implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AdapterView.OnItemClickListener f790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AlertDialog f791b;

        private p(AlertDialog alertDialog, AdapterView.OnItemClickListener onItemClickListener) {
            this.f790a = onItemClickListener;
            this.f791b = alertDialog;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            try {
                this.f790a.onItemClick(adapterView, view, i, j);
            } catch (Throwable th) {
                e1.a(th);
                Tools.D(this.f791b);
            }
        }

        /* synthetic */ p(AlertDialog alertDialog, AdapterView.OnItemClickListener onItemClickListener, a aVar) {
            this(alertDialog, onItemClickListener);
        }
    }

    public static AlertDialog.Builder b() {
        return c(Tools.f0());
    }

    public static AlertDialog.Builder c(Context context) {
        return new AlertDialog.Builder(context);
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
        a aVar = null;
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
            AdapterView.OnItemClickListener onItemClickListener = listView.getOnItemClickListener();
            if (onItemClickListener == null || (onItemClickListener instanceof p)) {
                return;
            }
            listView.setOnItemClickListener(new p(alertDialog, onItemClickListener, aVar));
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

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(AlertDialog alertDialog, n nVar, Runnable runnable) {
        ListView listView = alertDialog.getListView();
        if (listView == null) {
            return;
        }
        AdapterView.OnItemClickListener onItemClickListener = listView.getOnItemClickListener();
        if (onItemClickListener instanceof o) {
            return;
        }
        listView.setOnItemClickListener(new o(onItemClickListener, nVar, runnable, null));
    }

    public static void k(AlertDialog alertDialog, DialogInterface.OnDismissListener onDismissListener) {
        List list;
        AlertDialog alertDialog2;
        a aVar = null;
        int i2 = 0;
        j jVar = null;
        while (true) {
            list = f762d;
            if (i2 >= list.size()) {
                break;
            }
            j jVar2 = (j) list.get(i2);
            if (jVar2 == null || (alertDialog2 = (AlertDialog) jVar2.f779a.get()) == null) {
                list.remove(i2);
                i2--;
            } else if (alertDialog2 == alertDialog) {
                jVar = jVar2;
            }
            i2++;
        }
        if (jVar == null) {
            k kVar = new k(aVar);
            alertDialog.setOnDismissListener(kVar);
            jVar = new j(alertDialog, kVar);
            list.add(jVar);
        }
        ((k) jVar.f780b.get()).a(onDismissListener);
    }

    public static void l(AlertDialog alertDialog, DialogInterface.OnShowListener onShowListener) {
        List list;
        AlertDialog alertDialog2;
        a aVar = null;
        int i2 = 0;
        l lVar = null;
        while (true) {
            list = f761c;
            if (i2 >= list.size()) {
                break;
            }
            l lVar2 = (l) list.get(i2);
            if (lVar2 == null || (alertDialog2 = (AlertDialog) lVar2.f782a.get()) == null) {
                list.remove(i2);
                i2--;
            } else if (alertDialog2 == alertDialog) {
                lVar = lVar2;
            }
            i2++;
        }
        if (lVar == null) {
            m mVar = new m(aVar);
            alertDialog.setOnShowListener(mVar);
            lVar = new l(alertDialog, mVar);
            list.add(lVar);
        }
        ((m) lVar.f783b.get()).a(onShowListener);
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
        n2.i(new g(alertDialog));
        return alertDialog;
    }

    public static void o(AlertDialog.Builder builder) {
        q(builder, null);
    }

    public static void p(AlertDialog.Builder builder, Context context) {
        q(builder, null);
    }

    public static void q(AlertDialog.Builder builder, EditText editText) {
        n2.i(new i(builder, editText));
    }

    public static void r(AlertDialog alertDialog, Runnable runnable, boolean z) {
        l(alertDialog, new b(runnable));
        if (z) {
            k(alertDialog, new c(runnable));
        }
        n2.d().postDelayed(runnable, 3000L);
        e1.d(runnable + ": 10_");
        m(alertDialog);
        e1.d(runnable + ": 20_");
    }

    public static void s(AlertDialog.Builder builder) {
        f0.m0(new h(builder));
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
        InternalKeyboard internalKeyboard = (InternalKeyboard) decorView.findViewById(R.id.keyboard);
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
        n nVar = new n(null);
        Handler handlerD = n2.d();
        d dVar = new d(alertDialog, nVar, runnable2);
        l(alertDialog, new e(nVar, handlerD, dVar, alertDialog, runnable));
        k(alertDialog, new DialogInterfaceOnDismissListenerC0015f(nVar));
        handlerD.postDelayed(dVar, 3000L);
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
        } catch (WindowManager.BadTokenException unused) {
            m(alertDialog);
        }
    }
}
