package android.ext;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
class t1$a$a implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ t1$a f1260a;

    t1$a$a(t1$a t1_a) {
        this.f1260a = t1_a;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(String str, String str2) {
        return str2.length() - str.length();
    }
}
