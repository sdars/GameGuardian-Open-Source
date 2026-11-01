/*
 * Decompiled with CFR 0.152.
 */
package luaj.lib;

import android.system.Os;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import luaj.lib.a;
import luaj.lib.b;
import luaj.lib.c;
import luaj.lib.e;

public abstract class d {
    private static volatile Field a;

    public static String a(File object) {
        try {
            String string2 = ((File)object).getCanonicalPath();
            object = string2;
        }
        catch (IOException iOException) {
            object = ((File)object).getAbsolutePath();
        }
        return object;
    }

    public static boolean b(FileDescriptor object, e e4, boolean bl) {
        if (e4 == null) {
            return true;
        }
        if ((object = d.g((FileDescriptor)object)) == null) {
            return false;
        }
        return e4.m((String)object, bl) ^ true;
    }

    static int c(FileDescriptor fileDescriptor) {
        Field field;
        Field field2 = field = a;
        if (field == null) {
            try {
                field2 = FileDescriptor.class.getDeclaredField("descriptor");
            }
            catch (NoSuchFieldException noSuchFieldException) {
                field2 = FileDescriptor.class.getDeclaredField("fd");
            }
            ((AccessibleObject)field2).setAccessible(true);
            a = field2;
        }
        return field2.getInt(fileDescriptor);
    }

    public static String d(String string2) {
        CharSequence charSequence = string2;
        if (string2.startsWith("/data/data/")) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("/data/user/0/");
            ((StringBuilder)charSequence).append(string2.substring(11));
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return charSequence;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static FileInputStream e(File object, e e4) {
        if (e4 == null) {
            return new FileInputStream((File)object);
        }
        if (e4.m((String)(object = d.a((File)object)), true)) {
            return null;
        }
        if (d.b(((FileInputStream)(object = new FileInputStream(new File((String)object)))).getFD(), e4, true)) return object;
        try {
            ((FileInputStream)object).close();
            return null;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static RandomAccessFile f(File object, e e4) {
        if (e4 == null) {
            object = new RandomAccessFile((File)object, "rw");
            ((RandomAccessFile)object).setLength(0L);
            return object;
        }
        if (e4.m((String)(object = d.a((File)object)), false)) {
            return null;
        }
        if (d.b(((RandomAccessFile)(object = new RandomAccessFile(new File((String)object), "rw"))).getFD(), e4, false)) {
            ((RandomAccessFile)object).setLength(0L);
            return object;
        }
        try {
            ((RandomAccessFile)object).close();
            return null;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public static String g(FileDescriptor object) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("/proc/self/fd/");
            stringBuilder.append(d.c((FileDescriptor)object));
            object = d.h(stringBuilder.toString());
            return object;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private static String h(String string2) {
        try {
            String string3 = c.a(b.a(luaj.lib.a.a(string2, new String[0])));
            return string3;
        }
        catch (Throwable throwable) {
            try {
                string2 = Os.readlink((String)string2);
                return string2;
            }
            catch (Throwable throwable2) {
                return null;
            }
        }
    }
}

