package android.ext;

import android.app.ActivityManager;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class z1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f1412c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final SparseIntArray f1414e;
    static final SparseIntArray h;
    private static z1 i;
    static HashMap j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ActivityManager f1417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PackageManager f1418b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f1415f = new a(128, 0.75f, true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile int f1416g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f1413d = -1;

    class a extends LinkedHashMap {
        a(int i, float f2, boolean z) {
            super(i, f2, z);
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            return size() > 128;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f1421c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f1422d;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1423a;

            a(int i) {
                this.f1423a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                z1.q(bVar.f1422d, bVar.f1419a, this.f1423a, bVar.f1421c);
            }
        }

        b(int i, int i2, int i3, List list) {
            this.f1419a = i;
            this.f1420b = i2;
            this.f1421c = i3;
            this.f1422d = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1419a != z1.f1416g) {
                return;
            }
            int iMin = Math.min(this.f1420b + 8, this.f1421c);
            for (int i = this.f1420b; i < iMin; i++) {
                if (this.f1419a != z1.f1416g) {
                    return;
                }
                d dVar = (d) this.f1422d.get(i);
                if (dVar != null && !dVar.p) {
                    dVar.i(this.f1419a);
                }
            }
            if (iMin < this.f1421c) {
                n2.c().post(new a(iMin));
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f1427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f1428d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f1429e = "";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1430f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f1431g = false;
        public boolean h = false;

        public c(int i, String str) {
            this.f1425a = i;
            this.f1427c = str;
            this.f1428d = str;
            this.f1426b = i;
        }

        public String toString() {
            return "AppInfo [uid=" + this.f1425a + ", pkg=" + this.f1427c + ", name=" + this.f1428d + ", isSystem=" + this.f1430f + ", isGame=" + this.f1431g + ']';
        }
    }

    public static class d implements Comparable {
        private static WeakReference q;
        public static final int r = Tools.e0(R.color.process_pid, -5570561);
        public static final int s = Tools.e0(R.color.process_name, -1);
        public static final int t = Tools.e0(R.color.process_size, -5570646);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f1432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f1433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f1434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f1435d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile Drawable f1436e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1437f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1438g;
        public int h;
        public boolean i;
        public boolean j;
        public long k;
        public boolean l;
        public int m;
        public boolean n;
        public int o;
        private volatile boolean p;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ TextView f1439a;

            /* JADX INFO: renamed from: android.ext.z1$d$a$a, reason: collision with other inner class name */
            class RunnableC0025a implements Runnable {
                RunnableC0025a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    Object tag = a.this.f1439a.getTag();
                    a aVar = a.this;
                    d dVar = d.this;
                    if (tag == dVar) {
                        Tools.c(aVar.f1439a, dVar.f1436e, 48);
                    }
                }
            }

            a(TextView textView) {
                this.f1439a = textView;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.h();
                if (d.this.f1436e != null) {
                    n2.i(new RunnableC0025a());
                }
            }
        }

        public d(c cVar, int i, int i2, String str, int i3, boolean z, int i4) {
            this.p = false;
            this.f1432a = str;
            this.f1433b = cVar.f1428d;
            this.f1434c = cVar.f1427c;
            String str2 = cVar.f1429e;
            this.f1435d = str2 == null ? "" : str2;
            this.f1436e = null;
            this.f1437f = i;
            this.f1438g = i2;
            this.h = cVar.h ? i2 : cVar.f1426b;
            this.l = str.equals(cVar.f1427c);
            this.i = cVar.f1430f;
            this.j = cVar.f1431g;
            this.m = i3;
            this.n = z;
            this.o = i4;
            if (cVar.h) {
                this.p = true;
            }
        }

        private String e() {
            if (this.l) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(" (");
            sb.append(this.f1432a.replace(this.f1434c + ':', ""));
            sb.append(')');
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i(int i) {
            Drawable drawableR1;
            if (this.p) {
                return;
            }
            Drawable drawableL = z1.l(this.f1434c);
            if (drawableL != null) {
                synchronized (z1.f1415f) {
                    if (i != 0) {
                        try {
                            if (i != z1.f1416g) {
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    this.f1436e = drawableL;
                    this.p = true;
                    return;
                }
            }
            try {
                drawableR1 = Tools.R1(Tools.G0(Tools.X(Tools.Y(this.f1434c)), Tools.H()));
            } catch (Throwable unused) {
                e1.p("Failed load icon for " + this.f1434c);
                drawableR1 = null;
            }
            synchronized (z1.f1415f) {
                if (i != 0) {
                    try {
                        if (i != z1.f1416g) {
                            return;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f1436e = drawableR1;
                if (drawableR1 != null) {
                    z1.r(this.f1434c, drawableR1);
                }
                this.p = true;
            }
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            int i = this.m;
            int i2 = dVar.m;
            if (i == i2) {
                boolean z = this.j;
                if (z == dVar.j) {
                    boolean z2 = this.i;
                    if (z2 == dVar.i) {
                        long j = this.k;
                        long j2 = dVar.k;
                        if (j == j2) {
                            boolean z3 = this.l;
                            if (z3 == dVar.l) {
                                if ((f() > 0) == (dVar.f() > 0)) {
                                    int i3 = this.f1437f;
                                    int i4 = dVar.f1437f;
                                    if (i3 == i4) {
                                        return 0;
                                    }
                                    if (i3 > i4) {
                                        return -1;
                                    }
                                } else if (f() <= 0) {
                                    return -1;
                                }
                            } else if (z3) {
                                return -1;
                            }
                        } else if (j > j2) {
                            return -1;
                        }
                    } else if (!z2) {
                        return -1;
                    }
                } else if (z) {
                    return -1;
                }
            } else if (i > i2) {
                return -1;
            }
            return 1;
        }

        public String d() {
            return "ProcessInfo [cmdline=" + this.f1432a + ", name=" + this.f1433b + ", packageName=" + this.f1434c + ", icon=" + this.f1436e + ", pid=" + this.f1437f + ", uid=" + this.f1438g + ", isSystem=" + this.i + ", isGame=" + this.j + ", weight=" + this.k + ", main=" + this.l + ", order=" + this.m + ", x64=" + this.n + ", rss=" + this.o + ", getTracer()=" + g() + ", getTrace()=" + f() + ']';
        }

        public int f() {
            SparseIntArray sparseIntArray = z1.h;
            int iIndexOfValue = sparseIntArray.indexOfValue(this.f1437f);
            return iIndexOfValue >= 0 ? sparseIntArray.keyAt(iIndexOfValue) : iIndexOfValue;
        }

        public int g() {
            return z1.h.get(this.f1437f);
        }

        public void h() {
            i(0);
        }

        public void j(TextView textView) {
            Drawable drawableL;
            if (textView == null) {
                return;
            }
            boolean z = this.p;
            Drawable drawableO0 = this.f1436e;
            if (drawableO0 == null && (drawableL = z1.l(this.f1434c)) != null) {
                this.f1436e = drawableL;
                z = true;
                this.p = true;
                drawableO0 = drawableL;
            }
            if (drawableO0 == null) {
                WeakReference weakReference = q;
                if (weakReference != null) {
                    drawableO0 = (Drawable) weakReference.get();
                }
                if (drawableO0 == null) {
                    drawableO0 = Tools.o0(R.drawable.empty);
                    q = new WeakReference(drawableO0);
                }
            }
            Tools.c(textView, drawableO0, 48);
            if (z) {
                return;
            }
            n2.h(new a(textView));
        }

        public void k() {
            ApplicationInfo applicationInfoY;
            if (this.f1438g == this.h) {
                return;
            }
            e1.p("vs app: " + this.h + " != " + this.f1438g);
            try {
                String strM = z1.i.m(this.f1438g);
                if (strM == null || (applicationInfoY = Tools.Y(strM)) == null || applicationInfoY.nativeLibraryDir == null) {
                    return;
                }
                e1.p("vs: " + this.f1435d + " => " + applicationInfoY.nativeLibraryDir);
                this.f1435d = applicationInfoY.nativeLibraryDir;
            } catch (Throwable th) {
                e1.s("Failed get vs info for " + this.f1438g, th);
            }
        }

        public CharSequence l() {
            y yVar = new y();
            StringBuilder sb = new StringBuilder();
            if (g() > 0) {
                sb.append('#');
            }
            if (f() > 0) {
                sb.append('!');
            }
            if (!Config.C && this.f1438g != this.h) {
                sb.append('v');
            }
            if (this.f1437f > 1) {
                sb.append('[');
                sb.append(Integer.toString(this.f1437f));
                sb.append("] ");
            }
            yVar.a(Tools.t(sb.toString(), r));
            yVar.a(Tools.t(this.f1433b + e(), s));
            StringBuilder sb2 = new StringBuilder();
            if (this.n) {
                sb2.append(" [x64]");
            }
            if (this.o != 0) {
                sb2.append(" [");
                sb2.append(Tools.U(Tools.f0(), ((long) this.o) * 1024));
                sb2.append(']');
            }
            yVar.a(Tools.t(sb2.toString(), t));
            return yVar.d();
        }

        public String toString() {
            return l().toString();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1414e = sparseIntArray;
        f1412c = new HashMap();
        a0.k();
        f();
        for (String str : a0.e()) {
            if (str != null && str.length() != 0) {
                try {
                    sparseIntArray.put(Integer.parseInt(str), 1);
                } catch (NumberFormatException e2) {
                    e1.l("Failed load bugged uid: " + str, e2);
                }
            }
        }
        h = new SparseIntArray();
        i = null;
        j = null;
    }

    public z1(ActivityManager activityManager, PackageManager packageManager) {
        this.f1417a = activityManager;
        this.f1418b = packageManager;
        i = this;
    }

    private static void f() {
        Map map = f1412c;
        for (String str : a0.c()) {
            if (str != null && str.length() != 0) {
                map.put(str, k(str, null));
            }
        }
    }

    public static void g() {
        Map map = f1415f;
        synchronized (map) {
            f1416g++;
            map.clear();
        }
        Map map2 = f1412c;
        int size = map2.size();
        if (size == 0) {
            return;
        }
        map2.clear();
        f();
        e1.d("PL: " + size + " -> " + map2.size());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004a A[PHI: r2
      0x004a: PHI (r2v12 android.content.pm.ApplicationInfo) = 
      (r2v1 android.content.pm.ApplicationInfo)
      (r2v1 android.content.pm.ApplicationInfo)
      (r2v1 android.content.pm.ApplicationInfo)
      (r2v4 android.content.pm.ApplicationInfo)
     binds: [B:20:0x003a, B:25:0x0045, B:26:0x0049, B:22:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x00bd A[Catch: NoSuchMethodError -> 0x00b5, NameNotFoundException -> 0x00b8, TryCatch #3 {NameNotFoundException -> 0x00b8, NoSuchMethodError -> 0x00b5, blocks: (B:66:0x00b0, B:72:0x00bd, B:74:0x00c5, B:75:0x00da, B:77:0x00e4, B:79:0x00ea, B:84:0x00f1, B:87:0x00fb, B:90:0x010b, B:92:0x0113, B:94:0x011b, B:95:0x013d, B:97:0x0141), top: B:109:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00c5 A[Catch: NoSuchMethodError -> 0x00b5, NameNotFoundException -> 0x00b8, TryCatch #3 {NameNotFoundException -> 0x00b8, NoSuchMethodError -> 0x00b5, blocks: (B:66:0x00b0, B:72:0x00bd, B:74:0x00c5, B:75:0x00da, B:77:0x00e4, B:79:0x00ea, B:84:0x00f1, B:87:0x00fb, B:90:0x010b, B:92:0x0113, B:94:0x011b, B:95:0x013d, B:97:0x0141), top: B:109:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4 A[Catch: NoSuchMethodError -> 0x00b5, NameNotFoundException -> 0x00b8, TryCatch #3 {NameNotFoundException -> 0x00b8, NoSuchMethodError -> 0x00b5, blocks: (B:66:0x00b0, B:72:0x00bd, B:74:0x00c5, B:75:0x00da, B:77:0x00e4, B:79:0x00ea, B:84:0x00f1, B:87:0x00fb, B:90:0x010b, B:92:0x0113, B:94:0x011b, B:95:0x013d, B:97:0x0141), top: B:109:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:97:0x0141 A[Catch: NoSuchMethodError -> 0x00b5, NameNotFoundException -> 0x00b8, TRY_LEAVE, TryCatch #3 {NameNotFoundException -> 0x00b8, NoSuchMethodError -> 0x00b5, blocks: (B:66:0x00b0, B:72:0x00bd, B:74:0x00c5, B:75:0x00da, B:77:0x00e4, B:79:0x00ea, B:84:0x00f1, B:87:0x00fb, B:90:0x010b, B:92:0x0113, B:94:0x011b, B:95:0x013d, B:97:0x0141), top: B:109:0x00b0 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x00c5, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:97:0x0141, please report this as an issue */
    private c h(int i2, int i3, String str, List list, SparseArray sparseArray) {
        boolean z;
        String str2;
        String strJ;
        boolean z2;
        HashMap map;
        Integer num;
        int i4;
        c cVarI;
        String strM;
        String str3;
        String[] strArr;
        if (str.indexOf(58) != -1) {
            str = str.split(":", -1)[0];
        }
        boolean z3 = str.indexOf(46) != -1 && str.indexOf(47) == -1;
        ApplicationInfo applicationInfoY = null;
        c cVarI2 = z3 ? i(str) : null;
        if (cVarI2 != null) {
            if (cVarI2.f1425a == f1413d) {
                cVarI2.f1425a = i3;
            }
            return cVarI2;
        }
        if (z3) {
            try {
                applicationInfoY = Tools.Y(str);
                if (applicationInfoY != null) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (NoSuchMethodError e2) {
                e1.a(e2);
            }
        } else {
            z = false;
        }
        if (applicationInfoY == null) {
            if (list == null) {
                str2 = str;
                break;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str2 = str;
                    break;
                }
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it.next();
                if (runningAppProcessInfo != null && runningAppProcessInfo.pid == i2 && (strArr = runningAppProcessInfo.pkgList) != null && strArr.length > 0) {
                    str2 = strArr[0];
                    z = true;
                    break;
                }
            }
            if (!Config.vSpaceReal) {
                if (!z && (str3 = (String) sparseArray.get(i3)) != null) {
                    str2 = str3;
                    z = true;
                }
                if (!z && (strM = m(i3)) != null) {
                    sparseArray.put(i3, strM);
                    str2 = strM;
                    z = true;
                }
            }
            if (z && (cVarI = i(str2)) != null) {
                if (cVarI.f1425a == f1413d) {
                    cVarI.f1425a = i3;
                }
                if (z3) {
                    f1412c.put(str, cVarI);
                }
                return cVarI;
            }
        } else {
            str2 = str;
        }
        c cVar = new c(i3, str2);
        if (z) {
            if (applicationInfoY == null) {
                try {
                    applicationInfoY = Tools.Y(str2);
                    if (applicationInfoY != null) {
                        strJ = j(str2, applicationInfoY);
                        cVar.f1428d = strJ;
                        if (strJ != null) {
                            cVar.f1428d += "";
                        }
                        if (applicationInfoY.sourceDir.startsWith("/system/")) {
                            z2 = true;
                        } else {
                            i4 = applicationInfoY.flags;
                            if ((i4 & 128) == 0 || (i4 & 1) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        cVar.f1430f = z2;
                        cVar.f1431g = (applicationInfoY.flags & 33554432) != 0;
                        cVar.f1429e = applicationInfoY.nativeLibraryDir;
                        cVar.f1426b = applicationInfoY.uid;
                        map = j;
                        if (map != null && (num = (Integer) map.get(str2)) != null && num.intValue() != applicationInfoY.uid) {
                            e1.p("real uid: " + applicationInfoY.uid + " != " + num);
                            cVar.f1426b = num.intValue();
                        }
                        if (cVar.f1426b != i3) {
                            e1.p("vs app: " + cVar.f1426b + " != " + i3);
                        }
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                    e1.l("Package not found: " + cVar.f1427c + " [" + cVar.f1425a + ']', e3);
                } catch (NoSuchMethodError e4) {
                    e1.a(e4);
                }
            } else if (applicationInfoY != null) {
                strJ = j(str2, applicationInfoY);
                cVar.f1428d = strJ;
                if (strJ != null) {
                    cVar.f1428d += "";
                }
                if (applicationInfoY.sourceDir.startsWith("/system/")) {
                    i4 = applicationInfoY.flags;
                    if ((i4 & 128) == 0) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                } else {
                    z2 = true;
                }
                cVar.f1430f = z2;
                cVar.f1431g = (applicationInfoY.flags & 33554432) != 0;
                cVar.f1429e = applicationInfoY.nativeLibraryDir;
                cVar.f1426b = applicationInfoY.uid;
                map = j;
                if (map != null) {
                    e1.p("real uid: " + applicationInfoY.uid + " != " + num);
                    cVar.f1426b = num.intValue();
                }
                if (cVar.f1426b != i3) {
                    e1.p("vs app: " + cVar.f1426b + " != " + i3);
                }
            }
        }
        Map map2 = f1412c;
        map2.put(str2, cVar);
        if (z3 && !str.equals(str2)) {
            map2.put(str, cVar);
        }
        return cVar;
    }

    private c i(String str) {
        String strC0 = Tools.C0();
        if (str.equals(strC0)) {
            return k(strC0, "GG");
        }
        return str.startsWith("com.bluestacks.") ? k(str, str) : (c) f1412c.get(str);
    }

    private String j(String str, ApplicationInfo applicationInfo) {
        String str2 = applicationInfo.packageName;
        try {
            String strA0 = Tools.a0(applicationInfo);
            return strA0 != null ? strA0 : str2;
        } catch (Throwable th) {
            e1.l("Failed load label for: " + applicationInfo.packageName, th);
            return str2;
        }
    }

    private static c k(String str, String str2) {
        c cVar = new c(f1413d, str);
        if (str2 != null) {
            cVar.f1428d = str2;
        }
        cVar.h = true;
        return cVar;
    }

    public static Drawable l(String str) {
        Drawable drawable;
        Drawable drawableR1;
        if (str == null) {
            return null;
        }
        Map map = f1415f;
        synchronized (map) {
            drawable = (Drawable) map.get(str);
        }
        if (drawable == null || (drawableR1 = Tools.R1(drawable)) == drawable) {
            return null;
        }
        return drawableR1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String m(int i2) {
        if (Config.C) {
            return Config.E;
        }
        String str = null;
        if (Config.vSpaceReal) {
            HashMap map = j;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (entry != null && ((Integer) entry.getValue()).intValue() == i2) {
                        break;
                    }
                }
                return null;
            }
        } else if (f1414e.get(i2) != 1) {
            try {
                PackageManager packageManager = this.f1418b;
                boolean zA = a0.a("uid:" + i2, "uid");
                try {
                    String[] packagesForUid = packageManager.getPackagesForUid(i2);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        str = packagesForUid[0];
                    }
                } finally {
                    a0.b(zA);
                }
            } catch (Throwable th) {
                e1.l("Failed getPackagesForUid", th);
            }
        }
        return str;
    }

    private void n(w wVar) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        List<ActivityManager.RunningAppProcessInfo> list;
        int iMyPid;
        int iJ;
        int iB0;
        gga.e eVar;
        c cVarH;
        wVar.j();
        ArrayList arrayList = new ArrayList();
        h.clear();
        try {
            try {
                e1.d("getRunningAppProcesses: start");
                runningAppProcesses = this.f1417a.getRunningAppProcesses();
                try {
                    e1.d("getRunningAppProcesses: end " + runningAppProcesses.size());
                    while (true) {
                        int iF = wVar.f();
                        if (iF != 0) {
                            int iF2 = wVar.f();
                            boolean z = wVar.e() != 0;
                            int iF3 = wVar.f();
                            int iF4 = wVar.f();
                            int iF5 = wVar.f();
                            int iF6 = wVar.f();
                            if (iF6 >= 0 && iF6 <= 200) {
                                String strI = wVar.i(iF6, null);
                                if (iF != iMyPid && iF != iJ && iF != iB0 && (cVarH = h(iF, iF2, strI, list, eVar)) != null && !cVarH.f1427c.equals(Tools.C0())) {
                                    arrayList.add(new d(cVarH, iF, iF2, strI, iF4, z, iF3));
                                    if (iF5 != 0) {
                                        h.put(iF, iF5);
                                        e1.d("Tracer: " + iF5 + " -> " + iF);
                                    }
                                }
                            }
                            e1.l("Bad cmdline length: " + iF6, new RuntimeException());
                            break;
                        }
                        break;
                    }
                } catch (Throwable th) {
                    th = th;
                    e1.l("Failed getRunningAppProcesses", th);
                }
            } catch (Throwable th2) {
                th = th2;
                runningAppProcesses = null;
            }
            iMyPid = Process.myPid();
            iJ = MainService.instance.i.J();
            iB0 = MainService.instance.i.b0();
            eVar = new gga.e();
        } catch (IOException e2) {
            e1.l("???", e2);
        }
        list = runningAppProcesses;
        MainService.instance.h.d(s(arrayList, list));
    }

    public static void o(w wVar) {
        i.n(wVar);
    }

    public static void p(List list) {
        if (list == null) {
            return;
        }
        int i2 = f1416g + 1;
        f1416g = i2;
        q(list, i2, 0, Math.min(list.size(), 128));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(List list, int i2, int i3, int i4) {
        n2.h(new b(i2, i3, i4, list));
    }

    public static void r(String str, Drawable drawable) {
        Drawable drawableR1;
        if (str == null || drawable == null || (drawableR1 = Tools.R1(drawable)) == null || drawableR1 == drawable) {
            return;
        }
        Map map = f1415f;
        synchronized (map) {
            map.put(str, drawableR1);
        }
    }

    private List s(List list, List list2) {
        long j2;
        d dVar;
        String str = "Class not found";
        d[] dVarArr = (d[]) list.toArray(new d[list.size()]);
        char c2 = 0;
        for (d dVar2 : dVarArr) {
            dVar2.k = 0L;
        }
        int i2 = 2;
        List[] listArr = new List[2];
        try {
            listArr[0] = this.f1417a.getRunningTasks(50);
        } catch (Throwable th) {
            e1.l("Failed getRunningTasks", th);
        }
        char c3 = 1;
        listArr[1] = list2;
        int i3 = 0;
        while (i3 < i2) {
            List list3 = listArr[i3];
            if (list3 != null) {
                boolean[] zArr = new boolean[dVarArr.length];
                int i4 = 0;
                while (i4 < list3.size()) {
                    Object obj = list3.get(i4);
                    if (obj != null) {
                        String[] strArr = null;
                        try {
                            if (obj instanceof ActivityManager.RunningTaskInfo) {
                                ActivityManager.RunningTaskInfo runningTaskInfo = (ActivityManager.RunningTaskInfo) obj;
                                String[] strArr2 = new String[i2];
                                strArr2[c2] = runningTaskInfo.topActivity != null ? runningTaskInfo.topActivity.getPackageName() : null;
                                String packageName = runningTaskInfo.baseActivity != null ? runningTaskInfo.baseActivity.getPackageName() : null;
                                strArr2[c3] = packageName;
                                try {
                                    String str2 = strArr2[c2];
                                    if (str2 != null && str2.equals(packageName)) {
                                        strArr2[c3] = null;
                                    }
                                    j2 = 1000000;
                                    strArr = strArr2;
                                } catch (NoClassDefFoundError e2) {
                                    e = e2;
                                    strArr = strArr2;
                                    e1.s(str, e);
                                    j2 = 0;
                                }
                            } else {
                                j2 = 0;
                            }
                        } catch (NoClassDefFoundError e3) {
                            e = e3;
                        }
                        try {
                            if (obj instanceof ActivityManager.RunningAppProcessInfo) {
                                strArr = ((ActivityManager.RunningAppProcessInfo) obj).pkgList;
                                j2 = 1000;
                            }
                        } catch (NoClassDefFoundError e4) {
                            e1.s(str, e4);
                        }
                        if (strArr != null) {
                            int length = strArr.length;
                            int i5 = 0;
                            while (i5 < length) {
                                String str3 = strArr[i5];
                                if (str3 != null) {
                                    int i6 = 0;
                                    while (i6 < dVarArr.length) {
                                        if (!zArr[i6] && (dVar = dVarArr[i6]) != null && str3.equals(dVar.f1434c)) {
                                            dVar.k += ((long) (list3.size() - i4)) * j2;
                                            zArr[i6] = true;
                                        }
                                        i6++;
                                        i3 = i3;
                                        str = str;
                                        length = length;
                                    }
                                }
                                i5++;
                                i3 = i3;
                                str = str;
                                length = length;
                            }
                        }
                    }
                    i4++;
                    i3 = i3;
                    str = str;
                    c2 = 0;
                    i2 = 2;
                    c3 = 1;
                }
            }
            i3++;
            str = str;
            c2 = 0;
            i2 = 2;
            c3 = 1;
        }
        try {
            Arrays.sort(dVarArr);
        } catch (Throwable th2) {
            e1.a(th2);
        }
        ArrayList arrayList = new ArrayList(dVarArr.length);
        for (d dVar3 : dVarArr) {
            arrayList.add(dVar3);
        }
        return arrayList;
    }
}
