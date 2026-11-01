/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.InOut;
import android.ext.e1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class w {
    private final ByteBuffer a;
    private final byte[] b;

    public w(byte[] object) {
        this.b = object;
        object = ByteBuffer.wrap((byte[])object);
        this.a = object;
        ((ByteBuffer)object).order(ByteOrder.LITTLE_ENDIAN);
    }

    public int a() {
        return this.a.position();
    }

    public byte b() {
        byte by;
        int n3 = this.a.position();
        this.a.position(1);
        try {
            by = this.e();
        }
        catch (IOException iOException) {
            e1.l("getSeq fail", iOException);
            by = -1;
        }
        this.a.position(n3);
        return by;
    }

    public void c(byte[] byArray) {
        this.a.get(byArray);
    }

    public void d(byte[] byArray, int n3, int n4) {
        this.a.get(byArray, n3, n4);
    }

    public byte e() {
        return this.a.get();
    }

    public int f() {
        return this.a.getInt();
    }

    public long g() {
        if (InOut.m) {
            return this.a.getLong();
        }
        return (long)this.f() & 0xFFFFFFFFL;
    }

    public long h() {
        return this.a.getLong();
    }

    public String i(int n3, String string2) {
        String string3;
        if (n3 == 0) {
            return "";
        }
        int n4 = this.a.position();
        byte[] byArray = this.b;
        if (string2 != null && string2.length() == n3) {
            int n5 = 0;
            while (true) {
                string3 = string2;
                if (n5 < n3) {
                    if (string2.charAt(n5) != byArray[n4 + n5]) break;
                    ++n5;
                    continue;
                }
                break;
            }
        } else {
            string3 = null;
        }
        string2 = string3;
        if (string3 == null) {
            string2 = new String(byArray, n4, n3);
        }
        this.a.position(n4 + n3);
        return string2;
    }

    public void j() {
        this.a.position(2);
    }

    public int k() {
        return this.a.capacity();
    }

    public void l(int n3) {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(byteBuffer.position() + n3);
    }
}

