package luaj.lib;

import android.ext.e1;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import luaj.Globals;
import luaj.LuaClosure;
import luaj.LuaFunction;
import luaj.LuaString;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
public class BaseLib extends TwoArgFunction implements f {
    Globals T;
    private BaseLib$c U = null;
    byte[] V = null;

    static LuaString d3(LuaValue luaValue) {
        LuaValue luaValueX1 = luaValue.x1(LuaValue.B);
        if (luaValueX1.l1()) {
            LuaValue luaValueB2 = luaValue.B2();
            return !luaValueB2.l1() ? luaValueB2.G0() : LuaValue.K2(luaValue.g0());
        }
        LuaValue luaValueCall = luaValueX1.call(luaValue);
        LuaValue luaValueB3 = luaValueCall.B2();
        if (!luaValueB3.l1()) {
            return luaValueB3.G0();
        }
        throw new luaj.d("'__tostring' must return a string, got '" + luaValueCall.D2() + "' ('" + luaValueCall + "')");
    }

    InputStream Y2(LuaString luaString, String str, boolean z, InputStream inputStream) {
        BaseLib$c baseLib$c = this.U;
        if (baseLib$c != null) {
            if (z) {
                if (str != null) {
                    try {
                        byte[] bArr = this.V;
                        if (bArr == null) {
                            bArr = new byte[8192];
                            this.V = bArr;
                        }
                        FileDescriptor fileDescriptorOpen = Os.open(str, OsConstants.O_RDONLY, 438);
                        int i = 0;
                        while (true) {
                            int i2 = Os.read(fileDescriptorOpen, bArr, 0, bArr.length);
                            if (i2 <= 0) {
                                break;
                            }
                            baseLib$c.f1739b.write(bArr, 0, i2);
                            i += i2;
                        }
                        Os.close(fileDescriptorOpen);
                        if (i > 0) {
                            baseLib$c.f1741d.writeInt(i);
                        }
                    } catch (Throwable th) {
                        e1.g("Failed write log file from " + str, th);
                    }
                }
            } else {
                if (luaString == null) {
                    return new BaseLib$a(this, inputStream, baseLib$c);
                }
                try {
                    int i3 = luaString.R;
                    if (i3 > 0) {
                        baseLib$c.f1739b.write(luaString.P, luaString.Q, i3);
                        baseLib$c.f1741d.writeInt(i3);
                    }
                } catch (Throwable th2) {
                    e1.s("Failed write log file", th2);
                }
            }
        }
        return inputStream;
    }

    public void Z2() {
        BaseLib$c baseLib$c = this.U;
        if (baseLib$c != null) {
            baseLib$c.a();
        }
    }

    public Varargs a3(String str, String str2, LuaValue luaValue) {
        InputStream inputStreamU = this.T.e0.u(str);
        if (inputStreamU == null) {
            return LuaValue.N2(LuaValue.f1673c, LuaValue.K2("cannot open " + str + ": No such file or directory"));
        }
        try {
            String absolutePath = this.T.R3(str).getAbsolutePath();
            Varargs varargsB3 = b3(inputStreamU, '@' + absolutePath, str2, luaValue);
            if (varargsB3 instanceof LuaClosure) {
                ((LuaClosure) varargsB3).U = absolutePath;
            }
            if (this.U != null && (varargsB3 instanceof LuaFunction)) {
                Y2(null, str, true, null);
            }
            try {
                inputStreamU.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return varargsB3;
        } catch (Throwable th) {
            try {
                String message = th.getMessage();
                if (message == null) {
                    message = th.getClass().getName();
                }
                Varargs varargsN2 = LuaValue.N2(LuaValue.f1673c, LuaValue.K2(message));
                try {
                    inputStreamU.close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                return varargsN2;
            } catch (Throwable th2) {
                try {
                    inputStreamU.close();
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                throw th2;
            }
        }
    }

    public Varargs b3(InputStream inputStream, String str, String str2, LuaValue luaValue) {
        try {
            if (inputStream != null) {
                return this.T.O3(inputStream, str, str2, luaValue);
            }
            return LuaValue.N2(LuaValue.f1673c, LuaValue.K2("not found: " + str));
        } catch (Exception e2) {
            return LuaValue.N2(LuaValue.f1673c, LuaValue.K2(e2.getMessage()));
        }
    }

    public void c3(String str) {
        try {
            this.U = new BaseLib$c(this, str);
        } catch (Throwable th) {
            e1.g("Failed prepare log loads for " + str, th);
        }
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        Globals globalsZ0 = luaValue2.z0();
        this.T = globalsZ0;
        globalsZ0.e0 = this;
        globalsZ0.g0 = this;
        if (globalsZ0.X) {
            luaValue2.i2("_G", luaValue2);
            luaValue2.h2("_VERSION", "Lua 5.3 (with Luaj 3.0.1)");
            luaValue2.i2("assert", new BaseLib$_assert());
            luaValue2.i2("assert2", new BaseLib$assert2());
            luaValue2.i2("collectgarbage", new BaseLib$collectgarbage());
            luaValue2.i2("dofile", new BaseLib$dofile(this));
            luaValue2.i2("error", new BaseLib$error());
            luaValue2.i2("getmetatable", new BaseLib$getmetatable());
            luaValue2.i2("load", new BaseLib$load(this));
            luaValue2.i2("loadfile", new BaseLib$loadfile(this));
            luaValue2.i2("pcall", new BaseLib$pcall(this));
            luaValue2.i2("print", new BaseLib$print(this, this));
        }
        luaValue2.i2("rawequal", new BaseLib$rawequal());
        luaValue2.i2("rawget", new BaseLib$rawget());
        luaValue2.i2("rawlen", new BaseLib$rawlen());
        luaValue2.i2("rawset", new BaseLib$rawset());
        luaValue2.i2("select", new BaseLib$select());
        if (globalsZ0.X) {
            luaValue2.i2("setmetatable", new BaseLib$setmetatable());
        }
        luaValue2.i2("tonumber", new BaseLib$tonumber());
        luaValue2.i2("tostring", new BaseLib$tostring());
        luaValue2.i2("type", new BaseLib$type());
        if (globalsZ0.X) {
            luaValue2.i2("xpcall", new BaseLib$xpcall(this));
        }
        BaseLib$next baseLib$next = new BaseLib$next();
        luaValue2.i2("next", baseLib$next);
        luaValue2.i2("pairs", new BaseLib$pairs(baseLib$next));
        luaValue2.i2("ipairs", new BaseLib$ipairs());
        return luaValue2;
    }

    @Override // luaj.lib.f
    public InputStream u(String str) {
        File fileR3 = this.T.R3(str);
        e eVar = this.T.Z;
        if (eVar == null) {
            try {
                return new BaseLib$b(new FileInputStream(fileR3));
            } catch (IOException unused) {
                return null;
            }
        }
        try {
            FileInputStream fileInputStreamE = d.e(fileR3, eVar);
            if (fileInputStreamE == null) {
                return null;
            }
            return new BaseLib$b(fileInputStreamE);
        } catch (IOException unused2) {
            return null;
        }
    }
}
