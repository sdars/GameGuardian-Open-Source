package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R;

/* JADX INFO: loaded from: classes.dex */
public class o2 extends p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static volatile String f1158f = "0";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static volatile o2 f1159g;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f1160a;

        a(long j) {
            this.f1160a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MainService.instance.i.e(this.f1160a);
        }
    }

    private class b implements View.OnClickListener, DialogInterface.OnClickListener, DialogInterface.OnShowListener, DialogInterface.OnDismissListener, TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        EditText f1161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        TextView f1162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        TextView f1163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        AlertDialog f1164d;

        class a implements Config.p.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Config.p f1166a;

            a(Config.p pVar) {
                this.f1166a = pVar;
            }

            @Override // android.ext.Config.p.b
            public void a(int i) {
                this.f1166a.g(null);
                b.this.f1163c.setText(this.f1166a.toString());
            }
        }

        private b() {
        }

        public void a() {
            String strG1;
            EditText editText = this.f1161a;
            TextView textView = this.f1162b;
            if (editText == null) {
                strG1 = "?";
            } else {
                try {
                    strG1 = Tools.g1(o2.i(editText.getText().toString().trim()) / 1000000000);
                } catch (NumberFormatException unused) {
                    strG1 = "???";
                }
            }
            if (textView != null) {
                textView.setText(strG1);
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            a();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                String strH = j2.h(this.f1161a.getText().toString().trim());
                o2.h(o2.i(strH));
                y0.b(strH, 1);
                Tools.D(dialogInterface);
            } catch (NumberFormatException e2) {
                j2.i(e2, this.f1161a);
            }
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            o2.f1158f = this.f1161a.getText().toString().trim();
            try {
                o2.j(o2.i(j2.h(o2.f1158f)));
            } catch (NumberFormatException unused) {
            }
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Tools.s1(dialogInterface, -1, null, this);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            a();
        }

        /* synthetic */ b(o2 o2Var, a aVar) {
            this();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view != null && !(view.getTag() instanceof p1)) {
                int id = view.getId();
                if (id == R.id.config_time_jump_panel) {
                    Config.p pVarB = Config.b(R.id.config_time_jump_panel);
                    pVarB.g(new a(pVarB));
                    pVarB.b();
                    return;
                } else if (id != R.id.examples) {
                    onClick(this.f1164d, -1);
                    return;
                } else {
                    Searcher.I(b2.f(R.string.examples_timejump));
                    return;
                }
            }
            View viewF = gga.d.f(R.layout.time_jump, null);
            Config.m((ImageView) viewF.findViewById(R.id.examples)).setOnClickListener(this);
            this.f1162b = (TextView) viewF.findViewById(R.id.hint);
            TextView textView = (TextView) viewF.findViewById(R.id.config_time_jump_panel);
            this.f1163c = textView;
            textView.setOnClickListener(this);
            this.f1163c.setText(Config.b(R.id.config_time_jump_panel).toString());
            this.f1161a = (EditText) viewF.findViewById(R.id.time_jump);
            String strF = o2.f1158f;
            if (strF.length() == 0 || "0".equals(strF)) {
                strF = Tools.F(((double) Config.v) / 1000.0d);
            }
            this.f1161a.setText(strF);
            this.f1161a.addTextChangedListener(this);
            this.f1161a.setDataType(1);
            a();
            AlertDialog alertDialogCreate = ggf.b().setView(InternalKeyboard.d(viewF)).setPositiveButton(b2.f(R.string.ok), this).setNegativeButton(b2.f(R.string.back), (DialogInterface.OnClickListener) null).create();
            this.f1164d = alertDialogCreate;
            f.l(alertDialogCreate, this);
            f.k(this.f1164d, this);
            f.n(this.f1164d, this.f1161a);
        }
    }

    public o2() {
        super(R.string.time_jump, R.drawable.ic_fast_forward_white_24dp);
        f1159g = this;
    }

    public static void h(long j) {
        if (MainService.instance.h.a(false, new a(j))) {
            MainService.instance.i.e(j);
        }
        j(j);
        c2 c2Var = MainService.instance.f216f;
        if (c2Var != null) {
            String strF = Tools.F(j / 1.0E9d);
            c2Var.write("gg.timeJump(");
            Script.Consts.c(c2Var, strF);
            c2Var.write(")\n");
        }
    }

    public static long i(String str) {
        String strTrim = str.trim();
        double dJ1 = Tools.j1(strTrim);
        if (dJ1 < -92233720) {
            t1.a aVar = new t1.a(Tools.L1(b2.f(R.string.number_less), strTrim, -92233720L));
            aVar.c(strTrim);
            aVar.a(-92233720L);
            throw aVar;
        }
        if (dJ1 <= 92233720) {
            return (long) (dJ1 * 1.0E9d);
        }
        t1.a aVar2 = new t1.a(Tools.L1(b2.f(R.string.number_greater), strTrim, 92233720L));
        aVar2.c(strTrim);
        aVar2.a(92233720L);
        throw aVar2;
    }

    static void j(long j) {
        Config.b(R.id.config_time_jump_last).f42d = (int) ((j / 1.0E9d) * 1000.0d);
        Config.k();
        TimeJumpPanel timeJumpPanel = MainService.instance.k;
        if (timeJumpPanel != null) {
            timeJumpPanel.r();
        }
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(View view) {
        new b(this, null).onClick(view);
    }
}
