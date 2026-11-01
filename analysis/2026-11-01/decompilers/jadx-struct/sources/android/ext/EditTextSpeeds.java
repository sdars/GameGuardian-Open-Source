package android.ext;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class EditTextSpeeds extends EditTextMulti {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EditTextSpeeds$a f121c;

    public EditTextSpeeds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f121c = null;
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        EditTextSpeeds$a editTextSpeeds$a = this.f121c;
        if (editTextSpeeds$a != null) {
            editTextSpeeds$a.a(this, i, i2);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        EditTextSpeeds$a editTextSpeeds$a = this.f121c;
        if (editTextSpeeds$a != null) {
            editTextSpeeds$a.b(this, charSequence, i, i2, i3);
        }
    }

    public void setOnChangedListener(EditTextSpeeds$a editTextSpeeds$a) {
        this.f121c = editTextSpeeds$a;
    }
}
