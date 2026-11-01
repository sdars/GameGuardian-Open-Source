/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.d;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.ext.BaseAdapterIndexer;
import android.ext.Config;
import android.ext.MainService;
import android.ext.RegionList;
import android.ext.Tools;
import android.ext.b2;
import android.ext.b3;
import android.ext.c;
import android.ext.d;
import android.ext.d3;
import android.ext.e1;
import android.ext.f;
import android.ext.f0;
import android.ext.g2;
import android.ext.h2;
import android.ext.n1;
import android.ext.w;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import d.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SavedListAdapter
extends BaseAdapterIndexer
implements ListAdapter,
d3.a {
    static volatile int c;
    private final e a;
    private final d.a b = new d.a();

    public SavedListAdapter() {
        this.a = new e();
        c = Tools.M0().getInt("saved-list-format", 0);
    }

    private View g(ViewGroup viewGroup) {
        viewGroup = d.g(2131099684, viewGroup, false);
        new b((View)viewGroup, this);
        return viewGroup;
    }

    static void o(int n3) {
        c = n3;
        new g2().g("saved-list-format", n3, 0).commit();
        SavedListAdapter.r();
        MainService.instance.t0.notifyDataSetChanged();
    }

    public static void p(ImageView imageView, boolean bl) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int n3 = bl ? 24 : 48;
        int n4 = Config.d();
        int n5 = n3;
        if (n4 > n3) {
            n5 = n4;
        }
        layoutParams.height = n3 = (int)Tools.G(n5);
        Config.p(imageView, n3, n3, n4);
    }

    private void q() {
        this.a.m();
        MainService.instance.i.b.r();
    }

    static void r() {
        TextView textView = MainService.instance.w;
        if (textView != null) {
            String string2 = c == 0 ? "   " : (Integer.bitCount(c) == 1 ? "  " : "");
            textView.setText(Tools.x("F: ", n1.B(c), string2));
        }
    }

    public void a(h2 h22) {
        this.b(h22, (byte)0, true);
    }

    public void b(h2 h22, byte by, boolean bl) {
        f0 f02 = MainService.instance.i;
        h2 h23 = h22;
        if ((h22.c & 0x40000000) == 0x40000000) {
            h23 = h22.Y();
        }
        if (h23.m) {
            h23.c &= 0xBFFFFFFF;
            f02.b(h23);
        } else {
            int n3 = h23.c;
            if ((n3 & 0x40000000) == 0x40000000) {
                h23.c = n3 & 0xBFFFFFFF;
            }
        }
        long l3 = h23.i();
        h22 = (h2)this.a.i(l3, h23, by);
        if (h22 != null && h22.m && !h23.m) {
            f02.c(h23);
        }
        if (bl) {
            this.notifyDataSetChanged();
        }
    }

    public void c() {
        MainService.instance.i.n();
        this.q();
        this.notifyDataSetChanged();
    }

    public h2 d(int n3) {
        return (h2)this.a.n(n3);
    }

    public h2 e(long l3) {
        h2 h22;
        h2 h23 = h22 = (h2)this.a.e(l3);
        if (h22 == null) {
            h23 = null;
        }
        return h23;
    }

    public e f() {
        return this.a;
    }

    public int getCount() {
        return this.a.l();
    }

    public long getItemId(int n3) {
        h2 h22 = (h2)this.a.n(n3);
        if (h22 == null) {
            return 0L;
        }
        return h22.i();
    }

    public View getView(int n3, View object, ViewGroup object2) {
        Object object3;
        View view = object;
        if (object == null) {
            view = this.g((ViewGroup)object2);
        }
        object = object3 = (b)view.getTag();
        if (((b3)object3).b()) {
            view = this.g((ViewGroup)object2);
            object = (b)view.getTag();
        }
        int n4 = Config.q;
        int n5 = Tools.d1();
        int n6 = 1;
        boolean bl = false;
        if ((n4 & 1 << n5 + 2) == 0) {
            n6 = 0;
        }
        if (n3 >= this.a.l()) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("null for ");
            ((StringBuilder)object2).append(n3);
            object2 = new h2(0L, 0L, 4, ((StringBuilder)object2).toString());
        } else {
            object2 = (h2)this.a.n(n3);
            bl = this.a.a(n3);
        }
        ((b3)object).m = n3;
        SavedListAdapter.p(((b)object).r, n6 != 0);
        object3 = ((b)object).s.getLayoutParams();
        n3 = n6 != 0 ? -2 : -1;
        ((ViewGroup.LayoutParams)object3).width = n3;
        ((d3)object).o.setOrientation(n6 ^ 1);
        SavedListAdapter.p(((d3)object).q, n6 != 0);
        object3 = ((b3)object).a.getLayoutParams();
        n3 = n6 != 0 ? -2 : Tools.H();
        ((ViewGroup.LayoutParams)object3).height = n3;
        ((b)object).r.setTag(object2);
        if (((b3)object).a.isChecked() != bl) {
            ((b3)object).a.setOnCheckedChangeListener(null);
            ((b3)object).a.setChecked(bl);
        }
        ((b3)object).a.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this);
        ((d3)object).p.setTag(object2);
        ((d3)object).q.setTag(object2);
        ((b3)object).a(bl, -2);
        n3 = ((c)object2).m();
        ((d3)object).n.setTextColor(n3);
        ((d3)object).p.setTextColor(n3);
        String string2 = ((c)object2).J();
        Object object4 = this.b;
        MainService.instance.u0.a(((c)object2).a, ((c)object2).c, (d.a)object4);
        object3 = string2;
        if (((d.a)object4).b) {
            object3 = new StringBuilder();
            ((StringBuilder)object3).append(string2);
            ((StringBuilder)object3).append(" (");
            ((StringBuilder)object3).append(android.ext.c.I(((c)object2).a, ((d.a)object4).a, ((c)object2).c));
            ((StringBuilder)object3).append(')');
            object3 = ((StringBuilder)object3).toString();
        }
        ((b)object).s.setText((CharSequence)((h2)object2).b0());
        ((d3)object).p.setText(((c)object2).z());
        ((b3)object).j.setText(RegionList.a(((c)object2).a));
        string2 = ((b3)object).b;
        object4 = new StringBuilder();
        ((StringBuilder)object4).append(((c)object2).F());
        ((StringBuilder)object4).append(": ");
        string2.setText((CharSequence)((StringBuilder)object4).toString());
        ((d3)object).n.setText((CharSequence)object3);
        ((b)object).r.setImageResource(((h2)object2).Z());
        n1.c((b3)object, ((c)object2).a, ((c)object2).b, c, true, ((c)object2).D());
        return view;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void h(w w3) {
        w3.j();
        Object object = MainService.instance.L;
        int n3 = object.getFirstVisiblePosition();
        int n4 = object.getLastVisiblePosition();
        object = this.a;
        boolean bl = false;
        while (true) {
            boolean bl2 = bl;
            try {
                if (w3.f() == 0) break;
                bl2 = bl;
                long l3 = w3.g();
                bl2 = bl;
                long l4 = w3.h();
                bl2 = bl;
                int n5 = ((e)object).g(l3);
                if (n5 < 0) continue;
                bl2 = bl;
                h2 h22 = (h2)((e)object).n(n5);
                if (h22 == null) continue;
                bl2 = bl;
                if (h22.b == l4) continue;
                boolean bl3 = bl;
                if (n3 <= n5) {
                    bl3 = bl;
                    if (n5 <= n4) {
                        bl3 = true;
                    }
                }
                bl2 = bl3;
                h22.b = l4;
                bl = bl3;
            }
            catch (IOException iOException) {
                e1.l("???", iOException);
                bl = bl2;
                break;
            }
        }
        if (bl) {
            this.notifyDataSetChanged();
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void i() {
        f0 f02 = MainService.instance.i;
        f02.B();
        Object object = this.a;
        if (((e)object).l() == 0) {
            return;
        }
        try {
            Object object2;
            int n3;
            int n4;
            ArrayList<h2> arrayList = new ArrayList<h2>(((e)object).l());
            int n5 = 0;
            for (n4 = 0; n4 < (n3 = ((e)object).l()); ++n4) {
                try {
                    object2 = (h2)((e)object).n(n4);
                    if (object2 == null) continue;
                    arrayList.add((h2)object2);
                    continue;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    e1.s("list changed", indexOutOfBoundsException);
                }
            }
            if (arrayList.size() == 0) {
                return;
            }
            n3 = arrayList.size();
            object2 = new int[n3];
            long[] lArray = new long[n3];
            for (n4 = n5; n4 < n3; ++n4) {
                object = (c)arrayList.get(n4);
                object2[n4] = ((c)object).c;
                lArray[n4] = ((c)object).a;
            }
            f02.S((int[])object2, lArray);
            return;
        }
        catch (OutOfMemoryError outOfMemoryError) {}
        e1.s("OOM in reloadData", outOfMemoryError);
    }

    public void j(int n3) {
        h2 h22 = (h2)this.a.j(n3);
        if (h22 != null) {
            if (h22.m) {
                f0 f02 = MainService.instance.i;
                f02.c(h22);
                f02.B();
            }
            if (this.a.l() == 0) {
                this.q();
            }
            this.notifyDataSetChanged();
        }
    }

    public void k(h2 h22) {
        this.n(h22.i());
    }

    public void l(List object) {
        e e4 = this.a;
        f0 f02 = MainService.instance.i;
        object = object.iterator();
        while (object.hasNext()) {
            h2 h22 = (h2)object.next();
            if (h22 == null || (h22 = (h2)e4.c(h22.i())) == null || !h22.m) continue;
            f02.c(h22);
        }
        f02.B();
        if (e4.l() == 0) {
            this.q();
        }
        this.notifyDataSetChanged();
    }

    public void m(long[] lArray, int n3) {
        e e4 = this.a;
        f0 f02 = MainService.instance.i;
        for (int i3 = 0; i3 < n3; ++i3) {
            h2 h22 = (h2)e4.c(lArray[i3]);
            if (h22 == null || !h22.m) continue;
            f02.c(h22);
        }
        f02.B();
        if (e4.l() == 0) {
            this.q();
        }
        this.notifyDataSetChanged();
    }

    public void n(long l3) {
        int n3 = this.a.g(l3);
        if (n3 >= 0) {
            this.j(n3);
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
        b3 b32 = (b3)compoundButton.getTag();
        if (b32 == null) {
            return;
        }
        try {
            this.a.k(b32.m, bl);
            MainService.instance.p1();
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            e1.l("ArrayAdapter onCheckedChanged failed", indexOutOfBoundsException);
        }
        b32.a(bl, -2);
    }

    public void onClick(View object) {
        int n3 = object.getId();
        if (n3 != 2131034119) {
            if (n3 != 2131034123) {
                if (n3 == 2131034265) {
                    h2 h22 = ((h2)object.getTag()).Y();
                    h22.m ^= true;
                    this.a(h22);
                    if (object instanceof ImageButton) {
                        ((ImageButton)object).setImageResource(h22.Z());
                    }
                    MainService.instance.i.B();
                }
            } else if ((object = (b3)object.getTag()) != null) {
                Tools.s((View)object.a);
            }
        } else {
            h2 h23 = (h2)object.getTag();
            if (h23 == null) {
                return;
            }
            try {
                AlertDialog.Builder builder = f.b().setCustomTitle(Tools.h0(h23.b0())).setMessage((CharSequence)b2.f(2131296374));
                object = b2.f(2131297115);
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this, h23){
                    final h2 a;
                    final SavedListAdapter b;
                    {
                        this.b = savedListAdapter;
                        this.a = h22;
                    }

                    public void onClick(DialogInterface dialogInterface, int n3) {
                        this.b.k(this.a);
                    }
                };
                f.o(builder.setPositiveButton((CharSequence)object, onClickListener).setNegativeButton((CharSequence)b2.f(2131296805), null));
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                e1.l("SavedListAdapter onClick Failed", indexOutOfBoundsException);
            }
        }
    }

    static class b
    extends d3 {
        final ImageView r;
        final TextView s;

        b(View view, d3.a a4) {
            super(view, a4);
            ImageView imageView;
            this.r = imageView = Config.m((ImageView)view.findViewById(2131034265));
            imageView.setOnClickListener((View.OnClickListener)a4);
            imageView.setOnLongClickListener((View.OnLongClickListener)a4);
            this.s = (TextView)view.findViewById(2131034337);
        }
    }
}

