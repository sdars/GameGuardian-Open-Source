package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.graphics.drawable.Drawable;
import android.widget.ListView;
import catch_.me_.if_.you_.can_.R$string;
import catch_.me_.if_.you_.can_.R$style;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class o1 implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1150a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f1151b = new ArrayList();

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
        z1$d z1_d = MainService.instance.v0;
        return this.f1151b.add(new o1$a(j, charSequence, z1_d != null ? z1_d.f1434c : null, i));
    }

    public void c() {
        if (this.f1151b.size() == 0) {
            Tools.H1(R$string.history_empty);
            return;
        }
        int i = this.f1150a;
        if (i < 2) {
            Tools.I1(R$string.no_previous, 0);
        } else {
            onClick(null, i - 2);
        }
    }

    public void d() {
        int size = this.f1151b.size();
        if (size == 0) {
            Tools.H1(R$string.history_empty);
            return;
        }
        CharSequence[] charSequenceArr = new CharSequence[size];
        Drawable[] drawableArr = new Drawable[size];
        HashMap map = new HashMap();
        for (int i = 0; i < size; i++) {
            o1$a o1_a = (o1$a) this.f1151b.get(i);
            charSequenceArr[i] = o1_a.a();
            String str = o1_a.f1154c;
            if (str != null) {
                Drawable drawableR1 = (Drawable) map.get(str);
                if (drawableR1 == null) {
                    try {
                        drawableR1 = Tools.R1(Tools.G0(Tools.X(Tools.Y(o1_a.f1154c)), Tools.H()));
                    } catch (Throwable th) {
                        e1.l("Failed load icon for " + o1_a.f1154c, th);
                    }
                    map.put(o1_a.f1154c, drawableR1);
                }
                drawableArr[i] = drawableR1;
            }
        }
        AlertDialog alertDialogCreate = f.c(Tools.k0()).setCustomTitle(Tools.g0(R$string.goto_address)).setSingleChoiceItems(charSequenceArr, this.f1150a - 1, this).setNegativeButton(b2.f(R$string.cancel), (DialogInterface$OnClickListener) null).create();
        ListView listView = alertDialogCreate.getListView();
        if (listView != null) {
            Tools.e(listView, charSequenceArr, drawableArr, 48, R$style.SmallText);
        }
        f.m(alertDialogCreate);
    }

    public void e() {
        int size = this.f1151b.size();
        if (size == 0) {
            Tools.H1(R$string.history_empty);
            return;
        }
        int i = this.f1150a;
        if (i >= size) {
            Tools.I1(R$string.no_next, 0);
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
        return ((o1$a) this.f1151b.get(i - 1)).f1152a;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        o1$a o1_a = (o1$a) this.f1151b.get(i);
        if (o1_a != null) {
            this.f1150a = i + 1;
            MainService.instance.K(o1_a.f1152a, o1_a.f1155d);
        }
        if (dialogInterface != null) {
            Tools.D(dialogInterface);
        }
    }
}
