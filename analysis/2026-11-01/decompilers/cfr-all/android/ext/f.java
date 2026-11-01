/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Handler
 *  android.view.View
 *  android.view.Window
 *  android.view.Window$Callback
 *  android.view.WindowManager$BadTokenException
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.EditText
 *  android.widget.ListView
 *  android.widget.TextView$OnEditorActionListener
 */
package android.ext;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.ext.Config;
import android.ext.EditText;
import android.ext.EditorActionListener;
import android.ext.InternalKeyboard;
import android.ext.MainService;
import android.ext.ShowApp;
import android.ext.Tools;
import android.ext.e1;
import android.ext.f0;
import android.ext.g3;
import android.ext.m2;
import android.ext.n2;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class f {
    static final Runnable a = new Runnable(){

        @Override
        public void run() {
            f.v();
        }
    };
    private static volatile int b = 0;
    private static final List c = new ArrayList();
    private static final List d = new ArrayList();
    private static ArrayList e = new ArrayList();

    public static AlertDialog.Builder b() {
        return f.c(Tools.f0());
    }

    public static AlertDialog.Builder c(Context context) {
        return new AlertDialog.Builder(context);
    }

    public static void d() {
        Iterator iterator = e.iterator();
        while (iterator.hasNext()) {
            AlertDialog alertDialog = (AlertDialog)((WeakReference)iterator.next()).get();
            if (alertDialog == null) continue;
            try {
                if (!alertDialog.isShowing()) continue;
                Tools.D((DialogInterface)alertDialog);
            }
            catch (Throwable throwable) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed dismiss dialog: ");
                stringBuilder.append(alertDialog);
                e1.s(stringBuilder.toString(), throwable);
            }
        }
        if (MainService.instance != null) {
            MainService.instance.t();
        }
    }

    private static void e(AlertDialog alertDialog) {
        alertDialog = alertDialog.getWindow();
        alertDialog.setCallback((Window.Callback)new g3(alertDialog.getCallback()));
        if (f.h()) {
            alertDialog.clearFlags(0x1000000);
            return;
        }
        alertDialog.setType(m2.b());
        Tools.R((Window)alertDialog);
        if ((Config.B & 2) != 0) {
            alertDialog.addFlags(0x1000000);
        } else {
            alertDialog.clearFlags(0x1000000);
        }
    }

    private static void f(AlertDialog alertDialog) {
        block7: {
            ListView listView;
            try {
                listView = alertDialog.getListView();
            }
            catch (Throwable throwable) {
                e1.a(throwable);
                listView = null;
            }
            if (listView == null) {
                return;
            }
            AdapterView.OnItemClickListener onItemClickListener = listView.getOnItemClickListener();
            if (onItemClickListener == null) break block7;
            try {
                if (!(onItemClickListener instanceof p)) {
                    p p3 = new p(alertDialog, onItemClickListener);
                    listView.setOnItemClickListener((AdapterView.OnItemClickListener)p3);
                }
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
        }
    }

    static void g() {
        if (MainService.instance == null) {
            return;
        }
        if (--b <= 0) {
            n2.d().removeCallbacks(a);
            MainService.instance.h0.c();
            b = 0;
        }
    }

    private static boolean h() {
        boolean bl = MainService.instance == null;
        return bl;
    }

    public static void i(AlertDialog alertDialog) {
        if (alertDialog.getWindow().getAttributes().type < 2000) {
            return;
        }
        ArrayList arrayList = e;
        ArrayList<WeakReference<AlertDialog>> arrayList2 = new ArrayList<WeakReference<AlertDialog>>();
        for (WeakReference weakReference : arrayList) {
            AlertDialog alertDialog2 = (AlertDialog)weakReference.get();
            if (alertDialog2 == null || alertDialog2 == alertDialog) continue;
            arrayList2.add(weakReference);
        }
        arrayList2.add(new WeakReference<AlertDialog>(alertDialog));
        e = arrayList2;
        arrayList.clear();
        arrayList.trimToSize();
    }

    private static void j(AlertDialog alertDialog, n n3, Runnable runnable) {
        if ((alertDialog = alertDialog.getListView()) == null) {
            return;
        }
        AdapterView.OnItemClickListener onItemClickListener = alertDialog.getOnItemClickListener();
        if (onItemClickListener instanceof o) {
            return;
        }
        alertDialog.setOnItemClickListener((AdapterView.OnItemClickListener)new o(onItemClickListener, n3, runnable));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void k(AlertDialog alertDialog, DialogInterface.OnDismissListener onDismissListener) {
        j j3;
        List list;
        int n3 = 0;
        Object object = null;
        while (n3 < (list = d).size()) {
            int n4;
            AlertDialog alertDialog2;
            j3 = (j)list.get(n3);
            if (j3 == null || (alertDialog2 = (AlertDialog)j3.a.get()) == null) {
                list.remove(n3);
                n4 = n3 - 1;
            } else {
                n4 = n3;
                if (alertDialog2 == alertDialog) {
                    object = j3;
                    n4 = n3;
                }
            }
            n3 = n4 + 1;
        }
        j3 = object;
        if (object == null) {
            object = new k();
            alertDialog.setOnDismissListener((DialogInterface.OnDismissListener)object);
            j3 = new j(alertDialog, (k)object);
            list.add(j3);
        }
        ((k)j3.b.get()).a(onDismissListener);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void l(AlertDialog alertDialog, DialogInterface.OnShowListener onShowListener) {
        l l3;
        List list;
        int n3 = 0;
        Object object = null;
        while (n3 < (list = c).size()) {
            int n4;
            AlertDialog alertDialog2;
            l3 = (l)list.get(n3);
            if (l3 == null || (alertDialog2 = (AlertDialog)l3.a.get()) == null) {
                list.remove(n3);
                n4 = n3 - 1;
            } else {
                n4 = n3;
                if (alertDialog2 == alertDialog) {
                    object = l3;
                    n4 = n3;
                }
            }
            n3 = n4 + 1;
        }
        l3 = object;
        if (object == null) {
            object = new m();
            alertDialog.setOnShowListener((DialogInterface.OnShowListener)object);
            l3 = new l(alertDialog, (m)object);
            list.add(l3);
        }
        ((m)l3.b.get()).a(onShowListener);
    }

    public static AlertDialog m(AlertDialog alertDialog) {
        f.n(alertDialog, null);
        return alertDialog;
    }

    public static AlertDialog n(AlertDialog alertDialog, android.widget.EditText editText) {
        if (editText != null) {
            editText.setOnEditorActionListener((TextView.OnEditorActionListener)new EditorActionListener(alertDialog));
        }
        f.e(alertDialog);
        n2.i(new Runnable(alertDialog){
            final AlertDialog a;
            {
                this.a = alertDialog;
            }

            @Override
            public void run() {
                try {
                    f.t(this.a);
                }
                catch (Throwable throwable) {
                    e1.l("Failed show dialog on service", throwable);
                }
            }
        });
        return alertDialog;
    }

    public static void o(AlertDialog.Builder builder) {
        f.q(builder, null);
    }

    public static void p(AlertDialog.Builder builder, Context context) {
        f.q(builder, null);
    }

    public static void q(AlertDialog.Builder builder, EditText editText) {
        n2.i(new Runnable(builder, editText){
            final AlertDialog.Builder a;
            final EditText b;
            {
                this.a = builder;
                this.b = editText;
            }

            @Override
            public void run() {
                f.n(this.a.create(), this.b);
            }
        });
    }

    public static void r(AlertDialog object, Runnable runnable, boolean bl) {
        f.l((AlertDialog)object, new DialogInterface.OnShowListener(runnable){
            final Runnable a;
            {
                this.a = runnable;
            }

            public void onShow(DialogInterface object) {
                object = new StringBuilder();
                ((StringBuilder)object).append(this.a);
                ((StringBuilder)object).append(": 30_");
                e1.d(((StringBuilder)object).toString());
                n2.d().removeCallbacks(this.a);
            }
        });
        if (bl) {
            f.k((AlertDialog)object, new DialogInterface.OnDismissListener(runnable){
                final Runnable a;
                {
                    this.a = runnable;
                }

                public void onDismiss(DialogInterface object) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(this.a);
                    ((StringBuilder)object).append(": 40_");
                    e1.d(((StringBuilder)object).toString());
                    n2.d().postDelayed(this.a, 5000L);
                }
            });
        }
        n2.d().postDelayed(runnable, 3000L);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(runnable);
        stringBuilder.append(": 10_");
        e1.d(stringBuilder.toString());
        f.m((AlertDialog)object);
        object = new StringBuilder();
        ((StringBuilder)object).append(runnable);
        ((StringBuilder)object).append(": 20_");
        e1.d(((StringBuilder)object).toString());
    }

    public static void s(AlertDialog.Builder builder) {
        f0.m0(new Runnable(builder){
            final AlertDialog.Builder a;
            {
                this.a = builder;
            }

            @Override
            public void run() {
                f.q(this.a, null);
            }
        });
    }

    static void t(AlertDialog alertDialog) {
        f.l(alertDialog, null);
        alertDialog.show();
        if (f.h()) {
            return;
        }
        f.f(alertDialog);
        Window window = alertDialog.getWindow();
        Object object = window.getDecorView();
        InternalKeyboard internalKeyboard = (InternalKeyboard)object.findViewById(2131034303);
        if (internalKeyboard != null) {
            internalKeyboard.g(window);
        }
        int n3 = Tools.Q0(object) && (internalKeyboard == null || (Config.B & 1) == 0) ? 5 : 2;
        window.setSoftInputMode(n3 | 0x10);
        Tools.S(object);
        ShowApp.i(window);
        window = n2.d();
        object = a;
        window.removeCallbacks((Runnable)object);
        window.postDelayed((Runnable)object, 100L);
        b = b <= 0 ? 1 : ++b;
        f.k(alertDialog, null);
        f.i(alertDialog);
    }

    public static void u(AlertDialog alertDialog, Runnable runnable, Runnable runnable2) {
        n n3 = new n();
        Handler handler = n2.d();
        runnable2 = new Runnable(alertDialog, n3, runnable2){
            final AlertDialog a;
            final n b;
            final Runnable c;
            {
                this.a = alertDialog;
                this.b = n3;
                this.c = runnable;
            }

            @Override
            public void run() {
                if (this.a.isShowing()) {
                    this.b.a();
                    return;
                }
                if (this.b.c()) {
                    e1.d("Fail-closed dialog was not shown");
                    Runnable runnable = this.c;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }
        };
        f.l(alertDialog, new DialogInterface.OnShowListener(n3, handler, runnable2, alertDialog, runnable){
            final n a;
            final Handler b;
            final Runnable c;
            final AlertDialog d;
            final Runnable e;
            {
                this.a = n3;
                this.b = handler;
                this.c = runnable;
                this.d = alertDialog;
                this.e = runnable2;
            }

            public void onShow(DialogInterface dialogInterface) {
                this.a.a = true;
                this.b.removeCallbacks(this.c);
                f.j(this.d, this.a, this.e);
            }
        });
        f.k(alertDialog, new DialogInterface.OnDismissListener(n3){
            final n a;
            {
                this.a = n3;
            }

            public void onDismiss(DialogInterface dialogInterface) {
                this.a.a();
            }
        });
        handler.postDelayed(runnable2, 3000L);
        f.m(alertDialog);
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
        }
        catch (WindowManager.BadTokenException badTokenException) {
            f.m(alertDialog);
        }
    }

    private static class j {
        public WeakReference a;
        public WeakReference b;

        public j(AlertDialog alertDialog, k k3) {
            this.a = new WeakReference<AlertDialog>(alertDialog);
            this.b = new WeakReference<k>(k3);
        }
    }

    private static class k
    implements DialogInterface.OnDismissListener {
        private final List a = new ArrayList();

        private k() {
        }

        public void a(DialogInterface.OnDismissListener onDismissListener) {
            if (onDismissListener == null) {
                return;
            }
            if (!this.a.contains(onDismissListener)) {
                this.a.add(onDismissListener);
            }
        }

        public void onDismiss(DialogInterface dialogInterface) {
            f.g();
            for (DialogInterface.OnDismissListener onDismissListener : this.a) {
                if (onDismissListener == null) continue;
                onDismissListener.onDismiss(dialogInterface);
            }
        }
    }

    private static class l {
        public WeakReference a;
        public WeakReference b;

        public l(AlertDialog alertDialog, m m3) {
            this.a = new WeakReference<AlertDialog>(alertDialog);
            this.b = new WeakReference<m>(m3);
        }
    }

    private static class m
    implements DialogInterface.OnShowListener {
        private final List a = new ArrayList();

        private m() {
        }

        public void a(DialogInterface.OnShowListener onShowListener) {
            if (onShowListener == null) {
                return;
            }
            if (!this.a.contains(onShowListener)) {
                this.a.add(onShowListener);
            }
        }

        public void onShow(DialogInterface dialogInterface) {
            Tools.N((AlertDialog)dialogInterface);
            for (DialogInterface.OnShowListener onShowListener : this.a) {
                if (onShowListener == null) continue;
                onShowListener.onShow(dialogInterface);
            }
        }
    }

    private static class n {
        volatile boolean a = false;
        private boolean b = false;

        private n() {
        }

        void a() {
            synchronized (this) {
                this.b = true;
                return;
            }
        }

        boolean b() {
            synchronized (this) {
                block4: {
                    boolean bl = this.b;
                    if (!bl) break block4;
                    return false;
                }
                this.b = true;
                return true;
            }
        }

        boolean c() {
            synchronized (this) {
                Throwable throwable2;
                block4: {
                    try {
                        if (!this.b && !this.a) {
                            this.b = true;
                            return true;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                    return false;
                }
                throw throwable2;
            }
        }
    }

    private static class o
    implements AdapterView.OnItemClickListener {
        private final AdapterView.OnItemClickListener a;
        private final n b;
        private final Runnable c;

        private o(AdapterView.OnItemClickListener onItemClickListener, n n3, Runnable runnable) {
            this.a = onItemClickListener;
            this.b = n3;
            this.c = runnable;
        }

        public void onItemClick(AdapterView adapterView, View view, int n3, long l3) {
            boolean bl = this.b.b();
            AdapterView.OnItemClickListener onItemClickListener = this.a;
            if (onItemClickListener != null) {
                try {
                    onItemClickListener.onItemClick(adapterView, view, n3, l3);
                }
                catch (Throwable throwable) {
                    e1.a(throwable);
                }
            }
            if (bl && this.c != null) {
                n2.d().post(this.c);
            }
        }
    }

    private static class p
    implements AdapterView.OnItemClickListener {
        final AdapterView.OnItemClickListener a;
        final AlertDialog b;

        private p(AlertDialog alertDialog, AdapterView.OnItemClickListener onItemClickListener) {
            this.a = onItemClickListener;
            this.b = alertDialog;
        }

        public void onItemClick(AdapterView adapterView, View view, int n3, long l3) {
            try {
                this.a.onItemClick(adapterView, view, n3, l3);
            }
            catch (Throwable throwable) {
                e1.a(throwable);
                Tools.D((DialogInterface)this.b);
            }
        }
    }
}

