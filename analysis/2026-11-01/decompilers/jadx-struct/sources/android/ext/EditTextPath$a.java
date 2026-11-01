package android.ext;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$layout;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
class EditTextPath$a extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ EditTextPath f119c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File[] f118b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Filter f117a = new EditTextPath$a$a(this);

    public EditTextPath$a(EditTextPath editTextPath) {
        this.f119c = editTextPath;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        File[] fileArr = this.f118b;
        if (fileArr == null) {
            return 0;
        }
        return fileArr.length;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f117a;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        File[] fileArr = this.f118b;
        if (fileArr == null || i < 0 || i >= fileArr.length) {
            return null;
        }
        return fileArr[i];
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = a.d.g(R$layout.path_suggestion, viewGroup, false);
        }
        Object item = getItem(i);
        if (item instanceof File) {
            ((TextView) view.findViewById(R$id.text1)).setText(".../" + ((File) item).getName());
        }
        return view;
    }
}
