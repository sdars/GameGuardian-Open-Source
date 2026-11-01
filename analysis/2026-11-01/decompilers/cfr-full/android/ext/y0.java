/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.ext.Config;
import android.ext.EditText;
import android.ext.Tools;
import android.ext.b2;
import android.ext.f;
import android.ext.g2;
import android.ext.k0;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public abstract class y0 {
    static final LinkedList a = new LinkedList();
    static int b = 0;

    public static void a(String object, byte by, int n3) {
        if (!(object == null || ((String)object).length() == 0 || "0".equals(object) || "-1".equals(object) || "1".equals(object))) {
            byte by2;
            c c4 = new c((String)object, n3, "...");
            ListIterator listIterator = a.listIterator();
            n3 = 0;
            while (true) {
                by2 = by;
                if (!listIterator.hasNext()) break;
                object = (c)listIterator.next();
                if (((c)object).equals(c4)) {
                    c4.d = ((c)object).d;
                    listIterator.remove();
                    int n4 = b;
                    by2 = by;
                    if (n3 >= n4) break;
                    b = n4 - 1;
                    by2 = by;
                    if (by != 0) break;
                    by2 = 1;
                    break;
                }
                ++n3;
            }
            if (by2 != 0 && by2 == 1) {
                a.addFirst(c4);
                ++b;
            } else {
                y0.d();
                a.add(b, c4);
            }
            y0.j();
            y0.h();
        }
    }

    public static void b(String string2, int n3) {
        y0.a(string2, (byte)0, n3);
    }

    public static void c() {
        a.clear();
        y0.d();
    }

    static void d() {
        int n3 = b;
        if (n3 < 0) {
            b = 0;
            return;
        }
        int n4 = a.size();
        if (n3 > n4) {
            b = n4;
        }
    }

    public static void e() {
        y0.f();
    }

    private static void f() {
        SharedPreferences sharedPreferences = Tools.M0();
        if (sharedPreferences == null) {
            return;
        }
        LinkedList linkedList = a;
        int n3 = sharedPreferences.getInt("history-size", 0);
        int n4 = n3 > Config.x ? Config.x : n3;
        int n5 = y0.g(n4);
        boolean[] blArray = new boolean[n5];
        for (int i3 = 0; i3 < n3; ++i3) {
            int n6;
            Object object = new StringBuilder();
            ((StringBuilder)object).append("history-");
            ((StringBuilder)object).append(i3);
            object = sharedPreferences.getString(((StringBuilder)object).toString(), null);
            if (object == null || ((String)object).length() == 0) continue;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("h-");
            stringBuilder.append(i3);
            int n7 = n6 = sharedPreferences.getInt(stringBuilder.toString(), 1);
            if (n6 == 0) {
                n7 = 1;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("hi-");
            stringBuilder.append(i3);
            object = new c((String)object, n7, sharedPreferences.getString(stringBuilder.toString(), "..."));
            n7 = ((c)object).hashCode() & n5 - 1;
            if (blArray[n7]) {
                if (linkedList.indexOf(object) != -1) {
                    continue;
                }
            } else {
                blArray[n7] = true;
            }
            linkedList.addLast(object);
            if (linkedList.size() >= n4) break;
        }
        b = sharedPreferences.getInt("history-sticked", 0);
        y0.d();
        y0.j();
    }

    private static int g(int n3) {
        n3 |= n3 >> 1;
        n3 |= n3 >> 2;
        n3 |= n3 >> 4;
        n3 |= n3 >> 8;
        return (n3 | n3 >> 16) + 1;
    }

    static void h() {
        Object object = Tools.M0();
        if (object == null) {
            return;
        }
        object = new g2(object.edit());
        Iterator iterator = ((AbstractCollection)a).iterator();
        int n3 = 0;
        while (iterator.hasNext()) {
            c c4 = (c)iterator.next();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("history-");
            stringBuilder.append(n3);
            ((g2)object).j(stringBuilder.toString(), c4.a);
            stringBuilder = new StringBuilder();
            stringBuilder.append("h-");
            stringBuilder.append(n3);
            ((g2)object).g(stringBuilder.toString(), c4.b, 1);
            stringBuilder = new StringBuilder();
            stringBuilder.append("hi-");
            stringBuilder.append(n3);
            ((g2)object).k(stringBuilder.toString(), c4.d, "...");
            ++n3;
        }
        ((g2)object).g("history-size", n3, 0);
        ((g2)object).g("history-sticked", b, 0);
        ((g2)object).commit();
    }

    public static void i(android.widget.EditText editText) {
        Object object = Tools.k0();
        int n3 = editText instanceof k0 ? ((k0)editText).getDataType() : -1;
        if (((b)((Object)(object = new b((Context)object, n3)))).getCount() == 0) {
            Tools.H1(2131296681);
        } else {
            android.ext.y0$b.e = false;
            View view = Tools.i0(b2.f(2131296680), b2.f(2131296328));
            view.setOnClickListener((View.OnClickListener)object);
            editText = f.c(Tools.k0()).setCustomTitle(view).setAdapter((ListAdapter)object, new DialogInterface.OnClickListener((b)((Object)object), editText){
                final b a;
                final android.widget.EditText b;
                {
                    this.a = b4;
                    this.b = editText;
                }

                public void onClick(DialogInterface object, int n3) {
                    object = this.a.getItem(n3).toString();
                    n3 = Math.max(this.b.getSelectionStart(), 0);
                    int n4 = Math.max(this.b.getSelectionEnd(), 0);
                    this.b.getText().replace(Math.min(n3, n4), Math.max(n3, n4), (CharSequence)object, 0, ((String)object).length());
                    object = this.b;
                    object.setSelection(Math.max(object.getSelectionStart(), this.b.getSelectionEnd()));
                }
            }).create();
            ((b)((Object)object)).a = editText;
            f.m((AlertDialog)editText);
        }
    }

    private static void j() {
        LinkedList linkedList = a;
        int n3 = Config.x;
        if (linkedList.size() <= n3) {
            return;
        }
        for (n3 = linkedList.size() - n3; n3 > 0; --n3) {
            linkedList.removeLast();
        }
        y0.d();
    }

    static class b
    extends BaseAdapter
    implements View.OnClickListener,
    View.OnLongClickListener,
    View.OnFocusChangeListener {
        static boolean e = false;
        AlertDialog a = null;
        final ArrayList b;
        final Context c;
        private boolean d = false;

        public b(Context object, int n3) {
            ArrayList<d> arrayList;
            this.c = object;
            y0.d();
            this.b = arrayList = new ArrayList<d>();
            int n4 = b;
            object = ((AbstractCollection)a).iterator();
            int n5 = 0;
            while (object.hasNext()) {
                c c4 = (c)object.next();
                if (c4 != null && (c4.b & n3) != 0) {
                    boolean bl = n5 < n4;
                    arrayList.add(new d(c4, bl));
                }
                ++n5;
            }
        }

        private void a(c c4, Context context) {
            EditText editText = new EditText(context);
            editText.setText(this.b(c4.d));
            c4 = f.c(context).setCustomTitle(Tools.h0(c4.a)).setView((View)editText).setPositiveButton((CharSequence)b2.f(2131296836), new DialogInterface.OnClickListener(this, c4, editText){
                final c a;
                final EditText b;
                final b c;
                {
                    this.c = b4;
                    this.a = c4;
                    this.b = editText;
                }

                public void onClick(DialogInterface dialogInterface, int n3) {
                    this.c.c(this.a, this.b.getText().toString(), true);
                }
            }).setNegativeButton((CharSequence)b2.f(2131296311), null).create();
            f.l((AlertDialog)c4, new DialogInterface.OnShowListener(this, editText){
                final EditText a;
                final b b;
                {
                    this.b = b4;
                    this.a = editText;
                }

                public void onShow(DialogInterface dialogInterface) {
                    Tools.o1(this.a);
                    this.a.requestFocus();
                }
            });
            f.n((AlertDialog)c4, editText);
        }

        private String b(String string2) {
            String string3;
            string2 = string3 = string2.trim();
            if ("...".equals(string3)) {
                string2 = "";
            }
            return string2;
        }

        private void d(View view, boolean bl) {
            if (this.d == bl) {
                return;
            }
            AlertDialog alertDialog = this.a;
            if (alertDialog != null && (alertDialog = alertDialog.getWindow()) != null) {
                Tools.L((Window)alertDialog, view, bl);
                this.d = bl;
            }
        }

        /*
         * Enabled aggressive block sorting
         */
        private void e(e e4) {
            int n3;
            int n4;
            if (e4.h.b) {
                n4 = 2130968635;
                n3 = -2139864428;
            } else {
                n4 = 2130968636;
                n3 = 0;
            }
            this.f(e4, n4, n3);
        }

        private void f(e e4, int n3, int n4) {
            e4.d.setImageResource(n3);
            e4.f.setBackgroundColor(n4);
        }

        void c(c c4, String object, boolean bl) {
            c c5;
            Object object2;
            block5: {
                object2 = ((AbstractCollection)a).iterator();
                while (object2.hasNext()) {
                    c5 = (c)object2.next();
                    if (!c4.equals(c5)) continue;
                    break block5;
                }
                c5 = c4;
            }
            object = object2 = ((String)object).trim();
            if (((String)object2).length() == 0) {
                object = "...";
            }
            if (!((String)object).equals(c5.d)) {
                c5.d = object;
                if (c4 != c5) {
                    c4.d = object;
                }
                if (bl) {
                    this.notifyDataSetChanged();
                }
                y0.h();
            }
        }

        public int getCount() {
            return this.b.size();
        }

        public Object getItem(int n3) {
            return this.b.get(n3);
        }

        public long getItemId(int n3) {
            return n3;
        }

        public View getView(int n3, View object, ViewGroup object2) {
            View view;
            int n4;
            block3: {
                block2: {
                    n4 = 0;
                    if (object == null) break block2;
                    view = object;
                    if (object.getTag() instanceof e) break block3;
                }
                view = LayoutInflater.from((Context)this.c).inflate(2131099652, object2, false);
                object = new e();
                object.a = (TextView)view.findViewById(2131034438);
                object.b = (TextView)view.findViewById(2131034342);
                object2 = (EditText)view.findViewById(2131034343);
                object.c = object2;
                object2.addTextChangedListener(new TextWatcher(this, (e)object){
                    final e a;
                    final b b;
                    {
                        this.b = b4;
                        this.a = e4;
                    }

                    public void afterTextChanged(Editable object) {
                        object = this.a;
                        d d4 = object.h;
                        if (d4 == null) {
                            return;
                        }
                        this.b.c(d4.a, object.c.getText().toString(), false);
                    }

                    public void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n5) {
                    }

                    public void onTextChanged(CharSequence charSequence, int n3, int n4, int n5) {
                    }
                });
                Tools.z1((View)object.c, this);
                object2 = Config.m((ImageView)view.findViewById(2131034355));
                object.d = object2;
                object2.setOnClickListener((View.OnClickListener)this);
                object.d.setOnLongClickListener((View.OnLongClickListener)this);
                object.d.setTag(object);
                object2 = Config.m((ImageView)view.findViewById(2131034225));
                object.e = object2;
                object2.setOnClickListener((View.OnClickListener)this);
                object.e.setOnLongClickListener((View.OnLongClickListener)this);
                object.e.setTag(object);
                object.f = view;
                view.setTag(object);
                view.setOnLongClickListener((View.OnLongClickListener)this);
                view.setOnClickListener((View.OnClickListener)this);
            }
            object = (e)view.getTag();
            object2 = (d)this.b.get(n3);
            object.h = object2;
            object.a.setText((CharSequence)object2.a.a);
            object2 = object2.a.d;
            object.b.setText((CharSequence)object2);
            object.c.setText(this.b((String)object2));
            object.g = n3;
            object2 = object.b;
            n3 = !e ? 0 : 8;
            object2.setVisibility(n3);
            n3 = e ? n4 : 8;
            object.c.setVisibility(n3);
            object.e.setVisibility(n3);
            object2 = (ViewGroup)view;
            n3 = e ? 131072 : 393216;
            object2.setDescendantFocusability(n3);
            this.e((e)object);
            return view;
        }

        public void onClick(View object) {
            if (object == null) {
                return;
            }
            int n3 = object.getId();
            int n4 = 0;
            byte by = 1;
            if (n3 == 2131034221) {
                boolean bl;
                e = bl = e ^ true;
                if (!bl) {
                    this.d((View)object, false);
                }
                this.notifyDataSetChanged();
                return;
            }
            Object object2 = (e)object.getTag();
            if (object2 == null) {
                return;
            }
            int n5 = ((e)object2).g;
            if (n3 != 2131034225) {
                if (n3 != 2131034355) {
                    AdapterView.OnItemClickListener onItemClickListener;
                    object2 = Tools.w0(object);
                    if (object2 != null && (onItemClickListener = object2.getOnItemClickListener()) != null) {
                        onItemClickListener.onItemClick((AdapterView)object2, object, n5, this.getItemId(n5));
                    }
                } else {
                    boolean bl;
                    object = ((e)object2).h;
                    object.b = bl = object.b ^ true;
                    this.e((e)object2);
                    object2 = ((e)object2).h.a;
                    object = ((c)object2).a;
                    if (!bl) {
                        by = 2;
                    }
                    y0.a((String)object, by, ((c)object2).b);
                }
            } else {
                object = ((e)object2).h.a;
                ListIterator listIterator = a.listIterator();
                while (listIterator.hasNext()) {
                    if (((c)listIterator.next()).equals(object)) {
                        listIterator.remove();
                        n5 = b;
                        if (n4 < n5) {
                            b = n5 - 1;
                        }
                        this.b.remove(((e)object2).h);
                        this.notifyDataSetChanged();
                        y0.h();
                        break;
                    }
                    ++n4;
                }
            }
        }

        public void onFocusChange(View view, boolean bl) {
            boolean bl2 = e;
            if ((bl ^ true) & bl2) {
                return;
            }
            this.d(view, bl & bl2);
        }

        public boolean onLongClick(View object) {
            if (!e) {
                View view = object;
                if (object != null) {
                    block5: {
                        while (view != null) {
                            object = view.getTag();
                            if (object instanceof e) {
                                object = (e)object;
                                break block5;
                            }
                            object = view.getParent();
                            if (!(object instanceof View)) break;
                            view = object;
                        }
                        object = null;
                    }
                    if (object == null) {
                        return false;
                    }
                    this.a(object.h.a, view.getContext());
                    return true;
                }
            }
            return false;
        }

        static class d {
            c a;
            boolean b;

            public d(c c4, boolean bl) {
                this.a = c4;
                this.b = bl;
            }

            public String toString() {
                return this.a.toString();
            }
        }

        static class e {
            public TextView a;
            public TextView b;
            public EditText c;
            public ImageView d;
            public ImageView e;
            public View f;
            int g;
            d h;

            e() {
            }
        }
    }

    private static final class c {
        final String a;
        final int b;
        int c = 0;
        String d;

        public c(String string2, int n3, String string3) {
            this.a = string2;
            this.b = n3;
            this.d = string3;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public boolean equals(Object object) {
            if (!(object instanceof c)) return false;
            int n3 = this.b;
            object = (c)object;
            if (n3 != ((c)object).b) return false;
            if (!this.a.equals(((c)object).a)) return false;
            return true;
        }

        public int hashCode() {
            int n3;
            int n4 = n3 = this.c;
            if (n3 == 0) {
                n4 = this.a.hashCode();
                CharSequence charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("#$@$#");
                ((StringBuilder)charSequence).append(this.b);
                charSequence = ((StringBuilder)charSequence).toString();
                int n5 = ((String)charSequence).length();
                for (n3 = 0; n3 < n5; ++n3) {
                    n4 = n4 * 31 + ((String)charSequence).charAt(n3);
                }
                this.c = n4;
            }
            return n4;
        }

        public String toString() {
            return this.a;
        }
    }
}

