package android.ext;

import android.view.View;
import catch_.me_.if_.you_.can_.R$id;

/* JADX INFO: loaded from: classes.dex */
class r$i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f1221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f1222b;

    r$i(r rVar, int i) {
        this.f1222b = rVar;
        this.f1221a = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        View view = (View) this.f1222b.f1208f.get();
        if (view == null) {
            return;
        }
        View viewFindViewById = view.findViewById(R$id.loader);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(this.f1221a == 0 ? 0 : 8);
        }
        View viewFindViewById2 = view.findViewById(R$id.installer);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(this.f1221a == 1 ? 0 : 8);
        }
        View viewFindViewById3 = view.findViewById(R$id.starter);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setVisibility(this.f1221a == 2 ? 0 : 8);
        }
        if (this.f1221a == 2) {
            if (viewFindViewById != null) {
                Tools.O0(viewFindViewById);
            }
            if (viewFindViewById2 != null) {
                Tools.O0(viewFindViewById2);
            }
        }
    }
}
