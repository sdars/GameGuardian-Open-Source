package android.ext;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class TimersEditor implements DialogInterface.OnClickListener, View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private static final int[] j = {R.id.app, R.id.java, R.id.system, R.id.other};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean[] f481a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean[] f483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f487g;
    private final int h;
    private WeakReference i = new WeakReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean[] f482b = new boolean[4];

    class a extends BaseAdapter {
        a() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return TimersEditor.this.f484d + 1;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return Integer.valueOf(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return i == 0 ? TimersEditor.this.c(view, viewGroup) : TimersEditor.this.d(i, view, viewGroup);
        }
    }

    public TimersEditor(String str, String str2, int i, boolean[] zArr, int i2) {
        this.f485e = str;
        this.f486f = str2;
        this.f484d = i;
        this.f487g = zArr;
        this.h = i2;
        this.f481a = new boolean[i];
        this.f483c = new boolean[i * 12];
        e1.d(str + ':');
        b();
    }

    private View e() {
        boolean[] zArr = this.f483c;
        for (int i = 0; i < this.f484d * 4; i++) {
            int i2 = i * 3;
            zArr[i2 + 2] = zArr[i2];
        }
        View viewF = a.d.f(R.layout.timer_table, null);
        ListView listView = (ListView) viewF;
        new FastScrollerFix(listView);
        listView.setItemsCanFocus(true);
        a aVar = new a();
        listView.setAdapter((ListAdapter) aVar);
        this.i = new WeakReference(aVar);
        return viewF;
    }

    private void g() {
        z1.d dVar = MainService.instance.v0;
        if (dVar == null) {
            return;
        }
        boolean[] zArr = this.f483c;
        g2 g2Var = new g2();
        String str = this.f486f + '-' + dVar.f1434c + '-';
        boolean[] zArr2 = this.f487g;
        for (int i = 0; i < this.f484d * 4; i++) {
            g2Var.c(str + i, zArr[i * 3], zArr2[i]);
        }
        g2Var.commit();
    }

    private void j() {
        BaseAdapter baseAdapter = (BaseAdapter) this.i.get();
        if (baseAdapter != null) {
            baseAdapter.notifyDataSetChanged();
        }
    }

    public boolean[] b() {
        char c2;
        boolean[] zArr = this.f483c;
        boolean[] zArr2 = new boolean[this.f484d * 4];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f484d * 4; i++) {
            if (i % 4 == 0) {
                sb.append(' ');
                sb.append((i / 4) + 1);
                sb.append(':');
            }
            if (zArr[i * 3]) {
                zArr2[i] = true;
                c2 = '1';
            } else {
                c2 = '0';
            }
            sb.append(c2);
        }
        e1.d(this.f485e + " get:" + sb.toString());
        return zArr2;
    }

    View c(View view, ViewGroup viewGroup) {
        if (view != null && view.getId() == R.layout.timer_header) {
            return view;
        }
        View viewG = a.d.g(R.layout.timer_header, viewGroup, false);
        viewG.setId(R.layout.timer_header);
        for (int i = 0; i < 4; i++) {
            TextView textView = (TextView) viewG.findViewById(j[i]);
            textView.setTag(Integer.valueOf(i));
            textView.setOnClickListener(this);
            textView.setPaintFlags(textView.getPaintFlags() | 8);
            textView.setFocusable(true);
        }
        return viewG;
    }

    View d(int i, View view, ViewGroup viewGroup) {
        a.d dVarC = a.d.c();
        int i2 = i - 1;
        if (view == null || view.getId() != R.layout.timer_row) {
            view = dVarC.inflate(R.layout.timer_row, viewGroup, false);
            view.setId(R.layout.timer_row);
            View[] viewArr = new View[5];
            for (int i3 = 0; i3 < 4; i3++) {
                CheckBox checkBox = (CheckBox) view.findViewById(j[i3]);
                checkBox.setFocusable(true);
                checkBox.setOnCheckedChangeListener(this);
                viewArr[i3] = checkBox;
            }
            TextView textView = (TextView) view.findViewById(R.id.name);
            textView.setPaintFlags(textView.getPaintFlags() | 8);
            textView.setOnClickListener(this);
            textView.setFocusable(true);
            viewArr[4] = textView;
            view.setTag(viewArr);
        }
        View[] viewArr2 = (View[]) view.getTag();
        for (int i4 = 0; i4 < 4; i4++) {
            CheckBox checkBox2 = (CheckBox) viewArr2[i4];
            int i5 = (i2 * 4) + i4;
            checkBox2.setTag(null);
            int i6 = i5 * 3;
            checkBox2.setChecked(this.f483c[i6 + 2]);
            checkBox2.setTag(Integer.valueOf(i5));
            checkBox2.setBackgroundColor(this.f483c[i6 + 1] ? -16755456 : -11206656);
        }
        TextView textView2 = (TextView) viewArr2[4];
        textView2.setTag(Integer.valueOf(i2));
        textView2.setText(Integer.toString(i));
        return view;
    }

    public void f() {
        z1.d dVar = MainService.instance.v0;
        if (dVar == null) {
            return;
        }
        boolean[] zArr = this.f483c;
        SharedPreferences sharedPreferencesM0 = Tools.M0();
        String str = this.f486f + '-' + dVar.f1434c + '-';
        boolean[] zArr2 = this.f487g;
        for (int i = 0; i < this.f484d * 4; i++) {
            int i2 = i * 3;
            try {
                zArr[i2] = sharedPreferencesM0.getBoolean(str + i, zArr2[i]);
            } catch (Throwable unused) {
                int i3 = sharedPreferencesM0.getInt(str + i, zArr2[i] ? 1 : 0);
                boolean z = true;
                if (i3 != 0 && i3 != 1) {
                    z = zArr2[i];
                } else if (i3 == 0) {
                    z = false;
                }
                zArr[i2] = z;
            }
        }
        b();
    }

    public void h() {
        f();
        MainService.instance.i.J0(this.h);
        f.m(f.b().setView(Tools.O0(e())).setNeutralButton(b2.f(R.string.reset_button), this).setNegativeButton(b2.f(R.string.cancel), (DialogInterface.OnClickListener) null).setPositiveButton(b2.f(R.string.save), this).create());
    }

    public void i(boolean[] zArr) {
        boolean[] zArr2 = this.f483c;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f484d * 4; i++) {
            if (i % 4 == 0) {
                sb.append(' ');
                sb.append((i / 4) + 1);
                sb.append(':');
            }
            boolean z = zArr[i];
            zArr2[(i * 3) + 1] = z;
            sb.append(z ? '1' : '0');
        }
        e1.d(this.f485e + " usage:" + sb.toString());
        j();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Object tag;
        if (compoundButton == null || (tag = compoundButton.getTag()) == null || !(tag instanceof Integer)) {
            return;
        }
        this.f483c[(((Integer) tag).intValue() * 3) + 2] = z;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        boolean[] zArr = this.f483c;
        if (i == -3) {
            boolean[] zArr2 = this.f487g;
            for (int i2 = 0; i2 < this.f484d * 4; i2++) {
                zArr[(i2 * 3) + 2] = zArr2[i2];
            }
        }
        for (int i3 = 0; i3 < this.f484d * 4; i3++) {
            int i4 = i3 * 3;
            zArr[i4] = zArr[i4 + 2];
        }
        g();
        MainService.instance.i.H0(this.h);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        int i = 0;
        int iIntValue = ((Integer) view.getTag()).intValue();
        if (id != R.id.name) {
            boolean[] zArr = this.f482b;
            zArr[iIntValue] = !zArr[iIntValue];
            while (i < this.f484d) {
                this.f483c[(((i * 4) + iIntValue) * 3) + 2] = this.f482b[iIntValue];
                i++;
            }
        } else {
            boolean[] zArr2 = this.f481a;
            zArr2[iIntValue] = !zArr2[iIntValue];
            while (i < 4) {
                this.f483c[(((iIntValue * 4) + i) * 3) + 2] = this.f481a[iIntValue];
                i++;
            }
        }
        j();
    }
}
