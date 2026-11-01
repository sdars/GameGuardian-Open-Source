package android.ext;

import android.content.Context;
import android.content.DialogInterface;
import android.fix.Button;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class SystemSpinner extends Button implements View.OnClickListener, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected DialogInterface.OnClickListener f476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected gga.e f477c;

    public SystemSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f477c = null;
    }

    protected void a() {
        gga.e eVar = this.f477c;
        int size = eVar.size();
        CharSequence[] charSequenceArr = new CharSequence[size];
        for (int i = 0; i < size; i++) {
            charSequenceArr[i] = (CharSequence) eVar.valueAt((size - 1) - i);
        }
        ggf.o(ggf.c(getContext()).setSingleChoiceItems(charSequenceArr, (size - 1) - eVar.indexOfKey(this.f475a), this));
    }

    public int getSelected() {
        return this.f475a;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        gga.e eVar = this.f477c;
        setSelected(eVar.keyAt((eVar.size() - 1) - i));
        Tools.D(dialogInterface);
    }

    public void setData(gga.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f477c = eVar;
        int size = eVar.size();
        if (size == 0) {
            return;
        }
        this.f475a = eVar.keyAt(size - 1);
        setOnClickListener(this);
    }

    public void setOnItemSelectedListener(DialogInterface.OnClickListener onClickListener) {
        this.f476b = onClickListener;
    }

    public void setSelected(int i) {
        gga.e eVar = this.f477c;
        if (eVar == null) {
            return;
        }
        CharSequence charSequence = (CharSequence) eVar.get(i);
        if (charSequence == null) {
            if (eVar.size() == 1) {
                charSequence = (CharSequence) eVar.valueAt(0);
                i = eVar.keyAt(0);
            } else {
                charSequence = "???";
            }
        }
        setText(charSequence);
        this.f475a = i;
        DialogInterface.OnClickListener onClickListener = this.f476b;
        if (onClickListener != null) {
            onClickListener.onClick(null, i);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        gga.e eVar = this.f477c;
        if (eVar == null || eVar.size() == 0) {
            return;
        }
        a();
    }
}
