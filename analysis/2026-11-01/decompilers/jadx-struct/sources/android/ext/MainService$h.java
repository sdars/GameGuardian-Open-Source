package android.ext;

import android.widget.TabHost$OnTabChangeListener;

/* JADX INFO: loaded from: classes.dex */
class MainService$h implements TabHost$OnTabChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainService f246a;

    MainService$h(MainService mainService) {
        this.f246a = mainService;
    }

    @Override // android.widget.TabHost$OnTabChangeListener
    public void onTabChanged(String str) {
        MainService mainService = MainService.instance;
        int iH = mainService.H();
        mainService.r.setVisibility(iH >= 1 ? 0 : 8);
        mainService.s.setVisibility(iH != 3 ? 0 : 8);
        mainService.z.setVisibility(iH == 1 ? 0 : 8);
        mainService.v.setVisibility(iH == 3 ? 0 : 8);
        mainService.w.setVisibility(iH == 2 ? 0 : 8);
        mainService.q1();
        mainService.f0 = mainService.m.getCurrentView();
        Tools.s(mainService.P);
        mainService.p1();
        ConfigListAdapter configListAdapter = this.f246a.x0;
        if (configListAdapter != null) {
            configListAdapter.l(iH == 0);
        }
    }
}
