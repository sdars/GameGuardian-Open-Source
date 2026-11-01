package android.ext;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class a2 extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f570a;

    public a2(List list) {
        this.f570a = list;
    }

    private static TextView b(View view) {
        if (view instanceof TextView) {
            return (TextView) view;
        }
        View viewFindViewById = view.findViewById(R.id.text1);
        if (viewFindViewById instanceof TextView) {
            return (TextView) viewFindViewById;
        }
        return null;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z1.d getItem(int i) {
        return (z1.d) this.f570a.get(i);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f570a.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textViewB;
        if (view == null) {
            try {
                view = gga.d.c().inflate(R.layout.select_dialog_item, viewGroup, false);
            } catch (Throwable th) {
                e1.l("Failed inflate process list item", th);
                view = gga.d.c().inflate(catch_.me_.if_.you_.can_.R.layout.select_dialog_item, viewGroup, false);
            }
            textViewB = b(view);
            if (textViewB != null) {
                Tools.D1(textViewB, catch_.me_.if_.you_.can_.R.style.ListItemText);
            }
        } else {
            textViewB = b(view);
        }
        if (textViewB == null) {
            return view;
        }
        try {
            z1.d dVar = (z1.d) this.f570a.get(i);
            if (dVar != null) {
                textViewB.setText(dVar.l());
                textViewB.setTag(dVar);
                dVar.j(textViewB);
            }
        } catch (Throwable th2) {
            e1.a(th2);
        }
        return view;
    }
}
