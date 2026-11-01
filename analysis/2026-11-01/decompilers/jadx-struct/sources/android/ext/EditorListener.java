package android.ext;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
public class EditorListener extends p1 implements AdapterView$OnItemClickListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f123f;

    public EditorListener() {
        this(false);
    }

    public EditorListener(boolean z) {
        super(R$string.edit_selected, R$drawable.ic_tooltip_edit_white_24dp);
        this.f123f = z;
    }

    @Override // android.ext.p1, android.view.View$OnClickListener
    public void onClick(View view) {
        new EditorListener$b(this, null).onClick(view);
    }

    @Override // android.widget.AdapterView$OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        new EditorListener$b(this, null).onItemClick(adapterView, view, i, j);
    }
}
