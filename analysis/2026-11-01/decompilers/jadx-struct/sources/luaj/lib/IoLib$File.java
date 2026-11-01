package luaj.lib;

import java.io.EOFException;
import java.io.IOException;
import luaj.LuaString;
import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
protected abstract class IoLib$File extends LuaValue {
    final /* synthetic */ IoLib P;

    protected IoLib$File(IoLib ioLib) {
        this.P = ioLib;
    }

    @Override // luaj.LuaValue
    public int C2() {
        return 7;
    }

    @Override // luaj.LuaValue
    public String D2() {
        return "userdata";
    }

    public abstract void S2();

    public boolean T2() {
        try {
            return X2() < 0;
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // luaj.LuaValue
    public LuaValue U0(LuaValue luaValue) {
        return this.P.X.U0(luaValue);
    }

    public abstract void U2();

    @Override // luaj.LuaValue
    public LuaValue V0() {
        return this.P.X;
    }

    public abstract boolean V2();

    public abstract boolean W2();

    public abstract int X2();

    public abstract int Y2();

    public abstract int Z2(byte[] bArr, int i, int i2);

    public abstract int a3();

    public abstract int b3(String str, int i);

    public abstract void c3(String str, int i);

    public abstract void d3(LuaString luaString);

    public void finalize() {
        if (V2()) {
            return;
        }
        try {
            S2();
        } catch (IOException unused) {
        }
    }
}
