package android.ext;

import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R$id;

/* JADX INFO: loaded from: classes.dex */
class HotPoint$b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ HotPoint f159a;

    HotPoint$b(HotPoint hotPoint) {
        this.f159a = hotPoint;
    }

    @Override // java.lang.Runnable
    public void run() {
        HotPoint hotPoint = this.f159a;
        hotPoint.t = hotPoint.findViewById(R$id.hot_frame);
        this.f159a.t.setOnClickListener(MainService.instance);
        HotPoint hotPoint2 = this.f159a;
        hotPoint2.s = (ImageView) hotPoint2.findViewById(R$id.hot_point_icon);
        HotPoint hotPoint3 = this.f159a;
        hotPoint3.u = hotPoint3.findViewById(R$id.progress_layout);
        HotPoint hotPoint4 = this.f159a;
        hotPoint4.v = (TextView) hotPoint4.findViewById(R$id.progress_bar_text);
        HotPoint hotPoint5 = this.f159a;
        hotPoint5.w = (ProgressBar) hotPoint5.findViewById(R$id.progress_bar);
        HotPoint hotPoint6 = this.f159a;
        hotPoint6.x = (ProgressBar) hotPoint6.findViewById(R$id.progress_bar_stage);
        HotPoint hotPoint7 = this.f159a;
        hotPoint7.y = (TextView) Tools.O0(hotPoint7.findViewById(R$id.speed_text));
        HotPoint hotPoint8 = this.f159a;
        hotPoint8.B = (ImageView) hotPoint8.findViewById(R$id.speed_inc);
        HotPoint hotPoint9 = this.f159a;
        hotPoint9.C = (ImageView) hotPoint9.findViewById(R$id.speed_dec);
        HotPoint hotPoint10 = this.f159a;
        hotPoint10.B.setOnClickListener(hotPoint10);
        HotPoint hotPoint11 = this.f159a;
        hotPoint11.C.setOnClickListener(hotPoint11);
        HotPoint hotPoint12 = this.f159a;
        hotPoint12.y.setOnLongClickListener(hotPoint12);
        this.f159a.y.addOnLayoutChangeListener(new HotPoint$b$a(this));
        this.f159a.t((byte) 2, -1L, 1L, 0, 1, "");
        this.f159a.s();
        this.f159a.q();
    }
}
