package android.ext;

import catch_.me_.if_.you_.can_.R$color;

/* JADX INFO: loaded from: classes.dex */
public class o1$a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f1152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CharSequence f1153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f1154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f1155d;

    public o1$a(long j, CharSequence charSequence, String str, int i) {
        this.f1152a = j;
        this.f1153b = charSequence;
        this.f1154c = str;
        this.f1155d = i;
    }

    public CharSequence a() {
        return Tools.x(Tools.t(c.G(this.f1152a, 0), Tools.d0(R$color.address)), Tools.t(": " + ((Object) this.f1153b), -1));
    }
}
