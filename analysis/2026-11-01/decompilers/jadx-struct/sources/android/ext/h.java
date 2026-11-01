package android.ext;

import android.view.View;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
public class h extends p1 {
    public h() {
        super(R$string.allocate_page, R$drawable.ic_code_braces_white_24dp);
    }

    public static void h(String str) {
        new h$b(null).a(str);
    }

    @Override // android.ext.p1, android.view.View$OnClickListener
    public void onClick(View view) {
        new h$b(null).onClick(view);
    }
}
