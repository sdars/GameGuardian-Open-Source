package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnShowListener;
import android.view.View;
import android.view.View$OnClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$layout;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
public class x implements DialogInterface$OnShowListener, View$OnClickListener {

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
    final Runnable n = new x$a(this);

    public x() {
        View viewF = a.d.f(R$layout.service_busy_dialog, null);
        this.j = viewF;
        this.f1291b = (TextView) viewF.findViewById(R$id.message);
        this.f1292c = (ProgressBar) viewF.findViewById(R$id.progress_bar);
        this.f1293d = (TextView) viewF.findViewById(R$id.progress_bar_text);
        this.f1294e = viewF.findViewById(R$id.stage_layout);
        this.f1295f = (ProgressBar) viewF.findViewById(R$id.progress_bar_stage);
        this.f1296g = (TextView) viewF.findViewById(R$id.progress_bar_stage_text);
        this.h = (TextView) viewF.findViewById(R$id.found_count);
        this.i = (TextView) viewF.findViewById(R$id.time);
        viewF.findViewById(R$id.help_speed_up).setOnClickListener(this);
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
                n2.i(new x$c(this, charSequence, j, j2, i, i2, j3, str));
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
                this.f1296g.setText(Tools.L1(b2.f(R$string.from), Integer.valueOf(i), Integer.valueOf(i2)));
                this.f1294e.setVisibility(0);
            }
        }
        this.h.setText(Tools.L1(b2.f(R$string.found_count), Long.valueOf(j3)));
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
            str2 = Tools.N1(R$string.time_remaining) + ": " + Tools.g1(jRound);
        }
        textView.setText(str2);
    }

    public boolean e(boolean z) {
        AlertDialog alertDialog = this.f1290a;
        if (alertDialog == null) {
            if (z) {
                n2.i(new x$b(this));
            }
            return true;
        }
        f.m(alertDialog);
        if (z) {
            e1.g("Show busy dialog not first time", new RuntimeException());
        }
        return true;
    }

    @Override // android.view.View$OnClickListener
    public void onClick(View view) {
        ConfigListAdapter.t(R$string.help_speed_up);
    }

    @Override // android.content.DialogInterface$OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Tools.s1(dialogInterface, -1, Integer.valueOf(R$string.hide), MainService.instance);
        Tools.s1(dialogInterface, -2, Integer.valueOf(R$id.abort_button), MainService.instance);
    }
}
