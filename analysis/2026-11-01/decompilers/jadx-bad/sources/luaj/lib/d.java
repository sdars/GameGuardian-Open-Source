package luaj.lib;

import android.system.Os;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Field f1790a;

    public static String a(File file) {
        try {
            return file.getCanonicalPath();
        } catch (IOException unused) {
            return file.getAbsolutePath();
        }
    }

    public static boolean b(FileDescriptor fileDescriptor, e eVar, boolean z) {
        if (eVar == null) {
            return true;
        }
        String strG = g(fileDescriptor);
        if (strG == null) {
            return false;
        }
        return !eVar.m(strG, z);
    }

    static int c(FileDescriptor fileDescriptor) throws NoSuchFieldException {
        Field declaredField;
        Field field = f1790a;
        if (field == null) {
            try {
                declaredField = FileDescriptor.class.getDeclaredField("descriptor");
            } catch (NoSuchFieldException unused) {
                declaredField = FileDescriptor.class.getDeclaredField("fd");
            }
            field = declaredField;
            field.setAccessible(true);
            f1790a = field;
        }
        return field.getInt(fileDescriptor);
    }

    public static String d(String str) {
        if (!str.startsWith("/data/data/")) {
            return str;
        }
        return "/data/user/0/" + str.substring(11);
    }

    public static FileInputStream e(File file, e eVar) {
        if (eVar == null) {
            return new FileInputStream(file);
        }
        String strA = a(file);
        if (eVar.m(strA, true)) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(new File(strA));
        if (b(fileInputStream.getFD(), eVar, true)) {
            return fileInputStream;
        }
        try {
            fileInputStream.close();
        } catch (IOException unused) {
        }
        return null;
    }

    public static RandomAccessFile f(File file, e eVar) throws IOException {
        if (eVar == null) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.setLength(0L);
            return randomAccessFile;
        }
        String strA = a(file);
        if (eVar.m(strA, false)) {
            return null;
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(new File(strA), "rw");
        if (b(randomAccessFile2.getFD(), eVar, false)) {
            randomAccessFile2.setLength(0L);
            return randomAccessFile2;
        }
        try {
            randomAccessFile2.close();
        } catch (IOException unused) {
        }
        return null;
    }

    public static String g(FileDescriptor fileDescriptor) {
        try {
            return h("/proc/self/fd/" + c(fileDescriptor));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String h(String str) {
        try {
            try {
                return Files.readSymbolicLink(Paths.get(str, new String[0])).toString();
            } catch (Throwable unused) {
                return Os.readlink(str);
            }
        } catch (Throwable unused2) {
            return null;
        }
    }
}
