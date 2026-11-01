package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class EditorListener$b$c implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ EditorListener$b f134b;

    EditorListener$b$c(EditorListener$b editorListener$b, c cVar) {
        this.f134b = editorListener$b;
        this.f133a = cVar;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        c cVar = this.f133a;
        cVar.f674c = i;
        this.f134b.d(cVar);
    }
}
