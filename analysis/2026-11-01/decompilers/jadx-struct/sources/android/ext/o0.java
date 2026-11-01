package android.ext;

import android.view.View;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
public class o0 extends p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static boolean f1139f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static boolean f1140g = true;
    static boolean h = true;
    static boolean i = true;

    public o0() {
        super(R$string.execute_script, R$drawable.ic_play_white_24dp);
    }

    @Override // android.ext.p1, android.view.View$OnClickListener
    public void onClick(View view) {
        new o0$b(this, null).onClick(view);
    }
}
