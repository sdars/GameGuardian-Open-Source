package android.ext;

import android.app.AlertDialog;
import android.app.AppOpsManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.DigestInputStream;
import java.security.DigestOutputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import java.util.regex.Pattern;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class b1 {
    static b1 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RandomAccessFile[] f592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    File f594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    File f595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f598g;
    private final String h;
    private final String i;
    private final int j;
    private final w[] k;
    private final MessageDigest l;
    private final MessageDigest m;
    private final MessageDigest n;
    private Manifest o;
    private Map p;
    private Set q;
    volatile AlertDialog r;
    private byte[] s;
    private static final String[] t = {"archive-parse", "package", "version", "application", "label", "signature", "signature-digest", "signature-official", "commit-hash", "binding-missing", "binding-mismatch", "component", "instrumentation", "provider"};
    private static final String[] u = {"repack-start", "verify-start", "verify-pass", "root-install-start", "root-install-return", "manual-install-start", "unknown-source-settings-start", "unknown-source-settings-failed", "package-installed", "old-uninstall-start", "preflight-start", "preflight-root-granted", "preflight-root-unavailable", "preflight-root-unanswered", "preflight-manual-start", "preflight-manual-granted", "preflight-manual-refused", "install-mode-unavailable", "installer-removed", "normal-service-ready"};
    private static final String[] v = {"installer-removed", "normal-service-ready"};
    private static final Pattern w = Pattern.compile("[0-9a-f]{32}\\.part\\.apk");
    private static final String[] x = {"classes.dex", "AndroidManifest.xml", "resources.arsc", "META-INF/MANIFEST.MF", "META-INF/CERT.SF", "META-INF/CERT.RSA"};
    static byte y = 0;
    static byte[][] z = null;
    static final boolean[] A = {false, true, false, true, true, true};
    static volatile c0 C = null;
    private static final Object D = new Object();
    public static volatile WeakReference E = new WeakReference(null);
    private static final Runnable F = new b();
    public static volatile WeakReference G = new WeakReference(null);
    public static volatile WeakReference H = new WeakReference(null);
    public static volatile WeakReference I = new WeakReference(null);
    private static volatile int J = 0;
    private static volatile boolean K = false;
    static volatile int L = 0;
    private static final byte[] M = new byte[0];
    private static volatile WeakReference N = new WeakReference(null);
    private static String O = null;
    private static final Object P = new Object();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Intent[] f600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f601c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f602d;

        /* JADX INFO: renamed from: android.ext.b1$a$a, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0012a implements DialogInterface.OnClickListener {
            DialogInterfaceOnClickListenerC0012a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i != -2) {
                    int i2 = -1;
                    if (i == -1) {
                        int length = a.this.f599a == 1 ? b1.L % a.this.f600b.length : 0;
                        for (Intent intent : a.this.f600b) {
                            i2++;
                            if (i2 >= length) {
                                try {
                                    if (a.this.f599a == 1) {
                                        b1.L++;
                                    }
                                    android.ext.r.n.startActivityForResult(intent, a.this.f599a);
                                    break;
                                } catch (Throwable th) {
                                    e1.l("intent fail", th);
                                }
                            }
                        }
                    }
                } else {
                    b1.C.j &= ~a.this.f599a;
                }
                b1.B.r = null;
            }
        }

        a(int i, Intent[] intentArr, int i2, String str) {
            this.f599a = i;
            this.f600b = intentArr;
            this.f601c = i2;
            this.f602d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogInterfaceOnClickListenerC0012a dialogInterfaceOnClickListenerC0012a = new DialogInterfaceOnClickListenerC0012a();
            b1.B.E();
            AlertDialog alertDialogCreate = android.ext.f.c(android.ext.r.p).setMessage(b1.L + ": [" + this.f601c + "] " + this.f602d).setPositiveButton(R.string.yes, dialogInterfaceOnClickListenerC0012a).setNegativeButton(R.string.no, dialogInterfaceOnClickListenerC0012a).setCancelable(false).create();
            android.ext.f.m(alertDialogCreate);
            b1.B.r = alertDialogCreate;
        }
    }

    private static class a0 extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final RandomAccessFile f604a;

        private a0(RandomAccessFile randomAccessFile) throws IOException {
            this.f604a = randomAccessFile;
            randomAccessFile.seek(0L);
            randomAccessFile.setLength(0L);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.f604a.write(i);
        }

        /* synthetic */ a0(RandomAccessFile randomAccessFile, i iVar) {
            this(randomAccessFile);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f604a.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f604a.write(bArr, i, i2);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b1.H1();
            Handler handlerD = n2.d();
            handlerD.removeCallbacks(this);
            handlerD.postDelayed(this, 500L);
        }
    }

    private class b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private RandomAccessFile f605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ByteBuffer f606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f607c;

        private b0(int i) {
            byte[] bArr;
            this.f605a = null;
            this.f606b = null;
            boolean z = b1.A[i];
            this.f607c = z;
            if (!z) {
                this.f605a = b1.this.h0(i);
                return;
            }
            byte[][] bArr2 = b1.z;
            if (bArr2 != null && (bArr = bArr2[i]) != null) {
                this.f606b = ByteBuffer.wrap(bArr);
                return;
            }
            throw new v("memCache is null 3: " + i + ' ' + b1.z);
        }

        public void a() {
        }

        public long b() {
            return this.f607c ? this.f606b.capacity() : this.f605a.length();
        }

        public long c() {
            return this.f607c ? this.f606b.position() : this.f605a.getFilePointer();
        }

        public int d(byte[] bArr) {
            return e(bArr, 0, bArr.length);
        }

        public int e(byte[] bArr, int i, int i2) {
            if (!this.f607c) {
                return this.f605a.read(bArr, i, i2);
            }
            int iMin = Math.min(i2, this.f606b.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f606b.get(bArr, i, iMin);
            return iMin;
        }

        public void f(long j) throws IOException {
            if (this.f607c) {
                this.f606b.position((int) j);
            } else {
                this.f605a.seek(j);
            }
        }

        public void g(int i) throws IOException {
            if (!this.f607c) {
                this.f605a.skipBytes(i);
            } else {
                ByteBuffer byteBuffer = this.f606b;
                byteBuffer.position(byteBuffer.position() + i);
            }
        }

        public void h(byte[] bArr) throws IOException {
            if (this.f607c) {
                this.f606b.put(bArr);
            } else {
                this.f605a.write(bArr);
            }
        }

        public void i(byte[] bArr, int i, int i2) throws IOException {
            if (this.f607c) {
                this.f606b.put(bArr, i, i2);
            } else {
                this.f605a.write(bArr, i, i2);
            }
        }

        /* synthetic */ b0(b1 b1Var, int i, i iVar) {
            this(i);
        }

        private b0(byte[] bArr, String str) {
            this.f605a = null;
            this.f606b = null;
            if (bArr != null) {
                this.f607c = true;
                this.f606b = ByteBuffer.wrap(bArr);
            } else {
                throw new v("RandomAccessData: null data for " + str);
            }
        }

        /* synthetic */ b0(b1 b1Var, byte[] bArr, String str, i iVar) {
            this(bArr, str);
        }
    }

    class c implements View.OnClickListener {

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                b1.k(true);
            }
        }

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            android.ext.f.p(android.ext.f.c(android.ext.r.p).setMessage(b2.f(R.string.install_cancel_prompt)).setPositiveButton(R.string.yes, new a()).setNegativeButton(R.string.no, (DialogInterface.OnClickListener) null).setCancelable(false), android.ext.r.n);
        }
    }

    public static class c0 implements Parcelable {
        public static final Parcelable.Creator<c0> CREATOR = new a();
        static volatile boolean p = false;
        static volatile boolean q = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f612c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f613d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f614e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f615f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f616g;
        boolean h;
        volatile boolean i;
        volatile int j;
        String k;
        volatile int l;
        volatile boolean m;
        String n;
        String o;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c0 createFromParcel(Parcel parcel) {
                return new c0(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c0[] newArray(int i) {
                return new c0[i];
            }
        }

        c0() {
            this.f610a = false;
            this.f611b = 0;
            this.f612c = null;
            this.f613d = null;
            this.f614e = null;
            this.f615f = null;
            this.f616g = 0;
            this.h = false;
            this.i = false;
            this.j = 0;
            this.k = "";
            this.l = 0;
            this.m = false;
            this.n = null;
            this.o = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.f610a ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f611b);
            parcel.writeString(this.f612c);
            parcel.writeString(this.f613d);
            parcel.writeString(this.f614e);
            parcel.writeString(this.f615f);
            parcel.writeInt(this.f616g);
            parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.j);
            parcel.writeString(this.k);
            parcel.writeInt(this.l);
            parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
            parcel.writeString(this.n);
            parcel.writeString(this.o);
        }

        protected c0(Parcel parcel) {
            this.f610a = false;
            this.f611b = 0;
            this.f612c = null;
            this.f613d = null;
            this.f614e = null;
            this.f615f = null;
            this.f616g = 0;
            this.h = false;
            this.i = false;
            this.j = 0;
            this.k = "";
            this.l = 0;
            this.m = false;
            this.n = null;
            this.o = null;
            this.f610a = parcel.readByte() != 0;
            this.f611b = parcel.readInt();
            this.f612c = parcel.readString();
            this.f613d = parcel.readString();
            this.f614e = parcel.readString();
            this.f615f = parcel.readString();
            this.f616g = parcel.readInt();
            this.h = parcel.readByte() != 0;
            this.i = parcel.readByte() != 0;
            this.j = parcel.readInt();
            this.k = parcel.readString();
            this.l = parcel.readInt();
            this.m = parcel.readByte() != 0;
            this.n = parcel.readString();
            this.o = parcel.readString();
        }
    }

    class d implements DialogInterface.OnClickListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            x2.t(android.ext.i.f1000b);
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f618a;

        e(int i) {
            this.f618a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            b1.C.j &= ~this.f618a;
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b1.this.E();
        }
    }

    class g extends ByteArrayOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f621a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i, int i2) {
            super(i);
            this.f621a = i2;
        }

        @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            byte[][] bArr = b1.z;
            if (bArr != null) {
                byte[] byteArray = toByteArray();
                if (byteArray == null) {
                    e1.a(new RuntimeException("toByteArray return null"));
                }
                bArr[this.f621a] = byteArray;
            }
        }
    }

    static /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f624b;

        static {
            int[] iArr = new int[y.values().length];
            f624b = iArr;
            try {
                iArr[y.ROOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f624b[y.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f624b[y.REFUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[r.values().length];
            f623a = iArr2;
            try {
                iArr2[r.PROCEED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f623a[r.OPEN_SETTINGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f625a;

        i(Runnable runnable) {
            this.f625a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            b1.S1();
            this.f625a.run();
            b1.R1("normal-service-ready");
            b1.f("normal-service-ready");
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b1.L0()) {
                b1.t0();
            }
        }
    }

    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b1.Q1(4);
        }
    }

    class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f626a;

        l(String str) {
            this.f626a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = (TextView) b1.I.get();
            if (textView != null) {
                textView.setText(this.f626a);
            }
        }
    }

    class m implements Runnable {

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i != -1) {
                    b1.k(false);
                    return;
                }
                c0 c0VarJ0 = b1.j0();
                c0VarJ0.l = 0;
                c0VarJ0.m = false;
                b1.z1();
            }
        }

        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = new a();
            android.ext.f.o(android.ext.f.c(android.ext.r.p).setMessage(b2.f(R.string.failed_install)).setPositiveButton(R.string.yes, aVar).setNegativeButton(R.string.no, aVar).setCancelable(false));
        }
    }

    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.r.n.finish();
        }
    }

    class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f628a;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                android.ext.r.I();
            }
        }

        o(String str) {
            this.f628a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            File file;
            b1 b1Var = b1.B;
            String absolutePath = (b1Var == null || (file = b1Var.f594c) == null) ? null : file.getAbsolutePath();
            android.ext.f.m(android.ext.f.c(android.ext.r.p).setMessage(b2.f(R.string.no_space) + '\n' + this.f628a + '\n' + absolutePath).setPositiveButton(R.string.ok, new a()).setCancelable(false).create());
        }
    }

    class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f630a;

        class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: android.ext.b1$p$a$a, reason: collision with other inner class name */
            class RunnableC0013a implements Runnable {
                RunnableC0013a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    e1.d("Kill by Installer");
                    f1.n();
                }
            }

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i != -1) {
                    b1.k(true);
                } else {
                    new android.ext.r.n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf2:6<;0jdwkhulqj0lqirupdwlrq0derxw0jj0huuruv2").onClick(dialogInterface, i);
                    n2.d().postDelayed(new RunnableC0013a(), 5000L);
                }
            }
        }

        p(Throwable th) {
            this.f630a = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = new a();
            android.ext.f.m(android.ext.f.c(android.ext.r.p).setMessage(Tools.N1(R.string.reinstall_fail) + ":\n\n" + e1.n(this.f630a)).setPositiveButton(R.string.more, aVar).setNegativeButton(R.string.ok, aVar).setCancelable(false).create());
        }
    }

    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.r.I();
        }
    }

    enum r {
        PROCEED,
        OPEN_SETTINGS,
        FAIL_PENDING
    }

    private static class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        short f637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        short f638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f639c;

        s(ByteBuffer byteBuffer) {
            byteBuffer.position(0);
            this.f637a = byteBuffer.getShort();
            this.f638b = byteBuffer.getShort();
            this.f639c = byteBuffer.getInt();
        }
    }

    private static final class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f642c;

        t(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        boolean a() {
            return this.f642c == this.f641b;
        }

        t b(int[] iArr) {
            return new t(this.f640a, iArr[0], iArr[1]);
        }

        int[] c(int i) {
            int i2;
            int i3 = this.f642c;
            int i4 = i3 + 2;
            int i5 = this.f641b;
            if (i4 <= i5) {
                byte[] bArr = this.f640a;
                if ((bArr[i3] & 255) == i) {
                    int i6 = i3 + 1;
                    int i7 = i3 + 2;
                    int i8 = bArr[i6];
                    int i9 = i8 & 255;
                    if ((i8 & 128) != 0) {
                        int i10 = i8 & 127;
                        if (i10 == 0 || i10 > 4 || i7 + i10 > i5) {
                            return null;
                        }
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < i10) {
                            i12 = (i12 << 8) | (this.f640a[i7] & 255);
                            i11++;
                            i7++;
                        }
                        i9 = i12;
                    }
                    if (i9 >= 0 && (i2 = i7 + i9) <= this.f641b) {
                        this.f642c = i2;
                        return new int[]{i7, i9};
                    }
                }
            }
            return null;
        }

        byte[] d(int[] iArr) {
            int i = iArr[1];
            byte[] bArr = new byte[i];
            System.arraycopy(this.f640a, iArr[0], bArr, 0, i);
            return bArr;
        }

        t(byte[] bArr, int i, int i2) {
            this.f640a = bArr;
            this.f642c = i;
            this.f641b = i + i2;
        }
    }

    private static final class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f645c;

        u(String str, int i, int i2) {
            this.f643a = str;
            this.f644b = i;
            this.f645c = i2;
        }
    }

    static class v extends RuntimeException {
        public v(String str) {
            super(str);
        }

        public v(String str, Throwable th) {
            super(str, th);
        }
    }

    public static class w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ZipEntry f646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f648c;

        public w(ZipEntry zipEntry, String str) {
            this.f646a = zipEntry;
            this.f647b = str;
        }

        public String toString() {
            return "Item [entry=" + this.f646a + ", extractHash=" + this.f647b + ", putHash=" + this.f648c + ']';
        }
    }

    private static class x extends OutputStream {
        private x() {
        }

        /* synthetic */ x(i iVar) {
            this();
        }

        @Override // java.io.OutputStream
        public void write(int i) {
        }
    }

    enum y {
        ROOT,
        MANUAL,
        OPEN_SETTINGS,
        REFUSED
    }

    private static class z extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final RandomAccessFile f654a;

        private z(RandomAccessFile randomAccessFile) throws IOException {
            this.f654a = randomAccessFile;
            randomAccessFile.seek(0L);
        }

        @Override // java.io.InputStream
        public int available() {
            int length = (int) (this.f654a.length() - this.f654a.getFilePointer());
            if (length > 0) {
                return length;
            }
            return 0;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i) {
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public int read() {
            return this.f654a.read();
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            RandomAccessFile randomAccessFile = this.f654a;
            randomAccessFile.seek(randomAccessFile.getFilePointer() + j);
            return j;
        }

        /* synthetic */ z(RandomAccessFile randomAccessFile, i iVar) {
            this(randomAccessFile);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) {
            return this.f654a.read(bArr);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            return this.f654a.read(bArr, i, i2);
        }
    }

    private b1() {
        String strF0;
        String[] strArr = x;
        this.f592a = new RandomAccessFile[strArr.length];
        this.k = new w[strArr.length];
        this.r = null;
        this.l = MessageDigest.getInstance("SHA1");
        this.m = MessageDigest.getInstance("SHA1");
        this.n = MessageDigest.getInstance("SHA-256");
        this.f597f = d1();
        File fileT = T(true);
        fileT.mkdirs();
        this.f593b = fileT;
        e1.d("Int dir: " + fileT.getAbsolutePath());
        i();
        e1.d("Apk: " + this.f594c.getAbsolutePath());
        A1();
        if (C.f613d == null) {
            C.f613d = e0();
        }
        if (C.f614e == null) {
            do {
                strF0 = f0(1);
            } while (android.ext.i.f1001c.equals(strF0));
            C.f614e = strF0;
        }
        String str = C.f613d;
        this.f598g = str;
        this.h = C.f614e;
        String strF1 = C.f615f != null ? C.f615f : f0(2);
        this.i = strF1;
        C.f615f = strF1;
        int iE0 = C.f616g != 0 ? C.f616g : E0();
        this.j = iE0;
        C.f616g = iE0;
        e1.d("package: " + android.ext.i.f1000b + " -> " + str);
    }

    private static int[] A(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, int i6) {
        if (i2 < i6 || i2 > i3 - 4) {
            throw new v("hashDex: map list out of bounds");
        }
        long jB = B(byteBuffer, i2);
        long j2 = ((long) i2) + 4 + (12 * jB);
        if (jB >= 1 && jB <= 2147483647L) {
            long j3 = i3;
            if (j2 <= j3) {
                int i7 = (int) jB;
                int i8 = (int) j2;
                int[] iArr = new int[i7];
                int[] iArr2 = new int[i7];
                long[] jArr = new long[i7];
                int i9 = -1;
                for (int i10 = 0; i10 < i7; i10++) {
                    int i11 = i2 + 4 + (i10 * 12);
                    int i12 = byteBuffer.getShort(i11) & 65535;
                    int i13 = byteBuffer.getShort(i11 + 2) & 65535;
                    long jB2 = B(byteBuffer, i11 + 4);
                    long jB3 = B(byteBuffer, i11 + 8);
                    if (i13 != 0 || jB2 < 1 || jB3 >= j3 || (i10 > 0 && jB3 <= i9)) {
                        throw new v("hashDex: invalid map item");
                    }
                    iArr[i10] = i12;
                    i9 = (int) jB3;
                    iArr2[i10] = i9;
                    jArr[i10] = jB2;
                }
                int i14 = -1;
                int i15 = -1;
                int i16 = -1;
                for (int i17 = 0; i17 < i7; i17++) {
                    int i18 = iArr[i17];
                    if (i18 == 1) {
                        if (i15 >= 0) {
                            throw new v("hashDex: duplicate string_ids map item");
                        }
                        i15 = i17;
                    } else if (i18 == 4096) {
                        if (i16 >= 0) {
                            throw new v("hashDex: duplicate map_list item");
                        }
                        i16 = i17;
                    } else if (i18 != 8194) {
                        continue;
                    } else {
                        if (i14 >= 0) {
                            throw new v("hashDex: duplicate string_data map item");
                        }
                        i14 = i17;
                    }
                }
                if (i15 >= 0) {
                    long j4 = i4;
                    if (jArr[i15] == j4 && iArr2[i15] == i5) {
                        if (i16 < 0 || jArr[i16] != 1 || iArr2[i16] != i2) {
                            throw new v("hashDex: map_list entry mismatch");
                        }
                        int i19 = i16 + 1;
                        if (i8 > (i19 < i7 ? iArr2[i19] : i3)) {
                            throw new v("hashDex: map list overlaps another section");
                        }
                        if (i14 < 0 || jArr[i14] != j4) {
                            throw new v("hashDex: string_data map mismatch");
                        }
                        int i20 = iArr2[i14];
                        int i21 = i14 + 1;
                        int i22 = i21 < i7 ? iArr2[i21] : i3;
                        if (i20 < i6 || i20 >= i22 || i22 > i3) {
                            throw new v("hashDex: string data out of bounds");
                        }
                        return new int[]{i20, i22};
                    }
                }
                throw new v("hashDex: string_ids map mismatch");
            }
        }
        throw new v("hashDex: map list out of bounds");
    }

    private static byte[] A0(String str) {
        byte[] bArr = new byte[str.length() * 3];
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == 0) {
                int i4 = i2 + 1;
                bArr[i2] = -64;
                i2 += 2;
                bArr[i4] = -128;
            } else if (cCharAt < 128) {
                bArr[i2] = (byte) cCharAt;
                i2++;
            } else if (cCharAt < 2048) {
                int i5 = i2 + 1;
                bArr[i2] = (byte) ((cCharAt >> 6) | 192);
                i2 += 2;
                bArr[i5] = (byte) ((cCharAt & '?') | 128);
            } else {
                bArr[i2] = (byte) ((cCharAt >> '\f') | 224);
                int i6 = i2 + 2;
                bArr[i2 + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                i2 += 3;
                bArr[i6] = (byte) ((cCharAt & '?') | 128);
            }
        }
        return Arrays.copyOf(bArr, i2);
    }

    private void A1() {
        B1(this.f593b);
        File parentFile = this.f594c.getParentFile();
        if (parentFile == null || parentFile.equals(this.f593b)) {
            return;
        }
        B1(parentFile);
    }

    private static long B(ByteBuffer byteBuffer, int i2) {
        return ((long) byteBuffer.getInt(i2)) & 4294967295L;
    }

    public static boolean B0() {
        u1();
        try {
            if (!new File(Tools.removeNewLinesChars("2gdwd2JJ1vnls1lqvwdoo")).exists()) {
                if (android.ext.i.f1000b.equals(Tools.C0()) && !W("installer.fail").exists()) {
                    return true;
                }
            }
        } catch (Throwable th) {
            e1.a(th);
        }
        return false;
    }

    private void B1(File file) {
        String[] list;
        if (file == null || (list = file.list()) == null) {
            return;
        }
        for (String str : list) {
            if (y0(str)) {
                File file2 = new File(file, str);
                if (!file2.equals(this.f595d) && file2.isFile() && !file2.delete()) {
                    e1.p("Failed sweep orphaned part: " + str);
                }
            }
        }
    }

    private static File C(String str) {
        File fileP0 = Tools.p0();
        if (fileP0 != null && !fileP0.isDirectory()) {
            fileP0.mkdirs();
        }
        return new File(fileP0, str);
    }

    private static String C0() {
        return Tools.removeNewLinesChars("2gdwd2orfdo2wps21") + UUID.randomUUID();
    }

    private static byte[] C1(byte[] bArr) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (bArrCopyOf.length > 0) {
            int length = bArrCopyOf.length / 2;
            bArrCopyOf[length] = (byte) (bArrCopyOf[length] ^ 1);
        }
        return bArrCopyOf;
    }

    private void D(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (Throwable th) {
                e1.a(th);
            }
        }
        if (!this.f595d.exists() || this.f595d.delete()) {
            return;
        }
        e1.p("Failed discard part: " + this.f595d.getName());
    }

    private static String D0() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return m0.i(bArr) + ".apk";
    }

    private static int D1(int i2, byte[] bArr, int i3) {
        int i4 = 0;
        while (true) {
            int i5 = i2 & 127;
            i2 >>>= 7;
            if (i2 != 0) {
                i5 |= 128;
            }
            int i6 = i4 + 1;
            bArr[i4 + i3] = (byte) i5;
            if (i2 == 0) {
                return i6;
            }
            i4 = i6;
        }
    }

    private static int E0() {
        return Tools.f489a.nextInt(((int) (((1 * 16985.2f) - 830.2f) + 0.5f)) * 2) + 1;
    }

    private static int E1(int i2) {
        if (i2 < 128) {
            return 1;
        }
        if (i2 < 16384) {
            return 2;
        }
        return i2 < 2097152 ? 3 : 4;
    }

    private void F() throws IOException {
        String str;
        ZipInputStream zipInputStreamL0 = l0();
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStreamL0.getNextEntry();
                if (nextEntry == null) {
                    zipInputStreamL0.close();
                    return;
                }
                int iY = Y(nextEntry);
                if (iY != -1) {
                    this.k[iY] = new w(new ZipEntry(nextEntry), G(nextEntry, zipInputStreamL0, iY));
                    str = "list: " + iY;
                } else if (z0(nextEntry.getName())) {
                    Map mapP1 = p1();
                    this.p = mapP1;
                    mapP1.put(nextEntry.getName(), c1(nextEntry, zipInputStreamL0));
                    str = "secondary dex: " + nextEntry.getName();
                }
                e1.d(str);
            } catch (Throwable th) {
                zipInputStreamL0.close();
                throw th;
            }
        }
    }

    public static void F0(int i2, int i3, Intent intent) {
        c0 c0Var = C;
        e1.d("instance: " + B + "; " + c0Var);
        if (c0Var == null) {
            return;
        }
        c0Var.k += "\nget: " + i3 + " for: " + i2 + " with: " + intent;
        b1 b1Var = B;
        if (b1Var == null) {
            return;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            T0(b2.f(R.string.failed_uninstall), i2, i3, k0(android.ext.i.f1000b));
        } else {
            if (Tools.e1(b1Var.f598g)) {
                c0Var.j = (~i2) & c0Var.j;
                return;
            }
            T0(b2.f(R.string.failed_install) + "\n\n" + Tools.N1(R.string.manual_install) + ":\n" + B.f594c.getAbsolutePath(), i2, i3, B.a0());
        }
    }

    private void F1() {
        if (Q0(C.l)) {
            try {
                e2.n("exec pm uninstall " + android.ext.i.f1000b, 45);
            } catch (Throwable th) {
                e1.l("run cmd fail", th);
            }
        }
        String str = android.ext.i.f1000b;
        if (!Tools.e1(str)) {
            android.ext.f.o(android.ext.f.c(android.ext.r.p).setMessage(b2.f(R.string.install_finished)).setPositiveButton(b2.f(R.string.ok), new p0(1600)));
            return;
        }
        if (C.h) {
            for (Intent intent : k0(str)) {
                try {
                    P1(intent, 2);
                    break;
                } catch (ActivityNotFoundException e2) {
                    e1.l("intent fail", e2);
                }
            }
        } else {
            android.ext.f.o(android.ext.f.c(android.ext.r.p).setMessage(b2.f(R.string.need_uninstall)).setPositiveButton(b2.f(R.string.ok), new d()));
        }
        throw new RuntimeException("Failed uninstall self");
    }

    private String G(ZipEntry zipEntry, ZipInputStream zipInputStream, int i2) throws IOException {
        this.l.reset();
        DigestOutputStream digestOutputStream = new DigestOutputStream(g0(i2), this.l);
        this.m.reset();
        DigestInputStream digestInputStream = new DigestInputStream(zipInputStream, this.m);
        try {
            byte[] bArrS = S();
            while (true) {
                int i3 = digestInputStream.read(bArrS);
                if (i3 == -1) {
                    digestOutputStream.flush();
                    digestOutputStream.close();
                    String strEncodeToString = Base64.encodeToString(this.l.digest(), 2);
                    String strEncodeToString2 = Base64.encodeToString(this.m.digest(), 2);
                    e1.d("extract " + zipEntry.getName() + ": " + strEncodeToString2 + " -> " + strEncodeToString);
                    n(zipEntry, i2, strEncodeToString, strEncodeToString2);
                    return strEncodeToString;
                }
                digestOutputStream.write(bArrS, 0, i3);
            }
        } catch (Throwable th) {
            digestOutputStream.close();
            String strEncodeToString3 = Base64.encodeToString(this.l.digest(), 2);
            e1.d("extract " + zipEntry.getName() + ": " + Base64.encodeToString(this.m.digest(), 2) + " -> " + strEncodeToString3);
            throw th;
        }
    }

    static void G0() {
        c0 c0Var = C;
        if (c0Var != null && c0Var.i && c0.p) {
            c0.q = true;
            c0Var.i = false;
            c0Var.j &= -5;
        }
    }

    private void G1(ZipEntry zipEntry, int i2) throws IOException {
        e1.d("updateEntry f: " + android.ext.g.a(zipEntry));
        CRC32 crc32 = new CRC32();
        InputStream inputStreamZ = Z(i2);
        try {
            byte[] bArrS = S();
            long j2 = 0;
            while (true) {
                int i3 = inputStreamZ.read(bArrS);
                if (i3 == -1) {
                    break;
                } else if (i3 != 0) {
                    j2 += (long) i3;
                    crc32.update(bArrS, 0, i3);
                }
            }
            inputStreamZ.close();
            zipEntry.setCrc(crc32.getValue());
            long jC0 = c0(i2);
            zipEntry.setSize(jC0);
            zipEntry.setCompressedSize(zipEntry.getMethod() == 0 ? jC0 : -1L);
            e1.d("updateEntry t: " + android.ext.g.a(zipEntry) + ' ' + jC0 + ' ' + j2);
        } catch (Throwable th) {
            inputStreamZ.close();
            throw th;
        }
    }

    private void H(b0 b0Var) throws IOException {
        I(b0Var, true);
    }

    private static int H0() {
        return (int) (((1 * 18038.1f) - 1883.1f) + 0.5f);
    }

    static void H1() {
        int i2 = C.f611b + J;
        if (i2 > 1000) {
            i2 = 1000;
        }
        ProgressBar progressBar = (ProgressBar) G.get();
        if (progressBar != null) {
            progressBar.setMax(1000);
            progressBar.setProgress(i2);
        }
        TextView textView = (TextView) H.get();
        if (textView != null) {
            textView.setText(Tools.L1("%.1f %%", Double.valueOf((((double) i2) * 100.0d) / 1000.0d)));
        }
        if (J < 199) {
            J++;
        }
        if (C.f611b == 600) {
            if (J == 60) {
                TextView textView2 = (TextView) I.get();
                String str = C.f612c;
                if (textView2 != null && str != null) {
                    textView2.setText(b2.f(R.string.installing) + "\n\n" + Tools.N1(R.string.manual_install) + ":\n" + str);
                }
            }
            if (J == 198 && B != null && C.h) {
                T0(b2.f(R.string.failed_install) + "\n\n" + Tools.N1(R.string.manual_install) + ":\n" + B.f594c.getAbsolutePath(), 1, -123, B.a0());
            }
        }
    }

    private boolean I(b0 b0Var, boolean z2) throws IOException {
        byte[] bArr = new byte[8];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        ByteBuffer byteBufferOrder = byteBufferWrap.order(byteOrder);
        long jB = b0Var.b();
        if (jB < 64) {
            throw new v("fixDex: truncated classes.dex header");
        }
        b0Var.f(56L);
        if (b0Var.e(bArr, 0, 8) != 8) {
            throw new v("fixDex: truncated classes.dex header");
        }
        byteBufferOrder.position(0);
        int i2 = byteBufferOrder.getInt();
        int i3 = byteBufferOrder.getInt();
        if (i2 >= 1) {
            int i4 = 64;
            if (i3 >= 64) {
                long j2 = i3;
                if ((((long) i2) * 4) + j2 <= jB) {
                    int i5 = i2 * 4;
                    byte[] bArr2 = new byte[i5];
                    b0Var.f(j2);
                    if (b0Var.d(bArr2) != i5) {
                        throw new v("fixDex: truncated string_ids table");
                    }
                    ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(bArr2).order(byteOrder);
                    int[] iArr = new int[i2];
                    int i6 = 0;
                    while (i6 < i2) {
                        int i7 = byteBufferOrder2.getInt();
                        iArr[i6] = i7;
                        if (i7 >= i4) {
                            long j3 = j2;
                            if (i7 < jB && (i6 <= 0 || i7 > iArr[i6 - 1])) {
                                i6++;
                                j2 = j3;
                                i4 = 64;
                            }
                        }
                        throw new v("fixDex: string_ids offsets are not strictly increasing");
                    }
                    long j4 = j2;
                    int i8 = iArr[0];
                    long j5 = i8;
                    long j6 = jB - j5;
                    if (j6 > 2147483647L) {
                        throw new v("fixDex: string_data tail is out of bounds");
                    }
                    int i9 = (int) j6;
                    byte[] bArr3 = new byte[i9];
                    b0Var.f(j5);
                    if (b0Var.d(bArr3) != i9) {
                        throw new v("fixDex: truncated string_data section");
                    }
                    String strReplace = android.ext.i.f1000b.replace('.', '/');
                    String strReplace2 = this.f598g.replace('.', '/');
                    if (strReplace.length() < strReplace2.length()) {
                        throw new v("fixDex: generated package is longer than the original");
                    }
                    String[] strArr = new String[i2];
                    int[] iArr2 = new int[i2];
                    int i10 = 0;
                    while (true) {
                        String str = "fixDex: string ";
                        if (i10 < i2) {
                            long j7 = j5;
                            int i11 = iArr[i10] - i8;
                            int i12 = i10 + 1;
                            int i13 = i12 < i2 ? iArr[i12] - i8 : i9;
                            if (i11 >= i13) {
                                throw new v("fixDex: string " + i10 + " has an empty slot");
                            }
                            u uVarX = x(bArr3, i11, i13, i10);
                            strArr[i10] = uVarX.f643a;
                            iArr2[i10] = uVarX.f645c;
                            i10 = i12;
                            j5 = j7;
                        } else {
                            long j8 = j5;
                            int i14 = i2 - 1;
                            int i15 = (iArr[i14] - i8) + iArr2[i14];
                            if (i15 < 1 || i15 > i9) {
                                throw new v("fixDex: string_data section is out of bounds");
                            }
                            byte[][] bArr4 = new byte[i2][];
                            HashMap map = new HashMap();
                            int i16 = 0;
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                String str2 = str;
                                if (i17 < i2) {
                                    String str3 = strArr[i17];
                                    String strReplace3 = str3.replace(strReplace, strReplace2);
                                    if (!str3.equals(strReplace3)) {
                                        i18++;
                                    }
                                    strArr[i17] = strReplace3;
                                    byte[] bArrA0 = A0(strReplace3);
                                    String str4 = strReplace2;
                                    String[] strArr2 = strArr;
                                    int iE1 = E1(strReplace3.length()) + bArrA0.length + 1;
                                    byte[] bArr5 = new byte[iE1];
                                    int i19 = i18;
                                    String str5 = strReplace;
                                    byte[] bArr6 = bArr3;
                                    System.arraycopy(bArrA0, 0, bArr5, D1(strReplace3.length(), bArr5, 0), bArrA0.length);
                                    bArr4[i17] = bArr5;
                                    if (i16 > i15 - iE1) {
                                        throw new v("fixDex: repacked string_data section does not fit");
                                    }
                                    i16 += iE1;
                                    Integer num = (Integer) map.get(strReplace3);
                                    map.put(strReplace3, Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                                    i17++;
                                    str = str2;
                                    i18 = i19;
                                    strReplace2 = str4;
                                    strArr = strArr2;
                                    strReplace = str5;
                                    bArr3 = bArr6;
                                } else {
                                    byte[] bArr7 = bArr3;
                                    String str6 = strReplace;
                                    if (i18 == 0) {
                                        if (z2) {
                                            throw new v("fixDex: no string in classes.dex carried the original package");
                                        }
                                        return false;
                                    }
                                    ByteBuffer byteBufferOrder3 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                    int length = 0;
                                    for (int i20 = 0; i20 < i2; i20++) {
                                        int i21 = i8 + length;
                                        iArr[i20] = i21;
                                        byteBufferOrder3.putInt(i20 * 4, i21);
                                        byte[] bArr8 = bArr4[i20];
                                        System.arraycopy(bArr8, 0, bArr7, length, bArr8.length);
                                        length += bArr4[i20].length;
                                    }
                                    Arrays.fill(bArr7, length, i15, (byte) 0);
                                    b0Var.f(j4);
                                    b0Var.h(bArr2);
                                    b0Var.f(j8);
                                    b0Var.i(bArr7, 0, i15);
                                    byte[] bArr9 = new byte[i15];
                                    b0Var.f(j8);
                                    if (b0Var.d(bArr9) != i15) {
                                        throw new v("fixDex: re-read of string_data section failed");
                                    }
                                    HashMap map2 = new HashMap();
                                    int i22 = 0;
                                    while (i22 < i2) {
                                        int i23 = iArr[i22] - i8;
                                        int i24 = i22 + 1;
                                        int i25 = i24 < i2 ? iArr[i24] - i8 : i16;
                                        if (i23 >= i25) {
                                            throw new v(str2 + i22 + " has an empty slot");
                                        }
                                        u uVarX2 = x(bArr9, i23, i25, i22);
                                        if (uVarX2.f645c != i25 - i23) {
                                            throw new v("fixDex: string_data items are not contiguous at " + i22);
                                        }
                                        String str7 = uVarX2.f643a;
                                        String str8 = str6;
                                        if (str7.indexOf(str8) >= 0) {
                                            throw new v("fixDex: rewritten DEX still contains the original package");
                                        }
                                        Integer num2 = (Integer) map2.get(str7);
                                        map2.put(str7, Integer.valueOf(num2 == null ? 1 : num2.intValue() + 1));
                                        str6 = str8;
                                        i22 = i24;
                                    }
                                    if (!map.equals(map2)) {
                                        throw new v("fixDex: on-disk string_data does not match the expected re-base");
                                    }
                                    byte[] bArrS = S();
                                    b0Var.f(32L);
                                    this.l.reset();
                                    while (true) {
                                        int iD = b0Var.d(bArrS);
                                        if (iD == -1) {
                                            break;
                                        }
                                        this.l.update(bArrS, 0, iD);
                                    }
                                    b0Var.f(12L);
                                    b0Var.h(this.l.digest());
                                    Adler32 adler32 = new Adler32();
                                    b0Var.f(12L);
                                    while (true) {
                                        int iD2 = b0Var.d(bArrS);
                                        if (iD2 == -1) {
                                            b0Var.f(8L);
                                            byteBufferOrder2.putInt(0, (int) adler32.getValue());
                                            b0Var.i(byteBufferOrder2.array(), 0, 4);
                                            return true;
                                        }
                                        adler32.update(bArrS, 0, iD2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new v("fixDex: string_ids table is out of bounds");
    }

    private static String I0() {
        return "" + ((1 * 109.9f) - 8.5f);
    }

    private void I1() throws IOException {
        if (!x0(C.o) || !x0(C.n)) {
            throw J1("binding-missing");
        }
        q();
        if (!this.f594c.isFile()) {
            throw J1("binding-mismatch");
        }
        if (!C.n.equals(v1(this.f594c))) {
            throw J1("commit-hash");
        }
        try {
            L1(this.f594c, C.o);
            N1();
        } catch (v e2) {
            throw K1("binding-mismatch", e2);
        }
    }

    private void J() throws IOException {
        O();
        int i2 = 0;
        while (true) {
            w[] wVarArr = this.k;
            if (i2 >= wVarArr.length) {
                return;
            }
            w wVar = wVarArr[i2];
            if (wVar != null) {
                K(wVar.f646a, i2);
            }
            i2++;
        }
    }

    private static String J0(String str) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = Tools.B0().getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length == 1) {
                return l(signatureArr[0]);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static v J1(String str) {
        return K1(str, null);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0104 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #0 {all -> 0x002e, blocks: (B:14:0x0012, B:19:0x001c, B:21:0x001f, B:23:0x0029, B:26:0x0031, B:28:0x0041, B:29:0x0045, B:30:0x0052, B:31:0x0059, B:17:0x0018, B:32:0x005a, B:33:0x0070, B:34:0x0071, B:36:0x0075, B:37:0x007e, B:38:0x0089, B:40:0x008e, B:44:0x00a4, B:43:0x0099, B:45:0x00a7, B:46:0x00af, B:48:0x00b5, B:51:0x00c4, B:52:0x00cc, B:57:0x00d7, B:61:0x00eb, B:62:0x00f6, B:63:0x0100, B:64:0x0104, B:70:0x0114, B:74:0x011d, B:75:0x0120, B:66:0x010b, B:69:0x0111), top: B:79:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x010b A[Catch: all -> 0x010f, TRY_ENTER, TryCatch #1 {all -> 0x010f, blocks: (B:66:0x010b, B:69:0x0111), top: B:80:0x0109, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0111 A[Catch: all -> 0x010f, TRY_LEAVE, TryCatch #1 {all -> 0x010f, blocks: (B:66:0x010b, B:69:0x0111), top: B:80:0x0109, outer: #0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.ext.b1$i, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    private void K(ZipEntry zipEntry, int i2) throws IOException {
        b0 b0Var;
        OutputStream outputStreamG0;
        ?? r0 = 0;
        r0 = 0;
        r0 = 0;
        try {
            if (i2 == 0) {
                b0Var = new b0(this, i2, (i) r0);
                try {
                    if (i2 == 0) {
                        H(b0Var);
                    } else {
                        N(b0Var);
                    }
                    b0Var.a();
                } catch (Throwable th) {
                    b0Var.a();
                    throw th;
                }
            } else if (i2 == 1) {
                M();
            } else if (i2 == 2) {
                b0Var = new b0(this, i2, (i) r0);
                if (i2 == 0) {
                    H(b0Var);
                } else {
                    N(b0Var);
                }
                b0Var.a();
            } else if (i2 == 3) {
                Manifest manifestD0 = d0(zipEntry);
                this.o = manifestD0;
                Map<String, Attributes> entries = manifestD0.getEntries();
                int i3 = 0;
                while (true) {
                    String[] strArr = x;
                    if (i3 >= strArr.length) {
                        break;
                    }
                    Attributes attributes = entries.get(strArr[i3]);
                    if (attributes != null) {
                        f1(attributes, U(Z(i3)));
                    }
                    i3++;
                }
                for (String str : P()) {
                    Attributes attributes2 = entries.get(str);
                    if (attributes2 != null) {
                        f1(attributes2, w1(str));
                    }
                }
                byte b2 = y;
                if (b2 != 0) {
                    entries.put(b2 == 1 ? "lib/armeabi/libAndroid.so" : "lib/arm64-v8a/libAndroid.so", entries.remove("res/raw/ydw3a"));
                    entries.put(y == 1 ? "lib/x86/libAndroid.so" : "lib/x86_64/libAndroid.so", entries.remove("res/raw/ydw3x"));
                }
                Manifest manifest = this.o;
                OutputStream outputStreamG1 = g0(i2);
                manifest.write(outputStreamG1);
                r0 = outputStreamG1;
            } else if (i2 == 4) {
                Manifest manifest2 = this.o;
                if (manifest2 != null) {
                    outputStreamG0 = g0(i2);
                    R(manifest2, outputStreamG0);
                }
            } else {
                if (i2 != 5) {
                    throw new IOException("unknown index: " + i2);
                }
                byte[][] bArr = z;
                byte[] bArrC1 = bArr == null ? null : bArr[4];
                if (bArrC1 == null || bArrC1.length == 0) {
                    throw new v("CERT.SF is not available for signing");
                }
                if ("tamper-cert-sf".equals(this.f597f)) {
                    bArrC1 = C1(bArrC1);
                }
                m0.b bVarG = m0.g(bArrC1);
                byte[] bArrC2 = bVarG.f1072a;
                if ("tamper-cert-rsa".equals(this.f597f)) {
                    bArrC2 = C1(bArrC2);
                }
                this.f596e = bVarG.f1073b;
                OutputStream outputStreamG2 = g0(i2);
                outputStreamG2.write(bArrC2);
                r0 = outputStreamG2;
            }
            if (r0 == 0) {
                r0 = outputStreamG0;
                return;
            } else {
                r0 = outputStreamG0;
                r0.close();
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                r0.close();
            }
            throw th2;
        }
    }

    private static File K0(File file) {
        String name = file.getName();
        if (!name.endsWith(".apk")) {
            throw new v("committed apk name is not owned: " + name);
        }
        return new File(file.getParentFile(), name.substring(0, name.length() - 4) + ".part.apk");
    }

    private static v K1(String str, Throwable th) {
        String str2;
        W1(str);
        StringBuilder sb = new StringBuilder();
        sb.append("verify: generated APK identity check failed: ");
        sb.append(str);
        if (th != null) {
            str2 = " (" + th + ")";
        } else {
            str2 = "";
        }
        sb.append(str2);
        e1.i(sb.toString());
        return new v("verify: generated APK identity check failed: " + str, th);
    }

    private void L(ZipEntry zipEntry, InputStream inputStream, ZipOutputStream zipOutputStream) throws IOException {
        int iY = Y(zipEntry);
        ZipEntry zipEntry2 = new ZipEntry(zipEntry);
        if (iY == -1) {
            byte[] bArr = (byte[]) p1().get(zipEntry2.getName());
            if (bArr != null) {
                CRC32 crc32 = new CRC32();
                crc32.update(bArr);
                zipEntry2.setCrc(crc32.getValue());
                zipEntry2.setSize(bArr.length);
                zipEntry2.setCompressedSize(zipEntry2.getMethod() == 0 ? bArr.length : -1L);
                inputStream = new ByteArrayInputStream(bArr);
            }
            V0(zipEntry2, inputStream, zipOutputStream);
            return;
        }
        G1(zipEntry2, iY);
        w wVar = this.k[iY];
        if (wVar != null) {
            wVar.f648c = U0(zipEntry2, zipOutputStream, iY);
            return;
        }
        e1.p("List: " + iY + " is null!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean L0() {
        y yVarM0;
        String str;
        synchronized (D) {
            try {
                c0 c0VarJ0 = j0();
                if (c0VarJ0.m) {
                    if (N0(c0VarJ0.l)) {
                        return true;
                    }
                    R1("preflight-manual-refused");
                    S0();
                    return false;
                }
                R1("preflight-start");
                r1(b2.f(R.string.preflight_checking_root));
                int iO0 = O0();
                if (iO0 == -1) {
                    R1("preflight-root-unavailable");
                    r1(b2.f(R.string.preflight_root_unavailable));
                    yVarM0 = M0(iO0, Build.VERSION.SDK_INT < 26 || u0(), c0VarJ0.i);
                    c0VarJ0.i = false;
                } else {
                    if (iO0 == 1) {
                        r1(b2.f(R.string.preflight_root_granted));
                    } else {
                        R1("preflight-root-unanswered");
                    }
                    yVarM0 = M0(iO0, false, false);
                }
                if (yVarM0 == y.ROOT) {
                    if (iO0 == 1) {
                        str = "preflight-root-granted";
                        R1(str);
                    }
                } else if (yVarM0 == y.MANUAL) {
                    R1("preflight-manual-start");
                    str = "preflight-manual-granted";
                    R1(str);
                } else if (yVarM0 == y.OPEN_SETTINGS) {
                    yVarM0 = P0();
                }
                int iR0 = R0(yVarM0);
                c0VarJ0.l = iR0;
                c0VarJ0.m = true;
                if (N0(iR0)) {
                    return true;
                }
                R1("preflight-manual-refused");
                S0();
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private String L1(File file, String str) throws IOException {
        q();
        M1(file, str);
        PackageManager packageManagerB0 = Tools.B0();
        PackageInfo packageArchiveInfo = packageManagerB0.getPackageArchiveInfo(file.getAbsolutePath(), 95);
        if (packageArchiveInfo == null) {
            throw J1("archive-parse");
        }
        if (!this.f598g.equals(packageArchiveInfo.packageName)) {
            throw J1("package");
        }
        if (packageArchiveInfo.versionCode != this.j || !this.i.equals(packageArchiveInfo.versionName)) {
            throw J1("version");
        }
        ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
        if (applicationInfo == null) {
            throw J1("application");
        }
        applicationInfo.sourceDir = file.getAbsolutePath();
        packageArchiveInfo.applicationInfo.publicSourceDir = file.getAbsolutePath();
        try {
            if (!this.h.contentEquals(packageArchiveInfo.applicationInfo.loadLabel(packageManagerB0))) {
                throw J1("label");
            }
            Signature[] signatureArr = packageArchiveInfo.signatures;
            if (signatureArr == null || signatureArr.length != 1) {
                throw J1("signature");
            }
            String strL = l(signatureArr[0]);
            if (!str.equals(strL)) {
                throw J1("signature-digest");
            }
            if (strL.equals(y1()) || strL.equals(J0(Tools.C0()))) {
                throw J1("signature-official");
            }
            String str2 = android.ext.i.f1000b + ".";
            if (!(this.f598g + ".Application").equals(packageArchiveInfo.applicationInfo.className)) {
                throw J1("application");
            }
            int iM = m(packageArchiveInfo.activities, this.f598g, str2) + m(packageArchiveInfo.receivers, this.f598g, str2) + m(packageArchiveInfo.services, this.f598g, str2) + m(packageArchiveInfo.providers, this.f598g, str2);
            InstrumentationInfo[] instrumentationInfoArr = packageArchiveInfo.instrumentation;
            if (instrumentationInfoArr != null) {
                if (instrumentationInfoArr.length == 1 && this.f598g.equals(instrumentationInfoArr[0].targetPackage) && this.f598g.equals(packageArchiveInfo.instrumentation[0].packageName)) {
                    if ((this.f598g + ".Instrumentation").equals(packageArchiveInfo.instrumentation[0].name)) {
                        int i2 = 0;
                        while (true) {
                            InstrumentationInfo[] instrumentationInfoArr2 = packageArchiveInfo.instrumentation;
                            if (i2 >= instrumentationInfoArr2.length) {
                                break;
                            }
                            InstrumentationInfo instrumentationInfo = instrumentationInfoArr2[i2];
                            if (!this.f598g.equals(instrumentationInfo.packageName)) {
                                throw J1("instrumentation");
                            }
                            if (!this.f598g.equals(instrumentationInfo.targetPackage)) {
                                throw J1("instrumentation");
                            }
                            iM++;
                            i2++;
                        }
                    }
                }
                throw J1("instrumentation");
            }
            if (iM == 0) {
                throw J1("component");
            }
            ProviderInfo[] providerInfoArr = packageArchiveInfo.providers;
            if (providerInfoArr == null || providerInfoArr.length != 1) {
                throw J1("provider");
            }
            ProviderInfo providerInfo = providerInfoArr[0];
            if (!(this.f598g + ".FileProvider").equals(providerInfo.name)) {
                throw J1("provider");
            }
            if (!this.f598g.equals(providerInfo.authority)) {
                throw J1("provider");
            }
            q();
            e1.d("verify: generated APK identity ok");
            return v1(file);
        } catch (Throwable th) {
            throw K1("label", th);
        }
    }

    private void M() {
        byte[] bArr = z[1];
        if (bArr == null) {
            throw new v("memCache is null 4: 1 " + A[1]);
        }
        try {
            byte[] bArrD = android.ext.s.d(android.ext.s.e(android.ext.s.e(android.ext.s.e(bArr, android.ext.i.f1000b, this.f598g, "package"), android.ext.i.f1001c, this.h, "label"), I0(), this.i, "versionName"), v0(v0(null, 4, H0()), 0, 268435464), v0(v0(null, 4, this.j), 0, 268435464), "versionCode");
            if (y != 0) {
                bArrD = android.ext.s.d(android.ext.s.d(android.ext.s.d(bArrD, v0(null, 0, R.drawable.ic_gg_48dp), v0(null, 0, y == 1 ? R.mipmap.ic_32_48dp : R.mipmap.ic_64_48dp), "icon_gg"), v0(null, 0, R.mipmap.ic_hw_48dp), v0(null, 0, y == 1 ? R.mipmap.ic_h2_48dp : R.mipmap.ic_h4_48dp), "icon_hw"), v0(null, 0, R.mipmap.ic_sw_48dp), v0(null, 0, y == 1 ? R.mipmap.ic_s2_48dp : R.mipmap.ic_s4_48dp), "icon_sw");
            }
            String[] strArr = {"Application", "Receiver", "MainActivity", "ActivityMain", "FileProvider", "AnalyticsService"};
            for (int i2 = 0; i2 < 6; i2++) {
                bArrD = android.ext.s.e(bArrD, android.ext.i.f1000b + "." + strArr[i2], this.f598g + "." + strArr[i2], "component:" + strArr[i2]);
            }
            z[1] = android.ext.s.e(bArrD, android.ext.i.f1000b + ".Instrumentation", this.f598g + ".Instrumentation", "component:Instrumentation");
        } catch (IOException e2) {
            throw new v("manifest rewrite failed: " + e2.getMessage(), e2);
        }
    }

    static y M0(int i2, boolean z2, boolean z3) {
        if (i2 != -1) {
            return y.ROOT;
        }
        int i3 = h.f623a[h(z3, z2).ordinal()];
        if (i3 != 1) {
            return i3 != 2 ? y.REFUSED : y.OPEN_SETTINGS;
        }
        return y.MANUAL;
    }

    private static void M1(File file, String str) throws IOException {
        ZipFile zipFile = new ZipFile(file);
        try {
            byte[] bArrE1 = e1(zipFile, "META-INF/CERT.RSA");
            byte[] bArrE2 = e1(zipFile, "META-INF/CERT.SF");
            byte[] bArrE3 = e1(zipFile, "META-INF/MANIFEST.MF");
            zipFile.close();
            if (bArrE1 == null || bArrE2 == null || bArrE3 == null) {
                throw J1("signature");
            }
            if (w(bArrE1) != bArrE1.length) {
                throw J1("signature");
            }
            try {
                Collection<? extends Certificate> collectionGenerateCertificates = CertificateFactory.getInstance("X.509").generateCertificates(new ByteArrayInputStream(bArrE1));
                if (collectionGenerateCertificates.size() != 1) {
                    throw J1("signature");
                }
                Certificate next = collectionGenerateCertificates.iterator().next();
                if (!str.equals(m0.i(MessageDigest.getInstance("SHA-256").digest(next.getEncoded())))) {
                    throw J1("signature");
                }
                byte[] bArrS = s(bArrE1);
                if (bArrS == null) {
                    throw J1("signature");
                }
                try {
                    java.security.Signature signature = java.security.Signature.getInstance("SHA256withRSA");
                    signature.initVerify(next.getPublicKey());
                    signature.update(bArrE2);
                    if (!signature.verify(bArrS)) {
                        throw J1("signature");
                    }
                    String strX1 = x1(bArrE2);
                    if (strX1 == null) {
                        throw J1("signature");
                    }
                    if (!strX1.equals(m0.h(MessageDigest.getInstance("SHA-256").digest(bArrE3)))) {
                        throw J1("signature");
                    }
                } catch (GeneralSecurityException e2) {
                    throw K1("signature", e2);
                }
            } catch (CertificateException e3) {
                throw K1("signature", e3);
            }
        } catch (Throwable th) {
            zipFile.close();
            throw th;
        }
    }

    private void N(b0 b0Var) throws IOException {
        short s2 = 8;
        byte[] bArr = new byte[8];
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        long jB = b0Var.b();
        b0Var.f(0L);
        int i2 = 0;
        long j2 = -1;
        short s3 = 0;
        while (b0Var.c() < jB) {
            if (b0Var.d(bArr) != s2) {
                throw new v("fixResources: truncated resource-table chunk header at " + b0Var.c());
            }
            s sVar = new s(byteBufferOrder);
            short s4 = sVar.f638b;
            if (s4 >= s2 && sVar.f639c >= s4) {
                long jC = b0Var.c();
                int i3 = sVar.f639c;
                byte[] bArr2 = bArr;
                ByteBuffer byteBuffer = byteBufferOrder;
                if (jC + ((long) (i3 - 8)) <= jB) {
                    short s5 = sVar.f637a;
                    if (s5 == 512) {
                        i2++;
                        if (i2 > 1) {
                            throw new v("fixResources: expected exactly one RES_TABLE_PACKAGE_TYPE chunk, found " + i2);
                        }
                        long jC2 = b0Var.c() - 8;
                        short s6 = sVar.f638b;
                        b0Var.g(sVar.f639c - 8);
                        j2 = jC2;
                        s3 = s6;
                    } else {
                        b0Var.g(s5 == 2 ? sVar.f638b - 8 : i3 - 8);
                    }
                    bArr = bArr2;
                    byteBufferOrder = byteBuffer;
                    s2 = 8;
                }
            }
            throw new v("fixResources: invalid resource-table chunk at " + (b0Var.c() - 8));
        }
        if (i2 != 1 || j2 < 0) {
            throw new v("fixResources: expected exactly one RES_TABLE_PACKAGE_TYPE chunk, found " + i2);
        }
        if (s3 < 268) {
            throw new v("fixResources: package chunk header too small for the name field");
        }
        long j3 = j2 + 12;
        if (this.f598g.length() >= 30) {
            throw new v("fixResources: generated package name does not fit the 30-unit field");
        }
        byte[] bArrCopyOf = Arrays.copyOf(this.f598g.getBytes(t1.i(true)), 60);
        b0Var.f(j3);
        b0Var.h(bArrCopyOf);
        int length = this.f598g.length() * 2;
        byte[] bArr3 = new byte[length];
        b0Var.f(j3);
        if (b0Var.d(bArr3) != length || !this.f598g.equals(new String(bArr3, t1.i(true)))) {
            throw new v("fixResources: package name read-back mismatch");
        }
    }

    static boolean N0(int i2) {
        return i2 == 1 || i2 == 2;
    }

    private void N1() throws IOException {
        String str = C.o + ' ' + C.n;
        File fileC = C("repack-binding.txt");
        String strTrim = null;
        if (fileC.isFile() && fileC.length() > 0 && fileC.length() <= 256) {
            int length = (int) fileC.length();
            byte[] bArr = new byte[length];
            FileInputStream fileInputStream = new FileInputStream(fileC);
            int i2 = 0;
            while (i2 < length) {
                try {
                    int i3 = fileInputStream.read(bArr, i2, length - i2);
                    if (i3 < 0) {
                        break;
                    } else {
                        i2 += i3;
                    }
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            }
            strTrim = i2 == length ? new String(bArr, "US-ASCII").trim() : null;
            fileInputStream.close();
        }
        if (!str.equals(strTrim)) {
            throw J1("binding-mismatch");
        }
    }

    private void O() {
        Map map = this.p;
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            b0 b0Var = new b0(this, (byte[]) entry.getValue(), (String) entry.getKey(), null);
            try {
                if (I(b0Var, false)) {
                    P().add((String) entry.getKey());
                }
                b0Var.a();
                e1.d("fixSecondaryDex: " + ((String) entry.getKey()));
            } catch (Throwable th) {
                b0Var.a();
                throw th;
            }
        }
    }

    private static int O0() {
        return e2.k(null);
    }

    private static void O1(Intent intent) {
        c0 c0VarJ0 = j0();
        c0VarJ0.j |= 4;
        Handler handlerD = n2.d();
        k kVar = new k();
        handlerD.postDelayed(kVar, 300000L);
        try {
            try {
                android.ext.r.n.startActivityForResult(intent, 4);
                while ((c0VarJ0.j & 4) == 4) {
                    Thread.sleep(500L);
                }
            } catch (InterruptedException e2) {
                e1.l("Interrupted preflight wait", e2);
            }
            handlerD.removeCallbacks(kVar);
        } catch (Throwable th) {
            handlerD.removeCallbacks(kVar);
            throw th;
        }
    }

    private Set P() {
        Set set = this.q;
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        this.q = hashSet;
        return hashSet;
    }

    private static y P0() {
        c0 c0VarJ0 = j0();
        R1("preflight-manual-start");
        r1(b2.f(R.string.preflight_allow_installs));
        c0VarJ0.i = true;
        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + Tools.C0()));
        c0.p = true;
        c0.q = false;
        try {
            try {
                O1(intent);
                boolean z2 = c0.q;
                c0VarJ0.i = false;
                c0.p = false;
                c0.q = false;
                if (!z2 || !u0()) {
                    return y.REFUSED;
                }
                R1("preflight-manual-granted");
                return y.MANUAL;
            } catch (RuntimeException e2) {
                Q1(4);
                c0VarJ0.i = false;
                e1.l("Fail preflight settings", e2);
                y yVar = y.REFUSED;
                c0.p = false;
                c0.q = false;
                return yVar;
            }
        } catch (Throwable th) {
            c0.p = false;
            c0.q = false;
            throw th;
        }
    }

    private void P1(Intent intent, int i2) {
        C.j |= i2;
        Handler handlerD = n2.d();
        e eVar = new e(i2);
        handlerD.postDelayed(eVar, 300000L);
        try {
            try {
                android.ext.r.n.startActivityForResult(intent, i2);
                while ((C.j & i2) == i2) {
                    Thread.sleep(500L);
                    if (i2 == 1 && Tools.e1(this.f598g)) {
                        C.j &= ~i2;
                    }
                }
            } catch (InterruptedException e2) {
                e1.l("Interrupted wait", e2);
            }
            handlerD.removeCallbacks(eVar);
            n2.i(new f());
        } catch (Throwable th) {
            handlerD.removeCallbacks(eVar);
            throw th;
        }
    }

    private static void Q(MessageDigest messageDigest, byte b2, byte[] bArr) {
        messageDigest.update(b2);
        int length = bArr.length;
        messageDigest.update((byte) (length >>> 24));
        messageDigest.update((byte) (length >>> 16));
        messageDigest.update((byte) (length >>> 8));
        messageDigest.update((byte) length);
        messageDigest.update(bArr, 0, length);
    }

    static boolean Q0(int i2) {
        return i2 == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Q1(int i2) {
        c0 c0Var = C;
        if (c0Var == null) {
            return;
        }
        c0Var.j = (~i2) & c0Var.j;
    }

    private void R(Manifest manifest, OutputStream outputStream) throws IOException {
        outputStream.write("Signature-Version: 1.0\r\n".getBytes());
        outputStream.write("Created-By: 1.0 (Android SignApk)\r\n".getBytes());
        this.n.reset();
        PrintStream printStream = new PrintStream((OutputStream) new DigestOutputStream(new x(null), this.n), true, "UTF-8");
        manifest.write(printStream);
        printStream.flush();
        outputStream.write(("SHA-256-Digest-Manifest: " + m0.h(this.n.digest()) + "\r\n\r\n").getBytes());
        for (Map.Entry<String, Attributes> entry : manifest.getEntries().entrySet()) {
            String str = "Name: " + entry.getKey() + "\r\n";
            printStream.print(str);
            for (Map.Entry<Object, Object> entry2 : entry.getValue().entrySet()) {
                printStream.print(entry2.getKey() + ": " + entry2.getValue() + "\r\n");
            }
            printStream.print("\r\n");
            printStream.flush();
            outputStream.write(str.getBytes());
            outputStream.write(("SHA-256-Digest: " + m0.h(this.n.digest()) + "\r\n\r\n").getBytes());
        }
        outputStream.flush();
    }

    static int R0(y yVar) {
        int i2 = h.f624b[yVar.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                i3 = 3;
                if (i2 != 3) {
                    return 0;
                }
            }
        }
        return i3;
    }

    static void R1(String str) {
        String str2;
        if (str != null) {
            int i2 = 0;
            while (true) {
                String[] strArr = u;
                if (i2 >= strArr.length) {
                    str2 = "Failed write install stage: unknown code";
                    break;
                } else {
                    if (strArr[i2].equals(str)) {
                        try {
                            T1("self-install.stage", str);
                            return;
                        } catch (Throwable th) {
                            e1.s("Failed write install stage", th);
                            return;
                        }
                    }
                    i2++;
                }
            }
        } else {
            str2 = "Failed write install stage: null code";
        }
        e1.p(str2);
    }

    private byte[] S() {
        byte[] bArr = this.s;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[65536];
        this.s = bArr2;
        return bArr2;
    }

    private static void S0() {
        n2.i(new m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void S1() {
        try {
            if (Tools.e1(android.ext.i.f1000b)) {
                return;
            }
            R1("installer-removed");
            f("installer-removed");
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    private File T(boolean z2) {
        ArrayList<File> arrayList = new ArrayList();
        if (z2) {
            arrayList.add(Tools.p0());
            arrayList.add(Tools.b0());
        }
        try {
            arrayList.add(android.ext.r.p.getExternalCacheDir());
        } catch (Throwable th) {
            e1.l("Fail get path", th);
        }
        try {
            for (File file : android.ext.r.p.getExternalCacheDirs()) {
                arrayList.add(file);
            }
        } catch (Throwable th2) {
            e1.l("Fail get path", th2);
        }
        try {
            arrayList.add(android.ext.r.p.getExternalFilesDir(null));
        } catch (Throwable th3) {
            e1.l("Fail get path", th3);
        }
        try {
            for (File file2 : android.ext.r.p.getExternalFilesDirs(null)) {
                arrayList.add(file2);
            }
        } catch (Throwable th4) {
            e1.l("Fail get path", th4);
        }
        try {
            arrayList.add(Environment.getExternalStorageDirectory());
        } catch (Throwable th5) {
            e1.l("Fail get path", th5);
        }
        try {
            arrayList.add(new File("/sdcard/Android/data/" + Tools.C0() + "/files"));
            arrayList.add(new File("/mnt/sdcard/Android/data/" + Tools.C0() + "/files"));
            arrayList.add(new File("/sdcard/Android/data/" + Tools.C0() + "/cache"));
            arrayList.add(new File("/mnt/sdcard/Android/data/" + Tools.C0() + "/cache"));
        } catch (Throwable th6) {
            e1.l("Fail get path", th6);
        }
        arrayList.add(new File("/sdcard"));
        arrayList.add(new File("/mnt/sdcard"));
        arrayList.add(new File("/data/local/tmp"));
        arrayList.add(Tools.b0());
        arrayList.add(Tools.p0());
        StringBuilder sb = new StringBuilder();
        sb.append("Failed getDir: ");
        for (File file3 : arrayList) {
            String strW0 = w0(file3);
            if (strW0 == null) {
                return file3;
            }
            if (file3 != null) {
                sb.append(file3.getAbsolutePath());
                sb.append(": ");
                sb.append(strW0);
                sb.append("; ");
            }
        }
        throw new RuntimeException(sb.toString());
    }

    private static void T0(String str, int i2, int i3, Intent[] intentArr) {
        n2.i(new a(i2, intentArr, i3, str));
    }

    private static void T1(String str, String str2) throws IOException {
        U1(str, str2, false);
    }

    private String U(InputStream inputStream) throws IOException {
        this.n.reset();
        DigestInputStream digestInputStream = new DigestInputStream(inputStream, this.n);
        try {
            do {
            } while (digestInputStream.read(S()) != -1);
            digestInputStream.close();
            return m0.h(this.n.digest());
        } catch (Throwable th) {
            digestInputStream.close();
            throw th;
        }
    }

    private String U0(ZipEntry zipEntry, ZipOutputStream zipOutputStream, int i2) throws IOException {
        zipOutputStream.putNextEntry(zipEntry);
        this.l.reset();
        DigestInputStream digestInputStream = new DigestInputStream(Z(i2), this.l);
        long j2 = 0;
        try {
            byte[] bArrS = S();
            while (true) {
                int i3 = digestInputStream.read(bArrS);
                if (i3 == -1) {
                    digestInputStream.close();
                    String strEncodeToString = Base64.encodeToString(this.l.digest(), 2);
                    e1.d("put " + zipEntry.getName() + ": " + strEncodeToString + "; " + j2);
                    zipOutputStream.flush();
                    zipOutputStream.closeEntry();
                    return strEncodeToString;
                }
                if (i3 != 0) {
                    zipOutputStream.write(bArrS, 0, i3);
                    j2 += (long) i3;
                }
            }
        } catch (Throwable th) {
            digestInputStream.close();
            e1.d("put " + zipEntry.getName() + ": " + Base64.encodeToString(this.l.digest(), 2) + "; " + j2);
            throw th;
        }
    }

    private static void U1(String str, String str2, boolean z2) throws IOException {
        File fileC = C(str);
        FileOutputStream fileOutputStream = new FileOutputStream(fileC, z2);
        Tools.q(fileC, 384);
        try {
            fileOutputStream.write(str2.getBytes("US-ASCII"));
            fileOutputStream.close();
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    private File V(int i2) {
        File file = new File(this.f593b, x[i2].replace('/', '@'));
        if (file.exists()) {
            Tools.q(file, 384);
        }
        return file;
    }

    private void V0(ZipEntry zipEntry, InputStream inputStream, ZipOutputStream zipOutputStream) throws IOException {
        String str;
        if (zipEntry.getMethod() != 0) {
            zipEntry.setCompressedSize(-1L);
        }
        if (y != 0) {
            String name = zipEntry.getName();
            if ("res/raw/ydw3a".equals(name)) {
                str = y == 1 ? "lib/armeabi/libAndroid.so" : "lib/arm64-v8a/libAndroid.so";
            } else {
                str = null;
            }
            if ("res/raw/ydw3x".equals(name)) {
                str = y == 1 ? "lib/x86/libAndroid.so" : "lib/x86_64/libAndroid.so";
            }
            if (str != null) {
                ZipEntry zipEntry2 = new ZipEntry(str);
                zipEntry2.setTime(zipEntry.getTime());
                zipEntry2.setMethod(zipEntry.getMethod());
                zipEntry2.setCrc(zipEntry.getCrc());
                zipEntry2.setSize(zipEntry.getSize());
                zipEntry2.setCompressedSize(zipEntry.getMethod() == 0 ? zipEntry.getSize() : -1L);
                zipEntry2.setExtra(zipEntry.getExtra());
                zipEntry2.setComment(zipEntry.getComment());
                zipEntry2.setMethod(0);
                zipEntry = zipEntry2;
            }
        }
        zipOutputStream.putNextEntry(zipEntry);
        byte[] bArrS = S();
        while (true) {
            int i2 = inputStream.read(bArrS);
            if (i2 == -1) {
                zipOutputStream.flush();
                zipOutputStream.closeEntry();
                return;
            }
            zipOutputStream.write(bArrS, 0, i2);
        }
    }

    private void V1() throws IOException {
        T1("repack-binding.txt", C.o + ' ' + C.n);
    }

    private static File W(String str) {
        File fileQ0 = Tools.q0();
        fileQ0.mkdirs();
        return new File(fileQ0, str.replace('/', '@'));
    }

    private static String W0(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('\'');
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\'') {
                sb.append("'\\''");
            } else {
                sb.append(cCharAt);
            }
        }
        sb.append('\'');
        return sb.toString();
    }

    private static void W1(String str) {
        try {
            T1("verify-generated-apk.fail", str);
        } catch (Throwable th) {
            e1.s("Failed write verify marker", th);
        }
    }

    public static String X() {
        String strO0;
        if (O == null) {
            synchronized (P) {
                try {
                    if (O == null) {
                        long j2 = -System.currentTimeMillis();
                        StringBuilder sb = new StringBuilder();
                        try {
                            ZipFile zipFile = new ZipFile(i0());
                            try {
                                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                                long size = 0;
                                long crc = 0;
                                int i2 = 0;
                                ZipEntry zipEntry = null;
                                ZipEntry zipEntry2 = null;
                                ZipEntry zipEntry3 = null;
                                while (enumerationEntries.hasMoreElements()) {
                                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                                    Enumeration<? extends ZipEntry> enumeration = enumerationEntries;
                                    boolean zContains = zipEntryNextElement.getName().contains("META-INF");
                                    int iY = Y(zipEntryNextElement);
                                    r(sb, zipEntry);
                                    if (zipEntry2 != null) {
                                        size += zipEntry2.getSize();
                                        i2++;
                                    }
                                    if (zipEntry3 != null) {
                                        crc += zipEntry3.getCrc();
                                    }
                                    if (iY == 1 || iY == 0 || iY == 2) {
                                        sb.append(iY);
                                        sb.append('-');
                                        MessageDigest messageDigest = MessageDigest.getInstance("S@H@A@-@3@8@4".replace("@", ""));
                                        long j3 = -System.currentTimeMillis();
                                        InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
                                        if (iY == 2) {
                                            strO0 = q0(inputStream, messageDigest);
                                        } else {
                                            strO0 = iY == 0 ? o0(inputStream, messageDigest, Tools.C0(), (int) zipEntryNextElement.getSize()) : p0(inputStream, messageDigest);
                                        }
                                        e1.d("HH: " + iY + " = " + (j3 + System.currentTimeMillis()));
                                        sb.append(zipEntryNextElement.getMethod());
                                        sb.append('-');
                                        sb.append(zipEntryNextElement.getTime());
                                        sb.append('-');
                                        sb.append(strO0);
                                        zipEntry = zipEntryNextElement;
                                        zipEntry3 = null;
                                    } else {
                                        zipEntry3 = !zContains ? zipEntryNextElement : null;
                                        crc = crc;
                                        zipEntry = null;
                                    }
                                    zipEntry2 = !zContains ? zipEntryNextElement : null;
                                    enumerationEntries = enumeration;
                                    size = size;
                                    crc = crc;
                                }
                                r(sb, zipEntry);
                                if (zipEntry2 != null) {
                                    size += zipEntry2.getSize();
                                    i2++;
                                }
                                if (zipEntry3 != null) {
                                    crc += zipEntry3.getCrc();
                                }
                                sb.append(size);
                                sb.append(' ');
                                sb.append(i2);
                                sb.append(' ');
                                sb.append(Long.toHexString(crc));
                                zipFile.close();
                            } catch (Throwable th) {
                                zipFile.close();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            e1.l("Failed get hashes", th2);
                            sb.append("e:");
                            sb.append(th2);
                        }
                        O = sb.toString();
                        e1.d("HH: " + (j2 + System.currentTimeMillis()));
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return O;
    }

    private static long X0(int i2, int i3) {
        return (((long) i3) & 4294967295L) | (((long) i2) << 32);
    }

    private static int Y(ZipEntry zipEntry) {
        String name = zipEntry.getName();
        int i2 = 0;
        while (true) {
            String[] strArr = x;
            if (i2 >= strArr.length) {
                return -1;
            }
            if (strArr[i2].equals(name)) {
                return i2;
            }
            i2++;
        }
    }

    private static int Y0(InputStream inputStream, byte[] bArr) {
        return Z0(inputStream, bArr, 0, bArr.length);
    }

    private InputStream Z(int i2) {
        if (!A[i2]) {
            e1.d("getInputStream: " + i2);
            return new z(h0(i2), null);
        }
        byte[][] bArr = z;
        if (bArr != null && bArr[i2] != null) {
            return new ByteArrayInputStream(z[i2]);
        }
        throw new v("memCache is null 1: " + i2 + ' ' + z);
    }

    private static int Z0(InputStream inputStream, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        while (i4 < i3) {
            int i5 = inputStream.read(bArr, i2 + i4, i3 - i4);
            if (i5 <= 0) {
                if (i4 == 0) {
                    return -1;
                }
                return i4;
            }
            i4 += i5;
        }
        return i4;
    }

    private boolean a() throws Throwable {
        o();
        if (Tools.e1(this.f598g)) {
            t1(800);
        }
        if (C.f611b < 600) {
            t1(0);
            R1("repack-start");
            F();
            t1(200);
            J();
            t1(400);
            u();
            String str = this.f596e;
            if (str == null) {
                throw J1("signature-digest");
            }
            R1("verify-start");
            t(L1(this.f595d, str), str);
            R1("verify-pass");
            t1(600);
            g();
        }
        if (C.f611b < 800) {
            t1(600);
            v();
            StringBuilder sb = new StringBuilder();
            c0 c0Var = C;
            sb.append(c0Var.k);
            sb.append(s0());
            c0Var.k = sb.toString();
            t1(800);
        }
        if (!Tools.e1(this.f598g)) {
            throw new v("package not installed: " + this.f598g + '\n' + C.k);
        }
        R1("package-installed");
        if (C.f611b < 1000) {
            t1(800);
            q1();
            try {
                o1();
            } catch (Throwable th) {
                e1.a(th);
            }
            t1(1000);
        }
        R1("old-uninstall-start");
        try {
            F1();
        } catch (Throwable th2) {
            e1.a(th2);
        }
        o();
        return true;
    }

    private Intent[] a0() {
        return b0(this.f594c);
    }

    private static byte[] a1(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    public static Intent[] b0(File file) {
        Intent[] intentArr = new Intent[4];
        boolean z2 = Build.VERSION.SDK_INT >= 24;
        boolean z3 = K;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 2) {
            boolean z4 = (i2 == 0) ^ z2;
            Uri uriFromFile = z4 ? Uri.fromFile(file) : d.c.d(Tools.f0(), android.ext.i.f1002d, file);
            Intent intent = new Intent("android.intent.action.INSTALL_PACKAGE");
            intent.setDataAndType(uriFromFile, "application/vnd.android.package-archive");
            intent.addFlags(1);
            intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
            intent.putExtra("android.intent.extra.RETURN_RESULT", true);
            int i4 = i3 + 1;
            intentArr[i3] = m0(intent, (z3 || z4) ? false : true);
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setDataAndType(uriFromFile, "application/vnd.android.package-archive");
            intent2.addFlags(1);
            int i5 = i4 + 1;
            intentArr[i4] = m0(intent2, (z3 || z4) ? false : true);
            i2++;
            i3 = i5;
        }
        K = true;
        return intentArr;
    }

    private static byte[] b1(InputStream inputStream, int i2) throws IOException {
        if (i2 <= 0) {
            return a1(inputStream);
        }
        byte[] bArr = new byte[i2];
        int iZ0 = Z0(inputStream, bArr, 0, i2);
        if (iZ0 == i2) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iZ0 < 0 ? 0 : iZ0);
        if (iZ0 > 0) {
            byteArrayOutputStream.write(bArr, 0, iZ0);
        }
        byte[] bArr2 = new byte[8192];
        while (true) {
            int i3 = inputStream.read(bArr2);
            if (i3 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr2, 0, i3);
        }
    }

    private long c0(int i2) {
        byte[] bArr;
        if (!A[i2]) {
            return h0(i2).length();
        }
        byte[][] bArr2 = z;
        if (bArr2 != null && (bArr = bArr2[i2]) != null) {
            return bArr.length;
        }
        throw new v("memCache is null 2: " + i2 + ' ' + z);
    }

    private byte[] c1(ZipEntry zipEntry, ZipInputStream zipInputStream) throws IOException {
        this.l.reset();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DigestOutputStream digestOutputStream = new DigestOutputStream(byteArrayOutputStream, this.l);
        this.m.reset();
        DigestInputStream digestInputStream = new DigestInputStream(zipInputStream, this.m);
        try {
            byte[] bArrS = S();
            while (true) {
                int i2 = digestInputStream.read(bArrS);
                if (i2 == -1) {
                    break;
                }
                digestOutputStream.write(bArrS, 0, i2);
            }
            digestOutputStream.flush();
            digestOutputStream.close();
            String strEncodeToString = Base64.encodeToString(this.l.digest(), 2);
            String strEncodeToString2 = Base64.encodeToString(this.m.digest(), 2);
            e1.d("extract " + zipEntry.getName() + ": " + strEncodeToString2 + " -> " + strEncodeToString);
            if (strEncodeToString.equals(strEncodeToString2)) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new v("check hash for " + zipEntry.getName() + ": " + strEncodeToString2 + " -> " + strEncodeToString);
        } catch (Throwable th) {
            digestOutputStream.close();
            throw th;
        }
    }

    private Manifest d0(ZipEntry zipEntry) throws IOException {
        try {
            this.l.reset();
            DigestInputStream digestInputStream = new DigestInputStream(Z(3), this.l);
            try {
                Manifest manifest = new Manifest(digestInputStream);
                digestInputStream.close();
                e1.d("Manifest: " + Base64.encodeToString(this.l.digest(), 2) + " -> " + this.k[3]);
                return manifest;
            } catch (Throwable th) {
                digestInputStream.close();
                throw th;
            }
        } catch (IOException e2) {
            throw new IOException("Failed get manifest: " + Base64.encodeToString(this.l.digest(), 2) + " -> " + this.k[3], e2);
        }
    }

    private static String d1() {
        return null;
    }

    private String e0() {
        String strF0;
        do {
            strF0 = f0(0);
        } while (Tools.e1(strF0));
        return strF0;
    }

    private static byte[] e1(ZipFile zipFile, String str) throws IOException {
        ZipEntry entry = zipFile.getEntry(str);
        if (entry == null) {
            return null;
        }
        InputStream inputStream = zipFile.getInputStream(entry);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) Math.max(0L, Math.min(entry.getSize(), 65536L)));
            byte[] bArr = new byte[65536];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(String str) {
        String str2;
        if (str != null) {
            int i2 = 0;
            while (true) {
                String[] strArr = v;
                if (i2 >= strArr.length) {
                    str2 = "Failed append readiness trace: unknown code";
                    break;
                }
                if (strArr[i2].equals(str)) {
                    try {
                        U1("self-install.readiness", str + "\n", true);
                        return;
                    } catch (Throwable th) {
                        e1.s("Failed append readiness trace", th);
                        return;
                    }
                }
                i2++;
            }
        } else {
            str2 = "Failed append readiness trace: null code";
        }
        e1.p(str2);
    }

    private static String f0(int i2) {
        char[] cArr = i2 == 2 ? new char[]{'.', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'} : new char[]{'.', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        StringBuilder sb = new StringBuilder();
        if (i2 == 0) {
            sb.append("com.");
        }
        Random random = Tools.f489a;
        String str = "" + ((1 * 116.6f) - 15.2f);
        int length = (i2 == 1 ? android.ext.i.f1001c : i2 == 0 ? android.ext.i.f1000b : str).length() - sb.length();
        if (i2 != 2) {
            if (i2 != 0) {
                length++;
            }
            length = random.nextInt(length - 3) + 3;
        }
        boolean z2 = true;
        for (int i3 = 0; i3 < length; i3++) {
            if (i2 == 2 && str.charAt(i3) == '.') {
                sb.append('.');
            } else {
                int i4 = (i2 == 2 || z2) ? 1 : 0;
                int length2 = cArr.length;
                if (i3 == 0 && i2 != 1) {
                    i4 = 2;
                }
                if (i3 == length - 1 && i4 == 0) {
                    i4 = 1;
                }
                int iNextInt = i4 + random.nextInt(length2 - i4);
                char upperCase = cArr[iNextInt];
                if (i2 == 1) {
                    if (iNextInt == 0) {
                        upperCase = ' ';
                    } else if (z2) {
                        upperCase = Character.toUpperCase(upperCase);
                    }
                }
                sb.append(upperCase);
                z2 = iNextInt == 0;
            }
        }
        return sb.toString();
    }

    private static void f1(Attributes attributes, String str) {
        h1(attributes);
        attributes.putValue("SHA-256-Digest", str);
    }

    private void g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.ext.b1$i] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v5 */
    private OutputStream g0(int i2) {
        int i3;
        boolean z2 = A[i2];
        ?? a0Var = 0;
        a0Var = 0;
        if (!z2) {
            try {
                e1.d("getOutputStream: " + i2);
                a0Var = new a0(h0(i2), a0Var);
            } catch (Throwable th) {
                e1.a(th);
            }
            if (a0Var == 0) {
                e1.d("Use mem cache for " + i2);
                A[i2] = true;
                z2 = true;
            }
        }
        if (!z2) {
            return a0Var;
        }
        if (i2 == 1) {
            i3 = 9000;
        } else if (i2 == 3 || i2 == 4) {
            i3 = 75000;
        } else {
            i3 = i2 == 5 ? 2000 : 8192;
        }
        return new g(i3, i2);
    }

    private static Runnable g1(Runnable runnable) {
        return new i(runnable);
    }

    static r h(boolean z2, boolean z3) {
        if (z2) {
            return z3 ? r.PROCEED : r.FAIL_PENDING;
        }
        return z3 ? r.PROCEED : r.OPEN_SETTINGS;
    }

    private static void h1(Attributes attributes) {
        String string;
        int length;
        Iterator<Object> it = attributes.keySet().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next instanceof Attributes.Name) && (length = (string = ((Attributes.Name) next).toString()).length()) > 7 && string.regionMatches(true, length - 7, "-Digest", 0, 7)) {
                it.remove();
            }
        }
    }

    private void i() {
        File file;
        if (C.f611b < 600 || C.f612c == null) {
            File fileT = T(false);
            fileT.mkdirs();
            C.f612c = new File(fileT, D0()).getAbsolutePath();
            C.f613d = null;
            C.f614e = null;
            C.f615f = null;
            C.f616g = 0;
            C.n = null;
            C.o = null;
            file = new File(C.f612c);
        } else {
            file = new File(C.f612c);
        }
        this.f594c = file;
        this.f595d = K0(file);
    }

    private static File i0() {
        File file = (File) N.get();
        if (file != null) {
            return file;
        }
        File file2 = new File(Tools.W());
        N = new WeakReference(file2);
        return file2;
    }

    public static void i1(Runnable runnable) {
        Intent intent = android.ext.r.n.getIntent();
        boolean z2 = false;
        if (intent != null) {
            if (intent.getBooleanExtra(android.ext.i.f1000b + ".fromInstaller", false)) {
                z2 = true;
            }
        }
        e1.d("removeInstaller: " + z2 + " + " + android.ext.r.m);
        if (!android.ext.r.m && !z2) {
            g1(runnable).run();
            return;
        }
        android.ext.r.m = true;
        e1.d(runnable + ": 30");
        x2.s(android.ext.i.f1000b, g1(runnable));
        e1.d(runnable + ": 40");
    }

    private void j(FileOutputStream fileOutputStream) throws Throwable {
        int i2;
        String[] strArrSplit = Tools.removeNewLinesChars("uhv2udz2Cdvvhwv2").split("@");
        String strRemoveNewLinesChars = Tools.removeNewLinesChars("uhv2udz2|gz");
        ZipFile zipFile = new ZipFile(i0());
        try {
            android.ext.g gVar = new android.ext.g(fileOutputStream);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (true) {
                    i2 = 0;
                    if (!enumerationEntries.hasMoreElements()) {
                        break;
                    }
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    String name = zipEntryNextElement.getName();
                    int length = strArrSplit.length;
                    while (true) {
                        if (i2 >= length) {
                            InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
                            try {
                                L(zipEntryNextElement, inputStream, gVar);
                                inputStream.close();
                                break;
                            } catch (Throwable th) {
                                inputStream.close();
                                throw th;
                            }
                        }
                        if (name.startsWith(strArrSplit[i2]) && !name.startsWith(strRemoveNewLinesChars)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                gVar.close();
                zipFile.close();
                h3.a(this.f595d);
                h3.f(this.f595d);
                while (i2 < this.k.length) {
                    e1.d("copy " + i2 + ' ' + this.k[i2]);
                    i2++;
                }
            } catch (Throwable th2) {
                gVar.close();
                throw th2;
            }
        } catch (Throwable th3) {
            zipFile.close();
            throw th3;
        }
    }

    static c0 j0() {
        if (C == null) {
            c0 c0Var = new c0();
            c0Var.f610a = B0();
            C = c0Var;
        }
        return C;
    }

    private static boolean j1(String str) {
        return str != null && str.endsWith(Tools.removeNewLinesChars("h{lw#frgh=#3"));
    }

    static void k(boolean z2) {
        o();
        try {
            W("installer.fail").createNewFile();
        } catch (IOException e2) {
            e1.l("Failed set install flag", e2);
        }
        if (z2) {
            n2.i(new q());
        }
    }

    public static Intent[] k0(String str) {
        Intent intent = new Intent("android.intent.action.UNINSTALL_PACKAGE");
        intent.setData(Uri.fromParts("package", str, null));
        intent.putExtra("android.intent.extra.RETURN_RESULT", true);
        intent.putExtra("android.intent.extra.UNINSTALL_ALL_USERS", true);
        Intent intent2 = new Intent("android.intent.action.DELETE");
        intent2.setData(Uri.fromParts("package", str, null));
        return new Intent[]{intent, intent2};
    }

    private static String k1(String str) {
        return Tools.removeNewLinesChars("h{hf#sp#lqvwdoo#0i#") + str;
    }

    private static String l(Signature signature) {
        return m0.i(MessageDigest.getInstance("SHA-256").digest(signature.toByteArray()));
    }

    private static ZipInputStream l0() {
        return new ZipInputStream(new BufferedInputStream(new FileInputStream(i0()), 65536));
    }

    private static String l1(String str, String str2) {
        String str3 = str2 + Tools.removeNewLinesChars("2edvh1dsn");
        StringBuilder sb = new StringBuilder(256);
        sb.append(Tools.removeNewLinesChars("fs#"));
        sb.append(W0(str));
        sb.append(Tools.removeNewLinesChars("#"));
        sb.append(W0(str3));
        sb.append(Tools.removeNewLinesChars("#))#fkprg#3977#"));
        sb.append(W0(str3));
        sb.append(Tools.removeNewLinesChars("#))#sp#lqvwdoo#0i#"));
        sb.append(W0(str3));
        sb.append(Tools.removeNewLinesChars(">#uf@'B>#up#0i#"));
        sb.append(W0(str3));
        sb.append(Tools.removeNewLinesChars(">#upglu#"));
        sb.append(W0(str2));
        sb.append(Tools.removeNewLinesChars(">#h{lw#'uf"));
        return sb.toString();
    }

    private static int m(ComponentInfo[] componentInfoArr, String str, String str2) {
        if (componentInfoArr == null) {
            return 0;
        }
        for (int i2 = 0; i2 < componentInfoArr.length; i2++) {
            if (!str.equals(componentInfoArr[i2].packageName)) {
                throw J1("component");
            }
            String str3 = componentInfoArr[i2].name;
            if (str3 != null) {
                if (str3.startsWith(str + ".")) {
                    if (str3.startsWith(str2)) {
                        throw J1("component");
                    }
                }
            }
            throw J1("component");
        }
        return componentInfoArr.length;
    }

    private static Intent m0(Intent intent, boolean z2) {
        if (z2) {
            Context contextF0 = Tools.f0();
            try {
                for (ResolveInfo resolveInfo : Tools.B0().queryIntentActivities(intent, 65536)) {
                    try {
                        contextF0.grantUriPermission(resolveInfo.activityInfo.packageName, intent.getData(), 1);
                    } catch (Throwable th) {
                        e1.s("Failed grant 0 " + intent + "; " + resolveInfo, th);
                    }
                }
            } catch (Throwable th2) {
                e1.s("Failed grant 1 " + intent, th2);
            }
            try {
                contextF0.grantUriPermission("com.android.packageinstaller", intent.getData(), 1);
            } catch (Throwable th3) {
                e1.s("Failed grant 2 " + intent, th3);
            }
        }
        return intent;
    }

    private static String m1(String str) {
        return Tools.removeNewLinesChars("h{hf#up#0ui#") + W0(str);
    }

    private void n(ZipEntry zipEntry, int i2, String str, String str2) throws IOException {
        this.l.reset();
        DigestInputStream digestInputStream = new DigestInputStream(Z(i2), this.l);
        try {
            do {
            } while (digestInputStream.read(S()) != -1);
            digestInputStream.close();
            String strEncodeToString = Base64.encodeToString(this.l.digest(), 2);
            e1.d("check hash for " + zipEntry.getName() + " [" + i2 + "]: " + strEncodeToString + " : " + str2 + " -> " + str);
            if (str.equals(strEncodeToString)) {
                return;
            }
            throw new v("check hash for " + zipEntry.getName() + " [" + i2 + "]: " + strEncodeToString + " != " + str2 + " -> " + str);
        } catch (Throwable th) {
            digestInputStream.close();
            e1.d("check hash for " + zipEntry.getName() + " [" + i2 + "]: " + Base64.encodeToString(this.l.digest(), 2) + " : " + str2 + " -> " + str);
            throw th;
        }
    }

    private static int n0(InputStream inputStream, MessageDigest messageDigest, byte[] bArr, int i2) throws IOException {
        int i3 = i2;
        while (i3 > 0) {
            int i4 = inputStream.read(bArr, 0, i3 > bArr.length ? bArr.length : i3);
            if (i4 <= 0) {
                break;
            }
            i3 -= i4;
            messageDigest.update(bArr, 0, i4);
        }
        return i2;
    }

    private static String n1(String str) {
        return Tools.removeNewLinesChars("xpdvn#3::>#h{hf#pnglu#") + W0(str);
    }

    private static void o() {
        try {
            C("self-install.stage").delete();
        } catch (Throwable th) {
            e1.s("Failed clear install stage", th);
        }
        p();
    }

    public static final String o0(InputStream inputStream, MessageDigest messageDigest, String str, int i2) {
        try {
            byte[] bArrB1 = b1(inputStream, i2);
            if (bArrB1.length < 112) {
                throw new v("hashDex: truncated DEX header");
            }
            if ((bArrB1[0] & 255) == 100 && (bArrB1[1] & 255) == 101 && (bArrB1[2] & 255) == 120 && (bArrB1[3] & 255) == 10) {
                byte b2 = bArrB1[4];
                if ((b2 & 255) >= 48 && (b2 & 255) <= 57) {
                    byte b3 = bArrB1[5];
                    if ((b3 & 255) >= 48 && (b3 & 255) <= 57) {
                        byte b4 = bArrB1[6];
                        if ((b4 & 255) >= 48 && (b4 & 255) <= 57 && (bArrB1[7] & 255) == 0) {
                            if (str == null || str.length() == 0) {
                                throw new v("hashDex: missing package identity");
                            }
                            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArrB1).order(ByteOrder.LITTLE_ENDIAN);
                            if (byteBufferOrder.getInt(36) != 112) {
                                throw new v("hashDex: invalid DEX header size");
                            }
                            if (byteBufferOrder.getInt(40) != 305419896) {
                                throw new v("hashDex: invalid DEX endian tag");
                            }
                            if (B(byteBufferOrder, 32) != bArrB1.length) {
                                throw new v("hashDex: file size out of bounds");
                            }
                            int length = bArrB1.length;
                            long jB = B(byteBufferOrder, 104);
                            long jB2 = B(byteBufferOrder, 108);
                            if ((jB == 0 && jB2 != 0) || (jB != 0 && (jB2 < 112 || jB + jB2 != length))) {
                                throw new v("hashDex: data section out of bounds");
                            }
                            int i3 = (int) jB2;
                            long jB3 = B(byteBufferOrder, 56);
                            long jB4 = B(byteBufferOrder, 60);
                            if (jB3 < 1 || jB3 > 2147483647L || jB4 < 112 || (4 * jB3) + jB4 > length) {
                                throw new v("hashDex: string table out of bounds");
                            }
                            int i4 = (int) jB3;
                            int i5 = (int) jB4;
                            long jB5 = B(byteBufferOrder, 52);
                            if (jB5 > 2147483647L) {
                                throw new v("hashDex: map list out of bounds");
                            }
                            int[] iArrA = A(byteBufferOrder, (int) jB5, length, i4, i5, i3);
                            int i6 = iArrA[0];
                            int i7 = iArrA[1];
                            int[] iArr = new int[i4];
                            int i8 = 0;
                            while (i8 < i4) {
                                long jB6 = B(byteBufferOrder, (i8 * 4) + i5);
                                ByteBuffer byteBuffer = byteBufferOrder;
                                if (jB6 < i6 || jB6 >= i7) {
                                    throw new v("hashDex: string data out of bounds");
                                }
                                int i9 = (int) jB6;
                                iArr[i8] = i9;
                                z(bArrB1, i9, i7);
                                i8++;
                                byteBufferOrder = byteBuffer;
                            }
                            int[] iArr2 = (int[]) iArr.clone();
                            Arrays.sort(iArr2);
                            if (iArr2[0] != i6) {
                                throw new v("hashDex: string data section has a gap");
                            }
                            int i10 = 0;
                            while (i10 < iArr2.length) {
                                int iZ = z(bArrB1, iArr2[i10], i7);
                                i10++;
                                if (i10 < iArr2.length && iZ != iArr2[i10]) {
                                    throw new v("hashDex: string data items are not contiguous");
                                }
                                if (i10 == iArr2.length) {
                                    while (iZ < i7) {
                                        if (bArrB1[iZ] != 0) {
                                            throw new v("hashDex: non-zero string data padding");
                                        }
                                        iZ++;
                                    }
                                }
                            }
                            long[] jArr = {X0(8, 32), X0(i5, (i4 * 4) + i5), X0(i6, i7)};
                            Arrays.sort(jArr);
                            int i11 = 0;
                            int i12 = 0;
                            while (i11 < 3) {
                                long j2 = jArr[i11];
                                long[] jArr2 = jArr;
                                int i13 = (int) (j2 >> 32);
                                int i14 = (int) j2;
                                if (i13 > i12) {
                                    messageDigest.update(bArrB1, i12, i13 - i12);
                                }
                                if (i14 > i12) {
                                    i12 = i14;
                                }
                                i11++;
                                jArr = jArr2;
                            }
                            if (i12 < length) {
                                messageDigest.update(bArrB1, i12, length - i12);
                            }
                            String strReplace = str.replace('.', '/');
                            for (int i15 = 0; i15 < i4; i15++) {
                                String strY = y(bArrB1, iArr[i15], i7);
                                int length2 = 0;
                                while (true) {
                                    int iIndexOf = strY.indexOf(strReplace, length2);
                                    Q(messageDigest, (byte) 0, strY.substring(length2, iIndexOf < 0 ? strY.length() : iIndexOf).getBytes(t1.i(false)));
                                    if (iIndexOf < 0) {
                                        break;
                                    }
                                    Q(messageDigest, (byte) 1, M);
                                    length2 = strReplace.length() + iIndexOf;
                                }
                            }
                            return w0.b(messageDigest);
                        }
                    }
                }
            }
            throw new v("hashDex: invalid DEX magic");
        } catch (Throwable th) {
            e1.l("hash fail", th);
            return th.toString();
        }
    }

    private void o1() {
        Intent intentN0 = Tools.N0(android.ext.r.p, this.f598g, android.ext.r.t().replace(Tools.C0(), this.f598g));
        if (!x2.h()) {
            e1.d("removeInstaller: just installer");
            intentN0.putExtra(android.ext.i.f1000b + ".fromInstaller", true);
        }
        android.ext.r.p.startActivity(intentN0);
    }

    private static void p() {
        try {
            C("self-install.readiness").delete();
        } catch (Throwable th) {
            e1.s("Failed clear readiness trace", th);
        }
    }

    public static final String p0(InputStream inputStream, MessageDigest messageDigest) {
        int i2;
        String str;
        int length;
        String str2;
        try {
            byte[] bArr = new byte[16384];
            int iY0 = Y0(inputStream, bArr);
            try {
                PackageInfo packageInfoZ0 = Tools.z0(Tools.C0());
                i2 = packageInfoZ0.versionCode;
                str = packageInfoZ0.versionName;
            } catch (Throwable th) {
                e1.a(th);
                float f2 = 1;
                i2 = (int) (((18113.3f * f2) - 1958.3f) + 0.5f);
                str = "" + ((f2 * 102.5f) - 1.1f);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("\u0000");
            String str3 = android.ext.i.f1002d;
            sb.append((char) str3.length());
            sb.append(str3);
            sb.append((char) 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\u0000");
            String str4 = android.ext.i.f1003e;
            sb2.append((char) str4.length());
            sb2.append(str4);
            sb2.append((char) 0);
            byte[][] bArr2 = {sb.toString().getBytes(t1.i(true)), sb2.toString().getBytes(t1.i(true)), ("\u0000" + ((char) str.length()) + str + (char) 0).getBytes(t1.i(true)), v0(null, 0, R.drawable.ic_gg_48dp), v0(null, 0, R.mipmap.ic_32_48dp), v0(null, 0, R.mipmap.ic_64_48dp), v0(null, 0, R.mipmap.ic_hw_48dp), v0(null, 0, R.mipmap.ic_h2_48dp), v0(null, 0, R.mipmap.ic_h4_48dp), v0(null, 0, R.mipmap.ic_sw_48dp), v0(null, 0, R.mipmap.ic_s2_48dp), v0(null, 0, R.mipmap.ic_s4_48dp), v0(v0(null, 4, i2), 0, 268435464)};
            for (int i3 = 0; i3 < 13; i3++) {
                byte[] bArr3 = bArr2[i3];
                int iV0 = Tools.V0(bArr, bArr3);
                if (iV0 >= 0) {
                    if (i3 == 0) {
                        str2 = android.ext.i.f1000b;
                    } else {
                        if (i3 == 1) {
                            str2 = android.ext.i.f1001c;
                        } else {
                            length = bArr3.length;
                        }
                        System.arraycopy(new byte[length], 0, bArr, iV0, length);
                    }
                    length = (str2.length() + 4) * 2;
                    System.arraycopy(new byte[length], 0, bArr, iV0, length);
                }
            }
            int i4 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getInt(16) * 4;
            System.arraycopy(new byte[i4], 0, bArr, 36, i4);
            messageDigest.update(bArr, 0, iY0);
            return w0.b(messageDigest);
        } catch (Throwable th2) {
            e1.l("hash fail", th2);
            return th2.toString();
        }
    }

    private Map p1() {
        Map map = this.p;
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        this.p = map2;
        return map2;
    }

    private static void q() {
        try {
            C("verify-generated-apk.fail").delete();
        } catch (Throwable th) {
            e1.s("Failed clear verify marker", th);
        }
    }

    public static final String q0(InputStream inputStream, MessageDigest messageDigest) {
        int i2;
        try {
            byte[] bArr = new byte[8192];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            while (Z0(inputStream, bArr, 0, 8) != -1) {
                messageDigest.update(bArr, 0, 8);
                s sVar = new s(byteBufferOrder);
                short s2 = sVar.f637a;
                if (s2 == 512) {
                    byte[] bArr2 = new byte[260];
                    Z0(inputStream, bArr2, 0, 4);
                    messageDigest.update(bArr2);
                    Z0(inputStream, bArr2, 4, 256);
                    i2 = sVar.f639c - 268;
                } else {
                    i2 = (s2 == 2 ? sVar.f638b : sVar.f639c) - 8;
                }
                n0(inputStream, messageDigest, bArr, i2);
            }
            return w0.b(messageDigest);
        } catch (Throwable th) {
            e1.l("hash fail", th);
            return th.toString();
        }
    }

    private void q1() {
        try {
            Tools.B0().setInstallerPackageName(this.f598g, null);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    private static void r(StringBuilder sb, ZipEntry zipEntry) {
        if (zipEntry == null) {
            return;
        }
        sb.append('-');
        sb.append(zipEntry.getSize());
        sb.append(' ');
    }

    private static void r0() {
        Button button = (Button) E.get();
        if (button != null) {
            button.setOnClickListener(new c());
        }
        ProgressBar progressBar = (ProgressBar) G.get();
        if (progressBar != null) {
            progressBar.setIndeterminate(false);
        }
        F.run();
    }

    private static void r1(String str) {
        n2.i(new l(str));
    }

    private static byte[] s(byte[] bArr) {
        t tVar;
        int[] iArrC;
        int[] iArrC2;
        t tVarB;
        int[] iArrC3;
        int[] iArrC4;
        t tVarB2;
        int[] iArrC5;
        int[] iArrC6;
        if (bArr != null && (iArrC = (tVar = new t(bArr)).c(48)) != null && tVar.a()) {
            t tVarB3 = tVar.b(iArrC);
            if (tVarB3.c(6) != null && (iArrC2 = tVarB3.c(160)) != null && tVarB3.a() && (iArrC3 = (tVarB = tVarB3.b(iArrC2)).c(48)) != null && tVarB.a()) {
                t tVarB4 = tVarB.b(iArrC3);
                if (tVarB4.c(2) != null && tVarB4.c(49) != null && tVarB4.c(48) != null && tVarB4.c(160) != null && (iArrC4 = tVarB4.c(49)) != null && tVarB4.a() && (iArrC5 = (tVarB2 = tVarB4.b(iArrC4)).c(48)) != null && tVarB2.a()) {
                    t tVarB5 = tVarB2.b(iArrC5);
                    if (tVarB5.c(2) != null && tVarB5.c(48) != null && tVarB5.c(48) != null && tVarB5.c(48) != null && (iArrC6 = tVarB5.c(4)) != null && tVarB5.a()) {
                        return tVarB5.d(iArrC6);
                    }
                }
            }
        }
        return null;
    }

    private String s0() throws IOException {
        boolean z2;
        String str;
        boolean zJ1;
        I1();
        String absolutePath = this.f594c.getAbsolutePath();
        String[] strArr = absolutePath.contains("/emulated/0") ? new String[]{absolutePath.replace("/emulated/0", "/emulated/legacy"), absolutePath} : new String[]{absolutePath};
        for (String str2 : strArr) {
            try {
                Tools.q(new File(str2), 493);
            } catch (Throwable th) {
                e1.s("Failed allow execute 1: " + str2, th);
            }
            try {
                Tools.r(str2, "0755");
            } catch (Throwable th2) {
                e1.s("Failed allow execute 2: " + str2, th2);
            }
        }
        boolean zQ0 = Q0(C.l);
        int length = strArr.length;
        String str3 = "Install:";
        boolean z3 = true;
        int i2 = 0;
        while (i2 < length) {
            String str4 = strArr[i2];
            if (!zQ0) {
                break;
            }
            if (z3) {
                R1("root-install-start");
                z2 = false;
            } else {
                z2 = z3;
            }
            try {
                if (Build.VERSION.SDK_INT < 24) {
                    I1();
                    str = str3 + '\n' + e2.n(k1(str4), 45);
                } else {
                    String strC0 = C0();
                    try {
                        String strN = e2.n(n1(strC0), 45);
                        str3 = str3 + '\n' + strN;
                        zJ1 = j1(strN);
                        if (zJ1) {
                            try {
                                I1();
                                str3 = str3 + '\n' + e2.n(l1(str4, strC0), 45);
                            } catch (Throwable th3) {
                                th = th3;
                                if (zJ1) {
                                    String strN2 = e2.n(m1(strC0), 45);
                                    if (!j1(strN2)) {
                                        e1.p("root stage cleanup: " + strN2);
                                    }
                                }
                                throw th;
                            }
                        }
                        if (zJ1) {
                            String strN3 = e2.n(m1(strC0), 45);
                            if (!j1(strN3)) {
                                e1.p("root stage cleanup: " + strN3);
                            }
                        }
                        str = str3;
                    } catch (Throwable th4) {
                        th = th4;
                        zJ1 = false;
                    }
                }
            } catch (Throwable th5) {
                e1.l("run cmd fail", th5);
                str = str3 + '\n' + th5.getMessage();
            }
            str3 = str;
            R1("root-install-return");
            if (Tools.e1(this.f598g)) {
                R1("package-installed");
                break;
            }
            i2++;
            z3 = z2;
        }
        if (!Tools.e1(this.f598g)) {
            if (Build.VERSION.SDK_INT >= 26) {
                C.h = false;
                Q1(4);
                r rVarH = h(C.i || C.l == 2, u0());
                C.i = false;
                if (rVarH == r.OPEN_SETTINGS) {
                    R1("unknown-source-settings-start");
                    C.i = true;
                    Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + Tools.C0()));
                    c0.p = true;
                    c0.q = false;
                    try {
                        try {
                            P1(intent, 4);
                            boolean z4 = c0.q;
                            C.i = false;
                            c0.p = false;
                            c0.q = false;
                            if (!z4 || !u0()) {
                                R1("unknown-source-settings-failed");
                                throw new v("unknown-source install permission was not granted");
                            }
                        } catch (Throwable th6) {
                            c0.p = false;
                            c0.q = false;
                            throw th6;
                        }
                    } catch (ActivityNotFoundException e2) {
                        Q1(4);
                        C.i = false;
                        R1("unknown-source-settings-failed");
                        throw new v("unknown-source settings are unavailable", e2);
                    } catch (RuntimeException e3) {
                        Q1(4);
                        C.i = false;
                        R1("unknown-source-settings-failed");
                        throw e3;
                    }
                } else if (rVarH == r.FAIL_PENDING) {
                    R1("unknown-source-settings-failed");
                    throw new v("unknown-source install permission was not granted");
                }
            }
            R1("manual-install-start");
            int i3 = 1;
            C.h = true;
            Intent[] intentArrA0 = a0();
            L = 0;
            for (Intent intent2 : intentArrA0) {
                L += i3;
                str3 = str3 + "\nManual: " + intent2;
                try {
                    I1();
                    i3 = 1;
                    try {
                        P1(intent2, 1);
                        break;
                    } catch (Throwable th7) {
                        th = th7;
                        str3 = str3 + '\n' + th.getMessage();
                    }
                } catch (Throwable th8) {
                    th = th8;
                    i3 = 1;
                }
            }
        }
        if (Tools.e1(this.f598g)) {
            R1("package-installed");
            C.i = false;
        }
        return str3;
    }

    static void s1(c0 c0Var) {
        C = c0Var;
    }

    private void t(String str, String str2) throws IOException {
        try {
            Os.rename(this.f595d.getAbsolutePath(), this.f594c.getAbsolutePath());
            if (this.f595d.exists() || !this.f594c.isFile()) {
                throw new v("commit rename incomplete");
            }
            C.n = str;
            C.o = str2;
            V1();
        } catch (ErrnoException e2) {
            throw new IOException("commit rename failed: " + e2.getMessage(), e2);
        }
    }

    static void t0() {
        z = new byte[x.length][];
        try {
            b1 b1Var = new b1();
            B = b1Var;
            b1Var.a();
            n2.i(new n());
        } catch (Throwable th) {
            e1.l("Failed install", th);
            String message = th.getMessage();
            if (message != null && (message.contains("ENOSPC") || message.contains("o space left"))) {
                n2.i(new o(message));
                return;
            }
            if (!(th instanceof v)) {
                n0.h(Thread.currentThread(), th, false);
            }
            k(false);
            n2.i(new p(th));
        }
    }

    private static void t1(int i2) {
        if (C.f611b != i2) {
            J = 0;
        }
        C.f611b = i2;
    }

    private void u() throws Throwable {
        FileOutputStream fileOutputStream = null;
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                if (this.f595d.exists()) {
                    this.f595d.delete();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(this.f595d);
                try {
                    Tools.q(this.f595d, 384);
                    fileOutputStream = fileOutputStream2;
                    break;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (i2 == 1) {
                        throw th;
                    }
                    e1.a(th);
                    File file = new File(this.f593b, this.f594c.getName());
                    C.f612c = file.getAbsolutePath();
                    this.f594c = file;
                    this.f595d = K0(file);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        try {
            j(fileOutputStream);
        } catch (IOException e2) {
            D(fileOutputStream);
            throw e2;
        } catch (Error e3) {
            D(fileOutputStream);
            throw e3;
        } catch (RuntimeException e4) {
            D(fileOutputStream);
            throw e4;
        }
    }

    static boolean u0() {
        try {
            String strPermissionToOp = AppOpsManager.permissionToOp("android.permission.REQUEST_INSTALL_PACKAGES");
            return strPermissionToOp != null && ((AppOpsManager) Tools.f0().getSystemService("appops")).checkOpNoThrow(strPermissionToOp, Process.myUid(), Tools.C0()) == 0;
        } catch (Throwable th) {
            e1.g("installPermissionGranted failed", th);
            return false;
        }
    }

    private static void u1() {
        try {
            File fileW = W(Tools.removeNewLinesChars("yhuvlrq1jj"));
            StringBuilder sb = new StringBuilder();
            float f2 = 1;
            sb.append(Integer.toString((int) (((16452.9f * f2) - 297.9f) + 0.5f)));
            sb.append(':');
            sb.append((f2 * 107.3f) - 5.9f);
            byte[] bytes = sb.toString().getBytes();
            if (fileW.exists()) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(fileW);
                    try {
                        int length = bytes.length;
                        byte[] bArr = new byte[length];
                        if (fileInputStream.read(bArr) != length || !Arrays.equals(bArr, bytes)) {
                            W("installer.fail").delete();
                            File fileQ0 = Tools.q0();
                            String[] list = fileQ0.list();
                            if (list != null) {
                                for (String str : list) {
                                    if ((str.startsWith("lib") && str.endsWith(".so")) || "gr".equals(str)) {
                                        new File(fileQ0, str).delete();
                                    }
                                }
                            }
                        }
                        fileInputStream.close();
                    } catch (Throwable th) {
                        fileInputStream.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    e1.l("Fail get version", th2);
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(fileW);
            Tools.q(fileW, 384);
            try {
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            } catch (Throwable th3) {
                fileOutputStream.close();
                throw th3;
            }
        } catch (Throwable th4) {
            e1.l("Fail set version", th4);
        }
    }

    private void v() {
        for (int i2 = 0; i2 < this.k.length; i2++) {
            V(i2).delete();
            RandomAccessFile randomAccessFile = this.f592a[i2];
            if (randomAccessFile != null) {
                try {
                    e1.d("Close: " + i2);
                    randomAccessFile.close();
                } catch (Throwable th) {
                    e1.a(th);
                }
            }
        }
        this.p = null;
        this.q = null;
    }

    private static byte[] v0(byte[] bArr, int i2, int i3) {
        if (bArr == null) {
            bArr = new byte[i2 + 4];
        }
        for (int i4 = 0; i4 < 4; i4++) {
            bArr[i2 + i4] = (byte) ((i3 >> (i4 * 8)) & 255);
        }
        return bArr;
    }

    private static String v1(File file) throws NoSuchAlgorithmException, IOException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[65536];
            while (true) {
                int i2 = fileInputStream.read(bArr);
                if (i2 == -1) {
                    fileInputStream.close();
                    return m0.i(messageDigest.digest());
                }
                messageDigest.update(bArr, 0, i2);
            }
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    private static int w(byte[] bArr) {
        if (bArr != null) {
            int i2 = 2;
            if (bArr.length >= 2) {
                int i3 = 0;
                if (bArr[0] != 48) {
                    return -1;
                }
                byte b2 = bArr[1];
                int i4 = b2 & 255;
                if ((b2 & 128) != 0) {
                    int i5 = b2 & 127;
                    if (i5 == 0 || i5 > 4 || 2 + i5 > bArr.length) {
                        return -1;
                    }
                    int i6 = 0;
                    while (i3 < i5) {
                        i6 = (i6 << 8) | (bArr[i2] & 255);
                        i3++;
                        i2++;
                    }
                    i4 = i6;
                }
                return i2 + i4;
            }
        }
        return -1;
    }

    private String w0(File file) {
        if (file == null) {
            e1.d("path: " + file + " - null");
            return "is null";
        }
        file.mkdirs();
        File file2 = new File(file, "installer.dir.probe");
        try {
            try {
                file2.delete();
                byte[] bytes = "We need test read/write to this file".getBytes();
                byte[] bArr = new byte[bytes.length];
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                Tools.q(file2, 384);
                fileOutputStream.write(bytes);
                fileOutputStream.close();
                FileInputStream fileInputStream = new FileInputStream(file2);
                int i2 = fileInputStream.read(bArr);
                fileInputStream.close();
                if (i2 != bytes.length) {
                    String str = "Length mismatch: " + i2 + " != " + bytes.length;
                    file2.delete();
                    return str;
                }
                if (Arrays.equals(bArr, bytes)) {
                    e1.d("path: " + file + " - success");
                    file2.delete();
                    return null;
                }
                String str2 = "Data mismatch: '" + new String(bArr) + "' != '" + new String(bytes) + '\'';
                file2.delete();
                return str2;
            } catch (IOException e2) {
                e1.d("path: " + file + " - fail: " + e2.getMessage());
                String message = e2.getMessage();
                file2.delete();
                return message;
            }
        } catch (Throwable th) {
            file2.delete();
            throw th;
        }
    }

    private String w1(String str) {
        byte[] bArr = (byte[]) p1().get(str);
        if (bArr != null) {
            this.n.reset();
            this.n.update(bArr);
            return m0.h(this.n.digest());
        }
        throw new v("missing secondary dex bytes: " + str);
    }

    private static u x(byte[] bArr, int i2, int i3, int i4) {
        int i5;
        String str = "fixDex: string " + i4 + " is malformed";
        int i6 = 0;
        int i7 = 0;
        do {
            int i8 = i3 - i2;
            if (i6 >= i8) {
                throw new v(str + ": truncated ULEB128 length");
            }
            int i9 = bArr[i2 + i6];
            i7 |= (i9 & 127) << (i6 * 7);
            i6++;
            if ((i9 & 128) == 0) {
                if (i7 < 0 || i7 + 1 > i8 - i6) {
                    throw new v(str + ": payload overruns its bound");
                }
                int i10 = i6 + i2;
                char[] cArr = new char[i7];
                for (int i11 = 0; i11 < i7; i11++) {
                    if (i10 >= i3) {
                        throw new v(str + ": truncated MUTF-8 payload");
                    }
                    byte b2 = bArr[i10];
                    int i12 = b2 & 255;
                    if (i12 == 0) {
                        throw new v(str + ": string shorter than indicated size " + i7);
                    }
                    if (i12 < 128) {
                        cArr[i11] = (char) i12;
                        i10++;
                    } else {
                        if ((b2 & 224) == 192) {
                            i5 = i10 + 2;
                            if (i5 <= i3) {
                                byte b3 = bArr[i10 + 1];
                                if ((b3 & 192) == 128) {
                                    int i13 = (b3 & 63) | ((b2 & 31) << 6);
                                    if (i13 != 0 && i13 < 128) {
                                        throw new v(str + ": overlong MUTF-8");
                                    }
                                    cArr[i11] = (char) i13;
                                }
                            }
                            throw new v(str + ": bad MUTF-8");
                        }
                        if ((b2 & 240) != 224) {
                            throw new v(str + ": invalid MUTF-8");
                        }
                        i5 = i10 + 3;
                        if (i5 <= i3) {
                            byte b4 = bArr[i10 + 1];
                            if ((b4 & 192) == 128) {
                                byte b5 = bArr[i10 + 2];
                                if ((b5 & 192) == 128) {
                                    int i14 = (b5 & 63) | ((b2 & 15) << 12) | ((b4 & 63) << 6);
                                    if (i14 < 2048) {
                                        throw new v(str + ": overlong MUTF-8");
                                    }
                                    cArr[i11] = (char) i14;
                                }
                            }
                        }
                        throw new v(str + ": bad MUTF-8");
                        i10 = i5;
                    }
                }
                if (i10 < i3 && bArr[i10] == 0) {
                    return new u(new String(cArr), i7, (i10 - i2) + 1);
                }
                throw new v(str + ": missing NUL terminator");
            }
        } while (i6 <= 4);
        throw new v(str + ": invalid ULEB128 length");
    }

    private static boolean x0(String str) {
        if (str == null || str.length() != 64) {
            return false;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if ((cCharAt < '0' || cCharAt > '9') && (cCharAt < 'a' || cCharAt > 'f')) {
                return false;
            }
        }
        return true;
    }

    private static String x1(byte[] bArr) {
        for (String str : new String(bArr, "UTF-8").split("\r\n|\n", -1)) {
            if (str.isEmpty()) {
                return null;
            }
            int iIndexOf = str.indexOf(58);
            if (iIndexOf > 0 && "SHA-256-Digest-Manifest".equalsIgnoreCase(str.substring(0, iIndexOf).trim())) {
                String strTrim = str.substring(iIndexOf + 1).trim();
                if (strTrim.isEmpty()) {
                    return null;
                }
                return strTrim;
            }
        }
        return null;
    }

    private static String y(byte[] bArr, int i2, int i3) {
        int i4;
        z(bArr, i2, i3);
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i4 = i2 + 1;
            int i7 = bArr[i2];
            i5 |= (i7 & 127) << (i6 * 7);
            if ((i7 & 128) == 0) {
                break;
            }
            i6++;
            i2 = i4;
        }
        char[] cArr = new char[i5];
        for (int i8 = 0; i8 < i5; i8++) {
            byte b2 = bArr[i4];
            int i9 = b2 & 255;
            if (i9 < 128) {
                cArr[i8] = (char) i9;
                i4++;
            } else if ((b2 & 224) == 192) {
                int i10 = ((b2 & 31) << 6) | (bArr[i4 + 1] & 63);
                if (i10 != 0 && i10 < 128) {
                    throw new v("hashDex: overlong MUTF-8");
                }
                cArr[i8] = (char) i10;
                i4 += 2;
            } else {
                int i11 = ((b2 & 15) << 12) | ((bArr[i4 + 1] & 63) << 6) | (bArr[i4 + 2] & 63);
                if (i11 < 2048) {
                    throw new v("hashDex: overlong MUTF-8");
                }
                cArr[i8] = (char) i11;
                i4 += 3;
            }
        }
        return new String(cArr);
    }

    private static boolean y0(String str) {
        return w.matcher(str).matches();
    }

    private static String y1() {
        Signature[] signatureArr;
        try {
            PackageInfo packageArchiveInfo = Tools.B0().getPackageArchiveInfo(i0().getAbsolutePath(), 64);
            if (packageArchiveInfo != null && (signatureArr = packageArchiveInfo.signatures) != null && signatureArr.length == 1) {
                return l(signatureArr[0]);
            }
            return null;
        } catch (Throwable th) {
            e1.a(th);
            return null;
        }
    }

    private static int z(byte[] bArr, int i2, int i3) {
        boolean z2;
        long j2 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= 5) {
                z2 = false;
                break;
            }
            if (i2 >= i3) {
                throw new v("hashDex: truncated ULEB128 length");
            }
            int i6 = i2 + 1;
            byte b2 = bArr[i2];
            if (i5 == 4 && (b2 & 240) != 0) {
                throw new v("hashDex: invalid ULEB128 length");
            }
            j2 |= ((long) (b2 & 127)) << (i5 * 7);
            if ((b2 & 128) == 0) {
                i2 = i6;
                z2 = true;
                break;
            }
            i5++;
            i2 = i6;
        }
        if (!z2) {
            throw new v("hashDex: invalid ULEB128 length");
        }
        if (j2 > 2147483647L || 1 + j2 > i3 - i2) {
            throw new v("hashDex: string length out of range");
        }
        while (i4 < ((int) j2)) {
            if (i2 >= i3) {
                throw new v("hashDex: truncated MUTF-8 payload");
            }
            int i7 = i2 + 1;
            byte b3 = bArr[i2];
            int i8 = b3 & 255;
            if (i8 == 0) {
                throw new v("hashDex: string shorter than indicated size");
            }
            if (i8 < 128) {
                i4++;
                i2 = i7;
            } else if ((b3 & 224) == 192) {
                if (i7 >= i3 || (bArr[i7] & 192) != 128) {
                    throw new v("hashDex: bad MUTF-8");
                }
                i4++;
                i2 += 2;
            } else {
                if ((b3 & 240) != 224) {
                    throw new v("hashDex: invalid MUTF-8");
                }
                int i9 = i2 + 2;
                if (i9 >= i3 || (bArr[i7] & 192) != 128 || (bArr[i9] & 192) != 128) {
                    throw new v("hashDex: bad MUTF-8");
                }
                i4++;
                i2 += 3;
            }
        }
        if (i2 >= i3 || bArr[i2] != 0) {
            throw new v("hashDex: missing NUL terminator");
        }
        return i2 + 1;
    }

    private static boolean z0(String str) {
        int length;
        if (str == null || !str.endsWith(".dex")) {
            return false;
        }
        if (!str.regionMatches(0, "classes", 0, 7) || (length = str.length() - 4) <= 7) {
            return false;
        }
        long j2 = 0;
        for (int i2 = 7; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < '0' || cCharAt > '9') {
                return false;
            }
            j2 = (j2 * 10) + ((long) (cCharAt - '0'));
            if (j2 > 2147483647L) {
                break;
            }
        }
        return j2 >= 2;
    }

    public static void z1() {
        r0();
        new n0.i(new j(), "Installer").start();
    }

    void E() {
        if (this.r != null) {
            try {
                Tools.D(this.r);
                this.r = null;
            } catch (Throwable th) {
                e1.s("Exception on dismiss", th);
            }
        }
    }

    RandomAccessFile h0(int i2) {
        RandomAccessFile randomAccessFile = this.f592a[i2];
        if (randomAccessFile == null) {
            randomAccessFile = new RandomAccessFile(V(i2), "rw");
            e1.d("RAF new: " + i2 + ' ' + randomAccessFile.getFD());
            this.f592a[i2] = randomAccessFile;
        }
        e1.d("RAF get: " + i2 + ' ' + randomAccessFile.getFD());
        return randomAccessFile;
    }
}
