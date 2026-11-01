package android.ext;

import android.content.Context;
import android.fix.LinearLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import java.util.Locale;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class MemoryRange extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Runnable f308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Button f310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EditText f312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private EditText f313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f314g;
    private EditText h;
    private CheckBox i;
    private CheckBox j;
    private EditText k;

    public MemoryRange(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f308a = null;
        this.f309b = 0;
        this.f310c = null;
    }

    public static long b(int i, EditText editText, String str, EditText editText2, String str2) {
        if (i == 0) {
            editText2 = editText;
        }
        String strH = j2.h(editText2.getText().toString().trim());
        if (strH.length() == 0) {
            if (i != 0) {
                str = str2;
            }
            strH = str;
        }
        String strH2 = j2.h(editText.getText().toString().trim());
        boolean zContains = strH2.contains("?");
        if (zContains) {
            strH = strH2.replace("?", i == 0 ? "0" : "F");
            if (i != 0) {
                editText2.setText(strH);
            }
        }
        try {
            long jR = t1.r(strH, 16);
            if (i == 0 && zContains) {
                y0.b(strH2, 1);
            }
            y0.b(strH, 1);
            return jR;
        } catch (NumberFormatException e2) {
            editText2.requestFocus();
            throw e2;
        }
    }

    private void d() {
        int i;
        int i2 = this.f309b;
        Button button = this.f310c;
        if (i2 == 1) {
            i = 2131296839;
        } else {
            i = i2 == 2 ? 2131296790 : 2131296268;
        }
        button.setText(b2.f(i));
        this.f311d.setVisibility(i2 == 1 ? 0 : 8);
        this.f314g.setVisibility(i2 == 2 ? 0 : 8);
    }

    public long a(int i) {
        int i2 = this.f309b;
        if (i2 == 1) {
            long jB = b(i, this.f312e, "0", this.f313f, "-1");
            if (i == 0) {
                Config.f31d = jB;
            } else {
                Config.f32e = jB;
            }
            Config.k();
            return jB;
        }
        if (i2 != 2) {
            return i == 0 ? 0L : -1L;
        }
        String strH = j2.h(this.h.getText().toString().trim());
        try {
            long jR = t1.r(strH, 16);
            y0.b(strH, 1);
            if (!(i == 0 ? this.i : this.j).isChecked()) {
                return jR;
            }
            String strH2 = j2.h(this.k.getText().toString().trim());
            try {
                long jR2 = t1.r(strH2, 16);
                y0.b(strH2, 1);
                Config.f33f = jR2;
                Config.k();
                if (i == 0) {
                    jR2 = -jR2;
                }
                return jR + jR2;
            } catch (NumberFormatException e2) {
                this.k.requestFocus();
                throw e2;
            }
        } catch (NumberFormatException e3) {
            this.h.requestFocus();
            throw e3;
        }
    }

    public void c() {
        if (this.f310c != null) {
            return;
        }
        a.d.f(2131099661, this);
        this.f310c = (Button) findViewById(2131034364);
        this.f311d = findViewById(2131034365);
        EditText editText = (EditText) findViewById(2131034320);
        this.f312e = editText;
        editText.setDataType(1);
        findViewById(2131034377).setTag(this.f312e);
        EditText editText2 = (EditText) findViewById(2131034324);
        this.f313f = editText2;
        editText2.setDataType(1);
        findViewById(2131034378).setTag(this.f313f);
        this.f312e.setText(c.G(Config.f31d, 4));
        this.f313f.setText(c.G(Config.f32e, 4));
        this.f314g = findViewById(2131034340);
        EditText editText3 = (EditText) findViewById(2131034123);
        this.h = editText3;
        editText3.setDataType(1);
        this.i = (CheckBox) findViewById(2131034132);
        this.j = (CheckBox) findViewById(2131034124);
        EditText editText4 = (EditText) findViewById(2131034227);
        this.k = editText4;
        editText4.setDataType(1);
        this.k.setText(Long.toHexString(Config.f33f).toUpperCase(Locale.US));
        this.f310c.setOnClickListener(this);
        InternalKeyboard.o(this.f312e, 1);
        d();
    }

    public int getType() {
        return this.f309b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        setType((this.f309b + 1) % 3);
    }

    public void setAddress(String str) {
        this.h.setText(str);
    }

    public void setType(int i) {
        int i2 = this.f309b;
        this.f309b = i;
        d();
        Runnable runnable = this.f308a;
        if (i2 == i || runnable == null) {
            return;
        }
        runnable.run();
    }

    public void setTypeChangeListener(Runnable runnable) {
        this.f308a = runnable;
    }
}
