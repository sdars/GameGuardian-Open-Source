/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.ext.Config;
import android.ext.Tools;
import android.ext.b2;
import android.ext.e1;
import android.ext.f;
import android.ext.f1;
import android.ext.i;
import android.ext.n2;
import android.ext.r;
import android.ext.x2;
import android.ext.z;
import android.os.Build;
import android.os.Handler;
import java.io.File;
import java.io.FileOutputStream;

abstract class s1 {
    private static final Object a = new Object();
    private static final String[] b = new String[]{"intro-shown", "permissions-requested", "permissions-settled", "overlay-shown", "overlay-settled", "complete"};
    private static volatile boolean c = false;
    private static volatile boolean d = false;
    private static volatile boolean e = false;
    private static volatile boolean f = false;
    private static volatile boolean g;
    private static final char[] h;
    private static String[] i;
    private static volatile boolean j;
    private static final Runnable k;

    static {
        h = "0123456789ABCDEF".toCharArray();
        k = new Runnable(){

            @Override
            public void run() {
                s1.c();
            }
        };
    }

    static void A() {
        if (!s1.u()) {
            return;
        }
        if (s1.O() != 3) {
            return;
        }
        g = false;
        z.m();
    }

    static void B() {
        if (!s1.u()) {
            return;
        }
        if (s1.O() != 2) {
            return;
        }
        s1.T("permissions-settled");
        s1.M(3);
        c = false;
        if (Build.VERSION.SDK_INT < 23) {
            s1.T("overlay-settled");
            s1.l();
            return;
        }
        z.m();
        s1.L();
    }

    /*
     * Enabled aggressive block sorting
     */
    static void C() {
        if (j && s1.q()) {
            j = false;
            s1.m();
        }
        if (!s1.u()) {
            return;
        }
        int n3 = s1.O();
        if (n3 == 1) {
            if (d) return;
        } else if (n3 != 2) {
            if (n3 != 3) return;
            g = false;
            z.m();
            return;
        }
        s1.o();
    }

    static boolean D() {
        return g;
    }

    static boolean E() {
        return f;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static String F() {
        Throwable throwable3;
        block8: {
            Object object;
            try {
                Object object2 = a;
                // MONITORENTER : object2
            }
            catch (Throwable throwable2) {
                e1.a(throwable2);
                return "";
            }
            try {
                object = Tools.M0();
                if (!s1.R(object)) {
                    // MONITOREXIT : object2
                    return "";
                }
            }
            catch (Throwable throwable3) {
                break block8;
            }
            String string2 = object.getString("onboarding-queue", "");
            object = string2;
            if (string2 == null) {
                object = "";
            }
            // MONITOREXIT : object2
            return object;
        }
        // MONITOREXIT : object2
        throw throwable3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static String G() {
        Throwable throwable3;
        block13: {
            String string2;
            String string3;
            String string4;
            SharedPreferences sharedPreferences;
            block12: {
                int n3;
                block11: {
                    try {
                        Object object = a;
                        // MONITORENTER : object
                    }
                    catch (Throwable throwable2) {
                        e1.a(throwable2);
                        return null;
                    }
                    try {
                        sharedPreferences = Tools.M0();
                        string4 = sharedPreferences.getString("onboarding-queue", "");
                        if (string4 == null) {
                            // MONITOREXIT : object
                            return "";
                        }
                        if (string4.length() == 0) {
                            return "";
                        }
                        n3 = string4.indexOf(44);
                        if (n3 >= 0) break block11;
                        string3 = "";
                        string2 = string4;
                        string4 = string3;
                        break block12;
                    }
                    catch (Throwable throwable3) {
                        break block13;
                    }
                }
                string2 = string4.substring(0, n3);
                string4 = string4.substring(n3 + 1);
            }
            string3 = sharedPreferences.edit();
            if (string4.length() > 0) {
                string3.putString("onboarding-queue", string4);
            } else {
                string3.remove("onboarding-queue");
            }
            if (!string3.commit()) {
                e1.p("Failed consume onboarding queue item");
                // MONITOREXIT : object
                return null;
            }
            // MONITOREXIT : object
            return string2;
        }
        // MONITOREXIT : object
        throw throwable3;
    }

    static void H() {
        j = true;
    }

    static void I() {
        f1.F();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void J(int n3, String charSequence) {
        Throwable throwable2;
        block11: {
            block14: {
                block10: {
                    boolean bl;
                    block13: {
                        block12: {
                            if (n3 == 1) break block12;
                            if (n3 != 2) {
                                if (n3 != 4) {
                                    try {
                                        charSequence = new StringBuilder();
                                        ((StringBuilder)charSequence).append("Failed replay onboarding prompt: unknown code ");
                                        ((StringBuilder)charSequence).append(n3);
                                        e1.p(((StringBuilder)charSequence).toString());
                                        break block10;
                                    }
                                    catch (Throwable throwable2) {
                                        break block11;
                                    }
                                }
                                bl = f1.G(k);
                                break block13;
                            } else {
                                bl = x2.o((String)charSequence, k);
                            }
                            break block13;
                        }
                        bl = x2.p((String)charSequence, k);
                    }
                    if (bl) break block14;
                }
                if (!s1.j()) {
                    s1.P();
                    return;
                }
                s1.m();
            }
            return;
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Failed replay onboarding prompt ");
        ((StringBuilder)charSequence).append(n3);
        e1.s(((StringBuilder)charSequence).toString(), throwable2);
        s1.P();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static void K() {
        if (!s1.q()) {
            return;
        }
        String string2 = s1.F();
        if (string2.length() == 0) {
            s1.i(true);
            return;
        }
        f = true;
        // MONITORENTER : android.ext.s1.class
        String[] stringArray = i;
        if (stringArray != null && stringArray.length > 0) {
            // MONITOREXIT : android.ext.s1.class
            return;
        }
        i = string2.split(",");
        // MONITOREXIT : android.ext.s1.class
        s1.m();
    }

    private static void L() {
        try {
            Handler handler = n2.d();
            Runnable runnable = new Runnable(){

                @Override
                public void run() {
                    s1.z();
                }
            };
            handler.postDelayed(runnable, 20000L);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void M(int n3) {
        try {
            Object object = a;
            synchronized (object) {
            }
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            return;
        }
        {
            s1.f(Tools.M0()).putInt("onboarding-step", n3 + 161550).commit();
            return;
        }
    }

    private static void N() {
        AlertDialog alertDialog = android.ext.f.c(r.p).setTitle((CharSequence)b2.f(2131296879)).setCancelable(false).setMessage((CharSequence)s1.t()).setPositiveButton((CharSequence)b2.f(2131296836), new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n3) {
                s1.s();
            }
        }).setNeutralButton((CharSequence)b2.f(2131296786), new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n3) {
                f1.r(r.p, new Runnable(this){
                    final d a;
                    {
                        this.a = d4;
                    }

                    @Override
                    public void run() {
                        if (s1.u() && s1.O() == 1 && r.n != null) {
                            s1.N();
                        }
                    }
                });
            }
        }).create();
        android.ext.f.l(alertDialog, new DialogInterface.OnShowListener(alertDialog){
            final AlertDialog a;
            {
                this.a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Tools.u1(this.a);
            }
        });
        android.ext.f.m(alertDialog);
    }

    static int O() {
        try {
            int n3 = Tools.M0().getInt("onboarding-step", 0);
            if (n3 / 10 != 16155) {
                return 0;
            }
            if ((n3 %= 10) >= 0 && n3 <= 5) {
                return n3;
            }
            return 0;
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            return 0;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void P() {
        synchronized (s1.class) {
            i = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static boolean Q() {
        Throwable throwable3;
        block8: {
            boolean bl;
            boolean bl2;
            SharedPreferences sharedPreferences;
            try {
                Object object = a;
                // MONITORENTER : object
            }
            catch (Throwable throwable2) {
                e1.a(throwable2);
                return false;
            }
            try {
                sharedPreferences = Tools.M0();
                boolean bl3 = s1.R(sharedPreferences);
                bl2 = true;
                bl = bl3 && sharedPreferences.getBoolean("onboarding-shutdown-expected", false);
            }
            catch (Throwable throwable3) {
                break block8;
            }
            if (sharedPreferences.contains("onboarding-shutdown-expected")) {
                sharedPreferences.edit().remove("onboarding-shutdown-expected").commit();
            }
            if (bl && s1.O() >= 2) {
                return bl2;
            }
            bl2 = false;
            // MONITOREXIT : object
            return bl2;
        }
        // MONITOREXIT : object
        throw throwable3;
    }

    private static boolean R(SharedPreferences sharedPreferences) {
        boolean bl = sharedPreferences.getInt("onboarding-build", -1) == 16155;
        return bl;
    }

    static String S(String string2) {
        if (string2 != null && string2.length() != 0) {
            StringBuilder stringBuilder = new StringBuilder(string2.length());
            for (int i3 = 0; i3 < string2.length(); ++i3) {
                int n3;
                char c4 = string2.charAt(i3);
                if (c4 == '%' && (n3 = i3 + 2) < string2.length()) {
                    int n4 = s1.r(string2.charAt(i3 + 1));
                    int n5 = s1.r(string2.charAt(n3));
                    if (n4 >= 0 && n5 >= 0) {
                        stringBuilder.append((char)(n4 << 4 | n5));
                        i3 = n3;
                        continue;
                    }
                }
                stringBuilder.append(c4);
            }
            return stringBuilder.toString();
        }
        return "";
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void T(String var0) {
        block9: {
            block8: {
                if (var0 == null) {
                    var0 = "Failed write onboarding stage: null code";
lbl3:
                    // 2 sources

                    while (true) {
                        e1.p(var0);
                        return;
                    }
                }
                for (var1_3 = 0; var1_3 < ((String[])(var2_4 = s1.b)).length; ++var1_3) {
                    if (!var2_4[var1_3].equals(var0)) continue;
                    var3_5 = s1.k("onboarding.stage");
                    var2_4 = new FileOutputStream(var3_5);
                    Tools.q(var3_5, 384);
                    break block8;
                }
                var0 = "Failed write onboarding stage: unknown code";
                ** while (true)
            }
            ** try [egrp 1[TRYBLOCK] [1 : 59->70)] { 
lbl-1000:
            // 1 sources

            {
                catch (Throwable var0_2) {
                    var2_4.close();
                    throw var0_2;
                }
            }
lbl21:
            // 1 sources

            ** GOTO lbl24
            {
                catch (Throwable var0_1) {
                    break block9;
                }
lbl24:
                // 1 sources

                var2_4.write(var0.getBytes("US-ASCII"));
                var2_4.close();
                return;
            }
        }
        e1.s("Failed write onboarding stage", var0_1);
    }

    private static void c() {
        if (!s1.j()) {
            s1.P();
            return;
        }
        if (j) {
            return;
        }
        s1.m();
    }

    static void d() {
        int n3;
        if (!s1.q()) {
            return;
        }
        if (!s1.u()) {
            s1.K();
            return;
        }
        f = true;
        c = false;
        if (!e) {
            e = true;
            s1.I();
        }
        if ((n3 = s1.O()) == 0 || n3 == 1) {
            if (n3 == 0) {
                s1.M(1);
                s1.T("intro-shown");
            }
            d = true;
            s1.N();
        }
    }

    static void e() {
        j = false;
    }

    private static SharedPreferences.Editor f(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        if (!s1.R(sharedPreferences)) {
            editor.remove("onboarding-queue").remove("onboarding-shutdown-expected").putInt("onboarding-build", 16155);
        }
        return editor;
    }

    static void g() {
        g = false;
    }

    private static void h() {
        s1.T("complete");
        s1.M(4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static boolean i(boolean bl) {
        Throwable throwable3;
        block8: {
            try {
                Object object = a;
                // MONITORENTER : object
            }
            catch (Throwable throwable2) {
                e1.a(throwable2);
                return false;
            }
            try {
                if (s1.F().length() > 0) {
                    // MONITOREXIT : object
                    return false;
                }
            }
            catch (Throwable throwable3) {
                break block8;
            }
            if (bl && s1.O() != 5) {
                // MONITOREXIT : object
                return false;
            }
            s1.h();
            // MONITOREXIT : object
            return true;
        }
        // MONITOREXIT : object
        throw throwable3;
    }

    private static boolean j() {
        boolean bl = s1.G() != null;
        return bl;
    }

    private static File k(String string2) {
        File file = Tools.p0();
        if (file != null && !file.isDirectory()) {
            file.mkdirs();
        }
        return new File(file, string2);
    }

    static void l() {
        if (!s1.u()) {
            return;
        }
        c = false;
        if (s1.i(false)) {
            return;
        }
        s1.M(5);
        n2.i(new Runnable(){

            @Override
            public void run() {
                s1.K();
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void m() {
        int n3;
        String string2 = s1.F();
        if (string2.length() == 0) {
            synchronized (s1.class) {
                i = null;
            }
            s1.i(true);
            return;
        }
        int n4 = string2.indexOf(44);
        String string3 = string2;
        if (n4 >= 0) {
            string3 = string2.substring(0, n4);
        }
        if ((n3 = string3.indexOf(58)) < 0) {
            if (!s1.j()) {
                s1.P();
                return;
            }
            s1.m();
            return;
        }
        try {
            n4 = Integer.parseInt(string3.substring(0, n3));
        }
        catch (NumberFormatException numberFormatException) {
            e1.s("Failed replay onboarding prompt: bad code", numberFormatException);
            if (!s1.j()) {
                s1.P();
                return;
            }
            s1.m();
            return;
        }
        s1.J(n4, s1.S(string3.substring(n3 + 1)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static boolean n() {
        Throwable throwable3;
        Throwable throwable22;
        block11: {
            boolean bl = false;
            try {
                if (s1.u()) return false;
                if (!s1.q()) {
                    return false;
                }
                if (s1.O() == 5) {
                    return true;
                }
                // MONITORENTER : android.ext.s1.class
            }
            catch (Throwable throwable22) {}
            try {
                String[] stringArray = i;
                if (stringArray != null && stringArray.length > 0) {
                    // MONITOREXIT : android.ext.s1.class
                    return true;
                }
            }
            catch (Throwable throwable3) {
                break block11;
            }
            int n3 = s1.F().length();
            if (n3 <= 0) return bl;
            return true;
        }
        throw throwable3;
        e1.a(throwable22);
        return false;
    }

    private static void o() {
        if (c) {
            return;
        }
        c = true;
        s1.M(2);
        if (Build.VERSION.SDK_INT < 23) {
            s1.B();
            return;
        }
        r r3 = r.n;
        if (r3 != null) {
            r3.m();
        }
    }

    static String p(String string2) {
        if (string2 != null && string2.length() != 0) {
            StringBuilder stringBuilder = new StringBuilder(string2.length());
            for (int i3 = 0; i3 < string2.length(); ++i3) {
                char c4;
                char c5 = c4 = string2.charAt(i3);
                if ("%,:;|".indexOf(c4) >= 0) {
                    stringBuilder.append('%');
                    char[] cArray = h;
                    stringBuilder.append(cArray[c4 >> 4 & 0xF]);
                    c5 = cArray[c4 & 0xF];
                }
                stringBuilder.append(c5);
            }
            return stringBuilder.toString();
        }
        return "";
    }

    private static boolean q() {
        if (Config.vSpaceReal) {
            return false;
        }
        if (android.ext.i.b.equals(Tools.C0())) {
            return false;
        }
        return !new File(Tools.removeNewLinesChars("2gdwd2JJ1vnls1lqvwdoo")).exists();
    }

    private static int r(char c4) {
        if (c4 >= '0' && c4 <= '9') {
            return c4 - 48;
        }
        if (c4 >= 'A' && c4 <= 'F') {
            return c4 - 55;
        }
        if (c4 >= 'a' && c4 <= 'f') {
            return c4 - 87;
        }
        return -1;
    }

    static void s() {
        if (!s1.u()) {
            return;
        }
        if (s1.O() != 1) {
            return;
        }
        d = false;
        r r3 = r.n;
        if (r3 != null) {
            r3.p();
        }
    }

    private static String t() {
        return b2.f(2131296787);
    }

    static boolean u() {
        Throwable throwable2;
        block3: {
            boolean bl;
            block2: {
                boolean bl2;
                bl = bl2 = false;
                try {
                    if (!s1.q()) break block2;
                    int n3 = s1.O();
                    bl = bl2;
                    if (n3 >= 4) break block2;
                    bl = true;
                }
                catch (Throwable throwable2) {
                    break block3;
                }
            }
            return bl;
        }
        e1.a(throwable2);
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static void v(int n3, String charSequence) {
        Throwable throwable2;
        block10: {
            SharedPreferences.Editor editor;
            if (n3 <= 0) {
                e1.p("Failed note deferred onboarding prompt: bad code");
                return;
            }
            CharSequence charSequence2 = charSequence;
            if (charSequence == null) {
                charSequence2 = "";
            }
            Object object = a;
            // MONITORENTER : object
            try {
                charSequence = Tools.M0();
                editor = s1.f((SharedPreferences)charSequence);
                charSequence = s1.R((SharedPreferences)charSequence) ? charSequence.getString("onboarding-queue", "") : "";
            }
            catch (Throwable throwable2) {
                break block10;
            }
            CharSequence charSequence3 = charSequence;
            if (charSequence == null) {
                charSequence3 = "";
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(n3);
            ((StringBuilder)charSequence).append(":");
            ((StringBuilder)charSequence).append(s1.p((String)charSequence2));
            charSequence = charSequence2 = ((StringBuilder)charSequence).toString();
            if (((String)charSequence3).length() > 0) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)charSequence3);
                ((StringBuilder)charSequence).append(",");
                ((StringBuilder)charSequence).append((String)charSequence2);
                charSequence = ((StringBuilder)charSequence).toString();
            }
            editor.putString("onboarding-queue", (String)charSequence).commit();
            // MONITOREXIT : object
            return;
        }
        // MONITOREXIT : object
        try {
            throw throwable2;
        }
        catch (Throwable throwable3) {
            e1.a(throwable3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void w() {
        try {
            Object object = a;
            synchronized (object) {
            }
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            return;
        }
        {
            s1.f(Tools.M0()).putBoolean("onboarding-shutdown-expected", true).commit();
            return;
        }
    }

    static void x() {
        g = true;
    }

    static void y() {
        if (s1.u()) {
            s1.T("permissions-requested");
        }
    }

    static void z() {
        if (s1.u() && s1.O() == 3) {
            if (!z.y() && !g) {
                z.F();
                return;
            }
            s1.L();
        }
    }
}

