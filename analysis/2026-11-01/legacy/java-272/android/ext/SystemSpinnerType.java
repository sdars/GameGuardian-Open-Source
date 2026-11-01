package android.ext;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class SystemSpinnerType extends SystemSpinner {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    c.a[] f478d;

    class a extends ArrayAdapter {
        a(Context context, int i, int i2, c.a[] aVarArr) {
            super(context, i, i2, aVarArr);
        }

        @Override // android.ext.ArrayAdapter, android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            c.a aVar;
            View view2 = super.getView(i, view, viewGroup);
            TextView textView = (TextView) view2.findViewById(R.id.text1);
            if (textView != null) {
                Tools.D1(textView, catch_.me_.if_.you_.can_.R.style.SmallText);
                if (i > 0) {
                    c.a[] aVarArr = SystemSpinnerType.this.f478d;
                    if (i < aVarArr.length && (aVar = aVarArr[i]) != null) {
                        textView.setTextColor(c.n(aVar.f675a));
                    }
                }
            }
            return view2;
        }
    }

    public SystemSpinnerType(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.ext.SystemSpinner
    protected void a() {
        this.f478d = c.x(this.f477c, null);
        int i = 0;
        int i2 = 0;
        while (true) {
            c.a[] aVarArr = this.f478d;
            if (i2 >= aVarArr.length) {
                break;
            }
            if (aVarArr[i2].f675a == this.f475a) {
                i = i2;
                break;
            }
            i2++;
        }
        f.o(f.c(Tools.l0(getContext())).setSingleChoiceItems(new a(MainService.context, R.layout.select_dialog_singlechoice, R.id.text1, this.f478d), i, this));
    }

    @Override // android.ext.SystemSpinner, android.content.DialogInterface.OnClickListener
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
