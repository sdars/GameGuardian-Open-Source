package android.ext;

import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaTable$i;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$setValues extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$setValues(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 1;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        LuaTable luaTableI = varargs.I(1);
        MainService mainService = MainService.instance;
        z1$d z1_d = mainService.v0;
        boolean z = z1_d != null ? z1_d.n : false;
        f0 f0Var = mainService.i;
        LuaString luaString = Script.t0[1];
        LuaTable$i luaTable$iS3 = luaTableI.s3();
        while (luaTable$iS3.c()) {
            LuaTable luaTableH0 = luaTable$iS3.d().H0();
            try {
                c cVarT3 = Script.T3(null, luaTableH0, (byte) 1, z);
                int i = cVarT3.f674c & 127;
                cVarT3.f674c = i;
                if (i != 0) {
                    i2$c i2_cX = i2.x(Script.D3(Script.h3(luaTableH0, luaString)), false);
                    f0Var.a(cVarT3, i2_cX != null ? i2_cX.f1018b : 0);
                }
            } catch (NumberFormatException e2) {
                throw Script.m3(luaTable$iS3.b(), luaTableH0, e2);
            }
        }
        mainService.i.C(this.e0.t3());
        Object obj = new Object();
        synchronized (obj) {
            try {
                n2.i(new Script$setValues$1(this, obj));
                Script.W3(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return LuaValue.f1674d;
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.setValues(table values) -> true || string with error";
    }
}
