/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.d;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.ext.EditText;
import android.ext.InternalKeyboard;
import android.ext.MainService;
import android.ext.SavedListAdapter;
import android.ext.Script;
import android.ext.SystemSpinner;
import android.ext.SystemSpinnerType;
import android.ext.Tools;
import android.ext.b2;
import android.ext.c;
import android.ext.c2;
import android.ext.f;
import android.ext.h2;
import android.ext.j2;
import android.ext.p1;
import android.ext.t1;
import android.ext.y0;
import android.fix.TextView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import d.e;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class b
extends p1 {
    public b() {
        super(2131296314, 2130968601);
    }

    public static void h(String string2) {
        new a(string2).onClick(null);
    }

    @Override
    public void onClick(View view) {
        new a(null).onClick(view);
    }

    private static class a
    implements View.OnClickListener,
    DialogInterface.OnClickListener,
    DialogInterface.OnDismissListener,
    DialogInterface.OnShowListener,
    TextWatcher,
    CompoundButton.OnCheckedChangeListener {
        private static String j = "0";
        private static boolean k = true;
        private final String a;
        private final int[] b = new int[3];
        private final int[] c = new int[4];
        private AlertDialog d;
        private EditText e;
        private CheckBox f;
        private CheckBox g;
        private TextView h;
        private SystemSpinnerType i;

        a(String string2) {
            this.a = string2;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void a() {
            block14: {
                if (this.e == null) {
                    return;
                }
                var8_1 = this.i.getSelected();
                try {
                    var9_2 = this.b(false);
                    if (var8_1 != 127) ** GOTO lbl-1000
                    var13_3 = this.b;
                    var7_6 = 0;
                    var4_8 = 1;
                    var3_10 = 0;
                }
                catch (Throwable var13_5) {
                    var1_11 = 1;
                    var2_12 = 0;
                    break block14;
                }
                while (true) {
                    var6_14 = var4_8;
                    var5_13 = var3_10;
                    var1_11 = var4_8;
                    var2_12 = var3_10;
                    try {
                        if (var7_6 >= ((int[])var13_3).length) break block14;
                    }
                    catch (Throwable var13_4) {
                        var1_11 = var6_14;
                        var2_12 = var5_13;
                        break block14;
                    }
                    var6_14 = var13_3[var7_6];
                    var2_12 = var4_8;
                    var1_11 = var3_10;
                    if (var6_14 != 0) {
                        var5_13 = 1 << var7_6;
                        var2_12 = var4_8;
                        var1_11 = var3_10;
                        if (((long)(var5_13 - 1) & var9_2) != 0L) {
                            var1_11 = var3_10 + var6_14;
                            var2_12 = var5_13;
                        }
                    }
                    ++var7_6;
                    var4_8 = var2_12;
                    var3_10 = var1_11;
                }
lbl-1000:
                // 1 sources

                {
                    var13_3 = this.c;
                    var4_9 = android.ext.c.l(var8_1);
                    var7_7 = 0;
                    var3_10 = 0;
                }
                while (true) {
                    var6_14 = var4_9;
                    var5_13 = var3_10;
                    var1_11 = var4_9;
                    var2_12 = var3_10;
                    {
                        if (var7_7 >= ((int[])var13_3).length) break;
                    }
                    var2_12 = var13_3[var7_7];
                    if (var2_12 != 0) {
                        var11_15 = var7_7;
                        var1_11 = var3_10;
                        if (((long)(var4_9 - 1) & var11_15 + var9_2) != 0L) {
                            var1_11 = var3_10 + var2_12;
                        }
                    } else {
                        var1_11 = var3_10;
                    }
                    ++var7_7;
                    var3_10 = var1_11;
                }
            }
            var13_3 = (Object)this.h;
            var3_10 = var8_1 == 127 ? 2131296266 : 2131296267;
            var13_3.setText((CharSequence)Tools.L1(b2.f(var3_10), new Object[]{var1_11, var2_12}));
            var13_3 = (Object)this.h;
            var1_11 = var2_12 > 0 ? 0 : 4;
            var13_3.setVisibility(var1_11);
        }

        private long b(boolean bl) {
            String string2;
            String string3 = string2 = j2.h(this.e.getText().toString().trim());
            if (string2.length() == 0) {
                string3 = "0";
            }
            int n3 = this.a == null && !this.g.isChecked() ? 10 : 16;
            long l3 = t1.r(string3, n3);
            string2 = this.a;
            long l4 = l3;
            if (string2 != null) {
                l4 = l3 - t1.r(string2, 16);
            }
            if (bl) {
                y0.b(string3, 1);
            }
            return l4;
        }

        public void afterTextChanged(Editable editable) {
            this.a();
        }

        public void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n5) {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
            this.a();
        }

        public void onClick(DialogInterface dialogInterface, int n3) {
            this.a();
            if (n3 == -1) {
                this.onClick((View)((AlertDialog)dialogInterface).getButton(n3));
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void onClick(View object) {
            CheckBox checkBox;
            Object object2 = MainService.instance.z();
            if (Tools.L0(object2) == 0) {
                Tools.H1(2131296822);
                return;
            }
            if (!(object2 instanceof e)) {
                return;
            }
            if (object != null && !(object.getTag() instanceof p1)) {
                NumberFormatException numberFormatException2;
                block22: {
                    block21: {
                        boolean bl;
                        Object object3;
                        long l3;
                        try {
                            h2 h22;
                            int n3;
                            if (this.e == null) break block21;
                            l3 = this.b(true);
                            object3 = new ArrayList();
                            object = (e)object2;
                            int n4 = ((e)object).l();
                            for (n3 = 0; n3 < n4; ++n3) {
                                if (!((e)object).a(n3) || !((h22 = (h2)((e)object).n(n3)) instanceof h2)) continue;
                                object3.add(h22.Y());
                            }
                            MainService.instance.j(0);
                            bl = this.f.isChecked();
                            object = MainService.instance.t0;
                            if (!bl) {
                                ((SavedListAdapter)object).l((List)object3);
                            }
                            n3 = this.i.getSelected();
                            object3 = object3.iterator();
                            while (object3.hasNext()) {
                                h22 = ((h2)object3.next()).Y();
                                if (bl) {
                                    object2 = new StringBuilder();
                                    ((StringBuilder)object2).append(h22.b0());
                                    ((StringBuilder)object2).append(" #2");
                                    h22.l = ((StringBuilder)object2).toString();
                                }
                                if (n3 != 127) {
                                    h22.c = n3;
                                }
                                h22.a += l3;
                                if (!h22.V()) {
                                    h22.c = android.ext.c.S(h22.a, true);
                                }
                                ((SavedListAdapter)object).b(h22, (byte)1, false);
                            }
                        }
                        catch (NumberFormatException numberFormatException2) {
                            break block22;
                        }
                        object.notifyDataSetChanged();
                        ((SavedListAdapter)object).i();
                        object3 = MainService.instance.f;
                        if (object3 != null) {
                            ((c2)object3).write("\nlocal copy = ");
                            object = bl ? "true" : "false";
                            ((c2)object3).write((String)object);
                            ((c2)object3).write("\n");
                            ((c2)object3).write("local t = gg.getListItems()\n");
                            ((c2)object3).write("if not copy then gg.removeListItems(t) end\n");
                            ((c2)object3).write("for i, v in ipairs(t) do\n");
                            ((c2)object3).write("\tv.address = v.address + ");
                            if (this.a == null && !this.g.isChecked()) {
                                ((c2)object3).write(Long.toString(l3));
                            } else {
                                Script.Consts.b((Writer)object3, l3);
                            }
                            ((c2)object3).write("\n");
                            ((c2)object3).write("\tif copy then v.name = v.name..' #2' end\n");
                            ((c2)object3).write("end\n");
                            ((c2)object3).write("gg.addListItems(t)\n");
                            ((c2)object3).write("t = nil\n");
                            ((c2)object3).write("copy = nil\n\n");
                        }
                    }
                    Tools.D((DialogInterface)this.d);
                    return;
                }
                j2.i(numberFormatException2, this.e);
                return;
            }
            View view = a.d.f(2131099671, null);
            this.e = object = (EditText)view.findViewById(2131034316);
            this.f = (CheckBox)view.findViewById(2131034314);
            this.g = checkBox = (CheckBox)view.findViewById(2131034280);
            checkBox.setChecked(k);
            checkBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this);
            this.h = (TextView)view.findViewById(2131034126);
            Object object4 = (SystemSpinnerType)view.findViewById(2131034431);
            this.i = object4;
            ((SystemSpinner)((Object)object4)).setData(android.ext.c.r(127, true));
            ((SystemSpinnerType)((Object)object4)).setSelected(127);
            ((SystemSpinner)((Object)object4)).setOnItemSelectedListener(this);
            e e4 = (e)object2;
            int n5 = e4.l();
            object4 = this.b;
            Arrays.fill((int[])object4, 0);
            int[] nArray = this.c;
            Arrays.fill(nArray, 0);
            for (int i3 = 0; i3 < n5; ++i3) {
                int n6;
                if (!e4.a(i3) || !((object2 = (h2)e4.n(i3)) instanceof h2)) continue;
                int n7 = ((c)object2).k();
                if (n7 == 1) {
                    n6 = 0;
                } else {
                    n6 = 2;
                    if (n7 == 2) {
                        n6 = 1;
                    }
                }
                object4[n6] = object4[n6] + true;
                n6 = (int)(((c)object2).a & 3L);
                nArray[n6] = nArray[n6] + 1;
            }
            ((EditText)object).setDataType(1);
            object.addTextChangedListener((TextWatcher)this);
            if (this.a != null) {
                ((LinearLayout)view.findViewById(2131034276)).setOrientation(1);
                object2 = (TextView)view.findViewById(2131034337);
                object4 = new StringBuilder();
                ((StringBuilder)object4).append(Tools.N1(2131296801));
                ((StringBuilder)object4).append(":");
                object2.setText((CharSequence)((StringBuilder)object4).toString());
                checkBox.setVisibility(8);
            } else {
                object.setText((CharSequence)j);
            }
            this.a();
            view = android.ext.f.b().setView(InternalKeyboard.d(view)).setPositiveButton((CharSequence)b2.f(2131296836), (DialogInterface.OnClickListener)this).setNegativeButton((CharSequence)b2.f(2131296311), null).create();
            this.d = view;
            android.ext.f.k((AlertDialog)view, this);
            android.ext.f.l((AlertDialog)view, this);
            android.ext.f.n((AlertDialog)view, (android.widget.EditText)object);
        }

        public void onDismiss(DialogInterface object) {
            if (this.a != null) {
                return;
            }
            object = this.e;
            if (object != null) {
                j = object.getText().toString().trim();
                k = this.g.isChecked();
            }
        }

        public void onShow(DialogInterface dialogInterface) {
            Tools.t1(dialogInterface, -1, null, this, this.e);
        }

        public void onTextChanged(CharSequence charSequence, int n3, int n4, int n5) {
            this.a();
        }
    }
}

