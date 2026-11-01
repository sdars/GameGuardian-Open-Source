package android.ext;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$loadList extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$loadList(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 2;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs c3(Varargs varargs) {
        StringBuilder sb;
        String strV3;
        String str;
        File file = new File(varargs.E(1));
        if (file.exists()) {
            if (!file.isFile()) {
                sb = new StringBuilder();
                sb.append("Path '");
                sb.append(file.getAbsolutePath());
                str = "' is not a file";
            } else if (!file.canRead() || this.e0.m(Script.s3(file), true)) {
                sb = new StringBuilder();
                sb.append("File '");
                sb.append(file.getAbsolutePath());
                sb.append("' can not be read");
                strV3 = sb.toString();
            } else {
                int iY = varargs.Y(2, 0);
                try {
                    FileInputStream fileInputStreamE = luaj.lib.d.e(file, this.e0);
                    if (fileInputStreamE == null) {
                        return LuaValue.K2("File '" + file.getAbsolutePath() + "' can not be read");
                    }
                    try {
                        c1.c(new BufferedReader(new InputStreamReader(fileInputStreamE)), MainService.instance.v0.f1437f, iY | 4);
                        fileInputStreamE.close();
                        return LuaValue.f1674d;
                    } catch (Throwable th) {
                        fileInputStreamE.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    e1.l("Failed load list: " + file.getAbsolutePath() + "; " + iY, th2);
                    strV3 = Script.V3(th2);
                }
            }
            return LuaValue.K2(strV3);
        }
        sb = new StringBuilder();
        sb.append("File '");
        sb.append(file.getAbsolutePath());
        str = "' not found";
        sb.append(str);
        strV3 = sb.toString();
        return LuaValue.K2(strV3);
    }

    @Override // android.ext.Script$ApiFunction
    protected boolean d3(Writer writer, int i, LuaValue luaValue) {
        return (i == 2 && luaValue.h1()) ? Script$ApiFunction.g3(writer, this.e0.g0.f375e, luaValue) : super.d3(writer, i, luaValue);
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.loadList(string file [, int flags = 0]) -> true || string with error";
    }
}
