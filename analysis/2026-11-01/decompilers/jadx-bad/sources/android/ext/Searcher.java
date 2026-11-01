package android.ext;

import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class Searcher implements DialogInterface.OnClickListener, TextWatcher, View.OnFocusChangeListener, CompoundButton.OnCheckedChangeListener, View.OnClickListener, Runnable {
    public static final int[] K = new int[5];
    public static volatile boolean L = false;
    private final Button A;
    private final Button B;
    private final View[] C;
    private final int[][] D;
    private final int E;
    private int F;
    private String G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SystemSpinner f448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TextView f449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final EditText f450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View f451g;
    private final View h;
    private final TextView i;
    private final View j;
    private final EditText k;
    private final TextView l;
    private final View m;
    private final EditText n;
    private final CheckBox o;
    private final View p;
    private final SystemSpinnerType q;
    private final View r;
    private final CheckBox s;
    private final CheckBox t;
    private final Button u;
    private final Button v;
    private final Button w;
    private final View x;
    final MemoryRange y;
    final EditText z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f445a = true;
    private boolean H = false;
    private char I = 0;
    private int J = 0;

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Searcher.this.L();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Searcher.this.L();
        }
    }

    public Searcher(int i, int i2) {
        this.F = i;
        this.E = i2;
        View viewF = a.d.f(2131099685, null);
        this.f446b = viewF;
        this.f447c = (TextView) viewF.findViewById(2131034328);
        SystemSpinner systemSpinner = (SystemSpinner) viewF.findViewById(2131034404);
        this.f448d = systemSpinner;
        systemSpinner.setOnItemSelectedListener(this);
        this.f449e = (TextView) viewF.findViewById(2131034432);
        EditText editText = (EditText) viewF.findViewById(2131034346);
        this.f450f = editText;
        editText.setDataType(1);
        View viewFindViewById = viewF.findViewById(2131034347);
        this.f451g = viewFindViewById;
        this.h = viewF.findViewById(2131034450);
        this.j = viewF.findViewById(2131034238);
        EditText editText2 = (EditText) viewF.findViewById(2131034237);
        this.k = editText2;
        this.l = (TextView) viewF.findViewById(2131034315);
        a aVar = new a();
        editText2.addTextChangedListener(aVar);
        this.m = viewF.findViewById(2131034349);
        this.n = (EditText) viewF.findViewById(2131034348);
        this.o = (CheckBox) viewF.findViewById(2131034280);
        this.p = viewF.findViewById(2131034433);
        SystemSpinnerType systemSpinnerType = (SystemSpinnerType) viewF.findViewById(2131034431);
        this.q = systemSpinnerType;
        viewFindViewById.setTag(new Object[]{editText, systemSpinnerType});
        systemSpinnerType.setOnItemSelectedListener(this);
        this.r = viewF.findViewById(2131034335);
        CheckBox checkBox = (CheckBox) viewF.findViewById(2131034334);
        this.s = checkBox;
        checkBox.setOnCheckedChangeListener(this);
        CheckBox checkBox2 = (CheckBox) viewF.findViewById(2131034351);
        this.t = checkBox2;
        checkBox2.setOnCheckedChangeListener(this);
        Button button = (Button) viewF.findViewById(2131034281);
        this.u = button;
        button.setOnClickListener(this);
        Button button2 = (Button) viewF.findViewById(2131034282);
        this.v = button2;
        button2.setOnClickListener(this);
        Button button3 = (Button) viewF.findViewById(2131034329);
        this.w = button3;
        button3.setTag(2);
        button3.setOnClickListener(this);
        this.x = viewF.findViewById(2131034273);
        EditText editText3 = (EditText) viewF.findViewById(2131034306);
        this.z = editText3;
        editText3.setDataType(1);
        MemoryRange memoryRange = (MemoryRange) viewF.findViewById(2131034321);
        this.y = memoryRange;
        memoryRange.c();
        this.A = (Button) viewF.findViewById(2131034248);
        this.B = (Button) viewF.findViewById(2131034143);
        for (View view : viewF.getFocusables(2)) {
            if (view instanceof EditText) {
                Tools.z1(view, this);
            }
        }
        this.y.setType(K[i]);
        this.y.setTypeChangeListener(this);
        this.C = new View[]{this.f448d, this.h, this.p, this.r, this.x, this.A, this.B, this.j, this.f449e, this.f451g, this.m};
        int[][] iArr = {new int[]{1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0}, new int[]{0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0}, new int[]{0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0}, new int[]{1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0}, new int[]{0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1}};
        this.D = iArr;
        if (i < 0 || i >= iArr.length) {
            throw new IllegalArgumentException("Type must be between: 0 and " + (iArr.length - 1) + " but got: " + i);
        }
        H(i);
        this.G = b2.f(2131296419);
        TextView textView = (TextView) this.f446b.findViewById(2131034438);
        this.i = textView;
        if (i == 2) {
            textView.setText(2131296379);
            ((TextView) this.f446b.findViewById(2131034274)).setText(b2.g("N - __new_value__; O - __old_value__; D - __difference__;"));
            Tools.r1(textView);
            textView.setOnClickListener(this);
            this.G = b2.f(2131296378);
            v(L);
        } else if (i == 0) {
            Tools.r1(textView);
            textView.setOnClickListener(this);
        } else if (i == 3) {
            Tools.r1(textView);
            textView.setOnClickListener(this);
            textView.setText(2131296264);
            this.G = b2.f(2131296767);
            this.f450f.addTextChangedListener(aVar);
            L();
        } else if (i == 4) {
            textView.setText(2131296264);
            TextView textView2 = (TextView) this.f446b.findViewById(2131034350);
            Tools.r1(textView2);
            textView2.setOnClickListener(this);
        }
        this.A.setOnClickListener(this);
        String strO1 = Tools.O1(textView.getText().toString());
        textView.setText(this.f448d.getVisibility() != 0 ? strO1 + ':' : strO1);
        n();
    }

    private void H(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.D[i];
            if (i2 >= iArr.length) {
                return;
            }
            this.C[i2].setVisibility(iArr[i2] == 1 ? 0 : 8);
            i2++;
        }
    }

    public static void I(String str) {
        f.o(f.b().setMessage(b2.f(2131296418) + ":\n" + str).setPositiveButton(b2.f(2131296519), ConfigListAdapter.h()).setNegativeButton(b2.f(2131296311), (DialogInterface.OnClickListener) null));
    }

    private void J(boolean z) {
        if (this.F == 0) {
            String string = this.f450f.getText().toString();
            boolean zM = t1.m(string);
            boolean z2 = true;
            boolean z3 = t1.C(string) != 0;
            boolean z4 = !zM && o();
            boolean zN = t1.n(string);
            boolean z5 = zM && zN;
            if ((this.t.getTag() != null) != z5) {
                this.t.setText(z5 ? "UTF-16LE" : b2.f(2131296841));
                CheckBox checkBox = this.t;
                checkBox.setTag(z5 ? checkBox : null);
            }
            if ((Config.B & 1) != 0) {
                boolean z6 = zN && this.f450f.isFocused();
                if (this.H != z6 && (!z6 || !z)) {
                    this.H = z6;
                    InternalKeyboard.i(this.f450f, z6);
                }
            }
            w(zM ? string.charAt(0) : (char) 0, this.q.getSelected());
            this.p.setVisibility((zM || z3) ? 8 : 0);
            this.f448d.setVisibility(zM ? 8 : 0);
            a.e eVarC = z4 ? c.C() : c.B();
            if (this.f448d.getTag() != eVarC) {
                this.f448d.setTag(eVarC);
                int i = i();
                if (eVarC.get(i) == null) {
                    i = 536870912;
                }
                this.f448d.setData(eVarC);
                D(i);
            }
            this.s.setVisibility((zM || z3 || z4) ? 8 : 0);
            this.t.setVisibility((z5 || z4) ? 0 : 8);
            this.w.setVisibility((zM || z4) ? 0 : 8);
            this.u.setVisibility(zM ? 0 : 8);
            this.v.setVisibility(8);
            if (zM || z4) {
                if (this.s.isChecked()) {
                    this.s.setChecked(false);
                }
                if (zM && i() != 536870912) {
                    D(536870912);
                }
                if (z4) {
                    String strTrim = string.trim();
                    boolean zContains = strTrim.contains("::");
                    int iJ = j();
                    if (iJ == 0) {
                        iJ = 4;
                    }
                    int iT = i2.t(strTrim, iJ, zContains);
                    this.t.setChecked(zContains);
                    this.w.setTag(Integer.valueOf(iT));
                    Button button = this.w;
                    StringBuilder sb = new StringBuilder();
                    sb.append(zContains ? "::" : ":");
                    sb.append(iT);
                    button.setText(sb.toString());
                    return;
                }
                char cL = t1.l(string);
                this.t.setChecked(cL == ':' || cL == '\'');
                char cCharAt = string.charAt(0);
                if (cCharAt != 'h' && cCharAt != 'H') {
                    z2 = false;
                }
                this.w.setText(z2 ? "HEX+U8" : "HEX");
                this.u.setText((z2 || cCharAt == ';') ? "HEX+U16" : "HEX+U8");
                if (z2 || cCharAt == 'Q' || cCharAt == 'q') {
                    this.v.setVisibility(0);
                }
                this.v.setText(z2 ? "HEX+U8+U16" : "HEX+U16");
            }
        }
    }

    private void K() {
        w(this.I, this.q.getSelected());
        J(false);
    }

    private static String d(String str) {
        char cCharAt = "?".charAt(0);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i) == cCharAt ? "0" : "F");
        }
        return sb.toString();
    }

    private void n() {
        w(this.I, this.E);
        this.f448d.setData(this.F == 3 ? c.C() : c.B());
        F(c.r(this.E, true), this.E);
        this.f450f.addTextChangedListener(this);
    }

    private boolean o() {
        if (this.F != 0) {
            return false;
        }
        String strTrim = this.f450f.getText().toString().trim();
        return strTrim.length() >= 1 && strTrim.charAt(0) != '=' && strTrim.indexOf(59) > 0;
    }

    public static long[] t(String str, long j) {
        long jR = t1.r(str.replace("?", "0"), 16);
        long jR2 = t1.r(d(str), 16) & j;
        return new long[]{jR & jR2, jR2};
    }

    private void v(boolean z) {
        L = z;
        this.A.setText(b2.f(z ? 2131296738 : 2131296786));
        this.h.setVisibility(z ? 0 : 8);
        this.p.setVisibility(z ? 0 : 8);
        this.f446b.findViewById(2131034274).setVisibility(z ? 0 : 8);
        ((TextView) this.f446b.findViewById(2131034245)).setText(z ? "N = O+D" : b2.f(2131296416));
        ((TextView) this.f446b.findViewById(2131034341)).setText(z ? "N ≠ O+D" : b2.f(2131296698));
        ((TextView) this.f446b.findViewById(2131034305)).setText(z ? "N > O+D" : b2.f(2131296735));
        ((TextView) this.f446b.findViewById(2131034408)).setText(z ? "N < O+D" : b2.f(2131296972));
    }

    private void w(char c2, int i) {
        String strS;
        if (this.J == i && this.I == c2) {
            return;
        }
        TextView textView = this.f449e;
        if (this.F != 0 || c2 == 0) {
            strS = c.s(i);
        } else {
            strS = Tools.N1(2131296418) + ": " + t1.d(this.f450f.getText().toString());
        }
        textView.setText(strS);
        this.I = c2;
        this.J = i;
    }

    public void A(String str) {
        this.n.setText(str.trim());
    }

    public void B(boolean z) {
        this.o.setChecked(z);
    }

    public void C(View.OnClickListener onClickListener) {
        this.B.setOnClickListener(onClickListener);
    }

    public void D(int i) {
        this.f448d.setSelected(i);
        if (!p() || i == 536870912) {
            return;
        }
        this.s.setChecked(false);
    }

    public void E(int i) {
        this.q.setSelected(i);
        K();
    }

    public void F(a.e eVar, int i) {
        if (this.F == 0) {
            String strF = b2.f(2131297005);
            eVar.put(-100, strF + " UTF-8");
            eVar.put(-200, strF + " UTF-16LE");
            eVar.put(-300, "HEX");
            eVar.put(-400, "HEX + UTF-8 + UTF-16LE");
            eVar.put(-500, "ARM (x32)");
            eVar.put(-600, "Thumb");
            eVar.put(-700, "ARM (x64)");
        }
        this.q.setData(eVar);
        E(i);
    }

    a.e G(int i) {
        a.e eVarR = c.r(i, true);
        int iE = MainService.E();
        if (iE == 0 || eVarR.get(iE) != null) {
            i = iE;
        }
        F(eVarR, i);
        return eVarR;
    }

    void L() {
        String upperCase;
        if (this.F == 3) {
            try {
                upperCase = Long.toHexString(s()[1]).toUpperCase(Locale.US);
            } catch (Throwable unused) {
                upperCase = "???";
            }
            this.l.setText(Tools.N1(2131296908) + ": " + upperCase);
        }
    }

    public long a() {
        return t1.r(c(), 16);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    public long b() {
        String strTrim = this.z.getText().toString().trim();
        if (strTrim.length() <= 0) {
            return 0L;
        }
        String strH = j2.h(strTrim);
        try {
            long jR = t1.r(strH, 10);
            y0.b(strH, 1);
            return jR;
        } catch (NumberFormatException e2) {
            this.z.requestFocus();
            throw e2;
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public String c() {
        String strTrim = this.k.getText().toString().trim();
        y0.b(strTrim, 1);
        return strTrim;
    }

    public long e(int i) {
        return this.y.a(i);
    }

    public String f() {
        if (this.F == 2 && !L) {
            return "0";
        }
        String strTrim = this.f450f.getText().toString().trim();
        y0.b(strTrim, 1);
        return strTrim;
    }

    public EditText g() {
        return this.f450f;
    }

    public String h() {
        String strTrim = this.n.getText().toString().trim();
        y0.b(strTrim, 1);
        return strTrim;
    }

    public int i() {
        return this.f448d.getSelected();
    }

    public int j() {
        if (this.F == 0) {
            String string = this.f450f.getText().toString();
            if (t1.m(string)) {
                return string.charAt(0) == ';' ? 2 : 1;
            }
            int iC = t1.C(string);
            if (iC != 0) {
                return iC;
            }
        }
        return this.q.getSelected();
    }

    public View k() {
        return this.f446b;
    }

    public View l() {
        return InternalKeyboard.d(m());
    }

    public View m() {
        return Tools.O0(k());
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int id = compoundButton.getId();
        if (id == 2131034334) {
            if (!z || i() == 536870912) {
                return;
            }
            D(536870912);
            return;
        }
        if (id != 2131034351) {
            return;
        }
        if (this.F == 0) {
            String string = this.f450f.getText().toString();
            if (t1.m(string)) {
                char cL = t1.l(string);
                if ((cL == ':' || cL == '\'') != z) {
                    if (cL != '\'' && cL != '\"') {
                        this.f450f.getText().replace(0, 1, String.valueOf(cL));
                        return;
                    }
                    char c2 = z ? '\'' : '\"';
                    String strValueOf = String.valueOf(cL);
                    Editable text = this.f450f.getText();
                    int length = string.length();
                    for (int i = 1; i < length; i++) {
                        if (string.charAt(i) == c2) {
                            text.replace(i, i + 1, strValueOf);
                        }
                    }
                    return;
                }
                return;
            }
        }
        if (o()) {
            String string2 = this.f450f.getText().toString();
            if (string2.contains("::") != z) {
                String str = z ? ":" : "::";
                int iIndexOf = string2.indexOf(str);
                int length2 = str.length() + iIndexOf;
                if (iIndexOf == -1) {
                    iIndexOf = string2.length();
                    length2 = iIndexOf;
                }
                this.f450f.getText().replace(iIndexOf, length2, z ? "::" : ":");
            }
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        String str;
        if (i <= -100) {
            int i2 = 4;
            if (i != -700) {
                if (i == -600) {
                    str = "~T ";
                } else if (i != -500) {
                    i2 = 1;
                    if (i == -400) {
                        str = "Q";
                    } else if (i == -300) {
                        str = "h";
                    } else if (i == -200) {
                        str = ";";
                    } else if (i != -100) {
                        str = null;
                        i2 = 0;
                    } else {
                        str = ":";
                    }
                } else {
                    str = "~A ";
                }
                i2 = 2;
            } else {
                str = "~A8 ";
            }
            if (str != null) {
                this.f450f.getText().insert(0, str);
                E(i2);
            }
        }
        K();
        if (!p() || i() == 536870912) {
            return;
        }
        this.s.setChecked(false);
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        InternalKeyboard internalKeyboard;
        if ((Config.B & 1) == 0 || (internalKeyboard = (InternalKeyboard) view.getRootView().findViewById(2131034303)) == null) {
            return;
        }
        if (this.F == 0 && t1.n(this.f450f.getText().toString())) {
            EditText editText = this.f450f;
            InternalKeyboard.i(editText, editText.isFocused());
        } else {
            internalKeyboard.setHideKeyboard(false);
            Tools.S0(view);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0008  */
    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        if (i == 0) {
            z = i2 == 1 && i3 == 0;
        }
        J(z);
    }

    public boolean p() {
        return this.s.isChecked();
    }

    public boolean q() {
        return this.o.isChecked();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x000f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    public void r() {
        EditText editText;
        int i = this.F;
        EditText editText2 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        editText2 = this.f450f;
                    } else if (this.f445a) {
                        editText = this.f450f;
                    } else {
                        editText = this.n;
                    }
                } else if (this.f445a) {
                    editText = this.f450f;
                } else {
                    editText = this.k;
                }
                editText2 = editText;
            } else if (L) {
                editText2 = this.f450f;
            }
        }
        if (editText2 == null) {
            onFocusChange(this.f446b, false);
        } else {
            editText2.requestFocus();
            Tools.o1(editText2);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        K[this.F] = this.y.getType();
    }

    public long[] s() {
        return t(f(), a());
    }

    public void u(boolean z) {
        this.f445a = z;
    }

    public void x(String str) {
        this.k.setText(str.trim());
    }

    public void y(CharSequence charSequence) {
        this.f447c.setText(charSequence);
    }

    public void z(String str) {
        this.f450f.setText(str.trim());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        if (view == null) {
        }
        int length = 1;
        switch (view.getId()) {
            case 2131034248:
                if (this.F == 2) {
                    v(!L);
                }
                if (this.f450f.getVisibility() == 0 && this.h.getVisibility() == 0) {
                    this.f450f.requestFocus();
                    break;
                }
                break;
            case 2131034281:
            case 2131034282:
            case 2131034329:
                if (o()) {
                    Object tag = view.getTag();
                    if (tag instanceof Integer) {
                        int iIntValue = ((Integer) tag).intValue();
                        String string = this.f450f.getText().toString();
                        String str2 = string.contains("::") ? "::" : ":";
                        int iIndexOf = string.indexOf(str2);
                        int length2 = string.length();
                        if (iIndexOf == -1) {
                            iIndexOf = length2;
                        }
                        this.f450f.getText().replace(iIndexOf, length2, str2 + iIntValue);
                    }
                } else {
                    Editable text = this.f450f.getText();
                    try {
                        if (text.length() > 0) {
                            int id = view.getId();
                            char cCharAt = text.charAt(0);
                            boolean z = cCharAt == 'h' || cCharAt == 'H';
                            if (id == 2131034329 && !z) {
                                t1.h(text);
                                str = "h";
                            } else if (id == 2131034281 && cCharAt == ':') {
                                str = "Q '" + text.toString().substring(1).replace("'", "' 27 '") + '\'';
                                length = text.length();
                            } else if (id == 2131034281 && cCharAt == ';') {
                                str = "Q \"" + text.toString().substring(1).replace("\"", "\" 22 \"") + '\"';
                                length = text.length();
                            } else if (!z) {
                                char c2 = id == 2131034281 ? '\"' : '\'';
                                int length3 = 1;
                                int i = 0;
                                while (length3 < text.length()) {
                                    if (text.charAt(length3) == c2) {
                                        if (i == 0) {
                                            i = length3 + 1;
                                        } else {
                                            byte[] bytes = text.toString().substring(i, length3).getBytes(t1.i(c2 == '\"'));
                                            String strTrim = InOut.b(bytes, 0, bytes.length).trim();
                                            int i2 = i - 1;
                                            int i3 = length3 + 1;
                                            text.replace(i2, i3, strTrim);
                                            length3 += strTrim.length() - (i3 - i2);
                                            i = 0;
                                        }
                                    }
                                    length3++;
                                }
                            } else {
                                byte[] bArrH = t1.h(text.toString());
                                x0.b(null, 0, bArrH, bArrH.length, id == 2131034329 || id == 2131034282, id == 2131034281 || id == 2131034282, text);
                                str = "Q";
                            }
                            text.replace(0, length, str);
                        }
                    } catch (Throwable th) {
                        e1.g("Failed convert '" + ((Object) text) + "'", th);
                        return;
                    }
                }
                break;
            case 2131034350:
                f.o(f.b().setMessage(b2.f(2131296835)).setNegativeButton(b2.f(2131296836), (DialogInterface.OnClickListener) null));
                break;
            case 2131034438:
                I(this.G);
                break;
        }
    }
}
