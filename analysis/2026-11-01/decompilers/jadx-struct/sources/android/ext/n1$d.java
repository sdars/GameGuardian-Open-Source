package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View$OnFocusChangeListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$layout;
import catch_.me_.if_.you_.can_.R$string;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class n1$d extends p1 implements DialogInterface$OnClickListener, CompoundButton$OnCheckedChangeListener, TextWatcher {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference f1128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WeakReference f1129g;
    private WeakReference h;
    boolean i;
    final /* synthetic */ n1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1$d(n1 n1Var) {
        super(R$string.filter, R$drawable.ic_filter_white_24dp);
        this.j = n1Var;
        this.f1128f = new WeakReference(null);
        this.f1129g = new WeakReference(null);
        this.h = new WeakReference(null);
        this.i = false;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        String string = editable.toString();
        CheckBox checkBox = (CheckBox) this.f1129g.get();
        if (checkBox == null) {
            return;
        }
        checkBox.setChecked(string.indexOf(94) != -1);
        CheckBox checkBox2 = (CheckBox) this.h.get();
        if (checkBox2 == null) {
            return;
        }
        checkBox2.setChecked(string.indexOf(36) != -1);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.widget.CompoundButton$OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        EditText editText;
        String string;
        String str;
        if (compoundButton == null || (editText = (EditText) this.f1128f.get()) == null) {
            return;
        }
        int id = compoundButton.getId();
        if (id == 2131034244) {
            string = editText.getText().toString();
            str = "$";
            if (string.contains("$") == z) {
                return;
            }
            if (z) {
                editText.getText().replace(string.length(), string.length(), "$");
                return;
            }
        } else {
            if (id == 2131034249) {
                this.i = z;
                View$OnFocusChangeListener onFocusChangeListener = editText.getOnFocusChangeListener();
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(editText, true);
                    return;
                }
                return;
            }
            if (id != 2131034416) {
                return;
            }
            string = editText.getText().toString();
            str = "^";
            if (string.contains("^") == z) {
                return;
            }
            if (z) {
                editText.getText().replace(0, 0, "^");
                return;
            }
        }
        int iIndexOf = string.indexOf(str);
        editText.getText().replace(iIndexOf, iIndexOf + 1, "");
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        String string;
        String strF;
        if (i == -1) {
            EditText editText = (EditText) this.f1128f.get();
            if (editText == null) {
                return;
            }
            string = editText.getText().toString();
            if (string.length() > 0) {
                y0.b(string, this.i ? 2 : 1);
            }
        } else {
            string = "";
        }
        this.j.f1115a = string;
        TextView textView = MainService.instance.t;
        if (string.length() > 0) {
            strF = Tools.N1(R$string.filter) + ": " + string;
        } else {
            strF = b2.f(R$string.no_filter);
        }
        textView.setText(strF);
        this.j.notifyDataSetChanged();
    }

    @Override // android.ext.p1, android.view.View$OnClickListener
    public void onClick(View view) {
        if (view != null && view.getId() == 2131034328) {
            f.o(f.b().setMessage(b2.f(R$string.examples) + ":\n" + b2.f(R$string.memory_filter_examples)).setPositiveButton(b2.f(R$string.help), new n1$d$a(this)).setNegativeButton(b2.f(R$string.cancel), (DialogInterface$OnClickListener) null));
            return;
        }
        View viewF = a.d.f(R$layout.memory_filter, null);
        TextView textView = (TextView) viewF.findViewById(R$id.message);
        Tools.r1(textView);
        textView.setOnClickListener(this);
        CheckBox checkBox = (CheckBox) viewF.findViewById(R$id.external);
        checkBox.setChecked(this.i);
        checkBox.setText(b2.f(R$string.keyboard_external));
        checkBox.setOnCheckedChangeListener(this);
        CheckBox checkBox2 = (CheckBox) viewF.findViewById(R$id.starts);
        checkBox2.setOnCheckedChangeListener(this);
        this.f1129g = new WeakReference(checkBox2);
        CheckBox checkBox3 = (CheckBox) viewF.findViewById(R$id.ends);
        checkBox3.setOnCheckedChangeListener(this);
        this.h = new WeakReference(checkBox3);
        String str = this.j.f1115a;
        if (str == null) {
            str = "";
        }
        n1$d$b n1_d_b = new n1$d$b(this);
        EditText editText = (EditText) viewF.findViewById(R$id.filter);
        editText.setText(str);
        editText.setDataType(3);
        Tools.z1(editText, n1_d_b);
        editText.addTextChangedListener(this);
        this.f1128f = new WeakReference(editText);
        afterTextChanged(editText.getText());
        ((HexConverter) viewF.findViewById(R$id.number_converter)).setTag(editText);
        viewF.setTag(new InternalKeyboard$d(15));
        f.n(f.b().setView(InternalKeyboard.d(viewF)).setPositiveButton(R$string.ok, this).setNegativeButton(R$string.cancel, (DialogInterface$OnClickListener) null).setNeutralButton(R$string.clear, this).create(), editText);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
