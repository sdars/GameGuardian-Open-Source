package android.ext;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.view.View;
import catch_.me_.if_.you_.can_.R$string;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final LinkedList f1331a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static int f1332b = 0;

    public static void a(String str, byte b2, int i) {
        if (str == null || str.length() == 0 || "0".equals(str) || "-1".equals(str) || "1".equals(str)) {
            return;
        }
        y0$c y0_c = new y0$c(str, i, "...");
        ListIterator listIterator = f1331a.listIterator();
        int i2 = 0;
        while (listIterator.hasNext()) {
            y0$c y0_c2 = (y0$c) listIterator.next();
            if (y0_c2.equals(y0_c)) {
                y0_c.f1359d = y0_c2.f1359d;
                listIterator.remove();
                int i3 = f1332b;
                if (i2 >= i3) {
                    break;
                }
                f1332b = i3 - 1;
                if (b2 != 0) {
                    break;
                }
                b2 = 1;
                break;
            }
            i2++;
        }
        if (b2 != 0 && b2 == 1) {
            f1331a.addFirst(y0_c);
            f1332b++;
        } else {
            d();
            f1331a.add(f1332b, y0_c);
        }
        j();
        h();
    }

    public static void b(String str, int i) {
        a(str, (byte) 0, i);
    }

    public static void c() {
        f1331a.clear();
        d();
    }

    static void d() {
        int i = f1332b;
        if (i < 0) {
            f1332b = 0;
            return;
        }
        int size = f1331a.size();
        if (i > size) {
            f1332b = size;
        }
    }

    public static void e() {
        f();
    }

    private static void f() {
        SharedPreferences sharedPreferencesM0 = Tools.M0();
        if (sharedPreferencesM0 == null) {
            return;
        }
        LinkedList linkedList = f1331a;
        int i = sharedPreferencesM0.getInt("history-size", 0);
        int i2 = i > Config.x ? Config.x : i;
        int iG = g(i2);
        boolean[] zArr = new boolean[iG];
        int i3 = iG - 1;
        for (int i4 = 0; i4 < i; i4++) {
            String string = sharedPreferencesM0.getString("history-" + i4, null);
            if (string != null && string.length() != 0) {
                int i5 = sharedPreferencesM0.getInt("h-" + i4, 1);
                if (i5 == 0) {
                    i5 = 1;
                }
                y0$c y0_c = new y0$c(string, i5, sharedPreferencesM0.getString("hi-" + i4, "..."));
                int iHashCode = y0_c.hashCode() & i3;
                if (!zArr[iHashCode]) {
                    zArr[iHashCode] = true;
                } else if (linkedList.indexOf(y0_c) != -1) {
                    continue;
                }
                linkedList.addLast(y0_c);
                if (linkedList.size() >= i2) {
                    break;
                }
            }
        }
        f1332b = sharedPreferencesM0.getInt("history-sticked", 0);
        d();
        j();
    }

    private static int g(int i) {
        int i2 = i | (i >> 1);
        int i3 = i2 | (i2 >> 2);
        int i4 = i3 | (i3 >> 4);
        int i5 = i4 | (i4 >> 8);
        return (i5 | (i5 >> 16)) + 1;
    }

    static void h() {
        SharedPreferences sharedPreferencesM0 = Tools.M0();
        if (sharedPreferencesM0 == null) {
            return;
        }
        g2 g2Var = new g2(sharedPreferencesM0.edit());
        int i = 0;
        for (y0$c y0_c : f1331a) {
            g2Var.putString("history-" + i, y0_c.f1356a);
            g2Var.g("h-" + i, y0_c.f1357b, 1);
            g2Var.k("hi-" + i, y0_c.f1359d, "...");
            i++;
        }
        g2Var.g("history-size", i, 0);
        g2Var.g("history-sticked", f1332b, 0);
        g2Var.commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(android.widget.EditText editText) {
        y0$b y0_b = new y0$b(Tools.k0(), editText instanceof k0 ? ((k0) editText).getDataType() : -1);
        if (y0_b.getCount() == 0) {
            Tools.H1(R$string.history_empty);
            return;
        }
        y0$b.f1335e = false;
        View viewI0 = Tools.i0(b2.f(R$string.history), b2.f(R$string.click_edit));
        viewI0.setOnClickListener(y0_b);
        AlertDialog alertDialogCreate = f.c(Tools.k0()).setCustomTitle(viewI0).setAdapter(y0_b, new y0$a(y0_b, editText)).create();
        y0_b.f1336a = alertDialogCreate;
        f.m(alertDialogCreate);
    }

    private static void j() {
        LinkedList linkedList = f1331a;
        int i = Config.x;
        if (linkedList.size() <= i) {
            return;
        }
        for (int size = linkedList.size() - i; size > 0; size--) {
            linkedList.removeLast();
        }
        d();
    }
}
