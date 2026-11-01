package android.ext;

import android.R$id;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup$OnHierarchyChangeListener;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
class Tools$u implements ViewGroup$OnHierarchyChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ CharSequence[] f541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Drawable[] f542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f543d;

    Tools$u(int i, CharSequence[] charSequenceArr, Drawable[] drawableArr, int i2) {
        this.f540a = i;
        this.f541b = charSequenceArr;
        this.f542c = drawableArr;
        this.f543d = i2;
    }

    @Override // android.view.ViewGroup$OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        try {
            View viewFindViewById = view2.findViewById(R$id.text1);
            if (viewFindViewById instanceof TextView) {
                TextView textView = (TextView) viewFindViewById;
                int i = this.f540a;
                if (i != 0) {
                    Tools.D1(textView, i);
                }
                if (textView.getTag() == null) {
                    Tools$u$a tools$u$a = new Tools$u$a(this, textView);
                    textView.addTextChangedListener(tools$u$a);
                    textView.setTag(tools$u$a);
                    tools$u$a.onTextChanged(textView.getText(), 0, 0, 0);
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
