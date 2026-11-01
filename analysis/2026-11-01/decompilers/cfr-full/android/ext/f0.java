/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.e;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.ext.Config;
import android.ext.ConfigListAdapter;
import android.ext.InOut;
import android.ext.MainService;
import android.ext.TimersEditor;
import android.ext.Tools;
import android.ext.b2;
import android.ext.c;
import android.ext.e0;
import android.ext.e1;
import android.ext.e2;
import android.ext.f;
import android.ext.f1;
import android.ext.g0;
import android.ext.g2;
import android.ext.h0;
import android.ext.h2;
import android.ext.i;
import android.ext.i2;
import android.ext.n2;
import android.ext.p0;
import android.ext.r;
import android.ext.w;
import android.ext.w0;
import android.ext.x0;
import android.ext.y;
import android.ext.y2;
import android.os.Build;
import android.os.Handler;
import d.b;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class f0 {
    private static boolean A = false;
    static volatile String B;
    private static volatile String C;
    public static volatile boolean v = false;
    public static volatile boolean w = false;
    public static volatile boolean x = false;
    static n0 y;
    private static final List z;
    n0 a = null;
    final InOut b;
    Exchanger c = new Exchanger();
    private volatile boolean d = false;
    volatile int e = -1;
    volatile int f = -1;
    volatile String g = "???";
    private volatile int h = 0;
    private volatile int i = 0;
    private volatile long j = 0L;
    private volatile long k = -1L;
    private volatile long l = 0L;
    Thread m = new g0(this, "mReaderThread"){
        final f0 a;
        {
            this.a = f02;
            super(string2);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void a(byte[] byArray) {
            try {
                boolean bl;
                Exchanger exchanger = this.a.c;
                while (!(bl = Thread.interrupted())) {
                    try {
                        exchanger.exchange(byArray, 500L, TimeUnit.MILLISECONDS);
                        return;
                    }
                    catch (InterruptedException interruptedException) {
                    }
                }
                return;
            }
            catch (Throwable throwable) {
                e1.l("handleMemoryItem failed", throwable);
            }
        }

        private void b(byte[] byArray) {
            if (byArray[0] == 20 && byArray[1] == 0) {
                this.a(byArray);
                return;
            }
            n2.d().post(new Runnable(this, byArray){
                final byte[] a;
                final d0 b;
                {
                    this.b = d02;
                    this.a = byArray;
                }

                @Override
                public void run() {
                    try {
                        this.b.a.h0(this.a);
                    }
                    catch (IOException iOException) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Failed process message: ");
                        stringBuilder.append(this.a[0]);
                        stringBuilder.append(' ');
                        stringBuilder.append(this.a.length);
                        e1.l(stringBuilder.toString(), iOException);
                    }
                }
            });
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void run() {
            InOut inOut = this.a.b;
            try {
                while (!Thread.interrupted()) {
                    byte[] byArray = inOut.k();
                    B = null;
                    if (byArray == null) continue;
                    this.b(byArray);
                }
                return;
            }
            catch (Throwable throwable) {
                e1.l("Read error", throwable);
                B = throwable.toString();
                n2.d().post(new Runnable(this){
                    final d0 a;
                    {
                        this.a = d02;
                    }

                    @Override
                    public void run() {
                        this.a.a.g0();
                    }
                });
            }
        }
    };
    private volatile int n = 1;
    private volatile int o = 1;
    private volatile long p = 0L;
    private final ArrayList q = new ArrayList();
    private final ArrayList r = new ArrayList();
    private final ArrayList s = new ArrayList();
    long t = 0L;
    private Integer u = null;

    static {
        z = new ArrayList();
        A = true;
        B = null;
        C = null;
    }

    public f0() {
        this.b = new InOut();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int A(byte by) {
        h2[] h2Array;
        ArrayList arrayList = this.s;
        synchronized (arrayList) {
            h2Array = arrayList.toArray(new h2[arrayList.size()]);
            arrayList.clear();
            arrayList.trimToSize();
        }
        int n3 = h2Array.length;
        if (n3 != 0) {
            n2.j(new Runnable(this, h2Array, by){
                final h2[] a;
                final byte b;
                final f0 c;
                {
                    this.c = f02;
                    this.a = h2Array;
                    this.b = by;
                }

                @Override
                public void run() {
                    InOut inOut = this.c.b;
                    int n3 = this.a.length;
                    int n4 = 0;
                    while (n4 < n3) {
                        int n5;
                        int n6 = n5 = n3 - n4;
                        if (n5 > 100000000) {
                            n6 = 100000000;
                        }
                        inOut.q(this.b, (byte)41, (InOut.n + 4) * n6);
                        n6 += n4;
                        while (n4 < n6) {
                            h2 h22 = this.a[n4];
                            n5 = h22.c;
                            if (n5 != 0) {
                                inOut.u(n5);
                                inOut.v(h22.a);
                            }
                            ++n4;
                        }
                        inOut.u(0);
                        this.c.t0();
                        n4 = n6;
                    }
                }
            });
        }
        return n3;
    }

    private boolean[] I(int n3) {
        TimersEditor timersEditor = n3 == 1 ? MainService.instance.o0 : MainService.instance.n0;
        return timersEditor.b();
    }

    private String[] K(boolean bl, String string2, File comparable) {
        String[] stringArray = new String[5];
        stringArray[0] = string2;
        stringArray[1] = Tools.C0();
        stringArray[2] = ((File)comparable).getAbsolutePath();
        stringArray[3] = f0.T();
        string2 = Config.C ? "1" : "0";
        stringArray[4] = string2;
        if (bl) {
            return stringArray;
        }
        comparable = new StringBuilder();
        ((StringBuilder)comparable).append("exec");
        for (int i3 = 0; i3 < 5; ++i3) {
            string2 = stringArray[i3];
            ((StringBuilder)comparable).append(' ');
            ((StringBuilder)comparable).append(string2);
        }
        return new String[]{((StringBuilder)comparable).toString()};
    }

    static j0 M0(List object, boolean bl) {
        int n3;
        Object object2;
        int n4;
        Object object3 = new ArrayList<m0>(object.size());
        int n5 = object.size();
        int n6 = 0;
        for (n4 = 0; n4 < n5; ++n4) {
            object2 = (c)object.get(n4);
            if (object2 == null) continue;
            ((ArrayList)object3).add(new m0(android.ext.e.a(((c)object2).a, bl), ((c)object2).c));
        }
        Object[] objectArray = ((ArrayList)object3).toArray(new m0[((ArrayList)object3).size()]);
        Arrays.sort(objectArray);
        object2 = new ArrayList(objectArray.length);
        n5 = objectArray.length;
        object = null;
        for (n4 = 0; n4 < n5; ++n4) {
            object3 = objectArray[n4];
            if (object3 == null) continue;
            if (object != null && ((m0)object).a == ((m0)object3).a) {
                n3 = ((m0)object).b;
                ((m0)object).b = ((m0)object3).b | n3;
                continue;
            }
            ((ArrayList)object2).add(object3);
            object = object3;
        }
        n3 = ((ArrayList)object2).size();
        object = new long[n3];
        objectArray = new int[n3];
        n5 = 0;
        for (n4 = n6; n4 < n3; ++n4) {
            object3 = (m0)((ArrayList)object2).get(n4);
            object[n4] = ((m0)object3).a;
            n6 = ((m0)object3).b;
            objectArray[n4] = n6;
            n5 |= n6;
        }
        object = new j0((long[])object, (int[])objectArray);
        ((j0)object).c = n5 & 0x7F;
        return object;
    }

    private void R0() {
        this.d = false;
    }

    /*
     * Exception decompiling
     */
    public static String S0(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [4 : 223->234)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static String T() {
        return w0.a(h0.c(), "S!H!A!-!3!8!4".replace("!", ""));
    }

    private void c0() {
        MainService.instance.Q();
        MainService.instance.l();
    }

    /*
     * Loose catch block
     */
    private static boolean j(n0 object, File file) {
        boolean bl = false;
        if (object == null) {
            return false;
        }
        if (((n0)object).a == null) {
            return false;
        }
        Closeable closeable = ((n0)object).c;
        boolean bl2 = f0.k(((n0)object).d, "android-daemon err") && f0.k((InputStream)closeable, "android-daemon out");
        if (!Config.C && bl2) {
            new g2().f("root-ok", (int)(1.0f * 16338.7f - 183.7f + 0.5f)).commit();
        }
        if (bl2) {
            int n3 = ((InputStream)closeable).read();
            if (n3 == 49 || n3 == 48) {
                ((InputStream)closeable).read();
            }
            if (n3 == 49) {
                closeable = ((n0)object).b;
                try {
                    e1.d("IF 0");
                    Object object2 = new File(file, "o");
                    FileInputStream fileInputStream = new FileInputStream((File)object2);
                    e1.d("IF 1");
                    File file2 = new File(file, "e");
                    object2 = new FileInputStream(file2);
                    e1.d("IF 2");
                    file2 = new File(file, "i");
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    e1.d("IF 3");
                    ((n0)object).b = fileOutputStream;
                    ((n0)object).c = fileInputStream;
                    ((n0)object).d = object2;
                    bl = true;
                }
                catch (Throwable throwable) {
                    e1.l("Fifo fail", throwable);
                }
                n3 = bl ? 89 : 78;
                ((OutputStream)closeable).write(n3);
                ((OutputStream)closeable).write(10);
                ((OutputStream)closeable).flush();
                InOut.o = bl;
                {
                    catch (Throwable throwable) {
                        e1.l("Fifo fail 2", throwable);
                    }
                }
            } else if (n3 != 48) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Odd fifo: ");
                ((StringBuilder)object).append(n3);
                e1.p(((StringBuilder)object).toString());
            }
        }
        return bl2;
    }

    private static boolean k(InputStream object, String charSequence) {
        int n3;
        byte[] byArray = ((String)charSequence).getBytes();
        Object object2 = new byte[4096];
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Start: ");
        stringBuilder.append((String)charSequence);
        e1.d(stringBuilder.toString());
        int n4 = 0;
        int n5 = 0;
        while (true) {
            int n6 = ((InputStream)object).read();
            n3 = n4;
            if (n6 == -1) break;
            byte by = (byte)n6;
            if (n4 >= 4096) {
                n3 = n4;
                break;
            }
            n3 = n4 + 1;
            object2[n4] = by;
            if (by == byArray[n5]) {
                n5 = n4 = n5 + 1;
                if (n4 == byArray.length) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Good: ");
                    ((StringBuilder)object).append((String)charSequence);
                    e1.d(((StringBuilder)object).toString());
                    return true;
                }
            } else {
                n5 = 0;
            }
            if (((InputStream)object).available() == 0) {
                for (n4 = 0; n4 < 30; ++n4) {
                    try {
                        Thread.sleep(100L);
                    }
                    catch (InterruptedException interruptedException) {
                        // empty catch block
                    }
                    if (((InputStream)object).available() != 0) break;
                }
            }
            if (((InputStream)object).available() == 0) {
                object = new StringBuilder();
                ((StringBuilder)object).append(e2.a);
                ((StringBuilder)object).append("No more data: ");
                ((StringBuilder)object).append(n3);
                ((StringBuilder)object).append('\n');
                e2.a = ((StringBuilder)object).toString();
                break;
            }
            n4 = n3;
        }
        object = new String((byte[])object2, 0, n3);
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Fail: '");
        ((StringBuilder)object2).append((String)charSequence);
        ((StringBuilder)object2).append("' ");
        ((StringBuilder)object2).append(n3);
        ((StringBuilder)object2).append(" '");
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append('\'');
        object = ((StringBuilder)object2).toString();
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(e2.a);
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append('\n');
        e2.a = ((StringBuilder)charSequence).toString();
        e1.d((String)object);
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void m0(Runnable runnable) {
        List list = z;
        synchronized (list) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        try {
                            if (!A) break block3;
                            list.add(runnable);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    g0 g02 = new g0(runnable, "runAfterDaemonStart");
                    g02.start();
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void r() {
        List list = z;
        synchronized (list) {
            try {
                A = false;
                Iterator iterator = list.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    Runnable runnable = (Runnable)iterator.next();
                    g0 g02 = new g0(runnable, "waitForDaemonStart");
                    g02.start();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int u(byte by) {
        Object[] objectArray;
        ArrayList arrayList = this.q;
        synchronized (arrayList) {
            objectArray = arrayList.toArray(new Object[arrayList.size()]);
            arrayList.clear();
            arrayList.trimToSize();
        }
        int n3 = objectArray.length;
        if (n3 != 0) {
            n2.j(new Runnable(this, objectArray, by){
                final Object[] a;
                final byte b;
                final f0 c;
                {
                    this.c = f02;
                    this.a = objectArray;
                    this.b = by;
                }

                @Override
                public void run() {
                    InOut inOut = this.c.b;
                    int n3 = this.a.length;
                    int n4 = 0;
                    while (n4 < n3) {
                        int n5;
                        int n6 = n5 = n3 - n4;
                        if (n5 > 100000000) {
                            n6 = 100000000;
                        }
                        inOut.q(this.b, (byte)43, (InOut.n + 16) * n6);
                        inOut.u(n6);
                        n5 = n6 + n4;
                        while (n4 < n5) {
                            Object object = this.a[n4];
                            if (object instanceof k0) {
                                k0 k02 = (k0)object;
                                object = k02.a;
                                n6 = k02.b;
                            } else {
                                object = (c)object;
                                n6 = 0;
                            }
                            int n7 = ((c)object).c;
                            if (n7 != 0) {
                                inOut.u(n7);
                                inOut.v(((c)object).a);
                                inOut.w(((c)object).b);
                                inOut.u(n6);
                            }
                            ++n4;
                        }
                        inOut.u(0);
                        this.c.t0();
                        n4 = n5;
                    }
                }
            });
        }
        return n3;
    }

    private void v() {
        if (!this.d) {
            return;
        }
        if (this.e <= 0) {
            return;
        }
        File file = new File(Tools.q0(), "stop.tmp");
        try {
            Object object = new FileOutputStream(file);
            ((FileOutputStream)object).write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(this.e).array());
            ((FileOutputStream)object).close();
            object = new File(Tools.q0(), "stop");
            if (!file.renameTo((File)object)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Failed rename stop file: ");
                ((StringBuilder)object).append(file);
                String string2 = ((StringBuilder)object).toString();
                object = new RuntimeException();
                e1.s(string2, (Throwable)object);
                this.d = false;
                file.delete();
            }
        }
        catch (IOException iOException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed make stop file: ");
            stringBuilder.append(file);
            e1.s(stringBuilder.toString(), iOException);
            this.d = false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int y(byte by) {
        h2[] h2Array;
        ArrayList arrayList = this.r;
        synchronized (arrayList) {
            h2Array = arrayList.toArray(new h2[arrayList.size()]);
            arrayList.clear();
            arrayList.trimToSize();
        }
        int n3 = h2Array.length;
        if (n3 != 0) {
            n2.j(new Runnable(this, h2Array, by){
                final h2[] a;
                final byte b;
                final f0 c;
                {
                    this.c = f02;
                    this.a = h2Array;
                    this.b = by;
                }

                @Override
                public void run() {
                    InOut inOut = this.c.b;
                    int n3 = this.a.length;
                    int n4 = 0;
                    while (n4 < n3) {
                        int n5;
                        int n6 = n5 = n3 - n4;
                        if (n5 > 100000000) {
                            n6 = 100000000;
                        }
                        inOut.q(this.b, (byte)40, (InOut.n + 29) * n6);
                        n6 += n4;
                        while (n4 < n6) {
                            h2 h22 = this.a[n4];
                            n5 = h22.c;
                            if (n5 != 0) {
                                inOut.u(n5);
                                inOut.v(h22.a);
                                inOut.w(h22.b);
                                inOut.s(h22.n);
                                inOut.w(h22.o);
                                inOut.w(h22.p);
                            }
                            ++n4;
                        }
                        inOut.u(0);
                        this.c.t0();
                        n4 = n6;
                    }
                }
            });
            if ((Config.A & 0x80) != 0 && !x) {
                x = true;
                n2.i(new Runnable(this){
                    final f0 a;
                    {
                        this.a = f02;
                    }

                    @Override
                    public void run() {
                        android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(2131296300)).setMessage((CharSequence)b2.f(2131296488)).setPositiveButton((CharSequence)b2.f(2131296455), new DialogInterface.OnClickListener(this){
                            final q a;
                            {
                                this.a = q3;
                            }

                            public void onClick(DialogInterface dialogInterface, int n3) {
                                Config.b((int)2131034167).d = 0;
                                Config.k();
                            }
                        }).setNegativeButton((CharSequence)b2.f(2131296963), null));
                    }
                });
            }
        }
        return n3;
    }

    private void y0(byte by, long l3, long l4, int n3, int n4, long l5, long l6, long l7) {
        l3 = android.ext.c.h(l3, n4);
        l4 = android.ext.c.h(l4, n4);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sendSearchNumber: ");
        stringBuilder.append(l3);
        stringBuilder.append("; ");
        stringBuilder.append(l4);
        stringBuilder.append(" x");
        stringBuilder.append(n3);
        stringBuilder.append(" as ");
        stringBuilder.append(Integer.toHexString(n4));
        stringBuilder.append(" in ");
        stringBuilder.append(Long.toHexString(l5));
        stringBuilder.append('-');
        stringBuilder.append(Long.toHexString(l6));
        stringBuilder.append(", ");
        stringBuilder.append(Long.toString(l7));
        e1.d(stringBuilder.toString());
        n2.j(new Runnable(this, by, l3, l4, n3, n4, l5, l6, l7){
            final byte a;
            final long b;
            final long c;
            final int d;
            final int e;
            final long f;
            final long g;
            final long h;
            final f0 i;
            {
                this.i = f02;
                this.a = by;
                this.b = l3;
                this.c = l4;
                this.d = n3;
                this.e = n4;
                this.f = l5;
                this.g = l6;
                this.h = l7;
            }

            @Override
            public void run() {
                InOut inOut = this.i.b;
                byte by = this.a;
                boolean bl = false;
                inOut.q(by, (byte)38, 0);
                inOut.w(this.b);
                inOut.w(this.c);
                inOut.u(this.d);
                inOut.u(this.e);
                inOut.v(this.f);
                inOut.v(this.g);
                inOut.v(this.h);
                this.i.t0();
                if ((this.e & Integer.MIN_VALUE) != 0) {
                    bl = true;
                }
                w = bl;
            }
        });
        i2.l = null;
    }

    private void z0(byte by, long l3, long l4, int n3, long l5, long l6, long l7) {
        this.y0(by, l3, l4, 0, n3, l5, l6, l7);
    }

    public void A0(byte by, String object) {
        if (((Object)(object = (Object)((String)object).getBytes())).length == 0) {
            return;
        }
        if (((Object)object).length > 4000) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("path big: ");
            stringBuilder.append(((Object)object).length);
            stringBuilder.append(" > ");
            stringBuilder.append(4000);
            e1.i(stringBuilder.toString());
            return;
        }
        n2.j(new Runnable(this, (byte[])object, by){
            final byte[] a;
            final byte b;
            final f0 c;
            {
                this.c = f02;
                this.a = byArray;
                this.b = by;
            }

            @Override
            public void run() {
                InOut inOut = this.c.b;
                int n3 = this.a.length;
                inOut.q(this.b, (byte)48, n3 + 4);
                inOut.u(n3);
                inOut.t(this.a, n3);
                this.c.t0();
            }
        });
    }

    public void B() {
        this.C((byte)0);
    }

    public void B0(String string2) {
        this.A0((byte)0, string2);
    }

    public void C(byte by) {
        if (this.u(by) + this.y(by) + this.A(by) > 0) {
            MainService.instance.F0();
        }
    }

    public void C0(byte by, int n3, String string2, String string3) {
        n2.j(new Runnable(this, string2, string3, by, n3){
            final String a;
            final String b;
            final byte c;
            final int d;
            final f0 e;
            {
                this.e = f02;
                this.a = string2;
                this.b = string3;
                this.c = by;
                this.d = n3;
            }

            @Override
            public void run() {
                Object object;
                InOut inOut = this.e.b;
                byte[] byArray = this.a.getBytes();
                int n3 = byArray.length;
                int n4 = 255;
                int n5 = n3;
                if (n3 > 255) {
                    n5 = 255;
                }
                if ((n3 = ((Object)(object = (object = this.b) == null ? (Object)d.b.c : (Object)((String)object).getBytes())).length) <= 255) {
                    n4 = n3;
                }
                inOut.q(this.c, (byte)37, 0);
                inOut.u(this.d);
                inOut.s((byte)n5);
                inOut.t(byArray, n5);
                inOut.s((byte)n4);
                inOut.t((byte[])object, n4);
                this.e.t0();
            }
        });
        this.x0(by);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void D(byte var1_1, long var2_2, long var4_3, int var6_4, int var7_5, int var8_6, long var9_7, long var11_8, long var13_9) {
        block8: {
            block9: {
                block10: {
                    block12: {
                        block11: {
                            var17_10 = var6_4 & 127;
                            var22_11 = android.ext.c.v(var17_10);
                            var16_12 = (var6_4 & 0x800000) != 0;
                            var15_13 = var16_12 == false && var2_2 == 0L;
                            var20_14 = android.ext.c.K(0L, var2_2, var17_10);
                            if (var16_12) {
                                var18_15 = new StringBuilder();
                                var18_15.append((String)var20_14);
                                var18_15.append('~');
                                var18_15.append(android.ext.c.K(0L, var4_3, var17_10));
                                var20_14 = var18_15.toString();
                            }
                            if (var7_5 == 0x4000000) break block9;
                            if (var7_5 == 0x8000000) break block10;
                            if (var7_5 == 0x10000000) break block11;
                            if (this.i == 0) {
                                this.i = var8_6;
                            }
                            this.h = var8_6 - 1;
                            this.j = var9_7;
                            this.k = var11_8;
                            this.l = var13_9;
                            var21_16 = "N = O+D";
                            var18_15 = var15_13 != false ? b2.f(2131296504) : "N = O+D";
                            var8_6 = 1;
                            var19_17 /* !! */  = var18_15;
                            var18_15 = var21_16;
                            break block8;
                        }
                        var19_17 /* !! */  = "N ≠ O+D";
                        var18_15 = var19_17 /* !! */ ;
                        if (!var15_13) break block12;
                        var8_6 = 2131296505;
                        var18_15 = var19_17 /* !! */ ;
lbl36:
                        // 3 sources

                        while (true) {
                            var19_17 /* !! */  = b2.f(var8_6);
                            ** GOTO lbl42
                            break;
                        }
                    }
lbl40:
                    // 3 sources

                    while (true) {
                        var19_17 /* !! */  = var18_15;
lbl42:
                        // 2 sources

                        var8_6 = 0;
                        break block8;
                        break;
                    }
                }
                var19_17 /* !! */  = "N < O+D";
                var18_15 = var19_17 /* !! */ ;
                if (!var15_13) ** GOTO lbl40
                var8_6 = 2131296507;
                var18_15 = var19_17 /* !! */ ;
                ** GOTO lbl36
            }
            var19_17 /* !! */  = "N > O+D";
            var18_15 = var19_17 /* !! */ ;
            ** while (!var15_13)
lbl55:
            // 1 sources

            var8_6 = 2131296506;
            var18_15 = var19_17 /* !! */ ;
            ** while (true)
        }
        if (var15_13) {
            var20_14 = new StringBuilder();
            var20_14.append(var19_17 /* !! */ );
            var20_14.append(" (");
            var20_14.append(var18_15.replace("+D", ""));
            var20_14.append(')');
            var18_15 = var20_14.toString();
        } else {
            var18_15 = new StringBuilder();
            var18_15.append(" + (");
            var18_15.append((String)var20_14);
            var18_15.append(')');
            var18_15 = var19_17 /* !! */ .replace("+D", var18_15.toString());
        }
        var18_15 = new y().b("%s %s", new CharSequence[]{var18_15, var22_11}).d();
        if (var8_6 != 0) {
            MainService.instance.i0(var18_15, -1L, 1L, this.i - this.h, this.i, 0L);
        } else {
            MainService.instance.h0(var18_15);
        }
        this.z0(var1_1, var2_2, var4_3, var6_4 | -2147483648 | var7_5, var9_7, var11_8, var13_9);
    }

    public void D0(int n3, String string2, String string3) {
        this.C0((byte)0, n3, string2, string3);
    }

    public void E(long l3, long l4, int n3, int n4, int n5, long l5, long l6, long l7) {
        this.D((byte)0, l3, l4, n3, n4, n5, l5, l6, l7);
    }

    public void E0(byte by) {
        this.F0(by, this.n, this.o);
    }

    public void F(byte by, int n3, long l3, long l4, long l5) {
        MainService.instance.h0(new y().b("%s %s", b2.f(2131296947), android.ext.c.v(n3 & 0x7F)).d());
        this.z0(by, 0L, 0L, n3 | Integer.MIN_VALUE, l3, l4, l5);
    }

    public void F0(byte by, int n3, int n4) {
        this.c0();
        boolean[] blArray = this.I(0);
        long l3 = this.p;
        this.n = n3;
        this.o = n4;
        n2.j(new Runnable(this, by, blArray, n3, n4, l3){
            final byte a;
            final boolean[] b;
            final int c;
            final int d;
            final long e;
            final f0 f;
            {
                this.f = f02;
                this.a = by;
                this.b = blArray;
                this.c = n3;
                this.d = n4;
                this.e = l3;
            }

            @Override
            public void run() {
                InOut inOut = this.f.b;
                inOut.q(this.a, (byte)35, 0);
                inOut.u(16);
                this.f.W0(this.b);
                inOut.u(this.c);
                inOut.u(this.d);
                inOut.w(this.e);
                this.f.t0();
            }
        });
        this.p = 0L;
    }

    public void G() {
        this.H((byte)0);
    }

    public void G0(byte by, int n3) {
        this.c0();
        n2.j(new Runnable(this, by, n3, this.I(n3)){
            final byte a;
            final int b;
            final boolean[] c;
            final f0 d;
            {
                this.d = f02;
                this.a = by;
                this.b = n3;
                this.c = blArray;
            }

            @Override
            public void run() {
                InOut inOut = this.d.b;
                inOut.q(this.a, (byte)35, 0);
                inOut.u(this.b | 0x20);
                this.d.W0(this.c);
                this.d.t0();
            }
        });
    }

    public void H(byte by) {
        this.u0(by, (byte)57);
    }

    public void H0(int n3) {
        this.G0((byte)0, n3);
    }

    public void I0(byte by, int n3) {
        this.c0();
        n2.j(new Runnable(this, by, n3, this.I(n3)){
            final byte a;
            final int b;
            final boolean[] c;
            final f0 d;
            {
                this.d = f02;
                this.a = by;
                this.b = n3;
                this.c = blArray;
            }

            @Override
            public void run() {
                InOut inOut = this.d.b;
                inOut.q(this.a, (byte)35, 0);
                inOut.u(this.b | 8);
                this.d.W0(this.c);
                this.d.t0();
            }
        });
    }

    public int J() {
        return this.e;
    }

    public void J0(int n3) {
        this.I0((byte)0, n3);
    }

    public void K0(byte by) {
        this.L0((byte)0, by);
    }

    public void L() {
        this.M((byte)0);
    }

    public void L0(byte by, byte by2) {
        n2.j(new Runnable(this, by, by2){
            final byte a;
            final byte b;
            final f0 c;
            {
                this.c = f02;
                this.a = by;
                this.b = by2;
            }

            @Override
            public void run() {
                InOut inOut = this.c.b;
                inOut.q(this.a, (byte)53, 0);
                inOut.s(this.b);
                this.c.t0();
            }
        });
    }

    public void M(byte by) {
        this.u0(by, (byte)58);
    }

    public void N(byte by, long l3, int n3) {
        n2.j(new Runnable(this, by, l3, n3){
            final byte a;
            final long b;
            final int c;
            final f0 d;
            {
                this.d = f02;
                this.a = by;
                this.b = l3;
                this.c = n3;
            }

            @Override
            public void run() {
                f0 f02 = this.d;
                InOut inOut = f02.b;
                f02.u0(this.a, (byte)58);
                inOut.q(this.a, (byte)59, 0);
                inOut.v(this.b);
                inOut.u(this.c);
                this.d.t0();
            }
        });
    }

    public void N0() {
        new g0(this, "DaemonLoader"){
            final f0 a;
            {
                this.a = f02;
                super(string2);
            }

            /*
             * WARNING - combined exceptions agressively - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void run() {
                block31: {
                    InOut inOut;
                    block34: {
                        boolean bl;
                        Object object;
                        int n3;
                        int n4;
                        boolean bl2;
                        boolean bl3;
                        CharSequence charSequence;
                        Object object2;
                        Object object3;
                        block32: {
                            block33: {
                                inOut = this.a.b;
                                try {
                                    String string2;
                                    Object object4 = e0.h();
                                    Object object5 = this.a;
                                    ((f0)object5).a = object4 = ((f0)object5).O0((String)object4);
                                    e2.a = "";
                                    inOut.o(((n0)object4).c, ((n0)object4).b);
                                    inOut.n(true);
                                    MainService.instance.q0();
                                    e1.o(((n0)object4).a, ((n0)object4).d);
                                    object5 = inOut.k();
                                    if (object5 == null) {
                                        object5 = "DI: null";
                                    } else {
                                        int n5 = ((Object)object5).length;
                                        if (n5 != 7) {
                                            object4 = new StringBuilder();
                                            ((StringBuilder)object4).append("DI: ");
                                            ((StringBuilder)object4).append(((Object)object5).length);
                                            object5 = ((StringBuilder)object4).toString();
                                        } else {
                                            object4 = new w((byte[])object5);
                                            n5 = ((w)object4).e();
                                            boolean bl4 = n5 == 8;
                                            InOut.p(bl4);
                                            byte by = ((w)object4).e();
                                            if (by != 4) {
                                                object5 = new StringBuilder();
                                                ((StringBuilder)object5).append("DI: QE ");
                                                ((StringBuilder)object5).append(by);
                                                e1.i(((StringBuilder)object5).toString());
                                            }
                                            this.a.e = ((w)object4).f();
                                            object5 = new StringBuilder();
                                            ((StringBuilder)object5).append("DI: ");
                                            ((StringBuilder)object5).append(n5);
                                            ((StringBuilder)object5).append(" ");
                                            ((StringBuilder)object5).append(by);
                                            ((StringBuilder)object5).append(" ");
                                            ((StringBuilder)object5).append(this.a.e);
                                            object5 = ((StringBuilder)object5).toString();
                                        }
                                    }
                                    e1.d((String)object5);
                                    object5 = inOut.k();
                                    object4 = new w((byte[])object5);
                                    ((w)object4).e();
                                    object5 = new byte[((w)object4).e()];
                                    ((w)object4).c((byte[])object5);
                                    object4 = this.a;
                                    ((f0)object4).g = string2 = new String((byte[])object5);
                                    object5 = new StringBuilder();
                                    ((StringBuilder)object5).append("InOut: x64: ");
                                    ((StringBuilder)object5).append(InOut.m);
                                    ((StringBuilder)object5).append("; QE_ALIGN: ");
                                    ((StringBuilder)object5).append(4);
                                    ((StringBuilder)object5).append("; ");
                                    ((StringBuilder)object5).append(this.a.e);
                                    ((StringBuilder)object5).append("; ");
                                    ((StringBuilder)object5).append(this.a.g);
                                    e1.d(((StringBuilder)object5).toString());
                                    this.a.m.start();
                                    MainService.instance.q0();
                                    inOut.m();
                                    this.a.v0((byte)0);
                                    break block31;
                                }
                                catch (Throwable throwable) {}
                                e1.l("start daemon failed", throwable);
                                n2.i(new Runnable(this){
                                    final a0 a;
                                    {
                                        this.a = a02;
                                    }

                                    @Override
                                    public void run() {
                                        try {
                                            CharSequence charSequence = new StringBuilder();
                                            charSequence.append(b2.f(2131296720));
                                            charSequence.append("\n\n");
                                            charSequence.append(b2.f(2131296787));
                                            charSequence = charSequence.toString();
                                            charSequence = android.ext.f.b().setCustomTitle(Tools.g0(2131296439)).setMessage(charSequence);
                                            String string2 = b2.f(2131296455);
                                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this){
                                                final a a;
                                                {
                                                    this.a = a4;
                                                }

                                                public void onClick(DialogInterface dialogInterface, int n3) {
                                                    if (Config.vSpaceReal && !Config.C && (Config.B & 0x200) != 0) {
                                                        Config.b(2131034214).b();
                                                    } else {
                                                        ConfigListAdapter.t(2131297105);
                                                    }
                                                }
                                            };
                                            charSequence = charSequence.setPositiveButton(string2, onClickListener).setNegativeButton((CharSequence)b2.f(2131296836), null).create();
                                            android.ext.f.m((AlertDialog)charSequence);
                                            Tools.u1((AlertDialog)charSequence);
                                        }
                                        catch (Throwable throwable) {
                                            e1.a(throwable);
                                        }
                                    }
                                });
                                break block34;
                                catch (l0 l02) {}
                                e1.l("start daemon failed", l02);
                                object3 = new StringBuilder();
                                ((StringBuilder)object3).append("");
                                ((StringBuilder)object3).append(l02.getMessage());
                                object2 = ((StringBuilder)object3).toString();
                                charSequence = new StringBuilder();
                                object3 = Build.CPU_ABI;
                                ((StringBuilder)charSequence).append((String)object3);
                                ((StringBuilder)charSequence).append("; ");
                                bl3 = "armeabi".equals(object3);
                                try {
                                    object3 = Build.CPU_ABI2;
                                    ((StringBuilder)charSequence).append((String)object3);
                                    ((StringBuilder)charSequence).append("; ");
                                    bl2 = "armeabi".equals(object3);
                                    if (bl2) {
                                        bl3 = true;
                                    }
                                    break block32;
                                }
                                catch (Throwable throwable) {
                                    break block33;
                                }
                                catch (Throwable throwable) {
                                    bl3 = false;
                                }
                            }
                            e1.s("Failed get ABI", (Throwable)object3);
                        }
                        bl2 = bl3;
                        try {
                            object3 = Build.SUPPORTED_ABIS;
                            bl2 = bl3;
                            n4 = ((String[])object3).length;
                            n3 = 0;
                            while (true) {
                                bl2 = bl3;
                                if (n3 < n4) {
                                    object = object3[n3];
                                    bl2 = bl3;
                                    ((StringBuilder)charSequence).append((String)object);
                                    bl2 = bl3;
                                    ((StringBuilder)charSequence).append("; ");
                                    bl2 = bl3;
                                    bl = "armeabi".equals(object);
                                    if (bl) {
                                        bl3 = true;
                                    }
                                    ++n3;
                                    continue;
                                }
                                break;
                            }
                        }
                        catch (Throwable throwable) {
                            e1.s("Failed get ABI", throwable);
                        }
                        bl = bl2;
                        try {
                            object3 = Build.SUPPORTED_32_BIT_ABIS;
                            bl = bl2;
                            n4 = ((String[])object3).length;
                            n3 = 0;
                            bl3 = bl2;
                            while (true) {
                                bl2 = bl3;
                                if (n3 < n4) {
                                    object = object3[n3];
                                    bl = bl3;
                                    ((StringBuilder)charSequence).append((String)object);
                                    bl = bl3;
                                    ((StringBuilder)charSequence).append("; ");
                                    bl = bl3;
                                    bl2 = "armeabi".equals(object);
                                    if (bl2) {
                                        bl3 = true;
                                    }
                                    ++n3;
                                    continue;
                                }
                                break;
                            }
                        }
                        catch (Throwable throwable) {
                            e1.s("Failed get ABI", throwable);
                            bl2 = bl;
                        }
                        bl = bl2;
                        try {
                            object = Build.SUPPORTED_64_BIT_ABIS;
                            bl = bl2;
                            n4 = ((String[])object).length;
                            n3 = 0;
                            bl3 = bl2;
                            while (true) {
                                bl = bl3;
                                if (n3 < n4) {
                                    object3 = object[n3];
                                    bl = bl3;
                                    ((StringBuilder)charSequence).append((String)object3);
                                    bl = bl3;
                                    ((StringBuilder)charSequence).append("; ");
                                    bl = bl3;
                                    bl2 = "armeabi".equals(object3);
                                    if (bl2) {
                                        bl3 = true;
                                    }
                                    ++n3;
                                    continue;
                                }
                                break;
                            }
                        }
                        catch (Throwable throwable) {
                            e1.s("Failed get ABI", throwable);
                        }
                        object3 = object2;
                        if (bl) {
                            object3 = object2;
                            if (b2.d("ydwa", "raw") == 0) {
                                object3 = new StringBuilder();
                                ((StringBuilder)object3).append((String)object2);
                                ((StringBuilder)object3).append("\n\n");
                                ((StringBuilder)object3).append(Tools.N1(2131297020));
                                ((StringBuilder)object3).append(": ");
                                ((StringBuilder)object3).append(android.ext.i.a);
                                object3 = ((StringBuilder)object3).toString();
                            }
                        }
                        charSequence = ((StringBuilder)charSequence).toString();
                        object2 = object3;
                        if (((String)charSequence).contains("mips")) {
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append((String)object3);
                            ((StringBuilder)object2).append("\n\n");
                            ((StringBuilder)object2).append(b2.f(2131296776));
                            object2 = ((StringBuilder)object2).toString();
                        }
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append((String)object2);
                        ((StringBuilder)object3).append("\n\nABIs: ");
                        ((StringBuilder)object3).append((String)charSequence);
                        ((StringBuilder)object3).append('\n');
                        ((StringBuilder)object3).append((Object)e0.g);
                        ((StringBuilder)object3).append('\n');
                        ((StringBuilder)object3).append(Build.VERSION.SDK_INT);
                        ((StringBuilder)object3).append('\n');
                        ((StringBuilder)object3).append((Object)e0.h);
                        object2 = ((StringBuilder)object3).toString();
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append("Supported ABIs: ");
                        ((StringBuilder)object3).append((String)charSequence);
                        e1.d(((StringBuilder)object3).toString());
                        android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(2131296439)).setMessage((CharSequence)object2).setNegativeButton((CharSequence)b2.f(2131296836), null));
                    }
                    inOut.n(false);
                    MainService.instance.q0();
                }
                f0.r();
            }
        }.start();
    }

    public void O(long l3, int n3) {
        this.N((byte)0, l3, n3);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public n0 O0(String var1_1) {
        block13: {
            try {
                var6_4 = Config.C;
                var10_5 = Tools.q0();
                var7_6 = this.K(var6_4, (String)var1_1, var10_5);
                var5_7 = false;
                var2_8 = false;
lbl7:
                // 4 sources

                while (true) {
                    for (var3_9 = 0; var3_9 < 3; ++var3_9) {
                        var8_11 = (new String[]{"i", "o", "e"})[var3_9];
                        var9_12 = new File(var10_5, (String)var8_11);
                        var9_12.delete();
                    }
                    break;
                }
            }
            catch (Exception var1_2) {
                break block13;
            }
            catch (l0 var1_3) {
                throw var1_3;
            }
            if (!var6_4) ** GOTO lbl33
            {
                var9_12 = new StringBuilder();
                var9_12.append("try: direct");
                var4_10 = ((String[])var7_6).length;
            }
            for (var3_9 = 0; var3_9 < var4_10; ++var3_9) {
                var8_11 = var7_6[var3_9];
                {
                    var9_12.append(' ');
                    var9_12.append((String)var8_11);
                    continue;
                }
            }
            {
                block16: {
                    block15: {
                        block14: {
                            e1.d(var9_12.toString());
lbl33:
                            // 2 sources

                            var8_11 = var6_4 != false ? Tools.I((String[])var7_6) : e2.r(var7_6[0], null, true);
                            var11_13 = new StringBuilder();
                            var11_13.append("Daemon process: ");
                            var11_13.append(var8_11);
                            var11_13.append("; pid=");
                            var9_12 = var8_11 == null ? "n/a" : Integer.valueOf(Tools.D0((Process)var8_11));
                            var11_13.append(var9_12);
                            e1.d(var11_13.toString());
                            var9_12 = new n0();
                            var9_12.a = var8_11;
                            if (var8_11 != null) {
                                var9_12.b = var8_11.getOutputStream();
                                var9_12.c = var8_11.getInputStream();
                                var9_12.d = var8_11.getErrorStream();
                            }
                            if (f0.j((n0)var9_12, var10_5)) {
                                f0.y = var9_12;
                                this.f = Tools.D0((Process)var8_11);
                                if (this.e0() == false) return null;
                                var1_1 = new Runnable(this){
                                    final f0 a;
                                    {
                                        this.a = f02;
                                    }

                                    @Override
                                    public void run() {
                                        Handler handler = n2.c();
                                        handler.removeCallbacks((Runnable)this);
                                        if (this.a.e0()) {
                                            handler.postDelayed((Runnable)this, 1000L);
                                        }
                                    }
                                };
                                n2.h(var1_1);
                                return var9_12;
                            }
                            if (var5_7) break block14;
                            var8_11 = Tools.removeNewLinesChars("h{hf#lg");
                            e1.d("Test 1 start");
                            if (var6_4) {
                                var8_11 = "id";
                            }
                            var9_12 = var6_4 != false ? "" : null;
                            e2.o((String)var8_11, 45, (String)var9_12);
                            e2.a = "";
                            e1.d("Test 1 end");
                            var8_11 = new File((String)var1_1);
                            Tools.q((File)var8_11, 493);
                            Tools.r((String)var1_1, "0755");
                            var5_7 = true;
                            ** GOTO lbl7
                        }
                        if (!Config.C) break block15;
                        if (!var6_4) break block16;
                        var7_6 = this.K(false, (String)var1_1, var10_5);
                        var6_4 = false;
                        ** GOTO lbl7
                    }
                    if (!var2_8 && (var7_6 = f0.S0((String)var1_1)) != null) {
                        var7_6 = this.K(var6_4, (String)var7_6, var10_5);
                        var2_8 = true;
                        ** continue;
                    }
                }
                this.i((String)var1_1, var5_7);
                Thread.sleep(1000L);
                var1_1 = new StringBuilder();
                var1_1.append(e2.a);
                var1_1.append(e2.g((Process)var8_11));
                var1_1 = var1_1.toString();
                e2.a = var1_1;
                e1.d((String)var1_1);
                android.ext.r.k = true;
                e1.i("Show error alert");
                var1_1 = android.ext.f.b().setCustomTitle(Tools.g0(2131296359));
                var7_6 = new StringBuilder();
                var7_6.append(b2.f(2131296441));
                var7_6.append("\n\n");
                var7_6.append(e2.a);
                var8_11 = var1_1.setMessage(var7_6.toString());
                var7_6 = b2.f(2131296424);
                var1_1 = new p0(400);
                var7_6 = var8_11.setPositiveButton((CharSequence)var7_6, (DialogInterface.OnClickListener)var1_1);
                var1_1 = new DialogInterface.OnClickListener(this){
                    final f0 a;
                    {
                        this.a = f02;
                    }

                    public void onClick(DialogInterface dialogInterface, int n3) {
                        ConfigListAdapter.b();
                    }
                };
                android.ext.f.o(var7_6.setNeutralButton((CharSequence)"SU", (DialogInterface.OnClickListener)var1_1).setNegativeButton((CharSequence)b2.f(2131296963), null));
                return null;
            }
        }
        var7_6 = new StringBuilder();
        var7_6.append("");
        var7_6.append(var1_2.getMessage());
        e1.l(var7_6.toString(), var1_2);
        Tools.J1(var1_2.getMessage());
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public long P(byte by, long l3, int n3) {
        if (!this.b.h()) {
            return -1L;
        }
        n2.j(new Runnable(this, by, l3, n3){
            final byte a;
            final long b;
            final int c;
            final f0 d;
            {
                this.d = f02;
                this.a = by;
                this.b = l3;
                this.c = n3;
            }

            @Override
            public void run() {
                InOut inOut = this.d.b;
                inOut.q(this.a, (byte)50, 0);
                inOut.v(this.b);
                inOut.u(this.c);
                inOut.s((byte)0);
                this.d.t0();
            }
        });
        Exchanger exchanger = this.c;
        while (true) {
            try {
                w w3;
                do {
                    byte[] byArray = exchanger.exchange(null, 500L, TimeUnit.MILLISECONDS);
                    w3 = new w(byArray);
                    w3.l(3);
                } while (w3.g() != l3);
                w3.l(4);
                return w3.h();
            }
            catch (Throwable throwable) {
                e1.l("getMemoryContent failed", throwable);
                return -1L;
            }
            catch (TimeoutException timeoutException) {
                return -1L;
            }
            catch (InterruptedException interruptedException) {
                continue;
            }
            break;
        }
    }

    public void P0() {
        this.Q0((byte)0);
    }

    public long Q(long l3, int n3) {
        return this.P((byte)0, l3, n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void Q0(byte by) {
        n2.j(new Runnable(this, by){
            final byte a;
            final f0 b;
            {
                this.b = f02;
                this.a = by;
            }

            @Override
            public void run() {
                f0 f02 = this.b;
                InOut inOut = f02.b;
                f02.L0(this.a, (byte)1);
                this.b.u0(this.a, (byte)45);
                inOut.n(false);
                MainService.instance.q0();
            }
        });
        try {
            Thread.sleep(3L);
            return;
        }
        catch (InterruptedException interruptedException) {
            return;
        }
    }

    public void R(byte by, int[] nArray, long[] lArray) {
        if (nArray.length == lArray.length) {
            n2.j(new Runnable(this, nArray, by, lArray){
                final int[] a;
                final byte b;
                final long[] c;
                final f0 d;
                {
                    this.d = f02;
                    this.a = nArray;
                    this.b = by;
                    this.c = lArray;
                }

                @Override
                public void run() {
                    InOut inOut = this.d.b;
                    int n3 = this.a.length;
                    int n4 = 0;
                    while (n4 < n3) {
                        int n5;
                        int n6 = n5 = n3 - n4;
                        if (n5 > 100000000) {
                            n6 = 100000000;
                        }
                        inOut.q(this.b, (byte)36, (InOut.n + 4) * n6);
                        inOut.u(n6);
                        n6 += n4;
                        while (n4 < n6) {
                            n5 = this.a[n4];
                            if (n5 != 0) {
                                inOut.u(n5);
                                inOut.v(this.c[n4]);
                            }
                            ++n4;
                        }
                        inOut.u(0);
                        this.d.t0();
                        n4 = n6;
                    }
                }
            });
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Size mismatch: ");
        stringBuilder.append(nArray.length);
        stringBuilder.append(" != ");
        stringBuilder.append(lArray.length);
        throw new RuntimeException(stringBuilder.toString());
    }

    public void S(int[] nArray, long[] lArray) {
        this.R((byte)0, nArray, lArray);
    }

    public void T0() {
        this.u0((byte)0, (byte)51);
    }

    public void U() {
        this.V((byte)0);
    }

    public void U0(byte by, int n3, long l3, long l4, double d4, double d5) {
        this.c0();
        n2.j(new Runnable(this, by, n3, this.I(1), l3, l4, d4, d5){
            final byte a;
            final int b;
            final boolean[] c;
            final long d;
            final long e;
            final double f;
            final double g;
            final f0 h;
            {
                this.h = f02;
                this.a = by;
                this.b = n3;
                this.c = blArray;
                this.d = l3;
                this.e = l4;
                this.f = d4;
                this.g = d5;
            }

            @Override
            public void run() {
                InOut inOut = this.h.b;
                inOut.q(this.a, (byte)35, 0);
                inOut.u(this.b | 0x11);
                this.h.W0(this.c);
                inOut.w(this.d);
                inOut.w(this.e);
                inOut.w(Double.doubleToRawLongBits(this.f));
                inOut.w(Double.doubleToRawLongBits(this.g));
                this.h.t0();
            }
        });
    }

    public void V(byte by) {
        this.u0(by, (byte)56);
    }

    public void V0(int n3, long l3, long l4, double d4, double d5) {
        this.U0((byte)0, n3, l3, l4, d4, d5);
    }

    public void W() {
        this.X((byte)0);
    }

    void W0(boolean[] blArray) {
        InOut inOut = this.b;
        int n3 = blArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            inOut.s((byte)(blArray[i3] ? 1 : 0));
        }
    }

    public void X(byte by) {
        this.u0(by, (byte)60);
    }

    public void Y(byte by, int n3, int n4, int n5, long l3, long l4, long l5, int n6, long l6, int n7, int n8, int n9, double d4, int n10) {
        n2.j(new Runnable(this, by, n3, n4, n5, l3, l4, l5, n6, l6, n7, n8, n9, d4, n10){
            final byte a;
            final int b;
            final int c;
            final int d;
            final long e;
            final long f;
            final long g;
            final int h;
            final long i;
            final int j;
            final int k;
            final int l;
            final double m;
            final int n;
            final f0 o;
            {
                this.o = f02;
                this.a = by;
                this.b = n3;
                this.c = n4;
                this.d = n5;
                this.e = l3;
                this.f = l4;
                this.g = l5;
                this.h = n6;
                this.i = l6;
                this.j = n7;
                this.k = n8;
                this.l = n9;
                this.m = d4;
                this.n = n10;
            }

            @Override
            public void run() {
                InOut inOut = this.o.b;
                inOut.q(this.a, (byte)39, 0);
                inOut.u(this.b);
                inOut.u(this.c);
                inOut.u(this.d);
                inOut.w(this.e);
                inOut.w(this.f);
                inOut.w(this.g);
                inOut.u(this.h);
                inOut.w(this.i);
                inOut.u(this.j);
                inOut.u(this.k);
                inOut.u(this.l);
                inOut.w(Double.doubleToRawLongBits(this.m));
                inOut.u(this.n);
                this.o.t0();
            }
        });
    }

    public double Z() {
        return (double)this.n / (double)this.o;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(c object, int n3) {
        if (n3 != 0) {
            object = new k0((c)object, n3);
        }
        ArrayList arrayList = this.q;
        synchronized (arrayList) {
            this.q.add(object);
            return;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public CharSequence a0() {
        void var2_12;
        int n3;
        if (!this.b.h()) {
            void var2_6;
            int n4;
            n0 n02 = this.a;
            if (n02 != null && n02.a != null) {
                if (Config.C) {
                    String string2 = "V";
                } else if (Config.vSpaceReal) {
                    String string3 = "U";
                } else {
                    String string4 = "W";
                }
                n4 = 2130837510;
                return Tools.t((CharSequence)var2_6, Tools.d0(n4));
            }
            if (Config.C) {
                String string5 = "!";
            } else if (Config.vSpaceReal) {
                String string6 = "I";
            } else {
                String string7 = "?";
            }
            n4 = 2130837506;
            return Tools.t((CharSequence)var2_6, Tools.d0(n4));
        }
        if (Config.C) {
            n3 = Tools.d0(2130837508);
            String string8 = "$";
            return Tools.t((CharSequence)var2_12, n3);
        }
        if (Config.vSpaceReal) {
            n3 = Tools.d0(2130837509);
            String string9 = "@";
            return Tools.t((CharSequence)var2_12, n3);
        }
        n3 = Tools.d0(2130837507);
        String string10 = "#";
        return Tools.t((CharSequence)var2_12, n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(h2 h22) {
        ArrayList arrayList = this.r;
        synchronized (arrayList) {
            this.r.add(h22);
            return;
        }
    }

    public int b0() {
        return this.f;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c(h2 h22) {
        ArrayList arrayList = this.s;
        synchronized (arrayList) {
            this.s.add(h22);
            return;
        }
    }

    public void d(byte by, long l3) {
        this.p += l3;
        this.E0(by);
    }

    public boolean d0() {
        boolean bl = !v && !this.b.h();
        if (bl) {
            android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(2131296358)).setMessage((CharSequence)b2.f(2131297094)).setNegativeButton((CharSequence)b2.f(2131296836), null));
        }
        return bl ^ true;
    }

    public void e(long l3) {
        this.d((byte)0, l3);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean e0() {
        Integer n3;
        Object object = y;
        if (object == null) {
            return false;
        }
        Object object2 = ((n0)object).a;
        if (object2 == null) {
            return false;
        }
        try {
            n3 = ((Process)object2).exitValue();
        }
        catch (IllegalThreadStateException illegalThreadStateException) {
            n3 = null;
        }
        if (n3 == null && C == null && B == null) {
            return true;
        }
        if (!android.ext.r.k && !f1.b) {
            int n4;
            StringBuilder stringBuilder;
            CharSequence charSequence;
            block29: {
                if (n3 != null && (n3 == 9 || n3 == 15 || n3 == 137) && Config.h != 0) {
                    Config.b((int)2131034188).d = 0;
                    Config.k();
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("Found SIGKILL/SIGTERM/SIGKILL_OOM: ");
                    ((StringBuilder)charSequence).append(n3);
                    charSequence = ((StringBuilder)charSequence).toString();
                } else {
                    charSequence = null;
                }
                if (charSequence != null) {
                    e1.i(charSequence);
                    n2.i(new Runnable(this){
                        final f0 a;
                        {
                            this.a = f02;
                        }

                        @Override
                        public void run() {
                            MainService.instance.W(MainService.instance.Y);
                        }
                    });
                }
                stringBuilder = new StringBuilder();
                n4 = Tools.D0((Process)object2);
                stringBuilder.append('\n');
                stringBuilder.append(this.g);
                stringBuilder.append(" ( ");
                stringBuilder.append(android.os.Process.myPid());
                stringBuilder.append(" / ");
                stringBuilder.append(n4);
                stringBuilder.append(" / ");
                stringBuilder.append(this.e);
                stringBuilder.append(" )\n");
                stringBuilder.append(n3);
                stringBuilder.append(" / ");
                stringBuilder.append(C);
                stringBuilder.append(" / ");
                stringBuilder.append(B);
                stringBuilder.append('\n');
                stringBuilder.append(MainService.instance.m0 / 1024);
                stringBuilder.append(" / ");
                stringBuilder.append(Tools.r0());
                stringBuilder.append(" / ");
                stringBuilder.append(MainService.instance.l0 / 1024);
                stringBuilder.append('\n');
                object2 = e0.h();
                stringBuilder.append((String)object2);
                stringBuilder.append('\n');
                stringBuilder.append(w0.a(object2, "S$H$A$-$3$8$4".replace("$", "")));
                stringBuilder.append('\n');
                object2 = new File((String)object2);
                stringBuilder.append(((File)object2).length());
                stringBuilder.append('\n');
                stringBuilder.append(w0.a(object2, "S#H#A#-#3#8#4".replace("#", "")));
                if (n3 != null) {
                    stringBuilder.append("\nOutput:\n");
                    object = new BufferedReader(new InputStreamReader(((n0)object).d));
                    try {
                        while (true) {
                            object2 = ((BufferedReader)object).readLine();
                            if (object2 == null) break block29;
                            {
                                catch (OutOfMemoryError outOfMemoryError) {
                                    e1.s("Failed get err for daemon exit", outOfMemoryError);
                                    stringBuilder.append(outOfMemoryError);
                                    stringBuilder.append('\n');
                                    break block29;
                                }
                            }
                            try {
                                stringBuilder.append((String)object2);
                                stringBuilder.append('\n');
                                continue;
                            }
                            catch (OutOfMemoryError outOfMemoryError) {
                                e1.s("Failed get err for daemon exit", outOfMemoryError);
                                stringBuilder.append(outOfMemoryError);
                                stringBuilder.append('\n');
                                continue;
                            }
                            break;
                        }
                    }
                    catch (IOException iOException) {}
                    e1.l("checkProcess", iOException);
                }
            }
            stringBuilder.append("\nDEBUG:\n");
            stringBuilder.append(h0.f(false));
            try {
                object = stringBuilder.toString();
            }
            catch (OutOfMemoryError outOfMemoryError) {
                e1.s("Failed get string for daemon exit", outOfMemoryError);
                object = ((Object)outOfMemoryError).toString();
            }
            try {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Daemon closed");
                stringBuilder.append((String)object);
                e1.i(stringBuilder.toString());
            }
            catch (OutOfMemoryError outOfMemoryError) {
                e1.s("Failed out string for daemon exit", outOfMemoryError);
            }
            if (!android.ext.n0.d((String)object) && charSequence == null) {
                try {
                    if (((String)object).contains("backtrace:") && ((String)object).contains(this.g) && !((String)object).contains("SIGPIPE")) {
                        android.ext.n0.i((String)object);
                    }
                }
                catch (OutOfMemoryError outOfMemoryError) {
                    e1.s("Failed send string for daemon exit", outOfMemoryError);
                }
            }
            try {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(b2.f(2131296362));
                ((StringBuilder)charSequence).append('\n');
                ((StringBuilder)charSequence).append((String)object);
                charSequence = ((StringBuilder)charSequence).toString();
                object = charSequence;
            }
            catch (OutOfMemoryError outOfMemoryError) {
                e1.s("Failed out string for daemon exit", outOfMemoryError);
            }
            android.ext.r.k = true;
            e1.i("Show error alert");
            android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(2131296357)).setMessage((CharSequence)object).setPositiveButton((CharSequence)b2.f(2131296424), (DialogInterface.OnClickListener)new p0(500)).setNegativeButton((CharSequence)b2.f(2131296963), null));
            this.b.n(false);
            MainService.instance.q0();
            if (n3 != null && (n3 == 9 || n3 == 15 || n3 == 137)) {
                object = android.ext.f.b().setCustomTitle(Tools.g0(2131296357));
                n4 = n3 == 137 ? 2131296361 : 2131296360;
                android.ext.f.o(object.setMessage((CharSequence)b2.f(n4)).setNegativeButton((CharSequence)b2.f(2131296836), null));
            }
        }
        return false;
    }

    public void f(byte by, long l3, int n3) {
        n2.j(new Runnable(this, by, n3, l3){
            final byte a;
            final int b;
            final long c;
            final f0 d;
            {
                this.d = f02;
                this.a = by;
                this.b = n3;
                this.c = l3;
            }

            @Override
            public void run() {
                InOut inOut = this.d.b;
                inOut.q(this.a, (byte)32, 0);
                inOut.u(this.b);
                inOut.v(this.c);
                this.d.t0();
            }
        });
    }

    public void f0(byte by, List object) {
        object = f0.M0((List)object, e0.m());
        if (((j0)object).a.length == 0) {
            return;
        }
        if (((j0)object).c == 0) {
            this.l(by);
            return;
        }
        n2.j(new Runnable(this, (j0)object, by){
            final j0 a;
            final byte b;
            final f0 c;
            {
                this.c = f02;
                this.a = j02;
                this.b = by;
            }

            @Override
            public void run() {
                InOut inOut = this.c.b;
                int n3 = this.a.a.length;
                int n4 = 0;
                while (n4 < n3) {
                    int n5;
                    int n6 = n5 = n3 - n4;
                    if (n5 > 100000000) {
                        n6 = 100000000;
                    }
                    inOut.q(this.b, (byte)33, (InOut.n + 4) * n6);
                    inOut.u(n6);
                    Object object = this.a;
                    int[] nArray = ((j0)object).b;
                    object = ((j0)object).a;
                    n6 += n4;
                    while (n4 < n6) {
                        inOut.u(nArray[n4]);
                        inOut.v((long)object[n4]);
                        ++n4;
                    }
                    this.c.t0();
                    n4 = n6;
                }
            }
        });
        MainService.N0(((j0)object).c, by);
        i2.l = null;
    }

    public void g(long l3, int n3) {
        this.f((byte)0, l3, n3);
    }

    public void g0() {
        e1.d("messageFailed");
        this.e0();
        MainService.instance.s();
    }

    public void h() {
        this.d = true;
        this.v();
    }

    /*
     * Exception decompiling
     */
    void h0(byte[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 176->183)] java.nio.BufferUnderflowException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    void i(String charSequence, boolean bl) {
        int n3;
        Comparable<File> comparable = new File((String)charSequence);
        if (!((File)comparable).exists()) {
            n3 = 2131296450;
        } else if (!((File)comparable).isFile()) {
            n3 = 2131296818;
        } else {
            Object object = Tools.F0((String)charSequence);
            Object[] objectArray = new String[]{"ls", "-l", object};
            try {
                Object object2 = Tools.I((String[])objectArray);
                InputStreamReader inputStreamReader = new InputStreamReader(((Process)object2).getInputStream());
                object = new BufferedReader(inputStreamReader);
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("ls for '");
                ((StringBuilder)object2).append((String)charSequence);
                ((StringBuilder)object2).append("' got: ");
                ((StringBuilder)object2).append(((BufferedReader)object).readLine());
                e1.p(((StringBuilder)object2).toString());
                ((BufferedReader)object).close();
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("run '");
                stringBuilder.append(Arrays.toString(objectArray));
                stringBuilder.append("' error");
                e1.l(stringBuilder.toString(), exception);
            }
            n3 = !((File)comparable).canExecute() ? 2131296817 : 0;
        }
        if (n3 != 0) {
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append(Tools.N1(n3));
            ((StringBuilder)comparable).append(": '");
            ((StringBuilder)comparable).append((String)charSequence);
            ((StringBuilder)comparable).append("'\n\n");
            ((StringBuilder)comparable).append(b2.f(2131296320));
            if (n3 == 2131296817) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("\n\n");
                ((StringBuilder)charSequence).append(b2.f(2131296941));
                charSequence = ((StringBuilder)charSequence).toString();
            } else {
                charSequence = "";
            }
            ((StringBuilder)comparable).append((String)charSequence);
            throw new l0(((StringBuilder)comparable).toString());
        }
    }

    public void i0(byte by, List object) {
        object = f0.M0((List)object, false);
        if (((j0)object).a.length == 0) {
            return;
        }
        n2.j(new Runnable(this, (j0)object, by){
            final j0 a;
            final byte b;
            final f0 c;
            {
                this.c = f02;
                this.a = j02;
                this.b = by;
            }

            @Override
            public void run() {
                InOut inOut = this.c.b;
                int n3 = this.a.a.length;
                int n4 = 0;
                while (n4 < n3) {
                    int n5;
                    int n6 = n5 = n3 - n4;
                    if (n5 > 100000000) {
                        n6 = 100000000;
                    }
                    inOut.q(this.b, (byte)52, (InOut.n + 4) * n6);
                    inOut.u(n6);
                    Object object = this.a;
                    int[] nArray = ((j0)object).b;
                    object = ((j0)object).a;
                    n6 += n4;
                    while (n4 < n6) {
                        inOut.u(nArray[n4]);
                        inOut.v((long)object[n4]);
                        ++n4;
                    }
                    this.c.t0();
                    n4 = n6;
                }
            }
        });
    }

    public void j0(List list) {
        this.i0((byte)0, list);
    }

    public void k0() {
        this.l0((byte)0);
    }

    public void l(byte by) {
        this.u0(by, (byte)44);
        i2.l = null;
    }

    public void l0(byte by) {
        this.n = 1;
        this.o = 1;
        this.p = 0L;
        y2.i();
        this.b.r();
        this.u0(by, (byte)42);
        i2.l = null;
    }

    public void m() {
        this.h = 0;
        this.i = 0;
    }

    public void n() {
        this.o((byte)0);
    }

    public void n0(byte by, int n3, int n4, int[] objectArray, long[] lArray, long[] lArray2, long l3, long l4, long l5) {
        int n5 = 0;
        boolean bl = (n3 & 0x400000) != 0;
        if (bl && n4 != lArray.length) {
            bl = false;
        }
        if (bl) {
            int n6 = objectArray.length;
            for (int i3 = 0; i3 < n6; ++i3) {
                if (((objectArray[i3] | n3) & 0xFFBFFFFE) == 0) {
                    continue;
                }
                break;
            }
        } else if (bl) {
            n4 = lArray.length;
            objectArray = new byte[n4];
            for (n3 = n5; n3 < n4; ++n3) {
                objectArray[n3] = (byte)lArray[n3];
            }
            this.s0(by, 1, (byte[])objectArray, l3, l4, l5);
            return;
        }
        n2.j(new Runnable(this, (int[])objectArray, by, n3, n4, l3, l4, l5, lArray, lArray2){
            final int[] a;
            final byte b;
            final int c;
            final int d;
            final long e;
            final long f;
            final long g;
            final long[] h;
            final long[] i;
            final f0 j;
            {
                this.j = f02;
                this.a = nArray;
                this.b = by;
                this.c = n3;
                this.d = n4;
                this.e = l3;
                this.f = l4;
                this.g = l5;
                this.h = lArray;
                this.i = lArray2;
            }

            @Override
            public void run() {
                InOut inOut = this.j.b;
                int n3 = this.a.length;
                y y3 = new y();
                y3.a(b2.f(2131297050));
                y3.a(" = ");
                inOut.q(this.b, (byte)55, 0);
                inOut.u(this.c);
                inOut.u(this.d);
                inOut.v(this.e);
                inOut.v(this.f);
                inOut.v(this.g);
                inOut.u(n3);
                for (int i3 = 0; i3 < n3; ++i3) {
                    Object object = this.h;
                    object[i3] = android.ext.c.h(object[i3], this.a[i3]);
                    object = this.i;
                    object[i3] = android.ext.c.h(object[i3], this.a[i3]);
                    inOut.u(this.a[i3]);
                    inOut.w(this.h[i3]);
                    inOut.w(this.i[i3]);
                    Object object2 = android.ext.c.K(0L, this.h[i3], this.a[i3]);
                    object = object2;
                    if ((this.a[i3] & 0x30000000) != 0) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append((String)object2);
                        ((StringBuilder)object).append('~');
                        ((StringBuilder)object).append(android.ext.c.K(0L, this.i[i3], this.a[i3]));
                        object = ((StringBuilder)object).toString();
                    }
                    object2 = object;
                    if ((this.a[i3] & 0x10000000) != 0) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("≠ ");
                        ((StringBuilder)object2).append((String)object);
                        object2 = ((StringBuilder)object2).toString();
                    }
                    if (i3 != 0) {
                        y3.a("; ");
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append((String)object2);
                    ((StringBuilder)object).append((Object)android.ext.c.A(this.a[i3]));
                    y3.a(Tools.t(((StringBuilder)object).toString(), android.ext.c.n(this.a[i3])));
                }
                this.j.t0();
                y3.a(" :");
                if ((this.c & 0x400000) != 0) {
                    y3.a(":");
                }
                y3.a(Tools.L1("%,d", this.d));
                MainService.instance.h0(y3.d());
                w = false;
            }
        });
        i2.l = null;
    }

    public void o(byte by) {
        this.u0(by, (byte)46);
    }

    public void o0(byte by, long l3, long l4, int n3, long l5, long l6, long l7) {
        Object object;
        Serializable serializable = new StringBuilder();
        serializable.append("searchMask: ");
        serializable.append(Long.toHexString(l3));
        serializable.append(':');
        serializable.append(Long.toHexString(l4));
        serializable.append(" as ");
        serializable.append(Integer.toHexString(n3));
        serializable.append(" in ");
        serializable.append(Long.toHexString(l5));
        serializable.append('-');
        serializable.append(Long.toHexString(l6));
        serializable.append(", ");
        serializable.append(Long.toString(l7));
        e1.d(serializable.toString());
        Object object2 = android.ext.c.B();
        serializable = null;
        for (int i3 = 0; i3 < ((e)((Object)object2)).size(); ++i3) {
            int n4 = object2.keyAt(i3);
            object = serializable;
            if (n4 != 0) {
                object = serializable;
                if ((n3 & n4) == n4) {
                    object = (CharSequence)object2.valueAt(i3);
                }
            }
            serializable = object;
        }
        object2 = Long.toHexString(l3);
        object = Locale.US;
        String string2 = ((String)object2).toUpperCase((Locale)object);
        String string3 = Long.toHexString(l4).toUpperCase((Locale)object);
        if (string2.length() < string3.length()) {
            object = new StringBuilder();
            ((StringBuilder)object).append(new String(new char[string3.length() - string2.length()]).replace('\u0000', '0'));
            ((StringBuilder)object).append(string2);
            object2 = ((StringBuilder)object).toString();
            object = string3;
        } else {
            object2 = string2;
            object = string3;
            if (string2.length() > string3.length()) {
                object = new StringBuilder();
                ((StringBuilder)object).append(new String(new char[string2.length() - string3.length()]).replace('\u0000', '0'));
                ((StringBuilder)object).append(string3);
                object = ((StringBuilder)object).toString();
                object2 = string2;
            }
        }
        MainService.instance.h0(new y().b("%s %s %s; %s: %s; %s: %s", new CharSequence[]{Tools.N1(2131296264), serializable, object2, Tools.N1(2131296765), object, Tools.N1(2131297025), android.ext.c.v(n3 & 0x7F)}).d());
        n2.j(new Runnable(this, by, l3, l4, n3, l5, l6, l7){
            final byte a;
            final long b;
            final long c;
            final int d;
            final long e;
            final long f;
            final long g;
            final f0 h;
            {
                this.h = f02;
                this.a = by;
                this.b = l3;
                this.c = l4;
                this.d = n3;
                this.e = l5;
                this.f = l6;
                this.g = l7;
            }

            @Override
            public void run() {
                InOut inOut = this.h.b;
                inOut.q(this.a, (byte)63, 0);
                inOut.v(this.b);
                inOut.v(this.c);
                inOut.u(this.d);
                inOut.v(this.e);
                inOut.v(this.f);
                inOut.v(this.g);
                this.h.t0();
                w = false;
            }
        });
        i2.l = null;
    }

    public void p(byte by, long l3, long l4, int n3) {
        n2.j(new Runnable(this, by, l3, l4, n3){
            final byte a;
            final long b;
            final long c;
            final int d;
            final f0 e;
            {
                this.e = f02;
                this.a = by;
                this.b = l3;
                this.c = l4;
                this.d = n3;
            }

            @Override
            public void run() {
                InOut inOut = this.e.b;
                inOut.q(this.a, (byte)62, 0);
                inOut.v(this.b);
                inOut.v(this.c);
                inOut.u(this.d);
                this.e.t0();
            }
        });
    }

    public void p0(byte by, long l3, int n3, int n4, long l4, long l5, long l6) {
        CharSequence charSequence;
        CharSequence charSequence2;
        Object object = android.ext.c.B();
        String string2 = "";
        if ((n4 & 0x2000000) != 0) {
            charSequence2 = new StringBuilder();
            charSequence2.append("");
            charSequence2.append(object.get(0x20000000));
            charSequence2.append('*');
            charSequence2 = charSequence2.toString();
        } else {
            charSequence2 = null;
            for (int i3 = 0; i3 < ((e)((Object)object)).size(); ++i3) {
                int n5 = object.keyAt(i3);
                charSequence = charSequence2;
                if (n5 != 0) {
                    charSequence = charSequence2;
                    if ((n4 & n5) == n5) {
                        charSequence = (CharSequence)object.valueAt(i3);
                    }
                }
                charSequence2 = charSequence;
            }
        }
        c c4 = new c(0L, l3, n4 & 0x7F);
        object = new y();
        String string3 = b2.f(2131297080);
        String string4 = c4.J();
        if (n3 == 0) {
            charSequence = string2;
        } else {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(" X");
            ((StringBuilder)charSequence).append(n3);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        ((y)object).b("%s %s %s", string3, charSequence2, Tools.t(Tools.L1("%s%s %s", string4, charSequence, c4.u()), c4.m()));
        MainService.instance.h0(((y)object).d());
        this.y0(by, l3, 0L, n3, n4, l4, l5, l6);
    }

    public void q(long l3, long l4, int n3) {
        this.p((byte)0, l3, l4, n3);
    }

    public void q0(byte by, short s3, int n3, long l3, long l4, long l5) {
        String string2 = Integer.toHexString(s3);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("searchPointer: ");
        stringBuilder.append(string2);
        stringBuilder.append(" as ");
        stringBuilder.append(Integer.toHexString(n3));
        stringBuilder.append(" in ");
        stringBuilder.append(Long.toHexString(l3));
        stringBuilder.append('-');
        stringBuilder.append(Long.toHexString(l4));
        stringBuilder.append(", ");
        stringBuilder.append(Long.toString(l5));
        e1.d(stringBuilder.toString());
        MainService mainService = MainService.instance;
        stringBuilder = new StringBuilder();
        stringBuilder.append("-> ");
        stringBuilder.append(string2);
        mainService.h0(stringBuilder.toString());
        n2.j(new Runnable(this, by, s3, n3, l3, l4, l5){
            final byte a;
            final short b;
            final int c;
            final long d;
            final long e;
            final long f;
            final f0 g;
            {
                this.g = f02;
                this.a = by;
                this.b = s3;
                this.c = n3;
                this.d = l3;
                this.e = l4;
                this.f = l5;
            }

            @Override
            public void run() {
                InOut inOut = this.g.b;
                inOut.q(this.a, (byte)64, 0);
                inOut.u(this.b);
                inOut.u(this.c);
                inOut.v(this.d);
                inOut.v(this.e);
                inOut.v(this.f);
                this.g.t0();
                w = false;
            }
        });
        i2.l = null;
    }

    public void r0(byte by, long l3, long l4, int n3, int n4, long l5, long l6, long l7) {
        Object object;
        int n5;
        Object object2 = android.ext.c.B();
        if ((n4 & 0x2000000) != 0) {
            n4 &= 0xFDFFFFFF;
        }
        c c4 = null;
        for (n5 = 0; n5 < ((e)((Object)object2)).size(); ++n5) {
            int n6 = object2.keyAt(n5);
            object = c4;
            if (n6 != 0) {
                object = c4;
                if ((n4 & n6) == n6) {
                    object = (CharSequence)object2.valueAt(n5);
                }
            }
            c4 = object;
        }
        n5 = n4 & 0x7F;
        object2 = new c(0L, l3, n5);
        object = new c(0L, l4, n5);
        y y3 = new y();
        String string2 = b2.f(2131297080);
        String string3 = ((c)object2).J();
        String string4 = ((c)object).J();
        if (n3 == 0) {
            object = "";
        } else {
            object = new StringBuilder();
            ((StringBuilder)object).append(" X");
            ((StringBuilder)object).append(n3);
            object = ((StringBuilder)object).toString();
        }
        y3.b("%s %s %s", new CharSequence[]{string2, c4, Tools.t(Tools.L1("%s ~ %s%s %s", string3, string4, object, ((c)object2).u()), ((c)object2).m())});
        MainService.instance.h0(y3.d());
        this.y0(by, l3, l4, n3, n4 | 0x800000, l5, l6, l7);
    }

    public void s() {
        this.t((byte)0);
    }

    public void s0(byte by, int n3, byte[] byArray, long l3, long l4, long l5) {
        CharSequence charSequence;
        CharSequence charSequence2 = charSequence = x0.b(null, n3, byArray, byArray.length, true, true, null).toString();
        if (((String)charSequence).length() > 48) {
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append(((String)charSequence).substring(0, 48));
            ((StringBuilder)charSequence2).append("...");
            charSequence2 = ((StringBuilder)charSequence2).toString();
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("searchText: [");
        ((StringBuilder)charSequence).append(byArray.length);
        ((StringBuilder)charSequence).append("] = ");
        ((StringBuilder)charSequence).append((String)charSequence2);
        ((StringBuilder)charSequence).append(" in ");
        ((StringBuilder)charSequence).append(Long.toHexString(l3));
        ((StringBuilder)charSequence).append('-');
        ((StringBuilder)charSequence).append(Long.toHexString(l4));
        ((StringBuilder)charSequence).append(", ");
        ((StringBuilder)charSequence).append(Long.toString(l5));
        e1.d(((StringBuilder)charSequence).toString());
        if (byArray.length == 0) {
            return;
        }
        if (byArray.length == 1) {
            this.p0(by, byArray[0], 0, 0x20000001, l3, l4, l5);
            return;
        }
        MainService.instance.h0(Tools.L1("%s[%d] = %s", Tools.N1(2131297005), byArray.length, charSequence2));
        n2.j(new Runnable(this, by, n3, l3, l4, l5, byArray){
            final byte a;
            final int b;
            final long c;
            final long d;
            final long e;
            final byte[] f;
            final f0 g;
            {
                this.g = f02;
                this.a = by;
                this.b = n3;
                this.c = l3;
                this.d = l4;
                this.e = l5;
                this.f = byArray;
            }

            @Override
            public void run() {
                InOut inOut = this.g.b;
                inOut.q(this.a, (byte)34, 0);
                inOut.u(this.b);
                inOut.v(this.c);
                inOut.v(this.d);
                inOut.v(this.e);
                inOut.u(this.f.length);
                byte[] byArray = this.f;
                inOut.t(byArray, byArray.length);
                this.g.t0();
                w = false;
            }
        });
        i2.l = null;
    }

    public void t(byte by) {
        this.u0(by, (byte)49);
    }

    void t0() {
        InOut inOut = this.b;
        if (C != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Last send error: ");
            stringBuilder.append(C);
            e1.i(stringBuilder.toString());
            inOut.d();
            return;
        }
        try {
            inOut.l();
            C = null;
        }
        catch (Throwable throwable) {
            inOut.d();
            e1.l("Send error", throwable);
            C = throwable.toString();
            n2.d().post(new Runnable(this){
                final f0 a;
                {
                    this.a = f02;
                }

                @Override
                public void run() {
                    this.a.g0();
                }
            });
        }
    }

    void u0(byte by, byte by2) {
        n2.j(new Runnable(this, by, by2){
            final byte a;
            final byte b;
            final f0 c;
            {
                this.c = f02;
                this.a = by;
                this.b = by2;
            }

            @Override
            public void run() {
                this.c.b.q(this.a, this.b, 0);
                this.c.t0();
            }
        });
    }

    void v0(byte by) {
        n2.j(new Runnable(this, by){
            final byte a;
            final f0 b;
            {
                this.b = f02;
                this.a = by;
            }

            @Override
            public void run() {
                InOut inOut = this.b.b;
                inOut.q(this.a, (byte)47, 0);
                inOut.u(android.os.Process.myPid());
                inOut.u(this.b.f);
                this.b.t0();
            }
        });
    }

    /*
     * Unable to fully structure code
     */
    public void w(byte var1_1, long var2_2, long var4_3, int var6_4, String var7_5, String var8_6) {
        if (var7_5.contains("/emulated/legacy")) {
            var9_7 = new StringBuilder();
            var9_7.append((String)var7_5);
            var9_7.append('|');
            var10_8 = var7_5.replace("/emulated/legacy", "/emulated/0");
lbl8:
            // 2 sources

            while (true) {
                var9_7.append(var10_8);
                var9_7 = var9_7.toString();
                break;
            }
        } else {
            if (var7_5.contains("/emulated/0")) {
                var9_7 = new StringBuilder();
                var9_7.append((String)var7_5);
                var9_7.append('|');
                var10_8 = var7_5.replace("/emulated/0", "/emulated/legacy");
                ** continue;
            }
            var9_7 = var7_5;
        }
        var9_7 = var9_7.getBytes();
        if (((Object)var9_7).length == 0) {
            return;
        }
        if (((Object)var9_7).length > 4000) {
            var7_5 = new StringBuilder();
            var7_5.append("path big: ");
            var7_5.append(((Object)var9_7).length);
            var7_5.append(" > ");
            var7_5.append(4000);
            e1.i(var7_5.toString());
            return;
        }
        if (((Object)(var8_6 = (Object)var8_6.getBytes())).length > 4000) {
            var7_5 = new StringBuilder();
            var7_5.append("pkg big: ");
            var7_5.append(((Object)var8_6).length);
            var7_5.append(" > ");
            var7_5.append(4000);
            e1.i(var7_5.toString());
            return;
        }
        n2.j(new Runnable(this, (byte[])var9_7, (byte[])var8_6, var1_1, var2_2, var4_3, var6_4, (String)var7_5){
            final byte[] a;
            final byte[] b;
            final byte c;
            final long d;
            final long e;
            final int f;
            final String g;
            final f0 h;
            {
                this.h = f02;
                this.a = byArray;
                this.b = byArray2;
                this.c = by;
                this.d = l3;
                this.e = l4;
                this.f = n3;
                this.g = string2;
            }

            @Override
            public void run() {
                InOut inOut = this.h.b;
                int n3 = this.a.length;
                int n4 = this.b.length;
                inOut.q(this.c, (byte)61, 0);
                inOut.v(this.d);
                inOut.v(this.e);
                inOut.u(this.f);
                inOut.u(n3);
                inOut.t(this.a, n3);
                inOut.u(n4);
                inOut.t(this.b, n4);
                this.h.t0();
                MainService.instance.h0(Tools.L1("%s: %s - %s > %s", b2.f(2131296392), android.ext.c.G(this.d, 4), android.ext.c.G(this.e, 4), this.g));
            }
        });
    }

    public void w0() {
        this.x0((byte)0);
    }

    public void x(long l3, long l4, int n3, String string2, String string3) {
        this.w((byte)0, l3, l4, n3, string2, string3);
    }

    public void x0(byte by) {
        if (this.u == null || Config.h != this.u) {
            if (this.u != null) {
                MainService.instance.m();
            }
            this.u = Config.h;
        }
        String string2 = Tools.q0().getAbsolutePath();
        n2.j(new Runnable(this, by, string2.getBytes(), string2){
            final byte a;
            final byte[] b;
            final String c;
            final f0 d;
            {
                this.d = f02;
                this.a = by;
                this.b = byArray;
                this.c = string2;
            }

            @Override
            public void run() {
                Object object = this.d.b;
                ((InOut)object).q(this.a, (byte)54, 0);
                ((InOut)object).u(Config.h);
                ((InOut)object).u(Config.A);
                ((InOut)object).w(Config.j);
                ((InOut)object).u(Config.m);
                ((InOut)object).u(Config.i);
                ((InOut)object).u(this.b.length);
                byte[] byArray = this.b;
                ((InOut)object).t(byArray, byArray.length);
                long l3 = ((InOut)object).e();
                object = this.d;
                if (l3 != ((f0)object).t) {
                    ((f0)object).t = l3;
                    ((f0)object).t0();
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Sended config: ");
                    ((StringBuilder)object).append(Config.h);
                    ((StringBuilder)object).append(' ');
                    ((StringBuilder)object).append(Integer.toBinaryString(Config.A));
                    ((StringBuilder)object).append(' ');
                    ((StringBuilder)object).append(Long.toBinaryString(Config.j));
                    ((StringBuilder)object).append(' ');
                    ((StringBuilder)object).append(Config.m);
                    ((StringBuilder)object).append(' ');
                    ((StringBuilder)object).append(Config.i);
                    ((StringBuilder)object).append(' ');
                    ((StringBuilder)object).append(this.c);
                    ((StringBuilder)object).append("; ");
                    ((StringBuilder)object).append(this.b.length);
                    e1.d(((StringBuilder)object).toString());
                }
            }
        });
    }

    public void z() {
        this.b.r();
        if (this.e <= 0) {
            return;
        }
        File file = new File(Tools.q0(), "OOM.tmp");
        try {
            Object object = new FileOutputStream(file);
            ((FileOutputStream)object).write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(this.e).array());
            ((FileOutputStream)object).close();
            object = new File(Tools.q0(), "OOM");
            if (!file.renameTo((File)object)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Failed rename OOM file: ");
                ((StringBuilder)object).append(file);
                String string2 = ((StringBuilder)object).toString();
                object = new RuntimeException();
                e1.s(string2, (Throwable)object);
                file.delete();
            }
        }
        catch (IOException iOException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed make OOM file: ");
            stringBuilder.append(file);
            e1.s(stringBuilder.toString(), iOException);
        }
    }

    static class j0 {
        long[] a;
        int[] b;
        int c;

        public j0(long[] lArray, int[] nArray) {
            this.a = lArray;
            this.b = nArray;
        }
    }

    private static class k0 {
        final c a;
        final int b;

        public k0(c c4, int n3) {
            this.a = c4;
            this.b = n3;
        }
    }

    private static class l0
    extends Exception {
        public l0(String string2) {
            super(string2);
        }
    }

    static class m0
    implements Comparable {
        long a;
        int b;

        public m0(long l3, int n3) {
            this.a = l3;
            this.b = n3;
        }

        public int a(m0 m02) {
            long l3 = this.a - m02.a;
            long l4 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
            l4 = l4 < 0 ? (long)-1 : (l4 == false ? (long)0 : (long)1);
            return (int)l4;
        }
    }

    static final class n0 {
        Process a;
        OutputStream b;
        InputStream c;
        InputStream d;

        n0() {
        }
    }
}

