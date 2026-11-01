/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.ext.Tools;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;

public class EditorActionListener
implements TextView.OnEditorActionListener {
    private WeakReference a = new WeakReference<Object>(null);

    public EditorActionListener(AlertDialog alertDialog) {
        this.a = new WeakReference<AlertDialog>(alertDialog);
    }

    public boolean onEditorAction(TextView textView, int n3, KeyEvent keyEvent) {
        boolean bl = false;
        boolean bl2 = false;
        if (n3 == 6 || n3 == 3 || n3 == 4 || n3 == 2) {
            AlertDialog alertDialog = (AlertDialog)this.a.get();
            bl = bl2;
            if (alertDialog instanceof AlertDialog) {
                keyEvent = alertDialog.getButton(-1);
                bl = bl2;
                if (keyEvent != null) {
                    bl = bl2;
                    if (keyEvent.getVisibility() == 0) {
                        Tools.s((View)keyEvent);
                        bl = true;
                    }
                }
            }
            bl2 = bl;
            if (!bl) {
                bl2 = bl;
                if (alertDialog instanceof DialogInterface.OnClickListener) {
                    ((DialogInterface.OnClickListener)alertDialog).onClick(null, -1);
                    bl2 = true;
                }
            }
            bl = bl2;
            if (!bl2) {
                bl = bl2;
                if (alertDialog instanceof View.OnClickListener) {
                    ((View.OnClickListener)alertDialog).onClick((View)textView);
                    bl = true;
                }
            }
        }
        return bl;
    }
}

