package android.ext;

import android.os.Parcel;
import android.os.Parcelable$Creator;

/* JADX INFO: loaded from: classes.dex */
class b1$c0$a implements Parcelable$Creator {
    b1$c0$a() {
    }

    @Override // android.os.Parcelable$Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b1$c0 createFromParcel(Parcel parcel) {
        return new b1$c0(parcel);
    }

    @Override // android.os.Parcelable$Creator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b1$c0[] newArray(int i) {
        return new b1$c0[i];
    }
}
