/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.ext.Config;
import android.ext.MainService;
import android.ext.Script;
import android.ext.Tools;
import android.ext.b0;
import android.ext.b2;
import android.ext.c;
import android.ext.c2;
import android.ext.e1;
import android.ext.f;
import android.ext.h2;
import android.ext.i2;
import android.ext.l0;
import android.ext.n1;
import android.ext.p1;
import android.ext.t1;
import android.ext.u2;
import android.ext.v0;
import android.ext.x0;
import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.AdapterView;
import d.a;
import d.e;
import java.util.ArrayList;
import java.util.List;

public class EditorListener
extends p1
implements AdapterView.OnItemClickListener {
    private final boolean f;

    public EditorListener() {
        this(false);
    }

    public EditorListener(boolean bl) {
        super(2131296398, 2130968655);
        this.f = bl;
    }

    @Override
    public void onClick(View view) {
        new b(this).onClick(view);
    }

    public void onItemClick(AdapterView adapterView, View view, int n3, long l3) {
        new b(this).onItemClick(adapterView, view, n3, l3);
    }

    private class b
    implements View.OnClickListener,
    AdapterView.OnItemClickListener,
    DialogInterface.OnClickListener,
    DialogInterface.OnShowListener,
    DialogInterface.OnDismissListener {
        private AlertDialog a;
        private boolean b;
        private boolean c;
        private int d;
        private List e;
        int f;
        int g;
        private l0 h;
        final EditorListener i;

        private b(EditorListener editorListener) {
            this.i = editorListener;
            this.c = false;
            this.d = 0;
            this.e = null;
            this.f = 0;
            this.g = 0;
        }

        /*
         * Unable to fully structure code
         * Could not resolve type clashes
         */
        private boolean a(View var1_1) {
            var3_2 = var1_1 /* !! */ .getId();
            var2_3 = ';';
            block0 : switch (var3_2) {
                default: {
                    var1_1 /* !! */  = null;
                    break;
                }
                case 2131034261: {
                    var13_4 = new StringBuilder();
                    var4_8 = this.e.size();
                    var3_2 = 0;
                    while (true) {
                        var1_1 /* !! */  = var13_4;
                        if (var3_2 >= var4_8) break block0;
                        var1_1 /* !! */  = (c)this.e.get(var3_2);
                        if (var3_2 != 0) {
                            var13_4.append(';');
                        }
                        var13_4.append(var1_1 /* !! */ .J());
                        ++var3_2;
                    }
                }
                case 2131034259: 
                case 2131034260: {
                    var13_5 = new StringBuilder();
                    var4_9 = var1_1 /* !! */ .getId() == 2131034260 ? 1 : 0;
                    if (var4_9 != 0) {
                        var2_3 = ':';
                    }
                    var13_5.append(var2_3);
                    if (var4_9 == 0 && this.h.c().c != 1) {
                        if (this.h.c().c == 2) {
                            var5_12 = this.e.size();
                            var1_1 /* !! */  = (View)new char[var5_12];
                            var9_17 = 0L;
                            var3_2 = 0;
                            while (true) {
                                var4_9 = var5_12;
                                if (var3_2 >= var5_12) break;
                                var14_22 = (c)this.e.get(var3_2);
                                if (var9_17 != 0L && var9_17 + 2L != var14_22.a) {
                                    var4_9 = var3_2;
                                    break;
                                }
                                var9_17 = var14_22.a;
                                var1_1 /* !! */ [var3_2] = (View)((char)var14_22.b);
                                ++var3_2;
                            }
                            var13_5.append(new String((char[])var1_1 /* !! */ , 0, var4_9));
                            var1_1 /* !! */  = var13_5;
                            break;
                        }
                        var1_1 /* !! */  = var13_5;
                        if (this.h.c().c != 4) break;
                        var5_13 = this.e.size();
                        var14_23 = new char[var5_13 * 2];
                        var9_18 = 0L;
                        var3_2 = 0;
                        while (true) {
                            var4_9 = var5_13;
                            if (var3_2 >= var5_13) break;
                            var1_1 /* !! */  = (c)this.e.get(var3_2);
                            if (var9_18 != 0L && var9_18 + 4L != var1_1 /* !! */ .a) {
                                var4_9 = var3_2;
                                break;
                            }
                            var9_18 = var1_1 /* !! */ .a;
                            var4_9 = var3_2 * 2;
                            var11_27 = var1_1 /* !! */ .b;
                            var14_23[var4_9] = (char)var11_27;
                            var14_23[var4_9 + 1] = (char)(var11_27 >> 16);
                            ++var3_2;
                        }
                        var1_1 /* !! */  = new String(var14_23, 0, var4_9 * 2);
lbl71:
                        // 2 sources

                        while (true) {
                            var13_5.append((String)var1_1 /* !! */ );
                            var1_1 /* !! */  = var13_5;
                            break block0;
                            break;
                        }
                    }
                    var6_28 = this.e.size();
                    var14_24 = new byte[var6_28];
                    var9_19 = 0L;
                    var3_2 = 0;
                    while (true) {
                        var5_14 = var6_28;
                        if (var3_2 >= var6_28) break;
                        var1_1 /* !! */  = (c)this.e.get(var3_2);
                        if (var9_19 != 0L && var9_19 + 1L != var1_1 /* !! */ .a) {
                            var5_14 = var3_2;
                            break;
                        }
                        var9_19 = var1_1 /* !! */ .a;
                        var14_24[var3_2] = (byte)var1_1 /* !! */ .b;
                        ++var3_2;
                    }
                    var1_1 /* !! */  = new String(var14_24, 0, var5_14, t1.i(var4_9 ^ true));
                    ** continue;
                }
                case 2131034256: 
                case 2131034257: 
                case 2131034258: {
                    var13_6 = new StringBuilder();
                    var13_6.append('Q');
                    var13_6.append(' ');
                    var5_15 = var1_1 /* !! */ .getId();
                    var4_10 = this.e.size();
                    var1_1 /* !! */  = (View)new byte[var4_10];
                    var9_20 = 0L;
                    for (var3_2 = 0; var3_2 < var4_10; ++var3_2) {
                        var14_25 = (c)this.e.get(var3_2);
                        if (var9_20 == 0L || var9_20 + 1L == var14_25.a) {
                            var9_20 = var14_25.a;
                            var1_1 /* !! */ [var3_2] = (View)((byte)var14_25.b);
                            continue;
                        }
                        ** GOTO lbl111
                    }
                    var3_2 = var4_10;
lbl111:
                    // 2 sources

                    var7_29 = var5_15 == 2131034257 || var5_15 == 2131034258;
                    var8_30 = var5_15 == 2131034256 || var5_15 == 2131034258;
                    x0.b(var13_6, 0, (byte[])var1_1 /* !! */ , var3_2, var7_29, var8_30, null);
                    var1_1 /* !! */  = var13_6;
                    break;
                }
                case 2131034255: {
                    var13_7 = new StringBuilder();
                    var13_7.append('h');
                    var4_11 = this.e.size();
                    var14_26 = x0.a;
                    var9_21 = 0L;
                    var3_2 = 0;
                    while (true) {
                        var1_1 /* !! */  = var13_7;
                        if (var3_2 >= var4_11) break block0;
                        var1_1 /* !! */  = (c)this.e.get(var3_2);
                        if (var9_21 != 0L && var9_21 + 1L != var1_1 /* !! */ .a) {
                            var1_1 /* !! */  = var13_7;
                            break block0;
                        }
                        var9_21 = var1_1 /* !! */ .a;
                        var13_7.append(' ');
                        var5_16 = (int)var1_1 /* !! */ .b;
                        var13_7.append(var14_26[(var5_16 & 240) >> 4]);
                        var13_7.append(var14_26[var5_16 & 15]);
                        ++var3_2;
                    }
                }
            }
            if (var1_1 /* !! */  != null) {
                this.h.s(var1_1 /* !! */ .toString());
            }
            var7_29 = var1_1 /* !! */  != null;
            return var7_29;
        }

        private void c(boolean bl, boolean bl2, String string2) {
            c2 c22;
            int n3;
            if (bl) {
                n3 = MainService.instance.H();
                if (n3 == 1 && MainService.instance.p0 == 1L) {
                    this.d = 1;
                } else if (n3 == 2 && MainService.instance.t0.getCount() == 1) {
                    this.d = 2;
                } else {
                    return;
                }
            }
            if (((n3 = this.d) == 1 || n3 == 2) && (c22 = MainService.instance.f) != null) {
                h2 h22 = this.h.g();
                if (this.d != 2 && !bl2) {
                    c22.write("revert = ");
                    b0.n(c22, true);
                    n3 = h22.c;
                    if ((n3 & 0x40000000) == 0x40000000) {
                        h22.c = n3 & 0xBFFFFFFF;
                        c22.write("local t = ");
                        b0.n(c22, true);
                        c22.write("for i, v in ipairs(t) do\n");
                        c22.write("\tif v.flags == ");
                        Script.Consts.a(c22, c22.c.b, h22.c);
                        c22.write(" then\n");
                        c22.write("\t\tv.value = ");
                        c22.write("v.value + ");
                        Script.Consts.c(c22, string2);
                        c22.write("\n");
                        c22.write("\tend\n");
                        c22.write("end\n");
                        c22.write("gg.setValues(t)\n");
                        c22.write("t = nil\n\n");
                    } else {
                        c22.write("gg.editAll(");
                        Script.Consts.c(c22, string2);
                        c22.write(", ");
                        Script.Consts.a(c22, c22.c.b, h22.c);
                        c22.write(")\n");
                    }
                } else {
                    c22.write("\nrevert = ");
                    if (this.d == 1) {
                        b0.n(c22, true);
                    } else {
                        c22.write("gg.getListItems()\n");
                    }
                    c22.write("local t = ");
                    if (this.d == 1) {
                        b0.n(c22, true);
                    } else {
                        c22.write("gg.getListItems()\n");
                    }
                    c22.write("for i, v in ipairs(t) do\n");
                    c22.write("\tif v.flags == ");
                    Script.Consts.a(c22, c22.c.b, h22.c);
                    c22.write(" then\n");
                    c22.write("\t\tv.value = ");
                    n3 = h22.c;
                    if ((n3 & 0x40000000) == 0x40000000) {
                        h22.c = n3 & 0xBFFFFFFF;
                        c22.write("v.value + ");
                    }
                    Script.Consts.c(c22, string2);
                    c22.write("\n");
                    if (this.d == 2 || h22.m) {
                        c22.write("\t\tv.freeze = ");
                        c22.write(Boolean.toString(h22.m));
                        c22.write("\n");
                        if (this.d == 2 || h22.n != 0) {
                            n3 = h22.n;
                            string2 = n3 != 0 ? (n3 != 1 ? (n3 != 2 ? (n3 != 3 ? Integer.toString(n3) : "gg.FREEZE_IN_RANGE") : "gg.FREEZE_MAY_DECREASE") : "gg.FREEZE_MAY_INCREASE") : "gg.FREEZE_NORMAL";
                            c22.write("\t\tv.freezeType = ");
                            c22.write(string2);
                            c22.write("\n");
                            if (h22.n == 3) {
                                c22.write("\t\tv.freezeFrom = ");
                                Script.Consts.c(c22, h22.c0(true));
                                c22.write("\n");
                                c22.write("\t\tv.freezeTo = ");
                                Script.Consts.c(c22, h22.c0(false));
                                c22.write("\n");
                            }
                        }
                    }
                    c22.write("\tend\n");
                    c22.write("end\n");
                    c22.write("gg.addListItems(t)\n");
                    c22.write("t = nil\n\n");
                }
            }
        }

        /*
         * Enabled aggressive block sorting
         */
        void b(c object) {
            int n3;
            Object object2;
            Object object3;
            Object object4;
            int n4;
            block32: {
                block28: {
                    int n5;
                    block31: {
                        block29: {
                            block30: {
                                n4 = 0;
                                this.b = false;
                                this.c = false;
                                if (object != null) break block29;
                                this.b = true;
                                object4 = MainService.instance.z();
                                if (Tools.L0(object4) == 0) {
                                    Tools.H1(2131296822);
                                    return;
                                }
                                if (this.e != null) break block28;
                                this.e = new ArrayList();
                                if (!(object4 instanceof boolean[])) break block30;
                                this.d = 3;
                                if (this.f == 0) {
                                    this.e = null;
                                    object = new SparseIntArray();
                                    new u2(android.ext.c.o(MainService.instance.N.q((boolean[])object4, (SparseIntArray)object)), (SparseIntArray)object, "0", b2.f(2131297030), new DialogInterface.OnClickListener(this){
                                        final b a;
                                        {
                                            this.a = b4;
                                        }

                                        public void onClick(DialogInterface object, int n3) {
                                            object = this.a;
                                            ((b)object).f = n3;
                                            ((b)object).b(null);
                                        }
                                    });
                                    return;
                                }
                                object3 = MainService.instance.N;
                                object2 = (boolean[])object4;
                                n5 = ((boolean[])object2).length;
                                break block31;
                            }
                            if (object4 instanceof e) {
                                this.d = 2;
                                object4 = (e)object4;
                                n5 = ((e)object4).l();
                                for (n3 = 0; n3 < n5; ++n3) {
                                    if (!((e)object4).a(n3)) continue;
                                    this.e.add((c)((e)object4).n(n3));
                                }
                                break block28;
                            } else {
                                if (!(object4 instanceof a)) {
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append("Obj is unknown: ");
                                    ((StringBuilder)object).append(object4);
                                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                                }
                                this.d = 1;
                                object4 = (a)object4;
                                n5 = ((a)object4).i();
                                for (n3 = 0; n3 < n5; ++n3) {
                                    if (!((a)object4).c(n3)) continue;
                                    this.e.add(((a)object4).f(n3, null));
                                }
                            }
                            break block28;
                        }
                        n4 = 0;
                        break block32;
                    }
                    for (n3 = 1; n3 < n5 - 1; ++n3) {
                        if (!object2[n3] || !((c)(object4 = new c(((n1)object3).e(n3), 0L, this.f))).V()) continue;
                        ((c)object4).b = MainService.instance.B(((c)object4).a, ((c)object4).c);
                        this.e.add(object4);
                    }
                    this.f = 0;
                }
                if ((object4 = this.e) != null) {
                    if (object4.size() == 0) {
                        Tools.H1(2131296822);
                        e1.d("It must never happen.");
                        return;
                    }
                    if (this.g == 0) {
                        object4 = new SparseIntArray();
                        object = this.e.iterator();
                        n3 = n4;
                        while (true) {
                            if (!object.hasNext()) {
                                new u2(android.ext.c.o(n3), (SparseIntArray)object4, "0", b2.f(2131297030), new DialogInterface.OnClickListener(this){
                                    final b a;
                                    {
                                        this.a = b4;
                                    }

                                    public void onClick(DialogInterface object, int n3) {
                                        object = this.a;
                                        ((b)object).g = n3;
                                        ((b)object).b(null);
                                    }
                                });
                                return;
                            }
                            n4 = ((c)object.next()).c;
                            n3 |= n4;
                            object4.put(n4, object4.get(n4) + 1);
                        }
                    }
                    n3 = 0;
                    while (n3 < this.e.size()) {
                        n4 = n3;
                        if (((c)this.e.get((int)n3)).c != this.g) {
                            this.e.remove(n3);
                            n4 = n3 - 1;
                        }
                        n3 = n4 + 1;
                    }
                    this.g = 0;
                    if (this.e.size() == 0) {
                        Tools.H1(2131296808);
                        object = new StringBuilder();
                        ((StringBuilder)object).append("It must never happen. ");
                        ((StringBuilder)object).append(this.g);
                        e1.d(((StringBuilder)object).toString());
                        return;
                    }
                    object4 = ((c)this.e.get(0)).c();
                    n4 = this.e.size();
                    object = object4;
                    n3 = n4;
                    if (n4 == 1) {
                        this.b = false;
                        object = object4;
                        n3 = n4;
                    }
                } else {
                    n3 = 0;
                }
                if (object == null) {
                    throw new NullPointerException("Something going wrong");
                }
                n4 = n3;
            }
            object4 = object;
            if (!this.b) {
                object4 = MainService.instance.t0.e(((c)object).a);
                if (object4 != null && ((c)object4).Q() == ((c)object).Q()) {
                    object4 = ((h2)object4).Y();
                    ((c)object4).b = ((c)object).b;
                    this.c = true;
                    object = object4;
                } else {
                    object = new h2((c)object);
                }
                object4 = object;
            }
            if (this.b) {
                ((c)object4).c = ((c)object4).Q();
            }
            n3 = this.b ? 2 : (this.c ? 0 : 1);
            this.h = object = new l0(n3, (c)object4);
            if (this.b) {
                object = i2.l;
                if (object == null || this.d != 1) {
                    object = ((c)object4).J();
                }
                this.h.s((String)object);
                this.h.q(this);
            } else if (this.c) {
                ((l0)object).l();
            }
            object3 = ((c)object4).u();
            object2 = this.h;
            object = this.b ? Tools.L1(b2.f(2131296395), n4, object3) : Tools.L1(b2.f(2131296397), ((c)object4).F(), object3);
            ((l0)object2).r(Tools.v((CharSequence)new SpannableString((CharSequence)object), (CharSequence)object3, ((c)object4).m()));
            object = android.ext.f.b().setView(this.h.j()).setPositiveButton((CharSequence)b2.f(2131297115), (DialogInterface.OnClickListener)this).setNegativeButton((CharSequence)b2.f(2131296805), null).create();
            this.a = object;
            if (!this.b) {
                object.setButton(-3, (CharSequence)b2.f(2131296514), (DialogInterface.OnClickListener)this);
            }
            android.ext.f.l((AlertDialog)object, this);
            android.ext.f.k((AlertDialog)object, this);
            android.ext.f.n((AlertDialog)object, this.h.f());
        }

        void d(c c4) {
            this.e = null;
            this.f = 0;
            this.g = 0;
            this.d = 0;
            this.b(c4);
        }

        public void onClick(DialogInterface object, int n3) {
            if (n3 != -1 && n3 != -2 && n3 == -3 && !this.b) {
                c c4 = this.h.c();
                MainService mainService = MainService.instance;
                object = !this.i.f ? null : Long.valueOf(c4.a);
                String string2 = c4.F();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(Tools.N1(2131296498));
                stringBuilder.append(": (");
                stringBuilder.append(c4);
                stringBuilder.append(')');
                mainService.L((Long)object, string2, stringBuilder.toString());
            }
        }

        /*
         * Exception decompiling
         */
        public void onClick(View var1_1) {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [13, 12 : 122->131)] java.lang.Throwable
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        }

        public void onDismiss(DialogInterface dialogInterface) {
            try {
                this.h.k();
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
        }

        public void onItemClick(AdapterView object, View object2, int n3, long l3) {
            object2 = object.getItemAtPosition(n3);
            if (object2 instanceof v0) {
                object = MainService.instance;
                object2 = (v0)object2;
                ((MainService)object).L(((v0)object2).b(), ((v0)object2).a(), Tools.N1(2131296493));
                return;
            }
            if ((object2 = object2 instanceof c ? (c)object2 : null) == null) {
                return;
            }
            if (object.getId() == 2131034317 && ((Config.B & 0x400) == 0 || Integer.bitCount(((c)object2).c) != 1)) {
                new u2(android.ext.c.p(127, ((c)object2).a), "0", b2.f(2131297030), new DialogInterface.OnClickListener(this, (c)object2){
                    final c a;
                    final b b;
                    {
                        this.b = b4;
                        this.a = c4;
                    }

                    public void onClick(DialogInterface object, int n3) {
                        object = this.a;
                        object.c = n3;
                        this.b.d((c)object);
                    }
                });
            } else {
                this.d((c)object2);
            }
        }

        public void onShow(DialogInterface dialogInterface) {
            Tools.t1(dialogInterface, -1, null, this, this.h.f());
        }
    }
}

