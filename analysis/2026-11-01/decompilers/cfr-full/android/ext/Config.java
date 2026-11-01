/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.d;
import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.ext.ConfigListAdapter;
import android.ext.EditText;
import android.ext.HexConverter;
import android.ext.InternalKeyboard;
import android.ext.MainService;
import android.ext.RegionList;
import android.ext.Script;
import android.ext.Tools;
import android.ext.b2;
import android.ext.c2;
import android.ext.e1;
import android.ext.f;
import android.ext.f1;
import android.ext.g2;
import android.ext.j2;
import android.ext.k;
import android.ext.n0;
import android.ext.t1;
import android.ext.y0;
import android.ext.z1;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;

public abstract class Config {
    public static volatile int A;
    public static volatile int B;
    public static volatile boolean C;
    public static volatile boolean D;
    public static volatile String E;
    public static volatile String F;
    public static volatile byte G;
    static a.e H;
    static volatile int[] a;
    public static final long[] b;
    public static volatile long c;
    public static volatile long d;
    public static volatile long e;
    public static volatile long f;
    public static volatile int g;
    public static volatile int h;
    public static volatile int i;
    public static volatile long j;
    public static volatile int k;
    public static volatile int l;
    public static volatile int m;
    public static volatile int n;
    public static volatile int o;
    public static volatile int p;
    public static volatile int q;
    public static volatile int r;
    public static volatile long s;
    public static volatile int t;
    public static volatile int u;
    public static volatile int v;
    public static volatile boolean vSpaceReal;
    public static volatile int w;
    public static volatile int x;
    public static volatile int y;
    public static volatile int z;

    static {
        b = new long[MainService.J0.length * 2];
        a = new int[]{114, 115, 116};
        H = new a.e();
        new r(2131034165, 2131296399, -1, "float-type", false);
        new r(2131034164, 2131296399, -1, "float-flags", false);
        new r(2131034176, 2131296399, 0, "kbd-small", false);
        new r(2131034204, 2131296399, 0, "time-jump-last", true);
        new r(2131034158, 2131296399, 0, "copy-params", false);
        new r(2131034375, 2131296399, 0, "record-logcat", false);
        new q(2131034166, 2131296485, 2131296774, 0, 600000000L, 33000, "freeze-interval", true, 2131296487);
        new q(2131034193, 2131296922, 2131296775, 100, 600000L, 1000, "saved-list-updates-interval", false, 2131296924);
        new q(2131034216, 2131297114, 2131296399, Integer.MIN_VALUE, 0xFFFFFFFFL, 0, "xor-key", true, true, false, 1){
            {
                this.e = true;
            }
        };
        new q(2131034168, 2131296682, 2131296399, 0, 100000L, 500, "history-limit", false);
        new OptionSeek(2131034173, 2131296688, 12, 0, "icons-size", false, 2131296689){
            private WeakReference m = new WeakReference<Object>(null);

            @Override
            protected void h() {
                super.h();
                SeekBar seekBar = (SeekBar)this.l.get();
                if (seekBar == null) {
                    return;
                }
                ImageView imageView = new ImageView(seekBar.getContext());
                imageView.setImageResource(2130968655);
                this.m = new WeakReference<ImageView>(imageView);
                Config.n(imageView, Config.e(seekBar.getProgress()));
                seekBar = seekBar.getParent();
                if (seekBar instanceof ViewGroup) {
                    ((ViewGroup)seekBar).addView((View)imageView);
                }
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int n3, boolean bl) {
                seekBar = (ImageView)this.m.get();
                if (seekBar == null) {
                    return;
                }
                Config.n((ImageView)seekBar, Config.e(n3));
            }
        };
        new s(2131034174, 2131296690, new int[]{2131296805, 2131297115}, 1, "ignore-unknown-chars", false, 2131296691);
        new s(2131034210, 2131297070, new int[]{2131296805, 2131297115}, 0, "use-notification", false, 2131297071);
        int n3 = Build.VERSION.SDK_INT >= 29 ? 1 : 0;
        new s(2131034157, 2131296335, new int[]{2131296706, 2131296955, 2131296354, 2131296284, 2131296260}, n3, "context-source", false);
        new s(2131034212, 2131297073, new int[]{2131296805, 2131297115}, 1, "use-sound-effects", false, 2131297074);
        new s(2131034402, 2131296399, new int[]{2131297107, 2131297104}, 0, "selinux", false);
        n3 = InternalKeyboard.a() ? 1 : 0;
        new s(2131034177, 2131296723, new int[]{2131296432, 2131296709}, n3, "use-internal-keyboard", false, 2131296725);
        new s(2131034201, 2131296272, new int[]{2131296805, 2131297115}, 0, "allow-suggestions", false, 2131296273);
        new s(2131034175, 2131296697, new int[]{2131296805, 2131297115}, 0, "use-indent", false);
        new s(2131034151, 2131296293, new int[]{2131296805, 2131297115}, 0, "use-autopause", false, 2131296294);
        new s(2131034150, 2131296257, new int[]{2131296973, 2131296518}, 0, "use-hardware-acceleration", false, 2131296258);
        new s(2131034195, 2131296965, new int[]{2131296813, 2131296402, 2131296404}, 2, "skip-memory", true);
        new s(2131034182, 2131296771, new int[]{2131296815, 2131296431, 2131296427}, 0, "memory-access", false){

            @Override
            public void b() {
                if (!f1.y()) {
                    return;
                }
                super.b();
            }
        };
        new s(2131034159, 2131296371, new int[]{2131296805, 2131297117}, 0, "method", false, 2131296527);
        new s(2131034153, 2131296310, new int[]{2131296815, 2131296274}, 0, "calls", false, 2131296524);
        new s(2131034215, 2131297096, new int[]{2131296815, 2131296274}, 0, "waitpid", false, 2131296667);
        new s(2131034162, 2131296445, new int[]{2131296805, 2131297115}, 0, "fast-freeze", true, 2131296607);
        new s(2131034163, 2131296452, new int[]{2131296499, 2131296495, 2131296501}, 2, "fill-toolbar", false);
        new s(2131034194, 2131296943, new int[]{2131296832, 2131296512, 2131296513}, 2, "search-helper", false);
        new s(2131034199, 2131296988, new int[]{2131296820, 2131296974, 2131296975}, 2, "speeds-params", false);
        new s(2131034192, 2131296902, new int[]{2131296805, 2131297115}, 1, "reset-on-exit", false);
        new s(2131034154, 2131296321, new int[]{2131296805, 2131297115}, 1, "check-libs", false);
        new s(2131034213, 2131297075, new int[]{2131296805, 2131297115}, 1, "visible-type", false, 2131297076);
        new s(2131034186, 2131296867, new int[]{2131296805, 2131296740, 2131296741, 2131296742}, 0, "prevent-unload", false, 2131296868){

            @Override
            public boolean e(DialogInterface dialogInterface, int n3) {
                boolean bl = super.e(dialogInterface, n3);
                if (bl && this.d == 3) {
                    android.ext.f.o(android.ext.f.c(Tools.f0()).setMessage((CharSequence)b2.f(2131296586)).setNegativeButton(2131296836, null));
                }
                return bl;
            }
        };
        new s(2131034187, 2131296872, new int[]{2131296783, 2131296782, 2131296779, 2131296832}, 3, "ptrace-bypass", true, 2131296873);
        new s(2131034205, 2131296961, new int[]{2131296805, 2131297115}, 0, "time-jump-panel", true){

            @Override
            public boolean e(DialogInterface dialogInterface, int n3) {
                boolean bl = super.e(dialogInterface, n3);
                if (bl) {
                    MainService.instance.j.z();
                }
                return bl;
            }
        };
        new s(2131034183, 2131296828, null, 0, "number-locale", false){

            /*
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            private String l(String string2) {
                Throwable throwable222;
                Object object;
                Object object2 = string2;
                if (string2.length() == 0) {
                    object2 = string2;
                    object = android.ext.k.c();
                    object2 = string2;
                    string2 = Tools.N1(2131296372);
                    object2 = object;
                } else {
                    object2 = string2;
                    object2 = object = android.ext.k.d(string2);
                }
                object = "";
                {
                    catch (Throwable throwable222) {}
                }
                try {
                    object = object2 = String.format((Locale)object2, "\n[%,.1f | %.2e]", -1234.0, -4.56E-78);
                }
                catch (Throwable throwable3) {
                    object2 = string2;
                    e1.a(throwable3);
                }
                object2 = string2;
                object2 = string2;
                StringBuilder stringBuilder = new StringBuilder();
                object2 = string2;
                stringBuilder.append(string2);
                object2 = string2;
                stringBuilder.append((String)object);
                object2 = string2;
                return stringBuilder.toString();
                e1.a(throwable222);
                return object2;
            }

            private String[] m() {
                return new String[]{"", "en_US", "in_ID", "ru_RU"};
            }

            @Override
            protected void d() {
                if (this.d <= 0) {
                    return;
                }
                int n3 = this.d;
                String[] stringArray = this.m();
                if (n3 >= stringArray.length) {
                    return;
                }
                android.ext.k.j(android.ext.k.d(stringArray[n3]));
            }

            @Override
            public boolean e(DialogInterface dialogInterface, int n3) {
                boolean bl = super.e(dialogInterface, n3);
                if (bl) {
                    ConfigListAdapter.m();
                }
                return bl;
            }

            @Override
            protected void i() {
                super.i();
                if (this.l == null) {
                    String[] stringArray = this.m();
                    CharSequence[] charSequenceArray = new CharSequence[stringArray.length];
                    for (int i3 = 0; i3 < stringArray.length; ++i3) {
                        charSequenceArray[i3] = this.l(stringArray[i3]);
                    }
                    this.l = charSequenceArray;
                }
            }
        };
        new s(2131034214, 2131297093, new int[]{2131296805, 2131297116}, 0, "vspace-root", false, 2131296666){
            private int n = 0;

            @Override
            public boolean e(DialogInterface dialogInterface, int n3) {
                if (n3 < 0) {
                    if (n3 == -2) {
                        this.d = 0;
                        Config.k();
                    }
                    if (vSpaceReal && this.n != this.d) {
                        ConfigListAdapter.m();
                    }
                    return false;
                }
                this.n = this.d;
                boolean bl = super.e(dialogInterface, n3);
                if (bl) {
                    if (n3 == 1) {
                        dialogInterface = android.ext.f.c(Tools.f0()).setCustomTitle(Tools.g0(this.a)).setMessage((CharSequence)b2.f(this.h)).setPositiveButton(2131296917, (DialogInterface.OnClickListener)this).setNegativeButton(2131296311, (DialogInterface.OnClickListener)this).create();
                        android.ext.f.m((AlertDialog)dialogInterface);
                        android.ext.f.l((AlertDialog)dialogInterface, new DialogInterface.OnShowListener(this, (AlertDialog)dialogInterface){
                            final AlertDialog a;
                            final l b;
                            {
                                this.b = l3;
                                this.a = alertDialog;
                            }

                            public void onShow(DialogInterface dialogInterface) {
                                Tools.u1(this.a);
                            }
                        });
                    } else if (vSpaceReal && this.n != this.d) {
                        ConfigListAdapter.m();
                    }
                }
                return bl;
            }
        };
        new s(2131034188, 2131296366, null, Integer.MAX_VALUE, "data-in-ram", false){

            private String l(int n3) {
                if (n3 == Integer.MAX_VALUE) {
                    return b2.f(2131297115);
                }
                if (n3 == 0) {
                    return b2.f(2131296805);
                }
                n3 = Math.round((float)n3 * 5.0f / 1024.0f);
                return Tools.L1(b2.f(2131296454), n3);
            }

            @Override
            protected void i() {
                super.i();
                if (this.m == null) {
                    int n3 = Tools.E0();
                    int n4 = n3 > 0 ? (int)Math.floor(Math.log((float)n3 / 5.0f) / Math.log(2.0)) - 8 : 0;
                    n3 = n4;
                    if (n4 <= 0) {
                        n3 = 7;
                    }
                    n4 = n3;
                    if (n3 >= 20) {
                        n4 = 20;
                    }
                    n3 = n4 + 2;
                    int[] nArray = new int[n3];
                    CharSequence[] charSequenceArray = new CharSequence[n3];
                    nArray[0] = 0;
                    charSequenceArray[0] = b2.f(2131296805);
                    n3 = n4 + 1;
                    nArray[n3] = Integer.MAX_VALUE;
                    charSequenceArray[n3] = b2.f(2131297115);
                    String string2 = b2.f(2131296454);
                    for (n3 = 1; n3 <= n4; ++n3) {
                        int n5;
                        nArray[n3] = n5 = 1 << n3 + 8;
                        charSequenceArray[n3] = Tools.L1(string2, Math.round((float)n5 * 5.0f / 1024.0f));
                    }
                    this.m = nArray;
                    this.l = charSequenceArray;
                    this.k = null;
                }
            }

            @Override
            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(Tools.N1(this.a));
                stringBuilder.append(": ");
                stringBuilder.append(this.l(this.d));
                return stringBuilder.toString();
            }
        };
        new s(2131034169, 2131296683, null, 0, "hot-key", false){

            @Override
            public void b() {
                if (!f1.y()) {
                    return;
                }
                super.b();
            }

            @Override
            protected void i() {
                super.i();
                int n3 = a.length;
                Object[] objectArray = this.m;
                if (objectArray == null || objectArray.length != n3 + 1) {
                    int n4 = n3 + 1;
                    int[] nArray = new int[n4];
                    objectArray = new CharSequence[n4];
                    n4 = 0;
                    nArray[0] = 0;
                    objectArray[0] = (int)b2.f(2131296805);
                    while (n4 < n3) {
                        int n5 = a[n4];
                        nArray[++n4] = n5;
                        objectArray[n4] = (int)Config.f(n5);
                    }
                    this.m = nArray;
                    this.l = (CharSequence[])objectArray;
                    this.k = null;
                }
            }

            @Override
            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(Tools.N1(this.a));
                stringBuilder.append(": ");
                stringBuilder.append(Config.f(this.d));
                return stringBuilder.toString();
            }
        };
        new OptionMultiChoice(2131034189, 2131296957, null, 0, "ranges", true){
            private CharSequence[] o;
            private CharSequence[] p;
            private int[] q;

            @Override
            public CharSequence a() {
                int[] nArray;
                if (this.m == null) {
                    this.i();
                }
                CharSequence[] charSequenceArray = new CharSequence[this.m.length * 2];
                int n3 = 0;
                for (int i3 = 0; i3 < (nArray = this.m).length; ++i3) {
                    int n4 = nArray[i3];
                    int n5 = n3;
                    if ((this.d & n4) == n4) {
                        n5 = n3;
                        if (n3 > 0) {
                            charSequenceArray[n3] = ",";
                            n5 = n3 + 1;
                        }
                        charSequenceArray[n5] = this.o[i3];
                    }
                    n3 = ++n5;
                }
                return Tools.x(Arrays.copyOf(charSequenceArray, n3));
            }

            @Override
            protected void d() {
                this.b = 262207;
            }

            @Override
            public boolean e(DialogInterface object, int n3) {
                boolean bl = super.e((DialogInterface)object, n3);
                if (bl && (object = MainService.instance.f) != null) {
                    ((c2)object).write("gg.setRanges(");
                    Script.Consts.a((Writer)object, ((c2)object).c.a, this.d);
                    ((c2)object).write(")\n");
                }
                return bl;
            }

            @Override
            protected void i() {
                CharSequence[] charSequenceArray;
                int n3;
                CharSequence[] charSequenceArray2;
                Object object;
                Object object2;
                super.i();
                if (this.m == null) {
                    object2 = new int[15];
                    object = new int[15];
                    charSequenceArray2 = new CharSequence[15];
                    object2[0] = 2;
                    object[0] = n3 = Tools.d0(2130837527);
                    charSequenceArray2[0] = Tools.t("Jh: Java heap", n3);
                    object2[1] = true;
                    object[1] = n3 = Tools.d0(2130837527);
                    charSequenceArray2[1] = Tools.t("Ch: C++ heap", n3);
                    object2[2] = 4;
                    object[2] = n3 = Tools.d0(2130837527);
                    charSequenceArray2[2] = Tools.t("Ca: C++ alloc", n3);
                    object2[3] = 8;
                    object[3] = n3 = Tools.d0(2130837527);
                    charSequenceArray2[3] = Tools.t("Cd: C++ .data", n3);
                    object2[4] = 16;
                    object[4] = n3 = Tools.d0(2130837527);
                    charSequenceArray2[4] = Tools.t("Cb: C++ .bss", n3);
                    object2[5] = 262144;
                    object[5] = n3 = Tools.d0(2130837527);
                    charSequenceArray2[5] = Tools.t("PS: PPSSPP", n3);
                    object2[6] = 32;
                    object[6] = n3 = Tools.d0(2130837527);
                    charSequenceArray2[6] = Tools.t("A: Anonymous", n3);
                    object2[7] = 65536;
                    object[7] = n3 = Tools.d0(2130837528);
                    charSequenceArray2[7] = Tools.t("J: Java", n3);
                    object2[8] = 64;
                    object[8] = n3 = Tools.d0(2130837528);
                    charSequenceArray2[8] = Tools.t("S: Stack", n3);
                    object2[9] = 524288;
                    object[9] = n3 = Tools.d0(2130837528);
                    charSequenceArray2[9] = Tools.t("As: Ashmem", n3);
                    object2[10] = 0x100000;
                    object[10] = n3 = Tools.d0(2130837528);
                    charSequenceArray2[10] = Tools.t("V: Video", n3);
                    object2[11] = -2080896;
                    object[11] = Tools.d0(2130837529);
                    charSequenceArray2[11] = Tools.t(b2.g("O: Other (__slow__)"), object[11]);
                    object2[12] = 131072;
                    object[12] = Tools.d0(2130837525);
                    charSequenceArray2[12] = Tools.t(b2.g("B: Bad (__dangerous__)"), object[12]);
                    object2[13] = 16384;
                    object[13] = Tools.d0(2130837526);
                    charSequenceArray2[13] = Tools.t(b2.g("Xa: Code app (__dangerous__)"), object[13]);
                    object2[14] = 32768;
                    object[14] = Tools.d0(2130837530);
                    charSequenceArray2[14] = Tools.t(b2.g("Xs: Code system (__dangerous__)"), object[14]);
                    charSequenceArray = new CharSequence[15];
                    for (n3 = 0; n3 < 15; ++n3) {
                        charSequenceArray[n3] = Tools.t(charSequenceArray2[n3].toString().split(":")[0], object[n3]);
                    }
                    this.q = object;
                    this.m = (int[])object2;
                    this.p = charSequenceArray2;
                    this.o = charSequenceArray;
                    this.k = null;
                    RegionList.k((int[])object2, charSequenceArray, object);
                }
                CharSequence[] charSequenceArray3 = new CharSequence[this.m.length];
                charSequenceArray2 = this.p;
                object = Tools.f0();
                for (n3 = 0; n3 < charSequenceArray2.length; ++n3) {
                    charSequenceArray = charSequenceArray2[n3].toString();
                    try {
                        object2 = new StringBuilder;
                        ((StringBuilder)object2)();
                        ((StringBuilder)object2).append((String)charSequenceArray);
                        ((StringBuilder)object2).append(" [");
                        ((StringBuilder)object2).append(Tools.U((Context)object, RegionList.d(n3)));
                        ((StringBuilder)object2).append(']');
                        object2 = ((StringBuilder)object2).toString();
                        charSequenceArray = object2;
                    }
                    catch (Throwable throwable) {
                        e1.a(throwable);
                        n0.h(Thread.currentThread(), throwable, false);
                    }
                    charSequenceArray3[n3] = Tools.t((CharSequence)charSequenceArray, this.q[n3]);
                }
                this.l = charSequenceArray3;
            }
        };
        new OptionMultiChoiceSh(2131034197, 2131296982, null, -1, "intercept", true, 21);
        new OptionMultiChoiceSh(2131034209, 2131297067, null, -520193, "unrand-intercept", true, 19);
        new OptionMultiChoice(2131034207, 2131297019, null, -1, "toolbars", false){

            @Override
            protected void i() {
                super.i();
                this.l(true);
            }
        };
        new OptionMultiChoice(2131034211, 2131296970, null, 0, "small-items", false, 2131296971){

            @Override
            protected void i() {
                super.i();
                if (this.j == null) {
                    this.j = new p.b(this){
                        final c a;
                        {
                            this.a = c4;
                        }

                        @Override
                        public void a(int n3) {
                            MainService.instance.e0();
                        }
                    };
                }
                this.l(true);
            }
        };
        new OptionMultiChoice(2131034152, 2131296296, null, 0, "backgrounds", false){

            @Override
            protected void i() {
                super.i();
                this.l(false);
            }
        };
        new OptionMultiChoice(2131034167, 2131296677, null, 0, "hide", true){

            @Override
            protected void i() {
                super.i();
                if (this.m == null) {
                    CharSequence charSequence = new StringBuilder();
                    charSequence.append(" (");
                    charSequence.append(b2.f(2131296967));
                    charSequence.append(')');
                    String string2 = charSequence.toString();
                    charSequence = new StringBuilder();
                    charSequence.append(1);
                    charSequence.append(string2);
                    charSequence = charSequence.toString();
                    CharSequence charSequence2 = new StringBuilder();
                    charSequence2.append(2);
                    charSequence2.append(string2);
                    charSequence2 = charSequence2.toString();
                    CharSequence charSequence3 = new StringBuilder();
                    charSequence3.append(3);
                    charSequence3.append(string2);
                    charSequence3 = charSequence3.toString();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(4);
                    stringBuilder.append(string2);
                    string2 = stringBuilder.toString();
                    this.m = new int[]{1, 2, 4, 8};
                    this.l = new CharSequence[]{charSequence, charSequence2, charSequence3, string2};
                    this.k = null;
                    if (this.j == null) {
                        this.j = new p.b(this){
                            final e a;
                            {
                                this.a = e4;
                            }

                            @Override
                            public void a(int n3) {
                                StringBuilder stringBuilder;
                                if ((n3 & 1) != 0) {
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(b2.f(2131296675));
                                } else {
                                    stringBuilder = null;
                                }
                                StringBuilder stringBuilder2 = stringBuilder;
                                if ((n3 & 8) != 0) {
                                    if (stringBuilder == null) {
                                        stringBuilder = new StringBuilder();
                                    } else {
                                        stringBuilder.append("\n\n");
                                    }
                                    stringBuilder.append(b2.f(2131296676));
                                    stringBuilder2 = stringBuilder;
                                }
                                if (stringBuilder2 != null) {
                                    android.ext.f.o(android.ext.f.b().setMessage((CharSequence)stringBuilder2.toString()).setPositiveButton(2131296836, null));
                                }
                            }
                        };
                    }
                }
            }
        };
        Config.h();
        C = false;
        vSpaceReal = false;
        D = false;
        E = "unknown";
        F = "unknown";
        G = 0;
    }

    public static Context a(Context object) {
        if (!(object instanceof o)) {
            object = new o((Context)object);
        }
        return object;
    }

    public static p b(int n3) {
        return (p)H.get(n3);
    }

    static View c(int n3, int n4, boolean bl) {
        StringBuilder stringBuilder;
        CharSequence charSequence = stringBuilder = null;
        if (bl) {
            Object object = MainService.instance.v0;
            object = object != null ? ((z1.d)object).b : null;
            charSequence = stringBuilder;
            if (object != null) {
                charSequence = new StringBuilder();
                charSequence.append('\"');
                charSequence.append((String)object);
                charSequence.append('\"');
                charSequence = charSequence.toString();
            }
        }
        return Tools.j0(b2.f(n3), charSequence, n4);
    }

    public static int d() {
        return Config.e(o);
    }

    public static int e(int n3) {
        return n3 * 2 + 24;
    }

    static String f(int n3) {
        CharSequence charSequence;
        switch (n3) {
            default: {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("UNKNOWN_");
                ((StringBuilder)charSequence).append(n3);
                charSequence = ((StringBuilder)charSequence).toString();
                break;
            }
            case 743: {
                charSequence = "BTN_TRIGGER_HAPPY40";
                break;
            }
            case 742: {
                charSequence = "BTN_TRIGGER_HAPPY39";
                break;
            }
            case 741: {
                charSequence = "BTN_TRIGGER_HAPPY38";
                break;
            }
            case 740: {
                charSequence = "BTN_TRIGGER_HAPPY37";
                break;
            }
            case 739: {
                charSequence = "BTN_TRIGGER_HAPPY36";
                break;
            }
            case 738: {
                charSequence = "BTN_TRIGGER_HAPPY35";
                break;
            }
            case 737: {
                charSequence = "BTN_TRIGGER_HAPPY34";
                break;
            }
            case 736: {
                charSequence = "BTN_TRIGGER_HAPPY33";
                break;
            }
            case 735: {
                charSequence = "BTN_TRIGGER_HAPPY32";
                break;
            }
            case 734: {
                charSequence = "BTN_TRIGGER_HAPPY31";
                break;
            }
            case 733: {
                charSequence = "BTN_TRIGGER_HAPPY30";
                break;
            }
            case 732: {
                charSequence = "BTN_TRIGGER_HAPPY29";
                break;
            }
            case 731: {
                charSequence = "BTN_TRIGGER_HAPPY28";
                break;
            }
            case 730: {
                charSequence = "BTN_TRIGGER_HAPPY27";
                break;
            }
            case 729: {
                charSequence = "BTN_TRIGGER_HAPPY26";
                break;
            }
            case 728: {
                charSequence = "BTN_TRIGGER_HAPPY25";
                break;
            }
            case 727: {
                charSequence = "BTN_TRIGGER_HAPPY24";
                break;
            }
            case 726: {
                charSequence = "BTN_TRIGGER_HAPPY23";
                break;
            }
            case 725: {
                charSequence = "BTN_TRIGGER_HAPPY22";
                break;
            }
            case 724: {
                charSequence = "BTN_TRIGGER_HAPPY21";
                break;
            }
            case 723: {
                charSequence = "BTN_TRIGGER_HAPPY20";
                break;
            }
            case 722: {
                charSequence = "BTN_TRIGGER_HAPPY19";
                break;
            }
            case 721: {
                charSequence = "BTN_TRIGGER_HAPPY18";
                break;
            }
            case 720: {
                charSequence = "BTN_TRIGGER_HAPPY17";
                break;
            }
            case 719: {
                charSequence = "BTN_TRIGGER_HAPPY16";
                break;
            }
            case 718: {
                charSequence = "BTN_TRIGGER_HAPPY15";
                break;
            }
            case 717: {
                charSequence = "BTN_TRIGGER_HAPPY14";
                break;
            }
            case 716: {
                charSequence = "BTN_TRIGGER_HAPPY13";
                break;
            }
            case 715: {
                charSequence = "BTN_TRIGGER_HAPPY12";
                break;
            }
            case 714: {
                charSequence = "BTN_TRIGGER_HAPPY11";
                break;
            }
            case 713: {
                charSequence = "BTN_TRIGGER_HAPPY10";
                break;
            }
            case 712: {
                charSequence = "BTN_TRIGGER_HAPPY9";
                break;
            }
            case 711: {
                charSequence = "BTN_TRIGGER_HAPPY8";
                break;
            }
            case 710: {
                charSequence = "BTN_TRIGGER_HAPPY7";
                break;
            }
            case 709: {
                charSequence = "BTN_TRIGGER_HAPPY6";
                break;
            }
            case 708: {
                charSequence = "BTN_TRIGGER_HAPPY5";
                break;
            }
            case 707: {
                charSequence = "BTN_TRIGGER_HAPPY4";
                break;
            }
            case 706: {
                charSequence = "BTN_TRIGGER_HAPPY3";
                break;
            }
            case 705: {
                charSequence = "BTN_TRIGGER_HAPPY2";
                break;
            }
            case 704: {
                charSequence = "BTN_TRIGGER_HAPPY1";
                break;
            }
            case 593: {
                charSequence = "KEY_BRIGHTNESS_MAX";
                break;
            }
            case 592: {
                charSequence = "KEY_BRIGHTNESS_MIN";
                break;
            }
            case 582: {
                charSequence = "KEY_VOICECOMMAND";
                break;
            }
            case 581: {
                charSequence = "KEY_SCREENSAVER";
                break;
            }
            case 580: {
                charSequence = "KEY_APPSELECT";
                break;
            }
            case 579: {
                charSequence = "KEY_CONTROLPANEL";
                break;
            }
            case 578: {
                charSequence = "KEY_JOURNAL";
                break;
            }
            case 577: {
                charSequence = "KEY_TASKMANAGER";
                break;
            }
            case 576: {
                charSequence = "KEY_BUTTONCONFIG";
                break;
            }
            case 560: {
                charSequence = "KEY_ALS_TOGGLE";
                break;
            }
            case 547: {
                charSequence = "BTN_DPAD_RIGHT";
                break;
            }
            case 546: {
                charSequence = "BTN_DPAD_LEFT";
                break;
            }
            case 545: {
                charSequence = "BTN_DPAD_DOWN";
                break;
            }
            case 544: {
                charSequence = "BTN_DPAD_UP";
                break;
            }
            case 542: {
                charSequence = "KEY_LIGHTS_TOGGLE";
                break;
            }
            case 541: {
                charSequence = "KEY_ATTENDANT_TOGGLE";
                break;
            }
            case 540: {
                charSequence = "KEY_ATTENDANT_OFF";
                break;
            }
            case 539: {
                charSequence = "KEY_ATTENDANT_ON";
                break;
            }
            case 538: {
                charSequence = "KEY_CAMERA_RIGHT";
                break;
            }
            case 537: {
                charSequence = "KEY_CAMERA_LEFT";
                break;
            }
            case 536: {
                charSequence = "KEY_CAMERA_DOWN";
                break;
            }
            case 535: {
                charSequence = "KEY_CAMERA_UP";
                break;
            }
            case 534: {
                charSequence = "KEY_CAMERA_ZOOMOUT";
                break;
            }
            case 533: {
                charSequence = "KEY_CAMERA_ZOOMIN";
                break;
            }
            case 532: {
                charSequence = "KEY_TOUCHPAD_OFF";
                break;
            }
            case 531: {
                charSequence = "KEY_TOUCHPAD_ON";
                break;
            }
            case 530: {
                charSequence = "KEY_TOUCHPAD_TOGGLE";
                break;
            }
            case 529: {
                charSequence = "KEY_WPS_BUTTON";
                break;
            }
            case 528: {
                charSequence = "KEY_CAMERA_FOCUS";
                break;
            }
            case 523: {
                charSequence = "KEY_NUMERIC_POUND";
                break;
            }
            case 522: {
                charSequence = "KEY_NUMERIC_STAR";
                break;
            }
            case 521: {
                charSequence = "KEY_NUMERIC_9";
                break;
            }
            case 520: {
                charSequence = "KEY_NUMERIC_8";
                break;
            }
            case 519: {
                charSequence = "KEY_NUMERIC_7";
                break;
            }
            case 518: {
                charSequence = "KEY_NUMERIC_6";
                break;
            }
            case 517: {
                charSequence = "KEY_NUMERIC_5";
                break;
            }
            case 516: {
                charSequence = "KEY_NUMERIC_4";
                break;
            }
            case 515: {
                charSequence = "KEY_NUMERIC_3";
                break;
            }
            case 514: {
                charSequence = "KEY_NUMERIC_2";
                break;
            }
            case 513: {
                charSequence = "KEY_NUMERIC_1";
                break;
            }
            case 512: {
                charSequence = "KEY_NUMERIC_0";
                break;
            }
            case 506: {
                charSequence = "KEY_BRL_DOT10";
                break;
            }
            case 505: {
                charSequence = "KEY_BRL_DOT9";
                break;
            }
            case 504: {
                charSequence = "KEY_BRL_DOT8";
                break;
            }
            case 503: {
                charSequence = "KEY_BRL_DOT7";
                break;
            }
            case 502: {
                charSequence = "KEY_BRL_DOT6";
                break;
            }
            case 501: {
                charSequence = "KEY_BRL_DOT5";
                break;
            }
            case 500: {
                charSequence = "KEY_BRL_DOT4";
                break;
            }
            case 499: {
                charSequence = "KEY_BRL_DOT3";
                break;
            }
            case 498: {
                charSequence = "KEY_BRL_DOT2";
                break;
            }
            case 497: {
                charSequence = "KEY_BRL_DOT1";
                break;
            }
            case 484: {
                charSequence = "KEY_FN_B";
                break;
            }
            case 483: {
                charSequence = "KEY_FN_S";
                break;
            }
            case 482: {
                charSequence = "KEY_FN_F";
                break;
            }
            case 481: {
                charSequence = "KEY_FN_E";
                break;
            }
            case 480: {
                charSequence = "KEY_FN_D";
                break;
            }
            case 479: {
                charSequence = "KEY_FN_2";
                break;
            }
            case 478: {
                charSequence = "KEY_FN_1";
                break;
            }
            case 477: {
                charSequence = "KEY_FN_F12";
                break;
            }
            case 476: {
                charSequence = "KEY_FN_F11";
                break;
            }
            case 475: {
                charSequence = "KEY_FN_F10";
                break;
            }
            case 474: {
                charSequence = "KEY_FN_F9";
                break;
            }
            case 473: {
                charSequence = "KEY_FN_F8";
                break;
            }
            case 472: {
                charSequence = "KEY_FN_F7";
                break;
            }
            case 471: {
                charSequence = "KEY_FN_F6";
                break;
            }
            case 470: {
                charSequence = "KEY_FN_F5";
                break;
            }
            case 469: {
                charSequence = "KEY_FN_F4";
                break;
            }
            case 468: {
                charSequence = "KEY_FN_F3";
                break;
            }
            case 467: {
                charSequence = "KEY_FN_F2";
                break;
            }
            case 466: {
                charSequence = "KEY_FN_F1";
                break;
            }
            case 465: {
                charSequence = "KEY_FN_ESC";
                break;
            }
            case 464: {
                charSequence = "KEY_FN";
                break;
            }
            case 451: {
                charSequence = "KEY_DEL_LINE";
                break;
            }
            case 450: {
                charSequence = "KEY_INS_LINE";
                break;
            }
            case 449: {
                charSequence = "KEY_DEL_EOS";
                break;
            }
            case 448: {
                charSequence = "KEY_DEL_EOL";
                break;
            }
            case 442: {
                charSequence = "KEY_IMAGES";
                break;
            }
            case 441: {
                charSequence = "KEY_10CHANNELSDOWN";
                break;
            }
            case 440: {
                charSequence = "KEY_10CHANNELSUP";
                break;
            }
            case 439: {
                charSequence = "KEY_MEDIA_REPEAT";
                break;
            }
            case 438: {
                charSequence = "KEY_CONTEXT_MENU";
                break;
            }
            case 437: {
                charSequence = "KEY_FRAMEFORWARD";
                break;
            }
            case 436: {
                charSequence = "KEY_FRAMEBACK";
                break;
            }
            case 435: {
                charSequence = "KEY_EURO";
                break;
            }
            case 434: {
                charSequence = "KEY_DOLLAR";
                break;
            }
            case 433: {
                charSequence = "KEY_LOGOFF";
                break;
            }
            case 432: {
                charSequence = "KEY_SPELLCHECK";
                break;
            }
            case 431: {
                charSequence = "KEY_DISPLAYTOGGLE";
                break;
            }
            case 430: {
                charSequence = "KEY_MESSENGER";
                break;
            }
            case 429: {
                charSequence = "KEY_ADDRESSBOOK";
                break;
            }
            case 428: {
                charSequence = "KEY_VOICEMAIL";
                break;
            }
            case 427: {
                charSequence = "KEY_NEWS";
                break;
            }
            case 426: {
                charSequence = "KEY_DATABASE";
                break;
            }
            case 425: {
                charSequence = "KEY_PRESENTATION";
                break;
            }
            case 424: {
                charSequence = "KEY_GRAPHICSEDITOR";
                break;
            }
            case 423: {
                charSequence = "KEY_SPREADSHEET";
                break;
            }
            case 422: {
                charSequence = "KEY_EDITOR";
                break;
            }
            case 421: {
                charSequence = "KEY_WORDPROCESSOR";
                break;
            }
            case 420: {
                charSequence = "KEY_ZOOMRESET";
                break;
            }
            case 419: {
                charSequence = "KEY_ZOOMOUT";
                break;
            }
            case 418: {
                charSequence = "KEY_ZOOMIN";
                break;
            }
            case 417: {
                charSequence = "KEY_GAMES";
                break;
            }
            case 416: {
                charSequence = "KEY_VIDEOPHONE";
                break;
            }
            case 415: {
                charSequence = "KEY_TWEN";
                break;
            }
            case 414: {
                charSequence = "KEY_TEEN";
                break;
            }
            case 413: {
                charSequence = "KEY_DIGITS";
                break;
            }
            case 412: {
                charSequence = "KEY_PREVIOUS";
                break;
            }
            case 411: {
                charSequence = "KEY_BREAK";
                break;
            }
            case 410: {
                charSequence = "KEY_SHUFFLE";
                break;
            }
            case 409: {
                charSequence = "KEY_SLOW";
                break;
            }
            case 408: {
                charSequence = "KEY_RESTART";
                break;
            }
            case 407: {
                charSequence = "KEY_NEXT";
                break;
            }
            case 406: {
                charSequence = "KEY_AB";
                break;
            }
            case 405: {
                charSequence = "KEY_LAST";
                break;
            }
            case 404: {
                charSequence = "KEY_FIRST";
                break;
            }
            case 403: {
                charSequence = "KEY_CHANNELDOWN";
                break;
            }
            case 402: {
                charSequence = "KEY_CHANNELUP";
                break;
            }
            case 401: {
                charSequence = "KEY_BLUE";
                break;
            }
            case 400: {
                charSequence = "KEY_YELLOW";
                break;
            }
            case 399: {
                charSequence = "KEY_GREEN";
                break;
            }
            case 398: {
                charSequence = "KEY_RED";
                break;
            }
            case 397: {
                charSequence = "KEY_CALENDAR";
                break;
            }
            case 396: {
                charSequence = "KEY_MEMO";
                break;
            }
            case 395: {
                charSequence = "KEY_LIST";
                break;
            }
            case 394: {
                charSequence = "KEY_DIRECTORY";
                break;
            }
            case 393: {
                charSequence = "KEY_VIDEO";
                break;
            }
            case 392: {
                charSequence = "KEY_AUDIO";
                break;
            }
            case 391: {
                charSequence = "KEY_MP3";
                break;
            }
            case 390: {
                charSequence = "KEY_AUX";
                break;
            }
            case 389: {
                charSequence = "KEY_DVD";
                break;
            }
            case 388: {
                charSequence = "KEY_TEXT";
                break;
            }
            case 387: {
                charSequence = "KEY_PLAYER";
                break;
            }
            case 386: {
                charSequence = "KEY_TUNER";
                break;
            }
            case 385: {
                charSequence = "KEY_RADIO";
                break;
            }
            case 384: {
                charSequence = "KEY_TAPE";
                break;
            }
            case 383: {
                charSequence = "KEY_CD";
                break;
            }
            case 382: {
                charSequence = "KEY_SAT2";
                break;
            }
            case 381: {
                charSequence = "KEY_SAT";
                break;
            }
            case 380: {
                charSequence = "KEY_VCR2";
                break;
            }
            case 379: {
                charSequence = "KEY_VCR";
                break;
            }
            case 378: {
                charSequence = "KEY_TV2";
                break;
            }
            case 377: {
                charSequence = "KEY_TV";
                break;
            }
            case 376: {
                charSequence = "KEY_PC";
                break;
            }
            case 375: {
                charSequence = "KEY_SCREEN";
                break;
            }
            case 374: {
                charSequence = "KEY_KEYBOARD";
                break;
            }
            case 373: {
                charSequence = "KEY_MODE";
                break;
            }
            case 372: {
                charSequence = "KEY_ZOOM";
                break;
            }
            case 371: {
                charSequence = "KEY_ANGLE";
                break;
            }
            case 370: {
                charSequence = "KEY_SUBTITLE";
                break;
            }
            case 369: {
                charSequence = "KEY_TITLE";
                break;
            }
            case 368: {
                charSequence = "KEY_LANGUAGE";
                break;
            }
            case 367: {
                charSequence = "KEY_MHP";
                break;
            }
            case 366: {
                charSequence = "KEY_PVR";
                break;
            }
            case 365: {
                charSequence = "KEY_EPG";
                break;
            }
            case 364: {
                charSequence = "KEY_FAVORITES";
                break;
            }
            case 363: {
                charSequence = "KEY_CHANNEL";
                break;
            }
            case 362: {
                charSequence = "KEY_PROGRAM";
                break;
            }
            case 361: {
                charSequence = "KEY_ARCHIVE";
                break;
            }
            case 360: {
                charSequence = "KEY_VENDOR";
                break;
            }
            case 359: {
                charSequence = "KEY_TIME";
                break;
            }
            case 358: {
                charSequence = "KEY_INFO";
                break;
            }
            case 357: {
                charSequence = "KEY_OPTION";
                break;
            }
            case 356: {
                charSequence = "KEY_POWER2";
                break;
            }
            case 355: {
                charSequence = "KEY_CLEAR";
                break;
            }
            case 354: {
                charSequence = "KEY_GOTO";
                break;
            }
            case 353: {
                charSequence = "KEY_SELECT";
                break;
            }
            case 352: {
                charSequence = "KEY_OK";
                break;
            }
            case 337: {
                charSequence = "BTN_GEAR_UP";
                break;
            }
            case 336: {
                charSequence = "BTN_WHEEL";
                break;
            }
            case 335: {
                charSequence = "BTN_TOOL_QUADTAP";
                break;
            }
            case 334: {
                charSequence = "BTN_TOOL_TRIPLETAP";
                break;
            }
            case 333: {
                charSequence = "BTN_TOOL_DOUBLETAP";
                break;
            }
            case 332: {
                charSequence = "BTN_STYLUS2";
                break;
            }
            case 331: {
                charSequence = "BTN_STYLUS";
                break;
            }
            case 330: {
                charSequence = "BTN_TOUCH";
                break;
            }
            case 328: {
                charSequence = "BTN_TOOL_QUINTTAP";
                break;
            }
            case 327: {
                charSequence = "BTN_TOOL_LENS";
                break;
            }
            case 326: {
                charSequence = "BTN_TOOL_MOUSE";
                break;
            }
            case 325: {
                charSequence = "BTN_TOOL_FINGER";
                break;
            }
            case 324: {
                charSequence = "BTN_TOOL_AIRBRUSH";
                break;
            }
            case 323: {
                charSequence = "BTN_TOOL_PENCIL";
                break;
            }
            case 322: {
                charSequence = "BTN_TOOL_BRUSH";
                break;
            }
            case 321: {
                charSequence = "BTN_TOOL_RUBBER";
                break;
            }
            case 320: {
                charSequence = "BTN_TOOL_PEN";
                break;
            }
            case 318: {
                charSequence = "BTN_THUMBR";
                break;
            }
            case 317: {
                charSequence = "BTN_THUMBL";
                break;
            }
            case 316: {
                charSequence = "BTN_MODE";
                break;
            }
            case 315: {
                charSequence = "BTN_START";
                break;
            }
            case 314: {
                charSequence = "BTN_SELECT";
                break;
            }
            case 313: {
                charSequence = "BTN_TR2";
                break;
            }
            case 312: {
                charSequence = "BTN_TL2";
                break;
            }
            case 311: {
                charSequence = "BTN_TR";
                break;
            }
            case 310: {
                charSequence = "BTN_TL";
                break;
            }
            case 309: {
                charSequence = "BTN_Z";
                break;
            }
            case 308: {
                charSequence = "BTN_Y";
                break;
            }
            case 307: {
                charSequence = "BTN_X";
                break;
            }
            case 306: {
                charSequence = "BTN_C";
                break;
            }
            case 305: {
                charSequence = "BTN_B";
                break;
            }
            case 304: {
                charSequence = "BTN_A";
                break;
            }
            case 303: {
                charSequence = "BTN_DEAD";
                break;
            }
            case 299: {
                charSequence = "BTN_BASE6";
                break;
            }
            case 298: {
                charSequence = "BTN_BASE5";
                break;
            }
            case 297: {
                charSequence = "BTN_BASE4";
                break;
            }
            case 296: {
                charSequence = "BTN_BASE3";
                break;
            }
            case 295: {
                charSequence = "BTN_BASE2";
                break;
            }
            case 294: {
                charSequence = "BTN_BASE";
                break;
            }
            case 293: {
                charSequence = "BTN_PINKIE";
                break;
            }
            case 292: {
                charSequence = "BTN_TOP2";
                break;
            }
            case 291: {
                charSequence = "BTN_TOP";
                break;
            }
            case 290: {
                charSequence = "BTN_THUMB2";
                break;
            }
            case 289: {
                charSequence = "BTN_THUMB";
                break;
            }
            case 288: {
                charSequence = "BTN_TRIGGER";
                break;
            }
            case 279: {
                charSequence = "BTN_TASK";
                break;
            }
            case 278: {
                charSequence = "BTN_BACK";
                break;
            }
            case 277: {
                charSequence = "BTN_FORWARD";
                break;
            }
            case 276: {
                charSequence = "BTN_EXTRA";
                break;
            }
            case 275: {
                charSequence = "BTN_SIDE";
                break;
            }
            case 274: {
                charSequence = "BTN_MIDDLE";
                break;
            }
            case 273: {
                charSequence = "BTN_RIGHT";
                break;
            }
            case 272: {
                charSequence = "BTN_LEFT";
                break;
            }
            case 265: {
                charSequence = "BTN_9";
                break;
            }
            case 264: {
                charSequence = "BTN_8";
                break;
            }
            case 263: {
                charSequence = "BTN_7";
                break;
            }
            case 262: {
                charSequence = "BTN_6";
                break;
            }
            case 261: {
                charSequence = "BTN_5";
                break;
            }
            case 260: {
                charSequence = "BTN_4";
                break;
            }
            case 259: {
                charSequence = "BTN_3";
                break;
            }
            case 258: {
                charSequence = "BTN_2";
                break;
            }
            case 257: {
                charSequence = "BTN_1";
                break;
            }
            case 256: {
                charSequence = "BTN_0";
                break;
            }
            case 248: {
                charSequence = "KEY_MICMUTE";
                break;
            }
            case 247: {
                charSequence = "KEY_RFKILL";
                break;
            }
            case 246: {
                charSequence = "KEY_WWAN";
                break;
            }
            case 245: {
                charSequence = "KEY_DISPLAY_OFF";
                break;
            }
            case 244: {
                charSequence = "KEY_BRIGHTNESS_AUTO";
                break;
            }
            case 243: {
                charSequence = "KEY_BRIGHTNESS_CYCLE";
                break;
            }
            case 242: {
                charSequence = "KEY_VIDEO_PREV";
                break;
            }
            case 241: {
                charSequence = "KEY_VIDEO_NEXT";
                break;
            }
            case 240: {
                charSequence = "KEY_UNKNOWN";
                break;
            }
            case 239: {
                charSequence = "KEY_UWB";
                break;
            }
            case 238: {
                charSequence = "KEY_WLAN";
                break;
            }
            case 237: {
                charSequence = "KEY_BLUETOOTH";
                break;
            }
            case 236: {
                charSequence = "KEY_BATTERY";
                break;
            }
            case 235: {
                charSequence = "KEY_DOCUMENTS";
                break;
            }
            case 234: {
                charSequence = "KEY_SAVE";
                break;
            }
            case 233: {
                charSequence = "KEY_FORWARDMAIL";
                break;
            }
            case 232: {
                charSequence = "KEY_REPLY";
                break;
            }
            case 231: {
                charSequence = "KEY_SEND";
                break;
            }
            case 230: {
                charSequence = "KEY_KBDILLUMUP";
                break;
            }
            case 229: {
                charSequence = "KEY_KBDILLUMDOWN";
                break;
            }
            case 228: {
                charSequence = "KEY_KBDILLUMTOGGLE";
                break;
            }
            case 227: {
                charSequence = "KEY_SWITCHVIDEOMODE";
                break;
            }
            case 226: {
                charSequence = "KEY_MEDIA";
                break;
            }
            case 225: {
                charSequence = "KEY_BRIGHTNESSUP";
                break;
            }
            case 224: {
                charSequence = "KEY_BRIGHTNESSDOWN";
                break;
            }
            case 223: {
                charSequence = "KEY_CANCEL";
                break;
            }
            case 222: {
                charSequence = "KEY_ALTERASE";
                break;
            }
            case 221: {
                charSequence = "KEY_SHOP";
                break;
            }
            case 220: {
                charSequence = "KEY_SPORT";
                break;
            }
            case 219: {
                charSequence = "KEY_FINANCE";
                break;
            }
            case 218: {
                charSequence = "KEY_CONNECT";
                break;
            }
            case 217: {
                charSequence = "KEY_SEARCH";
                break;
            }
            case 216: {
                charSequence = "KEY_CHAT";
                break;
            }
            case 215: {
                charSequence = "KEY_EMAIL";
                break;
            }
            case 214: {
                charSequence = "KEY_QUESTION";
                break;
            }
            case 213: {
                charSequence = "KEY_SOUND";
                break;
            }
            case 212: {
                charSequence = "KEY_CAMERA";
                break;
            }
            case 211: {
                charSequence = "KEY_HP";
                break;
            }
            case 210: {
                charSequence = "KEY_PRINT";
                break;
            }
            case 209: {
                charSequence = "KEY_BASSBOOST";
                break;
            }
            case 208: {
                charSequence = "KEY_FASTFORWARD";
                break;
            }
            case 207: {
                charSequence = "KEY_PLAY";
                break;
            }
            case 206: {
                charSequence = "KEY_CLOSE";
                break;
            }
            case 205: {
                charSequence = "KEY_SUSPEND";
                break;
            }
            case 204: {
                charSequence = "KEY_DASHBOARD";
                break;
            }
            case 203: {
                charSequence = "KEY_PROG4";
                break;
            }
            case 202: {
                charSequence = "KEY_PROG3";
                break;
            }
            case 201: {
                charSequence = "KEY_PAUSECD";
                break;
            }
            case 200: {
                charSequence = "KEY_PLAYCD";
                break;
            }
            case 194: {
                charSequence = "KEY_F24";
                break;
            }
            case 193: {
                charSequence = "KEY_F23";
                break;
            }
            case 192: {
                charSequence = "KEY_F22";
                break;
            }
            case 191: {
                charSequence = "KEY_F21";
                break;
            }
            case 190: {
                charSequence = "KEY_F20";
                break;
            }
            case 189: {
                charSequence = "KEY_F19";
                break;
            }
            case 188: {
                charSequence = "KEY_F18";
                break;
            }
            case 187: {
                charSequence = "KEY_F17";
                break;
            }
            case 186: {
                charSequence = "KEY_F16";
                break;
            }
            case 185: {
                charSequence = "KEY_F15";
                break;
            }
            case 184: {
                charSequence = "KEY_F14";
                break;
            }
            case 183: {
                charSequence = "KEY_F13";
                break;
            }
            case 182: {
                charSequence = "KEY_REDO";
                break;
            }
            case 181: {
                charSequence = "KEY_NEW";
                break;
            }
            case 180: {
                charSequence = "KEY_KPRIGHTPAREN";
                break;
            }
            case 179: {
                charSequence = "KEY_KPLEFTPAREN";
                break;
            }
            case 178: {
                charSequence = "KEY_SCROLLDOWN";
                break;
            }
            case 177: {
                charSequence = "KEY_SCROLLUP";
                break;
            }
            case 176: {
                charSequence = "KEY_EDIT";
                break;
            }
            case 175: {
                charSequence = "KEY_MOVE";
                break;
            }
            case 174: {
                charSequence = "KEY_EXIT";
                break;
            }
            case 173: {
                charSequence = "KEY_REFRESH";
                break;
            }
            case 172: {
                charSequence = "KEY_HOMEPAGE";
                break;
            }
            case 171: {
                charSequence = "KEY_CONFIG";
                break;
            }
            case 170: {
                charSequence = "KEY_ISO";
                break;
            }
            case 169: {
                charSequence = "KEY_PHONE";
                break;
            }
            case 168: {
                charSequence = "KEY_REWIND";
                break;
            }
            case 167: {
                charSequence = "KEY_RECORD";
                break;
            }
            case 166: {
                charSequence = "KEY_STOPCD";
                break;
            }
            case 165: {
                charSequence = "KEY_PREVIOUSSONG";
                break;
            }
            case 164: {
                charSequence = "KEY_PLAYPAUSE";
                break;
            }
            case 163: {
                charSequence = "KEY_NEXTSONG";
                break;
            }
            case 162: {
                charSequence = "KEY_EJECTCLOSECD";
                break;
            }
            case 161: {
                charSequence = "KEY_EJECTCD";
                break;
            }
            case 160: {
                charSequence = "KEY_CLOSECD";
                break;
            }
            case 159: {
                charSequence = "KEY_FORWARD";
                break;
            }
            case 158: {
                charSequence = "KEY_BACK";
                break;
            }
            case 157: {
                charSequence = "KEY_COMPUTER";
                break;
            }
            case 156: {
                charSequence = "KEY_BOOKMARKS";
                break;
            }
            case 155: {
                charSequence = "KEY_MAIL";
                break;
            }
            case 154: {
                charSequence = "KEY_CYCLEWINDOWS";
                break;
            }
            case 153: {
                charSequence = "KEY_DIRECTION";
                break;
            }
            case 152: {
                charSequence = "KEY_SCREENLOCK";
                break;
            }
            case 151: {
                charSequence = "KEY_MSDOS";
                break;
            }
            case 150: {
                charSequence = "KEY_WWW";
                break;
            }
            case 149: {
                charSequence = "KEY_PROG2";
                break;
            }
            case 148: {
                charSequence = "KEY_PROG1";
                break;
            }
            case 147: {
                charSequence = "KEY_XFER";
                break;
            }
            case 146: {
                charSequence = "KEY_DELETEFILE";
                break;
            }
            case 145: {
                charSequence = "KEY_SENDFILE";
                break;
            }
            case 144: {
                charSequence = "KEY_FILE";
                break;
            }
            case 143: {
                charSequence = "KEY_WAKEUP";
                break;
            }
            case 142: {
                charSequence = "KEY_SLEEP";
                break;
            }
            case 141: {
                charSequence = "KEY_SETUP";
                break;
            }
            case 140: {
                charSequence = "KEY_CALC";
                break;
            }
            case 139: {
                charSequence = "KEY_MENU";
                break;
            }
            case 138: {
                charSequence = "KEY_HELP";
                break;
            }
            case 137: {
                charSequence = "KEY_CUT";
                break;
            }
            case 136: {
                charSequence = "KEY_FIND";
                break;
            }
            case 135: {
                charSequence = "KEY_PASTE";
                break;
            }
            case 134: {
                charSequence = "KEY_OPEN";
                break;
            }
            case 133: {
                charSequence = "KEY_COPY";
                break;
            }
            case 132: {
                charSequence = "KEY_FRONT";
                break;
            }
            case 131: {
                charSequence = "KEY_UNDO";
                break;
            }
            case 130: {
                charSequence = "KEY_PROPS";
                break;
            }
            case 129: {
                charSequence = "KEY_AGAIN";
                break;
            }
            case 128: {
                charSequence = "KEY_STOP";
                break;
            }
            case 127: {
                charSequence = "KEY_COMPOSE";
                break;
            }
            case 126: {
                charSequence = "KEY_RIGHTMETA";
                break;
            }
            case 125: {
                charSequence = "KEY_LEFTMETA";
                break;
            }
            case 124: {
                charSequence = "KEY_YEN";
                break;
            }
            case 123: {
                charSequence = "KEY_HANJA";
                break;
            }
            case 122: {
                charSequence = "KEY_HANGEUL";
                break;
            }
            case 121: {
                charSequence = "KEY_KPCOMMA";
                break;
            }
            case 120: {
                charSequence = "KEY_SCALE";
                break;
            }
            case 119: {
                charSequence = "KEY_PAUSE";
                break;
            }
            case 118: {
                charSequence = "KEY_KPPLUSMINUS";
                break;
            }
            case 117: {
                charSequence = "KEY_KPEQUAL";
                break;
            }
            case 116: {
                charSequence = "KEY_POWER";
                break;
            }
            case 115: {
                charSequence = "KEY_VOLUMEUP";
                break;
            }
            case 114: {
                charSequence = "KEY_VOLUMEDOWN";
                break;
            }
            case 113: {
                charSequence = "KEY_MUTE";
                break;
            }
            case 112: {
                charSequence = "KEY_MACRO";
                break;
            }
            case 111: {
                charSequence = "KEY_DELETE";
                break;
            }
            case 110: {
                charSequence = "KEY_INSERT";
                break;
            }
            case 109: {
                charSequence = "KEY_PAGEDOWN";
                break;
            }
            case 108: {
                charSequence = "KEY_DOWN";
                break;
            }
            case 107: {
                charSequence = "KEY_END";
                break;
            }
            case 106: {
                charSequence = "KEY_RIGHT";
                break;
            }
            case 105: {
                charSequence = "KEY_LEFT";
                break;
            }
            case 104: {
                charSequence = "KEY_PAGEUP";
                break;
            }
            case 103: {
                charSequence = "KEY_UP";
                break;
            }
            case 102: {
                charSequence = "KEY_HOME";
                break;
            }
            case 101: {
                charSequence = "KEY_LINEFEED";
                break;
            }
            case 100: {
                charSequence = "KEY_RIGHTALT";
                break;
            }
            case 99: {
                charSequence = "KEY_SYSRQ";
                break;
            }
            case 98: {
                charSequence = "KEY_KPSLASH";
                break;
            }
            case 97: {
                charSequence = "KEY_RIGHTCTRL";
                break;
            }
            case 96: {
                charSequence = "KEY_KPENTER";
                break;
            }
            case 95: {
                charSequence = "KEY_KPJPCOMMA";
                break;
            }
            case 94: {
                charSequence = "KEY_MUHENKAN";
                break;
            }
            case 93: {
                charSequence = "KEY_KATAKANAHIRAGANA";
                break;
            }
            case 92: {
                charSequence = "KEY_HENKAN";
                break;
            }
            case 91: {
                charSequence = "KEY_HIRAGANA";
                break;
            }
            case 90: {
                charSequence = "KEY_KATAKANA";
                break;
            }
            case 89: {
                charSequence = "KEY_RO";
                break;
            }
            case 88: {
                charSequence = "KEY_F12";
                break;
            }
            case 87: {
                charSequence = "KEY_F11";
                break;
            }
            case 86: {
                charSequence = "KEY_102ND";
                break;
            }
            case 85: {
                charSequence = "KEY_ZENKAKUHANKAKU";
                break;
            }
            case 83: {
                charSequence = "KEY_KPDOT";
                break;
            }
            case 82: {
                charSequence = "KEY_KP0";
                break;
            }
            case 81: {
                charSequence = "KEY_KP3";
                break;
            }
            case 80: {
                charSequence = "KEY_KP2";
                break;
            }
            case 79: {
                charSequence = "KEY_KP1";
                break;
            }
            case 78: {
                charSequence = "KEY_KPPLUS";
                break;
            }
            case 77: {
                charSequence = "KEY_KP6";
                break;
            }
            case 76: {
                charSequence = "KEY_KP5";
                break;
            }
            case 75: {
                charSequence = "KEY_KP4";
                break;
            }
            case 74: {
                charSequence = "KEY_KPMINUS";
                break;
            }
            case 73: {
                charSequence = "KEY_KP9";
                break;
            }
            case 72: {
                charSequence = "KEY_KP8";
                break;
            }
            case 71: {
                charSequence = "KEY_KP7";
                break;
            }
            case 70: {
                charSequence = "KEY_SCROLLLOCK";
                break;
            }
            case 69: {
                charSequence = "KEY_NUMLOCK";
                break;
            }
            case 68: {
                charSequence = "KEY_F10";
                break;
            }
            case 67: {
                charSequence = "KEY_F9";
                break;
            }
            case 66: {
                charSequence = "KEY_F8";
                break;
            }
            case 65: {
                charSequence = "KEY_F7";
                break;
            }
            case 64: {
                charSequence = "KEY_F6";
                break;
            }
            case 63: {
                charSequence = "KEY_F5";
                break;
            }
            case 62: {
                charSequence = "KEY_F4";
                break;
            }
            case 61: {
                charSequence = "KEY_F3";
                break;
            }
            case 60: {
                charSequence = "KEY_F2";
                break;
            }
            case 59: {
                charSequence = "KEY_F1";
                break;
            }
            case 58: {
                charSequence = "KEY_CAPSLOCK";
                break;
            }
            case 57: {
                charSequence = "KEY_SPACE";
                break;
            }
            case 56: {
                charSequence = "KEY_LEFTALT";
                break;
            }
            case 55: {
                charSequence = "KEY_KPASTERISK";
                break;
            }
            case 54: {
                charSequence = "KEY_RIGHTSHIFT";
                break;
            }
            case 53: {
                charSequence = "KEY_SLASH";
                break;
            }
            case 52: {
                charSequence = "KEY_DOT";
                break;
            }
            case 51: {
                charSequence = "KEY_COMMA";
                break;
            }
            case 50: {
                charSequence = "KEY_M";
                break;
            }
            case 49: {
                charSequence = "KEY_N";
                break;
            }
            case 48: {
                charSequence = "KEY_B";
                break;
            }
            case 47: {
                charSequence = "KEY_V";
                break;
            }
            case 46: {
                charSequence = "KEY_C";
                break;
            }
            case 45: {
                charSequence = "KEY_X";
                break;
            }
            case 44: {
                charSequence = "KEY_Z";
                break;
            }
            case 43: {
                charSequence = "KEY_BACKSLASH";
                break;
            }
            case 42: {
                charSequence = "KEY_LEFTSHIFT";
                break;
            }
            case 41: {
                charSequence = "KEY_GRAVE";
                break;
            }
            case 40: {
                charSequence = "KEY_APOSTROPHE";
                break;
            }
            case 39: {
                charSequence = "KEY_SEMICOLON";
                break;
            }
            case 38: {
                charSequence = "KEY_L";
                break;
            }
            case 37: {
                charSequence = "KEY_K";
                break;
            }
            case 36: {
                charSequence = "KEY_J";
                break;
            }
            case 35: {
                charSequence = "KEY_H";
                break;
            }
            case 34: {
                charSequence = "KEY_G";
                break;
            }
            case 33: {
                charSequence = "KEY_F";
                break;
            }
            case 32: {
                charSequence = "KEY_D";
                break;
            }
            case 31: {
                charSequence = "KEY_S";
                break;
            }
            case 30: {
                charSequence = "KEY_A";
                break;
            }
            case 29: {
                charSequence = "KEY_LEFTCTRL";
                break;
            }
            case 28: {
                charSequence = "KEY_ENTER";
                break;
            }
            case 27: {
                charSequence = "KEY_RIGHTBRACE";
                break;
            }
            case 26: {
                charSequence = "KEY_LEFTBRACE";
                break;
            }
            case 25: {
                charSequence = "KEY_P";
                break;
            }
            case 24: {
                charSequence = "KEY_O";
                break;
            }
            case 23: {
                charSequence = "KEY_I";
                break;
            }
            case 22: {
                charSequence = "KEY_U";
                break;
            }
            case 21: {
                charSequence = "KEY_Y";
                break;
            }
            case 20: {
                charSequence = "KEY_T";
                break;
            }
            case 19: {
                charSequence = "KEY_R";
                break;
            }
            case 18: {
                charSequence = "KEY_E";
                break;
            }
            case 17: {
                charSequence = "KEY_W";
                break;
            }
            case 16: {
                charSequence = "KEY_Q";
                break;
            }
            case 15: {
                charSequence = "KEY_TAB";
                break;
            }
            case 14: {
                charSequence = "KEY_BACKSPACE";
                break;
            }
            case 13: {
                charSequence = "KEY_EQUAL";
                break;
            }
            case 12: {
                charSequence = "KEY_MINUS";
                break;
            }
            case 11: {
                charSequence = "KEY_0";
                break;
            }
            case 10: {
                charSequence = "KEY_9";
                break;
            }
            case 9: {
                charSequence = "KEY_8";
                break;
            }
            case 8: {
                charSequence = "KEY_7";
                break;
            }
            case 7: {
                charSequence = "KEY_6";
                break;
            }
            case 6: {
                charSequence = "KEY_5";
                break;
            }
            case 5: {
                charSequence = "KEY_4";
                break;
            }
            case 4: {
                charSequence = "KEY_3";
                break;
            }
            case 3: {
                charSequence = "KEY_2";
                break;
            }
            case 2: {
                charSequence = "KEY_1";
                break;
            }
            case 1: {
                charSequence = "KEY_ESC";
                break;
            }
            case 0: {
                charSequence = b2.f(2131296805);
            }
        }
        return charSequence;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String g() {
        Object object;
        Object object2 = null;
        try {
            object = MainService.instance.v0;
            if (object == null) return object2;
        }
        catch (NullPointerException nullPointerException) {
            return object2;
        }
        object = ((z1.d)object).c;
        return object;
    }

    /*
     * Unable to fully structure code
     */
    public static void h() {
        var8 = Tools.M0();
        Config.i(var8);
        var6_1 = Config.g();
        var0_3 = false;
        for (var1_2 = 0; var1_2 < Config.H.size(); ++var1_2) {
            var7_11 = (p)Config.H.valueAt(var1_2);
            var4_6 = var5_7 = var7_11.c;
            if (!var7_11.g) ** GOTO lbl20
            if (var6_1 == null) {
                var2_4 = var0_3;
            } else {
                var4_6 = new StringBuilder();
                var4_6.append(var6_1);
                var4_6.append('-');
                var4_6.append((String)var5_7);
                var4_6 = var4_6.toString();
lbl20:
                // 2 sources

                try {
                    var7_11.d = var8.getInt((String)var4_6, var7_11.b);
                }
                catch (ClassCastException var5_8) {
                    var5_7 = var7_11.c;
                    var3_5 = var7_11.b == 1;
                    try {
                        var7_11.d = (int)var8.getBoolean((String)var5_7, var3_5);
                        var0_3 = true;
                    }
                    catch (ClassCastException var5_9) {
                        var9_12 = new StringBuilder();
                        var9_12.append("Failed load data for ");
                        var9_12.append(var7_11.c);
                        e1.l(var9_12.toString(), var5_9);
                    }
                }
                var2_4 = var0_3;
                if (var7_11.e) {
                    var5_7 = new StringBuilder();
                    var5_7.append((String)var4_6);
                    var5_7.append("-2");
                    var4_6 = var5_7.toString();
                    try {
                        var7_11.f = var8.getInt((String)var4_6, 0);
                        var2_4 = var0_3;
                    }
                    catch (ClassCastException var5_10) {
                        var4_6 = new StringBuilder();
                        var4_6.append("Failed load data2 for ");
                        var4_6.append(var7_11.c);
                        e1.l(var4_6.toString(), var5_10);
                        var2_4 = var0_3;
                    }
                }
            }
            var0_3 = var2_4;
        }
        if (var0_3) {
            Config.k();
        } else {
            Config.j();
        }
    }

    private static void i(SharedPreferences sharedPreferences) {
        long[] lArray;
        c = sharedPreferences.getLong("ignore", 0L);
        d = sharedPreferences.getLong("memory-from", 0L);
        e = sharedPreferences.getLong("memory-to", -1L);
        f = sharedPreferences.getLong("nearby-distance", 512L);
        for (int i3 = 0; i3 < (lArray = b).length; ++i3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("toolbar-buttons-");
            stringBuilder.append(i3);
            lArray[i3] = sharedPreferences.getLong(stringBuilder.toString(), -1L);
        }
        if (MainService.I0) {
            MainService.instance.q1();
        }
    }

    private static void j() {
        Config.r();
        if (MainService.instance != null) {
            if (MainService.instance.Y != null) {
                MainService.instance.V(MainService.instance.Y.getAdapter());
                MainService.instance.X0();
            }
            MainService.instance.i.w0();
            MainService.instance.p1();
        }
    }

    public static void k() {
        g2 g22 = new g2();
        Config.l(g22);
        String string2 = Config.g();
        for (int i3 = 0; i3 < H.size(); ++i3) {
            CharSequence charSequence;
            p p3 = (p)H.valueAt(i3);
            CharSequence charSequence2 = charSequence = p3.c;
            if (p3.g) {
                if (string2 == null) continue;
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append(string2);
                ((StringBuilder)charSequence2).append('-');
                ((StringBuilder)charSequence2).append((String)charSequence);
                charSequence2 = ((StringBuilder)charSequence2).toString();
            }
            g22.g((String)charSequence2, p3.d, p3.b);
            if (!p3.e) continue;
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)charSequence2);
            ((StringBuilder)charSequence).append("-2");
            g22.g(((StringBuilder)charSequence).toString(), p3.f, 0);
        }
        g22.commit();
        Config.j();
    }

    private static void l(g2 g22) {
        long[] lArray;
        g22.i("ignore", c, 0L);
        g22.i("memory-from", d, 0L);
        g22.i("memory-to", e, -1L);
        g22.i("nearby-distance", f, 512L);
        for (int i3 = 0; i3 < (lArray = b).length; ++i3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("toolbar-buttons-");
            stringBuilder.append(i3);
            g22.i(stringBuilder.toString(), lArray[i3], -1L);
        }
    }

    public static ImageView m(ImageView imageView) {
        int n3 = Tools.H();
        return Config.o(imageView, n3, n3);
    }

    public static ImageView n(ImageView imageView, int n3) {
        int n4 = Tools.H();
        return Config.p(imageView, n4, n4, n3);
    }

    public static ImageView o(ImageView imageView, int n3, int n4) {
        return Config.p(imageView, n3, n4, Config.d());
    }

    public static ImageView p(ImageView imageView, int n3, int n4, int n5) {
        int n6 = 0;
        imageView.setAdjustViewBounds(false);
        imageView.setMinimumWidth(n3);
        imageView.setMinimumHeight(n4);
        int n7 = (int)Tools.G(n5);
        n3 = n3 > n7 ? (n3 - n7) / 2 : 0;
        n5 = n6;
        if (n4 > n7) {
            n5 = (n4 - n7) / 2;
        }
        imageView.setPadding(n3, n5, n3, n5);
        try {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
        imageView.invalidate();
        return imageView;
    }

    public static ImageView q(ImageView imageView, int n3) {
        imageView.setAdjustViewBounds(false);
        imageView.setMinimumWidth(n3);
        imageView.setMinimumHeight(n3);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = n3;
            layoutParams.height = n3;
            imageView.setLayoutParams(layoutParams);
        }
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.invalidate();
        return imageView;
    }

    public static void r() {
        int n3;
        int n4;
        int n5;
        int n6;
        a.e e4;
        block35: {
            block34: {
                e4 = H;
                n6 = ((p)e4.get((int)2131034192)).d;
                n5 = 0;
                n4 = n6 == 1 ? 2 : 0;
                n6 = n4;
                if (((p)e4.get((int)2131034402)).d == 1) {
                    n6 = n4 | 4;
                }
                n4 = n6;
                if (((p)e4.get((int)2131034159)).d == 0) {
                    n4 = n6 | 0x10000;
                }
                n6 = n4;
                if (((p)e4.get((int)2131034153)).d == 1) {
                    n6 = n4 | 0x800;
                }
                n4 = n6;
                if (((p)e4.get((int)2131034215)).d == 1) {
                    n4 = n6 | 0x1000;
                }
                n6 = n4;
                if (((p)e4.get((int)2131034162)).d == 1) {
                    n6 = n4 | 0x40000;
                }
                n3 = ((p)e4.get((int)2131034195)).d;
                n4 = n6;
                if (n3 == 1) {
                    n4 = n6 | 1;
                }
                n6 = n4;
                if (n3 == 2) {
                    n6 = n4 | 0x401;
                }
                n3 = ((p)e4.get((int)2131034182)).d;
                n4 = n6;
                if (n3 == 1) {
                    n4 = n6 | 8;
                }
                n6 = n4;
                if (n3 == 2) {
                    n6 = n4 | 0x10;
                }
                n3 = ((p)e4.get((int)2131034186)).d;
                n4 = n6;
                if (n3 == 1) {
                    n4 = n6 | 0x20;
                }
                if (n3 == 2) break block34;
                n6 = n4;
                if (n3 != 3) break block35;
            }
            n6 = n4 | 0x40;
        }
        n3 = ((p)e4.get((int)2131034167)).d;
        n4 = n6;
        if ((n3 & 1) != 0) {
            n4 = n6 | 0x80;
        }
        n6 = n4;
        if ((n3 & 2) != 0) {
            n6 = n4 | 0x100;
        }
        n4 = n6;
        if ((n3 & 4) != 0) {
            n4 = n6 | 0x200;
        }
        n6 = n4;
        if ((n3 & 8) != 0) {
            n6 = n4 | 0x8000;
        }
        n3 = ((p)e4.get((int)2131034187)).d;
        n4 = n6;
        if (n3 == 1) {
            n4 = n6 | 0x2000;
        }
        n6 = n4;
        if (n3 == 2) {
            n6 = n4 | 0x4000;
        }
        n4 = n6;
        if (n3 == 3) {
            n4 = n6 | 0x20000;
        }
        A = n4;
        n4 = n5;
        if (((p)e4.get((int)2131034177)).d == 1) {
            n4 = 1;
        }
        n6 = n4;
        if (((p)e4.get((int)2131034150)).d == 1) {
            n6 = n4 | 2;
        }
        n4 = n6;
        if (((p)e4.get((int)2131034151)).d == 1) {
            n4 = n6 | 4;
        }
        n6 = n4;
        if (((p)e4.get((int)2131034201)).d == 1) {
            n6 = n4 | 8;
        }
        n4 = n6;
        if (((p)e4.get((int)2131034175)).d == 1) {
            n4 = n6 | 0x10;
        }
        n5 = n4;
        if (((p)e4.get((int)2131034212)).d == 1) {
            n5 = n4 | 0x20;
        }
        n6 = n5;
        if (((p)e4.get((int)2131034176)).d == 1) {
            n6 = n5 | 0x40;
        }
        n4 = n6;
        if (((p)e4.get((int)2131034205)).d == 1) {
            n4 = n6 | 0x80;
        }
        n6 = n4;
        if (((p)e4.get((int)2131034210)).d == 1) {
            n6 = n4 | 0x100;
        }
        n4 = n6;
        if (((p)e4.get((int)2131034154)).d == 1) {
            n4 = n6 | 0x800;
        }
        n6 = n4;
        if (((p)e4.get((int)2131034174)).d == 1) {
            n6 = n4 | 0x1000;
        }
        n4 = n6;
        if (((p)e4.get((int)2131034186)).d == 3) {
            n4 = n6 | 0x2000;
        }
        n6 = n4;
        if (((p)e4.get((int)2131034214)).d == 1) {
            n6 = n4 | 0x200;
        }
        n4 = n6;
        if (((p)e4.get((int)2131034213)).d == 1) {
            n4 = n6 | 0x400;
        }
        B = n4;
        ((p)e4.get(2131034183)).d();
        g = ((p)e4.get((int)2131034163)).d;
        h = ((p)e4.get((int)2131034188)).d;
        i = ((p)e4.get((int)2131034189)).d;
        k = ((p)e4.get((int)2131034194)).d;
        l = ((p)e4.get((int)2131034199)).d;
        m = ((p)e4.get((int)2131034166)).d;
        n = ((p)e4.get((int)2131034193)).d;
        o = ((p)e4.get((int)2131034173)).d;
        p = ((p)e4.get((int)2131034207)).d;
        q = ((p)e4.get((int)2131034211)).d;
        r = ((p)e4.get((int)2131034152)).d;
        s = ((p)e4.get(2131034216)).c();
        t = ((p)e4.get((int)2131034165)).d;
        u = ((p)e4.get((int)2131034164)).d;
        v = ((p)e4.get((int)2131034204)).d;
        w = ((p)e4.get((int)2131034169)).d;
        x = ((p)e4.get((int)2131034168)).d;
        y = ((p)e4.get((int)2131034158)).d;
        z = ((p)e4.get((int)2131034157)).d;
        j = (long)((p)e4.get((int)2131034197)).d & 0x1FFFFFL | (long)((p)e4.get((int)2131034209)).d << 21;
    }

    public static void s(int[] nArray) {
        if (nArray != null && nArray.length != 0) {
            int[] nArray2 = a;
            int n3 = nArray2.length;
            int n4 = nArray.length;
            int n5 = n3 + n4;
            int[] nArray3 = new int[n5];
            System.arraycopy(nArray2, 0, nArray3, 0, n3);
            System.arraycopy(nArray, 0, nArray3, n3, n4);
            Arrays.sort(nArray3);
            int n6 = 1;
            for (n4 = 1; n4 < n5; ++n4) {
                int n7 = nArray3[n4];
                n3 = n6;
                if (n7 != nArray3[n4 - 1]) {
                    nArray3[n6] = n7;
                    n3 = n6 + 1;
                }
                n6 = n3;
            }
            a = Arrays.copyOf(nArray3, n6);
        }
    }

    public static class OptionMultiChoice
    extends s
    implements DialogInterface.OnMultiChoiceClickListener,
    DialogInterface.OnShowListener,
    AbsListView.OnScrollListener {
        boolean[] n;

        public OptionMultiChoice(int n3, int n4, int[] nArray, int n5, String string2, boolean bl) {
            super(n3, n4, nArray, n5, string2, bl);
        }

        public OptionMultiChoice(int n3, int n4, int[] nArray, int n5, String string2, boolean bl, int n6) {
            this(n3, n4, nArray, n5, string2, bl);
            this.h = n6;
        }

        @Override
        public boolean e(DialogInterface dialogInterface, int n3) {
            int n4;
            int n5 = 0;
            if (n3 != -1 && n3 != -3) {
                return false;
            }
            boolean[] blArray = this.n;
            int n6 = n4 = this.b;
            if (blArray != null) {
                n6 = n4;
                if (n3 == -1) {
                    n3 = n4;
                    for (n6 = n5; n6 < blArray.length; ++n6) {
                        n4 = this.h(n6);
                        if (blArray[n6]) {
                            n3 = n4 | n3;
                            continue;
                        }
                        n3 = ~n4 & n3;
                    }
                    this.n = null;
                    n6 = n3;
                }
            }
            this.d = n6;
            Config.k();
            Tools.D(dialogInterface);
            return true;
        }

        @Override
        protected void j(CharSequence[] alertDialog) {
            boolean[] blArray = new boolean[((CharSequence[])alertDialog).length];
            this.n = blArray;
            int n3 = this.d;
            for (int i3 = 0; i3 < ((CharSequence[])alertDialog).length; ++i3) {
                int n4 = this.h(i3);
                boolean bl = (n3 & n4) == n4;
                blArray[i3] = bl;
            }
            alertDialog = android.ext.f.c(Tools.k0()).setCustomTitle(Config.c(this.a, this.h, this.g)).setMultiChoiceItems((CharSequence[])alertDialog, blArray, (DialogInterface.OnMultiChoiceClickListener)this).setPositiveButton(2131296917, (DialogInterface.OnClickListener)this).setNeutralButton(2131296898, (DialogInterface.OnClickListener)this).setNegativeButton(2131296311, (DialogInterface.OnClickListener)this).create();
            android.ext.f.l(alertDialog, this);
            android.ext.f.m(alertDialog);
        }

        protected void l(boolean bl) {
            if (this.m == null) {
                int n3 = bl ? 6 : 3;
                int[] nArray = new int[n3];
                CharSequence[] charSequenceArray = new CharSequence[n3];
                if (bl) {
                    nArray[0] = 1;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(b2.f(2131296942));
                    stringBuilder.append(", ");
                    stringBuilder.append(b2.f(2131296861));
                    charSequenceArray[0] = stringBuilder.toString();
                    nArray[1] = 2;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(b2.f(2131296942));
                    stringBuilder.append(", ");
                    stringBuilder.append(b2.f(2131296731));
                    charSequenceArray[1] = stringBuilder.toString();
                    nArray[2] = 4;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(b2.f(2131296921));
                    stringBuilder.append(", ");
                    stringBuilder.append(b2.f(2131296861));
                    charSequenceArray[2] = stringBuilder.toString();
                    nArray[3] = 8;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(b2.f(2131296921));
                    stringBuilder.append(", ");
                    stringBuilder.append(b2.f(2131296731));
                    charSequenceArray[3] = stringBuilder.toString();
                    nArray[4] = 16;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(b2.f(2131296772));
                    stringBuilder.append(", ");
                    stringBuilder.append(b2.f(2131296861));
                    charSequenceArray[4] = stringBuilder.toString();
                    nArray[5] = 32;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(b2.f(2131296772));
                    stringBuilder.append(", ");
                    stringBuilder.append(b2.f(2131296731));
                    charSequenceArray[5] = stringBuilder.toString();
                } else {
                    nArray[0] = 1;
                    charSequenceArray[0] = b2.f(2131296942);
                    nArray[1] = 2;
                    charSequenceArray[1] = b2.f(2131296921);
                    nArray[2] = 4;
                    charSequenceArray[2] = b2.f(2131296772);
                }
                this.m = nArray;
                this.l = charSequenceArray;
                this.k = null;
            }
        }

        public void onClick(DialogInterface object, int n3, boolean bl) {
            object = this.n;
            if (object == null) {
                e1.l("", new NullPointerException(this.toString()));
                return;
            }
            object[n3] = (DialogInterface)bl;
        }

        public void onScroll(AbsListView absListView, int n3, int n4, int n5) {
            this.onScrollStateChanged(absListView, 0);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public void onScrollStateChanged(AbsListView absListView, int n3) {
            int n4;
            block6: {
                try {
                    n4 = absListView.getChildCount();
                    n3 = 0;
                    break block6;
                }
                catch (Throwable throwable) {}
                e1.a(throwable);
                return;
            }
            while (n3 < n4) {
                try {
                    View view = absListView.getChildAt(n3);
                    if (view instanceof CheckedTextView) {
                        ((CheckedTextView)view).refreshDrawableState();
                    }
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {}
                ++n3;
            }
        }

        public void onShow(DialogInterface dialogInterface) {
            if (Build.VERSION.SDK_INT >= 23 && dialogInterface instanceof AlertDialog && (dialogInterface = ((AlertDialog)dialogInterface).getListView()) != null) {
                dialogInterface.setOnScrollListener((AbsListView.OnScrollListener)this);
            }
        }

        @Override
        public String toString() {
            return Tools.N1(this.a);
        }
    }

    public static class OptionMultiChoiceSh
    extends OptionMultiChoice {
        private final int o;

        public OptionMultiChoiceSh(int n3, int n4, int[] nArray, int n5, String string2, boolean bl, int n6) {
            super(n3, n4, nArray, n5, string2, bl);
            this.o = n6;
        }

        @Override
        public boolean e(DialogInterface dialogInterface, int n3) {
            boolean bl = super.e(dialogInterface, n3);
            if (bl) {
                Tools.H1(2131296795);
            }
            return bl;
        }

        @Override
        protected void i() {
            super.i();
            if (this.m == null) {
                int n3 = this.o;
                int[] nArray = new int[n3];
                CharSequence[] charSequenceArray = new CharSequence[n3];
                int n4 = 0;
                while (n4 < n3) {
                    nArray[n4] = 1 << n4;
                    int n5 = n4 + 1;
                    charSequenceArray[n4] = Integer.toString(n5);
                    n4 = n5;
                }
                this.m = nArray;
                this.l = charSequenceArray;
                this.k = null;
            }
        }
    }

    public static class OptionSeek
    extends p
    implements SeekBar.OnSeekBarChangeListener {
        int k;
        protected WeakReference l = new WeakReference<Object>(null);

        public OptionSeek(int n3, int n4, int n5, int n6, String string2, boolean bl) {
            super(n3, n4, n6, string2, bl);
            this.k = n5;
        }

        public OptionSeek(int n3, int n4, int n5, int n6, String string2, boolean bl, int n7) {
            this(n3, n4, n5, n6, string2, bl);
            this.h = n7;
        }

        @Override
        public void b() {
            this.h();
        }

        @Override
        public boolean e(DialogInterface dialogInterface, int n3) {
            dialogInterface = (SeekBar)this.l.get();
            if (dialogInterface == null) {
                return false;
            }
            this.d = dialogInterface.getProgress();
            Config.k();
            return true;
        }

        protected void h() {
            View view = a.d.f(2131099663, null);
            SeekBar seekBar = (SeekBar)view.findViewById(2131034400);
            seekBar.setMax(this.k);
            seekBar.setProgress(this.d);
            seekBar.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)this);
            this.l = new WeakReference<SeekBar>(seekBar);
            android.ext.f.m(android.ext.f.b().setCustomTitle(Config.c(this.a, this.h, this.g)).setView(view).setPositiveButton(2131296836, (DialogInterface.OnClickListener)this).setNegativeButton(2131296311, null).create());
        }

        public void onProgressChanged(SeekBar seekBar, int n3, boolean bl) {
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }

        @Override
        public String toString() {
            return Tools.N1(this.a);
        }
    }

    public static class o
    extends ContextWrapper {
        public o(Context context) {
            super(context);
        }

        public String getOpPackageName() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Use 2 ");
            stringBuilder.append(E);
            stringBuilder.append(" instead of ");
            stringBuilder.append(this.getBaseContext().getPackageName());
            e1.d(stringBuilder.toString());
            return E;
        }

        public String getPackageName() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Use 1 ");
            stringBuilder.append(E);
            stringBuilder.append(" instead of ");
            stringBuilder.append(this.getBaseContext().getPackageName());
            e1.d(stringBuilder.toString());
            return E;
        }
    }

    public static abstract class p
    implements DialogInterface.OnClickListener {
        int a;
        int b;
        String c;
        int d;
        boolean e;
        int f = 0;
        boolean g;
        int h;
        protected a i;
        protected b j;

        public p(int n3, int n4, int n5, String string2, boolean bl) {
            this.a = n4;
            this.b = n5;
            this.c = string2;
            this.d = n5;
            this.g = bl;
            this.h = -1;
            this.i = null;
            this.d();
            H.put(n3, this);
        }

        public CharSequence a() {
            return this.toString();
        }

        public abstract void b();

        public long c() {
            return (long)this.d | (long)this.f << 32;
        }

        protected void d() {
        }

        public abstract boolean e(DialogInterface var1, int var2);

        public void f(a a4) {
            this.i = a4;
        }

        public void g(b b4) {
            this.j = b4;
        }

        public final void onClick(DialogInterface object, int n3) {
            a a4 = this.i;
            int n4 = n3;
            if (a4 != null) {
                n4 = a4.a((DialogInterface)object, n3);
            }
            if (this.e((DialogInterface)object, n4) && (object = this.j) != null) {
                object.a(this.d);
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(b2.f(this.a));
            stringBuilder.append(' ');
            stringBuilder.append(this.d);
            return stringBuilder.toString();
        }

        static interface a {
            public int a(DialogInterface var1, int var2);
        }

        static interface b {
            public void a(int var1);
        }
    }

    public static class q
    extends p
    implements DialogInterface.OnShowListener,
    View.OnClickListener {
        int k;
        int l;
        long m;
        private WeakReference n = new WeakReference<Object>(null);
        private WeakReference o = new WeakReference<Object>(null);
        private boolean p = false;
        private boolean q = true;
        private int r = 8;

        public q(int n3, int n4, int n5, int n6, long l3, int n7, String string2, boolean bl) {
            super(n3, n4, n7, string2, bl);
            this.k = n5;
            this.l = n6;
            this.m = l3;
        }

        public q(int n3, int n4, int n5, int n6, long l3, int n7, String string2, boolean bl, int n8) {
            this(n3, n4, n5, n6, l3, n7, string2, bl);
            this.h = n8;
        }

        public q(int n3, int n4, int n5, int n6, long l3, int n7, String string2, boolean bl, boolean bl2, boolean bl3) {
            this(n3, n4, n5, n6, l3, n7, string2, bl);
            this.p = bl2;
            this.q = bl3;
        }

        public q(int n3, int n4, int n5, int n6, long l3, int n7, String string2, boolean bl, boolean bl2, boolean bl3, int n8) {
            this(n3, n4, n5, n6, l3, n7, string2, bl, bl2, bl3);
            this.r = n8;
        }

        private String h() {
            int n3 = this.k;
            String string2 = n3 == 0 ? "" : b2.f(n3);
            return string2;
        }

        @Override
        public void b() {
            this.i();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public boolean e(DialogInterface object, int n3) {
            NumberFormatException numberFormatException2;
            block6: {
                long l3;
                Object object2;
                String string2;
                object = (EditText)this.o.get();
                if (object == null) {
                    return false;
                }
                try {
                    long l4;
                    string2 = j2.h(object.getText().toString().trim());
                    object2 = t1.x(string2);
                    l3 = this.l;
                    long l5 = this.m;
                    if (!(this.e || (l4 = ((t1.b)object2).a) >= l3 && l4 <= l5)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(Tools.L1(b2.f(2131296830), string2));
                        stringBuilder.append(Tools.L1(" [%,d, %,d]", l3, l5));
                        object2 = new NumberFormatException(stringBuilder.toString());
                        throw object2;
                    }
                }
                catch (NumberFormatException numberFormatException2) {
                    break block6;
                }
                y0.b(string2, this.r);
                if (this.e) {
                    l3 = ((t1.b)object2).a;
                    this.d = (int)l3;
                    this.f = (int)(l3 >> 32);
                } else {
                    this.d = Math.max((int)Math.min(((t1.b)object2).a, this.m), this.l);
                }
                Config.k();
                Tools.E(this.n);
                return true;
            }
            j2.i(numberFormatException2, (android.widget.EditText)object);
            return false;
        }

        protected void i() {
            View view = a.d.f(2131099662, null);
            Object object = (TextView)view.findViewById(2131034328);
            object.setText((CharSequence)b2.f(this.a));
            int n3 = this.h;
            if (n3 != -1 && n3 != 0) {
                Tools.r1((View)object);
                object.setOnClickListener(new View.OnClickListener(this){
                    final q a;
                    {
                        this.a = q3;
                    }

                    public void onClick(View view) {
                        view = android.ext.f.b();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(b2.f(this.a.a));
                        stringBuilder.append('\n');
                        stringBuilder.append(b2.f(this.a.h));
                        android.ext.f.o(view.setMessage((CharSequence)stringBuilder.toString()).setNegativeButton((CharSequence)b2.f(2131296836), null));
                    }
                });
            }
            TextView textView = (TextView)view.findViewById(2131034285);
            object = b2.f(2131297036);
            long l3 = this.e ? Long.MIN_VALUE : (long)this.l;
            n3 = 0;
            Object object2 = Tools.L1("%,d", l3);
            l3 = this.e ? Long.MAX_VALUE : this.m;
            textView.setText((CharSequence)Tools.L1((String)object, object2, Tools.L1("%,d", l3)));
            ((TextView)view.findViewById(2131034435)).setText((CharSequence)this.h());
            object = (TextView)view.findViewById(2131034224);
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(Tools.N1(2131296372));
            ((StringBuilder)object2).append(": ");
            ((StringBuilder)object2).append(Tools.L1("%,d", this.b));
            object.setText((CharSequence)((StringBuilder)object2).toString());
            object.setOnClickListener((View.OnClickListener)this);
            object = (EditText)view.findViewById(2131034346);
            l3 = this.e ? this.c() : (long)this.d;
            object.setText((CharSequence)Tools.L1("%,d", l3));
            ((EditText)object).setDataType(this.r);
            this.o = new WeakReference<Object>(object);
            object2 = (HexConverter)view.findViewById(2131034347);
            object2.setTag((Object)new Object[]{object, 4});
            if (!this.p) {
                n3 = 8;
            }
            object2.setVisibility(n3);
            ((HexConverter)((Object)object2)).setUseXor(this.q);
            view = android.ext.f.b().setView(InternalKeyboard.d(view)).setPositiveButton(2131296836, (DialogInterface.OnClickListener)this).setNegativeButton(2131296311, null).create();
            android.ext.f.l((AlertDialog)view, this);
            this.n = new WeakReference<View>(view);
            android.ext.f.n((AlertDialog)view, (android.widget.EditText)object);
        }

        public void onClick(View object) {
            if (object != null && object.getId() == 2131034224) {
                object = (EditText)this.o.get();
                if (object != null) {
                    object.setText((CharSequence)Tools.L1("%,d", this.b));
                }
                return;
            }
            this.onClick((DialogInterface)this.n.get(), -1);
        }

        public void onShow(DialogInterface dialogInterface) {
            Tools.t1(dialogInterface, -1, null, this, (EditText)this.o.get());
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(b2.f(this.a));
            stringBuilder.append(' ');
            stringBuilder.append(Tools.L1("%,d", this.d));
            stringBuilder.append(' ');
            stringBuilder.append(this.h());
            return stringBuilder.toString();
        }
    }

    public static class r
    extends p {
        public r(int n3, int n4, int n5, String string2, boolean bl) {
            super(n3, n4, n5, string2, bl);
        }

        @Override
        public void b() {
        }

        @Override
        public boolean e(DialogInterface dialogInterface, int n3) {
            return false;
        }
    }

    public static class s
    extends p {
        int[] k;
        CharSequence[] l = null;
        int[] m = null;

        public s(int n3, int n4, int[] nArray, int n5, String string2, boolean bl) {
            super(n3, n4, n5, string2, bl);
            this.k = nArray;
        }

        public s(int n3, int n4, int[] nArray, int n5, String string2, boolean bl, int n6) {
            this(n3, n4, nArray, n5, string2, bl);
            this.h = n6;
        }

        @Override
        public void b() {
            this.i();
            Object[] objectArray = this.l;
            Object[] objectArray2 = this.k;
            if (objectArray2 != null) {
                objectArray2 = new CharSequence[objectArray2.length];
                int n3 = 0;
                while (true) {
                    int[] nArray = this.k;
                    objectArray = objectArray2;
                    if (n3 >= nArray.length) break;
                    objectArray2[n3] = (int)b2.f(nArray[n3]);
                    ++n3;
                }
            }
            this.j((CharSequence[])objectArray);
        }

        @Override
        public boolean e(DialogInterface dialogInterface, int n3) {
            this.d = this.h(n3);
            Config.k();
            Tools.D(dialogInterface);
            return true;
        }

        public int h(int n3) {
            this.i();
            int[] nArray = this.m;
            if (nArray == null) {
                return n3;
            }
            return nArray[n3];
        }

        protected void i() {
        }

        protected void j(CharSequence[] charSequenceArray) {
            int n3 = this.k(this.b);
            CharSequence[] charSequenceArray2 = new CharSequence[charSequenceArray.length];
            for (int i3 = 0; i3 < charSequenceArray.length; ++i3) {
                CharSequence charSequence;
                if (i3 == n3 && charSequenceArray[i3] != null) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append((Object)charSequenceArray[i3]);
                    ((StringBuilder)charSequence).append(" (");
                    ((StringBuilder)charSequence).append(b2.f(2131296373));
                    ((StringBuilder)charSequence).append(')');
                    charSequence = ((StringBuilder)charSequence).toString();
                } else {
                    charSequence = charSequenceArray[i3];
                }
                charSequenceArray2[i3] = charSequence;
            }
            android.ext.f.o(android.ext.f.b().setCustomTitle(Config.c(this.a, this.h, this.g)).setSingleChoiceItems(charSequenceArray2, this.k(this.d), (DialogInterface.OnClickListener)this));
        }

        public int k(int n3) {
            int n4;
            block3: {
                int[] nArray;
                this.i();
                if (this.m == null) {
                    return n3;
                }
                for (n4 = 1; n4 < (nArray = this.m).length; ++n4) {
                    if (nArray[n4] != n3) {
                        continue;
                    }
                    break block3;
                }
                n4 = 0;
            }
            return n4;
        }

        /*
         * WARNING - void declaration
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public String toString() {
            void var3_6;
            Object object;
            try {
                int n3 = this.k(this.d);
                object = this.k;
                object = object != null ? (Object)b2.f(object[n3]) : (Object)this.l[n3];
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                object = null;
            }
            int[] nArray = object;
            if (object == null) {
                object = new StringBuilder();
                ((StringBuilder)object).append("int:");
                ((StringBuilder)object).append(this.d);
                String string2 = ((StringBuilder)object).toString();
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(Tools.N1(this.a));
            ((StringBuilder)object).append(": ");
            ((StringBuilder)object).append(var3_6);
            return ((StringBuilder)object).toString();
        }
    }
}

