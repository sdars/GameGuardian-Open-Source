package luaj.lib;

import java.io.PrintStream;
import luaj.LuaString;

/* JADX INFO: loaded from: classes.dex */
final class IoLib$StdoutFile extends IoLib$File {
    private final int Q;
    final /* synthetic */ IoLib R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private IoLib$StdoutFile(IoLib ioLib, int i) {
        super(ioLib);
        this.R = ioLib;
        this.Q = i;
    }

    /* synthetic */ IoLib$StdoutFile(IoLib ioLib, int i, IoLib$a ioLib$a) {
        this(ioLib, i);
    }

    private final PrintStream e3() {
        return this.Q == 2 ? this.R.Y.d0 : this.R.Y.c0;
    }

    @Override // luaj.lib.IoLib$File
    public void S2() {
    }

    @Override // luaj.lib.IoLib$File
    public void U2() {
        e3().flush();
    }

    @Override // luaj.lib.IoLib$File
    public boolean V2() {
        return false;
    }

    @Override // luaj.lib.IoLib$File
    public boolean W2() {
        return true;
    }

    @Override // luaj.lib.IoLib$File
    public int X2() {
        return 0;
    }

    @Override // luaj.lib.IoLib$File
    public int Y2() {
        return 0;
    }

    @Override // luaj.lib.IoLib$File
    public int Z2(byte[] bArr, int i, int i2) {
        return 0;
    }

    @Override // luaj.lib.IoLib$File
    public int a3() {
        return 0;
    }

    @Override // luaj.lib.IoLib$File
    public int b3(String str, int i) {
        return 0;
    }

    @Override // luaj.lib.IoLib$File
    public void c3(String str, int i) {
    }

    @Override // luaj.lib.IoLib$File
    public void d3(LuaString luaString) {
        e3().write(luaString.P, luaString.Q, luaString.R);
    }

    @Override // luaj.LuaValue, luaj.Varargs
    public String g0() {
        return "file (" + hashCode() + ')';
    }
}
