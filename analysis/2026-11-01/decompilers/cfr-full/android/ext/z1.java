/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.e;
import android.app.ActivityManager;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.ext.Config;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.a0;
import android.ext.e1;
import android.ext.n2;
import android.ext.w;
import android.ext.x1;
import android.ext.y;
import android.ext.y1;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.widget.TextView;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class z1 {
    private static final Map c;
    private static final int d;
    private static final SparseIntArray e;
    private static final Map f;
    private static volatile int g;
    static final SparseIntArray h;
    private static z1 i;
    static HashMap j;
    private ActivityManager a;
    private PackageManager b;

    static {
        SparseIntArray sparseIntArray;
        f = new LinkedHashMap(128, 0.75f, true){

            protected boolean removeEldestEntry(Map.Entry entry) {
                boolean bl = ((AbstractMap)this).size() > 128;
                return bl;
            }
        };
        g = 0;
        d = -1;
        e = sparseIntArray = new SparseIntArray();
        c = new HashMap();
        a0.k();
        z1.f();
        for (String string2 : a0.e()) {
            if (string2 == null || string2.length() == 0) continue;
            try {
                sparseIntArray.put(Integer.parseInt(string2), 1);
            }
            catch (NumberFormatException numberFormatException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed load bugged uid: ");
                stringBuilder.append(string2);
                e1.l(stringBuilder.toString(), numberFormatException);
            }
        }
        h = new SparseIntArray();
        i = null;
        j = null;
    }

    public z1(ActivityManager activityManager, PackageManager packageManager) {
        this.a = activityManager;
        this.b = packageManager;
        i = this;
    }

    private static void f() {
        Map map = c;
        for (String string2 : a0.c()) {
            if (string2 == null || string2.length() == 0) continue;
            map.put(string2, z1.k(string2, null));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void g() {
        Object object = f;
        synchronized (object) {
            ++g;
            object.clear();
        }
        Map map = c;
        int n3 = map.size();
        if (n3 == 0) {
            return;
        }
        map.clear();
        z1.f();
        object = new StringBuilder();
        ((StringBuilder)object).append("PL: ");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(" -> ");
        ((StringBuilder)object).append(map.size());
        e1.d(((StringBuilder)object).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private c h(int n3, int n4, String object, List object22, SparseArray object3) {
        boolean bl;
        String string2;
        block35: {
            PackageManager.NameNotFoundException nameNotFoundException3;
            block34: {
                NoSuchMethodError noSuchMethodError3;
                block33: {
                    Object object4;
                    Object object5;
                    boolean bl2;
                    int n5;
                    block32: {
                        block31: {
                            n5 = ((String)object).indexOf(58);
                            bl2 = false;
                            string2 = object;
                            if (n5 != -1) {
                                string2 = ((String)object).split(":", -1)[0];
                            }
                            bl = string2.indexOf(46) != -1 && string2.indexOf(47) == -1;
                            object5 = null;
                            object = bl ? this.i(string2) : null;
                            if (object != null) {
                                if (((c)object).a == d) {
                                    ((c)object).a = n4;
                                }
                                return object;
                            }
                            object4 = object5;
                            if (bl) {
                                try {
                                    object4 = object = Tools.Y(string2);
                                    if (object == null) break block31;
                                    n5 = 1;
                                    object4 = object;
                                    break block32;
                                }
                                catch (NoSuchMethodError noSuchMethodError2) {
                                    e1.a(noSuchMethodError2);
                                    object4 = object5;
                                }
                                catch (PackageManager.NameNotFoundException nameNotFoundException2) {
                                    object4 = object5;
                                }
                            }
                        }
                        n5 = 0;
                    }
                    if (object4 == null) {
                        if (object22 != null) {
                            for (Object object22 : object22) {
                                if (object22 == null || object22.pid != n3 || (object22 = object22.pkgList) == null || ((String[])object22).length <= 0) continue;
                                object22 = object22[0];
                                n5 = 1;
                                break;
                            }
                        } else {
                            object22 = string2;
                        }
                        n3 = n5;
                        object = object22;
                        if (!Config.vSpaceReal) {
                            int n6 = n5;
                            object5 = object22;
                            if (n5 == 0) {
                                object = (String)object3.get(n4);
                                n6 = n5;
                                object5 = object22;
                                if (object != null) {
                                    object5 = object;
                                    n6 = 1;
                                }
                            }
                            n3 = n6;
                            object = object5;
                            if (n6 == 0) {
                                object22 = this.m(n4);
                                n3 = n6;
                                object = object5;
                                if (object22 != null) {
                                    object3.put(n4, object22);
                                    object = object22;
                                    n3 = 1;
                                }
                            }
                        }
                        n5 = n3;
                        object22 = object;
                        if (n3 != 0) {
                            object3 = this.i((String)object);
                            n5 = n3;
                            object22 = object;
                            if (object3 != null) {
                                if (object3.a == d) {
                                    object3.a = n4;
                                }
                                if (bl) {
                                    c.put(string2, object3);
                                }
                                return object3;
                            }
                        }
                    } else {
                        object22 = string2;
                    }
                    object3 = new c(n4, (String)object22);
                    if (n5 == 0) break block35;
                    object = object4;
                    if (object4 == null) {
                        try {
                            object = Tools.Y((String)object22);
                        }
                        catch (NoSuchMethodError noSuchMethodError3) {
                            break block33;
                        }
                        catch (PackageManager.NameNotFoundException nameNotFoundException3) {
                            break block34;
                        }
                    }
                    if (object != null) {
                        object3.d = object4 = this.j((String)object22, (ApplicationInfo)object);
                        if (object4 != null) {
                            object4 = new StringBuilder();
                            ((StringBuilder)object4).append(object3.d);
                            ((StringBuilder)object4).append("");
                            object3.d = ((StringBuilder)object4).toString();
                        }
                        boolean bl3 = ((ApplicationInfo)object).sourceDir.startsWith("/system/") || ((n3 = ((ApplicationInfo)object).flags) & 0x80) != 0 || (n3 & 1) != 0;
                        object3.f = bl3;
                        bl3 = bl2;
                        if ((((ApplicationInfo)object).flags & 0x2000000) != 0) {
                            bl3 = true;
                        }
                        object3.g = bl3;
                        object3.e = ((ApplicationInfo)object).nativeLibraryDir;
                        object3.b = ((ApplicationInfo)object).uid;
                        object4 = j;
                        if (object4 != null && (object5 = (Integer)((HashMap)object4).get(object22)) != null && (Integer)object5 != ((ApplicationInfo)object).uid) {
                            object4 = new StringBuilder();
                            ((StringBuilder)object4).append("real uid: ");
                            ((StringBuilder)object4).append(((ApplicationInfo)object).uid);
                            ((StringBuilder)object4).append(" != ");
                            ((StringBuilder)object4).append(object5);
                            e1.p(((StringBuilder)object4).toString());
                            object3.b = (Integer)object5;
                        }
                        if (object3.b != n4) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append("vs app: ");
                            ((StringBuilder)object).append(object3.b);
                            ((StringBuilder)object).append(" != ");
                            ((StringBuilder)object).append(n4);
                            e1.p(((StringBuilder)object).toString());
                        }
                    }
                    break block35;
                }
                e1.a(noSuchMethodError3);
                break block35;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Package not found: ");
            ((StringBuilder)object).append(object3.c);
            ((StringBuilder)object).append(" [");
            ((StringBuilder)object).append(object3.a);
            ((StringBuilder)object).append(']');
            e1.l(((StringBuilder)object).toString(), nameNotFoundException3);
        }
        object = c;
        object.put(object22, object3);
        if (bl && !string2.equals(object22)) {
            object.put(string2, object3);
        }
        return object3;
    }

    private c i(String object) {
        String string2 = Tools.C0();
        object = ((String)object).equals(string2) ? z1.k(string2, "GG") : (((String)object).startsWith("com.bluestacks.") ? z1.k((String)object, (String)object) : (c)c.get(object));
        return object;
    }

    private String j(String string2, ApplicationInfo applicationInfo) {
        string2 = applicationInfo.packageName;
        try {
            String string3 = Tools.a0(applicationInfo);
            if (string3 != null) {
                string2 = string3;
            }
        }
        catch (Throwable throwable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed load label for: ");
            stringBuilder.append(applicationInfo.packageName);
            e1.l(stringBuilder.toString(), throwable);
        }
        return string2;
    }

    private static c k(String object, String string2) {
        object = new c(d, (String)object);
        if (string2 != null) {
            ((c)object).d = string2;
        }
        ((c)object).h = true;
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static Drawable l(String string2) {
        Object var1_1 = null;
        if (string2 == null) {
            return null;
        }
        Map map = f;
        // MONITORENTER : map
        Drawable drawable2 = (Drawable)map.get(string2);
        // MONITOREXIT : map
        if (drawable2 == null) {
            return null;
        }
        string2 = Tools.R1(drawable2);
        if (string2 != drawable2) return string2;
        return var1_1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String m(int n3) {
        Throwable throwable3;
        Object object;
        block8: {
            Throwable throwable22;
            String[] stringArray;
            boolean bl;
            block10: {
                Object object2;
                block9: {
                    if (Config.C) {
                        return Config.E;
                    }
                    bl = Config.vSpaceReal;
                    stringArray = null;
                    object2 = null;
                    Object var6_7 = null;
                    if (bl) {
                        Object object3 = j;
                        if (object3 == null) return object2;
                        object3 = ((HashMap)object3).entrySet().iterator();
                        do {
                            if (!object3.hasNext()) return null;
                        } while ((object2 = (Map.Entry)object3.next()) == null || (Integer)object2.getValue() != n3);
                        object2 = (String)object2.getKey();
                        return null;
                    }
                    if (e.get(n3) == 1) return object2;
                    object = stringArray;
                    try {
                        object2 = this.b;
                        object = stringArray;
                        object = stringArray;
                        StringBuilder stringBuilder = new StringBuilder();
                        object = stringArray;
                        stringBuilder.append("uid:");
                        object = stringArray;
                        stringBuilder.append(n3);
                        object = stringArray;
                        bl = a0.a(stringBuilder.toString(), "uid");
                    }
                    catch (Throwable throwable3) {
                        break block8;
                    }
                    try {
                        object = object2.getPackagesForUid(n3);
                        object2 = var6_7;
                        if (object == null) break block9;
                        object2 = var6_7;
                        if (((String[])object).length <= 0) break block9;
                    }
                    catch (Throwable throwable22) {
                        break block10;
                    }
                    object2 = object[0];
                }
                object = object2;
                a0.b(bl);
                return object2;
            }
            object = stringArray;
            a0.b(bl);
            object = stringArray;
            throw throwable22;
        }
        e1.l("Failed getPackagesForUid", throwable3);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void n(w object) {
        List list;
        ArrayList<d> arrayList;
        block11: {
            IOException iOException2;
            block12: {
                int n3;
                Object object2;
                block10: {
                    block9: {
                        block8: {
                            ((w)object).j();
                            arrayList = new ArrayList<d>();
                            h.clear();
                            try {
                                e1.d("getRunningAppProcesses: start");
                                list = this.a.getRunningAppProcesses();
                            }
                            catch (Throwable throwable) {
                                list = null;
                                break block8;
                            }
                            try {
                                object2 = new StringBuilder();
                                object2.append("getRunningAppProcesses: end ");
                                object2.append(list.size());
                                e1.d(object2.toString());
                                break block9;
                            }
                            catch (Throwable throwable) {}
                        }
                        e1.l("Failed getRunningAppProcesses", (Throwable)object2);
                    }
                    try {
                        int n4;
                        int n5 = Process.myPid();
                        int n6 = MainService.instance.i.J();
                        int n7 = MainService.instance.i.b0();
                        object2 = new e();
                        while ((n4 = ((w)object).f()) != 0) {
                            int n8 = ((w)object).f();
                            boolean bl = ((w)object).e() != 0;
                            int n9 = ((w)object).f();
                            int n10 = ((w)object).f();
                            int n11 = ((w)object).f();
                            n3 = ((w)object).f();
                            if (n3 >= 0 && n3 <= 200) {
                                Object object3;
                                String string2 = ((w)object).i(n3, null);
                                if (n4 == n5 || n4 == n6 || n4 == n7 || (object3 = this.h(n4, n8, string2, list, (SparseArray)object2)) == null || ((c)object3).c.equals(Tools.C0())) continue;
                                d d4 = new d((c)object3, n4, n8, string2, n10, bl, n9);
                                arrayList.add(d4);
                                if (n11 == 0) continue;
                                h.put(n4, n11);
                                object3 = new StringBuilder();
                                ((StringBuilder)object3).append("Tracer: ");
                                ((StringBuilder)object3).append(n11);
                                ((StringBuilder)object3).append(" -> ");
                                ((StringBuilder)object3).append(n4);
                                e1.d(((StringBuilder)object3).toString());
                                continue;
                            }
                            break block10;
                        }
                        break block11;
                    }
                    catch (IOException iOException2) {
                        break block12;
                    }
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Bad cmdline length: ");
                ((StringBuilder)object).append(n3);
                object2 = ((StringBuilder)object).toString();
                object = new RuntimeException();
                e1.l((String)object2, (Throwable)object);
                break block11;
            }
            e1.l("???", iOException2);
        }
        MainService.instance.h.d(this.s(arrayList, list));
    }

    public static void o(w w3) {
        i.n(w3);
    }

    public static void p(List list) {
        int n3;
        if (list == null) {
            return;
        }
        g = n3 = g + 1;
        z1.q(list, n3, 0, Math.min(list.size(), 128));
    }

    private static void q(List list, int n3, int n4, int n5) {
        n2.h(new Runnable(n3, n4, n5, list){
            final int a;
            final int b;
            final int c;
            final List d;
            {
                this.a = n3;
                this.b = n4;
                this.c = n5;
                this.d = list;
            }

            @Override
            public void run() {
                if (this.a != g) {
                    return;
                }
                int n3 = Math.min(this.b + 8, this.c);
                for (int i3 = this.b; i3 < n3; ++i3) {
                    if (this.a != g) {
                        return;
                    }
                    d d4 = (d)this.d.get(i3);
                    if (d4 == null || d4.p) continue;
                    d4.i(this.a);
                }
                if (n3 < this.c) {
                    n2.c().post(new Runnable(this, n3){
                        final int a;
                        final b b;
                        {
                            this.b = b4;
                            this.a = n3;
                        }

                        @Override
                        public void run() {
                            b b4 = this.b;
                            z1.q(b4.d, b4.a, this.a, b4.c);
                        }
                    });
                }
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void r(String string2, Drawable object) {
        if (string2 == null) return;
        if (object == null) {
            return;
        }
        Drawable drawable2 = Tools.R1((Drawable)object);
        if (drawable2 == null) return;
        if (drawable2 == object) {
            return;
        }
        object = f;
        synchronized (object) {
            object.put(string2, drawable2);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private List s(List stringArray, List object) {
        int n3;
        Object object2 = "Class not found";
        Object[] objectArray = stringArray.toArray(new d[stringArray.size()]);
        for (n3 = 0; n3 < objectArray.length; ++n3) {
            objectArray[n3].k = 0L;
        }
        List[] listArray = new List[2];
        try {
            listArray[0] = this.a.getRunningTasks(50);
        }
        catch (Throwable throwable) {
            e1.l("Failed getRunningTasks", throwable);
        }
        listArray[1] = object;
        n3 = 0;
        stringArray = object2;
        while (n3 < 2) {
            int n4;
            block30: {
                List list;
                block29: {
                    list = listArray[n3];
                    if (list != null) break block29;
                    n4 = n3;
                    object = stringArray;
                    break block30;
                }
                boolean[] blArray = new boolean[objectArray.length];
                int n5 = 0;
                while (true) {
                    int n6;
                    block32: {
                        long l3;
                        String string2;
                        Object e4;
                        block33: {
                            block26: {
                                block27: {
                                    block28: {
                                        ActivityManager.RunningTaskInfo runningTaskInfo;
                                        block31: {
                                            object = stringArray;
                                            n4 = n3;
                                            if (n5 >= list.size()) break;
                                            e4 = list.get(n5);
                                            if (e4 != null) break block31;
                                            n6 = n3;
                                            object = stringArray;
                                            break block32;
                                        }
                                        object = null;
                                        string2 = null;
                                        try {
                                            if (e4 instanceof ActivityManager.RunningTaskInfo) {
                                                runningTaskInfo = (ActivityManager.RunningTaskInfo)e4;
                                                object = new String[2];
                                                object2 = x1.a(runningTaskInfo) != null ? x1.a(runningTaskInfo).getPackageName() : null;
                                            }
                                            break block26;
                                        }
                                        catch (NoClassDefFoundError noClassDefFoundError) {
                                            object = string2;
                                            break block27;
                                        }
                                        object[0] = object2;
                                        {
                                            object2 = y1.a(runningTaskInfo) != null ? y1.a(runningTaskInfo).getPackageName() : null;
                                            object[1] = object2;
                                        }
                                        string2 = object[0];
                                        if (string2 != null) {
                                            try {
                                                if (!string2.equals(object2)) break block28;
                                                object[1] = null;
                                            }
                                            catch (NoClassDefFoundError noClassDefFoundError) {
                                                break block27;
                                            }
                                        }
                                    }
                                    l3 = 1000000L;
                                    break block33;
                                }
                                e1.s(stringArray, (Throwable)object2);
                            }
                            l3 = 0L;
                        }
                        object2 = object;
                        long l4 = l3;
                        try {
                            if (e4 instanceof ActivityManager.RunningAppProcessInfo) {
                                object2 = ((ActivityManager.RunningAppProcessInfo)e4).pkgList;
                                l4 = 1000L;
                            }
                        }
                        catch (NoClassDefFoundError noClassDefFoundError) {
                            e1.s((String)stringArray, noClassDefFoundError);
                            l4 = l3;
                            object2 = object;
                        }
                        if (object2 == null) {
                            object = stringArray;
                            n6 = n3;
                        } else {
                            n4 = ((String[])object2).length;
                            int n7 = 0;
                            while (true) {
                                int n8;
                                object = stringArray;
                                n6 = n3;
                                if (n7 >= n4) break;
                                string2 = object2[n7];
                                if (string2 == null) {
                                    n8 = n3;
                                    object = stringArray;
                                } else {
                                    int n9 = 0;
                                    n6 = n4;
                                    while (true) {
                                        n4 = n6;
                                        object = stringArray;
                                        n8 = n3;
                                        if (n9 >= objectArray.length) break;
                                        if (!blArray[n9] && (object = objectArray[n9]) != null && string2.equals(object.c)) {
                                            object.k += (long)(list.size() - n5) * l4;
                                            blArray[n9] = true;
                                        }
                                        ++n9;
                                    }
                                }
                                ++n7;
                                n3 = n8;
                                stringArray = object;
                            }
                        }
                    }
                    ++n5;
                    n3 = n6;
                    stringArray = object;
                }
            }
            n3 = n4 + 1;
            stringArray = object;
        }
        try {
            Arrays.sort(objectArray);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
        stringArray = new ArrayList(objectArray.length);
        n3 = 0;
        while (n3 < objectArray.length) {
            stringArray.add(objectArray[n3]);
            ++n3;
        }
        return stringArray;
    }

    public static class c {
        public int a;
        public int b;
        public String c;
        public String d;
        public String e = "";
        public boolean f = false;
        public boolean g = false;
        public boolean h = false;

        public c(int n3, String string2) {
            this.a = n3;
            this.c = string2;
            this.d = string2;
            this.b = n3;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AppInfo [uid=");
            stringBuilder.append(this.a);
            stringBuilder.append(", pkg=");
            stringBuilder.append(this.c);
            stringBuilder.append(", name=");
            stringBuilder.append(this.d);
            stringBuilder.append(", isSystem=");
            stringBuilder.append(this.f);
            stringBuilder.append(", isGame=");
            stringBuilder.append(this.g);
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

    public static class d
    implements Comparable {
        private static WeakReference q;
        public static final int r;
        public static final int s;
        public static final int t;
        public String a;
        public String b;
        public String c;
        public String d;
        public volatile Drawable e;
        public int f;
        public int g;
        public int h;
        public boolean i;
        public boolean j;
        public long k;
        public boolean l;
        public int m;
        public boolean n;
        public int o;
        private volatile boolean p = false;

        static {
            r = Tools.e0(2130837523, -5570561);
            s = Tools.e0(2130837522, -1);
            t = Tools.e0(2130837524, -5570646);
        }

        public d(c c4, int n3, int n4, String string2, int n5, boolean bl, int n6) {
            String string3;
            this.a = string2;
            this.b = c4.d;
            this.c = c4.c;
            String string4 = string3 = c4.e;
            if (string3 == null) {
                string4 = "";
            }
            this.d = string4;
            this.e = null;
            this.f = n3;
            this.g = n4;
            if (!c4.h) {
                n4 = c4.b;
            }
            this.h = n4;
            this.l = string2.equals(c4.c);
            this.i = c4.f;
            this.j = c4.g;
            this.m = n5;
            this.n = bl;
            this.o = n6;
            if (c4.h) {
                this.p = true;
            }
        }

        private String e() {
            boolean bl = this.l;
            String string2 = "";
            if (!bl) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(" (");
                string2 = this.a;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(this.c);
                stringBuilder2.append(':');
                stringBuilder.append(string2.replace(stringBuilder2.toString(), ""));
                stringBuilder.append(')');
                string2 = stringBuilder.toString();
            }
            return string2;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void i(int n3) {
            StringBuilder stringBuilder;
            if (this.p) return;
            Object object = z1.l(this.c);
            if (object != null) {
                Map map = f;
                synchronized (map) {
                    Throwable throwable2;
                    block14: {
                        if (n3 != 0) {
                            try {
                                if (n3 != g) {
                                    return;
                                }
                            }
                            catch (Throwable throwable2) {
                                break block14;
                            }
                        }
                        this.e = object;
                        this.p = true;
                        return;
                    }
                    throw throwable2;
                }
            }
            try {
                stringBuilder = Tools.R1(Tools.G0(Tools.X(Tools.Y(this.c)), Tools.H()));
            }
            catch (Throwable throwable) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed load icon for ");
                stringBuilder.append(this.c);
                e1.p(stringBuilder.toString());
                stringBuilder = null;
            }
            object = f;
            synchronized (object) {
                Throwable throwable3;
                block15: {
                    if (n3 != 0) {
                        try {
                            if (n3 != g) {
                                return;
                            }
                        }
                        catch (Throwable throwable3) {
                            break block15;
                        }
                    }
                    this.e = stringBuilder;
                    if (stringBuilder != null) {
                        z1.r(this.c, (Drawable)stringBuilder);
                    }
                    this.p = true;
                    return;
                }
                throw throwable3;
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public int c(d d4) {
            int n3 = this.m;
            int n4 = d4.m;
            int n5 = -1;
            if (n3 != n4) {
                if (n3 <= n4) return 1;
                return n5;
            }
            boolean bl = this.j;
            if (bl != d4.j) {
                if (!bl) return 1;
                return n5;
            }
            bl = this.i;
            if (bl != d4.i) {
                n4 = n5;
                if (!bl) return n4;
                return 1;
            }
            long l3 = this.k;
            long l4 = d4.k;
            if (l3 != l4) {
                if (l3 <= l4) return 1;
                return n5;
            }
            bl = this.l;
            if (bl != d4.l) {
                if (!bl) return 1;
                return n5;
            }
            n4 = this.f() > 0 ? 1 : 0;
            if (n4 != (n3 = d4.f() > 0 ? 1 : 0)) {
                n4 = n5;
                if (this.f() <= 0) return n4;
                return 1;
            }
            n3 = this.f;
            n4 = d4.f;
            if (n3 == n4) return 0;
            if (n3 <= n4) return 1;
            return n5;
        }

        public String d() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ProcessInfo [cmdline=");
            stringBuilder.append(this.a);
            stringBuilder.append(", name=");
            stringBuilder.append(this.b);
            stringBuilder.append(", packageName=");
            stringBuilder.append(this.c);
            stringBuilder.append(", icon=");
            stringBuilder.append(this.e);
            stringBuilder.append(", pid=");
            stringBuilder.append(this.f);
            stringBuilder.append(", uid=");
            stringBuilder.append(this.g);
            stringBuilder.append(", isSystem=");
            stringBuilder.append(this.i);
            stringBuilder.append(", isGame=");
            stringBuilder.append(this.j);
            stringBuilder.append(", weight=");
            stringBuilder.append(this.k);
            stringBuilder.append(", main=");
            stringBuilder.append(this.l);
            stringBuilder.append(", order=");
            stringBuilder.append(this.m);
            stringBuilder.append(", x64=");
            stringBuilder.append(this.n);
            stringBuilder.append(", rss=");
            stringBuilder.append(this.o);
            stringBuilder.append(", getTracer()=");
            stringBuilder.append(this.g());
            stringBuilder.append(", getTrace()=");
            stringBuilder.append(this.f());
            stringBuilder.append(']');
            return stringBuilder.toString();
        }

        public int f() {
            int n3;
            SparseIntArray sparseIntArray = h;
            int n4 = n3 = sparseIntArray.indexOfValue(this.f);
            if (n3 >= 0) {
                n4 = sparseIntArray.keyAt(n3);
            }
            return n4;
        }

        public int g() {
            return h.get(this.f);
        }

        public void h() {
            this.i(0);
        }

        public void j(TextView textView) {
            if (textView == null) {
                return;
            }
            boolean bl = this.p;
            Object object = this.e;
            boolean bl2 = bl;
            Drawable drawable2 = object;
            if (object == null) {
                Drawable drawable3 = z1.l(this.c);
                bl2 = bl;
                drawable2 = object;
                if (drawable3 != null) {
                    this.e = drawable3;
                    bl2 = true;
                    this.p = true;
                    drawable2 = drawable3;
                }
            }
            object = drawable2;
            if (drawable2 == null) {
                object = q;
                if (object != null) {
                    drawable2 = (Drawable)((Reference)object).get();
                }
                object = drawable2;
                if (drawable2 == null) {
                    object = Tools.o0(2130968587);
                    q = new WeakReference<Object>(object);
                }
            }
            Tools.c(textView, (Drawable)object, 48);
            if (!bl2) {
                n2.h(new Runnable(this, textView){
                    final TextView a;
                    final d b;
                    {
                        this.b = d4;
                        this.a = textView;
                    }

                    @Override
                    public void run() {
                        this.b.h();
                        if (this.b.e != null) {
                            n2.i(new Runnable(this){
                                final a a;
                                {
                                    this.a = a4;
                                }

                                @Override
                                public void run() {
                                    Object object = this.a.a.getTag();
                                    a a4 = this.a;
                                    d d4 = a4.b;
                                    if (object == d4) {
                                        Tools.c(a4.a, d4.e, 48);
                                    }
                                }
                            });
                        }
                    }
                });
            }
        }

        public void k() {
            block6: {
                if (this.g == this.h) {
                    return;
                }
                CharSequence charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("vs app: ");
                ((StringBuilder)charSequence).append(this.h);
                ((StringBuilder)charSequence).append(" != ");
                ((StringBuilder)charSequence).append(this.g);
                e1.p(((StringBuilder)charSequence).toString());
                charSequence = i.m(this.g);
                if (charSequence == null) break block6;
                charSequence = Tools.Y((String)charSequence);
                if (charSequence == null) break block6;
                try {
                    if (((ApplicationInfo)charSequence).nativeLibraryDir != null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("vs: ");
                        stringBuilder.append(this.d);
                        stringBuilder.append(" => ");
                        stringBuilder.append(((ApplicationInfo)charSequence).nativeLibraryDir);
                        e1.p(stringBuilder.toString());
                        this.d = ((ApplicationInfo)charSequence).nativeLibraryDir;
                    }
                }
                catch (Throwable throwable) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("Failed get vs info for ");
                    ((StringBuilder)charSequence).append(this.g);
                    e1.s(((StringBuilder)charSequence).toString(), throwable);
                }
            }
        }

        public CharSequence l() {
            y y3 = new y();
            StringBuilder stringBuilder = new StringBuilder();
            if (this.g() > 0) {
                stringBuilder.append('#');
            }
            if (this.f() > 0) {
                stringBuilder.append('!');
            }
            if (!Config.C && this.g != this.h) {
                stringBuilder.append('v');
            }
            if (this.f > 1) {
                stringBuilder.append('[');
                stringBuilder.append(Integer.toString(this.f));
                stringBuilder.append("] ");
            }
            y3.a(Tools.t(stringBuilder.toString(), r));
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.b);
            stringBuilder.append(this.e());
            y3.a(Tools.t(stringBuilder.toString(), s));
            stringBuilder = new StringBuilder();
            if (this.n) {
                stringBuilder.append(" [x64]");
            }
            if (this.o != 0) {
                stringBuilder.append(" [");
                stringBuilder.append(Tools.U(Tools.f0(), (long)this.o * 1024L));
                stringBuilder.append(']');
            }
            y3.a(Tools.t(stringBuilder.toString(), t));
            return y3.d();
        }

        public String toString() {
            return this.l().toString();
        }
    }
}

