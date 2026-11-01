package android.ext;

import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import luaj.lib.IoLib;
import luaj.lib.IoLib$File;
import luaj.lib.IoLib$c;

/* JADX INFO: loaded from: classes.dex */
final class Script$IoLibSafe extends IoLib {
    private String f0 = null;
    final /* synthetic */ Script g0;

    Script$IoLibSafe(Script script) {
        this.g0 = script;
    }

    private IoLib$File R3(char c2) throws IOException {
        File file = new File(Tools.q0(), "empty.txt");
        file.createNewFile();
        IoLib$File ioLib$FileH3 = super.H3(file.getAbsolutePath(), c2);
        file.delete();
        return ioLib$FileH3;
    }

    private String S3() {
        String str = this.f0;
        if (str != null) {
            return str;
        }
        String strS3 = Script.s3(new File(Tools.q0(), "empty.txt"));
        this.f0 = strS3;
        return strS3;
    }

    @Override // luaj.lib.IoLib
    protected IoLib$File H3(String str, char c2) {
        String strS3 = Script.s3(this.Y.R3(str));
        if (this.g0.m(strS3, c2 == 'r')) {
            return R3(c2);
        }
        try {
            return super.H3(strS3, c2);
        } catch (IoLib$c unused) {
            return R3(c2);
        }
    }

    @Override // luaj.lib.IoLib
    protected boolean O3(File file, FileDescriptor fileDescriptor, boolean z) {
        if (Script.s3(file).equals(S3())) {
            return true;
        }
        return super.O3(file, fileDescriptor, z);
    }
}
