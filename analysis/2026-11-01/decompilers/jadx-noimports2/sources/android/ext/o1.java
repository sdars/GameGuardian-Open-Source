package android.ext;

/* JADX INFO: loaded from: classes.dex */
public class o1 implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1150a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f1151b = new java.util.ArrayList();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f1152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.CharSequence f1153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        java.lang.String f1154c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1155d;

        public a(long j, java.lang.CharSequence charSequence, java.lang.String str, int i) {
            this.f1152a = j;
            this.f1153b = charSequence;
            this.f1154c = str;
            this.f1155d = i;
        }

        public java.lang.CharSequence a() {
            return android.ext.Tools.x(android.ext.Tools.t(android.ext.c.G(this.f1152a, 0), android.ext.Tools.d0(catch_.me_.if_.you_.can_.R.color.address)), android.ext.Tools.t(": " + ((java.lang.Object) this.f1153b), -1));
        }
    }

    public static class b extends android.ext.p1 implements android.view.View.OnLongClickListener {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final android.ext.o1 f1156f;

        public b(android.ext.o1 o1Var) {
            super(catch_.me_.if_.you_.can_.R.string.back, catch_.me_.if_.you_.can_.R.drawable.ic_history_back_24dp);
            this.f1156f = o1Var;
        }

        @Override // android.ext.p1
        public android.widget.ImageView b(boolean z) {
            android.widget.ImageView imageViewB = super.b(z);
            imageViewB.setOnLongClickListener(this);
            return imageViewB;
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            this.f1156f.c();
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(android.view.View view) {
            this.f1156f.d();
            return true;
        }
    }

    public static class c extends android.ext.p1 implements android.view.View.OnLongClickListener {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final android.ext.o1 f1157f;

        public c(android.ext.o1 o1Var) {
            super(catch_.me_.if_.you_.can_.R.string.forward, catch_.me_.if_.you_.can_.R.drawable.ic_history_forward_24dp);
            this.f1157f = o1Var;
        }

        @Override // android.ext.p1
        public android.widget.ImageView b(boolean z) {
            android.widget.ImageView imageViewB = super.b(z);
            imageViewB.setOnLongClickListener(this);
            return imageViewB;
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            this.f1157f.e();
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(android.view.View view) {
            this.f1157f.d();
            return true;
        }
    }

    public boolean a(long j, java.lang.CharSequence charSequence) {
        return b(j, charSequence, 0);
    }

    public boolean b(long j, java.lang.CharSequence charSequence, int i) {
        int i2;
        int size = this.f1151b.size();
        if (this.f1150a < size) {
            while (true) {
                size--;
                i2 = this.f1150a;
                if (size < i2) {
                    break;
                }
                this.f1151b.remove(size);
            }
            size = i2;
        }
        if (size >= 100) {
            this.f1150a--;
            this.f1151b.remove(0);
        }
        this.f1150a++;
        android.ext.z1.d dVar = android.ext.MainService.instance.v0;
        return this.f1151b.add(new android.ext.o1.a(j, charSequence, dVar != null ? dVar.f1434c : null, i));
    }

    public void c() {
        if (this.f1151b.size() == 0) {
            android.ext.Tools.H1(catch_.me_.if_.you_.can_.R.string.history_empty);
            return;
        }
        int i = this.f1150a;
        if (i < 2) {
            android.ext.Tools.I1(catch_.me_.if_.you_.can_.R.string.no_previous, 0);
        } else {
            onClick(null, i - 2);
        }
    }

    public void d() {
        int size = this.f1151b.size();
        if (size == 0) {
            android.ext.Tools.H1(catch_.me_.if_.you_.can_.R.string.history_empty);
            return;
        }
        java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[size];
        android.graphics.drawable.Drawable[] drawableArr = new android.graphics.drawable.Drawable[size];
        java.util.HashMap map = new java.util.HashMap();
        for (int i = 0; i < size; i++) {
            android.ext.o1.a aVar = (android.ext.o1.a) this.f1151b.get(i);
            charSequenceArr[i] = aVar.a();
            java.lang.String str = aVar.f1154c;
            if (str != null) {
                android.graphics.drawable.Drawable drawableR1 = (android.graphics.drawable.Drawable) map.get(str);
                if (drawableR1 == null) {
                    try {
                        drawableR1 = android.ext.Tools.R1(android.ext.Tools.G0(android.ext.Tools.X(android.ext.Tools.Y(aVar.f1154c)), android.ext.Tools.H()));
                    } catch (java.lang.Throwable th) {
                        android.ext.e1.l("Failed load icon for " + aVar.f1154c, th);
                    }
                    map.put(aVar.f1154c, drawableR1);
                }
                drawableArr[i] = drawableR1;
            }
        }
        android.app.AlertDialog alertDialogCreate = android.ext.f.c(android.ext.Tools.k0()).setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.goto_address)).setSingleChoiceItems(charSequenceArr, this.f1150a - 1, this).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cancel), (android.content.DialogInterface.OnClickListener) null).create();
        android.widget.ListView listView = alertDialogCreate.getListView();
        if (listView != null) {
            android.ext.Tools.e(listView, charSequenceArr, drawableArr, 48, catch_.me_.if_.you_.can_.R.style.SmallText);
        }
        android.ext.f.m(alertDialogCreate);
    }

    public void e() {
        int size = this.f1151b.size();
        if (size == 0) {
            android.ext.Tools.H1(catch_.me_.if_.you_.can_.R.string.history_empty);
            return;
        }
        int i = this.f1150a;
        if (i >= size) {
            android.ext.Tools.I1(catch_.me_.if_.you_.can_.R.string.no_next, 0);
        } else {
            onClick(null, i);
        }
    }

    public long f() {
        int size = this.f1151b.size();
        int i = this.f1150a;
        if (i <= 0 || i > size) {
            return 0L;
        }
        return ((android.ext.o1.a) this.f1151b.get(i - 1)).f1152a;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i) {
        android.ext.o1.a aVar = (android.ext.o1.a) this.f1151b.get(i);
        if (aVar != null) {
            this.f1150a = i + 1;
            android.ext.MainService.instance.K(aVar.f1152a, aVar.f1155d);
        }
        if (dialogInterface != null) {
            android.ext.Tools.D(dialogInterface);
        }
    }
}
