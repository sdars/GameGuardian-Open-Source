package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$string;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class ItemContextMenu$b implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList f205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ItemContextMenu f207d;

    ItemContextMenu$b(ItemContextMenu itemContextMenu, List list, ArrayList arrayList, c cVar) {
        this.f207d = itemContextMenu;
        this.f204a = list;
        this.f205b = arrayList;
        this.f206c = cVar;
    }

    private Long a() {
        c cVar;
        if (this.f207d.f197a != 3 || (cVar = this.f206c) == null) {
            return null;
        }
        return Long.valueOf(cVar.f672a);
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i < 0 || i >= this.f204a.size()) {
            e1.i("Unknown index in menu: " + i + " for " + this.f204a.size());
            return;
        }
        switch (((Integer) this.f204a.get(i)).intValue()) {
            case R$drawable.ic_calculator_white_24dp /* 2130968592 */:
                new OffsetCalculator(a()).j((String) this.f205b.get(i));
                break;
            case R$drawable.ic_code_braces_white_24dp /* 2130968597 */:
                h.h((String) this.f205b.get(i));
                break;
            case R$drawable.ic_content_copy_white_24dp /* 2130968598 */:
                Tools.z((String) this.f205b.get(i));
                break;
            case R$drawable.ic_cursor_mover_white_24dp /* 2130968601 */:
                b.h((String) this.f205b.get(i));
                break;
            case R$drawable.ic_forward_white_24dp /* 2130968618 */:
                MainService.instance.L(a(), (String) this.f205b.get(i), Tools.N1(R$string.from_context) + ": (" + this.f206c + ')');
                break;
            case R$drawable.ic_pointer_white_24dp /* 2130968640 */:
                new w1().l((String) this.f205b.get(i));
                break;
            case R$drawable.ic_search_nearby_white_24dp /* 2130968646 */:
                MainService.instance.W.y((String) this.f205b.get(i));
                break;
            default:
                e1.i("Unknown icon in menu: " + Integer.toHexString(((Integer) this.f204a.get(i)).intValue()));
                break;
        }
        if (dialogInterface != null) {
            Tools.D(dialogInterface);
        }
    }
}
