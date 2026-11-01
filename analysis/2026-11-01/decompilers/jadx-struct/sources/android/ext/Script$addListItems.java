package android.ext;

import java.util.ArrayList;
import luaj.LuaTable;
import luaj.LuaTable$i;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$addListItems extends Script$ApiFunction {
    final ArrayList e0 = new ArrayList();
    LuaValue f0 = null;
    final /* synthetic */ Script g0;

    Script$addListItems(Script script) {
        this.g0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 1;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        Varargs varargsK2;
        ArrayList arrayList = this.e0;
        try {
            try {
                arrayList.clear();
                LuaTable luaTableI = varargs.I(1);
                z1$d z1_d = MainService.instance.v0;
                boolean z = z1_d != null ? z1_d.n : false;
                LuaTable$i luaTable$iS3 = luaTableI.s3();
                while (luaTable$iS3.c()) {
                    LuaValue luaValueD = luaTable$iS3.d();
                    try {
                        h2 h2VarU3 = Script.U3(luaValueD.H0(), z);
                        if (h2VarU3 != null) {
                            arrayList.add(h2VarU3);
                        }
                    } catch (NumberFormatException e2) {
                        e = e2;
                        throw Script.m3(luaTable$iS3.b(), luaValueD, e);
                    } catch (luaj.d e3) {
                        e = e3;
                        throw Script.m3(luaTable$iS3.b(), luaValueD, e);
                    }
                }
                this.f0 = null;
                Object obj = new Object();
                synchronized (obj) {
                    try {
                        n2.i(new Script$addListItems$1(this, obj));
                        Script.W3(obj);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                varargsK2 = this.f0;
            } catch (Throwable th2) {
                e1.l("Failed add list items", th2);
                varargsK2 = LuaValue.K2(Script.V3(th2));
            }
            try {
                arrayList.clear();
                arrayList.trimToSize();
            } catch (Throwable th3) {
                e1.a(th3);
            }
            this.f0 = null;
            return varargsK2;
        } catch (luaj.d e4) {
            throw e4;
        }
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.addListItems(table items) -> true || string with error";
    }
}
