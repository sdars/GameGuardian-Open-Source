/*
 * Decompiled with CFR 0.152.
 */
package luaj.lib;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import luaj.Globals;
import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;
import luaj.lib.VarArgFunction;
import luaj.lib.d;

public final class GgLib$saveVariable
extends VarArgFunction {
    static final String[] Y = new String[]{"address", "value", "flags", "name", "freeze", "freezeType", "freezeFrom", "freezeTo"};
    final Globals T;
    Writer U;
    Map V;
    List W;
    final Integer X = 0;

    public GgLib$saveVariable(Globals globals) {
        this.T = globals;
    }

    private void X2(LuaTable luaValue) {
        if (this.V.put(luaValue, this.X) == null && luaValue instanceof LuaTable) {
            LuaTable.i i3 = luaValue.s3();
            while (i3.c()) {
                for (int i4 = 0; i4 < 2; ++i4) {
                    luaValue = i4 == 0 ? i3.b() : i3.d();
                    if (!(luaValue instanceof LuaTable)) continue;
                    this.X2((LuaTable)luaValue);
                }
            }
        }
    }

    private void Y2() {
        String[] stringArray = Y;
        Writer writer = this.U;
        Object object = this.W;
        Map map = this.V;
        Iterator iterator = object.iterator();
        int n3 = 0;
        block0: while (iterator.hasNext()) {
            object = (LuaTable)iterator.next();
            int n4 = 1;
            int n5 = n3 + 1;
            LuaTable.i i3 = ((LuaTable)object).s3();
            while (true) {
                n3 = n5;
                if (!i3.c()) continue block0;
                int n6 = i3.a();
                LuaValue luaValue = i3.d();
                if (!(luaValue instanceof LuaTable)) {
                    if (n6 != 0) continue;
                    LuaValue luaValue2 = i3.b();
                    object = luaValue2;
                    if (!(luaValue2 instanceof LuaTable)) {
                        continue;
                    }
                } else {
                    object = n6 != 0 ? null : i3.b();
                }
                n3 = n4;
                if (n4 != 0) {
                    writer.write("\nt=v[");
                    writer.write(Integer.toString(n5));
                    writer.write(93);
                    n3 = 0;
                }
                writer.write("\nt[");
                if (object == null) {
                    writer.write(Integer.toString(n6));
                } else {
                    this.a3(writer, stringArray, map, (LuaValue)object);
                }
                writer.write("]=");
                this.a3(writer, stringArray, map, luaValue);
                n4 = n3;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void Z2() {
        var6_1 = GgLib$saveVariable.Y;
        this.U.write("local ");
        var3_2 = var6_1.length;
        var2_3 = 0;
        for (var1_4 = 0; var1_4 < var3_2; ++var1_4) {
            this.U.write((char)(var1_4 + 97));
            this.U.write(44);
        }
        this.U.write("v,t=");
        var3_2 = var6_1.length;
        for (var1_4 = 0; var1_4 < var3_2; ++var1_4) {
            this.U.write(39);
            this.U.write(var6_1[var1_4]);
            this.U.write("',");
        }
        this.U.write("nil\nv={");
        var5_5 = this.U;
        var4_6 = this.V;
        var7_7 = this.W.iterator();
        var1_4 = var2_3;
        while (var7_7.hasNext()) {
            var8_8 = (LuaTable)var7_7.next();
            var3_2 = 1;
            var2_3 = var1_4 + 1;
            var4_6.put(var8_8, var2_3);
            var5_5.write("{");
            var8_8 = var8_8.s3();
            var1_4 = var3_2;
            while (var8_8.c()) {
                var3_2 = var8_8.a();
                if (var3_2 == 0) {
                    var9_9 = var8_8.b();
                    if (var9_9 instanceof LuaTable) continue;
                    var5_5.write("[");
                    this.a3(var5_5, var6_1, var4_6, var9_9);
lbl37:
                    // 2 sources

                    while (true) {
                        var5_5.write("]=");
                        break;
                    }
                } else {
                    if (var3_2 != var1_4) {
                        var5_5.write("[");
                        var5_5.write(Integer.toString(var3_2));
                        ** continue;
                    }
                    ++var1_4;
                }
                var9_9 = var8_8.d();
                if (var9_9 instanceof LuaTable) {
                    var5_5.write("nil");
                } else {
                    this.a3(var5_5, var6_1, var4_6, var9_9);
                }
                var5_5.write(";");
            }
            var5_5.write("};");
            var1_4 = var2_3;
        }
        var5_5.write("}");
    }

    private void a3(Writer writer, String[] stringArray, Map object, LuaValue luaValue) {
        if (luaValue instanceof LuaTable) {
            writer.write("v[");
            writer.write(Integer.toString((Integer)object.get(luaValue)));
            writer.write(93);
        } else if (luaValue instanceof LuaString) {
            object = luaValue.g0();
            int n3 = stringArray.length;
            for (int i3 = 0; i3 < n3; ++i3) {
                if (!((String)object).equals(stringArray[i3])) continue;
                writer.write(i3 + 97);
                return;
            }
            this.b3(writer, (String)object);
        } else {
            writer.write(luaValue.g0());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private Appendable b3(Appendable appendable, String string2) {
        Appendable appendable2 = appendable;
        if (appendable == null) {
            appendable2 = new StringBuilder();
        }
        appendable2.append('\'');
        int n3 = string2.length();
        int n4 = 0;
        while (true) {
            int n5;
            block13: {
                block12: {
                    int n6;
                    if (n4 >= n3) {
                        appendable2.append('\'');
                        return appendable2;
                    }
                    n5 = n6 = string2.charAt(n4);
                    if (n6 == 39) break block12;
                    n5 = n6;
                    if (n6 == 92) break block12;
                    switch (n6) {
                        default: {
                            n5 = n6;
                            break block13;
                        }
                        case 13: {
                            n5 = 114;
                            break;
                        }
                        case 12: {
                            n5 = 102;
                            break;
                        }
                        case 11: {
                            n5 = 118;
                            break;
                        }
                        case 10: {
                            n5 = 110;
                            break;
                        }
                        case 9: {
                            n5 = 116;
                            break;
                        }
                        case 8: {
                            n5 = 98;
                            break;
                        }
                        case 7: {
                            n5 = 97;
                        }
                    }
                }
                appendable2.append('\\');
            }
            appendable2.append((char)n5);
            ++n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void c3(LuaValue luaValue, RandomAccessFile serializable) {
        Throwable throwable2;
        block6: {
            BufferedWriter bufferedWriter;
            block5: {
                block4: {
                    try {
                        a a4 = new a(this, (RandomAccessFile)((Object)serializable));
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(a4);
                        bufferedWriter = new BufferedWriter(outputStreamWriter, 65536);
                        this.U = bufferedWriter;
                        if (!(luaValue instanceof LuaTable)) break block4;
                        serializable = new HashMap();
                        this.V = serializable;
                        this.X2((LuaTable)luaValue);
                        serializable = new ArrayList(this.V.keySet());
                        this.W = serializable;
                        this.Z2();
                        this.Y2();
                        serializable = new StringBuilder();
                        ((StringBuilder)serializable).append("\nreturn v[");
                        ((StringBuilder)serializable).append(this.V.get(luaValue));
                        ((StringBuilder)serializable).append("]\n");
                        bufferedWriter.write(((StringBuilder)serializable).toString());
                        this.V = null;
                        break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                boolean bl = luaValue instanceof LuaString;
                if (bl) {
                    bufferedWriter.write("return ");
                    this.b3(bufferedWriter, luaValue.g0());
                } else {
                    bufferedWriter.write("return ");
                    bufferedWriter.write(luaValue.g0());
                }
                ((Writer)bufferedWriter).write(10);
            }
            ((Writer)bufferedWriter).close();
            this.U = null;
            this.V = null;
            this.W = null;
            return;
        }
        this.U = null;
        this.V = null;
        this.W = null;
        throw throwable2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public Varargs invoke(Varargs var1_1) {
        block16: {
            block15: {
                var3_6 = var1_1.v(1);
                var2_7 = var1_1.E(2);
                this.T.L3(var2_7);
                try {
                    var1_1 = new File(var2_7);
                    var1_1 = luaj.lib.d.f((File)var1_1, this.T.Z);
                    if (var1_1 != null) break block15;
                }
                catch (IOException var1_2) {}
                this.T.S3();
                var1_1 = new StringBuilder();
                var1_1.append("File '");
                var1_1.append(var2_7);
                var1_1.append("' can not be written");
                var1_1 = LuaValue.K2(var1_1.toString());
                return var1_1;
                break block16;
            }
            this.c3(var3_6, (RandomAccessFile)var1_1);
            try {
                var1_1.close();
lbl26:
                // 2 sources

                while (true) {
                    this.T.S3();
                    return LuaValue.c;
                }
            }
            catch (IOException var1_3) {
                ** continue;
            }
            catch (Throwable var2_8) {
                var2_9 = LuaValue.K2(var2_8.toString());
                return var2_9;
            }
        }
        this.T.S3();
        return LuaValue.K2(var1_2.toString());
        {
            finally {
                var1_1.close();
                this.T.S3();
            }
        }
    }

    private final class a
    extends OutputStream {
        private final RandomAccessFile a;
        final GgLib$saveVariable b;

        a(GgLib$saveVariable ggLib$saveVariable, RandomAccessFile randomAccessFile) {
            this.b = ggLib$saveVariable;
            this.a = randomAccessFile;
        }

        @Override
        public void close() {
            this.a.close();
        }

        @Override
        public void flush() {
        }

        @Override
        public void write(int n3) {
            this.b.T.M3(1L);
            this.a.write(n3);
        }

        @Override
        public void write(byte[] byArray) {
            this.b.T.M3(byArray.length);
            this.a.write(byArray);
        }

        @Override
        public void write(byte[] byArray, int n3, int n4) {
            this.b.T.M3(n4);
            this.a.write(byArray, n3, n4);
        }
    }
}

