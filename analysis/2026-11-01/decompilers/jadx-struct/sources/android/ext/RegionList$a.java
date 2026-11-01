package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.util.SparseIntArray;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class RegionList$a implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ EditText f348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SparseIntArray f351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ RegionList f352e;

    RegionList$a(RegionList regionList, EditText editText, boolean z, List list, SparseIntArray sparseIntArray) {
        this.f352e = regionList;
        this.f348a = editText;
        this.f349b = z;
        this.f350c = list;
        this.f351d = sparseIntArray;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            this.f348a.setText(c.G(this.f349b ? ((RegionList$b) this.f350c.get(this.f351d.get(i))).f357c - 1 : ((RegionList$b) this.f350c.get(this.f351d.get(i))).f356b, 4));
            this.f348a.requestFocus();
        } catch (Throwable th) {
            e1.g("RegionList failed with " + i, th);
        }
        Tools.D(dialogInterface);
    }
}
