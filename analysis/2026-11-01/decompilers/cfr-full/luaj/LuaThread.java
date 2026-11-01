/*
 * Decompiled with CFR 0.152.
 */
package luaj;

import luaj.Globals;
import luaj.LuaFunction;
import luaj.LuaValue;
import luaj.Varargs;

public class LuaThread
extends LuaValue {
    public static LuaValue T;
    public static final String[] U;
    public final a P;
    public Object Q;
    public final Globals R;
    public LuaValue S;

    static {
        U = new String[]{"suspended", "suspended", "running", "normal", "dead"};
    }

    public LuaThread(Globals globals) {
        a a4;
        this.P = a4 = new a(globals, this, null);
        a4.o = 2;
        this.R = globals;
    }

    @Override
    public int C2() {
        return 8;
    }

    @Override
    public String D2() {
        return "thread";
    }

    @Override
    public LuaThread I0() {
        return this;
    }

    @Override
    public LuaValue V0() {
        return T;
    }

    @Override
    public boolean p1() {
        return true;
    }

    public static class a
    implements Runnable {
        private final Globals a;
        public final LuaValue b;
        Varargs c;
        Varargs d;
        String e;
        public LuaFunction f;
        public boolean g;
        public boolean h;
        public boolean i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;

        a(Globals globals, LuaThread luaValue, LuaValue luaValue2) {
            luaValue = LuaValue.f;
            this.c = luaValue;
            this.d = luaValue;
            this.e = null;
            this.o = 0;
            this.a = globals;
            this.b = luaValue2;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void run() {
            synchronized (this) {
                block9: {
                    var1_1 = this.c;
                    this.c = LuaValue.f;
                    this.d = this.b.invoke(var1_1);
                    {
                        catch (Throwable var1_3) {}
                        this.e = var1_3.getMessage();
                        {
                            catch (Throwable var1_4) {
                                this.o = 4;
                                this.notify();
                                throw var1_4;
                            }
                            this.o = 4;
                            ** continue;
                        }
                    }
                    this.o = 4;
lbl18:
                    // 2 sources

                    while (true) {
                        this.notify();
                        ** GOTO lbl23
                        break;
                    }
                    {
                        catch (Throwable var1_2) {
                            break block9;
                        }
                    }
lbl23:
                    // 1 sources

                    return;
                }
                throw var1_2;
            }
        }
    }
}

