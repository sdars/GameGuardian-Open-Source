package android.ext;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$q implements Comparator {
    ConfigListAdapter$q() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(String str, String str2) {
        return (str + "_zzz").replace('-', '_').compareTo((str2 + "_zzz").replace('-', '_'));
    }
}
