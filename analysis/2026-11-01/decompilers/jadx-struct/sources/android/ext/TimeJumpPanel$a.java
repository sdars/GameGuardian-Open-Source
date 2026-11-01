package android.ext;

import android.widget.Button;
import catch_.me_.if_.you_.can_.R$id;

/* JADX INFO: loaded from: classes.dex */
class TimeJumpPanel$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TimeJumpPanel f480a;

    TimeJumpPanel$a(TimeJumpPanel timeJumpPanel) {
        this.f480a = timeJumpPanel;
    }

    @Override // java.lang.Runnable
    public void run() {
        TimeJumpPanel timeJumpPanel = this.f480a;
        timeJumpPanel.p = (Button) timeJumpPanel.findViewById(R$id.time_jump_last);
        TimeJumpPanel timeJumpPanel2 = this.f480a;
        timeJumpPanel2.q = (Button) timeJumpPanel2.findViewById(R$id.time_jump);
        TimeJumpPanel timeJumpPanel3 = this.f480a;
        timeJumpPanel3.p.setOnClickListener(timeJumpPanel3);
        TimeJumpPanel timeJumpPanel4 = this.f480a;
        timeJumpPanel4.q.setOnClickListener(timeJumpPanel4);
        this.f480a.r();
        HotPoint hotPoint = MainService.instance.j;
        this.f480a.setLayoutAlpha(hotPoint.getLayoutAlpha());
        this.f480a.setMinSize(hotPoint.getSizePx());
    }
}
