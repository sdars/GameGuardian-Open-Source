package android.ext;

import android.os.Build;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class InOut {
    public static volatile int byteOrderMask = 15;
    public static volatile boolean m;
    public static volatile int n;
    static boolean o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ByteBuffer f177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f180g;
    private int h;
    private boolean i;
    private final ArrayList j;
    private volatile boolean k;
    private CRC32 l = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InputStream f174a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OutputStream f175b = null;

    private static class a extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InputStream f181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f182b = -2017;

        public a(InputStream inputStream) {
            this.f181a = inputStream;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            int i = this.f182b;
            if (i != -2017) {
                this.f182b = -2017;
                return i;
            }
            InputStream inputStream = this.f181a;
            int i2 = inputStream.read();
            if (i2 < 97 || i2 > 112) {
                if (i2 != -1) {
                    return i2;
                }
                throw InOut.f();
            }
            int i3 = i2 - 97;
            int i4 = inputStream.read();
            if (i4 >= 97 && i4 <= 112) {
                return i3 + ((i4 - 97) * 16);
            }
            if (i4 == -1) {
                throw InOut.f();
            }
            this.f182b = i4;
            return i2;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x003b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:31:0x0045 A[SYNTHETIC] */
        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3;
            int i4 = i2 + i;
            int i5 = this.f182b;
            InputStream inputStream = this.f181a;
            while (i < i4) {
                int i6 = -2017;
                if (i5 == -2017) {
                    i3 = inputStream.read();
                    if (i3 < 97 && i3 <= 112) {
                        int i7 = i3 - 97;
                        int i8 = inputStream.read();
                        if (i8 >= 97 && i8 <= 112) {
                            i3 = i7 + ((i8 - 97) * 16);
                        } else {
                            if (i8 == -1) {
                                throw InOut.f();
                            }
                            i5 = i3;
                            i6 = i8;
                        }
                    } else if (i3 == -1) {
                        throw InOut.f();
                    }
                    int i9 = i3;
                    i6 = i5;
                    i5 = i9;
                } else if (i5 != -1) {
                    continue;
                } else {
                    i5 = -2017;
                    i3 = inputStream.read();
                    if (i3 < 97) {
                        if (i3 == -1) {
                            throw InOut.f();
                        }
                        int i10 = i3;
                        i6 = i5;
                        i5 = i10;
                    } else {
                        if (i3 == -1) {
                            throw InOut.f();
                        }
                        int i11 = i3;
                        i6 = i5;
                        i5 = i11;
                    }
                }
                bArr[i] = (byte) i5;
                i++;
                i5 = i6;
            }
            this.f182b = i5;
            return 0;
        }
    }

    private static class b extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final OutputStream f183a;

        public b(OutputStream outputStream) {
            this.f183a = outputStream;
        }

        private byte[] a(byte[] bArr, int i, int i2) {
            int i3 = i2 * 2;
            byte[] bArr2 = new byte[i3 + 4];
            bArr2[0] = 59;
            bArr2[1] = 59;
            for (int i4 = 0; i4 < i2; i4++) {
                byte b2 = bArr[i + i4];
                int i5 = i4 * 2;
                bArr2[i5 + 2] = (byte) b(b2 & 15);
                bArr2[i5 + 3] = (byte) b((b2 & 240) >> 4);
            }
            bArr2[i3 + 2] = 10;
            bArr2[i3 + 3] = 10;
            return bArr2;
        }

        private int b(int i) {
            return (i < 0 || i > 15) ? i : i + 97;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f183a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.f183a.write(b(i & 15));
            this.f183a.write(b((i & 240) >> 4));
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f183a.write(a(bArr, 0, bArr.length));
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f183a.write(a(bArr, i, i2));
        }
    }

    static {
        boolean z;
        try {
            String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
            z = strArr != null && strArr.length > 0;
        } catch (Throwable th) {
            e1.a(th);
        }
        p(z);
        o = false;
    }

    public InOut() {
        byte[] bArr = new byte[4];
        this.f176c = bArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.f177d = byteBufferWrap;
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferWrap.order(byteOrder);
        byte[] bArr2 = new byte[8];
        this.f178e = bArr2;
        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr2);
        this.f179f = byteBufferWrap2;
        byteBufferWrap2.order(byteOrder);
        this.f180g = new byte[1024];
        this.j = new ArrayList();
        this.k = false;
    }

    static String b(byte[] bArr, int i, int i2) {
        if (bArr.length - 1 < i) {
            e1.p("bytesToHex failed: " + bArr.length + ' ' + i + ' ' + i2);
            return "";
        }
        if (bArr.length < i + i2) {
            e1.p("bytesToHex fix len: " + bArr.length + ' ' + i + ' ' + i2);
            i2 = bArr.length - i;
        }
        char[] cArr = new char[i2 * 3];
        char[] cArr2 = x0.f1306a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b2 = bArr[i + i3];
            int i4 = i3 * 3;
            cArr[i4] = cArr2[(b2 & 255) >>> 4];
            cArr[i4 + 1] = cArr2[b2 & 15];
            cArr[i4 + 2] = ' ';
        }
        return new String(cArr);
    }

    private void c(int i, boolean z) {
        byte[] bArr = this.f180g;
        int i2 = this.h;
        int i3 = i + i2;
        if (i3 > bArr.length || z) {
            byte[] bArr2 = new byte[i3 + 1024];
            if (i2 > 0) {
                System.arraycopy(bArr, 0, bArr2, 0, i2);
            }
            this.f180g = bArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static EOFException f() {
        return new EOFException("daemon stream closed (EOF)");
    }

    public static String g(byte[] bArr, int i, int i2) {
        if (bArr.length - 1 < i) {
            e1.p("dump failed: " + bArr.length + ' ' + i + ' ' + i2);
            return "";
        }
        if (bArr.length < i + i2) {
            e1.p("dump fix len: " + bArr.length + ' ' + i + ' ' + i2);
            i2 = bArr.length - i;
        }
        StringBuilder sb = new StringBuilder();
        int i3 = i;
        while (i3 < i2) {
            int i4 = i2 - i3;
            if (i4 > 32) {
                i4 = 32;
            }
            int i5 = i + i3;
            sb.append(b(bArr, i5, i4));
            sb.append('\'');
            sb.append(new String(bArr, i5, i4));
            sb.append("'\n");
            i3 += i4;
        }
        return sb.toString();
    }

    private byte i() throws IOException {
        int i = this.f174a.read();
        if (i != -1) {
            return (byte) i;
        }
        throw f();
    }

    private int j() throws IOException {
        int i = 0;
        while (i < 4) {
            int i2 = this.f174a.read(this.f176c, i, 4 - i);
            if (i2 < 0) {
                throw f();
            }
            if (i2 == 0) {
                break;
            }
            i += i2;
        }
        return this.f177d.getInt(0);
    }

    static void p(boolean z) {
        m = z;
        n = z ? 8 : 4;
    }

    public void d() {
        this.h = 0;
    }

    public long e() {
        if (this.h < 2) {
            return 0L;
        }
        CRC32 crc32 = this.l;
        if (crc32 == null) {
            crc32 = new CRC32();
            this.l = crc32;
        } else {
            crc32.reset();
        }
        crc32.update(this.f180g, 2, this.h);
        return crc32.getValue();
    }

    public boolean h() {
        return this.k;
    }

    public byte[] k() throws IOException {
        String str;
        byte[] bArr = null;
        int i = 0;
        while (true) {
            byte bI = i();
            if (bI == 2) {
                break;
            }
            if (bArr != null || (bI != 10 && bI != 59)) {
                if (bArr == null) {
                    bArr = new byte[4096];
                }
                if (i < bArr.length) {
                    bArr[i] = bI;
                }
                i++;
                if (i >= bArr.length || i % 10 == 0) {
                    e1.d("Bad input from daemon: " + ((int) bI) + '\n' + g(bArr, 0, i));
                }
            }
        }
        if (bArr != null) {
            e1.d("Bad input from daemon 2: " + i + '\n' + g(bArr, 0, i));
        }
        int iJ = j();
        if (iJ > 10485760 || iJ < 2) {
            str = "Bad len from daemon: " + iJ + ' ' + g(this.f176c, 0, 4);
        } else {
            byte[] bArr2 = new byte[iJ];
            int i2 = 0;
            while (i2 < iJ) {
                int i3 = this.f174a.read(bArr2, i2, iJ - i2);
                if (i3 < 0) {
                    throw f();
                }
                if (i3 == 0) {
                    if (i2 != 0) {
                        break;
                    }
                    i2 = -1;
                    break;
                }
                i2 += i3;
            }
            int i4 = iJ - 1;
            if (bArr2[i4] == 3) {
                return bArr2;
            }
            str = "Bad end from daemon: " + ((int) bArr2[i4]) + "; " + ((int) bArr2[0]) + "; " + i4 + "; " + i2;
        }
        e1.d(str);
        return null;
    }

    public synchronized void l() {
        try {
            if (this.k) {
                m();
                this.f175b.write(this.f180g, 0, this.h);
                this.f175b.flush();
            } else if (this.h > 0) {
                synchronized (this.j) {
                    try {
                        this.j.add(Arrays.copyOf(this.f180g, this.h));
                        if (this.j.size() > 40) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.h = 0;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void m() {
        ArrayList arrayList = this.j;
        synchronized (arrayList) {
            try {
                if (arrayList.size() > 0) {
                    OutputStream outputStream = this.f175b;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        outputStream.write((byte[]) it.next());
                        outputStream.flush();
                    }
                    arrayList.clear();
                    arrayList.trimToSize();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n(boolean z) {
        this.k = z;
    }

    public void o(InputStream inputStream, OutputStream outputStream) {
        InputStream bufferedInputStream = new BufferedInputStream(inputStream, 65536);
        if (!o) {
            b bVar = new b(outputStream);
            bufferedInputStream = new a(bufferedInputStream);
            outputStream = bVar;
        }
        this.f174a = bufferedInputStream;
        this.f175b = outputStream;
    }

    public void q(byte b2, byte b3, int i) {
        c(i + 2, this.i);
        this.i = false;
        byte[] bArr = this.f180g;
        bArr[0] = b3;
        bArr[1] = b2;
        this.h = 2;
    }

    public void r() {
        if (this.f180g.length > 65536) {
            this.i = true;
        }
    }

    public void s(byte b2) {
        c(1, false);
        byte[] bArr = this.f180g;
        int i = this.h;
        this.h = i + 1;
        bArr[i] = b2;
    }

    public void t(byte[] bArr, int i) {
        c(i, false);
        System.arraycopy(bArr, 0, this.f180g, this.h, i);
        this.h += i;
    }

    public void u(int i) {
        this.f179f.putInt(0, i ^ byteOrderMask);
        t(this.f178e, 4);
    }

    public void v(long j) {
        if (!m) {
            u((int) j);
        } else {
            this.f179f.putLong(0, j);
            t(this.f178e, 8);
        }
    }

    public void w(long j) {
        this.f179f.putLong(0, j);
        t(this.f178e, 8);
    }
}
