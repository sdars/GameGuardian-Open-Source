package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface$OnDismissListener;
import android.view.View;
import android.view.View$OnFocusChangeListener;
import android.widget.CheckBox;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R$id;
import java.util.ArrayList;
import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$prompt extends Script$ApiFunction implements DialogInterface$OnDismissListener, DialogInterface$OnClickListener, View$OnFocusChangeListener {
    private volatile int e0 = 0;
    private volatile LuaTable f0 = null;
    volatile ArrayList g0 = null;
    final /* synthetic */ Script h0;

    Script$prompt(Script script) {
        this.h0 = script;
    }

    private void m3(View view) {
        view.setVisibility(8);
        Tools.O0(view);
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 3;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        LuaTable luaTableI = varargs.I(1);
        LuaTable luaTableC0 = varargs.c0(2, null);
        LuaTable luaTableC1 = varargs.c0(3, null);
        this.e0 = 0;
        ArrayList arrayList = new ArrayList();
        this.g0 = arrayList;
        this.f0 = new LuaTable();
        synchronized (this) {
            try {
                n2.i(new Script$prompt$1(this, luaTableI, luaTableC0, luaTableC1, arrayList));
                Script.W3(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.g0 = null;
        LuaTable luaTable = this.f0;
        this.f0 = null;
        return this.e0 == 0 ? LuaValue.f1673c : luaTable;
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.prompt(table prompts [, table defaults = {} [, table types = {} ]]) -> nil || table with keys from prompts and values from inputs";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        LuaValue luaValue;
        if (i != -1) {
            return;
        }
        this.e0 = -i;
        ArrayList<TextView> arrayList = this.g0;
        LuaTable luaTable = this.f0;
        if (arrayList == null || luaTable == null) {
            return;
        }
        for (TextView textView : arrayList) {
            if (textView != 0 && (luaValue = (LuaValue) textView.getTag()) != null) {
                if (textView instanceof android.widget.EditText) {
                    String string = textView.getText().toString();
                    int dataType = textView instanceof k0 ? ((k0) textView).getDataType() : -1;
                    if (dataType == 1 || dataType == 8 || dataType == 16) {
                        string = Script.E3(string);
                    }
                    luaTable.d2(luaValue, LuaValue.K2(string));
                    y0.b(string, dataType);
                } else if (textView instanceof CheckBox) {
                    luaTable.d2(luaValue, LuaValue.H2(((CheckBox) textView).isChecked()));
                } else {
                    String string2 = textView.getText().toString();
                    luaTable.d2(luaValue, LuaValue.K2(string2));
                    y0.b(string2, 1);
                }
            }
        }
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View$OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        InternalKeyboard internalKeyboard;
        boolean z2 = true;
        if ((Config.B & 1) == 0 || (internalKeyboard = (InternalKeyboard) view.getRootView().findViewById(R$id.keyboard)) == null || !(view instanceof k0)) {
            return;
        }
        int dataType = ((k0) view).getDataType();
        if (dataType != 4 && dataType != 2) {
            z2 = false;
        }
        if (!z2) {
            z = false;
        }
        internalKeyboard.h(view, z);
        if (z2) {
            return;
        }
        Tools.S0(view);
    }
}
