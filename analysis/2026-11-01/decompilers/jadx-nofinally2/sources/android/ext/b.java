package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.fix.TextView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import catch_.me_.if_.you_.can_.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class b extends p1 {

    private static class a implements View.OnClickListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnShowListener, TextWatcher, CompoundButton.OnCheckedChangeListener {
        private static String j = "0";
        private static boolean k = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f575b = new int[3];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f576c = new int[4];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private AlertDialog f577d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private EditText f578e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CheckBox f579f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private CheckBox f580g;
        private TextView h;
        private SystemSpinnerType i;

        a(String str) {
            this.f574a = str;
        }

        private void a() {
            int iL;
            int i;
            int[] iArr;
            if (this.f578e == null) {
                return;
            }
            int selected = this.i.getSelected();
            int i2 = 1;
            try {
                long jB = b(false);
                try {
                    if (selected == 127) {
                        int[] iArr2 = this.f575b;
                        int i3 = 0;
                        iL = 1;
                        i = 0;
                        while (i3 < iArr2.length) {
                            int i4 = iArr2[i3];
                            if (i4 != 0) {
                                int i5 = i2 << i3;
                                if ((((long) (i5 - 1)) & jB) != 0) {
                                    i += i4;
                                    iL = i5;
                                }
                            }
                            i3++;
                            i2 = 1;
                        }
                    } else {
                        int[] iArr3 = this.f576c;
                        iL = c.l(selected);
                        int i6 = 0;
                        i = 0;
                        while (i6 < iArr3.length) {
                            int i7 = iArr3[i6];
                            if (i7 != 0) {
                                iArr = iArr3;
                                if ((((long) (iL - 1)) & (((long) i6) + jB)) != 0) {
                                    i += i7;
                                }
                            } else {
                                iArr = iArr3;
                            }
                            i6++;
                            iArr3 = iArr;
                        }
                    }
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                iL = 1;
                i = 0;
            }
            this.h.setText(Tools.L1(b2.f(selected == 127 ? R.string.align_warn_offset : R.string.align_warn_result), Integer.valueOf(iL), Integer.valueOf(i)));
            this.h.setVisibility(i > 0 ? 0 : 4);
        }

        private long b(boolean z) {
            String strH = j2.h(this.f578e.getText().toString().trim());
            if (strH.length() == 0) {
                strH = "0";
            }
            long jR = t1.r(strH, (this.f574a != null || this.f580g.isChecked()) ? 16 : 10);
            String str = this.f574a;
            if (str != null) {
                jR -= t1.r(str, 16);
            }
            if (z) {
                y0.b(strH, 1);
            }
            return jR;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            a();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            a();
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            a();
            if (i == -1) {
                onClick(((AlertDialog) dialogInterface).getButton(i));
            }
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            EditText editText;
            if (this.f574a == null && (editText = this.f578e) != null) {
                j = editText.getText().toString().trim();
                k = this.f580g.isChecked();
            }
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Tools.t1(dialogInterface, -1, null, this, this.f578e);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            a();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            char c2;
            Object objZ = MainService.instance.z();
            if (Tools.L0(objZ) == 0) {
                Tools.H1(R.string.nothing_selected);
                return;
            }
            if (objZ instanceof d.e) {
                if (view == null || (view.getTag() instanceof p1)) {
                    View viewF = a.d.f(R.layout.service_address_editor, null);
                    EditText editText = (EditText) viewF.findViewById(R.id.mem_edit_addr);
                    this.f578e = editText;
                    this.f579f = (CheckBox) viewF.findViewById(R.id.make_copy);
                    CheckBox checkBox = (CheckBox) viewF.findViewById(R.id.hex);
                    this.f580g = checkBox;
                    checkBox.setChecked(k);
                    checkBox.setOnCheckedChangeListener(this);
                    this.h = (TextView) viewF.findViewById(R.id.align_warn);
                    SystemSpinnerType systemSpinnerType = (SystemSpinnerType) viewF.findViewById(R.id.type);
                    this.i = systemSpinnerType;
                    systemSpinnerType.setData(c.r(127, true));
                    systemSpinnerType.setSelected(127);
                    systemSpinnerType.setOnItemSelectedListener(this);
                    d.e eVar = (d.e) objZ;
                    int iL = eVar.l();
                    int[] iArr = this.f575b;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = this.f576c;
                    Arrays.fill(iArr2, 0);
                    for (int i = 0; i < iL; i++) {
                        if (eVar.a(i)) {
                            h2 h2Var = (h2) eVar.n(i);
                            if (h2Var instanceof h2) {
                                int iK = h2Var.k();
                                if (iK == 1) {
                                    c2 = 0;
                                } else {
                                    c2 = 2;
                                    if (iK == 2) {
                                        c2 = 1;
                                    }
                                }
                                iArr[c2] = iArr[c2] + 1;
                                int i2 = (int) (h2Var.f672a & 3);
                                iArr2[i2] = iArr2[i2] + 1;
                            }
                        }
                    }
                    editText.setDataType(1);
                    editText.addTextChangedListener(this);
                    if (this.f574a != null) {
                        ((LinearLayout) viewF.findViewById(R.id.group)).setOrientation(1);
                        ((TextView) viewF.findViewById(R.id.name)).setText(Tools.N1(R.string.new_address) + ":");
                        checkBox.setVisibility(8);
                    } else {
                        editText.setText(j);
                    }
                    a();
                    AlertDialog alertDialogCreate = f.b().setView(InternalKeyboard.d(viewF)).setPositiveButton(b2.f(R.string.ok), this).setNegativeButton(b2.f(R.string.cancel), (DialogInterface.OnClickListener) null).create();
                    this.f577d = alertDialogCreate;
                    f.k(alertDialogCreate, this);
                    f.l(alertDialogCreate, this);
                    f.n(alertDialogCreate, editText);
                    return;
                }
                try {
                    if (this.f578e != null) {
                        long jB = b(true);
                        ArrayList arrayList = new ArrayList();
                        d.e eVar2 = (d.e) objZ;
                        int iL2 = eVar2.l();
                        for (int i3 = 0; i3 < iL2; i3++) {
                            if (eVar2.a(i3)) {
                                h2 h2Var2 = (h2) eVar2.n(i3);
                                if (h2Var2 instanceof h2) {
                                    arrayList.add(h2Var2.c());
                                }
                            }
                        }
                        MainService.instance.j(0);
                        boolean zIsChecked = this.f579f.isChecked();
                        SavedListAdapter savedListAdapter = MainService.instance.t0;
                        if (!zIsChecked) {
                            savedListAdapter.l(arrayList);
                        }
                        int selected = this.i.getSelected();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            h2 h2VarC = ((h2) it.next()).c();
                            if (zIsChecked) {
                                h2VarC.l = h2VarC.b0() + " #2";
                            }
                            if (selected != 127) {
                                h2VarC.f674c = selected;
                            }
                            h2VarC.f672a += jB;
                            if (!h2VarC.V()) {
                                h2VarC.f674c = c.S(h2VarC.f672a, true);
                            }
                            savedListAdapter.b(h2VarC, (byte) 1, false);
                        }
                        savedListAdapter.notifyDataSetChanged();
                        savedListAdapter.i();
                        c2 c2Var = MainService.instance.f216f;
                        if (c2Var != null) {
                            c2Var.write("\nlocal copy = ");
                            c2Var.write(zIsChecked ? "true" : "false");
                            c2Var.write("\n");
                            c2Var.write("local t = gg.getListItems()\n");
                            c2Var.write("if not copy then gg.removeListItems(t) end\n");
                            c2Var.write("for i, v in ipairs(t) do\n");
                            c2Var.write("\tv.address = v.address + ");
                            if (this.f574a != null || this.f580g.isChecked()) {
                                Script.Consts.b(c2Var, jB);
                            } else {
                                c2Var.write(Long.toString(jB));
                            }
                            c2Var.write("\n");
                            c2Var.write("\tif copy then v.name = v.name..' #2' end\n");
                            c2Var.write("end\n");
                            c2Var.write("gg.addListItems(t)\n");
                            c2Var.write("t = nil\n");
                            c2Var.write("copy = nil\n\n");
                        }
                    }
                    Tools.D(this.f577d);
                } catch (NumberFormatException e2) {
                    j2.i(e2, this.f578e);
                }
            }
        }
    }

    public b() {
        super(R.string.change_address_type, R.drawable.ic_cursor_mover_white_24dp);
    }

    public static void h(String str) {
        new a(str).onClick(null);
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(View view) {
        new a(null).onClick(view);
    }
}
