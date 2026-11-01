package android.ext;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.Writer;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$saveList extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$saveList(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 2;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs c3(Varargs varargs) {
        String strV3;
        StringBuilder sb;
        File file = new File(varargs.E(1));
        if (!file.isDirectory()) {
            if (this.e0.m(Script.s3(file), false)) {
                sb = new StringBuilder();
                sb.append("File '");
                sb.append(file.getAbsolutePath());
                sb.append("' can not be written");
            } else {
                int iY = varargs.Y(2, 0);
                MainService mainService = MainService.instance;
                try {
                    SavedListAdapter savedListAdapter = mainService.t0;
                    int count = savedListAdapter.getCount();
                    h2[] h2VarArr = new h2[count];
                    for (int i = 0; i < count; i++) {
                        h2VarArr[i] = savedListAdapter.getItem(i);
                    }
                    RandomAccessFile randomAccessFileF = luaj.lib.d.f(file, this.e0);
                    if (randomAccessFileF == null) {
                        return LuaValue.K2("File '" + file.getAbsolutePath() + "' can not be written");
                    }
                    try {
                        c1.e(new BufferedWriter(new OutputStreamWriter(new Script$saveList$1(this, randomAccessFileF)), 65536), mainService.v0.f1437f, h2VarArr, iY);
                        try {
                            randomAccessFileF.close();
                        } catch (IOException unused) {
                        }
                        return LuaValue.f1674d;
                    } catch (Throwable th) {
                        try {
                            randomAccessFileF.close();
                        } catch (IOException unused2) {
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    e1.l("Failed saved list: " + file.getAbsolutePath() + "; " + iY, th2);
                    strV3 = Script.V3(th2);
                }
            }
            return LuaValue.K2(strV3);
        }
        sb = new StringBuilder();
        sb.append("Path '");
        sb.append(file.getAbsolutePath());
        sb.append("' is a directory");
        strV3 = sb.toString();
        return LuaValue.K2(strV3);
    }

    @Override // android.ext.Script$ApiFunction
    protected boolean d3(Writer writer, int i, LuaValue luaValue) {
        return (i == 2 && luaValue.h1()) ? Script$ApiFunction.g3(writer, this.e0.g0.f376f, luaValue) : super.d3(writer, i, luaValue);
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.saveList(string file [, int flags = 0]) -> true || string with error";
    }
}
