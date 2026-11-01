package android.ext;

/* JADX INFO: loaded from: classes.dex */
public class SystemSpinnerType extends android.ext.SystemSpinner {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    android.ext.c.a[] f478d;

    class a extends android.ext.ArrayAdapter {
        a(android.content.Context context, int i, int i2, android.ext.c.a[] aVarArr) {
            super(context, i, i2, aVarArr);
        }

        @Override // android.ext.ArrayAdapter, android.widget.ArrayAdapter, android.widget.Adapter
        public android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
            android.ext.c.a aVar;
            android.view.View view2 = super.getView(i, view, viewGroup);
            android.widget.TextView textView = (android.widget.TextView) view2.findViewById(android.R.id.text1);
            if (textView != null) {
                android.ext.Tools.D1(textView, catch_.me_.if_.you_.can_.R.style.SmallText);
                if (i > 0) {
                    android.ext.c.a[] aVarArr = android.ext.SystemSpinnerType.this.f478d;
                    if (i < aVarArr.length && (aVar = aVarArr[i]) != null) {
                        textView.setTextColor(android.ext.c.n(aVar.f675a));
                    }
                }
            }
            return view2;
        }
    }

    public SystemSpinnerType(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.ext.SystemSpinner
    protected void a() {
        this.f478d = android.ext.c.x(this.f477c, null);
        int i = 0;
        int i2 = 0;
        while (true) {
            android.ext.c.a[] aVarArr = this.f478d;
            if (i2 >= aVarArr.length) {
                break;
            }
            if (aVarArr[i2].f675a == this.f475a) {
                i = i2;
                break;
            }
            i2++;
        }
        android.ext.f.o(android.ext.f.c(android.ext.Tools.l0(getContext())).setSingleChoiceItems(new android.ext.SystemSpinnerType.a(android.ext.MainService.context, android.R.layout.select_dialog_singlechoice, android.R.id.text1, this.f478d), i, this));
    }

    @Override // android.ext.SystemSpinner, android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i) {
        setSelected(this.f478d[i].f675a);
        android.ext.Tools.D(dialogInterface);
    }

    @Override // android.ext.SystemSpinner
    public void setSelected(int i) {
        super.setSelected(i);
        setTextColor(android.ext.c.n(i));
    }
}
