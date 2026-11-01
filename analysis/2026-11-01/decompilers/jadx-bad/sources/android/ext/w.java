package android.ext;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f1287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f1288b;

    public w(byte[] bArr) {
        this.f1288b = bArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.f1287a = byteBufferWrap;
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public int a() {
        return this.f1287a.position();
    }

    public byte b() {
        byte bE;
        int iPosition = this.f1287a.position();
        this.f1287a.position(1);
        try {
            bE = e();
        } catch (IOException e2) {
            e1.l("getSeq fail", e2);
            bE = -1;
        }
        this.f1287a.position(iPosition);
        return bE;
    }

    public void c(byte[] bArr) {
        this.f1287a.get(bArr);
    }

    public void d(byte[] bArr, int i, int i2) {
        this.f1287a.get(bArr, i, i2);
    }

    public byte e() {
        return this.f1287a.get();
    }

    public int f() {
        return this.f1287a.getInt();
    }

    public long g() {
        return InOut.m ? this.f1287a.getLong() : ((long) f()) & 4294967295L;
    }

    public long h() {
        return this.f1287a.getLong();
    }

    public String i(int i, String str) {
        if (i == 0) {
            return "";
        }
        int iPosition = this.f1287a.position();
        byte[] bArr = this.f1288b;
        if (str == null || str.length() != i) {
            str = null;
            break;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (str.charAt(i2) != bArr[iPosition + i2]) {
                str = null;
                break;
            }
        }
        if (str == null) {
            str = new String(bArr, iPosition, i);
        }
        this.f1287a.position(iPosition + i);
        return str;
    }

    public void j() {
        this.f1287a.position(2);
    }

    public int k() {
        return this.f1287a.capacity();
    }

    public void l(int i) {
        ByteBuffer byteBuffer = this.f1287a;
        byteBuffer.position(byteBuffer.position() + i);
    }
}
