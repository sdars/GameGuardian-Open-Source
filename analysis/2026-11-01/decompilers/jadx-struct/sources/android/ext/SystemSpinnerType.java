package android.ext;

import android.R$id;
import android.R$layout;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class SystemSpinnerType extends SystemSpinner {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    c$a[] f478d;

    public SystemSpinnerType(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.ext.SystemSpinner
    protected void a() {
        this.f478d = c.x(this.f477c, null);
        int i = 0;
        int i2 = 0;
        while (true) {
            c$a[] c_aArr = this.f478d;
            if (i2 >= c_aArr.length) {
                break;
            }
            if (c_aArr[i2].f675a == this.f475a) {
                i = i2;
                break;
            }
            i2++;
        }
        f.o(f.c(Tools.l0(getContext())).setSingleChoiceItems(new SystemSpinnerType$a(this, MainService.context, R$layout.select_dialog_singlechoice, R$id.text1, this.f478d), i, this));
    }

    @Override // android.ext.SystemSpinner, android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        setSelected(this.f478d[i].f675a);
        Tools.D(dialogInterface);
    }

    @Override // android.ext.SystemSpinner
    public void setSelected(int i) {
        super.setSelected(i);
        setTextColor(c.n(i));
    }
}
