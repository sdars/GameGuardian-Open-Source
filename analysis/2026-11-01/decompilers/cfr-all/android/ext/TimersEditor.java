/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.SharedPreferences
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.CheckBox
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.TextView
 */
package android.ext;

import a.d;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.ext.FastScrollerFix;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.b2;
import android.ext.e1;
import android.ext.f;
import android.ext.g2;
import android.ext.z1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;

public class TimersEditor
implements DialogInterface.OnClickListener,
View.OnClickListener,
CompoundButton.OnCheckedChangeListener {
    private static final int[] j = new int[]{2131034127, 2131034295, 2131034420, 2131034352};
    private final boolean[] a;
    private final boolean[] b;
    private final boolean[] c;
    private final int d;
    private final String e;
    private final String f;
    private final boolean[] g;
    private final int h;
    private WeakReference i = new WeakReference<Object>(null);

    public TimersEditor(String string2, String charSequence, int n3, boolean[] blArray, int n4) {
        this.e = string2;
        this.f = charSequence;
        this.d = n3;
        this.g = blArray;
        this.h = n4;
        this.a = new boolean[n3];
        this.b = new boolean[4];
        this.c = new boolean[n3 * 12];
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(':');
        e1.d(((StringBuilder)charSequence).toString());
        this.b();
    }

    private View e() {
        Object object = this.c;
        for (int i3 = 0; i3 < this.d * 4; ++i3) {
            int n3 = i3 * 3;
            object[n3 + 2] = object[n3];
        }
        object = a.d.f(2131099693, null);
        ListView listView = (ListView)object;
        new FastScrollerFix(listView);
        listView.setItemsCanFocus(true);
        BaseAdapter baseAdapter = new BaseAdapter(this){
            final TimersEditor a;
            {
                this.a = timersEditor;
            }

            public int getCount() {
                return this.a.d + 1;
            }

            public Object getItem(int n3) {
                return n3;
            }

            public long getItemId(int n3) {
                return n3;
            }

            public View getView(int n3, View view, ViewGroup viewGroup) {
                view = n3 == 0 ? this.a.c(view, viewGroup) : this.a.d(n3, view, viewGroup);
                return view;
            }
        };
        listView.setAdapter((ListAdapter)baseAdapter);
        this.i = new WeakReference<a>(baseAdapter);
        return object;
    }

    private void g() {
        Object object = MainService.instance.v0;
        if (object == null) {
            return;
        }
        boolean[] blArray = this.c;
        g2 g22 = new g2();
        CharSequence charSequence = new StringBuilder();
        charSequence.append(this.f);
        charSequence.append('-');
        charSequence.append(((z1.d)object).c);
        charSequence.append('-');
        charSequence = charSequence.toString();
        object = this.g;
        for (int i3 = 0; i3 < this.d * 4; ++i3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)charSequence);
            stringBuilder.append(i3);
            g22.c(stringBuilder.toString(), blArray[i3 * 3], (boolean)object[i3]);
        }
        g22.commit();
    }

    private void j() {
        BaseAdapter baseAdapter = (BaseAdapter)this.i.get();
        if (baseAdapter != null) {
            baseAdapter.notifyDataSetChanged();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean[] b() {
        Object object = this.c;
        boolean[] blArray = new boolean[this.d * 4];
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = 0;
        while (true) {
            char c4;
            if (n3 >= this.d * 4) {
                object = new StringBuilder();
                ((StringBuilder)object).append(this.e);
                ((StringBuilder)object).append(" get:");
                ((StringBuilder)object).append(stringBuilder.toString());
                e1.d(((StringBuilder)object).toString());
                return blArray;
            }
            if (n3 % 4 == 0) {
                stringBuilder.append(' ');
                stringBuilder.append(n3 / 4 + 1);
                stringBuilder.append(':');
            }
            if (object[n3 * 3] != false) {
                blArray[n3] = true;
                c4 = '1';
            } else {
                c4 = '0';
            }
            stringBuilder.append(c4);
            ++n3;
        }
    }

    View c(View view, ViewGroup viewGroup) {
        View view2;
        block4: {
            block3: {
                if (view == null) break block3;
                view2 = view;
                if (view.getId() == 2131099691) break block4;
            }
            view2 = a.d.g(2131099691, viewGroup, false);
            view2.setId(2131099691);
            for (int i3 = 0; i3 < 4; ++i3) {
                view = (TextView)view2.findViewById(j[i3]);
                view.setTag((Object)i3);
                view.setOnClickListener((View.OnClickListener)this);
                view.setPaintFlags(view.getPaintFlags() | 8);
                view.setFocusable(true);
            }
        }
        return view2;
    }

    View d(int n3, View textView, ViewGroup object) {
        int n4;
        TextView textView2;
        int n5;
        int n6;
        d d4;
        block5: {
            block4: {
                d4 = a.d.c();
                n6 = n3 - 1;
                n5 = 0;
                if (textView == null) break block4;
                textView2 = textView;
                if (textView.getId() == 2131099692) break block5;
            }
            textView2 = d4.inflate(2131099692, (ViewGroup)object, false);
            textView2.setId(2131099692);
            textView = new View[5];
            for (n4 = 0; n4 < 4; ++n4) {
                object = (CheckBox)textView2.findViewById(j[n4]);
                object.setFocusable(true);
                object.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this);
                textView[n4] = object;
            }
            object = (TextView)textView2.findViewById(2131034337);
            object.setPaintFlags(object.getPaintFlags() | 8);
            object.setOnClickListener((View.OnClickListener)this);
            object.setFocusable(true);
            textView[4] = object;
            textView2.setTag((Object)textView);
        }
        textView = (TextView)textView2.getTag();
        for (n4 = n5; n4 < 4; ++n4) {
            d4 = (CheckBox)textView[n4];
            n5 = n6 * 4 + n4;
            d4.setTag(null);
            object = this.c;
            int n7 = n5 * 3;
            d4.setChecked((boolean)object[n7 + 2]);
            d4.setTag(n5);
            n5 = this.c[n7 + 1] ? -16755456 : -11206656;
            d4.setBackgroundColor(n5);
        }
        textView = (TextView)textView[4];
        textView.setTag((Object)n6);
        textView.setText((CharSequence)Integer.toString(n3));
        return textView2;
    }

    public void f() {
        Object object = MainService.instance.v0;
        if (object == null) {
            return;
        }
        boolean[] blArray = this.c;
        SharedPreferences sharedPreferences = Tools.M0();
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append(this.f);
        ((StringBuilder)object2).append('-');
        ((StringBuilder)object2).append(((z1.d)object).c);
        ((StringBuilder)object2).append('-');
        object = ((StringBuilder)object2).toString();
        object2 = this.g;
        for (int i3 = 0; i3 < this.d * 4; ++i3) {
            StringBuilder stringBuilder;
            int n3 = i3 * 3;
            try {
                stringBuilder = new StringBuilder();
                stringBuilder.append((String)object);
                stringBuilder.append(i3);
                blArray[n3] = sharedPreferences.getBoolean(stringBuilder.toString(), (boolean)object2[i3]);
                continue;
            }
            catch (Throwable throwable) {
                stringBuilder = new StringBuilder();
                stringBuilder.append((String)object);
                stringBuilder.append(i3);
                int n4 = sharedPreferences.getInt(stringBuilder.toString(), (int)object2[i3]);
                Object object3 = true;
                if (n4 != 0 && n4 != 1) {
                    object3 = object2[i3];
                } else if (n4 == 0) {
                    object3 = false;
                }
                blArray[n3] = object3;
            }
        }
        this.b();
    }

    public void h() {
        this.f();
        MainService.instance.i.J0(this.h);
        android.ext.f.m(android.ext.f.b().setView(Tools.O0(this.e())).setNeutralButton((CharSequence)b2.f(2131296898), (DialogInterface.OnClickListener)this).setNegativeButton((CharSequence)b2.f(2131296311), null).setPositiveButton((CharSequence)b2.f(2131296917), (DialogInterface.OnClickListener)this).create());
    }

    /*
     * Enabled aggressive block sorting
     */
    public void i(boolean[] object) {
        boolean[] blArray = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = 0;
        while (true) {
            if (n3 >= this.d * 4) {
                object = new StringBuilder();
                ((StringBuilder)object).append(this.e);
                ((StringBuilder)object).append(" usage:");
                ((StringBuilder)object).append(stringBuilder.toString());
                e1.d(((StringBuilder)object).toString());
                this.j();
                return;
            }
            if (n3 % 4 == 0) {
                stringBuilder.append(' ');
                stringBuilder.append(n3 / 4 + 1);
                stringBuilder.append(':');
            }
            Object object2 = object[n3];
            blArray[n3 * 3 + 1] = object2;
            char c4 = object2 != false ? (char)'1' : '0';
            stringBuilder.append(c4);
            ++n3;
        }
    }

    public void onCheckedChanged(CompoundButton object, boolean bl) {
        if (object == null) {
            return;
        }
        if ((object = object.getTag()) != null && object instanceof Integer) {
            int n3 = (Integer)object;
            this.c[n3 * 3 + 2] = bl;
        }
    }

    public void onClick(DialogInterface object, int n3) {
        int n4;
        object = this.c;
        int n5 = n4 = 0;
        if (n3 == -3) {
            boolean[] blArray = this.g;
            n3 = 0;
            while (true) {
                n5 = n4;
                if (n3 >= this.d * 4) break;
                object[n3 * 3 + 2] = (DialogInterface)blArray[n3];
                ++n3;
            }
        }
        while (n5 < this.d * 4) {
            n3 = n5 * 3;
            object[n3] = object[n3 + 2];
            ++n5;
        }
        this.g();
        MainService.instance.i.H0(this.h);
    }

    public void onClick(View object) {
        int n3;
        int n4 = object.getId();
        int n5 = 0;
        int n6 = (Integer)object.getTag();
        if (n4 != 2131034337) {
            object = this.b;
            object[n6] = (View)(object[n6] ^ 1);
            for (n3 = 0; n3 < this.d; ++n3) {
                this.c[(n3 * 4 + n6) * 3 + 2] = this.b[n6];
            }
        } else {
            object = this.a;
            object[n6] = (View)(object[n6] ^ 1);
            for (n3 = n5; n3 < 4; ++n3) {
                this.c[(n6 * 4 + n3) * 3 + 2] = this.a[n6];
            }
        }
        this.j();
    }
}

