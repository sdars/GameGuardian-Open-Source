package android.ext;

import android.view.View;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
public class b extends p1 {
    public b() {
        super(R$string.change_address_type, R$drawable.ic_cursor_mover_white_24dp);
    }

    public static void h(String str) {
        new b$a(str).onClick(null);
    }

    @Override // android.ext.p1, android.view.View$OnClickListener
    public void onClick(View view) {
        new b$a(null).onClick(view);
    }
}
