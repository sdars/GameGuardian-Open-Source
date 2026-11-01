package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface$OnDismissListener;
import catch_.me_.if_.you_.can_.R$string;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$alert extends Script$ApiFunction implements DialogInterface$OnDismissListener, DialogInterface$OnClickListener {
    private volatile int e0 = 0;

    Script$alert() {
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 4;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        String strE = varargs.E(1);
        String strZ = varargs.Z(2, b2.f(R$string.ok));
        String strZ2 = varargs.Z(3, null);
        String strZ3 = varargs.Z(4, null);
        this.e0 = 0;
        synchronized (this) {
            try {
                n2.i(new Script$alert$1(this, strE, strZ, strZ2, strZ3));
                Script.W3(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        return LuaValue.I2(this.e0);
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.alert(string text [, string positive = 'ok' [, string negative = nil [, string neutral = nil]]]) -> int: 0 = cancel, 1 = positive, 2 = negative, 3 = neutral";
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.e0 = -i;
    }

    @Override // android.content.DialogInterface$OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        synchronized (this) {
            try {
                notify();
            } catch (Throwable th) {
                throw th;
            }
        }
        MainService.instance.y(false);
    }
}
