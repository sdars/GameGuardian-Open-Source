package luaj.lib;

import java.io.IOException;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class IoLib$IoLibV extends VarArgFunction {
    private IoLib$File T;
    public IoLib U;
    private boolean V;
    private Varargs W;

    public IoLib$IoLibV() {
    }

    public IoLib$IoLibV(IoLib$File ioLib$File, String str, int i, IoLib ioLib) {
        this.T = ioLib$File;
        this.S = str;
        this.R = i;
        this.U = ioLib;
    }

    public IoLib$IoLibV(IoLib$File ioLib$File, String str, int i, IoLib ioLib, boolean z, Varargs varargs) {
        this(ioLib$File, str, i, ioLib);
        this.V = z;
        this.W = varargs.M();
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        StringBuilder sb;
        String str;
        String string;
        try {
            switch (this.R) {
                case 0:
                    return this.U.e3(varargs.w());
                case 1:
                    return this.U.f3();
                case 2:
                    return this.U.g3(varargs.w());
                case 3:
                    return this.U.h3(varargs);
                case 4:
                    return this.U.i3(varargs.E(1), varargs.Z(2, "r"));
                case 5:
                    return this.U.j3(varargs.w());
                case 6:
                    return this.U.k3(varargs.E(1), varargs.Z(2, "r"));
                case 7:
                    return this.U.l3(varargs);
                case 8:
                    return this.U.m3();
                case 9:
                    return this.U.n3(varargs.w());
                case 10:
                    return this.U.o3(varargs);
                case 11:
                    return this.U.X2(varargs.w());
                case 12:
                    return this.U.Y2(varargs.w());
                case 13:
                    return this.U.Z2(varargs);
                case 14:
                    return this.U.a3(varargs.w(), varargs.e0(2));
                case 15:
                    return this.U.b3(varargs.w(), varargs.Z(2, "cur"), varargs.Y(3, 0));
                case 16:
                    return this.U.c3(varargs.w(), varargs.E(2), varargs.Y(3, 8192));
                case 17:
                    return this.U.d3(varargs.w(), varargs.e0(2));
                case 18:
                    return this.U.p3(this.T, this.V, this.W);
                default:
                    return LuaValue.f1676f;
            }
        } catch (IOException e2) {
            if (this.R == 18) {
                String message = e2.getMessage();
                if (message == null) {
                    message = e2.toString();
                }
                LuaValue.S0(message, e2);
            }
            return IoLib.s3(e2, this.R);
        } catch (luaj.c e3) {
            int i = this.R;
            String[] strArr = IoLib.d0;
            if (i >= strArr.length) {
                if (i >= strArr.length + IoLib.e0.length) {
                    string = i == 18 ? "(io.lines iterator)" : e3.l;
                } else {
                    sb = new StringBuilder();
                    sb.append("file:");
                    str = strArr[this.R - strArr.length];
                }
                luaj.c cVar = new luaj.c(e3.j, string, e3.k);
                cVar.initCause(e3);
                throw cVar;
            }
            sb = new StringBuilder();
            sb.append("io.");
            str = strArr[this.R];
            sb.append(str);
            string = sb.toString();
            luaj.c cVar2 = new luaj.c(e3.j, string, e3.k);
            cVar2.initCause(e3);
            throw cVar2;
        }
    }
}
