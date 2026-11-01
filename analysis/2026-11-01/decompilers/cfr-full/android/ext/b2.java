/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.e;
import android.content.res.Resources;
import android.ext.Tools;
import android.ext.e1;
import android.ext.k;
import android.ext.n2;
import android.ext.t1;
import android.ext.t2;
import android.os.Handler;
import d.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class b2 {
    private static volatile WeakReference a = new WeakReference<Object>(null);
    static volatile e b = new e();
    static int[] c = d.b.d;
    static volatile long d = 0L;
    private static final Runnable e = new Runnable(){

        @Override
        public void run() {
            long l3 = d;
            if (l3 != 0L && System.currentTimeMillis() - l3 > 5000L) {
                b2.a();
            }
            Handler handler = n2.d();
            try {
                handler.removeCallbacks((Runnable)this);
            }
            catch (NullPointerException nullPointerException) {
                e1.a(nullPointerException);
            }
            handler.postDelayed((Runnable)this, 1000L);
        }
    };
    private static Pattern f = Pattern.compile("__([a-z0-9_]+?)__");

    public static void a() {
        e e4 = b;
        if (e4.size() <= c.length) {
            return;
        }
        e e5 = new e();
        for (int n3 : c) {
            String string2 = (String)e4.b(n3);
            if (string2 == null) continue;
            e5.put(n3, string2);
        }
        b = e5;
        d = 0L;
    }

    public static String b(int n3) {
        CharSequence charSequence;
        try {
            charSequence = b2.c().getResourceEntryName(n3);
        }
        catch (Throwable throwable) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Resource name for id 0x");
            ((StringBuilder)charSequence).append(t2.e(8, n3));
            ((StringBuilder)charSequence).append(" not found");
            charSequence = ((StringBuilder)charSequence).toString();
            e1.l((String)charSequence, throwable);
        }
        return charSequence;
    }

    private static Resources c() {
        Resources resources = (Resources)a.get();
        Object object = resources;
        if (resources == null) {
            resources = Tools.f0().getResources();
            a = new WeakReference<Resources>(resources);
            e.run();
            e e4 = new e();
            object = c.length == 0 ? new ArrayList() : null;
            int n3 = b2.d(Tools.removeNewLinesChars("dssbqdph"), "string");
            String string2 = Tools.removeNewLinesChars("JdphJxdugldq").intern();
            if (object != null) {
                ((ArrayList)object).add(n3);
            }
            e4.put(n3, string2);
            try {
                String.format(k.f(), b2.h(2131296356), 1000);
            }
            catch (Exception exception) {
                e1.l("Check format", exception);
                if (object != null) {
                    ((ArrayList)object).add(2131296356);
                }
                e4.put(2131296356, "%d");
            }
            string2 = Tools.removeNewLinesChars("kwws=22jdphjxdugldq1qhw2iruxp");
            if (object != null) {
                ((ArrayList)object).add(2131296475);
            }
            e4.put(2131296475, string2);
            if (object != null) {
                ((ArrayList)object).add(2131296370);
            }
            e4.put(2131296370, String.valueOf(t1.b));
            if (object != null) {
                ((ArrayList)object).add(2131297009);
            }
            e4.put(2131297009, t1.a);
            if (object != null) {
                c = Tools.Y0((List)object);
            }
            b = e4;
            object = resources;
        }
        return object;
    }

    public static int d(String string2, String string3) {
        try {
            Resources resources = b2.c();
            int n3 = resources.getIdentifier(string2, string3, resources.getResourcePackageName(2131296356));
            return n3;
        }
        catch (Throwable throwable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Resource id for name '");
            stringBuilder.append(string2);
            stringBuilder.append("' not found");
            e1.s(stringBuilder.toString(), throwable);
            return 0;
        }
    }

    private static String e(String string2) {
        String string3 = string2;
        if (string2 == null) {
            string3 = "null";
        }
        string2 = string3;
        if (string3.indexOf(95) >= 0) {
            try {
                Matcher matcher = f.matcher(string3);
                return matcher;
            }
            finally {
                String string4 = string3;
            }
        }
        return string2;
    }

    public static String f(int n3) {
        return b2.h(n3);
    }

    public static String g(String string2) {
        return b2.e(string2);
    }

    private static String h(int n3) {
        if (n3 != 0 && n3 != -1) {
            e e4 = b;
            Object object = e4.b(n3);
            object = object == null ? null : object.toString();
            Object object2 = object;
            if (object == null) {
                try {
                    object = b2.c().getString(n3);
                }
                catch (Throwable throwable) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Resource for id 0x");
                    ((StringBuilder)object).append(t2.e(8, n3));
                    ((StringBuilder)object).append(" not found");
                    object = ((StringBuilder)object).toString();
                    e1.l((String)object, throwable);
                }
                object2 = b2.e((String)object);
                try {
                    e4.c(n3, object2);
                }
                catch (Throwable throwable) {
                    e1.a(throwable);
                }
                d = System.currentTimeMillis();
            }
            return object2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(Invalid resource id ");
        stringBuilder.append(n3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

