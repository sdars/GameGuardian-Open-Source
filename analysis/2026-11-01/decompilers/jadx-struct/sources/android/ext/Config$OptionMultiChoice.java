package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnMultiChoiceClickListener;
import android.content.DialogInterface$OnShowListener;
import android.os.Build$VERSION;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView$OnScrollListener;
import android.widget.CheckedTextView;
import android.widget.ListView;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
public class Config$OptionMultiChoice extends Config$s implements DialogInterface$OnMultiChoiceClickListener, DialogInterface$OnShowListener, AbsListView$OnScrollListener {
    boolean[] n;

    public Config$OptionMultiChoice(int i, int i2, int[] iArr, int i3, String str, boolean z) {
        super(i, i2, iArr, i3, str, z);
    }

    public Config$OptionMultiChoice(int i, int i2, int[] iArr, int i3, String str, boolean z, int i4) {
        this(i, i2, iArr, i3, str, z);
        this.h = i4;
    }

    @Override // android.ext.Config$s, android.ext.Config$p
    public boolean e(DialogInterface dialogInterface, int i) {
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
        Config.k();
        Tools.D(dialogInterface);
        return true;
    }

    @Override // android.ext.Config$s
    protected void j(CharSequence[] charSequenceArr) {
        boolean[] zArr = new boolean[charSequenceArr.length];
        this.n = zArr;
        int i = this.f42d;
        for (int i2 = 0; i2 < charSequenceArr.length; i2++) {
            int iH = h(i2);
            zArr[i2] = (i & iH) == iH;
        }
        AlertDialog alertDialogCreate = f.c(Tools.k0()).setCustomTitle(Config.c(this.f39a, this.h, this.f45g)).setMultiChoiceItems(charSequenceArr, zArr, this).setPositiveButton(R$string.save, this).setNeutralButton(R$string.reset_button, this).setNegativeButton(R$string.cancel, this).create();
        f.l(alertDialogCreate, this);
        f.m(alertDialogCreate);
    }

    protected void l(boolean z) {
        if (this.m == null) {
            int i = z ? 6 : 3;
            int[] iArr = new int[i];
            CharSequence[] charSequenceArr = new CharSequence[i];
            if (z) {
                iArr[0] = 1;
                charSequenceArr[0] = b2.f(R$string.search) + ", " + b2.f(R$string.portrait);
                iArr[1] = 2;
                charSequenceArr[1] = b2.f(R$string.search) + ", " + b2.f(R$string.landscape);
                iArr[2] = 4;
                charSequenceArr[2] = b2.f(R$string.saved_list) + ", " + b2.f(R$string.portrait);
                iArr[3] = 8;
                charSequenceArr[3] = b2.f(R$string.saved_list) + ", " + b2.f(R$string.landscape);
                iArr[4] = 16;
                charSequenceArr[4] = b2.f(R$string.memory_editor) + ", " + b2.f(R$string.portrait);
                iArr[5] = 32;
                charSequenceArr[5] = b2.f(R$string.memory_editor) + ", " + b2.f(R$string.landscape);
            } else {
                iArr[0] = 1;
                charSequenceArr[0] = b2.f(R$string.search);
                iArr[1] = 2;
                charSequenceArr[1] = b2.f(R$string.saved_list);
                iArr[2] = 4;
                charSequenceArr[2] = b2.f(R$string.memory_editor);
            }
            this.m = iArr;
            this.l = charSequenceArr;
            this.k = null;
        }
    }

    @Override // android.content.DialogInterface$OnMultiChoiceClickListener
    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        boolean[] zArr = this.n;
        if (zArr == null) {
            e1.l("", new NullPointerException(toString()));
            return;
        }
        try {
            zArr[i] = z;
        } catch (ArrayIndexOutOfBoundsException e2) {
            e1.l("", e2);
        }
    }

    @Override // android.widget.AbsListView$OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        onScrollStateChanged(absListView, 0);
    }

    @Override // android.widget.AbsListView$OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        try {
            int childCount = absListView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                try {
                    View childAt = absListView.getChildAt(i2);
                    if (childAt instanceof CheckedTextView) {
                        ((CheckedTextView) childAt).refreshDrawableState();
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.content.DialogInterface$OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        ListView listView;
        if (Build$VERSION.SDK_INT < 23 || !(dialogInterface instanceof AlertDialog) || (listView = ((AlertDialog) dialogInterface).getListView()) == null) {
            return;
        }
        listView.setOnScrollListener(this);
    }

    @Override // android.ext.Config$s, android.ext.Config$p
    public String toString() {
        return Tools.N1(this.f39a);
    }
}
