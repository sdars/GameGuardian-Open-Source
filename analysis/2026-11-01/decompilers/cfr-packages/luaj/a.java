/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnDismissListener
 */
package luaj;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.ext.Tools;
import android.ext.b2;
import android.ext.e1;
import android.ext.f;
import android.ext.n2;
import android.ext.r;
import java.io.DataInputStream;
import java.io.InputStream;
import luaj.Globals;
import luaj.LuaBoolean;
import luaj.LuaLong;
import luaj.LuaString;
import luaj.LuaValue;
import luaj.d;
import luaj.g;
import luaj.h;

public class a {
    public static final Globals.d l = new c();
    public static String m = null;
    public static final byte[] n = new byte[]{27, 76, 117, 97};
    public static final byte[] o = new byte[]{25, -109, 13, 10, 26, 10};
    private static final LuaValue[] p = new LuaValue[0];
    private static final h[] q = new h[0];
    private static final f.b[] r = new f.b[0];
    private static final f.d[] s = new f.d[0];
    private static final int[] t = new int[0];
    public static volatile boolean u = false;
    private int a;
    private int b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    public final DataInputStream i;
    String j;
    private byte[] k = new byte[512];

    private a(InputStream inputStream, String string2) {
        this.j = string2;
        this.i = new DataInputStream(inputStream);
    }

    private static h a(h h4, LuaString hArray) {
        if (h4.g == null) {
            h4.g = hArray;
        }
        for (int i3 = 0; i3 < (hArray = h4.c).length; ++i3) {
            luaj.a.a(hArray[i3], h4.g);
        }
        return h4;
    }

    public static String b(String string2) {
        String string3;
        if (!string2.startsWith("@") && !string2.startsWith("=")) {
            string3 = string2;
            if (string2.startsWith("\u001b")) {
                string3 = "=?";
            }
        } else {
            string3 = string2.substring(1);
        }
        return string3;
    }

    public static void c(Globals globals) {
        globals.l0 = l;
    }

    public static LuaValue n(long l3) {
        int n3;
        long l4;
        if ((Long.MAX_VALUE & l3) == 0L) {
            return LuaValue.g;
        }
        int n4 = (int)(l3 >> 52 & 0x7FFL) - 1023;
        if (n4 >= 0 && n4 < 31 && ((l4 = 0xFFFFFFFFFFFFFL & l3) & (1L << (n3 = 52 - n4)) - 1L) == 0L) {
            n3 = (int)(l4 >> n3) | 1 << n4;
            l3 = l3 >> 63 != 0L ? (long)(-n3) : (long)n3;
            return LuaLong.I2(l3);
        }
        return LuaValue.J2(Double.longBitsToDouble(l3));
    }

    public static h o(InputStream object, String charSequence) {
        String string2 = charSequence == null ? null : luaj.a.b((String)charSequence);
        object = new a((InputStream)object, string2);
        ((a)object).g();
        if (charSequence == null) {
            return null;
        }
        int n3 = ((a)object).h;
        if (n3 != 0 && n3 != 1 && n3 != 4) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("unsupported int size: ");
            ((StringBuilder)charSequence).append(((a)object).h);
            throw new d(((StringBuilder)charSequence).toString());
        }
        return luaj.a.a(((a)object).f(), LuaString.K2(string2));
    }

    void d(h h4) {
        int n3;
        int n4 = this.h();
        Object[] objectArray = n4 > 0 ? new LuaValue[n4] : p;
        int n5 = 0;
        for (n3 = 0; n3 < n4; ++n3) {
            byte by = this.i.readByte();
            if (by != -2) {
                if (by != 0) {
                    if (by != 1) {
                        if (by != 3) {
                            if (by == 4) {
                                objectArray[n3] = this.l();
                                continue;
                            }
                            throw new IllegalStateException("bad constant");
                        }
                        objectArray[n3] = this.k();
                        continue;
                    }
                    LuaBoolean luaBoolean = this.i.readUnsignedByte() != 0 ? LuaValue.d : LuaValue.e;
                    objectArray[n3] = luaBoolean;
                    continue;
                }
                objectArray[n3] = LuaValue.c;
                continue;
            }
            objectArray[n3] = LuaLong.I2(this.h());
        }
        h4.a = objectArray;
        n4 = this.h();
        if (n4 > 0) {
            objectArray = new h[n4];
            n3 = n5;
        } else {
            objectArray = q;
            n3 = n5;
        }
        while (n3 < n4) {
            objectArray[n3] = this.f();
            ++n3;
        }
        h4.c = objectArray;
    }

    void e(h h4) {
        int n3;
        Object object = this.l();
        if (object != null) {
            h4.g = object;
        }
        h4.d = this.j();
        int n4 = this.h();
        object = n4 > 0 ? new f.b[n4] : r;
        h4.e = object;
        int n5 = 0;
        for (n3 = 0; n3 < n4; ++n3) {
            object = this.l();
            int n6 = this.h();
            int n7 = this.h();
            h4.e[n3] = new f.b((LuaString)object, n6, n7);
        }
        n4 = this.h();
        for (n3 = n5; n3 < n4; ++n3) {
            h4.f[n3].a = this.l();
        }
    }

    public h f() {
        int n3;
        h h4 = new h();
        h4.h = this.h();
        h4.i = this.h();
        h4.j = this.i.readUnsignedByte();
        h4.k = this.i.readUnsignedByte();
        h4.l = n3 = this.i.readUnsignedByte();
        if (n3 >= h4.j) {
            h4.b = this.j();
            this.d(h4);
            this.m(h4);
            this.e(h4);
            return h4;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Damaged script 2: .maxstacksize (");
        stringBuilder.append(h4.l);
        stringBuilder.append(") < .numparams (");
        stringBuilder.append(h4.j);
        stringBuilder.append(")");
        throw new d(stringBuilder.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g() {
        CharSequence charSequence;
        Object object;
        int n3;
        int n4;
        block20: {
            Object object2;
            Runnable runnable;
            this.a = this.i.readByte() & 0xFF;
            this.b = this.i.readByte() & 0xFF;
            n4 = this.i.readByte();
            n3 = 0;
            boolean bl = n4 != 0;
            this.c = bl;
            this.d = this.i.readByte() & 0xFF;
            this.e = this.i.readByte() & 0xFF;
            this.f = this.i.readByte() & 0xFF;
            this.g = this.i.readByte() & 0xFF;
            this.h = this.i.readByte() & 0xFF;
            object = "";
            if (this.a != 82) {
                object = new StringBuilder();
                ((StringBuilder)object).append("");
                ((StringBuilder)object).append(b2.f(2131297063));
                ((StringBuilder)object).append(" ");
                charSequence = b2.f(2131296426);
                runnable = new StringBuilder();
                ((StringBuilder)((Object)runnable)).append("'");
                ((StringBuilder)((Object)runnable)).append(Integer.toHexString(82));
                ((StringBuilder)((Object)runnable)).append("'");
                object2 = ((StringBuilder)((Object)runnable)).toString();
                runnable = new StringBuilder();
                ((StringBuilder)((Object)runnable)).append("'");
                ((StringBuilder)((Object)runnable)).append(Integer.toHexString(this.a));
                ((StringBuilder)((Object)runnable)).append("'");
                ((StringBuilder)object).append(Tools.L1((String)charSequence, object2, ((StringBuilder)((Object)runnable)).toString()));
                ((StringBuilder)object).append("\n");
                object = ((StringBuilder)object).toString();
            }
            charSequence = object;
            if (this.b != 0) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)object);
                ((StringBuilder)charSequence).append(b2.f(2131297059));
                ((StringBuilder)charSequence).append(" ");
                object = b2.f(2131296426);
                runnable = new StringBuilder();
                ((StringBuilder)((Object)runnable)).append("'");
                ((StringBuilder)((Object)runnable)).append(this.b);
                ((StringBuilder)((Object)runnable)).append("'");
                ((StringBuilder)charSequence).append(Tools.L1((String)object, "'0'", ((StringBuilder)((Object)runnable)).toString()));
                ((StringBuilder)charSequence).append("\n");
                charSequence = ((StringBuilder)charSequence).toString();
            }
            object = charSequence;
            if (n4 != 0) {
                object = charSequence;
                if (n4 != 1) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append((String)charSequence);
                    ((StringBuilder)object).append(b2.f(2131297057));
                    ((StringBuilder)object).append(" ");
                    charSequence = b2.f(2131296426);
                    runnable = new StringBuilder();
                    ((StringBuilder)((Object)runnable)).append("'0' ");
                    ((StringBuilder)((Object)runnable)).append(b2.f(2131296840));
                    ((StringBuilder)((Object)runnable)).append(" '1'");
                    runnable = ((StringBuilder)((Object)runnable)).toString();
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("'");
                    ((StringBuilder)object2).append(n4 & 0xFF);
                    ((StringBuilder)object2).append("'");
                    ((StringBuilder)object).append(Tools.L1((String)charSequence, runnable, ((StringBuilder)object2).toString()));
                    ((StringBuilder)object).append("\n");
                    object = ((StringBuilder)object).toString();
                }
            }
            runnable = object;
            if (this.d != 4) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)object);
                ((StringBuilder)charSequence).append(Tools.L1(b2.f(2131297062), "int"));
                ((StringBuilder)charSequence).append(" ");
                runnable = b2.f(2131296426);
                object = new StringBuilder();
                ((StringBuilder)object).append("'");
                ((StringBuilder)object).append(this.d);
                ((StringBuilder)object).append("'");
                ((StringBuilder)charSequence).append(Tools.L1((String)((Object)runnable), "'4'", ((StringBuilder)object).toString()));
                ((StringBuilder)charSequence).append("\n");
                runnable = ((StringBuilder)charSequence).toString();
            }
            charSequence = runnable;
            if (this.e != 4) {
                object = new StringBuilder();
                ((StringBuilder)object).append((String)((Object)runnable));
                ((StringBuilder)object).append(Tools.L1(b2.f(2131297062), "size_t"));
                ((StringBuilder)object).append(" ");
                charSequence = b2.f(2131296426);
                runnable = new StringBuilder();
                ((StringBuilder)((Object)runnable)).append("'");
                ((StringBuilder)((Object)runnable)).append(this.e);
                ((StringBuilder)((Object)runnable)).append("'");
                ((StringBuilder)object).append(Tools.L1((String)charSequence, "'4'", ((StringBuilder)((Object)runnable)).toString()));
                ((StringBuilder)object).append("\n");
                charSequence = ((StringBuilder)object).toString();
            }
            object = charSequence;
            if (this.f != 4) {
                object = new StringBuilder();
                ((StringBuilder)object).append((String)charSequence);
                ((StringBuilder)object).append(b2.f(2131297060));
                ((StringBuilder)object).append(" ");
                runnable = b2.f(2131296426);
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("'");
                ((StringBuilder)charSequence).append(this.f);
                ((StringBuilder)charSequence).append("'");
                ((StringBuilder)object).append(Tools.L1((String)((Object)runnable), "'4'", ((StringBuilder)charSequence).toString()));
                ((StringBuilder)object).append("\n");
                object = ((StringBuilder)object).toString();
            }
            n4 = this.g;
            charSequence = object;
            if (n4 != 4) {
                charSequence = object;
                if (n4 != 8) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append((String)object);
                    ((StringBuilder)charSequence).append(b2.f(2131297061));
                    ((StringBuilder)charSequence).append(" ");
                    object = b2.f(2131296426);
                    runnable = new StringBuilder();
                    ((StringBuilder)((Object)runnable)).append("'4' ");
                    ((StringBuilder)((Object)runnable)).append(b2.f(2131296840));
                    ((StringBuilder)((Object)runnable)).append(" '8'");
                    object2 = ((StringBuilder)((Object)runnable)).toString();
                    runnable = new StringBuilder();
                    ((StringBuilder)((Object)runnable)).append("'");
                    ((StringBuilder)((Object)runnable)).append(this.g);
                    ((StringBuilder)((Object)runnable)).append("'");
                    ((StringBuilder)charSequence).append(Tools.L1((String)object, object2, ((StringBuilder)((Object)runnable)).toString()));
                    ((StringBuilder)charSequence).append("\n");
                    charSequence = ((StringBuilder)charSequence).toString();
                }
            }
            n4 = n3;
            if (((String)charSequence).length() > 0) {
                if (!u && !n2.e()) {
                    u = true;
                    object = new b();
                    ((b)object).a = ((String)charSequence).trim();
                    synchronized (object) {
                        Throwable throwable2;
                        block21: {
                            block19: {
                                try {
                                    runnable = new Runnable(this, (b)object){
                                        final b a;
                                        final a b;
                                        {
                                            this.b = a4;
                                            this.a = b4;
                                        }

                                        @Override
                                        public void run() {
                                            AlertDialog.Builder builder = android.ext.f.c(Tools.f0());
                                            Object object = new StringBuilder();
                                            ((StringBuilder)object).append(this.b.j);
                                            ((StringBuilder)object).append("\n\n");
                                            ((StringBuilder)object).append(Tools.L1(b2.f(2131296713), this.a.a));
                                            builder = builder.setMessage((CharSequence)((StringBuilder)object).toString()).setNeutralButton((CharSequence)b2.f(2131296455), (DialogInterface.OnClickListener)new r.n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf2594440elqdu|0vfulswv0zlwk0fruuxswhg0ru0lqydolg0khdghuv2"));
                                            object = new DialogInterface.OnClickListener(this){
                                                final a a;
                                                {
                                                    this.a = a4;
                                                }

                                                public void onClick(DialogInterface dialogInterface, int n3) {
                                                    this.a.a.a = null;
                                                }
                                            };
                                            if (Tools.a.nextBoolean()) {
                                                builder.setPositiveButton((CharSequence)b2.f(2131297115), (DialogInterface.OnClickListener)object).setNegativeButton((CharSequence)b2.f(2131296805), null);
                                            } else {
                                                builder.setNegativeButton((CharSequence)b2.f(2131297115), (DialogInterface.OnClickListener)object).setPositiveButton((CharSequence)b2.f(2131296805), null);
                                            }
                                            object = builder.create();
                                            android.ext.f.k((AlertDialog)object, new DialogInterface.OnDismissListener(this){
                                                final a a;
                                                {
                                                    this.a = a4;
                                                }

                                                /*
                                                 * Enabled aggressive block sorting
                                                 * Enabled unnecessary exception pruning
                                                 * Enabled aggressive exception aggregation
                                                 */
                                                public void onDismiss(DialogInterface dialogInterface) {
                                                    b b4 = this.a.a;
                                                    synchronized (b4) {
                                                        this.a.a.notify();
                                                        return;
                                                    }
                                                }
                                            });
                                            android.ext.f.m((AlertDialog)object);
                                        }
                                    };
                                    n2.i(runnable);
                                    try {
                                        object.wait();
                                        if (((b)object).a != null) break block19;
                                    }
                                    catch (InterruptedException interruptedException) {
                                        e1.s("Interrupted wait", interruptedException);
                                        Thread.currentThread().interrupt();
                                        runnable = new d(interruptedException);
                                        throw runnable;
                                    }
                                    n4 = n3;
                                    break block20;
                                }
                                catch (Throwable throwable2) {
                                    break block21;
                                }
                            }
                            runnable = new StringBuilder();
                            ((StringBuilder)((Object)runnable)).append(b2.f(2131296714).trim());
                            ((StringBuilder)((Object)runnable)).append("\n\n");
                            ((StringBuilder)((Object)runnable)).append((String)charSequence);
                            ((StringBuilder)((Object)runnable)).append("\n");
                            ((StringBuilder)((Object)runnable)).append(b2.f(2131296716).trim());
                            object2 = new d(((StringBuilder)((Object)runnable)).toString());
                            throw object2;
                        }
                        throw throwable2;
                    }
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("-------------------\n");
                ((StringBuilder)object).append(b2.f(2131296714).trim());
                ((StringBuilder)object).append("\n\n");
                ((StringBuilder)object).append((String)charSequence);
                ((StringBuilder)object).append("\n");
                ((StringBuilder)object).append(b2.f(2131296716).trim());
                ((StringBuilder)object).append("\n-------------------\n");
                object = ((StringBuilder)object).toString();
                Tools.K1(((String)object).trim(), 1);
                luaj.g.b.println((String)object);
                n4 = n3;
            }
        }
        while (n4 < ((Object)(object = (Object)o)).length) {
            n3 = this.i.readByte();
            if (n3 != object[n4]) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("Unexpected byte in luac tail of header, index = ");
                ((StringBuilder)charSequence).append(n4);
                ((StringBuilder)charSequence).append(" (");
                ((StringBuilder)charSequence).append(n3 & 0xFF);
                ((StringBuilder)charSequence).append(", not ");
                ((StringBuilder)charSequence).append((int)(object[n4] & 0xFF));
                ((StringBuilder)charSequence).append(")");
                throw new d(((StringBuilder)charSequence).toString());
            }
            ++n4;
        }
        return;
    }

    int h() {
        byte by;
        int n3;
        this.i.readFully(this.k, 0, 4);
        if (this.c) {
            byte[] byArray = this.k;
            n3 = byArray[3];
            by = byArray[2];
            n3 = (byArray[1] & 0xFF) << 8 | ((by & 0xFF) << 16 | n3 << 24);
            by = byArray[0];
        } else {
            byte[] byArray = this.k;
            by = byArray[0];
            n3 = (byArray[1] & 0xFF) << 16 | by << 24 | (byArray[2] & 0xFF) << 8;
            by = byArray[3];
        }
        return by & 0xFF | n3;
    }

    long i() {
        int n3;
        int n4;
        if (this.c) {
            n4 = this.h();
            n3 = this.h();
        } else {
            n3 = this.h();
            n4 = this.h();
        }
        return (long)n3 << 32 | (long)n4 & 0xFFFFFFFFL;
    }

    int[] j() {
        int n3 = this.h();
        if (n3 == 0) {
            return t;
        }
        int n4 = n3 << 2;
        if (this.k.length < n4) {
            this.k = new byte[n4];
        }
        Object object = this.i;
        byte[] byArray = this.k;
        int n5 = 0;
        ((DataInputStream)object).readFully(byArray, 0, n4);
        object = new int[n3];
        n4 = 0;
        while (n5 < n3) {
            byte by;
            int n6;
            if (this.c) {
                byArray = this.k;
                n6 = byArray[n4 + 3] << 24 | (byArray[n4 + 2] & 0xFF) << 16 | (byArray[n4 + 1] & 0xFF) << 8;
                by = byArray[n4];
            } else {
                byArray = this.k;
                n6 = byArray[n4] << 24 | (byArray[n4 + 1] & 0xFF) << 16 | (byArray[n4 + 2] & 0xFF) << 8;
                by = byArray[n4 + 3];
            }
            object[n5] = by & 0xFF | n6;
            ++n5;
            n4 += 4;
        }
        return object;
    }

    LuaValue k() {
        if (this.h == 1) {
            return LuaLong.I2(this.h());
        }
        return luaj.a.n(this.i());
    }

    LuaString l() {
        int n3 = this.e == 8 ? (int)this.i() : this.h();
        if (n3 == 0) {
            return null;
        }
        byte[] byArray = new byte[n3];
        this.i.readFully(byArray, 0, n3);
        return LuaString.p3(byArray, 0, n3 - 1);
    }

    void m(h h4) {
        int n3 = this.h();
        f.d[] dArray = n3 > 0 ? new f.d[n3] : s;
        h4.f = dArray;
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl = this.i.readByte() != 0;
            byte by = this.i.readByte();
            h4.f[i3] = new f.d(null, bl, by & 0xFF);
        }
    }

    public static class b {
        String a;
    }

    private static final class c
    implements Globals.d {
        private c() {
        }

        @Override
        public h a(InputStream inputStream, String string2) {
            return luaj.a.o(inputStream, string2);
        }
    }
}

