/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.d;
import a.e;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.ext.Config;
import android.ext.ConfigListAdapter;
import android.ext.EditText;
import android.ext.InOut;
import android.ext.InternalKeyboard;
import android.ext.MainService;
import android.ext.MemoryRange;
import android.ext.SystemSpinner;
import android.ext.SystemSpinnerType;
import android.ext.Tools;
import android.ext.b2;
import android.ext.c;
import android.ext.e1;
import android.ext.f;
import android.ext.i2;
import android.ext.j2;
import android.ext.t1;
import android.ext.x0;
import android.ext.y0;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.Locale;

public class Searcher
implements DialogInterface.OnClickListener,
TextWatcher,
View.OnFocusChangeListener,
CompoundButton.OnCheckedChangeListener,
View.OnClickListener,
Runnable {
    public static final int[] K = new int[5];
    public static volatile boolean L = false;
    private final Button A;
    private final Button B;
    private final View[] C;
    private final int[][] D;
    private final int E;
    private int F;
    private String G;
    private boolean H = false;
    private char I = '\u0000';
    private int J = 0;
    public volatile boolean a = true;
    private final View b;
    private final TextView c;
    private final SystemSpinner d;
    private final TextView e;
    private final EditText f;
    private final View g;
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

    public Searcher(int n3, int n4) {
        EditText editText;
        Object object;
        this.F = n3;
        this.E = n4;
        this.b = object = a.d.f(2131099685, null);
        this.c = (TextView)object.findViewById(2131034328);
        Object object2 = (SystemSpinner)object.findViewById(2131034404);
        this.d = object2;
        ((SystemSpinner)((Object)object2)).setOnItemSelectedListener(this);
        this.e = (TextView)object.findViewById(2131034432);
        this.f = editText = (EditText)object.findViewById(2131034346);
        editText.setDataType(1);
        Object object32 = object.findViewById(2131034347);
        this.g = object32;
        this.h = object.findViewById(2131034450);
        this.j = object.findViewById(2131034238);
        Object object4 = (EditText)object.findViewById(2131034237);
        this.k = object4;
        this.l = (TextView)object.findViewById(2131034315);
        object2 = new TextWatcher(this){
            final Searcher a;
            {
                this.a = searcher;
            }

            public void afterTextChanged(Editable editable) {
                this.a.L();
            }

            public void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n5) {
            }

            public void onTextChanged(CharSequence charSequence, int n3, int n4, int n5) {
                this.a.L();
            }
        };
        object4.addTextChangedListener((TextWatcher)object2);
        this.m = object.findViewById(2131034349);
        this.n = (EditText)object.findViewById(2131034348);
        this.o = (CheckBox)object.findViewById(2131034280);
        this.p = object.findViewById(2131034433);
        object4 = (SystemSpinnerType)object.findViewById(2131034431);
        this.q = object4;
        object32.setTag((Object)new Object[]{editText, object4});
        ((SystemSpinner)((Object)object4)).setOnItemSelectedListener(this);
        this.r = object.findViewById(2131034335);
        object32 = (CheckBox)object.findViewById(2131034334);
        this.s = object32;
        object32.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this);
        object32 = (CheckBox)object.findViewById(2131034351);
        this.t = object32;
        object32.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this);
        object32 = (Button)object.findViewById(2131034281);
        this.u = object32;
        object32.setOnClickListener((View.OnClickListener)this);
        object32 = (Button)object.findViewById(2131034282);
        this.v = object32;
        object32.setOnClickListener((View.OnClickListener)this);
        object32 = (Button)object.findViewById(2131034329);
        this.w = object32;
        object32.setTag((Object)2);
        object32.setOnClickListener((View.OnClickListener)this);
        this.x = object.findViewById(2131034273);
        object32 = (EditText)object.findViewById(2131034306);
        this.z = object32;
        ((EditText)object32).setDataType(1);
        object32 = (MemoryRange)object.findViewById(2131034321);
        this.y = object32;
        ((MemoryRange)((Object)object32)).c();
        this.A = (Button)object.findViewById(2131034248);
        this.B = (Button)object.findViewById(2131034143);
        for (Object object32 : object.getFocusables(2)) {
            if (!(object32 instanceof EditText)) continue;
            Tools.z1((View)object32, this);
        }
        this.y.setType(K[n3]);
        this.y.setTypeChangeListener(this);
        this.C = new View[]{this.d, this.h, this.p, this.r, this.x, this.A, this.B, this.j, this.e, this.g, this.m};
        object = new int[5][];
        object[0] = (View)new int[]{1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0};
        object[1] = (View)new int[]{0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0};
        object[2] = (View)new int[]{0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0};
        object[3] = (View)new int[]{1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0};
        object[4] = (View)new int[]{0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1};
        this.D = (int[][])object;
        if (n3 >= 0 && n3 < ((View)object).length) {
            this.H(n3);
            this.G = b2.f(2131296419);
            object = (TextView)this.b.findViewById(2131034438);
            this.i = object;
            if (n3 == 2) {
                object.setText(2131296379);
                ((TextView)this.b.findViewById(2131034274)).setText((CharSequence)b2.g("N - __new_value__; O - __old_value__; D - __difference__;"));
                Tools.r1(object);
                object.setOnClickListener((View.OnClickListener)this);
                this.G = b2.f(2131296378);
                this.v(L);
            } else if (n3 == 0) {
                Tools.r1(object);
                object.setOnClickListener((View.OnClickListener)this);
            } else if (n3 == 3) {
                Tools.r1(object);
                object.setOnClickListener((View.OnClickListener)this);
                object.setText(2131296264);
                this.G = b2.f(2131296767);
                this.f.addTextChangedListener((TextWatcher)object2);
                this.L();
            } else if (n3 == 4) {
                object.setText(2131296264);
                object2 = (TextView)this.b.findViewById(2131034350);
                Tools.r1((View)object2);
                object2.setOnClickListener((View.OnClickListener)this);
            }
            this.A.setOnClickListener((View.OnClickListener)this);
            object2 = Tools.O1(object.getText().toString());
            if (this.d.getVisibility() != 0) {
                object32 = new StringBuilder();
                ((StringBuilder)object32).append((String)object2);
                ((StringBuilder)object32).append(':');
                object2 = ((StringBuilder)object32).toString();
            }
            object.setText((CharSequence)object2);
            this.n();
            return;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Type must be between: 0 and ");
        ((StringBuilder)object2).append(((View)object).length - 1);
        ((StringBuilder)object2).append(" but got: ");
        ((StringBuilder)object2).append(n3);
        throw new IllegalArgumentException(((StringBuilder)object2).toString());
    }

    private void H(int n3) {
        int[] nArray;
        for (int i3 = 0; i3 < (nArray = this.D[n3]).length; ++i3) {
            View view = this.C[i3];
            int n4 = nArray[i3] == 1 ? 0 : 8;
            view.setVisibility(n4);
        }
    }

    public static void I(String string2) {
        AlertDialog.Builder builder = android.ext.f.b();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(b2.f(2131296418));
        stringBuilder.append(":\n");
        stringBuilder.append(string2);
        android.ext.f.o(builder.setMessage((CharSequence)stringBuilder.toString()).setPositiveButton((CharSequence)b2.f(2131296519), ConfigListAdapter.h()).setNegativeButton((CharSequence)b2.f(2131296311), null));
    }

    /*
     * WARNING - void declaration
     */
    private void J(boolean bl) {
        block16: {
            Button button;
            Object object;
            Object object2;
            int n3;
            int n4;
            CharSequence charSequence;
            block19: {
                block18: {
                    int n5;
                    block17: {
                        void var5_10;
                        if (this.F != 0) break block16;
                        charSequence = this.f.getText().toString();
                        boolean bl2 = t1.m((String)charSequence);
                        n4 = t1.C((String)charSequence);
                        n5 = 1;
                        n3 = n4 != 0 ? 1 : 0;
                        n4 = !bl2 && this.o() ? 1 : 0;
                        boolean bl3 = t1.n((String)charSequence);
                        if (bl2 && bl3) {
                            boolean n6 = true;
                        } else {
                            boolean bl4 = false;
                        }
                        int n6 = this.t.getTag() != null ? 1 : 0;
                        if (n6 != var5_10) {
                            object2 = this.t;
                            object = var5_10 != false ? "UTF-16LE" : b2.f(2131296841);
                            object2.setText((CharSequence)object);
                            object2 = this.t;
                            object = var5_10 != false ? object2 : null;
                            object2.setTag(object);
                        }
                        if (!((Config.B & 1) == 0 || this.H == (bl3 = bl3 && this.f.isFocused()) || bl3 && bl)) {
                            this.H = bl3;
                            InternalKeyboard.i((View)this.f, bl3);
                        }
                        char c4 = bl2 ? ((String)charSequence).charAt(0) : (char)'\u0000';
                        this.w(c4, this.q.getSelected());
                        object = this.p;
                        n6 = !bl2 && n3 == 0 ? 0 : 8;
                        object.setVisibility(n6);
                        object = this.d;
                        n6 = bl2 ? 8 : 0;
                        object.setVisibility(n6);
                        object = n4 != 0 ? android.ext.c.C() : android.ext.c.B();
                        if (this.d.getTag() != object) {
                            int n7;
                            this.d.setTag(object);
                            n6 = n7 = this.i();
                            if (object.get(n7) == null) {
                                n6 = 0x20000000;
                            }
                            this.d.setData((e)((Object)object));
                            this.D(n6);
                        }
                        object = this.s;
                        n3 = !bl2 && n3 == 0 && n4 == 0 ? 0 : 8;
                        object.setVisibility(n3);
                        object = this.t;
                        n3 = var5_10 == false && n4 == 0 ? 8 : 0;
                        object.setVisibility(n3);
                        object = this.w;
                        n3 = !bl2 && n4 == 0 ? 8 : 0;
                        object.setVisibility(n3);
                        object = this.u;
                        n3 = bl2 ? 0 : 8;
                        object.setVisibility(n3);
                        this.v.setVisibility(8);
                        if (!bl2 && n4 == 0) break block16;
                        if (this.s.isChecked()) {
                            this.s.setChecked(false);
                        }
                        if (bl2 && this.i() != 0x20000000) {
                            this.D(0x20000000);
                        }
                        if (n4 == 0) break block17;
                        object2 = ((String)charSequence).trim();
                        object = "::";
                        bl = ((String)object2).contains("::");
                        n4 = n3 = this.j();
                        if (n3 == 0) {
                            n4 = 4;
                        }
                        n4 = i2.t((String)object2, n4, bl);
                        this.t.setChecked(bl);
                        this.w.setTag((Object)n4);
                        object2 = this.w;
                        charSequence = new StringBuilder();
                        if (!bl) {
                            object = ":";
                        }
                        ((StringBuilder)charSequence).append((String)object);
                        ((StringBuilder)charSequence).append(n4);
                        object2.setText((CharSequence)((StringBuilder)charSequence).toString());
                        break block16;
                    }
                    n4 = t1.l((String)charSequence);
                    object = this.t;
                    bl = n4 == 58 || n4 == 39;
                    object.setChecked(bl);
                    n3 = ((String)charSequence).charAt(0);
                    n4 = n5;
                    if (n3 != 104) {
                        n4 = n3 == 72 ? n5 : 0;
                    }
                    charSequence = this.w;
                    object2 = "HEX+U8";
                    object = n4 != 0 ? "HEX+U8" : "HEX";
                    charSequence.setText((CharSequence)object);
                    button = this.u;
                    charSequence = "HEX+U16";
                    if (n4 != 0) break block18;
                    object = object2;
                    if (n3 != 59) break block19;
                }
                object = "HEX+U16";
            }
            button.setText((CharSequence)object);
            if (n4 != 0 || n3 == 81 || n3 == 113) {
                this.v.setVisibility(0);
            }
            object2 = this.v;
            object = charSequence;
            if (n4 != 0) {
                object = "HEX+U8+U16";
            }
            object2.setText((CharSequence)object);
        }
    }

    private void K() {
        this.w(this.I, this.q.getSelected());
        this.J(false);
    }

    private static String d(String string2) {
        char c4 = "?".charAt(0);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i3 = 0; i3 < string2.length(); ++i3) {
            String string3 = string2.charAt(i3) == c4 ? "0" : "F";
            stringBuilder.append(string3);
        }
        return stringBuilder.toString();
    }

    private void n() {
        this.w(this.I, this.E);
        SystemSpinner systemSpinner = this.d;
        e e4 = this.F == 3 ? android.ext.c.C() : android.ext.c.B();
        systemSpinner.setData(e4);
        this.F(android.ext.c.r(this.E, true), this.E);
        this.f.addTextChangedListener(this);
    }

    private boolean o() {
        int n3 = this.F;
        boolean bl = false;
        if (n3 != 0) {
            return false;
        }
        String string2 = this.f.getText().toString().trim();
        boolean bl2 = bl;
        if (string2.length() >= 1) {
            if (string2.charAt(0) == '=') {
                bl2 = bl;
            } else {
                bl2 = bl;
                if (string2.indexOf(59) > 0) {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }

    public static long[] t(String string2, long l3) {
        long l4 = t1.r(string2.replace("?", "0"), 16);
        l3 = t1.r(Searcher.d(string2), 16) & l3;
        return new long[]{l4 & l3, l3};
    }

    /*
     * Enabled aggressive block sorting
     */
    private void v(boolean bl) {
        L = bl;
        Button button = this.A;
        int n3 = bl ? 2131296738 : 2131296786;
        String string2 = b2.f(n3);
        button.setText((CharSequence)string2);
        string2 = this.h;
        int n4 = 8;
        n3 = bl ? 0 : 8;
        string2.setVisibility(n3);
        string2 = this.p;
        n3 = bl ? 0 : 8;
        string2.setVisibility(n3);
        string2 = this.b.findViewById(2131034274);
        n3 = n4;
        if (bl) {
            n3 = 0;
        }
        string2.setVisibility(n3);
        button = (TextView)this.b.findViewById(2131034245);
        string2 = bl ? "N = O+D" : b2.f(2131296416);
        button.setText((CharSequence)string2);
        button = (TextView)this.b.findViewById(2131034341);
        string2 = bl ? "N ≠ O+D" : b2.f(2131296698);
        button.setText((CharSequence)string2);
        button = (TextView)this.b.findViewById(2131034305);
        string2 = bl ? "N > O+D" : b2.f(2131296735);
        button.setText((CharSequence)string2);
        button = (TextView)this.b.findViewById(2131034408);
        string2 = bl ? "N < O+D" : b2.f(2131296972);
        button.setText((CharSequence)string2);
    }

    private void w(char c4, int n3) {
        if (this.J != n3 || this.I != c4) {
            CharSequence charSequence;
            TextView textView = this.e;
            if (this.F == 0 && c4 != '\u0000') {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(Tools.N1(2131296418));
                ((StringBuilder)charSequence).append(": ");
                ((StringBuilder)charSequence).append(t1.d(this.f.getText().toString()));
                charSequence = ((StringBuilder)charSequence).toString();
            } else {
                charSequence = android.ext.c.s(n3);
            }
            textView.setText(charSequence);
            this.I = c4;
            this.J = n3;
        }
    }

    public void A(String string2) {
        this.n.setText(string2.trim());
    }

    public void B(boolean bl) {
        this.o.setChecked(bl);
    }

    public void C(View.OnClickListener onClickListener) {
        this.B.setOnClickListener(onClickListener);
    }

    public void D(int n3) {
        this.d.setSelected(n3);
        if (this.p() && n3 != 0x20000000) {
            this.s.setChecked(false);
        }
    }

    public void E(int n3) {
        this.q.setSelected(n3);
        this.K();
    }

    public void F(e e4, int n3) {
        if (this.F == 0) {
            String string2 = b2.f(2131297005);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(" UTF-8");
            e4.put(-100, stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(" UTF-16LE");
            e4.put(-200, stringBuilder.toString());
            e4.put(-300, "HEX");
            e4.put(-400, "HEX + UTF-8 + UTF-16LE");
            e4.put(-500, "ARM (x32)");
            e4.put(-600, "Thumb");
            e4.put(-700, "ARM (x64)");
        }
        this.q.setData(e4);
        this.E(n3);
    }

    e G(int n3) {
        e e4 = android.ext.c.r(n3, true);
        int n4 = MainService.E();
        if (n4 == 0 || e4.get(n4) != null) {
            n3 = n4;
        }
        this.F(e4, n3);
        return e4;
    }

    void L() {
        if (this.F == 3) {
            String string2;
            try {
                string2 = Long.toHexString(this.s()[1]).toUpperCase(Locale.US);
            }
            catch (Throwable throwable) {
                string2 = "???";
            }
            TextView textView = this.l;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Tools.N1(2131296908));
            stringBuilder.append(": ");
            stringBuilder.append(string2);
            textView.setText((CharSequence)stringBuilder.toString());
        }
    }

    public long a() {
        return t1.r(this.c(), 16);
    }

    public void afterTextChanged(Editable editable) {
    }

    public long b() {
        long l3;
        String string2 = this.z.getText().toString().trim();
        if (string2.length() > 0) {
            string2 = j2.h(string2);
            try {
                l3 = t1.r(string2, 10);
                y0.b(string2, 1);
            }
            catch (NumberFormatException numberFormatException) {
                this.z.requestFocus();
                throw numberFormatException;
            }
        } else {
            l3 = 0L;
        }
        return l3;
    }

    public void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n5) {
    }

    public String c() {
        String string2 = this.k.getText().toString().trim();
        y0.b(string2, 1);
        return string2;
    }

    public long e(int n3) {
        return this.y.a(n3);
    }

    public String f() {
        if (this.F == 2 && !L) {
            return "0";
        }
        String string2 = this.f.getText().toString().trim();
        y0.b(string2, 1);
        return string2;
    }

    public EditText g() {
        return this.f;
    }

    public String h() {
        String string2 = this.n.getText().toString().trim();
        y0.b(string2, 1);
        return string2;
    }

    public int i() {
        return this.d.getSelected();
    }

    public int j() {
        if (this.F == 0) {
            String string2 = this.f.getText().toString();
            if (t1.m(string2)) {
                int n3 = string2.charAt(0) == ';' ? 2 : 1;
                return n3;
            }
            int n4 = t1.C(string2);
            if (n4 != 0) {
                return n4;
            }
        }
        return this.q.getSelected();
    }

    public View k() {
        return this.b;
    }

    public View l() {
        return InternalKeyboard.d(this.m());
    }

    public View m() {
        return Tools.O0(this.k());
    }

    public void onCheckedChanged(CompoundButton object, boolean bl) {
        int n3 = object.getId();
        if (n3 != 2131034334) {
            if (n3 == 2131034351) {
                if (this.F == 0 && t1.m((String)(object = this.f.getText().toString()))) {
                    char c4 = t1.l((String)object);
                    n3 = 39;
                    int n4 = 1;
                    boolean bl2 = c4 == ':' || c4 == '\'';
                    if (bl2 != bl) {
                        if (c4 != '\'' && c4 != '\"') {
                            this.f.getText().replace(0, 1, (CharSequence)String.valueOf(c4));
                        } else {
                            if (!bl) {
                                n3 = 34;
                            }
                            Editable editable = this.f.getText();
                            int n5 = ((String)object).length();
                            while (n4 < n5) {
                                if (((String)object).charAt(n4) == n3) {
                                    editable.replace(n4, n4 + 1, (CharSequence)String.valueOf(c4));
                                }
                                ++n4;
                            }
                        }
                    }
                } else if (this.o()) {
                    String string2 = this.f.getText().toString();
                    String string3 = "::";
                    if (string2.contains("::") != bl) {
                        object = bl ? ":" : "::";
                        int n6 = string2.indexOf((String)object);
                        int n7 = ((String)object).length() + n6;
                        n3 = n6;
                        if (n6 == -1) {
                            n7 = n3 = string2.length();
                        }
                        string2 = this.f.getText();
                        object = bl ? string3 : ":";
                        string2.replace(n3, n7, (CharSequence)object);
                    }
                }
            }
        } else if (bl && this.i() != 0x20000000) {
            this.D(0x20000000);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void onClick(DialogInterface object, int n3) {
        block5: {
            void var1_11;
            int n4;
            block4: {
                int n5;
                block6: {
                    block12: {
                        block7: {
                            block8: {
                                block9: {
                                    block10: {
                                        block11: {
                                            if (n4 > -100) break block5;
                                            n5 = 4;
                                            if (n4 == -700) break block6;
                                            if (n4 == -600) break block7;
                                            if (n4 == -500) break block8;
                                            n5 = 1;
                                            if (n4 == -400) break block9;
                                            if (n4 == -300) break block10;
                                            if (n4 == -200) break block11;
                                            if (n4 != -100) {
                                                Object var1_2 = null;
                                                n4 = 0;
                                                break block4;
                                            } else {
                                                String string2 = ":";
                                                n4 = n5;
                                            }
                                            break block4;
                                        }
                                        String string3 = ";";
                                        break block12;
                                    }
                                    String string4 = "h";
                                    n4 = n5;
                                    break block4;
                                }
                                String string5 = "Q";
                                n4 = n5;
                                break block4;
                            }
                            String string6 = "~A ";
                            n4 = n5;
                            break block4;
                        }
                        String string7 = "~T ";
                    }
                    n4 = 2;
                    break block4;
                }
                String string8 = "~A8 ";
                n4 = n5;
            }
            if (var1_11 != null) {
                this.f.getText().insert(0, (CharSequence)var1_11);
                this.E(n4);
            }
        }
        this.K();
        if (this.p() && this.i() != 0x20000000) {
            this.s.setChecked(false);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onClick(View var1_1) {
        if (var1_1 == null) {
            return;
        }
        var2_2 = var1_1.getId();
        var3_3 = 1;
        switch (var2_2) {
            default: {
                return;
            }
            case 2131034438: {
                Searcher.I(this.G);
                return;
            }
            case 2131034350: {
                android.ext.f.o(android.ext.f.b().setMessage((CharSequence)b2.f(2131296835)).setNegativeButton((CharSequence)b2.f(2131296836), null));
                return;
            }
            case 2131034281: 
            case 2131034282: 
            case 2131034329: {
                if (this.o()) {
                    if ((var1_1 = var1_1.getTag()) instanceof Integer == false) return;
                    var5_4 = (Integer)var1_1;
                    var9_6 = this.f.getText().toString();
                    var1_1 = "::";
                    if (!var9_6.contains("::")) {
                        var1_1 = ":";
                    }
                    var4_8 = var9_6.indexOf((String)var1_1);
                    var3_3 = var9_6.length();
                    var2_2 = var4_8;
                    if (var4_8 == -1) {
                        var2_2 = var3_3;
                    }
                    var9_6 = this.f.getText();
                    var10_10 = new StringBuilder();
                    var10_10.append((String)var1_1);
                    var10_10.append(var5_4);
                    var9_6.replace(var2_2, var3_3, (CharSequence)var10_10.toString());
                    return;
                }
                var9_7 = this.f.getText();
                try {
                    if (var9_7.length() <= 0) return;
                    var5_5 = var1_1.getId();
                    var6_12 = var9_7.charAt(0);
                    var2_2 = var6_12 != 104 && var6_12 != 72 ? 0 : 1;
                    if (var5_5 == 2131034329 && var2_2 == 0) {
                        t1.h((CharSequence)var9_7);
                        var1_1 = "h";
                        var2_2 = var3_3;
lbl47:
                        // 4 sources

                        while (true) {
                            var9_7.replace(0, var2_2, (CharSequence)var1_1);
                            return;
                        }
                    }
                }
                catch (Throwable var10_11) {
                    ** GOTO lbl113
                }
                var4_9 = '\'';
                if (var5_5 != 2131034281 || var6_12 != 58) ** GOTO lbl66
                var1_1 = new StringBuilder();
                var1_1.append("Q '");
                var1_1.append(var9_7.toString().substring(1).replace("'", "' 27 '"));
                var1_1.append('\'');
                var1_1 = var1_1.toString();
                var2_2 = var9_7.length();
                ** GOTO lbl47
lbl66:
                // 1 sources

                if (var5_5 != 2131034281 || var6_12 != 59) ** GOTO lbl77
                var1_1 = new StringBuilder();
                var1_1.append("Q \"");
                var1_1.append(var9_7.toString().substring(1).replace("\"", "\" 22 \""));
                var1_1.append('\"');
                var1_1 = var1_1.toString();
                var2_2 = var9_7.length();
                ** GOTO lbl47
lbl77:
                // 1 sources

                if (var2_2 != 0) {
                    var1_1 = t1.h(var9_7.toString());
                    var2_2 = ((View)var1_1).length;
                    var7_13 = var5_5 == 2131034329 || var5_5 == 2131034282;
                    var8_15 = var5_5 == 2131034281 || var5_5 == 2131034282;
                    x0.b(null, 0, (byte[])var1_1, var2_2, var7_13, var8_15, var9_7);
                    var1_1 = "Q";
                    var2_2 = var3_3;
                    ** continue;
                }
                if (var5_5 == 2131034281) {
                    var4_9 = '\"';
                }
                var2_2 = 1;
                var5_5 = 0;
                while (var2_2 < var9_7.length()) {
                    var3_3 = var5_5;
                    var6_12 = var2_2;
                    if (var9_7.charAt(var2_2) == var4_9) {
                        if (var5_5 == 0) {
                            var3_3 = var2_2 + 1;
                            var6_12 = var2_2;
                        } else {
                            var1_1 = var9_7.toString().substring(var5_5, var2_2);
                            var7_14 = var4_9 == '\"';
                            var1_1 = var1_1.getBytes(t1.i(var7_14));
                            var1_1 = InOut.b((byte[])var1_1, 0, ((View)var1_1).length).trim();
                            var6_12 = var2_2 + 1;
                            var9_7.replace(--var5_5, var6_12, (CharSequence)var1_1);
                            var3_3 = var1_1.length();
                            var6_12 = var2_2 + (var3_3 - (var6_12 - var5_5));
                            var3_3 = 0;
                        }
                    }
                    var2_2 = var6_12 + 1;
                    var5_5 = var3_3;
                }
                return;
lbl113:
                // 1 sources

                var1_1 = new StringBuilder();
                var1_1.append("Failed convert '");
                var1_1.append(var9_7);
                var1_1.append("'");
                e1.g(var1_1.toString(), var10_11);
                return;
            }
            case 2131034248: 
        }
        if (this.F == 2) {
            this.v(Searcher.L ^ true);
        }
        if (this.f.getVisibility() != 0) return;
        if (this.h.getVisibility() != 0) return;
        this.f.requestFocus();
    }

    public void onFocusChange(View object, boolean bl) {
        if ((Config.B & 1) == 0) {
            return;
        }
        InternalKeyboard internalKeyboard = (InternalKeyboard)object.getRootView().findViewById(2131034303);
        if (internalKeyboard != null) {
            if (this.F == 0 && t1.n(this.f.getText().toString())) {
                object = this.f;
                InternalKeyboard.i(object, object.isFocused());
            } else {
                internalKeyboard.setHideKeyboard(false);
                Tools.S0(object);
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int n3, int n4, int n5) {
        boolean bl;
        block3: {
            block2: {
                if (n3 != 0) break block2;
                bl = true;
                if (n4 == 1 && n5 == 0) break block3;
            }
            bl = false;
        }
        this.J(bl);
    }

    public boolean p() {
        return this.s.isChecked();
    }

    public boolean q() {
        return this.o.isChecked();
    }

    /*
     * Unable to fully structure code
     */
    public void r() {
        var1_1 = this.F;
        var2_3 = var3_2 = null;
        if (var1_1 != 1) {
            if (var1_1 != 2) {
                if (var1_1 != 3) {
                    if (var1_1 != 4) {
                        while (true) {
                            var2_3 = this.f;
                            break;
                        }
                    } else if (this.a) {
                        while (true) {
                            var2_3 = this.f;
                            break;
                        }
                    } else {
                        var2_3 = this.n;
                    }
                } else {
                    if (this.a) ** continue;
                    var2_3 = this.k;
                }
            } else {
                var2_3 = var3_2;
                if (Searcher.L) ** continue;
            }
        }
        if (var2_3 != null) {
            var2_3.requestFocus();
            Tools.o1(var2_3);
        } else {
            this.onFocusChange(this.b, false);
        }
    }

    @Override
    public void run() {
        Searcher.K[this.F] = this.y.getType();
    }

    public long[] s() {
        return Searcher.t(this.f(), this.a());
    }

    public void u(boolean bl) {
        this.a = bl;
    }

    public void x(String string2) {
        this.k.setText(string2.trim());
    }

    public void y(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public void z(String string2) {
        this.f.setText(string2.trim());
    }
}

