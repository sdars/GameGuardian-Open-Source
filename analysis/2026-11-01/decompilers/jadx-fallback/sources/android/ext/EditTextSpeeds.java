package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class EditTextSpeeds extends android.ext.EditTextMulti {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.ext.EditTextSpeeds.a f121c;

    public interface a {
        void a(android.ext.EditText r1, int r2, int r3);

        void b(android.ext.EditText r1, java.lang.CharSequence r2, int r3, int r4, int r5);
    }

    public EditTextSpeeds(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.f121c = r1
            return
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int r2, int r3) {
            r1 = this;
            super.onSelectionChanged(r2, r3)
            android.ext.EditTextSpeeds$a r0 = r1.f121c
            if (r0 == 0) goto La
            r0.a(r1, r2, r3)
        La:
            return
    }

    @Override // android.widget.TextView
    protected void onTextChanged(java.lang.CharSequence r7, int r8, int r9, int r10) {
            r6 = this;
            super.onTextChanged(r7, r8, r9, r10)
            android.ext.EditTextSpeeds$a r0 = r6.f121c
            if (r0 == 0) goto Lf
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.b(r1, r2, r3, r4, r5)
        Lf:
            return
    }

    public void setOnChangedListener(android.ext.EditTextSpeeds.a r1) {
            r0 = this;
            r0.f121c = r1
            return
    }
}
