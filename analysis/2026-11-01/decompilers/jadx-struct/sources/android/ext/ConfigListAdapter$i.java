package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$i implements DialogInterface$OnClickListener {
    ConfigListAdapter$i() {
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        ConfigListAdapter.s();
    }
}
