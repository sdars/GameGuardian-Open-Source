/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.content.DialogInterface;
import android.ext.Tools;
import android.ext.b2;
import android.ext.e1;
import android.ext.f;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class v2
implements View.OnClickListener,
DialogInterface.OnClickListener {
    private final String[] a;
    private final String[] b;
    private EditText c;

    public v2(String[] stringArray, String[] stringArray2) {
        this.a = stringArray;
        this.b = stringArray2;
        if (stringArray.length == stringArray2.length) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Params must be with same length: ");
        stringBuilder.append(stringArray.length);
        stringBuilder.append(" != ");
        stringBuilder.append(stringArray2.length);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static void a(Button button, EditText editText) {
        String string2;
        String string3 = "error";
        try {
            string2 = Tools.f0().getFilesDir().getAbsolutePath();
        }
        catch (Throwable throwable) {
            e1.s("Failed get files dir", throwable);
            string2 = "error";
        }
        try {
            String string4;
            string3 = string4 = Tools.f0().getExternalFilesDir(null).getAbsolutePath();
        }
        catch (Throwable throwable) {
            e1.s("Failed get ext files dir", throwable);
        }
        button.setOnClickListener((View.OnClickListener)new v2(new String[]{b2.f(2131296710), b2.f(2131296433)}, new String[]{string2, string3}));
        button.setTag((Object)editText);
    }

    public void onClick(DialogInterface object, int n3) {
        String[] stringArray;
        if (n3 >= 0 && n3 < (stringArray = this.b).length) {
            object = this.c;
            if (object == null) {
                e1.s("Unkwnon edit", new NullPointerException());
                return;
            }
            object.setText((CharSequence)stringArray[n3]);
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Bad index: ");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(" for ");
        ((StringBuilder)object).append(this.b.length);
        e1.s(((StringBuilder)object).toString(), new IndexOutOfBoundsException());
    }

    public void onClick(View object) {
        if (object == null) {
            e1.s("Unkwnon view", new NullPointerException());
            return;
        }
        if (!((object = object.getTag()) instanceof EditText)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unkwnon tag: ");
            stringBuilder.append(object);
            e1.s(stringBuilder.toString(), new IllegalArgumentException());
            return;
        }
        this.c = (EditText)object;
        f.o(f.b().setCustomTitle(Tools.g0(2131297047)).setItems((CharSequence[])this.a, (DialogInterface.OnClickListener)this).setNegativeButton((CharSequence)b2.f(2131296311), null));
    }
}

