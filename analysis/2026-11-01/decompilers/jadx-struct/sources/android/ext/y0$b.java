package android.ext;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface$OnClickListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.View$OnFocusChangeListener;
import android.view.View$OnLongClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$layout;
import catch_.me_.if_.you_.can_.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
class y0$b extends BaseAdapter implements View$OnClickListener, View$OnLongClickListener, View$OnFocusChangeListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static boolean f1335e = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList f1337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f1338c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    AlertDialog f1336a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1339d = false;

    public y0$b(Context context, int i) {
        this.f1338c = context;
        y0.d();
        ArrayList arrayList = new ArrayList();
        this.f1337b = arrayList;
        int i2 = y0.f1332b;
        int i3 = 0;
        for (y0$c y0_c : y0.f1331a) {
            if (y0_c != null && (y0_c.f1357b & i) != 0) {
                arrayList.add(new y0$b$d(y0_c, i3 < i2));
            }
            i3++;
        }
    }

    private void a(y0$c y0_c, Context context) {
        EditText editText = new EditText(context);
        editText.setText(b(y0_c.f1359d));
        AlertDialog alertDialogCreate = f.c(context).setCustomTitle(Tools.h0(y0_c.f1356a)).setView(editText).setPositiveButton(b2.f(R$string.ok), new y0$b$b(this, y0_c, editText)).setNegativeButton(b2.f(R$string.cancel), (DialogInterface$OnClickListener) null).create();
        f.l(alertDialogCreate, new y0$b$c(this, editText));
        f.n(alertDialogCreate, editText);
    }

    private String b(String str) {
        String strTrim = str.trim();
        return "...".equals(strTrim) ? "" : strTrim;
    }

    private void d(View view, boolean z) {
        AlertDialog alertDialog;
        Window window;
        if (this.f1339d == z || (alertDialog = this.f1336a) == null || (window = alertDialog.getWindow()) == null) {
            return;
        }
        Tools.L(window, view, z);
        this.f1339d = z;
    }

    private void e(y0$b$e y0_b_e) {
        int i;
        int i2;
        if (y0_b_e.h.f1348b) {
            i = R$drawable.ic_pin_off_white_24dp;
            i2 = -2139864428;
        } else {
            i = R$drawable.ic_pin_white_24dp;
            i2 = 0;
        }
        f(y0_b_e, i, i2);
    }

    private void f(y0$b$e y0_b_e, int i, int i2) {
        y0_b_e.f1352d.setImageResource(i);
        y0_b_e.f1354f.setBackgroundColor(i2);
    }

    void c(y0$c y0_c, String str, boolean z) {
        y0$c y0_c2;
        Iterator it = y0.f1331a.iterator();
        do {
            if (!it.hasNext()) {
                y0_c2 = y0_c;
                break;
            }
            y0_c2 = (y0$c) it.next();
        } while (!y0_c.equals(y0_c2));
        String strTrim = str.trim();
        if (strTrim.length() == 0) {
            strTrim = "...";
        }
        if (strTrim.equals(y0_c2.f1359d)) {
            return;
        }
        y0_c2.f1359d = strTrim;
        if (y0_c != y0_c2) {
            y0_c.f1359d = strTrim;
        }
        if (z) {
            notifyDataSetChanged();
        }
        y0.h();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f1337b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f1337b.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null || !(view.getTag() instanceof y0$b$e)) {
            view = LayoutInflater.from(this.f1338c).inflate(R$layout.history_item, viewGroup, false);
            y0$b$e y0_b_e = new y0$b$e();
            y0_b_e.f1349a = (TextView) view.findViewById(R$id.value);
            y0_b_e.f1350b = (TextView) view.findViewById(R$id.note);
            EditText editText = (EditText) view.findViewById(R$id.note_edit);
            y0_b_e.f1351c = editText;
            editText.addTextChangedListener(new y0$b$a(this, y0_b_e));
            Tools.z1(y0_b_e.f1351c, this);
            ImageView imageViewM = Config.m((ImageView) view.findViewById(R$id.pin));
            y0_b_e.f1352d = imageViewM;
            imageViewM.setOnClickListener(this);
            y0_b_e.f1352d.setOnLongClickListener(this);
            y0_b_e.f1352d.setTag(y0_b_e);
            ImageView imageViewM2 = Config.m((ImageView) view.findViewById(R$id.delete));
            y0_b_e.f1353e = imageViewM2;
            imageViewM2.setOnClickListener(this);
            y0_b_e.f1353e.setOnLongClickListener(this);
            y0_b_e.f1353e.setTag(y0_b_e);
            y0_b_e.f1354f = view;
            view.setTag(y0_b_e);
            view.setOnLongClickListener(this);
            view.setOnClickListener(this);
        }
        y0$b$e y0_b_e2 = (y0$b$e) view.getTag();
        y0$b$d y0_b_d = (y0$b$d) this.f1337b.get(i);
        y0_b_e2.h = y0_b_d;
        y0_b_e2.f1349a.setText(y0_b_d.f1347a.f1356a);
        String str = y0_b_d.f1347a.f1359d;
        y0_b_e2.f1350b.setText(str);
        y0_b_e2.f1351c.setText(b(str));
        y0_b_e2.f1355g = i;
        y0_b_e2.f1350b.setVisibility(!f1335e ? 0 : 8);
        int i2 = f1335e ? 0 : 8;
        y0_b_e2.f1351c.setVisibility(i2);
        y0_b_e2.f1353e.setVisibility(i2);
        ((ViewGroup) view).setDescendantFocusability(f1335e ? 131072 : 393216);
        e(y0_b_e2);
        return view;
    }

    @Override // android.view.View$OnClickListener
    public void onClick(View view) {
        AdapterView$OnItemClickListener onItemClickListener;
        if (view == null) {
            return;
        }
        int id = view.getId();
        int i = 0;
        if (id == 2131034221) {
            boolean z = !f1335e;
            f1335e = z;
            if (!z) {
                d(view, false);
            }
            notifyDataSetChanged();
            return;
        }
        y0$b$e y0_b_e = (y0$b$e) view.getTag();
        if (y0_b_e == null) {
            return;
        }
        int i2 = y0_b_e.f1355g;
        if (id != 2131034225) {
            if (id != 2131034355) {
                AdapterView<?> adapterViewW0 = Tools.w0(view);
                if (adapterViewW0 == null || (onItemClickListener = adapterViewW0.getOnItemClickListener()) == null) {
                    return;
                }
                onItemClickListener.onItemClick(adapterViewW0, view, i2, getItemId(i2));
                return;
            }
            y0$b$d y0_b_d = y0_b_e.h;
            boolean z2 = !y0_b_d.f1348b;
            y0_b_d.f1348b = z2;
            e(y0_b_e);
            y0$c y0_c = y0_b_e.h.f1347a;
            y0.a(y0_c.f1356a, z2 ? (byte) 1 : (byte) 2, y0_c.f1357b);
            return;
        }
        y0$c y0_c2 = y0_b_e.h.f1347a;
        ListIterator listIterator = y0.f1331a.listIterator();
        while (listIterator.hasNext()) {
            if (((y0$c) listIterator.next()).equals(y0_c2)) {
                listIterator.remove();
                int i3 = y0.f1332b;
                if (i < i3) {
                    y0.f1332b = i3 - 1;
                }
                this.f1337b.remove(y0_b_e.h);
                notifyDataSetChanged();
                y0.h();
                return;
            }
            i++;
        }
    }

    @Override // android.view.View$OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        boolean z2 = f1335e;
        if ((!z) && z2) {
            return;
        }
        d(view, z & z2);
    }

    @Override // android.view.View$OnLongClickListener
    public boolean onLongClick(View view) {
        y0$b$e y0_b_e;
        if (f1335e || view == null) {
            return false;
        }
        while (true) {
            if (view != null) {
                Object tag = view.getTag();
                if (tag instanceof y0$b$e) {
                    y0_b_e = (y0$b$e) tag;
                    break;
                }
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            y0_b_e = null;
            break;
        }
        if (y0_b_e == null) {
            return false;
        }
        a(y0_b_e.h.f1347a, view.getContext());
        return true;
    }
}
