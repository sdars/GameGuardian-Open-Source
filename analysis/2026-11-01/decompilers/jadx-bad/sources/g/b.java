package g;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import luaj.LuaString;
import luaj.LuaValue;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    DataOutputStream f1569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f1570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f1571f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1566a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1567b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1568c = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f1572g = 0;

    public b(OutputStream outputStream, boolean z, boolean z2) {
        this.f1569d = new DataOutputStream(outputStream);
        this.f1570e = z;
        this.f1571f = z2;
    }

    public static int a(luaj.h hVar, OutputStream outputStream, boolean z, boolean z2) throws IOException {
        b bVar = new b(outputStream, z, z2);
        bVar.h();
        bVar.g(hVar, null);
        return bVar.f1572g;
    }

    void b(int i) throws IOException {
        this.f1569d.write(i);
    }

    void c(luaj.h hVar) throws IOException {
        int[] iArr = hVar.f1722b;
        int length = iArr.length;
        i(length);
        boolean z = this.f1571f;
        if (z) {
            iArr = new int[length];
        }
        if (z) {
            luaj.g.x(hVar, iArr);
        }
        for (int i = 0; i < length; i++) {
            i(iArr[i]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    void d(luaj.h hVar) throws IOException {
        DataOutputStream dataOutputStream = this.f1569d;
        LuaValue[] luaValueArr = hVar.f1721a;
        i(luaValueArr.length);
        for (LuaValue luaValue : luaValueArr) {
            int iC2 = luaValue.C2();
            if (iC2 == 0) {
                dataOutputStream.write(0);
            } else if (iC2 == 1) {
                dataOutputStream.write(1);
                b(luaValue.w2() ? 1 : 0);
            } else if (iC2 == 3) {
                int i = this.f1567b;
                if (i == 0) {
                    dataOutputStream.write(3);
                    f(luaValue.x2());
                } else {
                    if (i != 1) {
                        if (i != 4) {
                            throw new IllegalArgumentException("number format not supported: " + this.f1567b);
                        }
                        if (luaValue.h1()) {
                            dataOutputStream.write(-2);
                        } else {
                            dataOutputStream.write(3);
                            f(luaValue.x2());
                        }
                    } else {
                        if (!luaValue.h1()) {
                            throw new IllegalArgumentException("not an integer: " + luaValue);
                        }
                        dataOutputStream.write(3);
                    }
                    i(luaValue.y2());
                }
            } else {
                if (iC2 != 4) {
                    throw new IllegalArgumentException("bad type for " + luaValue);
                }
                dataOutputStream.write(4);
                j((LuaString) luaValue);
            }
        }
        int length = hVar.f1723c.length;
        i(length);
        for (int i2 = 0; i2 < length; i2++) {
            g(hVar.f1723c[i2], hVar.f1727g);
        }
    }

    void e(luaj.h hVar, LuaString luaString) throws IOException {
        if (this.f1570e || (luaString != null && luaString.P0(hVar.f1727g))) {
            i(0);
        } else {
            j(hVar.f1727g);
        }
        int[] iArr = hVar.f1724d;
        int length = this.f1570e ? 0 : iArr.length;
        i(length);
        for (int i = 0; i < length; i++) {
            i(iArr[i]);
        }
        f.b[] bVarArr = hVar.f1725e;
        int length2 = this.f1570e ? 0 : bVarArr.length;
        i(length2);
        for (int i2 = 0; i2 < length2; i2++) {
            f.b bVar = bVarArr[i2];
            j(bVar.f1556a);
            i(bVar.f1557b);
            i(bVar.f1558c);
        }
        f.d[] dVarArr = hVar.f1726f;
        int length3 = this.f1570e ? 0 : dVarArr.length;
        i(length3);
        for (int i3 = 0; i3 < length3; i3++) {
            j(dVarArr[i3].f1563a);
        }
    }

    void f(double d2) throws IOException {
        long jDoubleToLongBits = Double.doubleToLongBits(d2);
        if (this.f1566a) {
            jDoubleToLongBits = Long.reverseBytes(jDoubleToLongBits);
        }
        this.f1569d.writeLong(jDoubleToLongBits);
    }

    void g(luaj.h hVar, LuaString luaString) throws IOException {
        i(hVar.h);
        i(hVar.i);
        b(hVar.j);
        b(hVar.k);
        b(hVar.l);
        c(hVar);
        d(hVar);
        k(hVar);
        e(hVar, luaString);
    }

    void h() throws IOException {
        DataOutputStream dataOutputStream = this.f1569d;
        dataOutputStream.write(luaj.a.n);
        dataOutputStream.write(82);
        dataOutputStream.write(0);
        dataOutputStream.write(this.f1566a ? 1 : 0);
        dataOutputStream.write(4);
        dataOutputStream.write(4);
        dataOutputStream.write(4);
        dataOutputStream.write(this.f1568c);
        dataOutputStream.write(this.f1567b);
        dataOutputStream.write(luaj.a.o);
    }

    void i(int i) throws IOException {
        DataOutputStream dataOutputStream = this.f1569d;
        if (this.f1566a) {
            i = Integer.reverseBytes(i);
        }
        dataOutputStream.writeInt(i);
    }

    void j(LuaString luaString) throws IOException {
        if (luaString == null) {
            luaString = LuaValue.K2("");
        }
        int iY2 = luaString.r1().y2();
        i(iY2 + 1);
        luaString.q3(this.f1569d, 0, iY2);
        this.f1569d.write(0);
    }

    void k(luaj.h hVar) throws IOException {
        DataOutputStream dataOutputStream = this.f1569d;
        f.d[] dVarArr = hVar.f1726f;
        i(dVarArr.length);
        for (f.d dVar : dVarArr) {
            dataOutputStream.writeByte(dVar.f1564b ? 1 : 0);
            dataOutputStream.writeByte(dVar.f1565c);
        }
    }
}
