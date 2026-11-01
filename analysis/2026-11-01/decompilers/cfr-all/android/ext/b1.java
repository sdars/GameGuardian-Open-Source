/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.app.AppOpsManager
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.ComponentInfo
 *  android.content.pm.InstrumentationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.Signature
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Environment
 *  android.os.Handler
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.os.Process
 *  android.system.ErrnoException
 *  android.system.Os
 *  android.util.Base64
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 *  android.widget.ProgressBar
 *  android.widget.TextView
 */
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
import android.ext.Tools;
import android.ext.a1;
import android.ext.b2;
import android.ext.e1;
import android.ext.e2;
import android.ext.f;
import android.ext.f1;
import android.ext.g;
import android.ext.h3;
import android.ext.i;
import android.ext.m0;
import android.ext.n0;
import android.ext.n2;
import android.ext.p0;
import android.ext.r;
import android.ext.t1;
import android.ext.w0;
import android.ext.x2;
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
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.DigestInputStream;
import java.security.DigestOutputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
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

public class b1 {
    static final boolean[] A;
    static b1 B;
    static volatile c0 C;
    private static final Object D;
    public static volatile WeakReference E;
    private static final Runnable F;
    public static volatile WeakReference G;
    public static volatile WeakReference H;
    public static volatile WeakReference I;
    private static volatile int J;
    private static volatile boolean K;
    static volatile int L;
    private static final byte[] M;
    private static volatile WeakReference N;
    private static String O;
    private static final Object P;
    private static final String[] t;
    private static final String[] u;
    private static final String[] v;
    private static final Pattern w;
    private static final String[] x;
    static byte y;
    static byte[][] z;
    private final RandomAccessFile[] a;
    private final File b;
    File c;
    File d;
    private String e;
    private final String f;
    private final String g;
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

    static {
        t = new String[]{"archive-parse", "package", "version", "application", "label", "signature", "signature-digest", "signature-official", "commit-hash", "binding-missing", "binding-mismatch", "component", "instrumentation", "provider"};
        u = new String[]{"repack-start", "verify-start", "verify-pass", "root-install-start", "root-install-return", "manual-install-start", "unknown-source-settings-start", "unknown-source-settings-failed", "package-installed", "old-uninstall-start", "preflight-start", "preflight-root-granted", "preflight-root-unavailable", "preflight-root-unanswered", "preflight-manual-start", "preflight-manual-granted", "preflight-manual-refused", "install-mode-unavailable", "installer-removed", "normal-service-ready"};
        v = new String[]{"installer-removed", "normal-service-ready"};
        w = Pattern.compile("[0-9a-f]{32}\\.part\\.apk");
        x = new String[]{"classes.dex", "AndroidManifest.xml", "resources.arsc", "META-INF/MANIFEST.MF", "META-INF/CERT.SF", "META-INF/CERT.RSA"};
        y = 0;
        z = null;
        A = new boolean[]{false, true, false, true, true, true};
        C = null;
        D = new Object();
        E = new WeakReference<Object>(null);
        F = new Runnable(){

            @Override
            public void run() {
                b1.H1();
                Handler handler = n2.d();
                handler.removeCallbacks((Runnable)this);
                handler.postDelayed((Runnable)this, 500L);
            }
        };
        G = new WeakReference<Object>(null);
        H = new WeakReference<Object>(null);
        I = new WeakReference<Object>(null);
        J = 0;
        K = false;
        L = 0;
        M = new byte[0];
        N = new WeakReference<Object>(null);
        O = null;
        P = new Object();
    }

    private b1() {
        Object object = x;
        this.a = new RandomAccessFile[((String[])object).length];
        this.k = new w[((String[])object).length];
        this.r = null;
        this.l = MessageDigest.getInstance("SHA1");
        this.m = MessageDigest.getInstance("SHA1");
        this.n = MessageDigest.getInstance("SHA-256");
        this.f = b1.d1();
        Object object2 = this.T(true);
        ((File)object2).mkdirs();
        this.b = object2;
        object = new StringBuilder();
        ((StringBuilder)object).append("Int dir: ");
        ((StringBuilder)object).append(((File)object2).getAbsolutePath());
        e1.d(((StringBuilder)object).toString());
        this.i();
        object = new StringBuilder();
        ((StringBuilder)object).append("Apk: ");
        ((StringBuilder)object).append(this.c.getAbsolutePath());
        e1.d(((StringBuilder)object).toString());
        this.A1();
        if (b1.C.d == null) {
            b1.C.d = this.e0();
        }
        if (b1.C.e == null) {
            while (android.ext.i.c.equals(object = b1.f0(1))) {
            }
            b1.C.e = object;
        }
        this.g = object2 = b1.C.d;
        this.h = b1.C.e;
        object = b1.C.f != null ? b1.C.f : b1.f0(2);
        this.i = object;
        b1.C.f = object;
        int n3 = b1.C.g != 0 ? b1.C.g : b1.E0();
        this.j = n3;
        b1.C.g = n3;
        object = new StringBuilder();
        ((StringBuilder)object).append("package: ");
        ((StringBuilder)object).append(android.ext.i.b);
        ((StringBuilder)object).append(" -> ");
        ((StringBuilder)object).append((String)object2);
        e1.d(((StringBuilder)object).toString());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int[] A(ByteBuffer byteBuffer, int n3, int n4, int n5, int n6, int n7) {
        int n8;
        int n9;
        int n10;
        int n11;
        long l3;
        if (n3 < n7 || n3 > n4 - 4) throw new v("hashDex: map list out of bounds");
        long l4 = b1.B(byteBuffer, n3);
        long l5 = (long)n3 + 4L + 12L * l4;
        if (l4 < 1L || l4 > Integer.MAX_VALUE || l5 > (l3 = (long)n4)) throw new v("hashDex: map list out of bounds");
        int n12 = (int)l4;
        int n13 = (int)l5;
        int[] nArray = new int[n12];
        int[] nArray2 = new int[n12];
        long[] lArray = new long[n12];
        int n14 = -1;
        for (n11 = 0; n11 < n12; ++n11) {
            n10 = n3 + 4 + n11 * 12;
            n9 = byteBuffer.getShort(n10);
            n8 = byteBuffer.getShort(n10 + 2);
            l5 = b1.B(byteBuffer, n10 + 4);
            l4 = b1.B(byteBuffer, n10 + 8);
            if ((n8 & 0xFFFF) != 0 || l5 < 1L || l4 >= l3 || n11 > 0 && l4 <= (long)n14) throw new v("hashDex: invalid map item");
            nArray[n11] = n9 & 0xFFFF;
            nArray2[n11] = n14 = (int)l4;
            lArray[n11] = l5;
        }
        n14 = -1;
        n10 = -1;
        n8 = -1;
        for (n11 = 0; n11 < n12; ++n11) {
            int n15;
            int n16;
            int n17 = nArray[n11];
            if (n17 == 1) {
                if (n10 >= 0) throw new v("hashDex: duplicate string_ids map item");
                n16 = n11;
                n9 = n14;
                n15 = n8;
            } else if (n17 == 4096) {
                if (n8 >= 0) throw new v("hashDex: duplicate map_list item");
                n15 = n11;
                n9 = n14;
                n16 = n10;
            } else {
                n9 = n14;
                n16 = n10;
                n15 = n8;
                if (n17 == 8194) {
                    if (n14 >= 0) throw new v("hashDex: duplicate string_data map item");
                    n9 = n11;
                    n16 = n10;
                    n15 = n8;
                }
            }
            n14 = n9;
            n10 = n16;
            n8 = n15;
        }
        if (n10 < 0 || (l3 = lArray[n10]) != (l5 = (long)n5) || nArray2[n10] != n6) throw new v("hashDex: string_ids map mismatch");
        if (n8 < 0 || lArray[n8] != 1L || nArray2[n8] != n3) throw new v("hashDex: map_list entry mismatch");
        n3 = n8 + 1;
        n3 = n3 < n12 ? nArray2[n3] : n4;
        if (n13 > n3) throw new v("hashDex: map list overlaps another section");
        if (n14 < 0 || lArray[n14] != l5) throw new v("hashDex: string_data map mismatch");
        n5 = nArray2[n14];
        n3 = n14 + 1;
        n3 = n3 < n12 ? nArray2[n3] : n4;
        if (n5 < n7 || n5 >= n3 || n3 > n4) throw new v("hashDex: string data out of bounds");
        return new int[]{n5, n3};
    }

    private static byte[] A0(String string2) {
        byte[] byArray = new byte[string2.length() * 3];
        int n3 = 0;
        for (int i3 = 0; i3 < string2.length(); ++i3) {
            int n4;
            char c4 = string2.charAt(i3);
            if (c4 == '\u0000') {
                byArray[n3] = -64;
                n4 = n3 + 2;
                byArray[n3 + 1] = -128;
                n3 = n4;
                continue;
            }
            if (c4 < '\u0080') {
                byArray[n3] = (byte)c4;
                ++n3;
                continue;
            }
            if (c4 < '\u0800') {
                byArray[n3] = (byte)(c4 >> 6 | 0xC0);
                n4 = n3 + 2;
                byArray[n3 + 1] = (byte)(c4 & 0x3F | 0x80);
                n3 = n4;
                continue;
            }
            byArray[n3] = (byte)(c4 >> 12 | 0xE0);
            byArray[n3 + 1] = (byte)(c4 >> 6 & 0x3F | 0x80);
            n4 = n3 + 3;
            byArray[n3 + 2] = (byte)(c4 & 0x3F | 0x80);
            n3 = n4;
        }
        return Arrays.copyOf(byArray, n3);
    }

    private void A1() {
        this.B1(this.b);
        File file = this.c.getParentFile();
        if (file != null && !file.equals(this.b)) {
            this.B1(file);
        }
    }

    private static long B(ByteBuffer byteBuffer, int n3) {
        return (long)byteBuffer.getInt(n3) & 0xFFFFFFFFL;
    }

    public static boolean B0() {
        boolean bl;
        block5: {
            block4: {
                b1.u1();
                bl = true;
                try {
                    File file = new File(Tools.removeNewLinesChars("2gdwd2JJ1vnls1lqvwdoo"));
                    boolean bl2 = file.exists();
                    if (!(bl2 ^ true)) break block4;
                }
                catch (Throwable throwable) {
                    e1.a(throwable);
                }
                if (android.ext.i.b.equals(Tools.C0()) && !b1.W("installer.fail").exists()) break block5;
            }
            bl = false;
        }
        return bl;
    }

    private void B1(File file) {
        if (file == null) {
            return;
        }
        String[] stringArray = file.list();
        if (stringArray == null) {
            return;
        }
        for (String string2 : stringArray) {
            Comparable<File> comparable;
            if (!b1.y0(string2) || ((File)(comparable = new File(file, string2))).equals(this.d) || !((File)comparable).isFile() || ((File)comparable).delete()) continue;
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append("Failed sweep orphaned part: ");
            ((StringBuilder)comparable).append(string2);
            e1.p(((StringBuilder)comparable).toString());
        }
    }

    private static File C(String string2) {
        File file = Tools.p0();
        if (file != null && !file.isDirectory()) {
            file.mkdirs();
        }
        return new File(file, string2);
    }

    private static String C0() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Tools.removeNewLinesChars("2gdwd2orfdo2wps21"));
        stringBuilder.append(UUID.randomUUID());
        return stringBuilder.toString();
    }

    private static byte[] C1(byte[] byArray) {
        if ((byArray = Arrays.copyOf(byArray, byArray.length)).length > 0) {
            int n3 = byArray.length / 2;
            byArray[n3] = (byte)(byArray[n3] ^ 1);
        }
        return byArray;
    }

    private void D(FileOutputStream object) {
        if (object != null) {
            try {
                ((FileOutputStream)object).close();
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
        }
        if (this.d.exists() && !this.d.delete()) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Failed discard part: ");
            ((StringBuilder)object).append(this.d.getName());
            e1.p(((StringBuilder)object).toString());
        }
    }

    private static String D0() {
        byte[] byArray = new byte[16];
        new SecureRandom().nextBytes(byArray);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(m0.i(byArray));
        stringBuilder.append(".apk");
        return stringBuilder.toString();
    }

    private static int D1(int n3, byte[] byArray, int n4) {
        int n5 = 0;
        int n6 = n3;
        n3 = n5;
        while (true) {
            int n7 = n6 & 0x7F;
            n5 = n6 >>> 7;
            n6 = n7;
            if (n5 != 0) {
                n6 = n7 | 0x80;
            }
            n7 = n3 + 1;
            byArray[n3 + n4] = (byte)n6;
            if (n5 == 0) {
                return n7;
            }
            n3 = n7;
            n6 = n5;
        }
    }

    private static int E0() {
        return Tools.a.nextInt((int)(1.0f * 16985.2f - 830.2f + 0.5f) * 2) + 1;
    }

    private static int E1(int n3) {
        if (n3 < 128) {
            return 1;
        }
        if (n3 < 16384) {
            return 2;
        }
        if (n3 < 0x200000) {
            return 3;
        }
        return 4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void F() {
        Throwable throwable2;
        ZipInputStream zipInputStream;
        block6: {
            zipInputStream = b1.l0();
            while (true) {
                Object object;
                block5: {
                    Object object2;
                    block4: {
                        try {
                            object = zipInputStream.getNextEntry();
                            if (object == null) break;
                            int n3 = b1.Y((ZipEntry)object);
                            if (n3 == -1) break block4;
                            w[] wArray = this.k;
                            ZipEntry zipEntry = new ZipEntry((ZipEntry)object);
                            wArray[n3] = object2 = new w(zipEntry, this.G((ZipEntry)object, zipInputStream, n3));
                            object = new StringBuilder();
                            ((StringBuilder)object).append("list: ");
                            ((StringBuilder)object).append(n3);
                            object = ((StringBuilder)object).toString();
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    if (!b1.z0(((ZipEntry)object).getName())) continue;
                    this.p = object2 = this.p1();
                    object2.put(((ZipEntry)object).getName(), this.c1((ZipEntry)object, zipInputStream));
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("secondary dex: ");
                    ((StringBuilder)object2).append(((ZipEntry)object).getName());
                    object = ((StringBuilder)object2).toString();
                }
                e1.d((String)object);
            }
            zipInputStream.close();
            return;
        }
        zipInputStream.close();
        throw throwable2;
    }

    public static void F0(int n3, int n4, Intent object) {
        c0 c02 = C;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("instance: ");
        stringBuilder.append(B);
        stringBuilder.append("; ");
        stringBuilder.append(c02);
        e1.d(stringBuilder.toString());
        if (c02 == null) {
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(c02.k);
        stringBuilder.append("\nget: ");
        stringBuilder.append(n4);
        stringBuilder.append(" for: ");
        stringBuilder.append(n3);
        stringBuilder.append(" with: ");
        stringBuilder.append(object);
        c02.k = stringBuilder.toString();
        object = B;
        if (object == null) {
            return;
        }
        if (n3 != 1) {
            if (n3 == 2) {
                b1.T0(b2.f(2131296443), n3, n4, b1.k0(android.ext.i.b));
            }
        } else if (Tools.e1(((b1)object).g)) {
            c02.j = ~n3 & c02.j;
        } else {
            object = new StringBuilder();
            ((StringBuilder)object).append(b2.f(2131296437));
            ((StringBuilder)object).append("\n\n");
            ((StringBuilder)object).append(Tools.N1(2131296762));
            ((StringBuilder)object).append(":\n");
            ((StringBuilder)object).append(b1.B.c.getAbsolutePath());
            b1.T0(((StringBuilder)object).toString(), n3, n4, B.a0());
        }
    }

    private void F1() {
        CharSequence charSequence;
        if (b1.Q0(b1.C.l)) {
            try {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("exec pm uninstall ");
                ((StringBuilder)charSequence).append(android.ext.i.b);
                e2.n(((StringBuilder)charSequence).toString(), 45);
            }
            catch (Throwable throwable) {
                e1.l("run cmd fail", throwable);
            }
        }
        if (!Tools.e1((String)(charSequence = android.ext.i.b))) {
            android.ext.f.o(android.ext.f.c(android.ext.r.p).setMessage((CharSequence)b2.f(2131296701)).setPositiveButton((CharSequence)b2.f(2131296836), (DialogInterface.OnClickListener)new p0(1600)));
            return;
        }
        if (b1.C.h) {
            for (CharSequence charSequence2 : b1.k0((String)charSequence)) {
                try {
                    this.P1((Intent)charSequence2, 2);
                    break;
                }
                catch (ActivityNotFoundException activityNotFoundException) {
                    e1.l("intent fail", activityNotFoundException);
                }
            }
        } else {
            android.ext.f.o(android.ext.f.c(android.ext.r.p).setMessage((CharSequence)b2.f(2131296799)).setPositiveButton((CharSequence)b2.f(2131296836), new DialogInterface.OnClickListener(this){
                final b1 a;
                {
                    this.a = b12;
                }

                public void onClick(DialogInterface dialogInterface, int n3) {
                    x2.t(android.ext.i.b);
                }
            }));
        }
        throw new RuntimeException("Failed uninstall self");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String G(ZipEntry zipEntry, ZipInputStream object, int n3) {
        Throwable throwable2;
        Object object2;
        block3: {
            Object object3;
            this.l.reset();
            object2 = new DigestOutputStream(this.g0(n3), this.l);
            this.m.reset();
            object = new DigestInputStream((InputStream)object, this.m);
            try {
                int n4;
                object3 = this.S();
                while ((n4 = ((InputStream)object).read((byte[])object3)) != -1) {
                    ((OutputStream)object2).write((byte[])object3, 0, n4);
                }
            }
            catch (Throwable throwable2) {
                break block3;
            }
            ((OutputStream)object2).flush();
            ((OutputStream)object2).close();
            object3 = Base64.encodeToString((byte[])this.l.digest(), (int)2);
            object2 = Base64.encodeToString((byte[])this.m.digest(), (int)2);
            object = new StringBuilder();
            ((StringBuilder)object).append("extract ");
            ((StringBuilder)object).append(zipEntry.getName());
            ((StringBuilder)object).append(": ");
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(" -> ");
            ((StringBuilder)object).append((String)object3);
            e1.d(((StringBuilder)object).toString());
            this.n(zipEntry, n3, (String)object3, (String)object2);
            return object3;
        }
        ((OutputStream)object2).close();
        object2 = Base64.encodeToString((byte[])this.l.digest(), (int)2);
        String string2 = Base64.encodeToString((byte[])this.m.digest(), (int)2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("extract ");
        stringBuilder.append(zipEntry.getName());
        stringBuilder.append(": ");
        stringBuilder.append(string2);
        stringBuilder.append(" -> ");
        stringBuilder.append((String)object2);
        e1.d(stringBuilder.toString());
        throw throwable2;
    }

    static void G0() {
        c0 c02 = C;
        if (c02 == null) {
            return;
        }
        if (c02.i && c0.p) {
            c0.q = true;
            c02.i = false;
            c02.j &= 0xFFFFFFFB;
        }
    }

    private void G1(ZipEntry zipEntry, int n3) {
        Throwable throwable2;
        Object object;
        block6: {
            long l3;
            CRC32 cRC32;
            block5: {
                int n4;
                byte[] byArray;
                object = new StringBuilder();
                ((StringBuilder)object).append("updateEntry f: ");
                ((StringBuilder)object).append(android.ext.g.a(zipEntry));
                e1.d(((StringBuilder)object).toString());
                cRC32 = new CRC32();
                object = this.Z(n3);
                try {
                    byArray = this.S();
                    l3 = 0L;
                }
                catch (Throwable throwable2) {}
                while (true) {
                    n4 = ((InputStream)object).read(byArray);
                    if (n4 == -1) break block5;
                    if (n4 == 0) continue;
                    break;
                }
                {
                    l3 += (long)n4;
                    cRC32.update(byArray, 0, n4);
                    continue;
                }
                break block6;
            }
            ((InputStream)object).close();
            zipEntry.setCrc(cRC32.getValue());
            long l4 = this.c0(n3);
            zipEntry.setSize(l4);
            long l5 = zipEntry.getMethod() == 0 ? l4 : -1L;
            zipEntry.setCompressedSize(l5);
            object = new StringBuilder();
            ((StringBuilder)object).append("updateEntry t: ");
            ((StringBuilder)object).append(android.ext.g.a(zipEntry));
            ((StringBuilder)object).append(' ');
            ((StringBuilder)object).append(l4);
            ((StringBuilder)object).append(' ');
            ((StringBuilder)object).append(l3);
            e1.d(((StringBuilder)object).toString());
            return;
        }
        ((InputStream)object).close();
        throw throwable2;
    }

    private void H(b0 b02) {
        this.I(b02, true);
    }

    private static int H0() {
        return (int)(1.0f * 18038.1f - 1883.1f + 0.5f);
    }

    static void H1() {
        Object object;
        int n3;
        int n4 = n3 = b1.C.b + J;
        if (n3 > 1000) {
            n4 = 1000;
        }
        if ((object = (ProgressBar)G.get()) != null) {
            object.setMax(1000);
            object.setProgress(n4);
        }
        if ((object = (TextView)H.get()) != null) {
            object.setText((CharSequence)Tools.L1("%.1f %%", (double)n4 * 100.0 / 1000.0));
        }
        if (J < 199) {
            ++J;
        }
        if (b1.C.b == 600) {
            if (J == 60) {
                TextView textView = (TextView)I.get();
                object = b1.C.c;
                if (textView != null && object != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(b2.f(2131296705));
                    stringBuilder.append("\n\n");
                    stringBuilder.append(Tools.N1(2131296762));
                    stringBuilder.append(":\n");
                    stringBuilder.append((String)object);
                    textView.setText((CharSequence)stringBuilder.toString());
                }
            }
            if (J == 198 && B != null && b1.C.h) {
                object = new StringBuilder();
                ((StringBuilder)object).append(b2.f(2131296437));
                ((StringBuilder)object).append("\n\n");
                ((StringBuilder)object).append(Tools.N1(2131296762));
                ((StringBuilder)object).append(":\n");
                ((StringBuilder)object).append(b1.B.c.getAbsolutePath());
                b1.T0(((StringBuilder)object).toString(), 1, -123, B.a0());
            }
        }
    }

    private boolean I(b0 object, boolean bl) {
        Object object2 = new byte[8];
        Object object3 = ByteBuffer.wrap((byte[])object2);
        Object object4 = ByteOrder.LITTLE_ENDIAN;
        object3 = ((ByteBuffer)object3).order((ByteOrder)object4);
        long l3 = ((b0)object).b();
        if (l3 >= 64L) {
            ((b0)object).f(56L);
            if (((b0)object).e((byte[])object2, 0, 8) == 8) {
                long l4;
                ((ByteBuffer)object3).position(0);
                int n3 = ((ByteBuffer)object3).getInt();
                int n4 = ((ByteBuffer)object3).getInt();
                if (n3 >= 1 && n4 >= 64 && (long)n3 * 4L + (l4 = (long)n4) <= l3) {
                    n4 = n3 * 4;
                    Object object5 = new byte[n4];
                    ((b0)object).f(l4);
                    if (((b0)object).d((byte[])object5) == n4) {
                        int n5;
                        ByteBuffer byteBuffer = ByteBuffer.wrap((byte[])object5).order((ByteOrder)object4);
                        int[] nArray = new int[n3];
                        for (n4 = 0; n4 < n3; ++n4) {
                            nArray[n4] = n5 = byteBuffer.getInt();
                            if (n5 >= 64 && (long)n5 < l3 && (n4 <= 0 || n5 > nArray[n4 - 1])) {
                                continue;
                            }
                            throw new v("fixDex: string_ids offsets are not strictly increasing");
                        }
                        int n6 = nArray[0];
                        long l5 = n6;
                        if ((l3 -= l5) <= Integer.MAX_VALUE) {
                            int n7 = (int)l3;
                            object3 = new byte[n7];
                            ((b0)object).f(l5);
                            if (((b0)object).d((byte[])object3) == n7) {
                                object4 = android.ext.i.b.replace('.', '/');
                                Object object6 = this.g.replace('.', '/');
                                if (((String)object4).length() >= ((String)object6).length()) {
                                    int n8;
                                    int n9;
                                    Object object7;
                                    Object object8;
                                    block25: {
                                        object8 = new String[n3];
                                        object7 = new int[n3];
                                        n4 = 0;
                                        while (true) {
                                            object2 = "fixDex: string ";
                                            if (n4 >= n3) break block25;
                                            n9 = nArray[n4] - n6;
                                            n8 = n4 + 1;
                                            n5 = n8 < n3 ? nArray[n8] - n6 : n7;
                                            if (n9 >= n5) break;
                                            object2 = b1.x((byte[])object3, n9, n5, n4);
                                            object8[n4] = ((u)object2).a;
                                            object7[n4] = ((u)object2).c;
                                            n4 = n8;
                                        }
                                        object = new StringBuilder();
                                        ((StringBuilder)object).append("fixDex: string ");
                                        ((StringBuilder)object).append(n4);
                                        ((StringBuilder)object).append(" has an empty slot");
                                        throw new v(((StringBuilder)object).toString());
                                    }
                                    n4 = n3 - 1;
                                    n9 = nArray[n4] - n6 + object7[n4];
                                    if (n9 >= 1 && n9 <= n7) {
                                        byte[][] byArrayArray = new byte[n3][];
                                        object7 = new HashMap();
                                        n4 = 0;
                                        n7 = 0;
                                        for (n8 = 0; n8 < n3; ++n8) {
                                            Object object9 = object8[n8];
                                            String string2 = ((String)object9).replace((CharSequence)object4, (CharSequence)object6);
                                            n5 = n7;
                                            if (!((String)object9).equals(string2)) {
                                                n5 = n7 + 1;
                                            }
                                            object8[n8] = string2;
                                            object9 = b1.A0(string2);
                                            n7 = b1.E1(string2.length()) + ((Object)object9).length + 1;
                                            byte[] byArray = new byte[n7];
                                            System.arraycopy(object9, 0, byArray, b1.D1(string2.length(), byArray, 0), ((Object)object9).length);
                                            byArrayArray[n8] = byArray;
                                            if (n4 <= n9 - n7) {
                                                n7 = n4 + n7;
                                                object9 = (Integer)object7.get(string2);
                                                n4 = object9 == null ? 1 : (Integer)object9 + 1;
                                                object7.put(string2, n4);
                                                n4 = n7;
                                                n7 = n5;
                                                continue;
                                            }
                                            throw new v("fixDex: repacked string_data section does not fit");
                                        }
                                        if (n7 == 0) {
                                            if (!bl) {
                                                return false;
                                            }
                                            throw new v("fixDex: no string in classes.dex carried the original package");
                                        }
                                        object8 = ByteBuffer.wrap((byte[])object5).order(ByteOrder.LITTLE_ENDIAN);
                                        n7 = 0;
                                        for (n5 = 0; n5 < n3; ++n5) {
                                            nArray[n5] = n8 = n6 + n7;
                                            ((ByteBuffer)object8).putInt(n5 * 4, n8);
                                            object6 = byArrayArray[n5];
                                            System.arraycopy(object6, 0, object3, n7, ((Object)object6).length);
                                            n7 += byArrayArray[n5].length;
                                        }
                                        Arrays.fill((byte[])object3, n7, n9, (byte)0);
                                        ((b0)object).f(l4);
                                        ((b0)object).h((byte[])object5);
                                        ((b0)object).f(l5);
                                        ((b0)object).i((byte[])object3, 0, n9);
                                        object3 = new byte[n9];
                                        ((b0)object).f(l5);
                                        if (((b0)object).d((byte[])object3) == n9) {
                                            object8 = new HashMap();
                                            n5 = 0;
                                            while (n5 < n3) {
                                                n9 = nArray[n5] - n6;
                                                n8 = n5 + 1;
                                                n7 = n8 < n3 ? nArray[n8] - n6 : n4;
                                                if (n9 < n7) {
                                                    object6 = b1.x((byte[])object3, n9, n7, n5);
                                                    if (((u)object6).c == n7 - n9) {
                                                        object6 = ((u)object6).a;
                                                        if (((String)object6).indexOf((String)object4) < 0) {
                                                            object5 = (Integer)object8.get(object6);
                                                            n5 = object5 == null ? 1 : (Integer)object5 + 1;
                                                            object8.put(object6, n5);
                                                            n5 = n8;
                                                            continue;
                                                        }
                                                        throw new v("fixDex: rewritten DEX still contains the original package");
                                                    }
                                                    object = new StringBuilder();
                                                    ((StringBuilder)object).append("fixDex: string_data items are not contiguous at ");
                                                    ((StringBuilder)object).append(n5);
                                                    throw new v(((StringBuilder)object).toString());
                                                }
                                                object = new StringBuilder();
                                                ((StringBuilder)object).append((String)object2);
                                                ((StringBuilder)object).append(n5);
                                                ((StringBuilder)object).append(" has an empty slot");
                                                throw new v(((StringBuilder)object).toString());
                                            }
                                            if (object7.equals(object8)) {
                                                object4 = this.S();
                                                ((b0)object).f(32L);
                                                this.l.reset();
                                                while ((n4 = ((b0)object).d((byte[])object4)) != -1) {
                                                    this.l.update((byte[])object4, 0, n4);
                                                }
                                                ((b0)object).f(12L);
                                                ((b0)object).h(this.l.digest());
                                                object2 = new Adler32();
                                                ((b0)object).f(12L);
                                                while ((n4 = ((b0)object).d((byte[])object4)) != -1) {
                                                    ((Adler32)object2).update((byte[])object4, 0, n4);
                                                }
                                                ((b0)object).f(8L);
                                                byteBuffer.putInt(0, (int)((Adler32)object2).getValue());
                                                ((b0)object).i(byteBuffer.array(), 0, 4);
                                                return true;
                                            }
                                            throw new v("fixDex: on-disk string_data does not match the expected re-base");
                                        }
                                        throw new v("fixDex: re-read of string_data section failed");
                                    }
                                    throw new v("fixDex: string_data section is out of bounds");
                                }
                                throw new v("fixDex: generated package is longer than the original");
                            }
                            throw new v("fixDex: truncated string_data section");
                        }
                        throw new v("fixDex: string_data tail is out of bounds");
                    }
                    throw new v("fixDex: truncated string_ids table");
                }
                throw new v("fixDex: string_ids table is out of bounds");
            }
            throw new v("fixDex: truncated classes.dex header");
        }
        throw new v("fixDex: truncated classes.dex header");
    }

    private static String I0() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(1.0f * 109.9f - 8.5f);
        return stringBuilder.toString();
    }

    private void I1() {
        if (b1.x0(b1.C.o) && b1.x0(b1.C.n)) {
            b1.q();
            if (this.c.isFile()) {
                if (b1.C.n.equals(b1.v1(this.c))) {
                    try {
                        this.L1(this.c, b1.C.o);
                    }
                    catch (v v3) {
                        throw b1.K1("binding-mismatch", v3);
                    }
                    this.N1();
                    return;
                }
                throw b1.J1("commit-hash");
            }
            throw b1.J1("binding-mismatch");
        }
        throw b1.J1("binding-missing");
    }

    private void J() {
        Object object;
        this.O();
        for (int i3 = 0; i3 < ((w[])(object = this.k)).length; ++i3) {
            if ((object = object[i3]) == null) continue;
            this.K(object.a, i3);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String J0(String object) {
        PackageInfo packageInfo;
        try {
            packageInfo = Tools.B0().getPackageInfo((String)object, 64);
            if (packageInfo == null) return null;
        }
        catch (Throwable throwable) {
            return null;
        }
        android.content.pm.Signature[] signatureArray = packageInfo.signatures;
        if (signatureArray == null) return null;
        if (signatureArray.length == 1) return b1.l(signatureArray[0]);
        return null;
    }

    private static v J1(String string2) {
        return b1.K1(string2, null);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void K(ZipEntry var1_1, int var2_3) {
        block20: {
            var5_4 = null;
            var6_6 = null;
            if (var2_3 == 0) ** GOTO lbl80
            if (var2_3 == 1) ** GOTO lbl-1000
            if (var2_3 == 2) ** GOTO lbl80
            if (var2_3 == 3) ** GOTO lbl68
            if (var2_3 == 4) ** GOTO lbl59
            if (var2_3 != 5) ** GOTO lbl45
            var4_7 /* !! */  = var6_6;
            var1_1 /* !! */  = (String[])b1.z;
            var1_1 /* !! */  = var1_1 /* !! */  == null ? null : var1_1 /* !! */ [4];
            {
                catch (Throwable var1_2) {}
            }
            if (var1_1 /* !! */  == null) ** GOTO lbl-1000
            var4_7 /* !! */  = var6_6;
            if (var1_1 /* !! */ .length != 0) {
                var4_7 /* !! */  = var6_6;
                var5_4 = var1_1 /* !! */ ;
                if ("tamper-cert-sf".equals(this.f)) {
                    var4_7 /* !! */  = var6_6;
                    var5_4 = b1.C1((byte[])var1_1 /* !! */ );
                }
                var4_7 /* !! */  = var6_6;
                var7_11 = m0.g((byte[])var5_4);
                var4_7 /* !! */  = var6_6;
                var5_4 = var7_11.a;
                var4_7 /* !! */  = var6_6;
                var1_1 /* !! */  = var5_4;
                if ("tamper-cert-rsa".equals(this.f)) {
                    var4_7 /* !! */  = var6_6;
                    var1_1 /* !! */  = (String[])b1.C1((byte[])var5_4);
                }
                var4_7 /* !! */  = var6_6;
                this.e = var7_11.b;
                var4_7 /* !! */  = var6_6;
                var5_4 = this.g0(var2_3);
                var4_7 /* !! */  = var5_4;
                var5_4.write((byte[])var1_1 /* !! */ );
                var1_1 /* !! */  = var5_4;
                break block20;
            } else lbl-1000:
            // 2 sources

            {
                var4_7 /* !! */  = var6_6;
                var4_7 /* !! */  = var6_6;
                var1_1 /* !! */  = new v("CERT.SF is not available for signing");
                var4_7 /* !! */  = var6_6;
                throw var1_1 /* !! */ ;
            }
lbl45:
            // 1 sources

            var4_8 = var6_6;
            var4_8 = var6_6;
            var4_8 = var6_6;
            var5_4 = new StringBuilder();
            var4_8 = var6_6;
            var5_4.append("unknown index: ");
            var4_8 = var6_6;
            var5_4.append(var2_3);
            var4_8 = var6_6;
            var1_1 /* !! */  = new IOException(var5_4.toString());
            var4_8 = var6_6;
            throw var1_1 /* !! */ ;
lbl59:
            // 1 sources

            var4_9 = var6_6;
            var7_12 = this.o;
            var1_1 /* !! */  = var5_4;
            if (var7_12 != null) {
                var4_9 = var6_6;
                var1_1 /* !! */  = this.g0(var2_3);
                var4_9 = var1_1 /* !! */ ;
                this.R(var7_12, (OutputStream)var1_1 /* !! */ );
            }
            break block20;
lbl68:
            // 1 sources

            var4_7 /* !! */  = var6_6;
            var1_1 /* !! */  = this.d0((ZipEntry)var1_1 /* !! */ );
            var4_7 /* !! */  = var6_6;
            this.o = var1_1 /* !! */ ;
            var4_7 /* !! */  = var6_6;
            var5_4 = var1_1 /* !! */ .getEntries();
            var3_14 = 0;
            ** GOTO lbl105
lbl-1000:
            // 1 sources

            {
                block22: {
                    block21: {
                        var4_10 = var6_6;
                        this.M();
                        var1_1 /* !! */  = var5_4;
                        break block20;
lbl80:
                        // 2 sources

                        var4_7 /* !! */  = var6_6;
                        var4_7 /* !! */  = var6_6;
                        var1_1 /* !! */  = new b0(this, var2_3);
                        if (var2_3 == 0) {
                            try {
                                this.H((b0)var1_1 /* !! */ );
                                break block21;
                            }
                            catch (Throwable var5_5) {
                                break block22;
                            }
                        }
                        this.N((b0)var1_1 /* !! */ );
                    }
                    var4_7 /* !! */  = var6_6;
                    var1_1 /* !! */ .a();
                    var1_1 /* !! */  = var5_4;
                    break block20;
                }
                var4_7 /* !! */  = var6_6;
                var1_1 /* !! */ .a();
                var4_7 /* !! */  = var6_6;
                throw var5_5;
                if (var4_7 /* !! */  != null) {
                    var4_7 /* !! */ .close();
                }
                throw var1_2;
lbl105:
                // 1 sources

                while (true) {
                    var4_7 /* !! */  = var6_6;
                    var1_1 /* !! */  = b1.x;
                    var4_7 /* !! */  = var6_6;
                    if (var3_14 >= var1_1 /* !! */ .length) break;
                    var4_7 /* !! */  = var6_6;
                    if ((var1_1 /* !! */  = (Attributes)var5_4.get(var1_1 /* !! */ [var3_14])) != null) {
                        var4_7 /* !! */  = var6_6;
                        b1.f1((Attributes)var1_1 /* !! */ , this.U(this.Z(var3_14)));
                    }
                    ++var3_14;
                }
                var4_7 /* !! */  = var6_6;
                var8_15 = this.P().iterator();
                while (true) {
                    var4_7 /* !! */  = var6_6;
                    if (!var8_15.hasNext()) break;
                    var4_7 /* !! */  = var6_6;
                    var7_13 = (String)var8_15.next();
                    var4_7 /* !! */  = var6_6;
                    var1_1 /* !! */  = (Attributes)var5_4.get(var7_13);
                    if (var1_1 /* !! */  == null) continue;
                    var4_7 /* !! */  = var6_6;
                    b1.f1((Attributes)var1_1 /* !! */ , this.w1(var7_13));
                }
                var4_7 /* !! */  = var6_6;
                var3_14 = b1.y;
                if (var3_14 != 0) {
                    var1_1 /* !! */  = var3_14 == 1 ? "lib/armeabi/libAndroid.so" : "lib/arm64-v8a/libAndroid.so";
                    var4_7 /* !! */  = var6_6;
                    var5_4.put(var1_1 /* !! */ , (Attributes)var5_4.remove("res/raw/ydw3a"));
                    var4_7 /* !! */  = var6_6;
                    var1_1 /* !! */  = b1.y == 1 ? "lib/x86/libAndroid.so" : "lib/x86_64/libAndroid.so";
                    var4_7 /* !! */  = var6_6;
                    var5_4.put(var1_1 /* !! */ , (Attributes)var5_4.remove("res/raw/ydw3x"));
                }
                var4_7 /* !! */  = var6_6;
                var5_4 = this.o;
                var4_7 /* !! */  = var6_6;
                var4_7 /* !! */  = var1_1 /* !! */  = this.g0(var2_3);
                var5_4.write((OutputStream)var1_1 /* !! */ );
            }
        }
        if (var1_1 /* !! */  != null) {
            var1_1 /* !! */ .close();
        }
    }

    private static File K0(File comparable) {
        String string2 = ((File)comparable).getName();
        if (string2.endsWith(".apk")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2.substring(0, string2.length() - 4));
            stringBuilder.append(".part.apk");
            string2 = stringBuilder.toString();
            return new File(((File)comparable).getParentFile(), string2);
        }
        comparable = new StringBuilder();
        ((StringBuilder)comparable).append("committed apk name is not owned: ");
        ((StringBuilder)comparable).append(string2);
        throw new v(((StringBuilder)comparable).toString());
    }

    private static v K1(String string2, Throwable throwable) {
        CharSequence charSequence;
        b1.W1(string2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("verify: generated APK identity check failed: ");
        stringBuilder.append(string2);
        if (throwable != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(" (");
            ((StringBuilder)charSequence).append(throwable);
            ((StringBuilder)charSequence).append(")");
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = "";
        }
        stringBuilder.append((String)charSequence);
        e1.i(stringBuilder.toString());
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("verify: generated APK identity check failed: ");
        ((StringBuilder)charSequence).append(string2);
        return new v(((StringBuilder)charSequence).toString(), throwable);
    }

    private void L(ZipEntry object, InputStream object2, ZipOutputStream zipOutputStream) {
        int n3 = b1.Y((ZipEntry)object);
        object = new ZipEntry((ZipEntry)object);
        if (n3 != -1) {
            this.G1((ZipEntry)object, n3);
            object2 = this.k[n3];
            if (object2 == null) {
                object = new StringBuilder();
                ((StringBuilder)object).append("List: ");
                ((StringBuilder)object).append(n3);
                ((StringBuilder)object).append(" is null!");
                e1.p(((StringBuilder)object).toString());
            } else {
                ((w)object2).c = this.U0((ZipEntry)object, zipOutputStream, n3);
            }
        } else {
            byte[] byArray = (byte[])this.p1().get(((ZipEntry)object).getName());
            if (byArray != null) {
                object2 = new CRC32();
                object2.update(byArray);
                ((ZipEntry)object).setCrc(((CRC32)object2).getValue());
                ((ZipEntry)object).setSize(byArray.length);
                long l3 = ((ZipEntry)object).getMethod() == 0 ? (long)byArray.length : -1L;
                ((ZipEntry)object).setCompressedSize(l3);
                object2 = new ByteArrayInputStream(byArray);
            }
            this.V0((ZipEntry)object, (InputStream)object2, zipOutputStream);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean L0() {
        var4 = b1.D;
        synchronized (var4) {
            block13: {
                block15: {
                    block14: {
                        block12: {
                            try {
                                var5_1 = b1.j0();
                                if (!var5_1.m) break block12;
                                if (b1.N0(var5_1.l)) {
                                    return true;
                                }
                            }
                            catch (Throwable var2_2) {
                                break block13;
                            }
                            b1.R1("preflight-manual-refused");
                            b1.S0();
                            return false;
                        }
                        b1.R1("preflight-start");
                        b1.r1(b2.f(2131296864));
                        var0_4 = b1.O0();
                        if (var0_4 == -1) {
                            b1.R1("preflight-root-unavailable");
                            b1.r1(b2.f(2131296866));
                            var1_5 = Build.VERSION.SDK_INT < 26 || b1.u0();
                            var2_3 = b1.M0(var0_4, var1_5, var5_1.i);
                            var5_1.i = false;
                        } else {
                            if (var0_4 == 1) {
                                b1.r1(b2.f(2131296865));
                            } else {
                                b1.R1("preflight-root-unanswered");
                            }
                            var2_3 = b1.M0(var0_4, false, false);
                        }
                        if (var2_3 != android.ext.b1$y.a) break block14;
                        var3_6 /* !! */  = var2_3;
                        if (var0_4 != 1) break block15;
                        var3_6 /* !! */  = "preflight-root-granted";
                        ** GOTO lbl39
                    }
                    if (var2_3 == android.ext.b1$y.b) {
                        b1.R1("preflight-manual-start");
                        var3_6 /* !! */  = "preflight-manual-granted";
lbl39:
                        // 2 sources

                        b1.R1((String)var3_6 /* !! */ );
                        var3_6 /* !! */  = var2_3;
                    } else {
                        var3_6 /* !! */  = var2_3;
                        if (var2_3 == android.ext.b1$y.c) {
                            var3_6 /* !! */  = b1.P0();
                        }
                    }
                }
                var5_1.l = var0_4 = b1.R0(var3_6 /* !! */ );
                var5_1.m = true;
                if (b1.N0(var0_4)) {
                    return true;
                }
                b1.R1("preflight-manual-refused");
                b1.S0();
                return false;
            }
            throw var2_2;
        }
    }

    private String L1(File file, String charSequence) {
        b1.q();
        b1.M1(file, (String)charSequence);
        Object object = Tools.B0();
        Object object2 = object.getPackageArchiveInfo(file.getAbsolutePath(), 95);
        if (object2 != null) {
            if (this.g.equals(object2.packageName)) {
                if (object2.versionCode == this.j && this.i.equals(object2.versionName)) {
                    ApplicationInfo applicationInfo = object2.applicationInfo;
                    if (applicationInfo != null) {
                        block18: {
                            applicationInfo.sourceDir = file.getAbsolutePath();
                            object2.applicationInfo.publicSourceDir = file.getAbsolutePath();
                            try {
                                object = object2.applicationInfo.loadLabel((PackageManager)object);
                                if (!this.h.contentEquals((CharSequence)object)) break block18;
                            }
                            catch (Throwable throwable) {
                                throw b1.K1("label", throwable);
                            }
                            object = object2.signatures;
                            if (object != null && ((android.content.pm.Signature[])object).length == 1) {
                                if (((String)charSequence).equals(object = b1.l(object[0]))) {
                                    if (!((String)object).equals(b1.y1()) && !((String)object).equals(b1.J0(Tools.C0()))) {
                                        charSequence = new StringBuilder();
                                        ((StringBuilder)charSequence).append(android.ext.i.b);
                                        ((StringBuilder)charSequence).append(".");
                                        charSequence = ((StringBuilder)charSequence).toString();
                                        object = new StringBuilder();
                                        ((StringBuilder)object).append(this.g);
                                        ((StringBuilder)object).append(".Application");
                                        if (((StringBuilder)object).toString().equals(object2.applicationInfo.className)) {
                                            int n3;
                                            block19: {
                                                int n4 = b1.m((ComponentInfo[])object2.activities, this.g, (String)charSequence) + b1.m((ComponentInfo[])object2.receivers, this.g, (String)charSequence) + b1.m((ComponentInfo[])object2.services, this.g, (String)charSequence) + b1.m((ComponentInfo[])object2.providers, this.g, (String)charSequence);
                                                charSequence = object2.instrumentation;
                                                n3 = n4;
                                                if (charSequence != null) {
                                                    if (((CharSequence)charSequence).length == 1 && this.g.equals(((InstrumentationInfo)charSequence[0]).targetPackage) && this.g.equals(object2.instrumentation[0].packageName)) {
                                                        charSequence = new StringBuilder();
                                                        ((StringBuilder)charSequence).append(this.g);
                                                        ((StringBuilder)charSequence).append(".Instrumentation");
                                                        if (((StringBuilder)charSequence).toString().equals(object2.instrumentation[0].name)) {
                                                            block20: {
                                                                int n5 = 0;
                                                                while (true) {
                                                                    charSequence = object2.instrumentation;
                                                                    n3 = n4++;
                                                                    if (n5 >= ((CharSequence)charSequence).length) break block19;
                                                                    charSequence = charSequence[n5];
                                                                    if (!this.g.equals(((InstrumentationInfo)charSequence).packageName)) break block20;
                                                                    if (!this.g.equals(((InstrumentationInfo)charSequence).targetPackage)) break;
                                                                    ++n5;
                                                                }
                                                                throw b1.J1("instrumentation");
                                                            }
                                                            throw b1.J1("instrumentation");
                                                        }
                                                    }
                                                    throw b1.J1("instrumentation");
                                                }
                                            }
                                            if (n3 != 0) {
                                                charSequence = object2.providers;
                                                if (charSequence != null && ((CharSequence)charSequence).length == 1) {
                                                    object2 = charSequence[0];
                                                    charSequence = new StringBuilder();
                                                    ((StringBuilder)charSequence).append(this.g);
                                                    ((StringBuilder)charSequence).append(".FileProvider");
                                                    if (((StringBuilder)charSequence).toString().equals(object2.name)) {
                                                        if (this.g.equals(object2.authority)) {
                                                            b1.q();
                                                            e1.d("verify: generated APK identity ok");
                                                            return b1.v1(file);
                                                        }
                                                        throw b1.J1("provider");
                                                    }
                                                    throw b1.J1("provider");
                                                }
                                                throw b1.J1("provider");
                                            }
                                            throw b1.J1("component");
                                        }
                                        throw b1.J1("application");
                                    }
                                    throw b1.J1("signature-official");
                                }
                                throw b1.J1("signature-digest");
                            }
                            throw b1.J1("signature");
                        }
                        throw b1.J1("label");
                    }
                    throw b1.J1("application");
                }
                throw b1.J1("version");
            }
            throw b1.J1("package");
        }
        throw b1.J1("archive-parse");
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void M() {
        Object object = z[1];
        if (object == null) {
            object = new StringBuilder();
            object.append("memCache is null 4: 1 ");
            object.append(A[1]);
            throw new v(object.toString());
        }
        try {
            CharSequence charSequence;
            int n3;
            Object object2 = android.ext.s.e(android.ext.s.e(android.ext.s.e(object, android.ext.i.b, this.g, "package"), android.ext.i.c, this.h, "label"), b1.I0(), this.i, "versionName");
            object = b1.v0(null, 4, b1.H0());
            int n4 = 0;
            object2 = android.ext.s.d((byte[])object2, b1.v0(object, 0, 0x10000008), b1.v0(b1.v0(null, 4, this.j), 0, 0x10000008), "versionCode");
            object = object2;
            if (y != 0) {
                object = b1.v0(null, 0, 2130968620);
                n3 = y == 1 ? 0x7F070000 : 2131165185;
                object = android.ext.s.d((byte[])object2, object, b1.v0(null, 0, n3), "icon_gg");
                object2 = b1.v0(null, 0, 2131165188);
                n3 = y == 1 ? 2131165186 : 2131165187;
                object2 = android.ext.s.d(object, (byte[])object2, b1.v0(null, 0, n3), "icon_hw");
                object = b1.v0(null, 0, 0x7F070007);
                n3 = y == 1 ? 2131165189 : 2131165190;
                object = android.ext.s.d((byte[])object2, object, b1.v0(null, 0, n3), "icon_sw");
            }
            object2 = new String[6];
            object2[0] = (byte)"Application";
            object2[1] = (byte)"Receiver";
            object2[2] = (byte)"MainActivity";
            object2[3] = (byte)"ActivityMain";
            object2[4] = (byte)"FileProvider";
            object2[5] = (byte)"AnalyticsService";
            for (n3 = n4; n3 < 6; charSequence = ((StringBuilder)charSequence).toString(), ++n3) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(android.ext.i.b);
                ((StringBuilder)charSequence).append(".");
                ((StringBuilder)charSequence).append((String)object2[n3]);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.g);
                stringBuilder.append(".");
                stringBuilder.append((String)object2[n3]);
                String string2 = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append("component:");
                stringBuilder.append((String)object2[n3]);
                object = android.ext.s.e(object, (String)charSequence, string2, stringBuilder.toString());
            }
            object2 = new StringBuilder;
            ((StringBuilder)object2)();
            ((StringBuilder)object2).append(android.ext.i.b);
            ((StringBuilder)object2).append(".Instrumentation");
            charSequence = ((StringBuilder)object2).toString();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(this.g);
            ((StringBuilder)object2).append(".Instrumentation");
            object = android.ext.s.e(object, (String)charSequence, ((StringBuilder)object2).toString(), "component:Instrumentation");
            b1.z[1] = object;
            return;
        }
        catch (IOException iOException) {}
        object = new StringBuilder();
        object.append("manifest rewrite failed: ");
        object.append(iOException.getMessage());
        throw new v(object.toString(), iOException);
    }

    static y M0(int n3, boolean bl, boolean bl2) {
        if (n3 != -1) {
            return android.ext.b1$y.a;
        }
        n3 = android.ext.b1$h.a[b1.h(bl2, bl).ordinal()];
        if (n3 != 1) {
            if (n3 != 2) {
                return android.ext.b1$y.d;
            }
            return android.ext.b1$y.c;
        }
        return android.ext.b1$y.b;
    }

    private static void M1(File object, String object2) {
        Object object3;
        block12: {
            object3 = new ZipFile((File)object);
            Object object4 = b1.e1((ZipFile)object3, "META-INF/CERT.RSA");
            byte[] byArray = b1.e1((ZipFile)object3, "META-INF/CERT.SF");
            object = b1.e1((ZipFile)object3, "META-INF/MANIFEST.MF");
            if (object4 == null || byArray == null || object == null) break block12;
            if (b1.w((byte[])object4) == ((byte[])object4).length) {
                block13: {
                    block14: {
                        try {
                            object3 = CertificateFactory.getInstance("X.509");
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object4);
                            object3 = ((CertificateFactory)object3).generateCertificates(byteArrayInputStream);
                            if (object3.size() != 1) break block13;
                            object3 = object3.iterator().next();
                            if (!((String)object2).equals(m0.i(MessageDigest.getInstance("SHA-256").digest(((Certificate)object3).getEncoded())))) break block14;
                        }
                        catch (CertificateException certificateException) {
                            throw b1.K1("signature", certificateException);
                        }
                        object2 = b1.s((byte[])object4);
                        if (object2 != null) {
                            block15: {
                                try {
                                    object4 = Signature.getInstance("SHA256withRSA");
                                    ((Signature)object4).initVerify(((Certificate)object3).getPublicKey());
                                    ((Signature)object4).update(byArray);
                                    boolean bl = ((Signature)object4).verify((byte[])object2);
                                    if (!bl) break block15;
                                }
                                catch (GeneralSecurityException generalSecurityException) {
                                    throw b1.K1("signature", generalSecurityException);
                                }
                                object2 = b1.x1(byArray);
                                if (object2 != null) {
                                    if (((String)object2).equals(m0.h(MessageDigest.getInstance("SHA-256").digest((byte[])object)))) {
                                        return;
                                    }
                                    throw b1.J1("signature");
                                }
                                throw b1.J1("signature");
                            }
                            throw b1.J1("signature");
                        }
                        throw b1.J1("signature");
                    }
                    throw b1.J1("signature");
                }
                throw b1.J1("signature");
            }
            throw b1.J1("signature");
        }
        throw b1.J1("signature");
        finally {
            ((ZipFile)object3).close();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void N(b0 object) {
        byte[] byArray = new byte[8];
        Object object2 = ByteBuffer.wrap(byArray).order(ByteOrder.LITTLE_ENDIAN);
        long l3 = ((b0)object).b();
        ((b0)object).f(0L);
        int n3 = 0;
        long l4 = -1L;
        int n4 = 0;
        while (((b0)object).c() < l3) {
            int n5;
            long l5;
            if (((b0)object).d(byArray) != 8) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("fixResources: truncated resource-table chunk header at ");
                ((StringBuilder)object2).append(((b0)object).c());
                throw new v(((StringBuilder)object2).toString());
            }
            s s3 = new s((ByteBuffer)object2);
            int n6 = s3.b;
            if (n6 >= 8 && s3.c >= n6 && (l5 = ((b0)object).c()) + (long)((n5 = s3.c) - 8) <= l3) {
                n6 = s3.a;
                if (n6 == 512) {
                    if (++n3 > 1) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("fixResources: expected exactly one RES_TABLE_PACKAGE_TYPE chunk, found ");
                        ((StringBuilder)object).append(n3);
                        throw new v(((StringBuilder)object).toString());
                    }
                    l4 = ((b0)object).c();
                    n4 = s3.b;
                    ((b0)object).g(s3.c - 8);
                    l4 -= 8L;
                    continue;
                }
                n6 = n6 == 2 ? s3.b - 8 : n5 - 8;
                ((b0)object).g(n6);
                continue;
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("fixResources: invalid resource-table chunk at ");
            ((StringBuilder)object2).append(((b0)object).c() - 8L);
            throw new v(((StringBuilder)object2).toString());
        }
        if (n3 == 1 && l4 >= 0L) {
            if (n4 < 268) {
                throw new v("fixResources: package chunk header too small for the name field");
            }
            l4 += 12L;
            if (this.g.length() >= 30) {
                throw new v("fixResources: generated package name does not fit the 30-unit field");
            }
            object2 = Arrays.copyOf(this.g.getBytes(t1.i(true)), 60);
            ((b0)object).f(l4);
            ((b0)object).h((byte[])object2);
            n4 = this.g.length() * 2;
            object2 = new byte[n4];
            ((b0)object).f(l4);
            if (((b0)object).d((byte[])object2) == n4 && this.g.equals(new String((byte[])object2, t1.i(true)))) {
                return;
            }
            throw new v("fixResources: package name read-back mismatch");
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("fixResources: expected exactly one RES_TABLE_PACKAGE_TYPE chunk, found ");
        ((StringBuilder)object).append(n3);
        throw new v(((StringBuilder)object).toString());
    }

    static boolean N0(int n3) {
        boolean bl;
        boolean bl2 = bl = true;
        if (n3 != 1) {
            bl2 = n3 == 2 ? bl : false;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void N1() {
        String string2;
        CharSequence charSequence;
        block6: {
            FileInputStream fileInputStream;
            block7: {
                Throwable throwable2;
                block5: {
                    int n3;
                    int n4;
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(b1.C.o);
                    ((StringBuilder)charSequence).append(' ');
                    ((StringBuilder)charSequence).append(b1.C.n);
                    string2 = ((StringBuilder)charSequence).toString();
                    File file = b1.C("repack-binding.txt");
                    boolean bl = file.isFile();
                    fileInputStream = null;
                    Object var6_7 = null;
                    charSequence = fileInputStream;
                    if (!bl) break block6;
                    charSequence = fileInputStream;
                    if (file.length() <= 0L) break block6;
                    charSequence = fileInputStream;
                    if (file.length() > 256L) break block6;
                    int n5 = (int)file.length();
                    byte[] byArray = new byte[n5];
                    fileInputStream = new FileInputStream(file);
                    for (n3 = 0; n3 < n5; n3 += n4) {
                        try {
                            n4 = ((InputStream)fileInputStream).read(byArray, n3, n5 - n3);
                            if (n4 < 0) break;
                            continue;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    charSequence = var6_7;
                    if (n3 == n5) {
                        charSequence = new String(byArray, "US-ASCII");
                        charSequence = ((String)charSequence).trim();
                    }
                    break block7;
                }
                ((InputStream)fileInputStream).close();
                throw throwable2;
            }
            ((InputStream)fileInputStream).close();
        }
        if (string2.equals(charSequence)) {
            return;
        }
        throw b1.J1("binding-mismatch");
    }

    private void O() {
        Object object = this.p;
        if (object != null && !object.isEmpty()) {
            for (Map.Entry entry : object.entrySet()) {
                Throwable throwable2;
                block5: {
                    block4: {
                        object = new b0(this, (byte[])entry.getValue(), (String)entry.getKey());
                        try {
                            if (!this.I((b0)object, false)) break block4;
                            this.P().add((String)entry.getKey());
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    ((b0)object).a();
                    object = new StringBuilder();
                    ((StringBuilder)object).append("fixSecondaryDex: ");
                    ((StringBuilder)object).append((String)entry.getKey());
                    e1.d(((StringBuilder)object).toString());
                    continue;
                }
                ((b0)object).a();
                throw throwable2;
            }
        }
    }

    private static int O0() {
        return e2.k(null);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void O1(Intent intent) {
        Throwable throwable2;
        Runnable runnable;
        Handler handler;
        block6: {
            block5: {
                c0 c02 = b1.j0();
                c02.j |= 4;
                handler = n2.d();
                runnable = new Runnable(){

                    @Override
                    public void run() {
                        b1.Q1(4);
                    }
                };
                handler.postDelayed(runnable, 300000L);
                try {
                    android.ext.r.n.startActivityForResult(intent, 4);
                    while ((c02.j & 4) == 4) {
                        Thread.sleep(500L);
                    }
                    break block5;
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                catch (InterruptedException interruptedException) {}
                {
                    e1.l("Interrupted preflight wait", interruptedException);
                }
            }
            handler.removeCallbacks(runnable);
            return;
        }
        handler.removeCallbacks(runnable);
        throw throwable2;
    }

    private Set P() {
        HashSet hashSet;
        HashSet hashSet2 = hashSet = this.q;
        if (hashSet == null) {
            this.q = hashSet2 = new HashSet();
        }
        return hashSet2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static y P0() {
        Throwable throwable2222222;
        block6: {
            block5: {
                Object object = b1.j0();
                b1.R1("preflight-manual-start");
                b1.r1(b2.f(2131296863));
                object.i = true;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("package:");
                stringBuilder.append(Tools.C0());
                stringBuilder = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse((String)stringBuilder.toString()));
                c0.p = true;
                c0.q = false;
                b1.O1((Intent)stringBuilder);
                boolean bl = c0.q;
                object.i = false;
                c0.p = false;
                c0.q = false;
                if (!bl) break block5;
                {
                    catch (Throwable throwable2222222) {
                        break block6;
                    }
                    catch (RuntimeException runtimeException) {}
                    {
                        b1.Q1(4);
                        object.i = false;
                        e1.l("Fail preflight settings", runtimeException);
                        object = android.ext.b1$y.d;
                        c0.p = false;
                        c0.q = false;
                        return object;
                    }
                }
                if (b1.u0()) {
                    b1.R1("preflight-manual-granted");
                    return android.ext.b1$y.b;
                }
            }
            return android.ext.b1$y.d;
        }
        c0.p = false;
        c0.q = false;
        throw throwable2222222;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void P1(Intent intent, int n3) {
        Throwable throwable2;
        Runnable runnable;
        c0 c02;
        block6: {
            block5: {
                c02 = C;
                c02.j |= n3;
                c02 = n2.d();
                runnable = new Runnable(this, n3){
                    final int a;
                    final b1 b;
                    {
                        this.b = b12;
                        this.a = n3;
                    }

                    @Override
                    public void run() {
                        b1.C.j &= ~this.a;
                    }
                };
                c02.postDelayed(runnable, 300000L);
                try {
                    android.ext.r.n.startActivityForResult(intent, n3);
                    while ((b1.C.j & n3) == n3) {
                        Thread.sleep(500L);
                        if (n3 != 1 || !Tools.e1(this.g)) continue;
                        b1.C.j &= ~n3;
                    }
                    break block5;
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                catch (InterruptedException interruptedException) {}
                {
                    e1.l("Interrupted wait", interruptedException);
                }
            }
            c02.removeCallbacks(runnable);
            n2.i(new Runnable(this){
                final b1 a;
                {
                    this.a = b12;
                }

                @Override
                public void run() {
                    this.a.E();
                }
            });
            return;
        }
        c02.removeCallbacks(runnable);
        throw throwable2;
    }

    private static void Q(MessageDigest messageDigest, byte by, byte[] byArray) {
        messageDigest.update(by);
        int n3 = byArray.length;
        messageDigest.update((byte)(n3 >>> 24));
        messageDigest.update((byte)(n3 >>> 16));
        messageDigest.update((byte)(n3 >>> 8));
        messageDigest.update((byte)n3);
        messageDigest.update(byArray, 0, n3);
    }

    static boolean Q0(int n3) {
        boolean bl = true;
        if (n3 != 1) {
            bl = false;
        }
        return bl;
    }

    private static void Q1(int n3) {
        c0 c02 = C;
        if (c02 == null) {
            return;
        }
        c02.j = ~n3 & c02.j;
    }

    private void R(Manifest object, OutputStream outputStream) {
        outputStream.write("Signature-Version: 1.0\r\n".getBytes());
        outputStream.write("Created-By: 1.0 (Android SignApk)\r\n".getBytes());
        this.n.reset();
        PrintStream printStream = new PrintStream((OutputStream)new DigestOutputStream(new x(), this.n), true, "UTF-8");
        ((Manifest)((Object)object)).write(printStream);
        printStream.flush();
        CharSequence charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("SHA-256-Digest-Manifest: ");
        ((StringBuilder)charSequence).append(m0.h(this.n.digest()));
        ((StringBuilder)charSequence).append("\r\n\r\n");
        outputStream.write(((StringBuilder)charSequence).toString().getBytes());
        for (Map.Entry<String, Attributes> entry : ((Manifest)((Object)object)).getEntries().entrySet()) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Name: ");
            ((StringBuilder)charSequence).append(entry.getKey());
            ((StringBuilder)charSequence).append("\r\n");
            charSequence = ((StringBuilder)charSequence).toString();
            printStream.print((String)charSequence);
            for (Map.Entry<Object, Object> entry2 : entry.getValue().entrySet()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(entry2.getKey());
                stringBuilder.append(": ");
                stringBuilder.append(entry2.getValue());
                stringBuilder.append("\r\n");
                printStream.print(stringBuilder.toString());
            }
            printStream.print("\r\n");
            printStream.flush();
            outputStream.write(((String)charSequence).getBytes());
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("SHA-256-Digest: ");
            ((StringBuilder)charSequence).append(m0.h(this.n.digest()));
            ((StringBuilder)charSequence).append("\r\n\r\n");
            outputStream.write(((StringBuilder)charSequence).toString().getBytes());
        }
        outputStream.flush();
    }

    static int R0(y y3) {
        int n3 = android.ext.b1$h.b[y3.ordinal()];
        int n4 = 1;
        if (n3 != 1) {
            n4 = 2;
            if (n3 != 2) {
                n4 = 3;
                if (n3 != 3) {
                    return 0;
                }
            }
        }
        return n4;
    }

    /*
     * Unable to fully structure code
     */
    static void R1(String var0) {
        if (var0 == null) {
            var0 = "Failed write install stage: null code";
lbl3:
            // 2 sources

            while (true) {
                e1.p(var0);
                return;
            }
        }
        for (var1_2 = 0; var1_2 < (var2_3 = b1.u).length; ++var1_2) {
            if (!var2_3[var1_2].equals(var0)) continue;
            try {
                b1.T1("self-install.stage", var0);
            }
            catch (Throwable var0_1) {
                e1.s("Failed write install stage", var0_1);
            }
            return;
        }
        var0 = "Failed write install stage: unknown code";
        ** while (true)
    }

    private byte[] S() {
        byte[] byArray;
        byte[] byArray2 = byArray = this.s;
        if (byArray == null) {
            this.s = byArray2 = new byte[65536];
        }
        return byArray2;
    }

    private static void S0() {
        n2.i(new Runnable(){

            @Override
            public void run() {
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this){
                    final m a;
                    {
                        this.a = m3;
                    }

                    public void onClick(DialogInterface object, int n3) {
                        if (n3 == -1) {
                            object = b1.j0();
                            object.l = 0;
                            object.m = false;
                            b1.z1();
                        } else {
                            b1.k(false);
                        }
                    }
                };
                android.ext.f.o(android.ext.f.c(android.ext.r.p).setMessage((CharSequence)b2.f(2131296437)).setPositiveButton(2131297115, onClickListener).setNegativeButton(2131296805, onClickListener).setCancelable(false));
            }
        });
    }

    private static void S1() {
        try {
            if (!Tools.e1(android.ext.i.b)) {
                b1.R1("installer-removed");
                b1.f("installer-removed");
            }
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    private File T(boolean bl) {
        Object object;
        int n3;
        Serializable serializable = new ArrayList<Object>();
        if (bl) {
            ((ArrayList)serializable).add(Tools.p0());
            ((ArrayList)serializable).add(Tools.b0());
        }
        try {
            ((ArrayList)serializable).add(android.ext.r.p.getExternalCacheDir());
        }
        catch (Throwable throwable) {
            e1.l("Fail get path", throwable);
        }
        int n4 = 0;
        Object object2 = android.ext.r.p.getExternalCacheDirs();
        int n5 = ((File[])object2).length;
        for (n3 = 0; n3 < n5; ++n3) {
            try {
                ((ArrayList)serializable).add(object2[n3]);
                continue;
            }
            catch (Throwable throwable) {
                e1.l("Fail get path", throwable);
                break;
            }
        }
        try {
            ((ArrayList)serializable).add(android.ext.r.p.getExternalFilesDir(null));
        }
        catch (Throwable throwable) {
            e1.l("Fail get path", throwable);
        }
        object2 = android.ext.r.p.getExternalFilesDirs(null);
        n5 = ((File[])object2).length;
        for (n3 = n4; n3 < n5; ++n3) {
            try {
                ((ArrayList)serializable).add(object2[n3]);
                continue;
            }
            catch (Throwable throwable) {
                e1.l("Fail get path", throwable);
                break;
            }
        }
        try {
            ((ArrayList)serializable).add(Environment.getExternalStorageDirectory());
        }
        catch (Throwable throwable) {
            e1.l("Fail get path", throwable);
        }
        try {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("/sdcard/Android/data/");
            ((StringBuilder)object2).append(Tools.C0());
            ((StringBuilder)object2).append("/files");
            object = new File(((StringBuilder)object2).toString());
            ((ArrayList)serializable).add(object);
            object = new StringBuilder();
            ((StringBuilder)object).append("/mnt/sdcard/Android/data/");
            ((StringBuilder)object).append(Tools.C0());
            ((StringBuilder)object).append("/files");
            object2 = new File(((StringBuilder)object).toString());
            ((ArrayList)serializable).add(object2);
            object = new StringBuilder();
            ((StringBuilder)object).append("/sdcard/Android/data/");
            ((StringBuilder)object).append(Tools.C0());
            ((StringBuilder)object).append("/cache");
            object2 = new File(((StringBuilder)object).toString());
            ((ArrayList)serializable).add(object2);
            object = new StringBuilder();
            ((StringBuilder)object).append("/mnt/sdcard/Android/data/");
            ((StringBuilder)object).append(Tools.C0());
            ((StringBuilder)object).append("/cache");
            object2 = new File(((StringBuilder)object).toString());
            ((ArrayList)serializable).add(object2);
        }
        catch (Throwable throwable) {
            e1.l("Fail get path", throwable);
        }
        ((ArrayList)serializable).add(new File("/sdcard"));
        ((ArrayList)serializable).add(new File("/mnt/sdcard"));
        ((ArrayList)serializable).add(new File("/data/local/tmp"));
        ((ArrayList)serializable).add(Tools.b0());
        ((ArrayList)serializable).add(Tools.p0());
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Failed getDir: ");
        object = ((ArrayList)serializable).iterator();
        while (object.hasNext()) {
            serializable = (File)object.next();
            String string2 = this.w0((File)serializable);
            if (string2 == null) {
                return serializable;
            }
            if (serializable == null) continue;
            ((StringBuilder)object2).append(((File)serializable).getAbsolutePath());
            ((StringBuilder)object2).append(": ");
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append("; ");
        }
        throw new RuntimeException(((StringBuilder)object2).toString());
    }

    private static void T0(String string2, int n3, int n4, Intent[] intentArray) {
        n2.i(new Runnable(n3, intentArray, n4, string2){
            final int a;
            final Intent[] b;
            final int c;
            final String d;
            {
                this.a = n3;
                this.b = intentArray;
                this.c = n4;
                this.d = string2;
            }

            @Override
            public void run() {
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this){
                    final a a;
                    {
                        this.a = a4;
                    }

                    /*
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     */
                    public void onClick(DialogInterface intentArray, int n3) {
                        block6: {
                            int n4;
                            int n5;
                            block7: {
                                block5: {
                                    if (n3 == -2) break block5;
                                    n5 = -1;
                                    if (n3 != -1) break block6;
                                    n3 = this.a.a;
                                    n3 = n3 == 1 ? L % this.a.b.length : 0;
                                    intentArray = this.a.b;
                                    n4 = intentArray.length;
                                    break block7;
                                }
                                b1.C.j &= ~this.a.a;
                                break block6;
                            }
                            for (int i3 = 0; i3 < n4; ++i3) {
                                Throwable throwable2;
                                block4: {
                                    Intent intent;
                                    block3: {
                                        intent = intentArray[i3];
                                        if (++n5 < n3) continue;
                                        try {
                                            if (this.a.a != 1) break block3;
                                            ++L;
                                        }
                                        catch (Throwable throwable2) {
                                            break block4;
                                        }
                                    }
                                    android.ext.r.n.startActivityForResult(intent, this.a.a);
                                    break;
                                }
                                e1.l("intent fail", throwable2);
                            }
                        }
                        b1.B.r = null;
                    }
                };
                B.E();
                AlertDialog.Builder builder = android.ext.f.c(android.ext.r.p);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(L);
                stringBuilder.append(": [");
                stringBuilder.append(this.c);
                stringBuilder.append("] ");
                stringBuilder.append(this.d);
                builder = builder.setMessage((CharSequence)stringBuilder.toString()).setPositiveButton(2131297115, onClickListener).setNegativeButton(2131296805, onClickListener).setCancelable(false).create();
                android.ext.f.m((AlertDialog)builder);
                b1.B.r = builder;
            }
        });
    }

    private static void T1(String string2, String string3) {
        b1.U1(string2, string3, false);
    }

    private String U(InputStream inputStream) {
        this.n.reset();
        inputStream = new DigestInputStream(inputStream, this.n);
        try {
            int n3;
            byte[] byArray = this.S();
            while ((n3 = inputStream.read(byArray)) != -1) {
            }
        }
        catch (Throwable throwable) {
            inputStream.close();
            throw throwable;
        }
        inputStream.close();
        return m0.h(this.n.digest());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String U0(ZipEntry zipEntry, ZipOutputStream zipOutputStream, int n3) {
        Object object;
        long l3;
        long l4;
        Object object2;
        block3: {
            zipOutputStream.putNextEntry(zipEntry);
            this.l.reset();
            object2 = new DigestInputStream(this.Z(n3), this.l);
            l3 = l4 = 0L;
            try {
                object = this.S();
                break block3;
            }
            catch (Throwable throwable) {}
            ((InputStream)object2).close();
            object2 = Base64.encodeToString((byte[])this.l.digest(), (int)2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("put ");
            stringBuilder.append(zipEntry.getName());
            stringBuilder.append(": ");
            stringBuilder.append((String)object2);
            stringBuilder.append("; ");
            stringBuilder.append(l3);
            e1.d(stringBuilder.toString());
            throw throwable;
        }
        while (true) {
            l3 = l4;
            n3 = ((InputStream)object2).read((byte[])object);
            if (n3 == -1) break;
            if (n3 == 0) continue;
            l3 = l4;
            zipOutputStream.write((byte[])object, 0, n3);
            l4 += (long)n3;
        }
        ((InputStream)object2).close();
        object2 = Base64.encodeToString((byte[])this.l.digest(), (int)2);
        object = new StringBuilder();
        ((StringBuilder)object).append("put ");
        ((StringBuilder)object).append(zipEntry.getName());
        ((StringBuilder)object).append(": ");
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append("; ");
        ((StringBuilder)object).append(l4);
        e1.d(((StringBuilder)object).toString());
        ((OutputStream)zipOutputStream).flush();
        zipOutputStream.closeEntry();
        return object2;
    }

    private static void U1(String object, String string2, boolean bl) {
        File file = b1.C((String)object);
        object = new FileOutputStream(file, bl);
        Tools.q(file, 384);
        try {
            ((OutputStream)object).write(string2.getBytes("US-ASCII"));
            return;
        }
        finally {
            ((OutputStream)object).close();
        }
    }

    private File V(int n3) {
        File file = new File(this.b, x[n3].replace('/', '@'));
        if (file.exists()) {
            Tools.q(file, 384);
        }
        return file;
    }

    private void V0(ZipEntry object, InputStream inputStream, ZipOutputStream zipOutputStream) {
        int n3 = ((ZipEntry)object).getMethod();
        long l3 = -1L;
        if (n3 != 0) {
            ((ZipEntry)object).setCompressedSize(-1L);
        }
        Object object2 = object;
        if (y != 0) {
            object2 = ((ZipEntry)object).getName();
            String string2 = "res/raw/ydw3a".equals(object2) ? (y == 1 ? "lib/armeabi/libAndroid.so" : "lib/arm64-v8a/libAndroid.so") : null;
            if ("res/raw/ydw3x".equals(object2)) {
                string2 = y == 1 ? "lib/x86/libAndroid.so" : "lib/x86_64/libAndroid.so";
            }
            object2 = object;
            if (string2 != null) {
                object2 = new ZipEntry(string2);
                ((ZipEntry)object2).setTime(((ZipEntry)object).getTime());
                ((ZipEntry)object2).setMethod(((ZipEntry)object).getMethod());
                ((ZipEntry)object2).setCrc(((ZipEntry)object).getCrc());
                ((ZipEntry)object2).setSize(((ZipEntry)object).getSize());
                if (((ZipEntry)object).getMethod() == 0) {
                    l3 = ((ZipEntry)object).getSize();
                }
                ((ZipEntry)object2).setCompressedSize(l3);
                ((ZipEntry)object2).setExtra(((ZipEntry)object).getExtra());
                ((ZipEntry)object2).setComment(((ZipEntry)object).getComment());
                ((ZipEntry)object2).setMethod(0);
            }
        }
        zipOutputStream.putNextEntry((ZipEntry)object2);
        object = this.S();
        while ((n3 = inputStream.read((byte[])object)) != -1) {
            zipOutputStream.write((byte[])object, 0, n3);
        }
        ((OutputStream)zipOutputStream).flush();
        zipOutputStream.closeEntry();
    }

    private void V1() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(b1.C.o);
        stringBuilder.append(' ');
        stringBuilder.append(b1.C.n);
        b1.T1("repack-binding.txt", stringBuilder.toString());
    }

    private static File W(String string2) {
        File file = Tools.q0();
        file.mkdirs();
        return new File(file, string2.replace('/', '@'));
    }

    private static String W0(String string2) {
        StringBuilder stringBuilder = new StringBuilder(string2.length() + 2);
        stringBuilder.append('\'');
        for (int i3 = 0; i3 < string2.length(); ++i3) {
            char c4 = string2.charAt(i3);
            if (c4 == '\'') {
                stringBuilder.append("'\\''");
                continue;
            }
            stringBuilder.append(c4);
        }
        stringBuilder.append('\'');
        return stringBuilder.toString();
    }

    private static void W1(String string2) {
        try {
            b1.T1("verify-generated-apk.fail", string2);
        }
        catch (Throwable throwable) {
            e1.s("Failed write verify marker", throwable);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String X() {
        if (b1.O != null) return b1.O;
        var19 = b1.P;
        synchronized (var19) {
            block16: {
                block21: {
                    block17: {
                        block20: {
                            block19: {
                                block18: {
                                    try {
                                        if (b1.O != null) return b1.O;
                                        var9_1 = -System.currentTimeMillis();
                                        var20_2 = new StringBuilder();
                                    }
                                    catch (Throwable var14_19) {
                                        break block16;
                                    }
                                    try {
                                        var21_3 = new ZipFile(b1.i0());
                                    }
                                    catch (Throwable var14_18) {
                                        break block17;
                                    }
                                    try {
                                        var17_4 = var21_3.entries();
                                        var5_5 = 0L;
                                        var3_6 = 0L;
                                        var0_7 = 0;
                                        var18_8 = null;
                                        var16_9 = null;
                                        var15_10 = null;
lbl24:
                                        // 2 sources

                                        while (var17_4.hasMoreElements()) {
                                            var14_16 = var17_4.nextElement();
                                            var13_15 = var14_16.getName().contains("META-INF");
                                            var2_12 = b1.Y((ZipEntry)var14_16);
                                            b1.r(var20_2, var18_8);
                                            var7_13 = var5_5;
                                            var1_11 = var0_7;
                                            if (var16_9 == null) break block18;
                                            var7_13 = var5_5 + var16_9.getSize();
                                            var1_11 = var0_7 + 1;
                                            break block18;
                                        }
                                        break block19;
                                    }
                                    catch (Throwable var14_17) {
                                        break block20;
                                    }
                                }
                                var5_5 = var3_6;
                                if (var15_10 != null) {
                                    var5_5 = var3_6 + var15_10.getCrc();
                                }
                                if (var2_12 != 1 && var2_12 != 0 && var2_12 != 2) {
                                    var15_10 = var13_15 == false ? var14_16 : null;
                                    var16_9 = null;
                                } else {
                                    var20_2.append(var2_12);
                                    var20_2.append('-');
                                    var15_10 = MessageDigest.getInstance("S@H@A@-@3@8@4".replace("@", ""));
                                    var11_14 = -System.currentTimeMillis();
                                    var16_9 = var21_3.getInputStream((ZipEntry)var14_16);
                                    var15_10 = var2_12 == 2 ? b1.q0((InputStream)var16_9, (MessageDigest)var15_10) : (var2_12 == 0 ? b1.o0((InputStream)var16_9, (MessageDigest)var15_10, Tools.C0(), (int)var14_16.getSize()) : b1.p0((InputStream)var16_9, (MessageDigest)var15_10));
                                    var3_6 = System.currentTimeMillis();
                                    var16_9 = new StringBuilder();
                                    var16_9.append("HH: ");
                                    var16_9.append(var2_12);
                                    var16_9.append(" = ");
                                    var16_9.append(var11_14 + var3_6);
                                    e1.d(var16_9.toString());
                                    var20_2.append(var14_16.getMethod());
                                    var20_2.append('-');
                                    var20_2.append(var14_16.getTime());
                                    var20_2.append('-');
                                    var20_2.append((String)var15_10);
                                    var16_9 = var14_16;
                                    var15_10 = null;
                                }
                                if (var13_15) {
                                    var14_16 = null;
                                }
                                var3_6 = var5_5;
                                var5_5 = var7_13;
                                var0_7 = var1_11;
                                var18_8 = var16_9;
                                var16_9 = var14_16;
                                ** GOTO lbl24
                            }
                            b1.r(var20_2, var18_8);
                            var7_13 = var5_5;
                            var1_11 = var0_7;
                            if (var16_9 != null) {
                                var7_13 = var5_5 + var16_9.getSize();
                                var1_11 = var0_7 + 1;
                            }
                            var5_5 = var3_6;
                            if (var15_10 != null) {
                                var5_5 = var3_6 + var15_10.getCrc();
                            }
                            var20_2.append(var7_13);
                            var20_2.append(' ');
                            var20_2.append(var1_11);
                            var20_2.append(' ');
                            var20_2.append(Long.toHexString(var5_5));
                            var21_3.close();
                            break block21;
                        }
                        var21_3.close();
                        throw var14_17;
                    }
                    e1.l("Failed get hashes", var14_18);
                    var20_2.append("e:");
                    var20_2.append(var14_18);
                }
                b1.O = var20_2.toString();
                var3_6 = System.currentTimeMillis();
                var14_16 = new StringBuilder();
                var14_16.append("HH: ");
                var14_16.append(var9_1 + var3_6);
                e1.d(var14_16.toString());
                return b1.O;
            }
            throw var14_19;
        }
    }

    private static long X0(int n3, int n4) {
        long l3 = n3;
        return (long)n4 & 0xFFFFFFFFL | l3 << 32;
    }

    private static int Y(ZipEntry stringArray) {
        int n3;
        block2: {
            String string2 = stringArray.getName();
            for (n3 = 0; n3 < (stringArray = x).length; ++n3) {
                if (!stringArray[n3].equals(string2)) {
                    continue;
                }
                break block2;
            }
            n3 = -1;
        }
        return n3;
    }

    private static int Y0(InputStream inputStream, byte[] byArray) {
        return b1.Z0(inputStream, byArray, 0, byArray.length);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private InputStream Z(int n3) {
        void var2_7;
        if (!A[n3]) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getInputStream: ");
            stringBuilder.append(n3);
            e1.d(stringBuilder.toString());
            z z3 = new z(this.h0(n3));
            return var2_7;
        }
        byte[][] byArray = z;
        if (byArray != null && byArray[n3] != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(z[n3]);
            return var2_7;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("memCache is null 1: ");
        stringBuilder.append(n3);
        stringBuilder.append(' ');
        stringBuilder.append(z);
        throw new v(stringBuilder.toString());
    }

    private static int Z0(InputStream inputStream, byte[] byArray, int n3, int n4) {
        int n5;
        int n6;
        for (n5 = 0; n5 < n4; n5 += n6) {
            n6 = inputStream.read(byArray, n3 + n5, n4 - n5);
            if (n6 > 0) continue;
            n3 = n5;
            if (n5 == 0) {
                n3 = -1;
            }
            return n3;
        }
        return n5;
    }

    private boolean a() {
        CharSequence charSequence;
        b1.o();
        if (Tools.e1(this.g)) {
            b1.t1(800);
        }
        if (b1.C.b < 600) {
            b1.t1(0);
            b1.R1("repack-start");
            this.F();
            b1.t1(200);
            this.J();
            b1.t1(400);
            this.u();
            charSequence = this.e;
            if (charSequence != null) {
                b1.R1("verify-start");
                this.t(this.L1(this.d, (String)charSequence), (String)charSequence);
                b1.R1("verify-pass");
                b1.t1(600);
                this.g();
            } else {
                throw b1.J1("signature-digest");
            }
        }
        if (b1.C.b < 800) {
            b1.t1(600);
            this.v();
            charSequence = new StringBuilder();
            c0 c02 = C;
            ((StringBuilder)charSequence).append(c02.k);
            ((StringBuilder)charSequence).append(this.s0());
            c02.k = ((StringBuilder)charSequence).toString();
            b1.t1(800);
        }
        if (Tools.e1(this.g)) {
            b1.R1("package-installed");
            if (b1.C.b < 1000) {
                b1.t1(800);
                this.q1();
                try {
                    this.o1();
                }
                catch (Throwable throwable) {
                    e1.a(throwable);
                }
                b1.t1(1000);
            }
            b1.R1("old-uninstall-start");
            try {
                this.F1();
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
            b1.o();
            return true;
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("package not installed: ");
        ((StringBuilder)charSequence).append(this.g);
        ((StringBuilder)charSequence).append('\n');
        ((StringBuilder)charSequence).append(b1.C.k);
        throw new v(((StringBuilder)charSequence).toString());
    }

    private Intent[] a0() {
        return b1.b0(this.c);
    }

    private static byte[] a1(InputStream inputStream) {
        int n3;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byArray = new byte[8192];
        while ((n3 = inputStream.read(byArray)) != -1) {
            byteArrayOutputStream.write(byArray, 0, n3);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static Intent[] b0(File file) {
        int n3 = Build.VERSION.SDK_INT;
        Intent[] intentArray = new Intent[4];
        n3 = n3 >= 24 ? 1 : 0;
        boolean bl = K;
        int n4 = 0;
        for (int i3 = 0; i3 < 2; ++i3) {
            int n5 = i3 == 0 ? 1 : 0;
            int n6 = n5 ^ n3;
            Uri uri = n6 != 0 ? Uri.fromFile((File)file) : d.c.d(Tools.f0(), android.ext.i.d, file);
            Intent intent = new Intent("android.intent.action.INSTALL_PACKAGE");
            intent.setDataAndType(uri, "application/vnd.android.package-archive");
            intent.addFlags(1);
            intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
            intent.putExtra("android.intent.extra.RETURN_RESULT", true);
            n5 = n4 + 1;
            boolean bl2 = !bl && n6 == 0;
            intentArray[n4] = b1.m0(intent, bl2);
            intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uri, "application/vnd.android.package-archive");
            intent.addFlags(1);
            bl2 = !bl && n6 == 0;
            intentArray[n5] = b1.m0(intent, bl2);
            n4 = n5 + 1;
        }
        K = true;
        return intentArray;
    }

    private static byte[] b1(InputStream inputStream, int n3) {
        if (n3 > 0) {
            byte[] byArray = new byte[n3];
            int n4 = b1.Z0(inputStream, byArray, 0, n3);
            if (n4 == n3) {
                return byArray;
            }
            n3 = n4 < 0 ? 0 : n4;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(n3);
            if (n4 > 0) {
                byteArrayOutputStream.write(byArray, 0, n4);
            }
            byArray = new byte[8192];
            while ((n3 = inputStream.read(byArray)) != -1) {
                byteArrayOutputStream.write(byArray, 0, n3);
            }
            return byteArrayOutputStream.toByteArray();
        }
        return b1.a1(inputStream);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private long c0(int n3) {
        byte[] byArray;
        if (!A[n3]) return this.h0(n3).length();
        byte[][] byArray2 = z;
        if (byArray2 != null && (byArray = byArray2[n3]) != null) {
            return byArray.length;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("memCache is null 2: ");
        stringBuilder.append(n3);
        stringBuilder.append(' ');
        stringBuilder.append(z);
        throw new v(stringBuilder.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private byte[] c1(ZipEntry zipEntry, ZipInputStream object) {
        Throwable throwable2;
        Object object2;
        block4: {
            Object object3;
            this.l.reset();
            Object object4 = new ByteArrayOutputStream();
            object2 = new DigestOutputStream((OutputStream)object4, this.l);
            this.m.reset();
            object = new DigestInputStream((InputStream)object, this.m);
            try {
                int n3;
                object3 = this.S();
                while ((n3 = ((InputStream)object).read((byte[])object3)) != -1) {
                    ((OutputStream)object2).write((byte[])object3, 0, n3);
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            ((OutputStream)object2).flush();
            ((OutputStream)object2).close();
            object2 = Base64.encodeToString((byte[])this.l.digest(), (int)2);
            object = Base64.encodeToString((byte[])this.m.digest(), (int)2);
            object3 = new StringBuilder();
            ((StringBuilder)object3).append("extract ");
            ((StringBuilder)object3).append(zipEntry.getName());
            ((StringBuilder)object3).append(": ");
            ((StringBuilder)object3).append((String)object);
            ((StringBuilder)object3).append(" -> ");
            ((StringBuilder)object3).append((String)object2);
            e1.d(((StringBuilder)object3).toString());
            if (((String)object2).equals(object)) {
                return ((ByteArrayOutputStream)object4).toByteArray();
            }
            object4 = new StringBuilder();
            ((StringBuilder)object4).append("check hash for ");
            ((StringBuilder)object4).append(zipEntry.getName());
            ((StringBuilder)object4).append(": ");
            ((StringBuilder)object4).append((String)object);
            ((StringBuilder)object4).append(" -> ");
            ((StringBuilder)object4).append((String)object2);
            throw new v(((StringBuilder)object4).toString());
        }
        ((OutputStream)object2).close();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Manifest d0(ZipEntry object) {
        Manifest manifest;
        try {
            this.l.reset();
            object = new DigestInputStream(this.Z(3), this.l);
        }
        catch (IOException iOException) {}
        try {
            manifest = new Manifest((InputStream)object);
        }
        catch (Throwable throwable) {
            ((InputStream)object).close();
            throw throwable;
        }
        ((InputStream)object).close();
        object = new StringBuilder();
        ((StringBuilder)object).append("Manifest: ");
        ((StringBuilder)object).append(Base64.encodeToString((byte[])this.l.digest(), (int)2));
        ((StringBuilder)object).append(" -> ");
        ((StringBuilder)object).append(this.k[3]);
        e1.d(((StringBuilder)object).toString());
        return manifest;
        object = new StringBuilder();
        ((StringBuilder)object).append("Failed get manifest: ");
        ((StringBuilder)object).append(Base64.encodeToString((byte[])this.l.digest(), (int)2));
        ((StringBuilder)object).append(" -> ");
        ((StringBuilder)object).append(this.k[3]);
        throw new IOException(((StringBuilder)object).toString(), iOException);
    }

    private static String d1() {
        return null;
    }

    private String e0() {
        String string2;
        while (Tools.e1(string2 = b1.f0(0))) {
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static byte[] e1(ZipFile closeable, String object) {
        Throwable throwable2;
        block4: {
            if ((object = ((ZipFile)closeable).getEntry((String)object)) == null) {
                return null;
            }
            closeable = ((ZipFile)closeable).getInputStream((ZipEntry)object);
            try {
                int n3 = (int)Math.max(0L, Math.min(((ZipEntry)object).getSize(), 65536L));
                object = new ByteArrayOutputStream(n3);
                byte[] byArray = new byte[65536];
                while ((n3 = ((InputStream)closeable).read(byArray)) != -1) {
                    ((ByteArrayOutputStream)object).write(byArray, 0, n3);
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            object = ((ByteArrayOutputStream)object).toByteArray();
            ((InputStream)closeable).close();
            return object;
        }
        ((InputStream)closeable).close();
        throw throwable2;
    }

    /*
     * Unable to fully structure code
     */
    private static void f(String var0) {
        if (var0 == null) {
            var0 = "Failed append readiness trace: null code";
lbl3:
            // 2 sources

            while (true) {
                e1.p(var0);
                return;
            }
        }
        for (var1_2 = 0; var1_2 < ((String[])(var2_3 = b1.v)).length; ++var1_2) {
            if (!var2_3[var1_2].equals(var0)) continue;
            try {
                var2_3 = new StringBuilder();
                var2_3.append(var0);
                var2_3.append("\n");
                b1.U1("self-install.readiness", var2_3.toString(), true);
            }
            catch (Throwable var0_1) {
                e1.s("Failed append readiness trace", var0_1);
            }
            return;
        }
        var0 = "Failed append readiness trace: unknown code";
        ** while (true)
    }

    private static String f0(int n3) {
        char[] cArray;
        if (n3 == 2) {
            char[] cArray2 = cArray = new char[11];
            cArray[0] = 46;
            cArray2[1] = 48;
            cArray2[2] = 49;
            cArray2[3] = 50;
            cArray2[4] = 51;
            cArray2[5] = 52;
            cArray2[6] = 53;
            cArray2[7] = 54;
            cArray2[8] = 55;
            cArray2[9] = 56;
            cArray2[10] = 57;
        } else {
            char[] cArray3 = cArray = new char[27];
            cArray[0] = 46;
            cArray3[1] = 97;
            cArray3[2] = 98;
            cArray3[3] = 99;
            cArray3[4] = 100;
            cArray3[5] = 101;
            cArray3[6] = 102;
            cArray3[7] = 103;
            cArray3[8] = 104;
            cArray3[9] = 105;
            cArray3[10] = 106;
            cArray3[11] = 107;
            cArray3[12] = 108;
            cArray3[13] = 109;
            cArray3[14] = 110;
            cArray3[15] = 111;
            cArray3[16] = 112;
            cArray3[17] = 113;
            cArray3[18] = 114;
            cArray3[19] = 115;
            cArray3[20] = 116;
            cArray3[21] = 117;
            cArray3[22] = 118;
            cArray3[23] = 119;
            cArray3[24] = 120;
            cArray3[25] = 121;
            cArray3[26] = 122;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (n3 == 0) {
            stringBuilder.append("com.");
        }
        Random random2 = Tools.a;
        CharSequence charSequence = new StringBuilder();
        charSequence.append("");
        charSequence.append(1.0f * 116.6f - 15.2f);
        String string2 = charSequence.toString();
        charSequence = n3 == 1 ? android.ext.i.c : (n3 == 0 ? android.ext.i.b : string2);
        int n4 = ((String)charSequence).length() - stringBuilder.length();
        if (n3 != 2) {
            if (n3 != 0) {
                ++n4;
            }
            n4 = random2.nextInt(n4 - 3) + 3;
        }
        int n5 = 1;
        for (int i3 = 0; i3 < n4; ++i3) {
            int n6;
            if (n3 == 2 && string2.charAt(i3) == '.') {
                stringBuilder.append('.');
                n6 = n5;
            } else {
                char c4;
                int n7 = n3 != 2 && n5 == 0 ? 0 : 1;
                int n8 = cArray.length;
                n6 = n7;
                if (i3 == 0) {
                    n6 = n7;
                    if (n3 != 1) {
                        n6 = 2;
                    }
                }
                n7 = n6;
                if (i3 == n4 - 1) {
                    n7 = n6;
                    if (n6 == 0) {
                        n7 = 1;
                    }
                }
                n6 = n7 + random2.nextInt(n8 - n7);
                char c5 = c4 = cArray[n6];
                if (n3 == 1) {
                    if (n6 == 0) {
                        c5 = ' ';
                    } else {
                        c5 = c4;
                        if (n5 != 0) {
                            c5 = Character.toUpperCase(c4);
                        }
                    }
                }
                stringBuilder.append(c5);
                n6 = n6 == 0 ? 1 : 0;
            }
            n5 = n6;
        }
        return stringBuilder.toString();
    }

    private static void f1(Attributes attributes, String string2) {
        b1.h1(attributes);
        attributes.putValue("SHA-256-Digest", string2);
    }

    private void g() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private OutputStream g0(int n3) {
        boolean bl = A[n3];
        Object object = null;
        Object object2 = null;
        boolean bl2 = bl;
        if (!bl) {
            try {
                object = new StringBuilder();
                ((StringBuilder)object).append("getOutputStream: ");
                ((StringBuilder)object).append(n3);
                e1.d(((StringBuilder)object).toString());
                object2 = object = new a0(this.h0(n3));
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
            bl2 = bl;
            object = object2;
            if (object2 == null) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Use mem cache for ");
                ((StringBuilder)object).append(n3);
                e1.d(((StringBuilder)object).toString());
                b1.A[n3] = true;
                bl2 = true;
                object = object2;
            }
        }
        if (!bl2) return object;
        int n4 = n3 == 1 ? 9000 : (n3 == 3 || n3 == 4 ? 75000 : (n3 == 5 ? 2000 : 8192));
        return new ByteArrayOutputStream(this, n4, n3){
            final int a;
            final b1 b;
            {
                this.b = b12;
                this.a = n4;
                super(n3);
            }

            @Override
            public void close() {
                super.close();
                byte[][] byArray = z;
                if (byArray != null) {
                    byte[] byArray2 = this.toByteArray();
                    if (byArray2 == null) {
                        e1.a(new RuntimeException("toByteArray return null"));
                    }
                    byArray[this.a] = byArray2;
                }
            }
        };
    }

    private static Runnable g1(Runnable runnable) {
        return new Runnable(runnable){
            final Runnable a;
            {
                this.a = runnable;
            }

            @Override
            public void run() {
                b1.S1();
                this.a.run();
                b1.R1("normal-service-ready");
                b1.f("normal-service-ready");
            }
        };
    }

    static r h(boolean bl, boolean bl2) {
        if (bl) {
            r r3 = bl2 ? android.ext.b1$r.a : android.ext.b1$r.c;
            return r3;
        }
        r r4 = bl2 ? android.ext.b1$r.a : android.ext.b1$r.b;
        return r4;
    }

    private static void h1(Attributes object) {
        object = ((Attributes)object).keySet().iterator();
        while (object.hasNext()) {
            int n3;
            Object object2 = object.next();
            if (!(object2 instanceof Attributes.Name) || (n3 = ((String)(object2 = ((Attributes.Name)object2).toString())).length()) <= 7 || !((String)object2).regionMatches(true, n3 - 7, "-Digest", 0, 7)) continue;
            object.remove();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void i() {
        File file;
        if (b1.C.b >= 600 && b1.C.c != null) {
            file = new File(b1.C.c);
        } else {
            file = this.T(false);
            file.mkdirs();
            b1.C.c = new File(file, b1.D0()).getAbsolutePath();
            b1.C.d = null;
            b1.C.e = null;
            b1.C.f = null;
            b1.C.g = 0;
            b1.C.n = null;
            b1.C.o = null;
            file = new File(b1.C.c);
        }
        this.c = file;
        this.d = b1.K0(file);
    }

    private static File i0() {
        File file;
        File file2 = file = (File)N.get();
        if (file == null) {
            file2 = new File(Tools.W());
            N = new WeakReference<File>(file2);
        }
        return file2;
    }

    public static void i1(Runnable runnable) {
        boolean bl;
        Object object = android.ext.r.n.getIntent();
        boolean bl2 = bl = false;
        if (object != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(android.ext.i.b);
            stringBuilder.append(".fromInstaller");
            bl2 = bl;
            if (object.getBooleanExtra(stringBuilder.toString(), false)) {
                bl2 = true;
            }
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("removeInstaller: ");
        ((StringBuilder)object).append(bl2);
        ((StringBuilder)object).append(" + ");
        ((StringBuilder)object).append(android.ext.r.m);
        e1.d(((StringBuilder)object).toString());
        if (!android.ext.r.m && !bl2) {
            b1.g1(runnable).run();
        } else {
            android.ext.r.m = true;
            object = new StringBuilder();
            ((StringBuilder)object).append(runnable);
            ((StringBuilder)object).append(": 30");
            e1.d(((StringBuilder)object).toString());
            x2.s(android.ext.i.b, b1.g1(runnable));
            object = new StringBuilder();
            ((StringBuilder)object).append(runnable);
            ((StringBuilder)object).append(": 40");
            e1.d(((StringBuilder)object).toString());
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void j(FileOutputStream object) {
        Throwable throwable222;
        g g4;
        ZipFile zipFile;
        block16: {
            ZipEntry zipEntry;
            String[] stringArray = Tools.removeNewLinesChars("uhv2udz2Cdvvhwv2").split("@");
            String string2 = Tools.removeNewLinesChars("uhv2udz2|gz");
            zipFile = new ZipFile(b1.i0());
            g4 = new g((OutputStream)object);
            try {
                Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
                block10: while (true) {
                    int n3;
                    boolean bl = enumeration.hasMoreElements();
                    int n4 = 0;
                    if (bl) {
                        zipEntry = enumeration.nextElement();
                        object = zipEntry.getName();
                        n4 = stringArray.length;
                    } else {
                        g4.close();
                        zipFile.close();
                        h3.a(this.d);
                        h3.f(this.d);
                        n3 = n4;
                        while (true) {
                            if (n3 >= this.k.length) {
                                return;
                            }
                            object = new StringBuilder();
                            ((StringBuilder)object).append("copy ");
                            ((StringBuilder)object).append(n3);
                            ((StringBuilder)object).append(' ');
                            ((StringBuilder)object).append(this.k[n3]);
                            e1.d(((StringBuilder)object).toString());
                            ++n3;
                        }
                    }
                    for (n3 = 0; n3 < n4; ++n3) {
                        if (((String)object).startsWith(stringArray[n3]) && !((String)object).startsWith(string2)) continue block10;
                    }
                    object = zipFile.getInputStream(zipEntry);
                    break;
                }
            }
            catch (Throwable throwable222) {}
            {
                this.L(zipEntry, (InputStream)object, g4);
                ((InputStream)object).close();
                continue;
            }
            break block16;
            catch (Throwable throwable3) {
                ((InputStream)object).close();
                throw throwable3;
            }
        }
        try {
            g4.close();
            throw throwable222;
        }
        catch (Throwable throwable4) {}
        zipFile.close();
        throw throwable4;
    }

    static c0 j0() {
        if (C == null) {
            c0 c02 = new c0();
            c02.a = b1.B0();
            C = c02;
        }
        return C;
    }

    private static boolean j1(String string2) {
        boolean bl = string2 != null && string2.endsWith(Tools.removeNewLinesChars("h{lw#frgh=#3"));
        return bl;
    }

    static void k(boolean bl) {
        b1.o();
        try {
            b1.W("installer.fail").createNewFile();
        }
        catch (IOException iOException) {
            e1.l("Failed set install flag", iOException);
        }
        if (bl) {
            n2.i(new Runnable(){

                @Override
                public void run() {
                    android.ext.r.I();
                }
            });
        }
    }

    public static Intent[] k0(String string2) {
        Intent intent = new Intent("android.intent.action.UNINSTALL_PACKAGE");
        intent.setData(Uri.fromParts((String)"package", (String)string2, null));
        intent.putExtra("android.intent.extra.RETURN_RESULT", true);
        intent.putExtra("android.intent.extra.UNINSTALL_ALL_USERS", true);
        Intent intent2 = new Intent("android.intent.action.DELETE");
        intent2.setData(Uri.fromParts((String)"package", (String)string2, null));
        return new Intent[]{intent, intent2};
    }

    private static String k1(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Tools.removeNewLinesChars("h{hf#sp#lqvwdoo#0i#"));
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    private static String l(android.content.pm.Signature signature) {
        return m0.i(MessageDigest.getInstance("SHA-256").digest(signature.toByteArray()));
    }

    private static ZipInputStream l0() {
        return new ZipInputStream(new BufferedInputStream(new FileInputStream(b1.i0()), 65536));
    }

    private static String l1(String string2, String string3) {
        CharSequence charSequence = new StringBuilder();
        charSequence.append(string3);
        charSequence.append(Tools.removeNewLinesChars("2edvh1dsn"));
        charSequence = charSequence.toString();
        StringBuilder stringBuilder = new StringBuilder(256);
        stringBuilder.append(Tools.removeNewLinesChars("fs#"));
        stringBuilder.append(b1.W0(string2));
        stringBuilder.append(Tools.removeNewLinesChars("#"));
        stringBuilder.append(b1.W0((String)charSequence));
        stringBuilder.append(Tools.removeNewLinesChars("#))#fkprg#3977#"));
        stringBuilder.append(b1.W0((String)charSequence));
        stringBuilder.append(Tools.removeNewLinesChars("#))#sp#lqvwdoo#0i#"));
        stringBuilder.append(b1.W0((String)charSequence));
        stringBuilder.append(Tools.removeNewLinesChars(">#uf@'B>#up#0i#"));
        stringBuilder.append(b1.W0((String)charSequence));
        stringBuilder.append(Tools.removeNewLinesChars(">#upglu#"));
        stringBuilder.append(b1.W0(string3));
        stringBuilder.append(Tools.removeNewLinesChars(">#h{lw#'uf"));
        return stringBuilder.toString();
    }

    private static int m(ComponentInfo[] componentInfoArray, String string2, String string3) {
        if (componentInfoArray == null) {
            return 0;
        }
        for (int i3 = 0; i3 < componentInfoArray.length; ++i3) {
            if (string2.equals(componentInfoArray[i3].packageName)) {
                String string4 = componentInfoArray[i3].name;
                if (string4 != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string2);
                    stringBuilder.append(".");
                    if (string4.startsWith(stringBuilder.toString())) {
                        if (!string4.startsWith(string3)) {
                            continue;
                        }
                        throw b1.J1("component");
                    }
                }
                throw b1.J1("component");
            }
            throw b1.J1("component");
        }
        return componentInfoArray.length;
    }

    /*
     * Unable to fully structure code
     */
    private static Intent m0(Intent var0, boolean var1_1) {
        if (var1_1) {
            var2_2 = Tools.f0();
            ** for (var4_7 : Tools.B0().queryIntentActivities((Intent)var0, (int)65536))
lbl-1000:
            // 1 sources

            {
                try {
                    var2_2.grantUriPermission(var4_7.activityInfo.packageName, var0.getData(), 1);
                    continue;
                }
                catch (Throwable var3_4) {
                    try {
                        var6_9 = new StringBuilder();
                        var6_9.append("Failed grant 0 ");
                        var6_9.append(var0);
                        var6_9.append("; ");
                        var6_9.append(var4_7);
                        e1.s(var6_9.toString(), var3_4);
                        continue;
                    }
                    catch (Throwable var4_8) {
                        var3_5 = new StringBuilder();
                        var3_5.append("Failed grant 1 ");
                        var3_5.append(var0);
                        e1.s(var3_5.toString(), var4_8);
                        break;
                    }
                }
            }
lbl31:
            // 2 sources

            try {
                var2_2.grantUriPermission("com.android.packageinstaller", var0.getData(), 1);
            }
            catch (Throwable var3_6) {
                var2_2 = new StringBuilder();
                var2_2.append("Failed grant 2 ");
                var2_2.append(var0);
                e1.s(var2_2.toString(), var3_6);
            }
        }
        return var0;
    }

    private static String m1(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Tools.removeNewLinesChars("h{hf#up#0ui#"));
        stringBuilder.append(b1.W0(string2));
        return stringBuilder.toString();
    }

    private void n(ZipEntry zipEntry, int n3, String string2, String string3) {
        Object object;
        this.l.reset();
        Object object2 = new DigestInputStream(this.Z(n3), this.l);
        try {
            int n4;
            object = this.S();
            while ((n4 = ((InputStream)object2).read((byte[])object)) != -1) {
            }
        }
        catch (Throwable throwable) {
            ((InputStream)object2).close();
            object2 = Base64.encodeToString((byte[])this.l.digest(), (int)2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("check hash for ");
            stringBuilder.append(zipEntry.getName());
            stringBuilder.append(" [");
            stringBuilder.append(n3);
            stringBuilder.append("]: ");
            stringBuilder.append((String)object2);
            stringBuilder.append(" : ");
            stringBuilder.append(string3);
            stringBuilder.append(" -> ");
            stringBuilder.append(string2);
            e1.d(stringBuilder.toString());
            throw throwable;
        }
        ((InputStream)object2).close();
        object = Base64.encodeToString((byte[])this.l.digest(), (int)2);
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("check hash for ");
        ((StringBuilder)object2).append(zipEntry.getName());
        ((StringBuilder)object2).append(" [");
        ((StringBuilder)object2).append(n3);
        ((StringBuilder)object2).append("]: ");
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append(" : ");
        ((StringBuilder)object2).append(string3);
        ((StringBuilder)object2).append(" -> ");
        ((StringBuilder)object2).append(string2);
        e1.d(((StringBuilder)object2).toString());
        if (string2.equals(object)) {
            return;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("check hash for ");
        ((StringBuilder)object2).append(zipEntry.getName());
        ((StringBuilder)object2).append(" [");
        ((StringBuilder)object2).append(n3);
        ((StringBuilder)object2).append("]: ");
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append(" != ");
        ((StringBuilder)object2).append(string3);
        ((StringBuilder)object2).append(" -> ");
        ((StringBuilder)object2).append(string2);
        throw new v(((StringBuilder)object2).toString());
    }

    private static int n0(InputStream inputStream, MessageDigest messageDigest, byte[] byArray, int n3) {
        int n4;
        for (int i3 = n3; i3 > 0; i3 -= n4) {
            n4 = i3 > byArray.length ? byArray.length : i3;
            if ((n4 = inputStream.read(byArray, 0, n4)) <= 0) break;
            messageDigest.update(byArray, 0, n4);
        }
        return n3;
    }

    private static String n1(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Tools.removeNewLinesChars("xpdvn#3::>#h{hf#pnglu#"));
        stringBuilder.append(b1.W0(string2));
        return stringBuilder.toString();
    }

    private static void o() {
        try {
            b1.C("self-install.stage").delete();
        }
        catch (Throwable throwable) {
            e1.s("Failed clear install stage", throwable);
        }
        b1.p();
    }

    /*
     * Exception decompiling
     */
    public static final String o0(InputStream var0, MessageDigest var1_2, String var2_3, int var3_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 301->317)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private void o1() {
        Intent intent = Tools.N0(android.ext.r.p, this.g, android.ext.r.t().replace(Tools.C0(), this.g));
        if (!x2.h()) {
            e1.d("removeInstaller: just installer");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(android.ext.i.b);
            stringBuilder.append(".fromInstaller");
            intent.putExtra(stringBuilder.toString(), true);
        }
        android.ext.r.p.startActivity(intent);
    }

    private static void p() {
        try {
            b1.C("self-install.readiness").delete();
        }
        catch (Throwable throwable) {
            e1.s("Failed clear readiness trace", throwable);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String p0(InputStream var0, MessageDigest var1_3) {
        var7_4 = new byte[16384];
        var5_5 = b1.Y0((InputStream)var0, var7_4);
        try {
            var0 = Tools.z0(Tools.C0());
            var3_6 = var0.versionCode;
            var0 = var0.versionName;
            ** GOTO lbl22
        }
        catch (Throwable var0_1) {
            e1.a(var0_1);
            var2_7 = (float)true;
            var3_6 = (int)(18113.3f * var2_7 - 1958.3f + 0.5f);
            try {
                var0 = new StringBuilder();
                var0.append("");
                var0.append(var2_7 * 102.5f - 1.1f);
                var0 = var0.toString();
lbl22:
                // 2 sources

                var9_8 = new StringBuilder();
                var9_8.append("\u0000");
                var8_9 = android.ext.i.d;
                var9_8.append((char)var8_9.length());
                var9_8.append((String)var8_9);
                var9_8.append('\u0000');
                var8_9 = var9_8.toString().getBytes(t1.i(true));
                var9_8 = new StringBuilder();
                var9_8.append("\u0000");
                var10_10 = android.ext.i.e;
                var9_8.append((char)var10_10.length());
                var9_8.append((String)var10_10);
                var9_8.append('\u0000');
                var9_8 = var9_8.toString().getBytes(t1.i(true));
                var10_10 = new StringBuilder();
                var10_10.append("\u0000");
                var10_10.append((char)var0.length());
                var10_10.append((String)var0);
                var10_10.append('\u0000');
                var20_11 = var10_10.toString().getBytes(t1.i(true));
                var11_12 = b1.v0(null, 0, 2130968620);
                var16_13 = b1.v0(null, 0, 0x7F070000);
                var15_14 = b1.v0(null, 0, 2131165185);
                var19_15 = b1.v0(null, 0, 2131165188);
                var10_10 = b1.v0(null, 0, 2131165186);
                var17_16 = b1.v0(null, 0, 2131165187);
                var13_17 = b1.v0(null, 0, 0x7F070007);
                var12_18 = b1.v0(null, 0, 2131165189);
                var18_19 = b1.v0(null, 0, 2131165190);
                var14_20 = b1.v0(b1.v0(null, 4, var3_6), 0, 0x10000008);
                for (var3_6 = 0; var3_6 < 13; ++var3_6) {
                    block10: {
                        var0 = (new byte[][]{(byte[])var8_9, (byte[])var9_8, var20_11, var11_12, var16_13, var15_14, var19_15, (byte[])var10_10, var17_16, var13_17, var12_18, var18_19, var14_20})[var3_6];
                        var6_22 = Tools.V0(var7_4, (byte[])var0);
                        if (var6_22 < 0) continue;
                        if (var3_6 != 0) break block10;
                        var0 = android.ext.i.b;
                        ** GOTO lbl74
                    }
                    if (var3_6 == 1) {
                        var0 = android.ext.i.c;
lbl74:
                        // 2 sources

                        var4_21 = (var0.length() + 4) * 2;
                    } else {
                        var4_21 = ((Object)var0).length;
                    }
                    System.arraycopy(new byte[var4_21], 0, var7_4, var6_22, var4_21);
                }
            }
            catch (Throwable var0_2) {}
            var3_6 = ByteBuffer.wrap(var7_4).order(ByteOrder.LITTLE_ENDIAN).getInt(16) * 4;
            System.arraycopy(new byte[var3_6], 0, var7_4, 36, var3_6);
            var1_3.update(var7_4, 0, var5_5);
            return w0.b(var1_3);
        }
        e1.l("hash fail", var0_2);
        return var0_2.toString();
    }

    private Map p1() {
        HashMap hashMap;
        HashMap hashMap2 = hashMap = this.p;
        if (hashMap == null) {
            this.p = hashMap2 = new HashMap();
        }
        return hashMap2;
    }

    private static void q() {
        try {
            b1.C("verify-generated-apk.fail").delete();
        }
        catch (Throwable throwable) {
            e1.s("Failed clear verify marker", throwable);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String q0(InputStream object, MessageDigest messageDigest) {
        try {
            byte[] byArray = new byte[8192];
            ByteBuffer byteBuffer = ByteBuffer.wrap(byArray).order(ByteOrder.LITTLE_ENDIAN);
            while (b1.Z0((InputStream)object, byArray, 0, 8) != -1) {
                messageDigest.update(byArray, 0, 8);
                s s3 = new s(byteBuffer);
                int n3 = s3.a;
                if (n3 == 512) {
                    byte[] byArray2 = new byte[260];
                    b1.Z0((InputStream)object, byArray2, 0, 4);
                    messageDigest.update(byArray2);
                    b1.Z0((InputStream)object, byArray2, 4, 256);
                    n3 = s3.c - 268;
                } else {
                    n3 = n3 == 2 ? s3.b : s3.c;
                    n3 -= 8;
                }
                b1.n0((InputStream)object, messageDigest, byArray, n3);
            }
            return w0.b(messageDigest);
        }
        catch (Throwable throwable) {}
        e1.l("hash fail", throwable);
        return throwable.toString();
    }

    private void q1() {
        try {
            Tools.B0().setInstallerPackageName(this.g, null);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    private static void r(StringBuilder stringBuilder, ZipEntry zipEntry) {
        if (zipEntry == null) {
            return;
        }
        stringBuilder.append('-');
        stringBuilder.append(zipEntry.getSize());
        stringBuilder.append(' ');
    }

    private static void r0() {
        Button button = (Button)E.get();
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener(){

                public void onClick(View view) {
                    android.ext.f.p(android.ext.f.c(android.ext.r.p).setMessage((CharSequence)b2.f(2131296700)).setPositiveButton(2131297115, new DialogInterface.OnClickListener(this){
                        final c a;
                        {
                            this.a = c4;
                        }

                        public void onClick(DialogInterface dialogInterface, int n3) {
                            b1.k(true);
                        }
                    }).setNegativeButton(2131296805, null).setCancelable(false), (Context)android.ext.r.n);
                }
            });
        }
        if ((button = (ProgressBar)G.get()) != null) {
            button.setIndeterminate(false);
        }
        F.run();
    }

    private static void r1(String string2) {
        n2.i(new Runnable(string2){
            final String a;
            {
                this.a = string2;
            }

            @Override
            public void run() {
                TextView textView = (TextView)I.get();
                if (textView != null) {
                    textView.setText((CharSequence)this.a);
                }
            }
        });
    }

    private static byte[] s(byte[] object) {
        if (object == null) {
            return null;
        }
        Object object2 = ((t)(object = (Object)new t((byte[])object))).c(48);
        if (object2 != null && ((t)object).a()) {
            if (((t)(object = ((t)object).b((int[])object2))).c(6) == null) {
                return null;
            }
            object2 = ((t)object).c(160);
            if (object2 != null && ((t)object).a() && (object = (Object)(object2 = (Object)((t)object).b((int[])object2)).c(48)) != null && object2.a()) {
                if ((object2 = object2.b((int[])object)).c(2) == null) {
                    return null;
                }
                if (object2.c(49) == null) {
                    return null;
                }
                if (object2.c(48) == null) {
                    return null;
                }
                if (object2.c(160) == null) {
                    return null;
                }
                object = object2.c(49);
                if (object != null && object2.a() && (object2 = (Object)((t)(object = (Object)object2.b((int[])object))).c(48)) != null && ((t)object).a()) {
                    if (((t)(object = ((t)object).b((int[])object2))).c(2) == null) {
                        return null;
                    }
                    if (((t)object).c(48) == null) {
                        return null;
                    }
                    if (((t)object).c(48) == null) {
                        return null;
                    }
                    if (((t)object).c(48) == null) {
                        return null;
                    }
                    object2 = ((t)object).c(4);
                    if (object2 != null && ((t)object).a()) {
                        return ((t)object).d((int[])object2);
                    }
                }
            }
        }
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String s0() {
        block41: {
            block42: {
                block38: {
                    this.I1();
                    var6_1 = this.c.getAbsolutePath();
                    var9_11 = var6_1.contains("/emulated/0") != false ? new String[]{var6_1.replace("/emulated/0", "/emulated/legacy"), var6_1} : new String[]{var6_1};
                    var2_12 = ((String[])var9_11).length;
                    for (var1_13 = 0; var1_13 < var2_12; ++var1_13) {
                        var6_1 = var9_11[var1_13];
                        try {
                            var7_14 = new File((String)var6_1);
                            Tools.q((File)var7_14, 493);
                        }
                        catch (Throwable var8_17) {
                            var7_14 = new StringBuilder();
                            var7_14.append("Failed allow execute 1: ");
                            var7_14.append((String)var6_1);
                            e1.s(var7_14.toString(), var8_17);
                        }
                        try {
                            Tools.r((String)var6_1, "0755");
                            continue;
                        }
                        catch (Throwable var7_15) {
                            var8_16 = new StringBuilder();
                            var8_16.append("Failed allow execute 2: ");
                            var8_16.append((String)var6_1);
                            e1.s(var8_16.toString(), var7_15);
                        }
                    }
                    var5_18 = b1.Q0(b1.C.l);
                    var3_19 = ((String[])var9_11).length;
                    var6_1 = "Install:";
                    var1_13 = 1;
                    var2_12 = 0;
                    while (true) {
                        block35: {
                            block40: {
                                block37: {
                                    block36: {
                                        var7_14 = var6_1;
                                        if (var2_12 >= var3_19) break;
                                        var11_22 = var9_11[var2_12];
                                        if (!var5_18) {
                                            var7_14 = var6_1;
                                            break;
                                        }
                                        if (var1_13 != 0) {
                                            b1.R1("root-install-start");
                                            var1_13 = 0;
                                        }
                                        var7_14 = var6_1;
                                        try {
                                            if (Build.VERSION.SDK_INT < 24) {
                                                var7_14 = var6_1;
                                                this.I1();
                                                var7_14 = var6_1;
                                                var7_14 = var6_1;
                                                var8_16 = new StringBuilder();
                                                var7_14 = var6_1;
                                                var8_16.append((String)var6_1);
                                                var7_14 = var6_1;
                                                var8_16.append('\n');
                                                var7_14 = var6_1;
                                                var8_16.append(e2.n(b1.k1(var11_22), 45));
                                                var7_14 = var6_1;
                                                var6_1 = var8_16.toString();
                                                break block35;
                                            }
                                            var7_14 = var6_1;
                                            var10_21 = b1.C0();
                                            var8_16 = var6_1;
                                        }
                                        catch (Throwable var6_2) {}
                                        var12_23 = e2.n(b1.n1((String)var10_21), 45);
                                        var8_16 = var6_1;
                                        var8_16 = var6_1;
                                        var7_14 = new StringBuilder();
                                        var8_16 = var6_1;
                                        var7_14.append((String)var6_1);
                                        var8_16 = var6_1;
                                        var7_14.append('\n');
                                        var8_16 = var6_1;
                                        var7_14.append(var12_23);
                                        var8_16 = var6_1;
                                        var8_16 = var7_14 = var7_14.toString();
                                        var4_20 = b1.j1(var12_23);
                                        var6_1 = var7_14;
                                        if (!var4_20) break block36;
                                        try {
                                            this.I1();
                                            var6_1 = new StringBuilder();
                                            var6_1.append((String)var7_14);
                                            var6_1.append('\n');
                                            var6_1.append(e2.n(b1.l1(var11_22, (String)var10_21), 45));
                                            var6_1 = var6_1.toString();
                                        }
                                        catch (Throwable var6_3) {
                                            var8_16 = var7_14;
                                            break block37;
                                        }
                                    }
                                    if (!var4_20) break block35;
                                    var7_14 = var6_1;
                                    var10_21 = e2.n(b1.m1((String)var10_21), 45);
                                    var7_14 = var6_1;
                                    if (!b1.j1((String)var10_21)) {
                                        var7_14 = var6_1;
                                        var7_14 = var6_1;
                                        var8_16 = new StringBuilder();
                                        var7_14 = var6_1;
                                        var8_16.append("root stage cleanup: ");
                                        var7_14 = var6_1;
                                        var8_16.append((String)var10_21);
                                        var7_14 = var6_1;
                                        e1.p(var8_16.toString());
                                    }
                                    break block35;
                                    break block40;
                                    catch (Throwable var6_4) {
                                        var4_20 = false;
                                    }
                                }
                                if (var4_20) {
                                    var7_14 = var8_16;
                                    var11_22 = e2.n(b1.m1((String)var10_21), 45);
                                    var7_14 = var8_16;
                                    if (!b1.j1(var11_22)) {
                                        var7_14 = var8_16;
                                        var7_14 = var8_16;
                                        var10_21 = new StringBuilder();
                                        var7_14 = var8_16;
                                        var10_21.append("root stage cleanup: ");
                                        var7_14 = var8_16;
                                        var10_21.append(var11_22);
                                        var7_14 = var8_16;
                                        e1.p(var10_21.toString());
                                    }
                                }
                                var7_14 = var8_16;
                                throw var6_5;
                            }
                            e1.l("run cmd fail", var6_2);
                            var8_16 = new StringBuilder();
                            var8_16.append((String)var7_14);
                            var8_16.append('\n');
                            var8_16.append(var6_2.getMessage());
                            var6_1 = var8_16.toString();
                        }
                        b1.R1("root-install-return");
                        if (Tools.e1(this.g)) {
                            b1.R1("package-installed");
                            var7_14 = var6_1;
                            break;
                        }
                        ++var2_12;
                    }
                    var6_1 = var7_14;
                    if (Tools.e1(this.g)) break block41;
                    if (Build.VERSION.SDK_INT < 26) break block42;
                    b1.C.h = false;
                    b1.Q1(4);
                    var5_18 = b1.u0();
                    var4_20 = b1.C.i || b1.C.l == 2;
                    var6_1 = b1.h(var4_20, var5_18);
                    b1.C.i = false;
                    if (var6_1 == android.ext.b1$r.b) {
                        b1.R1("unknown-source-settings-start");
                        b1.C.i = true;
                        var6_1 = new StringBuilder();
                        var6_1.append("package:");
                        var6_1.append(Tools.C0());
                        var6_1 = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse((String)var6_1.toString()));
                        c0.p = true;
                        c0.q = false;
                        this.P1((Intent)var6_1, 4);
                        var4_20 = c0.q;
                        b1.C.i = false;
                        c0.p = false;
                        c0.q = false;
                        if (!var4_20 || !b1.u0()) {
                            b1.R1("unknown-source-settings-failed");
                            throw new v("unknown-source install permission was not granted");
                        }
                    } else if (var6_1 == android.ext.b1$r.c) {
                        b1.R1("unknown-source-settings-failed");
                        throw new v("unknown-source install permission was not granted");
                    }
                    break block42;
                    catch (Throwable var6_6) {
                        break block38;
                    }
                    catch (RuntimeException var6_7) {
                    }
                    catch (ActivityNotFoundException var6_8) {
                        ** GOTO lbl209
                    }
                    {
                        b1.Q1(4);
                        b1.C.i = false;
                        b1.R1("unknown-source-settings-failed");
                        throw var6_7;
lbl209:
                        // 1 sources

                        b1.Q1(4);
                        b1.C.i = false;
                        b1.R1("unknown-source-settings-failed");
                        var7_14 = new v("unknown-source settings are unavailable", var6_8);
                        throw var7_14;
                    }
                }
                c0.p = false;
                c0.q = false;
                throw var6_6;
            }
            b1.R1("manual-install-start");
            b1.C.h = true;
            var8_16 = this.a0();
            b1.L = 0;
            var2_12 = ((Intent[])var8_16).length;
            var1_13 = 0;
            while (true) {
                block39: {
                    var6_1 = var7_14;
                    if (var1_13 >= var2_12) break;
                    var6_1 = var8_16[var1_13];
                    ++b1.L;
                    var9_11 = new StringBuilder();
                    var9_11.append((String)var7_14);
                    var9_11.append("\nManual: ");
                    var9_11.append(var6_1);
                    var7_14 = var9_11.toString();
                    this.I1();
                    try {
                        this.P1((Intent)var6_1, 1);
                        var6_1 = var7_14;
                        break;
                    }
                    catch (Throwable var6_9) {
                        break block39;
                    }
                    catch (Throwable var6_10) {
                        // empty catch block
                    }
                }
                var9_11 = new StringBuilder();
                var9_11.append((String)var7_14);
                var9_11.append('\n');
                var9_11.append(var6_1.getMessage());
                var7_14 = var9_11.toString();
                ++var1_13;
            }
        }
        if (Tools.e1(this.g)) {
            b1.R1("package-installed");
            b1.C.i = false;
        }
        return var6_1;
    }

    static void s1(c0 c02) {
        C = c02;
    }

    private void t(String string2, String charSequence) {
        try {
            Os.rename((String)this.d.getAbsolutePath(), (String)this.c.getAbsolutePath());
            if (!this.d.exists() && this.c.isFile()) {
                b1.C.n = string2;
                b1.C.o = charSequence;
                this.V1();
                return;
            }
            throw new v("commit rename incomplete");
        }
        catch (ErrnoException errnoException) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("commit rename failed: ");
            ((StringBuilder)charSequence).append(errnoException.getMessage());
            throw new IOException(((StringBuilder)charSequence).toString(), errnoException);
        }
    }

    static void t0() {
        z = new byte[x.length][];
        try {
            Runnable runnable = new b1();
            B = runnable;
            ((b1)((Object)runnable)).a();
            runnable = new Runnable(){

                @Override
                public void run() {
                    android.ext.r.n.finish();
                }
            };
            n2.i(runnable);
        }
        catch (Throwable throwable) {
            e1.l("Failed install", throwable);
            String string2 = throwable.getMessage();
            if (string2 != null && (string2.contains("ENOSPC") || string2.contains("o space left"))) {
                n2.i(new Runnable(string2){
                    final String a;
                    {
                        this.a = string2;
                    }

                    @Override
                    public void run() {
                        Object object = B;
                        object = object != null && (object = ((b1)object).c) != null ? ((File)object).getAbsolutePath() : null;
                        AlertDialog.Builder builder = android.ext.f.c(android.ext.r.p);
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(b2.f(2131296814));
                        stringBuilder.append('\n');
                        stringBuilder.append(this.a);
                        stringBuilder.append('\n');
                        stringBuilder.append((String)object);
                        android.ext.f.m(builder.setMessage((CharSequence)stringBuilder.toString()).setPositiveButton(2131296836, new DialogInterface.OnClickListener(this){
                            final o a;
                            {
                                this.a = o3;
                            }

                            public void onClick(DialogInterface dialogInterface, int n3) {
                                android.ext.r.I();
                            }
                        }).setCancelable(false).create());
                    }
                });
            }
            if (!(throwable instanceof v)) {
                n0.h(Thread.currentThread(), throwable, false);
            }
            b1.k(false);
            n2.i(new Runnable(throwable){
                final Throwable a;
                {
                    this.a = throwable;
                }

                @Override
                public void run() {
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this){
                        final p a;
                        {
                            this.a = p3;
                        }

                        public void onClick(DialogInterface dialogInterface, int n3) {
                            if (n3 == -1) {
                                new r.n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf2:6<;0jdwkhulqj0lqirupdwlrq0derxw0jj0huuruv2").onClick(dialogInterface, n3);
                                n2.d().postDelayed(new Runnable(this){
                                    final a a;
                                    {
                                        this.a = a4;
                                    }

                                    @Override
                                    public void run() {
                                        e1.d("Kill by Installer");
                                        f1.n();
                                    }
                                }, 5000L);
                            } else {
                                b1.k(true);
                            }
                        }
                    };
                    AlertDialog.Builder builder = android.ext.f.c(android.ext.r.p);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(Tools.N1(2131296892));
                    stringBuilder.append(":\n\n");
                    stringBuilder.append(e1.n(this.a));
                    android.ext.f.m(builder.setMessage((CharSequence)stringBuilder.toString()).setPositiveButton(2131296786, onClickListener).setNegativeButton(2131296836, onClickListener).setCancelable(false).create());
                }
            });
        }
    }

    private static void t1(int n3) {
        if (b1.C.b != n3) {
            J = 0;
        }
        b1.C.b = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void u() {
        Object object;
        FileOutputStream fileOutputStream = null;
        int n3 = 0;
        while (true) {
            Throwable throwable;
            block11: {
                block10: {
                    object = fileOutputStream;
                    if (n3 >= 2) break;
                    try {
                        if (!this.d.exists()) break block10;
                        this.d.delete();
                    }
                    catch (Throwable throwable2) {
                        break block11;
                    }
                }
                object = new FileOutputStream(this.d);
                try {
                    Tools.q(this.d, 384);
                    break;
                }
                catch (Throwable throwable3) {
                    throwable = throwable3;
                    fileOutputStream = object;
                }
            }
            if (n3 == 1) {
                throw throwable;
            }
            e1.a(throwable);
            object = new File(this.b, this.c.getName());
            b1.C.c = ((File)object).getAbsolutePath();
            this.c = object;
            this.d = b1.K0((File)object);
            ++n3;
        }
        try {
            this.j((FileOutputStream)object);
            return;
        }
        catch (Error error2) {
            this.D((FileOutputStream)object);
            throw error2;
        }
        catch (RuntimeException runtimeException) {
            this.D((FileOutputStream)object);
            throw runtimeException;
        }
        catch (IOException iOException) {
            this.D((FileOutputStream)object);
            throw iOException;
        }
    }

    static boolean u0() {
        String string2;
        boolean bl;
        block4: {
            bl = false;
            try {
                string2 = a1.a("android.permission.REQUEST_INSTALL_PACKAGES");
                if (string2 != null) break block4;
                return false;
            }
            catch (Throwable throwable) {
                e1.g("installPermissionGranted failed", throwable);
                return false;
            }
        }
        int n3 = ((AppOpsManager)Tools.f0().getSystemService("appops")).checkOpNoThrow(string2, Process.myUid(), Tools.C0());
        if (n3 == 0) {
            bl = true;
        }
        return bl;
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void u1() {
        block13: {
            var4 = b1.W(Tools.removeNewLinesChars("yhuvlrq1jj"));
            var5_3 = new StringBuilder();
            var0_4 = (float)true;
            var5_3.append(Integer.toString((int)(16452.9f * var0_4 - 297.9f + 0.5f)));
            var5_3.append(':');
            var5_3.append(var0_4 * 107.3f - 5.9f);
            var5_3 = var5_3.toString().getBytes();
            var3_5 = var4.exists();
            if (!var3_5) ** GOTO lbl47
            var6_6 = new FileInputStream(var4);
            try {
                var1_8 = ((Object)var5_3).length;
                var7_9 = new byte[var1_8];
                if (var6_6.read((byte[])var7_9) == var1_8 && Arrays.equals((byte[])var7_9, (byte[])var5_3)) break block13;
                b1.W("installer.fail").delete();
                var7_9 = Tools.q0();
                var10_11 = var7_9.list();
                if (var10_11 == null) break block13;
                for (String var9_14 : var10_11) {
                    if ((!var9_14.startsWith("lib") || !var9_14.endsWith(".so")) && !"gr".equals(var9_14)) continue;
                    var8_13 = new File((File)var7_9, var9_14);
                    var8_13.delete();
                }
            }
            catch (Throwable var7_10) {
                ** GOTO lbl38
            }
        }
        try {
            block14: {
                break block14;
lbl38:
                // 1 sources

                var6_6.close();
                throw var7_10;
            }
            var6_6.close();
            ** GOTO lbl47
        }
        catch (Throwable var6_7) {}
        try {
            e1.l("Fail get version", var6_7);
lbl47:
            // 3 sources

            var6_6 = new FileOutputStream(var4);
            Tools.q(var4, 384);
        }
        catch (Throwable var4_1) {}
        var6_6.write((byte[])var5_3);
        {
            catch (Throwable var4_2) {
                var6_6.close();
                throw var4_2;
            }
        }
        var6_6.close();
        return;
        e1.l("Fail set version", var4_1);
    }

    private void v() {
        for (int i3 = 0; i3 < this.k.length; ++i3) {
            this.V(i3).delete();
            RandomAccessFile randomAccessFile = this.a[i3];
            if (randomAccessFile == null) continue;
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Close: ");
                stringBuilder.append(i3);
                e1.d(stringBuilder.toString());
                randomAccessFile.close();
                continue;
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
        }
        this.p = null;
        this.q = null;
    }

    private static byte[] v0(byte[] byArray, int n3, int n4) {
        byte[] byArray2 = byArray;
        if (byArray == null) {
            byArray2 = new byte[n3 + 4];
        }
        for (int i3 = 0; i3 < 4; ++i3) {
            byArray2[n3 + i3] = (byte)(n4 >> i3 * 8 & 0xFF);
        }
        return byArray2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String v1(File object) {
        Throwable throwable2;
        block3: {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            object = new FileInputStream((File)object);
            try {
                int n3;
                byte[] byArray = new byte[65536];
                while ((n3 = ((InputStream)object).read(byArray)) != -1) {
                    messageDigest.update(byArray, 0, n3);
                }
            }
            catch (Throwable throwable2) {
                break block3;
            }
            ((InputStream)object).close();
            return m0.i(messageDigest.digest());
        }
        ((InputStream)object).close();
        throw throwable2;
    }

    private static int w(byte[] byArray) {
        if (byArray != null) {
            int n3 = byArray.length;
            int n4 = 2;
            if (n3 >= 2) {
                int n5 = 0;
                if (byArray[0] != 48) {
                    return -1;
                }
                int n6 = byArray[1];
                int n7 = n6 & 0xFF;
                n3 = n4;
                if ((n6 & 0x80) != 0) {
                    if ((n6 &= 0x7F) != 0 && n6 <= 4 && 2 + n6 <= byArray.length) {
                        n3 = 0;
                        n7 = n5;
                        while (n7 < n6) {
                            n3 = n3 << 8 | byArray[n4] & 0xFF;
                            ++n7;
                            ++n4;
                        }
                        n7 = n3;
                        n3 = n4;
                    } else {
                        return -1;
                    }
                }
                return n3 + n7;
            }
        }
        return -1;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String w0(File object) {
        Throwable throwable2;
        File file;
        block9: {
            Object object2;
            Object object3;
            block8: {
                Object object4;
                block7: {
                    if (object == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("path: ");
                        stringBuilder.append(object);
                        stringBuilder.append(" - null");
                        e1.d(stringBuilder.toString());
                        return "is null";
                    }
                    ((File)object).mkdirs();
                    file = new File((File)object, "installer.dir.probe");
                    file.delete();
                    object3 = "We need test read/write to this file".getBytes();
                    object2 = new byte[((byte[])object3).length];
                    object4 = new FileOutputStream(file);
                    Tools.q(file, 384);
                    ((OutputStream)object4).write((byte[])object3);
                    ((OutputStream)object4).close();
                    object4 = new FileInputStream(file);
                    int n3 = ((InputStream)object4).read((byte[])object2);
                    ((InputStream)object4).close();
                    if (n3 == ((byte[])object3).length) break block7;
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Length mismatch: ");
                    ((StringBuilder)object2).append(n3);
                    ((StringBuilder)object2).append(" != ");
                    ((StringBuilder)object2).append(((Object)object3).length);
                    object3 = ((StringBuilder)object2).toString();
                    file.delete();
                    return object3;
                }
                if (Arrays.equals((byte[])object2, (byte[])object3)) break block8;
                object4 = new StringBuilder();
                ((StringBuilder)object4).append("Data mismatch: '");
                String string2 = new String((byte[])object2);
                ((StringBuilder)object4).append(string2);
                ((StringBuilder)object4).append("' != '");
                object2 = new String((byte[])object3);
                ((StringBuilder)object4).append((String)object2);
                ((StringBuilder)object4).append('\'');
                object3 = ((StringBuilder)object4).toString();
                file.delete();
                return object3;
            }
            try {
                object3 = new StringBuilder;
                ((StringBuilder)object3)();
                ((StringBuilder)object3).append("path: ");
                ((StringBuilder)object3).append(object);
                ((StringBuilder)object3).append(" - success");
                e1.d(((StringBuilder)object3).toString());
                file.delete();
            }
            catch (Throwable throwable2) {
                break block9;
            }
            catch (IOException iOException) {}
            return null;
            {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("path: ");
                ((StringBuilder)object2).append(object);
                ((StringBuilder)object2).append(" - fail: ");
                ((StringBuilder)object2).append(iOException.getMessage());
                e1.d(((StringBuilder)object2).toString());
                object = iOException.getMessage();
                file.delete();
            }
            return object;
        }
        file.delete();
        throw throwable2;
    }

    private String w1(String string2) {
        Object object = (byte[])this.p1().get(string2);
        if (object != null) {
            this.n.reset();
            this.n.update((byte[])object);
            return m0.h(this.n.digest());
        }
        object = new StringBuilder();
        object.append("missing secondary dex bytes: ");
        object.append(string2);
        throw new v(object.toString());
    }

    private static u x(byte[] object, int n3, int object2, int object3) {
        Object object4;
        CharSequence charSequence = new StringBuilder();
        charSequence.append("fixDex: string ");
        charSequence.append((int)object3);
        charSequence.append(" is malformed");
        charSequence = charSequence.toString();
        Object object5 = 0;
        Object object6 = 0;
        for (object3 = 0; object3 < (object4 = object2 - n3); ++object3) {
            Object object7 = object[n3 + object3];
            Object object8 = object6 | (object7 & 0x7F) << object3 * 7;
            if ((object7 & 0x80) == 0) {
                if (object8 >= 0 && object8 + 1 <= object4 - object3) {
                    object3 += n3;
                    char[] cArray = new char[object8];
                    for (object6 = object5; object6 < object8; ++object6) {
                        if (object3 < object2) {
                            object7 = object[object3];
                            object5 = object7 & 0xFF;
                            if (object5 != 0) {
                                if (object5 < 128) {
                                    cArray[object6] = (char)object5;
                                    ++object3;
                                    continue;
                                }
                                if ((object7 & 0xE0) == 192) {
                                    object5 = object3 + 2;
                                    if (object5 <= object2 && ((object3 = (Object)object[object3 + 1]) & 0xC0) == 128) {
                                        if ((object3 = object3 & 0x3F | (object7 & 0x1F) << 6) != 0 && object3 < 128) {
                                            object = new StringBuilder();
                                            ((StringBuilder)object).append((String)charSequence);
                                            ((StringBuilder)object).append(": overlong MUTF-8");
                                            throw new v(((StringBuilder)object).toString());
                                        }
                                        cArray[object6] = (char)object3;
                                        object3 = object5;
                                        continue;
                                    }
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append((String)charSequence);
                                    ((StringBuilder)object).append(": bad MUTF-8");
                                    throw new v(((StringBuilder)object).toString());
                                }
                                if ((object7 & 0xF0) == 224) {
                                    object5 = object3 + 3;
                                    if (object5 <= object2 && ((object4 = (Object)object[object3 + 1]) & 0xC0) == 128 && ((object3 = (Object)object[object3 + 2]) & 0xC0) == 128) {
                                        if ((object3 = object3 & 0x3F | ((object7 & 0xF) << 12 | (object4 & 0x3F) << 6)) >= 2048) {
                                            cArray[object6] = (char)object3;
                                            object3 = object5;
                                            continue;
                                        }
                                        object = new StringBuilder();
                                        ((StringBuilder)object).append((String)charSequence);
                                        ((StringBuilder)object).append(": overlong MUTF-8");
                                        throw new v(((StringBuilder)object).toString());
                                    }
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append((String)charSequence);
                                    ((StringBuilder)object).append(": bad MUTF-8");
                                    throw new v(((StringBuilder)object).toString());
                                }
                                object = new StringBuilder();
                                ((StringBuilder)object).append((String)charSequence);
                                ((StringBuilder)object).append(": invalid MUTF-8");
                                throw new v(((StringBuilder)object).toString());
                            }
                            object = new StringBuilder();
                            ((StringBuilder)object).append((String)charSequence);
                            ((StringBuilder)object).append(": string shorter than indicated size ");
                            ((StringBuilder)object).append((int)object8);
                            throw new v(((StringBuilder)object).toString());
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append((String)charSequence);
                        ((StringBuilder)object).append(": truncated MUTF-8 payload");
                        throw new v(((StringBuilder)object).toString());
                    }
                    if (object3 < object2 && object[object3] == false) {
                        return new u(new String(cArray), (int)object8, object3 - n3 + 1);
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append((String)charSequence);
                    ((StringBuilder)object).append(": missing NUL terminator");
                    throw new v(((StringBuilder)object).toString());
                }
                object = new StringBuilder();
                ((StringBuilder)object).append((String)charSequence);
                ((StringBuilder)object).append(": payload overruns its bound");
                throw new v(((StringBuilder)object).toString());
            }
            if (object3 <= 4) {
                object6 = object8;
                continue;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append((String)charSequence);
            ((StringBuilder)object).append(": invalid ULEB128 length");
            throw new v(((StringBuilder)object).toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append((String)charSequence);
        ((StringBuilder)object).append(": truncated ULEB128 length");
        throw new v(((StringBuilder)object).toString());
    }

    private static boolean x0(String string2) {
        if (string2 != null && string2.length() == 64) {
            for (int i3 = 0; i3 < string2.length(); ++i3) {
                char c4 = string2.charAt(i3);
                if (c4 >= '0' && c4 <= '9' || c4 >= 'a' && c4 <= 'f') {
                    continue;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    private static String x1(byte[] object) {
        block2: {
            Object var3_4;
            int n3;
            String[] stringArray = new String((byte[])object, "UTF-8").split("\r\n|\n", -1);
            int n4 = 0;
            while (true) {
                n3 = stringArray.length;
                var3_4 = null;
                object = var3_4;
                if (n4 >= n3) break block2;
                object = stringArray[n4];
                if (((String)object).isEmpty()) {
                    object = var3_4;
                    break block2;
                }
                n3 = ((String)object).indexOf(58);
                if (n3 > 0 && "SHA-256-Digest-Manifest".equalsIgnoreCase(((String)object).substring(0, n3).trim())) break;
                ++n4;
            }
            if (!((String)(object = ((String)object).substring(n3 + 1).trim())).isEmpty()) break block2;
            object = var3_4;
        }
        return object;
    }

    private static String y(byte[] byArray, int n3, int n4) {
        b1.z(byArray, n3, n4);
        int n5 = 0;
        n4 = 0;
        int n6 = 0;
        int n7 = n3;
        n3 = n6;
        while (true) {
            n6 = n7 + 1;
            byte by = byArray[n7];
            n7 = n4 | (by & 0x7F) << n3 * 7;
            if ((by & 0x80) == 0) {
                char[] cArray = new char[n7];
                n3 = n6;
                for (n4 = n5; n4 < n7; ++n4) {
                    n6 = byArray[n3];
                    n5 = n6 & 0xFF;
                    if (n5 < 128) {
                        cArray[n4] = (char)n5;
                        ++n3;
                        continue;
                    }
                    if ((n6 & 0xE0) == 192) {
                        if ((n6 = (n6 & 0x1F) << 6 | byArray[n3 + 1] & 0x3F) != 0 && n6 < 128) {
                            throw new v("hashDex: overlong MUTF-8");
                        }
                        cArray[n4] = (char)n6;
                        n3 += 2;
                        continue;
                    }
                    if ((n6 = (n6 & 0xF) << 12 | (byArray[n3 + 1] & 0x3F) << 6 | byArray[n3 + 2] & 0x3F) >= 2048) {
                        cArray[n4] = (char)n6;
                        n3 += 3;
                        continue;
                    }
                    throw new v("hashDex: overlong MUTF-8");
                }
                return new String(cArray);
            }
            ++n3;
            n4 = n7;
            n7 = n6;
        }
    }

    private static boolean y0(String string2) {
        return w.matcher(string2).matches();
    }

    private static String y1() {
        Throwable throwable2;
        block6: {
            block5: {
                Object object;
                try {
                    object = Tools.B0().getPackageArchiveInfo(b1.i0().getAbsolutePath(), 64);
                    if (object == null) break block5;
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                object = object.signatures;
                if (object == null) break block5;
                if (((android.content.pm.Signature[])object).length == 1) {
                    object = b1.l(object[0]);
                    return object;
                }
            }
            return null;
        }
        e1.a(throwable2);
        return null;
    }

    private static int z(byte[] byArray, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        long l3;
        block15: {
            l3 = 0L;
            n7 = 0;
            for (n6 = 0; n6 < 5; ++n6) {
                if (n3 < n4) {
                    n5 = n3 + 1;
                    n3 = byArray[n3];
                    if (n6 == 4 && (n3 & 0xF0) != 0) {
                        throw new v("hashDex: invalid ULEB128 length");
                    }
                    l3 |= (long)(n3 & 0x7F) << n6 * 7;
                    if ((n3 & 0x80) == 0) {
                        n3 = n5;
                        n6 = 1;
                        break block15;
                    }
                    n3 = n5;
                    continue;
                }
                throw new v("hashDex: truncated ULEB128 length");
            }
            n6 = 0;
        }
        if (n6 != 0) {
            if (l3 <= Integer.MAX_VALUE && 1L + l3 <= (long)(n4 - n3)) {
                n6 = n7;
                while (n6 < (int)l3) {
                    if (n3 < n4) {
                        n5 = n3 + 1;
                        n7 = byArray[n3];
                        int n8 = n7 & 0xFF;
                        if (n8 != 0) {
                            if (n8 < 128) {
                                ++n6;
                                n3 = n5;
                                continue;
                            }
                            if ((n7 & 0xE0) == 192) {
                                if (n5 < n4 && (byArray[n5] & 0xC0) == 128) {
                                    ++n6;
                                    n3 += 2;
                                    continue;
                                }
                                throw new v("hashDex: bad MUTF-8");
                            }
                            if ((n7 & 0xF0) == 224) {
                                n7 = n3 + 2;
                                if (n7 < n4 && (byArray[n5] & 0xC0) == 128 && (byArray[n7] & 0xC0) == 128) {
                                    ++n6;
                                    n3 += 3;
                                    continue;
                                }
                                throw new v("hashDex: bad MUTF-8");
                            }
                            throw new v("hashDex: invalid MUTF-8");
                        }
                        throw new v("hashDex: string shorter than indicated size");
                    }
                    throw new v("hashDex: truncated MUTF-8 payload");
                }
                if (n3 < n4 && byArray[n3] == 0) {
                    return n3 + 1;
                }
                throw new v("hashDex: missing NUL terminator");
            }
            throw new v("hashDex: string length out of range");
        }
        throw new v("hashDex: invalid ULEB128 length");
    }

    private static boolean z0(String string2) {
        long l3;
        boolean bl;
        block7: {
            bl = false;
            if (string2 == null) {
                return false;
            }
            if (!string2.endsWith(".dex")) {
                return false;
            }
            int n3 = 7;
            if (!string2.regionMatches(0, "classes", 0, 7)) {
                return false;
            }
            int n4 = string2.length() - 4;
            if (n4 <= 7) {
                return false;
            }
            long l4 = 0L;
            while (true) {
                l3 = l4;
                if (n3 >= n4) break block7;
                char c4 = string2.charAt(n3);
                if (c4 < '0' || c4 > '9') break;
                if ((l4 = l4 * 10L + (long)(c4 - 48)) > Integer.MAX_VALUE) {
                    l3 = l4;
                    break block7;
                }
                ++n3;
            }
            return false;
        }
        if (l3 >= 2L) {
            bl = true;
        }
        return bl;
    }

    public static void z1() {
        b1.r0();
        new n0.i(new Runnable(){

            @Override
            public void run() {
                if (!b1.L0()) {
                    return;
                }
                b1.t0();
            }
        }, "Installer").start();
    }

    void E() {
        if (this.r != null) {
            try {
                Tools.D((DialogInterface)this.r);
                this.r = null;
            }
            catch (Throwable throwable) {
                e1.s("Exception on dismiss", throwable);
            }
        }
    }

    RandomAccessFile h0(int n3) {
        Object object = this.a[n3];
        RandomAccessFile randomAccessFile = object;
        if (object == null) {
            randomAccessFile = new RandomAccessFile(this.V(n3), "rw");
            object = new StringBuilder();
            ((StringBuilder)object).append("RAF new: ");
            ((StringBuilder)object).append(n3);
            ((StringBuilder)object).append(' ');
            ((StringBuilder)object).append(randomAccessFile.getFD());
            e1.d(((StringBuilder)object).toString());
            this.a[n3] = randomAccessFile;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("RAF get: ");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(' ');
        ((StringBuilder)object).append(randomAccessFile.getFD());
        e1.d(((StringBuilder)object).toString());
        return randomAccessFile;
    }

    private static class a0
    extends OutputStream {
        private final RandomAccessFile a;

        private a0(RandomAccessFile randomAccessFile) {
            this.a = randomAccessFile;
            randomAccessFile.seek(0L);
            randomAccessFile.setLength(0L);
        }

        @Override
        public void close() {
        }

        @Override
        public void flush() {
        }

        @Override
        public void write(int n3) {
            this.a.write(n3);
        }

        @Override
        public void write(byte[] byArray) {
            this.a.write(byArray);
        }

        @Override
        public void write(byte[] byArray, int n3, int n4) {
            this.a.write(byArray, n3, n4);
        }
    }

    private class b0 {
        private RandomAccessFile a;
        private ByteBuffer b;
        private final boolean c;
        final b1 d;

        /*
         * Enabled aggressive block sorting
         */
        private b0(b1 object, int n3) {
            boolean bl;
            this.d = object;
            this.a = null;
            this.b = null;
            this.c = bl = A[n3];
            if (!bl) {
                this.a = ((b1)object).h0(n3);
                return;
            }
            object = z;
            if (object != null && (object = object[n3]) != null) {
                this.b = ByteBuffer.wrap((byte[])object);
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("memCache is null 3: ");
            ((StringBuilder)object).append(n3);
            ((StringBuilder)object).append(' ');
            ((StringBuilder)object).append(z);
            throw new v(((StringBuilder)object).toString());
        }

        private b0(b1 object, byte[] byArray, String string2) {
            this.d = object;
            this.a = null;
            this.b = null;
            if (byArray != null) {
                this.c = true;
                this.b = ByteBuffer.wrap(byArray);
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("RandomAccessData: null data for ");
            ((StringBuilder)object).append(string2);
            throw new v(((StringBuilder)object).toString());
        }

        public void a() {
        }

        public long b() {
            if (this.c) {
                return this.b.capacity();
            }
            return this.a.length();
        }

        public long c() {
            if (this.c) {
                return this.b.position();
            }
            return this.a.getFilePointer();
        }

        public int d(byte[] byArray) {
            return this.e(byArray, 0, byArray.length);
        }

        public int e(byte[] byArray, int n3, int n4) {
            if (this.c) {
                if ((n4 = Math.min(n4, this.b.remaining())) != 0) {
                    this.b.get(byArray, n3, n4);
                    n3 = n4;
                } else {
                    n3 = -1;
                }
            } else {
                n3 = this.a.read(byArray, n3, n4);
            }
            return n3;
        }

        public void f(long l3) {
            if (this.c) {
                this.b.position((int)l3);
            } else {
                this.a.seek(l3);
            }
        }

        public void g(int n3) {
            if (this.c) {
                ByteBuffer byteBuffer = this.b;
                byteBuffer.position(byteBuffer.position() + n3);
            } else {
                this.a.skipBytes(n3);
            }
        }

        public void h(byte[] byArray) {
            if (this.c) {
                this.b.put(byArray);
            } else {
                this.a.write(byArray);
            }
        }

        public void i(byte[] byArray, int n3, int n4) {
            if (this.c) {
                this.b.put(byArray, n3, n4);
            } else {
                this.a.write(byArray, n3, n4);
            }
        }
    }

    public static class c0
    implements Parcelable {
        public static final Parcelable.Creator<c0> CREATOR = new Parcelable.Creator(){

            public c0 a(Parcel parcel) {
                return new c0(parcel);
            }

            public c0[] b(int n3) {
                return new c0[n3];
            }
        };
        static volatile boolean p = false;
        static volatile boolean q = false;
        boolean a;
        int b;
        String c;
        String d;
        String e;
        String f;
        int g;
        boolean h;
        volatile boolean i;
        volatile int j;
        String k;
        volatile int l;
        volatile boolean m;
        String n;
        String o;

        c0() {
            this.a = false;
            this.b = 0;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = 0;
            this.h = false;
            this.i = false;
            this.j = 0;
            this.k = "";
            this.l = 0;
            this.m = false;
            this.n = null;
            this.o = null;
        }

        protected c0(Parcel parcel) {
            boolean bl = false;
            this.a = false;
            this.b = 0;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = 0;
            this.h = false;
            this.i = false;
            this.j = 0;
            this.k = "";
            this.l = 0;
            this.m = false;
            this.n = null;
            this.o = null;
            boolean bl2 = parcel.readByte() != 0;
            this.a = bl2;
            this.b = parcel.readInt();
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readString();
            this.g = parcel.readInt();
            bl2 = parcel.readByte() != 0;
            this.h = bl2;
            bl2 = parcel.readByte() != 0;
            this.i = bl2;
            this.j = parcel.readInt();
            this.k = parcel.readString();
            this.l = parcel.readInt();
            bl2 = bl;
            if (parcel.readByte() != 0) {
                bl2 = true;
            }
            this.m = bl2;
            this.n = parcel.readString();
            this.o = parcel.readString();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int n3) {
            parcel.writeByte((byte)(this.a ? 1 : 0));
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeInt(this.g);
            parcel.writeByte((byte)(this.h ? 1 : 0));
            parcel.writeByte((byte)(this.i ? 1 : 0));
            parcel.writeInt(this.j);
            parcel.writeString(this.k);
            parcel.writeInt(this.l);
            parcel.writeByte((byte)(this.m ? 1 : 0));
            parcel.writeString(this.n);
            parcel.writeString(this.o);
        }
    }

    static final class r
    extends Enum {
        public static final /* enum */ r a = new r("PROCEED", 0);
        public static final /* enum */ r b = new r("OPEN_SETTINGS", 1);
        public static final /* enum */ r c = new r("FAIL_PENDING", 2);
        private static final r[] d = android.ext.b1$r.a();

        /*
         * WARNING - Possible parameter corruption
         * WARNING - void declaration
         */
        private r() {
            void var2_-1;
            void var1_-1;
        }

        private static /* synthetic */ r[] a() {
            return new r[]{a, b, c};
        }

        public static r valueOf(String string2) {
            return Enum.valueOf(r.class, string2);
        }

        public static r[] values() {
            return (r[])d.clone();
        }
    }

    private static class s {
        short a;
        short b;
        int c;

        s(ByteBuffer byteBuffer) {
            byteBuffer.position(0);
            this.a = byteBuffer.getShort();
            this.b = byteBuffer.getShort();
            this.c = byteBuffer.getInt();
        }
    }

    private static final class t {
        private final byte[] a;
        private final int b;
        private int c;

        t(byte[] byArray) {
            this(byArray, 0, byArray.length);
        }

        t(byte[] byArray, int n3, int n4) {
            this.a = byArray;
            this.c = n3;
            this.b = n3 + n4;
        }

        boolean a() {
            boolean bl = this.c == this.b;
            return bl;
        }

        t b(int[] nArray) {
            return new t(this.a, nArray[0], nArray[1]);
        }

        int[] c(int n3) {
            byte[] byArray;
            int n4 = this.c;
            int n5 = this.b;
            if (n4 + 2 <= n5 && ((byArray = this.a)[n4] & 0xFF) == n3) {
                n3 = n4 + 2;
                int n6 = byArray[n4 + 1];
                int n7 = n6 & 0xFF;
                n4 = n3;
                if ((n6 & 0x80) != 0) {
                    if ((n6 &= 0x7F) != 0 && n6 <= 4 && n3 + n6 <= n5) {
                        n7 = 0;
                        n4 = 0;
                        while (n7 < n6) {
                            n4 = n4 << 8 | this.a[n3] & 0xFF;
                            ++n7;
                            ++n3;
                        }
                        n7 = n4;
                        n4 = n3;
                    } else {
                        return null;
                    }
                }
                if (n7 >= 0 && (n3 = n4 + n7) <= this.b) {
                    this.c = n3;
                    return new int[]{n4, n7};
                }
            }
            return null;
        }

        byte[] d(int[] nArray) {
            int n3 = nArray[1];
            byte[] byArray = new byte[n3];
            System.arraycopy(this.a, nArray[0], byArray, 0, n3);
            return byArray;
        }
    }

    private static final class u {
        final String a;
        final int b;
        final int c;

        u(String string2, int n3, int n4) {
            this.a = string2;
            this.b = n3;
            this.c = n4;
        }
    }

    static class v
    extends RuntimeException {
        public v(String string2) {
            super(string2);
        }

        public v(String string2, Throwable throwable) {
            super(string2, throwable);
        }
    }

    public static class w {
        public ZipEntry a;
        public String b;
        public String c;

        public w(ZipEntry zipEntry, String string2) {
            this.a = zipEntry;
            this.b = string2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Item [entry=");
            stringBuilder.append(this.a);
            stringBuilder.append(", extractHash=");
            stringBuilder.append(this.b);
            stringBuilder.append(", putHash=");
            stringBuilder.append(this.c);
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

    private static class x
    extends OutputStream {
        private x() {
        }

        @Override
        public void write(int n3) {
        }
    }

    static final class y
    extends Enum {
        public static final /* enum */ y a = new y("ROOT", 0);
        public static final /* enum */ y b = new y("MANUAL", 1);
        public static final /* enum */ y c = new y("OPEN_SETTINGS", 2);
        public static final /* enum */ y d = new y("REFUSED", 3);
        private static final y[] e = android.ext.b1$y.a();

        /*
         * WARNING - Possible parameter corruption
         * WARNING - void declaration
         */
        private y() {
            void var2_-1;
            void var1_-1;
        }

        private static /* synthetic */ y[] a() {
            return new y[]{a, b, c, d};
        }

        public static y valueOf(String string2) {
            return Enum.valueOf(y.class, string2);
        }

        public static y[] values() {
            return (y[])e.clone();
        }
    }

    private static class z
    extends InputStream {
        private final RandomAccessFile a;

        private z(RandomAccessFile randomAccessFile) {
            this.a = randomAccessFile;
            randomAccessFile.seek(0L);
        }

        @Override
        public int available() {
            int n3 = (int)(this.a.length() - this.a.getFilePointer());
            if (n3 <= 0) {
                n3 = 0;
            }
            return n3;
        }

        @Override
        public void close() {
        }

        /*
         * Enabled aggressive block sorting
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        @Override
        public void mark(int n3) {
            // MONITORENTER : this
            // MONITOREXIT : this
        }

        @Override
        public boolean markSupported() {
            return false;
        }

        @Override
        public int read() {
            return this.a.read();
        }

        @Override
        public int read(byte[] byArray) {
            return this.a.read(byArray);
        }

        @Override
        public int read(byte[] byArray, int n3, int n4) {
            return this.a.read(byArray, n3, n4);
        }

        /*
         * Enabled aggressive block sorting
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        @Override
        public void reset() {
            // MONITORENTER : this
            // MONITOREXIT : this
        }

        @Override
        public long skip(long l3) {
            RandomAccessFile randomAccessFile = this.a;
            randomAccessFile.seek(randomAccessFile.getFilePointer() + l3);
            return l3;
        }
    }
}

