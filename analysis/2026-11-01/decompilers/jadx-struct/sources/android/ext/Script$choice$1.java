package android.ext;

import android.app.AlertDialog;
import android.app.AlertDialog$Builder;
import catch_.me_.if_.you_.can_.R$string;
import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
class Script$choice$1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ LuaValue f407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ CharSequence[] f408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Script$choice f410e;

    Script$choice$1(Script$choice script$choice, String str, LuaValue luaValue, CharSequence[] charSequenceArr, int i) {
        this.f410e = script$choice;
        this.f406a = str;
        this.f407b = luaValue;
        this.f408c = charSequenceArr;
        this.f409d = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertDialog$Builder negativeButton = f.b().setCustomTitle(Tools.i0(Tools.N1(R$string.script), this.f406a)).setNegativeButton(b2.f(R$string.cancel), this.f410e);
        if (this.f407b.l1()) {
            negativeButton.setItems(this.f408c, this.f410e);
        } else {
            negativeButton.setSingleChoiceItems(this.f408c, this.f409d, this.f410e);
        }
        AlertDialog alertDialogCreate = negativeButton.create();
        f.k(alertDialogCreate, this.f410e);
        f.m(alertDialogCreate);
        MainService.instance.y(true);
    }
}
