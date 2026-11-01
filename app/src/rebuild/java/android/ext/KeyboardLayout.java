package android.ext;

import android.content.Context;
import android.content.res.Configuration;
import android.fix.FrameLayout;
import android.fix.LinearLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import catch_.me_.if_.you_.can_.R;

/* JADX INFO: loaded from: classes.dex */
public class KeyboardLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ScrollView f208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FrameLayout f209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InternalKeyboard f210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f211d;

    public KeyboardLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void a() {
        if (this.f208a != null) {
            return;
        }
        this.f211d = 0;
        this.f208a = (ScrollView) findViewById(R.id.kbd_scroll);
        this.f209b = (FrameLayout) findViewById(R.id.kbd_frame);
        this.f210c = (InternalKeyboard) findViewById(R.id.keyboard);
    }

    private void b(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    public void c() {
        Configuration configuration = Tools.f0().getResources().getConfiguration();
        int i = configuration.orientation;
        if (i == this.f211d) {
            return;
        }
        this.f211d = i;
        e1.d("Screen: " + configuration.screenWidthDp + "dp x " + configuration.screenHeightDp + "dp");
        a();
        int[] iArr = i == 1 ? new int[]{1, -1, 0} : new int[]{0, -1, -2};
        setOrientation(iArr[0]);
        b(this.f208a.getVisibility() == 0 ? this.f208a : this.f209b, iArr[1], iArr[2]);
        this.f210c.t();
    }

    @Override // android.fix.LinearLayout, android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        e1.d("KeyboardLayout onConfigurationChanged: " + configuration);
        Configuration configurationF = gga.b.f(configuration);
        super.onConfigurationChanged(configurationF);
        c();
        MainService.Y(configurationF);
    }
}
