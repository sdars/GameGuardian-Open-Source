package android.ext;

import java.io.Writer;
import java.util.ArrayList;
import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$getResults extends Script$BusyApiFunction {
    private byte f0;
    final /* synthetic */ Script g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Script$getResults(Script script) {
        super(script);
        this.g0 = script;
    }

    private ArrayList l3() {
        ArrayList arrayList = new ArrayList(MainService.instance.s0.i());
        Object obj = new Object();
        synchronized (obj) {
            try {
                n2.i(new Script$getResults$1(this, arrayList, obj));
                Script.W3(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 9;
    }

    @Override // android.ext.Script$ApiFunction
    protected Varargs a3() {
        int i = 1;
        this.g0.c0 = true;
        Script script = this.g0;
        byte b2 = this.f0;
        script.d0 = b2;
        ArrayList<c> arrayListS3 = Script.S3(b2);
        if (arrayListS3 == null) {
            Script script2 = this.g0;
            if (!script2.e0) {
                script2.e0 = true;
                e1.p("getResults: no reply capture for seq " + ((int) this.f0) + "; using the shared result list");
            }
            arrayListS3 = l3();
        }
        LuaTable luaTable = new LuaTable();
        luaTable.R1(arrayListS3.size());
        for (c cVar : arrayListS3) {
            if (cVar != null) {
                luaTable.Y1(i, Script.n3(null, cVar));
                i++;
            }
        }
        return luaTable;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs c3(Varargs varargs) {
        int iD = varargs.D(1);
        int iY = varargs.Y(2, 0);
        try {
            b0$a b0_aF = b0.f(varargs.a0(3, 0L), varargs.a0(4, -1L), varargs.Z(5, null), varargs.Z(6, null), varargs.Y(7, 0), varargs.Z(8, null), varargs.Y(9, 0));
            byte bT3 = this.g0.t3();
            this.f0 = bT3;
            Script.j3(bT3);
            Script script = this.g0;
            script.d0 = Script.J3(script.d0);
            b0.h(this.f0, iD, iY, b0_aF);
            return null;
        } catch (luaj.d e2) {
            throw e2;
        } catch (Throwable th) {
            return LuaValue.K2(Script.V3(th));
        }
    }

    @Override // android.ext.Script$ApiFunction
    protected boolean d3(Writer writer, int i, LuaValue luaValue) {
        if (i != 7) {
            if (i == 9 && luaValue.h1()) {
                return Script$ApiFunction.g3(writer, this.g0.g0.h, luaValue);
            }
        } else if (luaValue.h1()) {
            return Script$ApiFunction.g3(writer, this.g0.g0.f372b, luaValue);
        }
        return super.d3(writer, i, luaValue);
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.getResults(int maxCount [, int skip = 0 [, long addressMin = nil [, long addressMax = nil [, string valueMin = nil [, string valueMax = nil [, int type = nil [, string fractional = nil [, int pointer = nil]]]]]]]]) -> table || string with error";
    }
}
