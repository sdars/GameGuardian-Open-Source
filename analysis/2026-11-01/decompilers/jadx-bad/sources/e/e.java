package e;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f1537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f1538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f1539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int[] f1541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int[] f1542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f1543g;
    protected int h;
    protected boolean i;
    protected boolean j;
    protected Reader k;
    protected char[] l;
    protected int m;
    protected int n;
    protected int o;

    public e(InputStream inputStream, String str, int i, int i2) {
        this(inputStream, str, i, i2, 4096);
    }

    public char a() throws IOException {
        this.f1539c = -1;
        char cK = k();
        this.f1539c = this.f1540d;
        return cK;
    }

    protected void b(boolean z) {
        int i;
        int i2 = this.f1537a;
        char[] cArr = new char[i2 + 2048];
        int[] iArr = new int[i2 + 2048];
        int[] iArr2 = new int[i2 + 2048];
        try {
            if (z) {
                char[] cArr2 = this.l;
                int i3 = this.f1539c;
                System.arraycopy(cArr2, i3, cArr, 0, i2 - i3);
                System.arraycopy(this.l, 0, cArr, this.f1537a - this.f1539c, this.f1540d);
                this.l = cArr;
                int[] iArr3 = this.f1541e;
                int i4 = this.f1539c;
                System.arraycopy(iArr3, i4, iArr, 0, this.f1537a - i4);
                System.arraycopy(this.f1541e, 0, iArr, this.f1537a - this.f1539c, this.f1540d);
                this.f1541e = iArr;
                int[] iArr4 = this.f1542f;
                int i5 = this.f1539c;
                System.arraycopy(iArr4, i5, iArr2, 0, this.f1537a - i5);
                System.arraycopy(this.f1542f, 0, iArr2, this.f1537a - this.f1539c, this.f1540d);
                this.f1542f = iArr2;
                i = this.f1540d + (this.f1537a - this.f1539c);
                this.f1540d = i;
            } else {
                char[] cArr3 = this.l;
                int i6 = this.f1539c;
                System.arraycopy(cArr3, i6, cArr, 0, i2 - i6);
                this.l = cArr;
                int[] iArr5 = this.f1541e;
                int i7 = this.f1539c;
                System.arraycopy(iArr5, i7, iArr, 0, this.f1537a - i7);
                this.f1541e = iArr;
                int[] iArr6 = this.f1542f;
                int i8 = this.f1539c;
                System.arraycopy(iArr6, i8, iArr2, 0, this.f1537a - i8);
                this.f1542f = iArr2;
                i = this.f1540d - this.f1539c;
                this.f1540d = i;
            }
            this.m = i;
            int i9 = this.f1537a + 2048;
            this.f1537a = i9;
            this.f1538b = i9;
            this.f1539c = 0;
        } catch (Throwable th) {
            throw new Error(th.getMessage());
        }
    }

    protected void c() throws IOException {
        int i = this.m;
        int i2 = this.f1538b;
        if (i == i2) {
            int i3 = this.f1537a;
            if (i2 == i3) {
                i3 = this.f1539c;
                if (i3 > 2048) {
                    this.m = 0;
                    this.f1540d = 0;
                    this.f1538b = i3;
                } else if (i3 < 0) {
                    this.m = 0;
                    this.f1540d = 0;
                } else {
                    b(false);
                }
            } else {
                int i4 = this.f1539c;
                if (i2 > i4) {
                    this.f1538b = i3;
                } else if (i4 - i2 < 2048) {
                    b(true);
                } else {
                    this.f1538b = i4;
                }
            }
        }
        try {
            Reader reader = this.k;
            char[] cArr = this.l;
            int i5 = this.m;
            int i6 = reader.read(cArr, i5, this.f1538b - i5);
            if (i6 != -1) {
                this.m += i6;
            } else {
                this.k.close();
                throw new IOException();
            }
        } catch (IOException e2) {
            this.f1540d--;
            f(0);
            if (this.f1539c == -1) {
                this.f1539c = this.f1540d;
            }
            throw e2;
        }
    }

    public String d() {
        int i = this.f1540d;
        int i2 = this.f1539c;
        if (i >= i2) {
            return new String(this.l, i2, (i - i2) + 1);
        }
        StringBuilder sb = new StringBuilder();
        char[] cArr = this.l;
        int i3 = this.f1539c;
        sb.append(new String(cArr, i3, this.f1537a - i3));
        sb.append(new String(this.l, 0, this.f1540d + 1));
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    /* JADX WARN: Code duplicated, block: B:18:0x002f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    protected void e(char c2) {
        this.f1543g++;
        if (!this.j) {
            if (this.i) {
                this.i = false;
                if (c2 == '\n') {
                    this.j = true;
                }
            }
            if (c2 != '\t') {
                int i = this.f1543g - 1;
                this.f1543g = i;
                int i2 = this.o;
                this.f1543g = i + (i2 - (i % i2));
            } else if (c2 != '\n') {
                this.j = true;
            } else if (c2 == '\r') {
                this.i = true;
            }
            int[] iArr = this.f1541e;
            int i3 = this.f1540d;
            iArr[i3] = this.h;
            this.f1542f[i3] = this.f1543g;
        }
        this.j = false;
        int i4 = this.h;
        this.f1543g = 1;
        this.h = i4 + 1;
        if (c2 != '\t') {
            int i5 = this.f1543g - 1;
            this.f1543g = i5;
            int i6 = this.o;
            this.f1543g = i5 + (i6 - (i5 % i6));
        } else if (c2 != '\n') {
            this.j = true;
        } else if (c2 == '\r') {
            this.i = true;
        }
        int[] iArr2 = this.f1541e;
        int i7 = this.f1540d;
        iArr2[i7] = this.h;
        this.f1542f[i7] = this.f1543g;
    }

    public void f(int i) {
        this.n += i;
        int i2 = this.f1540d - i;
        this.f1540d = i2;
        if (i2 < 0) {
            this.f1540d = i2 + this.f1537a;
        }
    }

    public int g() {
        return this.f1542f[this.f1539c];
    }

    public int h() {
        return this.f1541e[this.f1539c];
    }

    public int i() {
        return this.f1542f[this.f1540d];
    }

    public int j() {
        return this.f1541e[this.f1540d];
    }

    public char k() throws IOException {
        int i = this.n;
        if (i > 0) {
            this.n = i - 1;
            int i2 = this.f1540d + 1;
            this.f1540d = i2;
            if (i2 == this.f1537a) {
                this.f1540d = 0;
            }
            return this.l[this.f1540d];
        }
        int i3 = this.f1540d + 1;
        this.f1540d = i3;
        if (i3 >= this.m) {
            c();
        }
        char c2 = this.l[this.f1540d];
        e(c2);
        return c2;
    }

    public e(InputStream inputStream, String str, int i, int i2, int i3) {
        this(str == null ? new InputStreamReader(inputStream) : new InputStreamReader(inputStream, str), i, i2, i3);
    }

    public e(Reader reader, int i, int i2, int i3) {
        this.f1540d = -1;
        this.i = false;
        this.j = false;
        this.m = 0;
        this.n = 0;
        this.o = 8;
        this.k = reader;
        this.h = i;
        this.f1543g = i2 - 1;
        this.f1537a = i3;
        this.f1538b = i3;
        this.l = new char[i3];
        this.f1541e = new int[i3];
        this.f1542f = new int[i3];
    }
}
