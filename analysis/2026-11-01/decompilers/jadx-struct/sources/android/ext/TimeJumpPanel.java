package android.ext;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View$OnClickListener;
import android.widget.Button;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$layout;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
public class TimeJumpPanel extends FloatPanel implements View$OnClickListener {
    Button p;
    Button q;

    public TimeJumpPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static long getLast() {
        return (long) ((((double) Config.v) / 1000.0d) * 1.0E9d);
    }

    private void q() {
        n2.i(new TimeJumpPanel$a(this));
    }

    public static void s(boolean z) {
        TimeJumpPanel timeJumpPanel = MainService.instance.k;
        boolean z2 = (Config.B & 128) != 0;
        if (z && z2) {
            if (timeJumpPanel == null) {
                timeJumpPanel = (TimeJumpPanel) a.d.f(R$layout.time_jump_panel, null);
                timeJumpPanel.q();
                MainService.instance.k = timeJumpPanel;
            }
            timeJumpPanel.m();
            return;
        }
        if (timeJumpPanel != null) {
            timeJumpPanel.e();
            if (z2) {
                return;
            }
            MainService.instance.k = null;
        }
    }

    @Override // android.ext.FloatPanel
    protected String getPrefName() {
        return "time-jump";
    }

    @Override // android.view.View$OnClickListener
    public void onClick(View view) {
        if (view == null) {
        }
        switch (view.getId()) {
            case R$id.time_jump /* 2131034426 */:
                o2 o2Var = o2.f1159g;
                if (o2Var != null) {
                    o2Var.onClick(null);
                }
                break;
            case R$id.time_jump_last /* 2131034427 */:
                long last = getLast();
                o2.h(last);
                double d2 = last / 1.0E9d;
                Tools.K1(Tools.N1(R$string.time_jump) + ": " + Tools.F(d2) + " (" + Double.toString(d2).replaceFirst("\\D?0+$", "") + ')', 0);
                break;
            default:
                e1.g("Unknown id: " + Integer.toHexString(view.getId()), new RuntimeException());
                break;
        }
    }

    public void r() {
        long last = getLast();
        this.p.setVisibility(last == 0 ? 8 : 0);
        this.p.setText(Tools.F(last / 1.0E9d));
    }

    public void setMinSize(int i) {
        Button button = this.p;
        if (button == null) {
            return;
        }
        button.setMinWidth(i);
        this.p.setMinHeight(i);
        this.q.setMinWidth(i);
        this.q.setMinHeight(i);
    }
}
