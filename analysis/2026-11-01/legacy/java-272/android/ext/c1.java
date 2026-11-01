package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public class c1 implements DialogInterface.OnClickListener, DialogInterface.OnShowListener, DialogInterface.OnDismissListener, View.OnClickListener, View.OnLongClickListener {
    private static int h = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.widget.EditText f688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RadioGroup f689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CheckBox f690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AlertDialog f691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private z1.d f692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h2[] f693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f694g = false;

    public c1(z1.d dVar, h2[] h2VarArr) {
        if (dVar == null) {
            f.o(f.b().setCustomTitle(Tools.g0(R.string.load_list)).setMessage(b2.f(R.string.no_application)).setNegativeButton(b2.f(R.string.ok), (DialogInterface.OnClickListener) null));
            return;
        }
        if (h2VarArr != null && h2VarArr.length == 0) {
            f.o(f.b().setMessage(b2.f(R.string.empty_save)).setNegativeButton(b2.f(R.string.ok), (DialogInterface.OnClickListener) null));
            return;
        }
        MainService.instance.i.W();
        this.f692e = dVar;
        this.f693f = h2VarArr;
        boolean z = h2VarArr == null;
        View viewF = a.d.f(R.layout.save, null);
        ((TextView) viewF.findViewById(R.id.message)).setText(b2.f(z ? R.string.load_saved_list : R.string.save_saved_list));
        EditTextPath editTextPath = (EditTextPath) viewF.findViewById(R.id.file);
        this.f688a = editTextPath;
        editTextPath.setText(v1.a("save-path", "-list", ".txt"));
        editTextPath.setDataType(4);
        editTextPath.setPathType(z ? 1 : 2);
        viewF.findViewById(R.id.path_selector).setTag(editTextPath);
        viewF.findViewById(z ? R.id.load_stuff : R.id.save_stuff).setVisibility(0);
        RadioGroup radioGroup = (RadioGroup) viewF.findViewById(R.id.mode);
        this.f689b = radioGroup;
        int i = h;
        if (i > 0) {
            radioGroup.check(i);
        }
        ((RadioButton) viewF.findViewById(R.id.mode_0)).setText(b2.f(R.string.load_0));
        ((RadioButton) viewF.findViewById(R.id.mode_1)).setText(b2.f(R.string.load_1));
        ((RadioButton) viewF.findViewById(R.id.mode_2)).setText(b2.f(R.string.load_2));
        CheckBox checkBox = (CheckBox) viewF.findViewById(R.id.as_text);
        this.f690c = checkBox;
        Tools.r1(checkBox);
        checkBox.setOnLongClickListener(this);
        AlertDialog.Builder negativeButton = f.b().setView(InternalKeyboard.e(viewF, false)).setPositiveButton(b2.f(z ? R.string.load : R.string.save), this).setNegativeButton(b2.f(R.string.cancel), (DialogInterface.OnClickListener) null);
        if (z && MainService.instance.t0.getCount() != 0) {
            negativeButton.setNeutralButton(b2.f(R.string.append), this);
        }
        AlertDialog alertDialogCreate = negativeButton.create();
        this.f691d = alertDialogCreate;
        f.l(alertDialogCreate, this);
        f.k(alertDialogCreate, this);
        f.n(alertDialogCreate, editTextPath);
    }

    private static String a(String str) {
        return str.replace('|', '/');
    }

    public static void b(int i, String str, int i2) throws IOException {
        File file = new File(str);
        if (file.exists()) {
            c(new BufferedReader(new FileReader(file)), i, i2);
        }
    }

    public static void c(BufferedReader bufferedReader, int i, int i2) throws IOException {
        boolean z;
        h2 h2Var;
        char c2 = 0;
        int i3 = 1;
        boolean z2 = (i2 & 1) != 0;
        boolean z3 = (i2 & 2) != 0;
        SavedListAdapter savedListAdapter = MainService.instance.t0;
        if ((i2 & 8) == 0) {
            savedListAdapter.c();
        }
        int i4 = 0;
        boolean z4 = false;
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                int i5 = i4 + 1;
                if (i5 == i3) {
                    try {
                        z4 = Integer.parseInt(line) == i;
                        i4 = i5;
                    } catch (Throwable th) {
                        e1.s("Failed parse pid: '" + line + '\'', th);
                        z = z2;
                        i5 = i5;
                        i4 = i5;
                        z2 = z;
                        i3 = 1;
                    }
                } else {
                    String[] strArrSplit = line.split("\\|");
                    if (strArrSplit.length < 10) {
                        e1.p("Failed parse line: '" + line + "' " + strArrSplit.length);
                    } else {
                        try {
                            h2 h2Var2 = new h2(t1.r(strArrSplit[i3], 16), t1.r(strArrSplit[3], 16), Integer.parseInt(strArrSplit[2], 16), strArrSplit[c2], z2 ? strArrSplit[4].equals("1") : false, Byte.parseByte(strArrSplit[5]), t1.r(strArrSplit[6], 16), t1.r(strArrSplit[7], 16));
                            long jR = t1.r(strArrSplit[10], 16);
                            if (z4) {
                                z = z2;
                                h2Var = h2Var2;
                            } else {
                                try {
                                    RegionList.b bVarB = RegionList.b(h2Var2.f672a);
                                    if (bVarB != null && bVarB.f().equals(strArrSplit[8]) && bVarB.a().equals(strArrSplit[9]) && h2Var2.f672a == bVarB.f356b + jR) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("ASLR: ");
                                        h2Var = h2Var2;
                                        sb.append(Long.toHexString(h2Var.f672a));
                                        sb.append(" ??? ");
                                        sb.append(Long.toHexString(bVarB.f356b + jR));
                                        sb.append("; ");
                                        sb.append(strArrSplit[8]);
                                        sb.append(' ');
                                        sb.append(strArrSplit[9]);
                                        sb.append(' ');
                                        sb.append(Long.toHexString(jR));
                                        sb.append("; ");
                                        sb.append(bVarB.f());
                                        sb.append(' ');
                                        sb.append(bVarB.a());
                                        e1.d(sb.toString());
                                    } else {
                                        h2Var = h2Var2;
                                        RegionList.b bVarC = RegionList.c(strArrSplit[8], strArrSplit[9], jR);
                                        if (bVarC != null) {
                                            long j = bVarC.f356b + jR;
                                            StringBuilder sb2 = new StringBuilder();
                                            z = z2;
                                            try {
                                                sb2.append("Fix: ");
                                                sb2.append(Long.toHexString(h2Var.f672a));
                                                sb2.append(" -> ");
                                                sb2.append(Long.toHexString(j));
                                                sb2.append("; ");
                                                sb2.append(strArrSplit[8]);
                                                sb2.append(' ');
                                                sb2.append(strArrSplit[9]);
                                                sb2.append(' ');
                                                sb2.append(Long.toHexString(jR));
                                                sb2.append("; ");
                                                sb2.append(bVarC.f());
                                                sb2.append(' ');
                                                sb2.append(bVarC.a());
                                                e1.d(sb2.toString());
                                                h2Var.f672a = j;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                line = line;
                                                i5 = i5;
                                                c2 = 0;
                                                e1.s("Failed parse line: '" + line + '\'', th);
                                                i4 = i5;
                                                z2 = z;
                                                i3 = 1;
                                            }
                                        }
                                    }
                                    z = z2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    z = z2;
                                }
                            }
                            if (z3) {
                                try {
                                    h2Var.a();
                                } catch (Throwable th4) {
                                    th = th4;
                                    c2 = 0;
                                    e1.s("Failed parse line: '" + line + '\'', th);
                                    i4 = i5;
                                    z2 = z;
                                    i3 = 1;
                                }
                            }
                            c2 = 0;
                            try {
                                savedListAdapter.b(h2Var, (byte) 0, false);
                            } catch (Throwable th5) {
                                th = th5;
                                e1.s("Failed parse line: '" + line + '\'', th);
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            z = z2;
                            line = line;
                            i5 = i5;
                        }
                    }
                    i4 = i5;
                    z2 = z;
                    i3 = 1;
                }
                z = z2;
                i5 = i5;
                i4 = i5;
                z2 = z;
                i3 = 1;
            } catch (OutOfMemoryError e2) {
                e1.s("OOM on load list", e2);
            }
        }
        bufferedReader.close();
        savedListAdapter.notifyDataSetChanged();
        savedListAdapter.i();
        if (z4 || (i2 & 4) != 0) {
            return;
        }
        f.o(f.b().setCustomTitle(Tools.g0(R.string.load_list)).setMessage(b2.f(R.string.load_warning)).setNegativeButton(b2.f(R.string.ok), (DialogInterface.OnClickListener) null));
    }

    public static void d(int i, h2[] h2VarArr, String str, int i2) throws IOException {
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        e(new FileWriter(file), i, h2VarArr, i2);
    }

    public static void e(Writer writer, int i, h2[] h2VarArr, int i2) throws IOException {
        String strF;
        long j;
        String strA;
        boolean z = (i2 & 1) != 0;
        if (!z) {
            writer.write(i + "\n");
        }
        for (h2 h2Var : h2VarArr) {
            if (h2Var != null) {
                RegionList.b bVarB = RegionList.b(h2Var.f672a);
                if (bVarB == null || bVarB.a().length() == 0) {
                    strF = "";
                    j = 0;
                    strA = "";
                } else {
                    strF = bVarB.f();
                    strA = bVarB.a();
                    j = h2Var.f672a - bVarB.f356b;
                }
                StringBuilder sb = new StringBuilder();
                if (z) {
                    sb.append(RegionList.a(h2Var.f672a));
                    sb.append("; ");
                    sb.append(h2Var.F());
                    sb.append("; ");
                    sb.append(h2Var.b0());
                    sb.append("; ");
                    sb.append(h2Var.J());
                    sb.append("; ");
                    sb.append(h2Var.u());
                } else {
                    sb.append(a(h2Var.b0()));
                    sb.append('|');
                    sb.append(Long.toHexString(h2Var.f672a));
                    sb.append('|');
                    sb.append(Integer.toHexString(h2Var.f674c));
                    sb.append('|');
                    sb.append(Long.toHexString(h2Var.f673b));
                    sb.append('|');
                    sb.append(h2Var.m ? '1' : '0');
                    sb.append('|');
                    sb.append((int) h2Var.n);
                    sb.append('|');
                    sb.append(Long.toHexString(h2Var.o));
                    sb.append('|');
                    sb.append(Long.toHexString(h2Var.p));
                    sb.append('|');
                    sb.append(a(strF));
                    sb.append('|');
                    sb.append(a(strA));
                    sb.append('|');
                    sb.append(Long.toHexString(j));
                }
                sb.append("\n");
                writer.write(sb.toString());
            }
        }
        writer.close();
    }

    private static boolean f(String str) {
        try {
            SharedPreferences sharedPreferencesA = MainService.instance.a(str, 0);
            int i = sharedPreferencesA.getInt("size", 0);
            h2[] h2VarArr = new h2[i];
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    h2VarArr[i2] = new h2(sharedPreferencesA.getLong(i2 + "-address", 0L), sharedPreferencesA.getLong(i2 + "-data", 0L), sharedPreferencesA.getInt(i2 + "-flags", 4), sharedPreferencesA.getString(i2 + "-name", null), sharedPreferencesA.getBoolean(i2 + "-freeze", false), (byte) sharedPreferencesA.getInt(i2 + "-freezeType", 0), sharedPreferencesA.getLong(i2 + "-freezeFrom", 0L), sharedPreferencesA.getLong(i2 + "-freezeTo", 0L));
                } catch (Exception e2) {
                    e1.s("Failed load item: " + i2, e2);
                }
            }
            int i3 = sharedPreferencesA.getInt("pid", 0);
            int i4 = 0;
            while (i4 < 10) {
                String strB = v1.b(null, "save-path");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(i4 == 0 ? "" : Integer.valueOf(i4 + 45));
                sb.append(".txt");
                File file = new File(strB, sb.toString());
                if (!file.exists()) {
                    try {
                        d(i3, h2VarArr, file.getAbsolutePath(), 0);
                        if (file.exists()) {
                            return true;
                        }
                    } catch (IOException e3) {
                        e1.s("Failed save saved list", e3);
                    }
                }
                i4++;
            }
        } catch (Exception e4) {
            e1.s("Failed load saved list", e4);
        }
        return false;
    }

    public static void g() {
        String[] list;
        File parentFile = x2.g("tmp").getParentFile();
        if (parentFile.exists() && (list = parentFile.list()) != null) {
            for (String str : list) {
                if (str != null && !str.endsWith("_preferences.xml") && str.endsWith(".xml")) {
                    String strSubstring = str.substring(0, str.length() - 4);
                    if (!strSubstring.equals(MainService.G0) && !strSubstring.equals("DefaultStorage")) {
                        e1.d("Try convert '" + strSubstring + "'.");
                        if (f(strSubstring)) {
                            e1.d("All ok - remove '" + strSubstring + "'.");
                            new File(parentFile, str).delete();
                        }
                    }
                }
            }
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        Button button = ((AlertDialog) dialogInterface).getButton(i);
        if (button != null) {
            onClick(button);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        android.widget.EditText editText = this.f688a;
        if (editText != null) {
            v1.c(editText.getText().toString(), "save-path", "-list", ".txt");
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (view == null || view.getId() != R.id.as_text) {
            return false;
        }
        f.o(f.b().setMessage(b2.f(R.string.as_text_help)).setNegativeButton(b2.f(R.string.ok), (DialogInterface.OnClickListener) null));
        return true;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Tools.s1(dialogInterface, -1, null, this);
        Tools.s1(dialogInterface, -3, -3, this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        android.widget.EditText editText = this.f688a;
        if (view == null || editText == null) {
            return;
        }
        String strTrim = editText.getText().toString().trim();
        if (Tools.f1(strTrim)) {
            int i = 0;
            boolean z = this.f693f == null;
            if (!z || Tools.a1(strTrim)) {
                y0.b(strTrim, 4);
                if (z) {
                    MainService.instance.Q();
                    RadioGroup radioGroup = this.f689b;
                    if (radioGroup == null) {
                        return;
                    }
                    int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                    h = checkedRadioButtonId;
                    switch (checkedRadioButtonId) {
                        case R.id.mode_1 /* 2131034332 */:
                            i = 2;
                            break;
                        case R.id.mode_2 /* 2131034333 */:
                            break;
                        default:
                            i = 3;
                            break;
                    }
                    if (view.getTag() instanceof Integer) {
                        i |= 8;
                    }
                    try {
                        b(this.f692e.f1437f, strTrim, i);
                        Tools.D(this.f691d);
                        c2 c2Var = MainService.instance.f216f;
                        if (c2Var != null) {
                            c2Var.write("gg.loadList(");
                            Script.Consts.d(c2Var, strTrim);
                            c2Var.write(", ");
                            Script.Consts.a(c2Var, c2Var.f697c.f375e, i);
                            c2Var.write(")\n");
                            return;
                        }
                        return;
                    } catch (IOException e2) {
                        e = e2;
                        str = "Failed load list";
                    }
                } else {
                    CheckBox checkBox = this.f690c;
                    if (checkBox == null) {
                        return;
                    }
                    try {
                        boolean zIsChecked = checkBox.isChecked();
                        d(this.f692e.f1437f, this.f693f, strTrim, zIsChecked ? 1 : 0);
                        Tools.D(this.f691d);
                        c2 c2Var2 = MainService.instance.f216f;
                        if (c2Var2 != null) {
                            if (this.f694g) {
                                c2Var2.write("\nlocal prev = gg.getListItems()\n");
                                c2Var2.write("gg.clearList()\n");
                                c2Var2.write("local t = ");
                                b0.n(c2Var2, true);
                                c2Var2.write("gg.addListItems(t)\n");
                                c2Var2.write("t = nil\n");
                            }
                            c2Var2.write("gg.saveList(");
                            Script.Consts.d(c2Var2, strTrim);
                            c2Var2.write(", ");
                            Script.Consts.a(c2Var2, c2Var2.f697c.f376f, zIsChecked ? 1 : 0);
                            c2Var2.write(")");
                            if (this.f694g) {
                                c2Var2.write("\ngg.clearList()\n");
                                c2Var2.write("gg.addListItems(prev)\n");
                                c2Var2.write("prev = nil\n");
                            }
                            c2Var2.write("\n");
                            return;
                        }
                        return;
                    } catch (IOException e3) {
                        e = e3;
                        str = "Failed save list";
                    }
                }
                e1.s(str, e);
                Tools.J1(e.getMessage());
            }
        }
    }
}
