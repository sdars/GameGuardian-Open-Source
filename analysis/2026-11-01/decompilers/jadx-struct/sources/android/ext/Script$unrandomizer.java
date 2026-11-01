package android.ext;

import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$unrandomizer extends Script$BusyApiFunction {
    final /* synthetic */ Script f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Script$unrandomizer(Script script) {
        super(script);
        this.f0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 4;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs c3(Varargs varargs) {
        int i = (varargs.Q(1) && varargs.Q(2)) ? 0 : 2;
        if (!varargs.Q(2) || !varargs.Q(3)) {
            i |= 4;
        }
        MainService.instance.i.U0(this.f0.t3(), i, varargs.a0(1, 0L), varargs.a0(2, 0L), varargs.W(3, 0.0d), varargs.W(4, 0.0d));
        return null;
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.unrandomizer([long qword = nil [, long qincr = nil [, double double_ = nil [, double dincr = nil]]]]) -> true || string with error";
    }
}
