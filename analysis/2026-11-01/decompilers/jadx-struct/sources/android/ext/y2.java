package android.ext;

import android.view.View;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
public class y2 extends p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static volatile boolean f1360f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static volatile long f1361g = 0;
    static volatile boolean h = false;
    static volatile long i = 1;
    static volatile boolean j = false;
    static volatile double k = 0.0d;
    static volatile boolean l = false;
    static volatile double m = 0.01d;
    static volatile y2 n;

    public y2() {
        super(R$string.unrandomizer, R$drawable.ic_dice_multiple_white_24dp);
        n = this;
    }

    public static void h(int i2, long j2, long j3, double d2, double d3) {
        MainService.instance.i.V0(i2, j2, j3, d2, d3);
    }

    public static void i() {
        f1360f = false;
        h = false;
        j = false;
        l = false;
    }

    @Override // android.ext.p1, android.view.View$OnClickListener
    public void onClick(View view) {
        new y2$b(this, null).onClick(view);
    }
}
