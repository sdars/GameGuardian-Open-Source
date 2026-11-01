package android.ext;

import java.util.LinkedHashMap;
import java.util.Map$Entry;

/* JADX INFO: loaded from: classes.dex */
class z1$a extends LinkedHashMap {
    z1$a(int i, float f2, boolean z) {
        super(i, f2, z);
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(Map$Entry map$Entry) {
        return size() > 128;
    }
}
