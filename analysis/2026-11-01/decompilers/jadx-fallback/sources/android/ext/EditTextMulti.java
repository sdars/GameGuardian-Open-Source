package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class EditTextMulti extends android.ext.EditText {
    public EditTextMulti(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            int r1 = r0.getInputType()
            r2 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r2
            r0.setInputType(r1)
            r1 = 0
            r0.setHorizontallyScrolling(r1)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.setMaxLines(r1)
            return
    }

    @Override // android.widget.TextView
    public void setHorizontallyScrolling(boolean r1) {
            r0 = this;
            r1 = 0
            super.setHorizontallyScrolling(r1)
            return
    }

    @Override // android.widget.TextView
    public void setMaxLines(int r1) {
            r0 = this;
            r1 = 2147483647(0x7fffffff, float:NaN)
            super.setMaxLines(r1)
            return
    }
}
