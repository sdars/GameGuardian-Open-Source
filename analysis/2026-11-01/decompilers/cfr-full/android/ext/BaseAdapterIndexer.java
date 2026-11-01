/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.BaseAdapterLC;
import android.widget.SectionIndexer;

public abstract class BaseAdapterIndexer
extends BaseAdapterLC
implements SectionIndexer {
    public int getPositionForSection(int n3) {
        int n4;
        int n5 = this.getCount();
        double d4 = (double)n5 / 20.0;
        n3 = n4 = (int)((double)n3 * d4);
        if (n4 < 0) {
            n3 = 0;
        }
        n4 = n3;
        if (n3 >= n5) {
            n4 = n5 - 1;
        }
        return n4;
    }

    public int getSectionForPosition(int n3) {
        int n4;
        double d4 = (double)this.getCount() / 20.0;
        n3 = n4 = (int)((double)n3 / d4);
        if (n4 < 0) {
            n3 = 0;
        }
        n4 = n3;
        if (n3 >= 20) {
            n4 = 19;
        }
        return n4;
    }

    public Object[] getSections() {
        Object[] objectArray = new Object[20];
        double d4 = (double)this.getCount() / 20.0;
        for (int i3 = 0; i3 < 20; ++i3) {
            objectArray[i3] = (int)((double)i3 * d4);
        }
        return objectArray;
    }
}

