package android.ext;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$setVisible extends Script$ApiFunction {
    private int e0 = 0;
    private long f0 = 0;
    final /* synthetic */ Script g0;

    Script$setVisible(Script script) {
        this.g0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    @Override // android.ext.Script$ApiFunction
    public Varargs c3(Varargs varargs) {
        boolean z;
        long jNanoTime;
        int i;
        MainService mainService = MainService.instance;
        if (!varargs.z(1)) {
            if (mainService.n != null) {
                mainService.u(false);
                z = true;
            } else {
                z = false;
            }
            mainService.h0.g();
            if (z) {
                jNanoTime = System.nanoTime() / 60000000000L;
                if (jNanoTime != this.f0) {
                    this.f0 = jNanoTime;
                    this.e0 = 0;
                }
                i = this.e0 + 1;
                this.e0 = i;
                if (i > 30) {
                    this.g0.x3(2);
                }
            }
        } else if (mainService.n == null) {
            mainService.c0();
            jNanoTime = System.nanoTime() / 60000000000L;
            if (jNanoTime != this.f0) {
                this.f0 = jNanoTime;
                this.e0 = 0;
            }
            i = this.e0 + 1;
            this.e0 = i;
            if (i > 30) {
                this.g0.x3(2);
            }
        }
        return LuaValue.f1673c;
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.setVisible(bool visible) -> nil";
    }
}
