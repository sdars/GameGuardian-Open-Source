package android.ext;

/* JADX INFO: loaded from: classes.dex */
public abstract class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final java.util.LinkedList f1331a = new java.util.LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static int f1332b = 0;

    class a implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.y0.b f1333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.widget.EditText f1334b;

        a(android.ext.y0.b bVar, android.widget.EditText editText) {
            this.f1333a = bVar;
            this.f1334b = editText;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            java.lang.String string = this.f1333a.getItem(i).toString();
            int iMax = java.lang.Math.max(this.f1334b.getSelectionStart(), 0);
            int iMax2 = java.lang.Math.max(this.f1334b.getSelectionEnd(), 0);
            this.f1334b.getText().replace(java.lang.Math.min(iMax, iMax2), java.lang.Math.max(iMax, iMax2), string, 0, string.length());
            android.widget.EditText editText = this.f1334b;
            editText.setSelection(java.lang.Math.max(editText.getSelectionStart(), this.f1334b.getSelectionEnd()));
        }
    }

    static class b extends android.widget.BaseAdapter implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.view.View.OnFocusChangeListener {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static boolean f1335e = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final java.util.ArrayList f1337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final android.content.Context f1338c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        android.app.AlertDialog f1336a = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f1339d = false;

        class a implements android.text.TextWatcher {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.y0.b.e f1340a;

            a(android.ext.y0.b.e eVar) {
                this.f1340a = eVar;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
                android.ext.y0.b.e eVar = this.f1340a;
                android.ext.y0.b.d dVar = eVar.h;
                if (dVar == null) {
                    return;
                }
                android.ext.y0.b.this.c(dVar.f1347a, eVar.f1351c.getText().toString(), false);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            }
        }

        /* JADX INFO: renamed from: android.ext.y0$b$b, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0022b implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.y0.c f1342a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.EditText f1343b;

            DialogInterfaceOnClickListenerC0022b(android.ext.y0.c cVar, android.ext.EditText editText) {
                this.f1342a = cVar;
                this.f1343b = editText;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                android.ext.y0.b.this.c(this.f1342a, this.f1343b.getText().toString(), true);
            }
        }

        class c implements android.content.DialogInterface.OnShowListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.EditText f1345a;

            c(android.ext.EditText editText) {
                this.f1345a = editText;
            }

            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(android.content.DialogInterface dialogInterface) {
                android.ext.Tools.o1(this.f1345a);
                this.f1345a.requestFocus();
            }
        }

        static class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            android.ext.y0.c f1347a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            boolean f1348b;

            public d(android.ext.y0.c cVar, boolean z) {
                this.f1347a = cVar;
                this.f1348b = z;
            }

            public java.lang.String toString() {
                return this.f1347a.toString();
            }
        }

        static class e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public android.widget.TextView f1349a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public android.widget.TextView f1350b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public android.ext.EditText f1351c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public android.widget.ImageView f1352d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public android.widget.ImageView f1353e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public android.view.View f1354f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f1355g;
            android.ext.y0.b.d h;

            e() {
            }
        }

        public b(android.content.Context context, int i) {
            this.f1338c = context;
            android.ext.y0.d();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f1337b = arrayList;
            int i2 = android.ext.y0.f1332b;
            int i3 = 0;
            for (android.ext.y0.c cVar : android.ext.y0.f1331a) {
                if (cVar != null && (cVar.f1357b & i) != 0) {
                    arrayList.add(new android.ext.y0.b.d(cVar, i3 < i2));
                }
                i3++;
            }
        }

        private void a(android.ext.y0.c cVar, android.content.Context context) {
            android.ext.EditText editText = new android.ext.EditText(context);
            editText.setText(b(cVar.f1359d));
            android.app.AlertDialog alertDialogCreate = android.ext.f.c(context).setCustomTitle(android.ext.Tools.h0(cVar.f1356a)).setView(editText).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), new android.ext.y0.b.DialogInterfaceOnClickListenerC0022b(cVar, editText)).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cancel), (android.content.DialogInterface.OnClickListener) null).create();
            android.ext.f.l(alertDialogCreate, new android.ext.y0.b.c(editText));
            android.ext.f.n(alertDialogCreate, editText);
        }

        private java.lang.String b(java.lang.String str) {
            java.lang.String strTrim = str.trim();
            return "...".equals(strTrim) ? "" : strTrim;
        }

        private void d(android.view.View view, boolean z) {
            android.app.AlertDialog alertDialog;
            android.view.Window window;
            if (this.f1339d == z || (alertDialog = this.f1336a) == null || (window = alertDialog.getWindow()) == null) {
                return;
            }
            android.ext.Tools.L(window, view, z);
            this.f1339d = z;
        }

        private void e(android.ext.y0.b.e eVar) {
            int i;
            int i2;
            if (eVar.h.f1348b) {
                i = catch_.me_.if_.you_.can_.R.drawable.ic_pin_off_white_24dp;
                i2 = -2139864428;
            } else {
                i = catch_.me_.if_.you_.can_.R.drawable.ic_pin_white_24dp;
                i2 = 0;
            }
            f(eVar, i, i2);
        }

        private void f(android.ext.y0.b.e eVar, int i, int i2) {
            eVar.f1352d.setImageResource(i);
            eVar.f1354f.setBackgroundColor(i2);
        }

        void c(android.ext.y0.c cVar, java.lang.String str, boolean z) {
            android.ext.y0.c cVar2;
            java.util.Iterator it = android.ext.y0.f1331a.iterator();
            do {
                if (!it.hasNext()) {
                    cVar2 = cVar;
                    break;
                }
                cVar2 = (android.ext.y0.c) it.next();
            } while (!cVar.equals(cVar2));
            java.lang.String strTrim = str.trim();
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
            android.ext.y0.h();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f1337b.size();
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int i) {
            return this.f1337b.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
            if (view == null || !(view.getTag() instanceof android.ext.y0.b.e)) {
                view = android.view.LayoutInflater.from(this.f1338c).inflate(catch_.me_.if_.you_.can_.R.layout.history_item, viewGroup, false);
                android.ext.y0.b.e eVar = new android.ext.y0.b.e();
                eVar.f1349a = (android.widget.TextView) view.findViewById(catch_.me_.if_.you_.can_.R.id.value);
                eVar.f1350b = (android.widget.TextView) view.findViewById(catch_.me_.if_.you_.can_.R.id.note);
                android.ext.EditText editText = (android.ext.EditText) view.findViewById(catch_.me_.if_.you_.can_.R.id.note_edit);
                eVar.f1351c = editText;
                editText.addTextChangedListener(new android.ext.y0.b.a(eVar));
                android.ext.Tools.z1(eVar.f1351c, this);
                android.widget.ImageView imageViewM = android.ext.Config.m((android.widget.ImageView) view.findViewById(catch_.me_.if_.you_.can_.R.id.pin));
                eVar.f1352d = imageViewM;
                imageViewM.setOnClickListener(this);
                eVar.f1352d.setOnLongClickListener(this);
                eVar.f1352d.setTag(eVar);
                android.widget.ImageView imageViewM2 = android.ext.Config.m((android.widget.ImageView) view.findViewById(catch_.me_.if_.you_.can_.R.id.delete));
                eVar.f1353e = imageViewM2;
                imageViewM2.setOnClickListener(this);
                eVar.f1353e.setOnLongClickListener(this);
                eVar.f1353e.setTag(eVar);
                eVar.f1354f = view;
                view.setTag(eVar);
                view.setOnLongClickListener(this);
                view.setOnClickListener(this);
            }
            android.ext.y0.b.e eVar2 = (android.ext.y0.b.e) view.getTag();
            android.ext.y0.b.d dVar = (android.ext.y0.b.d) this.f1337b.get(i);
            eVar2.h = dVar;
            eVar2.f1349a.setText(dVar.f1347a.f1356a);
            java.lang.String str = dVar.f1347a.f1359d;
            eVar2.f1350b.setText(str);
            eVar2.f1351c.setText(b(str));
            eVar2.f1355g = i;
            eVar2.f1350b.setVisibility(!f1335e ? 0 : 8);
            int i2 = f1335e ? 0 : 8;
            eVar2.f1351c.setVisibility(i2);
            eVar2.f1353e.setVisibility(i2);
            ((android.view.ViewGroup) view).setDescendantFocusability(f1335e ? 131072 : 393216);
            e(eVar2);
            return view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            android.widget.AdapterView.OnItemClickListener onItemClickListener;
            if (view == null) {
                return;
            }
            int id = view.getId();
            int i = 0;
            if (id == catch_.me_.if_.you_.can_.R.id.custom_title) {
                boolean z = !f1335e;
                f1335e = z;
                if (!z) {
                    d(view, false);
                }
                notifyDataSetChanged();
                return;
            }
            android.ext.y0.b.e eVar = (android.ext.y0.b.e) view.getTag();
            if (eVar == null) {
                return;
            }
            int i2 = eVar.f1355g;
            if (id != catch_.me_.if_.you_.can_.R.id.delete) {
                if (id != catch_.me_.if_.you_.can_.R.id.pin) {
                    android.widget.AdapterView<?> adapterViewW0 = android.ext.Tools.w0(view);
                    if (adapterViewW0 == null || (onItemClickListener = adapterViewW0.getOnItemClickListener()) == null) {
                        return;
                    }
                    onItemClickListener.onItemClick(adapterViewW0, view, i2, getItemId(i2));
                    return;
                }
                android.ext.y0.b.d dVar = eVar.h;
                boolean z2 = !dVar.f1348b;
                dVar.f1348b = z2;
                e(eVar);
                android.ext.y0.c cVar = eVar.h.f1347a;
                android.ext.y0.a(cVar.f1356a, z2 ? (byte) 1 : (byte) 2, cVar.f1357b);
                return;
            }
            android.ext.y0.c cVar2 = eVar.h.f1347a;
            java.util.ListIterator listIterator = android.ext.y0.f1331a.listIterator();
            while (listIterator.hasNext()) {
                if (((android.ext.y0.c) listIterator.next()).equals(cVar2)) {
                    listIterator.remove();
                    int i3 = android.ext.y0.f1332b;
                    if (i < i3) {
                        android.ext.y0.f1332b = i3 - 1;
                    }
                    this.f1337b.remove(eVar.h);
                    notifyDataSetChanged();
                    android.ext.y0.h();
                    return;
                }
                i++;
            }
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(android.view.View view, boolean z) {
            boolean z2 = f1335e;
            if ((!z) && z2) {
                return;
            }
            d(view, z & z2);
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(android.view.View view) {
            android.ext.y0.b.e eVar;
            if (f1335e || view == null) {
                return false;
            }
            while (true) {
                if (view != null) {
                    java.lang.Object tag = view.getTag();
                    if (tag instanceof android.ext.y0.b.e) {
                        eVar = (android.ext.y0.b.e) tag;
                        break;
                    }
                    java.lang.Object parent = view.getParent();
                    if (parent instanceof android.view.View) {
                        view = (android.view.View) parent;
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
        final java.lang.String f1356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f1357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1358c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        java.lang.String f1359d;

        public c(java.lang.String str, int i, java.lang.String str2) {
            this.f1356a = str;
            this.f1357b = i;
            this.f1359d = str2;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof android.ext.y0.c) {
                android.ext.y0.c cVar = (android.ext.y0.c) obj;
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
                java.lang.String str = "#$@$#" + this.f1357b;
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    iHashCode = (iHashCode * 31) + str.charAt(i);
                }
                this.f1358c = iHashCode;
            }
            return iHashCode;
        }

        public java.lang.String toString() {
            return this.f1356a;
        }
    }

    public static void a(java.lang.String str, byte b2, int i) {
        if (str == null || str.length() == 0 || "0".equals(str) || "-1".equals(str) || "1".equals(str)) {
            return;
        }
        android.ext.y0.c cVar = new android.ext.y0.c(str, i, "...");
        java.util.ListIterator listIterator = f1331a.listIterator();
        int i2 = 0;
        while (listIterator.hasNext()) {
            android.ext.y0.c cVar2 = (android.ext.y0.c) listIterator.next();
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

    public static void b(java.lang.String str, int i) {
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
        android.content.SharedPreferences sharedPreferencesM0 = android.ext.Tools.M0();
        if (sharedPreferencesM0 == null) {
            return;
        }
        java.util.LinkedList linkedList = f1331a;
        int i = sharedPreferencesM0.getInt("history-size", 0);
        int i2 = i > android.ext.Config.x ? android.ext.Config.x : i;
        int iG = g(i2);
        boolean[] zArr = new boolean[iG];
        int i3 = iG - 1;
        for (int i4 = 0; i4 < i; i4++) {
            java.lang.String string = sharedPreferencesM0.getString("history-" + i4, null);
            if (string != null && string.length() != 0) {
                int i5 = sharedPreferencesM0.getInt("h-" + i4, 1);
                if (i5 == 0) {
                    i5 = 1;
                }
                android.ext.y0.c cVar = new android.ext.y0.c(string, i5, sharedPreferencesM0.getString("hi-" + i4, "..."));
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
        android.content.SharedPreferences sharedPreferencesM0 = android.ext.Tools.M0();
        if (sharedPreferencesM0 == null) {
            return;
        }
        android.ext.g2 g2Var = new android.ext.g2(sharedPreferencesM0.edit());
        int i = 0;
        for (android.ext.y0.c cVar : f1331a) {
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
        android.ext.y0.b bVar = new android.ext.y0.b(android.ext.Tools.k0(), editText instanceof android.ext.k0 ? ((android.ext.k0) editText).getDataType() : -1);
        if (bVar.getCount() == 0) {
            android.ext.Tools.H1(catch_.me_.if_.you_.can_.R.string.history_empty);
            return;
        }
        android.ext.y0.b.f1335e = false;
        android.view.View viewI0 = android.ext.Tools.i0(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.history), android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.click_edit));
        viewI0.setOnClickListener(bVar);
        android.app.AlertDialog alertDialogCreate = android.ext.f.c(android.ext.Tools.k0()).setCustomTitle(viewI0).setAdapter(bVar, new android.ext.y0.a(bVar, editText)).create();
        bVar.f1336a = alertDialogCreate;
        android.ext.f.m(alertDialogCreate);
    }

    private static void j() {
        java.util.LinkedList linkedList = f1331a;
        int i = android.ext.Config.x;
        if (linkedList.size() <= i) {
            return;
        }
        for (int size = linkedList.size() - i; size > 0; size--) {
            linkedList.removeLast();
        }
        d();
    }
}
