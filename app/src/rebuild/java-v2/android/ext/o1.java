package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import catch_.me_.if_.you_.can_.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class o1 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1150a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f1151b = new ArrayList();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f1152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CharSequence f1153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f1154c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1155d;

        public a(long j, CharSequence charSequence, String str, int i) {
            this.f1152a = j;
            this.f1153b = charSequence;
            this.f1154c = str;
            this.f1155d = i;
        }

        public CharSequence a() {
            return Tools.x(Tools.t(android.ext.c.G(this.f1152a, 0), Tools.d0(R.color.address)), Tools.t(": " + ((Object) this.f1153b), -1));
        }
    }

    public static class b extends p1 implements View.OnLongClickListener {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final o1 f1156f;

        public b(o1 o1Var) {
            super(R.string.back, R.drawable.ic_history_back_24dp);
            this.f1156f = o1Var;
        }

        @Override // android.ext.p1
        public ImageView b(boolean z) {
            ImageView imageViewB = super.b(z);
            imageViewB.setOnLongClickListener(this);
            return imageViewB;
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1156f.c();
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.f1156f.d();
            return true;
        }
    }

    public static class c extends p1 implements View.OnLongClickListener {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final o1 f1157f;

        public c(o1 o1Var) {
            super(R.string.forward, R.drawable.ic_history_forward_24dp);
            this.f1157f = o1Var;
        }

        @Override // android.ext.p1
        public ImageView b(boolean z) {
            ImageView imageViewB = super.b(z);
            imageViewB.setOnLongClickListener(this);
            return imageViewB;
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1157f.e();
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.f1157f.d();
            return true;
        }
    }

    public boolean a(long j, CharSequence charSequence) {
        return b(j, charSequence, 0);
    }

    public boolean b(long j, CharSequence charSequence, int i) {
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
        z1.d dVar = MainService.instance.v0;
        return this.f1151b.add(new a(j, charSequence, dVar != null ? dVar.f1434c : null, i));
    }

    public void c() {
        if (this.f1151b.size() == 0) {
            Tools.H1(R.string.history_empty);
            return;
        }
        int i = this.f1150a;
        if (i < 2) {
            Tools.I1(R.string.no_previous, 0);
        } else {
            onClick(null, i - 2);
        }
    }

    public void d() {
        int size = this.f1151b.size();
        if (size == 0) {
            Tools.H1(R.string.history_empty);
            return;
        }
        CharSequence[] charSequenceArr = new CharSequence[size];
        Drawable[] drawableArr = new Drawable[size];
        HashMap map = new HashMap();
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.f1151b.get(i);
            charSequenceArr[i] = aVar.a();
            String str = aVar.f1154c;
            if (str != null) {
                Drawable drawableR1 = (Drawable) map.get(str);
                if (drawableR1 == null) {
                    try {
                        drawableR1 = Tools.R1(Tools.G0(Tools.X(Tools.Y(aVar.f1154c)), Tools.H()));
                    } catch (Throwable th) {
                        e1.l("Failed load icon for " + aVar.f1154c, th);
                    }
                    map.put(aVar.f1154c, drawableR1);
                }
                drawableArr[i] = drawableR1;
            }
        }
        AlertDialog alertDialogCreate = ggf.c(Tools.k0()).setCustomTitle(Tools.g0(R.string.goto_address)).setSingleChoiceItems(charSequenceArr, this.f1150a - 1, this).setNegativeButton(b2.f(R.string.cancel), (DialogInterface.OnClickListener) null).create();
        ListView listView = alertDialogCreate.getListView();
        if (listView != null) {
            Tools.e(listView, charSequenceArr, drawableArr, 48, R.style.SmallText);
        }
        f.m(alertDialogCreate);
    }

    public void e() {
        int size = this.f1151b.size();
        if (size == 0) {
            Tools.H1(R.string.history_empty);
            return;
        }
        int i = this.f1150a;
        if (i >= size) {
            Tools.I1(R.string.no_next, 0);
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
        return ((a) this.f1151b.get(i - 1)).f1152a;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        a aVar = (a) this.f1151b.get(i);
        if (aVar != null) {
            this.f1150a = i + 1;
            MainService.instance.K(aVar.f1152a, aVar.f1155d);
        }
        if (dialogInterface != null) {
            Tools.D(dialogInterface);
        }
    }
}
