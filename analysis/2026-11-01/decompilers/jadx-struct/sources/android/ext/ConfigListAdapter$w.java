package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.os.Build$VERSION;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$w implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ConfigListAdapter f100a;

    ConfigListAdapter$w(ConfigListAdapter configListAdapter) {
        this.f100a = configListAdapter;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("GG: ");
        float f2 = 1;
        sb.append((113.9f * f2) - 12.5f);
        sb.append(" (");
        sb.append((int) (((f2 * 16694.6f) - 539.6f) + 0.5f));
        sb.append("); Android: ");
        sb.append(Build$VERSION.RELEASE);
        sb.append(" (");
        sb.append(Build$VERSION.SDK_INT);
        sb.append(") [");
        sb.append(f1.x());
        sb.append(']');
        Tools.A(sb.toString(), false);
    }
}
