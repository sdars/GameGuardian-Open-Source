package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
class Script$ScriptThread$1 implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Script$ScriptThread f393a;

    Script$ScriptThread$1(Script$ScriptThread script$ScriptThread) {
        this.f393a = script$ScriptThread;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        File file = (File) this.f393a.f392a.U;
        if (Tools.a1(file)) {
            MainService mainService = MainService.instance;
            String absolutePath = file.getAbsolutePath();
            Script script = this.f393a.f392a;
            mainService.x(absolutePath, script.X, script.Y);
        }
    }
}
