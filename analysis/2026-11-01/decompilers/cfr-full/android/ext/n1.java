/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.content.DialogInterface;
import android.ext.BaseAdapterLC;
import android.ext.Config;
import android.ext.ConfigListAdapter;
import android.ext.EditText;
import android.ext.HexConverter;
import android.ext.InternalKeyboard;
import android.ext.MainService;
import android.ext.RegionList;
import android.ext.SavedListAdapter;
import android.ext.Tools;
import android.ext.b2;
import android.ext.b3;
import android.ext.c;
import android.ext.c3;
import android.ext.d;
import android.ext.e1;
import android.ext.g2;
import android.ext.m;
import android.ext.n;
import android.ext.n0;
import android.ext.p1;
import android.ext.t1;
import android.ext.t2;
import android.ext.v0;
import android.ext.w;
import android.ext.y0;
import android.ext.z1;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.SectionIndexer;
import android.widget.TextView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

class n1
extends BaseAdapterLC
implements b3.a,
SectionIndexer,
Filterable {
    private static n t;
    private static int[] u;
    private static volatile CharSequence[] v;
    private static volatile int[] w;
    String a = "";
    private Filter b = null;
    short[] c = null;
    private final byte[] d;
    private volatile long e;
    private ByteBuffer f;
    private long g;
    private int h = -1;
    private boolean[] i = null;
    volatile int j = -15999;
    private f k = null;
    private int l = 2;
    private long m = 0L;
    private final d.a n = new d.a();
    private final CharSequence[] o = new CharSequence[2];
    private long p = 1L;
    private int q = 0;
    private int r = 0;
    private d s = null;

    public n1() {
        this.j = Tools.M0().getInt("memory-editor-format", -15999);
        this.a();
        Object object = new byte[8200];
        this.d = object;
        object = ByteBuffer.wrap((byte[])object);
        this.f = object;
        ((ByteBuffer)object).order(ByteOrder.LITTLE_ENDIAN);
        this.g = 0L;
        this.e = 0L;
        MainService.instance.u.setText(this.A());
    }

    private CharSequence A() {
        return n1.B(this.j);
    }

    static CharSequence B(int n3) {
        CharSequence[] charSequenceArray = n1.v();
        CharSequence[] charSequenceArray2 = new CharSequence[charSequenceArray.length * 2];
        int n4 = 0;
        for (int i3 = 0; i3 < charSequenceArray.length; ++i3) {
            int n5 = n4;
            if ((1 << i3 & n3) != 0) {
                n5 = n4;
                if (n4 > 0) {
                    charSequenceArray2[n4] = ",";
                    n5 = n4 + 1;
                }
                charSequenceArray2[n5] = charSequenceArray[i3];
            }
            n4 = ++n5;
        }
        return Tools.x(Arrays.copyOf(charSequenceArray2, n4));
    }

    private int C(int n3) {
        return n1.D(n3, this.c);
    }

    private static int D(int n3, short[] sArray) {
        int n4;
        if (sArray == null) {
            return n3;
        }
        if ((n3 = Arrays.binarySearch(sArray, (short)n3)) >= 0) {
            return n3;
        }
        n3 = n4 = -n3 - 2;
        if (n4 < 0) {
            n3 = 0;
        }
        return n3;
    }

    public static String H(long l3, int n3) {
        byte[] byArray = t1.g(l3);
        int n4 = byArray[8];
        if (n4 <= n3) {
            n3 = n4;
        }
        n4 = n3;
        if ((n3 & 1) == 0) {
            n4 = n3 + 1;
        }
        return new String(byArray, 0, n4 + 1, t1.i(true));
    }

    public static String I(long l3, int n3) {
        byte[] byArray = new byte[]{(byte)(0xFFL & l3), (byte)((0xFF00L & l3) >> 8), (byte)((0xFF0000L & l3) >> 16), (byte)((0xFF000000L & l3) >> 24), (byte)((0xFF00000000L & l3) >> 32), (byte)((0xFF0000000000L & l3) >> 40), (byte)((0xFF000000000000L & l3) >> 48), (byte)((l3 & 0xFF00000000000000L) >> 56)};
        for (int i3 = 0; i3 < 8; ++i3) {
            if (byArray[i3] >= 32) continue;
            byArray[i3] = 46;
        }
        return new String(byArray).substring(0, n3);
    }

    private int J(int n3) {
        return n1.K(n3, this.c, this.u());
    }

    private static int K(int n3, short[] sArray, int n4) {
        int n5 = n3;
        if (sArray != null) {
            n5 = n3 < 0 ? n3 : (n3 >= sArray.length ? n3 - sArray.length + (8192 >> n4) : sArray[n3]);
        }
        return n5;
    }

    private static int N(TextView textView, CharSequence charSequence, int n3, int n4) {
        n1.O(textView, charSequence);
        int n5 = n3;
        if (charSequence != null) {
            n5 = n3;
            if (n3 < n4) {
                n5 = n4;
            }
        }
        return n5;
    }

    private static void O(TextView textView, CharSequence charSequence) {
        if (charSequence == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
    }

    private void Q(c3 c32, int n3) {
        Object object = c32.a.getLayoutParams();
        int n4 = (Config.q & 1 << Tools.d1() + 4) != 0 ? -2 : Tools.H();
        object.height = n4;
        boolean bl = false;
        if (n3 != 0 && n3 != this.getCount() - 1) {
            c32.a.setVisibility(0);
            c32.b.setVisibility(0);
            c32.j.setVisibility(0);
            c32.m = n3;
            long l3 = this.e(n3);
            c32.j.setText(this.t(l3));
            c32.b.setText((CharSequence)android.ext.c.G(l3, 32));
            try {
                boolean bl2;
                bl = bl2 = this.i[n3];
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                e1.l("ArrayAdapter getView failed", indexOutOfBoundsException);
            }
            c32.a.setChecked(bl);
            c32.a(bl, this.h);
            long l4 = this.f.getLong(this.n(l3));
            bl = this.E();
            object = MainService.instance.u0;
            n3 = n4 = this.x(bl, (android.ext.d)object, l3, l4, this.x(bl, (android.ext.d)object, l3, l4, this.x(bl, (android.ext.d)object, l3, l4, this.x(bl, (android.ext.d)object, l3, l4, this.x(bl, (android.ext.d)object, l3, l4, this.x(bl, (android.ext.d)object, l3, l4, this.x(bl, (android.ext.d)object, l3, l4, 0, c32.p, 9, 64, 8, 4), c32.s, 12, 32, 8, 4), c32.o, 8, 16, 4, 4), c32.n, 7, 4, 4, 4), c32.t, 13, 8, 4, 4), c32.q, 10, 2, 2, 2), c32.r, 11, 1, 1, 1);
            if (n4 == 0) {
                n3 = 1 << this.u();
            }
            n1.c(c32, l3, l4, this.j, bl, n3);
            return;
        }
        c32.a.setVisibility(4);
        c32.b.setVisibility(8);
        c32.c.setVisibility(8);
        c32.d.setVisibility(8);
        c32.e.setVisibility(0);
        c32.f.setVisibility(8);
        c32.g.setVisibility(8);
        c32.h.setVisibility(8);
        c32.i.setVisibility(8);
        c32.n.setVisibility(8);
        c32.o.setVisibility(8);
        c32.p.setVisibility(8);
        c32.q.setVisibility(8);
        c32.r.setVisibility(8);
        c32.s.setVisibility(8);
        c32.t.setVisibility(8);
        c32.j.setVisibility(8);
        c32.a(false, -2);
        bl = n3 != 0;
        object = this.y(bl);
        c32 = c32.e;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(b2.f(2131296515));
        stringBuilder.append(' ');
        stringBuilder.append(android.ext.c.G((long)object[0], 32));
        c32.setText(stringBuilder.toString());
    }

    private void a() {
        int n3 = this.getCount();
        boolean[] blArray = this.i;
        Object object = this.k;
        int n4 = this.u();
        short[] sArray = this.c;
        if (blArray == null || n3 != blArray.length || object == null || n4 != ((f)object).a) {
            boolean[] blArray2 = new boolean[n3];
            this.i = blArray2;
            if (object != null) {
                int n5 = ((f)object).a;
                object = ((f)object).b;
                for (int i3 = 1; i3 < n3 - 1; ++i3) {
                    int n6;
                    int n7 = n1.K(i3 - 1, sArray, n4) << n4;
                    if ((n7 & (1 << n5) - 1) != 0 || (n6 = n7 >> n5) != n1.K(n7 = n1.D(n6, (short[])object), (short[])object, n5) || ++n7 < 0 || n7 >= blArray.length || !blArray[n7]) continue;
                    blArray2[i3] = true;
                }
            }
            this.k = new f(n4, sArray);
        }
    }

    static void c(b3 object, long l3, long l4, int n3, boolean bl, int n4) {
        int n5;
        Object object2;
        Object var13_7;
        Object object3;
        block28: {
            block23: {
                block27: {
                    block26: {
                        block24: {
                            Object object4;
                            block25: {
                                object3 = ((b3)object).h;
                                var13_7 = null;
                                if ((l3 & 1L) == 0L && (n3 & 0x20) != 0) {
                                    object4 = new StringBuilder();
                                    object2 = t;
                                    if (object2 == null) {
                                        object2 = new n();
                                        t = object2;
                                    }
                                    ((StringBuilder)object4).append(android.ext.n.q((n)object2, l3, l4));
                                    ((StringBuilder)object4).append(';');
                                    object2 = ((StringBuilder)object4).toString();
                                } else {
                                    object2 = null;
                                }
                                n5 = n1.N(object3, object2, n4, 2);
                                object3 = ((b3)object).g;
                                long l5 = (3L & l3) - 0L;
                                n4 = l5 == 0L ? 0 : (l5 < 0L ? -1 : 1);
                                if (n4 == 0 && (n3 & 0x10) != 0) {
                                    object4 = new StringBuilder();
                                    object2 = t;
                                    if (object2 == null) {
                                        t = object2 = new n();
                                    }
                                    ((StringBuilder)object4).append(android.ext.n.o((n)object2, l3, l4));
                                    ((StringBuilder)object4).append(';');
                                    object2 = ((StringBuilder)object4).toString();
                                } else {
                                    object2 = null;
                                }
                                n5 = n1.N(object3, (CharSequence)object2, n5, 4);
                                object3 = ((b3)object).i;
                                if (n4 == 0 && (n3 & 0x40) != 0) {
                                    object2 = u;
                                    if (object2 == null) {
                                        object2 = android.ext.m.d();
                                        u = (int[])object2;
                                    }
                                    object2 = android.ext.m.g((int[])object2, l3, (int)l4, new StringBuilder());
                                    ((StringBuilder)object2).append(';');
                                    object2 = ((StringBuilder)object2).toString();
                                } else {
                                    object2 = null;
                                }
                                n5 = n1.N(object3, (CharSequence)object2, n5, 4);
                                n4 = 0;
                                if ((n3 & 1) == 0) break block23;
                                if (!bl) break block24;
                                l3 = n5 != 8 ? l4 & (1L << n5 * 8) - 1L : l4;
                                object2 = new StringBuilder();
                                ((StringBuilder)object2).append(t2.e(n5 * 2, l3));
                                ((StringBuilder)object2).append("h;");
                                object3 = ((StringBuilder)object2).toString();
                                object4 = MainService.instance.v0;
                                if (n5 == 4) break block25;
                                l4 = l3;
                                object2 = object3;
                                if (object4 == null) break block26;
                                l4 = l3;
                                object2 = object3;
                                if (!((z1.d)object4).n) break block26;
                                l4 = l3;
                                object2 = object3;
                                if (n5 != 8) break block26;
                            }
                            object4 = RegionList.b(l3);
                            object2 = object3;
                            object3 = object4;
                            break block27;
                        }
                        object2 = "?";
                    }
                    object3 = null;
                    l3 = l4;
                }
                n1.O(((b3)object).c, (CharSequence)object2);
                ((b3)object).c.setTextColor(RegionList.b.c((RegionList.b)object3));
                l4 = l3;
                if (n5 == 1) {
                    n4 = 1;
                    l4 = l3;
                }
                break block28;
            }
            n1.O(((b3)object).c, null);
        }
        if (n4 == 0 && (n3 & 2) != 0) {
            if (bl) {
                long l6;
                l3 = Long.reverseBytes(l4);
                n4 = n5 * 8;
                l3 = l6 = l3 >> 64 - n4;
                if (n5 != 8) {
                    l3 = l6 & (1L << n4) - 1L;
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(t2.e(n5 * 2, l3));
                ((StringBuilder)object2).append("r;");
                object2 = ((StringBuilder)object2).toString();
            } else {
                object2 = "?";
            }
            n1.O(((b3)object).d, (CharSequence)object2);
        } else {
            n1.O(((b3)object).d, null);
        }
        object3 = ((b3)object).e;
        if ((n3 & 4) == 0) {
            object2 = null;
        } else if (bl) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append('\'');
            ((StringBuilder)object2).append(n1.I(l4, n5));
            ((StringBuilder)object2).append("';");
            object2 = ((StringBuilder)object2).toString();
        } else {
            object2 = "?";
        }
        n1.O(object3, (CharSequence)object2);
        object2 = ((b3)object).f;
        if ((n3 & 8) == 0) {
            object = var13_7;
        } else if (bl) {
            object = new StringBuilder();
            ((StringBuilder)object).append('\"');
            ((StringBuilder)object).append(n1.H(l4, n5));
            ((StringBuilder)object).append("\";");
            object = ((StringBuilder)object).toString();
        } else {
            object = "?";
        }
        n1.O((TextView)object2, (CharSequence)object);
    }

    static int[] g() {
        if (w == null) {
            int n3 = Tools.d0(2130837526);
            int n4 = Tools.d0(2130837530);
            int[] nArray = new int[]{-1, -1, -1, -1, n3, n4, n3, android.ext.c.n(4), android.ext.c.n(16), android.ext.c.n(64), android.ext.c.n(2), android.ext.c.n(1), android.ext.c.n(32), android.ext.c.n(8)};
            w = nArray;
            return nArray;
        }
        return w;
    }

    private int h() {
        short[] sArray = this.c;
        int n3 = sArray == null ? this.s() : sArray.length;
        return n3;
    }

    private int j() {
        int n3 = this.j;
        if (n3 != this.r) {
            int n4 = 0;
            for (int i3 = 0; i3 < 14; ++i3) {
                int n5 = n4;
                if ((1 << i3 & n3) != 0) {
                    n5 = n4 | (new int[]{0, 0, 0, 0, 4, 2, 4, 4, 16, 64, 2, 1, 32, 8})[i3];
                }
                n4 = n5;
            }
            this.r = n3;
            this.q = n4;
        }
        return this.q;
    }

    private int k(long l3) {
        int n3;
        this.h = n3 = this.p(l3);
        return n3;
    }

    static CharSequence[] l() {
        return new CharSequence[]{b2.f(2131296472), b2.f(2131296473), b2.f(2131296474), "UTF-16LE", Tools.L1(b2.f(2131296471), "ARM (x32)"), Tools.L1(b2.f(2131296471), "Thumb"), Tools.L1(b2.f(2131296471), "ARM (x64)"), b2.f(2131297034), b2.f(2131297037), b2.f(2131297031), b2.f(2131297043), b2.f(2131297028), b2.f(2131297039), b2.f(2131297045)};
    }

    private View m(ViewGroup viewGroup) {
        viewGroup = a.d.g(2131099682, viewGroup, false);
        c3 c32 = new c3((View)viewGroup, this);
        c32.n = (TextView)viewGroup.findViewById(2131034443);
        c32.o = (TextView)viewGroup.findViewById(2131034444);
        c32.p = (TextView)viewGroup.findViewById(2131034442);
        c32.q = (TextView)viewGroup.findViewById(2131034453);
        c32.r = (TextView)viewGroup.findViewById(2131034441);
        c32.s = (TextView)viewGroup.findViewById(2131034448);
        c32.t = (TextView)viewGroup.findViewById(2131034454);
        return viewGroup;
    }

    private int n(long l3) {
        return (int)(l3 & 0x1FFFL);
    }

    private long o() {
        return this.g;
    }

    private CharSequence t(long l3) {
        int n3;
        int n4;
        CharSequence[] charSequenceArray = this.o;
        long l4 = this.o();
        long l5 = this.p;
        int n5 = n4 = 0;
        if (l5 != l4) {
            this.p = l4;
            n3 = 0;
            while (true) {
                n5 = n4;
                if (n3 >= charSequenceArray.length) break;
                charSequenceArray[n3] = RegionList.a((long)n3 * 4096L + l4);
                ++n3;
            }
        }
        while (n5 < charSequenceArray.length) {
            n3 = n5 + 1;
            if (Tools.T1(l3, (long)n3 * 4096L + l4 - 1L)) {
                return charSequenceArray[n5];
            }
            n5 = n3;
        }
        return "??";
    }

    private int u() {
        int n3 = this.l;
        int n4 = this.j;
        long l3 = 0x400000000L | (long)n4;
        if (l3 != this.m) {
            n3 = (n4 & 0x800) != 0 ? 0 : ((n4 & 0x420) != 0 ? 1 : 2);
            this.l = n3;
            this.m = l3;
        }
        return n3;
    }

    private static CharSequence[] v() {
        if (v == null) {
            CharSequence[] charSequenceArray = new CharSequence[14];
            Object object = b2.f(2131296670);
            charSequenceArray[0] = object;
            charSequenceArray[1] = b2.f(2131296912);
            charSequenceArray[2] = "S";
            charSequenceArray[3] = "J";
            charSequenceArray[4] = "A";
            charSequenceArray[5] = "T";
            charSequenceArray[6] = "A8";
            charSequenceArray[7] = b2.f(2131297035);
            charSequenceArray[8] = b2.f(2131297038);
            charSequenceArray[9] = b2.f(2131297033);
            charSequenceArray[10] = b2.f(2131297044);
            charSequenceArray[11] = b2.f(2131297029);
            charSequenceArray[12] = b2.f(2131297041);
            charSequenceArray[13] = b2.f(2131297046);
            object = n1.g();
            for (int i3 = 0; i3 < 14; ++i3) {
                charSequenceArray[i3] = Tools.t(charSequenceArray[i3], (int)object[i3]);
            }
            v = charSequenceArray;
            return charSequenceArray;
        }
        return v;
    }

    private int w(long l3, long l4, int n3, StringBuilder stringBuilder, int n4, int n5, int n6, int n7) {
        int n8 = n3;
        if (((long)(n7 - 1) & l3) == 0L) {
            n8 = n3;
            if ((1 << n4 & this.j) != 0) {
                stringBuilder.append(android.ext.c.K(l3, l4, n5));
                stringBuilder.append("\n");
                n8 = n3;
                if (n3 == 0) {
                    n8 = n6;
                }
            }
        }
        return n8;
    }

    private int x(boolean bl, android.ext.d object, long l3, long l4, int n3, TextView textView, int n4, int n5, int n6, int n7) {
        if (((long)(n7 - 1) & l3) == 0L && (1 << n4 & this.j) != 0) {
            if (bl) {
                CharSequence charSequence = android.ext.c.K(l3, l4, n5);
                d.a a4 = this.n;
                ((android.ext.d)object).a(l3, n5, a4);
                object = charSequence;
                if (a4.b) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append((String)charSequence);
                    ((StringBuilder)object).append(" (");
                    ((StringBuilder)object).append(android.ext.c.I(l3, a4.a, n5));
                    ((StringBuilder)object).append(')');
                    object = ((StringBuilder)object).toString();
                }
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)object);
                ((StringBuilder)charSequence).append((Object)android.ext.c.A(n5));
                ((StringBuilder)charSequence).append(';');
                object = ((StringBuilder)charSequence).toString();
            } else {
                object = "?";
            }
            n1.O(textView, (CharSequence)object);
            if (n3 == 0) {
                n3 = n6;
            }
        } else {
            n1.O(textView, null);
        }
        return n3;
    }

    private long[] y(boolean bl) {
        long l3;
        long l4 = this.o();
        if (!bl) {
            if (l4 == 0L) {
                long l5 = l4;
                l3 = l4;
                l4 = l5;
            } else {
                long l6 = l4 - 1L;
                l3 = l4;
                l4 = l6;
            }
        } else {
            l3 = 8192L + l4;
            l4 = l3 == 0L ? (l4 += 8191L) : l3;
        }
        return new long[]{l4, l3};
    }

    boolean E() {
        boolean bl = this.e == this.o();
        return bl;
    }

    public void F() {
        MainService.instance.Q();
        MainService.instance.i.O(this.o(), 8196);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void G(w object) {
        long l3;
        block5: {
            void var1_4;
            l3 = this.o();
            try {
                ((w)object).j();
                long l4 = ((w)object).g();
                int n3 = ((w)object).f();
                if (l4 != l3) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Offset mismatch: ");
                    stringBuilder.append(l4);
                    stringBuilder.append(" (");
                    String string2 = Long.toHexString(l4);
                    object = Locale.US;
                    stringBuilder.append(string2.toUpperCase((Locale)object));
                    stringBuilder.append(") != ");
                    stringBuilder.append(l3);
                    stringBuilder.append(" (");
                    stringBuilder.append(Long.toHexString(l3).toUpperCase((Locale)object));
                    stringBuilder.append(")");
                    RuntimeException runtimeException = new RuntimeException(stringBuilder.toString());
                    throw runtimeException;
                }
                if (n3 < 8192) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Size mismatch: ");
                    stringBuilder.append(n3);
                    stringBuilder.append(" (");
                    String string3 = Integer.toHexString(n3);
                    object = Locale.US;
                    stringBuilder.append(string3.toUpperCase((Locale)object));
                    stringBuilder.append(") != ");
                    stringBuilder.append(8192);
                    stringBuilder.append(" (");
                    stringBuilder.append(Integer.toHexString(8192).toUpperCase((Locale)object));
                    stringBuilder.append(")");
                    RuntimeException runtimeException = new RuntimeException(stringBuilder.toString());
                    throw runtimeException;
                }
                ((w)object).d(this.d, 0, n3);
                break block5;
            }
            catch (IOException iOException) {
            }
            catch (RuntimeException runtimeException) {}
            e1.s("Failed load data to memory editor", (Throwable)var1_4);
            Arrays.fill(this.d, (byte)0);
        }
        this.e = l3;
        MainService.instance.M.post(new Runnable(this){
            final n1 a;
            {
                this.a = n12;
            }

            @Override
            public void run() {
                this.a.notifyDataSetChanged();
            }
        });
    }

    public void L() {
        this.F();
    }

    public void M(long l3, int n3) {
        long l4 = 0xFFFFFFFFFFFFE000L & l3;
        if (l4 != this.g) {
            this.g = l4;
            Arrays.fill(this.i, false);
            this.notifyDataSetChanged();
        }
        Tools.B1(MainService.instance.M, this.k(l3), n3);
    }

    void P() {
        this.a();
        super.notifyDataSetChanged();
    }

    void R(int n3) {
        if (n3 == this.j) {
            return;
        }
        int n4 = this.u();
        Tools.a0 a02 = Tools.J0(MainService.instance.M);
        long l3 = this.e(a02.a);
        int n5 = this.h;
        long l4 = n5 < 0 ? -1L : this.e(n5);
        this.j = n3;
        new g2().g("memory-editor-format", this.j, -15999).commit();
        this.notifyDataSetChanged();
        if (n4 != this.u()) {
            a02.a = this.p(l3);
            Tools.A1(MainService.instance.M, a02);
            if (this.h >= 0) {
                this.h = this.p(l4);
            }
        }
        MainService.instance.u.setText(this.A());
    }

    public void b() {
        Object object;
        boolean bl = MainService.instance.H() == 2;
        Object[] objectArray = n1.l();
        int n3 = this.j;
        CharSequence[] charSequenceArray = objectArray;
        if (bl) {
            charSequenceArray = Arrays.copyOf(objectArray, 7);
            n3 = SavedListAdapter.c;
        }
        objectArray = new boolean[charSequenceArray.length];
        CharSequence[] charSequenceArray2 = n1.v();
        int[] nArray = n1.g();
        for (int i3 = 0; i3 < charSequenceArray.length; ++i3) {
            object = new StringBuilder();
            ((StringBuilder)object).append((Object)charSequenceArray2[i3]);
            ((StringBuilder)object).append(": ");
            ((StringBuilder)object).append((Object)charSequenceArray[i3]);
            charSequenceArray[i3] = Tools.t(((StringBuilder)object).toString(), nArray[i3]);
            boolean bl2 = (1 << i3 & n3) != 0;
            objectArray[i3] = (CharSequence)bl2;
        }
        object = new DialogInterface.OnClickListener(this, bl, (boolean[])objectArray){
            final boolean a;
            final boolean[] b;
            final n1 c;
            {
                this.c = n12;
                this.a = bl;
                this.b = blArray;
            }

            public void onClick(DialogInterface object, int n3) {
                boolean bl = this.a;
                int n4 = 0;
                int n5 = bl ? 0 : -15999;
                int n6 = n5;
                if (n3 == -1) {
                    n3 = n4;
                    while (true) {
                        object = this.b;
                        n6 = n5;
                        if (n3 >= ((DialogInterface)object).length) break;
                        n5 = object[n3] != false ? (n5 |= 1 << n3) : (n5 &= ~(1 << n3));
                        ++n3;
                    }
                }
                bl = this.a;
                n3 = n6;
                if (!bl) {
                    n3 = n6;
                    if (((1 << this.b.length) - 1 & n6) == 0) {
                        n3 = n6 | 8;
                    }
                }
                if (bl) {
                    SavedListAdapter.o(n3);
                } else {
                    this.c.R(n3);
                }
            }
        };
        android.ext.f.o(android.ext.f.c(Tools.k0()).setCustomTitle(Tools.g0(2131297081)).setMultiChoiceItems(charSequenceArray, (boolean[])objectArray, new DialogInterface.OnMultiChoiceClickListener(this, (boolean[])objectArray){
            final boolean[] a;
            final n1 b;
            {
                this.b = n12;
                this.a = blArray;
            }

            public void onClick(DialogInterface dialogInterface, int n3, boolean bl) {
                this.a[n3] = bl;
            }
        }).setPositiveButton((CharSequence)b2.f(2131297115), (DialogInterface.OnClickListener)object).setNeutralButton((CharSequence)b2.f(2131296898), (DialogInterface.OnClickListener)object).setNegativeButton((CharSequence)b2.f(2131296805), null));
    }

    public void d() {
        long l3;
        this.p = l3 = this.o();
        boolean bl = false;
        for (int i3 = 0; i3 < this.o.length; ++i3) {
            CharSequence charSequence = RegionList.a((long)i3 * 4096L + l3);
            if (charSequence.equals(this.o[i3])) continue;
            this.o[i3] = charSequence;
            bl = true;
        }
        if (bl) {
            this.notifyDataSetChanged();
        }
    }

    public long e(int n3) {
        return this.r(this.J(n3 - 1));
    }

    public boolean[] f() {
        return this.i;
    }

    public int getCount() {
        return this.h() + 2;
    }

    public Filter getFilter() {
        Filter filter;
        Filter filter2 = filter = this.b;
        if (filter == null) {
            this.b = filter2 = new e(this);
        }
        return filter2;
    }

    public Object getItem(int n3) {
        if (n3 != 0 && n3 != this.getCount() - 1) {
            long l3 = this.e(n3);
            if ((n3 = android.ext.c.S(l3, false) & this.j()) == 0) {
                n3 = android.ext.c.S(l3, true);
            }
            return new c(l3, this.f.getLong(this.n(l3)), n3);
        }
        boolean bl = n3 != 0;
        long[] lArray = this.y(bl);
        return new v0(lArray[0], lArray[1]);
    }

    public long getItemId(int n3) {
        return this.e(n3);
    }

    public int getPositionForSection(int n3) {
        return this.p(this.g + (long)n3 * 256L);
    }

    public int getSectionForPosition(int n3) {
        int n4;
        n3 = n4 = (int)((this.e(n3) - this.o()) / 256L);
        if (n4 < 0) {
            n3 = 0;
        }
        n4 = n3;
        if (n3 >= 32) {
            n4 = 31;
        }
        return n4;
    }

    public Object[] getSections() {
        Object[] objectArray = new Object[32];
        for (int i3 = 0; i3 < 32; ++i3) {
            objectArray[i3] = android.ext.c.G(this.g + (long)i3 * 256L, 4);
        }
        return objectArray;
    }

    public View getView(int n3, View object, ViewGroup viewGroup) {
        View view;
        block5: {
            block4: {
                if (object == null) break block4;
                view = object;
                if (object.getTag() instanceof c3) break block5;
            }
            view = this.m(viewGroup);
        }
        c3 c32 = (c3)view.getTag();
        object = c32;
        if (c32.b()) {
            view = this.m(viewGroup);
            object = (c3)view.getTag();
        }
        this.Q((c3)object, n3);
        return view;
    }

    public boolean hasStableIds() {
        return false;
    }

    public p1 i() {
        d d4;
        d d5 = d4 = this.s;
        if (d4 == null) {
            this.s = d5 = new d(this);
        }
        return d5;
    }

    public void notifyDataSetChanged() {
        this.getFilter().filter((CharSequence)this.a);
        this.P();
    }

    public void onCheckedChanged(CompoundButton object, boolean bl) {
        if ((object = (b3)object.getTag()) == null) {
            return;
        }
        try {
            this.i[((b3)object).m] = bl;
            MainService.instance.p1();
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            e1.l("ArrayAdapter onCheckedChanged failed", indexOutOfBoundsException);
        }
        ((b3)object).a(bl, this.h);
    }

    public int p(long l3) {
        return this.C((int)(l3 - this.o() >> this.u())) + 1;
    }

    public int q(boolean[] blArray, SparseIntArray sparseIntArray) {
        int n3;
        int n4;
        int n5 = blArray.length;
        int n6 = 0;
        for (n4 = 1; n4 < n5 - 1; ++n4) {
            n3 = n6;
            if (blArray[n4]) {
                n3 = n6 | android.ext.c.T(this.e(n4), false, sparseIntArray);
            }
            n6 = n3;
        }
        n3 = n6;
        if ((Config.B & 0x400) != 0) {
            n4 = this.j();
            n3 = n6;
            if (Integer.bitCount(n4) == 1) {
                n3 = n6;
                if ((n4 &= n6) != 0) {
                    n3 = n4;
                }
            }
        }
        return n3;
    }

    public long r(long l3) {
        return (l3 << this.u()) + this.o();
    }

    int s() {
        return 8192 >> this.u();
    }

    String z(n n3, int[] nArray, int n4) {
        long l3;
        if (!this.E()) {
            return "";
        }
        long l4 = this.r(n4);
        long l5 = this.f.getLong(this.n(l4));
        StringBuilder stringBuilder = new StringBuilder();
        int n5 = this.w(l4, l5, this.w(l4, l5, this.w(l4, l5, this.w(l4, l5, this.w(l4, l5, this.w(l4, l5, this.w(l4, l5, 0, stringBuilder, 9, 64, 8, 4), stringBuilder, 12, 32, 8, 4), stringBuilder, 8, 16, 4, 4), stringBuilder, 7, 4, 4, 4), stringBuilder, 13, 8, 4, 4), stringBuilder, 10, 2, 2, 2), stringBuilder, 11, 1, 1, 1);
        n4 = 1;
        int n6 = n5;
        if (n5 == 0) {
            n6 = 1 << this.u();
        }
        int n7 = this.j;
        n5 = 0;
        if ((n7 & 1) != 0) {
            l3 = l5;
            if (n6 != 8) {
                l3 = l5 & (1L << n6 * 8) - 1L;
            }
            String string2 = t2.e(n6 * 2, l3);
            stringBuilder.append(string2);
            stringBuilder.append("\n");
            if (n6 != 1) {
                n4 = 0;
            }
        } else {
            l3 = l5;
            n4 = n5;
        }
        if (n4 == 0 && (this.j & 2) != 0) {
            long l6;
            l5 = Long.reverseBytes(l3);
            n4 = n6 * 8;
            l5 = l6 = l5 >> 64 - n4;
            if (n6 != 8) {
                l5 = l6 & (1L << n4) - 1L;
            }
            stringBuilder.append(t2.e(n6 * 2, l5));
            stringBuilder.append("\n");
        }
        if ((this.j & 4) != 0) {
            stringBuilder.append(n1.I(l3, n6));
            stringBuilder.append("\n");
        }
        if ((this.j & 8) != 0) {
            stringBuilder.append(n1.H(l3, n6));
            stringBuilder.append("\n");
        }
        if ((this.j & 0x10) != 0) {
            stringBuilder.append(android.ext.n.o(n3, l4, l3));
            stringBuilder.append("\n");
        }
        if ((this.j & 0x20) != 0) {
            stringBuilder.append(android.ext.n.q(n3, l4, l3));
            stringBuilder.append("\n");
        }
        if ((this.j & 0x40) != 0) {
            android.ext.m.g(nArray, l4, (int)l3, stringBuilder);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    private class d
    extends p1
    implements DialogInterface.OnClickListener,
    CompoundButton.OnCheckedChangeListener,
    TextWatcher {
        private WeakReference f;
        private WeakReference g;
        private WeakReference h;
        boolean i;
        final n1 j;

        public d(n1 n12) {
            this.j = n12;
            super(2131296453, 2130968612);
            this.f = new WeakReference<Object>(null);
            this.g = new WeakReference<Object>(null);
            this.h = new WeakReference<Object>(null);
            this.i = false;
        }

        public void afterTextChanged(Editable object) {
            object = object.toString();
            CheckBox checkBox = (CheckBox)this.g.get();
            if (checkBox == null) {
                return;
            }
            int n3 = ((String)object).indexOf(94);
            boolean bl = false;
            boolean bl2 = n3 != -1;
            checkBox.setChecked(bl2);
            checkBox = (CheckBox)this.h.get();
            if (checkBox == null) {
                return;
            }
            bl2 = bl;
            if (((String)object).indexOf(36) != -1) {
                bl2 = true;
            }
            checkBox.setChecked(bl2);
        }

        public void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n5) {
        }

        /*
         * Enabled aggressive block sorting
         */
        public void onCheckedChanged(CompoundButton object, boolean bl) {
            String string2;
            EditText editText;
            block11: {
                String string3;
                int n3;
                block10: {
                    block9: {
                        if (object == null) {
                            return;
                        }
                        editText = (EditText)this.f.get();
                        if (editText == null) {
                            return;
                        }
                        n3 = object.getId();
                        if (n3 == 2131034244) break block9;
                        if (n3 == 2131034249) {
                            this.i = bl;
                            object = editText.getOnFocusChangeListener();
                            if (object == null) return;
                            object.onFocusChange((View)editText, true);
                            return;
                        }
                        if (n3 != 2131034416) {
                            return;
                        }
                        string3 = editText.getText().toString();
                        object = "^";
                        if (string3.contains("^") == bl) return;
                        if (bl) {
                            editText.getText().replace(0, 0, (CharSequence)"^");
                            return;
                        }
                        break block10;
                    }
                    string2 = editText.getText().toString();
                    object = "$";
                    if (string2.contains("$") == bl) return;
                    string3 = string2;
                    if (bl) break block11;
                }
                n3 = string3.indexOf((String)object);
                editText.getText().replace(n3, n3 + 1, (CharSequence)"");
                return;
            }
            editText.getText().replace(string2.length(), string2.length(), (CharSequence)"$");
        }

        public void onClick(DialogInterface object, int n3) {
            Object object2;
            if (n3 == -1) {
                object = (EditText)this.f.get();
                if (object == null) {
                    return;
                }
                object = object2 = object.getText().toString();
                if (((String)object2).length() > 0) {
                    n3 = this.i ? 2 : 1;
                    y0.b((String)object2, n3);
                    object = object2;
                }
            } else {
                object = "";
            }
            this.j.a = object;
            object2 = MainService.instance.t;
            if (((String)object).length() > 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(Tools.N1(2131296453));
                stringBuilder.append(": ");
                stringBuilder.append((String)object);
                object = stringBuilder.toString();
            } else {
                object = b2.f(2131296807);
            }
            object2.setText((CharSequence)object);
            this.j.notifyDataSetChanged();
        }

        @Override
        public void onClick(View object) {
            if (object != null && object.getId() == 2131034328) {
                object = android.ext.f.b();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(b2.f(2131296418));
                stringBuilder.append(":\n");
                stringBuilder.append(b2.f(2131296773));
                android.ext.f.o(object.setMessage((CharSequence)stringBuilder.toString()).setPositiveButton((CharSequence)b2.f(2131296519), new DialogInterface.OnClickListener(this){
                    final d a;
                    {
                        this.a = d4;
                    }

                    public void onClick(DialogInterface dialogInterface, int n3) {
                        ConfigListAdapter.t(2131296642);
                    }
                }).setNegativeButton((CharSequence)b2.f(2131296311), null));
                return;
            }
            View view = a.d.f(2131099660, null);
            object = (TextView)view.findViewById(2131034328);
            Tools.r1(object);
            object.setOnClickListener((View.OnClickListener)this);
            object = (CheckBox)view.findViewById(2131034249);
            object.setChecked(this.i);
            object.setText((CharSequence)b2.f(2131296724));
            object.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this);
            object = (CheckBox)view.findViewById(2131034416);
            object.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this);
            this.g = new WeakReference<View>((View)object);
            object = (CheckBox)view.findViewById(2131034244);
            object.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this);
            this.h = new WeakReference<View>((View)object);
            Object object2 = this.j.a;
            object = object2;
            if (object2 == null) {
                object = "";
            }
            InternalKeyboard.e e4 = new InternalKeyboard.e(this){
                final d a;
                {
                    this.a = d4;
                }

                @Override
                protected boolean a(View view, boolean bl) {
                    return this.a.i;
                }
            };
            object2 = (EditText)view.findViewById(2131034262);
            object2.setText((CharSequence)object);
            ((EditText)object2).setDataType(3);
            Tools.z1((View)object2, e4);
            object2.addTextChangedListener((TextWatcher)this);
            this.f = new WeakReference<Object>(object2);
            this.afterTextChanged(object2.getText());
            ((HexConverter)view.findViewById(2131034347)).setTag(object2);
            view.setTag((Object)new InternalKeyboard.d(15));
            android.ext.f.n(android.ext.f.b().setView(InternalKeyboard.d(view)).setPositiveButton(2131296836, (DialogInterface.OnClickListener)this).setNegativeButton(2131296311, null).setNeutralButton(2131296323, (DialogInterface.OnClickListener)this).create(), (android.widget.EditText)object2);
        }

        public void onTextChanged(CharSequence charSequence, int n3, int n4, int n5) {
        }
    }

    private class e
    extends Filter {
        n a;
        int[] b;
        final n1 c;

        private e(n1 n12) {
            this.c = n12;
            this.a = null;
            this.b = null;
        }

        private String a(String string2) {
            return string2.toLowerCase(Locale.US).replace(t1.a, "");
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Filter.FilterResults performFiltering(CharSequence object) {
            int n3;
            short[] sArray;
            short s3;
            Pattern pattern;
            CharSequence charSequence;
            boolean bl;
            int[] nArray;
            Filter.FilterResults filterResults;
            block10: {
                filterResults = new Filter.FilterResults();
                nArray = null;
                filterResults.values = null;
                try {
                    bl = (this.c.j & 0xC) == 0;
                    if (object == null) return filterResults;
                    if (object.length() <= 0) return filterResults;
                    if (!this.c.E()) return filterResults;
                    charSequence = object.toString();
                    object = charSequence;
                    if (bl) {
                        object = this.a((String)charSequence);
                    }
                    object = Tools.k1((String)object);
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("Filter: '");
                    ((StringBuilder)charSequence).append((String)object);
                    ((StringBuilder)charSequence).append('\'');
                    e1.d(((StringBuilder)charSequence).toString());
                    pattern = Pattern.compile((String)object, 8);
                    if ((this.c.j & 0x30) == 0) {
                        object = null;
                    } else {
                        object = this.a;
                        if (object == null) {
                            this.a = object = new n();
                        }
                    }
                    if ((this.c.j & 0x40) != 0 && (nArray = this.b) == null) {
                        this.b = nArray = android.ext.m.d();
                    }
                    s3 = (short)this.c.s();
                    sArray = new short[s3];
                    n3 = 0;
                    break block10;
                }
                catch (Throwable throwable) {}
                e1.g("Failed filter", throwable);
                n0.h(Thread.currentThread(), throwable, false);
                return filterResults;
            }
            for (short s4 = 0; s4 < s3; s4 = (short)(s4 + 1)) {
                String string2 = this.c.z((n)object, nArray, s4);
                charSequence = string2;
                if (bl) {
                    charSequence = this.a(string2);
                }
                if (!pattern.matcher(charSequence).find()) continue;
                sArray[n3] = s4;
                ++n3;
            }
            {
                filterResults.values = Arrays.copyOf(sArray, n3);
                return filterResults;
            }
        }

        protected void publishResults(CharSequence object, Filter.FilterResults filterResults) {
            object = this.c;
            ((n1)object).c = (short[])filterResults.values;
            ((n1)object).P();
        }
    }

    private static class f {
        int a;
        short[] b;

        private f(int n3, short[] sArray) {
            this.a = n3;
            this.b = sArray;
        }
    }
}

