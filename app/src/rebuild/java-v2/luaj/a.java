package luaj;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.ext.Tools;
import android.ext.b2;
import android.ext.e1;
import android.ext.n2;
import android.ext.r;
import catch_.me_.if_.you_.can_.R;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static final Globals.d l = new c(null);
    public static String m = null;
    public static final byte[] n = {27, 76, 117, 97};
    public static final byte[] o = {25, -109, 13, 10, 26, 10};
    private static final LuaValue[] p = new LuaValue[0];
    private static final h[] q = new h[0];
    private static final ggf.b[] r = new ggf.b[0];
    private static final ggf.d[] s = new ggf.d[0];
    private static final int[] t = new int[0];
    public static volatile boolean u = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1701g;
    private int h;
    public final DataInputStream i;
    String j;
    private byte[] k = new byte[512];

    /* JADX INFO: renamed from: luaj.a$a, reason: collision with other inner class name */
    class RunnableC0028a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f1702a;

        /* JADX INFO: renamed from: luaj.a$a$a, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0029a implements DialogInterface.OnClickListener {
            DialogInterfaceOnClickListenerC0029a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                RunnableC0028a.this.f1702a.f1706a = null;
            }
        }

        /* JADX INFO: renamed from: luaj.a$a$b */
        class b implements DialogInterface.OnDismissListener {
            b() {
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                synchronized (RunnableC0028a.this.f1702a) {
                    RunnableC0028a.this.f1702a.notify();
                }
            }
        }

        RunnableC0028a(b bVar) {
            this.f1702a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertDialog.Builder neutralButton = android.ext.ggf.c(Tools.f0()).setMessage(a.this.j + "\n\n" + Tools.L1(b2.f(R.string.invalid_header), this.f1702a.f1706a)).setNeutralButton(b2.f(R.string.fix_it), new r.n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf2594440elqdu|0vfulswv0zlwk0fruuxswhg0ru0lqydolg0khdghuv2"));
            DialogInterfaceOnClickListenerC0029a dialogInterfaceOnClickListenerC0029a = new DialogInterfaceOnClickListenerC0029a();
            if (Tools.f489a.nextBoolean()) {
                neutralButton.setPositiveButton(b2.f(R.string.yes), dialogInterfaceOnClickListenerC0029a).setNegativeButton(b2.f(R.string.no), (DialogInterface.OnClickListener) null);
            } else {
                neutralButton.setNegativeButton(b2.f(R.string.yes), dialogInterfaceOnClickListenerC0029a).setPositiveButton(b2.f(R.string.no), (DialogInterface.OnClickListener) null);
            }
            AlertDialog alertDialogCreate = neutralButton.create();
            android.ext.f.k(alertDialogCreate, new b());
            android.ext.f.m(alertDialogCreate);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f1706a;
    }

    private static final class c implements Globals.d {
        private c() {
        }

        /* synthetic */ c(RunnableC0028a runnableC0028a) {
            this();
        }

        @Override // luaj.Globals.d
        public h a(InputStream inputStream, String str) {
            return a.o(inputStream, str);
        }
    }

    private a(InputStream inputStream, String str) {
        this.j = str;
        this.i = new DataInputStream(inputStream);
    }

    private static h a(h hVar, LuaString luaString) {
        if (hVar.f1729g == null) {
            hVar.f1729g = luaString;
        }
        int i = 0;
        while (true) {
            h[] hVarArr = hVar.f1725c;
            if (i >= hVarArr.length) {
                return hVar;
            }
            a(hVarArr[i], hVar.f1729g);
            i++;
        }
    }

    public static String b(String str) {
        if (str.startsWith("@") || str.startsWith("=")) {
            return str.substring(1);
        }
        return str.startsWith("\u001b") ? "=?" : str;
    }

    public static void c(Globals globals) {
        globals.l0 = l;
    }

    public static LuaValue n(long j) {
        if ((Long.MAX_VALUE & j) == 0) {
            return LuaValue.f1677g;
        }
        int i = ((int) ((j >> 52) & 2047)) - 1023;
        if (i >= 0 && i < 31) {
            long j2 = 4503599627370495L & j;
            int i2 = 52 - i;
            if ((j2 & ((1 << i2) - 1)) == 0) {
                int i3 = ((int) (j2 >> i2)) | (1 << i);
                return LuaLong.I2((j >> 63) != 0 ? -i3 : i3);
            }
        }
        return LuaValue.J2(Double.longBitsToDouble(j));
    }

    public static h o(InputStream inputStream, String str) throws IOException {
        String strB = str == null ? null : b(str);
        a aVar = new a(inputStream, strB);
        aVar.g();
        if (str == null) {
            return null;
        }
        int i = aVar.h;
        if (i == 0 || i == 1 || i == 4) {
            return a(aVar.f(), LuaString.K2(strB));
        }
        throw new d("unsupported int size: " + aVar.h);
    }

    void d(h hVar) throws IOException {
        int iH = h();
        LuaValue[] luaValueArr = iH > 0 ? new LuaValue[iH] : p;
        for (int i = 0; i < iH; i++) {
            byte b2 = this.i.readByte();
            if (b2 == -2) {
                luaValueArr[i] = LuaLong.I2(h());
            } else if (b2 == 0) {
                luaValueArr[i] = LuaValue.f1673c;
            } else if (b2 == 1) {
                luaValueArr[i] = this.i.readUnsignedByte() != 0 ? LuaValue.f1674d : LuaValue.f1675e;
            } else if (b2 == 3) {
                luaValueArr[i] = k();
            } else {
                if (b2 != 4) {
                    throw new IllegalStateException("bad constant");
                }
                luaValueArr[i] = l();
            }
        }
        hVar.f1723a = luaValueArr;
        int iH2 = h();
        h[] hVarArr = iH2 > 0 ? new h[iH2] : q;
        for (int i2 = 0; i2 < iH2; i2++) {
            hVarArr[i2] = f();
        }
        hVar.f1725c = hVarArr;
    }

    void e(h hVar) throws IOException {
        LuaString luaStringL = l();
        if (luaStringL != null) {
            hVar.f1729g = luaStringL;
        }
        hVar.f1726d = j();
        int iH = h();
        hVar.f1727e = iH > 0 ? new ggf.b[iH] : r;
        for (int i = 0; i < iH; i++) {
            hVar.f1727e[i] = new ggf.b(l(), h(), h());
        }
        int iH2 = h();
        for (int i2 = 0; i2 < iH2; i2++) {
            hVar.f1728f[i2].f1565a = l();
        }
    }

    public h f() throws IOException {
        h hVar = new h();
        hVar.h = h();
        hVar.i = h();
        hVar.j = this.i.readUnsignedByte();
        hVar.k = this.i.readUnsignedByte();
        int unsignedByte = this.i.readUnsignedByte();
        hVar.l = unsignedByte;
        if (unsignedByte >= hVar.j) {
            hVar.f1724b = j();
            d(hVar);
            m(hVar);
            e(hVar);
            return hVar;
        }
        throw new d("Damaged script 2: .maxstacksize (" + hVar.l + ") < .numparams (" + hVar.j + ")");
    }

    public void g() throws IOException {
        this.f1695a = this.i.readByte() & 255;
        this.f1696b = this.i.readByte() & 255;
        byte b2 = this.i.readByte();
        int i = 0;
        this.f1697c = b2 != 0;
        this.f1698d = this.i.readByte() & 255;
        this.f1699e = this.i.readByte() & 255;
        this.f1700f = this.i.readByte() & 255;
        this.f1701g = this.i.readByte() & 255;
        this.h = this.i.readByte() & 255;
        String string = "";
        if (this.f1695a != 82) {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(b2.f(R.string.unknown_version));
            sb.append(" ");
            sb.append(Tools.L1(b2.f(R.string.expected_found), "'" + Integer.toHexString(82) + "'", "'" + Integer.toHexString(this.f1695a) + "'"));
            sb.append("\n");
            string = sb.toString();
        }
        if (this.f1696b != 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(b2.f(R.string.unknown_format));
            sb2.append(" ");
            sb2.append(Tools.L1(b2.f(R.string.expected_found), "'0'", "'" + this.f1696b + "'"));
            sb2.append("\n");
            string = sb2.toString();
        }
        if (b2 != 0 && b2 != 1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append(b2.f(R.string.unknown_endianness));
            sb3.append(" ");
            sb3.append(Tools.L1(b2.f(R.string.expected_found), "'0' " + b2.f(R.string.or) + " '1'", "'" + (b2 & 255) + "'"));
            sb3.append("\n");
            string = sb3.toString();
        }
        if (this.f1698d != 4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(string);
            sb4.append(Tools.L1(b2.f(R.string.unknown_size_s), "int"));
            sb4.append(" ");
            sb4.append(Tools.L1(b2.f(R.string.expected_found), "'4'", "'" + this.f1698d + "'"));
            sb4.append("\n");
            string = sb4.toString();
        }
        if (this.f1699e != 4) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(string);
            sb5.append(Tools.L1(b2.f(R.string.unknown_size_s), "size_t"));
            sb5.append(" ");
            sb5.append(Tools.L1(b2.f(R.string.expected_found), "'4'", "'" + this.f1699e + "'"));
            sb5.append("\n");
            string = sb5.toString();
        }
        if (this.f1700f != 4) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(string);
            sb6.append(b2.f(R.string.unknown_size_instr));
            sb6.append(" ");
            sb6.append(Tools.L1(b2.f(R.string.expected_found), "'4'", "'" + this.f1700f + "'"));
            sb6.append("\n");
            string = sb6.toString();
        }
        int i2 = this.f1701g;
        if (i2 != 4 && i2 != 8) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(string);
            sb7.append(b2.f(R.string.unknown_size_num));
            sb7.append(" ");
            sb7.append(Tools.L1(b2.f(R.string.expected_found), "'4' " + b2.f(R.string.or) + " '8'", "'" + this.f1701g + "'"));
            sb7.append("\n");
            string = sb7.toString();
        }
        if (string.length() > 0) {
            if (u || n2.e()) {
                String str = "-------------------\n" + b2.f(R.string.invalid_header_1).trim() + "\n\n" + string + "\n" + b2.f(R.string.invalid_header_3).trim() + "\n-------------------\n";
                Tools.K1(str.trim(), 1);
                g.f1716b.println(str);
            } else {
                u = true;
                b bVar = new b();
                bVar.f1706a = string.trim();
                synchronized (bVar) {
                    try {
                        n2.i(new RunnableC0028a(bVar));
                        try {
                            bVar.wait();
                            if (bVar.f1706a != null) {
                                throw new d(b2.f(R.string.invalid_header_1).trim() + "\n\n" + string + "\n" + b2.f(R.string.invalid_header_3).trim());
                            }
                        } catch (InterruptedException e2) {
                            e1.s("Interrupted wait", e2);
                            Thread.currentThread().interrupt();
                            throw new d(e2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        while (true) {
            byte[] bArr = o;
            if (i >= bArr.length) {
                return;
            }
            byte b3 = this.i.readByte();
            if (b3 != bArr[i]) {
                throw new d("Unexpected byte in luac tail of header, index = " + i + " (" + (b3 & 255) + ", not " + (bArr[i] & 255) + ")");
            }
            i++;
        }
    }

    int h() throws IOException {
        int i;
        byte b2;
        this.i.readFully(this.k, 0, 4);
        if (this.f1697c) {
            byte[] bArr = this.k;
            i = ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | (bArr[3] << 24);
            b2 = bArr[0];
        } else {
            byte[] bArr2 = this.k;
            i = ((bArr2[1] & 255) << 16) | (bArr2[0] << 24) | ((bArr2[2] & 255) << 8);
            b2 = bArr2[3];
        }
        return (b2 & 255) | i;
    }

    long i() throws IOException {
        int iH;
        int iH2;
        if (this.f1697c) {
            iH2 = h();
            iH = h();
        } else {
            iH = h();
            iH2 = h();
        }
        return (((long) iH) << 32) | (((long) iH2) & 4294967295L);
    }

    int[] j() throws IOException {
        int i;
        byte b2;
        int iH = h();
        if (iH == 0) {
            return t;
        }
        int i2 = iH << 2;
        if (this.k.length < i2) {
            this.k = new byte[i2];
        }
        int i3 = 0;
        this.i.readFully(this.k, 0, i2);
        int[] iArr = new int[iH];
        int i4 = 0;
        while (i3 < iH) {
            if (this.f1697c) {
                byte[] bArr = this.k;
                i = (bArr[i4 + 3] << 24) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 1] & 255) << 8);
                b2 = bArr[i4];
            } else {
                byte[] bArr2 = this.k;
                i = (bArr2[i4] << 24) | ((bArr2[i4 + 1] & 255) << 16) | ((bArr2[i4 + 2] & 255) << 8);
                b2 = bArr2[i4 + 3];
            }
            iArr[i3] = (b2 & 255) | i;
            i3++;
            i4 += 4;
        }
        return iArr;
    }

    LuaValue k() {
        return this.h == 1 ? LuaLong.I2(h()) : n(i());
    }

    LuaString l() throws IOException {
        int i = this.f1699e == 8 ? (int) i() : h();
        if (i == 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.i.readFully(bArr, 0, i);
        return LuaString.p3(bArr, 0, i - 1);
    }

    void m(h hVar) throws IOException {
        int iH = h();
        hVar.f1728f = iH > 0 ? new ggf.d[iH] : s;
        for (int i = 0; i < iH; i++) {
            hVar.f1728f[i] = new ggf.d(null, this.i.readByte() != 0, this.i.readByte() & 255);
        }
    }
}
