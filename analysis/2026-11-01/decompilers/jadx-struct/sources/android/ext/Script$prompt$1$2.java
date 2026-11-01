package android.ext;

import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
class Script$prompt$1$2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Script$prompt$1 f431a;

    Script$prompt$1$2(Script$prompt$1 script$prompt$1) {
        this.f431a = script$prompt$1;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f431a.f427e.h0.T.U1(Tools.removeNewLinesChars("jj")).c2(Tools.removeNewLinesChars("vhdufkQxpehu"), LuaValue.f1673c);
        } catch (Throwable unused) {
        }
    }
}
