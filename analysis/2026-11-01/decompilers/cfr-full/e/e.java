/*
 * Decompiled with CFR 0.152.
 */
package e;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class e {
    int a;
    int b;
    int c;
    public int d;
    protected int[] e;
    protected int[] f;
    protected int g;
    protected int h;
    protected boolean i;
    protected boolean j;
    protected Reader k;
    protected char[] l;
    protected int m;
    protected int n;
    protected int o;

    public e(InputStream inputStream, String string2, int n3, int n4) {
        this(inputStream, string2, n3, n4, 4096);
    }

    public e(InputStream closeable, String string2, int n3, int n4, int n5) {
        closeable = string2 == null ? new InputStreamReader((InputStream)closeable) : new InputStreamReader((InputStream)closeable, string2);
        this((Reader)closeable, n3, n4, n5);
    }

    public e(Reader reader, int n3, int n4, int n5) {
        this.d = -1;
        this.i = false;
        this.j = false;
        this.m = 0;
        this.n = 0;
        this.o = 8;
        this.k = reader;
        this.h = n3;
        this.g = n4 - 1;
        this.a = n5;
        this.b = n5;
        this.l = new char[n5];
        this.e = new int[n5];
        this.f = new int[n5];
    }

    public char a() {
        this.c = -1;
        char c4 = this.k();
        this.c = this.d;
        return c4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void b(boolean bl) {
        int n3 = this.a;
        Object[] objectArray = new char[n3 + 2048];
        int[] nArray = new int[n3 + 2048];
        int[] nArray2 = new int[n3 + 2048];
        if (bl) {
            try {
                char[] cArray = this.l;
                int n4 = this.c;
                System.arraycopy(cArray, n4, objectArray, 0, n3 - n4);
                System.arraycopy(this.l, 0, objectArray, this.a - this.c, this.d);
                this.l = objectArray;
                objectArray = this.e;
                n3 = this.c;
                System.arraycopy(objectArray, n3, nArray, 0, this.a - n3);
                System.arraycopy(this.e, 0, nArray, this.a - this.c, this.d);
                this.e = nArray;
                nArray = this.f;
                n3 = this.c;
                System.arraycopy(nArray, n3, nArray2, 0, this.a - n3);
                System.arraycopy(this.f, 0, nArray2, this.a - this.c, this.d);
                this.f = nArray2;
                this.d = n3 = this.d + (this.a - this.c);
            }
            catch (Throwable throwable) {
                throw new Error(throwable.getMessage());
            }
        } else {
            char[] cArray = this.l;
            int n5 = this.c;
            System.arraycopy(cArray, n5, objectArray, 0, n3 - n5);
            this.l = objectArray;
            objectArray = this.e;
            n3 = this.c;
            System.arraycopy(objectArray, n3, nArray, 0, this.a - n3);
            this.e = nArray;
            nArray = this.f;
            n3 = this.c;
            System.arraycopy(nArray, n3, nArray2, 0, this.a - n3);
            this.f = nArray2;
            this.d = n3 = this.d - this.c;
        }
        this.m = n3;
        this.a = n3 = this.a + 2048;
        this.b = n3;
        this.c = 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void c() {
        block11: {
            block10: {
                block12: {
                    block13: {
                        var1_1 = this.m;
                        var2_2 = this.b;
                        if (var1_1 != var2_2) break block10;
                        var1_1 = this.a;
                        if (var2_2 != var1_1) break block12;
                        var1_1 = this.c;
                        if (var1_1 <= 2048) break block13;
                        this.m = 0;
                        this.d = 0;
                        ** GOTO lbl-1000
                    }
                    if (var1_1 < 0) {
                        this.m = 0;
                        this.d = 0;
                        break block10;
                    } else {
                        this.b(false);
                    }
                    break block10;
                }
                var3_3 = this.c;
                if (var2_2 > var3_3) lbl-1000:
                // 2 sources

                {
                    this.b = var1_1;
                } else if (var3_3 - var2_2 < 2048) {
                    this.b(true);
                } else {
                    this.b = var3_3;
                }
            }
            try {
                var4_4 = this.k;
                var5_6 = this.l;
                var1_1 = this.m;
                var1_1 = var4_4.read(var5_6, var1_1, this.b - var1_1);
                if (var1_1 != -1) {
                    this.m += var1_1;
                    return;
                }
            }
            catch (IOException var4_5) {
                break block11;
            }
            this.k.close();
            var4_4 = new IOException();
            throw var4_4;
        }
        --this.d;
        this.f(0);
        if (this.c == -1) {
            this.c = this.d;
        }
        throw var4_5;
    }

    public String d() {
        int n3 = this.d;
        int n4 = this.c;
        if (n3 >= n4) {
            return new String(this.l, n4, n3 - n4 + 1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        char[] cArray = this.l;
        n3 = this.c;
        stringBuilder.append(new String(cArray, n3, this.a - n3));
        stringBuilder.append(new String(this.l, 0, this.d + 1));
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     */
    protected void e(char var1_1) {
        ++this.g;
        if (this.j) {
            this.j = false;
            while (true) {
                var2_2 = this.h;
                this.g = 1;
                this.h = var2_2 + 1;
                break;
            }
        } else if (this.i) {
            this.i = false;
            if (var1_1 != '\n') ** continue;
            this.j = true;
        }
        if (var1_1 != '\t') {
            if (var1_1 != '\n') {
                if (var1_1 == '\r') {
                    this.i = true;
                }
            } else {
                this.j = true;
            }
        } else {
            var1_1 = (char)(this.g - 1);
            this.g = var1_1;
            var2_2 = this.o;
            this.g = var1_1 + (var2_2 - var1_1 % var2_2);
        }
        var3_3 = this.e;
        var1_1 = (char)this.d;
        var3_3[var1_1] = this.h;
        this.f[var1_1] = this.g;
    }

    public void f(int n3) {
        this.n += n3;
        this.d = n3 = this.d - n3;
        if (n3 < 0) {
            this.d = n3 + this.a;
        }
    }

    public int g() {
        return this.f[this.c];
    }

    public int h() {
        return this.e[this.c];
    }

    public int i() {
        return this.f[this.d];
    }

    public int j() {
        return this.e[this.d];
    }

    public char k() {
        int n3 = this.n;
        if (n3 > 0) {
            this.n = n3 - 1;
            this.d = n3 = this.d + 1;
            if (n3 == this.a) {
                this.d = 0;
            }
            return this.l[this.d];
        }
        this.d = n3 = this.d + 1;
        if (n3 >= this.m) {
            this.c();
        }
        char c4 = this.l[this.d];
        this.e(c4);
        return c4;
    }
}

