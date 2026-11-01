package android.ext;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class EditTextSpeeds extends EditTextMulti {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f121c;

    public interface a {
        void a(EditText editText, int i, int i2);

        void b(EditText editText, CharSequence charSequence, int i, int i2, int i3);
    }

    public EditTextSpeeds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f121c = null;
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        a aVar = this.f121c;
        if (aVar != null) {
            aVar.a(this, i, i2);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        a aVar = this.f121c;
        if (aVar != null) {
            aVar.b(this, charSequence, i, i2, i3);
        }
    }

    public void setOnChangedListener(a aVar) {
        this.f121c = aVar;
    }
}
