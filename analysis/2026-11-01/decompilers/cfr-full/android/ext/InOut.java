/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.e1;
import android.ext.x0;
import android.os.Build;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.zip.CRC32;

public class InOut {
    public static volatile int byteOrderMask = 15;
    public static volatile boolean m;
    public static volatile int n;
    static boolean o;
    private InputStream a = null;
    private OutputStream b = null;
    private byte[] c;
    private ByteBuffer d;
    private byte[] e;
    private ByteBuffer f;
    private byte[] g;
    private int h;
    private boolean i;
    private final ArrayList j;
    private volatile boolean k;
    private CRC32 l = null;

    static {
        boolean bl;
        block4: {
            block3: {
                String[] stringArray = Build.SUPPORTED_64_BIT_ABIS;
                if (stringArray == null) break block3;
                try {
                    int n3 = stringArray.length;
                    if (n3 <= 0) break block3;
                    bl = true;
                    break block4;
                }
                catch (Throwable throwable) {
                    e1.a(throwable);
                }
            }
            bl = false;
        }
        InOut.p(bl);
        o = false;
    }

    public InOut() {
        Object object = new byte[4];
        this.c = object;
        Object object2 = ByteBuffer.wrap(object);
        this.d = object2;
        object = ByteOrder.LITTLE_ENDIAN;
        ((ByteBuffer)object2).order((ByteOrder)object);
        object2 = new byte[8];
        this.e = (byte[])object2;
        this.f = object2 = ByteBuffer.wrap((byte[])object2);
        ((ByteBuffer)object2).order((ByteOrder)object);
        this.g = new byte[1024];
        this.j = new ArrayList();
        this.k = false;
    }

    static String b(byte[] byArray, int n3, int n4) {
        Object object;
        if (byArray.length - 1 < n3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bytesToHex failed: ");
            stringBuilder.append(byArray.length);
            stringBuilder.append(' ');
            stringBuilder.append(n3);
            stringBuilder.append(' ');
            stringBuilder.append(n4);
            e1.p(stringBuilder.toString());
            return "";
        }
        int n5 = n4;
        if (byArray.length < n3 + n4) {
            object = new StringBuilder();
            ((StringBuilder)object).append("bytesToHex fix len: ");
            ((StringBuilder)object).append(byArray.length);
            ((StringBuilder)object).append(' ');
            ((StringBuilder)object).append(n3);
            ((StringBuilder)object).append(' ');
            ((StringBuilder)object).append(n4);
            e1.p(((StringBuilder)object).toString());
            n5 = byArray.length - n3;
        }
        char[] cArray = new char[n5 * 3];
        object = x0.a;
        for (n4 = 0; n4 < n5; ++n4) {
            byte by = byArray[n3 + n4];
            int n6 = n4 * 3;
            cArray[n6] = (char)object[(by & 0xFF) >>> 4];
            cArray[n6 + 1] = (char)object[by & 0xF];
            cArray[n6 + 2] = 32;
        }
        return new String(cArray);
    }

    private void c(int n3, boolean bl) {
        int n4 = this.h;
        byte[] byArray = this.g;
        if ((n3 += n4) > byArray.length || bl) {
            byte[] byArray2 = new byte[n3 + 1024];
            if (n4 > 0) {
                System.arraycopy(byArray, 0, byArray2, 0, n4);
            }
            this.g = byArray2;
        }
    }

    private static EOFException f() {
        return new EOFException("daemon stream closed (EOF)");
    }

    public static String g(byte[] byArray, int n3, int n4) {
        int n5;
        StringBuilder stringBuilder;
        if (byArray.length - 1 < n3) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("dump failed: ");
            stringBuilder2.append(byArray.length);
            stringBuilder2.append(' ');
            stringBuilder2.append(n3);
            stringBuilder2.append(' ');
            stringBuilder2.append(n4);
            e1.p(stringBuilder2.toString());
            return "";
        }
        int n6 = n4;
        if (byArray.length < n3 + n4) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("dump fix len: ");
            stringBuilder.append(byArray.length);
            stringBuilder.append(' ');
            stringBuilder.append(n3);
            stringBuilder.append(' ');
            stringBuilder.append(n4);
            e1.p(stringBuilder.toString());
            n6 = byArray.length - n3;
        }
        stringBuilder = new StringBuilder();
        for (n4 = n3; n4 < n6; n4 += n5) {
            int n7;
            n5 = n7 = n6 - n4;
            if (n7 > 32) {
                n5 = 32;
            }
            n7 = n3 + n4;
            stringBuilder.append(InOut.b(byArray, n7, n5));
            stringBuilder.append('\'');
            stringBuilder.append(new String(byArray, n7, n5));
            stringBuilder.append("'\n");
        }
        return stringBuilder.toString();
    }

    private byte i() {
        int n3 = this.a.read();
        if (n3 != -1) {
            return (byte)n3;
        }
        throw InOut.f();
    }

    private int j() {
        int n3;
        for (int i3 = 0; i3 < 4; i3 += n3) {
            n3 = this.a.read(this.c, i3, 4 - i3);
            if (n3 >= 0) {
                if (n3 == 0) break;
                continue;
            }
            throw InOut.f();
        }
        return this.d.getInt(0);
    }

    static void p(boolean bl) {
        m = bl;
        int n3 = bl ? 8 : 4;
        n = n3;
    }

    public void d() {
        this.h = 0;
    }

    public long e() {
        if (this.h < 2) {
            return 0L;
        }
        CRC32 cRC32 = this.l;
        if (cRC32 == null) {
            this.l = cRC32 = new CRC32();
        } else {
            cRC32.reset();
        }
        cRC32.update(this.g, 2, this.h);
        return cRC32.getValue();
    }

    public boolean h() {
        return this.k;
    }

    /*
     * Enabled aggressive block sorting
     */
    public byte[] k() {
        int n3;
        int n4;
        Object object;
        byte by;
        Object object2 = null;
        int n5 = 0;
        while ((by = this.i()) != 2) {
            if (object2 == null && (by == 10 || by == 59)) continue;
            object = object2;
            if (object2 == null) {
                object = new byte[4096];
            }
            if (n5 < ((StringBuilder)object).length) {
                object[n5] = by;
            }
            if ((n4 = n5 + 1) < ((Object)object).length) {
                object2 = object;
                n5 = n4;
                if (n4 % 10 != 0) continue;
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Bad input from daemon: ");
            ((StringBuilder)object2).append(by);
            ((StringBuilder)object2).append('\n');
            ((StringBuilder)object2).append(InOut.g((byte[])object, 0, n4));
            e1.d(((StringBuilder)object2).toString());
            object2 = object;
            n5 = n4;
        }
        if (object2 != null) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Bad input from daemon 2: ");
            ((StringBuilder)object).append(n5);
            ((StringBuilder)object).append('\n');
            ((StringBuilder)object).append(InOut.g((byte[])object2, 0, n5));
            e1.d(((StringBuilder)object).toString());
        }
        if ((n3 = this.j()) > 0xA00000 || n3 < 2) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Bad len from daemon: ");
            ((StringBuilder)object2).append(n3);
            ((StringBuilder)object2).append(' ');
            ((StringBuilder)object2).append(InOut.g(this.c, 0, 4));
            object2 = ((StringBuilder)object2).toString();
        } else {
            object = new byte[n3];
            n5 = 0;
            while (true) {
                n4 = n5;
                if (n5 >= n3) break;
                n4 = this.a.read((byte[])object, n5, n3 - n5);
                if (n4 < 0) {
                    throw InOut.f();
                }
                if (n4 == 0) {
                    n4 = n5;
                    if (n5 != 0) break;
                    n4 = -1;
                    break;
                }
                n5 += n4;
            }
            if (object[n5 = n3 - 1] == 3) {
                return object;
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Bad end from daemon: ");
            ((StringBuilder)object2).append((int)object[n5]);
            ((StringBuilder)object2).append("; ");
            ((StringBuilder)object2).append((int)object[0]);
            ((StringBuilder)object2).append("; ");
            ((StringBuilder)object2).append(n5);
            ((StringBuilder)object2).append("; ");
            ((StringBuilder)object2).append(n4);
            object2 = ((StringBuilder)object2).toString();
        }
        e1.d((String)object2);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void l() {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                block8: {
                    block7: {
                        try {
                            if (this.k) break block7;
                            if (this.h <= 0) break block8;
                            ArrayList arrayList = this.j;
                            synchronized (arrayList) {
                            }
                        }
                        catch (Throwable throwable2) {
                            break block9;
                        }
                        {
                            Throwable throwable32;
                            block11: {
                                block10: {
                                    try {
                                        this.j.add(Arrays.copyOf(this.g, this.h));
                                        if (this.j.size() <= 40) break block10;
                                        byte[] byArray = (byte[])this.j.remove(0);
                                    }
                                    catch (Throwable throwable32) {
                                        break block11;
                                    }
                                }
                                break block8;
                            }
                            throw throwable32;
                        }
                    }
                    this.m();
                    this.b.write(this.g, 0, this.h);
                    this.b.flush();
                }
                this.h = 0;
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
    public void m() {
        ArrayList arrayList = this.j;
        synchronized (arrayList) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (arrayList.size() <= 0) break block4;
                        OutputStream outputStream = this.b;
                        Iterator iterator = arrayList.iterator();
                        while (iterator.hasNext()) {
                            outputStream.write((byte[])iterator.next());
                            outputStream.flush();
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    arrayList.clear();
                    arrayList.trimToSize();
                }
                return;
            }
            throw throwable2;
        }
    }

    public void n(boolean bl) {
        this.k = bl;
    }

    public void o(InputStream closeable, OutputStream outputStream) {
        BufferedInputStream bufferedInputStream;
        InputStream inputStream = bufferedInputStream = new BufferedInputStream((InputStream)closeable, 65536);
        closeable = outputStream;
        if (!o) {
            closeable = new b(outputStream);
            inputStream = new a(bufferedInputStream);
        }
        this.a = inputStream;
        this.b = closeable;
    }

    public void q(byte by, byte by2, int n3) {
        this.c(n3 + 2, this.i);
        this.i = false;
        byte[] byArray = this.g;
        byArray[0] = by2;
        byArray[1] = by;
        this.h = 2;
    }

    public void r() {
        if (this.g.length > 65536) {
            this.i = true;
        }
    }

    public void s(byte by) {
        this.c(1, false);
        byte[] byArray = this.g;
        int n3 = this.h;
        this.h = n3 + 1;
        byArray[n3] = by;
    }

    public void t(byte[] byArray, int n3) {
        this.c(n3, false);
        System.arraycopy(byArray, 0, this.g, this.h, n3);
        this.h += n3;
    }

    public void u(int n3) {
        this.f.putInt(0, n3 ^ byteOrderMask);
        this.t(this.e, 4);
    }

    public void v(long l3) {
        if (m) {
            this.f.putLong(0, l3);
            this.t(this.e, 8);
        } else {
            this.u((int)l3);
        }
    }

    public void w(long l3) {
        this.f.putLong(0, l3);
        this.t(this.e, 8);
    }

    private static class a
    extends InputStream {
        private final InputStream a;
        private int b;

        public a(InputStream inputStream) {
            this.a = inputStream;
            this.b = -2017;
        }

        @Override
        public int read() {
            int n3 = this.b;
            if (n3 != -2017) {
                this.b = -2017;
                return n3;
            }
            InputStream inputStream = this.a;
            n3 = inputStream.read();
            if (n3 >= 97 && n3 <= 112) {
                int n4 = inputStream.read();
                if (n4 >= 97 && n4 <= 112) {
                    return n3 - 97 + (n4 - 97) * 16;
                }
                if (n4 != -1) {
                    this.b = n4;
                    return n3;
                }
                throw InOut.f();
            }
            if (n3 != -1) {
                return n3;
            }
            throw InOut.f();
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public int read(byte[] byArray, int n3, int n4) {
            int n5 = this.b;
            InputStream inputStream = this.a;
            int n6 = n3;
            while (true) {
                int n7;
                block6: {
                    int n8;
                    block9: {
                        block7: {
                            block8: {
                                block4: {
                                    block5: {
                                        if ((n7 = n6) >= n4 + n3) {
                                            this.b = n5;
                                            return 0;
                                        }
                                        n8 = -2017;
                                        n6 = n5;
                                        if (n5 == -2017) break block4;
                                        if (n5 == -1) break block5;
                                        n6 = n5;
                                        n5 = n8;
                                        break block6;
                                    }
                                    n6 = -2017;
                                }
                                if ((n5 = inputStream.read()) < 97 || n5 > 112) break block7;
                                n8 = inputStream.read();
                                if (n8 < 97 || n8 > 112) break block8;
                                n5 = n5 - 97 + (n8 - 97) * 16;
                                break block9;
                            }
                            if (n8 == -1) {
                                throw InOut.f();
                            }
                            n6 = n5;
                            n5 = n8;
                            break block6;
                        }
                        if (n5 == -1) {
                            throw InOut.f();
                        }
                    }
                    n8 = n6;
                    n6 = n5;
                    n5 = n8;
                }
                byArray[n7] = (byte)n6;
                n6 = n7 + 1;
            }
        }
    }

    private static class b
    extends OutputStream {
        private final OutputStream a;

        public b(OutputStream outputStream) {
            this.a = outputStream;
        }

        private byte[] a(byte[] byArray, int n3, int n4) {
            int n5 = n4 * 2;
            byte[] byArray2 = new byte[n5 + 4];
            byArray2[0] = 59;
            byArray2[1] = 59;
            for (int i3 = 0; i3 < n4; ++i3) {
                byte by = byArray[n3 + i3];
                int n6 = i3 * 2;
                byArray2[n6 + 2] = (byte)this.b(by & 0xF);
                byArray2[n6 + 3] = (byte)this.b((by & 0xF0) >> 4);
            }
            byArray2[n5 + 2] = 10;
            byArray2[n5 + 3] = 10;
            return byArray2;
        }

        private int b(int n3) {
            int n4 = n3;
            if (n3 >= 0) {
                n4 = n3;
                if (n3 <= 15) {
                    n4 = n3 + 97;
                }
            }
            return n4;
        }

        @Override
        public void flush() {
            this.a.flush();
        }

        @Override
        public void write(int n3) {
            this.a.write(this.b(n3 & 0xF));
            this.a.write(this.b((n3 & 0xF0) >> 4));
        }

        @Override
        public void write(byte[] byArray) {
            this.a.write(this.a(byArray, 0, byArray.length));
        }

        @Override
        public void write(byte[] byArray, int n3, int n4) {
            this.a.write(this.a(byArray, n3, n4));
        }
    }
}

