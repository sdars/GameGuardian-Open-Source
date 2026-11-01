package android.fix;

import android.content.Context;
import android.ext.Config;
import android.ext.Tools;
import android.ext.e1;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class ToolbarButton extends ImageButtonView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1451b;

    public ToolbarButton(Context context) {
        super(context);
        this.f1450a = 0;
        this.f1451b = false;
    }

    public ToolbarButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1450a = 0;
        this.f1451b = false;
    }

    public void setIcon(int i) {
        this.f1450a = i;
        setMinimumWidth((int) Tools.G(45.0f));
        setMinimumHeight(Tools.H());
    }

    public void setIcon(boolean z) {
        if (this.f1451b != z) {
            this.f1451b = z;
            try {
                if (z) {
                    setImageResource(this.f1450a);
                    Config.o(this, (int) Tools.G(45.0f), Tools.H());
                } else {
                    setImageDrawable(null);
                }
            } catch (Throwable th) {
                e1.a(th);
            }
        }
    }

    @Override // android.view.View
    public String toString() {
        return super.toString() + " " + this.f1450a + "; " + this.f1451b;
    }
}
