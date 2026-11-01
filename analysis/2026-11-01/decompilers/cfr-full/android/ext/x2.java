/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.e;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.ext.Cat;
import android.ext.Ls;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.b1;
import android.ext.b2;
import android.ext.e1;
import android.ext.e2;
import android.ext.f;
import android.ext.f1;
import android.ext.g2;
import android.ext.p0;
import android.ext.r;
import android.ext.s1;
import android.ext.w;
import android.ext.z1;
import android.os.Build;
import b.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class x2 {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static InputStream a(String var0, int var1_2) {
        block11: {
            var2_3 = new StringBuilder();
            var2_3.append(Tools.K0());
            var2_3.append("/tmp.file.tmp");
            var5_5 = var2_3.toString();
            var2_3 = Tools.f0();
            var4_6 = null;
            var2_3 = var2_3.getExternalFilesDir(null);
            if (var2_3 == null) ** GOTO lbl-1000
            var2_3.mkdirs();
            if (var2_3.exists()) {
                var3_7 = new StringBuilder();
                var3_7.append(var2_3.getAbsolutePath());
                var3_7.append("/tmp.file.tmp");
                var2_3 = var3_7.toString();
            } else lbl-1000:
            // 2 sources

            {
                var2_3 = null;
            }
            var3_7 = var2_3;
            if (var2_3 == null) {
                var3_7 = var5_5;
            }
            var2_3 = new StringBuilder();
            var2_3.append("exec cat ");
            var2_3.append((String)var0 /* !! */ );
            var2_3 = var2_3.toString();
            var6_8 = new StringBuilder();
            var6_8.append("exec dalvikvm -cp ");
            var6_8.append(Tools.W());
            var6_8.append(' ');
            var6_8.append(Cat.class.getName());
            var6_8.append(' ');
            var6_8.append((String)var0 /* !! */ );
            var6_8 = new String[]{var6_8.toString(), null};
            var7_9 /* !! */  = new StringBuilder();
            var7_9 /* !! */ .append("exec cp ");
            var7_9 /* !! */ .append((String)var0 /* !! */ );
            var7_9 /* !! */ .append(' ');
            var7_9 /* !! */ .append((String)var3_7);
            var7_9 /* !! */  = var7_9 /* !! */ .toString();
            var8_10 = new StringBuilder();
            var8_10.append("exec cp ");
            var8_10.append((String)var0 /* !! */ );
            var8_10.append(' ');
            var8_10.append((String)var5_5);
            var5_5 = new String[]{var8_10.toString(), var5_5};
            var8_10 = new StringBuilder();
            var8_10.append("exec cp ");
            var8_10.append((String)var0 /* !! */ );
            var8_10.append(' ');
            var8_10.append(var3_7.replace("/emulated/0", "/emulated/legacy"));
            var0 /* !! */  = var8_10.toString();
            if (var1_2 >= 5) {
                return null;
            }
            if ((var2_3 = e2.q((var0 /* !! */  = (new String[][]{{var2_3, null}, var6_8, {var7_9 /* !! */ , var3_7}, var5_5, {var0 /* !! */ , var3_7}})[var1_2])[0])) == null) {
                var2_3 = new StringBuilder();
                var2_3.append("Failed run ");
                var2_3.append(Arrays.toString(var0 /* !! */ ));
                e1.p(var2_3.toString());
                return null;
            }
            if (var0 /* !! */ [1] == null) {
                try {
                    return var2_3.getInputStream();
                }
                catch (IOException var0_1) {
                    break block11;
                }
            }
            try {
                var2_3.waitFor();
            }
            catch (InterruptedException var2_4) {
                var3_7 = new StringBuilder();
                var3_7.append("Wait fail: ");
                var3_7.append((String)var0 /* !! */ [0]);
                e1.s(var3_7.toString(), var2_4);
            }
            var2_3 = var0 /* !! */ [1];
            return new FileInputStream((String)var0 /* !! */ [1], (String)var2_3){
                final String a;
                {
                    this.a = string3;
                    super(string2);
                }

                @Override
                public void close() {
                    super.close();
                    new File(this.a).delete();
                }

                protected void finalize() {
                    super.finalize();
                    new File(this.a).delete();
                }
            };
        }
        e1.s("Failed read xml", var0_1);
        return var4_6;
    }

    /*
     * Exception decompiling
     */
    private static void b(File var0, File var1_1, String var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [6 : 141->153)] java.lang.Throwable
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

    private static boolean c(e object) {
        int n3;
        File file = x2.g(MainService.G0);
        boolean bl = x2.h();
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        SharedPreferences sharedPreferences = Tools.M0();
        HashMap hashMap = new HashMap(sharedPreferences.getAll());
        sharedPreferences = sharedPreferences.edit();
        String string2 = file.getAbsolutePath();
        String string3 = Tools.C0();
        File file2 = x2.g("DefaultStorage");
        if (file2.exists()) {
            bl2 = x2.d(string2, string3, file, hashMap, (SharedPreferences.Editor)sharedPreferences, string3, true);
            file2.delete();
        }
        for (n3 = ((e)((Object)object)).size() - 1; n3 >= 0; --n3) {
            if (!x2.d(string2, string3, file, hashMap, (SharedPreferences.Editor)sharedPreferences, ((h)object.valueAt((int)n3)).a, false)) continue;
            bl2 = true;
        }
        n3 = x2.n((SharedPreferences.Editor)sharedPreferences, hashMap);
        object = new StringBuilder();
        ((StringBuilder)object).append("New: ");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(" from ");
        ((StringBuilder)object).append(hashMap.size());
        e1.d(((StringBuilder)object).toString());
        sharedPreferences.putBoolean("installed", true).commit();
        return bl2;
    }

    private static boolean d(String object, String string2, File serializable, Map map, SharedPreferences.Editor editor, String string3, boolean bl) {
        Object object2 = ((String)object).replace(string2, string3);
        int n3 = 0;
        if (!bl && ((String)object).equals(object2)) {
            return false;
        }
        if (!bl) {
            x2.b(new File((String)object2).getParentFile(), serializable.getParentFile(), MainService.G0.replace(string2, string3));
        }
        serializable = bl ? null : x2.k((String)object2);
        object2 = serializable;
        if (serializable == null) {
            object2 = object = x2.k(((String)object).replace(MainService.G0, "DefaultStorage").replace(string2, string3));
            if (object == null) {
                return false;
            }
        }
        object = ((HashMap)object2).entrySet().iterator();
        while (object.hasNext()) {
            if (map.containsKey(((Map.Entry)object.next()).getKey())) continue;
            ++n3;
        }
        int n4 = x2.n(editor, (Map)object2);
        object = new StringBuilder();
        ((StringBuilder)object).append("Copy: ");
        ((StringBuilder)object).append(n4);
        ((StringBuilder)object).append(" from ");
        ((StringBuilder)object).append(((HashMap)object2).size());
        ((StringBuilder)object).append(" new ");
        ((StringBuilder)object).append(n3);
        e1.d(((StringBuilder)object).toString());
        return true;
    }

    private static e e(String stringArray) {
        e e4 = new e();
        if (stringArray != null && stringArray.length() != 0) {
            stringArray = stringArray.split(";");
            for (int i3 = 0; i3 < stringArray.length; ++i3) {
                int n3;
                String string2 = stringArray[i3];
                int n4 = string2.indexOf(124);
                int n5 = n4 < 0 ? -1 : string2.indexOf(124, n4 + 1);
                if (n4 < 0 || n5 < 0) continue;
                try {
                    n3 = Integer.parseInt(string2.substring(n4 + 1, n5));
                }
                catch (NumberFormatException numberFormatException) {
                    e1.s("Failed parse deferred old version code", numberFormatException);
                    n3 = 0;
                }
                e4.put(e4.size(), new h(s1.S(string2.substring(0, n4)), n3, s1.S(string2.substring(n5 + 1))));
            }
        }
        return e4;
    }

    private static String f(e e4) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i3 = 0; i3 < e4.size(); ++i3) {
            Object object = (h)e4.valueAt(i3);
            if (object == null || ((h)object).a == null) continue;
            if (stringBuilder.length() > 0) {
                stringBuilder.append(';');
            }
            stringBuilder.append(s1.p(((h)object).a));
            stringBuilder.append('|');
            stringBuilder.append(((h)object).b);
            stringBuilder.append('|');
            String string2 = ((h)object).c;
            object = string2;
            if (string2 == null) {
                object = "";
            }
            stringBuilder.append(s1.p((String)object));
        }
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static File g(String var0) {
        block6: {
            var4_1 = MainService.context;
            var1_2 = Build.VERSION.SDK_INT;
            if (var1_2 >= 24) {
            }
            ** GOTO lbl15
            {
                block7: {
                    catch (Throwable var2_5) {
                        break block6;
                    }
                    try {
                        var2_3 = (File)var4_1.getClass().getMethod("getSharedPreferencesPath", new Class[]{String.class}).invoke((Object)var4_1, new Object[]{var0});
                        break block7;
                    }
                    catch (Throwable var2_4) {}
                    e1.s("Failed call getSharedPreferencesPath", var2_4);
lbl15:
                    // 2 sources

                    var2_3 = null;
                }
                var3_7 = var2_3;
                if (var2_3 != null) return var3_7;
                return (File)var4_1.getClass().getMethod("getSharedPrefsFile", new Class[]{String.class}).invoke((Object)var4_1, new Object[]{var0});
            }
        }
        e1.s("Failed call getSharedPrefsFile", var2_5);
        var3_7 = Tools.p0();
        var2_6 = new StringBuilder();
        var2_6.append("../shared_prefs/");
        var2_6.append(var0);
        var2_6.append(".xml");
        return new File(var3_7, var2_6.toString());
    }

    public static boolean h() {
        return Tools.M0().getBoolean("installed", false);
    }

    public static InputStream i(String string2, int n3) {
        Object object = new StringBuilder();
        ((StringBuilder)object).append("exec ls ");
        ((StringBuilder)object).append(string2);
        object = ((StringBuilder)object).toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("exec dalvikvm -cp ");
        stringBuilder.append(Tools.W());
        stringBuilder.append(' ');
        stringBuilder.append(Ls.class.getName());
        stringBuilder.append(' ');
        stringBuilder.append(string2);
        string2 = stringBuilder.toString();
        if (n3 >= 2) {
            return null;
        }
        if ((object = e2.q(string2 = (new String[]{object, string2})[n3])) == null) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Failed run ");
            ((StringBuilder)object).append(string2);
            e1.p(((StringBuilder)object).toString());
            return null;
        }
        return ((Process)object).getInputStream();
    }

    private static final String j(String string2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(string2.getBytes());
            string2 = Tools.l(messageDigest.digest());
            return string2;
        }
        catch (Throwable throwable) {
            e1.s("Failed check old versions", throwable);
            return null;
        }
    }

    /*
     * Loose catch block
     */
    public static HashMap k(String string2) {
        Serializable serializable;
        StringBuilder stringBuilder = null;
        int n3 = 0;
        while (true) {
            block23: {
                serializable = stringBuilder;
                if (n3 >= 10) break;
                serializable = stringBuilder;
                Object object = x2.a(string2, n3);
                if (object == null) {
                    serializable = stringBuilder;
                    break block23;
                }
                serializable = stringBuilder;
                serializable = stringBuilder;
                i i3 = new i((InputStream)object);
                try {
                    stringBuilder = serializable = b.a(i3);
                }
                catch (Throwable throwable) {
                    serializable = stringBuilder;
                    serializable = stringBuilder;
                    object = new StringBuilder();
                    serializable = stringBuilder;
                    ((StringBuilder)object).append("Fail: ");
                    serializable = stringBuilder;
                    ((StringBuilder)object).append(string2);
                    serializable = stringBuilder;
                    e1.s(((StringBuilder)object).toString(), throwable);
                    serializable = stringBuilder;
                    serializable = stringBuilder;
                    object = new StringBuilder();
                    serializable = stringBuilder;
                    ((StringBuilder)object).append("Last data: ");
                    serializable = stringBuilder;
                    ((StringBuilder)object).append(i3.a());
                    serializable = stringBuilder;
                    e1.p(((StringBuilder)object).toString());
                }
                serializable = stringBuilder;
                i3.close();
                {
                    catch (IOException iOException) {
                        e1.s("Failed read xml", iOException);
                        stringBuilder = serializable;
                    }
                }
                serializable = stringBuilder;
                if (stringBuilder != null) {
                    serializable = stringBuilder;
                    break;
                }
            }
            ++n3;
            stringBuilder = serializable;
        }
        if (serializable == null) {
            try {
                stringBuilder = new StringBuilder();
                stringBuilder.append("exec ls -l ");
                stringBuilder.append(string2);
                e2.n(stringBuilder.toString(), 10);
            }
            catch (Throwable throwable) {
                e1.s("Failed check xml", throwable);
            }
        }
        return serializable;
    }

    private static void l(e e4) {
        x2.m(e4, null);
    }

    private static boolean m(e e4, Runnable runnable) {
        boolean[] blArray = new boolean[1];
        p0 p02 = new p0(1300, true);
        e4 = f.b().setCustomTitle(Tools.g0(2131296280)).setMessage((CharSequence)b2.f(2131296425)).setPositiveButton((CharSequence)b2.f(2131296904), new DialogInterface.OnClickListener(blArray, p02){
            final boolean[] a;
            final DialogInterface.OnClickListener b;
            {
                this.a = blArray;
                this.b = onClickListener;
            }

            public void onClick(DialogInterface dialogInterface, int n3) {
                this.a[0] = true;
                this.b.onClick(dialogInterface, n3);
            }
        }).setNegativeButton((CharSequence)b2.f(2131296963), new DialogInterface.OnClickListener(e4, runnable, blArray){
            final e a;
            final Runnable b;
            final boolean[] c;
            {
                this.a = e4;
                this.b = runnable;
                this.c = blArray;
            }

            public void onClick(DialogInterface dialogInterface, int n3) {
                e1.d("Un: no");
                if (x2.r(this.a, this.b)) {
                    this.c[0] = true;
                }
            }
        }).setCancelable(false).create();
        if (runnable != null) {
            f.k((AlertDialog)e4, new DialogInterface.OnDismissListener(blArray, runnable){
                final boolean[] a;
                final Runnable b;
                {
                    this.a = blArray;
                    this.b = runnable;
                }

                public void onDismiss(DialogInterface dialogInterface) {
                    if (!this.a[0]) {
                        this.b.run();
                    }
                }
            });
        }
        f.m((AlertDialog)e4);
        return true;
    }

    private static int n(SharedPreferences.Editor editor, Map object) {
        object = object.entrySet().iterator();
        int n3 = 0;
        while (object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            Object v3 = entry.getValue();
            int n4 = n3;
            if (v3 instanceof Boolean) {
                editor.putBoolean((String)entry.getKey(), ((Boolean)entry.getValue()).booleanValue());
                n4 = n3 + 1;
            }
            n3 = n4;
            if (v3 instanceof Float) {
                editor.putFloat((String)entry.getKey(), ((Float)entry.getValue()).floatValue());
                n3 = n4 + 1;
            }
            n4 = n3;
            if (v3 instanceof Integer) {
                editor.putInt((String)entry.getKey(), ((Integer)entry.getValue()).intValue());
                n4 = n3 + 1;
            }
            n3 = n4;
            if (v3 instanceof Long) {
                editor.putLong((String)entry.getKey(), ((Long)entry.getValue()).longValue());
                n3 = n4 + 1;
            }
            n4 = n3;
            if (v3 instanceof String) {
                editor.putString((String)entry.getKey(), (String)entry.getValue());
                n4 = n3 + 1;
            }
            n3 = n4;
            if (!(v3 instanceof Set)) continue;
            editor.putStringSet((String)entry.getKey(), (Set)entry.getValue());
            n3 = n4 + 1;
        }
        return n3;
    }

    static boolean o(String object, Runnable runnable) {
        if (((e)((Object)(object = x2.e((String)object)))).size() == 0) {
            return false;
        }
        return x2.r((e)((Object)object), runnable);
    }

    static boolean p(String object, Runnable runnable) {
        if (((e)((Object)(object = x2.e((String)object)))).size() == 0) {
            return false;
        }
        return x2.m((e)((Object)object), runnable);
    }

    static void q(e e4) {
        x2.r(e4, null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    static boolean r(e var0, Runnable var1_1) {
        var2_2 = (float)true;
        var5_3 = (int)(16391.2f * var2_2 - 236.2f + 0.5f);
        var3_4 = 0;
        while (var3_4 < var0.size()) {
            block16: {
                block15: {
                    var6_6 = (h)var0.valueAt(var3_4);
                    if (var6_6.b == var5_3 && !android.ext.i.b.equals(var6_6.a)) break block15;
                    var4_5 = var3_4;
                    if (Tools.e1(var6_6.a)) break block16;
                }
                var0.removeAt(var3_4);
                var4_5 = var3_4 - 1;
                var7_7 /* !! */  = new StringBuilder();
                var7_7 /* !! */ .append("Un: ignore: ");
                var7_7 /* !! */ .append(var6_6.a);
                var7_7 /* !! */ .append(' ');
                var7_7 /* !! */ .append(var6_6.b);
                e1.d(var7_7 /* !! */ .toString());
            }
            var3_4 = var4_5 + 1;
        }
        if (var0.size() == 0) {
            var0 = "Un: empty";
lbl28:
            // 2 sources

            while (true) {
                e1.d((String)var0);
                return false;
            }
        }
        var8_8 = new StringBuilder();
        var8_8.append(b2.f(2131296479));
        var3_4 = 0;
        while (true) {
            var4_5 = var0.size();
            var7_7 /* !! */  = null;
            if (var3_4 >= var4_5) break;
            var9_9 = (h)var0.valueAt(var3_4);
            var8_8.append("\n\n");
            try {
                var6_6 = Tools.z0(var9_9.a);
            }
            catch (PackageManager.NameNotFoundException var10_11) {
                var6_6 = new StringBuilder();
                var6_6.append("Package not found: ");
                var6_6.append(var9_9.a);
                e1.l(var6_6.toString(), var10_11);
                var6_6 = null;
            }
            if (var6_6 != null) {
                var10_10 = var6_6.applicationInfo;
                if (var10_10 != null) {
                    var7_7 /* !! */  = Tools.a0(var10_10);
                }
                var8_8.append((String)var7_7 /* !! */ );
                var8_8.append(" (");
                var8_8.append(var9_9.a);
                var8_8.append(") - ");
                var7_7 /* !! */  = var9_9.c.length() > 0 ? var9_9.c : var6_6.versionName;
                var8_8.append((String)var7_7 /* !! */ );
                var8_8.append(" (");
                var4_5 = var9_9.b;
                if (var4_5 <= 0) {
                    var4_5 = var6_6.versionCode;
                }
                var8_8.append(var4_5);
                var8_8.append(')');
            } else {
                var8_8.append(var9_9.a);
                var8_8.append(" - ");
                var8_8.append(var9_9.b);
            }
            ++var3_4;
        }
        var6_6 = new StringBuilder();
        var6_6.append("Un: alert: ");
        var6_6.append(var0.size());
        e1.d(var6_6.toString());
        var6_6 = var8_8.toString();
        var3_4 = var6_6.hashCode();
        var3_4 = (int)(var2_2 * 17734.3f - 1579.3f + 0.5f) ^ var3_4;
        if (var3_4 == Tools.M0().getInt("skip-old", 0)) {
            var0 = "Un: skip";
            ** continue;
        }
        var0 = new DialogInterface.OnClickListener(var3_4, (e)var0){
            final int a;
            final e b;
            {
                this.a = n3;
                this.b = e4;
            }

            public void onClick(DialogInterface object, int n3) {
                if (n3 == -3) {
                    new g2().f("skip-old", this.a).commit();
                    return;
                }
                int n4 = 0;
                for (int i3 = 0; i3 < this.b.size(); ++i3) {
                    object = ((h)this.b.valueAt((int)i3)).a;
                    n3 = n4;
                    if (Tools.e1((String)object)) {
                        n3 = n4;
                        if (x2.t((String)object)) {
                            n3 = 1;
                        }
                    }
                    n4 = n3;
                }
                if (n4 != 0) {
                    s1.H();
                } else {
                    s1.e();
                }
            }
        };
        var0 = f.b().setCustomTitle(Tools.g0(2131296838)).setMessage((CharSequence)var6_6).setCancelable(false).setPositiveButton((CharSequence)b2.f(2131297115), (DialogInterface.OnClickListener)var0).setNeutralButton((CharSequence)b2.f(2131296963), (DialogInterface.OnClickListener)var0).setNegativeButton((CharSequence)b2.f(2131296805), null).create();
        if (var1_1 != null) {
            f.k((AlertDialog)var0, new DialogInterface.OnDismissListener(var1_1){
                final Runnable a;
                {
                    this.a = runnable;
                }

                public void onDismiss(DialogInterface dialogInterface) {
                    this.a.run();
                }
            });
        }
        f.m((AlertDialog)var0);
        return true;
    }

    public static void s(String charSequence, Runnable runnable) {
        if (!Tools.e1((String)charSequence)) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(runnable);
            ((StringBuilder)charSequence).append(": 50");
            e1.d(((StringBuilder)charSequence).toString());
            if (runnable != null) {
                runnable.run();
            }
            return;
        }
        if (runnable != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(runnable);
            stringBuilder.append(": 60");
            e1.d(stringBuilder.toString());
            try {
                stringBuilder = new StringBuilder();
                stringBuilder.append("exec pm uninstall --user -1 ");
                stringBuilder.append((String)charSequence);
                e2.n(stringBuilder.toString(), 45);
            }
            catch (Throwable throwable) {
                e1.l("run cmd fail", throwable);
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(runnable);
            stringBuilder.append(": 70");
            e1.d(stringBuilder.toString());
            if (Tools.e1((String)charSequence)) {
                try {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("exec pm uninstall ");
                    stringBuilder.append((String)charSequence);
                    e2.n(stringBuilder.toString(), 45);
                }
                catch (Throwable throwable) {
                    e1.l("run cmd fail", throwable);
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(runnable);
            stringBuilder.append(": 80");
            e1.d(stringBuilder.toString());
            if (Tools.e1((String)charSequence)) {
                f.r(f.c(r.p).setMessage((CharSequence)b2.f(2131296799)).setPositiveButton((CharSequence)b2.f(2131296836), new DialogInterface.OnClickListener(runnable, (String)charSequence){
                    final Runnable a;
                    final String b;
                    {
                        this.a = runnable;
                        this.b = string2;
                    }

                    public void onClick(DialogInterface object, int n3) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append(this.a);
                        ((StringBuilder)object).append(": 120");
                        e1.d(((StringBuilder)object).toString());
                        x2.t(this.b);
                        object = new StringBuilder();
                        ((StringBuilder)object).append(this.a);
                        ((StringBuilder)object).append(": 130");
                        e1.d(((StringBuilder)object).toString());
                    }
                }).create(), runnable, true);
            } else {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(runnable);
                ((StringBuilder)charSequence).append(": 110");
                e1.d(((StringBuilder)charSequence).toString());
                runnable.run();
            }
        } else {
            x2.t((String)charSequence);
        }
    }

    static boolean t(String intentArray) {
        for (Intent intent : b1.k0((String)intentArray)) {
            try {
                Tools.f0().startActivity(intent);
                return true;
            }
            catch (Throwable throwable) {
                e1.l("intent fail", throwable);
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void u(w object, boolean bl) {
        boolean bl2;
        e e4;
        block21: {
            block20: {
                HashMap<String, Integer> hashMap;
                block19: {
                    e4 = new e();
                    ((w)object).j();
                    int n3 = (int)(1.0f * 16327.1f - 172.1f + 0.5f);
                    String string2 = Tools.C0();
                    int n4 = ((w)object).k() / 9;
                    hashMap = bl ? new HashMap<String, Integer>() : null;
                    int n5 = 0;
                    try {
                        int n6;
                        block4: while ((n6 = ((w)object).f()) >= 0 && n6 <= 1024) {
                            if (n6 != 0) {
                                Object object2;
                                int n7 = ((w)object).f();
                                int n8 = ((w)object).f();
                                String string3 = ((w)object).i(n6, null);
                                String string4 = ((w)object).i(((w)object).e(), null);
                                if (bl) {
                                    hashMap.put(string3, n8);
                                }
                                if (string2.equals(string3)) continue;
                                if (n7 > 0) {
                                    if (n7 > n3) continue;
                                    object2 = new h(string3, n7, string4);
                                    e4.put((n3 - n7) * n4 + n5, object2);
                                    ++n5;
                                    continue;
                                }
                                if (string3.equals(android.ext.i.b)) {
                                    object2 = new h(string3, n7, string4);
                                    e4.put(n4 * n3 + 1, object2);
                                }
                                object2 = x2.j(string3);
                                for (n6 = 33; n6 >= 0; --n6) {
                                    if (!(new String[]{"df1e68bf2355bb69260b6efaa7fdacc1", "f63d4ea576f8d71e0963de6834e0c219", "b333d385ec3aeaaf7598031a42f99961", "f6d10cdcc825ab580f2fbb8ae2752990", "6c188a31fe500c3ada0914215e7df3b3", "4aa610afe8a9f409d98e62b4ed2ef780", "bbc0c87ac43ea5b61f59d6607a1eaf84", "70fb9cca0e11cb09250a11ba0c23b4c2", "b4d8929ffb0484d60369dd2c2e5c919d", "1517a1932503e400deef335e1d331593", "761cf7c032752696b26cd60ea3f3d74d", "1027157cbd6831cfebb80321570bb784", "8791855c8c65cb6a950f34ec0b093668", "a517cf7078e7e9b25ae975b4bdb2cc65", "b4ab3afbb70f23f600d048be0e8d49b2", "bd2173c6afb552fae3d9428756430123", "9bcf2de327544b17352830f9b004b229", "94d8ee3a7d26aa70f473e0ac8845b040", "d6683c02b361fed6c0ece0338921cf2b", "2cba6ddcf12910bc651455907da1fa00", "95760d2d26320be5d407e9823fd089ea", "db2aaa81ea92a69ae45642d0f5142c24", "6e513de086b0378f970968445a5da263", "60ee44a5be7a862f6615d5b68ca0d017", "0e41efb62a276c61f7b2253a1cb70c96", "3534ed8e94149e09012244b0053f387c", "7e146f369544a77f5bd3dcaa498a1e93", "5ff0619a03b5424a273491e365b6356a", "7abdd4c0904fe8f0a78424f971ff52f4", "4be2ea55d617fc0362440a93ae8a0bda", "25a4c4b1be1822ea6b990582e5038364", "b3ea34ef077e6fb86332e03b5321b28c", "ff748cbd537fd83894360f37ac9ccb03", "1353d43dff30877182f5d709e282d224"})[n6].equalsIgnoreCase((String)object2)) continue;
                                    object2 = new h(string3, n7, string4);
                                    e4.put(35 - n6 + n4 * n3, object2);
                                    continue block4;
                                }
                                continue;
                            }
                            break block19;
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Bad pkg length: ");
                        ((StringBuilder)object).append(n6);
                        string2 = ((StringBuilder)object).toString();
                        object = new RuntimeException();
                        e1.l(string2, (Throwable)object);
                        break block19;
                    }
                    catch (IOException iOException) {}
                    e1.l("???", iOException);
                    if (e4.size() != 0) break block19;
                    object = "Un: what?";
                    break block20;
                }
                if (bl) {
                    z1.j = hashMap;
                }
                bl = x2.h();
                object = new StringBuilder();
                ((StringBuilder)object).append("Un: copy ");
                ((StringBuilder)object).append(e4.size());
                e1.d(((StringBuilder)object).toString());
                bl2 = x2.c(e4);
                if (s1.u()) {
                    object = x2.f(e4);
                    if (bl2) {
                        e1.d("Un: defer restart");
                        s1.v(1, (String)object);
                        return;
                    }
                    e1.d("Un: defer show");
                    s1.v(2, (String)object);
                    return;
                }
                if (!s1.n()) break block21;
                object = "Un: drain owns recovery";
            }
            e1.d((String)object);
            return;
        }
        if (bl2) {
            e1.d("Un: restart?");
            x2.l(e4);
        } else {
            e1.d("Un: show");
            x2.q(e4);
        }
        if (!(bl ^ true)) return;
        if (!x2.h()) return;
        e1.d("Un: faq");
        f1.q(Tools.f0());
    }

    private static class h {
        String a;
        int b;
        String c;

        public h(String string2, int n3, String string3) {
            this.a = string2;
            this.b = n3;
            this.c = string3;
        }
    }

    private static class i
    extends InputStream {
        private final InputStream a;
        private int b;
        private int c;
        private final byte[] d;

        public i(InputStream inputStream) {
            this.a = inputStream;
            this.b = 0;
            this.c = 0;
            this.d = new byte[512];
        }

        /*
         * Enabled aggressive block sorting
         */
        public String a() {
            StringBuilder stringBuilder;
            Object object = new StringBuilder();
            ((StringBuilder)object).append("buf[");
            ((StringBuilder)object).append(this.b);
            ((StringBuilder)object).append("]: ");
            object = ((StringBuilder)object).toString();
            if (this.b <= this.d.length) {
                stringBuilder = new StringBuilder();
                stringBuilder.append((String)object);
                object = new String(this.d, 0, this.c);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append((String)object);
                object = this.d;
                int n3 = this.c;
                stringBuilder.append(new String((byte[])object, n3, ((Object)object).length - n3));
                object = new String(this.d, 0, this.c);
            }
            stringBuilder.append((String)object);
            return stringBuilder.toString();
        }

        @Override
        public int available() {
            return this.a.available();
        }

        @Override
        public void close() {
            this.a.close();
        }

        public boolean equals(Object object) {
            return this.a.equals(object);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        public void mark(int n3) {
            this.a.mark(n3);
        }

        @Override
        public boolean markSupported() {
            return this.a.markSupported();
        }

        @Override
        public int read() {
            int n3 = this.a.read();
            if (n3 > 0) {
                ++this.b;
                byte[] byArray = this.d;
                int n4 = this.c;
                byArray[n4] = (byte)n3;
                this.c = (n4 + 1) % byArray.length;
            }
            return n3;
        }

        @Override
        public void reset() {
            this.a.reset();
        }

        @Override
        public long skip(long l3) {
            return this.a.skip(l3);
        }

        public String toString() {
            return this.a.toString();
        }
    }
}

