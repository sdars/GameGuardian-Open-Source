package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class EditorListener$b$a implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ EditorListener$b f131a;

    EditorListener$b$a(EditorListener$b editorListener$b) {
        this.f131a = editorListener$b;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        EditorListener$b editorListener$b = this.f131a;
        editorListener$b.f129f = i;
        editorListener$b.b(null);
    }
}
