package android.ext;

import android.view.View;
import android.view.View$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$x implements View$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ EditTextSpeeds f101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ConfigListAdapter f102b;

    ConfigListAdapter$x(ConfigListAdapter configListAdapter, EditTextSpeeds editTextSpeeds) {
        this.f102b = configListAdapter;
        this.f101a = editTextSpeeds;
    }

    @Override // android.view.View$OnClickListener
    public void onClick(View view) {
        this.f101a.setText(d1.c());
    }
}
