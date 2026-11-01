package android.ext;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Process;
import catch_.me_.if_.you_.can_.R;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    class a extends g0 {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            h0.a();
        }
    }

    class b extends g0 {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            e1.h("GG started: " + h0.c());
        }
    }

    public static void a() {
        int i;
        String strK0 = Tools.K0();
        StringBuilder sb = new StringBuilder();
        sb.append("GG_");
        String str = Build.VERSION.RELEASE;
        sb.append(str);
        sb.append("_API_");
        int i2 = Build.VERSION.SDK_INT;
        sb.append(i2);
        sb.append(".log");
        String absolutePath = new File(strK0, sb.toString()).getAbsolutePath();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(absolutePath, false));
            bufferedWriter.write(new GregorianCalendar().getTime().toString());
            bufferedWriter.write("\n");
            bufferedWriter.write("Release: ");
            bufferedWriter.write(str);
            bufferedWriter.write("\n");
            bufferedWriter.write("SDK: ");
            bufferedWriter.write("" + i2);
            bufferedWriter.write("\n");
            try {
                Process processR = e2.r(Tools.removeNewLinesChars("hfkr#%olvw=%>#ov#0o#2surf2>#iru#l#lq#2surf2->#gr#hfkr#%fdw#'l2pdsv=%>#fdw#'l2pdsv>#grqh>#h{lw>"), null, true);
                if (processR == null) {
                    bufferedWriter.write(e2.f745a);
                } else {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processR.getInputStream()));
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        bufferedWriter.write(line);
                        bufferedWriter.write("\n");
                    }
                    bufferedReader.close();
                }
                e2.f745a = "";
                bufferedWriter.write("current pid: ");
                z1.d dVar = MainService.instance.v0;
                bufferedWriter.write(dVar != null ? "" + dVar.f1437f : "0");
                bufferedWriter.write("\n");
                bufferedWriter.write("search results:\n");
                ggd.a aVar = MainService.instance.s0;
                c cVar = new c();
                synchronized (aVar) {
                    try {
                        int i3 = aVar.i();
                        for (int i4 = 0; i4 < i3; i4++) {
                            aVar.f(i4, cVar);
                            bufferedWriter.write(t2.e(8, cVar.f672a) + ' ' + cVar.J() + ' ' + ((Object) cVar.u()) + " (" + Integer.toBinaryString(cVar.f674c) + ")\n");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                bufferedWriter.write("saved list:\n");
                ggd.e eVarF = MainService.instance.t0.f();
                for (int i5 = 0; i5 < eVarF.l(); i5++) {
                    h2 h2Var = (h2) eVarF.n(i5);
                    if (h2Var != null) {
                        bufferedWriter.write(t2.e(8, h2Var.f672a) + ' ' + h2Var.J() + ' ' + ((Object) h2Var.u()) + " (" + Integer.toBinaryString(h2Var.f674c) + ")\n");
                    }
                }
            } catch (Exception e2) {
                bufferedWriter.write(e2.getMessage());
                bufferedWriter.write("\n");
            }
            bufferedWriter.close();
            i = R.string.log_saved;
        } catch (Exception e3) {
            e1.l("Error opening file to save: " + absolutePath, e3);
            i = R.string.failed_save;
        }
        f.o(ggf.b().setCustomTitle(Tools.g0(R.string.region_log)).setMessage(Tools.L1(b2.f(i), absolutePath)).setNegativeButton(b2.f(R.string.ok), (DialogInterface.OnClickListener) null));
    }

    public static String b() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Android(");
        Class[] clsArr = {Build.VERSION.class, Build.class};
        for (int i = 0; i < 2; i++) {
            for (Field field : clsArr[i].getFields()) {
                try {
                    int modifiers = field.getModifiers();
                    if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                        sb.append(field.getName());
                        sb.append(": ");
                        try {
                            Object obj = field.get(null);
                            if (obj instanceof Object[]) {
                                sb.append(Arrays.toString((Object[]) obj));
                            } else {
                                sb.append(obj);
                            }
                        } catch (Throwable th) {
                            sb.append(th.getMessage());
                        }
                        sb.append("; ");
                    }
                } catch (Throwable th2) {
                    sb.append(th2.getMessage());
                }
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static String c() {
        StringBuilder sb = new StringBuilder();
        float f2 = 1;
        sb.append((103.5f * f2) - 2.1f);
        sb.append(" (");
        sb.append((int) (((f2 * 16372.7f) - 217.7f) + 0.5f));
        sb.append(") ");
        sb.append(b1.X());
        sb.append(" on ");
        sb.append(b());
        return sb.toString();
    }

    public static int d() {
        return e("" + ((1 * 112.8f) - 11.4f));
    }

    public static int e(String str) {
        String[] strArrSplit = str.replaceAll("[^\\d.]", "").split("\\.", -1);
        int i = 0;
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                i = (i * 100) + Integer.parseInt(strArrSplit[i2]);
            } catch (NumberFormatException e2) {
                e1.s("bad part of version: " + strArrSplit[i2] + '(' + str + ')', e2);
            }
        }
        return i;
    }

    public static String f(boolean z) {
        return g(z, 0);
    }

    private static String g(boolean z, int i) {
        StringBuilder sb;
        int i2;
        String line;
        StringBuilder sb2 = new StringBuilder();
        try {
            try {
                String strRemoveNewLinesChars = Tools.removeNewLinesChars("h{hf#orjfdw#0g#");
                if (z) {
                    sb = new StringBuilder();
                    sb.append(strRemoveNewLinesChars);
                    sb.append("-v threadtime ");
                } else {
                    sb = new StringBuilder();
                    sb.append(strRemoveNewLinesChars);
                    sb.append("-v brief ");
                }
                Process processR = e2.r(sb.toString(), null, true);
                if (processR == null) {
                    sb2.append(e2.f745a);
                } else {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processR.getInputStream()));
                    String[] strArr = i > 0 ? new String[i] : null;
                    loop0: while (true) {
                        i2 = 0;
                        while (true) {
                            if (Thread.interrupted() || (line = bufferedReader.readLine()) == null) {
                                break loop0;
                            }
                            boolean zContains = line.contains("AndroidService");
                            if (!zContains && line.contains("android-daemon")) {
                                zContains = true;
                            }
                            if (!zContains && line.contains("AndroidRuntime")) {
                                zContains = true;
                            }
                            if (!zContains && line.contains("libc")) {
                                zContains = true;
                            }
                            if (!zContains && line.contains("Vold")) {
                                zContains = true;
                            }
                            if (!zContains && line.contains("DEBUG")) {
                                zContains = true;
                            }
                            if (!zContains && line.contains("CRASH")) {
                                zContains = true;
                            }
                            if (!zContains && line.contains("*** *** *** *** *** *** ***")) {
                                zContains = true;
                            }
                            if (!zContains && line.contains(Tools.C0())) {
                                zContains = true;
                            }
                            if (!zContains && line.contains("--- beginning of ")) {
                                zContains = true;
                            }
                            int iMyPid = Process.myPid();
                            if (!zContains && iMyPid > 0 && line.contains(Integer.toString(iMyPid))) {
                                zContains = true;
                            }
                            int iJ = MainService.instance.i.J();
                            if (!zContains && iJ > 0 && line.contains(Integer.toString(iJ))) {
                                zContains = true;
                            }
                            int iB0 = MainService.instance.i.b0();
                            if ((!zContains && iB0 > 0 && line.contains(Integer.toString(iB0))) || zContains) {
                                if (strArr != null) {
                                    int i3 = i2 + 1;
                                    strArr[i2] = line;
                                    if (i3 >= i) {
                                        break;
                                    }
                                    i2 = i3;
                                } else {
                                    sb2.append(line);
                                    sb2.append('\n');
                                }
                            }
                        }
                    }
                    if (strArr != null) {
                        int i4 = i2;
                        while (!Thread.interrupted()) {
                            int i5 = i4 + 1;
                            String str = strArr[i4];
                            if (str != null) {
                                sb2.append(str);
                                sb2.append('\n');
                            }
                            i4 = i5 >= i ? 0 : i5;
                            if (i4 == i2) {
                                break;
                            }
                        }
                    }
                }
            } catch (OutOfMemoryError unused) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("OutOfMemoryError\n");
                sb2 = sb3;
            }
        } catch (OutOfMemoryError unused2) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(g(z, 500));
            sb2 = sb4;
        } catch (Throwable th) {
            sb2.append(th.getMessage());
            sb2.append('\n');
            e1.g("getLogcat fail.", th);
        }
        e2.f745a = "";
        try {
            return sb2.toString();
        } catch (OutOfMemoryError unused3) {
            return "OutOfMemoryError\n";
        }
    }

    public static void h() {
        Tools.H1(R.string.collect_data_to_region_log);
        new a("runCollectRegionLog").start();
    }

    public static void i() {
        new b("showInfo").start();
    }
}
