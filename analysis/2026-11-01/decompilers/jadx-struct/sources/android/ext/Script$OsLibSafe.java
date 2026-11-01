package android.ext;

import java.io.IOException;
import luaj.lib.OsLib;

/* JADX INFO: loaded from: classes.dex */
final class Script$OsLibSafe extends OsLib {
    final /* synthetic */ Script W;

    Script$OsLibSafe(Script script) {
        this.W = script;
    }

    @Override // luaj.lib.OsLib
    protected void r3(String str) throws IOException {
        if (this.W.m(str, false)) {
            return;
        }
        super.r3(str);
    }

    @Override // luaj.lib.OsLib
    protected void s3(String str, String str2) throws IOException {
        if (this.W.m(str, false) || this.W.m(str2, false)) {
            return;
        }
        super.s3(str, str2);
    }
}
