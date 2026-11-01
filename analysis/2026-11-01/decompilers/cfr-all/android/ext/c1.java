/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.DialogInterface$OnShowListener
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLongClickListener
 *  android.widget.CheckBox
 *  android.widget.EditText
 *  android.widget.RadioButton
 *  android.widget.RadioGroup
 *  android.widget.TextView
 */
package android.ext;

import a.d;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.ext.EditTextPath;
import android.ext.InternalKeyboard;
import android.ext.MainService;
import android.ext.RegionList;
import android.ext.Script;
import android.ext.Tools;
import android.ext.b0;
import android.ext.b2;
import android.ext.c2;
import android.ext.e1;
import android.ext.f;
import android.ext.h2;
import android.ext.t1;
import android.ext.v1;
import android.ext.x2;
import android.ext.y0;
import android.ext.z1;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class c1
implements DialogInterface.OnClickListener,
DialogInterface.OnShowListener,
DialogInterface.OnDismissListener,
View.OnClickListener,
View.OnLongClickListener {
    private static int h = -1;
    private EditText a;
    private RadioGroup b;
    private CheckBox c;
    private AlertDialog d;
    private z1.d e;
    private h2[] f;
    boolean g = false;

    /*
     * Enabled aggressive block sorting
     */
    public c1(z1.d object, h2[] view) {
        RadioGroup radioGroup;
        if (object == null) {
            android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(2131296750)).setMessage((CharSequence)b2.f(2131296806)).setNegativeButton((CharSequence)b2.f(2131296836), null));
            return;
        }
        if (view != null && ((View)view).length == 0) {
            android.ext.f.o(android.ext.f.b().setMessage((CharSequence)b2.f(2131296403)).setNegativeButton((CharSequence)b2.f(2131296836), null));
            return;
        }
        MainService.instance.i.W();
        this.e = object;
        this.f = view;
        int n3 = 1;
        boolean bl = view == null;
        view = a.d.f(2131099669, null);
        object = (TextView)view.findViewById(2131034328);
        int n4 = bl ? 2131296751 : 2131296919;
        object.setText((CharSequence)b2.f(n4));
        object = (EditTextPath)view.findViewById(2131034251);
        this.a = object;
        object.setText((CharSequence)v1.a("save-path", "-list", ".txt"));
        ((EditTextPath)object).setDataType(4);
        n4 = bl ? n3 : 2;
        ((EditTextPath)object).setPathType(n4);
        view.findViewById(2131034354).setTag(object);
        n4 = bl ? 2131034309 : 2131034386;
        view.findViewById(n4).setVisibility(0);
        this.b = radioGroup = (RadioGroup)view.findViewById(2131034330);
        n4 = h;
        if (n4 > 0) {
            radioGroup.check(n4);
        }
        ((RadioButton)view.findViewById(2131034331)).setText((CharSequence)b2.f(2131296745));
        ((RadioButton)view.findViewById(2131034332)).setText((CharSequence)b2.f(2131296746));
        ((RadioButton)view.findViewById(2131034333)).setText((CharSequence)b2.f(2131296747));
        radioGroup = (CheckBox)view.findViewById(2131034130);
        this.c = radioGroup;
        Tools.r1((View)radioGroup);
        radioGroup.setOnLongClickListener((View.OnLongClickListener)this);
        view = android.ext.f.b().setView(InternalKeyboard.e(view, false));
        n4 = bl ? 2131296744 : 2131296917;
        view = view.setPositiveButton((CharSequence)b2.f(n4), (DialogInterface.OnClickListener)this).setNegativeButton((CharSequence)b2.f(2131296311), null);
        if (bl && MainService.instance.t0.getCount() != 0) {
            view.setNeutralButton((CharSequence)b2.f(2131296283), (DialogInterface.OnClickListener)this);
        }
        view = view.create();
        this.d = view;
        android.ext.f.l((AlertDialog)view, this);
        android.ext.f.k((AlertDialog)view, this);
        android.ext.f.n((AlertDialog)view, (EditText)object);
    }

    private static String a(String string2) {
        return string2.replace('|', '/');
    }

    public static void b(int n3, String object, int n4) {
        if (!((File)(object = new File((String)object))).exists()) {
            return;
        }
        c1.c(new BufferedReader(new FileReader((File)object)), n3, n4);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(BufferedReader var0, int var1_1, int var2_2) {
        block24: {
            var4_3 = 0;
            var3_4 = (var2_2 & 1) != 0 ? 1 : 0;
            var6_5 = (var2_2 & 2) != 0;
            var15_6 = MainService.instance.t0;
            if ((var2_2 & 8) == 0) {
                var15_6.c();
            }
            var8_7 = 0;
            var5_8 = false;
            var7_9 = var3_4;
            var3_4 = var4_3;
            var4_3 = var8_7;
            while (true) {
                block27: {
                    block26: {
                        block25: {
                            var16_20 = var0.readLine();
                            if (var16_20 == null) break block24;
                            if (++var4_3 != 1) break block25;
                            {
                                catch (OutOfMemoryError var14_14) {
                                    break;
                                }
                                try {
                                    var8_7 = Integer.parseInt(var16_20);
                                    if (var8_7 == var1_1) {
                                        var5_8 = true;
                                        continue;
                                    }
                                    var5_8 = false;
                                }
                                catch (Throwable var17_22) {}
                                var14_13 = new StringBuilder();
                                var14_13.append("Failed parse pid: '");
                                var14_13.append(var16_20);
                                var14_13.append('\'');
                                e1.s(var14_13.toString(), var17_22);
                                continue;
                            }
                        }
                        var14_13 = var16_20.split("\\|");
                        var8_7 = ((String[])var14_13).length;
                        if (var8_7 < 10) {
                            var17_21 = new StringBuilder();
                            var17_21.append("Failed parse line: '");
                            var17_21.append(var16_20);
                            var17_21.append("' ");
                            var17_21.append(((Object)var14_13).length);
                            e1.p(var17_21.toString());
                            continue;
                        }
                        try {
                            var9_10 = t1.r((String)var14_13[1], 16);
                            var11_11 = t1.r((String)var14_13[3], 16);
                            var8_7 = Integer.parseInt((String)var14_13[2], 16);
                        }
                        catch (Throwable var14_15) {
                            ** GOTO lbl-1000
                        }
                        var18_23 = var14_13[var3_4];
                        var13_12 = var7_9 != 0 ? var14_13[4].equals("1") : false;
                        var17_21 = new h2(var9_10, var11_11, var8_7, (String)var18_23, var13_12, Byte.parseByte((String)var14_13[5]), t1.r((String)var14_13[6], 16), t1.r((String)var14_13[7], 16));
                        var9_10 = t1.r((String)var14_13[10], 16);
                        if (var5_8) break block27;
                        try {
                            var18_23 = RegionList.b(var17_21.a);
                            if (var18_23 == null || !var18_23.f().equals(var14_13[8]) || !var18_23.a().equals(var14_13[9]) || var17_21.a != var18_23.b + var9_10) break block26;
                            var19_24 = new StringBuilder();
                            var19_24.append("ASLR: ");
                            var19_24.append(Long.toHexString(var17_21.a));
                            var19_24.append(" ??? ");
                            var19_24.append(Long.toHexString(var18_23.b + var9_10));
                            var19_24.append("; ");
                            var19_24.append((String)var14_13[8]);
                            var19_24.append(' ');
                            var19_24.append((String)var14_13[9]);
                            var19_24.append(' ');
                            var19_24.append(Long.toHexString(var9_10));
                            var19_24.append("; ");
                            var19_24.append(var18_23.f());
                            var19_24.append(' ');
                            var19_24.append(var18_23.a());
                            e1.d(var19_24.toString());
                            break block27;
                        }
                        catch (Throwable var14_16) lbl-1000:
                        // 3 sources

                        {
                            while (true) {
                                var3_4 = 0;
                                ** GOTO lbl-1000
                                break;
                            }
                        }
                    }
                    var18_23 = RegionList.c((String)var14_13[8], (String)var14_13[9], var9_10);
                    if (var18_23 == null) break block27;
                    var11_11 = var18_23.b + var9_10;
                    var19_24 = new StringBuilder();
                    var19_24.append("Fix: ");
                    {
                        catch (Throwable var14_18) {
                            ** GOTO lbl-1000
                        }
                        ** try [egrp 7[TRYBLOCK] [14 : 671->841)] { 
lbl117:
                        // 1 sources

                        var19_24.append(Long.toHexString(var17_21.a));
                        var19_24.append(" -> ");
                        var19_24.append(Long.toHexString(var11_11));
                        var19_24.append("; ");
                        var19_24.append((String)var14_13[8]);
                        var19_24.append(' ');
                        var19_24.append((String)var14_13[9]);
                        var19_24.append(' ');
                        var19_24.append(Long.toHexString(var9_10));
                        var19_24.append("; ");
                        var19_24.append(var18_23.f());
                        var19_24.append(' ');
                        var19_24.append(var18_23.a());
                        e1.d(var19_24.toString());
                        var17_21.a = var11_11;
                    }
lbl147:
                    // 1 sources

                    catch (Throwable var14_17) {
                        ** continue;
                    }
                }
                if (var6_5) {
                    var17_21.a();
                }
                var3_4 = 0;
                var8_7 = 0;
                try {
                    var15_6.b((h2)var17_21, (byte)0, false);
                    continue;
                }
                catch (Throwable var14_19) {
                    var3_4 = var8_7;
                }
lbl-1000:
                // 3 sources

                {
                    var17_21 = new StringBuilder();
                    var17_21.append("Failed parse line: '");
                    var17_21.append(var16_20);
                    var17_21.append('\'');
                    e1.s(var17_21.toString(), (Throwable)var14_13);
                    continue;
                }
                break;
            }
            e1.s("OOM on load list", var14_14);
        }
        var0.close();
        var15_6.notifyDataSetChanged();
        var15_6.i();
        if (!var5_8 && (var2_2 & 4) == 0) {
            android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(2131296750)).setMessage((CharSequence)b2.f(2131296753)).setNegativeButton((CharSequence)b2.f(2131296836), null));
        }
    }

    public static void d(int n3, h2[] h2Array, String object, int n4) {
        File file = new File((String)object);
        if ((object = file.getParentFile()) != null) {
            ((File)object).mkdirs();
        }
        c1.e(new FileWriter(file), n3, h2Array, n4);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static void e(Writer writer, int n3, h2[] h2Array, int n4) {
        int n5 = 1;
        int n6 = 0;
        if ((n4 = (n4 & 1) != 0 ? n5 : 0) == 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n3);
            stringBuilder.append("\n");
            writer.write(stringBuilder.toString());
        }
        n5 = h2Array.length;
        n3 = n6;
        while (true) {
            if (n3 >= n5) {
                writer.close();
                return;
            }
            h2 h22 = h2Array[n3];
            if (h22 != null) {
                long l3;
                String string2;
                Object object = RegionList.b(h22.a);
                if (object != null && ((RegionList.b)object).a().length() != 0) {
                    string2 = ((RegionList.b)object).f();
                    String string3 = ((RegionList.b)object).a();
                    l3 = h22.a - ((RegionList.b)object).b;
                } else {
                    string2 = "";
                    l3 = 0L;
                    String string4 = "";
                }
                object = new StringBuilder();
                if (n4 != 0) {
                    ((StringBuilder)object).append(RegionList.a(h22.a));
                    ((StringBuilder)object).append("; ");
                    ((StringBuilder)object).append(h22.F());
                    ((StringBuilder)object).append("; ");
                    ((StringBuilder)object).append(h22.b0());
                    ((StringBuilder)object).append("; ");
                    ((StringBuilder)object).append(h22.J());
                    ((StringBuilder)object).append("; ");
                    ((StringBuilder)object).append(h22.u());
                } else {
                    void var9_10;
                    ((StringBuilder)object).append(c1.a(h22.b0()));
                    ((StringBuilder)object).append('|');
                    ((StringBuilder)object).append(Long.toHexString(h22.a));
                    ((StringBuilder)object).append('|');
                    ((StringBuilder)object).append(Integer.toHexString(h22.c));
                    ((StringBuilder)object).append('|');
                    ((StringBuilder)object).append(Long.toHexString(h22.b));
                    ((StringBuilder)object).append('|');
                    char c4 = h22.m ? (char)'1' : '0';
                    ((StringBuilder)object).append(c4);
                    ((StringBuilder)object).append('|');
                    ((StringBuilder)object).append(h22.n);
                    ((StringBuilder)object).append('|');
                    ((StringBuilder)object).append(Long.toHexString(h22.o));
                    ((StringBuilder)object).append('|');
                    ((StringBuilder)object).append(Long.toHexString(h22.p));
                    ((StringBuilder)object).append('|');
                    ((StringBuilder)object).append(c1.a(string2));
                    ((StringBuilder)object).append('|');
                    ((StringBuilder)object).append(c1.a((String)var9_10));
                    ((StringBuilder)object).append('|');
                    ((StringBuilder)object).append(Long.toHexString(l3));
                }
                ((StringBuilder)object).append("\n");
                writer.write(((StringBuilder)object).toString());
            }
            ++n3;
        }
    }

    /*
     * Exception decompiling
     */
    private static boolean f(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 442->454)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static void g() {
        File file = x2.g("tmp").getParentFile();
        if (!file.exists()) {
            return;
        }
        String[] stringArray = file.list();
        if (stringArray == null) {
            return;
        }
        for (String string2 : stringArray) {
            String string3;
            if (string2 == null || string2.endsWith("_preferences.xml") || !string2.endsWith(".xml") || (string3 = string2.substring(0, string2.length() - 4)).equals(MainService.G0) || string3.equals("DefaultStorage")) continue;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Try convert '");
            stringBuilder.append(string3);
            stringBuilder.append("'.");
            e1.d(stringBuilder.toString());
            if (!c1.f(string3)) continue;
            stringBuilder = new StringBuilder();
            stringBuilder.append("All ok - remove '");
            stringBuilder.append(string3);
            stringBuilder.append("'.");
            e1.d(stringBuilder.toString());
            new File(file, string2).delete();
        }
    }

    public void onClick(DialogInterface dialogInterface, int n3) {
        if ((dialogInterface = ((AlertDialog)dialogInterface).getButton(n3)) != null) {
            this.onClick((View)dialogInterface);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onClick(View object) {
        void var1_4;
        Object object2 = this.a;
        if (object == null) return;
        if (object2 == null) {
            return;
        }
        if (!Tools.f1((String)(object2 = object2.getText().toString().trim()))) {
            return;
        }
        RadioGroup radioGroup = this.f;
        int n3 = 0;
        int n4 = radioGroup == null ? 1 : 0;
        if (n4 != 0 && !Tools.a1(object2)) {
            return;
        }
        y0.b((String)object2, 4);
        if (n4 != 0) {
            int n5;
            MainService.instance.Q();
            radioGroup = this.b;
            if (radioGroup == null) {
                return;
            }
            h = n5 = radioGroup.getCheckedRadioButtonId();
            n4 = n3;
            switch (n5) {
                default: {
                    n4 = 3;
                    break;
                }
                case 2131034332: {
                    n4 = 2;
                    break;
                }
                case 2131034333: 
            }
            n3 = n4;
            if (object.getTag() instanceof Integer) {
                n3 = n4 | 8;
            }
            try {
                c1.b(this.e.f, (String)object2, n3);
                Tools.D((DialogInterface)this.d);
                object = MainService.instance.f;
                if (object == null) return;
                ((c2)object).write("gg.loadList(");
                Script.Consts.d((Writer)object, (String)object2);
                ((c2)object).write(", ");
                Script.Consts.a((Writer)object, ((c2)object).c.e, n3);
                ((c2)object).write(")\n");
                return;
            }
            catch (IOException iOException) {
                object2 = "Failed load list";
            }
        } else {
            block18: {
                block17: {
                    object = this.c;
                    if (object == null) {
                        return;
                    }
                    try {
                        n4 = object.isChecked();
                        c1.d(this.e.f, this.f, (String)object2, n4);
                        Tools.D((DialogInterface)this.d);
                        object = MainService.instance.f;
                        if (object == null) return;
                        if (!this.g) break block17;
                        ((c2)object).write("\nlocal prev = gg.getListItems()\n");
                        ((c2)object).write("gg.clearList()\n");
                        ((c2)object).write("local t = ");
                        b0.n((c2)object, true);
                        ((c2)object).write("gg.addListItems(t)\n");
                        ((c2)object).write("t = nil\n");
                    }
                    catch (IOException iOException) {
                        break block18;
                    }
                }
                ((c2)object).write("gg.saveList(");
                Script.Consts.d((Writer)object, (String)object2);
                ((c2)object).write(", ");
                Script.Consts.a((Writer)object, ((c2)object).c.f, n4);
                ((c2)object).write(")");
                if (this.g) {
                    ((c2)object).write("\ngg.clearList()\n");
                    ((c2)object).write("gg.addListItems(prev)\n");
                    ((c2)object).write("prev = nil\n");
                }
                ((c2)object).write("\n");
                return;
            }
            object2 = "Failed save list";
        }
        e1.s((String)object2, (Throwable)var1_4);
        Tools.J1(var1_4.getMessage());
    }

    public void onDismiss(DialogInterface dialogInterface) {
        dialogInterface = this.a;
        if (dialogInterface != null) {
            v1.c(dialogInterface.getText().toString(), "save-path", "-list", ".txt");
        }
    }

    public boolean onLongClick(View view) {
        if (view == null) {
            return false;
        }
        if (view.getId() != 2131034130) {
            return false;
        }
        android.ext.f.o(android.ext.f.b().setMessage((CharSequence)b2.f(2131296288)).setNegativeButton((CharSequence)b2.f(2131296836), null));
        return true;
    }

    public void onShow(DialogInterface dialogInterface) {
        Tools.s1(dialogInterface, -1, null, this);
        Tools.s1(dialogInterface, -3, -3, this);
    }
}

