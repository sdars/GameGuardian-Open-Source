package android.ext;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
abstract class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final CheckBox f661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final TextView f662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TextView f663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TextView f664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final TextView f665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final TextView f666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final TextView f667g;
    final TextView h;
    final TextView i;
    final TextView j;
    final View k;
    final int l;
    int m;

    interface a extends CompoundButton.OnCheckedChangeListener, View.OnLongClickListener {
    }

    b3(View view, a aVar) {
        CheckBox checkBox = (CheckBox) view.findViewById(2131034146);
        this.f661a = checkBox;
        this.f662b = (TextView) view.findViewById(2131034123);
        this.f663c = (TextView) view.findViewById(2131034446);
        this.f664d = (TextView) view.findViewById(2131034449);
        this.f665e = (TextView) view.findViewById(2131034451);
        this.f666f = (TextView) view.findViewById(2131034447);
        this.f667g = (TextView) view.findViewById(2131034439);
        this.h = (TextView) view.findViewById(2131034452);
        this.i = (TextView) view.findViewById(2131034440);
        this.j = (TextView) view.findViewById(2131034118);
        this.k = view;
        this.l = MainService.context.getResources().getConfiguration().orientation;
        view.setTag(this);
        checkBox.setOnCheckedChangeListener(aVar);
        checkBox.setOnLongClickListener(aVar);
        checkBox.setTag(this);
    }

    void a(boolean z, int i) {
        int i2;
        View view = this.k;
        if (z) {
            i2 = -2139864428;
        } else {
            i2 = this.m == i ? -2137746366 : 0;
        }
        view.setBackgroundColor(i2);
    }

    boolean b() {
        return this.l != MainService.context.getResources().getConfiguration().orientation;
    }
}
