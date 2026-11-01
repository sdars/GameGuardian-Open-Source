package android.ext;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.fix.Button;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View$OnClickListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class PathSelector extends Button implements View$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean f322a = true;

    public PathSelector(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0034 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:12:0x0012, B:14:0x0018, B:19:0x0034, B:21:0x003a, B:22:0x0051, B:23:0x0057, B:26:0x0062, B:28:0x0068, B:33:0x0088, B:35:0x008e, B:30:0x006e, B:32:0x0085), top: B:44:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x003a A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:12:0x0012, B:14:0x0018, B:19:0x0034, B:21:0x003a, B:22:0x0051, B:23:0x0057, B:26:0x0062, B:28:0x0068, B:33:0x0088, B:35:0x008e, B:30:0x006e, B:32:0x0085), top: B:44:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0051 A[Catch: all -> 0x002e, PHI: r4
      0x0051: PHI (r4v6 java.lang.String) = (r4v5 java.lang.String), (r4v8 java.lang.String) binds: [B:18:0x0032, B:21:0x003a] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x002e, blocks: (B:12:0x0012, B:14:0x0018, B:19:0x0034, B:21:0x003a, B:22:0x0051, B:23:0x0057, B:26:0x0062, B:28:0x0068, B:33:0x0088, B:35:0x008e, B:30:0x006e, B:32:0x0085), top: B:44:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:12:0x0012, B:14:0x0018, B:19:0x0034, B:21:0x003a, B:22:0x0051, B:23:0x0057, B:26:0x0062, B:28:0x0068, B:33:0x0088, B:35:0x008e, B:30:0x006e, B:32:0x0085), top: B:44:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0068 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:12:0x0012, B:14:0x0018, B:19:0x0034, B:21:0x003a, B:22:0x0051, B:23:0x0057, B:26:0x0062, B:28:0x0068, B:33:0x0088, B:35:0x008e, B:30:0x006e, B:32:0x0085), top: B:44:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x006e A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:12:0x0012, B:14:0x0018, B:19:0x0034, B:21:0x003a, B:22:0x0051, B:23:0x0057, B:26:0x0062, B:28:0x0068, B:33:0x0088, B:35:0x008e, B:30:0x006e, B:32:0x0085), top: B:44:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0085 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:12:0x0012, B:14:0x0018, B:19:0x0034, B:21:0x003a, B:22:0x0051, B:23:0x0057, B:26:0x0062, B:28:0x0068, B:33:0x0088, B:35:0x008e, B:30:0x006e, B:32:0x0085), top: B:44:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #0 {all -> 0x002e, blocks: (B:12:0x0012, B:14:0x0018, B:19:0x0034, B:21:0x003a, B:22:0x0051, B:23:0x0057, B:26:0x0062, B:28:0x0068, B:33:0x0088, B:35:0x008e, B:30:0x006e, B:32:0x0085), top: B:44:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1 A[ADDED_TO_REGION, EDGE_INSN: B:50:0x00a1->B:41:0x00a1 BREAK  A[LOOP:1: B:23:0x0057->B:40:0x009f], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:21:0x003a, please report this as an issue */
    private static void a(String str, ArrayList arrayList, String str2, String str3) {
        File file;
        int i;
        String absolutePath;
        String str4;
        int i2;
        if (str3 == null) {
            return;
        }
        int i3 = str2 == null ? 1 : 3;
        String str5 = str3;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 == 1) {
                try {
                    if (str3.startsWith("/data/data/")) {
                        str5 = str2 + str3.substring(11);
                        if (i4 != 2) {
                            file = new File(str5);
                            i = 0;
                            while (true) {
                                absolutePath = file.getAbsolutePath();
                                if (absolutePath.startsWith(str)) {
                                    break;
                                }
                                if (file.isDirectory() || file.isFile()) {
                                    str4 = absolutePath.substring(str.length()).split("/", -1)[0];
                                    if (!arrayList.contains(str4)) {
                                        arrayList.add(str4);
                                    }
                                }
                                file = file.getParentFile();
                                if (file == null || file.getAbsolutePath().length() <= 1) {
                                    break;
                                }
                                i2 = i + 1;
                                if (i >= 20) {
                                    break;
                                } else {
                                    i = i2;
                                }
                            }
                        } else if (str3.startsWith(str2)) {
                            str5 = "/data/data/" + str3.substring(str2.length());
                            file = new File(str5);
                            i = 0;
                            while (true) {
                                absolutePath = file.getAbsolutePath();
                                if (absolutePath.startsWith(str)) {
                                    break;
                                    break;
                                }
                                if (file.isDirectory()) {
                                    str4 = absolutePath.substring(str.length()).split("/", -1)[0];
                                    if (!arrayList.contains(str4)) {
                                        arrayList.add(str4);
                                    }
                                } else {
                                    str4 = absolutePath.substring(str.length()).split("/", -1)[0];
                                    if (!arrayList.contains(str4)) {
                                        arrayList.add(str4);
                                    }
                                }
                                file = file.getParentFile();
                                if (file == null) {
                                    break;
                                }
                                break;
                                break;
                                i = i2;
                            }
                        }
                    }
                } catch (Throwable th) {
                    e1.a(th);
                    return;
                }
            } else if (i4 != 2) {
                file = new File(str5);
                i = 0;
                while (true) {
                    absolutePath = file.getAbsolutePath();
                    if (absolutePath.startsWith(str)) {
                        break;
                        break;
                    }
                    if (file.isDirectory()) {
                        str4 = absolutePath.substring(str.length()).split("/", -1)[0];
                        if (!arrayList.contains(str4)) {
                            arrayList.add(str4);
                        }
                    } else {
                        str4 = absolutePath.substring(str.length()).split("/", -1)[0];
                        if (!arrayList.contains(str4)) {
                            arrayList.add(str4);
                        }
                    }
                    file = file.getParentFile();
                    if (file == null) {
                        break;
                        break;
                    } else {
                        break;
                        break;
                    }
                    i = i2;
                }
            } else if (str3.startsWith(str2)) {
                str5 = "/data/data/" + str3.substring(str2.length());
                file = new File(str5);
                i = 0;
                while (true) {
                    absolutePath = file.getAbsolutePath();
                    if (absolutePath.startsWith(str)) {
                        break;
                        break;
                    }
                    if (file.isDirectory()) {
                        str4 = absolutePath.substring(str.length()).split("/", -1)[0];
                        if (!arrayList.contains(str4)) {
                            arrayList.add(str4);
                        }
                    } else {
                        str4 = absolutePath.substring(str.length()).split("/", -1)[0];
                        if (!arrayList.contains(str4)) {
                            arrayList.add(str4);
                        }
                    }
                    file = file.getParentFile();
                    if (file == null) {
                        break;
                        break;
                    } else {
                        break;
                        break;
                    }
                    i = i2;
                }
            }
        }
    }

    private void b() {
        setText("...");
        setOnClickListener(this);
    }

    static boolean c(File file) {
        try {
            return file.isDirectory();
        } catch (Throwable unused) {
            return false;
        }
    }

    static String[] d(File file) {
        String[] list;
        try {
            list = file.list();
        } catch (SecurityException e2) {
            e1.s("Failed list dir: " + file.getAbsolutePath(), e2);
            list = null;
        }
        if (list != null) {
            return list;
        }
        try {
            String absolutePath = file.getAbsolutePath();
            String str = absolutePath.startsWith("/data/user/") ? "/data/user/" + absolutePath.split("/", -1)[3] + "/" : "/data/user/0/";
            String str2 = absolutePath + '/';
            ArrayList arrayList = new ArrayList();
            a(str2, arrayList, str, "/data/anr");
            a(str2, arrayList, str, "/data/app");
            a(str2, arrayList, str, "/data/app-lib");
            a(str2, arrayList, str, "/data/app-private");
            a(str2, arrayList, str, "/data/dalvik-cache/profiles");
            a(str2, arrayList, str, "/data/dalvik-cache/x86");
            a(str2, arrayList, str, "/data/dalvik-cache/armeabi");
            a(str2, arrayList, str, "/data/dalvik-cache/armeabi-v7a");
            a(str2, arrayList, str, "/data/dalvik-cache/arm");
            a(str2, arrayList, str, "/data/dalvik-cache/arm64-v8a");
            a(str2, arrayList, str, "/data/dalvik-cache/arm64");
            a(str2, arrayList, str, "/data/dalvik-cache/x86");
            a(str2, arrayList, str, "/data/dalvik-cache/x86_64");
            a(str2, arrayList, str, "/data/local/tmp");
            a(str2, arrayList, str, "/data/misc/user");
            a(str2, arrayList, str, "/data/misc/zoneinfo");
            a(str2, arrayList, str, "/data/resource-cache");
            a(str2, arrayList, str, "/data/security");
            a(str2, arrayList, str, "/data/system/cache");
            a(str2, arrayList, str, "/data/system/registered_services");
            a(str2, arrayList, str, "/data/system/shared_prefs");
            a(str2, arrayList, str, "/data/system/users");
            a(str2, arrayList, str, "/data/tmp");
            a(str2, arrayList, str, str);
            a(str2, arrayList, str, "/storage/emulated/legacy");
            a(str2, arrayList, str, "/storage/emulated/0");
            a(str2, arrayList, str, "/storage/emulated/sdcard0");
            a(str2, arrayList, str, "/storage/emulated/sdcard1");
            a(str2, arrayList, str, "/storage/sdcard0");
            a(str2, arrayList, str, "/storage/sdcard1");
            a(str2, arrayList, str, "/sdcard");
            a(str2, arrayList, str, Tools.K0());
            for (ApplicationInfo applicationInfo : Tools.B0().getInstalledApplications(0)) {
                a(str2, arrayList, str, applicationInfo.dataDir);
                a(str2, arrayList, str, applicationInfo.nativeLibraryDir);
                a(str2, arrayList, str, applicationInfo.publicSourceDir);
                a(str2, arrayList, str, applicationInfo.sourceDir);
                String[] strArr = applicationInfo.splitPublicSourceDirs;
                if (strArr != null) {
                    for (String str3 : strArr) {
                        a(str2, arrayList, str, str3);
                    }
                }
                if (Build$VERSION.SDK_INT >= 24) {
                    a(str2, arrayList, str, applicationInfo.deviceProtectedDataDir);
                }
                a(str2, arrayList, str, "/data/data/" + applicationInfo.packageName);
                a(str2, arrayList, str, "/data/app/" + applicationInfo.packageName + "-1/base.apk");
                a(str2, arrayList, str, "/data/app/" + applicationInfo.packageName + "-2/base.apk");
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        } catch (Throwable th) {
            e1.a(th);
            return null;
        }
    }

    static ArrayList e(int i, File file, String[] strArr, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            String lowerCase = str2.toLowerCase(Locale.US);
            if (str == null || lowerCase.startsWith(str)) {
                File file2 = new File(file, str2);
                boolean zC = c(file2);
                if (i != 0 || zC) {
                    arrayList.add(new PathSelector$d(file2, lowerCase, zC));
                }
            }
        }
        if (arrayList.size() > 1) {
            PathSelector$a pathSelector$a = new PathSelector$a(z);
            try {
                long j = -System.currentTimeMillis();
                Collections.sort(arrayList, pathSelector$a);
                e1.d("Sort " + arrayList.size() + " in " + (j + System.currentTimeMillis()));
            } catch (IllegalArgumentException e2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed sort:\n");
                try {
                    Collections.sort(arrayList, new PathSelector$b(sb));
                } catch (IllegalArgumentException unused) {
                    n0.i(sb.toString());
                }
                e1.a(e2);
            }
        }
        return arrayList;
    }

    @Override // android.view.View$OnClickListener
    public void onClick(View view) {
        new PathSelector$c(this, null).onClick(view);
    }
}
