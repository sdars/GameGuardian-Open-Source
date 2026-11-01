package android.ext;

/* JADX INFO: loaded from: classes.dex */
final class y0$c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f1356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f1357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f1358c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f1359d;

    public y0$c(String str, int i, String str2) {
        this.f1356a = str;
        this.f1357b = i;
        this.f1359d = str2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof y0$c) {
            y0$c y0_c = (y0$c) obj;
            if (this.f1357b == y0_c.f1357b && this.f1356a.equals(y0_c.f1356a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f1358c;
        if (iHashCode == 0) {
            iHashCode = this.f1356a.hashCode();
            String str = "#$@$#" + this.f1357b;
            int length = str.length();
            for (int i = 0; i < length; i++) {
                iHashCode = (iHashCode * 31) + str.charAt(i);
            }
            this.f1358c = iHashCode;
        }
        return iHashCode;
    }

    public String toString() {
        return this.f1356a;
    }
}
