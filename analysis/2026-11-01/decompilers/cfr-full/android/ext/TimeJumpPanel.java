/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.d;
import android.content.Context;
import android.ext.Config;
import android.ext.FloatPanel;
import android.ext.HotPoint;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.e1;
import android.ext.n2;
import android.ext.o2;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

public class TimeJumpPanel
extends FloatPanel
implements View.OnClickListener {
    Button p;
    Button q;

    public TimeJumpPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static long getLast() {
        return (long)((double)Config.v / 1000.0 * 1.0E9);
    }

    private void q() {
        n2.i(new Runnable(this){
            final TimeJumpPanel a;
            {
                this.a = timeJumpPanel;
            }

            @Override
            public void run() {
                FloatPanel floatPanel = this.a;
                ((TimeJumpPanel)floatPanel).p = (Button)floatPanel.findViewById(2131034427);
                floatPanel = this.a;
                ((TimeJumpPanel)floatPanel).q = (Button)floatPanel.findViewById(2131034426);
                floatPanel = this.a;
                ((TimeJumpPanel)floatPanel).p.setOnClickListener((View.OnClickListener)floatPanel);
                floatPanel = this.a;
                ((TimeJumpPanel)floatPanel).q.setOnClickListener((View.OnClickListener)floatPanel);
                this.a.r();
                floatPanel = MainService.instance.j;
                this.a.setLayoutAlpha(floatPanel.getLayoutAlpha());
                this.a.setMinSize(((HotPoint)floatPanel).getSizePx());
            }
        });
    }

    public static void s(boolean bl) {
        TimeJumpPanel timeJumpPanel = MainService.instance.k;
        boolean bl2 = (Config.B & 0x80) != 0;
        if (bl && bl2) {
            TimeJumpPanel timeJumpPanel2 = timeJumpPanel;
            if (timeJumpPanel == null) {
                timeJumpPanel2 = (TimeJumpPanel)d.f(2131099690, null);
                timeJumpPanel2.q();
                MainService.instance.k = timeJumpPanel2;
            }
            timeJumpPanel2.m();
        } else if (timeJumpPanel != null) {
            timeJumpPanel.e();
            if (!bl2) {
                MainService.instance.k = null;
            }
        }
    }

    @Override
    protected String getPrefName() {
        return "time-jump";
    }

    public void onClick(View object) {
        if (object == null) {
            return;
        }
        switch (object.getId()) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown id: ");
                stringBuilder.append(Integer.toHexString(object.getId()));
                e1.g(stringBuilder.toString(), new RuntimeException());
                return;
            }
            case 2131034427: {
                long l3 = TimeJumpPanel.getLast();
                o2.h(l3);
                double d4 = (double)l3 / 1.0E9;
                object = new StringBuilder();
                ((StringBuilder)object).append(Tools.N1(2131297011));
                ((StringBuilder)object).append(": ");
                ((StringBuilder)object).append(Tools.F(d4));
                ((StringBuilder)object).append(" (");
                ((StringBuilder)object).append(Double.toString(d4).replaceFirst("\\D?0+$", ""));
                ((StringBuilder)object).append(')');
                Tools.K1(((StringBuilder)object).toString(), 0);
                break;
            }
            case 2131034426: {
                object = o2.g;
                if (object == null) break;
                ((o2)object).onClick(null);
            }
        }
    }

    public void r() {
        long l3 = TimeJumpPanel.getLast();
        Button button = this.p;
        int n3 = l3 == 0L ? 8 : 0;
        button.setVisibility(n3);
        this.p.setText((CharSequence)Tools.F((double)l3 / 1.0E9));
    }

    public void setMinSize(int n3) {
        Button button = this.p;
        if (button == null) {
            return;
        }
        button.setMinWidth(n3);
        this.p.setMinHeight(n3);
        this.q.setMinWidth(n3);
        this.q.setMinHeight(n3);
    }
}

