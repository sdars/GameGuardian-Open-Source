/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package luaj;

import android.content.Context;
import android.ext.Tools;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PushbackInputStream;
import java.nio.channels.FileChannel;
import luaj.LuaClosure;
import luaj.LuaFunction;
import luaj.LuaTable;
import luaj.LuaThread;
import luaj.LuaValue;
import luaj.h;
import luaj.lib.BaseLib;
import luaj.lib.DebugLib;
import luaj.lib.PackageLib;
import luaj.lib.e;
import luaj.lib.f;

public class Globals
extends LuaTable {
    public boolean X = true;
    public int Y = 0;
    public e Z;
    public long a0 = 0L;
    public int b0 = 0;
    public PrintStream c0 = System.out;
    public PrintStream d0 = System.err;
    public f e0;
    public LuaThread f0 = new LuaThread(this);
    public BaseLib g0;
    public PackageLib h0;
    public DebugLib i0;
    public b j0;
    public a k0;
    public d l0;
    private String m0 = null;

    public void L3(String string2) {
        int n3;
        int n4 = this.Y;
        this.Y = n3 = n4 + 1;
        if (n3 < 1024) {
            return;
        }
        this.Y = n4;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Too many open files: ");
        stringBuilder.append(n3);
        stringBuilder.append("; last: ");
        stringBuilder.append(string2);
        throw new luaj.d(stringBuilder.toString());
    }

    public void M3(long l3) {
        long l4;
        this.a0 = l4 = this.a0 + l3;
        if (l4 < 0x40000000L) {
            return;
        }
        Context context = Tools.f0();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Too many write to files: ");
        stringBuilder.append(Tools.U(context, this.a0));
        stringBuilder.append("; last: ");
        stringBuilder.append(Tools.U(context, l3));
        throw new luaj.d(stringBuilder.toString());
    }

    public h N3(InputStream inputStream, String string2) {
        if (this.k0 == null) {
            LuaValue.R0("No compiler.");
        }
        return this.k0.b(luaj.Globals$c.b(inputStream).a(true), string2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public LuaValue O3(InputStream var1_1, String var2_6, String var3_11, LuaValue var4_13) {
        block16: {
            try {
                var3_11 = this.P3(var1_1, (String)var2_6, (String)var3_11);
                var3_11 = this.j0.a((h)var3_11, (String)var2_6, (LuaValue)var4_13);
            }
            catch (Throwable var2_7) {
                break block16;
            }
            catch (Exception var3_12) {
                ** GOTO lbl-1000
            }
            catch (EOFException var2_8) {
                ** GOTO lbl-1000
            }
            catch (luaj.d var2_9) {
                throw var2_9;
            }
            try {
                var1_1.close();
                return var3_11;
            }
            catch (IOException var1_2) {
                return var3_11;
            }
lbl-1000:
            // 1 sources

            {
                var4_13 = new StringBuilder();
                var4_13.append("load ");
                var4_13.append((String)var2_6);
                var4_13.append(": ");
                var4_13.append(var3_12);
                var2_6 = LuaValue.S0(var4_13.toString(), var3_12);
            }
            try {
                var1_1.close();
                return var2_6;
            }
            catch (IOException var1_3) {
                return var2_6;
            }
lbl-1000:
            // 1 sources

            {
                var2_10 = LuaValue.S0("truncated precompiled chunk", var2_8);
            }
            try {
                var1_1.close();
                return var2_10;
            }
            catch (IOException var1_4) {
                return var2_10;
            }
        }
        try {}
        catch (IOException var1_5) {
            throw var2_7;
        }
        var1_1.close();
        throw var2_7;
    }

    public h P3(InputStream object, String object2, String object3) {
        int n3;
        byte[] byArray;
        Object object4 = object;
        if (((String)object3).indexOf(98) >= 0) {
            if (this.l0 == null) {
                LuaValue.R0("No undumper.");
            }
            byArray = new byte[4];
            int n4 = ((InputStream)object).read(byArray);
            n3 = byArray[0];
            object4 = luaj.a.n;
            if (n3 == object4[0] && byArray[1] == object4[1] && byArray[2] == object4[2] && byArray[3] == object4[3]) {
                long l3;
                object2 = this.l0.a((InputStream)object, (String)object2);
                if (object instanceof BaseLib.b ? (object3 = ((BaseLib.b)(object = (BaseLib.b)object)).b()) instanceof FileInputStream && (l3 = ((BaseLib.b)object).a()) < ((FileInputStream)object3).getChannel().size() : object instanceof FileInputStream && (l3 = ((FileChannel)(object = ((FileInputStream)object).getChannel())).position()) < ((FileChannel)object).size()) {
                    ((h)object2).m = (int)l3;
                }
                return object2;
            }
            object4 = object;
            if (n4 > 0) {
                object4 = luaj.Globals$c.b((InputStream)object);
                ((PushbackInputStream)object4).unread(byArray, 0, n4);
            }
        }
        if (((String)object3).indexOf(116) >= 0) {
            byArray = new byte[61];
            n3 = ((InputStream)object4).read(byArray);
            object = object4;
            if (n3 > 0) {
                object = luaj.Globals$c.b((InputStream)object4);
                ((PushbackInputStream)object).unread(byArray, 0, n3);
            }
            if (new String(byArray).equals("; --[=========[ Lua assembler file generated by GameGuardian ")) {
                try {
                    object2 = new lasm.a((InputStream)object);
                    object = ((lasm.a)object2).u();
                    return object;
                }
                catch (e.d d4) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Failed assemble: ");
                    ((StringBuilder)object2).append(d4.getMessage());
                    throw new luaj.d(((StringBuilder)object2).toString(), d4);
                }
            }
            n3 = byArray[0];
            object4 = luaj.a.n;
            if (n3 == object4[0] && byArray[1] == object4[1] && byArray[2] == object4[2] && byArray[3] == object4[3]) {
                object = new StringBuilder();
                ((StringBuilder)object).append("attempt to load a binary chunk (mode is '");
                ((StringBuilder)object).append((String)object3);
                ((StringBuilder)object).append("')");
                throw new luaj.d(((StringBuilder)object).toString());
            }
            return this.N3((InputStream)object, (String)object2);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("attempt to load a text chunk (mode is '");
        ((StringBuilder)object).append((String)object3);
        ((StringBuilder)object).append("'");
        throw new luaj.d(((StringBuilder)object).toString());
    }

    public LuaValue Q3(String string2) {
        Exception exception2;
        block3: {
            Object object;
            block2: {
                try {
                    object = this.e0.u(string2);
                    String string3 = this.R3(string2).getAbsolutePath();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append('@');
                    stringBuilder.append(string3);
                    object = this.O3((InputStream)object, stringBuilder.toString(), "bt", this);
                    if (!(object instanceof LuaClosure)) break block2;
                    ((LuaClosure)object).U = string3;
                }
                catch (Exception exception2) {
                    break block3;
                }
            }
            return object;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("load ");
        stringBuilder.append(string2);
        stringBuilder.append(": ");
        stringBuilder.append(exception2);
        return LuaValue.S0(stringBuilder.toString(), exception2);
    }

    public File R3(String string2) {
        String string3 = this.m0;
        if (string3 != null && (string2.length() == 0 || string2.charAt(0) != '/')) {
            return new File(string3, string2);
        }
        return new File(string2);
    }

    public void S3() {
        int n3 = this.Y;
        if (n3 > 0) {
            this.Y = n3 - 1;
        }
    }

    public void T3(String string2) {
        this.m0 = string2;
    }

    @Override
    public Globals z0() {
        return this;
    }

    public static interface a {
        public h b(InputStream var1, String var2);
    }

    public static interface b {
        public LuaFunction a(h var1, String var2, LuaValue var3);
    }

    static class c
    extends PushbackInputStream {
        static final int b = 65;
        boolean a = false;

        private c(InputStream inputStream) {
            super(inputStream, b);
        }

        static c b(InputStream inputStream) {
            InputStream inputStream2 = inputStream;
            if (!(inputStream instanceof c)) {
                inputStream2 = new c(inputStream);
            }
            return (c)inputStream2;
        }

        public c a(boolean bl) {
            this.a = bl;
            return this;
        }

        @Override
        public int read() {
            byte[] byArray = this.buf;
            if (byArray != null) {
                int n3 = this.pos;
                if (n3 < b) {
                    this.pos = n3 + 1;
                    n3 = byArray[n3] & 0xFF;
                } else {
                    n3 = this.in.read();
                }
                int n4 = n3;
                if (n3 == 239) {
                    if (!this.a) {
                        n4 = n3;
                    } else {
                        n4 = super.read();
                        if (n4 != 187) {
                            this.unread(n4);
                            return n3;
                        }
                        int n5 = super.read();
                        if (n5 != 191) {
                            this.unread(n5);
                            this.unread(n4);
                            return n3;
                        }
                        n4 = this.read();
                    }
                }
                return n4;
            }
            throw new IOException();
        }
    }

    public static interface d {
        public h a(InputStream var1, String var2);
    }
}

