package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnMultiChoiceClickListener;
import java.util.ArrayList;
import luaj.LuaTable;
import luaj.LuaTable$i;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$multiChoice extends Script$ApiFunction implements DialogInterface$OnDismissListener, DialogInterface$OnClickListener, DialogInterface$OnMultiChoiceClickListener {
    volatile boolean[] e0;
    private volatile boolean f0;

    Script$multiChoice() {
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 3;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        int i;
        LuaTable luaTableI = varargs.I(1);
        LuaTable luaTableC0 = varargs.c0(2, null);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        LuaTable$i luaTable$iS3 = luaTableI.s3();
        while (true) {
            z = false;
            boolean z = false;
            if (!luaTable$iS3.c()) {
                break;
            }
            LuaValue luaValueB = luaTable$iS3.b();
            arrayList2.add(b2.g(luaTable$iS3.d().B0()));
            if (luaTableC0 != null && Script.G3(luaTableC0, luaValueB, false)) {
                z = true;
            }
            arrayList3.add(Boolean.valueOf(z));
            arrayList.add(luaValueB);
        }
        this.e0 = Tools.k(arrayList3);
        this.f0 = false;
        String strG = b2.g(varargs.Z(3, ""));
        String str = strG.length() > 0 ? '\n' + strG : null;
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList2.size()]);
        synchronized (this) {
            try {
                n2.i(new Script$multiChoice$1(this, str, charSequenceArr));
                Script.W3(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!this.f0) {
            return LuaValue.f1673c;
        }
        LuaTable luaTable = new LuaTable();
        for (i = 0; i < arrayList.size(); i++) {
            if (this.e0[i]) {
                luaTable.d2((LuaValue) arrayList.get(i), LuaValue.f1674d);
            }
        }
        return luaTable;
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.multiChoice(table items [, table selection = {} [, string message = nil]]) -> table || nil";
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            this.f0 = true;
        }
    }

    @Override // android.content.DialogInterface$OnMultiChoiceClickListener
    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.e0[i] = z;
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
