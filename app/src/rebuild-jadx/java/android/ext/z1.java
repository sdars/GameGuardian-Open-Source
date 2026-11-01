package android.ext;

/* JADX INFO: loaded from: classes.dex */
public class z1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.Map f1412c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final android.util.SparseIntArray f1414e;
    static final android.util.SparseIntArray h;
    private static android.ext.z1 i;
    static java.util.HashMap j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.app.ActivityManager f1417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.pm.PackageManager f1418b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.util.Map f1415f = new android.ext.z1.a(128, 0.75f, true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile int f1416g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f1413d = -1;

    class a extends java.util.LinkedHashMap {
        a(int i, float f2, boolean z) {
            super(i, f2, z);
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(java.util.Map.Entry entry) {
            return size() > 128;
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f1421c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ java.util.List f1422d;

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1423a;

            a(int i) {
                this.f1423a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                android.ext.z1.b bVar = android.ext.z1.b.this;
                android.ext.z1.q(bVar.f1422d, bVar.f1419a, this.f1423a, bVar.f1421c);
            }
        }

        b(int i, int i2, int i3, java.util.List list) {
            this.f1419a = i;
            this.f1420b = i2;
            this.f1421c = i3;
            this.f1422d = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1419a != android.ext.z1.f1416g) {
                return;
            }
            int iMin = java.lang.Math.min(this.f1420b + 8, this.f1421c);
            for (int i = this.f1420b; i < iMin; i++) {
                if (this.f1419a != android.ext.z1.f1416g) {
                    return;
                }
                android.ext.z1.d dVar = (android.ext.z1.d) this.f1422d.get(i);
                if (dVar != null && !dVar.p) {
                    dVar.i(this.f1419a);
                }
            }
            if (iMin < this.f1421c) {
                android.ext.n2.c().post(new android.ext.z1.b.a(iMin));
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public java.lang.String f1427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public java.lang.String f1428d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public java.lang.String f1429e = "";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1430f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f1431g = false;
        public boolean h = false;

        public c(int i, java.lang.String str) {
            this.f1425a = i;
            this.f1427c = str;
            this.f1428d = str;
            this.f1426b = i;
        }

        public java.lang.String toString() {
            return "AppInfo [uid=" + this.f1425a + ", pkg=" + this.f1427c + ", name=" + this.f1428d + ", isSystem=" + this.f1430f + ", isGame=" + this.f1431g + ']';
        }
    }

    public static class d implements java.lang.Comparable {
        private static java.lang.ref.WeakReference q;
        public static final int r = android.ext.Tools.e0(catch_.me_.if_.you_.can_.R.color.process_pid, -5570561);
        public static final int s = android.ext.Tools.e0(catch_.me_.if_.you_.can_.R.color.process_name, -1);
        public static final int t = android.ext.Tools.e0(catch_.me_.if_.you_.can_.R.color.process_size, -5570646);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.String f1432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public java.lang.String f1433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public java.lang.String f1434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public java.lang.String f1435d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile android.graphics.drawable.Drawable f1436e;

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

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.widget.TextView f1439a;

            /* JADX INFO: renamed from: android.ext.z1$d$a$a, reason: collision with other inner class name */
            class RunnableC0025a implements java.lang.Runnable {
                RunnableC0025a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    java.lang.Object tag = android.ext.z1.d.a.this.f1439a.getTag();
                    android.ext.z1.d.a aVar = android.ext.z1.d.a.this;
                    android.ext.z1.d dVar = android.ext.z1.d.this;
                    if (tag == dVar) {
                        android.ext.Tools.c(aVar.f1439a, dVar.f1436e, 48);
                    }
                }
            }

            a(android.widget.TextView textView) {
                this.f1439a = textView;
            }

            @Override // java.lang.Runnable
            public void run() {
                android.ext.z1.d.this.h();
                if (android.ext.z1.d.this.f1436e != null) {
                    android.ext.n2.i(new android.ext.z1.d.a.RunnableC0025a());
                }
            }
        }

        public d(android.ext.z1.c cVar, int i, int i2, java.lang.String str, int i3, boolean z, int i4) {
            this.p = false;
            this.f1432a = str;
            this.f1433b = cVar.f1428d;
            this.f1434c = cVar.f1427c;
            java.lang.String str2 = cVar.f1429e;
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

        private java.lang.String e() {
            if (this.l) {
                return "";
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(" (");
            sb.append(this.f1432a.replace(this.f1434c + ':', ""));
            sb.append(')');
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i(int i) {
            android.graphics.drawable.Drawable drawableR1;
            if (this.p) {
                return;
            }
            android.graphics.drawable.Drawable drawableL = android.ext.z1.l(this.f1434c);
            if (drawableL != null) {
                synchronized (android.ext.z1.f1415f) {
                    if (i != 0) {
                        try {
                            if (i != android.ext.z1.f1416g) {
                                return;
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                    this.f1436e = drawableL;
                    this.p = true;
                    return;
                }
            }
            try {
                drawableR1 = android.ext.Tools.R1(android.ext.Tools.G0(android.ext.Tools.X(android.ext.Tools.Y(this.f1434c)), android.ext.Tools.H()));
            } catch (java.lang.Throwable unused) {
                android.ext.e1.p("Failed load icon for " + this.f1434c);
                drawableR1 = null;
            }
            synchronized (android.ext.z1.f1415f) {
                if (i != 0) {
                    try {
                        if (i != android.ext.z1.f1416g) {
                            return;
                        }
                    } catch (java.lang.Throwable th2) {
                        throw th2;
                    }
                }
                this.f1436e = drawableR1;
                if (drawableR1 != null) {
                    android.ext.z1.r(this.f1434c, drawableR1);
                }
                this.p = true;
            }
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(android.ext.z1.d dVar) {
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

        public java.lang.String d() {
            return "ProcessInfo [cmdline=" + this.f1432a + ", name=" + this.f1433b + ", packageName=" + this.f1434c + ", icon=" + this.f1436e + ", pid=" + this.f1437f + ", uid=" + this.f1438g + ", isSystem=" + this.i + ", isGame=" + this.j + ", weight=" + this.k + ", main=" + this.l + ", order=" + this.m + ", x64=" + this.n + ", rss=" + this.o + ", getTracer()=" + g() + ", getTrace()=" + f() + ']';
        }

        public int f() {
            android.util.SparseIntArray sparseIntArray = android.ext.z1.h;
            int iIndexOfValue = sparseIntArray.indexOfValue(this.f1437f);
            return iIndexOfValue >= 0 ? sparseIntArray.keyAt(iIndexOfValue) : iIndexOfValue;
        }

        public int g() {
            return android.ext.z1.h.get(this.f1437f);
        }

        public void h() {
            i(0);
        }

        public void j(android.widget.TextView textView) {
            android.graphics.drawable.Drawable drawableL;
            if (textView == null) {
                return;
            }
            boolean z = this.p;
            android.graphics.drawable.Drawable drawableO0 = this.f1436e;
            if (drawableO0 == null && (drawableL = android.ext.z1.l(this.f1434c)) != null) {
                this.f1436e = drawableL;
                z = true;
                this.p = true;
                drawableO0 = drawableL;
            }
            if (drawableO0 == null) {
                java.lang.ref.WeakReference weakReference = q;
                if (weakReference != null) {
                    drawableO0 = (android.graphics.drawable.Drawable) weakReference.get();
                }
                if (drawableO0 == null) {
                    drawableO0 = android.ext.Tools.o0(catch_.me_.if_.you_.can_.R.drawable.empty);
                    q = new java.lang.ref.WeakReference(drawableO0);
                }
            }
            android.ext.Tools.c(textView, drawableO0, 48);
            if (z) {
                return;
            }
            android.ext.n2.h(new android.ext.z1.d.a(textView));
        }

        public void k() {
            android.content.pm.ApplicationInfo applicationInfoY;
            if (this.f1438g == this.h) {
                return;
            }
            android.ext.e1.p("vs app: " + this.h + " != " + this.f1438g);
            try {
                java.lang.String strM = android.ext.z1.i.m(this.f1438g);
                if (strM == null || (applicationInfoY = android.ext.Tools.Y(strM)) == null || applicationInfoY.nativeLibraryDir == null) {
                    return;
                }
                android.ext.e1.p("vs: " + this.f1435d + " => " + applicationInfoY.nativeLibraryDir);
                this.f1435d = applicationInfoY.nativeLibraryDir;
            } catch (java.lang.Throwable th) {
                android.ext.e1.s("Failed get vs info for " + this.f1438g, th);
            }
        }

        public java.lang.CharSequence l() {
            android.ext.y yVar = new android.ext.y();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (g() > 0) {
                sb.append('#');
            }
            if (f() > 0) {
                sb.append('!');
            }
            if (!android.ext.Config.C && this.f1438g != this.h) {
                sb.append('v');
            }
            if (this.f1437f > 1) {
                sb.append('[');
                sb.append(java.lang.Integer.toString(this.f1437f));
                sb.append("] ");
            }
            yVar.a(android.ext.Tools.t(sb.toString(), r));
            yVar.a(android.ext.Tools.t(this.f1433b + e(), s));
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            if (this.n) {
                sb2.append(" [x64]");
            }
            if (this.o != 0) {
                sb2.append(" [");
                sb2.append(android.ext.Tools.U(android.ext.Tools.f0(), ((long) this.o) * 1024));
                sb2.append(']');
            }
            yVar.a(android.ext.Tools.t(sb2.toString(), t));
            return yVar.d();
        }

        public java.lang.String toString() {
            return l().toString();
        }
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        f1414e = sparseIntArray;
        f1412c = new java.util.HashMap();
        android.ext.a0.k();
        f();
        for (java.lang.String str : android.ext.a0.e()) {
            if (str != null && str.length() != 0) {
                try {
                    sparseIntArray.put(java.lang.Integer.parseInt(str), 1);
                } catch (java.lang.NumberFormatException e2) {
                    android.ext.e1.l("Failed load bugged uid: " + str, e2);
                }
            }
        }
        h = new android.util.SparseIntArray();
        i = null;
        j = null;
    }

    public z1(android.app.ActivityManager activityManager, android.content.pm.PackageManager packageManager) {
        this.f1417a = activityManager;
        this.f1418b = packageManager;
        i = this;
    }

    private static void f() {
        java.util.Map map = f1412c;
        for (java.lang.String str : android.ext.a0.c()) {
            if (str != null && str.length() != 0) {
                map.put(str, k(str, null));
            }
        }
    }

    public static void g() {
        java.util.Map map = f1415f;
        synchronized (map) {
            f1416g++;
            map.clear();
        }
        java.util.Map map2 = f1412c;
        int size = map2.size();
        if (size == 0) {
            return;
        }
        map2.clear();
        f();
        android.ext.e1.d("PL: " + size + " -> " + map2.size());
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
    private android.ext.z1.c h(int i2, int i3, java.lang.String str, java.util.List list, android.util.SparseArray sparseArray) {
        boolean z;
        java.lang.String str2;
        java.lang.String strJ;
        boolean z2;
        java.util.HashMap map;
        java.lang.Integer num;
        int i4;
        android.ext.z1.c cVarI;
        java.lang.String strM;
        java.lang.String str3;
        java.lang.String[] strArr;
        if (str.indexOf(58) != -1) {
            str = str.split(":", -1)[0];
        }
        boolean z3 = str.indexOf(46) != -1 && str.indexOf(47) == -1;
        android.content.pm.ApplicationInfo applicationInfoY = null;
        android.ext.z1.c cVarI2 = z3 ? i(str) : null;
        if (cVarI2 != null) {
            if (cVarI2.f1425a == f1413d) {
                cVarI2.f1425a = i3;
            }
            return cVarI2;
        }
        if (z3) {
            try {
                applicationInfoY = android.ext.Tools.Y(str);
                if (applicationInfoY != null) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            } catch (java.lang.NoSuchMethodError e2) {
                android.ext.e1.a(e2);
            }
        } else {
            z = false;
        }
        if (applicationInfoY == null) {
            if (list == null) {
                str2 = str;
                break;
            }
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str2 = str;
                    break;
                }
                android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (android.app.ActivityManager.RunningAppProcessInfo) it.next();
                if (runningAppProcessInfo != null && runningAppProcessInfo.pid == i2 && (strArr = runningAppProcessInfo.pkgList) != null && strArr.length > 0) {
                    str2 = strArr[0];
                    z = true;
                    break;
                }
            }
            if (!android.ext.Config.vSpaceReal) {
                if (!z && (str3 = (java.lang.String) sparseArray.get(i3)) != null) {
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
        android.ext.z1.c cVar = new android.ext.z1.c(i3, str2);
        if (z) {
            if (applicationInfoY == null) {
                try {
                    applicationInfoY = android.ext.Tools.Y(str2);
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
                        if (map != null && (num = (java.lang.Integer) map.get(str2)) != null && num.intValue() != applicationInfoY.uid) {
                            android.ext.e1.p("real uid: " + applicationInfoY.uid + " != " + num);
                            cVar.f1426b = num.intValue();
                        }
                        if (cVar.f1426b != i3) {
                            android.ext.e1.p("vs app: " + cVar.f1426b + " != " + i3);
                        }
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException e3) {
                    android.ext.e1.l("Package not found: " + cVar.f1427c + " [" + cVar.f1425a + ']', e3);
                } catch (java.lang.NoSuchMethodError e4) {
                    android.ext.e1.a(e4);
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
                    android.ext.e1.p("real uid: " + applicationInfoY.uid + " != " + num);
                    cVar.f1426b = num.intValue();
                }
                if (cVar.f1426b != i3) {
                    android.ext.e1.p("vs app: " + cVar.f1426b + " != " + i3);
                }
            }
        }
        java.util.Map map2 = f1412c;
        map2.put(str2, cVar);
        if (z3 && !str.equals(str2)) {
            map2.put(str, cVar);
        }
        return cVar;
    }

    private android.ext.z1.c i(java.lang.String str) {
        java.lang.String strC0 = android.ext.Tools.C0();
        if (str.equals(strC0)) {
            return k(strC0, "GG");
        }
        return str.startsWith("com.bluestacks.") ? k(str, str) : (android.ext.z1.c) f1412c.get(str);
    }

    private java.lang.String j(java.lang.String str, android.content.pm.ApplicationInfo applicationInfo) {
        java.lang.String str2 = applicationInfo.packageName;
        try {
            java.lang.String strA0 = android.ext.Tools.a0(applicationInfo);
            return strA0 != null ? strA0 : str2;
        } catch (java.lang.Throwable th) {
            android.ext.e1.l("Failed load label for: " + applicationInfo.packageName, th);
            return str2;
        }
    }

    private static android.ext.z1.c k(java.lang.String str, java.lang.String str2) {
        android.ext.z1.c cVar = new android.ext.z1.c(f1413d, str);
        if (str2 != null) {
            cVar.f1428d = str2;
        }
        cVar.h = true;
        return cVar;
    }

    public static android.graphics.drawable.Drawable l(java.lang.String str) {
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable drawableR1;
        if (str == null) {
            return null;
        }
        java.util.Map map = f1415f;
        synchronized (map) {
            drawable = (android.graphics.drawable.Drawable) map.get(str);
        }
        if (drawable == null || (drawableR1 = android.ext.Tools.R1(drawable)) == drawable) {
            return null;
        }
        return drawableR1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String m(int i2) {
        if (android.ext.Config.C) {
            return android.ext.Config.E;
        }
        java.lang.String str = null;
        if (android.ext.Config.vSpaceReal) {
            java.util.HashMap map = j;
            if (map != null) {
                for (java.util.Map.Entry entry : map.entrySet()) {
                    if (entry != null && ((java.lang.Integer) entry.getValue()).intValue() == i2) {
                        break;
                    }
                }
                return null;
            }
        } else if (f1414e.get(i2) != 1) {
            try {
                android.content.pm.PackageManager packageManager = this.f1418b;
                boolean zA = android.ext.a0.a("uid:" + i2, "uid");
                try {
                    java.lang.String[] packagesForUid = packageManager.getPackagesForUid(i2);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        str = packagesForUid[0];
                    }
                } finally {
                    android.ext.a0.b(zA);
                }
            } catch (java.lang.Throwable th) {
                android.ext.e1.l("Failed getPackagesForUid", th);
            }
        }
        return str;
    }

    private void n(android.ext.w wVar) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> list;
        int iMyPid;
        int iJ;
        int iB0;
        gga.e eVar;
        android.ext.z1.c cVarH;
        wVar.j();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        h.clear();
        try {
            try {
                android.ext.e1.d("getRunningAppProcesses: start");
                runningAppProcesses = this.f1417a.getRunningAppProcesses();
                try {
                    android.ext.e1.d("getRunningAppProcesses: end " + runningAppProcesses.size());
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
                                java.lang.String strI = wVar.i(iF6, null);
                                if (iF != iMyPid && iF != iJ && iF != iB0 && (cVarH = h(iF, iF2, strI, list, eVar)) != null && !cVarH.f1427c.equals(android.ext.Tools.C0())) {
                                    arrayList.add(new android.ext.z1.d(cVarH, iF, iF2, strI, iF4, z, iF3));
                                    if (iF5 != 0) {
                                        h.put(iF, iF5);
                                        android.ext.e1.d("Tracer: " + iF5 + " -> " + iF);
                                    }
                                }
                            }
                            android.ext.e1.l("Bad cmdline length: " + iF6, new java.lang.RuntimeException());
                            break;
                        }
                        break;
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    android.ext.e1.l("Failed getRunningAppProcesses", th);
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                runningAppProcesses = null;
            }
            iMyPid = android.os.Process.myPid();
            iJ = android.ext.MainService.instance.i.J();
            iB0 = android.ext.MainService.instance.i.b0();
            eVar = new gga.e();
        } catch (java.io.IOException e2) {
            android.ext.e1.l("???", e2);
        }
        list = runningAppProcesses;
        android.ext.MainService.instance.h.d(s(arrayList, list));
    }

    public static void o(android.ext.w wVar) {
        i.n(wVar);
    }

    public static void p(java.util.List list) {
        if (list == null) {
            return;
        }
        int i2 = f1416g + 1;
        f1416g = i2;
        q(list, i2, 0, java.lang.Math.min(list.size(), 128));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(java.util.List list, int i2, int i3, int i4) {
        android.ext.n2.h(new android.ext.z1.b(i2, i3, i4, list));
    }

    public static void r(java.lang.String str, android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawableR1;
        if (str == null || drawable == null || (drawableR1 = android.ext.Tools.R1(drawable)) == null || drawableR1 == drawable) {
            return;
        }
        java.util.Map map = f1415f;
        synchronized (map) {
            map.put(str, drawableR1);
        }
    }

    private java.util.List s(java.util.List list, java.util.List list2) {
        long j2;
        android.ext.z1.d dVar;
        java.lang.String str = "Class not found";
        android.ext.z1.d[] dVarArr = (android.ext.z1.d[]) list.toArray(new android.ext.z1.d[list.size()]);
        char c2 = 0;
        for (android.ext.z1.d dVar2 : dVarArr) {
            dVar2.k = 0L;
        }
        int i2 = 2;
        java.util.List[] listArr = new java.util.List[2];
        try {
            listArr[0] = this.f1417a.getRunningTasks(50);
        } catch (java.lang.Throwable th) {
            android.ext.e1.l("Failed getRunningTasks", th);
        }
        char c3 = 1;
        listArr[1] = list2;
        int i3 = 0;
        while (i3 < i2) {
            java.util.List list3 = listArr[i3];
            if (list3 != null) {
                boolean[] zArr = new boolean[dVarArr.length];
                int i4 = 0;
                while (i4 < list3.size()) {
                    java.lang.Object obj = list3.get(i4);
                    if (obj != null) {
                        java.lang.String[] strArr = null;
                        try {
                            if (obj instanceof android.app.ActivityManager.RunningTaskInfo) {
                                android.app.ActivityManager.RunningTaskInfo runningTaskInfo = (android.app.ActivityManager.RunningTaskInfo) obj;
                                java.lang.String[] strArr2 = new java.lang.String[i2];
                                strArr2[c2] = runningTaskInfo.topActivity != null ? runningTaskInfo.topActivity.getPackageName() : null;
                                java.lang.String packageName = runningTaskInfo.baseActivity != null ? runningTaskInfo.baseActivity.getPackageName() : null;
                                strArr2[c3] = packageName;
                                try {
                                    java.lang.String str2 = strArr2[c2];
                                    if (str2 != null && str2.equals(packageName)) {
                                        strArr2[c3] = null;
                                    }
                                    j2 = 1000000;
                                    strArr = strArr2;
                                } catch (java.lang.NoClassDefFoundError e2) {
                                    e = e2;
                                    strArr = strArr2;
                                    android.ext.e1.s(str, e);
                                    j2 = 0;
                                }
                            } else {
                                j2 = 0;
                            }
                        } catch (java.lang.NoClassDefFoundError e3) {
                            e = e3;
                        }
                        try {
                            if (obj instanceof android.app.ActivityManager.RunningAppProcessInfo) {
                                strArr = ((android.app.ActivityManager.RunningAppProcessInfo) obj).pkgList;
                                j2 = 1000;
                            }
                        } catch (java.lang.NoClassDefFoundError e4) {
                            android.ext.e1.s(str, e4);
                        }
                        if (strArr != null) {
                            int length = strArr.length;
                            int i5 = 0;
                            while (i5 < length) {
                                java.lang.String str3 = strArr[i5];
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
            java.util.Arrays.sort(dVarArr);
        } catch (java.lang.Throwable th2) {
            android.ext.e1.a(th2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(dVarArr.length);
        for (android.ext.z1.d dVar3 : dVarArr) {
            arrayList.add(dVar3);
        }
        return arrayList;
    }
}
