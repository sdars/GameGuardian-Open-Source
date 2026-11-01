/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.e1;
import android.ext.h3;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipOutputStream;

public class g
extends ZipOutputStream {
    private boolean a = false;
    private a b;
    private ZipEntry c = null;
    private final CRC32 d = new CRC32();
    private int e = 0;
    private byte[] f = null;

    public g(OutputStream outputStream) {
        super(new a(new BufferedOutputStream(outputStream, 65536)));
        this.b = android.ext.g$a.c;
        this.setComment("");
    }

    public static String a(ZipEntry object) {
        if (object == null) {
            object = "null";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(((ZipEntry)object).getName());
            stringBuilder.append(", method: ");
            stringBuilder.append(((ZipEntry)object).getMethod());
            stringBuilder.append(", crc: 0x");
            stringBuilder.append(Long.toHexString(((ZipEntry)object).getCrc()));
            stringBuilder.append(", size: ");
            stringBuilder.append(((ZipEntry)object).getSize());
            stringBuilder.append(", compressed size: ");
            stringBuilder.append(((ZipEntry)object).getCompressedSize());
            object = stringBuilder.toString();
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void closeEntry() {
        ZipException zipException2;
        block6: {
            block4: {
                Object object;
                block5: {
                    try {
                        long l3;
                        object = this.c;
                        if (object == null || ((ZipEntry)object).getMethod() != 0) break block4;
                        long l4 = this.c.getCrc();
                        if (l4 == (l3 = this.d.getValue())) break block5;
                        object = new StringBuilder();
                        ((StringBuilder)object).append("CRC mismatch: ");
                        ((StringBuilder)object).append(g.a(this.c));
                        ((StringBuilder)object).append(" != ");
                        ((StringBuilder)object).append(this.d.getValue());
                        e1.p(((StringBuilder)object).toString());
                        this.c.setCrc(this.d.getValue());
                    }
                    catch (ZipException zipException2) {
                        break block6;
                    }
                }
                if (this.c.getSize() != (long)this.e) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Size mismatch: ");
                    ((StringBuilder)object).append(g.a(this.c));
                    ((StringBuilder)object).append(" != ");
                    ((StringBuilder)object).append(this.e);
                    e1.p(((StringBuilder)object).toString());
                    this.c.setSize(this.e);
                }
                if (this.c.getCompressedSize() != this.c.getSize()) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("CompressedSize mismatch: ");
                    ((StringBuilder)object).append(g.a(this.c));
                    ((StringBuilder)object).append(" != ");
                    ((StringBuilder)object).append(this.c.getSize());
                    e1.p(((StringBuilder)object).toString());
                    object = this.c;
                    ((ZipEntry)object).setCompressedSize(((ZipEntry)object).getSize());
                }
            }
            super.closeEntry();
            this.a = false;
            this.c = null;
            this.d.reset();
            this.e = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed close entry: ");
        stringBuilder.append(g.a(this.c));
        throw new RuntimeException(stringBuilder.toString(), zipException2);
    }

    @Override
    public void putNextEntry(ZipEntry zipEntry) {
        zipEntry.setComment("");
        this.c = zipEntry;
        if (this.a) {
            this.closeEntry();
        }
        if (zipEntry.getMethod() == 0) {
            ((OutputStream)this).flush();
            int n3 = this.b.b;
            int n4 = zipEntry.getName().getBytes("UTF-8").length;
            int n5 = h3.b(zipEntry.getName()) ? 4096 : 4;
            zipEntry.setExtra(new byte[(n5 - (n3 + 30 + n4) % n5) % n5]);
            zipEntry.setCompressedSize(zipEntry.getSize());
        }
        super.putNextEntry(zipEntry);
        this.a = true;
        this.d.reset();
        this.e = 0;
    }

    @Override
    public void setComment(String string2) {
        super.setComment("");
    }

    @Override
    public void write(int n3) {
        byte[] byArray;
        byte[] byArray2 = byArray = this.f;
        if (byArray == null) {
            this.f = byArray2 = new byte[1];
        }
        byArray2[0] = (byte)(n3 & 0xFF);
        this.write(byArray2, 0, 1);
    }

    @Override
    public void write(byte[] byArray) {
        this.write(byArray, 0, byArray.length);
    }

    @Override
    public void write(byte[] byArray, int n3, int n4) {
        super.write(byArray, n3, n4);
        this.d.update(byArray, n3, n4);
        this.e += n4;
    }

    private static class a
    extends OutputStream {
        static a c;
        private OutputStream a;
        int b = 0;

        public a(OutputStream outputStream) {
            this.a = outputStream;
            c = this;
        }

        @Override
        public void close() {
            this.a.close();
        }

        public boolean equals(Object object) {
            return this.a.equals(object);
        }

        @Override
        public void flush() {
            this.a.flush();
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return this.a.toString();
        }

        @Override
        public void write(int n3) {
            this.a.write(n3);
            ++this.b;
        }

        @Override
        public void write(byte[] byArray) {
            this.a.write(byArray);
            this.b += byArray.length;
        }

        @Override
        public void write(byte[] byArray, int n3, int n4) {
            this.a.write(byArray, n3, n4);
            this.b += n4;
        }
    }
}

