/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.d;
import a.g;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.ext.Config;
import android.ext.DefensiveURLSpan;
import android.ext.EditText;
import android.ext.MainService;
import android.ext.b2;
import android.ext.c;
import android.ext.e1;
import android.ext.e2;
import android.ext.f;
import android.ext.g0;
import android.ext.i;
import android.ext.k;
import android.ext.m2;
import android.ext.n0;
import android.ext.n2;
import android.ext.p2;
import android.ext.q2;
import android.ext.r;
import android.ext.r2;
import android.ext.s2;
import android.ext.t1;
import android.ext.y0;
import android.fix.FrameLayout;
import android.fix.ScrollView;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.lang.ProcessBuilder;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Process;
import android.system.Os;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.format.Formatter;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import d.a;
import d.e;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Tools {
    public static final Random a = new Random(System.currentTimeMillis());
    private static volatile int b;
    private static float c;
    private static volatile int d;
    static volatile int e;
    private static Pattern f;
    static InputMethodManager g;
    private static String h;
    private static String i;
    private static String j;
    private static volatile PackageManager k;
    private static volatile String l;
    private static String m;
    private static final b0 n;
    private static int[] o;
    private static volatile Object p;
    private static volatile WeakReference q;
    private static int r;
    private static WeakReference s;
    private static volatile boolean t;
    private static volatile byte u;
    static volatile String[] v;
    private static volatile int w;

    static {
        int n3 = Build.VERSION.SDK_INT >= 23 ? -1 : 1;
        b = n3;
        c = 0.0f;
        d = -1;
        e = -1;
        f = Pattern.compile("(\\d+)");
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = new b0();
        o = new int[]{2131297055, 60, 2131297054, 60, 2131297053, 24, 2131297052, 365, 2131297056, -1};
        p = null;
        q = new WeakReference<Object>(null);
        r = 0;
        s = new WeakReference<Object>(null);
        t = false;
        u = 0;
        v = null;
        w = -1;
    }

    public static void A(String string2, boolean bl) {
        if (string2 == null) {
            return;
        }
        n2.i(new Runnable(string2, bl){
            final String a;
            final boolean b;
            {
                this.a = string2;
                this.b = bl;
            }

            @Override
            public void run() {
                String string2 = this.a.replace(" ", " ");
                if (this.b) {
                    y0.b(string2, 1);
                }
                try {
                    ((ClipboardManager)MainService.context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((CharSequence)string2, (CharSequence)string2));
                    Tools.H1(2131296337);
                }
                catch (Throwable throwable) {
                    e1.l("Failed to copy text to the clipboard", throwable);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Text: ");
                    stringBuilder.append(string2);
                    e1.d(stringBuilder.toString());
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(b2.f(2131296435));
                    stringBuilder.append(' ');
                    stringBuilder.append(throwable.getMessage());
                    Tools.J1(stringBuilder.toString());
                }
            }
        });
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static PackageInfo A0(String string2, int n3) {
        Throwable throwable622;
        PackageManager packageManager;
        block19: {
            Object object;
            block17: {
                Object object2;
                Object var5_9;
                boolean bl;
                block15: {
                    block18: {
                        block16: {
                            bl = android.ext.a0.i(string2);
                            packageManager = null;
                            var5_9 = null;
                            if (bl) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Failed getPackageInfo, isBuggedPackage: ");
                                stringBuilder.append(string2);
                                e1.i(stringBuilder.toString());
                                return packageManager;
                            }
                            packageManager = Tools.B0();
                            if (packageManager == null) break block18;
                            bl = android.ext.a0.a(string2, "pkg_info");
                            {
                                catch (Throwable throwable2) {}
                            }
                            packageManager = packageManager.getPackageInfo(string2, n3);
                            try {
                                android.ext.a0.b(bl);
                                break block15;
                            }
                            catch (Throwable throwable3) {
                                break block16;
                            }
                            catch (Throwable throwable4) {
                                try {
                                    android.ext.a0.b(bl);
                                    throw throwable4;
                                }
                                catch (Throwable throwable5) {}
                                {
                                    object2 = null;
                                    object = packageManager;
                                    packageManager = object2;
                                }
                            }
                        }
                        if (object instanceof PackageManager.NameNotFoundException) throw (PackageManager.NameNotFoundException)object;
                        e1.l("Failed getPackageInfo", (Throwable)object);
                        break block15;
                    }
                    packageManager = null;
                }
                if (packageManager != null) return packageManager;
                Object object3 = Tools.u0();
                if (object3 == null) return packageManager;
                try {
                    object2 = object3.getClass();
                    Class<Integer> clazz = Integer.TYPE;
                    y y3 = new y((Class)object2, "getPackageInfo", new Class[]{String.class, clazz, clazz}, object3, new Object[]{string2, n3, 0});
                    object = new y((Class)object2, "getPackageInfo", new Class[]{String.class, clazz}, object3, new Object[]{string2, n3});
                    object2 = Tools.x0(object2, new y[]{y3, object});
                    object = var5_9;
                    if (object2 == null) break block17;
                    bl = android.ext.a0.a(string2, "pkg_info2");
                }
                catch (Throwable throwable622) {}
                try {
                    object = ((y)object2).b();
                }
                catch (Throwable throwable7) {
                    android.ext.a0.b(bl);
                    throw throwable7;
                }
                android.ext.a0.b(bl);
                if (object == null) {
                    object = new PackageManager.NameNotFoundException(string2);
                    throw object;
                }
                break block17;
                break block19;
            }
            if (!(object instanceof PackageInfo)) return packageManager;
            return (PackageInfo)object;
        }
        if (throwable622 instanceof PackageManager.NameNotFoundException) throw (PackageManager.NameNotFoundException)throwable622;
        e1.l("Failed getPackageInfo", throwable622);
        return packageManager;
    }

    public static void A1(ListView listView, a0 a02) {
        if (a02 == null) {
            return;
        }
        Tools.B1(listView, a02.a, a02.b);
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public static void B(String var0, StringBuilder var1_1) {
        block18: {
            block21: {
                block20: {
                    var8_2 = var1_1 == null ? new StringBuilder() : var1_1;
                    var8_2.append("\nActivities:\n");
                    var7_5 = var8_2;
                    if (var1_1 == null) {
                        e1.d(var8_2.toString().trim());
                        var7_5 = new StringBuilder();
                    }
                    try {
                        var8_2 = Tools.A0(var0, 1);
                    }
                    catch (Throwable var8_3) {
                        var8_2 = null;
                    }
                    if (var8_2 != null) break block20;
                    var8_2 = new StringBuilder();
                    var8_2.append("Null for: ");
                    var8_2.append(var0);
                    var7_5.append(var8_2.toString());
                    if (var1_1 == null) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            e1.d(var7_5.toString().trim());
                            break block18;
                            break;
                        }
                    }
                    break block18;
                }
                var9_6 = var8_2.activities;
                if (var9_6 != null) break block21;
                var7_5.append("Null");
                if (var1_1 == null) {
                    ** continue;
                }
                break block18;
            }
            for (StringBuilder var8_2 : var9_6) {
                block19: {
                    var7_5.append((Object)var8_2);
                    if (var8_2 == null) break block19;
                    var7_5.append('\n');
                    for (ComponentName var11_14 : ActivityInfo.class.getFields()) {
                        var6_11 = var11_14.getModifiers();
                        if (!Modifier.isPublic(var6_11) || Modifier.isStatic(var6_11)) continue;
                        var7_5.append(var11_14.getName());
                        var7_5.append(": ");
                        {
                            catch (Throwable var10_13) {}
                        }
                        try {
                            var7_5.append(var11_14.get(var8_2));
                            ** GOTO lbl62
                        }
                        catch (Throwable var11_15) {
                            var7_5.append(var11_15);
lbl62:
                            // 2 sources

                            var7_5.append("; ");
                            continue;
                        }
                        var7_5.append(var10_13);
                        break;
                    }
                }
                try {
                    var10_12 = new ComponentName(var0, var8_2.name);
                    var7_5.append("enabled: ");
                    var7_5.append(Tools.B0().getComponentEnabledSetting(var10_12));
                    var7_5.append("; ");
                }
                catch (Throwable var8_4) {
                    var7_5.append(var8_4);
                }
                var7_5.append('\n');
                var8_2 = var7_5;
                if (var1_1 == null) {
                    e1.d(var7_5.toString().trim());
                    var8_2 = new StringBuilder();
                }
                var7_5 = var8_2;
            }
        }
    }

    public static PackageManager B0() {
        if (k == null && n.b(1)) {
            try {
                k = android.ext.r.n.getPackageManager();
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
            n.a(1);
        }
        if (k == null && n.b(2)) {
            try {
                k = android.ext.r.n.getApplication().getPackageManager();
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
            n.a(2);
        }
        if (k == null && n.b(4)) {
            try {
                k = android.ext.r.n.getApplicationContext().getPackageManager();
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
            n.a(4);
        }
        if (k == null && n.b(8)) {
            try {
                k = MainService.context.getPackageManager();
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
            n.a(8);
        }
        if (k == null && n.b(16)) {
            try {
                k = MainService.context.getApplicationContext().getPackageManager();
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
            n.a(16);
        }
        return k;
    }

    public static void B1(ListView listView, int n3, int n4) {
        listView.setSelectionFromTop(n3, n4);
        listView.post(new Runnable(listView, n3, n4){
            final ListView a;
            final int b;
            final int c;
            {
                this.a = listView;
                this.b = n3;
                this.c = n4;
            }

            @Override
            public void run() {
                this.a.setSelectionFromTop(this.b, this.c);
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void C(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        int n3 = 0;
        while (true) {
            block6: {
                if (n3 >= viewGroup.getChildCount()) {
                    return;
                }
                try {
                    View view = viewGroup.getChildAt(n3);
                    if (view == null) break block6;
                    view.setSoundEffectsEnabled(false);
                    if (view instanceof ViewGroup) {
                        Tools.C((ViewGroup)view);
                    }
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {}
            }
            ++n3;
        }
    }

    public static String C0() {
        String string2;
        String string3 = string2 = h;
        if (string2 == null) {
            string3 = android.ext.i.d;
        }
        return string3;
    }

    public static void C1(ListView listView, int n3) {
        listView.setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener(n3){
            final int a;
            {
                this.a = n3;
            }

            public void onChildViewAdded(View view, View view2) {
                block3: {
                    view = view2.findViewById(16908308);
                    if (!(view instanceof TextView)) break block3;
                    view = (TextView)view;
                    int n3 = this.a;
                    if (n3 == 0) break block3;
                    try {
                        Tools.D1((TextView)view, n3);
                    }
                    catch (Throwable throwable) {
                        e1.a(throwable);
                    }
                }
            }

            public void onChildViewRemoved(View view, View view2) {
            }
        });
    }

    public static void D(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        n2.i(new Runnable(dialogInterface){
            final DialogInterface a;
            {
                this.a = dialogInterface;
            }

            @Override
            public void run() {
                try {
                    this.a.dismiss();
                }
                catch (Throwable throwable) {
                    e1.a(throwable);
                }
            }
        });
    }

    public static int D0(java.lang.Process process) {
        int n3;
        try {
            Field field = process.getClass().getDeclaredField("pid");
            ((AccessibleObject)field).setAccessible(true);
            n3 = field.getInt(process);
            ((AccessibleObject)field).setAccessible(false);
        }
        catch (Throwable throwable) {
            n3 = -1;
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void D1(TextView textView, int n3) {
        Throwable throwable2;
        block3: {
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    r2.a(textView, n3);
                    return;
                }
            }
            catch (Throwable throwable2) {
                break block3;
            }
            textView.setTextAppearance(textView.getContext(), n3);
            return;
        }
        e1.a(throwable2);
    }

    public static void E(WeakReference weakReference) {
        if (weakReference == null) {
            return;
        }
        if ((weakReference = (AlertDialog)weakReference.get()) == null) {
            return;
        }
        Tools.D((DialogInterface)weakReference);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int E0() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("/proc/meminfo", "r");
            Matcher matcher = f.matcher(randomAccessFile.readLine());
            String string2 = "-2";
            while (true) {
                if (!matcher.find()) {
                    randomAccessFile.close();
                    return Integer.parseInt(string2);
                }
                string2 = matcher.group(1);
            }
        }
        catch (Throwable throwable) {}
        e1.s("Failed get RAM size", throwable);
        return -1;
    }

    public static void E1(View view) {
        if ((Config.B & 0x20) != 0) {
            return;
        }
        if (view == null) {
            return;
        }
        view = Tools.I0(view);
        view.setSoundEffectsEnabled(false);
        if (view instanceof ViewGroup) {
            Tools.C((ViewGroup)view);
        }
    }

    public static String F(double d4) {
        int[] nArray;
        StringBuilder stringBuilder = new StringBuilder();
        long l3 = Math.abs((long)d4);
        for (int i3 = 0; i3 < (nArray = o).length; i3 += 2) {
            long l4;
            long l5;
            int n3 = nArray[i3 + 1];
            if (n3 <= 0) {
                l5 = 0L;
                l4 = l3;
                l3 = l5;
            } else {
                l5 = n3;
                l4 = l3 / l5;
                l5 = l3 % l5;
                l3 = l4;
                l4 = l5;
            }
            if (l4 >= 0L) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.insert(0, ":");
                }
                if (i3 == 0) {
                    stringBuilder.insert(0, Tools.L1("%f", Math.abs(d4) % (double)n3).replaceFirst("\\D?0+$", ""));
                } else {
                    stringBuilder.insert(0, l4);
                }
            }
            if (l3 == 0L) break;
        }
        if (stringBuilder.length() == 0) {
            stringBuilder.insert(0, "0");
        }
        if (d4 < 0.0) {
            stringBuilder.insert(0, "-");
        }
        return stringBuilder.toString();
    }

    public static String F0(String string2) {
        String string3 = string2;
        if (v != null) {
            string3 = string2.replace(v[0], v[1]);
        }
        return string3;
    }

    private static void F1(View view, WindowManager.LayoutParams layoutParams, boolean bl) {
        Tools.Q(layoutParams);
        n2.i(new Runnable(bl, layoutParams, view){
            final boolean a;
            final WindowManager.LayoutParams b;
            final View c;
            {
                this.a = bl;
                this.b = layoutParams;
                this.c = view;
            }

            /*
             * WARNING - void declaration
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void run() {
                WindowManager.BadTokenException badTokenException3;
                block16: {
                    WindowManager.BadTokenException badTokenException22;
                    int n3;
                    block15: {
                        block10: {
                            block14: {
                                block13: {
                                    NullPointerException nullPointerException2;
                                    block12: {
                                        void var2_4;
                                        block11: {
                                            block9: {
                                                Tools.p();
                                                try {
                                                    if (!this.a) break block9;
                                                    MainService.instance.l.addView(this.c, (ViewGroup.LayoutParams)this.b);
                                                    break block10;
                                                }
                                                catch (Throwable throwable) {
                                                    break block11;
                                                }
                                                catch (NullPointerException nullPointerException2) {
                                                    break block12;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    break block11;
                                                }
                                                catch (WindowManager.BadTokenException badTokenException3) {
                                                    break block13;
                                                }
                                            }
                                            MainService.instance.l.updateViewLayout(this.c, (ViewGroup.LayoutParams)this.b);
                                            break block10;
                                        }
                                        e1.s("Fail", (Throwable)var2_4);
                                        break block10;
                                    }
                                    e1.a(nullPointerException2);
                                    break block10;
                                }
                                String string2 = badTokenException3.getMessage();
                                if (!m2.a || string2 == null || !string2.contains("permission denied") || this.b.type == m2.c()) break block16;
                                string2 = this.b;
                                n3 = ((WindowManager.LayoutParams)string2).type;
                                ((WindowManager.LayoutParams)string2).type = m2.c();
                                try {
                                    if (!this.a) break block14;
                                    MainService.instance.l.addView(this.c, (ViewGroup.LayoutParams)this.b);
                                    break block10;
                                }
                                catch (WindowManager.BadTokenException badTokenException22) {
                                    break block15;
                                }
                            }
                            MainService.instance.l.updateViewLayout(this.c, (ViewGroup.LayoutParams)this.b);
                        }
                        if (this.a) {
                            Tools.S(this.c);
                        }
                        return;
                    }
                    this.b.type = n3;
                    throw badTokenException22;
                }
                throw badTokenException3;
            }
        });
    }

    public static float G(float f4) {
        float f5;
        float f6 = f5 = c;
        if (f5 == 0.0f) {
            Context context = Tools.f0();
            f6 = f5;
            if (context != null) {
                f6 = context.getResources().getDisplayMetrics().density;
            }
        }
        f5 = f6;
        if (f6 == 0.0f) {
            f5 = 1.0f;
        }
        return f4 * f5;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Drawable G0(Drawable object, int n3) {
        Object object2;
        block5: {
            Bitmap bitmap;
            block4: {
                object2 = object;
                try {
                    int n4;
                    if (!(object instanceof BitmapDrawable)) return object2;
                    bitmap = ((BitmapDrawable)object).getBitmap();
                    object2 = object;
                    if (bitmap == null) return object2;
                    int n5 = bitmap.getWidth();
                    if (n5 > (n4 = n3 + 4)) break block4;
                    object2 = object;
                    if (bitmap.getHeight() <= n4) return object2;
                }
                catch (Throwable throwable) {
                    break block5;
                }
            }
            long l3 = System.currentTimeMillis();
            object2 = new BitmapDrawable(Tools.f0().getResources(), Bitmap.createScaledBitmap((Bitmap)bitmap, (int)n3, (int)n3, (boolean)false));
            try {
                object = new StringBuilder();
                ((StringBuilder)object).append("getResized: ");
                ((StringBuilder)object).append(bitmap.getWidth());
                ((StringBuilder)object).append('x');
                ((StringBuilder)object).append(bitmap.getHeight());
                ((StringBuilder)object).append(" -> ");
                ((StringBuilder)object).append(n3);
                ((StringBuilder)object).append('x');
                ((StringBuilder)object).append(n3);
                ((StringBuilder)object).append(" in ");
                ((StringBuilder)object).append(System.currentTimeMillis() - l3);
                e1.d(((StringBuilder)object).toString());
                return object2;
            }
            catch (Throwable throwable) {
                bitmap = object2;
                object2 = throwable;
                object = bitmap;
            }
        }
        e1.a((Throwable)object2);
        return object;
    }

    public static void G1(View view, float f4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int)f4;
            view.setLayoutParams(layoutParams);
        }
    }

    public static int H() {
        if (d < 0) {
            d = (int)Tools.G(48.0f);
        }
        return d;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String H0() {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = 0;
        while (n3 < 4) {
            int n4 = a.nextInt(63);
            n4 = n4 < 10 ? (n4 += 48) : (n4 < 36 ? (n4 += 55) : (n4 += 61));
            stringBuilder.append((char)n4);
            ++n3;
        }
        return stringBuilder.toString();
    }

    public static void H1(int n3) {
        Tools.K1(b2.f(n3), 1);
    }

    public static java.lang.Process I(String[] stringArray) {
        return Tools.K(stringArray, null, null);
    }

    public static View I0(View view) {
        View view2;
        View view3 = view2 = view.getRootView();
        if (view2 == null) {
            while ((view3 = view.getParent()) != null && view3 instanceof View) {
                view = view3;
            }
            view3 = view;
        }
        return view3;
    }

    public static void I1(int n3, int n4) {
        Tools.K1(b2.f(n3), n4);
    }

    public static java.lang.Process J(String[] stringArray, String[] stringArray2) {
        return Tools.K(stringArray, stringArray2, null);
    }

    public static a0 J0(ListView listView) {
        View view;
        int n3 = listView.getFirstVisiblePosition();
        int n4 = 0;
        try {
            view = listView.getChildAt(0);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            view = null;
        }
        if (view != null) {
            n4 = view.getTop() - listView.getPaddingTop();
        }
        return new a0(n3, n4);
    }

    public static void J1(String string2) {
        Tools.K1(string2, 1);
    }

    public static java.lang.Process K(String[] objectArray, String[] stringArray, File file) {
        if (!t) {
            try {
                java.lang.Process process = Runtime.getRuntime().exec((String[])objectArray, stringArray, file);
                return process;
            }
            catch (Throwable throwable) {
                CharSequence charSequence = throwable.getMessage();
                if (!(((String)charSequence).contains("nknown error") || ((String)charSequence).contains("xec failed") || ((String)charSequence).contains("ead failed"))) {
                    throw throwable;
                }
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("Failed exec: ");
                ((StringBuilder)charSequence).append(Arrays.toString(objectArray));
                ((StringBuilder)charSequence).append("; ");
                ((StringBuilder)charSequence).append(stringArray);
                ((StringBuilder)charSequence).append("; ");
                ((StringBuilder)charSequence).append(file);
                e1.s(((StringBuilder)charSequence).toString(), throwable);
            }
        }
        objectArray = ProcessBuilder.c((String[])objectArray, stringArray, file);
        t = true;
        return objectArray;
    }

    /*
     * Unable to fully structure code
     */
    public static String K0() {
        block6: {
            block7: {
                block5: {
                    try {
                        var1 = Environment.getExternalStorageDirectory().getAbsolutePath();
                    }
                    catch (Throwable var1_1) {
                        e1.l("Fail get sdcard path", var1_1);
                        var1 = null;
                    }
                    if (var1 != null) break block5;
                    var2_2 = "/sdcard";
                    break block6;
                }
                var2_2 = var1;
                if (!var1.startsWith("/storage/emulated/0")) break block6;
                if (Tools.r != 0) break block7;
                if (Tools.c1(var1)) ** GOTO lbl-1000
                var2_2 = new StringBuilder();
                var2_2.append("/storage/emulated/legacy");
                var2_2.append(var1.substring(19));
                if (Tools.c1(var2_2.toString())) {
                    var0_3 = 1;
                } else lbl-1000:
                // 2 sources

                {
                    var0_3 = -1;
                }
                Tools.r = var0_3;
            }
            var2_2 = var1;
            if (Tools.r > 0) {
                var2_2 = new StringBuilder();
                var2_2.append("/storage/emulated/legacy");
                var2_2.append(var1.substring(19));
                var2_2 = var2_2.toString();
            }
        }
        return var2_2;
    }

    public static void K1(String string2, int n3) {
        n2.i(new Runnable(string2, n3){
            final String a;
            final int b;
            {
                this.a = string2;
                this.b = n3;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void run() {
                Throwable throwable2;
                block3: {
                    String string2;
                    Context context;
                    block2: {
                        try {
                            String string3;
                            context = p2.h();
                            string2 = string3 = this.a;
                            if (string3 != null) break block2;
                            string2 = "null";
                        }
                        catch (Throwable throwable2) {
                            break block3;
                        }
                    }
                    p2.j(Toast.makeText((Context)context, (CharSequence)b2.g(string2), (int)this.b));
                    return;
                }
                e1.s("Toast fail", throwable2);
            }
        });
    }

    public static void L(Window window, View view, boolean bl) {
        InputMethodManager inputMethodManager = (InputMethodManager)Tools.f0().getSystemService("input_method");
        int n3 = window.getAttributes().softInputMode & 0xFFFFFFF0;
        if (bl) {
            window.clearFlags(131072);
            window.setSoftInputMode(n3 | 5);
            inputMethodManager.showSoftInput(view, 0);
        } else {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            window.addFlags(131072);
            window.setSoftInputMode(n3 | 2);
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int L0(Object object) {
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        if (object == null) return n5;
        if (!(object instanceof a)) {
            if (object instanceof e) {
                object = (e)object;
                n6 = ((e)object).l();
                n4 = 0;
                while (true) {
                    n5 = n4;
                    if (n3 >= n6) return n5;
                    n5 = n4;
                    if (((e)object).a(n3)) {
                        n5 = n4 + 1;
                    }
                    ++n3;
                    n4 = n5;
                }
            }
            if (!(object instanceof boolean[])) {
                throw new IllegalArgumentException();
            }
            object = (boolean[])object;
            n6 = ((Object)object).length;
            n3 = 1;
            while (true) {
                n5 = n4;
                if (n3 >= n6 - 1) return n5;
                n5 = n4;
                if (object[n3] != false) {
                    n5 = n4 + 1;
                }
                ++n3;
                n4 = n5;
            }
        }
        object = (a)object;
        int n7 = ((a)object).i();
        n4 = 0;
        n3 = n6;
        while (true) {
            n5 = n4;
            if (n3 >= n7) return n5;
            try {
                boolean bl = ((a)object).c(n3);
                n5 = n4;
                if (bl) {
                    n5 = n4 + 1;
                }
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                n5 = n4;
            }
            ++n3;
            n4 = n5;
        }
    }

    public static String L1(String stringArray, Object ... objectArray) {
        CharSequence charSequence;
        block6: {
            try {
                charSequence = String.format(android.ext.k.f(), stringArray.replace('\uff0c', ','), objectArray);
            }
            catch (Throwable throwable) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed String.format('");
                stringBuilder.append((String)stringArray);
                stringBuilder.append("', ");
                stringBuilder.append(Arrays.toString(objectArray));
                stringBuilder.append(") with '");
                stringBuilder.append(android.ext.k.f());
                stringBuilder.append("' (");
                stringBuilder.append(b2.f(2131296732));
                stringBuilder.append(") ");
                stringBuilder.append(Config.b((int)2131034183).d);
                String string2 = stringBuilder.toString();
                e1.l(string2, throwable);
                stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append("\n\n");
                stringBuilder.append(e1.n(throwable));
                n0.i(stringBuilder.toString());
                charSequence = stringArray;
                if (stringArray == null) break block6;
                charSequence = stringArray;
                if (objectArray == null) break block6;
                stringArray = stringArray.split("%(\\d+\\$)?([\\-#+ 0;\\(])?(\\d+)?(\\.\\d+)?([bBhHsScCdoxXeEfgGaA]|[tT][HIklMSLNpzZsQBbhAaCYyjmdeRTrDFc])", objectArray.length + 1);
                charSequence = new StringBuilder();
                for (int i3 = 0; i3 < objectArray.length; ++i3) {
                    if (i3 < stringArray.length) {
                        ((StringBuilder)charSequence).append(stringArray[i3]);
                    }
                    ((StringBuilder)charSequence).append(objectArray[i3]);
                }
                if (objectArray.length < stringArray.length) {
                    ((StringBuilder)charSequence).append(stringArray[objectArray.length]);
                }
                charSequence = ((StringBuilder)charSequence).toString().replace("%n", "\n").replace("%%", "%");
            }
        }
        stringArray = charSequence;
        if (charSequence == null) {
            stringArray = "Failed call String.format";
        }
        return stringArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void M(String string2, File file) {
        Object object = Tools.f0().getResources();
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append("ydw");
        ((StringBuilder)object2).append(string2);
        int n3 = b2.d(((StringBuilder)object2).toString(), "raw");
        if (n3 == 0) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Nothing extract file ");
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(' ');
            ((StringBuilder)object).append(file.getAbsolutePath());
            e1.d(((StringBuilder)object).toString());
            throw new RuntimeException("Nothing extract");
        }
        try {
            object2 = new byte[8192];
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            object = object.openRawResource(n3);
            while (true) {
                if ((n3 = ((InputStream)object).read((byte[])object2)) <= 0) {
                    ((InputStream)object).close();
                    ((OutputStream)fileOutputStream).close();
                    return;
                }
                ((OutputStream)fileOutputStream).write((byte[])object2, 0, n3);
            }
        }
        catch (IOException iOException) {}
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Failed extract file ");
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append(' ');
        ((StringBuilder)object2).append(file.getAbsolutePath());
        e1.g(((StringBuilder)object2).toString(), iOException);
        throw new RuntimeException(iOException);
    }

    public static SharedPreferences M0() {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2 = sharedPreferences = (SharedPreferences)s.get();
        if (sharedPreferences == null) {
            sharedPreferences2 = Tools.f0().getSharedPreferences(MainService.G0, 0);
            s = new WeakReference<SharedPreferences>(sharedPreferences2);
        }
        return sharedPreferences2;
    }

    public static String M1(String string2, String string3, String string4, Object object) {
        try {
            string2 = String.format(android.ext.k.f(), string2, object);
        }
        catch (Throwable throwable) {
            e1.s("Format fail 1", throwable);
            string2 = null;
        }
        String string5 = string2;
        if (string2 == null) {
            try {
                string5 = String.format(android.ext.k.f(), string3, object);
            }
            catch (Throwable throwable) {
                e1.s("Format fail 2", throwable);
                string5 = string2;
            }
        }
        if (string5 != null) {
            string4 = string5;
        }
        return string4;
    }

    public static void N(AlertDialog button) {
        int n3;
        String[] stringArray;
        int n4;
        Button button2;
        if (button == null) {
            return;
        }
        Button[] buttonArray = new Button[]{button.getButton(-1), button.getButton(-2), button.getButton(-3)};
        button = null;
        int n5 = 0;
        while (true) {
            button2 = button;
            if (n5 >= 3) break;
            button2 = buttonArray[n5];
            if (button2 != null) {
                button = button2 = (ViewGroup)button2.getParent();
                if (button2 != null) break;
            }
            ++n5;
        }
        if (button2 == null) {
            return;
        }
        n5 = n4 = button2.getWidth();
        if (n4 == 0) {
            button2.requestLayout();
            n4 = n5 = button2.getWidth();
            if (n5 == 0) {
                n4 = button2.getMeasuredWidth();
            }
            n5 = n4;
            if (n4 == 0) {
                button2.measure(-1, -2);
                n5 = button2.getMeasuredWidth();
            }
        }
        if (n5 == 0) {
            return;
        }
        if (Tools.P0(n5, (ViewGroup)button2, 0)) {
            return;
        }
        for (n4 = 0; n4 < 3; ++n4) {
            button = buttonArray[n4];
            if (button == null) continue;
            button.setAllCaps(false);
        }
        if (Tools.P0(n5, (ViewGroup)button2, 5)) {
            return;
        }
        for (n4 = 0; n4 < 3; ++n4) {
            button = buttonArray[n4];
            if (button == null) continue;
            stringArray = button.getTextColors();
            Tools.D1((TextView)button, 2131361799);
            button.setTextColor((ColorStateList)stringArray);
        }
        if (Tools.P0(n5, (ViewGroup)button2, 10)) {
            return;
        }
        String string2 = b2.f(2131296311);
        String string3 = b2.f(2131296805);
        button = new Button[]{b2.f(2131296917), b2.f(2131297115), b2.f(2131296836)};
        String string4 = b2.f(2131296802);
        String string5 = b2.f(2131296803);
        for (n3 = 0; n3 < 3; ++n3) {
            int n6;
            stringArray = (new String[][]{{string2, string3}, button, {string4, string5}})[n3];
            if (stringArray == null) continue;
            int n7 = 0;
            for (n4 = 0; n4 < stringArray.length; ++n4) {
                n6 = n7;
                if (stringArray[n7].length() >= stringArray[n4].length()) {
                    n6 = n4;
                }
                n7 = n6;
            }
            n6 = 0;
            n4 = 0;
            while (true) {
                int n8;
                int n9 = 0;
                if (n6 >= 3) break;
                Button button3 = buttonArray[n6];
                if (button3 == null) {
                    n8 = n4;
                } else {
                    String string6 = button3.getText().toString();
                    while (true) {
                        n8 = n4;
                        if (n9 >= stringArray.length) break;
                        if (n9 != n7 && stringArray[n9].equals(string6)) {
                            button3.setText((CharSequence)stringArray[n7]);
                            n4 = 1;
                        }
                        ++n9;
                    }
                }
                ++n6;
                n4 = n8;
            }
            if (n4 == 0 || !Tools.P0(n5, (ViewGroup)button2, n3 + 20)) continue;
            return;
        }
        n3 = 0;
        for (n4 = 0; n4 < 3; ++n4) {
            button = buttonArray[n4];
            if (button == null || button.getText().toString().indexOf(32) == -1) continue;
            button.setText((CharSequence)button.getText().toString().replace(' ', '\n'));
            n3 = 1;
        }
        if (n3 != 0 && Tools.P0(n5, (ViewGroup)button2, 40)) {
            return;
        }
        if (button2 instanceof LinearLayout && (button = (LinearLayout)button2).getOrientation() == 0) {
            button.setOrientation(1);
            if (Tools.P0(n5, (ViewGroup)button2, 100)) {
                return;
            }
        }
        Tools.P0(n5, (ViewGroup)button2, -1);
    }

    public static Intent N0(Context context, String string2, String string3) {
        Context context2 = context;
        if (context == null) {
            context2 = Tools.f0();
        }
        context = context2 = context2.getPackageManager().getLaunchIntentForPackage(string2);
        if (context2 == null) {
            context = new Intent("android.intent.action.MAIN");
        }
        context.setPackage(string2);
        if (string3 != null) {
            context.setClassName(string2, string3);
        }
        context.setFlags(0x10000000);
        return context;
    }

    public static String N1(int n3) {
        return Tools.O1(b2.f(n3));
    }

    public static void O(View view) {
    }

    public static View O0(View view) {
        ViewParent viewParent;
        if (view != null && (viewParent = view.getParent()) != null && viewParent instanceof ViewGroup) {
            try {
                ((ViewGroup)viewParent).removeView(view);
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
        }
        return view;
    }

    public static String O1(String string2) {
        return Tools.P1(string2, ":");
    }

    public static void P(TextView textView) {
        block3: {
            ViewTreeObserver viewTreeObserver = textView.getViewTreeObserver();
            if (viewTreeObserver == null) break block3;
            try {
                viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)textView);
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
        }
    }

    private static boolean P0(int n3, ViewGroup object, int n4) {
        object.requestLayout();
        object.measure(-2, -2);
        int n5 = object.getMeasuredWidth();
        boolean bl = n5 <= n3;
        if (n4 != 0 || !bl) {
            object = new StringBuilder();
            ((StringBuilder)object).append("fixDialogButtonsSize: ");
            ((StringBuilder)object).append(n5);
            ((StringBuilder)object).append(" <= ");
            ((StringBuilder)object).append(n3);
            ((StringBuilder)object).append(" = ");
            ((StringBuilder)object).append(bl);
            ((StringBuilder)object).append(" [");
            ((StringBuilder)object).append(n4);
            ((StringBuilder)object).append(']');
            e1.d(((StringBuilder)object).toString());
        }
        return bl;
    }

    private static String P1(String string2, String string3) {
        String string4 = string2;
        if (string2 != null) {
            int n3 = string2.length();
            if (n3 == 0) {
                string4 = string2;
            } else {
                int n4;
                if (string3 == null) {
                    while (true) {
                        n4 = n3;
                        if (n3 != 0) {
                            n4 = n3;
                            if (Character.isWhitespace(string2.charAt(n3 - 1))) {
                                --n3;
                                continue;
                            }
                        }
                        break;
                    }
                } else {
                    if (string3.isEmpty()) {
                        return string2;
                    }
                    while (true) {
                        n4 = --n3;
                        if (n3 == 0) break;
                        char c4 = string2.charAt(n3 - 1);
                        if (string3.indexOf(c4) != -1 || Character.isWhitespace(c4)) continue;
                        n4 = n3;
                        break;
                    }
                }
                string4 = string2.substring(0, n4);
            }
        }
        return string4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static WindowManager.LayoutParams Q(WindowManager.LayoutParams layoutParams) {
        Object object;
        block9: {
            block8: {
                block7: {
                    int n3 = (Config.B & 2) != 0 ? layoutParams.flags | 0x1000000 : layoutParams.flags & 0xFEFFFFFF;
                    layoutParams.flags = n3;
                    boolean bl = Tools.W1();
                    if (m2.a && !bl) {
                        e1.d("canDrawOverlays = false; fixed");
                    }
                    if (bl) break block7;
                    layoutParams.type = 2;
                    IBinder iBinder = android.ext.r.n.getWindow().getAttributes().token;
                    object = iBinder;
                    if (iBinder == null) {
                        object = android.ext.r.n.getWindow().getDecorView().getRootView().getWindowToken();
                    }
                    break block8;
                }
                if (layoutParams.type != m2.b() && layoutParams.type != m2.c() || layoutParams.token == null) break block9;
                object = new StringBuilder();
                ((StringBuilder)object).append("token: null ");
                ((StringBuilder)object).append(layoutParams.token);
                e1.d(((StringBuilder)object).toString());
                object = null;
            }
            layoutParams.token = object;
        }
        if (Config.vSpaceReal && !Config.D) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Use 10 ");
            ((StringBuilder)object).append(Config.E);
            ((StringBuilder)object).append(" instead of ");
            ((StringBuilder)object).append(layoutParams.packageName);
            e1.d(((StringBuilder)object).toString());
            layoutParams.packageName = Config.E;
        }
        return layoutParams;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean Q0(View view) {
        boolean bl;
        boolean bl2 = bl = false;
        if (view == null) return bl2;
        if (view.getVisibility() != 0) {
            return bl;
        }
        if (!(view instanceof ViewGroup)) {
            bl2 = bl;
            if (!(view instanceof android.widget.EditText)) return bl2;
            return true;
        }
        view = (ViewGroup)view;
        int n3 = view.getChildCount();
        int n4 = 0;
        while (true) {
            block6: {
                bl2 = bl;
                if (n4 >= n3) return bl2;
                try {
                    View view2 = view.getChildAt(n4);
                    if (view2 == null || view2.getVisibility() != 0) break block6;
                    if (view2 instanceof android.widget.EditText) return true;
                    if (!(view2 instanceof ViewGroup) || !(bl2 = Tools.Q0(view2))) break block6;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {}
                return true;
            }
            ++n4;
        }
    }

    public static String Q1(String string2) {
        String string3 = string2.trim();
        int n3 = string3.length();
        for (int i3 = n3 - 1; i3 > 0 && string3.charAt(i3) == '/'; --i3) {
            --n3;
        }
        string2 = string3;
        if (n3 < string3.length()) {
            string2 = string3.substring(0, n3);
        }
        return string2;
    }

    public static void R(Window window) {
        window.setAttributes(Tools.Q(window.getAttributes()));
    }

    public static void R0(AlertDialog alertDialog) {
        n2.i(new Runnable(alertDialog){
            final AlertDialog a;
            {
                this.a = alertDialog;
            }

            @Override
            public void run() {
                try {
                    Tools.T0(this.a.getWindow());
                }
                catch (Throwable throwable) {
                    e1.l("hideSoftInputFromWindow", throwable);
                }
            }
        });
    }

    public static Drawable R1(Drawable drawable2) {
        Drawable drawable3;
        block4: {
            drawable3 = drawable2;
            if (drawable2 != null) {
                Drawable.ConstantState constantState = drawable2.getConstantState();
                drawable3 = drawable2;
                if (constantState == null) break block4;
                try {
                    drawable3 = constantState.newDrawable();
                }
                catch (Throwable throwable) {
                    e1.a(throwable);
                    drawable3 = drawable2;
                }
            }
        }
        return drawable3;
    }

    public static void S(View view) {
        view = Tools.I0(view);
        Tools.E1(view);
        Tools.O(view);
    }

    public static void S0(View view) {
        n2.i(new Runnable(view){
            final View a;
            {
                this.a = view;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void run() {
                Throwable throwable2;
                block3: {
                    View view;
                    block2: {
                        try {
                            if (g != null) break block2;
                            g = (InputMethodManager)MainService.context.getSystemService("input_method");
                        }
                        catch (Throwable throwable2) {
                            break block3;
                        }
                    }
                    if ((view = this.a) == null) return;
                    g.hideSoftInputFromWindow(view.getWindowToken(), 0);
                    return;
                }
                e1.l("hideSoftInputFromWindow", throwable2);
            }
        });
    }

    public static boolean S1(long l3, long l4) {
        boolean bl = false;
        boolean bl2 = l3 < l4;
        boolean bl3 = l3 < 0L;
        if (l4 < 0L) {
            bl = true;
        }
        return bl3 ^ bl2 ^ bl;
    }

    private static String T(long l3, boolean bl) {
        Object object;
        Object object2;
        float f4 = l3;
        if (f4 > 900.0f) {
            f4 /= 1024.0f;
            object2 = "KB";
        } else {
            object2 = "B";
        }
        float f5 = f4;
        if (f4 > 900.0f) {
            f5 = f4 / 1024.0f;
            object2 = "MB";
        }
        f4 = f5;
        if (f5 > 900.0f) {
            f4 = f5 / 1024.0f;
            object2 = "GB";
        }
        f5 = f4;
        if (f4 > 900.0f) {
            f5 = f4 / 1024.0f;
            object2 = "TB";
        }
        String string2 = object2;
        f4 = f5;
        if (f5 > 900.0f) {
            f4 = f5 / 1024.0f;
            string2 = "PB";
        }
        if (f4 < 1.0f) {
            object2 = Tools.L1("%.2f", Float.valueOf(f4));
        } else if (f4 < 10.0f) {
            object = new Object[1];
            object2 = Float.valueOf(f4);
            if (bl) {
                object[0] = object2;
                object2 = Tools.L1("%.1f", (Object[])object);
            } else {
                object[0] = object2;
                object2 = Tools.L1("%.2f", (Object[])object);
            }
        } else if (f4 < 100.0f) {
            object2 = new Object[1];
            object = Float.valueOf(f4);
            if (bl) {
                object2[0] = object;
                object2 = Tools.L1("%.0f", object2);
            } else {
                object2[0] = object;
                object2 = Tools.L1("%.2f", object2);
            }
        } else {
            object2 = Tools.L1("%.0f", Float.valueOf(f4));
        }
        object = new StringBuilder();
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(' ');
        ((StringBuilder)object).append(string2);
        return ((StringBuilder)object).toString();
    }

    public static void T0(Window window) {
        n2.i(new Runnable(window){
            final Window a;
            {
                this.a = window;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void run() {
                Throwable throwable2;
                block3: {
                    View view;
                    block2: {
                        try {
                            View view2;
                            view = view2 = this.a.getCurrentFocus();
                            if (view2 != null) break block2;
                            view = this.a.peekDecorView();
                        }
                        catch (Throwable throwable2) {
                            break block3;
                        }
                    }
                    if (view == null) return;
                    Tools.S0(view);
                    return;
                }
                e1.l("hideSoftInputFromWindow", throwable2);
            }
        });
    }

    public static boolean T1(long l3, long l4) {
        boolean bl = l3 == l4 || Tools.S1(l3, l4);
        return bl;
    }

    public static String U(Context object, long l3) {
        try {
            object = Formatter.formatFileSize((Context)object, (long)l3);
            return object;
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            try {
                String string2 = Tools.T(l3, false);
                return string2;
            }
            catch (Throwable throwable2) {
                e1.a(throwable2);
                return Long.toString(l3);
            }
        }
    }

    public static void U0(WeakReference weakReference) {
        if (weakReference == null) {
            return;
        }
        if ((weakReference = (AlertDialog)weakReference.get()) == null) {
            return;
        }
        Tools.R0((AlertDialog)weakReference);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void U1(Configuration configuration) {
        int n3;
        block5: {
            Throwable throwable2;
            block4: {
                int n4;
                n3 = 0;
                Configuration configuration2 = configuration;
                if (configuration == null) {
                    try {
                        configuration2 = Tools.f0().getResources().getConfiguration();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                if ((n4 = configuration2.orientation) == 2) {
                    n3 = 1;
                }
                break block5;
            }
            e1.a(throwable2);
        }
        w = n3;
    }

    public static int V(int n3, int n4) {
        int n5;
        while (true) {
            n5 = n3;
            n3 = n4;
            if (n3 == 0) break;
            n4 = n5 % n3;
        }
        return n5;
    }

    public static int V0(byte[] byArray, byte[] byArray2) {
        if (byArray.length == 0) {
            return -1;
        }
        int[] nArray = Tools.w(byArray2);
        int n3 = 0;
        for (int i3 = 0; i3 < byArray.length; ++i3) {
            int n4 = n3;
            while (n4 > 0 && byArray2[n4] != byArray[i3]) {
                n4 = nArray[n4 - 1];
            }
            n3 = n4;
            if (byArray2[n4] == byArray[i3]) {
                n3 = n4 + 1;
            }
            if (n3 != byArray2.length) continue;
            return i3 - byArray2.length + 1;
        }
        return -1;
    }

    public static void V1(View object, WindowManager.LayoutParams layoutParams) {
        ViewParent viewParent = object.getParent();
        if (viewParent instanceof ViewWrapper) {
            object = (ViewWrapper)viewParent;
        }
        Tools.F1(object, layoutParams, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String W() {
        BufferedReader bufferedReader;
        Object object;
        Object object2;
        CharSequence charSequence;
        block12: {
            Object object3;
            Object object4;
            block11: {
                block10: {
                    block9: {
                        charSequence = null;
                        try {
                            object4 = Tools.f0();
                            if (object4 == null) break block9;
                            object2 = object4.getPackageCodePath();
                            break block10;
                        }
                        catch (Throwable throwable) {
                            e1.a(throwable);
                        }
                    }
                    object2 = null;
                }
                object4 = object2;
                if (object2 == null) {
                    try {
                        object = Tools.Y(android.ext.i.d);
                        object4 = object2;
                        if (object != null) {
                            object4 = object.sourceDir;
                        }
                    }
                    catch (Throwable throwable) {
                        e1.a(throwable);
                        object4 = object2;
                    }
                }
                object = object4;
                if (object4 != null) return object;
                object = object4;
                try {
                    object = object4;
                    object = object4;
                    object = object4;
                    object3 = new FileInputStream("/proc/self/maps");
                    object = object4;
                    object2 = new InputStreamReader((InputStream)object3);
                    object = object4;
                    bufferedReader = new BufferedReader((Reader)object2);
                    break block11;
                }
                catch (Throwable throwable) {}
                e1.a(throwable);
                return object;
            }
            while (true) {
                object = object4;
                object3 = bufferedReader.readLine();
                object2 = object4;
                if (object3 == null) break block12;
                object = object4;
                if (!((String)object3).contains(android.ext.i.d)) continue;
                object = object4;
                if (!((String)object3).contains(".apk")) continue;
                object = object4;
                object = object4;
                object2 = new StringBuilder();
                object = object4;
                object2.append(((String)object3).split("\\.apk", 2)[0]);
                object = object4;
                object2.append(".apk");
                object = object4;
                object2 = object2.toString();
                object = object4;
                int n3 = object2.indexOf(64);
                if (n3 == -1) break;
                object = object4;
                object2 = object2.trim().split("/");
                object = object4;
                object = object4;
                charSequence = new StringBuilder();
                object = object4;
                charSequence.append('/');
                object = object4;
                charSequence.append(object2[((String[])object2).length - 1].trim().replace('@', '/'));
                object = object4;
                charSequence = charSequence.toString();
            }
            object = object4;
            object = object4;
            object3 = new StringBuilder();
            object = object4;
            ((StringBuilder)object3).append('/');
            object = object4;
            ((StringBuilder)object3).append(object2.split("/", 2)[1].trim());
            object = object4;
            object2 = ((StringBuilder)object3).toString();
        }
        object = object2;
        bufferedReader.close();
        object = object2;
        if (object2 != null) return object;
        object = object2;
        if (charSequence == null) return object;
        return charSequence;
    }

    public static void W0(Activity activity) {
        try {
            Tools.a((Context)activity);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
        try {
            Tools.a((Context)activity.getApplication());
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
        try {
            Tools.a(activity.getApplicationContext());
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    static boolean W1() {
        boolean bl = m2.a;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        if (b == -1) {
            b = Tools.m(Tools.f0()) ? 1 : 0;
        }
        if (b != 0) {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Drawable X(ApplicationInfo applicationInfo) {
        Throwable throwable2222;
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2;
        block9: {
            boolean bl;
            PackageManager packageManager = k;
            stringBuilder2 = null;
            StringBuilder stringBuilder3 = null;
            stringBuilder = stringBuilder2;
            if (applicationInfo == null) return stringBuilder;
            if (packageManager == null) {
                return stringBuilder2;
            }
            stringBuilder = stringBuilder3;
            try {
                bl = android.ext.a0.a(applicationInfo.packageName, "icon");
            }
            catch (Throwable throwable2222) {}
            stringBuilder = stringBuilder2 = applicationInfo.loadIcon(packageManager);
            android.ext.a0.b(bl);
            stringBuilder = stringBuilder2;
            if (stringBuilder2 != null) return stringBuilder;
            stringBuilder = stringBuilder2;
            bl = android.ext.a0.a(applicationInfo.packageName, "icon2");
            try {
                stringBuilder = stringBuilder3 = packageManager.getApplicationIcon(applicationInfo);
            }
            catch (Throwable throwable3) {
                stringBuilder = stringBuilder2;
                android.ext.a0.b(bl);
                stringBuilder = stringBuilder2;
                throw throwable3;
            }
            android.ext.a0.b(bl);
            return stringBuilder3;
            break block9;
            catch (Throwable throwable4) {
                stringBuilder = stringBuilder3;
                android.ext.a0.b(bl);
                stringBuilder = stringBuilder3;
                throw throwable4;
            }
        }
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Failed load icon for: ");
        stringBuilder2.append(applicationInfo.packageName);
        e1.l(stringBuilder2.toString(), throwable2222);
        return stringBuilder;
    }

    public static void X0(Context context) {
        try {
            Tools.a(context);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    public static boolean X1(java.lang.Process process, int n3) {
        FutureTask futureTask = new FutureTask(new Callable(process){
            final java.lang.Process a;
            {
                this.a = process;
            }

            public Boolean a() {
                this.a.waitFor();
                return Boolean.TRUE;
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("waitForTimeout: ");
        stringBuilder.append(process);
        new n0.i(futureTask, stringBuilder.toString()).start();
        long l3 = n3;
        try {
            boolean bl = (Boolean)futureTask.get(l3, TimeUnit.SECONDS);
            return bl;
        }
        catch (Exception exception) {
            return Tools.Z0(process);
        }
    }

    public static ApplicationInfo Y(String string2) {
        return Tools.Z(string2, 0);
    }

    public static int[] Y0(List object) {
        int[] nArray = new int[object.size()];
        object = object.iterator();
        int n3 = 0;
        while (object.hasNext()) {
            nArray[n3] = (Integer)object.next();
            ++n3;
        }
        return nArray;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ApplicationInfo Z(String string2, int n3) {
        Throwable throwable622;
        Object object;
        block19: {
            Object object2;
            block17: {
                Object object3;
                Object var5_9;
                boolean bl;
                block15: {
                    block18: {
                        block16: {
                            bl = android.ext.a0.i(string2);
                            object = null;
                            var5_9 = null;
                            if (bl) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Failed getApplicationInfo, isBuggedPackage: ");
                                stringBuilder.append(string2);
                                e1.i(stringBuilder.toString());
                                return object;
                            }
                            object = Tools.B0();
                            if (object == null) break block18;
                            bl = android.ext.a0.a(string2, "app_info");
                            {
                                catch (Throwable throwable2) {}
                            }
                            object = object.getApplicationInfo(string2, n3);
                            try {
                                android.ext.a0.b(bl);
                                break block15;
                            }
                            catch (Throwable throwable3) {
                                break block16;
                            }
                            catch (Throwable throwable4) {
                                try {
                                    android.ext.a0.b(bl);
                                    throw throwable4;
                                }
                                catch (Throwable throwable5) {}
                                {
                                    object3 = null;
                                    object2 = object;
                                    object = object3;
                                }
                            }
                        }
                        if (object2 instanceof PackageManager.NameNotFoundException) throw (PackageManager.NameNotFoundException)object2;
                        e1.l("Failed getApplicationInfo", (Throwable)object2);
                        break block15;
                    }
                    object = null;
                }
                if (object != null) return object;
                object3 = Tools.u0();
                if (object3 == null) return object;
                try {
                    Class<?> clazz = object3.getClass();
                    Class<Integer> clazz2 = Integer.TYPE;
                    object2 = new y(clazz, "getApplicationInfo", new Class[]{String.class, clazz2, clazz2}, object3, new Object[]{string2, n3, 0});
                    y y3 = new y(clazz, "getApplicationInfo", new Class[]{String.class, clazz2}, object3, new Object[]{string2, n3});
                    object3 = Tools.x0(clazz, new y[]{object2, y3});
                    object2 = var5_9;
                    if (object3 == null) break block17;
                    bl = android.ext.a0.a(string2, "app_info2");
                }
                catch (Throwable throwable622) {}
                try {
                    object2 = ((y)object3).b();
                }
                catch (Throwable throwable7) {
                    android.ext.a0.b(bl);
                    throw throwable7;
                }
                android.ext.a0.b(bl);
                if (object2 == null) {
                    object2 = new PackageManager.NameNotFoundException(string2);
                    throw object2;
                }
                break block17;
                break block19;
            }
            if (!(object2 instanceof ApplicationInfo)) return object;
            return (ApplicationInfo)object2;
        }
        if (throwable622 instanceof PackageManager.NameNotFoundException) throw (PackageManager.NameNotFoundException)throwable622;
        e1.l("Failed getApplicationInfo", throwable622);
        return object;
    }

    public static boolean Z0(java.lang.Process process) {
        boolean bl;
        try {
            process.exitValue();
            bl = true;
        }
        catch (IllegalThreadStateException illegalThreadStateException) {
            bl = false;
        }
        return bl;
    }

    private static void a(Context object) {
        if (k == null) {
            try {
                k = object.getPackageManager();
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
        }
        if (h == null) {
            try {
                h = object.getPackageName();
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
        }
        if (h == null) {
            h = android.ext.i.d;
        }
        if (i == null) {
            try {
                i = object.getFilesDir().getAbsolutePath();
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
        }
        if (j == null) {
            try {
                j = object.getCacheDir().getAbsolutePath();
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
        }
        if (i == null && h != null) {
            object = new StringBuilder();
            ((StringBuilder)object).append(Tools.n0());
            ((StringBuilder)object).append("/files");
            i = ((StringBuilder)object).toString();
        }
        if (j == null && h != null) {
            object = new StringBuilder();
            ((StringBuilder)object).append(Tools.n0());
            ((StringBuilder)object).append("/cache");
            j = ((StringBuilder)object).toString();
        }
        if (i != null) {
            try {
                object = new File(i);
                if (!((File)object).exists()) {
                    ((File)object).mkdirs();
                }
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
        }
        if (j != null) {
            try {
                object = new File(j);
                if (!((File)object).exists()) {
                    ((File)object).mkdirs();
                }
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String a0(ApplicationInfo applicationInfo) {
        Object object;
        CharSequence charSequence;
        CharSequence charSequence2;
        block12: {
            Object object2;
            block11: {
                object2 = k;
                charSequence = charSequence2 = null;
                if (applicationInfo == null) return charSequence;
                if (object2 == null) {
                    return charSequence2;
                }
                boolean bl = android.ext.a0.a(applicationInfo.packageName, "label");
                {
                    catch (Throwable throwable2) {
                        object = null;
                        break block11;
                    }
                    charSequence = applicationInfo.loadLabel((PackageManager)object2);
                    object = charSequence;
                    try {
                        android.ext.a0.b(bl);
                        object = charSequence;
                        if (charSequence != null) break block12;
                        object = charSequence;
                        bl = android.ext.a0.a(applicationInfo.packageName, "label2");
                    }
                    catch (Throwable throwable) {
                        break block11;
                    }
                    {
                        object = object2 = object2.getApplicationLabel(applicationInfo);
                    }
                    android.ext.a0.b(bl);
                    object = object2;
                    break block12;
                    catch (Throwable throwable) {}
                    {
                        android.ext.a0.b(bl);
                        throw throwable;
                    }
                }
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Failed load label for: ");
            ((StringBuilder)object2).append(applicationInfo.packageName);
            e1.l(((StringBuilder)object2).toString(), (Throwable)((Object)charSequence));
        }
        charSequence = charSequence2;
        if (object == null) return charSequence;
        return object.toString();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean a1(Object object) {
        void var0_3;
        block17: {
            Object object2 = object instanceof File ? (File)object : new File(object.toString());
            int n3 = !((File)object2).exists() ? 2131296450 : (!((File)object2).isFile() ? 2131296818 : 0);
            Object var4_9 = null;
            if (n3 != 0) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(Tools.N1(n3));
                ((StringBuilder)object2).append(": ");
                ((StringBuilder)object2).append(object);
                object = ((StringBuilder)object2).toString();
            } else {
                String string2;
                block15: {
                    FileInputStream fileInputStream;
                    block16: {
                        fileInputStream = new FileInputStream((File)object2);
                        object2 = fileInputStream;
                        fileInputStream.read();
                        try {
                            fileInputStream.close();
                            return true;
                        }
                        catch (IOException iOException) {
                            return true;
                        }
                        catch (Throwable throwable) {
                            object2 = var4_9;
                            break block15;
                        }
                        catch (IOException iOException) {
                            fileInputStream = null;
                            break block16;
                        }
                        catch (Throwable throwable) {
                            break block15;
                        }
                        catch (IOException iOException) {}
                    }
                    object2 = fileInputStream;
                    {
                        object2 = fileInputStream;
                        StringBuilder stringBuilder = new StringBuilder();
                        object2 = fileInputStream;
                        stringBuilder.append(object);
                        object2 = fileInputStream;
                        stringBuilder.append("\n\n");
                        object2 = fileInputStream;
                        stringBuilder.append(((Throwable)((Object)string2)).getMessage());
                        object2 = fileInputStream;
                        string2 = stringBuilder.toString();
                        object = string2;
                        if (fileInputStream == null) break block17;
                    }
                    fileInputStream.close();
                    object = string2;
                }
                if (object2 == null) throw var0_3;
                ((FileInputStream)object2).close();
                throw var0_3;
                catch (IOException iOException) {
                    object = string2;
                }
            }
        }
        android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(2131296417)).setMessage((CharSequence)object).setPositiveButton((CharSequence)b2.f(2131296836), null));
        return false;
        catch (IOException iOException) {
            throw var0_3;
        }
    }

    public static File b0() {
        String string2 = j;
        Object object = string2;
        if (string2 == null) {
            object = Tools.m0("/cache");
        }
        object = object != null ? new File((String)object) : null;
        return object;
    }

    public static Throwable b1(Context context) {
        try {
            context.getPackageName();
            context.getPackageManager();
            context.getCacheDir();
            context.getFilesDir();
            context.getExternalCacheDir();
            context.getExternalFilesDir(null);
            return null;
        }
        catch (Throwable throwable) {
            return throwable;
        }
    }

    public static void c(TextView textView, Drawable drawable2, int n3) {
        if (textView == null) {
            return;
        }
        n2.i(new Runnable(textView, drawable2, n3){
            final TextView a;
            final Drawable b;
            final int c;
            {
                this.a = textView;
                this.b = drawable2;
                this.c = n3;
            }

            @Override
            public void run() {
                Tools.d(this.a, this.b, this.c);
            }
        });
    }

    public static File c0() {
        File file;
        File file2 = file = Tools.b0();
        if (file != null) {
            file2 = new File(file, Tools.s0());
            file2.mkdirs();
        }
        return file2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean c1(String string2) {
        Throwable throwable2;
        block4: {
            int n3;
            Object object;
            block3: {
                try {
                    File file = new File(string2);
                    Object object2 = file.list();
                    if (object2 == null) return false;
                    object = object2;
                    if (((String[])object2).length != 0) break block3;
                    object = new StringBuilder();
                    ((StringBuilder)object).append(".gg.");
                    ((StringBuilder)object).append(System.nanoTime());
                    object = ((StringBuilder)object).toString();
                    object2 = new File(file, (String)object);
                    ((File)object2).createNewFile();
                    object = file.list();
                    ((File)object2).delete();
                }
                catch (Throwable throwable2) {
                    break block4;
                }
            }
            if ((n3 = ((String[])object).length) <= 0) return false;
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("isGoodDir: '");
        stringBuilder.append(string2);
        stringBuilder.append("'");
        e1.s(stringBuilder.toString(), throwable2);
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void d(TextView var0, Drawable var1_1, int var2_3) {
        block12: {
            block10: {
                block11: {
                    block14: {
                        block13: {
                            if (Tools.e == -1) {
                                Tools.e = (int)(Tools.G(12.0f) + 0.5f);
                            }
                            if (var1_1 != null) {
                                var2_3 = (int)Tools.G(var2_3);
                                try {
                                    var1_1.setBounds(0, 0, var2_3, var2_3);
                                }
                                catch (Throwable var4_4) {
                                    e1.a(var4_4);
                                }
                            }
                            try {
                                var4_5 = var0.getTag(2131034289);
                                var2_3 = var4_5 instanceof Integer != false ? (Integer)var4_5 : 0;
                            }
                            catch (StringIndexOutOfBoundsException var1_2) {
                                break block10;
                            }
                            if (var2_3 != 0) ** GOTO lbl33
                            var4_5 = var0.getCompoundDrawables();
                            var5_6 = var0.getCompoundDrawablesRelative();
                            if (var5_6[0] == null) break block13;
                            var2_3 = 4;
                            var4_5 = var5_6;
                            ** GOTO lbl-1000
                        }
                        if (var4_5[0] == null) break block14;
                        var2_3 = 2;
                        ** GOTO lbl-1000
                    }
                    var2_3 = 3;
                    var4_5 = var5_6;
lbl-1000:
                    // 3 sources

                    {
                        block15: {
                            var0.setTag(2131034289, (Object)var2_3);
                            var3_7 = var2_3;
                            break block15;
lbl33:
                            // 1 sources

                            var4_5 = null;
                            var3_7 = var2_3;
                        }
                        var2_3 = var3_7 != 1 && var3_7 != 2 ? 0 : 1;
                        var5_6 = var4_5;
                        if (var4_5 == null) {
                            var5_6 = var2_3 != 0 ? var0.getCompoundDrawables() : var0.getCompoundDrawablesRelative();
                        }
                        if (var3_7 != 1 && var3_7 != 3) {
                            var3_7 = 2;
                            break block11;
                        }
                        var3_7 = 0;
                    }
                }
                if (var5_6[var3_7] == var1_1) break block12;
                var5_6[var3_7] = var1_1;
                if (var2_3 == 0) ** GOTO lbl50
                {
                    var0.setCompoundDrawables(var5_6[0], var5_6[1], var5_6[2], var5_6[3]);
                    break block12;
lbl50:
                    // 1 sources

                    var0.setCompoundDrawablesRelative(var5_6[0], var5_6[1], var5_6[2], var5_6[3]);
                    break block12;
                }
            }
            e1.a(var1_2);
        }
        var0.setCompoundDrawablePadding(Tools.e);
    }

    public static int d0(int n3) {
        return Tools.e0(n3, -1);
    }

    public static int d1() {
        int n3;
        int n4 = n3 = w;
        if (n3 == -1) {
            Tools.U1(null);
            n4 = w;
        }
        return n4;
    }

    public static void e(ListView listView, CharSequence[] charSequenceArray, Drawable[] drawableArray, int n3, int n4) {
        try {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = new ViewGroup.OnHierarchyChangeListener(n4, charSequenceArray, drawableArray, n3){
                final int a;
                final CharSequence[] b;
                final Drawable[] c;
                final int d;
                {
                    this.a = n3;
                    this.b = charSequenceArray;
                    this.c = drawableArray;
                    this.d = n4;
                }

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                public void onChildViewAdded(View object, View view) {
                    Throwable throwable2;
                    block3: {
                        block2: {
                            try {
                                object = view.findViewById(16908308);
                                if (!(object instanceof TextView)) return;
                                view = (TextView)object;
                                int n3 = this.a;
                                if (n3 == 0) break block2;
                                Tools.D1((TextView)view, n3);
                            }
                            catch (Throwable throwable2) {
                                break block3;
                            }
                        }
                        if (view.getTag() != null) return;
                        object = new TextWatcher(this, (TextView)view){
                            final TextView a;
                            final u b;
                            {
                                this.b = u3;
                                this.a = textView;
                            }

                            public void afterTextChanged(Editable editable) {
                                this.onTextChanged((CharSequence)editable, 0, 0, 0);
                            }

                            public void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n5) {
                            }

                            public void onTextChanged(CharSequence object, int n3, int n4, int n5) {
                                block4: {
                                    Throwable throwable2;
                                    object = object.toString();
                                    n3 = 0;
                                    while (true) {
                                        block5: {
                                            try {
                                                TextView textView = this.b.b;
                                                if (n3 >= ((CharSequence[])textView).length) break block4;
                                                if (!textView[n3].toString().equals(object)) break block5;
                                                textView = this.a;
                                                object = this.b;
                                                Tools.c(textView, object.c[n3], object.d);
                                                break block4;
                                            }
                                            catch (Throwable throwable2) {}
                                            break;
                                        }
                                        ++n3;
                                    }
                                    e1.a(throwable2);
                                }
                            }
                        };
                        view.addTextChangedListener((TextWatcher)object);
                        view.setTag(object);
                        object.onTextChanged(view.getText(), 0, 0, 0);
                        return;
                    }
                    e1.a(throwable2);
                }

                public void onChildViewRemoved(View view, View view2) {
                }
            };
            listView.setOnHierarchyChangeListener(onHierarchyChangeListener);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int e0(int n3, int n4) {
        Throwable throwable2222222;
        block5: {
            Context context = Tools.f0();
            int n5 = Build.VERSION.SDK_INT;
            if (n5 < 23) return context.getResources().getColor(n3);
            {
                catch (Throwable throwable2222222) {
                    break block5;
                }
                try {
                    return q2.a(context, n3);
                }
                catch (Throwable throwable3) {}
                e1.a(throwable3);
                return context.getResources().getColor(n3);
            }
        }
        e1.a(throwable2222222);
        return n4;
    }

    public static boolean e1(String string2) {
        try {
            Tools.Z(string2, 0);
            return true;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return false;
        }
    }

    public static void f(View view, WindowManager.LayoutParams layoutParams) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("dbg2: ");
        stringBuilder.append(view);
        stringBuilder.append(' ');
        stringBuilder.append(layoutParams);
        e1.d(stringBuilder.toString());
        Tools.F1(view, layoutParams, true);
    }

    public static Context f0() {
        Context context;
        Context context2 = context = MainService.context;
        if (context == null) {
            context2 = context;
            if (android.ext.r.p != null) {
                context2 = Tools.l1(android.ext.r.p) == null ? android.ext.r.o : android.ext.r.p;
            }
        }
        return context2;
    }

    public static boolean f1(String string2) {
        if (string2.length() >= 2 && string2.charAt(0) == '/') {
            return true;
        }
        AlertDialog.Builder builder = android.ext.f.b().setCustomTitle(Tools.g0(2131296417));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append("\n\n");
        stringBuilder.append(b2.f(2131296853));
        android.ext.f.o(builder.setMessage((CharSequence)stringBuilder.toString()).setPositiveButton((CharSequence)b2.f(2131296836), null));
        return false;
    }

    public static void g(View view, WindowManager.LayoutParams layoutParams) {
        n2.i(new Runnable(layoutParams, view){
            final WindowManager.LayoutParams a;
            final View b;
            {
                this.a = layoutParams;
                this.b = view;
            }

            @Override
            public void run() {
                Tools.n1(this.b);
                ViewWrapper viewWrapper = new ViewWrapper(this.b.getContext());
                viewWrapper.addView(this.b);
                Tools.f((View)viewWrapper, this.a);
            }
        });
    }

    public static View g0(int n3) {
        return Tools.h0(b2.f(n3));
    }

    public static String g1(long l3) {
        int[] nArray;
        StringBuilder stringBuilder = new StringBuilder();
        long l4 = Math.abs(l3);
        for (int i3 = 0; i3 < (nArray = o).length; i3 += 2) {
            long l5;
            long l6;
            int n3 = nArray[i3 + 1];
            if (n3 <= 0) {
                l6 = 0L;
                l5 = l4;
                l4 = l6;
            } else {
                l6 = n3;
                l5 = l4 / l6;
                l6 = l4 % l6;
                l4 = l5;
                l5 = l6;
            }
            if (l5 > 0L) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.insert(0, " ");
                }
                stringBuilder.insert(0, b2.f(o[i3]));
                stringBuilder.insert(0, " ");
                stringBuilder.insert(0, l5);
            }
            if (l4 == 0L) break;
        }
        if (stringBuilder.length() == 0) {
            stringBuilder.insert(0, b2.f(o[0]));
            stringBuilder.insert(0, "0 ");
        }
        if (l3 < 0L) {
            stringBuilder.insert(0, "-");
        }
        return stringBuilder.toString();
    }

    public static void h(String string2, int n3) {
        Tools.i(string2, n3, null, null);
    }

    public static View h0(String string2) {
        return Tools.i0(string2, null);
    }

    static void h1() {
        b = 1;
    }

    public static void i(String string2, int n3, String string3, DialogInterface.OnClickListener onClickListener) {
        n2.i(new Runnable(string2, n3, string3, onClickListener){
            final String a;
            final int b;
            final String c;
            final DialogInterface.OnClickListener d;
            {
                this.a = string2;
                this.b = n3;
                this.c = string3;
                this.d = onClickListener;
            }

            @Override
            public void run() {
                ScrollView scrollView;
                int n3;
                View view = a.d.f(2131099656, null);
                Object object = (TextView)view.findViewById(2131034313);
                object.setText((CharSequence)this.a);
                if ((this.b & 4) != 0 && (n3 = this.a.indexOf(8291)) >= 0) {
                    scrollView = new SpannableString((CharSequence)this.a);
                    scrollView.setSpan(new BackgroundColorSpan(-7864320), n3, n3 + 4, 33);
                    object.setText((CharSequence)((Object)scrollView));
                }
                scrollView = (ScrollView)view.findViewById(2131034312);
                scrollView.setFastScrollEnabled(true);
                view = android.ext.f.b().setPositiveButton((CharSequence)b2.f(2131296836), null).setView(view);
                if ((this.b & 2) == 0) {
                    view.setNegativeButton(2131296338, new DialogInterface.OnClickListener(this, (TextView)object){
                        final TextView a;
                        final m b;
                        {
                            this.b = m3;
                            this.a = textView;
                        }

                        public void onClick(DialogInterface dialogInterface, int n3) {
                            Tools.A(this.a.getText().toString().trim(), false);
                        }
                    });
                }
                if ((object = this.c) != null) {
                    view.setNeutralButton((CharSequence)object, this.d);
                }
                object = view.create();
                if ((this.b & 1) != 0) {
                    android.ext.f.l((AlertDialog)object, new DialogInterface.OnShowListener(this, scrollView){
                        final ScrollView a;
                        final m b;
                        {
                            this.b = m3;
                            this.a = scrollView;
                        }

                        public void onShow(DialogInterface dialogInterface) {
                            this.a.postDelayed(new Runnable(this){
                                final b a;
                                {
                                    this.a = b4;
                                }

                                @Override
                                public void run() {
                                    this.a.a.fullScroll(130);
                                }
                            }, 100L);
                        }
                    });
                }
                android.ext.f.m((AlertDialog)object);
                object = object.getWindow();
                scrollView = object.getAttributes();
                ((WindowManager.LayoutParams)scrollView).width = -1;
                object.setAttributes((WindowManager.LayoutParams)scrollView);
            }
        });
    }

    public static View i0(String string2, String string3) {
        return Tools.j0(string2, string3, -1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean i1(String string2) {
        Throwable throwable2;
        block4: {
            Object object;
            Context context;
            try {
                context = Tools.f0();
                try {
                    object = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts((String)"package", (String)string2, null));
                }
                catch (ActivityNotFoundException activityNotFoundException) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Failed open app info for: ");
                    ((StringBuilder)object).append(string2);
                    e1.s(((StringBuilder)object).toString(), activityNotFoundException);
                    object = new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS");
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            object.setFlags(0x10000000);
            context.startActivity((Intent)object);
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed open app info for: ");
        stringBuilder.append(string2);
        e1.s(stringBuilder.toString(), throwable2);
        return false;
    }

    public static boolean j(String object) {
        File file = new File((String)object);
        if (file.canExecute()) {
            return true;
        }
        Object object2 = Tools.F0((String)object);
        object = new String[]{"chmod", "0755", object2};
        try {
            if (!Tools.X1(Tools.I((String[])object), 15)) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("timeout fail 1: ");
                ((StringBuilder)object2).append(Arrays.toString(object));
                String string2 = ((StringBuilder)object2).toString();
                object2 = new RuntimeException();
                e1.s(string2, (Throwable)object2);
            }
        }
        catch (Exception exception) {
            e1.s("exec", exception);
        }
        if (!Config.C) {
            if (file.canExecute()) {
                return true;
            }
            try {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("exec ");
                ((StringBuilder)object2).append(Tools.y((String[])object, " "));
                if (!Tools.X1(e2.q(((StringBuilder)object2).toString()), 15)) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("timeout fail 2: ");
                    ((StringBuilder)object2).append(Arrays.toString(object));
                    object = ((StringBuilder)object2).toString();
                    object2 = new RuntimeException();
                    e1.s((String)object, (Throwable)object2);
                }
            }
            catch (Exception exception) {
                e1.s("root", exception);
            }
        }
        return file.canExecute();
    }

    public static View j0(String string2, String string3, int n3) {
        View view = a.d.f(2131099649, null);
        TextView textView = (TextView)view.findViewById(2131034125);
        textView.setText((CharSequence)string2);
        if (n3 != -1 && n3 != 0) {
            Tools.r1((View)textView);
            textView.setOnClickListener(new View.OnClickListener(string2, n3){
                final String a;
                final int b;
                {
                    this.a = string2;
                    this.b = n3;
                }

                public void onClick(View view) {
                    view = android.ext.f.b();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(b2.g(this.a));
                    stringBuilder.append('\n');
                    stringBuilder.append(b2.f(this.b));
                    view = view.setMessage((CharSequence)stringBuilder.toString()).setNegativeButton((CharSequence)b2.f(2131296836), null).create();
                    android.ext.f.m((AlertDialog)view);
                    android.ext.f.l((AlertDialog)view, new DialogInterface.OnShowListener(this, (AlertDialog)view){
                        final AlertDialog a;
                        final l b;
                        {
                            this.b = l3;
                            this.a = alertDialog;
                        }

                        public void onShow(DialogInterface dialogInterface) {
                            Tools.u1(this.a);
                        }
                    });
                }
            });
        }
        if (string3 != null) {
            string2 = (TextView)view.findViewById(2131034419);
            string2.setText((CharSequence)string3);
            string2.setVisibility(0);
        }
        return view;
    }

    public static double j1(String string2) {
        double d4;
        if ((string2 = string2.trim()).startsWith("-")) {
            string2 = string2.substring(1);
            d4 = -1.0;
        } else {
            d4 = 1.0;
        }
        String[] stringArray = string2.split(":", o.length / 2);
        t1.b b4 = new t1.b();
        double d5 = 0.0;
        for (int i3 = 0; i3 < stringArray.length; ++i3) {
            int n3 = (stringArray.length - 1 - i3) * 2 + 1;
            if (n3 >= o.length) continue;
            double d6 = Double.longBitsToDouble(t1.t((t1.b)b4, (String)stringArray[i3], (String)string2).a);
            d5 = d5 * (double)o[n3] + d6;
        }
        return d5 * d4;
    }

    public static boolean[] k(List object) {
        boolean[] blArray = new boolean[object.size()];
        object = object.iterator();
        int n3 = 0;
        while (object.hasNext()) {
            blArray[n3] = (Boolean)object.next();
            ++n3;
        }
        return blArray;
    }

    public static Context k0() {
        return Tools.l0(Tools.f0());
    }

    public static String k1(String string2) {
        return Pattern.quote(string2).replace("^", "\\E^\\Q").replace("$", "\\E$\\Q").replace("?", "\\E.\\Q").replace("*", "\\E.*\\Q").replace("\\Q\\E", "");
    }

    public static final String l(byte[] byArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = byArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = Integer.toHexString(byArray[i3] & 0xFF).toUpperCase(Locale.US);
            while (string2.length() < 2) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append('0');
                stringBuilder2.append(string2);
                string2 = stringBuilder2.toString();
            }
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    public static Context l0(Context context) {
        return context;
    }

    public static Context l1(Context context) {
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper)context).getBaseContext();
        }
        return context;
    }

    public static boolean m(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                boolean bl = s2.a(context);
                return bl;
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
        }
        return true;
    }

    private static String m0(String string2) {
        Object object;
        block6: {
            if (l == null) {
                object = Tools.Y(android.ext.i.d);
                if (object == null) break block6;
                try {
                    l = ((ApplicationInfo)object).dataDir;
                }
                catch (Throwable throwable) {
                    e1.a(throwable);
                }
            }
        }
        if (l != null && string2 != null) {
            object = new StringBuilder();
            ((StringBuilder)object).append(l);
            ((StringBuilder)object).append(string2);
            string2 = ((StringBuilder)object).toString();
        } else {
            string2 = l;
        }
        return string2;
    }

    public static void m1(View view) {
        n2.i(new Runnable(view){
            final View a;
            {
                this.a = view;
            }

            @Override
            public void run() {
                try {
                    MainService.instance.l.removeView(this.a);
                }
                catch (Throwable throwable) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed removeView: ");
                    stringBuilder.append(this.a);
                    e1.l(stringBuilder.toString(), throwable);
                }
            }
        });
    }

    public static void n(Object object, int n3) {
        block8: {
            block6: {
                boolean bl;
                block7: {
                    block5: {
                        if (object == null) {
                            return;
                        }
                        bl = n3 == 1;
                        if (!(object instanceof a)) break block5;
                        object = (a)object;
                        int n4 = ((a)object).i();
                        for (int i3 = 0; i3 < n4; ++i3) {
                            boolean bl2 = n3 == 2 ? !((a)object).c(i3) : bl;
                            ((a)object).b(i3, bl2);
                        }
                        break block6;
                    }
                    if (!(object instanceof e)) break block7;
                    object = (e)object;
                    int n5 = ((e)object).l();
                    for (int i4 = 0; i4 < n5; ++i4) {
                        boolean bl3 = n3 == 2 ? !((e)object).a(i4) : bl;
                        ((e)object).k(i4, bl3);
                    }
                    break block6;
                }
                if (object instanceof boolean[]) {
                    object = (boolean[])object;
                    int n6 = ((Object)object).length;
                    for (int i5 = 1; i5 < n6 - 1; ++i5) {
                        boolean bl4 = n3 == 2 ? object[i5] == false : bl;
                        object[i5] = bl4;
                    }
                }
                break block8;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static String n0() {
        String string2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/data/");
        int n3 = Process.myUid() / 100000;
        if (n3 == 0) {
            stringBuilder.append("data");
        } else {
            stringBuilder.append("user/");
            stringBuilder.append(n3);
        }
        stringBuilder.append('/');
        String string3 = string2 = h;
        if (string2 == null) {
            string3 = android.ext.i.d;
        }
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    public static void n1(View view) {
        n2.i(new Runnable(view){
            final View a;
            {
                this.a = view;
            }

            @Override
            public void run() {
                Object object = this.a.getParent();
                if (object instanceof ViewWrapper) {
                    object = (ViewWrapper)((Object)object);
                    Tools.m1((View)object);
                    object.removeAllViews();
                }
            }
        });
    }

    public static void o() {
        new g0(new Runnable(){

            @Override
            public void run() {
                int n3;
                Object object = new ArrayList<Throwable>();
                CharSequence charSequence = new StringBuilder();
                charSequence.append("Context info. act - ");
                charSequence.append(Tools.v0(android.ext.r.p));
                charSequence.append("; app - ");
                charSequence.append(Tools.v0(android.ext.r.o));
                charSequence.append("; dae - ");
                charSequence.append(Tools.v0(MainService.context));
                charSequence.append("; bad - ");
                Throwable throwable = Tools.b1(android.ext.r.p);
                if (throwable != null) {
                    object.add(throwable);
                    n3 = 1;
                } else {
                    n3 = 0;
                }
                throwable = Tools.b1(android.ext.r.o);
                int n4 = n3;
                if (throwable != null) {
                    n4 = n3 + 10;
                    object.add(throwable);
                }
                n3 = n4;
                if (MainService.context != null) {
                    throwable = Tools.b1(MainService.context);
                    n3 = n4;
                    if (throwable != null) {
                        n3 = n4 + 100;
                        object.add(throwable);
                    }
                }
                charSequence.append(n3);
                charSequence = charSequence.toString();
                if (n3 > 0) {
                    throwable = new RuntimeException((String)charSequence);
                    object = object.iterator();
                    while (object.hasNext()) {
                        throwable.addSuppressed((Throwable)object.next());
                    }
                    n0.h(Thread.currentThread(), throwable, false);
                }
                e1.d((String)charSequence);
            }
        }, "checkForBadContext").start();
    }

    public static Drawable o0(int n3) {
        Drawable drawable2;
        try {
            drawable2 = Tools.f0().getDrawable(n3);
        }
        catch (NoSuchMethodError noSuchMethodError) {
            drawable2 = Tools.f0().getResources().getDrawable(n3);
        }
        return drawable2;
    }

    public static void o1(android.widget.EditText editText) {
        if (editText == null) {
            return;
        }
        n2.i(new Runnable(editText){
            final android.widget.EditText a;
            {
                this.a = editText;
            }

            @Override
            public void run() {
                Editable editable = this.a.getText();
                if (editable.length() > 0) {
                    try {
                        editable.replace(0, 1, editable.subSequence(0, 1), 0, 1);
                    }
                    catch (Throwable throwable) {
                        e1.a(throwable);
                    }
                    this.a.selectAll();
                }
            }
        });
    }

    static void p() {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                if (!Tools.m(Tools.f0())) {
                    e1.p("canDrawOverlays = false");
                }
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
        }
    }

    public static File p0() {
        String string2 = i;
        Object object = string2;
        if (string2 == null) {
            object = Tools.m0("/files");
        }
        object = object != null ? new File((String)object) : null;
        return object;
    }

    public static void p1(View view) {
        Tools.q1(view, view.getBackground());
    }

    public static void q(File file, int n3) {
        boolean bl = false;
        boolean bl2 = (n3 & 0x40) != 0;
        boolean bl3 = (n3 & 9) == 0;
        file.setExecutable(bl2, bl3);
        bl2 = (n3 & 0x80) != 0;
        bl3 = (n3 & 0x12) == 0;
        file.setWritable(bl2, bl3);
        bl2 = (n3 & 0x100) != 0;
        bl3 = bl;
        if ((n3 & 0x24) == 0) {
            bl3 = true;
        }
        file.setReadable(bl2, bl3);
        try {
            Os.chmod((String)file.getAbsolutePath(), (int)n3);
        }
        catch (Throwable throwable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed chmod ");
            stringBuilder.append(Integer.toOctalString(n3));
            stringBuilder.append(" '");
            stringBuilder.append(file);
            stringBuilder.append("'");
            e1.s(stringBuilder.toString(), throwable);
        }
    }

    public static File q0() {
        File file;
        File file2 = file = Tools.p0();
        if (file != null) {
            file2 = new File(file, Tools.s0());
            file2.mkdirs();
        }
        return file2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void q1(View view, Drawable drawable2) {
        Throwable throwable2;
        block3: {
            Drawable drawable3 = drawable2;
            if (drawable2 == null) {
                try {
                    drawable3 = new ColorDrawable(0);
                }
                catch (Throwable throwable2) {
                    break block3;
                }
            }
            view.setFocusable(true);
            drawable2 = new StateListDrawable();
            ImageButton imageButton = new ImageButton(view.getContext());
            imageButton = imageButton.getBackground();
            drawable2.addState(a.g.a, (Drawable)imageButton);
            drawable2.addState(a.g.b, (Drawable)imageButton);
            drawable2.addState(a.g.c, (Drawable)imageButton);
            drawable2.addState(StateSet.WILD_CARD, drawable3);
            view.setBackground(drawable3);
            int n3 = view.getPaddingLeft();
            int n4 = view.getPaddingRight();
            int n5 = view.getPaddingTop();
            int n6 = view.getPaddingBottom();
            view.setBackground(drawable2);
            view.setPadding(n3, n5, n4, n6);
            return;
        }
        e1.a(throwable2);
    }

    public static void r(String object, String object2) {
        CharSequence charSequence;
        try {
            Os.chmod((String)object, (int)Integer.parseInt((String)object2, 8));
        }
        catch (Throwable throwable) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Failed chmod ");
            ((StringBuilder)charSequence).append((String)object2);
            ((StringBuilder)charSequence).append(" '");
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append("'");
            e1.s(((StringBuilder)charSequence).toString(), throwable);
        }
        charSequence = Tools.F0((String)object);
        object = new String[]{"chmod", object2, charSequence};
        try {
            if (!Tools.X1(Tools.I((String[])object), 15)) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("timeout fail 1: ");
                ((StringBuilder)object2).append(Arrays.toString(object));
                charSequence = ((StringBuilder)object2).toString();
                object2 = new RuntimeException();
                e1.s((String)charSequence, (Throwable)object2);
            }
        }
        catch (Exception exception) {
            e1.s("exec", exception);
        }
        try {
            if (!Config.C) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("exec ");
                ((StringBuilder)object2).append(Tools.y((String[])object, " "));
                if (!Tools.X1(e2.q(((StringBuilder)object2).toString()), 15)) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("timeout fail 2: ");
                    ((StringBuilder)object2).append(Arrays.toString(object));
                    object = ((StringBuilder)object2).toString();
                    object2 = new RuntimeException();
                    e1.s((String)object, (Throwable)object2);
                }
            }
        }
        catch (Exception exception) {
            e1.s("root", exception);
        }
    }

    public static long r0() {
        long l3;
        block3: {
            long l4 = -1L;
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ActivityManager activityManager = (ActivityManager)Tools.f0().getSystemService("activity");
            l3 = l4;
            if (activityManager == null) break block3;
            try {
                activityManager.getMemoryInfo(memoryInfo);
                l3 = memoryInfo.availMem / 0x100000L;
            }
            catch (Throwable throwable) {
                e1.l("Failed get free mem", throwable);
                l3 = l4;
            }
        }
        return l3;
    }

    public static void r1(View view) {
        Tools.q1(view, Tools.o0(2130968627));
    }

    public static String removeNewLinesChars(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i3 = 0; i3 < string2.length(); ++i3) {
            char c4 = string2.charAt(i3);
            boolean bl = false;
            for (int i4 = 0; i4 < 2; ++i4) {
                bl = bl || c4 == '\n';
                if (i4 == 1) continue;
                c4 = (char)(c4 - 3);
            }
            if (bl) {
                stringBuilder.append("");
            }
            stringBuilder.append(c4);
        }
        return stringBuilder.toString();
    }

    public static boolean s(View view) {
        if (view == null) {
            return false;
        }
        return view.callOnClick();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String s0() {
        block11: {
            String string2;
            CharSequence charSequence;
            block12: {
                Throwable throwable2;
                block10: {
                    SharedPreferences sharedPreferences;
                    block8: {
                        block9: {
                            if (m != null) break block11;
                            try {
                                sharedPreferences = Tools.M0();
                                if (sharedPreferences.contains("hidden-dir")) break block8;
                                charSequence = Tools.t0();
                                string2 = charSequence;
                                if (charSequence != null) break block9;
                                string2 = Tools.H0();
                            }
                            catch (Throwable throwable2) {
                                break block10;
                            }
                        }
                        sharedPreferences.edit().putString("hidden-dir", string2).commit();
                    }
                    string2 = null;
                    try {
                        charSequence = sharedPreferences.getString("hidden-dir", null);
                        string2 = charSequence;
                    }
                    catch (ClassCastException classCastException) {
                        // empty catch block
                    }
                    charSequence = string2;
                    if (string2 == null) {
                        int n3 = sharedPreferences.getInt("hidden-dir", 0);
                        if (n3 != 0) {
                            string2 = Integer.toString(n3);
                            charSequence = sharedPreferences.edit().putString("hidden-dir", string2);
                        } else {
                            charSequence = sharedPreferences.edit().remove("hidden-dir");
                        }
                        charSequence.commit();
                        charSequence = string2;
                    }
                    break block12;
                }
                e1.s("Failed get num", throwable2);
                charSequence = Tools.t0();
            }
            string2 = charSequence;
            if (charSequence == null) {
                string2 = Tools.H0();
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("GG-");
            ((StringBuilder)charSequence).append(string2);
            m = ((StringBuilder)charSequence).toString();
        }
        return m;
    }

    public static boolean s1(DialogInterface dialogInterface, int n3, Object object, View.OnClickListener onClickListener) {
        if (dialogInterface instanceof AlertDialog && (dialogInterface = ((AlertDialog)dialogInterface).getButton(n3)) != null) {
            dialogInterface.setTag(object);
            dialogInterface.setOnClickListener(onClickListener);
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CharSequence t(CharSequence charSequence, int n3) {
        Throwable throwable2;
        block2: {
            Object object;
            try {
                object = charSequence instanceof Spannable ? (Spannable)charSequence : new SpannableString(charSequence);
            }
            catch (Throwable throwable2) {
                break block2;
            }
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(n3);
            object.setSpan((Object)foregroundColorSpan, 0, charSequence.length(), 33);
            return object;
        }
        e1.s("Failed colorize", throwable2);
        return charSequence;
    }

    private static String t0() {
        String string2;
        block6: {
            Throwable throwable2;
            String string3 = null;
            String[] stringArray = Tools.p0();
            string2 = string3;
            if (stringArray == null) break block6;
            stringArray = stringArray.list();
            string2 = string3;
            if (stringArray == null) break block6;
            int n3 = stringArray.length;
            int n4 = 0;
            while (true) {
                block7: {
                    string2 = string3;
                    if (n4 >= n3) break block6;
                    string2 = stringArray[n4];
                    if (string2 == null) break block7;
                    try {
                        if (!string2.startsWith("GG-")) break block7;
                        string2 = string2.substring(3);
                        break block6;
                    }
                    catch (Throwable throwable2) {}
                    break;
                }
                ++n4;
            }
            e1.s("Failed get dir", throwable2);
            string2 = string3;
        }
        return string2;
    }

    public static boolean t1(DialogInterface dialogInterface, int n3, Object object, View.OnClickListener onClickListener, EditText editText) {
        if (editText != null) {
            editText.requestFocus();
            Tools.o1(editText);
        }
        return Tools.s1(dialogInterface, n3, object, onClickListener);
    }

    public static CharSequence u(CharSequence charSequence) {
        if (charSequence instanceof Spannable) {
            Object object = (v[])q.get();
            int n3 = 0;
            v[] vArray = object;
            int n4 = n3;
            if (object == null) {
                vArray = new v[]{new v(android.ext.c.v(1), android.ext.c.n(1)), new v(android.ext.c.v(2), android.ext.c.n(2)), new v(android.ext.c.v(4), android.ext.c.n(4)), new v(android.ext.c.v(8), android.ext.c.n(8)), new v(android.ext.c.v(16), android.ext.c.n(16)), new v(android.ext.c.v(32), android.ext.c.n(32)), new v(android.ext.c.v(64), android.ext.c.n(64)), new v(b2.f(2131296421), Tools.d0(2130837517)), new v(b2.f(2131297108), Tools.d0(2130837521)), new v(b2.f(2131296883), Tools.d0(2130837519)), new v(b2.f(2131297109), Tools.d0(2130837518))};
                q = new WeakReference<v[]>(vArray);
                n4 = n3;
            }
            while (n4 < vArray.length) {
                object = vArray[n4];
                Tools.v(charSequence, object.a, object.b);
                ++n4;
            }
        }
        return charSequence;
    }

    public static Object u0() {
        if (p == null) {
            try {
                Object object = Class.forName("android.os.ServiceManager").getDeclaredMethod("getIServiceManager", new Class[0]);
                ((AccessibleObject)object).setAccessible(true);
                Object object2 = ((Method)object).invoke(null, d.b.f);
                object = object2.getClass().getDeclaredMethod("getService", String.class);
                ((AccessibleObject)object).setAccessible(true);
                object = ((Method)object).invoke(object2, "package");
                object2 = Class.forName("android.content.pm.IPackageManager$Stub").getDeclaredMethod("asInterface", IBinder.class);
                ((AccessibleObject)object2).setAccessible(true);
                p = ((Method)object2).invoke(null, object);
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
        }
        return p;
    }

    public static AlertDialog u1(AlertDialog alertDialog) {
        block3: {
            TextView textView = (TextView)alertDialog.findViewById(16908299);
            if (textView == null) break block3;
            try {
                Tools.v1(textView, textView.getText().toString());
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
        }
        return alertDialog;
    }

    public static CharSequence v(CharSequence charSequence, CharSequence charSequence2, int n3) {
        block5: {
            int n4;
            String string2;
            int n5;
            Spannable spannable;
            try {
                if (!(charSequence instanceof Spannable)) break block5;
                spannable = (Spannable)charSequence;
                n5 = charSequence2.length();
                string2 = charSequence.toString();
                charSequence2 = charSequence2.toString();
                n4 = 0;
            }
            catch (Throwable throwable) {
                e1.s("Failed colorize text", throwable);
            }
            while (true) {
                int n6 = string2.indexOf((String)charSequence2, n4);
                if (n6 < 0) break;
                n4 = n6 + n5;
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(n3);
                spannable.setSpan((Object)foregroundColorSpan, n6, n4, 33);
                continue;
                break;
            }
        }
        return charSequence;
    }

    public static String v0(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = "Context: ";
        while (true) {
            stringBuilder.append(string2);
            stringBuilder.append(context);
            if (context == null || !(context instanceof ContextWrapper)) break;
            context = ((ContextWrapper)context).getBaseContext();
            string2 = ", base: ";
        }
        return stringBuilder.toString();
    }

    public static void v1(TextView textView, String string2) {
        n2.i(new Runnable(textView, string2){
            final TextView a;
            final String b;
            {
                this.a = textView;
                this.b = string2;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void run() {
                int n3;
                for (n3 = 1; n3 < 4; ++n3) {
                    Throwable throwable2;
                    StringBuilder stringBuilder;
                    block5: {
                        Object object;
                        try {
                            object = this.a;
                            int n4 = 0;
                            boolean bl = n3 <= 2;
                            object.setLinksClickable(bl);
                            object = this.a;
                            if (n3 <= 2) {
                                n4 = 1;
                            }
                            object.setAutoLinkMask(n4);
                            stringBuilder = this.a;
                            object = n3 <= 1 ? LinkMovementMethod.getInstance() : null;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                        stringBuilder.setMovementMethod((MovementMethod)object);
                        this.a.setText((CharSequence)this.b);
                        break;
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed set clickable text ");
                    stringBuilder.append(n3);
                    e1.l(stringBuilder.toString(), throwable2);
                }
                if (n3 == 4) {
                    this.a.setText((CharSequence)"Failed set text");
                }
                DefensiveURLSpan.a(this.a);
            }
        });
    }

    private static int[] w(byte[] byArray) {
        int[] nArray = new int[byArray.length];
        int n3 = 0;
        for (int i3 = 1; i3 < byArray.length; ++i3) {
            int n4 = n3;
            while (n4 > 0 && byArray[n4] != byArray[i3]) {
                n4 = nArray[n4 - 1];
            }
            n3 = n4;
            if (byArray[n4] == byArray[i3]) {
                n3 = n4 + 1;
            }
            nArray[i3] = n3;
        }
        return nArray;
    }

    public static ListView w0(View view) {
        block2: {
            while (view != null) {
                if (view instanceof ListView) {
                    view = (ListView)view;
                    break block2;
                }
                if (!((view = view.getParent()) instanceof View)) break;
            }
            view = null;
        }
        return view;
    }

    public static void w1(int n3, ComponentName componentName, int n4) {
        try {
            PackageManager packageManager = Tools.B0();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hide ");
            stringBuilder.append(n3);
            stringBuilder.append(": ");
            stringBuilder.append(n4);
            stringBuilder.append(' ');
            stringBuilder.append(componentName);
            e1.d(stringBuilder.toString());
            Tools.B(componentName.getPackageName(), null);
            packageManager.setComponentEnabledSetting(componentName, n4, 1);
            stringBuilder = new StringBuilder();
            stringBuilder.append("hide ");
            stringBuilder.append(n3 + 1);
            stringBuilder.append(": ");
            stringBuilder.append(n4);
            stringBuilder.append(' ');
            stringBuilder.append(componentName);
            e1.d(stringBuilder.toString());
            Tools.B(componentName.getPackageName(), null);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    public static CharSequence x(CharSequence ... charSequenceArray) {
        try {
            CharSequence charSequence = TextUtils.concat((CharSequence[])charSequenceArray);
            return charSequence;
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            StringBuilder stringBuilder = new StringBuilder();
            int n3 = charSequenceArray.length;
            for (int i3 = 0; i3 < n3; ++i3) {
                stringBuilder.append(charSequenceArray[i3]);
            }
            return stringBuilder.toString();
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static y x0(Class clazz, y[] object) {
        void var1_4;
        Object object2;
        int n3 = 0;
        try {
            object2 = object[0].a();
            y y3 = object2;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            object2 = null;
            while (true) {
                block6: {
                    block7: {
                        if (n3 >= ((y[])object).length) break block7;
                        if (n3 == 0) break block6;
                        try {
                            y y4 = object[n3].a();
                            object2 = y4;
                            break block6;
                        }
                        catch (NoSuchMethodException noSuchMethodException2) {}
                    }
                    y y5 = object2;
                    break;
                }
                ++n3;
            }
        }
        if (var1_4 == null) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Methods: ");
            ((StringBuilder)object2).append(Arrays.toString(clazz.getMethods()));
            e1.d(((StringBuilder)object2).toString());
        }
        return var1_4;
    }

    public static void x1(View view, float f4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (int)f4;
            view.setLayoutParams(layoutParams);
        }
    }

    public static String y(String[] stringArray, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string3 : stringArray) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(string2);
            }
            stringBuilder.append(string3);
        }
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String y0(String charSequence) {
        IOException iOException2;
        Object object;
        block8: {
            BufferedReader bufferedReader;
            MappedByteBuffer mappedByteBuffer;
            Object object2;
            Object object3;
            block7: {
                if (u != 0) {
                    object = charSequence;
                    if (u != 1) return object;
                }
                object = charSequence;
                try {
                    int n3;
                    String string2;
                    int n4;
                    object = charSequence;
                    object3 = new File((String)charSequence);
                    object = charSequence;
                    object = charSequence;
                    object2 = new StringBuilder();
                    object = charSequence;
                    ((StringBuilder)object2).append('/');
                    object = charSequence;
                    ((StringBuilder)object2).append(((File)object3).getName());
                    object = charSequence;
                    String string3 = ((StringBuilder)object2).toString();
                    object = charSequence;
                    object = charSequence;
                    object2 = new FileInputStream((File)object3);
                    object = charSequence;
                    mappedByteBuffer = ((FileInputStream)object2).getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, 4096L);
                    object = charSequence;
                    object = charSequence;
                    object = charSequence;
                    object3 = new FileReader("/proc/self/maps");
                    object = charSequence;
                    bufferedReader = new BufferedReader((Reader)object3);
                    do {
                        object = charSequence;
                        string2 = bufferedReader.readLine();
                        object3 = charSequence;
                        if (string2 == null) break block7;
                        object = charSequence;
                    } while ((n4 = string2.indexOf(string3)) < 0);
                    for (n3 = n4; n3 > 0; --n3) {
                        object = charSequence;
                        if (string2.charAt(n3) <= ' ') break;
                    }
                    object3 = charSequence;
                    if (n3 >= n4) break block7;
                    object = charSequence;
                    charSequence = string2.substring(n3, string2.length()).trim();
                    object = charSequence;
                    object3 = charSequence;
                    if (u != 0) break block7;
                    object = charSequence;
                    u = 1;
                    object3 = charSequence;
                }
                catch (IOException iOException2) {
                    break block8;
                }
            }
            object = object3;
            bufferedReader.close();
            object = object3;
            if (u == 0) {
                object = object3;
                u = (byte)2;
            }
            object = object3;
            mappedByteBuffer.capacity();
            object = object3;
            ((FileInputStream)object2).close();
            return object3;
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Failed getNativePath: ");
        ((StringBuilder)charSequence).append((String)object);
        e1.s(((StringBuilder)charSequence).toString(), iOException2);
        return object;
    }

    public static void y1(ImageView imageView, float f4) {
        n2.i(new Runnable(imageView, f4){
            final ImageView a;
            final float b;
            {
                this.a = imageView;
                this.b = f4;
            }

            @Override
            public void run() {
                try {
                    this.a.setImageAlpha((int)this.b);
                }
                catch (NoSuchMethodError noSuchMethodError) {
                    try {
                        e1.s("setImageAlpha 1", noSuchMethodError);
                        this.a.setAlpha((int)this.b);
                    }
                    catch (NoSuchMethodError noSuchMethodError2) {
                        e1.s("setImageAlpha 2", noSuchMethodError2);
                    }
                }
            }
        });
    }

    public static void z(String string2) {
        Tools.A(string2, true);
    }

    public static PackageInfo z0(String string2) {
        return Tools.A0(string2, 0);
    }

    public static void z1(View view, View.OnFocusChangeListener onFocusChangeListener) {
        w w3;
        w w4 = w3 = (w)view.getTag(2131099661);
        if (w3 == null) {
            w4 = new w();
            view.setOnFocusChangeListener((View.OnFocusChangeListener)w4);
            view.setTag(2131099661, (Object)w4);
        }
        w4.a(onFocusChangeListener);
    }

    public static final class ViewWrapper
    extends FrameLayout {
        public ViewWrapper(Context context) {
            super(context);
        }
    }

    public static class a0 {
        public int a;
        public int b;

        public a0(int n3, int n4) {
            this.a = n3;
            this.b = n4;
        }
    }

    private static class b0 {
        private static final ThreadLocal a = new ThreadLocal(){

            protected Integer a() {
                return 0;
            }
        };

        private b0() {
        }

        public void a(int n3) {
            ThreadLocal threadLocal = a;
            threadLocal.set(~n3 & (Integer)threadLocal.get());
        }

        public boolean b(int n3) {
            ThreadLocal threadLocal = a;
            int n4 = (Integer)threadLocal.get();
            if ((n4 & n3) == 0) {
                threadLocal.set(n3 | n4);
                return true;
            }
            return false;
        }
    }

    private static class v {
        public final CharSequence a;
        public final int b;

        public v(CharSequence charSequence, int n3) {
            this.a = charSequence;
            this.b = n3;
        }
    }

    private static class w
    implements View.OnFocusChangeListener {
        private final ArrayList a = new ArrayList();

        private w() {
        }

        void a(View.OnFocusChangeListener onFocusChangeListener) {
            if (onFocusChangeListener != null && !this.a.contains(onFocusChangeListener)) {
                this.a.add(onFocusChangeListener);
            }
        }

        public void onFocusChange(View view, boolean bl) {
            Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((View.OnFocusChangeListener)iterator.next()).onFocusChange(view, bl);
            }
        }
    }

    public static class x
    extends Handler {
        final Handler a;

        public x(Handler handler) {
            super(handler.getLooper());
            this.a = handler;
        }

        public static Handler a(Handler handler) {
            Handler handler2 = handler;
            if (!(handler instanceof x)) {
                handler2 = new x(handler);
            }
            return handler2;
        }

        public void handleMessage(Message message) {
            try {
                this.a.handleMessage(message);
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
        }
    }

    private static class y {
        Class a;
        String b;
        Class[] c;
        Object d;
        Object[] e;
        Method f;

        public y(Class clazz, String string2, Class[] classArray, Object object, Object[] objectArray) {
            this.a = clazz;
            this.b = string2;
            this.c = classArray;
            this.d = object;
            this.e = objectArray;
            this.f = null;
        }

        public y a() {
            this.f = this.a.getMethod(this.b, this.c);
            return this;
        }

        public Object b() {
            return this.f.invoke(this.d, this.e);
        }
    }

    public static class z
    implements Runnable {
        final Runnable a;

        public z(Runnable runnable) {
            this.a = runnable;
        }

        public static Runnable a(Runnable runnable) {
            Runnable runnable2 = runnable;
            if (!(runnable instanceof z)) {
                runnable2 = new z(runnable);
            }
            return runnable2;
        }

        @Override
        public void run() {
            try {
                this.a.run();
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
        }
    }
}

