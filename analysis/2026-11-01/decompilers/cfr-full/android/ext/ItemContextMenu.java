/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.content.DialogInterface;
import android.ext.AddressArrayAdapter;
import android.ext.ArrayAdapter;
import android.ext.Config;
import android.ext.MainService;
import android.ext.OffsetCalculator;
import android.ext.RegionList;
import android.ext.SavedListAdapter;
import android.ext.Tools;
import android.ext.b;
import android.ext.b2;
import android.ext.c;
import android.ext.e1;
import android.ext.f;
import android.ext.h;
import android.ext.h2;
import android.ext.m;
import android.ext.n;
import android.ext.w1;
import android.ext.z1;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class ItemContextMenu
implements AdapterView.OnItemLongClickListener {
    private static final ThreadLocal f = new ThreadLocal();
    private final int a;
    private final int[] b;
    private final String[] c;
    private final String[] d;
    private final String[] e;

    public ItemContextMenu(int n3) {
        int[] nArray;
        this.a = n3;
        int[] nArray2 = nArray = new int[8];
        nArray[0] = 0;
        nArray2[1] = 4;
        nArray2[2] = 16;
        nArray2[3] = 64;
        nArray2[4] = 2;
        nArray2[5] = 1;
        nArray2[6] = 32;
        nArray2[7] = 8;
        this.b = nArray;
        this.c = new String[nArray.length];
        this.d = new String[nArray.length];
        this.e = new String[nArray.length];
    }

    public static long b(long l3) {
        f.set(l3);
        return l3;
    }

    public boolean onItemLongClick(AdapterView object, View object2, int n3, long l3) {
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        long l4;
        CharSequence charSequence;
        int n4;
        object2 = object.getItemAtPosition(n3);
        if (!(object2 instanceof c)) {
            return false;
        }
        c c4 = (c)object2;
        object2 = new h2(c4);
        Object object7 = ((c)object2).F();
        l3 = ((c)object2).a;
        int n5 = ((c)object2).c;
        Object object8 = n5 & 0x7F;
        long l5 = ((c)object2).b;
        object2 = MainService.instance.v0;
        n3 = this.a == 3 ? 8 : android.ext.c.E(object8);
        long l6 = (3L & l3) - 0L;
        long l7 = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
        n3 = l7 == false && n3 >= 4 ? (object2 != null && ((z1.d)object2).n && n3 == 8 && (0xFFFFFFFF00000000L & l5) != 0L ? 2 : 1) : 0;
        n5 = (n5 & 0x2F) != 0 ? 1 : 0;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
        arrayList.add(object7);
        arrayList2.add(b2.f(2131296834));
        arrayList3.add(2130968592);
        arrayList.add(object7);
        arrayList2.add(b2.f(2131296647));
        arrayList3.add(2130968640);
        arrayList.add(object7);
        arrayList2.add(b2.f(2131296946));
        arrayList3.add(2130968646);
        if (object != MainService.instance.M) {
            arrayList.add(object7);
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(b2.f(2131296515));
            ((StringBuilder)object2).append(' ');
            ((StringBuilder)object2).append((String)object7);
            arrayList2.add(((StringBuilder)object2).toString());
            arrayList3.add(2130968618);
        }
        int n6 = 0;
        while (true) {
            n4 = 32;
            if (n6 >= n3) break;
            if (n6 == 0) {
                n4 = 4;
            }
            object2 = android.ext.c.M(l3, l5, n4);
            arrayList.add(object2);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(b2.f(2131296516));
            ((StringBuilder)charSequence).append(' ');
            ((StringBuilder)charSequence).append((String)object2);
            arrayList2.add(((StringBuilder)charSequence).toString());
            arrayList3.add(2130968618);
            l4 = l5 & 0xFFFFFFFFFFFFF000L;
            if (l4 != 0L && RegionList.b(l4) == null) {
                charSequence = android.ext.c.M(l3, l4, n4);
                arrayList.add(charSequence);
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(Tools.N1(2131296270));
                ((StringBuilder)object2).append(": ");
                ((StringBuilder)object2).append((String)charSequence);
                arrayList2.add(((StringBuilder)object2).toString());
                arrayList3.add(2130968597);
            }
            ++n6;
        }
        l4 = l3 & 0xFFFFFFFFFFFFF000L;
        if (l4 != 0L && RegionList.b(l4) == null) {
            charSequence = android.ext.c.G(l4, 4);
            arrayList.add(charSequence);
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(Tools.N1(2131296270));
            ((StringBuilder)object2).append(": ");
            ((StringBuilder)object2).append((String)charSequence);
            arrayList2.add(((StringBuilder)object2).toString());
            arrayList3.add(2130968597);
        }
        arrayList.add(object7);
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(b2.f(2131296339));
        ((StringBuilder)object2).append(' ');
        ((StringBuilder)object2).append((String)object7);
        arrayList2.add(((StringBuilder)object2).toString());
        arrayList3.add(2130968598);
        n3 = MainService.instance.H();
        n3 = n3 == 1 ? AddressArrayAdapter.d : (n3 == 3 ? MainService.instance.N.j : (n3 == 2 ? SavedListAdapter.c : 0));
        String string2 = "ARM (x64)";
        String string3 = "Thumb";
        if (n3 != 0) {
            object6 = null;
            charSequence = null;
            object2 = null;
            for (n6 = 0; n6 < 3; ++n6) {
                if (n6 == 0 && (l7 != false || (n3 & 0x10) == 0) || n6 == 1 && ((l3 & 1L) != 0L || (n3 & 0x20) == 0) || n6 == 2 && (l7 != false || (n3 & 0x40) == 0)) continue;
                object5 = f;
                ((ThreadLocal)object5).set(0L);
                if (n6 == 0) {
                    object6 = n.o(null, l3, l5);
                }
                if (n6 == 1) {
                    charSequence = n.q(null, l3, l5);
                }
                if (n6 == 2) {
                    object2 = m.g(m.d(), l3, (int)l5, new StringBuilder()).toString();
                }
                if ((l4 = ((Long)((ThreadLocal)object5).get()).longValue()) == 0L) continue;
                object5 = n6 == 0 ? "ARM (x32)" : null;
                if (n6 == 1) {
                    object5 = string3;
                }
                if (n6 == 2) {
                    object5 = string2;
                }
                object4 = new StringBuilder();
                ((StringBuilder)object4).append((String)object5);
                ((StringBuilder)object4).append(": ");
                object5 = ((StringBuilder)object4).toString();
                object4 = android.ext.c.G(l4, 4);
                arrayList.add(object4);
                object3 = new StringBuilder();
                ((StringBuilder)object3).append((String)object5);
                ((StringBuilder)object3).append(b2.f(2131296515));
                ((StringBuilder)object3).append(' ');
                ((StringBuilder)object3).append((String)object4);
                arrayList2.add(((StringBuilder)object3).toString());
                arrayList3.add(2130968618);
                arrayList.add(object4);
                object3 = new StringBuilder();
                ((StringBuilder)object3).append((String)object5);
                ((StringBuilder)object3).append(b2.f(2131296339));
                ((StringBuilder)object3).append(' ');
                ((StringBuilder)object3).append((String)object4);
                arrayList2.add(((StringBuilder)object3).toString());
                arrayList3.add(2130968598);
                if ((l4 &= 0xFFFFFFFFFFFFF000L) == 0L || RegionList.b(l4) != null) continue;
                object4 = android.ext.c.G(l4, 4);
                arrayList.add(object4);
                object3 = new StringBuilder();
                ((StringBuilder)object3).append((String)object5);
                ((StringBuilder)object3).append(Tools.N1(2131296270));
                ((StringBuilder)object3).append(": ");
                ((StringBuilder)object3).append((String)object4);
                arrayList2.add(((StringBuilder)object3).toString());
                arrayList3.add(2130968597);
            }
            object5 = string3;
            string3 = object6;
            object6 = object2;
            object2 = object5;
            object4 = object7;
        } else {
            string2 = "ARM (x64)";
            object2 = "Thumb";
            string3 = null;
            charSequence = null;
            object6 = null;
            object4 = object7;
        }
        object7 = this.b;
        String[] stringArray = this.c;
        String[] stringArray2 = this.d;
        object3 = this.e;
        n6 = 0;
        n3 = object8;
        block2: for (n4 = 0; n4 < ((Object)object7).length; ++n4) {
            object8 = object7[n4];
            if (object8 != 0 && (n3 & object8) == 0) continue;
            if (object8 == 0) {
                object8 = n3;
            }
            object5 = android.ext.c.K(l3, l5, object8);
            for (l7 = (long)0; l7 < n6; ++l7) {
                if (stringArray[l7].equals(object5)) continue block2;
            }
            stringArray[n6] = object5;
            if (n5 != 0) {
                l7 = object8 & 0xFFFFFFAF;
                object5 = l7 == false ? null : android.ext.c.M(l3, l5, object8);
                stringArray2[n6] = object5;
                object5 = l7 == false ? null : android.ext.c.P(l3, l5, object8);
                object3[n6] = object5;
            }
            ++n6;
        }
        if (n6 > 0) {
            for (n3 = 0; n3 < n6; ++n3) {
                arrayList.add(stringArray[n3]);
                object7 = new StringBuilder();
                ((StringBuilder)object7).append(b2.f(2131296348));
                ((StringBuilder)object7).append(' ');
                ((StringBuilder)object7).append(stringArray[n3]);
                arrayList2.add(((StringBuilder)object7).toString());
                arrayList3.add(2130968598);
                if (n5 == 0 || (object7 = stringArray2[n3]) == null) continue;
                arrayList.add(object7);
                object7 = new StringBuilder();
                ((StringBuilder)object7).append(b2.f(2131296344));
                ((StringBuilder)object7).append(' ');
                ((StringBuilder)object7).append(stringArray2[n3]);
                arrayList2.add(((StringBuilder)object7).toString());
                arrayList3.add(2130968598);
                arrayList.add(object3[n3]);
                object7 = new StringBuilder();
                ((StringBuilder)object7).append(b2.f(2131296347));
                ((StringBuilder)object7).append(' ');
                ((StringBuilder)object7).append((String)object3[n3]);
                arrayList2.add(((StringBuilder)object7).toString());
                arrayList3.add(2130968598);
            }
        }
        for (n3 = 0; n3 < 3; ++n3) {
            if (n3 == 0) {
                object5 = "ARM (x32)";
                object7 = string3;
            } else {
                object5 = null;
                object7 = null;
            }
            if (n3 == 1) {
                object7 = charSequence;
                object5 = object2;
            }
            if (n3 == 2) {
                object7 = object6;
                object5 = string2;
            }
            if (object7 == null) continue;
            object3 = ((String)object7).trim();
            object8 = ((String)object3).indexOf(59);
            object7 = object3;
            if (object8 != -1) {
                object7 = ((String)object3).substring(0, (int)object8).trim();
            }
            if (((String)object7).length() <= 0) continue;
            arrayList.add(object7);
            object3 = new StringBuilder();
            ((StringBuilder)object3).append(Tools.L1(b2.f(2131296346), object5));
            ((StringBuilder)object3).append(' ');
            ((StringBuilder)object3).append((String)object7);
            arrayList2.add(((StringBuilder)object3).toString());
            arrayList3.add(2130968598);
        }
        if (object == MainService.instance.L) {
            arrayList.add(object4);
            arrayList2.add(b2.f(2131296314));
            arrayList3.add(2130968601);
        }
        object = new ArrayAdapter(this, MainService.context, arrayList2, arrayList3){
            final List b;
            final ItemContextMenu c;
            {
                this.c = itemContextMenu;
                this.b = list2;
                super(context, list);
            }

            @Override
            public View getView(int n3, View view, ViewGroup viewGroup) {
                viewGroup = super.getView(n3, view, viewGroup);
                view = Tools.o0((Integer)this.b.get(n3));
                TextView textView = (TextView)viewGroup.findViewById(16908308);
                if (textView != null) {
                    Tools.D1(textView, 2131361796);
                    Tools.c(textView, (Drawable)view, Config.d());
                }
                return viewGroup;
            }
        };
        android.ext.f.o(android.ext.f.c(Tools.k0()).setAdapter((ListAdapter)object, new DialogInterface.OnClickListener(this, arrayList3, arrayList, c4){
            final List a;
            final ArrayList b;
            final c c;
            final ItemContextMenu d;
            {
                this.d = itemContextMenu;
                this.a = list;
                this.b = arrayList;
                this.c = c4;
            }

            private Long a() {
                Object object;
                object = this.d.a == 3 && (object = this.c) != null ? Long.valueOf(((c)object).a) : null;
                return object;
            }

            public void onClick(DialogInterface object, int n3) {
                if (n3 >= 0 && n3 < this.a.size()) {
                    switch ((Integer)this.a.get(n3)) {
                        default: {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Unknown icon in menu: ");
                            stringBuilder.append(Integer.toHexString((Integer)this.a.get(n3)));
                            e1.i(stringBuilder.toString());
                            break;
                        }
                        case 2130968646: {
                            MainService.instance.W.y((String)this.b.get(n3));
                            break;
                        }
                        case 2130968640: {
                            new w1().l((String)this.b.get(n3));
                            break;
                        }
                        case 2130968618: {
                            MainService mainService = MainService.instance;
                            Long l3 = this.a();
                            String string2 = (String)this.b.get(n3);
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(Tools.N1(2131296496));
                            stringBuilder.append(": (");
                            stringBuilder.append(this.c);
                            stringBuilder.append(')');
                            mainService.L(l3, string2, stringBuilder.toString());
                            break;
                        }
                        case 2130968601: {
                            android.ext.b.h((String)this.b.get(n3));
                            break;
                        }
                        case 2130968598: {
                            Tools.z((String)this.b.get(n3));
                            break;
                        }
                        case 2130968597: {
                            h.h((String)this.b.get(n3));
                            break;
                        }
                        case 2130968592: {
                            new OffsetCalculator(this.a()).j((String)this.b.get(n3));
                        }
                    }
                    if (object != null) {
                        Tools.D((DialogInterface)object);
                    }
                    return;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Unknown index in menu: ");
                ((StringBuilder)object).append(n3);
                ((StringBuilder)object).append(" for ");
                ((StringBuilder)object).append(this.a.size());
                e1.i(((StringBuilder)object).toString());
            }
        }).setNegativeButton((CharSequence)b2.f(2131296311), null));
        return true;
    }
}

