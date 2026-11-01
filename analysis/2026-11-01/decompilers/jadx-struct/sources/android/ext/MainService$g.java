package android.ext;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
class MainService$g extends FloatPanel {
    final /* synthetic */ String p;
    final /* synthetic */ int q;
    final /* synthetic */ int r;
    final /* synthetic */ MainService s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainService$g(MainService mainService, Context context, String str, int i, int i2) {
        super(context);
        this.s = mainService;
        this.p = str;
        this.q = i;
        this.r = i2;
    }

    @Override // android.ext.FloatPanel
    protected boolean f() {
        return true;
    }

    @Override // android.ext.FloatPanel
    protected int getDefX() {
        return this.q;
    }

    @Override // android.ext.FloatPanel
    protected int getDefY() {
        return this.r;
    }

    @Override // android.ext.FloatPanel
    protected String getPrefName() {
        return this.p;
    }
}
