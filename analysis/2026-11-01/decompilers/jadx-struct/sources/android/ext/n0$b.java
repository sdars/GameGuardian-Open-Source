package android.ext;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
class n0$b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ SharedPreferences f1108a;

    n0$b(SharedPreferences sharedPreferences) {
        this.f1108a = sharedPreferences;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1108a.edit().remove("last_exception").commit();
    }
}
