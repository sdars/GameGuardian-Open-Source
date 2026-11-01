package android.ext;

/* JADX INFO: loaded from: classes.dex */
public abstract class Config {
    public static volatile int A;
    public static volatile int B;
    public static volatile boolean C;
    public static volatile boolean D;
    public static volatile java.lang.String E;
    public static volatile java.lang.String F;
    public static volatile byte G;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile long f30c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile long f31d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile long f32e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile long f33f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile int f34g;
    public static volatile int h;
    public static volatile int i;
    public static volatile long j;
    public static volatile int k;
    public static volatile int l;
    public static volatile int m;
    public static volatile int n;
    public static volatile int o;
    public static volatile int p;
    public static volatile int q;
    public static volatile int r;
    public static volatile long s;
    public static volatile int t;
    public static volatile int u;
    public static volatile int v;
    public static volatile boolean vSpaceReal;
    public static volatile int w;
    public static volatile int x;
    public static volatile int y;
    public static volatile int z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f29b = new long[android.ext.MainService.J0.length * 2];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static volatile int[] f28a = {114, 115, 116};
    static gga.e H = new gga.e();

    public static class OptionMultiChoice extends android.ext.Config.s implements android.content.DialogInterface.OnMultiChoiceClickListener, android.content.DialogInterface.OnShowListener, android.widget.AbsListView.OnScrollListener {
        boolean[] n;

        public OptionMultiChoice(int i, int i2, int[] iArr, int i3, java.lang.String str, boolean z) {
            super(i, i2, iArr, i3, str, z);
        }

        public OptionMultiChoice(int i, int i2, int[] iArr, int i3, java.lang.String str, boolean z, int i4) {
            this(i, i2, iArr, i3, str, z);
            this.h = i4;
        }

        @Override // android.ext.Config.s, android.ext.Config.p
        public boolean e(android.content.DialogInterface dialogInterface, int i) {
            if (i != -1 && i != -3) {
                return false;
            }
            boolean[] zArr = this.n;
            int i2 = this.f40b;
            if (zArr != null && i == -1) {
                for (int i3 = 0; i3 < zArr.length; i3++) {
                    int iH = h(i3);
                    i2 = zArr[i3] ? iH | i2 : (~iH) & i2;
                }
                this.n = null;
            }
            this.f42d = i2;
            android.ext.Config.k();
            android.ext.Tools.D(dialogInterface);
            return true;
        }

        @Override // android.ext.Config.s
        protected void j(java.lang.CharSequence[] charSequenceArr) {
            boolean[] zArr = new boolean[charSequenceArr.length];
            this.n = zArr;
            int i = this.f42d;
            for (int i2 = 0; i2 < charSequenceArr.length; i2++) {
                int iH = h(i2);
                zArr[i2] = (i & iH) == iH;
            }
            android.app.AlertDialog alertDialogCreate = android.ext.f.c(android.ext.Tools.k0()).setCustomTitle(android.ext.Config.c(this.f39a, this.h, this.f45g)).setMultiChoiceItems(charSequenceArr, zArr, this).setPositiveButton(catch_.me_.if_.you_.can_.R.string.save, this).setNeutralButton(catch_.me_.if_.you_.can_.R.string.reset_button, this).setNegativeButton(catch_.me_.if_.you_.can_.R.string.cancel, this).create();
            android.ext.f.l(alertDialogCreate, this);
            android.ext.f.m(alertDialogCreate);
        }

        protected void l(boolean z) {
            if (this.m == null) {
                int i = z ? 6 : 3;
                int[] iArr = new int[i];
                java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[i];
                if (z) {
                    iArr[0] = 1;
                    charSequenceArr[0] = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.search) + ", " + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.portrait);
                    iArr[1] = 2;
                    charSequenceArr[1] = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.search) + ", " + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.landscape);
                    iArr[2] = 4;
                    charSequenceArr[2] = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.saved_list) + ", " + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.portrait);
                    iArr[3] = 8;
                    charSequenceArr[3] = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.saved_list) + ", " + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.landscape);
                    iArr[4] = 16;
                    charSequenceArr[4] = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.memory_editor) + ", " + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.portrait);
                    iArr[5] = 32;
                    charSequenceArr[5] = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.memory_editor) + ", " + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.landscape);
                } else {
                    iArr[0] = 1;
                    charSequenceArr[0] = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.search);
                    iArr[1] = 2;
                    charSequenceArr[1] = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.saved_list);
                    iArr[2] = 4;
                    charSequenceArr[2] = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.memory_editor);
                }
                this.m = iArr;
                this.l = charSequenceArr;
                this.k = null;
            }
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i, boolean z) {
            boolean[] zArr = this.n;
            if (zArr == null) {
                android.ext.e1.l("", new java.lang.NullPointerException(toString()));
                return;
            }
            try {
                zArr[i] = z;
            } catch (java.lang.ArrayIndexOutOfBoundsException e2) {
                android.ext.e1.l("", e2);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(android.widget.AbsListView absListView, int i, int i2, int i3) {
            onScrollStateChanged(absListView, 0);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(android.widget.AbsListView absListView, int i) {
            try {
                int childCount = absListView.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    try {
                        android.view.View childAt = absListView.getChildAt(i2);
                        if (childAt instanceof android.widget.CheckedTextView) {
                            ((android.widget.CheckedTextView) childAt).refreshDrawableState();
                        }
                    } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
                    }
                }
            } catch (java.lang.Throwable th) {
                android.ext.e1.a(th);
            }
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface dialogInterface) {
            android.widget.ListView listView;
            if (android.os.Build.VERSION.SDK_INT < 23 || !(dialogInterface instanceof android.app.AlertDialog) || (listView = ((android.app.AlertDialog) dialogInterface).getListView()) == null) {
                return;
            }
            listView.setOnScrollListener(this);
        }

        @Override // android.ext.Config.s, android.ext.Config.p
        public java.lang.String toString() {
            return android.ext.Tools.N1(this.f39a);
        }
    }

    public static class OptionMultiChoiceSh extends android.ext.Config.OptionMultiChoice {
        private final int o;

        public OptionMultiChoiceSh(int i, int i2, int[] iArr, int i3, java.lang.String str, boolean z, int i4) {
            super(i, i2, iArr, i3, str, z);
            this.o = i4;
        }

        @Override // android.ext.Config.OptionMultiChoice, android.ext.Config.s, android.ext.Config.p
        public boolean e(android.content.DialogInterface dialogInterface, int i) {
            boolean zE = super.e(dialogInterface, i);
            if (zE) {
                android.ext.Tools.H1(catch_.me_.if_.you_.can_.R.string.need_restart);
            }
            return zE;
        }

        @Override // android.ext.Config.s
        protected void i() {
            super.i();
            if (this.m == null) {
                int i = this.o;
                int[] iArr = new int[i];
                java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[i];
                int i2 = 0;
                while (i2 < i) {
                    iArr[i2] = 1 << i2;
                    int i3 = i2 + 1;
                    charSequenceArr[i2] = java.lang.Integer.toString(i3);
                    i2 = i3;
                }
                this.m = iArr;
                this.l = charSequenceArr;
                this.k = null;
            }
        }
    }

    public static class OptionSeek extends android.ext.Config.p implements android.widget.SeekBar.OnSeekBarChangeListener {
        int k;
        protected java.lang.ref.WeakReference l;

        public OptionSeek(int i, int i2, int i3, int i4, java.lang.String str, boolean z) {
            super(i, i2, i4, str, z);
            this.l = new java.lang.ref.WeakReference(null);
            this.k = i3;
        }

        public OptionSeek(int i, int i2, int i3, int i4, java.lang.String str, boolean z, int i5) {
            this(i, i2, i3, i4, str, z);
            this.h = i5;
        }

        @Override // android.ext.Config.p
        public void b() {
            h();
        }

        @Override // android.ext.Config.p
        public boolean e(android.content.DialogInterface dialogInterface, int i) {
            android.widget.SeekBar seekBar = (android.widget.SeekBar) this.l.get();
            if (seekBar == null) {
                return false;
            }
            this.f42d = seekBar.getProgress();
            android.ext.Config.k();
            return true;
        }

        protected void h() {
            android.view.View viewF = gga.d.f(catch_.me_.if_.you_.can_.R.layout.option_seek, null);
            android.widget.SeekBar seekBar = (android.widget.SeekBar) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.seek);
            seekBar.setMax(this.k);
            seekBar.setProgress(this.f42d);
            seekBar.setOnSeekBarChangeListener(this);
            this.l = new java.lang.ref.WeakReference(seekBar);
            android.ext.f.m(android.ext.f.b().setCustomTitle(android.ext.Config.c(this.f39a, this.h, this.f45g)).setView(viewF).setPositiveButton(catch_.me_.if_.you_.can_.R.string.ok, this).setNegativeButton(catch_.me_.if_.you_.can_.R.string.cancel, (android.content.DialogInterface.OnClickListener) null).create());
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        }

        @Override // android.ext.Config.p
        public java.lang.String toString() {
            return android.ext.Tools.N1(this.f39a);
        }
    }

    class a extends android.ext.Config.OptionMultiChoice {
        private java.lang.CharSequence[] o;
        private java.lang.CharSequence[] p;
        private int[] q;

        a(int i, int i2, int[] iArr, int i3, java.lang.String str, boolean z) {
            super(i, i2, iArr, i3, str, z);
        }

        @Override // android.ext.Config.p
        public java.lang.CharSequence a() {
            if (this.m == null) {
                i();
            }
            java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[this.m.length * 2];
            int i = 0;
            int i2 = 0;
            while (true) {
                int[] iArr = this.m;
                if (i >= iArr.length) {
                    return android.ext.Tools.x((java.lang.CharSequence[]) java.util.Arrays.copyOf(charSequenceArr, i2));
                }
                int i3 = iArr[i];
                if ((this.f42d & i3) == i3) {
                    if (i2 > 0) {
                        charSequenceArr[i2] = ",";
                        i2++;
                    }
                    charSequenceArr[i2] = this.o[i];
                    i2++;
                }
                i++;
            }
        }

        @Override // android.ext.Config.p
        protected void d() {
            this.f40b = 262207;
        }

        @Override // android.ext.Config.OptionMultiChoice, android.ext.Config.s, android.ext.Config.p
        public boolean e(android.content.DialogInterface dialogInterface, int i) {
            android.ext.c2 c2Var;
            boolean zE = super.e(dialogInterface, i);
            if (zE && (c2Var = android.ext.MainService.instance.f216f) != null) {
                c2Var.write("gg.setRanges(");
                android.ext.Script.Consts.a(c2Var, c2Var.f697c.f371a, this.f42d);
                c2Var.write(")\n");
            }
            return zE;
        }

        @Override // android.ext.Config.s
        protected void i() {
            super.i();
            if (this.m == null) {
                int iD0 = android.ext.Tools.d0(catch_.me_.if_.you_.can_.R.color.region_good);
                int iD1 = android.ext.Tools.d0(catch_.me_.if_.you_.can_.R.color.region_good);
                int iD2 = android.ext.Tools.d0(catch_.me_.if_.you_.can_.R.color.region_good);
                int iD3 = android.ext.Tools.d0(catch_.me_.if_.you_.can_.R.color.region_good);
                int iD4 = android.ext.Tools.d0(catch_.me_.if_.you_.can_.R.color.region_good);
                int iD5 = android.ext.Tools.d0(catch_.me_.if_.you_.can_.R.color.region_good);
                int iD6 = android.ext.Tools.d0(catch_.me_.if_.you_.can_.R.color.region_good);
                int iD7 = android.ext.Tools.d0(catch_.me_.if_.you_.can_.R.color.region_other);
                int iD8 = android.ext.Tools.d0(catch_.me_.if_.you_.can_.R.color.region_other);
                int iD9 = android.ext.Tools.d0(catch_.me_.if_.you_.can_.R.color.region_other);
                int iD10 = android.ext.Tools.d0(catch_.me_.if_.you_.can_.R.color.region_other);
                int[] iArr = {2, 1, 4, 8, 16, 262144, 32, 65536, 64, 524288, 1048576, -2080896, 131072, 16384, 32768};
                int[] iArr2 = {iD0, iD1, iD2, iD3, iD4, iD5, iD6, iD7, iD8, iD9, iD10, android.ext.Tools.d0(catch_.me_.if_.you_.can_.R.color.region_slow), android.ext.Tools.d0(catch_.me_.if_.you_.can_.R.color.region_bad), android.ext.Tools.d0(catch_.me_.if_.you_.can_.R.color.region_code), android.ext.Tools.d0(catch_.me_.if_.you_.can_.R.color.region_system_code)};
                java.lang.CharSequence[] charSequenceArr = {android.ext.Tools.t("Jh: Java heap", iD0), android.ext.Tools.t("Ch: C++ heap", iD1), android.ext.Tools.t("Ca: C++ alloc", iD2), android.ext.Tools.t("Cd: C++ .data", iD3), android.ext.Tools.t("Cb: C++ .bss", iD4), android.ext.Tools.t("PS: PPSSPP", iD5), android.ext.Tools.t("A: Anonymous", iD6), android.ext.Tools.t("J: Java", iD7), android.ext.Tools.t("S: Stack", iD8), android.ext.Tools.t("As: Ashmem", iD9), android.ext.Tools.t("V: Video", iD10), android.ext.Tools.t(android.ext.b2.g("O: Other (__slow__)"), iArr2[11]), android.ext.Tools.t(android.ext.b2.g("B: Bad (__dangerous__)"), iArr2[12]), android.ext.Tools.t(android.ext.b2.g("Xa: Code app (__dangerous__)"), iArr2[13]), android.ext.Tools.t(android.ext.b2.g("Xs: Code system (__dangerous__)"), iArr2[14])};
                java.lang.CharSequence[] charSequenceArr2 = new java.lang.CharSequence[15];
                for (int i = 0; i < 15; i++) {
                    charSequenceArr2[i] = android.ext.Tools.t(charSequenceArr[i].toString().split(":")[0], iArr2[i]);
                }
                this.q = iArr2;
                this.m = iArr;
                this.p = charSequenceArr;
                this.o = charSequenceArr2;
                this.k = null;
                android.ext.RegionList.k(iArr, charSequenceArr2, iArr2);
            }
            java.lang.CharSequence[] charSequenceArr3 = new java.lang.CharSequence[this.m.length];
            java.lang.CharSequence[] charSequenceArr4 = this.p;
            android.content.Context contextF0 = android.ext.Tools.f0();
            for (int i2 = 0; i2 < charSequenceArr4.length; i2++) {
                java.lang.String string = charSequenceArr4[i2].toString();
                try {
                    string = string + " [" + android.ext.Tools.U(contextF0, android.ext.RegionList.d(i2)) + ']';
                } catch (java.lang.Throwable th) {
                    android.ext.e1.a(th);
                    android.ext.n0.h(java.lang.Thread.currentThread(), th, false);
                }
                charSequenceArr3[i2] = android.ext.Tools.t(string, this.q[i2]);
            }
            this.l = charSequenceArr3;
        }
    }

    class b extends android.ext.Config.OptionMultiChoice {
        b(int i, int i2, int[] iArr, int i3, java.lang.String str, boolean z) {
            super(i, i2, iArr, i3, str, z);
        }

        @Override // android.ext.Config.s
        protected void i() {
            super.i();
            l(true);
        }
    }

    class c extends android.ext.Config.OptionMultiChoice {

        class a implements android.ext.Config.p.b {
            a() {
            }

            @Override // android.ext.Config.p.b
            public void a(int i) {
                android.ext.MainService.instance.e0();
            }
        }

        c(int i, int i2, int[] iArr, int i3, java.lang.String str, boolean z, int i4) {
            super(i, i2, iArr, i3, str, z, i4);
        }

        @Override // android.ext.Config.s
        protected void i() {
            super.i();
            if (this.j == null) {
                this.j = new android.ext.Config.c.a();
            }
            l(true);
        }
    }

    class d extends android.ext.Config.OptionMultiChoice {
        d(int i, int i2, int[] iArr, int i3, java.lang.String str, boolean z) {
            super(i, i2, iArr, i3, str, z);
        }

        @Override // android.ext.Config.s
        protected void i() {
            super.i();
            l(false);
        }
    }

    class e extends android.ext.Config.OptionMultiChoice {

        class a implements android.ext.Config.p.b {
            a() {
            }

            @Override // android.ext.Config.p.b
            public void a(int i) {
                java.lang.StringBuilder sb;
                if ((i & 1) != 0) {
                    sb = new java.lang.StringBuilder();
                    sb.append(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.hide_1_warn));
                } else {
                    sb = null;
                }
                if ((i & 8) != 0) {
                    if (sb == null) {
                        sb = new java.lang.StringBuilder();
                    } else {
                        sb.append("\n\n");
                    }
                    sb.append(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.hide_4_warn));
                }
                if (sb != null) {
                    android.ext.f.o(android.ext.f.b().setMessage(sb.toString()).setPositiveButton(catch_.me_.if_.you_.can_.R.string.ok, (android.content.DialogInterface.OnClickListener) null));
                }
            }
        }

        e(int i, int i2, int[] iArr, int i3, java.lang.String str, boolean z) {
            super(i, i2, iArr, i3, str, z);
        }

        @Override // android.ext.Config.s
        protected void i() {
            super.i();
            if (this.m == null) {
                java.lang.String str = " (" + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.slow) + ')';
                this.m = new int[]{1, 2, 4, 8};
                this.l = new java.lang.CharSequence[]{1 + str, 2 + str, 3 + str, 4 + str};
                this.k = null;
                if (this.j == null) {
                    this.j = new android.ext.Config.e.a();
                }
            }
        }
    }

    class f extends android.ext.Config.q {
        f(int i, int i2, int i3, int i4, long j, int i5, java.lang.String str, boolean z, boolean z2, boolean z3, int i6) {
            super(i, i2, i3, i4, j, i5, str, z, z2, z3, i6);
            this.f43e = true;
        }
    }

    class g extends android.ext.Config.OptionSeek {
        private java.lang.ref.WeakReference m;

        g(int i, int i2, int i3, int i4, java.lang.String str, boolean z, int i5) {
            super(i, i2, i3, i4, str, z, i5);
            this.m = new java.lang.ref.WeakReference(null);
        }

        @Override // android.ext.Config.OptionSeek
        protected void h() {
            super.h();
            android.widget.SeekBar seekBar = (android.widget.SeekBar) this.l.get();
            if (seekBar == null) {
                return;
            }
            android.widget.ImageView imageView = new android.widget.ImageView(seekBar.getContext());
            imageView.setImageResource(catch_.me_.if_.you_.can_.R.drawable.ic_tooltip_edit_white_24dp);
            this.m = new java.lang.ref.WeakReference(imageView);
            android.ext.Config.n(imageView, android.ext.Config.e(seekBar.getProgress()));
            android.view.ViewParent parent = seekBar.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).addView(imageView);
            }
        }

        @Override // android.ext.Config.OptionSeek, android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
            android.widget.ImageView imageView = (android.widget.ImageView) this.m.get();
            if (imageView == null) {
                return;
            }
            android.ext.Config.n(imageView, android.ext.Config.e(i));
        }
    }

    class h extends android.ext.Config.s {
        h(int i, int i2, int[] iArr, int i3, java.lang.String str, boolean z) {
            super(i, i2, iArr, i3, str, z);
        }

        @Override // android.ext.Config.s, android.ext.Config.p
        public void b() {
            if (android.ext.f1.y()) {
                super.b();
            }
        }
    }

    class i extends android.ext.Config.s {
        i(int i, int i2, int[] iArr, int i3, java.lang.String str, boolean z, int i4) {
            super(i, i2, iArr, i3, str, z, i4);
        }

        @Override // android.ext.Config.s, android.ext.Config.p
        public boolean e(android.content.DialogInterface dialogInterface, int i) {
            boolean zE = super.e(dialogInterface, i);
            if (zE && this.f42d == 3) {
                android.ext.f.o(android.ext.f.c(android.ext.Tools.f0()).setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.help_faq_33_a)).setNegativeButton(catch_.me_.if_.you_.can_.R.string.ok, (android.content.DialogInterface.OnClickListener) null));
            }
            return zE;
        }
    }

    class j extends android.ext.Config.s {
        j(int i, int i2, int[] iArr, int i3, java.lang.String str, boolean z) {
            super(i, i2, iArr, i3, str, z);
        }

        @Override // android.ext.Config.s, android.ext.Config.p
        public boolean e(android.content.DialogInterface dialogInterface, int i) {
            boolean zE = super.e(dialogInterface, i);
            if (zE) {
                android.ext.MainService.instance.j.z();
            }
            return zE;
        }
    }

    class k extends android.ext.Config.s {
        k(int i, int i2, int[] iArr, int i3, java.lang.String str, boolean z) {
            super(i, i2, iArr, i3, str, z);
        }

        private java.lang.String l(java.lang.String str) {
            java.util.Locale localeD;
            try {
                if (str.length() == 0) {
                    localeD = android.ext.k.c();
                    str = android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.default_);
                } else {
                    localeD = android.ext.k.d(str);
                }
                java.lang.String str2 = "";
                try {
                    str2 = java.lang.String.format(localeD, "\n[%,.1f | %.2e]", java.lang.Double.valueOf(-1234.0d), java.lang.Double.valueOf(-4.56E-78d));
                } catch (java.lang.Throwable th) {
                    android.ext.e1.a(th);
                }
                return str + str2;
            } catch (java.lang.Throwable th2) {
                android.ext.e1.a(th2);
                return str;
            }
        }

        private java.lang.String[] m() {
            return new java.lang.String[]{"", "en_US", "in_ID", "ru_RU"};
        }

        @Override // android.ext.Config.p
        protected void d() {
            if (this.f42d <= 0) {
                return;
            }
            java.lang.String[] strArrM = m();
            int i = this.f42d;
            if (i >= strArrM.length) {
                return;
            }
            android.ext.k.j(android.ext.k.d(strArrM[i]));
        }

        @Override // android.ext.Config.s, android.ext.Config.p
        public boolean e(android.content.DialogInterface dialogInterface, int i) {
            boolean zE = super.e(dialogInterface, i);
            if (zE) {
                android.ext.ConfigListAdapter.m();
            }
            return zE;
        }

        @Override // android.ext.Config.s
        protected void i() {
            super.i();
            if (this.l == null) {
                java.lang.String[] strArrM = m();
                java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[strArrM.length];
                for (int i = 0; i < strArrM.length; i++) {
                    charSequenceArr[i] = l(strArrM[i]);
                }
                this.l = charSequenceArr;
            }
        }
    }

    class l extends android.ext.Config.s {
        private int n;

        class a implements android.content.DialogInterface.OnShowListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.app.AlertDialog f37a;

            a(android.app.AlertDialog alertDialog) {
                this.f37a = alertDialog;
            }

            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(android.content.DialogInterface dialogInterface) {
                android.ext.Tools.u1(this.f37a);
            }
        }

        l(int i, int i2, int[] iArr, int i3, java.lang.String str, boolean z, int i4) {
            super(i, i2, iArr, i3, str, z, i4);
            this.n = 0;
        }

        @Override // android.ext.Config.s, android.ext.Config.p
        public boolean e(android.content.DialogInterface dialogInterface, int i) {
            if (i < 0) {
                if (i == -2) {
                    this.f42d = 0;
                    android.ext.Config.k();
                }
                if (android.ext.Config.vSpaceReal && this.n != this.f42d) {
                    android.ext.ConfigListAdapter.m();
                }
                return false;
            }
            this.n = this.f42d;
            boolean zE = super.e(dialogInterface, i);
            if (zE) {
                if (i == 1) {
                    android.app.AlertDialog alertDialogCreate = android.ext.f.c(android.ext.Tools.f0()).setCustomTitle(android.ext.Tools.g0(this.f39a)).setMessage(android.ext.b2.f(this.h)).setPositiveButton(catch_.me_.if_.you_.can_.R.string.save, this).setNegativeButton(catch_.me_.if_.you_.can_.R.string.cancel, this).create();
                    android.ext.f.m(alertDialogCreate);
                    android.ext.f.l(alertDialogCreate, new android.ext.Config.l.a(alertDialogCreate));
                } else if (android.ext.Config.vSpaceReal && this.n != this.f42d) {
                    android.ext.ConfigListAdapter.m();
                }
            }
            return zE;
        }
    }

    class m extends android.ext.Config.s {
        m(int i, int i2, int[] iArr, int i3, java.lang.String str, boolean z) {
            super(i, i2, iArr, i3, str, z);
        }

        private java.lang.String l(int i) {
            if (i == Integer.MAX_VALUE) {
                return android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.yes);
            }
            if (i == 0) {
                return android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.no);
            }
            return android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.first_mb), java.lang.Integer.valueOf(java.lang.Math.round((i * 5.0f) / 1024.0f)));
        }

        @Override // android.ext.Config.s
        protected void i() {
            super.i();
            if (this.m == null) {
                int iE0 = android.ext.Tools.E0();
                int iFloor = iE0 > 0 ? ((int) java.lang.Math.floor(java.lang.Math.log(iE0 / 5.0f) / java.lang.Math.log(2.0d))) - 8 : 0;
                if (iFloor <= 0) {
                    iFloor = 7;
                }
                if (iFloor >= 20) {
                    iFloor = 20;
                }
                int i = iFloor + 2;
                int[] iArr = new int[i];
                java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[i];
                iArr[0] = 0;
                charSequenceArr[0] = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.no);
                int i2 = iFloor + 1;
                iArr[i2] = Integer.MAX_VALUE;
                charSequenceArr[i2] = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.yes);
                java.lang.String strF = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.first_mb);
                for (int i3 = 1; i3 <= iFloor; i3++) {
                    int i4 = 1 << (i3 + 8);
                    iArr[i3] = i4;
                    charSequenceArr[i3] = android.ext.Tools.L1(strF, java.lang.Integer.valueOf(java.lang.Math.round((i4 * 5.0f) / 1024.0f)));
                }
                this.m = iArr;
                this.l = charSequenceArr;
                this.k = null;
            }
        }

        @Override // android.ext.Config.s, android.ext.Config.p
        public java.lang.String toString() {
            return android.ext.Tools.N1(this.f39a) + ": " + l(this.f42d);
        }
    }

    class n extends android.ext.Config.s {
        n(int i, int i2, int[] iArr, int i3, java.lang.String str, boolean z) {
            super(i, i2, iArr, i3, str, z);
        }

        @Override // android.ext.Config.s, android.ext.Config.p
        public void b() {
            if (android.ext.f1.y()) {
                super.b();
            }
        }

        @Override // android.ext.Config.s
        protected void i() {
            super.i();
            int length = android.ext.Config.f28a.length;
            int[] iArr = this.m;
            if (iArr == null || iArr.length != length + 1) {
                int i = length + 1;
                int[] iArr2 = new int[i];
                java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[i];
                int i2 = 0;
                iArr2[0] = 0;
                charSequenceArr[0] = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.no);
                while (i2 < length) {
                    int i3 = android.ext.Config.f28a[i2];
                    i2++;
                    iArr2[i2] = i3;
                    charSequenceArr[i2] = android.ext.Config.f(i3);
                }
                this.m = iArr2;
                this.l = charSequenceArr;
                this.k = null;
            }
        }

        @Override // android.ext.Config.s, android.ext.Config.p
        public java.lang.String toString() {
            return android.ext.Tools.N1(this.f39a) + ": " + android.ext.Config.f(this.f42d);
        }
    }

    public static class o extends android.content.ContextWrapper {
        public o(android.content.Context context) {
            super(context);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public java.lang.String getOpPackageName() {
            android.ext.e1.d("Use 2 " + android.ext.Config.E + " instead of " + getBaseContext().getPackageName());
            return android.ext.Config.E;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public java.lang.String getPackageName() {
            android.ext.e1.d("Use 1 " + android.ext.Config.E + " instead of " + getBaseContext().getPackageName());
            return android.ext.Config.E;
        }
    }

    public static abstract class p implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f40b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        java.lang.String f41c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f42d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f43e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f45g;
        protected android.ext.Config.p.b j;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f44f = 0;
        int h = -1;
        protected android.ext.Config.p.a i = null;

        interface a {
            int a(android.content.DialogInterface dialogInterface, int i);
        }

        interface b {
            void a(int i);
        }

        public p(int i, int i2, int i3, java.lang.String str, boolean z) {
            this.f39a = i2;
            this.f40b = i3;
            this.f41c = str;
            this.f42d = i3;
            this.f45g = z;
            d();
            android.ext.Config.H.put(i, this);
        }

        public java.lang.CharSequence a() {
            return toString();
        }

        public abstract void b();

        public long c() {
            return ((long) this.f42d) | (((long) this.f44f) << 32);
        }

        protected void d() {
        }

        public abstract boolean e(android.content.DialogInterface dialogInterface, int i);

        public void f(android.ext.Config.p.a aVar) {
            this.i = aVar;
        }

        public void g(android.ext.Config.p.b bVar) {
            this.j = bVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(android.content.DialogInterface dialogInterface, int i) {
            android.ext.Config.p.b bVar;
            android.ext.Config.p.a aVar = this.i;
            if (aVar != null) {
                i = aVar.a(dialogInterface, i);
            }
            if (!e(dialogInterface, i) || (bVar = this.j) == null) {
                return;
            }
            bVar.a(this.f42d);
        }

        public java.lang.String toString() {
            return android.ext.b2.f(this.f39a) + ' ' + this.f42d;
        }
    }

    public static class q extends android.ext.Config.p implements android.content.DialogInterface.OnShowListener, android.view.View.OnClickListener {
        int k;
        int l;
        long m;
        private java.lang.ref.WeakReference n;
        private java.lang.ref.WeakReference o;
        private boolean p;
        private boolean q;
        private int r;

        class a implements android.view.View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                android.ext.f.o(android.ext.f.b().setMessage(android.ext.b2.f(android.ext.Config.q.this.f39a) + '\n' + android.ext.b2.f(android.ext.Config.q.this.h)).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), (android.content.DialogInterface.OnClickListener) null));
            }
        }

        public q(int i, int i2, int i3, int i4, long j, int i5, java.lang.String str, boolean z) {
            super(i, i2, i5, str, z);
            this.n = new java.lang.ref.WeakReference(null);
            this.o = new java.lang.ref.WeakReference(null);
            this.p = false;
            this.q = true;
            this.r = 8;
            this.k = i3;
            this.l = i4;
            this.m = j;
        }

        public q(int i, int i2, int i3, int i4, long j, int i5, java.lang.String str, boolean z, int i6) {
            this(i, i2, i3, i4, j, i5, str, z);
            this.h = i6;
        }

        public q(int i, int i2, int i3, int i4, long j, int i5, java.lang.String str, boolean z, boolean z2, boolean z3) {
            this(i, i2, i3, i4, j, i5, str, z);
            this.p = z2;
            this.q = z3;
        }

        public q(int i, int i2, int i3, int i4, long j, int i5, java.lang.String str, boolean z, boolean z2, boolean z3, int i6) {
            this(i, i2, i3, i4, j, i5, str, z, z2, z3);
            this.r = i6;
        }

        private java.lang.String h() {
            int i = this.k;
            return i == 0 ? "" : android.ext.b2.f(i);
        }

        @Override // android.ext.Config.p
        public void b() {
            i();
        }

        @Override // android.ext.Config.p
        public boolean e(android.content.DialogInterface dialogInterface, int i) {
            android.ext.EditText editText = (android.ext.EditText) this.o.get();
            if (editText == null) {
                return false;
            }
            try {
                java.lang.String strH = android.ext.j2.h(editText.getText().toString().trim());
                android.ext.t1.b bVarX = android.ext.t1.x(strH);
                long j = this.l;
                long j2 = this.m;
                if (!this.f43e) {
                    long j3 = bVarX.f1261a;
                    if (j3 < j || j3 > j2) {
                        throw new java.lang.NumberFormatException(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.number_out_of_range), strH) + android.ext.Tools.L1(" [%,d, %,d]", java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2)));
                    }
                }
                android.ext.y0.b(strH, this.r);
                if (this.f43e) {
                    long j4 = bVarX.f1261a;
                    this.f42d = (int) j4;
                    this.f44f = (int) (j4 >> 32);
                } else {
                    this.f42d = java.lang.Math.max((int) java.lang.Math.min(bVarX.f1261a, this.m), this.l);
                }
                android.ext.Config.k();
                android.ext.Tools.E(this.n);
                return true;
            } catch (java.lang.NumberFormatException e2) {
                android.ext.j2.i(e2, editText);
                return false;
            }
        }

        protected void i() {
            android.view.View viewF = gga.d.f(catch_.me_.if_.you_.can_.R.layout.option_edit, null);
            android.widget.TextView textView = (android.widget.TextView) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.message);
            textView.setText(android.ext.b2.f(this.f39a));
            int i = this.h;
            if (i != -1 && i != 0) {
                android.ext.Tools.r1(textView);
                textView.setOnClickListener(new android.ext.Config.q.a());
            }
            android.widget.TextView textView2 = (android.widget.TextView) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.hint);
            java.lang.String strF = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.type_edit_limit);
            java.lang.Object[] objArr = new java.lang.Object[2];
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            objArr2[0] = java.lang.Long.valueOf(this.f43e ? Long.MIN_VALUE : this.l);
            objArr[0] = android.ext.Tools.L1("%,d", objArr2);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            objArr3[0] = java.lang.Long.valueOf(this.f43e ? Long.MAX_VALUE : this.m);
            objArr[1] = android.ext.Tools.L1("%,d", objArr3);
            textView2.setText(android.ext.Tools.L1(strF, objArr));
            ((android.widget.TextView) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.unit)).setText(h());
            android.widget.TextView textView3 = (android.widget.TextView) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.default_);
            textView3.setText(android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.default_) + ": " + android.ext.Tools.L1("%,d", java.lang.Integer.valueOf(this.f40b)));
            textView3.setOnClickListener(this);
            android.ext.EditText editText = (android.ext.EditText) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.number);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            objArr4[0] = java.lang.Long.valueOf(this.f43e ? c() : this.f42d);
            editText.setText(android.ext.Tools.L1("%,d", objArr4));
            editText.setDataType(this.r);
            this.o = new java.lang.ref.WeakReference(editText);
            android.ext.HexConverter hexConverter = (android.ext.HexConverter) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.number_converter);
            hexConverter.setTag(new java.lang.Object[]{editText, 4});
            hexConverter.setVisibility(this.p ? 0 : 8);
            hexConverter.setUseXor(this.q);
            android.app.AlertDialog alertDialogCreate = android.ext.f.b().setView(android.ext.InternalKeyboard.d(viewF)).setPositiveButton(catch_.me_.if_.you_.can_.R.string.ok, this).setNegativeButton(catch_.me_.if_.you_.can_.R.string.cancel, (android.content.DialogInterface.OnClickListener) null).create();
            android.ext.f.l(alertDialogCreate, this);
            this.n = new java.lang.ref.WeakReference(alertDialogCreate);
            android.ext.f.n(alertDialogCreate, editText);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            if (view == null || view.getId() != catch_.me_.if_.you_.can_.R.id.default_) {
                onClick((android.content.DialogInterface) this.n.get(), -1);
                return;
            }
            android.ext.EditText editText = (android.ext.EditText) this.o.get();
            if (editText != null) {
                editText.setText(android.ext.Tools.L1("%,d", java.lang.Integer.valueOf(this.f40b)));
            }
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface dialogInterface) {
            android.ext.Tools.t1(dialogInterface, -1, null, this, (android.ext.EditText) this.o.get());
        }

        @Override // android.ext.Config.p
        public java.lang.String toString() {
            return android.ext.b2.f(this.f39a) + ' ' + android.ext.Tools.L1("%,d", java.lang.Integer.valueOf(this.f42d)) + ' ' + h();
        }
    }

    public static class r extends android.ext.Config.p {
        public r(int i, int i2, int i3, java.lang.String str, boolean z) {
            super(i, i2, i3, str, z);
        }

        @Override // android.ext.Config.p
        public void b() {
        }

        @Override // android.ext.Config.p
        public boolean e(android.content.DialogInterface dialogInterface, int i) {
            return false;
        }
    }

    public static class s extends android.ext.Config.p {
        int[] k;
        java.lang.CharSequence[] l;
        int[] m;

        public s(int i, int i2, int[] iArr, int i3, java.lang.String str, boolean z) {
            super(i, i2, i3, str, z);
            this.l = null;
            this.m = null;
            this.k = iArr;
        }

        public s(int i, int i2, int[] iArr, int i3, java.lang.String str, boolean z, int i4) {
            this(i, i2, iArr, i3, str, z);
            this.h = i4;
        }

        @Override // android.ext.Config.p
        public void b() {
            i();
            java.lang.CharSequence[] charSequenceArr = this.l;
            int[] iArr = this.k;
            if (iArr != null) {
                charSequenceArr = new java.lang.CharSequence[iArr.length];
                int i = 0;
                while (true) {
                    int[] iArr2 = this.k;
                    if (i >= iArr2.length) {
                        break;
                    }
                    charSequenceArr[i] = android.ext.b2.f(iArr2[i]);
                    i++;
                }
            }
            j(charSequenceArr);
        }

        @Override // android.ext.Config.p
        public boolean e(android.content.DialogInterface dialogInterface, int i) {
            this.f42d = h(i);
            android.ext.Config.k();
            android.ext.Tools.D(dialogInterface);
            return true;
        }

        public int h(int i) {
            i();
            int[] iArr = this.m;
            return iArr == null ? i : iArr[i];
        }

        protected void i() {
        }

        protected void j(java.lang.CharSequence[] charSequenceArr) {
            int iK = k(this.f40b);
            java.lang.CharSequence[] charSequenceArr2 = new java.lang.CharSequence[charSequenceArr.length];
            for (int i = 0; i < charSequenceArr.length; i++) {
                charSequenceArr2[i] = (i != iK || charSequenceArr[i] == null) ? charSequenceArr[i] : ((java.lang.Object) charSequenceArr[i]) + " (" + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.default_mark) + ')';
            }
            android.ext.f.o(android.ext.f.b().setCustomTitle(android.ext.Config.c(this.f39a, this.h, this.f45g)).setSingleChoiceItems(charSequenceArr2, k(this.f42d), this));
        }

        public int k(int i) {
            i();
            if (this.m == null) {
                return i;
            }
            int i2 = 1;
            while (true) {
                int[] iArr = this.m;
                if (i2 >= iArr.length) {
                    return 0;
                }
                if (iArr[i2] == i) {
                    return i2;
                }
                i2++;
            }
        }

        @Override // android.ext.Config.p
        public java.lang.String toString() {
            java.lang.CharSequence charSequenceF;
            try {
                int iK = k(this.f42d);
                int[] iArr = this.k;
                charSequenceF = iArr != null ? android.ext.b2.f(iArr[iK]) : this.l[iK];
            } catch (java.lang.IndexOutOfBoundsException unused) {
                charSequenceF = null;
            }
            if (charSequenceF == null) {
                charSequenceF = "int:" + this.f42d;
            }
            return android.ext.Tools.N1(this.f39a) + ": " + ((java.lang.Object) charSequenceF);
        }
    }

    static {
        new android.ext.Config.r(catch_.me_.if_.you_.can_.R.id.config_float_type, catch_.me_.if_.you_.can_.R.string.empty, -1, "float-type", false);
        new android.ext.Config.r(catch_.me_.if_.you_.can_.R.id.config_float_flags, catch_.me_.if_.you_.can_.R.string.empty, -1, "float-flags", false);
        new android.ext.Config.r(catch_.me_.if_.you_.can_.R.id.config_kbd_small, catch_.me_.if_.you_.can_.R.string.empty, 0, "kbd-small", false);
        new android.ext.Config.r(catch_.me_.if_.you_.can_.R.id.config_time_jump_last, catch_.me_.if_.you_.can_.R.string.empty, 0, "time-jump-last", true);
        new android.ext.Config.r(catch_.me_.if_.you_.can_.R.id.config_copy_params, catch_.me_.if_.you_.can_.R.string.empty, 0, "copy-params", false);
        new android.ext.Config.r(catch_.me_.if_.you_.can_.R.id.record_logcat, catch_.me_.if_.you_.can_.R.string.empty, 0, "record-logcat", false);
        new android.ext.Config.q(catch_.me_.if_.you_.can_.R.id.config_freeze_interval, catch_.me_.if_.you_.can_.R.string.freeze_interval, catch_.me_.if_.you_.can_.R.string.microseconds_short, 0, 600000000L, 33000, "freeze-interval", true, catch_.me_.if_.you_.can_.R.string.freeze_interval_help_);
        new android.ext.Config.q(catch_.me_.if_.you_.can_.R.id.config_saved_list_updates_interval, catch_.me_.if_.you_.can_.R.string.saved_list_update_interval, catch_.me_.if_.you_.can_.R.string.milliseconds_short, 100, 600000L, 1000, "saved-list-updates-interval", false, catch_.me_.if_.you_.can_.R.string.saved_list_update_interval_help_);
        new android.ext.Config.f(catch_.me_.if_.you_.can_.R.id.config_xor_key, catch_.me_.if_.you_.can_.R.string.xor_key, catch_.me_.if_.you_.can_.R.string.empty, Integer.MIN_VALUE, 4294967295L, 0, "xor-key", true, true, false, 1);
        new android.ext.Config.q(catch_.me_.if_.you_.can_.R.id.config_history_limit, catch_.me_.if_.you_.can_.R.string.history_limit, catch_.me_.if_.you_.can_.R.string.empty, 0, 100000L, 500, "history-limit", false);
        new android.ext.Config.g(catch_.me_.if_.you_.can_.R.id.config_icons_size, catch_.me_.if_.you_.can_.R.string.icons_size, 12, 0, "icons-size", false, catch_.me_.if_.you_.can_.R.string.icons_size_help);
        new android.ext.Config.s(catch_.me_.if_.you_.can_.R.id.config_ignore_unknown_chars, catch_.me_.if_.you_.can_.R.string.ignore_unknown_chars, new int[]{catch_.me_.if_.you_.can_.R.string.no, catch_.me_.if_.you_.can_.R.string.yes}, 1, "ignore-unknown-chars", false, catch_.me_.if_.you_.can_.R.string.ignore_unknown_chars_help);
        new android.ext.Config.s(catch_.me_.if_.you_.can_.R.id.config_use_notification, catch_.me_.if_.you_.can_.R.string.use_notification, new int[]{catch_.me_.if_.you_.can_.R.string.no, catch_.me_.if_.you_.can_.R.string.yes}, 0, "use-notification", false, catch_.me_.if_.you_.can_.R.string.use_notification_help);
        new android.ext.Config.s(catch_.me_.if_.you_.can_.R.id.config_context_source, catch_.me_.if_.you_.can_.R.string.context, new int[]{catch_.me_.if_.you_.can_.R.string.instrumentation, catch_.me_.if_.you_.can_.R.string.service, catch_.me_.if_.you_.can_.R.string.create, catch_.me_.if_.you_.can_.R.string.application, catch_.me_.if_.you_.can_.R.string.activity}, android.os.Build.VERSION.SDK_INT >= 29 ? 1 : 0, "context-source", false);
        new android.ext.Config.s(catch_.me_.if_.you_.can_.R.id.config_use_sound_effects, catch_.me_.if_.you_.can_.R.string.use_sound_effects, new int[]{catch_.me_.if_.you_.can_.R.string.no, catch_.me_.if_.you_.can_.R.string.yes}, 1, "use-sound-effects", false, catch_.me_.if_.you_.can_.R.string.use_sound_effects_help);
        new android.ext.Config.s(catch_.me_.if_.you_.can_.R.id.selinux, catch_.me_.if_.you_.can_.R.string.empty, new int[]{catch_.me_.if_.you_.can_.R.string.work_without_selinux, catch_.me_.if_.you_.can_.R.string.work_with_selinux}, 0, "selinux", false);
        new android.ext.Config.s(catch_.me_.if_.you_.can_.R.id.config_keyboard, catch_.me_.if_.you_.can_.R.string.keyboard, new int[]{catch_.me_.if_.you_.can_.R.string.external, catch_.me_.if_.you_.can_.R.string.internal}, android.ext.InternalKeyboard.a() ? 1 : 0, "use-internal-keyboard", false, catch_.me_.if_.you_.can_.R.string.keyboard_help);
        new android.ext.Config.s(catch_.me_.if_.you_.can_.R.id.config_suggestions, catch_.me_.if_.you_.can_.R.string.allow_suggestions, new int[]{catch_.me_.if_.you_.can_.R.string.no, catch_.me_.if_.you_.can_.R.string.yes}, 0, "allow-suggestions", false, catch_.me_.if_.you_.can_.R.string.allow_suggestions_help);
        new android.ext.Config.s(catch_.me_.if_.you_.can_.R.id.config_indent, catch_.me_.if_.you_.can_.R.string.indent_for_the_status_bar, new int[]{catch_.me_.if_.you_.can_.R.string.no, catch_.me_.if_.you_.can_.R.string.yes}, 0, "use-indent", false);
        new android.ext.Config.s(catch_.me_.if_.you_.can_.R.id.config_autopause, catch_.me_.if_.you_.can_.R.string.autopause, new int[]{catch_.me_.if_.you_.can_.R.string.no, catch_.me_.if_.you_.can_.R.string.yes}, 0, "use-autopause", false, catch_.me_.if_.you_.can_.R.string.autopause_help);
        new android.ext.Config.s(catch_.me_.if_.you_.can_.R.id.config_acceleration, catch_.me_.if_.you_.can_.R.string.acceleration, new int[]{catch_.me_.if_.you_.can_.R.string.software, catch_.me_.if_.you_.can_.R.string.hardware_}, 0, "use-hardware-acceleration", false, catch_.me_.if_.you_.can_.R.string.acceleration_help_);
        new android.ext.Config.s(catch_.me_.if_.you_.can_.R.id.config_skip_memory, catch_.me_.if_.you_.can_.R.string.skip_memory, new int[]{catch_.me_.if_.you_.can_.R.string.no_slow, catch_.me_.if_.you_.can_.R.string.empty_memory, catch_.me_.if_.you_.can_.R.string.empty_zygote_memory}, 2, "skip-memory", true);
        new android.ext.Config.h(catch_.me_.if_.you_.can_.R.id.config_memory_access, catch_.me_.if_.you_.can_.R.string.memory_access, new int[]{catch_.me_.if_.you_.can_.R.string.normal, catch_.me_.if_.you_.can_.R.string.extended, catch_.me_.if_.you_.can_.R.string.experimental}, 0, "memory-access", false);
        new android.ext.Config.s(catch_.me_.if_.you_.can_.R.id.config_deep_read, catch_.me_.if_.you_.can_.R.string.deep_read, new int[]{catch_.me_.if_.you_.can_.R.string.no, catch_.me_.if_.you_.can_.R.string.yes_slow}, 0, "method", false, catch_.me_.if_.you_.can_.R.string.help_deep_read);
        new android.ext.Config.s(catch_.me_.if_.you_.can_.R.id.config_calls, catch_.me_.if_.you_.can_.R.string.calls, new int[]{catch_.me_.if_.you_.can_.R.string.normal, catch_.me_.if_.you_.can_.R.string.alternative}, 0, "calls", false, catch_.me_.if_.you_.can_.R.string.help_calls);
        new android.ext.Config.s(catch_.me_.if_.you_.can_.R.id.config_waitpid, catch_.me_.if_.you_.can_.R.string.waitpid_mode, new int[]{catch_.me_.if_.you_.can_.R.string.normal, catch_.me_.if_.you_.can_.R.string.alternative}, 0, "waitpid", false, catch_.me_.if_.you_.can_.R.string.help_waitpid);
        new android.ext.Config.s(catch_.me_.if_.you_.can_.R.id.config_fast_freeze, catch_.me_.if_.you_.can_.R.string.fast_freeze, new int[]{catch_.me_.if_.you_.can_.R.string.no, catch_.me_.if_.you_.can_.R.string.yes}, 0, "fast-freeze", true, catch_.me_.if_.you_.can_.R.string.help_fast_freeze);
        new android.ext.Config.s(catch_.me_.if_.you_.can_.R.id.config_fill_toolbar, catch_.me_.if_.you_.can_.R.string.fill_toolbar, new int[]{catch_.me_.if_.you_.can_.R.string.from_left, catch_.me_.if_.you_.can_.R.string.from_center, catch_.me_.if_.you_.can_.R.string.from_right}, 2, "fill-toolbar", false);
        new android.ext.Config.s(catch_.me_.if_.you_.can_.R.id.config_search_helper, catch_.me_.if_.you_.can_.R.string.search_helper, new int[]{catch_.me_.if_.you_.can_.R.string.off, catch_.me_.if_.you_.can_.R.string.go_to_game, catch_.me_.if_.you_.can_.R.string.go_to_game_and_restore}, 2, "search-helper", false);
        new android.ext.Config.s(catch_.me_.if_.you_.can_.R.id.config_speeds_params, catch_.me_.if_.you_.can_.R.string.speedhack_speeds_, new int[]{catch_.me_.if_.you_.can_.R.string.nothing, catch_.me_.if_.you_.can_.R.string.sort, catch_.me_.if_.you_.can_.R.string.sort_and_remove_duplicates}, 2, "speeds-params", false);
        new android.ext.Config.s(catch_.me_.if_.you_.can_.R.id.config_reset_on_exit, catch_.me_.if_.you_.can_.R.string.reset_on_exit_, new int[]{catch_.me_.if_.you_.can_.R.string.no, catch_.me_.if_.you_.can_.R.string.yes}, 1, "reset-on-exit", false);
        new android.ext.Config.s(catch_.me_.if_.you_.can_.R.id.config_check_libs, catch_.me_.if_.you_.can_.R.string.check_libs, new int[]{catch_.me_.if_.you_.can_.R.string.no, catch_.me_.if_.you_.can_.R.string.yes}, 1, "check-libs", false);
        new android.ext.Config.s(catch_.me_.if_.you_.can_.R.id.config_visible_type, catch_.me_.if_.you_.can_.R.string.use_visible_type, new int[]{catch_.me_.if_.you_.can_.R.string.no, catch_.me_.if_.you_.can_.R.string.yes}, 1, "visible-type", false, catch_.me_.if_.you_.can_.R.string.use_visible_type_help);
        new android.ext.Config.i(catch_.me_.if_.you_.can_.R.id.config_prevent_unload, catch_.me_.if_.you_.can_.R.string.prevent_unload, new int[]{catch_.me_.if_.you_.can_.R.string.no, catch_.me_.if_.you_.can_.R.string.level_1, catch_.me_.if_.you_.can_.R.string.level_2, catch_.me_.if_.you_.can_.R.string.level_3}, 0, "prevent-unload", false, catch_.me_.if_.you_.can_.R.string.prevent_unload_help);
        new android.ext.Config.s(catch_.me_.if_.you_.can_.R.id.config_ptrace_bypass_mode, catch_.me_.if_.you_.can_.R.string.ptrace_bypass_mode, new int[]{catch_.me_.if_.you_.can_.R.string.mode_restore, catch_.me_.if_.you_.can_.R.string.mode_nothing, catch_.me_.if_.you_.can_.R.string.mode_freeze, catch_.me_.if_.you_.can_.R.string.off}, 3, "ptrace-bypass", true, catch_.me_.if_.you_.can_.R.string.ptrace_bypass_mode_help);
        new android.ext.Config.j(catch_.me_.if_.you_.can_.R.id.config_time_jump_panel, catch_.me_.if_.you_.can_.R.string.show_time_jump_panel, new int[]{catch_.me_.if_.you_.can_.R.string.no, catch_.me_.if_.you_.can_.R.string.yes}, 0, "time-jump-panel", true);
        new android.ext.Config.k(catch_.me_.if_.you_.can_.R.id.config_number_locale, catch_.me_.if_.you_.can_.R.string.number_locale, null, 0, "number-locale", false);
        new android.ext.Config.l(catch_.me_.if_.you_.can_.R.id.config_vspace_root, catch_.me_.if_.you_.can_.R.string.vspace_root, new int[]{catch_.me_.if_.you_.can_.R.string.no, catch_.me_.if_.you_.can_.R.string.yes_dangerous}, 0, "vspace-root", false, catch_.me_.if_.you_.can_.R.string.help_vspace_root_);
        new android.ext.Config.m(catch_.me_.if_.you_.can_.R.id.config_ram, catch_.me_.if_.you_.can_.R.string.data_in_ram, null, Integer.MAX_VALUE, "data-in-ram", false);
        new android.ext.Config.n(catch_.me_.if_.you_.can_.R.id.config_hot_key, catch_.me_.if_.you_.can_.R.string.hot_key, null, 0, "hot-key", false);
        new android.ext.Config.a(catch_.me_.if_.you_.can_.R.id.config_ranges, catch_.me_.if_.you_.can_.R.string.set_range, null, 0, "ranges", true);
        new android.ext.Config.OptionMultiChoiceSh(catch_.me_.if_.you_.can_.R.id.config_speedhack_intercept, catch_.me_.if_.you_.can_.R.string.speedhack_intercept, null, -1, "intercept", true, 21);
        new android.ext.Config.OptionMultiChoiceSh(catch_.me_.if_.you_.can_.R.id.config_unrandomizer_intercept, catch_.me_.if_.you_.can_.R.string.unrandomizer_intercept, null, -520193, "unrand-intercept", true, 19);
        new android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.config_toolbars, catch_.me_.if_.you_.can_.R.string.toolbars, null, -1, "toolbars", false);
        new android.ext.Config.c(catch_.me_.if_.you_.can_.R.id.config_use_small_list_items, catch_.me_.if_.you_.can_.R.string.small_list_items, null, 0, "small-items", false, catch_.me_.if_.you_.can_.R.string.small_list_items_help);
        new android.ext.Config.d(catch_.me_.if_.you_.can_.R.id.config_backgrounds, catch_.me_.if_.you_.can_.R.string.backgrounds, null, 0, "backgrounds", false);
        new android.ext.Config.e(catch_.me_.if_.you_.can_.R.id.config_hide_from_game, catch_.me_.if_.you_.can_.R.string.hide_from_game, null, 0, "hide", true);
        h();
        C = false;
        vSpaceReal = false;
        D = false;
        E = "unknown";
        F = "unknown";
        G = (byte) 0;
    }

    public static android.content.Context a(android.content.Context context) {
        return context instanceof android.ext.Config.o ? context : new android.ext.Config.o(context);
    }

    public static android.ext.Config.p b(int i2) {
        return (android.ext.Config.p) H.get(i2);
    }

    static android.view.View c(int i2, int i3, boolean z2) {
        java.lang.String str = null;
        if (z2) {
            android.ext.z1.d dVar = android.ext.MainService.instance.v0;
            java.lang.String str2 = dVar != null ? dVar.f1433b : null;
            if (str2 != null) {
                str = '\"' + str2 + '\"';
            }
        }
        return android.ext.Tools.j0(android.ext.b2.f(i2), str, i3);
    }

    public static int d() {
        return e(o);
    }

    public static int e(int i2) {
        return (i2 * 2) + 24;
    }

    static java.lang.String f(int i2) {
        switch (i2) {
            case 0:
                return android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.no);
            case 1:
                return "KEY_ESC";
            case 2:
                return "KEY_1";
            case 3:
                return "KEY_2";
            case 4:
                return "KEY_3";
            case 5:
                return "KEY_4";
            case 6:
                return "KEY_5";
            case 7:
                return "KEY_6";
            case 8:
                return "KEY_7";
            case 9:
                return "KEY_8";
            case 10:
                return "KEY_9";
            case 11:
                return "KEY_0";
            case 12:
                return "KEY_MINUS";
            case 13:
                return "KEY_EQUAL";
            case 14:
                return "KEY_BACKSPACE";
            case 15:
                return "KEY_TAB";
            case 16:
                return "KEY_Q";
            case 17:
                return "KEY_W";
            case 18:
                return "KEY_E";
            case 19:
                return "KEY_R";
            case 20:
                return "KEY_T";
            case 21:
                return "KEY_Y";
            case 22:
                return "KEY_U";
            case 23:
                return "KEY_I";
            case 24:
                return "KEY_O";
            case 25:
                return "KEY_P";
            case 26:
                return "KEY_LEFTBRACE";
            case 27:
                return "KEY_RIGHTBRACE";
            case 28:
                return "KEY_ENTER";
            case 29:
                return "KEY_LEFTCTRL";
            case 30:
                return "KEY_A";
            case 31:
                return "KEY_S";
            case 32:
                return "KEY_D";
            case 33:
                return "KEY_F";
            case 34:
                return "KEY_G";
            case 35:
                return "KEY_H";
            case 36:
                return "KEY_J";
            case 37:
                return "KEY_K";
            case 38:
                return "KEY_L";
            case 39:
                return "KEY_SEMICOLON";
            case 40:
                return "KEY_APOSTROPHE";
            case 41:
                return "KEY_GRAVE";
            case 42:
                return "KEY_LEFTSHIFT";
            case 43:
                return "KEY_BACKSLASH";
            case 44:
                return "KEY_Z";
            case 45:
                return "KEY_X";
            case 46:
                return "KEY_C";
            case 47:
                return "KEY_V";
            case 48:
                return "KEY_B";
            case 49:
                return "KEY_N";
            case 50:
                return "KEY_M";
            case 51:
                return "KEY_COMMA";
            case 52:
                return "KEY_DOT";
            case 53:
                return "KEY_SLASH";
            case 54:
                return "KEY_RIGHTSHIFT";
            case 55:
                return "KEY_KPASTERISK";
            case 56:
                return "KEY_LEFTALT";
            case 57:
                return "KEY_SPACE";
            case 58:
                return "KEY_CAPSLOCK";
            case 59:
                return "KEY_F1";
            case 60:
                return "KEY_F2";
            case 61:
                return "KEY_F3";
            case 62:
                return "KEY_F4";
            case 63:
                return "KEY_F5";
            case 64:
                return "KEY_F6";
            case 65:
                return "KEY_F7";
            case 66:
                return "KEY_F8";
            case 67:
                return "KEY_F9";
            case 68:
                return "KEY_F10";
            case 69:
                return "KEY_NUMLOCK";
            case 70:
                return "KEY_SCROLLLOCK";
            case 71:
                return "KEY_KP7";
            case 72:
                return "KEY_KP8";
            case 73:
                return "KEY_KP9";
            case 74:
                return "KEY_KPMINUS";
            case 75:
                return "KEY_KP4";
            case 76:
                return "KEY_KP5";
            case 77:
                return "KEY_KP6";
            case 78:
                return "KEY_KPPLUS";
            case 79:
                return "KEY_KP1";
            case 80:
                return "KEY_KP2";
            case 81:
                return "KEY_KP3";
            case 82:
                return "KEY_KP0";
            case 83:
                return "KEY_KPDOT";
            case 84:
            case 195:
            case 196:
            case 197:
            case 198:
            case 199:
            case 249:
            case 250:
            case 251:
            case 252:
            case 253:
            case 254:
            case 255:
            case 266:
            case 267:
            case 268:
            case 269:
            case 270:
            case 271:
            case 280:
            case 281:
            case 282:
            case 283:
            case 284:
            case 285:
            case 286:
            case 287:
            case 300:
            case 301:
            case 302:
            case 319:
            case 329:
            case 338:
            case 339:
            case 340:
            case 341:
            case 342:
            case 343:
            case 344:
            case 345:
            case 346:
            case 347:
            case 348:
            case 349:
            case 350:
            case 351:
            case 443:
            case 444:
            case 445:
            case 446:
            case 447:
            case 452:
            case 453:
            case 454:
            case 455:
            case 456:
            case 457:
            case 458:
            case 459:
            case 460:
            case 461:
            case 462:
            case 463:
            case 485:
            case 486:
            case 487:
            case 488:
            case 489:
            case 490:
            case 491:
            case 492:
            case 493:
            case 494:
            case 495:
            case 496:
            case 507:
            case 508:
            case 509:
            case 510:
            case 511:
            case 524:
            case 525:
            case 526:
            case 527:
            case 543:
            case 548:
            case 549:
            case 550:
            case 551:
            case 552:
            case 553:
            case 554:
            case 555:
            case 556:
            case 557:
            case 558:
            case 559:
            case 561:
            case 562:
            case 563:
            case 564:
            case 565:
            case 566:
            case 567:
            case 568:
            case 569:
            case 570:
            case 571:
            case 572:
            case 573:
            case 574:
            case 575:
            case 583:
            case 584:
            case 585:
            case 586:
            case 587:
            case 588:
            case 589:
            case 590:
            case 591:
            case 594:
            case 595:
            case 596:
            case 597:
            case 598:
            case 599:
            case 600:
            case 601:
            case 602:
            case 603:
            case 604:
            case 605:
            case 606:
            case 607:
            case 608:
            case 609:
            case 610:
            case 611:
            case 612:
            case 613:
            case 614:
            case 615:
            case 616:
            case 617:
            case 618:
            case 619:
            case 620:
            case 621:
            case 622:
            case 623:
            case 624:
            case 625:
            case 626:
            case 627:
            case 628:
            case 629:
            case 630:
            case 631:
            case 632:
            case 633:
            case 634:
            case 635:
            case 636:
            case 637:
            case 638:
            case 639:
            case 640:
            case 641:
            case 642:
            case 643:
            case 644:
            case 645:
            case 646:
            case 647:
            case 648:
            case 649:
            case 650:
            case 651:
            case 652:
            case 653:
            case 654:
            case 655:
            case 656:
            case 657:
            case 658:
            case 659:
            case 660:
            case 661:
            case 662:
            case 663:
            case 664:
            case 665:
            case 666:
            case 667:
            case 668:
            case 669:
            case 670:
            case 671:
            case 672:
            case 673:
            case 674:
            case 675:
            case 676:
            case 677:
            case 678:
            case 679:
            case 680:
            case 681:
            case 682:
            case 683:
            case 684:
            case 685:
            case 686:
            case 687:
            case 688:
            case 689:
            case 690:
            case 691:
            case 692:
            case 693:
            case 694:
            case 695:
            case 696:
            case 697:
            case 698:
            case 699:
            case 700:
            case 701:
            case 702:
            case 703:
            default:
                return "UNKNOWN_" + i2;
            case 85:
                return "KEY_ZENKAKUHANKAKU";
            case 86:
                return "KEY_102ND";
            case 87:
                return "KEY_F11";
            case 88:
                return "KEY_F12";
            case 89:
                return "KEY_RO";
            case 90:
                return "KEY_KATAKANA";
            case 91:
                return "KEY_HIRAGANA";
            case 92:
                return "KEY_HENKAN";
            case 93:
                return "KEY_KATAKANAHIRAGANA";
            case 94:
                return "KEY_MUHENKAN";
            case 95:
                return "KEY_KPJPCOMMA";
            case 96:
                return "KEY_KPENTER";
            case 97:
                return "KEY_RIGHTCTRL";
            case 98:
                return "KEY_KPSLASH";
            case 99:
                return "KEY_SYSRQ";
            case 100:
                return "KEY_RIGHTALT";
            case 101:
                return "KEY_LINEFEED";
            case 102:
                return "KEY_HOME";
            case 103:
                return "KEY_UP";
            case 104:
                return "KEY_PAGEUP";
            case 105:
                return "KEY_LEFT";
            case 106:
                return "KEY_RIGHT";
            case 107:
                return "KEY_END";
            case 108:
                return "KEY_DOWN";
            case 109:
                return "KEY_PAGEDOWN";
            case 110:
                return "KEY_INSERT";
            case 111:
                return "KEY_DELETE";
            case 112:
                return "KEY_MACRO";
            case 113:
                return "KEY_MUTE";
            case 114:
                return "KEY_VOLUMEDOWN";
            case 115:
                return "KEY_VOLUMEUP";
            case 116:
                return "KEY_POWER";
            case 117:
                return "KEY_KPEQUAL";
            case 118:
                return "KEY_KPPLUSMINUS";
            case 119:
                return "KEY_PAUSE";
            case 120:
                return "KEY_SCALE";
            case 121:
                return "KEY_KPCOMMA";
            case 122:
                return "KEY_HANGEUL";
            case 123:
                return "KEY_HANJA";
            case 124:
                return "KEY_YEN";
            case 125:
                return "KEY_LEFTMETA";
            case 126:
                return "KEY_RIGHTMETA";
            case 127:
                return "KEY_COMPOSE";
            case 128:
                return "KEY_STOP";
            case 129:
                return "KEY_AGAIN";
            case 130:
                return "KEY_PROPS";
            case 131:
                return "KEY_UNDO";
            case 132:
                return "KEY_FRONT";
            case 133:
                return "KEY_COPY";
            case 134:
                return "KEY_OPEN";
            case 135:
                return "KEY_PASTE";
            case 136:
                return "KEY_FIND";
            case 137:
                return "KEY_CUT";
            case 138:
                return "KEY_HELP";
            case 139:
                return "KEY_MENU";
            case 140:
                return "KEY_CALC";
            case 141:
                return "KEY_SETUP";
            case 142:
                return "KEY_SLEEP";
            case 143:
                return "KEY_WAKEUP";
            case 144:
                return "KEY_FILE";
            case 145:
                return "KEY_SENDFILE";
            case 146:
                return "KEY_DELETEFILE";
            case 147:
                return "KEY_XFER";
            case 148:
                return "KEY_PROG1";
            case 149:
                return "KEY_PROG2";
            case 150:
                return "KEY_WWW";
            case 151:
                return "KEY_MSDOS";
            case 152:
                return "KEY_SCREENLOCK";
            case 153:
                return "KEY_DIRECTION";
            case 154:
                return "KEY_CYCLEWINDOWS";
            case 155:
                return "KEY_MAIL";
            case 156:
                return "KEY_BOOKMARKS";
            case 157:
                return "KEY_COMPUTER";
            case 158:
                return "KEY_BACK";
            case 159:
                return "KEY_FORWARD";
            case 160:
                return "KEY_CLOSECD";
            case 161:
                return "KEY_EJECTCD";
            case 162:
                return "KEY_EJECTCLOSECD";
            case 163:
                return "KEY_NEXTSONG";
            case 164:
                return "KEY_PLAYPAUSE";
            case 165:
                return "KEY_PREVIOUSSONG";
            case 166:
                return "KEY_STOPCD";
            case 167:
                return "KEY_RECORD";
            case 168:
                return "KEY_REWIND";
            case 169:
                return "KEY_PHONE";
            case 170:
                return "KEY_ISO";
            case 171:
                return "KEY_CONFIG";
            case 172:
                return "KEY_HOMEPAGE";
            case 173:
                return "KEY_REFRESH";
            case 174:
                return "KEY_EXIT";
            case 175:
                return "KEY_MOVE";
            case 176:
                return "KEY_EDIT";
            case 177:
                return "KEY_SCROLLUP";
            case 178:
                return "KEY_SCROLLDOWN";
            case 179:
                return "KEY_KPLEFTPAREN";
            case 180:
                return "KEY_KPRIGHTPAREN";
            case 181:
                return "KEY_NEW";
            case 182:
                return "KEY_REDO";
            case 183:
                return "KEY_F13";
            case 184:
                return "KEY_F14";
            case 185:
                return "KEY_F15";
            case 186:
                return "KEY_F16";
            case 187:
                return "KEY_F17";
            case 188:
                return "KEY_F18";
            case 189:
                return "KEY_F19";
            case 190:
                return "KEY_F20";
            case 191:
                return "KEY_F21";
            case 192:
                return "KEY_F22";
            case 193:
                return "KEY_F23";
            case 194:
                return "KEY_F24";
            case 200:
                return "KEY_PLAYCD";
            case 201:
                return "KEY_PAUSECD";
            case 202:
                return "KEY_PROG3";
            case 203:
                return "KEY_PROG4";
            case 204:
                return "KEY_DASHBOARD";
            case 205:
                return "KEY_SUSPEND";
            case 206:
                return "KEY_CLOSE";
            case 207:
                return "KEY_PLAY";
            case 208:
                return "KEY_FASTFORWARD";
            case 209:
                return "KEY_BASSBOOST";
            case 210:
                return "KEY_PRINT";
            case 211:
                return "KEY_HP";
            case 212:
                return "KEY_CAMERA";
            case 213:
                return "KEY_SOUND";
            case 214:
                return "KEY_QUESTION";
            case 215:
                return "KEY_EMAIL";
            case 216:
                return "KEY_CHAT";
            case 217:
                return "KEY_SEARCH";
            case 218:
                return "KEY_CONNECT";
            case 219:
                return "KEY_FINANCE";
            case 220:
                return "KEY_SPORT";
            case 221:
                return "KEY_SHOP";
            case 222:
                return "KEY_ALTERASE";
            case 223:
                return "KEY_CANCEL";
            case 224:
                return "KEY_BRIGHTNESSDOWN";
            case 225:
                return "KEY_BRIGHTNESSUP";
            case 226:
                return "KEY_MEDIA";
            case 227:
                return "KEY_SWITCHVIDEOMODE";
            case 228:
                return "KEY_KBDILLUMTOGGLE";
            case 229:
                return "KEY_KBDILLUMDOWN";
            case 230:
                return "KEY_KBDILLUMUP";
            case 231:
                return "KEY_SEND";
            case 232:
                return "KEY_REPLY";
            case 233:
                return "KEY_FORWARDMAIL";
            case 234:
                return "KEY_SAVE";
            case 235:
                return "KEY_DOCUMENTS";
            case 236:
                return "KEY_BATTERY";
            case 237:
                return "KEY_BLUETOOTH";
            case 238:
                return "KEY_WLAN";
            case 239:
                return "KEY_UWB";
            case 240:
                return "KEY_UNKNOWN";
            case 241:
                return "KEY_VIDEO_NEXT";
            case 242:
                return "KEY_VIDEO_PREV";
            case 243:
                return "KEY_BRIGHTNESS_CYCLE";
            case 244:
                return "KEY_BRIGHTNESS_AUTO";
            case 245:
                return "KEY_DISPLAY_OFF";
            case 246:
                return "KEY_WWAN";
            case 247:
                return "KEY_RFKILL";
            case 248:
                return "KEY_MICMUTE";
            case 256:
                return "BTN_0";
            case 257:
                return "BTN_1";
            case 258:
                return "BTN_2";
            case 259:
                return "BTN_3";
            case 260:
                return "BTN_4";
            case 261:
                return "BTN_5";
            case 262:
                return "BTN_6";
            case 263:
                return "BTN_7";
            case 264:
                return "BTN_8";
            case 265:
                return "BTN_9";
            case 272:
                return "BTN_LEFT";
            case 273:
                return "BTN_RIGHT";
            case 274:
                return "BTN_MIDDLE";
            case 275:
                return "BTN_SIDE";
            case 276:
                return "BTN_EXTRA";
            case 277:
                return "BTN_FORWARD";
            case 278:
                return "BTN_BACK";
            case 279:
                return "BTN_TASK";
            case 288:
                return "BTN_TRIGGER";
            case 289:
                return "BTN_THUMB";
            case 290:
                return "BTN_THUMB2";
            case 291:
                return "BTN_TOP";
            case 292:
                return "BTN_TOP2";
            case 293:
                return "BTN_PINKIE";
            case 294:
                return "BTN_BASE";
            case 295:
                return "BTN_BASE2";
            case 296:
                return "BTN_BASE3";
            case 297:
                return "BTN_BASE4";
            case 298:
                return "BTN_BASE5";
            case 299:
                return "BTN_BASE6";
            case 303:
                return "BTN_DEAD";
            case 304:
                return "BTN_A";
            case 305:
                return "BTN_B";
            case 306:
                return "BTN_C";
            case 307:
                return "BTN_X";
            case 308:
                return "BTN_Y";
            case 309:
                return "BTN_Z";
            case 310:
                return "BTN_TL";
            case 311:
                return "BTN_TR";
            case 312:
                return "BTN_TL2";
            case 313:
                return "BTN_TR2";
            case 314:
                return "BTN_SELECT";
            case 315:
                return "BTN_START";
            case 316:
                return "BTN_MODE";
            case 317:
                return "BTN_THUMBL";
            case 318:
                return "BTN_THUMBR";
            case 320:
                return "BTN_TOOL_PEN";
            case 321:
                return "BTN_TOOL_RUBBER";
            case 322:
                return "BTN_TOOL_BRUSH";
            case 323:
                return "BTN_TOOL_PENCIL";
            case 324:
                return "BTN_TOOL_AIRBRUSH";
            case 325:
                return "BTN_TOOL_FINGER";
            case 326:
                return "BTN_TOOL_MOUSE";
            case 327:
                return "BTN_TOOL_LENS";
            case 328:
                return "BTN_TOOL_QUINTTAP";
            case 330:
                return "BTN_TOUCH";
            case 331:
                return "BTN_STYLUS";
            case 332:
                return "BTN_STYLUS2";
            case 333:
                return "BTN_TOOL_DOUBLETAP";
            case 334:
                return "BTN_TOOL_TRIPLETAP";
            case 335:
                return "BTN_TOOL_QUADTAP";
            case 336:
                return "BTN_WHEEL";
            case 337:
                return "BTN_GEAR_UP";
            case 352:
                return "KEY_OK";
            case 353:
                return "KEY_SELECT";
            case 354:
                return "KEY_GOTO";
            case 355:
                return "KEY_CLEAR";
            case 356:
                return "KEY_POWER2";
            case 357:
                return "KEY_OPTION";
            case 358:
                return "KEY_INFO";
            case 359:
                return "KEY_TIME";
            case 360:
                return "KEY_VENDOR";
            case 361:
                return "KEY_ARCHIVE";
            case 362:
                return "KEY_PROGRAM";
            case 363:
                return "KEY_CHANNEL";
            case 364:
                return "KEY_FAVORITES";
            case 365:
                return "KEY_EPG";
            case 366:
                return "KEY_PVR";
            case 367:
                return "KEY_MHP";
            case 368:
                return "KEY_LANGUAGE";
            case 369:
                return "KEY_TITLE";
            case 370:
                return "KEY_SUBTITLE";
            case 371:
                return "KEY_ANGLE";
            case 372:
                return "KEY_ZOOM";
            case 373:
                return "KEY_MODE";
            case 374:
                return "KEY_KEYBOARD";
            case 375:
                return "KEY_SCREEN";
            case 376:
                return "KEY_PC";
            case 377:
                return "KEY_TV";
            case 378:
                return "KEY_TV2";
            case 379:
                return "KEY_VCR";
            case 380:
                return "KEY_VCR2";
            case 381:
                return "KEY_SAT";
            case 382:
                return "KEY_SAT2";
            case 383:
                return "KEY_CD";
            case 384:
                return "KEY_TAPE";
            case 385:
                return "KEY_RADIO";
            case 386:
                return "KEY_TUNER";
            case 387:
                return "KEY_PLAYER";
            case 388:
                return "KEY_TEXT";
            case 389:
                return "KEY_DVD";
            case 390:
                return "KEY_AUX";
            case 391:
                return "KEY_MP3";
            case 392:
                return "KEY_AUDIO";
            case 393:
                return "KEY_VIDEO";
            case 394:
                return "KEY_DIRECTORY";
            case 395:
                return "KEY_LIST";
            case 396:
                return "KEY_MEMO";
            case 397:
                return "KEY_CALENDAR";
            case 398:
                return "KEY_RED";
            case 399:
                return "KEY_GREEN";
            case 400:
                return "KEY_YELLOW";
            case 401:
                return "KEY_BLUE";
            case 402:
                return "KEY_CHANNELUP";
            case 403:
                return "KEY_CHANNELDOWN";
            case 404:
                return "KEY_FIRST";
            case 405:
                return "KEY_LAST";
            case 406:
                return "KEY_AB";
            case 407:
                return "KEY_NEXT";
            case 408:
                return "KEY_RESTART";
            case 409:
                return "KEY_SLOW";
            case 410:
                return "KEY_SHUFFLE";
            case 411:
                return "KEY_BREAK";
            case 412:
                return "KEY_PREVIOUS";
            case 413:
                return "KEY_DIGITS";
            case 414:
                return "KEY_TEEN";
            case 415:
                return "KEY_TWEN";
            case 416:
                return "KEY_VIDEOPHONE";
            case 417:
                return "KEY_GAMES";
            case 418:
                return "KEY_ZOOMIN";
            case 419:
                return "KEY_ZOOMOUT";
            case 420:
                return "KEY_ZOOMRESET";
            case 421:
                return "KEY_WORDPROCESSOR";
            case 422:
                return "KEY_EDITOR";
            case 423:
                return "KEY_SPREADSHEET";
            case 424:
                return "KEY_GRAPHICSEDITOR";
            case 425:
                return "KEY_PRESENTATION";
            case 426:
                return "KEY_DATABASE";
            case 427:
                return "KEY_NEWS";
            case 428:
                return "KEY_VOICEMAIL";
            case 429:
                return "KEY_ADDRESSBOOK";
            case 430:
                return "KEY_MESSENGER";
            case 431:
                return "KEY_DISPLAYTOGGLE";
            case 432:
                return "KEY_SPELLCHECK";
            case 433:
                return "KEY_LOGOFF";
            case 434:
                return "KEY_DOLLAR";
            case 435:
                return "KEY_EURO";
            case 436:
                return "KEY_FRAMEBACK";
            case 437:
                return "KEY_FRAMEFORWARD";
            case 438:
                return "KEY_CONTEXT_MENU";
            case 439:
                return "KEY_MEDIA_REPEAT";
            case 440:
                return "KEY_10CHANNELSUP";
            case 441:
                return "KEY_10CHANNELSDOWN";
            case 442:
                return "KEY_IMAGES";
            case 448:
                return "KEY_DEL_EOL";
            case 449:
                return "KEY_DEL_EOS";
            case 450:
                return "KEY_INS_LINE";
            case 451:
                return "KEY_DEL_LINE";
            case 464:
                return "KEY_FN";
            case 465:
                return "KEY_FN_ESC";
            case 466:
                return "KEY_FN_F1";
            case 467:
                return "KEY_FN_F2";
            case 468:
                return "KEY_FN_F3";
            case 469:
                return "KEY_FN_F4";
            case 470:
                return "KEY_FN_F5";
            case 471:
                return "KEY_FN_F6";
            case 472:
                return "KEY_FN_F7";
            case 473:
                return "KEY_FN_F8";
            case 474:
                return "KEY_FN_F9";
            case 475:
                return "KEY_FN_F10";
            case 476:
                return "KEY_FN_F11";
            case 477:
                return "KEY_FN_F12";
            case 478:
                return "KEY_FN_1";
            case 479:
                return "KEY_FN_2";
            case 480:
                return "KEY_FN_D";
            case 481:
                return "KEY_FN_E";
            case 482:
                return "KEY_FN_F";
            case 483:
                return "KEY_FN_S";
            case 484:
                return "KEY_FN_B";
            case 497:
                return "KEY_BRL_DOT1";
            case 498:
                return "KEY_BRL_DOT2";
            case 499:
                return "KEY_BRL_DOT3";
            case 500:
                return "KEY_BRL_DOT4";
            case 501:
                return "KEY_BRL_DOT5";
            case 502:
                return "KEY_BRL_DOT6";
            case 503:
                return "KEY_BRL_DOT7";
            case 504:
                return "KEY_BRL_DOT8";
            case 505:
                return "KEY_BRL_DOT9";
            case 506:
                return "KEY_BRL_DOT10";
            case 512:
                return "KEY_NUMERIC_0";
            case 513:
                return "KEY_NUMERIC_1";
            case 514:
                return "KEY_NUMERIC_2";
            case 515:
                return "KEY_NUMERIC_3";
            case 516:
                return "KEY_NUMERIC_4";
            case 517:
                return "KEY_NUMERIC_5";
            case 518:
                return "KEY_NUMERIC_6";
            case 519:
                return "KEY_NUMERIC_7";
            case 520:
                return "KEY_NUMERIC_8";
            case 521:
                return "KEY_NUMERIC_9";
            case 522:
                return "KEY_NUMERIC_STAR";
            case 523:
                return "KEY_NUMERIC_POUND";
            case 528:
                return "KEY_CAMERA_FOCUS";
            case 529:
                return "KEY_WPS_BUTTON";
            case 530:
                return "KEY_TOUCHPAD_TOGGLE";
            case 531:
                return "KEY_TOUCHPAD_ON";
            case 532:
                return "KEY_TOUCHPAD_OFF";
            case 533:
                return "KEY_CAMERA_ZOOMIN";
            case 534:
                return "KEY_CAMERA_ZOOMOUT";
            case 535:
                return "KEY_CAMERA_UP";
            case 536:
                return "KEY_CAMERA_DOWN";
            case 537:
                return "KEY_CAMERA_LEFT";
            case 538:
                return "KEY_CAMERA_RIGHT";
            case 539:
                return "KEY_ATTENDANT_ON";
            case 540:
                return "KEY_ATTENDANT_OFF";
            case 541:
                return "KEY_ATTENDANT_TOGGLE";
            case 542:
                return "KEY_LIGHTS_TOGGLE";
            case 544:
                return "BTN_DPAD_UP";
            case 545:
                return "BTN_DPAD_DOWN";
            case 546:
                return "BTN_DPAD_LEFT";
            case 547:
                return "BTN_DPAD_RIGHT";
            case 560:
                return "KEY_ALS_TOGGLE";
            case 576:
                return "KEY_BUTTONCONFIG";
            case 577:
                return "KEY_TASKMANAGER";
            case 578:
                return "KEY_JOURNAL";
            case 579:
                return "KEY_CONTROLPANEL";
            case 580:
                return "KEY_APPSELECT";
            case 581:
                return "KEY_SCREENSAVER";
            case 582:
                return "KEY_VOICECOMMAND";
            case 592:
                return "KEY_BRIGHTNESS_MIN";
            case 593:
                return "KEY_BRIGHTNESS_MAX";
            case 704:
                return "BTN_TRIGGER_HAPPY1";
            case 705:
                return "BTN_TRIGGER_HAPPY2";
            case 706:
                return "BTN_TRIGGER_HAPPY3";
            case 707:
                return "BTN_TRIGGER_HAPPY4";
            case 708:
                return "BTN_TRIGGER_HAPPY5";
            case 709:
                return "BTN_TRIGGER_HAPPY6";
            case 710:
                return "BTN_TRIGGER_HAPPY7";
            case 711:
                return "BTN_TRIGGER_HAPPY8";
            case 712:
                return "BTN_TRIGGER_HAPPY9";
            case 713:
                return "BTN_TRIGGER_HAPPY10";
            case 714:
                return "BTN_TRIGGER_HAPPY11";
            case 715:
                return "BTN_TRIGGER_HAPPY12";
            case 716:
                return "BTN_TRIGGER_HAPPY13";
            case 717:
                return "BTN_TRIGGER_HAPPY14";
            case 718:
                return "BTN_TRIGGER_HAPPY15";
            case 719:
                return "BTN_TRIGGER_HAPPY16";
            case 720:
                return "BTN_TRIGGER_HAPPY17";
            case 721:
                return "BTN_TRIGGER_HAPPY18";
            case 722:
                return "BTN_TRIGGER_HAPPY19";
            case 723:
                return "BTN_TRIGGER_HAPPY20";
            case 724:
                return "BTN_TRIGGER_HAPPY21";
            case 725:
                return "BTN_TRIGGER_HAPPY22";
            case 726:
                return "BTN_TRIGGER_HAPPY23";
            case 727:
                return "BTN_TRIGGER_HAPPY24";
            case 728:
                return "BTN_TRIGGER_HAPPY25";
            case 729:
                return "BTN_TRIGGER_HAPPY26";
            case 730:
                return "BTN_TRIGGER_HAPPY27";
            case 731:
                return "BTN_TRIGGER_HAPPY28";
            case 732:
                return "BTN_TRIGGER_HAPPY29";
            case 733:
                return "BTN_TRIGGER_HAPPY30";
            case 734:
                return "BTN_TRIGGER_HAPPY31";
            case 735:
                return "BTN_TRIGGER_HAPPY32";
            case 736:
                return "BTN_TRIGGER_HAPPY33";
            case 737:
                return "BTN_TRIGGER_HAPPY34";
            case 738:
                return "BTN_TRIGGER_HAPPY35";
            case 739:
                return "BTN_TRIGGER_HAPPY36";
            case 740:
                return "BTN_TRIGGER_HAPPY37";
            case 741:
                return "BTN_TRIGGER_HAPPY38";
            case 742:
                return "BTN_TRIGGER_HAPPY39";
            case 743:
                return "BTN_TRIGGER_HAPPY40";
        }
    }

    private static java.lang.String g() {
        try {
            android.ext.z1.d dVar = android.ext.MainService.instance.v0;
            if (dVar == null) {
                return null;
            }
            return dVar.f1434c;
        } catch (java.lang.NullPointerException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:22:0x0072, please report this as an issue */
    public static void h() {
        android.content.SharedPreferences sharedPreferencesM0 = android.ext.Tools.M0();
        i(sharedPreferencesM0);
        java.lang.String strG = g();
        boolean z2 = false;
        for (int i2 = 0; i2 < H.size(); i2++) {
            android.ext.Config.p pVar = (android.ext.Config.p) H.valueAt(i2);
            java.lang.String str = pVar.f41c;
            if (!pVar.f45g) {
                try {
                    try {
                        pVar.f42d = sharedPreferencesM0.getInt(str, pVar.f40b);
                    } catch (java.lang.ClassCastException unused) {
                        pVar.f42d = sharedPreferencesM0.getBoolean(pVar.f41c, pVar.f40b == 1) ? 1 : 0;
                        z2 = true;
                    }
                } catch (java.lang.ClassCastException e2) {
                    android.ext.e1.l("Failed load data for " + pVar.f41c, e2);
                }
                if (pVar.f43e) {
                    try {
                        pVar.f44f = sharedPreferencesM0.getInt(str + "-2", 0);
                    } catch (java.lang.ClassCastException e3) {
                        android.ext.e1.l("Failed load data2 for " + pVar.f41c, e3);
                    }
                }
            } else if (strG != null) {
                str = strG + '-' + str;
                pVar.f42d = sharedPreferencesM0.getInt(str, pVar.f40b);
                if (pVar.f43e) {
                    pVar.f44f = sharedPreferencesM0.getInt(str + "-2", 0);
                }
            }
        }
        if (z2) {
            k();
        } else {
            j();
        }
    }

    private static void i(android.content.SharedPreferences sharedPreferences) {
        f30c = sharedPreferences.getLong("ignore", 0L);
        f31d = sharedPreferences.getLong("memory-from", 0L);
        f32e = sharedPreferences.getLong("memory-to", -1L);
        f33f = sharedPreferences.getLong("nearby-distance", 512L);
        int i2 = 0;
        while (true) {
            long[] jArr = f29b;
            if (i2 >= jArr.length) {
                break;
            }
            jArr[i2] = sharedPreferences.getLong("toolbar-buttons-" + i2, -1L);
            i2++;
        }
        if (android.ext.MainService.I0) {
            android.ext.MainService.instance.q1();
        }
    }

    private static void j() {
        r();
        if (android.ext.MainService.instance != null) {
            if (android.ext.MainService.instance.Y != null) {
                android.ext.MainService.instance.V(android.ext.MainService.instance.Y.getAdapter());
                android.ext.MainService.instance.X0();
            }
            android.ext.MainService.instance.i.w0();
            android.ext.MainService.instance.p1();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0046  */
    /* JADX WARN: Code duplicated, block: B:18:0x005c A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:12:0x0046, please report this as an issue */
    public static void k() {
        android.ext.g2 g2Var = new android.ext.g2();
        l(g2Var);
        java.lang.String strG = g();
        for (int i2 = 0; i2 < H.size(); i2++) {
            android.ext.Config.p pVar = (android.ext.Config.p) H.valueAt(i2);
            java.lang.String str = pVar.f41c;
            if (!pVar.f45g) {
                g2Var.g(str, pVar.f42d, pVar.f40b);
                if (pVar.f43e) {
                    g2Var.g(str + "-2", pVar.f44f, 0);
                }
            } else if (strG != null) {
                str = strG + '-' + str;
                g2Var.g(str, pVar.f42d, pVar.f40b);
                if (pVar.f43e) {
                    g2Var.g(str + "-2", pVar.f44f, 0);
                }
            }
        }
        g2Var.commit();
        j();
    }

    private static void l(android.ext.g2 g2Var) {
        g2Var.i("ignore", f30c, 0L);
        g2Var.i("memory-from", f31d, 0L);
        g2Var.i("memory-to", f32e, -1L);
        g2Var.i("nearby-distance", f33f, 512L);
        int i2 = 0;
        while (true) {
            long[] jArr = f29b;
            if (i2 >= jArr.length) {
                return;
            }
            g2Var.i("toolbar-buttons-" + i2, jArr[i2], -1L);
            i2++;
        }
    }

    public static android.widget.ImageView m(android.widget.ImageView imageView) {
        int iH = android.ext.Tools.H();
        return o(imageView, iH, iH);
    }

    public static android.widget.ImageView n(android.widget.ImageView imageView, int i2) {
        int iH = android.ext.Tools.H();
        return p(imageView, iH, iH, i2);
    }

    public static android.widget.ImageView o(android.widget.ImageView imageView, int i2, int i3) {
        return p(imageView, i2, i3, d());
    }

    public static android.widget.ImageView p(android.widget.ImageView imageView, int i2, int i3, int i4) {
        imageView.setAdjustViewBounds(false);
        imageView.setMinimumWidth(i2);
        imageView.setMinimumHeight(i3);
        int iG = (int) android.ext.Tools.G(i4);
        int i5 = i2 > iG ? (i2 - iG) / 2 : 0;
        int i6 = i3 > iG ? (i3 - iG) / 2 : 0;
        imageView.setPadding(i5, i6, i5, i6);
        try {
            imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
        }
        imageView.invalidate();
        return imageView;
    }

    public static android.widget.ImageView q(android.widget.ImageView imageView, int i2) {
        imageView.setAdjustViewBounds(false);
        imageView.setMinimumWidth(i2);
        imageView.setMinimumHeight(i2);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i2;
            layoutParams.height = i2;
            imageView.setLayoutParams(layoutParams);
        }
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        imageView.invalidate();
        return imageView;
    }

    public static void r() {
        gga.e eVar = H;
        int i2 = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_reset_on_exit)).f42d == 1 ? 2 : 0;
        if (((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.selinux)).f42d == 1) {
            i2 |= 4;
        }
        if (((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_deep_read)).f42d == 0) {
            i2 |= 65536;
        }
        if (((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_calls)).f42d == 1) {
            i2 |= 2048;
        }
        if (((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_waitpid)).f42d == 1) {
            i2 |= 4096;
        }
        if (((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_fast_freeze)).f42d == 1) {
            i2 |= 262144;
        }
        int i3 = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_skip_memory)).f42d;
        if (i3 == 1) {
            i2 |= 1;
        }
        if (i3 == 2) {
            i2 |= 1025;
        }
        int i4 = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_memory_access)).f42d;
        if (i4 == 1) {
            i2 |= 8;
        }
        if (i4 == 2) {
            i2 |= 16;
        }
        int i5 = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_prevent_unload)).f42d;
        if (i5 == 1) {
            i2 |= 32;
        }
        if (i5 == 2 || i5 == 3) {
            i2 |= 64;
        }
        int i6 = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_hide_from_game)).f42d;
        if ((i6 & 1) != 0) {
            i2 |= 128;
        }
        if ((i6 & 2) != 0) {
            i2 |= 256;
        }
        if ((i6 & 4) != 0) {
            i2 |= 512;
        }
        if ((i6 & 8) != 0) {
            i2 |= 32768;
        }
        int i7 = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_ptrace_bypass_mode)).f42d;
        if (i7 == 1) {
            i2 |= 8192;
        }
        if (i7 == 2) {
            i2 |= 16384;
        }
        if (i7 == 3) {
            i2 |= 131072;
        }
        A = i2;
        int i8 = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_keyboard)).f42d == 1 ? 1 : 0;
        if (((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_acceleration)).f42d == 1) {
            i8 |= 2;
        }
        if (((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_autopause)).f42d == 1) {
            i8 |= 4;
        }
        if (((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_suggestions)).f42d == 1) {
            i8 |= 8;
        }
        if (((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_indent)).f42d == 1) {
            i8 |= 16;
        }
        if (((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_use_sound_effects)).f42d == 1) {
            i8 |= 32;
        }
        if (((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_kbd_small)).f42d == 1) {
            i8 |= 64;
        }
        if (((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_time_jump_panel)).f42d == 1) {
            i8 |= 128;
        }
        if (((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_use_notification)).f42d == 1) {
            i8 |= 256;
        }
        if (((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_check_libs)).f42d == 1) {
            i8 |= 2048;
        }
        if (((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_ignore_unknown_chars)).f42d == 1) {
            i8 |= 4096;
        }
        if (((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_prevent_unload)).f42d == 3) {
            i8 |= 8192;
        }
        if (((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_vspace_root)).f42d == 1) {
            i8 |= 512;
        }
        if (((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_visible_type)).f42d == 1) {
            i8 |= 1024;
        }
        B = i8;
        ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_number_locale)).d();
        f34g = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_fill_toolbar)).f42d;
        h = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_ram)).f42d;
        i = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_ranges)).f42d;
        k = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_search_helper)).f42d;
        l = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_speeds_params)).f42d;
        m = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_freeze_interval)).f42d;
        n = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_saved_list_updates_interval)).f42d;
        o = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_icons_size)).f42d;
        p = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_toolbars)).f42d;
        q = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_use_small_list_items)).f42d;
        r = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_backgrounds)).f42d;
        s = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_xor_key)).c();
        t = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_float_type)).f42d;
        u = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_float_flags)).f42d;
        v = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_time_jump_last)).f42d;
        w = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_hot_key)).f42d;
        x = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_history_limit)).f42d;
        y = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_copy_params)).f42d;
        z = ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_context_source)).f42d;
        j = (((long) ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_speedhack_intercept)).f42d) & 2097151) | (((long) ((android.ext.Config.p) eVar.get(catch_.me_.if_.you_.can_.R.id.config_unrandomizer_intercept)).f42d) << 21);
    }

    public static void s(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        int[] iArr2 = f28a;
        int length = iArr2.length;
        int length2 = iArr.length;
        int i2 = length + length2;
        int[] iArr3 = new int[i2];
        java.lang.System.arraycopy(iArr2, 0, iArr3, 0, length);
        java.lang.System.arraycopy(iArr, 0, iArr3, length, length2);
        java.util.Arrays.sort(iArr3);
        int i3 = 1;
        for (int i4 = 1; i4 < i2; i4++) {
            int i5 = iArr3[i4];
            if (i5 != iArr3[i4 - 1]) {
                iArr3[i3] = i5;
                i3++;
            }
        }
        f28a = java.util.Arrays.copyOf(iArr3, i3);
    }
}
