package android.ext;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.lang.ProcessBuilder;
import android.net.Uri;
import android.os.Build$VERSION;
import android.os.Environment;
import android.os.IBinder;
import android.os.Process;
import android.provider.Settings;
import android.system.Os;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.text.style.ForegroundColorSpan;
import android.util.StateSet;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.View$OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R$color;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$layout;
import catch_.me_.if_.you_.can_.R$string;
import catch_.me_.if_.you_.can_.R$style;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel$MapMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class Tools {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Random f489a = new Random(System.currentTimeMillis());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile int f490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static float f491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile int f492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static volatile int f493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Pattern f494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static InputMethodManager f495g;
    private static String h;
    private static String i;
    private static String j;
    private static volatile PackageManager k;
    private static volatile String l;
    private static String m;
    private static final Tools$b0 n;
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
        f490b = Build$VERSION.SDK_INT >= 23 ? -1 : 1;
        f491c = 0.0f;
        f492d = -1;
        f493e = -1;
        f494f = Pattern.compile("(\\d+)");
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = new Tools$b0(null);
        o = new int[]{R$string.unit_seconds_short, 60, R$string.unit_minutes_short, 60, R$string.unit_hours_short, 24, R$string.unit_days_short, 365, R$string.unit_years_short, -1};
        p = null;
        q = new WeakReference(null);
        r = 0;
        s = new WeakReference(null);
        t = false;
        u = (byte) 0;
        v = null;
        w = -1;
    }

    public static void A(String str, boolean z) {
        if (str == null) {
            return;
        }
        n2.i(new Tools$a(str, z));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b4 A[Catch: all -> 0x00ca, TRY_LEAVE, TryCatch #3 {all -> 0x00ca, blocks: (B:31:0x005e, B:33:0x00b4, B:35:0x00be, B:38:0x00c4, B:39:0x00c9, B:43:0x00cd, B:44:0x00d1, B:45:0x00d2, B:47:0x00d6, B:34:0x00ba), top: B:62:0x005e, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4 A[Catch: all -> 0x00ca, TryCatch #3 {all -> 0x00ca, blocks: (B:31:0x005e, B:33:0x00b4, B:35:0x00be, B:38:0x00c4, B:39:0x00c9, B:43:0x00cd, B:44:0x00d1, B:45:0x00d2, B:47:0x00d6, B:34:0x00ba), top: B:62:0x005e, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d6 A[Catch: all -> 0x00ca, TRY_LEAVE, TryCatch #3 {all -> 0x00ca, blocks: (B:31:0x005e, B:33:0x00b4, B:35:0x00be, B:38:0x00c4, B:39:0x00c9, B:43:0x00cd, B:44:0x00d1, B:45:0x00d2, B:47:0x00d6, B:34:0x00ba), top: B:62:0x005e, inners: #5 }] */
    public static PackageInfo A0(String str, int i2) throws PackageManager$NameNotFoundException {
        PackageInfo packageInfo;
        Object objU0;
        Tools$y tools$yX0;
        boolean zA;
        Object objB = null;
        if (a0.i(str)) {
            e1.i("Failed getPackageInfo, isBuggedPackage: " + str);
            return null;
        }
        PackageManager packageManagerB0 = B0();
        if (packageManagerB0 != null) {
            try {
                boolean zA2 = a0.a(str, "pkg_info");
                try {
                    packageInfo = packageManagerB0.getPackageInfo(str, i2);
                    try {
                        a0.b(zA2);
                    } catch (Throwable th) {
                        th = th;
                        if (!(th instanceof PackageManager$NameNotFoundException)) {
                            throw th;
                        }
                        e1.l("Failed getPackageInfo", th);
                    }
                } catch (Throwable th2) {
                    try {
                        a0.b(zA2);
                        throw th2;
                    } catch (Throwable th3) {
                        th = th3;
                        packageInfo = null;
                        if (!(th instanceof PackageManager$NameNotFoundException)) {
                            throw th;
                        }
                        e1.l("Failed getPackageInfo", th);
                        if (packageInfo == null) {
                            try {
                                Class<?> cls = objU0.getClass();
                                Class cls2 = Integer.TYPE;
                                tools$yX0 = x0(cls, new Tools$y[]{new Tools$y(cls, "getPackageInfo", new Class[]{String.class, cls2, cls2}, objU0, new Object[]{str, Integer.valueOf(i2), 0}), new Tools$y(cls, "getPackageInfo", new Class[]{String.class, cls2}, objU0, new Object[]{str, Integer.valueOf(i2)})});
                                if (tools$yX0 != null) {
                                    zA = a0.a(str, "pkg_info2");
                                    try {
                                        objB = tools$yX0.b();
                                        a0.b(zA);
                                        if (objB != null) {
                                            throw new PackageManager$NameNotFoundException(str);
                                        }
                                    } catch (Throwable th4) {
                                        a0.b(zA);
                                        throw th4;
                                    }
                                }
                                if (objB instanceof PackageInfo) {
                                    return (PackageInfo) objB;
                                }
                            } catch (Throwable th5) {
                                if (th5 instanceof PackageManager$NameNotFoundException) {
                                    throw th5;
                                }
                                e1.l("Failed getPackageInfo", th5);
                            }
                        }
                        return packageInfo;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } else {
            packageInfo = null;
        }
        if (packageInfo == null && (objU0 = u0()) != null) {
            Class<?> cls3 = objU0.getClass();
            Class cls4 = Integer.TYPE;
            tools$yX0 = x0(cls3, new Tools$y[]{new Tools$y(cls3, "getPackageInfo", new Class[]{String.class, cls4, cls4}, objU0, new Object[]{str, Integer.valueOf(i2), 0}), new Tools$y(cls3, "getPackageInfo", new Class[]{String.class, cls4}, objU0, new Object[]{str, Integer.valueOf(i2)})});
            if (tools$yX0 != null) {
                zA = a0.a(str, "pkg_info2");
                objB = tools$yX0.b();
                a0.b(zA);
                if (objB != null) {
                    throw new PackageManager$NameNotFoundException(str);
                }
            }
            if (objB instanceof PackageInfo) {
                return (PackageInfo) objB;
            }
        }
        return packageInfo;
    }

    public static void A1(ListView listView, Tools$a0 tools$a0) {
        if (tools$a0 == null) {
            return;
        }
        B1(listView, tools$a0.f498a, tools$a0.f499b);
    }

    public static void B(String str, StringBuilder sb) {
        PackageInfo packageInfoA0;
        StringBuilder sb2 = sb == null ? new StringBuilder() : sb;
        sb2.append("\nActivities:\n");
        if (sb == null) {
            e1.d(sb2.toString().trim());
            sb2 = new StringBuilder();
        }
        try {
            packageInfoA0 = A0(str, 1);
        } catch (Throwable unused) {
            packageInfoA0 = null;
        }
        if (packageInfoA0 == null) {
            sb2.append("Null for: " + str);
            if (sb != null) {
                return;
            }
        } else {
            ActivityInfo[] activityInfoArr = packageInfoA0.activities;
            if (activityInfoArr != null) {
                for (ActivityInfo activityInfo : activityInfoArr) {
                    try {
                        sb2.append(activityInfo);
                        if (activityInfo != null) {
                            sb2.append('\n');
                            for (Field field : ActivityInfo.class.getFields()) {
                                int modifiers = field.getModifiers();
                                if (Modifier.isPublic(modifiers) && !Modifier.isStatic(modifiers)) {
                                    sb2.append(field.getName());
                                    sb2.append(": ");
                                    try {
                                        sb2.append(field.get(activityInfo));
                                    } catch (Throwable th) {
                                        sb2.append(th);
                                    }
                                    sb2.append("; ");
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        sb2.append(th2);
                    }
                    try {
                        ComponentName componentName = new ComponentName(str, activityInfo.name);
                        sb2.append("enabled: ");
                        sb2.append(B0().getComponentEnabledSetting(componentName));
                        sb2.append("; ");
                    } catch (Throwable th3) {
                        sb2.append(th3);
                    }
                    sb2.append('\n');
                    if (sb == null) {
                        e1.d(sb2.toString().trim());
                        sb2 = new StringBuilder();
                    }
                }
                return;
            }
            sb2.append("Null");
            if (sb != null) {
                return;
            }
        }
        e1.d(sb2.toString().trim());
    }

    public static PackageManager B0() {
        if (k == null && n.b(1)) {
            try {
                k = r.n.getPackageManager();
            } catch (Throwable th) {
                e1.a(th);
            }
            n.a(1);
        }
        if (k == null && n.b(2)) {
            try {
                k = r.n.getApplication().getPackageManager();
            } catch (Throwable th2) {
                e1.a(th2);
            }
            n.a(2);
        }
        if (k == null && n.b(4)) {
            try {
                k = r.n.getApplicationContext().getPackageManager();
            } catch (Throwable th3) {
                e1.a(th3);
            }
            n.a(4);
        }
        if (k == null && n.b(8)) {
            try {
                k = MainService.context.getPackageManager();
            } catch (Throwable th4) {
                e1.a(th4);
            }
            n.a(8);
        }
        if (k == null && n.b(16)) {
            try {
                k = MainService.context.getApplicationContext().getPackageManager();
            } catch (Throwable th5) {
                e1.a(th5);
            }
            n.a(16);
        }
        return k;
    }

    public static void B1(ListView listView, int i2, int i3) {
        listView.setSelectionFromTop(i2, i3);
        listView.post(new Tools$n(listView, i2, i3));
    }

    private static void C(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            try {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt != null) {
                    childAt.setSoundEffectsEnabled(false);
                    if (childAt instanceof ViewGroup) {
                        C((ViewGroup) childAt);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
    }

    public static String C0() {
        String str = h;
        return str == null ? i.f1002d : str;
    }

    public static void C1(ListView listView, int i2) {
        listView.setOnHierarchyChangeListener(new Tools$t(i2));
    }

    public static void D(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        n2.i(new Tools$k(dialogInterface));
    }

    public static int D0(Process process) {
        try {
            Field declaredField = process.getClass().getDeclaredField("pid");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(process);
            declaredField.setAccessible(false);
            return i2;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static void D1(TextView textView, int i2) {
        try {
            if (Build$VERSION.SDK_INT >= 23) {
                textView.setTextAppearance(i2);
            } else {
                textView.setTextAppearance(textView.getContext(), i2);
            }
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    public static void E(WeakReference weakReference) {
        AlertDialog alertDialog;
        if (weakReference == null || (alertDialog = (AlertDialog) weakReference.get()) == null) {
            return;
        }
        D(alertDialog);
    }

    public static int E0() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("/proc/meminfo", "r");
            Matcher matcher = f494f.matcher(randomAccessFile.readLine());
            String strGroup = "-2";
            while (matcher.find()) {
                strGroup = matcher.group(1);
            }
            randomAccessFile.close();
            return Integer.parseInt(strGroup);
        } catch (Throwable th) {
            e1.s("Failed get RAM size", th);
            return -1;
        }
    }

    public static void E1(View view) {
        if ((Config.B & 32) == 0 && view != null) {
            View viewI0 = I0(view);
            viewI0.setSoundEffectsEnabled(false);
            if (viewI0 instanceof ViewGroup) {
                C((ViewGroup) viewI0);
            }
        }
    }

    public static String F(double d2) {
        long j2;
        StringBuilder sb = new StringBuilder();
        long jAbs = Math.abs((long) d2);
        int i2 = 0;
        while (true) {
            int[] iArr = o;
            if (i2 >= iArr.length) {
                break;
            }
            int i3 = iArr[i2 + 1];
            if (i3 <= 0) {
                j2 = 0;
            } else {
                long j3 = i3;
                long j4 = jAbs % j3;
                j2 = jAbs / j3;
                jAbs = j4;
            }
            if (jAbs >= 0) {
                if (sb.length() > 0) {
                    sb.insert(0, ":");
                }
                if (i2 == 0) {
                    sb.insert(0, L1("%f", Double.valueOf(Math.abs(d2) % ((double) i3))).replaceFirst("\\D?0+$", ""));
                } else {
                    sb.insert(0, jAbs);
                }
            }
            if (j2 == 0) {
                break;
            }
            i2 += 2;
            jAbs = j2;
        }
        if (sb.length() == 0) {
            sb.insert(0, "0");
        }
        if (d2 < 0.0d) {
            sb.insert(0, "-");
        }
        return sb.toString();
    }

    public static String F0(String str) {
        return v != null ? str.replace(v[0], v[1]) : str;
    }

    private static void F1(View view, WindowManager$LayoutParams windowManager$LayoutParams, boolean z) {
        Q(windowManager$LayoutParams);
        n2.i(new Tools$p(z, windowManager$LayoutParams, view));
    }

    public static float G(float f2) {
        Context contextF0;
        float f3 = f491c;
        if (f3 == 0.0f && (contextF0 = f0()) != null) {
            f3 = contextF0.getResources().getDisplayMetrics().density;
        }
        if (f3 == 0.0f) {
            f3 = 1.0f;
        }
        return f2 * f3;
    }

    public static Drawable G0(Drawable drawable, int i2) {
        Bitmap bitmap;
        try {
            if (!(drawable instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) drawable).getBitmap()) == null) {
                return drawable;
            }
            int i3 = i2 + 4;
            if (bitmap.getWidth() <= i3 && bitmap.getHeight() <= i3) {
                return drawable;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            BitmapDrawable bitmapDrawable = new BitmapDrawable(f0().getResources(), Bitmap.createScaledBitmap(bitmap, i2, i2, false));
            try {
                e1.d("getResized: " + bitmap.getWidth() + 'x' + bitmap.getHeight() + " -> " + i2 + 'x' + i2 + " in " + (System.currentTimeMillis() - jCurrentTimeMillis));
                return bitmapDrawable;
            } catch (Throwable th) {
                th = th;
                drawable = bitmapDrawable;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        e1.a(th);
        return drawable;
    }

    public static void G1(View view, float f2) {
        ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) f2;
            view.setLayoutParams(layoutParams);
        }
    }

    public static int H() {
        if (f492d < 0) {
            f492d = (int) G(48.0f);
        }
        return f492d;
    }

    private static String H0() {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 4; i2++) {
            int iNextInt = f489a.nextInt(63);
            sb.append((char) (iNextInt < 10 ? iNextInt + 48 : iNextInt < 36 ? iNextInt + 55 : iNextInt + 61));
        }
        return sb.toString();
    }

    public static void H1(int i2) {
        K1(b2.f(i2), 1);
    }

    public static Process I(String[] strArr) {
        return K(strArr, null, null);
    }

    public static View I0(View view) {
        View rootView = view.getRootView();
        if (rootView != null) {
            return rootView;
        }
        while (true) {
            Object parent = view.getParent();
            if (parent == null || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return view;
    }

    public static void I1(int i2, int i3) {
        K1(b2.f(i2), i3);
    }

    public static Process J(String[] strArr, String[] strArr2) {
        return K(strArr, strArr2, null);
    }

    public static Tools$a0 J0(ListView listView) {
        View childAt;
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        try {
            childAt = listView.getChildAt(0);
        } catch (ArrayIndexOutOfBoundsException unused) {
            childAt = null;
        }
        return new Tools$a0(firstVisiblePosition, childAt != null ? childAt.getTop() - listView.getPaddingTop() : 0);
    }

    public static void J1(String str) {
        K1(str, 1);
    }

    public static Process K(String[] strArr, String[] strArr2, File file) {
        if (!t) {
            try {
                return Runtime.getRuntime().exec(strArr, strArr2, file);
            } catch (Throwable th) {
                String message = th.getMessage();
                if (!message.contains("nknown error") && !message.contains("xec failed") && !message.contains("ead failed")) {
                    throw th;
                }
                e1.s("Failed exec: " + Arrays.toString(strArr) + "; " + strArr2 + "; " + file, th);
            }
        }
        Process processC = ProcessBuilder.c(strArr, strArr2, file);
        t = true;
        return processC;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    public static String K0() {
        String absolutePath;
        int i2;
        try {
            absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        } catch (Throwable th) {
            e1.l("Fail get sdcard path", th);
            absolutePath = null;
        }
        if (absolutePath == null) {
            return "/sdcard";
        }
        if (!absolutePath.startsWith("/storage/emulated/0")) {
            return absolutePath;
        }
        if (r == 0) {
            if (c1(absolutePath)) {
                i2 = -1;
            } else {
                if (c1("/storage/emulated/legacy" + absolutePath.substring(19))) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
            }
            r = i2;
        }
        if (r <= 0) {
            return absolutePath;
        }
        return "/storage/emulated/legacy" + absolutePath.substring(19);
    }

    public static void K1(String str, int i2) {
        n2.i(new Tools$b(str, i2));
    }

    public static void L(Window window, View view, boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) f0().getSystemService("input_method");
        int i2 = window.getAttributes().softInputMode & (-16);
        if (z) {
            window.clearFlags(131072);
            window.setSoftInputMode(i2 | 5);
            inputMethodManager.showSoftInput(view, 0);
        } else {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            window.addFlags(131072);
            window.setSoftInputMode(i2 | 2);
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static int L0(Object obj) {
        int i2;
        int i3 = 0;
        if (obj == null) {
            return 0;
        }
        if (obj instanceof d.a) {
            d.a aVar = (d.a) obj;
            int i4 = aVar.i();
            i2 = 0;
            while (i3 < i4) {
                try {
                    if (aVar.c(i3)) {
                        i2++;
                    }
                } catch (IndexOutOfBoundsException unused) {
                }
                i3++;
            }
        } else {
            if (!(obj instanceof d.e)) {
                if (!(obj instanceof boolean[])) {
                    throw new IllegalArgumentException();
                }
                boolean[] zArr = (boolean[]) obj;
                int length = zArr.length - 1;
                for (int i5 = 1; i5 < length; i5++) {
                    if (zArr[i5]) {
                        i3++;
                    }
                }
                return i3;
            }
            d.e eVar = (d.e) obj;
            int iL = eVar.l();
            i2 = 0;
            while (i3 < iL) {
                if (eVar.a(i3)) {
                    i2++;
                }
                i3++;
            }
        }
        return i2;
    }

    public static String L1(String str, Object... objArr) {
        try {
            str = String.format(k.f(), str.replace((char) 65292, ','), objArr);
        } catch (Throwable th) {
            String str2 = "Failed String.format('" + str + "', " + Arrays.toString(objArr) + ") with '" + k.f() + "' (" + b2.f(R$string.lang_code) + ") " + Config.b(R$id.config_number_locale).f42d;
            e1.l(str2, th);
            n0.i(str2 + "\n\n" + e1.n(th));
            if (str != null && objArr != null) {
                String[] strArrSplit = str.split("%(\\d+\\$)?([\\-#+ 0;\\(])?(\\d+)?(\\.\\d+)?([bBhHsScCdoxXeEfgGaA]|[tT][HIklMSLNpzZsQBbhAaCYyjmdeRTrDFc])", objArr.length + 1);
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < objArr.length; i2++) {
                    if (i2 < strArrSplit.length) {
                        sb.append(strArrSplit[i2]);
                    }
                    sb.append(objArr[i2]);
                }
                if (objArr.length < strArrSplit.length) {
                    sb.append(strArrSplit[objArr.length]);
                }
                str = sb.toString().replace("%n", "\n").replace("%%", "%");
            }
        }
        return str == null ? "Failed call String.format" : str;
    }

    public static void M(String str, File file) {
        Resources resources = f0().getResources();
        int iD = b2.d("ydw" + str, "raw");
        if (iD == 0) {
            e1.d("Nothing extract file " + str + ' ' + file.getAbsolutePath());
            throw new RuntimeException("Nothing extract");
        }
        try {
            byte[] bArr = new byte[8192];
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            InputStream inputStreamOpenRawResource = resources.openRawResource(iD);
            while (true) {
                int i2 = inputStreamOpenRawResource.read(bArr);
                if (i2 <= 0) {
                    inputStreamOpenRawResource.close();
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, i2);
            }
        } catch (IOException e2) {
            e1.g("Failed extract file " + str + ' ' + file.getAbsolutePath(), e2);
            throw new RuntimeException(e2);
        }
    }

    public static SharedPreferences M0() {
        SharedPreferences sharedPreferences = (SharedPreferences) s.get();
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = f0().getSharedPreferences(MainService.G0, 0);
        s = new WeakReference(sharedPreferences2);
        return sharedPreferences2;
    }

    public static String M1(String str, String str2, String str3, Object obj) {
        String str4;
        try {
            str4 = String.format(k.f(), str, obj);
        } catch (Throwable th) {
            e1.s("Format fail 1", th);
            str4 = null;
        }
        if (str4 == null) {
            try {
                str4 = String.format(k.f(), str2, obj);
            } catch (Throwable th2) {
                e1.s("Format fail 2", th2);
            }
        }
        return str4 == null ? str3 : str4;
    }

    public static void N(AlertDialog alertDialog) {
        if (alertDialog == null) {
            return;
        }
        int i2 = 0;
        TextView[] textViewArr = {alertDialog.getButton(-1), alertDialog.getButton(-2), alertDialog.getButton(-3)};
        ViewGroup viewGroup = null;
        for (int i3 = 0; i3 < 3; i3++) {
            TextView textView = textViewArr[i3];
            if (textView != null && (viewGroup = (ViewGroup) textView.getParent()) != null) {
                break;
            }
        }
        if (viewGroup == null) {
            return;
        }
        int width = viewGroup.getWidth();
        if (width == 0) {
            viewGroup.requestLayout();
            width = viewGroup.getWidth();
            if (width == 0) {
                width = viewGroup.getMeasuredWidth();
            }
            if (width == 0) {
                viewGroup.measure(-1, -2);
                width = viewGroup.getMeasuredWidth();
            }
        }
        if (width == 0 || P0(width, viewGroup, 0)) {
            return;
        }
        for (int i4 = 0; i4 < 3; i4++) {
            TextView textView2 = textViewArr[i4];
            if (textView2 != null) {
                textView2.setAllCaps(false);
            }
        }
        if (P0(width, viewGroup, 5)) {
            return;
        }
        for (int i5 = 0; i5 < 3; i5++) {
            TextView textView3 = textViewArr[i5];
            if (textView3 != null) {
                ColorStateList textColors = textView3.getTextColors();
                D1(textView3, R$style.SmallText);
                textView3.setTextColor(textColors);
            }
        }
        if (P0(width, viewGroup, 10)) {
            return;
        }
        String[][] strArr = {new String[]{b2.f(R$string.cancel), b2.f(R$string.no)}, new String[]{b2.f(R$string.save), b2.f(R$string.yes), b2.f(R$string.ok)}, new String[]{b2.f(R$string.new_search), b2.f(R$string.new_search_short)}};
        int i6 = 0;
        while (i6 < 3) {
            String[] strArr2 = strArr[i6];
            if (strArr2 != null) {
                int i7 = 0;
                for (int i8 = 0; i8 < strArr2.length; i8++) {
                    if (strArr2[i7].length() >= strArr2[i8].length()) {
                        i7 = i8;
                    }
                }
                int i9 = 0;
                boolean z = false;
                while (i9 < 3) {
                    TextView textView4 = textViewArr[i9];
                    if (textView4 != null) {
                        String string = textView4.getText().toString();
                        while (i2 < strArr2.length) {
                            if (i2 != i7 && strArr2[i2].equals(string)) {
                                textView4.setText(strArr2[i7]);
                                z = true;
                            }
                            i2++;
                        }
                    }
                    i9++;
                    i2 = 0;
                }
                if (z && P0(width, viewGroup, i6 + 20)) {
                    return;
                }
            }
            i6++;
            i2 = 0;
        }
        boolean z2 = false;
        for (int i10 = 0; i10 < 3; i10++) {
            TextView textView5 = textViewArr[i10];
            if (textView5 != null && textView5.getText().toString().indexOf(32) != -1) {
                textView5.setText(textView5.getText().toString().replace(' ', '\n'));
                z2 = true;
            }
        }
        if (z2 && P0(width, viewGroup, 40)) {
            return;
        }
        if (viewGroup instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) viewGroup;
            if (linearLayout.getOrientation() == 0) {
                linearLayout.setOrientation(1);
                if (P0(width, viewGroup, 100)) {
                    return;
                }
            }
        }
        P0(width, viewGroup, -1);
    }

    public static Intent N0(Context context, String str, String str2) {
        if (context == null) {
            context = f0();
        }
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            launchIntentForPackage = new Intent("android.intent.action.MAIN");
        }
        launchIntentForPackage.setPackage(str);
        if (str2 != null) {
            launchIntentForPackage.setClassName(str, str2);
        }
        launchIntentForPackage.setFlags(268435456);
        return launchIntentForPackage;
    }

    public static String N1(int i2) {
        return O1(b2.f(i2));
    }

    public static void O(View view) {
    }

    public static View O0(View view) {
        ViewParent parent;
        if (view != null && (parent = view.getParent()) != null && (parent instanceof ViewGroup)) {
            try {
                ((ViewGroup) parent).removeView(view);
            } catch (Throwable th) {
                e1.a(th);
            }
        }
        return view;
    }

    public static String O1(String str) {
        return P1(str, ":");
    }

    public static void P(TextView textView) {
        try {
            ViewTreeObserver viewTreeObserver = textView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnPreDrawListener(textView);
            }
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    private static boolean P0(int i2, ViewGroup viewGroup, int i3) {
        viewGroup.requestLayout();
        viewGroup.measure(-2, -2);
        int measuredWidth = viewGroup.getMeasuredWidth();
        boolean z = measuredWidth <= i2;
        if (i3 != 0 || !z) {
            e1.d("fixDialogButtonsSize: " + measuredWidth + " <= " + i2 + " = " + z + " [" + i3 + ']');
        }
        return z;
    }

    private static String P1(String str, String str2) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return str;
        }
        if (str2 != null) {
            if (!str2.isEmpty()) {
                while (length != 0) {
                    char cCharAt = str.charAt(length - 1);
                    if (str2.indexOf(cCharAt) == -1 && !Character.isWhitespace(cCharAt)) {
                        break;
                    }
                    length--;
                }
            } else {
                return str;
            }
        } else {
            while (length != 0 && Character.isWhitespace(str.charAt(length - 1))) {
                length--;
            }
        }
        return str.substring(0, length);
    }

    public static WindowManager$LayoutParams Q(WindowManager$LayoutParams windowManager$LayoutParams) {
        IBinder windowToken;
        windowManager$LayoutParams.flags = (Config.B & 2) != 0 ? windowManager$LayoutParams.flags | 16777216 : windowManager$LayoutParams.flags & (-16777217);
        boolean zW1 = W1();
        if (m2.f1074a && !zW1) {
            e1.d("canDrawOverlays = false; fixed");
        }
        if (zW1) {
            if ((windowManager$LayoutParams.type == m2.b() || windowManager$LayoutParams.type == m2.c()) && windowManager$LayoutParams.token != null) {
                e1.d("token: null " + windowManager$LayoutParams.token);
                windowToken = null;
            }
            if (Config.vSpaceReal && !Config.D) {
                e1.d("Use 10 " + Config.E + " instead of " + windowManager$LayoutParams.packageName);
                windowManager$LayoutParams.packageName = Config.E;
            }
            return windowManager$LayoutParams;
        }
        windowManager$LayoutParams.type = 2;
        windowToken = r.n.getWindow().getAttributes().token;
        if (windowToken == null) {
            windowToken = r.n.getWindow().getDecorView().getRootView().getWindowToken();
        }
        windowManager$LayoutParams.token = windowToken;
        if (Config.vSpaceReal) {
            e1.d("Use 10 " + Config.E + " instead of " + windowManager$LayoutParams.packageName);
            windowManager$LayoutParams.packageName = Config.E;
        }
        return windowManager$LayoutParams;
    }

    public static boolean Q0(View view) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                try {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt == null || childAt.getVisibility() != 0 || (!(childAt instanceof android.widget.EditText) && (!(childAt instanceof ViewGroup) || !Q0(childAt)))) {
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
            return false;
        }
        if (!(view instanceof android.widget.EditText)) {
            return false;
        }
        return true;
    }

    public static String Q1(String str) {
        String strTrim = str.trim();
        int length = strTrim.length();
        for (int i2 = length - 1; i2 > 0 && strTrim.charAt(i2) == '/'; i2--) {
            length--;
        }
        return length < strTrim.length() ? strTrim.substring(0, length) : strTrim;
    }

    public static void R(Window window) {
        window.setAttributes(Q(window.getAttributes()));
    }

    public static void R0(AlertDialog alertDialog) {
        n2.i(new Tools$d(alertDialog));
    }

    public static Drawable R1(Drawable drawable) {
        if (drawable == null) {
            return drawable;
        }
        try {
            Drawable$ConstantState constantState = drawable.getConstantState();
            return constantState != null ? constantState.newDrawable() : drawable;
        } catch (Throwable th) {
            e1.a(th);
            return drawable;
        }
    }

    public static void S(View view) {
        View viewI0 = I0(view);
        E1(viewI0);
        O(viewI0);
    }

    public static void S0(View view) {
        n2.i(new Tools$f(view));
    }

    public static boolean S1(long j2, long j3) {
        return ((j2 < 0) ^ (j2 < j3)) ^ (j3 < 0);
    }

    private static String T(long j2, boolean z) {
        String str;
        String strL1;
        float f2 = j2;
        if (f2 > 900.0f) {
            f2 /= 1024.0f;
            str = "KB";
        } else {
            str = "B";
        }
        if (f2 > 900.0f) {
            f2 /= 1024.0f;
            str = "MB";
        }
        if (f2 > 900.0f) {
            f2 /= 1024.0f;
            str = "GB";
        }
        if (f2 > 900.0f) {
            f2 /= 1024.0f;
            str = "TB";
        }
        if (f2 > 900.0f) {
            f2 /= 1024.0f;
            str = "PB";
        }
        if (f2 < 1.0f) {
            strL1 = L1("%.2f", Float.valueOf(f2));
        } else if (f2 < 10.0f) {
            Object[] objArr = new Object[1];
            Float fValueOf = Float.valueOf(f2);
            if (z) {
                objArr[0] = fValueOf;
                strL1 = L1("%.1f", objArr);
            } else {
                objArr[0] = fValueOf;
                strL1 = L1("%.2f", objArr);
            }
        } else if (f2 < 100.0f) {
            Object[] objArr2 = new Object[1];
            Float fValueOf2 = Float.valueOf(f2);
            if (z) {
                objArr2[0] = fValueOf2;
                strL1 = L1("%.0f", objArr2);
            } else {
                objArr2[0] = fValueOf2;
                strL1 = L1("%.2f", objArr2);
            }
        } else {
            strL1 = L1("%.0f", Float.valueOf(f2));
        }
        return strL1 + ' ' + str;
    }

    public static void T0(Window window) {
        n2.i(new Tools$e(window));
    }

    public static boolean T1(long j2, long j3) {
        return j2 == j3 || S1(j2, j3);
    }

    public static String U(Context context, long j2) {
        try {
            return Formatter.formatFileSize(context, j2);
        } catch (Throwable th) {
            e1.a(th);
            try {
                return T(j2, false);
            } catch (Throwable th2) {
                e1.a(th2);
                return Long.toString(j2);
            }
        }
    }

    public static void U0(WeakReference weakReference) {
        AlertDialog alertDialog;
        if (weakReference == null || (alertDialog = (AlertDialog) weakReference.get()) == null) {
            return;
        }
        R0(alertDialog);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017  */
    public static void U1(Configuration configuration) {
        int i2 = 0;
        if (configuration == null) {
            try {
                configuration = f0().getResources().getConfiguration();
                if (configuration.orientation == 2) {
                    i2 = 1;
                }
            } catch (Throwable th) {
                e1.a(th);
            }
        } else if (configuration.orientation == 2) {
            i2 = 1;
        }
        w = i2;
    }

    public static int V(int i2, int i3) {
        while (true) {
            int i4 = i3;
            int i5 = i2;
            i2 = i4;
            if (i2 == 0) {
                return i5;
            }
            i3 = i5 % i2;
        }
    }

    public static int V0(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 0) {
            return -1;
        }
        int[] iArrW = w(bArr2);
        int i2 = 0;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            while (i2 > 0 && bArr2[i2] != bArr[i3]) {
                i2 = iArrW[i2 - 1];
            }
            if (bArr2[i2] == bArr[i3]) {
                i2++;
            }
            if (i2 == bArr2.length) {
                return (i3 - bArr2.length) + 1;
            }
        }
        return -1;
    }

    public static void V1(View view, WindowManager$LayoutParams windowManager$LayoutParams) {
        ViewParent parent = view.getParent();
        if (parent instanceof Tools$ViewWrapper) {
            view = (Tools$ViewWrapper) parent;
        }
        F1(view, windowManager$LayoutParams, false);
    }

    public static String W() {
        String packageCodePath;
        String str = null;
        try {
            Context contextF0 = f0();
            packageCodePath = contextF0 != null ? contextF0.getPackageCodePath() : null;
        } catch (Throwable th) {
            e1.a(th);
        }
        if (packageCodePath == null) {
            try {
                ApplicationInfo applicationInfoY = Y(i.f1002d);
                if (applicationInfoY != null) {
                    packageCodePath = applicationInfoY.sourceDir;
                }
            } catch (Throwable th2) {
                e1.a(th2);
            }
        }
        if (packageCodePath != null) {
            return packageCodePath;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/self/maps")));
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    if (line.contains(i.f1002d) && line.contains(".apk")) {
                        String str2 = line.split("\\.apk", 2)[0] + ".apk";
                        if (str2.indexOf(64) == -1) {
                            packageCodePath = '/' + str2.split("/", 2)[1].trim();
                            break;
                        }
                        String[] strArrSplit = str2.trim().split("/");
                        str = '/' + strArrSplit[strArrSplit.length - 1].trim().replace('@', '/');
                    }
                } else {
                    break;
                }
            }
            bufferedReader.close();
            return (packageCodePath != null || str == null) ? packageCodePath : str;
        } catch (Throwable th3) {
            e1.a(th3);
            return packageCodePath;
        }
    }

    public static void W0(Activity activity) {
        try {
            a(activity);
        } catch (Throwable th) {
            e1.a(th);
        }
        try {
            a(activity.getApplication());
        } catch (Throwable th2) {
            e1.a(th2);
        }
        try {
            a(activity.getApplicationContext());
        } catch (Throwable th3) {
            e1.a(th3);
        }
    }

    static boolean W1() {
        if (!m2.f1074a) {
            return false;
        }
        if (f490b == -1) {
            f490b = m(f0()) ? 1 : 0;
        }
        return f490b != 0;
    }

    public static Drawable X(ApplicationInfo applicationInfo) {
        PackageManager packageManager = k;
        Drawable drawableLoadIcon = null;
        if (applicationInfo != null && packageManager != null) {
            try {
                boolean zA = a0.a(applicationInfo.packageName, "icon");
                try {
                    drawableLoadIcon = applicationInfo.loadIcon(packageManager);
                    a0.b(zA);
                    if (drawableLoadIcon == null) {
                        boolean zA2 = a0.a(applicationInfo.packageName, "icon2");
                        try {
                            drawableLoadIcon = packageManager.getApplicationIcon(applicationInfo);
                            a0.b(zA2);
                        } catch (Throwable th) {
                            a0.b(zA2);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    a0.b(zA);
                    throw th2;
                }
            } catch (Throwable th3) {
                e1.l("Failed load icon for: " + applicationInfo.packageName, th3);
            }
        }
        return drawableLoadIcon;
    }

    public static void X0(Context context) {
        try {
            a(context);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    public static boolean X1(Process process, int i2) {
        FutureTask futureTask = new FutureTask(new Tools$h(process));
        new n0$i(futureTask, "waitForTimeout: " + process).start();
        try {
            return ((Boolean) futureTask.get(i2, TimeUnit.SECONDS)).booleanValue();
        } catch (Exception unused) {
            return Z0(process);
        }
    }

    public static ApplicationInfo Y(String str) {
        return Z(str, 0);
    }

    public static int[] Y0(List list) {
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((Integer) it.next()).intValue();
            i2++;
        }
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b4 A[Catch: all -> 0x00ca, TRY_LEAVE, TryCatch #3 {all -> 0x00ca, blocks: (B:31:0x005e, B:33:0x00b4, B:35:0x00be, B:38:0x00c4, B:39:0x00c9, B:43:0x00cd, B:44:0x00d1, B:45:0x00d2, B:47:0x00d6, B:34:0x00ba), top: B:62:0x005e, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4 A[Catch: all -> 0x00ca, TryCatch #3 {all -> 0x00ca, blocks: (B:31:0x005e, B:33:0x00b4, B:35:0x00be, B:38:0x00c4, B:39:0x00c9, B:43:0x00cd, B:44:0x00d1, B:45:0x00d2, B:47:0x00d6, B:34:0x00ba), top: B:62:0x005e, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d6 A[Catch: all -> 0x00ca, TRY_LEAVE, TryCatch #3 {all -> 0x00ca, blocks: (B:31:0x005e, B:33:0x00b4, B:35:0x00be, B:38:0x00c4, B:39:0x00c9, B:43:0x00cd, B:44:0x00d1, B:45:0x00d2, B:47:0x00d6, B:34:0x00ba), top: B:62:0x005e, inners: #5 }] */
    public static ApplicationInfo Z(String str, int i2) throws PackageManager$NameNotFoundException {
        ApplicationInfo applicationInfo;
        Object objU0;
        Tools$y tools$yX0;
        boolean zA;
        Object objB = null;
        if (a0.i(str)) {
            e1.i("Failed getApplicationInfo, isBuggedPackage: " + str);
            return null;
        }
        PackageManager packageManagerB0 = B0();
        if (packageManagerB0 != null) {
            try {
                boolean zA2 = a0.a(str, "app_info");
                try {
                    applicationInfo = packageManagerB0.getApplicationInfo(str, i2);
                    try {
                        a0.b(zA2);
                    } catch (Throwable th) {
                        th = th;
                        if (!(th instanceof PackageManager$NameNotFoundException)) {
                            throw th;
                        }
                        e1.l("Failed getApplicationInfo", th);
                    }
                } catch (Throwable th2) {
                    try {
                        a0.b(zA2);
                        throw th2;
                    } catch (Throwable th3) {
                        th = th3;
                        applicationInfo = null;
                        if (!(th instanceof PackageManager$NameNotFoundException)) {
                            throw th;
                        }
                        e1.l("Failed getApplicationInfo", th);
                        if (applicationInfo == null) {
                            try {
                                Class<?> cls = objU0.getClass();
                                Class cls2 = Integer.TYPE;
                                tools$yX0 = x0(cls, new Tools$y[]{new Tools$y(cls, "getApplicationInfo", new Class[]{String.class, cls2, cls2}, objU0, new Object[]{str, Integer.valueOf(i2), 0}), new Tools$y(cls, "getApplicationInfo", new Class[]{String.class, cls2}, objU0, new Object[]{str, Integer.valueOf(i2)})});
                                if (tools$yX0 != null) {
                                    zA = a0.a(str, "app_info2");
                                    try {
                                        objB = tools$yX0.b();
                                        a0.b(zA);
                                        if (objB != null) {
                                            throw new PackageManager$NameNotFoundException(str);
                                        }
                                    } catch (Throwable th4) {
                                        a0.b(zA);
                                        throw th4;
                                    }
                                }
                                if (objB instanceof ApplicationInfo) {
                                    return (ApplicationInfo) objB;
                                }
                            } catch (Throwable th5) {
                                if (th5 instanceof PackageManager$NameNotFoundException) {
                                    throw th5;
                                }
                                e1.l("Failed getApplicationInfo", th5);
                            }
                        }
                        return applicationInfo;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } else {
            applicationInfo = null;
        }
        if (applicationInfo == null && (objU0 = u0()) != null) {
            Class<?> cls3 = objU0.getClass();
            Class cls4 = Integer.TYPE;
            tools$yX0 = x0(cls3, new Tools$y[]{new Tools$y(cls3, "getApplicationInfo", new Class[]{String.class, cls4, cls4}, objU0, new Object[]{str, Integer.valueOf(i2), 0}), new Tools$y(cls3, "getApplicationInfo", new Class[]{String.class, cls4}, objU0, new Object[]{str, Integer.valueOf(i2)})});
            if (tools$yX0 != null) {
                zA = a0.a(str, "app_info2");
                objB = tools$yX0.b();
                a0.b(zA);
                if (objB != null) {
                    throw new PackageManager$NameNotFoundException(str);
                }
            }
            if (objB instanceof ApplicationInfo) {
                return (ApplicationInfo) objB;
            }
        }
        return applicationInfo;
    }

    public static boolean Z0(Process process) {
        try {
            process.exitValue();
            return true;
        } catch (IllegalThreadStateException unused) {
            return false;
        }
    }

    private static void a(Context context) {
        if (k == null) {
            try {
                k = context.getPackageManager();
            } catch (Throwable th) {
                e1.a(th);
            }
        }
        if (h == null) {
            try {
                h = context.getPackageName();
            } catch (Throwable th2) {
                e1.a(th2);
            }
        }
        if (h == null) {
            h = i.f1002d;
        }
        if (i == null) {
            try {
                i = context.getFilesDir().getAbsolutePath();
            } catch (Throwable th3) {
                e1.a(th3);
            }
        }
        if (j == null) {
            try {
                j = context.getCacheDir().getAbsolutePath();
            } catch (Throwable th4) {
                e1.a(th4);
            }
        }
        if (i == null && h != null) {
            i = n0() + "/files";
        }
        if (j == null && h != null) {
            j = n0() + "/cache";
        }
        if (i != null) {
            try {
                File file = new File(i);
                if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (Throwable th5) {
                e1.a(th5);
            }
        }
        if (j != null) {
            try {
                File file2 = new File(j);
                if (file2.exists()) {
                    return;
                }
                file2.mkdirs();
            } catch (Throwable th6) {
                e1.a(th6);
            }
        }
    }

    public static String a0(ApplicationInfo applicationInfo) {
        CharSequence charSequenceLoadLabel;
        PackageManager packageManager = k;
        if (applicationInfo == null || packageManager == null) {
            return null;
        }
        try {
            boolean zA = a0.a(applicationInfo.packageName, "label");
            try {
                charSequenceLoadLabel = applicationInfo.loadLabel(packageManager);
                try {
                    a0.b(zA);
                    if (charSequenceLoadLabel == null) {
                        boolean zA2 = a0.a(applicationInfo.packageName, "label2");
                        try {
                            charSequenceLoadLabel = packageManager.getApplicationLabel(applicationInfo);
                            a0.b(zA2);
                        } catch (Throwable th) {
                            a0.b(zA2);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    e1.l("Failed load label for: " + applicationInfo.packageName, th);
                }
            } catch (Throwable th3) {
                a0.b(zA);
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            charSequenceLoadLabel = null;
        }
        if (charSequenceLoadLabel != null) {
            return charSequenceLoadLabel.toString();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.FileInputStream] */
    public static boolean a1(Object obj) throws Throwable {
        ?? r1;
        FileInputStream fileInputStream;
        String str;
        File file = obj instanceof File ? (File) obj : new File(obj.toString());
        if (file.exists()) {
            r1 = !file.isFile() ? 2131296818 : 0;
        } else {
            r1 = 2131296450;
        }
        ?? r3 = 0;
        try {
            if (r1 != 0) {
                str = N1(r1) + ": " + obj;
            } else {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read();
                        try {
                            fileInputStream.close();
                            return true;
                        } catch (IOException unused) {
                            return true;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        str = obj + "\n\n" + e.getMessage();
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        f.o(f.b().setCustomTitle(g0(R$string.error)).setMessage(str).setPositiveButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null));
                        return false;
                    }
                } catch (IOException e3) {
                    e = e3;
                    fileInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    if (r3 != 0) {
                        try {
                            r3.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            }
            f.o(f.b().setCustomTitle(g0(R$string.error)).setMessage(str).setPositiveButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null));
            return false;
        } catch (Throwable th2) {
            th = th2;
            r3 = r1;
        }
    }

    public static File b0() {
        String strM0 = j;
        if (strM0 == null) {
            strM0 = m0("/cache");
        }
        if (strM0 != null) {
            return new File(strM0);
        }
        return null;
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
        } catch (Throwable th) {
            return th;
        }
    }

    public static void c(TextView textView, Drawable drawable, int i2) {
        if (textView == null) {
            return;
        }
        n2.i(new Tools$s(textView, drawable, i2));
    }

    public static File c0() {
        File fileB0 = b0();
        if (fileB0 == null) {
            return fileB0;
        }
        File file = new File(fileB0, s0());
        file.mkdirs();
        return file;
    }

    private static boolean c1(String str) {
        try {
            File file = new File(str);
            String[] list = file.list();
            if (list == null) {
                return false;
            }
            if (list.length == 0) {
                File file2 = new File(file, ".gg." + System.nanoTime());
                file2.createNewFile();
                list = file.list();
                file2.delete();
            }
            return list.length > 0;
        } catch (Throwable th) {
            e1.s("isGoodDir: '" + str + "'", th);
            return false;
        }
    }

    private static void d(TextView textView, Drawable drawable, int i2) {
        Drawable[] compoundDrawables;
        if (f493e == -1) {
            f493e = (int) (G(12.0f) + 0.5f);
        }
        if (drawable != null) {
            int iG = (int) G(i2);
            try {
                drawable.setBounds(0, 0, iG, iG);
            } catch (Throwable th) {
                e1.a(th);
            }
        }
        try {
            Object tag = textView.getTag(R$id.icon);
            int iIntValue = tag instanceof Integer ? ((Integer) tag).intValue() : 0;
            if (iIntValue == 0) {
                Drawable[] compoundDrawables2 = textView.getCompoundDrawables();
                compoundDrawables = textView.getCompoundDrawablesRelative();
                if (compoundDrawables[0] != null) {
                    iIntValue = 4;
                } else if (compoundDrawables2[0] != null) {
                    compoundDrawables = compoundDrawables2;
                    iIntValue = 2;
                } else {
                    iIntValue = 3;
                }
                textView.setTag(R$id.icon, Integer.valueOf(iIntValue));
            } else {
                compoundDrawables = null;
            }
            boolean z = iIntValue == 1 || iIntValue == 2;
            if (compoundDrawables == null) {
                compoundDrawables = z ? textView.getCompoundDrawables() : textView.getCompoundDrawablesRelative();
            }
            char c2 = (iIntValue == 1 || iIntValue == 3) ? (char) 0 : (char) 2;
            if (compoundDrawables[c2] != drawable) {
                compoundDrawables[c2] = drawable;
                if (z) {
                    textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
                } else {
                    textView.setCompoundDrawablesRelative(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
                }
            }
        } catch (StringIndexOutOfBoundsException e2) {
            e1.a(e2);
        }
        textView.setCompoundDrawablePadding(f493e);
    }

    public static int d0(int i2) {
        return e0(i2, -1);
    }

    public static int d1() {
        int i2 = w;
        if (i2 != -1) {
            return i2;
        }
        U1(null);
        return w;
    }

    public static void e(ListView listView, CharSequence[] charSequenceArr, Drawable[] drawableArr, int i2, int i3) {
        try {
            listView.setOnHierarchyChangeListener(new Tools$u(i3, charSequenceArr, drawableArr, i2));
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    public static int e0(int i2, int i3) {
        try {
            Context contextF0 = f0();
            if (Build$VERSION.SDK_INT >= 23) {
                try {
                    return contextF0.getColor(i2);
                } catch (Throwable th) {
                    e1.a(th);
                }
            }
            return contextF0.getResources().getColor(i2);
        } catch (Throwable th2) {
            e1.a(th2);
            return i3;
        }
    }

    public static boolean e1(String str) {
        try {
            Z(str, 0);
            return true;
        } catch (PackageManager$NameNotFoundException unused) {
            return false;
        }
    }

    public static void f(View view, WindowManager$LayoutParams windowManager$LayoutParams) {
        e1.d("dbg2: " + view + ' ' + windowManager$LayoutParams);
        F1(view, windowManager$LayoutParams, true);
    }

    public static Context f0() {
        Context context = MainService.context;
        if (context != null || r.p == null) {
            return context;
        }
        return l1(r.p) == null ? r.o : r.p;
    }

    public static boolean f1(String str) {
        if (str.length() >= 2 && str.charAt(0) == '/') {
            return true;
        }
        f.o(f.b().setCustomTitle(g0(R$string.error)).setMessage(str + "\n\n" + b2.f(R$string.path_must_be)).setPositiveButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null));
        return false;
    }

    public static void g(View view, WindowManager$LayoutParams windowManager$LayoutParams) {
        n2.i(new Tools$j(windowManager$LayoutParams, view));
    }

    public static View g0(int i2) {
        return h0(b2.f(i2));
    }

    public static String g1(long j2) {
        long j3;
        StringBuilder sb = new StringBuilder();
        long jAbs = Math.abs(j2);
        int i2 = 0;
        while (true) {
            int[] iArr = o;
            if (i2 >= iArr.length) {
                break;
            }
            int i3 = iArr[i2 + 1];
            if (i3 <= 0) {
                j3 = 0;
            } else {
                long j4 = i3;
                long j5 = jAbs % j4;
                j3 = jAbs / j4;
                jAbs = j5;
            }
            if (jAbs > 0) {
                if (sb.length() > 0) {
                    sb.insert(0, " ");
                }
                sb.insert(0, b2.f(o[i2]));
                sb.insert(0, " ");
                sb.insert(0, jAbs);
            }
            if (j3 == 0) {
                break;
            }
            i2 += 2;
            jAbs = j3;
        }
        if (sb.length() == 0) {
            sb.insert(0, b2.f(o[0]));
            sb.insert(0, "0 ");
        }
        if (j2 < 0) {
            sb.insert(0, "-");
        }
        return sb.toString();
    }

    public static void h(String str, int i2) {
        i(str, i2, null, null);
    }

    public static View h0(String str) {
        return i0(str, null);
    }

    static void h1() {
        f490b = 1;
    }

    public static void i(String str, int i2, String str2, DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        n2.i(new Tools$m(str, i2, str2, dialogInterface$OnClickListener));
    }

    public static View i0(String str, String str2) {
        return j0(str, str2, -1);
    }

    public static boolean i1(String str) {
        Intent intent;
        try {
            Context contextF0 = f0();
            try {
                intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", str, null));
            } catch (ActivityNotFoundException e2) {
                e1.s("Failed open app info for: " + str, e2);
                intent = new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS");
            }
            intent.setFlags(268435456);
            contextF0.startActivity(intent);
            return true;
        } catch (Throwable th) {
            e1.s("Failed open app info for: " + str, th);
            return false;
        }
    }

    public static boolean j(String str) {
        File file = new File(str);
        if (file.canExecute()) {
            return true;
        }
        String[] strArr = {"chmod", "0755", F0(str)};
        try {
            if (!X1(I(strArr), 15)) {
                e1.s("timeout fail 1: " + Arrays.toString(strArr), new RuntimeException());
            }
        } catch (Exception e2) {
            e1.s("exec", e2);
        }
        if (!Config.C) {
            if (file.canExecute()) {
                return true;
            }
            try {
                if (!X1(e2.q("exec " + y(strArr, " ")), 15)) {
                    e1.s("timeout fail 2: " + Arrays.toString(strArr), new RuntimeException());
                }
            } catch (Exception e3) {
                e1.s("root", e3);
            }
        }
        return file.canExecute();
    }

    public static View j0(String str, String str2, int i2) {
        View viewF = a.d.f(R$layout.dialog_title, null);
        TextView textView = (TextView) viewF.findViewById(R$id.alertTitle);
        textView.setText(str);
        if (i2 != -1 && i2 != 0) {
            r1(textView);
            textView.setOnClickListener(new Tools$l(str, i2));
        }
        if (str2 != null) {
            TextView textView2 = (TextView) viewF.findViewById(R$id.subTitle);
            textView2.setText(str2);
            textView2.setVisibility(0);
        }
        return viewF;
    }

    public static double j1(String str) {
        double d2;
        String strTrim = str.trim();
        if (strTrim.startsWith("-")) {
            strTrim = strTrim.substring(1);
            d2 = -1.0d;
        } else {
            d2 = 1.0d;
        }
        String[] strArrSplit = strTrim.split(":", o.length / 2);
        t1$b t1_b = new t1$b();
        double dLongBitsToDouble = 0.0d;
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            int length = (((strArrSplit.length - 1) - i2) * 2) + 1;
            if (length < o.length) {
                dLongBitsToDouble = (dLongBitsToDouble * ((double) o[length])) + Double.longBitsToDouble(t1.t(t1_b, strArrSplit[i2], strTrim).f1261a);
            }
        }
        return dLongBitsToDouble * d2;
    }

    public static boolean[] k(List list) {
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        return zArr;
    }

    public static Context k0() {
        return l0(f0());
    }

    public static String k1(String str) {
        return Pattern.quote(str).replace("^", "\\E^\\Q").replace("$", "\\E$\\Q").replace("?", "\\E.\\Q").replace("*", "\\E.*\\Q").replace("\\Q\\E", "");
    }

    public static final String l(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String upperCase = Integer.toHexString(b2 & 255).toUpperCase(Locale.US);
            while (upperCase.length() < 2) {
                upperCase = '0' + upperCase;
            }
            sb.append(upperCase);
        }
        return sb.toString();
    }

    public static Context l0(Context context) {
        return context;
    }

    public static Context l1(Context context) {
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static boolean m(Context context) {
        if (Build$VERSION.SDK_INT < 23) {
            return true;
        }
        try {
            return Settings.canDrawOverlays(context);
        } catch (Throwable th) {
            e1.a(th);
            return true;
        }
    }

    private static String m0(String str) {
        if (l == null) {
            try {
                ApplicationInfo applicationInfoY = Y(i.f1002d);
                if (applicationInfoY != null) {
                    l = applicationInfoY.dataDir;
                }
            } catch (Throwable th) {
                e1.a(th);
            }
        }
        if (l == null || str == null) {
            return l;
        }
        return l + str;
    }

    public static void m1(View view) {
        n2.i(new Tools$q(view));
    }

    public static void n(Object obj, int i2) {
        if (obj == null) {
            return;
        }
        boolean z = i2 == 1;
        if (obj instanceof d.a) {
            d.a aVar = (d.a) obj;
            int i3 = aVar.i();
            for (int i4 = 0; i4 < i3; i4++) {
                aVar.b(i4, i2 == 2 ? !aVar.c(i4) : z);
            }
            return;
        }
        if (obj instanceof d.e) {
            d.e eVar = (d.e) obj;
            int iL = eVar.l();
            for (int i5 = 0; i5 < iL; i5++) {
                eVar.k(i5, i2 == 2 ? !eVar.a(i5) : z);
            }
            return;
        }
        if (!(obj instanceof boolean[])) {
            throw new IllegalArgumentException();
        }
        boolean[] zArr = (boolean[]) obj;
        int length = zArr.length - 1;
        for (int i6 = 1; i6 < length; i6++) {
            zArr[i6] = i2 == 2 ? !zArr[i6] : z;
        }
    }

    public static String n0() {
        StringBuilder sb = new StringBuilder();
        sb.append("/data/");
        int iMyUid = Process.myUid() / 100000;
        if (iMyUid == 0) {
            sb.append("data");
        } else {
            sb.append("user/");
            sb.append(iMyUid);
        }
        sb.append('/');
        String str = h;
        if (str == null) {
            str = i.f1002d;
        }
        sb.append(str);
        return sb.toString();
    }

    public static void n1(View view) {
        n2.i(new Tools$o(view));
    }

    public static void o() {
        new g0(new Tools$i(), "checkForBadContext").start();
    }

    public static Drawable o0(int i2) {
        try {
            return f0().getDrawable(i2);
        } catch (NoSuchMethodError unused) {
            return f0().getResources().getDrawable(i2);
        }
    }

    public static void o1(android.widget.EditText editText) {
        if (editText == null) {
            return;
        }
        n2.i(new Tools$g(editText));
    }

    static void p() {
        if (Build$VERSION.SDK_INT >= 23) {
            try {
                if (m(f0())) {
                    return;
                }
                e1.p("canDrawOverlays = false");
            } catch (Throwable th) {
                e1.a(th);
            }
        }
    }

    public static File p0() {
        String strM0 = i;
        if (strM0 == null) {
            strM0 = m0("/files");
        }
        if (strM0 != null) {
            return new File(strM0);
        }
        return null;
    }

    public static void p1(View view) {
        q1(view, view.getBackground());
    }

    public static void q(File file, int i2) {
        file.setExecutable((i2 & 64) != 0, (i2 & 9) == 0);
        file.setWritable((i2 & 128) != 0, (i2 & 18) == 0);
        file.setReadable((i2 & 256) != 0, (i2 & 36) == 0);
        try {
            Os.chmod(file.getAbsolutePath(), i2);
        } catch (Throwable th) {
            e1.s("Failed chmod " + Integer.toOctalString(i2) + " '" + file + "'", th);
        }
    }

    public static File q0() {
        File fileP0 = p0();
        if (fileP0 == null) {
            return fileP0;
        }
        File file = new File(fileP0, s0());
        file.mkdirs();
        return file;
    }

    public static void q1(View view, Drawable drawable) {
        if (drawable == null) {
            try {
                drawable = new ColorDrawable(0);
            } catch (Throwable th) {
                e1.a(th);
                return;
            }
        }
        view.setFocusable(true);
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable background = new ImageButton(view.getContext()).getBackground();
        stateListDrawable.addState(a.g.f19a, background);
        stateListDrawable.addState(a.g.f20b, background);
        stateListDrawable.addState(a.g.f21c, background);
        stateListDrawable.addState(StateSet.WILD_CARD, drawable);
        view.setBackground(drawable);
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        int paddingTop = view.getPaddingTop();
        int paddingBottom = view.getPaddingBottom();
        view.setBackground(stateListDrawable);
        view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    public static void r(String str, String str2) {
        try {
            Os.chmod(str, Integer.parseInt(str2, 8));
        } catch (Throwable th) {
            e1.s("Failed chmod " + str2 + " '" + str + "'", th);
        }
        String[] strArr = {"chmod", str2, F0(str)};
        try {
            if (!X1(I(strArr), 15)) {
                e1.s("timeout fail 1: " + Arrays.toString(strArr), new RuntimeException());
            }
        } catch (Exception e2) {
            e1.s("exec", e2);
        }
        try {
            if (Config.C) {
                return;
            }
            if (X1(e2.q("exec " + y(strArr, " ")), 15)) {
                return;
            }
            e1.s("timeout fail 2: " + Arrays.toString(strArr), new RuntimeException());
        } catch (Exception e3) {
            e1.s("root", e3);
        }
    }

    public static long r0() {
        try {
            ActivityManager$MemoryInfo activityManager$MemoryInfo = new ActivityManager$MemoryInfo();
            ActivityManager activityManager = (ActivityManager) f0().getSystemService("activity");
            if (activityManager == null) {
                return -1L;
            }
            activityManager.getMemoryInfo(activityManager$MemoryInfo);
            return activityManager$MemoryInfo.availMem / 1048576;
        } catch (Throwable th) {
            e1.l("Failed get free mem", th);
            return -1L;
        }
    }

    public static void r1(View view) {
        q1(view, o0(R$drawable.ic_information_white_12dp));
    }

    public static String removeNewLinesChars(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            boolean z = false;
            for (int i3 = 0; i3 < 2; i3++) {
                z = z || cCharAt == '\n';
                if (i3 != 1) {
                    cCharAt = (char) (cCharAt - 3);
                }
            }
            if (z) {
                sb.append("");
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static boolean s(View view) {
        if (view == null) {
            return false;
        }
        return view.callOnClick();
    }

    public static String s0() {
        String strT0;
        SharedPreferences$Editor sharedPreferences$EditorRemove;
        if (m == null) {
            try {
                SharedPreferences sharedPreferencesM0 = M0();
                if (!sharedPreferencesM0.contains("hidden-dir")) {
                    String strT1 = t0();
                    if (strT1 == null) {
                        strT1 = H0();
                    }
                    sharedPreferencesM0.edit().putString("hidden-dir", strT1).commit();
                }
                strT0 = null;
                try {
                    strT0 = sharedPreferencesM0.getString("hidden-dir", null);
                } catch (ClassCastException unused) {
                }
                if (strT0 == null) {
                    int i2 = sharedPreferencesM0.getInt("hidden-dir", 0);
                    if (i2 != 0) {
                        strT0 = Integer.toString(i2);
                        sharedPreferences$EditorRemove = sharedPreferencesM0.edit().putString("hidden-dir", strT0);
                    } else {
                        sharedPreferences$EditorRemove = sharedPreferencesM0.edit().remove("hidden-dir");
                    }
                    sharedPreferences$EditorRemove.commit();
                }
            } catch (Throwable th) {
                e1.s("Failed get num", th);
                strT0 = t0();
            }
            if (strT0 == null) {
                strT0 = H0();
            }
            m = "GG-" + strT0;
        }
        return m;
    }

    public static boolean s1(DialogInterface dialogInterface, int i2, Object obj, View$OnClickListener view$OnClickListener) {
        Button button;
        if (!(dialogInterface instanceof AlertDialog) || (button = ((AlertDialog) dialogInterface).getButton(i2)) == null) {
            return false;
        }
        button.setTag(obj);
        button.setOnClickListener(view$OnClickListener);
        return true;
    }

    public static CharSequence t(CharSequence charSequence, int i2) {
        try {
            Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
            spannableString.setSpan(new ForegroundColorSpan(i2), 0, charSequence.length(), 33);
            return spannableString;
        } catch (Throwable th) {
            e1.s("Failed colorize", th);
            return charSequence;
        }
    }

    private static String t0() {
        String[] list;
        try {
            File fileP0 = p0();
            if (fileP0 == null || (list = fileP0.list()) == null) {
                return null;
            }
            for (String str : list) {
                if (str != null && str.startsWith("GG-")) {
                    return str.substring(3);
                }
            }
            return null;
        } catch (Throwable th) {
            e1.s("Failed get dir", th);
            return null;
        }
    }

    public static boolean t1(DialogInterface dialogInterface, int i2, Object obj, View$OnClickListener view$OnClickListener, EditText editText) {
        if (editText != null) {
            editText.requestFocus();
            o1(editText);
        }
        return s1(dialogInterface, i2, obj, view$OnClickListener);
    }

    public static CharSequence u(CharSequence charSequence) {
        if (charSequence instanceof Spannable) {
            Tools$v[] tools$vArr = (Tools$v[]) q.get();
            if (tools$vArr == null) {
                tools$vArr = new Tools$v[]{new Tools$v(c.v(1), c.n(1)), new Tools$v(c.v(2), c.n(2)), new Tools$v(c.v(4), c.n(4)), new Tools$v(c.v(8), c.n(8)), new Tools$v(c.v(16), c.n(16)), new Tools$v(c.v(32), c.n(32)), new Tools$v(c.v(64), c.n(64)), new Tools$v(b2.f(R$string.executable), d0(R$color.pointer_executable)), new Tools$v(b2.f(R$string.writable), d0(R$color.pointer_writable)), new Tools$v(b2.f(R$string.read_only), d0(R$color.pointer_readable)), new Tools$v(b2.f(R$string.writable_and_executable), d0(R$color.pointer_executable_writable))};
                q = new WeakReference(tools$vArr);
            }
            for (Tools$v tools$v : tools$vArr) {
                v(charSequence, tools$v.f546a, tools$v.f547b);
            }
        }
        return charSequence;
    }

    public static Object u0() {
        if (p == null) {
            try {
                Method declaredMethod = Class.forName("android.os.ServiceManager").getDeclaredMethod("getIServiceManager", new Class[0]);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, d.b.f1516f);
                Method declaredMethod2 = objInvoke.getClass().getDeclaredMethod("getService", String.class);
                declaredMethod2.setAccessible(true);
                Object objInvoke2 = declaredMethod2.invoke(objInvoke, "package");
                Method declaredMethod3 = Class.forName("android.content.pm.IPackageManager$Stub").getDeclaredMethod("asInterface", IBinder.class);
                declaredMethod3.setAccessible(true);
                p = declaredMethod3.invoke(null, objInvoke2);
            } catch (Throwable th) {
                e1.a(th);
            }
        }
        return p;
    }

    public static AlertDialog u1(AlertDialog alertDialog) {
        try {
            TextView textView = (TextView) alertDialog.findViewById(android.R$id.message);
            if (textView != null) {
                v1(textView, textView.getText().toString());
            }
        } catch (Throwable th) {
            e1.a(th);
        }
        return alertDialog;
    }

    public static CharSequence v(CharSequence charSequence, CharSequence charSequence2, int i2) {
        try {
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                int length = charSequence2.length();
                String string = charSequence.toString();
                String string2 = charSequence2.toString();
                int i3 = 0;
                while (true) {
                    int iIndexOf = string.indexOf(string2, i3);
                    if (iIndexOf < 0) {
                        break;
                    }
                    int i4 = iIndexOf + length;
                    spannable.setSpan(new ForegroundColorSpan(i2), iIndexOf, i4, 33);
                    i3 = i4;
                }
            }
        } catch (Throwable th) {
            e1.s("Failed colorize text", th);
        }
        return charSequence;
    }

    public static String v0(Context context) {
        StringBuilder sb = new StringBuilder();
        String str = "Context: ";
        while (true) {
            sb.append(str);
            sb.append(context);
            if (context == null || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
            str = ", base: ";
        }
        return sb.toString();
    }

    public static void v1(TextView textView, String str) {
        n2.i(new Tools$c(textView, str));
    }

    private static int[] w(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        int i2 = 0;
        for (int i3 = 1; i3 < bArr.length; i3++) {
            while (i2 > 0 && bArr[i2] != bArr[i3]) {
                i2 = iArr[i2 - 1];
            }
            if (bArr[i2] == bArr[i3]) {
                i2++;
            }
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static ListView w0(View view) {
        while (view != null) {
            if (view instanceof ListView) {
                return (ListView) view;
            }
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return null;
    }

    public static void w1(int i2, ComponentName componentName, int i3) {
        try {
            PackageManager packageManagerB0 = B0();
            e1.d("hide " + i2 + ": " + i3 + ' ' + componentName);
            B(componentName.getPackageName(), null);
            packageManagerB0.setComponentEnabledSetting(componentName, i3, 1);
            e1.d("hide " + (i2 + 1) + ": " + i3 + ' ' + componentName);
            B(componentName.getPackageName(), null);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    public static CharSequence x(CharSequence... charSequenceArr) {
        try {
            return TextUtils.concat(charSequenceArr);
        } catch (Throwable th) {
            e1.a(th);
            StringBuilder sb = new StringBuilder();
            for (CharSequence charSequence : charSequenceArr) {
                sb.append(charSequence);
            }
            return sb.toString();
        }
    }

    private static Tools$y x0(Class cls, Tools$y[] tools$yArr) {
        Tools$y tools$yA;
        try {
            tools$yA = tools$yArr[0].a();
        } catch (NoSuchMethodException unused) {
            Tools$y tools$yA2 = null;
            for (int i2 = 0; i2 < tools$yArr.length; i2++) {
                if (i2 != 0) {
                    try {
                        tools$yA2 = tools$yArr[i2].a();
                    } catch (NoSuchMethodException unused2) {
                    }
                }
            }
            tools$yA = tools$yA2;
        }
        if (tools$yA == null) {
            e1.d("Methods: " + Arrays.toString(cls.getMethods()));
        }
        return tools$yA;
    }

    public static void x1(View view, float f2) {
        ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (int) f2;
            view.setLayoutParams(layoutParams);
        }
    }

    public static String y(String[] strArr, String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArr) {
            if (sb.length() != 0) {
                sb.append(str);
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    public static String y0(String str) {
        if (u == 0 || u == 1) {
            try {
                File file = new File(str);
                String str2 = '/' + file.getName();
                FileInputStream fileInputStream = new FileInputStream(file);
                MappedByteBuffer map = fileInputStream.getChannel().map(FileChannel$MapMode.READ_ONLY, 0L, 4096L);
                BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/self/maps"));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        int iIndexOf = line.indexOf(str2);
                        if (iIndexOf >= 0) {
                            int i2 = iIndexOf;
                            while (i2 > 0 && line.charAt(i2) > ' ') {
                                i2--;
                            }
                            if (i2 >= iIndexOf) {
                                break;
                            }
                            str = line.substring(i2, line.length()).trim();
                            if (u != 0) {
                                break;
                            }
                            u = (byte) 1;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                bufferedReader.close();
                if (u == 0) {
                    u = (byte) 2;
                }
                map.capacity();
                fileInputStream.close();
            } catch (IOException e2) {
                e1.s("Failed getNativePath: " + str, e2);
            }
        }
        return str;
    }

    public static void y1(ImageView imageView, float f2) {
        n2.i(new Tools$r(imageView, f2));
    }

    public static void z(String str) {
        A(str, true);
    }

    public static PackageInfo z0(String str) {
        return A0(str, 0);
    }

    public static void z1(View view, View$OnFocusChangeListener view$OnFocusChangeListener) {
        Tools$w tools$w = (Tools$w) view.getTag(R$layout.memory_range);
        if (tools$w == null) {
            tools$w = new Tools$w(null);
            view.setOnFocusChangeListener(tools$w);
            view.setTag(R$layout.memory_range, tools$w);
        }
        tools$w.a(view$OnFocusChangeListener);
    }
}
