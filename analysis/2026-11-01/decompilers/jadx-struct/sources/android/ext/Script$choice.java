package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface$OnDismissListener;
import java.util.ArrayList;
import luaj.LuaTable;
import luaj.LuaTable$i;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$choice extends Script$ApiFunction implements DialogInterface$OnDismissListener, DialogInterface$OnClickListener {
    private volatile int e0 = 0;

    Script$choice() {
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 3;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        String str;
        LuaTable luaTableI = varargs.I(1);
        LuaValue luaValueV = varargs.v(2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LuaTable$i luaTable$iS3 = luaTableI.s3();
        int i = 0;
        int i2 = -1;
        while (luaTable$iS3.c()) {
            LuaValue luaValueB = luaTable$iS3.b();
            LuaValue luaValueD = luaTable$iS3.d();
            if (luaValueB.P0(luaValueV)) {
                i2 = i;
            }
            arrayList2.add(b2.g(luaValueD.B0()));
            arrayList.add(luaValueB);
            i++;
        }
        String strG = b2.g(varargs.Z(3, ""));
        if (strG.length() > 0) {
            str = '\n' + strG;
        } else {
            str = null;
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList2.size()]);
        this.e0 = -1;
        synchronized (this) {
            try {
                n2.i(new Script$choice$1(this, str, luaValueV, charSequenceArr, i2));
                Script.W3(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.e0 < 0 ? LuaValue.f1673c : (Varargs) arrayList.get(this.e0);
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.choice(table items [, string selected = nil [, string message = nil]]) -> string || nil";
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.e0 = i;
        Tools.D(dialogInterface);
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
