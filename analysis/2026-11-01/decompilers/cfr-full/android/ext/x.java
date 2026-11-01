/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.d;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.ext.ConfigListAdapter;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.b2;
import android.ext.e1;
import android.ext.f;
import android.ext.n2;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class x
implements DialogInterface.OnShowListener,
View.OnClickListener {
    volatile AlertDialog a;
    final TextView b;
    final ProgressBar c;
    final TextView d;
    final View e;
    final ProgressBar f;
    final TextView g;
    final TextView h;
    final TextView i;
    final View j;
    long k = -1L;
    long l = -1L;
    long m = -1L;
    final Runnable n = new Runnable(this){
        final x a;
        {
            this.a = x3;
        }

        @Override
        public void run() {
            AlertDialog alertDialog = this.a.a;
            if (alertDialog != null) {
                android.ext.f.m(alertDialog);
            }
        }
    };

    public x() {
        View view;
        this.j = view = a.d.f(2131099673, null);
        this.b = (TextView)view.findViewById(2131034328);
        this.c = (ProgressBar)view.findViewById(2131034357);
        this.d = (TextView)view.findViewById(2131034360);
        this.e = view.findViewById(2131034414);
        this.f = (ProgressBar)view.findViewById(2131034358);
        this.g = (TextView)view.findViewById(2131034359);
        this.h = (TextView)view.findViewById(2131034264);
        this.i = (TextView)view.findViewById(2131034425);
        view.findViewById(2131034279).setOnClickListener((View.OnClickListener)this);
    }

    public void a(boolean bl) {
        AlertDialog alertDialog = this.a;
        if (alertDialog == null) {
            return;
        }
        n2.d().removeCallbacks(this.n);
        Tools.D((DialogInterface)alertDialog);
        if (bl) {
            this.a = null;
        }
    }

    public boolean b() {
        boolean bl = this.a != null;
        return bl;
    }

    public void c(CharSequence charSequence, long l3, long l4, int n3, int n4, long l5, String string2) {
        if (!this.b()) {
            return;
        }
        if (n2.e()) {
            this.d(charSequence, l3, l4, n3, n4, l5, string2);
        } else {
            n2.i(new Runnable(this, charSequence, l3, l4, n3, n4, l5, string2){
                final CharSequence a;
                final long b;
                final long c;
                final int d;
                final int e;
                final long f;
                final String g;
                final x h;
                {
                    this.h = x3;
                    this.a = charSequence;
                    this.b = l3;
                    this.c = l4;
                    this.d = n3;
                    this.e = n4;
                    this.f = l5;
                    this.g = string2;
                }

                @Override
                public void run() {
                    this.h.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
                }
            });
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    void d(CharSequence charSequence, long l3, long l4, int n3, int n4, long l5, String charSequence2) {
        long l6;
        long l7;
        if (charSequence != null) {
            this.b.setText(charSequence);
        }
        if ((l7 = (l6 = l3 - 0L) == 0L ? 0 : (l6 < 0L ? -1 : 1)) >= 0 && l4 != 0L) {
            this.c.setIndeterminate(false);
            this.c.setMax((int)l4);
            this.c.setProgress((int)l3);
            this.d.setText(charSequence2);
        } else {
            this.d.setText(charSequence2);
            this.c.setIndeterminate(true);
        }
        if (n3 >= 0) {
            if (n4 <= 1) {
                this.e.setVisibility(8);
            } else {
                this.f.setMax(n4);
                this.f.setProgress(n3);
                this.g.setText((CharSequence)Tools.L1(b2.f(2131296492), n3, n4));
                this.e.setVisibility(0);
            }
        }
        this.h.setText((CharSequence)Tools.L1(b2.f(2131296477), l5));
        long l8 = System.currentTimeMillis();
        long l9 = -1L;
        if (l7 < 0) {
            this.k = -1L;
            this.l = -1L;
            this.m = -1L;
        } else if (this.m != l4) {
            this.k = l8;
            this.l = l3;
            this.m = l4;
        }
        long l10 = this.k;
        l5 = l9;
        if (l10 >= 0L) {
            l5 = l9;
            if (l8 - l10 >= 2000L) {
                l5 = this.l;
                l5 = l3 - l5 == 0L ? l9 : Math.round((double)(l8 - l10) * (double)(l4 - l3) / (double)(l3 - l5) / 1000.0);
            }
        }
        if (l5 <= 0L) {
            charSequence = this.i;
            charSequence2 = "";
        } else {
            charSequence = this.i;
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append(Tools.N1(2131297013));
            ((StringBuilder)charSequence2).append(": ");
            ((StringBuilder)charSequence2).append(Tools.g1(l5));
            charSequence2 = ((StringBuilder)charSequence2).toString();
        }
        charSequence.setText(charSequence2);
    }

    public boolean e(boolean bl) {
        AlertDialog alertDialog = this.a;
        if (alertDialog != null) {
            android.ext.f.m(alertDialog);
            if (bl) {
                e1.g("Show busy dialog not first time", new RuntimeException());
            }
            return true;
        }
        if (bl) {
            n2.i(new Runnable(this){
                final x a;
                {
                    this.a = x3;
                }

                @Override
                public void run() {
                    x x3 = this.a;
                    x3.k = -1L;
                    x3.a = android.ext.f.b().setView(Tools.O0(this.a.j)).setCancelable(false).setPositiveButton(2131296674, null).setNegativeButton(2131296311, null).create();
                    this.a.c("", -1L, 1L, 0, 1, 0L, "");
                    android.ext.f.l(this.a.a, this.a);
                    if (MainService.instance.n != null) {
                        x3 = n2.d();
                        x3.removeCallbacks(this.a.n);
                        x3.postDelayed(this.a.n, 100L);
                    }
                }
            });
        }
        return true;
    }

    public void onClick(View view) {
        ConfigListAdapter.t(2131296654);
    }

    public void onShow(DialogInterface dialogInterface) {
        Tools.s1(dialogInterface, -1, 2131296674, MainService.instance);
        Tools.s1(dialogInterface, -2, 2131034112, MainService.instance);
    }
}

