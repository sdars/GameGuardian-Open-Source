package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.graphics.drawable.Drawable;
import android.widget.ListView;
import catch_.me_.if_.you_.can_.R$string;
import catch_.me_.if_.you_.can_.R$style;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$g implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String[] f64a;

    ConfigListAdapter$g(String[] strArr) {
        this.f64a = strArr;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        p1[] p1VarArr = MainService.J0[i / 2];
        int length = p1VarArr.length;
        CharSequence[] charSequenceArr = new CharSequence[length];
        Drawable[] drawableArr = new Drawable[p1VarArr.length];
        boolean[] zArr = new boolean[length];
        long j = Config.f29b[i];
        for (int i2 = 0; i2 < length; i2++) {
            charSequenceArr[i2] = p1VarArr[i2].toString();
            zArr[i2] = ((1 << i2) & j) != 0;
            drawableArr[i2] = p1VarArr[i2].c();
        }
        ConfigListAdapter$g$a configListAdapter$g$a = new ConfigListAdapter$g$a(this, zArr, i);
        AlertDialog alertDialogCreate = f.c(Tools.k0()).setCustomTitle(Tools.h0(this.f64a[i])).setMultiChoiceItems(charSequenceArr, zArr, new ConfigListAdapter$g$b(this, zArr)).setPositiveButton(b2.f(R$string.save), configListAdapter$g$a).setNeutralButton(b2.f(R$string.reset_button), configListAdapter$g$a).setNegativeButton(b2.f(R$string.cancel), configListAdapter$g$a).create();
        ListView listView = alertDialogCreate.getListView();
        if (listView != null) {
            Tools.e(listView, charSequenceArr, drawableArr, Config.d(), R$style.SmallText);
        }
        f.m(alertDialogCreate);
    }
}
