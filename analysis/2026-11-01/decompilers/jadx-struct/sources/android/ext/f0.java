package android.ext;

import android.content.DialogInterface$OnClickListener;
import android.os.Process;
import catch_.me_.if_.you_.can_.R$color;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$string;
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
    static f0$n0 y;
    private static final List z = new ArrayList();
    private static boolean A = true;
    static volatile String B = null;
    private static volatile String C = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    f0$n0 f792a = null;

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
    Thread m = new f0$d0(this, "mReaderThread");
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

    private int A(byte b2) {
        h2[] h2VarArr;
        ArrayList arrayList = this.s;
        synchronized (arrayList) {
            try {
                h2VarArr = (h2[]) arrayList.toArray(new h2[arrayList.size()]);
                arrayList.clear();
                arrayList.trimToSize();
            } catch (Throwable th) {
                throw th;
            }
        }
        int length = h2VarArr.length;
        if (length != 0) {
            n2.j(new f0$r(this, h2VarArr, b2));
        }
        return length;
    }

    private boolean[] I(int i) {
        return (i == 1 ? MainService.instance.o0 : MainService.instance.n0).b();
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
        for (int i = 0; i < 5; i++) {
            String str2 = strArr[i];
            sb.append(' ');
            sb.append(str2);
        }
        return new String[]{sb.toString()};
    }

    static f0$j0 M0(List list, boolean z2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c cVar = (c) list.get(i);
            if (cVar != null) {
                arrayList.add(new f0$m0(e.a(cVar.f672a, z2), cVar.f674c));
            }
        }
        f0$m0[] f0_m0Arr = (f0$m0[]) arrayList.toArray(new f0$m0[arrayList.size()]);
        Arrays.sort(f0_m0Arr);
        ArrayList arrayList2 = new ArrayList(f0_m0Arr.length);
        f0$m0 f0_m0 = null;
        for (f0$m0 f0_m1 : f0_m0Arr) {
            if (f0_m1 != null) {
                if (f0_m0 == null || f0_m0.f907a != f0_m1.f907a) {
                    arrayList2.add(f0_m1);
                    f0_m0 = f0_m1;
                } else {
                    f0_m0.f908b = f0_m1.f908b | f0_m0.f908b;
                }
            }
        }
        int size2 = arrayList2.size();
        long[] jArr = new long[size2];
        int[] iArr = new int[size2];
        int i2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            f0$m0 f0_m2 = (f0$m0) arrayList2.get(i3);
            jArr[i3] = f0_m2.f907a;
            int i4 = f0_m2.f908b;
            iArr[i3] = i4;
            i2 |= i4;
        }
        f0$j0 f0_j0 = new f0$j0(jArr, iArr);
        f0_j0.f889c = i2 & 127;
        return f0_j0;
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
        int i;
        String str10;
        String string2;
        int i2;
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
            int i3 = 5;
            String[] strArr = {"/system/bin", "/system/xbin", "/sbin/.magisk/mirror/data", "/sbin/.magisk/modules", "/sbin"};
            int i4 = 0;
            while (true) {
                String str16 = "exit";
                str3 = "; chmod 0755 ";
                if (i4 < i3) {
                    try {
                        File file4 = new File(strArr[i4], name);
                        if (file4.exists() && file4.canExecute() && file3.length() == file4.length()) {
                            return file4.getAbsolutePath();
                        }
                        i4++;
                        i3 = 5;
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
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                str6 = null;
                                str7 = null;
                                break;
                            }
                            int i6 = length;
                            String str17 = strArrSplit[i5];
                            if (str17 != null && str17.contains(" /system ")) {
                                String[] strArrSplit2 = str17.trim().split(" ");
                                int length2 = strArrSplit2.length;
                                int i7 = 0;
                                String str18 = null;
                                while (true) {
                                    if (i7 >= length2) {
                                        strTrim = null;
                                        break;
                                    }
                                    String[] strArr2 = strArrSplit2;
                                    strTrim = strArrSplit2[i7].trim();
                                    int i8 = length2;
                                    if (!"on".equals(strTrim) && !"type".equals(strTrim) && !"/system".equals(strTrim)) {
                                        if (str18 != null) {
                                            break;
                                        }
                                        str18 = strTrim;
                                    }
                                    i7++;
                                    length2 = i8;
                                    strArrSplit2 = strArr2;
                                }
                                str7 = strTrim;
                                str6 = str18;
                                break;
                            }
                            i5++;
                            length = i6;
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
                                int i9 = 0;
                                for (int i10 = 2; i9 < i10; i10 = 2) {
                                    try {
                                        String str19 = strArr3[i9];
                                        String[] strArr4 = strArr3;
                                        str8 = str16;
                                        try {
                                            String[] strArr5 = new String[4];
                                            try {
                                                strArr5[0] = "";
                                                strArr5[1] = "/system/bin/";
                                                int i11 = i9;
                                                strArr5[2] = "/system/xbin/";
                                                strArr5[3] = "/system/sbin/";
                                                int i12 = 0;
                                                for (int i13 = 4; i12 < i13; i13 = 4) {
                                                    try {
                                                        String str20 = strArr5[i12];
                                                        str9 = str3;
                                                        String[] strArr6 = strArr5;
                                                        try {
                                                            String[] strArr7 = new String[2];
                                                            try {
                                                                strArr7[0] = str19 + ",remount";
                                                                strArr7[1] = "remount," + str19;
                                                                int i14 = 0;
                                                                while (i14 < 2) {
                                                                    String str21 = strArr7[i14];
                                                                    String[] strArr8 = strArr7;
                                                                    String[] strArr9 = {null, str7};
                                                                    String str22 = str7;
                                                                    int i15 = 0;
                                                                    for (int i16 = 2; i15 < i16; i16 = 2) {
                                                                        String str23 = strArr9[i15];
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
                                                                        i15++;
                                                                        str20 = str24;
                                                                    }
                                                                    i14++;
                                                                    str7 = str22;
                                                                    strArr7 = strArr8;
                                                                }
                                                                i12++;
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
                                                                i = 0;
                                                                while (i < 5) {
                                                                    str12 = strArr[i];
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
                                                                    i++;
                                                                    str4 = str13;
                                                                }
                                                                str10 = str4;
                                                                sb.append(str5);
                                                                string2 = sb.toString();
                                                                String str25 = string2 + str15 + e2.n(string2, 15);
                                                                for (i2 = 0; i2 < 5; i2++) {
                                                                    str11 = strArr[i2];
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
                                                            i = 0;
                                                            while (i < 5) {
                                                                str12 = strArr[i];
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
                                                                i++;
                                                                str4 = str13;
                                                            }
                                                            str10 = str4;
                                                            sb.append(str5);
                                                            string2 = sb.toString();
                                                            String str26 = string2 + str15 + e2.n(string2, 15);
                                                            while (i2 < 5) {
                                                                str11 = strArr[i2];
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
                                                        int i17 = 0;
                                                        while (i17 < 5) {
                                                            String str29 = strArr[i17];
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
                                                                        i = 0;
                                                                        while (i < 5) {
                                                                            str12 = strArr[i];
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
                                                                            i++;
                                                                            str4 = str13;
                                                                        }
                                                                        str10 = str4;
                                                                        sb.append(str5);
                                                                        string2 = sb.toString();
                                                                        String str210 = string2 + str15 + e2.n(string2, 15);
                                                                        while (i2 < 5) {
                                                                            str11 = strArr[i2];
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
                                                                    i = 0;
                                                                    while (i < 5) {
                                                                        str12 = strArr[i];
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
                                                                        i++;
                                                                        str4 = str13;
                                                                    }
                                                                    str10 = str4;
                                                                    sb.append(str5);
                                                                    string2 = sb.toString();
                                                                    String str211 = string2 + str15 + e2.n(string2, 15);
                                                                    while (i2 < 5) {
                                                                        str11 = strArr[i2];
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
                                                            i17++;
                                                            str28 = str3;
                                                        }
                                                    }
                                                    i9 = i11 + 1;
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
                                            i = 0;
                                            while (i < 5) {
                                                str12 = strArr[i];
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
                                                i++;
                                                str4 = str13;
                                            }
                                            str10 = str4;
                                            sb.append(str5);
                                            string2 = sb.toString();
                                            String str212 = string2 + str15 + e2.n(string2, 15);
                                            while (i2 < 5) {
                                                str11 = strArr[i2];
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
                                            for (int i18 = 0; i18 < 5; i18++) {
                                                File file11 = new File(strArr[i18], name);
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
            i = 0;
            while (i < 5) {
                str12 = strArr[i];
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
                i++;
                str4 = str13;
            }
            str10 = str4;
            sb.append(str5);
            string2 = sb.toString();
            try {
                String str213 = string2 + str15 + e2.n(string2, 15);
                while (i2 < 5) {
                    str11 = strArr[i2];
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
        return w0.a(h0.c(), "S!H!A!-!3!8!4".replace("!", ""));
    }

    private void c0() {
        MainService.instance.Q();
        MainService.instance.l();
    }

    private static boolean j(f0$n0 f0_n0, File file) throws IOException {
        boolean z2 = false;
        if (f0_n0 == null || f0_n0.f916a == null) {
            return false;
        }
        InputStream inputStream = f0_n0.f918c;
        boolean z3 = k(f0_n0.f919d, "android-daemon err") && k(inputStream, "android-daemon out");
        if (!Config.C && z3) {
            new g2().putInt("root-ok", (int) (((1 * 16338.7f) - 183.7f) + 0.5f)).commit();
        }
        if (z3) {
            int i = inputStream.read();
            if (i == 49 || i == 48) {
                inputStream.read();
            }
            if (i == 49) {
                try {
                    OutputStream outputStream = f0_n0.f917b;
                    try {
                        e1.d("IF 0");
                        FileInputStream fileInputStream = new FileInputStream(new File(file, "o"));
                        e1.d("IF 1");
                        FileInputStream fileInputStream2 = new FileInputStream(new File(file, "e"));
                        e1.d("IF 2");
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(file, "i"));
                        e1.d("IF 3");
                        f0_n0.f917b = fileOutputStream;
                        f0_n0.f918c = fileInputStream;
                        f0_n0.f919d = fileInputStream2;
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
            } else if (i != 48) {
                e1.p("Odd fifo: " + i);
            }
        }
        return z3;
    }

    private static boolean k(InputStream inputStream, String str) throws IOException {
        byte[] bytes = str.getBytes();
        byte[] bArr = new byte[4096];
        e1.d("Start: " + str);
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = inputStream.read();
            if (i3 == -1) {
                break;
            }
            byte b2 = (byte) i3;
            if (i >= 4096) {
                break;
            }
            int i4 = i + 1;
            bArr[i] = b2;
            if (b2 == bytes[i2]) {
                i2++;
                if (i2 == bytes.length) {
                    e1.d("Good: " + str);
                    return true;
                }
            } else {
                i2 = 0;
            }
            if (inputStream.available() == 0) {
                for (int i5 = 0; i5 < 30; i5++) {
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
                e2.f745a += "No more data: " + i4 + '\n';
                i = i4;
                break;
            }
            i = i4;
        }
        String str2 = "Fail: '" + str + "' " + i + " '" + new String(bArr, 0, i) + '\'';
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
                    new g0(runnable, "runAfterDaemonStart").start();
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
                    new g0((Runnable) it.next(), "waitForDaemonStart").start();
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
            try {
                array = arrayList.toArray(new Object[arrayList.size()]);
                arrayList.clear();
                arrayList.trimToSize();
            } catch (Throwable th) {
                throw th;
            }
        }
        int length = array.length;
        if (length != 0) {
            n2.j(new f0$o(this, array, b2));
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
            try {
                h2VarArr = (h2[]) arrayList.toArray(new h2[arrayList.size()]);
                arrayList.clear();
                arrayList.trimToSize();
            } catch (Throwable th) {
                throw th;
            }
        }
        int length = h2VarArr.length;
        if (length != 0) {
            n2.j(new f0$p(this, h2VarArr, b2));
            if ((Config.A & 128) != 0 && !x) {
                x = true;
                n2.i(new f0$q(this));
            }
        }
        return length;
    }

    private void y0(byte b2, long j, long j2, int i, int i2, long j3, long j4, long j5) {
        long jH = c.h(j, i2);
        long jH2 = c.h(j2, i2);
        e1.d("sendSearchNumber: " + jH + "; " + jH2 + " x" + i + " as " + Integer.toHexString(i2) + " in " + Long.toHexString(j3) + '-' + Long.toHexString(j4) + ", " + Long.toString(j5));
        n2.j(new f0$n(this, b2, jH, jH2, i, i2, j3, j4, j5));
        i2.l = null;
    }

    private void z0(byte b2, long j, long j2, int i, long j3, long j4, long j5) {
        y0(b2, j, j2, 0, i, j3, j4, j5);
    }

    public void A0(byte b2, String str) {
        byte[] bytes = str.getBytes();
        if (bytes.length == 0) {
            return;
        }
        if (bytes.length <= 4000) {
            n2.j(new f0$i0(this, bytes, b2));
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

    public void C0(byte b2, int i, String str, String str2) {
        n2.j(new f0$h0(this, str, str2, b2, i));
        x0(b2);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[PHI: r6
      0x008c: PHI (r6v5 java.lang.String) = (r6v4 java.lang.String), (r6v17 java.lang.String), (r6v18 java.lang.String) binds: [B:40:0x00a9, B:37:0x009b, B:31:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    public void D(byte b2, long j, long j2, int i, int i2, int i3, long j3, long j4, long j5) {
        String str;
        int i4;
        String strF;
        String strF2;
        boolean z2;
        String strReplace;
        int i5 = i & 127;
        CharSequence charSequenceV = c.v(i5);
        boolean z3 = (i & 8388608) != 0;
        boolean z4 = !z3 && j == 0;
        String strK = c.K(0L, j, i5);
        if (z3) {
            strK = strK + '~' + c.K(0L, j2, i5);
        }
        if (i2 == 67108864) {
            str = "N > O+D";
            if (z4) {
                i4 = R$string.fuzzy_larger;
                strF = b2.f(i4);
            } else {
                strF = str;
            }
            strF2 = strF;
            z2 = false;
        } else if (i2 == 134217728) {
            str = "N < O+D";
            if (z4) {
                i4 = R$string.fuzzy_smaller;
                strF = b2.f(i4);
            } else {
                strF = str;
            }
            strF2 = strF;
            z2 = false;
        } else if (i2 != 268435456) {
            if (this.i == 0) {
                this.i = i3;
            }
            this.h = i3 - 1;
            this.j = j3;
            this.k = j4;
            this.l = j5;
            str = "N = O+D";
            strF2 = z4 ? b2.f(R$string.fuzzy_equal) : "N = O+D";
            z2 = true;
        } else {
            str = "N ≠ O+D";
            if (z4) {
                i4 = R$string.fuzzy_inequal;
                strF = b2.f(i4);
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
        CharSequence charSequenceD = new y().b("%s %s", strReplace, charSequenceV).d();
        if (z2) {
            MainService.instance.i0(charSequenceD, -1L, 1L, this.i - this.h, this.i, 0L);
        } else {
            MainService.instance.h0(charSequenceD);
        }
        z0(b2, j, j2, i | Integer.MIN_VALUE | i2, j3, j4, j5);
    }

    public void D0(int i, String str, String str2) {
        C0((byte) 0, i, str, str2);
    }

    public void E(long j, long j2, int i, int i2, int i3, long j3, long j4, long j5) {
        D((byte) 0, j, j2, i, i2, i3, j3, j4, j5);
    }

    public void E0(byte b2) {
        F0(b2, this.n, this.o);
    }

    public void F(byte b2, int i, long j, long j2, long j3) {
        MainService.instance.h0(new y().b("%s %s", b2.f(R$string.search_unknown_value), c.v(i & 127)).d());
        z0(b2, 0L, 0L, i | Integer.MIN_VALUE, j, j2, j3);
    }

    public void F0(byte b2, int i, int i2) {
        c0();
        boolean[] zArrI = I(0);
        long j = this.p;
        this.n = i;
        this.o = i2;
        n2.j(new f0$e(this, b2, zArrI, i, i2, j));
        this.p = 0L;
    }

    public void G() {
        H((byte) 0);
    }

    public void G0(byte b2, int i) {
        c0();
        n2.j(new f0$f(this, b2, i, I(i)));
    }

    public void H(byte b2) {
        u0(b2, (byte) 57);
    }

    public void H0(int i) {
        G0((byte) 0, i);
    }

    public void I0(byte b2, int i) {
        c0();
        n2.j(new f0$g(this, b2, i, I(i)));
    }

    public int J() {
        return this.f796e;
    }

    public void J0(int i) {
        I0((byte) 0, i);
    }

    public void K0(byte b2) {
        L0((byte) 0, b2);
    }

    public void L() {
        M((byte) 0);
    }

    public void L0(byte b2, byte b3) {
        n2.j(new f0$u(this, b2, b3));
    }

    public void M(byte b2) {
        u0(b2, (byte) 58);
    }

    public void N(byte b2, long j, int i) {
        n2.j(new f0$h(this, b2, j, i));
    }

    public void N0() {
        new f0$a0(this, "DaemonLoader").start();
    }

    public void O(long j, int i) {
        N((byte) 0, j, i);
    }

    public f0$n0 O0(String str) throws f0$l0 {
        String strS0;
        try {
            boolean z2 = Config.C;
            File fileQ0 = Tools.q0();
            String[] strArrK = K(z2, str, fileQ0);
            boolean z3 = false;
            boolean z4 = false;
            while (true) {
                String[] strArr = {"i", "o", "e"};
                for (int i = 0; i < 3; i++) {
                    new File(fileQ0, strArr[i]).delete();
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
                f0$n0 f0_n0 = new f0$n0();
                f0_n0.f916a = processI;
                if (processI != null) {
                    f0_n0.f917b = processI.getOutputStream();
                    f0_n0.f918c = processI.getInputStream();
                    f0_n0.f919d = processI.getErrorStream();
                }
                if (j(f0_n0, fileQ0)) {
                    y = f0_n0;
                    this.f797f = Tools.D0(processI);
                    if (!e0()) {
                        break;
                    }
                    n2.h(new f0$v(this));
                    return f0_n0;
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
                        r.k = true;
                        e1.i("Show error alert");
                        f.o(f.b().setCustomTitle(Tools.g0(R$string.daemon_failed)).setMessage(b2.f(R$string.failed_run_daemon) + "\n\n" + e2.f745a).setPositiveButton(b2.f(R$string.exit), new p0(400)).setNeutralButton("SU", new f0$k(this)).setNegativeButton(b2.f(R$string.skip), (DialogInterface$OnClickListener) null));
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
                        r.k = true;
                        e1.i("Show error alert");
                        f.o(f.b().setCustomTitle(Tools.g0(R$string.daemon_failed)).setMessage(b2.f(R$string.failed_run_daemon) + "\n\n" + e2.f745a).setPositiveButton(b2.f(R$string.exit), new p0(400)).setNeutralButton("SU", new f0$k(this)).setNegativeButton(b2.f(R$string.skip), (DialogInterface$OnClickListener) null));
                        return null;
                    }
                    strArrK = K(z2, strS0, fileQ0);
                    z4 = true;
                }
            }
        } catch (f0$l0 e2) {
            throw e2;
        } catch (Exception e3) {
            e1.l("" + e3.getMessage(), e3);
            Tools.J1(e3.getMessage());
        }
        return null;
    }

    public long P(byte b2, long j, int i) {
        if (!this.f793b.h()) {
            return -1L;
        }
        n2.j(new f0$g0(this, b2, j, i));
        Exchanger exchanger = this.f794c;
        while (true) {
            try {
                w wVar = new w((byte[]) exchanger.exchange(null, 500L, TimeUnit.MILLISECONDS));
                wVar.l(3);
                if (wVar.g() == j) {
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

    public long Q(long j, int i) {
        return P((byte) 0, j, i);
    }

    public void Q0(byte b2) {
        n2.j(new f0$b0(this, b2));
        try {
            Thread.sleep(3L);
        } catch (InterruptedException unused) {
        }
    }

    public void R(byte b2, int[] iArr, long[] jArr) {
        if (iArr.length == jArr.length) {
            n2.j(new f0$f0(this, iArr, b2, jArr));
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

    public void U0(byte b2, int i, long j, long j2, double d2, double d3) {
        c0();
        n2.j(new f0$d(this, b2, i, I(1), j, j2, d2, d3));
    }

    public void V(byte b2) {
        u0(b2, (byte) 56);
    }

    public void V0(int i, long j, long j2, double d2, double d3) {
        U0((byte) 0, i, j, j2, d2, d3);
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

    public void Y(byte b2, int i, int i2, int i3, long j, long j2, long j3, int i4, long j4, int i5, int i6, int i7, double d2, int i8) {
        n2.j(new f0$e0(this, b2, i, i2, i3, j, j2, j3, i4, j4, i5, i6, i7, d2, i8));
    }

    public double Z() {
        return ((double) this.n) / ((double) this.o);
    }

    public void a(c cVar, int i) {
        Object f0_k0 = cVar;
        if (i != 0) {
            f0_k0 = new f0$k0(cVar, i);
        }
        synchronized (this.q) {
            try {
                this.q.add(f0_k0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public CharSequence a0() {
        int iD0;
        String str;
        String str2;
        int i;
        if (this.f793b.h()) {
            if (Config.C) {
                iD0 = Tools.d0(R$color.daemon_user);
                str = "$";
            } else if (Config.vSpaceReal) {
                iD0 = Tools.d0(R$color.daemon_vroot);
                str = "@";
            } else {
                iD0 = Tools.d0(R$color.daemon_root);
                str = "#";
            }
            return Tools.t(str, iD0);
        }
        f0$n0 f0_n0 = this.f792a;
        if (f0_n0 == null || f0_n0.f916a == null) {
            if (Config.C) {
                str2 = "!";
            } else {
                str2 = Config.vSpaceReal ? "I" : "?";
            }
            i = R$color.daemon_bad;
        } else {
            if (Config.C) {
                str2 = "V";
            } else {
                str2 = Config.vSpaceReal ? "U" : "W";
            }
            i = R$color.daemon_wait;
        }
        return Tools.t(str2, Tools.d0(i));
    }

    public void b(h2 h2Var) {
        synchronized (this.r) {
            try {
                this.r.add(h2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int b0() {
        return this.f797f;
    }

    public void c(h2 h2Var) {
        synchronized (this.s) {
            try {
                this.s.add(h2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(byte b2, long j) {
        this.p += j;
        E0(b2);
    }

    public boolean d0() {
        boolean z2 = (v || this.f793b.h()) ? false : true;
        if (z2) {
            f.o(f.b().setCustomTitle(Tools.g0(R$string.daemon_fail)).setMessage(b2.f(R$string.wait_daemon)).setNegativeButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null));
        }
        return !z2;
    }

    public void e(long j) {
        d((byte) 0, j);
    }

    public boolean e0() {
        Process process;
        Integer numValueOf;
        String str;
        String string;
        f0$n0 f0_n0 = y;
        if (f0_n0 == null || (process = f0_n0.f916a) == null) {
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
        if (!r.k && !f1.f952b) {
            if (numValueOf == null || (!(numValueOf.intValue() == 9 || numValueOf.intValue() == 15 || numValueOf.intValue() == 137) || Config.h == 0)) {
                str = null;
            } else {
                Config.b(R$id.config_ram).f42d = 0;
                Config.k();
                str = "Found SIGKILL/SIGTERM/SIGKILL_OOM: " + numValueOf;
            }
            if (str != null) {
                e1.i(str);
                n2.i(new f0$c0(this));
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
            String strH = e0.h();
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
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(f0_n0.f919d));
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
            sb.append(h0.f(false));
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
            if (!n0.d(str2) && str == null) {
                try {
                    if (str2.contains("backtrace:") && str2.contains(this.f798g) && !str2.contains("SIGPIPE")) {
                        n0.i(str2);
                    }
                } catch (OutOfMemoryError e7) {
                    e1.s("Failed send string for daemon exit", e7);
                }
            }
            try {
                str2 = b2.f(R$string.daemon_unexpected_closed) + '\n' + str2;
            } catch (OutOfMemoryError e8) {
                e1.s("Failed out string for daemon exit", e8);
            }
            r.k = true;
            e1.i("Show error alert");
            f.o(f.b().setCustomTitle(Tools.g0(R$string.daemon_exited)).setMessage(str2).setPositiveButton(b2.f(R$string.exit), new p0(500)).setNegativeButton(b2.f(R$string.skip), (DialogInterface$OnClickListener) null));
            this.f793b.n(false);
            MainService.instance.q0();
            if (numValueOf != null && (numValueOf.intValue() == 9 || numValueOf.intValue() == 15 || numValueOf.intValue() == 137)) {
                f.o(f.b().setCustomTitle(Tools.g0(R$string.daemon_exited)).setMessage(b2.f(numValueOf.intValue() == 137 ? R$string.daemon_killed_oom : R$string.daemon_killed)).setNegativeButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null));
            }
        }
        return false;
    }

    public void f(byte b2, long j, int i) {
        n2.j(new f0$a(this, b2, i, j));
    }

    public void f0(byte b2, List list) {
        f0$j0 f0_j0M0 = M0(list, e0.m());
        if (f0_j0M0.f887a.length == 0) {
            return;
        }
        if (f0_j0M0.f889c == 0) {
            l(b2);
            return;
        }
        n2.j(new f0$s(this, f0_j0M0, b2));
        MainService.N0(f0_j0M0.f889c, b2);
        i2.l = null;
    }

    public void g(long j, int i) {
        f((byte) 0, j, i);
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
        ?? r15;
        byte b2;
        MainService mainService;
        TimersEditor timersEditor;
        int i;
        ?? r16 = this;
        byte b3 = 0;
        z = false;
        boolean z2 = false;
        boolean z3 = false;
        try {
            w wVar = new w(bArr);
            byte bE = wVar.e();
            try {
                byte bE2 = wVar.e();
                try {
                    try {
                        switch (bE) {
                            case 16:
                                b2 = bE;
                                r16 = ", size: ";
                                MainService.instance.l0(wVar);
                                break;
                            case 17:
                                long jG = wVar.g();
                                long jG2 = wVar.g();
                                int iF = wVar.f();
                                if (iF == 0 && r16.h > 0 && bE2 == 0) {
                                    long j = bE2;
                                    int iD = MainService.D() & 127;
                                    int i2 = r16.h;
                                    long j2 = r16.j;
                                    long j3 = r16.k;
                                    long j4 = r16.l;
                                    b2 = bE;
                                    r16 = ", size: ";
                                    E(j, 0L, iD, 536870912, i2, j2, j3, j4);
                                } else {
                                    b2 = bE;
                                    Object obj = ", size: ";
                                    MainService.instance.o0(bE2, jG, jG2, iF);
                                    r16 = obj;
                                    if (iF == 0) {
                                        MainService.instance.X(bE2, null);
                                        r16 = obj;
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
                                d dVar = MainService.instance.u0;
                                new d$a();
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
                                for (int i3 = 0; i3 < iE; i3++) {
                                    iArr[i3] = wVar.f();
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
                                    i = 19;
                                } else {
                                    timersEditor = MainService.instance.n0;
                                    i = 44;
                                }
                                int i4 = i * 4;
                                boolean[] zArr = new boolean[i4];
                                for (int i5 = 0; i5 < i4; i5++) {
                                    zArr[i5] = wVar.e() != 0;
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
                        r15 = r16;
                        e1.l("Failed process message: " + b3 + r15 + bArr.length, e);
                    }
                } catch (BufferUnderflowException e3) {
                    e = e3;
                    b3 = bE;
                    r15 = ", size: ";
                    e1.l("Failed process message: " + b3 + r15 + bArr.length, e);
                }
            } catch (BufferUnderflowException e4) {
                e = e4;
                b2 = bE;
                r16 = ", size: ";
            }
        } catch (BufferUnderflowException e5) {
            e = e5;
        }
    }

    void i(String str, boolean z2) throws f0$l0 {
        int i;
        String str2;
        File file = new File(str);
        if (!file.exists()) {
            i = R$string.file_not_found;
        } else if (file.isFile()) {
            String[] strArr = {"ls", "-l", Tools.F0(str)};
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Tools.I(strArr).getInputStream()));
                e1.p("ls for '" + str + "' got: " + bufferedReader.readLine());
                bufferedReader.close();
            } catch (Exception e2) {
                e1.l("run '" + Arrays.toString(strArr) + "' error", e2);
            }
            i = !file.canExecute() ? R$string.not_execute : 0;
        } else {
            i = R$string.not_file;
        }
        if (i != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(Tools.N1(i));
            sb.append(": '");
            sb.append(str);
            sb.append("'\n\n");
            sb.append(b2.f(R$string.check_install));
            if (i == 2131296817) {
                str2 = "\n\n" + b2.f(R$string.sdcard_install);
            } else {
                str2 = "";
            }
            sb.append(str2);
            throw new f0$l0(sb.toString());
        }
    }

    public void i0(byte b2, List list) {
        f0$j0 f0_j0M0 = M0(list, false);
        if (f0_j0M0.f887a.length == 0) {
            return;
        }
        n2.j(new f0$t(this, f0_j0M0, b2));
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
    public void n0(byte b2, int i, int i2, int[] iArr, long[] jArr, long[] jArr2, long j, long j2, long j3) {
        int length;
        byte[] bArr;
        boolean z2 = (i & 4194304) != 0;
        if (z2 && i2 != jArr.length) {
            z2 = false;
        }
        if (z2) {
            for (int i3 : iArr) {
                if (((i3 | i) & (-4194306)) == 0) {
                }
            }
            if (z2) {
                length = jArr.length;
                bArr = new byte[length];
                for (int i4 = 0; i4 < length; i4++) {
                    bArr[i4] = (byte) jArr[i4];
                }
                s0(b2, 1, bArr, j, j2, j3);
                return;
            }
        } else if (z2) {
            length = jArr.length;
            bArr = new byte[length];
            while (i4 < length) {
                bArr[i4] = (byte) jArr[i4];
            }
            s0(b2, 1, bArr, j, j2, j3);
            return;
        }
        n2.j(new f0$i(this, iArr, b2, i, i2, j, j2, j3, jArr, jArr2));
        i2.l = null;
    }

    public void o(byte b2) {
        u0(b2, (byte) 46);
    }

    public void o0(byte b2, long j, long j2, int i, long j3, long j4, long j5) {
        e1.d("searchMask: " + Long.toHexString(j) + ':' + Long.toHexString(j2) + " as " + Integer.toHexString(i) + " in " + Long.toHexString(j3) + '-' + Long.toHexString(j4) + ", " + Long.toString(j5));
        a.e eVarB = c.B();
        CharSequence charSequence = null;
        for (int i2 = 0; i2 < eVarB.size(); i2++) {
            int iKeyAt = eVarB.keyAt(i2);
            if (iKeyAt != 0 && (i & iKeyAt) == iKeyAt) {
                charSequence = (CharSequence) eVarB.valueAt(i2);
            }
        }
        String hexString = Long.toHexString(j);
        Locale locale = Locale.US;
        String upperCase = hexString.toUpperCase(locale);
        String upperCase2 = Long.toHexString(j2).toUpperCase(locale);
        if (upperCase.length() < upperCase2.length()) {
            upperCase = new String(new char[upperCase2.length() - upperCase.length()]).replace((char) 0, '0') + upperCase;
        } else if (upperCase.length() > upperCase2.length()) {
            upperCase2 = new String(new char[upperCase.length() - upperCase2.length()]).replace((char) 0, '0') + upperCase2;
        }
        MainService.instance.h0(new y().b("%s %s %s; %s: %s; %s: %s", Tools.N1(R$string.address), charSequence, upperCase, Tools.N1(R$string.mask), upperCase2, Tools.N1(R$string.type), c.v(i & 127)).d());
        n2.j(new f0$j(this, b2, j, j2, i, j3, j4, j5));
        i2.l = null;
    }

    public void p(byte b2, long j, long j2, int i) {
        n2.j(new f0$c(this, b2, j, j2, i));
    }

    public void p0(byte b2, long j, int i, int i2, long j2, long j3, long j4) {
        CharSequence charSequence;
        a.e eVarB = c.B();
        if ((i2 & 33554432) != 0) {
            charSequence = "" + eVarB.get(536870912) + '*';
        } else {
            CharSequence charSequence2 = null;
            for (int i3 = 0; i3 < eVarB.size(); i3++) {
                int iKeyAt = eVarB.keyAt(i3);
                if (iKeyAt != 0 && (i2 & iKeyAt) == iKeyAt) {
                    charSequence2 = (CharSequence) eVarB.valueAt(i3);
                }
            }
            charSequence = charSequence2;
        }
        c cVar = new c(0L, j, i2 & 127);
        y yVar = new y();
        CharSequence[] charSequenceArr = new CharSequence[3];
        charSequenceArr[0] = b2.f(R$string.value);
        charSequenceArr[1] = charSequence;
        Object[] objArr = new Object[3];
        objArr[0] = cVar.J();
        objArr[1] = i != 0 ? " X" + i : "";
        objArr[2] = cVar.u();
        charSequenceArr[2] = Tools.t(Tools.L1("%s%s %s", objArr), cVar.m());
        yVar.b("%s %s %s", charSequenceArr);
        MainService.instance.h0(yVar.d());
        y0(b2, j, 0L, i, i2, j2, j3, j4);
    }

    public void q(long j, long j2, int i) {
        p((byte) 0, j, j2, i);
    }

    public void q0(byte b2, short s, int i, long j, long j2, long j3) {
        String hexString = Integer.toHexString(s);
        e1.d("searchPointer: " + hexString + " as " + Integer.toHexString(i) + " in " + Long.toHexString(j) + '-' + Long.toHexString(j2) + ", " + Long.toString(j3));
        MainService mainService = MainService.instance;
        StringBuilder sb = new StringBuilder();
        sb.append("-> ");
        sb.append(hexString);
        mainService.h0(sb.toString());
        n2.j(new f0$l(this, b2, s, i, j, j2, j3));
        i2.l = null;
    }

    public void r0(byte b2, long j, long j2, int i, int i2, long j3, long j4, long j5) {
        a.e eVarB = c.B();
        int i3 = (i2 & 33554432) != 0 ? i2 & (-33554433) : i2;
        CharSequence charSequence = null;
        for (int i4 = 0; i4 < eVarB.size(); i4++) {
            int iKeyAt = eVarB.keyAt(i4);
            if (iKeyAt != 0 && (i3 & iKeyAt) == iKeyAt) {
                charSequence = (CharSequence) eVarB.valueAt(i4);
            }
        }
        int i5 = i3 & 127;
        c cVar = new c(0L, j, i5);
        c cVar2 = new c(0L, j2, i5);
        y yVar = new y();
        CharSequence[] charSequenceArr = new CharSequence[3];
        charSequenceArr[0] = b2.f(R$string.value);
        charSequenceArr[1] = charSequence;
        Object[] objArr = new Object[4];
        objArr[0] = cVar.J();
        objArr[1] = cVar2.J();
        objArr[2] = i == 0 ? "" : " X" + i;
        objArr[3] = cVar.u();
        charSequenceArr[2] = Tools.t(Tools.L1("%s ~ %s%s %s", objArr), cVar.m());
        yVar.b("%s %s %s", charSequenceArr);
        MainService.instance.h0(yVar.d());
        y0(b2, j, j2, i, i3 | 8388608, j3, j4, j5);
    }

    public void s() {
        t((byte) 0);
    }

    public void s0(byte b2, int i, byte[] bArr, long j, long j2, long j3) {
        String string = x0.b(null, i, bArr, bArr.length, true, true, null).toString();
        if (string.length() > 48) {
            string = string.substring(0, 48) + "...";
        }
        e1.d("searchText: [" + bArr.length + "] = " + string + " in " + Long.toHexString(j) + '-' + Long.toHexString(j2) + ", " + Long.toString(j3));
        if (bArr.length == 0) {
            return;
        }
        if (bArr.length == 1) {
            p0(b2, bArr[0], 0, 536870913, j, j2, j3);
            return;
        }
        MainService.instance.h0(Tools.L1("%s[%d] = %s", Tools.N1(R$string.text), Integer.valueOf(bArr.length), string));
        n2.j(new f0$m(this, b2, i, j, j2, j3, bArr));
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
            n2.d().post(new f0$z(this));
        }
    }

    void u0(byte b2, byte b3) {
        n2.j(new f0$y(this, b2, b3));
    }

    void v0(byte b2) {
        n2.j(new f0$x(this, b2));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:21:0x008a  */
    /* JADX WARN: Instruction removed from duplicated block: B:15:0x004b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x006e, please report this as an issue */
    public void w(byte b2, long j, long j2, int i, String str, String str2) {
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
                n2.j(new f0$b(this, bytes, bytes2, b2, j, j2, i, str));
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
            n2.j(new f0$b(this, bytes, bytes2, b2, j, j2, i, str));
            return;
        }
        e1.i("pkg big: " + bytes2.length + " > 4000");
    }

    public void w0() {
        x0((byte) 0);
    }

    public void x(long j, long j2, int i, String str, String str2) {
        w((byte) 0, j, j2, i, str, str2);
    }

    public void x0(byte b2) {
        if (this.u == null || Config.h != this.u.intValue()) {
            if (this.u != null) {
                MainService.instance.m();
            }
            this.u = Integer.valueOf(Config.h);
        }
        String absolutePath = Tools.q0().getAbsolutePath();
        n2.j(new f0$w(this, b2, absolutePath.getBytes(), absolutePath));
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
