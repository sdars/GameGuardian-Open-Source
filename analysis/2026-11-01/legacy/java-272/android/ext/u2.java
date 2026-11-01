package android.ext;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class u2 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final c.a[] f1273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DialogInterface.OnClickListener f1275c;

    class a extends ArrayAdapter {
        a(Context context, c.a[] aVarArr) {
            super(context, aVarArr);
        }

        @Override // android.ext.ArrayAdapter, android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            c.a aVar;
            View view2 = super.getView(i, view, viewGroup);
            TextView textView = (TextView) view2.findViewById(R.id.text1);
            if (textView != null) {
                Tools.D1(textView, catch_.me_.if_.you_.can_.R.style.SmallText);
                if (i >= 0) {
                    c.a[] aVarArr = u2.this.f1273a;
                    if (i < aVarArr.length && (aVar = aVarArr[i]) != null) {
                        textView.setTextColor(c.n(aVar.f675a));
                    }
                }
            }
            return view2;
        }
    }

    public u2(a.e eVar, SparseIntArray sparseIntArray, String str, String str2, DialogInterface.OnClickListener onClickListener) {
        c.a[] aVarArrX = c.x(eVar, sparseIntArray);
        this.f1273a = aVarArrX;
        this.f1274b = str;
        this.f1275c = onClickListener;
        if (eVar.size() == 1) {
            onClick(null, 0);
        } else {
            f.o(f.c(Tools.k0()).setCustomTitle(Tools.h0(str2)).setAdapter(new a(MainService.context, aVarArrX), this).setNegativeButton(b2.f(catch_.me_.if_.you_.can_.R.string.cancel), (DialogInterface.OnClickListener) null));
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            int i2 = this.f1273a[i].f675a;
            if (!"0".equals(this.f1274b)) {
                c.e(0L, this.f1274b, i2);
            }
            if (dialogInterface != null) {
                Tools.D(dialogInterface);
            }
            this.f1275c.onClick(dialogInterface, i2);
        } catch (NumberFormatException e2) {
            j2.i(e2, null);
        }
    }

    public u2(a.e eVar, String str, String str2, DialogInterface.OnClickListener onClickListener) {
        this(eVar, null, str, str2, onClickListener);
    }
}
