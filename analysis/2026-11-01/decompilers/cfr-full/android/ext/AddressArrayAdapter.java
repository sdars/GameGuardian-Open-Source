/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.d;
import android.ext.BaseAdapterIndexer;
import android.ext.Config;
import android.ext.MainService;
import android.ext.RegionList;
import android.ext.SavedListAdapter;
import android.ext.Tools;
import android.ext.b3;
import android.ext.c;
import android.ext.d;
import android.ext.d3;
import android.ext.e1;
import android.ext.g2;
import android.ext.n1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import d.a;
import java.util.ArrayList;
import java.util.List;

public class AddressArrayAdapter
extends BaseAdapterIndexer
implements d3.a {
    static volatile int d;
    private a a;
    private final d.a b = new d.a();
    private c c = new c();

    public AddressArrayAdapter(a a4) {
        this.a = a4;
        d = Tools.M0().getInt("search-results-format", 0);
    }

    private View a(ViewGroup viewGroup) {
        viewGroup = a.d.g(2131099672, viewGroup, false);
        new d3((View)viewGroup, this);
        return viewGroup;
    }

    static void b(int n3) {
        d = n3;
        new g2().g("search-results-format", n3, 0).commit();
    }

    public int getCount() {
        return this.a.i();
    }

    public Object getItem(int n3) {
        try {
            c c4 = this.a.f(n3, null);
            return c4;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            e1.s("Failed get item in memory list", indexOutOfBoundsException);
            return null;
        }
    }

    public long getItemId(int n3) {
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public View getView(int n3, View object, ViewGroup object2) {
        long l3;
        long l4;
        Object object3;
        Object object4;
        block12: {
            block11: {
                if (object == null) break block11;
                object4 = object;
                if (object.getTag() != null) break block12;
            }
            object4 = this.a((ViewGroup)object2);
        }
        int n4 = Config.q;
        int n5 = Tools.d1();
        int n6 = 1;
        boolean bl = false;
        if ((n4 & 1 << n5) == 0) {
            n6 = 0;
        }
        object = object3 = (d3)object4.getTag();
        if (((b3)object3).b()) {
            object4 = this.a((ViewGroup)object2);
            object = (d3)object4.getTag();
        }
        ((b3)object).m = n3;
        ((d3)object).q.setTag((Object)n3);
        ((d3)object).p.setTag((Object)n3);
        Object object5 = this.a;
        n4 = ((a)object5).i();
        object3 = null;
        boolean bl2 = bl;
        object2 = object3;
        if (n4 > n3) {
            try {
                object2 = ((a)object5).f(n3, this.c);
                bl2 = ((a)object5).c(n3);
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                bl2 = bl;
                object2 = object3;
            }
        }
        ((d3)object).o.setOrientation(n6 ^ 1);
        SavedListAdapter.p(((d3)object).q, n6 != 0);
        ((b3)object).a.setChecked(bl2);
        object3 = ((b3)object).a.getLayoutParams();
        n3 = n6 != 0 ? -2 : Tools.H();
        ((ViewGroup.LayoutParams)object3).height = n3;
        ((b3)object).a(bl2, -2);
        if (object2 != null) {
            n3 = ((c)object2).m();
            ((d3)object).n.setTextColor(n3);
            ((d3)object).p.setTextColor(n3);
            object5 = ((c)object2).H();
            d.a a4 = this.b;
            MainService.instance.u0.a(((c)object2).a, ((c)object2).c, a4);
            object3 = object5;
            if (a4.b) {
                object3 = new StringBuilder();
                ((StringBuilder)object3).append((String)object5);
                ((StringBuilder)object3).append(" (");
                ((StringBuilder)object3).append(android.ext.c.I(((c)object2).a, a4.a, ((c)object2).c));
                ((StringBuilder)object3).append(')');
                object3 = ((StringBuilder)object3).toString();
            }
            ((b3)object).b.setText((CharSequence)((c)object2).F());
            ((d3)object).n.setText((CharSequence)object3);
            ((d3)object).p.setText(((c)object2).z());
            ((b3)object).j.setText(RegionList.a(((c)object2).a));
            l4 = ((c)object2).a;
            l3 = ((c)object2).b;
            n4 = d;
            n6 = 1;
            n3 = ((c)object2).D();
        } else {
            ((b3)object).b.setText((CharSequence)"null");
            ((d3)object).n.setText((CharSequence)"null");
            ((d3)object).p.setText((CharSequence)"null");
            ((b3)object).j.setText((CharSequence)"null");
            l4 = 0L;
            l3 = 0L;
            n4 = 0;
            n6 = 0;
            n3 = 0;
        }
        n1.c((b3)object, l4, l3, n4, n6 != 0, n3);
        return object4;
    }

    public boolean hasStableIds() {
        return false;
    }

    public void onCheckedChanged(CompoundButton object, boolean bl) {
        if ((object = (b3)object.getTag()) == null) {
            return;
        }
        try {
            this.a.b(((b3)object).m, bl);
            MainService.instance.p1();
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            e1.l("ArrayAdapter onCheckedChanged failed", indexOutOfBoundsException);
        }
        ((b3)object).a(bl, -2);
    }

    public void onClick(View object) {
        if ((object = (Integer)object.getTag()) == null) {
            return;
        }
        try {
            c c4 = this.a.f((Integer)object, this.c);
            object = new ArrayList();
            ((ArrayList)object).add(c4);
            MainService.instance.i.j0((List)object);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            e1.l("ArrayAdapter onClick Failed", indexOutOfBoundsException);
        }
        MainService.instance.D0(false);
    }
}

