package android.ext;

import android.widget.Filter;
import android.widget.Filter$FilterResults;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class EditTextPath$a$a extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ EditTextPath$a f120a;

    EditTextPath$a$a(EditTextPath$a editTextPath$a) {
        this.f120a = editTextPath$a;
    }

    private String a(CharSequence charSequence) {
        return (charSequence == null || charSequence.length() == 0) ? "/" : charSequence.toString();
    }

    @Override // android.widget.Filter
    protected Filter$FilterResults performFiltering(CharSequence charSequence) {
        String[] strArrD;
        Filter$FilterResults filter$FilterResults = new Filter$FilterResults();
        if (charSequence != null) {
            String strA = a(charSequence);
            File file = new File(strA);
            boolean zEndsWith = strA.endsWith("/");
            File parentFile = zEndsWith ? file : file.getParentFile();
            String lowerCase = (zEndsWith ? "" : file.getName()).toLowerCase(Locale.US);
            if (parentFile.exists() && (strArrD = PathSelector.d(parentFile)) != null && strArrD.length > 0) {
                ArrayList arrayListE = PathSelector.e(this.f120a.f119c.f115a, parentFile, strArrD, lowerCase, true);
                int size = arrayListE.size();
                if (size == 1 && ((PathSelector$d) arrayListE.get(0)).f336b.equals(lowerCase)) {
                    size = 0;
                }
                if (size > 0) {
                    File[] fileArr = new File[size];
                    for (int i = 0; i < size; i++) {
                        fileArr[i] = ((PathSelector$d) arrayListE.get(i)).f335a;
                    }
                    filter$FilterResults.values = fileArr;
                    filter$FilterResults.count = size;
                }
            }
        }
        return filter$FilterResults;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x000e  */
    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter$FilterResults filter$FilterResults) {
        File[] fileArr;
        EditTextPath$a editTextPath$a = this.f120a;
        if (filter$FilterResults != null) {
            Object obj = filter$FilterResults.values;
            if (obj instanceof File[]) {
                fileArr = (File[]) obj;
            } else {
                fileArr = null;
            }
        } else {
            fileArr = null;
        }
        editTextPath$a.f118b = fileArr;
        this.f120a.notifyDataSetChanged();
    }
}
