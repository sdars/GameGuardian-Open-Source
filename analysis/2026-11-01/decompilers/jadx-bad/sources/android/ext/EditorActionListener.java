package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class EditorActionListener implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference f122a;

    public EditorActionListener(AlertDialog alertDialog) {
        this.f122a = new WeakReference(null);
        this.f122a = new WeakReference(alertDialog);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        Button button;
        boolean z = false;
        if (i != 6 && i != 3 && i != 4 && i != 2) {
            return false;
        }
        AlertDialog alertDialog = (AlertDialog) this.f122a.get();
        if ((alertDialog instanceof AlertDialog) && (button = alertDialog.getButton(-1)) != null && button.getVisibility() == 0) {
            Tools.s(button);
            z = true;
        }
        if (!z && (alertDialog instanceof DialogInterface.OnClickListener)) {
            ((DialogInterface.OnClickListener) alertDialog).onClick(null, -1);
            z = true;
        }
        if (z || !(alertDialog instanceof View.OnClickListener)) {
            return z;
        }
        ((View.OnClickListener) alertDialog).onClick(textView);
        return true;
    }
}
