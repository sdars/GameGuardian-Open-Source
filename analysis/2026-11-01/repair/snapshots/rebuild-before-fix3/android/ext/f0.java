package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import catch_.me_.if_.you_.can_.R;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
class f0 {
    public static volatile boolean v = false;
    public static volatile boolean w = false;
    public static volatile boolean x = false;
    static n0 y;
    private static final List z = new ArrayList();
    private static boolean A = true;
    static volatile String B = null;
    private static volatile String C = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    n0 f792a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Exchanger f794c = new Exchanger();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f795d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile int f796e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile int f797f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    volatile String f798g = "???";
    private volatile int h = 0;
    private volatile int i = 0;
    private volatile long j = 0;
    private volatile long k = -1;
    private volatile long l = 0;
    Thread m = new d0("mReaderThread");
    private volatile int n = 1;
    private volatile int o = 1;
    private volatile long p = 0;
    private final ArrayList q = new ArrayList();
    private final ArrayList r = new ArrayList();
    private final ArrayList s = new ArrayList();
    long t = 0;
    private Integer u = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final InOut f793b = new InOut();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f801c;

        a(byte b2, int i, long j) {
            this.f799a = b2;
            this.f800b = i;
            this.f801c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            InOut inOut = f0.this.f793b;
            inOut.q(this.f799a, (byte) 32, 0);
            inOut.u(this.f800b);
            inOut.v(this.f801c);
            f0.this.t0();
        }
    }

    class a0 extends android.ext.g0 {

        class a implements Runnable {

            /* JADX INFO: renamed from: android.ext.f0$a0$a$a, reason: collision with other inner class name */
            class DialogInterfaceOnClickListenerC0016a implements DialogInterface.OnClickListener {
                DialogInterfaceOnClickListenerC0016a() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (!Config.vSpaceReal || Config.C || (Config.B & 512) == 0) {
                        ConfigListAdapter.t(R.string.work_without_root);
                    } else {
                        Config.b(R.id.config_vspace_root).b();
                    }
                }
            }

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    AlertDialog alertDialogCreate = android.ext.f.b().setCustomTitle(Tools.g0(R.string.failed_load_daemon)).setMessage(b2.f(R.string.is_device_rooted) + "\n\n" + b2.f(R.string.must_be_root)).setPositiveButton(b2.f(R.string.fix_it), new DialogInterfaceOnClickListenerC0016a()).setNegativeButton(b2.f(R.string.ok), (DialogInterface.OnClickListener) null).create();
                    android.ext.f.m(alertDialogCreate);
                    Tools.u1(alertDialogCreate);
                } catch (Throwable th) {
                    e1.a(th);
                }
            }
        }

        a0(String str) {
            super(str);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x0177 A[Catch: all -> 0x0189, TRY_LEAVE, TryCatch #3 {all -> 0x0189, blocks: (B:37:0x0171, B:39:0x0177), top: B:76:0x0171 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x0185  */
        /* JADX WARN: Code duplicated, block: B:47:0x0193 A[Catch: all -> 0x01a5, TRY_LEAVE, TryCatch #1 {all -> 0x01a5, blocks: (B:45:0x018d, B:47:0x0193), top: B:74:0x018d }] */
        /* JADX WARN: Code duplicated, block: B:49:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:55:0x01af A[Catch: all -> 0x01c1, TRY_LEAVE, TryCatch #0 {all -> 0x01c1, blocks: (B:53:0x01a9, B:55:0x01af), top: B:72:0x01a9 }] */
        /* JADX WARN: Code duplicated, block: B:57:0x01bd  */
        /* JADX WARN: Code duplicated, block: B:68:0x0202  */
        /* JADX WARN: Code duplicated, block: B:85:0x0186 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:87:0x01a2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:90:0x01be A[SYNTHETIC] */
        /* JADX WARN: Instruction removed from duplicated block: B:68:0x0202, please report this as an issue */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean zEquals;
            String string;
            int i;
            int i2;
            int i3;
            String str;
            InOut inOut = f0.this.f793b;
            try {
                String strH = android.ext.e0.h();
                f0 f0Var = f0.this;
                n0 n0VarO0 = f0Var.O0(strH);
                f0Var.f792a = n0VarO0;
                e2.f745a = "";
                inOut.o(n0VarO0.f918c, n0VarO0.f917b);
                inOut.n(true);
                MainService.instance.q0();
                e1.o(n0VarO0.f916a, n0VarO0.f919d);
                byte[] bArrK = inOut.k();
                if (bArrK == null) {
                    str = "DI: null";
                } else if (bArrK.length != 7) {
                    str = "DI: " + bArrK.length;
                } else {
                    android.ext.w wVar = new android.ext.w(bArrK);
                    byte bE = wVar.e();
                    InOut.p(bE == 8);
                    byte bE2 = wVar.e();
                    if (bE2 != 4) {
                        e1.i("DI: QE " + ((int) bE2));
                    }
                    f0.this.f796e = wVar.f();
                    str = "DI: " + ((int) bE) + " " + ((int) bE2) + " " + f0.this.f796e;
                }
                e1.d(str);
                android.ext.w wVar2 = new android.ext.w(inOut.k());
                wVar2.e();
                byte[] bArr = new byte[wVar2.e()];
                wVar2.c(bArr);
                f0.this.f798g = new String(bArr);
                e1.d("InOut: x64: " + InOut.m + "; QE_ALIGN: 4; " + f0.this.f796e + "; " + f0.this.f798g);
                f0.this.m.start();
                MainService.instance.q0();
                inOut.m();
                f0.this.v0((byte) 0);
            } catch (l0 e2) {
                e1.l("start daemon failed", e2);
                String str2 = "" + e2.getMessage();
                StringBuilder sb = new StringBuilder();
                try {
                    String str3 = Build.CPU_ABI;
                    sb.append(str3);
                    sb.append("; ");
                    zEquals = "armeabi".equals(str3);
                    try {
                        String str4 = Build.CPU_ABI2;
                        sb.append(str4);
                        sb.append("; ");
                        if ("armeabi".equals(str4)) {
                            zEquals = true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        e1.s("Failed get ABI", th);
                        for (String str5 : Build.SUPPORTED_ABIS) {
                            sb.append(str5);
                            sb.append("; ");
                            if ("armeabi".equals(str5)) {
                                zEquals = true;
                            }
                        }
                        for (String str6 : Build.SUPPORTED_32_BIT_ABIS) {
                            sb.append(str6);
                            sb.append("; ");
                            if ("armeabi".equals(str6)) {
                                zEquals = true;
                            }
                        }
                        for (String str7 : Build.SUPPORTED_64_BIT_ABIS) {
                            sb.append(str7);
                            sb.append("; ");
                            if ("armeabi".equals(str7)) {
                                zEquals = true;
                            }
                        }
                        if (zEquals && b2.d("ydwa", "raw") == 0) {
                            str2 = str2 + "\n\n" + Tools.N1(R.string.try_arm_version) + ": " + android.ext.i.f999a;
                        }
                        string = sb.toString();
                        if (string.contains("mips")) {
                            str2 = str2 + "\n\n" + b2.f(R.string.mips_arch);
                        }
                        String str8 = str2 + "\n\nABIs: " + string + '\n' + ((Object) android.ext.e0.f730g) + '\n' + Build.VERSION.SDK_INT + '\n' + ((Object) android.ext.e0.h);
                        e1.d("Supported ABIs: " + string);
                        android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(R.string.failed_load_daemon)).setMessage(str8).setNegativeButton(b2.f(R.string.ok), (DialogInterface.OnClickListener) null));
                        inOut.n(false);
                        MainService.instance.q0();
                        f0.r();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    zEquals = false;
                }
                try {
                    while (i3 < r10) {
                        sb.append(str5);
                        sb.append("; ");
                        if ("armeabi".equals(str5)) {
                            zEquals = true;
                        }
                    }
                } catch (Throwable th3) {
                    e1.s("Failed get ABI", th3);
                }
                try {
                    while (i2 < r10) {
                        sb.append(str6);
                        sb.append("; ");
                        if ("armeabi".equals(str6)) {
                            zEquals = true;
                        }
                    }
                } catch (Throwable th4) {
                    e1.s("Failed get ABI", th4);
                }
                try {
                    while (i < r10) {
                        sb.append(str7);
                        sb.append("; ");
                        if ("armeabi".equals(str7)) {
                            zEquals = true;
                        }
                    }
                } catch (Throwable th5) {
                    e1.s("Failed get ABI", th5);
                }
                if (zEquals) {
                    str2 = str2 + "\n\n" + Tools.N1(R.string.try_arm_version) + ": " + android.ext.i.f999a;
                }
                string = sb.toString();
                if (string.contains("mips")) {
                    str2 = str2 + "\n\n" + b2.f(R.string.mips_arch);
                }
                String str9 = str2 + "\n\nABIs: " + string + '\n' + ((Object) android.ext.e0.f730g) + '\n' + Build.VERSION.SDK_INT + '\n' + ((Object) android.ext.e0.h);
                e1.d("Supported ABIs: " + string);
                android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(R.string.failed_load_daemon)).setMessage(str9).setNegativeButton(b2.f(R.string.ok), (DialogInterface.OnClickListener) null));
                inOut.n(false);
                MainService.instance.q0();
            } catch (Throwable th6) {
                e1.l("start daemon failed", th6);
                n2.i(new a());
                inOut.n(false);
                MainService.instance.q0();
            }
            f0.r();
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte[] f807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ byte f808c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f809d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f810e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f811f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f812g;

        b(byte[] bArr, byte[] bArr2, byte b2, long j, long j2, int i, String str) {
            this.f806a = bArr;
            this.f807b = bArr2;
            this.f808c = b2;
            this.f809d = j;
            this.f810e = j2;
            this.f811f = i;
            this.f812g = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            InOut inOut = f0.this.f793b;
            int length = this.f806a.length;
            int length2 = this.f807b.length;
            inOut.q(this.f808c, (byte) 61, 0);
            inOut.v(this.f809d);
            inOut.v(this.f810e);
            inOut.u(this.f811f);
            inOut.u(length);
            inOut.t(this.f806a, length);
            inOut.u(length2);
            inOut.t(this.f807b, length2);
            f0.this.t0();
            MainService.instance.h0(Tools.L1("%s: %s - %s > %s", b2.f(R.string.dump_memory), android.ext.c.G(this.f809d, 4), android.ext.c.G(this.f810e, 4), this.f812g));
        }
    }

    class b0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f813a;

        b0(byte b2) {
            this.f813a = b2;
        }

        @Override // java.lang.Runnable
        public void run() {
            f0 f0Var = f0.this;
            InOut inOut = f0Var.f793b;
            f0Var.L0(this.f813a, (byte) 1);
            f0.this.u0(this.f813a, (byte) 45);
            inOut.n(false);
            MainService.instance.q0();
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f818d;

        c(byte b2, long j, long j2, int i) {
            this.f815a = b2;
            this.f816b = j;
            this.f817c = j2;
            this.f818d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            InOut inOut = f0.this.f793b;
            inOut.q(this.f815a, (byte) 62, 0);
            inOut.v(this.f816b);
            inOut.v(this.f817c);
            inOut.u(this.f818d);
            f0.this.t0();
        }
    }

    class c0 implements Runnable {
        c0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainService.instance.W(MainService.instance.Y);
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean[] f823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ double f826f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ double f827g;

        d(byte b2, int i, boolean[] zArr, long j, long j2, double d2, double d3) {
            this.f821a = b2;
            this.f822b = i;
            this.f823c = zArr;
            this.f824d = j;
            this.f825e = j2;
            this.f826f = d2;
            this.f827g = d3;
        }

        @Override // java.lang.Runnable
        public void run() {
            InOut inOut = f0.this.f793b;
            inOut.q(this.f821a, (byte) 35, 0);
            inOut.u(this.f822b | 17);
            f0.this.W0(this.f823c);
            inOut.w(this.f824d);
            inOut.w(this.f825e);
            inOut.w(Double.doubleToRawLongBits(this.f826f));
            inOut.w(Double.doubleToRawLongBits(this.f827g));
            f0.this.t0();
        }
    }

    class d0 extends android.ext.g0 {

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ byte[] f829a;

            a(byte[] bArr) {
                this.f829a = bArr;
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                try {
                    f0.this.h0(this.f829a);
                } catch (IOException e2) {
                    e1.l("Failed process message: " + ((int) this.f829a[0]) + ' ' + this.f829a.length, e2);
                }
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f0.this.g0();
            }
        }

        d0(String str) {
            super(str);
        }

        private void a(byte[] bArr) {
            try {
                Exchanger exchanger = f0.this.f794c;
                while (!Thread.interrupted()) {
                    try {
                        exchanger.exchange(bArr, 500L, TimeUnit.MILLISECONDS);
                        return;
                    } catch (InterruptedException unused) {
                    }
                }
            } catch (Throwable th) {
                e1.l("handleMemoryItem failed", th);
            }
        }

        private void b(byte[] bArr) {
            if (bArr[0] == 20 && bArr[1] == 0) {
                a(bArr);
            } else {
                n2.d().post(new a(bArr));
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            InOut inOut = f0.this.f793b;
            while (!Thread.interrupted()) {
                try {
                    byte[] bArrK = inOut.k();
                    f0.B = null;
                    if (bArrK != null) {
                        b(bArrK);
                    }
                } catch (Throwable th) {
                    e1.l("Read error", th);
                    f0.B = th.toString();
                    n2.d().post(new b());
                    return;
                }
            }
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean[] f833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f834c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f835d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f836e;

        e(byte b2, boolean[] zArr, int i, int i2, long j) {
            this.f832a = b2;
            this.f833b = zArr;
            this.f834c = i;
            this.f835d = i2;
            this.f836e = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            InOut inOut = f0.this.f793b;
            inOut.q(this.f832a, (byte) 35, 0);
            inOut.u(16);
            f0.this.W0(this.f833b);
            inOut.u(this.f834c);
            inOut.u(this.f835d);
            inOut.w(this.f836e);
            f0.this.t0();
        }
    }

    class e0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f841d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f842e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f843f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f844g;
        final /* synthetic */ int h;
        final /* synthetic */ long i;
        final /* synthetic */ int j;
        final /* synthetic */ int k;
        final /* synthetic */ int l;
        final /* synthetic */ double m;
        final /* synthetic */ int n;

        e0(byte b2, int i, int i2, int i3, long j, long j2, long j3, int i4, long j4, int i5, int i6, int i7, double d2, int i8) {
            this.f838a = b2;
            this.f839b = i;
            this.f840c = i2;
            this.f841d = i3;
            this.f842e = j;
            this.f843f = j2;
            this.f844g = j3;
            this.h = i4;
            this.i = j4;
            this.j = i5;
            this.k = i6;
            this.l = i7;
            this.m = d2;
            this.n = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            InOut inOut = f0.this.f793b;
            inOut.q(this.f838a, (byte) 39, 0);
            inOut.u(this.f839b);
            inOut.u(this.f840c);
            inOut.u(this.f841d);
            inOut.w(this.f842e);
            inOut.w(this.f843f);
            inOut.w(this.f844g);
            inOut.u(this.h);
            inOut.w(this.i);
            inOut.u(this.j);
            inOut.u(this.k);
            inOut.u(this.l);
            inOut.w(Double.doubleToRawLongBits(this.m));
            inOut.u(this.n);
            f0.this.t0();
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean[] f847c;

        f(byte b2, int i, boolean[] zArr) {
            this.f845a = b2;
            this.f846b = i;
            this.f847c = zArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            InOut inOut = f0.this.f793b;
            inOut.q(this.f845a, (byte) 35, 0);
            inOut.u(this.f846b | 32);
            f0.this.W0(this.f847c);
            f0.this.t0();
        }
    }

    /* JADX INFO: renamed from: android.ext.f0$f0, reason: collision with other inner class name */
    class RunnableC0017f0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int[] f849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long[] f851c;

        RunnableC0017f0(int[] iArr, byte b2, long[] jArr) {
            this.f849a = iArr;
            this.f850b = b2;
            this.f851c = jArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            InOut inOut = f0.this.f793b;
            int length = this.f849a.length;
            int i = 0;
            while (i < length) {
                int i2 = length - i;
                if (i2 > 100000000) {
                    i2 = 100000000;
                }
                inOut.q(this.f850b, (byte) 36, (InOut.n + 4) * i2);
                inOut.u(i2);
                int i3 = i2 + i;
                while (i < i3) {
                    int i4 = this.f849a[i];
                    if (i4 != 0) {
                        inOut.u(i4);
                        inOut.v(this.f851c[i]);
                    }
                    i++;
                }
                inOut.u(0);
                f0.this.t0();
                i = i3;
            }
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f854b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean[] f855c;

        g(byte b2, int i, boolean[] zArr) {
            this.f853a = b2;
            this.f854b = i;
            this.f855c = zArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            InOut inOut = f0.this.f793b;
            inOut.q(this.f853a, (byte) 35, 0);
            inOut.u(this.f854b | 8);
            f0.this.W0(this.f855c);
            f0.this.t0();
        }
    }

    class g0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f859c;

        g0(byte b2, long j, int i) {
            this.f857a = b2;
            this.f858b = j;
            this.f859c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            InOut inOut = f0.this.f793b;
            inOut.q(this.f857a, (byte) 50, 0);
            inOut.v(this.f858b);
            inOut.u(this.f859c);
            inOut.s((byte) 0);
            f0.this.t0();
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f863c;

        h(byte b2, long j, int i) {
            this.f861a = b2;
            this.f862b = j;
            this.f863c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            f0 f0Var = f0.this;
            InOut inOut = f0Var.f793b;
            f0Var.u0(this.f861a, (byte) 58);
            inOut.q(this.f861a, (byte) 59, 0);
            inOut.v(this.f862b);
            inOut.u(this.f863c);
            f0.this.t0();
        }
    }

    class h0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ byte f867c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f868d;

        h0(String str, String str2, byte b2, int i) {
            this.f865a = str;
            this.f866b = str2;
            this.f867c = b2;
            this.f868d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            InOut inOut = f0.this.f793b;
            byte[] bytes = this.f865a.getBytes();
            int length = bytes.length;
            if (length > 255) {
                length = 255;
            }
            String str = this.f866b;
            byte[] bytes2 = str == null ? ggd.b.f1513c : str.getBytes();
            int length2 = bytes2.length;
            int i = length2 <= 255 ? length2 : 255;
            inOut.q(this.f867c, (byte) 37, 0);
            inOut.u(this.f868d);
            inOut.s((byte) length);
            inOut.t(bytes, length);
            inOut.s((byte) i);
            inOut.t(bytes2, i);
            f0.this.t0();
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int[] f870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f874e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f875f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f876g;
        final /* synthetic */ long[] h;
        final /* synthetic */ long[] i;

        i(int[] iArr, byte b2, int i, int i2, long j, long j2, long j3, long[] jArr, long[] jArr2) {
            this.f870a = iArr;
            this.f871b = b2;
            this.f872c = i;
            this.f873d = i2;
            this.f874e = j;
            this.f875f = j2;
            this.f876g = j3;
            this.h = jArr;
            this.i = jArr2;
        }

        @Override // java.lang.Runnable
        public void run() {
            InOut inOut = f0.this.f793b;
            int length = this.f870a.length;
            android.ext.y yVar = new android.ext.y();
            yVar.a(b2.f(R.string.union));
            yVar.a(" = ");
            inOut.q(this.f871b, (byte) 55, 0);
            inOut.u(this.f872c);
            inOut.u(this.f873d);
            inOut.v(this.f874e);
            inOut.v(this.f875f);
            inOut.v(this.f876g);
            inOut.u(length);
            for (int i = 0; i < length; i++) {
                long[] jArr = this.h;
                jArr[i] = android.ext.c.h(jArr[i], this.f870a[i]);
                long[] jArr2 = this.i;
                jArr2[i] = android.ext.c.h(jArr2[i], this.f870a[i]);
                inOut.u(this.f870a[i]);
                inOut.w(this.h[i]);
                inOut.w(this.i[i]);
                String strK = android.ext.c.K(0L, this.h[i], this.f870a[i]);
                if ((this.f870a[i] & 805306368) != 0) {
                    strK = strK + '~' + android.ext.c.K(0L, this.i[i], this.f870a[i]);
                }
                if ((this.f870a[i] & 268435456) != 0) {
                    strK = "≠ " + strK;
                }
                if (i != 0) {
                    yVar.a("; ");
                }
                yVar.a(Tools.t(strK + ((Object) android.ext.c.A(this.f870a[i])), android.ext.c.n(this.f870a[i])));
            }
            f0.this.t0();
            yVar.a(" :");
            if ((this.f872c & 4194304) != 0) {
                yVar.a(":");
            }
            yVar.a(Tools.L1("%,d", Integer.valueOf(this.f873d)));
            MainService.instance.h0(yVar.d());
            f0.w = false;
        }
    }

    class i0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f878b;

        i0(byte[] bArr, byte b2) {
            this.f877a = bArr;
            this.f878b = b2;
        }

        @Override // java.lang.Runnable
        public void run() {
            InOut inOut = f0.this.f793b;
            int length = this.f877a.length;
            inOut.q(this.f878b, (byte) 48, length + 4);
            inOut.u(length);
            inOut.t(this.f877a, length);
            f0.this.t0();
        }
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f881b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f882c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f883d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f884e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f885f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f886g;

        j(byte b2, long j, long j2, int i, long j3, long j4, long j5) {
            this.f880a = b2;
            this.f881b = j;
            this.f882c = j2;
            this.f883d = i;
            this.f884e = j3;
            this.f885f = j4;
            this.f886g = j5;
        }

        @Override // java.lang.Runnable
        public void run() {
            InOut inOut = f0.this.f793b;
            inOut.q(this.f880a, (byte) 63, 0);
            inOut.v(this.f881b);
            inOut.v(this.f882c);
            inOut.u(this.f883d);
            inOut.v(this.f884e);
            inOut.v(this.f885f);
            inOut.v(this.f886g);
            f0.this.t0();
            f0.w = false;
        }
    }

    static class j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long[] f887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int[] f888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f889c;

        public j0(long[] jArr, int[] iArr) {
            this.f887a = jArr;
            this.f888b = iArr;
        }
    }

    class k implements DialogInterface.OnClickListener {
        k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            ConfigListAdapter.b();
        }
    }

    private static class k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.ext.c f891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f892b;

        public k0(android.ext.c cVar, int i) {
            this.f891a = cVar;
            this.f892b = i;
        }
    }

    class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ short f894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f896d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f897e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f898f;

        l(byte b2, short s, int i, long j, long j2, long j3) {
            this.f893a = b2;
            this.f894b = s;
            this.f895c = i;
            this.f896d = j;
            this.f897e = j2;
            this.f898f = j3;
        }

        @Override // java.lang.Runnable
        public void run() {
            InOut inOut = f0.this.f793b;
            inOut.q(this.f893a, (byte) 64, 0);
            inOut.u(this.f894b);
            inOut.u(this.f895c);
            inOut.v(this.f896d);
            inOut.v(this.f897e);
            inOut.v(this.f898f);
            f0.this.t0();
            f0.w = false;
        }
    }

    private static class l0 extends Exception {
        public l0(String str) {
            super(str);
        }
    }

    class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f902c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f903d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f904e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ byte[] f905f;

        m(byte b2, int i, long j, long j2, long j3, byte[] bArr) {
            this.f900a = b2;
            this.f901b = i;
            this.f902c = j;
            this.f903d = j2;
            this.f904e = j3;
            this.f905f = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            InOut inOut = f0.this.f793b;
            inOut.q(this.f900a, (byte) 34, 0);
            inOut.u(this.f901b);
            inOut.v(this.f902c);
            inOut.v(this.f903d);
            inOut.v(this.f904e);
            inOut.u(this.f905f.length);
            byte[] bArr = this.f905f;
            inOut.t(bArr, bArr.length);
            f0.this.t0();
            f0.w = false;
        }
    }

    static class m0 implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f908b;

        public m0(long j, int i) {
            this.f907a = j;
            this.f908b = i;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(m0 m0Var) {
            long j = this.f907a;
            long j2 = m0Var.f907a;
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }
    }

    class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f911c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f912d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f913e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f914f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f915g;
        final /* synthetic */ long h;

        n(byte b2, long j, long j2, int i, int i2, long j3, long j4, long j5) {
            this.f909a = b2;
            this.f910b = j;
            this.f911c = j2;
            this.f912d = i;
            this.f913e = i2;
            this.f914f = j3;
            this.f915g = j4;
            this.h = j5;
        }

        @Override // java.lang.Runnable
        public void run() {
            InOut inOut = f0.this.f793b;
            inOut.q(this.f909a, (byte) 38, 0);
            inOut.w(this.f910b);
            inOut.w(this.f911c);
            inOut.u(this.f912d);
            inOut.u(this.f913e);
            inOut.v(this.f914f);
            inOut.v(this.f915g);
            inOut.v(this.h);
            f0.this.t0();
            f0.w = (this.f913e & Integer.MIN_VALUE) != 0;
        }
    }

    static final class n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Process f916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        OutputStream f917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        InputStream f918c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        InputStream f919d;

        n0() {
        }
    }

    class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f921b;

        o(Object[] objArr, byte b2) {
            this.f920a = objArr;
            this.f921b = b2;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.c cVar;
            int i;
            InOut inOut = f0.this.f793b;
            int length = this.f920a.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = length - i2;
                if (i3 > 100000000) {
                    i3 = 100000000;
                }
                inOut.q(this.f921b, (byte) 43, (InOut.n + 16) * i3);
                inOut.u(i3);
                int i4 = i3 + i2;
                while (i2 < i4) {
                    Object obj = this.f920a[i2];
                    if (obj instanceof k0) {
                        k0 k0Var = (k0) obj;
                        cVar = k0Var.f891a;
                        i = k0Var.f892b;
                    } else {
                        cVar = (android.ext.c) obj;
                        i = 0;
                    }
                    int i5 = cVar.f674c;
                    if (i5 != 0) {
                        inOut.u(i5);
                        inOut.v(cVar.f672a);
                        inOut.w(cVar.f673b);
                        inOut.u(i);
                    }
                    i2++;
                }
                inOut.u(0);
                f0.this.t0();
                i2 = i4;
            }
        }
    }

    class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h2[] f923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f924b;

        p(h2[] h2VarArr, byte b2) {
            this.f923a = h2VarArr;
            this.f924b = b2;
        }

        @Override // java.lang.Runnable
        public void run() {
            InOut inOut = f0.this.f793b;
            int length = this.f923a.length;
            int i = 0;
            while (i < length) {
                int i2 = length - i;
                if (i2 > 100000000) {
                    i2 = 100000000;
                }
                inOut.q(this.f924b, (byte) 40, (InOut.n + 29) * i2);
                int i3 = i2 + i;
                while (i < i3) {
                    h2 h2Var = this.f923a[i];
                    int i4 = h2Var.f674c;
                    if (i4 != 0) {
                        inOut.u(i4);
                        inOut.v(h2Var.f672a);
                        inOut.w(h2Var.f673b);
                        inOut.s(h2Var.n);
                        inOut.w(h2Var.o);
                        inOut.w(h2Var.p);
                    }
                    i++;
                }
                inOut.u(0);
                f0.this.t0();
                i = i3;
            }
        }
    }

    class q implements Runnable {

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                Config.b(R.id.config_hide_from_game).f42d = 0;
                Config.k();
            }
        }

        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(R.string.bad_settings)).setMessage(b2.f(R.string.freeze_lags)).setPositiveButton(b2.f(R.string.fix_it), new a()).setNegativeButton(b2.f(R.string.skip), (DialogInterface.OnClickListener) null));
        }
    }

    class r implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h2[] f928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f929b;

        r(h2[] h2VarArr, byte b2) {
            this.f928a = h2VarArr;
            this.f929b = b2;
        }

        @Override // java.lang.Runnable
        public void run() {
            InOut inOut = f0.this.f793b;
            int length = this.f928a.length;
            int i = 0;
            while (i < length) {
                int i2 = length - i;
                if (i2 > 100000000) {
                    i2 = 100000000;
                }
                inOut.q(this.f929b, (byte) 41, (InOut.n + 4) * i2);
                int i3 = i2 + i;
                while (i < i3) {
                    h2 h2Var = this.f928a[i];
                    int i4 = h2Var.f674c;
                    if (i4 != 0) {
                        inOut.u(i4);
                        inOut.v(h2Var.f672a);
                    }
                    i++;
                }
                inOut.u(0);
                f0.this.t0();
                i = i3;
            }
        }
    }

    class s implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j0 f931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f932b;

        s(j0 j0Var, byte b2) {
            this.f931a = j0Var;
            this.f932b = b2;
        }

        @Override // java.lang.Runnable
        public void run() {
            InOut inOut = f0.this.f793b;
            int length = this.f931a.f887a.length;
            int i = 0;
            while (i < length) {
                int i2 = length - i;
                if (i2 > 100000000) {
                    i2 = 100000000;
                }
                inOut.q(this.f932b, (byte) 33, (InOut.n + 4) * i2);
                inOut.u(i2);
                j0 j0Var = this.f931a;
                int[] iArr = j0Var.f888b;
                long[] jArr = j0Var.f887a;
                int i3 = i2 + i;
                while (i < i3) {
                    inOut.u(iArr[i]);
                    inOut.v(jArr[i]);
                    i++;
                }
                f0.this.t0();
                i = i3;
            }
        }
    }

    class t implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j0 f934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f935b;

        t(j0 j0Var, byte b2) {
            this.f934a = j0Var;
            this.f935b = b2;
        }

        @Override // java.lang.Runnable
        public void run() {
            InOut inOut = f0.this.f793b;
            int length = this.f934a.f887a.length;
            int i = 0;
            while (i < length) {
                int i2 = length - i;
                if (i2 > 100000000) {
                    i2 = 100000000;
                }
                inOut.q(this.f935b, (byte) 52, (InOut.n + 4) * i2);
                inOut.u(i2);
                j0 j0Var = this.f934a;
                int[] iArr = j0Var.f888b;
                long[] jArr = j0Var.f887a;
                int i3 = i2 + i;
                while (i < i3) {
                    inOut.u(iArr[i]);
                    inOut.v(jArr[i]);
                    i++;
                }
                f0.this.t0();
                i = i3;
            }
        }
    }

    class u implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f938b;

        u(byte b2, byte b3) {
            this.f937a = b2;
            this.f938b = b3;
        }

        @Override // java.lang.Runnable
        public void run() {
            InOut inOut = f0.this.f793b;
            inOut.q(this.f937a, (byte) 53, 0);
            inOut.s(this.f938b);
            f0.this.t0();
        }
    }

    class v implements Runnable {
        v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handlerC = n2.c();
            handlerC.removeCallbacks(this);
            if (f0.this.e0()) {
                handlerC.postDelayed(this, 1000L);
            }
        }
    }

    class w implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte[] f942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f943c;

        w(byte b2, byte[] bArr, String str) {
            this.f941a = b2;
            this.f942b = bArr;
            this.f943c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            InOut inOut = f0.this.f793b;
            inOut.q(this.f941a, (byte) 54, 0);
            inOut.u(Config.h);
            inOut.u(Config.A);
            inOut.w(Config.j);
            inOut.u(Config.m);
            inOut.u(Config.i);
            inOut.u(this.f942b.length);
            byte[] bArr = this.f942b;
            inOut.t(bArr, bArr.length);
            long jE = inOut.e();
            f0 f0Var = f0.this;
            if (jE != f0Var.t) {
                f0Var.t = jE;
                f0Var.t0();
                e1.d("Sended config: " + Config.h + ' ' + Integer.toBinaryString(Config.A) + ' ' + Long.toBinaryString(Config.j) + ' ' + Config.m + ' ' + Config.i + ' ' + this.f943c + "; " + this.f942b.length);
            }
        }
    }

    class x implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f945a;

        x(byte b2) {
            this.f945a = b2;
        }

        @Override // java.lang.Runnable
        public void run() {
            InOut inOut = f0.this.f793b;
            inOut.q(this.f945a, (byte) 47, 0);
            inOut.u(Process.myPid());
            inOut.u(f0.this.f797f);
            f0.this.t0();
        }
    }

    class y implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f948b;

        y(byte b2, byte b3) {
            this.f947a = b2;
            this.f948b = b3;
        }

        @Override // java.lang.Runnable
        public void run() {
            f0.this.f793b.q(this.f947a, this.f948b, 0);
            f0.this.t0();
        }
    }

    class z implements Runnable {
        z() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0.this.g0();
        }
    }

    private int A(byte b2) {
        h2[] h2VarArr;
        ArrayList arrayList = this.s;
        synchronized (arrayList) {
            h2VarArr = (h2[]) arrayList.toArray(new h2[arrayList.size()]);
            arrayList.clear();
            arrayList.trimToSize();
        }
        int length = h2VarArr.length;
        if (length != 0) {
            n2.j(new r(h2VarArr, b2));
        }
        return length;
    }

    private boolean[] I(int i2) {
        return (i2 == 1 ? MainService.instance.o0 : MainService.instance.n0).b();
    }

    private String[] K(boolean z2, String str, File file) {
        String[] strArr = new String[5];
        strArr[0] = str;
        strArr[1] = Tools.C0();
        strArr[2] = file.getAbsolutePath();
        strArr[3] = T();
        strArr[4] = Config.C ? "1" : "0";
        if (z2) {
            return strArr;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("exec");
        for (int i2 = 0; i2 < 5; i2++) {
            String str2 = strArr[i2];
            sb.append(' ');
            sb.append(str2);
        }
        return new String[]{sb.toString()};
    }

    static j0 M0(List list, boolean z2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            android.ext.c cVar = (android.ext.c) list.get(i2);
            if (cVar != null) {
                arrayList.add(new m0(android.ext.e.a(cVar.f672a, z2), cVar.f674c));
            }
        }
        m0[] m0VarArr = (m0[]) arrayList.toArray(new m0[arrayList.size()]);
        Arrays.sort(m0VarArr);
        ArrayList arrayList2 = new ArrayList(m0VarArr.length);
        m0 m0Var = null;
        for (m0 m0Var2 : m0VarArr) {
            if (m0Var2 != null) {
                if (m0Var == null || m0Var.f907a != m0Var2.f907a) {
                    arrayList2.add(m0Var2);
                    m0Var = m0Var2;
                } else {
                    m0Var.f908b = m0Var2.f908b | m0Var.f908b;
                }
            }
        }
        int size2 = arrayList2.size();
        long[] jArr = new long[size2];
        int[] iArr = new int[size2];
        int i3 = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            m0 m0Var3 = (m0) arrayList2.get(i4);
            jArr[i4] = m0Var3.f907a;
            int i5 = m0Var3.f908b;
            iArr[i4] = i5;
            i3 |= i5;
        }
        j0 j0Var = new j0(jArr, iArr);
        j0Var.f889c = i3 & 127;
        return j0Var;
    }

    private void R0() {
        this.f795d = false;
    }

    /* JADX WARN: Code duplicated, block: B:155:0x030c A[Catch: all -> 0x033e, TryCatch #17 {all -> 0x033e, blocks: (B:151:0x02e9, B:152:0x0303, B:155:0x030c, B:159:0x0339, B:158:0x0317, B:162:0x0342), top: B:217:0x02e9 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0316  */
    /* JADX WARN: Code duplicated, block: B:158:0x0317 A[Catch: all -> 0x033e, TryCatch #17 {all -> 0x033e, blocks: (B:151:0x02e9, B:152:0x0303, B:155:0x030c, B:159:0x0339, B:158:0x0317, B:162:0x0342), top: B:217:0x02e9 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0367 A[Catch: all -> 0x0392, TryCatch #13 {all -> 0x0392, blocks: (B:163:0x034b, B:165:0x0367, B:178:0x0395, B:168:0x0370, B:170:0x037b, B:172:0x0381, B:174:0x038d, B:179:0x0398), top: B:210:0x034b }] */
    /* JADX WARN: Code duplicated, block: B:167:0x036f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0370 A[Catch: all -> 0x0392, TryCatch #13 {all -> 0x0392, blocks: (B:163:0x034b, B:165:0x0367, B:178:0x0395, B:168:0x0370, B:170:0x037b, B:172:0x0381, B:174:0x038d, B:179:0x0398), top: B:210:0x034b }] */
    /* JADX WARN: Code duplicated, block: B:170:0x037b A[Catch: all -> 0x0392, TryCatch #13 {all -> 0x0392, blocks: (B:163:0x034b, B:165:0x0367, B:178:0x0395, B:168:0x0370, B:170:0x037b, B:172:0x0381, B:174:0x038d, B:179:0x0398), top: B:210:0x034b }] */
    /* JADX WARN: Code duplicated, block: B:231:0x0395 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static String S0(String str) {
        String str2;
        String str3;
        String str4;
        File file;
        String str5;
        String string;
        String str6;
        String str7;
        String str8;
        String str9;
        String strTrim;
        StringBuilder sb;
        int i2;
        String str10;
        String string2;
        int i3;
        String str11;
        File file2;
        String str12;
        String str13;
        String str14 = str;
        String str15 = "\n";
        try {
            File file3 = new File(str14);
            if (!file3.exists() || !file3.canExecute()) {
                return null;
            }
            String name = file3.getName();
            int i4 = 5;
            String[] strArr = {"/system/bin", "/system/xbin", "/sbin/.magisk/mirror/data", "/sbin/.magisk/modules", "/sbin"};
            int i5 = 0;
            while (true) {
                String str16 = "exit";
                str3 = "; chmod 0755 ";
                if (i5 < i4) {
                    try {
                        File file4 = new File(strArr[i5], name);
                        if (file4.exists() && file4.canExecute() && file3.length() == file4.length()) {
                            return file4.getAbsolutePath();
                        }
                        i5++;
                        i4 = 5;
                    } catch (Throwable th) {
                        th = th;
                        str4 = "/sbin";
                        str15 = "\n";
                        file = file3;
                        str3 = "; chmod 0755 ";
                        string = null;
                        str14 = str14;
                        str5 = "exit";
                    }
                } else {
                    try {
                        String[] strArrSplit = e2.n("exec mount", 10).split("\n");
                        int length = strArrSplit.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= length) {
                                str6 = null;
                                str7 = null;
                                break;
                            }
                            int i7 = length;
                            String str17 = strArrSplit[i6];
                            if (str17 != null && str17.contains(" /system ")) {
                                String[] strArrSplit2 = str17.trim().split(" ");
                                int length2 = strArrSplit2.length;
                                int i8 = 0;
                                String str18 = null;
                                while (true) {
                                    if (i8 >= length2) {
                                        strTrim = null;
                                        break;
                                    }
                                    String[] strArr2 = strArrSplit2;
                                    strTrim = strArrSplit2[i8].trim();
                                    int i9 = length2;
                                    if (!"on".equals(strTrim) && !"type".equals(strTrim) && !"/system".equals(strTrim)) {
                                        if (str18 != null) {
                                            break;
                                        }
                                        str18 = strTrim;
                                    }
                                    i8++;
                                    length2 = i9;
                                    strArrSplit2 = strArr2;
                                }
                                str7 = strTrim;
                                str6 = str18;
                                break;
                            }
                            i6++;
                            length = i7;
                            strArrSplit = strArrSplit;
                        }
                        if (str6 == null) {
                            return null;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        str4 = "/sbin";
                        file = file3;
                        try {
                            String[] strArr3 = new String[2];
                            try {
                                strArr3[0] = "rw";
                                strArr3[1] = "ro";
                                int i10 = 0;
                                for (int i11 = 2; i10 < i11; i11 = 2) {
                                    try {
                                        String str19 = strArr3[i10];
                                        String[] strArr4 = strArr3;
                                        str8 = str16;
                                        try {
                                            String[] strArr5 = new String[4];
                                            try {
                                                strArr5[0] = "";
                                                strArr5[1] = "/system/bin/";
                                                int i12 = i10;
                                                strArr5[2] = "/system/xbin/";
                                                strArr5[3] = "/system/sbin/";
                                                int i13 = 0;
                                                for (int i14 = 4; i13 < i14; i14 = 4) {
                                                    try {
                                                        String str20 = strArr5[i13];
                                                        str9 = str3;
                                                        String[] strArr6 = strArr5;
                                                        try {
                                                            String[] strArr7 = new String[2];
                                                            try {
                                                                strArr7[0] = str19 + ",remount";
                                                                strArr7[1] = "remount," + str19;
                                                                int i15 = 0;
                                                                while (i15 < 2) {
                                                                    String str21 = strArr7[i15];
                                                                    String[] strArr8 = strArr7;
                                                                    String[] strArr9 = {null, str7};
                                                                    String str22 = str7;
                                                                    int i16 = 0;
                                                                    for (int i17 = 2; i16 < i17; i17 = 2) {
                                                                        String str23 = strArr9[i16];
                                                                        sb2.append(str20);
                                                                        String str24 = str20;
                                                                        sb2.append("mount -o ");
                                                                        sb2.append(str21);
                                                                        if (str23 != null) {
                                                                            sb2.append(" -t ");
                                                                            sb2.append(str23);
                                                                        }
                                                                        sb2.append(" ");
                                                                        sb2.append(str6);
                                                                        sb2.append(" /system; ");
                                                                        i16++;
                                                                        str20 = str24;
                                                                    }
                                                                    i15++;
                                                                    str7 = str22;
                                                                    strArr7 = strArr8;
                                                                }
                                                                i13++;
                                                                strArr5 = strArr6;
                                                                str3 = str9;
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                str14 = str;
                                                                str15 = "\n";
                                                                str5 = str8;
                                                                str3 = str9;
                                                                string = null;
                                                                e1.l("Failed remount 2 " + str14 + str15 + string, th);
                                                                sb = new StringBuilder();
                                                                i2 = 0;
                                                                while (i2 < 5) {
                                                                    str12 = strArr[i2];
                                                                    str13 = str4;
                                                                    if (!str12.startsWith(str13)) {
                                                                        File file5 = new File(str12, name);
                                                                        sb.append("cp -f ");
                                                                        sb.append(str14);
                                                                        sb.append(" ");
                                                                        sb.append(file5.getAbsolutePath());
                                                                        sb.append(str3);
                                                                        sb.append(file5.getAbsolutePath());
                                                                        sb.append("; ");
                                                                    }
                                                                    i2++;
                                                                    str4 = str13;
                                                                }
                                                                str10 = str4;
                                                                sb.append(str5);
                                                                string2 = sb.toString();
                                                                String str25 = string2 + str15 + e2.n(string2, 15);
                                                                for (i3 = 0; i3 < 5; i3++) {
                                                                    str11 = strArr[i3];
                                                                    if (!str11.startsWith(str10)) {
                                                                        file2 = new File(str11, name);
                                                                        if (file2.exists()) {
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                                e1.i("Failed remount 3 " + str14 + str15 + str25);
                                                                return null;
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            str14 = str;
                                                            str15 = "\n";
                                                            str5 = str8;
                                                            str3 = str9;
                                                            string = null;
                                                            e1.l("Failed remount 2 " + str14 + str15 + string, th);
                                                            sb = new StringBuilder();
                                                            i2 = 0;
                                                            while (i2 < 5) {
                                                                str12 = strArr[i2];
                                                                str13 = str4;
                                                                if (!str12.startsWith(str13)) {
                                                                    File file6 = new File(str12, name);
                                                                    sb.append("cp -f ");
                                                                    sb.append(str14);
                                                                    sb.append(" ");
                                                                    sb.append(file6.getAbsolutePath());
                                                                    sb.append(str3);
                                                                    sb.append(file6.getAbsolutePath());
                                                                    sb.append("; ");
                                                                }
                                                                i2++;
                                                                str4 = str13;
                                                            }
                                                            str10 = str4;
                                                            sb.append(str5);
                                                            string2 = sb.toString();
                                                            String str26 = string2 + str15 + e2.n(string2, 15);
                                                            while (i3 < 5) {
                                                                str11 = strArr[i3];
                                                                if (!str11.startsWith(str10)) {
                                                                    file2 = new File(str11, name);
                                                                    if (file2.exists()) {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            e1.i("Failed remount 3 " + str14 + str15 + str26);
                                                            return null;
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        str9 = str3;
                                                    }
                                                }
                                                String str27 = str7;
                                                String str28 = str3;
                                                try {
                                                    sb2.append("blockdev --set");
                                                    sb2.append(str19);
                                                    sb2.append(" ");
                                                    sb2.append(str6);
                                                    sb2.append("; ");
                                                    if (str19.equals("rw")) {
                                                        int i18 = 0;
                                                        while (i18 < 5) {
                                                            String str29 = strArr[i18];
                                                            if (str29.startsWith("/system")) {
                                                                File file7 = new File(str29, name);
                                                                sb2.append("cp -f ");
                                                                str14 = str;
                                                                try {
                                                                    sb2.append(str14);
                                                                    sb2.append(" ");
                                                                    sb2.append(file7.getAbsolutePath());
                                                                    str3 = str28;
                                                                    try {
                                                                        sb2.append(str3);
                                                                        sb2.append(file7.getAbsolutePath());
                                                                        sb2.append("; ");
                                                                    } catch (Throwable th5) {
                                                                        th = th5;
                                                                        str15 = "\n";
                                                                        str5 = str8;
                                                                        string = null;
                                                                        e1.l("Failed remount 2 " + str14 + str15 + string, th);
                                                                        sb = new StringBuilder();
                                                                        i2 = 0;
                                                                        while (i2 < 5) {
                                                                            str12 = strArr[i2];
                                                                            str13 = str4;
                                                                            if (!str12.startsWith(str13)) {
                                                                                File file8 = new File(str12, name);
                                                                                sb.append("cp -f ");
                                                                                sb.append(str14);
                                                                                sb.append(" ");
                                                                                sb.append(file8.getAbsolutePath());
                                                                                sb.append(str3);
                                                                                sb.append(file8.getAbsolutePath());
                                                                                sb.append("; ");
                                                                            }
                                                                            i2++;
                                                                            str4 = str13;
                                                                        }
                                                                        str10 = str4;
                                                                        sb.append(str5);
                                                                        string2 = sb.toString();
                                                                        String str210 = string2 + str15 + e2.n(string2, 15);
                                                                        while (i3 < 5) {
                                                                            str11 = strArr[i3];
                                                                            if (!str11.startsWith(str10)) {
                                                                                file2 = new File(str11, name);
                                                                                if (file2.exists()) {
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        }
                                                                        e1.i("Failed remount 3 " + str14 + str15 + str210);
                                                                        return null;
                                                                    }
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    str3 = str28;
                                                                    str15 = "\n";
                                                                    str5 = str8;
                                                                    string = null;
                                                                    e1.l("Failed remount 2 " + str14 + str15 + string, th);
                                                                    sb = new StringBuilder();
                                                                    i2 = 0;
                                                                    while (i2 < 5) {
                                                                        str12 = strArr[i2];
                                                                        str13 = str4;
                                                                        if (!str12.startsWith(str13)) {
                                                                            File file9 = new File(str12, name);
                                                                            sb.append("cp -f ");
                                                                            sb.append(str14);
                                                                            sb.append(" ");
                                                                            sb.append(file9.getAbsolutePath());
                                                                            sb.append(str3);
                                                                            sb.append(file9.getAbsolutePath());
                                                                            sb.append("; ");
                                                                        }
                                                                        i2++;
                                                                        str4 = str13;
                                                                    }
                                                                    str10 = str4;
                                                                    sb.append(str5);
                                                                    string2 = sb.toString();
                                                                    String str211 = string2 + str15 + e2.n(string2, 15);
                                                                    while (i3 < 5) {
                                                                        str11 = strArr[i3];
                                                                        if (!str11.startsWith(str10)) {
                                                                            file2 = new File(str11, name);
                                                                            if (file2.exists()) {
                                                                                continue;
                                                                            }
                                                                        }
                                                                    }
                                                                    e1.i("Failed remount 3 " + str14 + str15 + str211);
                                                                    return null;
                                                                }
                                                            } else {
                                                                str3 = str28;
                                                            }
                                                            i18++;
                                                            str28 = str3;
                                                        }
                                                    }
                                                    i10 = i12 + 1;
                                                    str14 = str;
                                                    str3 = str28;
                                                    str7 = str27;
                                                    strArr3 = strArr4;
                                                    str16 = str8;
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    str14 = str;
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                                str14 = str14;
                                                str3 = str3;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            str15 = "\n";
                                            str5 = str8;
                                            string = null;
                                            e1.l("Failed remount 2 " + str14 + str15 + string, th);
                                            sb = new StringBuilder();
                                            i2 = 0;
                                            while (i2 < 5) {
                                                str12 = strArr[i2];
                                                str13 = str4;
                                                if (!str12.startsWith(str13)) {
                                                    File file10 = new File(str12, name);
                                                    sb.append("cp -f ");
                                                    sb.append(str14);
                                                    sb.append(" ");
                                                    sb.append(file10.getAbsolutePath());
                                                    sb.append(str3);
                                                    sb.append(file10.getAbsolutePath());
                                                    sb.append("; ");
                                                }
                                                i2++;
                                                str4 = str13;
                                            }
                                            str10 = str4;
                                            sb.append(str5);
                                            string2 = sb.toString();
                                            String str212 = string2 + str15 + e2.n(string2, 15);
                                            while (i3 < 5) {
                                                str11 = strArr[i3];
                                                if (!str11.startsWith(str10)) {
                                                    file2 = new File(str11, name);
                                                    if (file2.exists()) {
                                                        continue;
                                                    }
                                                }
                                            }
                                            e1.i("Failed remount 3 " + str14 + str15 + str212);
                                            return null;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        str8 = str16;
                                    }
                                }
                                str14 = str14;
                                str3 = str3;
                                str5 = str16;
                                try {
                                    sb2.append(str5);
                                    string = sb2.toString();
                                    try {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(string);
                                        str15 = "\n";
                                        try {
                                            sb3.append(str15);
                                            sb3.append(e2.n(string, 15));
                                            string = sb3.toString();
                                            for (int i19 = 0; i19 < 5; i19++) {
                                                File file11 = new File(strArr[i19], name);
                                                if (file11.exists() && file11.canExecute() && file.length() == file11.length()) {
                                                    return file11.getAbsolutePath();
                                                }
                                            }
                                            e1.i("Failed remount 1 " + str14 + str15 + string);
                                            break;
                                        } catch (Throwable th11) {
                                            th = th11;
                                            e1.l("Failed remount 2 " + str14 + str15 + string, th);
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                        str15 = "\n";
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                    str15 = "\n";
                                    string = null;
                                }
                            } catch (Throwable th14) {
                                th = th14;
                                str5 = "exit";
                            }
                        } catch (Throwable th15) {
                            th = th15;
                            str14 = str14;
                            str15 = "\n";
                            str3 = "; chmod 0755 ";
                            str5 = "exit";
                        }
                    } catch (Throwable th16) {
                        th = th16;
                        str4 = "/sbin";
                        file = file3;
                    }
                    str5 = "exit";
                    string = null;
                }
                try {
                    e1.l("Failed remount 2 " + str14 + str15 + string, th);
                } catch (Throwable th17) {
                    th = th17;
                    str2 = string;
                }
            }
            sb = new StringBuilder();
            i2 = 0;
            while (i2 < 5) {
                str12 = strArr[i2];
                str13 = str4;
                if (!str12.startsWith(str13)) {
                    File file12 = new File(str12, name);
                    sb.append("cp -f ");
                    sb.append(str14);
                    sb.append(" ");
                    sb.append(file12.getAbsolutePath());
                    sb.append(str3);
                    sb.append(file12.getAbsolutePath());
                    sb.append("; ");
                }
                i2++;
                str4 = str13;
            }
            str10 = str4;
            sb.append(str5);
            string2 = sb.toString();
            try {
                String str213 = string2 + str15 + e2.n(string2, 15);
                while (i3 < 5) {
                    str11 = strArr[i3];
                    if (!str11.startsWith(str10)) {
                        file2 = new File(str11, name);
                        if (file2.exists() && file2.canExecute() && file.length() == file2.length()) {
                            return file2.getAbsolutePath();
                        }
                    }
                }
                e1.i("Failed remount 3 " + str14 + str15 + str213);
                return null;
            } catch (Throwable th18) {
                th = th18;
                str2 = string2;
            }
        } catch (Throwable th19) {
            th = th19;
            str14 = str14;
            str15 = "\n";
            str2 = null;
        }
        e1.l("Failed remount 4 " + str14 + str15 + str2, th);
        return null;
    }

    public static String T() {
        return w0.a(android.ext.h0.c(), "S!H!A!-!3!8!4".replace("!", ""));
    }

    private void c0() {
        MainService.instance.Q();
        MainService.instance.l();
    }

    private static boolean j(n0 n0Var, File file) throws IOException {
        boolean z2 = false;
        if (n0Var == null || n0Var.f916a == null) {
            return false;
        }
        InputStream inputStream = n0Var.f918c;
        boolean z3 = k(n0Var.f919d, "android-daemon err") && k(inputStream, "android-daemon out");
        if (!Config.C && z3) {
            new g2().putInt("root-ok", (int) (((1 * 16338.7f) - 183.7f) + 0.5f)).commit();
        }
        if (z3) {
            int i2 = inputStream.read();
            if (i2 == 49 || i2 == 48) {
                inputStream.read();
            }
            if (i2 == 49) {
                try {
                    OutputStream outputStream = n0Var.f917b;
                    try {
                        e1.d("IF 0");
                        FileInputStream fileInputStream = new FileInputStream(new File(file, "o"));
                        e1.d("IF 1");
                        FileInputStream fileInputStream2 = new FileInputStream(new File(file, "e"));
                        e1.d("IF 2");
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(file, "i"));
                        e1.d("IF 3");
                        n0Var.f917b = fileOutputStream;
                        n0Var.f918c = fileInputStream;
                        n0Var.f919d = fileInputStream2;
                        z2 = true;
                    } catch (Throwable th) {
                        e1.l("Fifo fail", th);
                    }
                    outputStream.write(z2 ? 89 : 78);
                    outputStream.write(10);
                    outputStream.flush();
                    InOut.o = z2;
                } catch (Throwable th2) {
                    e1.l("Fifo fail 2", th2);
                }
            } else if (i2 != 48) {
                e1.p("Odd fifo: " + i2);
            }
        }
        return z3;
    }

    private static boolean k(InputStream inputStream, String str) throws IOException {
        byte[] bytes = str.getBytes();
        byte[] bArr = new byte[4096];
        e1.d("Start: " + str);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                break;
            }
            byte b2 = (byte) i4;
            if (i2 >= 4096) {
                break;
            }
            int i5 = i2 + 1;
            bArr[i2] = b2;
            if (b2 == bytes[i3]) {
                i3++;
                if (i3 == bytes.length) {
                    e1.d("Good: " + str);
                    return true;
                }
            } else {
                i3 = 0;
            }
            if (inputStream.available() == 0) {
                for (int i6 = 0; i6 < 30; i6++) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                    if (inputStream.available() != 0) {
                        break;
                    }
                }
            }
            if (inputStream.available() == 0) {
                e2.f745a += "No more data: " + i5 + '\n';
                i2 = i5;
                break;
            }
            i2 = i5;
        }
        String str2 = "Fail: '" + str + "' " + i2 + " '" + new String(bArr, 0, i2) + '\'';
        e2.f745a += str2 + '\n';
        e1.d(str2);
        return false;
    }

    public static void m0(Runnable runnable) {
        List list = z;
        synchronized (list) {
            try {
                if (A) {
                    list.add(runnable);
                } else {
                    new android.ext.g0(runnable, "runAfterDaemonStart").start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static void r() {
        List list = z;
        synchronized (list) {
            try {
                A = false;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    new android.ext.g0((Runnable) it.next(), "waitForDaemonStart").start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private int u(byte b2) {
        Object[] array;
        ArrayList arrayList = this.q;
        synchronized (arrayList) {
            array = arrayList.toArray(new Object[arrayList.size()]);
            arrayList.clear();
            arrayList.trimToSize();
        }
        int length = array.length;
        if (length != 0) {
            n2.j(new o(array, b2));
        }
        return length;
    }

    private void v() {
        if (this.f795d && this.f796e > 0) {
            File file = new File(Tools.q0(), "stop.tmp");
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(this.f796e).array());
                fileOutputStream.close();
                if (file.renameTo(new File(Tools.q0(), "stop"))) {
                    return;
                }
                e1.s("Failed rename stop file: " + file, new RuntimeException());
                this.f795d = false;
                file.delete();
            } catch (IOException e2) {
                e1.s("Failed make stop file: " + file, e2);
                this.f795d = false;
            }
        }
    }

    private int y(byte b2) {
        h2[] h2VarArr;
        ArrayList arrayList = this.r;
        synchronized (arrayList) {
            h2VarArr = (h2[]) arrayList.toArray(new h2[arrayList.size()]);
            arrayList.clear();
            arrayList.trimToSize();
        }
        int length = h2VarArr.length;
        if (length != 0) {
            n2.j(new p(h2VarArr, b2));
            if ((Config.A & 128) != 0 && !x) {
                x = true;
                n2.i(new q());
            }
        }
        return length;
    }

    private void y0(byte b2, long j2, long j3, int i2, int i3, long j4, long j5, long j6) {
        long jH = android.ext.c.h(j2, i3);
        long jH2 = android.ext.c.h(j3, i3);
        e1.d("sendSearchNumber: " + jH + "; " + jH2 + " x" + i2 + " as " + Integer.toHexString(i3) + " in " + Long.toHexString(j4) + '-' + Long.toHexString(j5) + ", " + Long.toString(j6));
        n2.j(new n(b2, jH, jH2, i2, i3, j4, j5, j6));
        i2.l = null;
    }

    private void z0(byte b2, long j2, long j3, int i2, long j4, long j5, long j6) {
        y0(b2, j2, j3, 0, i2, j4, j5, j6);
    }

    public void A0(byte b2, String str) {
        byte[] bytes = str.getBytes();
        if (bytes.length == 0) {
            return;
        }
        if (bytes.length <= 4000) {
            n2.j(new i0(bytes, b2));
            return;
        }
        e1.i("path big: " + bytes.length + " > 4000");
    }

    public void B() {
        C((byte) 0);
    }

    public void B0(String str) {
        A0((byte) 0, str);
    }

    public void C(byte b2) {
        if (u(b2) + y(b2) + A(b2) > 0) {
            MainService.instance.F0();
        }
    }

    public void C0(byte b2, int i2, String str, String str2) {
        n2.j(new h0(str, str2, b2, i2));
        x0(b2);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[PHI: r6
      0x008c: PHI (r6v5 java.lang.String) = (r6v4 java.lang.String), (r6v17 java.lang.String), (r6v18 java.lang.String) binds: [B:40:0x00a9, B:37:0x009b, B:31:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    public void D(byte b2, long j2, long j3, int i2, int i3, int i4, long j4, long j5, long j6) {
        String str;
        int i5;
        String strF;
        String strF2;
        boolean z2;
        String strReplace;
        int i6 = i2 & 127;
        CharSequence charSequenceV = android.ext.c.v(i6);
        boolean z3 = (i2 & 8388608) != 0;
        boolean z4 = !z3 && j2 == 0;
        String strK = android.ext.c.K(0L, j2, i6);
        if (z3) {
            strK = strK + '~' + android.ext.c.K(0L, j3, i6);
        }
        if (i3 == 67108864) {
            str = "N > O+D";
            if (z4) {
                i5 = R.string.fuzzy_larger;
                strF = b2.f(i5);
            } else {
                strF = str;
            }
            strF2 = strF;
            z2 = false;
        } else if (i3 == 134217728) {
            str = "N < O+D";
            if (z4) {
                i5 = R.string.fuzzy_smaller;
                strF = b2.f(i5);
            } else {
                strF = str;
            }
            strF2 = strF;
            z2 = false;
        } else if (i3 != 268435456) {
            if (this.i == 0) {
                this.i = i4;
            }
            this.h = i4 - 1;
            this.j = j4;
            this.k = j5;
            this.l = j6;
            str = "N = O+D";
            strF2 = z4 ? b2.f(R.string.fuzzy_equal) : "N = O+D";
            z2 = true;
        } else {
            str = "N ≠ O+D";
            if (z4) {
                i5 = R.string.fuzzy_inequal;
                strF = b2.f(i5);
            } else {
                strF = str;
            }
            strF2 = strF;
            z2 = false;
        }
        if (z4) {
            strReplace = strF2 + " (" + str.replace("+D", "") + ')';
        } else {
            strReplace = strF2.replace("+D", " + (" + strK + ')');
        }
        CharSequence charSequenceD = new android.ext.y().b("%s %s", strReplace, charSequenceV).d();
        if (z2) {
            MainService.instance.i0(charSequenceD, -1L, 1L, this.i - this.h, this.i, 0L);
        } else {
            MainService.instance.h0(charSequenceD);
        }
        z0(b2, j2, j3, i2 | Integer.MIN_VALUE | i3, j4, j5, j6);
    }

    public void D0(int i2, String str, String str2) {
        C0((byte) 0, i2, str, str2);
    }

    public void E(long j2, long j3, int i2, int i3, int i4, long j4, long j5, long j6) {
        D((byte) 0, j2, j3, i2, i3, i4, j4, j5, j6);
    }

    public void E0(byte b2) {
        F0(b2, this.n, this.o);
    }

    public void F(byte b2, int i2, long j2, long j3, long j4) {
        MainService.instance.h0(new android.ext.y().b("%s %s", b2.f(R.string.search_unknown_value), android.ext.c.v(i2 & 127)).d());
        z0(b2, 0L, 0L, i2 | Integer.MIN_VALUE, j2, j3, j4);
    }

    public void F0(byte b2, int i2, int i3) {
        c0();
        boolean[] zArrI = I(0);
        long j2 = this.p;
        this.n = i2;
        this.o = i3;
        n2.j(new e(b2, zArrI, i2, i3, j2));
        this.p = 0L;
    }

    public void G() {
        H((byte) 0);
    }

    public void G0(byte b2, int i2) {
        c0();
        n2.j(new f(b2, i2, I(i2)));
    }

    public void H(byte b2) {
        u0(b2, (byte) 57);
    }

    public void H0(int i2) {
        G0((byte) 0, i2);
    }

    public void I0(byte b2, int i2) {
        c0();
        n2.j(new g(b2, i2, I(i2)));
    }

    public int J() {
        return this.f796e;
    }

    public void J0(int i2) {
        I0((byte) 0, i2);
    }

    public void K0(byte b2) {
        L0((byte) 0, b2);
    }

    public void L() {
        M((byte) 0);
    }

    public void L0(byte b2, byte b3) {
        n2.j(new u(b2, b3));
    }

    public void M(byte b2) {
        u0(b2, (byte) 58);
    }

    public void N(byte b2, long j2, int i2) {
        n2.j(new h(b2, j2, i2));
    }

    public void N0() {
        new a0("DaemonLoader").start();
    }

    public void O(long j2, int i2) {
        N((byte) 0, j2, i2);
    }

    public n0 O0(String str) throws l0 {
        String strS0;
        try {
            boolean z2 = Config.C;
            File fileQ0 = Tools.q0();
            String[] strArrK = K(z2, str, fileQ0);
            boolean z3 = false;
            boolean z4 = false;
            while (true) {
                String[] strArr = {"i", "o", "e"};
                for (int i2 = 0; i2 < 3; i2++) {
                    new File(fileQ0, strArr[i2]).delete();
                }
                if (z2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("try: direct");
                    for (String str2 : strArrK) {
                        sb.append(' ');
                        sb.append(str2);
                    }
                    e1.d(sb.toString());
                }
                Process processI = z2 ? Tools.I(strArrK) : e2.r(strArrK[0], null, true);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Daemon process: ");
                sb2.append(processI);
                sb2.append("; pid=");
                sb2.append(processI == null ? "n/a" : Integer.valueOf(Tools.D0(processI)));
                e1.d(sb2.toString());
                n0 n0Var = new n0();
                n0Var.f916a = processI;
                if (processI != null) {
                    n0Var.f917b = processI.getOutputStream();
                    n0Var.f918c = processI.getInputStream();
                    n0Var.f919d = processI.getErrorStream();
                }
                if (j(n0Var, fileQ0)) {
                    y = n0Var;
                    this.f797f = Tools.D0(processI);
                    if (!e0()) {
                        break;
                    }
                    n2.h(new v());
                    return n0Var;
                }
                if (!z3) {
                    String strRemoveNewLinesChars = Tools.removeNewLinesChars("h{hf#lg");
                    e1.d("Test 1 start");
                    if (z2) {
                        strRemoveNewLinesChars = "id";
                    }
                    e2.o(strRemoveNewLinesChars, 45, z2 ? "" : null);
                    e2.f745a = "";
                    e1.d("Test 1 end");
                    Tools.q(new File(str), 493);
                    Tools.r(str, "0755");
                    z3 = true;
                } else if (Config.C) {
                    if (!z2) {
                        i(str, z3);
                        Thread.sleep(1000L);
                        String str3 = e2.f745a + e2.g(processI);
                        e2.f745a = str3;
                        e1.d(str3);
                        android.ext.r.k = true;
                        e1.i("Show error alert");
                        android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(R.string.daemon_failed)).setMessage(b2.f(R.string.failed_run_daemon) + "\n\n" + e2.f745a).setPositiveButton(b2.f(R.string.exit), new p0(400)).setNeutralButton("SU", new k()).setNegativeButton(b2.f(R.string.skip), (DialogInterface.OnClickListener) null));
                        return null;
                    }
                    strArrK = K(false, str, fileQ0);
                    z2 = false;
                } else {
                    if (z4 || (strS0 = S0(str)) == null) {
                        i(str, z3);
                        Thread.sleep(1000L);
                        String str4 = e2.f745a + e2.g(processI);
                        e2.f745a = str4;
                        e1.d(str4);
                        android.ext.r.k = true;
                        e1.i("Show error alert");
                        android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(R.string.daemon_failed)).setMessage(b2.f(R.string.failed_run_daemon) + "\n\n" + e2.f745a).setPositiveButton(b2.f(R.string.exit), new p0(400)).setNeutralButton("SU", new k()).setNegativeButton(b2.f(R.string.skip), (DialogInterface.OnClickListener) null));
                        return null;
                    }
                    strArrK = K(z2, strS0, fileQ0);
                    z4 = true;
                }
            }
        } catch (l0 e2) {
            throw e2;
        } catch (Exception e3) {
            e1.l("" + e3.getMessage(), e3);
            Tools.J1(e3.getMessage());
        }
        return null;
    }

    public long P(byte b2, long j2, int i2) {
        if (!this.f793b.h()) {
            return -1L;
        }
        n2.j(new g0(b2, j2, i2));
        Exchanger exchanger = this.f794c;
        while (true) {
            try {
                android.ext.w wVar = new android.ext.w((byte[]) exchanger.exchange(null, 500L, TimeUnit.MILLISECONDS));
                wVar.l(3);
                if (wVar.g() == j2) {
                    wVar.l(4);
                    return wVar.h();
                }
                continue;
            } catch (InterruptedException unused) {
            } catch (TimeoutException unused2) {
                return -1L;
            } catch (Throwable th) {
                e1.l("getMemoryContent failed", th);
                return -1L;
            }
        }
    }

    public void P0() {
        Q0((byte) 0);
    }

    public long Q(long j2, int i2) {
        return P((byte) 0, j2, i2);
    }

    public void Q0(byte b2) {
        n2.j(new b0(b2));
        try {
            Thread.sleep(3L);
        } catch (InterruptedException unused) {
        }
    }

    public void R(byte b2, int[] iArr, long[] jArr) {
        if (iArr.length == jArr.length) {
            n2.j(new RunnableC0017f0(iArr, b2, jArr));
            return;
        }
        throw new RuntimeException("Size mismatch: " + iArr.length + " != " + jArr.length);
    }

    public void S(int[] iArr, long[] jArr) {
        R((byte) 0, iArr, jArr);
    }

    public void T0() {
        u0((byte) 0, (byte) 51);
    }

    public void U() {
        V((byte) 0);
    }

    public void U0(byte b2, int i2, long j2, long j3, double d2, double d3) {
        c0();
        n2.j(new d(b2, i2, I(1), j2, j3, d2, d3));
    }

    public void V(byte b2) {
        u0(b2, (byte) 56);
    }

    public void V0(int i2, long j2, long j3, double d2, double d3) {
        U0((byte) 0, i2, j2, j3, d2, d3);
    }

    public void W() {
        X((byte) 0);
    }

    void W0(boolean[] zArr) {
        InOut inOut = this.f793b;
        for (boolean z2 : zArr) {
            inOut.s(z2 ? (byte) 1 : (byte) 0);
        }
    }

    public void X(byte b2) {
        u0(b2, (byte) 60);
    }

    public void Y(byte b2, int i2, int i3, int i4, long j2, long j3, long j4, int i5, long j5, int i6, int i7, int i8, double d2, int i9) {
        n2.j(new e0(b2, i2, i3, i4, j2, j3, j4, i5, j5, i6, i7, i8, d2, i9));
    }

    public double Z() {
        return ((double) this.n) / ((double) this.o);
    }

    public void a(android.ext.c cVar, int i2) {
        Object k0Var = cVar;
        if (i2 != 0) {
            k0Var = new k0(cVar, i2);
        }
        synchronized (this.q) {
            this.q.add(k0Var);
        }
    }

    public CharSequence a0() {
        int iD0;
        String str;
        String str2;
        int i2;
        if (this.f793b.h()) {
            if (Config.C) {
                iD0 = Tools.d0(R.color.daemon_user);
                str = "$";
            } else if (Config.vSpaceReal) {
                iD0 = Tools.d0(R.color.daemon_vroot);
                str = "@";
            } else {
                iD0 = Tools.d0(R.color.daemon_root);
                str = "#";
            }
            return Tools.t(str, iD0);
        }
        n0 n0Var = this.f792a;
        if (n0Var == null || n0Var.f916a == null) {
            if (Config.C) {
                str2 = "!";
            } else {
                str2 = Config.vSpaceReal ? "I" : "?";
            }
            i2 = R.color.daemon_bad;
        } else {
            if (Config.C) {
                str2 = "V";
            } else {
                str2 = Config.vSpaceReal ? "U" : "W";
            }
            i2 = R.color.daemon_wait;
        }
        return Tools.t(str2, Tools.d0(i2));
    }

    public void b(h2 h2Var) {
        synchronized (this.r) {
            this.r.add(h2Var);
        }
    }

    public int b0() {
        return this.f797f;
    }

    public void c(h2 h2Var) {
        synchronized (this.s) {
            this.s.add(h2Var);
        }
    }

    public void d(byte b2, long j2) {
        this.p += j2;
        E0(b2);
    }

    public boolean d0() {
        boolean z2 = (v || this.f793b.h()) ? false : true;
        if (z2) {
            android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(R.string.daemon_fail)).setMessage(b2.f(R.string.wait_daemon)).setNegativeButton(b2.f(R.string.ok), (DialogInterface.OnClickListener) null));
        }
        return !z2;
    }

    public void e(long j2) {
        d((byte) 0, j2);
    }

    public boolean e0() {
        Process process;
        Integer numValueOf;
        String str;
        String string;
        n0 n0Var = y;
        if (n0Var == null || (process = n0Var.f916a) == null) {
            return false;
        }
        try {
            numValueOf = Integer.valueOf(process.exitValue());
        } catch (IllegalThreadStateException unused) {
            numValueOf = null;
        }
        if (numValueOf == null && C == null && B == null) {
            return true;
        }
        if (!android.ext.r.k && !f1.f952b) {
            if (numValueOf == null || (!(numValueOf.intValue() == 9 || numValueOf.intValue() == 15 || numValueOf.intValue() == 137) || Config.h == 0)) {
                str = null;
            } else {
                Config.b(R.id.config_ram).f42d = 0;
                Config.k();
                str = "Found SIGKILL/SIGTERM/SIGKILL_OOM: " + numValueOf;
            }
            if (str != null) {
                e1.i(str);
                n2.i(new c0());
            }
            StringBuilder sb = new StringBuilder();
            int iD0 = Tools.D0(process);
            sb.append('\n');
            sb.append(this.f798g);
            sb.append(" ( ");
            sb.append(Process.myPid());
            sb.append(" / ");
            sb.append(iD0);
            sb.append(" / ");
            sb.append(this.f796e);
            sb.append(" )\n");
            sb.append(numValueOf);
            sb.append(" / ");
            sb.append(C);
            sb.append(" / ");
            sb.append(B);
            sb.append('\n');
            sb.append(MainService.instance.m0 / 1024);
            sb.append(" / ");
            sb.append(Tools.r0());
            sb.append(" / ");
            sb.append(MainService.instance.l0 / 1024);
            sb.append('\n');
            String strH = android.ext.e0.h();
            sb.append(strH);
            sb.append('\n');
            sb.append(w0.a(strH, "S$H$A$-$3$8$4".replace("$", "")));
            sb.append('\n');
            File file = new File(strH);
            sb.append(file.length());
            sb.append('\n');
            sb.append(w0.a(file, "S#H#A#-#3#8#4".replace("#", "")));
            if (numValueOf != null) {
                sb.append("\nOutput:\n");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(n0Var.f919d));
                while (true) {
                    try {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            try {
                                sb.append(line);
                                sb.append('\n');
                            } catch (OutOfMemoryError e2) {
                                e1.s("Failed get err for daemon exit", e2);
                                sb.append(e2);
                                sb.append('\n');
                            }
                        } catch (IOException e3) {
                            e1.l("checkProcess", e3);
                        }
                    } catch (OutOfMemoryError e4) {
                        e1.s("Failed get err for daemon exit", e4);
                        sb.append(e4);
                        sb.append('\n');
                    }
                }
            }
            sb.append("\nDEBUG:\n");
            sb.append(android.ext.h0.f(false));
            try {
                string = sb.toString();
            } catch (OutOfMemoryError e5) {
                e1.s("Failed get string for daemon exit", e5);
                string = e5.toString();
            }
            String str2 = string;
            try {
                e1.i("Daemon closed" + str2);
            } catch (OutOfMemoryError e6) {
                e1.s("Failed out string for daemon exit", e6);
            }
            if (!android.ext.n0.d(str2) && str == null) {
                try {
                    if (str2.contains("backtrace:") && str2.contains(this.f798g) && !str2.contains("SIGPIPE")) {
                        android.ext.n0.i(str2);
                    }
                } catch (OutOfMemoryError e7) {
                    e1.s("Failed send string for daemon exit", e7);
                }
            }
            try {
                str2 = b2.f(R.string.daemon_unexpected_closed) + '\n' + str2;
            } catch (OutOfMemoryError e8) {
                e1.s("Failed out string for daemon exit", e8);
            }
            android.ext.r.k = true;
            e1.i("Show error alert");
            android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(R.string.daemon_exited)).setMessage(str2).setPositiveButton(b2.f(R.string.exit), new p0(500)).setNegativeButton(b2.f(R.string.skip), (DialogInterface.OnClickListener) null));
            this.f793b.n(false);
            MainService.instance.q0();
            if (numValueOf != null && (numValueOf.intValue() == 9 || numValueOf.intValue() == 15 || numValueOf.intValue() == 137)) {
                android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(R.string.daemon_exited)).setMessage(b2.f(numValueOf.intValue() == 137 ? R.string.daemon_killed_oom : R.string.daemon_killed)).setNegativeButton(b2.f(R.string.ok), (DialogInterface.OnClickListener) null));
            }
        }
        return false;
    }

    public void f(byte b2, long j2, int i2) {
        n2.j(new a(b2, i2, j2));
    }

    public void f0(byte b2, List list) {
        j0 j0VarM0 = M0(list, android.ext.e0.m());
        if (j0VarM0.f887a.length == 0) {
            return;
        }
        if (j0VarM0.f889c == 0) {
            l(b2);
            return;
        }
        n2.j(new s(j0VarM0, b2));
        MainService.N0(j0VarM0.f889c, b2);
        i2.l = null;
    }

    public void g(long j2, int i2) {
        f((byte) 0, j2, i2);
    }

    public void g0() {
        e1.d("messageFailed");
        e0();
        MainService.instance.s();
    }

    public void h() {
        this.f795d = true;
        v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.ext.f0] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.StringBuilder] */
    void h0(byte[] bArr) throws Throwable {
        f0 self = this;
        String size = ", size: ";
        byte b2;
        MainService mainService;
        TimersEditor timersEditor;
        int i2;
        byte b3 = 0;
        z = false;
        boolean z2 = false;
        boolean z3 = false;
        try {
            android.ext.w wVar = new android.ext.w(bArr);
            byte bE = wVar.e();
            try {
                byte bE2 = wVar.e();
                try {
                    try {
                        switch (bE) {
                            case 16:
                                b2 = bE;
                                MainService.instance.l0(wVar);
                                break;
                            case 17:
                                long jG = wVar.g();
                                long jG2 = wVar.g();
                                int iF = wVar.f();
                                if (iF == 0 && self.h > 0 && bE2 == 0) {
                                    long j2 = bE2;
                                    int iD = MainService.D() & 127;
                                    int i3 = self.h;
                                    long j3 = self.j;
                                    long j4 = self.k;
                                    long j5 = self.l;
                                    b2 = bE;
                                    E(j2, 0L, iD, 536870912, i3, j3, j4, j5);
                                } else {
                                    b2 = bE;
                                    MainService.instance.o0(bE2, jG, jG2, iF);
                                    if (iF == 0) {
                                        MainService.instance.X(bE2, null);
                                    }
                                }
                                break;
                            case 18:
                                m();
                                MainService.instance.r0();
                                break;
                            case 19:
                                m();
                                MainService.instance.k0(wVar.f());
                                break;
                            case 20:
                            default:
                                e1.p("Unknown message: " + ((int) bE) + ", size: " + bArr.length);
                                break;
                            case 21:
                                MainService.instance.i0(null, wVar.g(), wVar.g(), -1, -1, wVar.g());
                                v();
                                break;
                            case 22:
                                MainService.instance.t0.h(wVar);
                                if (bE2 != 0) {
                                    Script.C3(wVar);
                                    mainService = MainService.instance;
                                    mainService.X(bE2, null);
                                }
                                break;
                            case 23:
                                android.ext.d dVar = MainService.instance.u0;
                                new android.ext.d.a();
                                while (true) {
                                    int iF2 = wVar.f();
                                    if (iF2 == 0) {
                                        if (z3) {
                                            MainService.instance.e0();
                                        }
                                        break;
                                    } else {
                                        long jG3 = wVar.g();
                                        long jH = wVar.h();
                                        if ((16777216 & iF2) == 0 && dVar.c(jG3, iF2, jH)) {
                                            z3 = true;
                                        }
                                    }
                                }
                                break;
                            case 24:
                                z1.o(wVar);
                                break;
                            case 25:
                                if (Config.vSpaceReal && !Config.C) {
                                    z2 = true;
                                }
                                x2.u(wVar, z2);
                                break;
                            case 26:
                                MainService.instance.O0(wVar.f(), wVar.f());
                                break;
                            case 27:
                                MainService.instance.P0(wVar);
                                break;
                            case 28:
                                int iF3 = wVar.f();
                                int iE = wVar.e();
                                int[] iArr = iE > 0 ? new int[iE] : null;
                                for (int i4 = 0; i4 < iE; i4++) {
                                    iArr[i4] = wVar.f();
                                }
                                MainService.instance.p0(bE2, iF3, iArr);
                                if (iF3 == 7) {
                                    R0();
                                }
                                break;
                            case 29:
                                RegionList.h(wVar);
                                break;
                            case 30:
                                if (wVar.f() == 1) {
                                    timersEditor = MainService.instance.o0;
                                    i2 = 19;
                                } else {
                                    timersEditor = MainService.instance.n0;
                                    i2 = 44;
                                }
                                int i5 = i2 * 4;
                                boolean[] zArr = new boolean[i5];
                                for (int i6 = 0; i6 < i5; i6++) {
                                    zArr[i6] = wVar.e() != 0;
                                }
                                timersEditor.i(zArr);
                                mainService = MainService.instance;
                                mainService.X(bE2, null);
                                break;
                            case 31:
                                long jG4 = wVar.g();
                                if (bE2 != 0) {
                                    Script.Y2(jG4);
                                    mainService = MainService.instance;
                                    mainService.X(bE2, null);
                                } else {
                                    MainService.instance.h(jG4);
                                }
                                break;
                        }
                    } catch (BufferUnderflowException e2) {
                        e = e2;
                        b3 = b2;
                        e1.l("Failed process message: " + b3 + size + bArr.length, e);
                    }
                } catch (BufferUnderflowException e3) {
                    e = e3;
                    b3 = bE;
                    e1.l("Failed process message: " + b3 + size + bArr.length, e);
                }
            } catch (BufferUnderflowException e4) {
                e = e4;
                b2 = bE;
                e1.l("Failed process message: " + b2 + size + bArr.length, e);
            }
        } catch (BufferUnderflowException e5) {
            e = e5;
            e1.l("Failed process message: " + b3 + size + bArr.length, e);
        }
    }

    void i(String str, boolean z2) throws l0 {
        int i2;
        String str2;
        File file = new File(str);
        if (!file.exists()) {
            i2 = R.string.file_not_found;
        } else if (file.isFile()) {
            String[] strArr = {"ls", "-l", Tools.F0(str)};
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Tools.I(strArr).getInputStream()));
                e1.p("ls for '" + str + "' got: " + bufferedReader.readLine());
                bufferedReader.close();
            } catch (Exception e2) {
                e1.l("run '" + Arrays.toString(strArr) + "' error", e2);
            }
            i2 = !file.canExecute() ? R.string.not_execute : 0;
        } else {
            i2 = R.string.not_file;
        }
        if (i2 != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(Tools.N1(i2));
            sb.append(": '");
            sb.append(str);
            sb.append("'\n\n");
            sb.append(b2.f(R.string.check_install));
            if (i2 == R.string.not_execute) {
                str2 = "\n\n" + b2.f(R.string.sdcard_install);
            } else {
                str2 = "";
            }
            sb.append(str2);
            throw new l0(sb.toString());
        }
    }

    public void i0(byte b2, List list) {
        j0 j0VarM0 = M0(list, false);
        if (j0VarM0.f887a.length == 0) {
            return;
        }
        n2.j(new t(j0VarM0, b2));
    }

    public void j0(List list) {
        i0((byte) 0, list);
    }

    public void k0() {
        l0((byte) 0);
    }

    public void l(byte b2) {
        u0(b2, (byte) 44);
        i2.l = null;
    }

    public void l0(byte b2) {
        this.n = 1;
        this.o = 1;
        this.p = 0L;
        y2.i();
        this.f793b.r();
        u0(b2, (byte) 42);
        i2.l = null;
    }

    public void m() {
        this.h = 0;
        this.i = 0;
    }

    public void n() {
        o((byte) 0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034 A[LOOP:1: B:20:0x0032->B:21:0x0034, LOOP_END] */
    public void n0(byte b2, int i2, int i3, int[] iArr, long[] jArr, long[] jArr2, long j2, long j3, long j4) {
        int length;
        byte[] bArr;
        boolean z2 = (i2 & 4194304) != 0;
        if (z2 && i3 != jArr.length) {
            z2 = false;
        }
        if (z2) {
            for (int i4 : iArr) {
                if (((i4 | i2) & (-4194306)) == 0) {
                }
            }
            if (z2) {
                length = jArr.length;
                bArr = new byte[length];
                for (int i5 = 0; i5 < length; i5++) {
                    bArr[i5] = (byte) jArr[i5];
                }
                s0(b2, 1, bArr, j2, j3, j4);
                return;
            }
        } else if (z2) {
            length = jArr.length;
            bArr = new byte[length];
            while (i5 < length) {
                bArr[i5] = (byte) jArr[i5];
            }
            s0(b2, 1, bArr, j2, j3, j4);
            return;
        }
        n2.j(new i(iArr, b2, i2, i3, j2, j3, j4, jArr, jArr2));
        i2.l = null;
    }

    public void o(byte b2) {
        u0(b2, (byte) 46);
    }

    public void o0(byte b2, long j2, long j3, int i2, long j4, long j5, long j6) {
        e1.d("searchMask: " + Long.toHexString(j2) + ':' + Long.toHexString(j3) + " as " + Integer.toHexString(i2) + " in " + Long.toHexString(j4) + '-' + Long.toHexString(j5) + ", " + Long.toString(j6));
        gga.e eVarB = android.ext.c.B();
        CharSequence charSequence = null;
        for (int i3 = 0; i3 < eVarB.size(); i3++) {
            int iKeyAt = eVarB.keyAt(i3);
            if (iKeyAt != 0 && (i2 & iKeyAt) == iKeyAt) {
                charSequence = (CharSequence) eVarB.valueAt(i3);
            }
        }
        String hexString = Long.toHexString(j2);
        Locale locale = Locale.US;
        String upperCase = hexString.toUpperCase(locale);
        String upperCase2 = Long.toHexString(j3).toUpperCase(locale);
        if (upperCase.length() < upperCase2.length()) {
            upperCase = new String(new char[upperCase2.length() - upperCase.length()]).replace((char) 0, '0') + upperCase;
        } else if (upperCase.length() > upperCase2.length()) {
            upperCase2 = new String(new char[upperCase.length() - upperCase2.length()]).replace((char) 0, '0') + upperCase2;
        }
        MainService.instance.h0(new android.ext.y().b("%s %s %s; %s: %s; %s: %s", Tools.N1(R.string.address), charSequence, upperCase, Tools.N1(R.string.mask), upperCase2, Tools.N1(R.string.type), android.ext.c.v(i2 & 127)).d());
        n2.j(new j(b2, j2, j3, i2, j4, j5, j6));
        i2.l = null;
    }

    public void p(byte b2, long j2, long j3, int i2) {
        n2.j(new c(b2, j2, j3, i2));
    }

    public void p0(byte b2, long j2, int i2, int i3, long j3, long j4, long j5) {
        CharSequence charSequence;
        gga.e eVarB = android.ext.c.B();
        if ((i3 & 33554432) != 0) {
            charSequence = "" + eVarB.get(536870912) + '*';
        } else {
            CharSequence charSequence2 = null;
            for (int i4 = 0; i4 < eVarB.size(); i4++) {
                int iKeyAt = eVarB.keyAt(i4);
                if (iKeyAt != 0 && (i3 & iKeyAt) == iKeyAt) {
                    charSequence2 = (CharSequence) eVarB.valueAt(i4);
                }
            }
            charSequence = charSequence2;
        }
        android.ext.c cVar = new android.ext.c(0L, j2, i3 & 127);
        android.ext.y yVar = new android.ext.y();
        CharSequence[] charSequenceArr = new CharSequence[3];
        charSequenceArr[0] = b2.f(R.string.value);
        charSequenceArr[1] = charSequence;
        Object[] objArr = new Object[3];
        objArr[0] = cVar.J();
        objArr[1] = i2 != 0 ? " X" + i2 : "";
        objArr[2] = cVar.u();
        charSequenceArr[2] = Tools.t(Tools.L1("%s%s %s", objArr), cVar.m());
        yVar.b("%s %s %s", charSequenceArr);
        MainService.instance.h0(yVar.d());
        y0(b2, j2, 0L, i2, i3, j3, j4, j5);
    }

    public void q(long j2, long j3, int i2) {
        p((byte) 0, j2, j3, i2);
    }

    public void q0(byte b2, short s2, int i2, long j2, long j3, long j4) {
        String hexString = Integer.toHexString(s2);
        e1.d("searchPointer: " + hexString + " as " + Integer.toHexString(i2) + " in " + Long.toHexString(j2) + '-' + Long.toHexString(j3) + ", " + Long.toString(j4));
        MainService mainService = MainService.instance;
        StringBuilder sb = new StringBuilder();
        sb.append("-> ");
        sb.append(hexString);
        mainService.h0(sb.toString());
        n2.j(new l(b2, s2, i2, j2, j3, j4));
        i2.l = null;
    }

    public void r0(byte b2, long j2, long j3, int i2, int i3, long j4, long j5, long j6) {
        gga.e eVarB = android.ext.c.B();
        int i4 = (i3 & 33554432) != 0 ? i3 & (-33554433) : i3;
        CharSequence charSequence = null;
        for (int i5 = 0; i5 < eVarB.size(); i5++) {
            int iKeyAt = eVarB.keyAt(i5);
            if (iKeyAt != 0 && (i4 & iKeyAt) == iKeyAt) {
                charSequence = (CharSequence) eVarB.valueAt(i5);
            }
        }
        int i6 = i4 & 127;
        android.ext.c cVar = new android.ext.c(0L, j2, i6);
        android.ext.c cVar2 = new android.ext.c(0L, j3, i6);
        android.ext.y yVar = new android.ext.y();
        CharSequence[] charSequenceArr = new CharSequence[3];
        charSequenceArr[0] = b2.f(R.string.value);
        charSequenceArr[1] = charSequence;
        Object[] objArr = new Object[4];
        objArr[0] = cVar.J();
        objArr[1] = cVar2.J();
        objArr[2] = i2 == 0 ? "" : " X" + i2;
        objArr[3] = cVar.u();
        charSequenceArr[2] = Tools.t(Tools.L1("%s ~ %s%s %s", objArr), cVar.m());
        yVar.b("%s %s %s", charSequenceArr);
        MainService.instance.h0(yVar.d());
        y0(b2, j2, j3, i2, i4 | 8388608, j4, j5, j6);
    }

    public void s() {
        t((byte) 0);
    }

    public void s0(byte b2, int i2, byte[] bArr, long j2, long j3, long j4) {
        String string = x0.b(null, i2, bArr, bArr.length, true, true, null).toString();
        if (string.length() > 48) {
            string = string.substring(0, 48) + "...";
        }
        e1.d("searchText: [" + bArr.length + "] = " + string + " in " + Long.toHexString(j2) + '-' + Long.toHexString(j3) + ", " + Long.toString(j4));
        if (bArr.length == 0) {
            return;
        }
        if (bArr.length == 1) {
            p0(b2, bArr[0], 0, 536870913, j2, j3, j4);
            return;
        }
        MainService.instance.h0(Tools.L1("%s[%d] = %s", Tools.N1(R.string.text), Integer.valueOf(bArr.length), string));
        n2.j(new m(b2, i2, j2, j3, j4, bArr));
        i2.l = null;
    }

    public void t(byte b2) {
        u0(b2, (byte) 49);
    }

    void t0() {
        InOut inOut = this.f793b;
        if (C != null) {
            e1.i("Last send error: " + C);
            inOut.d();
            return;
        }
        try {
            inOut.l();
            C = null;
        } catch (Throwable th) {
            inOut.d();
            e1.l("Send error", th);
            C = th.toString();
            n2.d().post(new z());
        }
    }

    void u0(byte b2, byte b3) {
        n2.j(new y(b2, b3));
    }

    void v0(byte b2) {
        n2.j(new x(b2));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:21:0x008a  */
    /* JADX WARN: Instruction removed from duplicated block: B:15:0x004b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x006e, please report this as an issue */
    public void w(byte b2, long j2, long j3, int i2, String str, String str2) {
        String string;
        StringBuilder sb;
        String strReplace;
        byte[] bytes;
        byte[] bytes2;
        if (!str.contains("/emulated/legacy")) {
            if (str.contains("/emulated/0")) {
                sb = new StringBuilder();
                sb.append(str);
                sb.append('|');
                strReplace = str.replace("/emulated/0", "/emulated/legacy");
            } else {
                string = str;
            }
            bytes = string.getBytes();
            if (bytes.length == 0) {
                return;
            }
            if (bytes.length > 4000) {
                e1.i("path big: " + bytes.length + " > 4000");
                return;
            }
            bytes2 = str2.getBytes();
            if (bytes2.length > 4000) {
                n2.j(new b(bytes, bytes2, b2, j2, j3, i2, str));
                return;
            }
            e1.i("pkg big: " + bytes2.length + " > 4000");
        }
        sb = new StringBuilder();
        sb.append(str);
        sb.append('|');
        strReplace = str.replace("/emulated/legacy", "/emulated/0");
        sb.append(strReplace);
        string = sb.toString();
        bytes = string.getBytes();
        if (bytes.length == 0) {
            return;
        }
        if (bytes.length > 4000) {
            e1.i("path big: " + bytes.length + " > 4000");
            return;
        }
        bytes2 = str2.getBytes();
        if (bytes2.length > 4000) {
            n2.j(new b(bytes, bytes2, b2, j2, j3, i2, str));
            return;
        }
        e1.i("pkg big: " + bytes2.length + " > 4000");
    }

    public void w0() {
        x0((byte) 0);
    }

    public void x(long j2, long j3, int i2, String str, String str2) {
        w((byte) 0, j2, j3, i2, str, str2);
    }

    public void x0(byte b2) {
        if (this.u == null || Config.h != this.u.intValue()) {
            if (this.u != null) {
                MainService.instance.m();
            }
            this.u = Integer.valueOf(Config.h);
        }
        String absolutePath = Tools.q0().getAbsolutePath();
        n2.j(new w(b2, absolutePath.getBytes(), absolutePath));
    }

    public void z() {
        this.f793b.r();
        if (this.f796e <= 0) {
            return;
        }
        File file = new File(Tools.q0(), "OOM.tmp");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(this.f796e).array());
            fileOutputStream.close();
            if (file.renameTo(new File(Tools.q0(), "OOM"))) {
                return;
            }
            e1.s("Failed rename OOM file: " + file, new RuntimeException());
            file.delete();
        } catch (IOException e2) {
            e1.s("Failed make OOM file: " + file, e2);
        }
    }
}
