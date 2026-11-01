package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class t0 extends j2 implements View.OnClickListener {
    private a.e l;
    private long m;
    private long n;
    private long o;

    class a implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f1247a;

        a(TextView textView) {
            this.f1247a = textView;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f1247a.setText("" + (i + 1));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    class b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SeekBar f1249a;

        b(SeekBar seekBar) {
            this.f1249a = seekBar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                t0.l("0", MainService.D() & 127, 536870912, this.f1249a.getProgress() + 1, t0.this.j.e(0), t0.this.j.e(1), t0.this.j.b());
            } catch (NumberFormatException e2) {
                j2.i(e2, t0.this.j.g());
            }
        }
    }

    public t0() {
        super(R.string.search_unknown_value, R.drawable.ic_fuzzy_white_24dp);
        this.m = 0L;
        this.n = -1L;
        this.o = 0L;
    }

    public static boolean k(byte b2, String str, int i, int i2, int i3, long j, long j2, long j3) {
        long jD;
        int i4;
        int iG;
        long j4;
        int i5 = i2 & 1006632960;
        MainService mainService = MainService.instance;
        int iD = i & 127 & MainService.D() & 127;
        if (iD == 0) {
            mainService.n(b2);
            return true;
        }
        boolean z = str.indexOf(126) != -1;
        t1.b bVar = new t1.b();
        if (!z) {
            jD = c.d(bVar, str, iD);
            i4 = i5;
            iG = iD & bVar.f1263c;
            j4 = 0;
        } else {
            if (i5 != 536870912 && i5 != 268435456) {
                throw new NumberFormatException(Tools.L1(b2.f(R.string.does_not_support), b2.f(R.string.help_range_search_title), c.B().get(i5)));
            }
            i2.b bVarW = i2.w(bVar, str, iD, i5);
            long j5 = bVarW.f1013a;
            long j6 = bVarW.f1014b;
            int i6 = bVarW.f1015c;
            i4 = bVarW.f1016d;
            iG = i6;
            j4 = j6;
            jD = j5;
        }
        if (Integer.bitCount(iG) > 1) {
            iG = c.g(iG, jD, bVar.f1262b);
            if (j4 != 0) {
                iG = c.g(iG, j4, bVar.f1262b);
            }
        }
        int i7 = iG;
        if (!mainService.a1()) {
            throw new NumberFormatException(b2.f(R.string.busy_dialog_fail));
        }
        mainService.R(b2);
        mainService.r0 = false;
        mainService.i.D(b2, jD, j4, z ? 8388608 | i7 : i7, i4, i3, j, j2, j3);
        MainService.N0(i7, b2);
        return false;
    }

    public static boolean l(String str, int i, int i2, int i3, long j, long j2, long j3) {
        String strH = j2.h(str);
        boolean zK = k((byte) 0, strH, i, i2, i3, j, j2, j3);
        c2 c2Var = MainService.instance.f216f;
        if (c2Var != null) {
            c2Var.write("gg.searchFuzzy(");
            Script.Consts.d(c2Var, strH);
            c2Var.write(", ");
            Script.Consts.a(c2Var, c2Var.f697c.f373c, i2);
            c2Var.write(", ");
            Script.Consts.a(c2Var, c2Var.f697c.f372b, i);
            c2Var.write(", ");
            Script.Consts.b(c2Var, j);
            c2Var.write(", ");
            Script.Consts.b(c2Var, j2);
            c2Var.write(", ");
            c2Var.write(Long.toString(j3));
            c2Var.write(")\n");
        }
        return zK;
    }

    public static boolean m(byte b2, int i, long j, long j2, long j3) {
        int i2 = i & 127;
        MainService mainService = MainService.instance;
        if (i2 == 0) {
            mainService.n(b2);
            return true;
        }
        if (!mainService.a1()) {
            throw new NumberFormatException(b2.f(R.string.busy_dialog_fail));
        }
        if (mainService.p0 != 0) {
            mainService.n(b2);
        }
        mainService.q0 = true;
        mainService.i.x0(b2);
        mainService.R(b2);
        mainService.r0 = false;
        mainService.i.F(b2, i2, j, j2, j3);
        MainService.N0(i2, b2);
        return false;
    }

    public static boolean n(int i, long j, long j2, long j3) {
        boolean zM = m((byte) 0, i, j, j2, j3);
        c2 c2Var = MainService.instance.f216f;
        if (c2Var != null) {
            c2Var.write("\ngg.startFuzzy(");
            Script.Consts.a(c2Var, c2Var.f697c.f372b, i);
            c2Var.write(", ");
            Script.Consts.b(c2Var, j);
            c2Var.write(", ");
            Script.Consts.b(c2Var, j2);
            c2Var.write(", ");
            c2Var.write(Long.toString(j3));
            c2Var.write(")\n");
        }
        return zM;
    }

    private void o() {
        View viewF = a.d.f(R.layout.service_fuzzy_equal, null);
        SeekBar seekBar = (SeekBar) viewF.findViewById(R.id.count_fuzzy_equal_seekbar);
        seekBar.setOnSeekBarChangeListener(new a((TextView) viewF.findViewById(R.id.count_fuzzy_equal)));
        f.o(f.b().setCustomTitle(Tools.g0(R.string.fuzzy_equal)).setMessage(b2.f(R.string.count_fuzzy_equal_run)).setPositiveButton(b2.f(R.string.ok), new b(seekBar)).setNegativeButton(b2.f(R.string.cancel), (DialogInterface.OnClickListener) null).setView(viewF));
    }

    private void p() {
        MainService mainService = MainService.instance;
        if (mainService.i.d0()) {
            int iD = MainService.D();
            if (mainService.p0 == 0) {
                Searcher searcher = new Searcher(1, iD);
                this.j = searcher;
                this.l = searcher.G(iD);
                this.j.y(b2.f(R.string.type_request));
                AlertDialog alertDialogCreate = f.b().setView(this.j.l()).setPositiveButton(b2.f(R.string.search), this).setNegativeButton(b2.f(R.string.cancel), (DialogInterface.OnClickListener) null).create();
                f.k(alertDialogCreate, this);
                f.l(alertDialogCreate, this);
                this.k = new WeakReference(alertDialogCreate);
                f.m(alertDialogCreate);
                return;
            }
            Searcher searcher2 = new Searcher(2, iD);
            this.j = searcher2;
            this.l = searcher2.G(iD);
            this.j.y(b2.f(R.string.compare_current_last));
            this.j.C(this);
            View viewL = this.j.l();
            ((Button) viewL.findViewById(R.id.equal_btn)).setOnClickListener(this);
            ((Button) viewL.findViewById(R.id.not_equal_btn)).setOnClickListener(this);
            ((Button) viewL.findViewById(R.id.larger_btn)).setOnClickListener(this);
            ((Button) viewL.findViewById(R.id.smaller_btn)).setOnClickListener(this);
            AlertDialog alertDialogCreate2 = f.b().setView(viewL).create();
            f.k(alertDialogCreate2, this);
            f.l(alertDialogCreate2, this);
            this.k = new WeakReference(alertDialogCreate2);
            f.n(alertDialogCreate2, this.j.g());
        }
    }

    @Override // android.ext.j2
    public void j(DialogInterface dialogInterface, int i) {
    }

    @Override // android.ext.j2, android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            onClick(((AlertDialog) dialogInterface).getButton(-1));
        } else if (MainService.instance.p0 == 0) {
            MainService.O0 = i;
            n(i, this.m, this.n, this.o);
        }
    }

    @Override // android.ext.j2, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        MainService.O0 = this.j.j();
        super.onDismiss(dialogInterface);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.ext.j2, android.ext.p1, android.view.View.OnClickListener
    public void onClick(View view) {
        int i;
        MainService mainService = MainService.instance;
        if (view == null || (view.getTag() instanceof p1)) {
            new t0().p();
            return;
        }
        if ((view.getTag() instanceof Integer) && mainService.p0 == 0) {
            try {
                this.m = this.j.e(0);
                this.n = this.j.e(1);
                this.o = this.j.b();
                Tools.U0(this.k);
                int iJ = this.j.j();
                if (iJ == 0) {
                    new u2(this.l, "0", b2.f(R.string.type_request), this);
                } else {
                    n(iJ, this.m, this.n, this.o);
                }
            } catch (NumberFormatException e2) {
                j2.i(e2, null);
                return;
            }
        }
        switch (view.getId()) {
            case R.id.equal_btn /* 2131034245 */:
                if (Searcher.L || mainService.R) {
                    i = 536870912;
                } else {
                    o();
                    i = 0;
                }
                break;
            case R.id.larger_btn /* 2131034305 */:
                i = 67108864;
                break;
            case R.id.not_equal_btn /* 2131034341 */:
                i = 268435456;
                break;
            case R.id.smaller_btn /* 2131034408 */:
                i = 134217728;
                break;
            default:
                i = 0;
                break;
        }
        if (i != 0) {
            try {
                int iJ2 = this.j.j();
                if (iJ2 == 0 || !Searcher.L) {
                    iJ2 = MainService.D() & 127;
                }
                l(this.j.f(), iJ2, i, 1, this.j.e(0), this.j.e(1), this.j.b());
            } catch (NumberFormatException e3) {
                j2.i(e3, this.j.g());
                return;
            }
        }
        Tools.U0(this.k);
        Tools.E(this.k);
    }
}
