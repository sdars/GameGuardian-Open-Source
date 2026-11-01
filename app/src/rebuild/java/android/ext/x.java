package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R;

/* JADX INFO: loaded from: classes.dex */
public class x implements DialogInterface.OnShowListener, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile AlertDialog f1290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final TextView f1291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ProgressBar f1292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TextView f1293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final View f1294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final ProgressBar f1295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final TextView f1296g;
    final TextView h;
    final TextView i;
    final View j;
    long k = -1;
    long l = -1;
    long m = -1;
    final Runnable n = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertDialog alertDialog = x.this.f1290a;
            if (alertDialog != null) {
                ggf.m(alertDialog);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x xVar = x.this;
            xVar.k = -1L;
            xVar.f1290a = ggf.b().setView(Tools.O0(x.this.j)).setCancelable(false).setPositiveButton(R.string.hide, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
            x.this.c("", -1L, 1L, 0, 1, 0L, "");
            ggf.l(x.this.f1290a, x.this);
            if (MainService.instance.n != null) {
                Handler handlerD = n2.d();
                handlerD.removeCallbacks(x.this.n);
                handlerD.postDelayed(x.this.n, 100L);
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f1299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f1300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f1301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f1302d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f1303e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f1304f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f1305g;

        c(CharSequence charSequence, long j, long j2, int i, int i2, long j3, String str) {
            this.f1299a = charSequence;
            this.f1300b = j;
            this.f1301c = j2;
            this.f1302d = i;
            this.f1303e = i2;
            this.f1304f = j3;
            this.f1305g = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.this.d(this.f1299a, this.f1300b, this.f1301c, this.f1302d, this.f1303e, this.f1304f, this.f1305g);
        }
    }

    public x() {
        View viewF = gga.d.f(R.layout.service_busy_dialog, null);
        this.j = viewF;
        this.f1291b = (TextView) viewF.findViewById(R.id.message);
        this.f1292c = (ProgressBar) viewF.findViewById(R.id.progress_bar);
        this.f1293d = (TextView) viewF.findViewById(R.id.progress_bar_text);
        this.f1294e = viewF.findViewById(R.id.stage_layout);
        this.f1295f = (ProgressBar) viewF.findViewById(R.id.progress_bar_stage);
        this.f1296g = (TextView) viewF.findViewById(R.id.progress_bar_stage_text);
        this.h = (TextView) viewF.findViewById(R.id.found_count);
        this.i = (TextView) viewF.findViewById(R.id.time);
        viewF.findViewById(R.id.help_speed_up).setOnClickListener(this);
    }

    public void a(boolean z) {
        AlertDialog alertDialog = this.f1290a;
        if (alertDialog == null) {
            return;
        }
        n2.d().removeCallbacks(this.n);
        Tools.D(alertDialog);
        if (z) {
            this.f1290a = null;
        }
    }

    public boolean b() {
        return this.f1290a != null;
    }

    public void c(CharSequence charSequence, long j, long j2, int i, int i2, long j3, String str) {
        if (b()) {
            if (n2.e()) {
                d(charSequence, j, j2, i, i2, j3, str);
            } else {
                n2.i(new c(charSequence, j, j2, i, i2, j3, str));
            }
        }
    }

    void d(CharSequence charSequence, long j, long j2, int i, int i2, long j3, String str) {
        TextView textView;
        String str2;
        if (charSequence != null) {
            this.f1291b.setText(charSequence);
        }
        if (j < 0 || j2 == 0) {
            this.f1293d.setText(str);
            this.f1292c.setIndeterminate(true);
        } else {
            this.f1292c.setIndeterminate(false);
            this.f1292c.setMax((int) j2);
            this.f1292c.setProgress((int) j);
            this.f1293d.setText(str);
        }
        if (i >= 0) {
            if (i2 <= 1) {
                this.f1294e.setVisibility(8);
            } else {
                this.f1295f.setMax(i2);
                this.f1295f.setProgress(i);
                this.f1296g.setText(Tools.L1(b2.f(R.string.from), Integer.valueOf(i), Integer.valueOf(i2)));
                this.f1294e.setVisibility(0);
            }
        }
        this.h.setText(Tools.L1(b2.f(R.string.found_count), Long.valueOf(j3)));
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jRound = -1;
        if (j < 0) {
            this.k = -1L;
            this.l = -1L;
            this.m = -1L;
        } else if (this.m != j2) {
            this.k = jCurrentTimeMillis;
            this.l = j;
            this.m = j2;
        }
        long j4 = this.k;
        if (j4 >= 0 && jCurrentTimeMillis - j4 >= 2000) {
            long j5 = this.l;
            if (j - j5 != 0) {
                jRound = Math.round((((jCurrentTimeMillis - j4) * (j2 - j)) / (j - j5)) / 1000.0d);
            }
        }
        if (jRound <= 0) {
            textView = this.i;
            str2 = "";
        } else {
            textView = this.i;
            str2 = Tools.N1(R.string.time_remaining) + ": " + Tools.g1(jRound);
        }
        textView.setText(str2);
    }

    public boolean e(boolean z) {
        AlertDialog alertDialog = this.f1290a;
        if (alertDialog == null) {
            if (z) {
                n2.i(new b());
            }
            return true;
        }
        ggf.m(alertDialog);
        if (z) {
            e1.g("Show busy dialog not first time", new RuntimeException());
        }
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ConfigListAdapter.t(R.string.help_speed_up);
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Tools.s1(dialogInterface, -1, Integer.valueOf(R.string.hide), MainService.instance);
        Tools.s1(dialogInterface, -2, Integer.valueOf(R.id.abort_button), MainService.instance);
    }
}
