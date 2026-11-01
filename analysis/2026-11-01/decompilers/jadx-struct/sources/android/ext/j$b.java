package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class j$b implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f1025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f1026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j f1027c;

    j$b(j jVar, int i, List list) {
        this.f1027c = jVar;
        this.f1025a = i;
        this.f1026b = list;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == this.f1025a) {
            ConfigListAdapter.t(R$string.help_game_not_listed_title);
            return;
        }
        this.f1027c.f((z1$d) this.f1026b.get(i));
        this.f1027c.f1020b = true;
        Tools.D(dialogInterface);
        Runnable runnable = this.f1027c.f1021c;
        if (runnable != null) {
            this.f1027c.f1021c = null;
            runnable.run();
        }
    }
}
