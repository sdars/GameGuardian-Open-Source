package android.ext;

/* JADX INFO: loaded from: classes.dex */
public class EditTextSpeeds extends android.ext.EditTextMulti {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.ext.EditTextSpeeds.a f121c;

    public interface a {
        void a(android.ext.EditText editText, int i, int i2);

        void b(android.ext.EditText editText, java.lang.CharSequence charSequence, int i, int i2, int i3);
    }

    public EditTextSpeeds(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f121c = null;
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        android.ext.EditTextSpeeds.a aVar = this.f121c;
        if (aVar != null) {
            aVar.a(this, i, i2);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        android.ext.EditTextSpeeds.a aVar = this.f121c;
        if (aVar != null) {
            aVar.b(this, charSequence, i, i2, i3);
        }
    }

    public void setOnChangedListener(android.ext.EditTextSpeeds.a aVar) {
        this.f121c = aVar;
    }
}
