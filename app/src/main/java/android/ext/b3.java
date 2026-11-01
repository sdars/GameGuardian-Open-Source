package android.ext;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R;

/* JADX INFO: loaded from: classes.dex */
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
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.ch);
        this.f661a = checkBox;
        this.f662b = (TextView) view.findViewById(R.id.address);
        this.f663c = (TextView) view.findViewById(R.id.value_hex);
        this.f664d = (TextView) view.findViewById(R.id.value_rhex);
        this.f665e = (TextView) view.findViewById(R.id.value_string);
        this.f666f = (TextView) view.findViewById(R.id.value_java);
        this.f667g = (TextView) view.findViewById(R.id.value_arm);
        this.h = (TextView) view.findViewById(R.id.value_thumb);
        this.i = (TextView) view.findViewById(R.id.value_arm8);
        this.j = (TextView) view.findViewById(R.id.addr_item_region);
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
