package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class MainService$q0$b implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ MainService$q0 f292b;

    MainService$q0$b(MainService$q0 mainService$q0, d dVar) {
        this.f292b = mainService$q0;
        this.f291a = dVar;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f291a.d();
        c2 c2Var = MainService.instance.f216f;
        if (c2Var != null) {
            c2Var.write("if revert ~= nil then gg.setValues(revert) end\n");
        }
    }
}
