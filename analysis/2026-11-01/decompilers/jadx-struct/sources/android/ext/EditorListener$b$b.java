package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class EditorListener$b$b implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ EditorListener$b f132a;

    EditorListener$b$b(EditorListener$b editorListener$b) {
        this.f132a = editorListener$b;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        EditorListener$b editorListener$b = this.f132a;
        editorListener$b.f130g = i;
        editorListener$b.b(null);
    }
}
