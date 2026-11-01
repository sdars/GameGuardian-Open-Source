package android.ext;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class MultiChoiceButton extends SystemSpinner implements DialogInterface.OnMultiChoiceClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f315d;

    public MultiChoiceButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.ext.SystemSpinner
    protected void a() {
        a.e eVar = this.f477c;
        int size = eVar.size();
        CharSequence[] charSequenceArr = new CharSequence[size];
        boolean[] zArr = new boolean[size];
        this.f315d = 0;
        for (int i = 0; i < size; i++) {
            int i2 = (size - 1) - i;
            int iKeyAt = eVar.keyAt(i2);
            charSequenceArr[i] = (CharSequence) eVar.valueAt(i2);
            boolean z = (this.f475a & iKeyAt) != 0;
            zArr[i] = z;
            onClick(null, i, z);
        }
        f.o(f.c(Tools.l0(getContext())).setMultiChoiceItems(charSequenceArr, zArr, this).setNegativeButton(b2.f(2131296311), (DialogInterface.OnClickListener) null).setNeutralButton(b2.f(2131296898), this).setPositiveButton(b2.f(2131296836), this));
    }

    @Override // android.ext.SystemSpinner, android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int size = this.f477c.size();
        int i2 = 0;
        if (i == -1) {
            int iKeyAt = 0;
            while (i2 < size) {
                if ((this.f315d & (1 << i2)) != 0) {
                    iKeyAt |= this.f477c.keyAt((size - 1) - i2);
                }
                i2++;
            }
            i2 = iKeyAt;
        }
        setSelected(i2);
        Tools.D(dialogInterface);
    }

    @Override // android.ext.SystemSpinner
    public void setSelected(int i) {
        a.e eVar = this.f477c;
        if (eVar == null) {
            return;
        }
        int size = eVar.size();
        y yVar = new y();
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = (size - 1) - i2;
            if ((eVar.keyAt(i3) & i) != 0) {
                if (yVar.c() != 0) {
                    yVar.a(",");
                }
                CharSequence charSequence = (CharSequence) eVar.valueAt(i3);
                yVar.a(charSequence.subSequence(0, charSequence.toString().indexOf(58)));
            }
        }
        setText(yVar.d());
        this.f475a = i;
        DialogInterface.OnClickListener onClickListener = this.f476b;
        if (onClickListener != null) {
            onClickListener.onClick(null, i);
        }
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        int i2;
        if (z) {
            i2 = (1 << i) | this.f315d;
        } else {
            i2 = (~(1 << i)) & this.f315d;
        }
        this.f315d = i2;
    }
}
