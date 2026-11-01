package android.ext;

import android.R$id;
import android.view.View;
import android.view.ViewGroup$OnHierarchyChangeListener;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
class Tools$t implements ViewGroup$OnHierarchyChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f539a;

    Tools$t(int i) {
        this.f539a = i;
    }

    @Override // android.view.ViewGroup$OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        try {
            View viewFindViewById = view2.findViewById(R$id.text1);
            if (viewFindViewById instanceof TextView) {
                TextView textView = (TextView) viewFindViewById;
                int i = this.f539a;
                if (i != 0) {
                    Tools.D1(textView, i);
                }
            }
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.view.ViewGroup$OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
    }
}
