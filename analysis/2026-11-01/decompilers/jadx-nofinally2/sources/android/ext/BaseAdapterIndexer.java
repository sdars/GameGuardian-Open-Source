package android.ext;

import android.widget.SectionIndexer;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAdapterIndexer extends BaseAdapterLC implements SectionIndexer {
    @Override // android.widget.SectionIndexer
    public int getPositionForSection(int i) {
        int count = getCount();
        int i2 = (int) (((double) i) * (((double) count) / 20.0d));
        if (i2 < 0) {
            i2 = 0;
        }
        return i2 >= count ? count - 1 : i2;
    }

    @Override // android.widget.SectionIndexer
    public int getSectionForPosition(int i) {
        int count = (int) (((double) i) / (((double) getCount()) / 20.0d));
        if (count < 0) {
            count = 0;
        }
        if (count >= 20) {
            return 19;
        }
        return count;
    }

    @Override // android.widget.SectionIndexer
    public Object[] getSections() {
        Object[] objArr = new Object[20];
        double count = ((double) getCount()) / 20.0d;
        for (int i = 0; i < 20; i++) {
            objArr[i] = Integer.valueOf((int) (((double) i) * count));
        }
        return objArr;
    }
}
