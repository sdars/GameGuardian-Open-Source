package android.ext;

import catch_.me_.if_.you_.can_.R$string;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$j extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ConfigListAdapter f70a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfigListAdapter$j(ConfigListAdapter configListAdapter, String str) {
        super(str);
        this.f70a = configListAdapter;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Tools.K1("Logcat: " + b2.f(R$string.loading), 0);
        Tools.h(new GregorianCalendar().getTime().toString() + '\n' + h0.f(true), 3);
    }
}
