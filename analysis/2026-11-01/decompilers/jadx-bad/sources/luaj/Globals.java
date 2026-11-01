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
import luaj.lib.BaseLib;
import luaj.lib.DebugLib;
import luaj.lib.PackageLib;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class Globals extends LuaTable {
    public luaj.lib.e Z;
    public luaj.lib.f e0;
    public BaseLib g0;
    public PackageLib h0;
    public DebugLib i0;
    public b j0;
    public a k0;
    public d l0;
    public boolean X = true;
    public int Y = 0;
    public long a0 = 0;
    public int b0 = 0;
    public PrintStream c0 = System.out;
    public PrintStream d0 = System.err;
    public LuaThread f0 = new LuaThread(this);
    private String m0 = null;

    public interface a {
        h b(InputStream inputStream, String str);
    }

    public interface b {
        LuaFunction a(h hVar, String str, LuaValue luaValue);
    }

    static class c extends PushbackInputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f1643b = 65;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f1644a;

        private c(InputStream inputStream) {
            super(inputStream, f1643b);
            this.f1644a = false;
        }

        static c b(InputStream inputStream) {
            if (!(inputStream instanceof c)) {
                inputStream = new c(inputStream);
            }
            return (c) inputStream;
        }

        public c a(boolean z) {
            this.f1644a = z;
            return this;
        }

        @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i;
            byte[] bArr = ((PushbackInputStream) this).buf;
            if (bArr == null) {
                throw new IOException();
            }
            int i2 = ((PushbackInputStream) this).pos;
            if (i2 < f1643b) {
                ((PushbackInputStream) this).pos = i2 + 1;
                i = bArr[i2] & 255;
            } else {
                i = ((PushbackInputStream) this).in.read();
            }
            if (i != 239 || !this.f1644a) {
                return i;
            }
            int i3 = super.read();
            if (i3 != 187) {
                unread(i3);
                return i;
            }
            int i4 = super.read();
            if (i4 == 191) {
                return read();
            }
            unread(i4);
            unread(i3);
            return i;
        }
    }

    public interface d {
        h a(InputStream inputStream, String str);
    }

    public void L3(String str) {
        int i = this.Y;
        int i2 = i + 1;
        this.Y = i2;
        if (i2 < 1024) {
            return;
        }
        this.Y = i;
        throw new luaj.d("Too many open files: " + i2 + "; last: " + str);
    }

    public void M3(long j) {
        long j2 = this.a0 + j;
        this.a0 = j2;
        if (j2 < 1073741824) {
            return;
        }
        Context contextF0 = Tools.f0();
        throw new luaj.d("Too many write to files: " + Tools.U(contextF0, this.a0) + "; last: " + Tools.U(contextF0, j));
    }

    public h N3(InputStream inputStream, String str) {
        if (this.k0 == null) {
            LuaValue.R0("No compiler.");
        }
        return this.k0.b(c.b(inputStream).a(true), str);
    }

    public LuaValue O3(InputStream inputStream, String str, String str2, LuaValue luaValue) {
        try {
            try {
                LuaFunction luaFunctionA = this.j0.a(P3(inputStream, str, str2), str, luaValue);
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                return luaFunctionA;
            } catch (EOFException e2) {
                LuaValue luaValueS0 = LuaValue.S0("truncated precompiled chunk", e2);
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
                return luaValueS0;
            } catch (luaj.d e3) {
                throw e3;
            } catch (Exception e4) {
                LuaValue luaValueS1 = LuaValue.S0("load " + str + ": " + e4, e4);
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
                return luaValueS1;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[PHI: r0
      0x0073: PHI (r0v15 long) = (r0v14 long), (r0v17 long) binds: [B:25:0x0071, B:20:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.io.PushbackInputStream, luaj.Globals$c] */
    /* JADX WARN: Type inference failed for: r9v0, types: [luaj.Globals] */
    public h P3(InputStream inputStream, String str, String str2) throws IOException {
        ?? r10;
        long jPosition;
        if (str2.indexOf(98) >= 0) {
            if (this.l0 == null) {
                LuaValue.R0("No undumper.");
            }
            byte[] bArr = new byte[4];
            int i = inputStream.read(bArr);
            byte b2 = bArr[0];
            byte[] bArr2 = luaj.a.n;
            if (b2 == bArr2[0] && bArr[1] == bArr2[1] && bArr[2] == bArr2[2] && bArr[3] == bArr2[3]) {
                h hVarA = this.l0.a(inputStream, str);
                if (inputStream instanceof BaseLib.b) {
                    BaseLib.b bVar = (BaseLib.b) inputStream;
                    InputStream inputStreamB = bVar.b();
                    if (inputStreamB instanceof FileInputStream) {
                        jPosition = bVar.a();
                        if (jPosition < ((FileInputStream) inputStreamB).getChannel().size()) {
                            hVarA.m = (int) jPosition;
                        }
                    }
                } else if (inputStream instanceof FileInputStream) {
                    FileChannel channel = ((FileInputStream) inputStream).getChannel();
                    jPosition = channel.position();
                    if (jPosition < channel.size()) {
                        hVarA.m = (int) jPosition;
                    }
                }
                return hVarA;
            }
            if (i > 0) {
                inputStream = c.b(inputStream);
                inputStream.unread(bArr, 0, i);
            }
        }
        if (str2.indexOf(116) < 0) {
            throw new luaj.d("attempt to load a text chunk (mode is '" + str2 + "'");
        }
        byte[] bArr3 = new byte[61];
        int i2 = inputStream.read(bArr3);
        if (i2 > 0) {
            r10 = inputStream;
            c cVarB = c.b(inputStream);
            cVarB.unread(bArr3, 0, i2);
            r10 = cVarB;
        }
        r10 = inputStream;
        if (new String(bArr3).equals("; --[=========[ Lua assembler file generated by GameGuardian ")) {
            try {
                return new lasm.a(r10).u();
            } catch (e.d e2) {
                throw new luaj.d("Failed assemble: " + e2.getMessage(), e2);
            }
        }
        byte b3 = bArr3[0];
        byte[] bArr4 = luaj.a.n;
        if (b3 != bArr4[0] || bArr3[1] != bArr4[1] || bArr3[2] != bArr4[2] || bArr3[3] != bArr4[3]) {
            return N3(r10, str);
        }
        throw new luaj.d("attempt to load a binary chunk (mode is '" + str2 + "')");
    }

    public LuaValue Q3(String str) {
        try {
            InputStream inputStreamU = this.e0.u(str);
            String absolutePath = R3(str).getAbsolutePath();
            LuaValue luaValueO3 = O3(inputStreamU, '@' + absolutePath, "bt", this);
            if (luaValueO3 instanceof LuaClosure) {
                ((LuaClosure) luaValueO3).U = absolutePath;
            }
            return luaValueO3;
        } catch (Exception e2) {
            return LuaValue.S0("load " + str + ": " + e2, e2);
        }
    }

    public File R3(String str) {
        String str2 = this.m0;
        return (str2 == null || (str.length() != 0 && str.charAt(0) == '/')) ? new File(str) : new File(str2, str);
    }

    public void S3() {
        int i = this.Y;
        if (i > 0) {
            this.Y = i - 1;
        }
    }

    public void T3(String str) {
        this.m0 = str;
    }

    @Override // luaj.LuaValue
    public Globals z0() {
        return this;
    }
}
