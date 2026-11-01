/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.content.SharedPreferences;
import android.ext.Tools;
import android.ext.e1;
import android.ext.h0;
import android.ext.i;
import android.os.Process;
import android.text.TextUtils;
import d.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public abstract class a0 {
    private static final String a;
    private static final String b;
    private static final String c;
    private static final String d;
    private static final boolean e;
    private static volatile String f = ";;";

    static {
        e = a0.j();
        c = "bugged-packages";
        d = "bugged-uids";
        a = "native_crash.txt";
        b = " _QAZ_WSX_EDC_RFV_TGB_YHN_UJM_ ";
    }

    public static boolean a(String charSequence, String string2) {
        block8: {
            Object object;
            boolean bl = e;
            if (!bl) {
                return false;
            }
            if (i.d.equals(charSequence)) {
                return false;
            }
            if (((String)charSequence).startsWith("uid:")) {
                object = new StringBuilder();
                ((StringBuilder)object).append("uid:");
                ((StringBuilder)object).append(Process.myUid());
                if (((String)charSequence).equals(((StringBuilder)object).toString())) {
                    return false;
                }
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("CNC[");
            char c4 = bl ? (char)'1' : '0';
            ((StringBuilder)object).append(c4);
            ((StringBuilder)object).append("] - n: ");
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append("; ");
            ((StringBuilder)object).append((String)charSequence);
            e1.d(((StringBuilder)object).toString());
            if (!bl) break block8;
            try {
                object = new FileOutputStream(a0.g());
                ((OutputStream)object).write(((String)charSequence).getBytes());
                ((OutputStream)object).write(b.getBytes());
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append('\n');
                ((StringBuilder)charSequence).append(h0.c());
                ((OutputStream)object).write(((StringBuilder)charSequence).toString().getBytes());
                ((OutputStream)object).flush();
                ((OutputStream)object).close();
            }
            catch (Throwable throwable) {
                e1.l("Failed n CNC", throwable);
            }
        }
        return true;
    }

    public static void b(boolean bl) {
        block5: {
            boolean bl2 = e;
            if (bl2 && bl) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("CNC[");
                char c4 = bl2 ? (char)'1' : '0';
                stringBuilder.append(c4);
                stringBuilder.append("] - x");
                e1.d(stringBuilder.toString());
                if (!bl2) break block5;
                try {
                    a0.g().delete();
                }
                catch (Throwable throwable) {
                    e1.l("Failed x CNC", throwable);
                }
            }
        }
    }

    public static String[] c() {
        String string2;
        if (e && (string2 = a0.d()).length() > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("BUGGED_PACKAGES: ");
            stringBuilder.append(string2);
            e1.d(stringBuilder.toString());
            return string2.split(";");
        }
        return d.b.a;
    }

    private static String d() {
        String string2 = a0.l(Tools.M0().getString(c, ""));
        if (string2.length() > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(';');
            stringBuilder.append(string2);
            stringBuilder.append(';');
            f = stringBuilder.toString();
        }
        return string2;
    }

    public static String[] e() {
        String string2;
        if (e && (string2 = a0.f()).length() > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("BUGGED_UIDS: ");
            stringBuilder.append(string2);
            e1.d(stringBuilder.toString());
            return string2.split(";");
        }
        return d.b.a;
    }

    private static String f() {
        return a0.l(Tools.M0().getString(d, ""));
    }

    private static File g() {
        File file = Tools.q0();
        Comparable<StringBuilder> comparable = new StringBuilder();
        ((StringBuilder)comparable).append(Process.myPid());
        ((StringBuilder)comparable).append(a);
        comparable = new File(file, ((StringBuilder)comparable).toString());
        try {
            ((File)comparable).getParentFile().mkdirs();
        }
        catch (Throwable throwable) {
            e1.l("Failed mkdirs CNC", throwable);
        }
        return comparable;
    }

    private static String[] h() {
        String[] stringArray = a0.g().getParentFile();
        if (stringArray == null) {
            return null;
        }
        File[] fileArray = stringArray.listFiles();
        if (fileArray == null) {
            return null;
        }
        int n3 = fileArray.length;
        stringArray = new String[n3 * 2];
        for (int i3 = 0; i3 < n3; ++i3) {
            File file;
            block6: {
                file = fileArray[i3];
                if (file == null || !file.getName().endsWith(a)) continue;
                Object object = new FileInputStream(file);
                Object[] objectArray = new byte[Math.min((int)file.length() + 8192, 102400)];
                int n4 = ((InputStream)object).read((byte[])objectArray);
                ((InputStream)object).close();
                if (n4 <= 0) break block6;
                try {
                    object = new String((byte[])objectArray, 0, n4);
                    objectArray = ((String)object).split(b, 2);
                    if (objectArray.length != 2) break block6;
                    n4 = i3 * 2;
                }
                catch (Throwable throwable) {
                    e1.l("Failed read native crash", throwable);
                }
                stringArray[n4] = (String)objectArray[0];
                stringArray[n4 + 1] = (String)objectArray[1];
            }
            file.delete();
        }
        return stringArray;
    }

    public static boolean i(String string2) {
        boolean bl;
        if (e) {
            String string3 = f;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(';');
            stringBuilder.append(string2);
            stringBuilder.append(';');
            bl = string3.contains(stringBuilder.toString());
        } else {
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean j() {
        Object object;
        boolean bl;
        block11: {
            int n4;
            int n3;
            byte[] byArray;
            Object object2;
            bl = false;
            try {
                object2 = new File("/system/lib/libandroidfw.so");
                if (!((File)object2).exists()) break block11;
                object = new FileInputStream((File)object2);
                object2 = "_ZN7android12AssetManager10getPkgNameEPKc".getBytes();
                byArray = new byte[8192];
                n3 = ((Object)object2).length;
                n4 = 0;
                bl = false;
            }
            catch (Throwable throwable) {
                bl = false;
            }
            while (true) {
                int n5;
                int n6;
                boolean bl2;
                block16: {
                    block12: {
                        block13: {
                            block14: {
                                bl2 = bl;
                                try {
                                    n6 = ((InputStream)object).read(byArray, n4, 8192 - n4);
                                    bl2 = bl;
                                    if (n6 <= 0) break block12;
                                    n4 = n5 = n4 + n6;
                                    if (n5 < n3) continue;
                                    n4 = 0;
                                }
                                catch (Throwable throwable) {
                                    bl = bl2;
                                    break;
                                }
                                block7: while (true) {
                                    bl2 = bl;
                                    if (n4 >= n5 - n3 + 1) break block13;
                                    for (n6 = 0; n6 < n3; ++n6) {
                                        if (byArray[n4 + n6] == object2[n6]) continue;
                                        ++n4;
                                        continue block7;
                                    }
                                    break block14;
                                    break;
                                }
                                {
                                    break;
                                }
                            }
                            bl2 = true;
                        }
                        if (!bl2) break block16;
                    }
                    bl = bl2;
                    try {
                        ((InputStream)object).close();
                        break block11;
                    }
                    catch (Throwable throwable) {
                        break;
                    }
                }
                n6 = n3 - 1;
                for (n4 = 0; n4 < n6; ++n4) {
                    byArray[n4] = byArray[n5 - n6 + n4];
                }
                n4 = n6;
                bl = bl2;
            }
            e1.s("Failed detect CM13", (Throwable)object);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("CM13: ");
        ((StringBuilder)object).append(bl);
        e1.d(((StringBuilder)object).toString());
        return bl;
    }

    public static void k() {
        e1.d("lLC - 1");
        a0.d();
        a0.f();
        String[] stringArray = a0.h();
        if (stringArray != null) {
            int n3 = stringArray.length;
            for (int i3 = 0; i3 < n3; i3 += 2) {
                CharSequence charSequence = stringArray[i3];
                if (charSequence == null) continue;
                CharSequence charSequence2 = new StringBuilder();
                charSequence2.append("Bad package: '");
                charSequence2.append((String)charSequence);
                charSequence2.append("' ");
                charSequence2.append(stringArray[i3 + 1]);
                e1.i(charSequence2.toString());
                String string2 = c;
                charSequence2 = charSequence;
                if (((String)charSequence).contains("uid:")) {
                    string2 = d;
                    charSequence2 = ((String)charSequence).split(":", -1)[1];
                }
                SharedPreferences sharedPreferences = Tools.M0();
                String string3 = sharedPreferences.getString(string2, "");
                charSequence = charSequence2;
                if (string3 != null) {
                    if (string3.length() == 0) {
                        charSequence = charSequence2;
                    } else {
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append(';');
                        ((StringBuilder)charSequence).append(string3);
                        ((StringBuilder)charSequence).append(';');
                        charSequence = ((StringBuilder)charSequence).toString();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(';');
                        stringBuilder.append((String)charSequence2);
                        stringBuilder.append(';');
                        if (!((String)charSequence).contains(stringBuilder.toString())) {
                            charSequence = new StringBuilder();
                            ((StringBuilder)charSequence).append(string3);
                            ((StringBuilder)charSequence).append(';');
                            ((StringBuilder)charSequence).append((String)charSequence2);
                            charSequence = ((StringBuilder)charSequence).toString();
                        } else {
                            charSequence = string3;
                        }
                    }
                }
                sharedPreferences.edit().putString(string2, a0.l((String)charSequence)).commit();
            }
        }
        a0.d();
        a0.f();
        e1.d("lLC - 0");
    }

    private static String l(String object) {
        object = new ArrayList<String>(new HashSet<String>(Arrays.asList(((String)object).split(";"))));
        return TextUtils.join((CharSequence)";", (Object[])((ArrayList)object).toArray(new String[((ArrayList)object).size()]));
    }
}

