package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$z implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ EditTextSpeeds f106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ConfigListAdapter f107b;

    ConfigListAdapter$z(ConfigListAdapter configListAdapter, EditTextSpeeds editTextSpeeds) {
        this.f107b = configListAdapter;
        this.f106a = editTextSpeeds;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        String strTrim = this.f106a.getText().toString().trim();
        y0.b(strTrim, 16);
        MainService.instance.k0.g(strTrim);
    }
}
