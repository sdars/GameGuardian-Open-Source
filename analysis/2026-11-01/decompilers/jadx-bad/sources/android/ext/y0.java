package android.ext;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final LinkedList f1331a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static int f1332b = 0;

    class a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f1333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.widget.EditText f1334b;

        a(b bVar, android.widget.EditText editText) {
            this.f1333a = bVar;
            this.f1334b = editText;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            String string = this.f1333a.getItem(i).toString();
            int iMax = Math.max(this.f1334b.getSelectionStart(), 0);
            int iMax2 = Math.max(this.f1334b.getSelectionEnd(), 0);
            this.f1334b.getText().replace(Math.min(iMax, iMax2), Math.max(iMax, iMax2), string, 0, string.length());
            android.widget.EditText editText = this.f1334b;
            editText.setSelection(Math.max(editText.getSelectionStart(), this.f1334b.getSelectionEnd()));
        }
    }

    static class b extends BaseAdapter implements View.OnClickListener, View.OnLongClickListener, View.OnFocusChangeListener {

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

        class a implements TextWatcher {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f1340a;

            a(e eVar) {
                this.f1340a = eVar;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                e eVar = this.f1340a;
                d dVar = eVar.h;
                if (dVar == null) {
                    return;
                }
                b.this.c(dVar.f1347a, eVar.f1351c.getText().toString(), false);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        }

        /* JADX INFO: renamed from: android.ext.y0$b$b, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0022b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f1342a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ EditText f1343b;

            DialogInterfaceOnClickListenerC0022b(c cVar, EditText editText) {
                this.f1342a = cVar;
                this.f1343b = editText;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                b.this.c(this.f1342a, this.f1343b.getText().toString(), true);
            }
        }

        class c implements DialogInterface.OnShowListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ EditText f1345a;

            c(EditText editText) {
                this.f1345a = editText;
            }

            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                Tools.o1(this.f1345a);
                this.f1345a.requestFocus();
            }
        }

        static class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            c f1347a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            boolean f1348b;

            public d(c cVar, boolean z) {
                this.f1347a = cVar;
                this.f1348b = z;
            }

            public String toString() {
                return this.f1347a.toString();
            }
        }

        static class e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public TextView f1349a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public TextView f1350b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public EditText f1351c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public ImageView f1352d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public ImageView f1353e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public View f1354f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f1355g;
            d h;

            e() {
            }
        }

        public b(Context context, int i) {
            this.f1338c = context;
            y0.d();
            ArrayList arrayList = new ArrayList();
            this.f1337b = arrayList;
            int i2 = y0.f1332b;
            int i3 = 0;
            for (c cVar : y0.f1331a) {
                if (cVar != null && (cVar.f1357b & i) != 0) {
                    arrayList.add(new d(cVar, i3 < i2));
                }
                i3++;
            }
        }

        private void a(c cVar, Context context) {
            EditText editText = new EditText(context);
            editText.setText(b(cVar.f1359d));
            AlertDialog alertDialogCreate = f.c(context).setCustomTitle(Tools.h0(cVar.f1356a)).setView(editText).setPositiveButton(b2.f(2131296836), new DialogInterfaceOnClickListenerC0022b(cVar, editText)).setNegativeButton(b2.f(2131296311), (DialogInterface.OnClickListener) null).create();
            f.l(alertDialogCreate, new c(editText));
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

        private void e(e eVar) {
            int i;
            int i2;
            if (eVar.h.f1348b) {
                i = 2130968635;
                i2 = -2139864428;
            } else {
                i = 2130968636;
                i2 = 0;
            }
            f(eVar, i, i2);
        }

        private void f(e eVar, int i, int i2) {
            eVar.f1352d.setImageResource(i);
            eVar.f1354f.setBackgroundColor(i2);
        }

        void c(c cVar, String str, boolean z) {
            c cVar2;
            Iterator it = y0.f1331a.iterator();
            do {
                if (!it.hasNext()) {
                    cVar2 = cVar;
                    break;
                }
                cVar2 = (c) it.next();
            } while (!cVar.equals(cVar2));
            String strTrim = str.trim();
            if (strTrim.length() == 0) {
                strTrim = "...";
            }
            if (strTrim.equals(cVar2.f1359d)) {
                return;
            }
            cVar2.f1359d = strTrim;
            if (cVar != cVar2) {
                cVar.f1359d = strTrim;
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
            if (view == null || !(view.getTag() instanceof e)) {
                view = LayoutInflater.from(this.f1338c).inflate(2131099652, viewGroup, false);
                e eVar = new e();
                eVar.f1349a = (TextView) view.findViewById(2131034438);
                eVar.f1350b = (TextView) view.findViewById(2131034342);
                EditText editText = (EditText) view.findViewById(2131034343);
                eVar.f1351c = editText;
                editText.addTextChangedListener(new a(eVar));
                Tools.z1(eVar.f1351c, this);
                ImageView imageViewM = Config.m((ImageView) view.findViewById(2131034355));
                eVar.f1352d = imageViewM;
                imageViewM.setOnClickListener(this);
                eVar.f1352d.setOnLongClickListener(this);
                eVar.f1352d.setTag(eVar);
                ImageView imageViewM2 = Config.m((ImageView) view.findViewById(2131034225));
                eVar.f1353e = imageViewM2;
                imageViewM2.setOnClickListener(this);
                eVar.f1353e.setOnLongClickListener(this);
                eVar.f1353e.setTag(eVar);
                eVar.f1354f = view;
                view.setTag(eVar);
                view.setOnLongClickListener(this);
                view.setOnClickListener(this);
            }
            e eVar2 = (e) view.getTag();
            d dVar = (d) this.f1337b.get(i);
            eVar2.h = dVar;
            eVar2.f1349a.setText(dVar.f1347a.f1356a);
            String str = dVar.f1347a.f1359d;
            eVar2.f1350b.setText(str);
            eVar2.f1351c.setText(b(str));
            eVar2.f1355g = i;
            eVar2.f1350b.setVisibility(!f1335e ? 0 : 8);
            int i2 = f1335e ? 0 : 8;
            eVar2.f1351c.setVisibility(i2);
            eVar2.f1353e.setVisibility(i2);
            ((ViewGroup) view).setDescendantFocusability(f1335e ? 131072 : 393216);
            e(eVar2);
            return view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AdapterView.OnItemClickListener onItemClickListener;
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
            e eVar = (e) view.getTag();
            if (eVar == null) {
                return;
            }
            int i2 = eVar.f1355g;
            if (id != 2131034225) {
                if (id != 2131034355) {
                    AdapterView<?> adapterViewW0 = Tools.w0(view);
                    if (adapterViewW0 == null || (onItemClickListener = adapterViewW0.getOnItemClickListener()) == null) {
                        return;
                    }
                    onItemClickListener.onItemClick(adapterViewW0, view, i2, getItemId(i2));
                    return;
                }
                d dVar = eVar.h;
                boolean z2 = !dVar.f1348b;
                dVar.f1348b = z2;
                e(eVar);
                c cVar = eVar.h.f1347a;
                y0.a(cVar.f1356a, z2 ? (byte) 1 : (byte) 2, cVar.f1357b);
                return;
            }
            c cVar2 = eVar.h.f1347a;
            ListIterator listIterator = y0.f1331a.listIterator();
            while (listIterator.hasNext()) {
                if (((c) listIterator.next()).equals(cVar2)) {
                    listIterator.remove();
                    int i3 = y0.f1332b;
                    if (i < i3) {
                        y0.f1332b = i3 - 1;
                    }
                    this.f1337b.remove(eVar.h);
                    notifyDataSetChanged();
                    y0.h();
                    return;
                }
                i++;
            }
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            boolean z2 = f1335e;
            if ((!z) && z2) {
                return;
            }
            d(view, z & z2);
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            e eVar;
            if (f1335e || view == null) {
                return false;
            }
            while (true) {
                if (view != null) {
                    Object tag = view.getTag();
                    if (tag instanceof e) {
                        eVar = (e) tag;
                        break;
                    }
                    Object parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    }
                }
                eVar = null;
                break;
            }
            if (eVar == null) {
                return false;
            }
            a(eVar.h.f1347a, view.getContext());
            return true;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f1356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f1357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1358c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f1359d;

        public c(String str, int i, String str2) {
            this.f1356a = str;
            this.f1357b = i;
            this.f1359d = str2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f1357b == cVar.f1357b && this.f1356a.equals(cVar.f1356a)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int iHashCode = this.f1358c;
            if (iHashCode == 0) {
                iHashCode = this.f1356a.hashCode();
                String str = "#$@$#" + this.f1357b;
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    iHashCode = (iHashCode * 31) + str.charAt(i);
                }
                this.f1358c = iHashCode;
            }
            return iHashCode;
        }

        public String toString() {
            return this.f1356a;
        }
    }

    public static void a(String str, byte b2, int i) {
        if (str == null || str.length() == 0 || "0".equals(str) || "-1".equals(str) || "1".equals(str)) {
            return;
        }
        c cVar = new c(str, i, "...");
        ListIterator listIterator = f1331a.listIterator();
        int i2 = 0;
        while (listIterator.hasNext()) {
            c cVar2 = (c) listIterator.next();
            if (cVar2.equals(cVar)) {
                cVar.f1359d = cVar2.f1359d;
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
            f1331a.addFirst(cVar);
            f1332b++;
        } else {
            d();
            f1331a.add(f1332b, cVar);
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
                c cVar = new c(string, i5, sharedPreferencesM0.getString("hi-" + i4, "..."));
                int iHashCode = cVar.hashCode() & i3;
                if (!zArr[iHashCode]) {
                    zArr[iHashCode] = true;
                } else if (linkedList.indexOf(cVar) != -1) {
                    continue;
                }
                linkedList.addLast(cVar);
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
        for (c cVar : f1331a) {
            g2Var.putString("history-" + i, cVar.f1356a);
            g2Var.g("h-" + i, cVar.f1357b, 1);
            g2Var.k("hi-" + i, cVar.f1359d, "...");
            i++;
        }
        g2Var.g("history-size", i, 0);
        g2Var.g("history-sticked", f1332b, 0);
        g2Var.commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(android.widget.EditText editText) {
        b bVar = new b(Tools.k0(), editText instanceof k0 ? ((k0) editText).getDataType() : -1);
        if (bVar.getCount() == 0) {
            Tools.H1(2131296681);
            return;
        }
        b.f1335e = false;
        View viewI0 = Tools.i0(b2.f(2131296680), b2.f(2131296328));
        viewI0.setOnClickListener(bVar);
        AlertDialog alertDialogCreate = f.c(Tools.k0()).setCustomTitle(viewI0).setAdapter(bVar, new a(bVar, editText)).create();
        bVar.f1336a = alertDialogCreate;
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
