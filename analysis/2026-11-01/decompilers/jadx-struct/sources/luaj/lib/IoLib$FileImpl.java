package luaj.lib;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import luaj.LuaString;

/* JADX INFO: loaded from: classes.dex */
final class IoLib$FileImpl extends IoLib$File {
    private final RandomAccessFile Q;
    private final char R;
    private boolean S;
    private byte[] T;
    private int U;
    private boolean V;
    final /* synthetic */ IoLib W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private IoLib$FileImpl(IoLib ioLib, File file, char c2) throws IOException {
        super(ioLib);
        this.W = ioLib;
        this.S = false;
        this.T = null;
        RandomAccessFile randomAccessFileH3 = h3(file, c2);
        try {
            ioLib.Y.L3(file.getAbsolutePath());
            try {
                if (c2 != 'a' && c2 != 140) {
                    if (c2 == 'w' || c2 == 162) {
                        randomAccessFileH3.setLength(0L);
                    }
                    this.Q = randomAccessFileH3;
                    this.R = c2;
                }
                randomAccessFileH3.seek(randomAccessFileH3.length());
                this.Q = randomAccessFileH3;
                this.R = c2;
            } catch (IOException e2) {
                try {
                    randomAccessFileH3.close();
                } catch (IOException unused) {
                }
                ioLib.Y.S3();
                throw e2;
            }
        } catch (RuntimeException e3) {
            try {
                randomAccessFileH3.close();
            } catch (IOException unused2) {
            }
            throw e3;
        }
    }

    /* synthetic */ IoLib$FileImpl(IoLib ioLib, File file, char c2, IoLib$a ioLib$a) {
        this(ioLib, file, c2);
    }

    private void e3() throws IOException {
        if (this.T == null) {
            return;
        }
        U2();
        this.T = null;
    }

    private void f3(boolean z) throws IOException {
        char c2 = this.R;
        if (c2 != 'a') {
            if (c2 == 'r') {
                if (z) {
                    throw new IOException("invalid mode for write data: '" + this.R + "'");
                }
                return;
            }
            if (c2 != 'w') {
                return;
            }
        }
        if (z) {
            return;
        }
        throw new IOException("invalid mode for read data: '" + this.R + "'");
    }

    private void g3(RandomAccessFile randomAccessFile) {
        try {
            randomAccessFile.close();
        } catch (IOException unused) {
        }
    }

    private RandomAccessFile h3(File file, char c2) throws IoLib$c {
        if (c2 == 'r') {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            if (this.W.O3(file, randomAccessFile.getFD(), true)) {
                return randomAccessFile;
            }
            g3(randomAccessFile);
            throw new IoLib$c("open denied: " + file);
        }
        if (file.exists()) {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                if (!this.W.O3(file, randomAccessFile2.getFD(), false)) {
                    g3(randomAccessFile2);
                    throw new IoLib$c("open denied: " + file);
                }
                g3(randomAccessFile2);
            } catch (FileNotFoundException unused) {
            }
        }
        RandomAccessFile randomAccessFile3 = new RandomAccessFile(file, "rw");
        if (this.W.O3(file, randomAccessFile3.getFD(), false)) {
            return randomAccessFile3;
        }
        g3(randomAccessFile3);
        throw new IoLib$c("open denied: " + file);
    }

    private void i3(byte[] bArr, int i, int i2) throws IOException {
        RandomAccessFile randomAccessFile = this.Q;
        if (this.R != 140) {
            randomAccessFile.write(bArr, i, i2);
            return;
        }
        long filePointer = randomAccessFile.getFilePointer();
        randomAccessFile.seek(randomAccessFile.length());
        randomAccessFile.write(bArr, i, i2);
        randomAccessFile.seek(filePointer);
    }

    private void j3(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = this.T;
        if (bArr2 == null) {
            i3(bArr, i, i2);
            return;
        }
        if (i2 == 0) {
            return;
        }
        int length = bArr2.length;
        int i3 = this.U;
        int i4 = 0;
        if (this.V) {
            for (int i5 = (i + i2) - 1; i5 >= i; i5--) {
                if (bArr[i5] == 10) {
                    if (i3 > 0) {
                        i3(bArr2, 0, i3);
                        this.U = 0;
                        i3 = 0;
                    }
                    int i6 = (i5 - i) + 1;
                    i3(bArr, i, i6);
                    i += i6;
                    i2 -= i6;
                    break;
                }
            }
        } else if (i3 > 0 || i2 <= length) {
            int i7 = length - i3;
            if (i7 > i2) {
                i7 = i2;
            }
            System.arraycopy(bArr, i, bArr2, i3, i7);
            i += i7;
            i2 -= i7;
            i3 += i7;
            if (i3 == length) {
                i3(bArr2, 0, i3);
                i3 = 0;
            }
            this.U = i3;
            if (i2 == 0) {
                return;
            }
        }
        int i8 = i3 + i2;
        if (i8 >= length) {
            int i9 = (i8 / length) * length;
            if (i3 > 0) {
                i3(bArr2, 0, i3);
                i9 -= i3;
                this.U = 0;
            } else {
                i4 = i3;
            }
            i3(bArr, i, i9);
            i += i9;
            i2 -= i9;
            i3 = i4;
        }
        if (i2 > 0) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.U = i3 + i2;
        }
    }

    @Override // luaj.lib.IoLib$File
    public void S2() throws IOException {
        U2();
        if (!this.S) {
            this.S = true;
            this.W.Y.S3();
        }
        this.Q.close();
    }

    @Override // luaj.lib.IoLib$File
    public void U2() throws IOException {
        byte[] bArr = this.T;
        int i = this.U;
        if (bArr == null || i <= 0) {
            return;
        }
        i3(bArr, 0, i);
        this.U = 0;
    }

    @Override // luaj.lib.IoLib$File
    public boolean V2() {
        return this.S;
    }

    @Override // luaj.lib.IoLib$File
    public boolean W2() {
        return false;
    }

    @Override // luaj.lib.IoLib$File
    public int X2() throws IOException {
        f3(false);
        RandomAccessFile randomAccessFile = this.Q;
        long filePointer = randomAccessFile.getFilePointer();
        int i = randomAccessFile.read();
        randomAccessFile.seek(filePointer);
        return i;
    }

    @Override // luaj.lib.IoLib$File
    public int Y2() throws IOException {
        f3(false);
        return this.Q.read();
    }

    @Override // luaj.lib.IoLib$File
    public int Z2(byte[] bArr, int i, int i2) throws IOException {
        f3(false);
        return this.Q.read(bArr, i, i2);
    }

    @Override // luaj.lib.IoLib$File
    public int a3() throws IOException {
        f3(false);
        return (int) (this.Q.length() - this.Q.getFilePointer());
    }

    @Override // luaj.lib.IoLib$File
    public int b3(String str, int i) throws IOException {
        RandomAccessFile randomAccessFile = this.Q;
        if ("set".equals(str)) {
            randomAccessFile.seek(i);
        } else {
            randomAccessFile.seek(("end".equals(str) ? randomAccessFile.length() : randomAccessFile.getFilePointer()) + ((long) i));
        }
        return (int) randomAccessFile.getFilePointer();
    }

    @Override // luaj.lib.IoLib$File
    public void c3(String str, int i) throws IOException {
        if ("no".equals(str)) {
            e3();
            return;
        }
        boolean zEquals = "line".equals(str);
        byte[] bArr = this.T;
        if (bArr == null || bArr.length != i) {
            try {
                e3();
                this.T = new byte[i];
                this.U = 0;
            } catch (OutOfMemoryError e2) {
                throw new IOException("Out of memory for create buffer " + i + " bytes", e2);
            }
        } else if (this.V != zEquals) {
            U2();
        }
        this.V = zEquals;
    }

    @Override // luaj.lib.IoLib$File
    public void d3(LuaString luaString) throws IOException {
        f3(true);
        this.W.Y.M3(luaString.R);
        j3(luaString.P, luaString.Q, luaString.R);
    }

    @Override // luaj.LuaValue, luaj.Varargs
    public String g0() {
        StringBuilder sb = new StringBuilder();
        sb.append("file (");
        sb.append(this.S ? "closed" : Integer.valueOf(hashCode()));
        sb.append(')');
        return sb.toString();
    }
}
