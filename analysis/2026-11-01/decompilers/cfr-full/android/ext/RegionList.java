/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.ext.Config;
import android.ext.EditText;
import android.ext.FastScrollerFix;
import android.ext.MainService;
import android.ext.RegionListFiltered;
import android.ext.Tools;
import android.ext.b2;
import android.ext.c;
import android.ext.e;
import android.ext.e0;
import android.ext.e1;
import android.ext.f;
import android.ext.t1;
import android.ext.w;
import android.fix.ImageButtonView;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ListView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RegionList
extends ImageButtonView
implements View.OnClickListener {
    private static volatile List a = new ArrayList();
    private static volatile b b = null;
    private static volatile SparseIntArray c = new SparseIntArray();
    private static int[] d;
    static CharSequence[] e;
    static int[] f;

    public RegionList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g();
    }

    public static CharSequence a(long l3) {
        Object object = RegionList.b(l3);
        object = object == null ? "?" : ((b)object).e();
        return object;
    }

    public static b b(long l3) {
        l3 = android.ext.e.a(l3, e0.m());
        b b4 = b;
        if (b4 != null && Tools.T1(b4.b, l3) && Tools.S1(l3, b4.c)) {
            return b4;
        }
        List list = a;
        int n3 = list.size() - 1;
        int n4 = 0;
        while (n4 <= n3) {
            int n5 = n4 + n3 >>> 1;
            b4 = (b)list.get(n5);
            if (Tools.T1(b4.c, l3)) {
                n4 = n5 + 1;
                continue;
            }
            if (Tools.S1(l3, b4.b)) {
                n3 = n5 - 1;
                continue;
            }
            b = b4;
            return b4;
        }
        return null;
    }

    public static b c(String object, String bArray, long l3) {
        Object object2 = ((String)object).trim();
        String string2 = bArray.trim();
        if (string2.length() > 0 && l3 >= 0L) {
            int n3;
            CharSequence charSequence;
            Object object3 = a;
            bArray = new b[6];
            int[] nArray = new int[6];
            object = new File(string2);
            CharSequence charSequence2 = new StringBuilder();
            charSequence2.append('/');
            charSequence2.append(((File)object).getName());
            charSequence2 = charSequence2.toString();
            if (((File)object).getParentFile() != null) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append('/');
                ((StringBuilder)charSequence).append(((File)object).getParentFile().getName());
                ((StringBuilder)charSequence).append((String)charSequence2);
                object = ((StringBuilder)charSequence).toString();
            } else {
                object = null;
            }
            int n4 = RegionList.f((String)object2);
            object3 = object3.iterator();
            while (true) {
                int n5;
                int n6;
                boolean bl = object3.hasNext();
                n3 = n6 = 0;
                if (!bl) break;
                object2 = (b)object3.next();
                if (object2 == null || ((String)(charSequence = ((b)object2).a())).length() == 0 || ((b)object2).c - ((b)object2).b <= l3) continue;
                n3 = n5 = (((b)object2).a ^ n4) & 0xF00;
                if (n5 != 0) {
                    n3 = Integer.bitCount(n5);
                }
                if (((String)charSequence).equals(string2)) {
                    if (n3 == 0) {
                        bArray[0] = object2;
                        n3 = n6;
                        break;
                    }
                    if (bArray[1] == null || nArray[1] > n3) {
                        bArray[1] = object2;
                        nArray[1] = n3;
                    }
                }
                if (object != null && ((String)charSequence).endsWith((String)object)) {
                    if (n3 == 0) {
                        bArray[2] = object2;
                    } else if (bArray[3] == null || nArray[3] > n3) {
                        bArray[3] = object2;
                        nArray[3] = n3;
                    }
                }
                if (!((String)charSequence).endsWith((String)charSequence2)) continue;
                if (n3 == 0) {
                    bArray[4] = object2;
                    continue;
                }
                if (bArray[5] != null && nArray[5] <= n3) continue;
                bArray[5] = object2;
                nArray[5] = n3;
            }
            while (n3 < 6) {
                object = bArray[n3];
                if (object != null) {
                    return object;
                }
                ++n3;
            }
        }
        return null;
    }

    public static long d(int n3) {
        return (long)c.get(n3) * 4096L;
    }

    private static int e(int n3) {
        int n4 = d.length;
        int n5 = 0;
        for (int i3 = 0; i3 < n4; ++i3) {
            if ((d[i3] & n3) != n3) continue;
            n5 = i3;
        }
        return n5;
    }

    public static int f(String string2) {
        int n3 = string2.length();
        int n4 = 0;
        if (n3 != 4) {
            return 0;
        }
        if (string2.charAt(0) == 'r') {
            n4 = 256;
        }
        n3 = n4;
        if (string2.charAt(1) == 'w') {
            n3 = n4 | 0x200;
        }
        n4 = n3;
        if (string2.charAt(2) == 'x') {
            n4 = n3 | 0x400;
        }
        n3 = n4;
        if (string2.charAt(3) == 's') {
            n3 = n4 | 0x800;
        }
        return n3;
    }

    private void g() {
        this.setOnClickListener(this);
        if (!this.isInEditMode()) {
            this.setImageResource(2130968588);
            Config.m(this);
        }
    }

    public static List<b> getList() {
        return a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void h(w object) {
        SparseIntArray sparseIntArray;
        ArrayList<Object> arrayList;
        block9: {
            ((w)object).j();
            arrayList = new ArrayList<Object>();
            sparseIntArray = new SparseIntArray();
            Object object2 = a;
            if (object2 != null) {
                arrayList.ensureCapacity(object2.size());
            }
            RegionList.i();
            object2 = "";
            try {
                int n3;
                while ((n3 = ((w)object).f()) != 0) {
                    block10: {
                        String string2;
                        Object object3;
                        long l3;
                        long l4;
                        int n4;
                        block12: {
                            int n5;
                            block11: {
                                n4 = RegionList.e(n3);
                                l4 = ((w)object).h();
                                l3 = ((w)object).h();
                                n5 = n4 | ((w)object).f() << 8;
                                if ((n3 & 0x810) == 0) {
                                    object2 = null;
                                }
                                if ((n3 = ((w)object).f()) < 0 || n3 > 1024) break block10;
                                b b4 = RegionList.b(l4);
                                object3 = b4 == null ? null : b4.d;
                                string2 = ((w)object).i(n3, (String)object3).trim().intern();
                                if (b4 == null || b4.a != n5 || b4.b != l4) break block11;
                                object3 = b4;
                                if (b4.c == l3) break block12;
                            }
                            object3 = new b(n5, l4, l3);
                        }
                        ((b)object3).d = string2;
                        ((b)object3).e = object2;
                        arrayList.add(object3);
                        l4 = l3 = (((b)object3).c - ((b)object3).b) / 4096L;
                        if (l3 < 0L) {
                            l4 = 0L;
                        }
                        sparseIntArray.put(n4, sparseIntArray.get(n4) + (int)l4);
                        object2 = string2;
                        continue;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Bad name length: ");
                    ((StringBuilder)object).append(n3);
                    object2 = ((StringBuilder)object).toString();
                    object = new RuntimeException();
                    e1.l((String)object2, (Throwable)object);
                    break block9;
                }
                break block9;
            }
            catch (IOException iOException) {}
            e1.l("???", iOException);
        }
        a = arrayList;
        c = sparseIntArray;
        b = null;
        MainService.instance.N.d();
    }

    private static void i() {
        Config.b(2131034189).a();
    }

    public static void k(int[] nArray, CharSequence[] charSequenceArray, int[] nArray2) {
        d = nArray;
        e = charSequenceArray;
        f = nArray2;
    }

    public void j(View object, int n3) {
        int n4;
        long l3;
        Object object2;
        boolean bl;
        int n5;
        ListView listView;
        block12: {
            listView = this.getTag();
            if (!(listView instanceof EditText)) {
                return;
            }
            listView = (EditText)listView;
            listView.requestFocus();
            if (object == null) {
                object = this;
            }
            n5 = object.getId();
            int n6 = 0;
            bl = n5 == 2131034378;
            object2 = listView.getText().toString().trim();
            if (((String)object2).length() > 0) {
                try {
                    l3 = t1.r((String)object2, 16);
                    break block12;
                }
                catch (NumberFormatException numberFormatException) {
                    object = new StringBuilder();
                    object.append("RegionList failed parse: ");
                    object.append((String)object2);
                    e1.s(object.toString(), numberFormatException);
                }
            }
            l3 = 0L;
        }
        List list = a;
        Object object3 = new ArrayList<CharSequence>(list.size());
        SparseIntArray sparseIntArray = new SparseIntArray();
        int n7 = -1;
        for (n5 = 0; n5 < list.size(); ++n5) {
            object2 = (b)list.get(n5);
            if (n3 != 0 && (n4 = ((b)object2).a & 0xFF) < ((View)(object = (Object)d)).length && (object[n4] & n3) == 0) continue;
            sparseIntArray.append(((ArrayList)object3).size(), n5);
            ((ArrayList)object3).add(((b)object2).g());
            if (!Tools.T1(((b)object2).b, l3)) continue;
            n7 = n5;
        }
        if (((ArrayList)object3).size() == 0) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(b2.f(2131296811));
            if (n3 != 0) {
                object3 = d;
                listView = e;
                int n8 = ((Object)object3).length;
                n4 = 0;
                for (n7 = n6; n7 < n8; ++n7) {
                    n5 = n4;
                    if ((n3 & object3[n7]) != 0) {
                        object = n4 != 0 ? ", " : "\n[";
                        ((StringBuilder)object2).append((String)object);
                        ((StringBuilder)object2).append((CharSequence)listView[n7]);
                        n5 = 1;
                    }
                    n4 = n5;
                }
                if (n4 != 0) {
                    ((StringBuilder)object2).append(']');
                }
            }
            Tools.J1(((StringBuilder)object2).toString());
            return;
        }
        object = android.ext.f.b().setSingleChoiceItems(((ArrayList)object3).toArray(new CharSequence[((ArrayList)object3).size()]), n7, new DialogInterface.OnClickListener(this, (EditText)listView, bl, list, sparseIntArray){
            final EditText a;
            final boolean b;
            final List c;
            final SparseIntArray d;
            final RegionList e;
            {
                this.e = regionList;
                this.a = editText;
                this.b = bl;
                this.c = list;
                this.d = sparseIntArray;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void onClick(DialogInterface dialogInterface, int n3) {
                block3: {
                    Throwable throwable2;
                    block2: {
                        long l3;
                        EditText editText;
                        try {
                            editText = this.a;
                            l3 = this.b ? ((b)this.c.get((int)this.d.get((int)n3))).c - 1L : ((b)this.c.get((int)this.d.get((int)n3))).b;
                        }
                        catch (Throwable throwable2) {
                            break block2;
                        }
                        editText.setText(android.ext.c.G(l3, 4));
                        this.a.requestFocus();
                        break block3;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("RegionList failed with ");
                    stringBuilder.append(n3);
                    e1.g(stringBuilder.toString(), throwable2);
                }
                Tools.D(dialogInterface);
            }
        }).create();
        listView = object.getListView();
        if (listView != null) {
            Tools.C1(listView, 2131361799);
            FastScrollerFix.a(listView, true);
        }
        android.ext.f.m((AlertDialog)object);
    }

    public void onClick(View view) {
        int n3 = this instanceof RegionListFiltered ? Config.i : 0;
        this.j(view, n3);
    }

    public static class b {
        private static SparseIntArray f;
        private static int g = 0xFFFFFF;
        final int a;
        final long b;
        final long c;
        String d;
        String e;

        public b(int n3, long l3, long l4) {
            this.a = n3;
            this.b = l3;
            this.c = l4;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static int c(b b4) {
            Throwable throwable2;
            block3: {
                SparseIntArray sparseIntArray;
                block2: {
                    try {
                        SparseIntArray sparseIntArray2;
                        sparseIntArray = sparseIntArray2 = f;
                        if (sparseIntArray2 != null) break block2;
                        sparseIntArray = new SparseIntArray(8);
                        sparseIntArray.append(4, Tools.d0(2130837520));
                        sparseIntArray.append(1, Tools.d0(2130837518));
                        sparseIntArray.append(2, Tools.d0(2130837517));
                        sparseIntArray.append(16, Tools.d0(2130837521));
                        sparseIntArray.append(8, Tools.d0(2130837519));
                        f = sparseIntArray;
                        g = Tools.d0(2130837520);
                    }
                    catch (Throwable throwable2) {
                        break block3;
                    }
                }
                int n3 = b4 != null ? sparseIntArray.get(b4.d()) : 4;
                int n4 = n3;
                if (n3 != 4) return n4;
                return g;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed getPointerColor for: ");
            stringBuilder.append(b4);
            e1.l(stringBuilder.toString(), throwable2);
            return g;
        }

        private int d() {
            int n3 = this.a;
            if ((n3 & 0x600) == 1536) {
                return 1;
            }
            if ((n3 & 0x400) == 1024) {
                return 2;
            }
            if ((n3 & 0x200) == 512) {
                return 16;
            }
            if ((n3 & 0x100) == 256) {
                return 8;
            }
            return 4;
        }

        public String a() {
            CharSequence charSequence;
            if (this.e == null) {
                charSequence = this.d;
            } else {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(this.e);
                ((StringBuilder)charSequence).append(":bss");
                charSequence = ((StringBuilder)charSequence).toString();
            }
            return charSequence;
        }

        public String b() {
            return this.d;
        }

        public CharSequence e() {
            return e[this.a & 0xFF];
        }

        public String f() {
            int n3 = this.a;
            StringBuilder stringBuilder = new StringBuilder();
            String string2 = "-";
            String string3 = (n3 & 0x100) == 256 ? "r" : "-";
            stringBuilder.append(string3);
            string3 = (n3 & 0x200) == 512 ? "w" : "-";
            stringBuilder.append(string3);
            string3 = string2;
            if ((n3 & 0x400) == 1024) {
                string3 = "x";
            }
            stringBuilder.append(string3);
            string3 = (n3 & 0x800) == 2048 ? "s" : "p";
            stringBuilder.append(string3);
            return stringBuilder.toString();
        }

        public CharSequence g() {
            return Tools.t(this.toString(), f[this.a & 0xFF]);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((Object)e[this.a & 0xFF]);
            stringBuilder.append(": ");
            stringBuilder.append(android.ext.c.G(this.b, 4));
            stringBuilder.append('-');
            stringBuilder.append(android.ext.c.G(this.c, 4));
            stringBuilder.append(' ');
            stringBuilder.append(this.f());
            stringBuilder.append(" '");
            stringBuilder.append(this.d);
            stringBuilder.append('\'');
            return stringBuilder.toString();
        }
    }
}

