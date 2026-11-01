package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.Editable;
import android.view.View;
import catch_.me_.if_.you_.can_.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class j2 extends p1 implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f1037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f1038g;
    protected String h;
    protected int i;
    protected Searcher j;
    protected WeakReference k;

    class a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.widget.EditText f1039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n.b f1040b;

        a(android.widget.EditText editText, n.b bVar) {
            this.f1039a = editText;
            this.f1040b = bVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Editable text = this.f1039a.getText();
            String string = text.toString();
            String str = this.f1040b.f1085b;
            if (string.contains(str)) {
                int iIndexOf = string.indexOf(str);
                text.replace(iIndexOf, str.length() + iIndexOf, this.f1040b.f1084a);
            }
        }
    }

    public j2(int i, int i2) {
        super(i, i2);
        this.f1037f = "";
        this.f1038g = 536870912;
        this.h = "FFFFFFFFFFFFFFFF";
        this.i = -1;
        this.k = new WeakReference(null);
    }

    public static String h(String str) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        if (strTrim.length() <= 0 || str.charAt(0) != '=') {
            return str;
        }
        String strSubstring = strTrim.substring(1);
        if (strSubstring.indexOf("return") < 0) {
            strSubstring = "return " + strSubstring;
        }
        try {
            e1.d("oneLiner IN: '" + strSubstring + "'");
            String strF3 = Script.F3(strSubstring);
            e1.d("oneLiner OUT: '" + strF3 + "'");
            return strF3;
        } catch (Throwable th) {
            e1.g("oneLiner ERR:", th);
            NumberFormatException numberFormatException = new NumberFormatException(th.getMessage());
            numberFormatException.initCause(th);
            throw numberFormatException;
        }
    }

    public static void i(NumberFormatException numberFormatException, android.widget.EditText editText) {
        AlertDialog.Builder positiveButton;
        e1.s("Error", numberFormatException);
        if (editText == null || !(numberFormatException instanceof n.b)) {
            positiveButton = f.b().setCustomTitle(Tools.g0(R.string.error)).setMessage(numberFormatException.getMessage()).setPositiveButton(b2.f(R.string.ok), (DialogInterface.OnClickListener) null);
        } else {
            positiveButton = f.b().setCustomTitle(Tools.g0(R.string.error)).setMessage(numberFormatException.getMessage()).setPositiveButton(b2.f(R.string.yes), new a(editText, (n.b) numberFormatException)).setNegativeButton(b2.f(R.string.no), (DialogInterface.OnClickListener) null);
        }
        f.o(positiveButton);
    }

    public abstract void j(DialogInterface dialogInterface, int i);

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1 || i == -3) {
            this.i = i;
            onClick(null);
            return;
        }
        if (i == -2) {
            return;
        }
        try {
            this.j.E(i);
            j(dialogInterface, i);
            Tools.U0(this.k);
        } catch (NumberFormatException e2) {
            i(e2, this.j.g());
            return;
        } catch (Throwable th) {
            e1.l("Exception on start search", th);
        }
        Tools.E(this.k);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        Searcher searcher = this.j;
        if (searcher != null) {
            searcher.m();
        }
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Tools.s1(dialogInterface, -1, -1, this);
        Tools.s1(dialogInterface, -3, -3, this);
        Searcher searcher = this.j;
        if (searcher != null) {
            searcher.r();
        }
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view != null && (view.getTag() instanceof Integer)) {
            this.i = ((Integer) view.getTag()).intValue();
        }
        boolean z = this instanceof m1;
        if (view == null || !(view.getTag() instanceof p1)) {
            int iJ = this.j.j();
            if (iJ != 0) {
                onClick(null, iJ);
                return;
            }
            if (z) {
                new u2(c.r(127, true), "0", b2.f(R.string.type_request), this);
                return;
            }
            try {
                String strH = h(this.j.f());
                new u2(c.r(127, true), ((strH.indexOf(59) == -1 && strH.indexOf(126) == -1 && strH.indexOf(88) == -1 && strH.indexOf(120) == -1) ? 0 : 1) == 0 ? strH : "0", b2.f(R.string.type_request), this);
                return;
            } catch (NumberFormatException e2) {
                i(e2, this.j.g());
                return;
            }
        }
        if (MainService.instance.i.d0()) {
            if (this.j == null) {
                this.j = new Searcher(z ? 3 : 0, 127);
            }
            this.j.y(b2.f(z ? R.string.mask_request : R.string.value_request));
            this.j.D(this.f1038g);
            this.j.z(this.f1037f);
            if (z) {
                this.j.x(this.h);
                this.j.k().setTag(new InternalKeyboard.d(1));
            }
            this.j.G(127);
            AlertDialog.Builder negativeButton = f.b().setView(this.j.l()).setNegativeButton(b2.f(R.string.cancel), (DialogInterface.OnClickListener) null);
            if (MainService.instance.p0 == 0) {
                negativeButton.setPositiveButton(b2.f(R.string.new_search), this);
            } else {
                negativeButton.setPositiveButton(b2.f(R.string.refine), this).setNeutralButton(b2.f(R.string.new_search), this);
            }
            this.i = -1;
            AlertDialog alertDialogCreate = negativeButton.create();
            f.k(alertDialogCreate, this);
            f.l(alertDialogCreate, this);
            this.k = new WeakReference(alertDialogCreate);
            f.n(alertDialogCreate, this.j.g());
        }
    }
}
