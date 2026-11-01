/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AppOpsManager;
import android.app.UiAutomation;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.ext.Config;
import android.ext.ConfigListAdapter;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.b2;
import android.ext.e1;
import android.ext.f;
import android.ext.g0;
import android.ext.m2;
import android.ext.n2;
import android.ext.r;
import android.ext.s1;
import android.ext.u;
import android.fix.TextView;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.io.IOException;
import java.util.Random;

public class z
implements View.OnClickListener,
DialogInterface.OnClickListener,
DialogInterface.OnDismissListener,
DialogInterface.OnShowListener,
View.OnTouchListener {
    private static volatile boolean b = false;
    private static View[] c;
    private static AlertDialog d;
    private static boolean e = false;
    private static volatile Activity f;
    private static volatile boolean g = false;
    private static volatile DialogInterface h;
    private static int i;
    Activity a;

    public z(Activity activity) {
        this.a = activity;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static int A(Activity activity) {
        long l3;
        Runnable runnable;
        int[] nArray;
        block12: {
            try {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.type = m2.b();
                layoutParams.width = 1;
                layoutParams.height = 1;
                layoutParams.format = -2;
                layoutParams.flags = 312;
                if (Config.vSpaceReal && !Config.D) {
                    layoutParams.packageName = Config.E;
                }
                View view = new View((Context)activity);
                nArray = new int[]{0};
                runnable = new Runnable(activity, view, layoutParams, nArray){
                    final Activity a;
                    final View b;
                    final WindowManager.LayoutParams c;
                    final int[] d;
                    {
                        this.a = activity;
                        this.b = view;
                        this.c = layoutParams;
                        this.d = nArray;
                    }

                    /*
                     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
                     * Loose catch block
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     */
                    @Override
                    public void run() {
                        Throwable throwable4222222;
                        block19: {
                            block18: {
                                WindowManager windowManager;
                                boolean bl;
                                Object object;
                                block17: {
                                    WindowManager windowManager2;
                                    block20: {
                                        object = null;
                                        object = windowManager2 = this.a.getWindowManager();
                                        windowManager2.addView(this.b, (ViewGroup.LayoutParams)this.c);
                                        try {}
                                        catch (Throwable throwable2) {
                                            bl = true;
                                            windowManager = windowManager2;
                                            break block17;
                                        }
                                        break block20;
                                        catch (Throwable throwable3) {
                                            bl = false;
                                            windowManager = object;
                                            object = throwable3;
                                        }
                                        break block17;
                                    }
                                    windowManager2.removeView(this.b);
                                    object = windowManager2;
                                    {
                                        this.d[0] = 1;
                                    }
                                    synchronized (this) {
                                        this.notify();
                                        return;
                                    }
                                }
                                e1.s("Failed overlay probe", (Throwable)object);
                                this.d[0] = -1;
                                if (!bl || windowManager == null) break block18;
                                {
                                    catch (Throwable throwable4222222) {
                                        break block19;
                                    }
                                    try {
                                        windowManager.removeView(this.b);
                                    }
                                    catch (Throwable throwable5) {}
                                    {
                                        e1.s("Failed remove overlay probe", throwable5);
                                    }
                                }
                            }
                            synchronized (this) {
                                this.notify();
                                return;
                            }
                        }
                        synchronized (this) {
                            this.notify();
                            throw throwable4222222;
                        }
                    }
                };
                // MONITORENTER : runnable
            }
            catch (Throwable throwable) {}
            n2.i(runnable);
            l3 = SystemClock.uptimeMillis();
            break block12;
            e1.s("Failed overlay probe", throwable);
            return 0;
        }
        while (nArray[0] == 0) {
            long l4 = l3 + 10000L - SystemClock.uptimeMillis();
            if (l4 <= 0L) return nArray[0];
            runnable.wait(l4);
        }
        return nArray[0];
    }

    private static boolean B(int n3, boolean bl) {
        synchronized (z.class) {
            Throwable throwable2;
            block7: {
                block6: {
                    block5: {
                        boolean bl2;
                        block4: {
                            try {
                                int n4 = i;
                                bl2 = true;
                                if (n3 == n4) break block4;
                            }
                            catch (Throwable throwable2) {}
                            return true;
                        }
                        if (!bl) break block5;
                        bl = s1.D();
                        if (!bl) break block5;
                        bl = bl2;
                        break block6;
                        break block7;
                    }
                    bl = false;
                }
                return bl;
            }
            throw throwable2;
        }
    }

    static int C(boolean bl, int n3) {
        if (bl) {
            return 0;
        }
        if (n3 == 1) {
            return 1;
        }
        if (n3 == -1) {
            return 2;
        }
        return 3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void D(Activity activity, DialogInterface dialogInterface) {
        synchronized (z.class) {
            block7: {
                if (dialogInterface != null) {
                    if (h != dialogInterface) break block7;
                    z.q(activity);
                    // MONITOREXIT @DISABLED, blocks:[0, 3, 6] lbl6 : MonitorExitStatement: MONITOREXIT : android.ext.z.class
                    try {
                        dialogInterface.dismiss();
                        return;
                    }
                    catch (Throwable throwable) {
                        e1.s("Failed dismiss overlay prompt", throwable);
                    }
                    return;
                }
            }
            try {
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void F() {
        synchronized (z.class) {
            Throwable throwable2;
            block4: {
                try {
                    if (!z.x()) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                z.G();
                return;
            }
            throw throwable2;
        }
    }

    private static void G() {
        z.t();
        s1.T("overlay-settled");
        s1.l();
    }

    public static AlertDialog.Builder H(AlertDialog.Builder builder) {
        String string2 = Config.vSpaceReal ? Config.F : b2.f(2131296280);
        builder = builder.setCustomTitle(Tools.g0(2131296459));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Tools.L1(Tools.N1(2131296458), string2, string2, string2, string2));
        stringBuilder.append(":\nhttps://productforums.google.com/forum/#!topic/translate/1Pywh5vI1kE\n\n");
        stringBuilder.append(Tools.N1(2131297101));
        stringBuilder.append(":\n");
        stringBuilder.append(Tools.removeNewLinesChars("kwwsv=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25730krz0wr0xvh0jdphjxdugldq0zlwkrxw0iordw0zlqgrz0jdphjxdugldq2"));
        return builder.setMessage((CharSequence)stringBuilder.toString()).setNegativeButton((CharSequence)b2.f(2131296836), null);
    }

    private void I() {
        AlertDialog.Builder builder = z.H(android.ext.f.c((Context)this.a));
        builder.setPositiveButton((CharSequence)b2.f(2131296962), (DialogInterface.OnClickListener)new r.n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf2:7360nqrzq0sureohpv2Bgr@ilqgFrpphqw)frpphqw@76<88"));
        if (Build.VERSION.SDK_INT >= 23) {
            builder.setNeutralButton((CharSequence)b2.f(2131296455), new DialogInterface.OnClickListener(this){
                final z a;
                {
                    this.a = z3;
                }

                public void onClick(DialogInterface object, int n3) {
                    Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("package:");
                    object = Config.vSpaceReal ? Config.E : Tools.C0();
                    stringBuilder.append((String)object);
                    intent.setData(Uri.parse((String)stringBuilder.toString()));
                    this.a.a.startActivity(intent);
                }
            });
        }
        n2.i(new Runnable(this, builder){
            final AlertDialog.Builder a;
            final z b;
            {
                this.b = z3;
                this.a = builder;
            }

            @Override
            public void run() {
                try {
                    AlertDialog alertDialog = this.a.create();
                    android.ext.f.w(alertDialog);
                    Tools.u1(alertDialog);
                }
                catch (Throwable throwable) {
                    e1.l("Failed show float dialog", throwable);
                }
            }
        });
    }

    private static void K(Activity activity, boolean bl, int n3) {
        n2.i(new Runnable(activity, bl, n3){
            final Activity a;
            final boolean b;
            final int c;
            {
                this.a = activity;
                this.b = bl;
                this.c = n3;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            @Override
            public void run() {
                Throwable throwable2;
                block9: {
                    if (!z.j(this.a) || this.b && !z.s(this.c, true)) break block9;
                    // MONITOREXIT : android.ext.z.class
                    try {
                        Object object = android.ext.f.c((Context)this.a).setCustomTitle(Tools.g0(2131296459)).setMessage(2131296405);
                        DialogInterface.OnDismissListener onDismissListener = b2.f(2131296963);
                        Object object2 = new DialogInterface.OnClickListener(this){
                            final a a;
                            {
                                this.a = a4;
                            }

                            public void onClick(DialogInterface dialogInterface, int n3) {
                                if (z.x()) {
                                    z.F();
                                }
                            }
                        };
                        onDismissListener = object.setNegativeButton((CharSequence)onDismissListener, (DialogInterface.OnClickListener)object2);
                        object = b2.f(2131296836);
                        object2 = new DialogInterface.OnClickListener(this){
                            final a a;
                            {
                                this.a = a4;
                            }

                            /*
                             * Enabled aggressive block sorting
                             * Enabled unnecessary exception pruning
                             * Enabled aggressive exception aggregation
                             * Converted monitor instructions to comments
                             * Lifted jumps to return sites
                             */
                            public void onClick(DialogInterface dialogInterface, int n3) {
                                dialogInterface = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("package:");
                                stringBuilder.append(Tools.C0());
                                dialogInterface.setData(Uri.parse((String)stringBuilder.toString()));
                                // MONITORENTER : android.ext.z.class
                                boolean bl = z.x();
                                if (bl) {
                                    z.g();
                                    s1.x();
                                }
                                try {
                                    this.a.a.startActivityForResult((Intent)dialogInterface, 0);
                                    return;
                                }
                                catch (Throwable throwable) {
                                    e1.l("Failed call intent", throwable);
                                    if (!bl) return;
                                    s1.g();
                                }
                            }
                        };
                        object = onDismissListener.setPositiveButton((CharSequence)object, (DialogInterface.OnClickListener)object2).create();
                        onDismissListener = new DialogInterface.OnDismissListener(this){
                            final a a;
                            {
                                this.a = a4;
                            }

                            public void onDismiss(DialogInterface dialogInterface) {
                                if (z.x()) {
                                    z.h(false);
                                }
                            }
                        };
                        android.ext.f.k((AlertDialog)object, onDismissListener);
                        if (!z.r(this.a, this.b, this.c, (DialogInterface)object)) {
                            return;
                        }
                        android.ext.f.w((AlertDialog)object);
                        return;
                    }
                    catch (Throwable throwable2) {}
                }
                try {
                    z.q(this.a);
                    // MONITOREXIT : android.ext.z.class
                    return;
                }
                catch (Throwable throwable3) {}
                throw throwable3;
                e1.l("Failed show float dialog", throwable2);
                z.q(this.a);
                if (!this.b) return;
                if (!z.x()) return;
                z.F();
            }
        });
    }

    private void L(View view, int n3) {
        this.M(view, n3, m2.b(), m2.a() | 0x100, 0, 0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void M(View object, int n3, int n4, int n5, int n6, int n7) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = n4;
        layoutParams.width = n3;
        layoutParams.height = n3;
        layoutParams.format = -2;
        layoutParams.flags = n5;
        layoutParams.alpha = 1.0f;
        layoutParams.x = n6;
        layoutParams.y = n7;
        layoutParams.gravity = 51;
        object = new Runnable(this, (View)object, layoutParams){
            final View a;
            final WindowManager.LayoutParams b;
            final z c;
            {
                this.c = z3;
                this.a = view;
                this.b = layoutParams;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void run() {
                try {
                    Tools.f(this.a, this.b);
                }
                catch (Throwable throwable) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed show test view(");
                    stringBuilder.append(this.b.type);
                    stringBuilder.append(", ");
                    stringBuilder.append(this.b.flags);
                    stringBuilder.append("): ");
                    stringBuilder.append(this.a);
                    stringBuilder.append("; ");
                    stringBuilder.append(this.b);
                    e1.l(stringBuilder.toString(), throwable);
                }
                synchronized (this) {
                    this.notify();
                    return;
                }
            }
        };
        synchronized (object) {
            n2.i((Runnable)object);
            object.wait();
            return;
        }
    }

    static /* synthetic */ int g() {
        int n3 = i;
        i = n3 + 1;
        return n3;
    }

    static /* synthetic */ boolean h(boolean bl) {
        g = bl;
        return bl;
    }

    private static boolean j(Activity activity) {
        if (activity != null && activity == r.n) {
            if (activity.isFinishing()) {
                return false;
            }
            return activity.isDestroyed() ^ true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean k(Context var0) {
        block9: {
            var2_3 = var3_2 = Tools.m((Context)var0);
            if (var3_2 == false) return var2_3;
            var2_3 = var3_2;
            if (Config.vSpaceReal == false) return var2_3;
            var1_4 = Process.myUid();
            var5_5 = true;
            var4_6 = var3_2;
            try {
                var6_7 = Settings.class.getDeclaredMethod("isCallingPackageAllowedToDrawOverlays", new Class[]{Context.class, Integer.TYPE, String.class, Boolean.TYPE});
                var4_6 = var3_2;
                var6_7.setAccessible(true);
                var4_6 = var3_2;
                var7_9 = var6_7.invoke(null, new Object[]{var0, var1_4, Config.E, Boolean.FALSE});
                var4_6 = var3_2;
                var2_3 = var3_2;
                if (var7_9 instanceof Boolean) {
                    var4_6 = var3_2;
                    var2_3 = var3_2;
                    if (!((Boolean)var7_9).booleanValue()) {
                        var2_3 = false;
                    }
                }
                var4_6 = var2_3;
                var4_6 = var2_3;
                var6_7 = new StringBuilder();
                var4_6 = var2_3;
                var6_7.append("canDrawOverlays extended 1: ");
                var4_6 = var2_3;
                var6_7.append(var7_9);
                var4_6 = var2_3;
                e1.d(var6_7.toString());
                break block9;
            }
            catch (Throwable var6_8) {}
            e1.s("Failed check canDrawOverlays", var6_8);
            var2_3 = var4_6;
        }
        var3_2 = var2_3;
        try {
            block10: {
                var1_4 = ((AppOpsManager)var0.getSystemService("appops")).checkOpNoThrow("android:system_alert_window", var1_4, Config.E);
                var4_6 = var5_5;
                if (var1_4 == 0) break block10;
                if (var1_4 != 3) ** GOTO lbl-1000
                var3_2 = var2_3;
                if (Tools.B0().checkPermission("android.permission.SYSTEM_ALERT_WINDOW", Config.E) == 0) {
                    var4_6 = var5_5;
                } else lbl-1000:
                // 2 sources

                {
                    var4_6 = false;
                }
            }
            if (!var4_6) {
                var2_3 = false;
            }
            var3_2 = var2_3;
            var3_2 = var2_3;
            var0 = new StringBuilder();
            var3_2 = var2_3;
            var0.append("canDrawOverlays extended 2: ");
            var3_2 = var2_3;
            var0.append(var4_6);
            var3_2 = var2_3;
            var0.append(' ');
            var3_2 = var2_3;
            var0.append(var1_4);
            var3_2 = var2_3;
            e1.d(var0.toString());
            return var2_3;
        }
        catch (Throwable var0_1) {}
        e1.s("Failed check canDrawOverlays", var0_1);
        return var3_2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void m() {
        int n3;
        if (Build.VERSION.SDK_INT < 23) return;
        r r3 = r.n;
        if (r3 == null) {
            return;
        }
        boolean bl = z.x();
        synchronized (z.class) {
            n3 = i;
        }
        new g0(new Runnable(r3, bl, n3){
            final Activity a;
            final boolean b;
            final int c;
            {
                this.a = activity;
                this.b = bl;
                this.c = n3;
            }

            @Override
            public void run() {
                z.o(this.a, this.b, this.c);
            }
        }, "CheckFloatingWindowAPI").start();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void o(Activity var0, boolean var1_4, int var2_5) {
        var5_6 = z.k((Context)var0);
        var6_7 = new StringBuilder();
        var6_7.append("canDrawOverlays: ");
        var6_7.append(var5_6);
        e1.d(var6_7.toString());
        var3_8 = var5_6 != false ? 1 : z.A(var0);
        var3_8 = z.C(var5_6, var3_8);
        if (z.j(var0) == false) return;
        if (var1_4 != z.x()) return;
        if (z.B(var2_5, var1_4)) {
            return;
        }
        var4_9 = false;
        if (!var1_4) {
            z.f = null;
            z.g = false;
        }
        if (var3_8 != 2) ** GOTO lbl48
        z.e = true;
        if (!var1_4) ** GOTO lbl-1000
        ** synchronized (z.class)
        {
            catch (Throwable var0_1) {}
        }
lbl-1000:
        // 1 sources

        {
            if (!z.s(var2_5, var1_4)) {
                return;
            }
            if (z.f != var0) {
                z.f = var0;
                z.g = true;
                var3_8 = 1;
            } else if (!z.g) {
                var3_8 = 0;
                var4_9 = true;
            } else {
                var3_8 = 0;
            }
            if (var4_9) {
                z.G();
            }
            // MONITOREXIT @DISABLED, blocks:[1, 7] lbl40 : MonitorExitStatement: MONITOREXIT : android.ext.z.class
            if (var3_8 == 0) return;
        }
        s1.T("overlay-shown");
        z.K(var0, true, var2_5);
        return;
lbl-1000:
        // 1 sources

        {
            block24: {
                z.K(var0, false, 0);
                return;
lbl48:
                // 1 sources

                if (var3_8 == 3) {
                    return;
                }
                if (z.z(var3_8)) {
                    e1.d("overlay usable by probe");
                    Tools.h1();
                }
                if (!var1_4) ** GOTO lbl69
                synchronized (z.class) {
                    try {
                        if (!z.s(var2_5, true)) {
                            return;
                        }
                    }
                    catch (Throwable var0_3) {
                        break block24;
                    }
                    if (z.e) {
                        z.e = false;
                    }
                    z.G();
                    return;
                }
            }
            throw var0_3;
lbl69:
            // 1 sources

            if (z.e == false) return;
            z.e = false;
            ConfigListAdapter.m();
            return;
            e1.a(var0_1);
            return;
            {
                catch (Throwable var0_2) {}
                throw var0_2;
            }
        }
    }

    private void p(boolean bl) {
        AlertDialog alertDialog = c;
        if (alertDialog != null) {
            int n3 = ((View[])alertDialog).length;
            for (int i3 = 0; i3 < n3; ++i3) {
                AlertDialog alertDialog2 = alertDialog[i3];
                if (alertDialog2 == null) continue;
                Tools.m1((View)alertDialog2);
            }
            c = null;
        }
        if (bl && (alertDialog = d) != null) {
            Tools.D((DialogInterface)alertDialog);
            d = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void q(Activity activity) {
        synchronized (z.class) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (f != activity) break block3;
                        f = null;
                        g = false;
                        h = null;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean r(Activity activity, boolean bl, int n3, DialogInterface dialogInterface) {
        synchronized (z.class) {
            Throwable throwable2;
            block6: {
                if (bl) {
                    try {
                        if (!z.s(n3, true)) {
                            z.q(activity);
                            return false;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                if (bl) {
                    h = dialogInterface;
                }
                return true;
            }
            throw throwable2;
        }
    }

    private static boolean s(int n3, boolean bl) {
        bl = !z.B(n3, bl) && bl == z.x();
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static void t() {
        // MONITORENTER : android.ext.z.class
        Activity activity = f;
        DialogInterface dialogInterface = h;
        // MONITOREXIT : android.ext.z.class
        if (dialogInterface == null) {
            return;
        }
        n2.i(new Runnable(activity, dialogInterface){
            final Activity a;
            final DialogInterface b;
            {
                this.a = activity;
                this.b = dialogInterface;
            }

            @Override
            public void run() {
                z.D(this.a, this.b);
            }
        });
    }

    private int v(Random random2) {
        return Color.rgb((int)(random2.nextInt(127) + 64), (int)(random2.nextInt(127) + 64), (int)(random2.nextInt(127) + 64));
    }

    private void w(MotionEvent motionEvent, boolean bl) {
        if (u.b == null) {
            return;
        }
        u.b.sendPointerSync(motionEvent);
        UiAutomation uiAutomation = u.b.getUiAutomation();
        if (uiAutomation != null) {
            uiAutomation.injectInputEvent((InputEvent)motionEvent, bl);
        }
    }

    private static boolean x() {
        boolean bl = s1.u() && s1.O() == 3;
        return bl;
    }

    static boolean y() {
        boolean bl = z.x() && g;
        return bl;
    }

    static boolean z(int n3) {
        boolean bl;
        boolean bl2 = bl = true;
        if (n3 != 0) {
            bl2 = n3 == 1 ? bl : false;
        }
        return bl2;
    }

    public void E(int n3, int n4) {
        try {
            Tools.X1(Tools.I(new String[]{"input", "tap", Integer.toString(n3), Integer.toString(n4)}), 15);
        }
        catch (IOException iOException) {
            e1.s("sendClick", iOException);
        }
        long l3 = SystemClock.uptimeMillis();
        float f4 = n3;
        float f5 = n4;
        MotionEvent motionEvent = MotionEvent.obtain((long)l3, (long)l3, (int)0, (float)f4, (float)f5, (int)0);
        MotionEvent motionEvent2 = MotionEvent.obtain((long)l3, (long)l3, (int)1, (float)f4, (float)f5, (int)0);
        motionEvent.setSource(4098);
        motionEvent2.setSource(4098);
        this.w(motionEvent, true);
        this.w(motionEvent2, true);
        motionEvent.recycle();
        motionEvent2.recycle();
    }

    public void J() {
        AlertDialog alertDialog = android.ext.f.c((Context)this.a).setNegativeButton((CharSequence)b2.f(2131296311), (DialogInterface.OnClickListener)this).setCancelable(true).create();
        alertDialog.setOnDismissListener((DialogInterface.OnDismissListener)this);
        alertDialog.setCanceledOnTouchOutside(false);
        alertDialog.setCancelable(true);
        alertDialog.setOnShowListener((DialogInterface.OnShowListener)this);
        d = alertDialog;
        n2.i(new Runnable(this, alertDialog){
            final AlertDialog a;
            final z b;
            {
                this.b = z3;
                this.a = alertDialog;
            }

            @Override
            public void run() {
                try {
                    android.ext.f.w(this.a);
                }
                catch (Throwable throwable) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed show dialog: ");
                    stringBuilder.append(this.a);
                    e1.l(stringBuilder.toString(), throwable);
                }
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void l() {
        Throwable throwable2;
        block7: {
            View view;
            int n3;
            int n4;
            try {
                n4 = this.v(Tools.a);
                n3 = (int)Tools.G(128.0f);
                view = new View(MainService.context);
                view.setBackgroundColor(n4);
                view.setOnClickListener((View.OnClickListener)this);
            }
            catch (Throwable throwable2) {}
            try {
                this.L(view, n3);
                Thread.sleep(1000L);
                int[] nArray = new int[]{0, 0};
                view.getLocationOnScreen(nArray);
                n4 = n3 >> 1;
                this.E(nArray[0] + n4, nArray[1] + n4);
                Thread.sleep(1000L);
            }
            catch (Throwable throwable3) {
                Tools.m1(view);
                throw throwable3;
            }
            Tools.m1(view);
            if (b) {
                Tools.H1(2131296322);
                return;
            }
            break block7;
            this.I();
            return;
        }
        e1.l("Failed check floating window", throwable2);
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void n() {
        Object object;
        block13: {
            void var11_7;
            View[] viewArray;
            block12: {
                int n3;
                int n4;
                int n5;
                int n6;
                int n7;
                Object object2;
                Random random2;
                object = null;
                try {
                    random2 = Tools.a;
                    object2 = new DisplayMetrics();
                    ((WindowManager)Tools.f0().getSystemService("window")).getDefaultDisplay().getMetrics((DisplayMetrics)object2);
                    n7 = Tools.H();
                    n6 = ((DisplayMetrics)object2).widthPixels / n7 / 2 * 2;
                    n5 = ((DisplayMetrics)object2).heightPixels / n7 * n6;
                    if (n5 > 100) {
                        n5 = 100;
                    }
                    viewArray = new StringBuilder();
                    viewArray.append("checkAll: ");
                    viewArray.append(n7);
                    viewArray.append("; ");
                    viewArray.append(n6);
                    viewArray.append("; ");
                    viewArray.append(n5);
                    viewArray.append("; ");
                    viewArray.append(n7);
                    viewArray.append("; ");
                    viewArray.append(object2);
                    e1.d(viewArray.toString());
                    n4 = n5 / 2;
                    n3 = n6 / 2;
                    viewArray = new View[n5];
                    n6 = 0;
                }
                catch (Throwable throwable) {
                    viewArray = object;
                    break block12;
                }
                while (true) {
                    block14: {
                        int n8;
                        block15: {
                            int n9;
                            int n10;
                            int n11;
                            object = viewArray;
                            if (n6 >= n5) break block13;
                            try {
                                n11 = n6 / n4 == 0 ? 1 : 0;
                                n8 = n6 % n4 + 2000;
                                n10 = n11 != 0 ? 0 : 32;
                                n10 |= 8;
                                n9 = this.v(random2);
                                Context context = MainService.context.getApplicationContext();
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append(Integer.toString(n6 % n4));
                                object = n11 != 0 ? "" : "'";
                                stringBuilder.append((String)object);
                                object2 = new k(context, stringBuilder.toString(), n8, n10);
                                object2.setBackgroundColor(n9);
                                object2.setOnClickListener((View.OnClickListener)this);
                                n11 = n11 != 0 ? 0 : n3;
                            }
                            catch (Throwable throwable) {
                                break;
                            }
                            n9 = n6 % n4 / n3;
                            try {
                                this.M((View)object2, n7, n8, n10, (n6 % n3 + n11) * n7, n9 * n7);
                                viewArray[n6] = object2;
                                break block14;
                            }
                            catch (Throwable throwable) {
                                break block15;
                            }
                            catch (Throwable throwable) {
                                // empty catch block
                            }
                        }
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Failed show: ");
                        ((StringBuilder)object2).append(n8);
                        e1.l(((StringBuilder)object2).toString(), (Throwable)object);
                    }
                    ++n6;
                }
            }
            e1.l("Failed checkAll floating window", (Throwable)var11_7);
            object = viewArray;
        }
        this.p(false);
        c = object;
    }

    public void onClick(DialogInterface dialogInterface, int n3) {
        this.p(true);
    }

    public void onClick(View object) {
        Object object2 = new StringBuilder();
        object2.append("TestButton: onClick for ");
        object2.append(object);
        e1.g(object2.toString(), new RuntimeException());
        if (object instanceof k) {
            object2 = (k)((Object)object);
            object = new StringBuilder();
            ((StringBuilder)object).append("onClick for ");
            ((StringBuilder)object).append(((k)((Object)object2)).c);
            e1.d(((StringBuilder)object).toString());
            Config.b((int)2131034165).d = ((k)((Object)object2)).d;
            Config.b((int)2131034164).d = ((k)((Object)object2)).e;
            Config.k();
            this.p(true);
            r.I();
            return;
        }
        b = true;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.p(true);
    }

    public void onShow(DialogInterface dialogInterface) {
        new g0(new Runnable(this){
            final z a;
            {
                this.a = z3;
            }

            @Override
            public void run() {
                this.a.n();
            }
        }, "ChangeFloatingWindow").start();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("dbg: ");
        stringBuilder.append(view);
        stringBuilder.append(' ');
        stringBuilder.append(motionEvent);
        e1.g(stringBuilder.toString(), new RuntimeException());
        return false;
    }

    public void u() {
        new g0(new Runnable(this){
            final z a;
            {
                this.a = z3;
            }

            @Override
            public void run() {
                this.a.l();
            }
        }, "CheckFloatingWindow").start();
    }

    private static class k
    extends TextView
    implements View.OnTouchListener {
        String c;
        int d;
        int e;

        public k(Context context, String string2, int n3, int n4) {
            super(context);
            this.c = string2;
            this.d = n3;
            this.e = n4;
            this.setTextColor(Color.rgb((int)255, (int)255, (int)255));
            this.setText(string2);
            this.setOnTouchListener(this);
        }

        protected boolean dispatchGenericFocusedEvent(MotionEvent motionEvent) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TestButton: dispatchGenericFocusedEvent for ");
            stringBuilder.append(this.c);
            stringBuilder.append(": ");
            stringBuilder.append(motionEvent);
            e1.g(stringBuilder.toString(), new RuntimeException());
            return super.dispatchGenericFocusedEvent(motionEvent);
        }

        public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TestButton: dispatchGenericMotionEvent for ");
            stringBuilder.append(this.c);
            stringBuilder.append(": ");
            stringBuilder.append(motionEvent);
            e1.g(stringBuilder.toString(), new RuntimeException());
            return super.dispatchGenericMotionEvent(motionEvent);
        }

        protected boolean dispatchGenericPointerEvent(MotionEvent motionEvent) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TestButton: dispatchGenericPointerEvent for ");
            stringBuilder.append(this.c);
            stringBuilder.append(": ");
            stringBuilder.append(motionEvent);
            e1.g(stringBuilder.toString(), new RuntimeException());
            return super.dispatchGenericPointerEvent(motionEvent);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TestButton: dispatchKeyEvent for ");
            stringBuilder.append(this.c);
            stringBuilder.append(": ");
            stringBuilder.append(keyEvent);
            e1.g(stringBuilder.toString(), new RuntimeException());
            return super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TestButton: dispatchTouchEvent for ");
            stringBuilder.append(this.c);
            stringBuilder.append(": ");
            stringBuilder.append(motionEvent);
            e1.g(stringBuilder.toString(), new RuntimeException());
            return super.dispatchTouchEvent(motionEvent);
        }

        public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TestButton: dispatchTrackballEvent for ");
            stringBuilder.append(this.c);
            stringBuilder.append(": ");
            stringBuilder.append(motionEvent);
            e1.g(stringBuilder.toString(), new RuntimeException());
            return super.dispatchTrackballEvent(motionEvent);
        }

        public boolean onGenericMotionEvent(MotionEvent motionEvent) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TestButton: onGenericMotionEvent for ");
            stringBuilder.append(this.c);
            stringBuilder.append(": ");
            stringBuilder.append(motionEvent);
            e1.g(stringBuilder.toString(), new RuntimeException());
            return super.onGenericMotionEvent(motionEvent);
        }

        public boolean onTouch(View object, MotionEvent motionEvent) {
            object = new StringBuilder();
            ((StringBuilder)object).append("TestButton: onTouch for ");
            ((StringBuilder)object).append(this.c);
            ((StringBuilder)object).append(": ");
            ((StringBuilder)object).append(motionEvent);
            e1.g(((StringBuilder)object).toString(), new RuntimeException());
            return false;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TestButton: onTouchEvent for ");
            stringBuilder.append(this.c);
            stringBuilder.append(": ");
            stringBuilder.append(motionEvent);
            e1.g(stringBuilder.toString(), new RuntimeException());
            return super.onTouchEvent(motionEvent);
        }
    }
}

