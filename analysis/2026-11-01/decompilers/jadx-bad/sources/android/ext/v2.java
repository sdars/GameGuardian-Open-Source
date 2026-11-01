package android.ext;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class v2 implements View.OnClickListener, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f1284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f1285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.widget.EditText f1286c;

    public v2(String[] strArr, String[] strArr2) {
        this.f1284a = strArr;
        this.f1285b = strArr2;
        if (strArr.length == strArr2.length) {
            return;
        }
        throw new IllegalArgumentException("Params must be with same length: " + strArr.length + " != " + strArr2.length);
    }

    public static void a(Button button, android.widget.EditText editText) {
        String absolutePath;
        String absolutePath2 = "error";
        try {
            absolutePath = Tools.f0().getFilesDir().getAbsolutePath();
        } catch (Throwable th) {
            e1.s("Failed get files dir", th);
            absolutePath = "error";
        }
        try {
            absolutePath2 = Tools.f0().getExternalFilesDir(null).getAbsolutePath();
        } catch (Throwable th2) {
            e1.s("Failed get ext files dir", th2);
        }
        button.setOnClickListener(new v2(new String[]{b2.f(2131296710), b2.f(2131296433)}, new String[]{absolutePath, absolutePath2}));
        button.setTag(editText);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i >= 0) {
            String[] strArr = this.f1285b;
            if (i < strArr.length) {
                android.widget.EditText editText = this.f1286c;
                if (editText == null) {
                    e1.s("Unkwnon edit", new NullPointerException());
                    return;
                } else {
                    editText.setText(strArr[i]);
                    return;
                }
            }
        }
        e1.s("Bad index: " + i + " for " + this.f1285b.length, new IndexOutOfBoundsException());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            e1.s("Unkwnon view", new NullPointerException());
            return;
        }
        Object tag = view.getTag();
        if (tag instanceof android.widget.EditText) {
            this.f1286c = (android.widget.EditText) tag;
            f.o(f.b().setCustomTitle(Tools.g0(2131297047)).setItems(this.f1284a, this).setNegativeButton(b2.f(2131296311), (DialogInterface.OnClickListener) null));
        } else {
            e1.s("Unkwnon tag: " + tag, new IllegalArgumentException());
        }
    }
}
