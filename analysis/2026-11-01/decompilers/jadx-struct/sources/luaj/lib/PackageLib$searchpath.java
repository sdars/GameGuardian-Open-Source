package luaj.lib;

import java.io.IOException;
import java.io.InputStream;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
public class PackageLib$searchpath extends VarArgFunction {
    final /* synthetic */ PackageLib T;

    public PackageLib$searchpath(PackageLib packageLib) {
        this.T = packageLib;
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        String strE = varargs.E(1);
        String strE2 = varargs.E(2);
        String strZ = varargs.Z(3, ".");
        String strZ2 = varargs.Z(4, PackageLib.h0);
        int length = strE2.length();
        int i = -1;
        StringBuffer stringBuffer = null;
        if (strZ.length() > 0) {
            strE = strE.replace(strZ, strZ2);
        }
        while (i < length) {
            int i2 = i + 1;
            int iIndexOf = strE2.indexOf(59, i2);
            if (iIndexOf < 0) {
                iIndexOf = strE2.length();
            }
            String strReplace = strE2.substring(i2, iIndexOf).replace("?", strE);
            InputStream inputStreamU = this.T.T.e0.u(strReplace);
            if (inputStreamU != null) {
                try {
                    inputStreamU.close();
                } catch (IOException unused) {
                }
                return LuaValue.K2(strReplace);
            }
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            stringBuffer.append("\n\t" + strReplace);
            i = iIndexOf;
        }
        return LuaValue.N2(LuaValue.f1673c, LuaValue.K2(stringBuffer.toString()));
    }
}
