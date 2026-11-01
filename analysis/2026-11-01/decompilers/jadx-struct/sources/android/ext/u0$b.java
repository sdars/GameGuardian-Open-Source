package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnShowListener;
import android.view.View;
import android.view.View$OnClickListener;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$layout;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class u0$b implements View$OnClickListener, DialogInterface$OnClickListener, DialogInterface$OnDismissListener, DialogInterface$OnShowListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f1268c = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AlertDialog f1269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EditText f1270b;

    private u0$b() {
    }

    /* synthetic */ u0$b(u0$a u0_a) {
        this();
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            onClick(((AlertDialog) dialogInterface).getButton(i));
        }
    }

    @Override // android.view.View$OnClickListener
    public void onClick(View view) {
        if (view != null && !(view.getTag() instanceof p1)) {
            if (view.getId() == 2131034286) {
                Tools.D(this.f1269a);
                MainService.instance.O.d();
                return;
            }
            if (view.getId() == 2131034116) {
                f.o(f.b().setMessage(b2.f(R$string.examples) + ":\nBAFE890\nBAFE890+3F0\nBAFE890-A40\nBAFE890+FE-CD7+44-3E\n\nlibc.so\nlibc.so+E0\nlibc.so-32C").setPositiveButton(b2.f(R$string.help), ConfigListAdapter.h()).setNegativeButton(b2.f(R$string.cancel), (DialogInterface$OnClickListener) null));
                return;
            }
            try {
                EditText editText = this.f1270b;
                if (editText != null) {
                    String strH = j2.h(editText.getText().toString().trim());
                    y0.b(strH, 1);
                    MainService.instance.L(null, strH, Tools.N1(R$string.from_goto));
                }
                Tools.D(this.f1269a);
                return;
            } catch (NumberFormatException e2) {
                j2.i(e2, this.f1270b);
                return;
            }
        }
        View viewF = a.d.f(R$layout.service_goto, null);
        TextView textView = (TextView) viewF.findViewById(R$id.addr);
        Tools.r1(textView);
        textView.setOnClickListener(this);
        EditText editText2 = (EditText) viewF.findViewById(R$id.mem_edit_addr);
        this.f1270b = editText2;
        RegionList regionList = (RegionList) viewF.findViewById(R$id.region_from);
        regionList.setTag(editText2);
        u0$b$a u0_b_a = new u0$b$a(this, regionList);
        viewF.findViewById(R$id.cd).setOnClickListener(u0_b_a);
        viewF.findViewById(R$id.cb).setOnClickListener(u0_b_a);
        viewF.findViewById(R$id.ps).setOnClickListener(u0_b_a);
        viewF.findViewById(R$id.xa).setOnClickListener(u0_b_a);
        viewF.findViewById(R$id.history).setOnClickListener(this);
        editText2.setText(f1268c);
        editText2.setDataType(1);
        AlertDialog alertDialogCreate = f.b().setView(InternalKeyboard.d(viewF)).setPositiveButton(b2.f(R$string.goto1), this).setNegativeButton(b2.f(R$string.cancel), (DialogInterface$OnClickListener) null).create();
        this.f1269a = alertDialogCreate;
        f.k(alertDialogCreate, this);
        f.l(alertDialogCreate, this);
        f.n(alertDialogCreate, editText2);
    }

    @Override // android.content.DialogInterface$OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        EditText editText = this.f1270b;
        if (editText != null) {
            f1268c = editText.getText().toString().trim();
        }
    }

    @Override // android.content.DialogInterface$OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Tools.t1(dialogInterface, -1, null, this, this.f1270b);
    }
}
