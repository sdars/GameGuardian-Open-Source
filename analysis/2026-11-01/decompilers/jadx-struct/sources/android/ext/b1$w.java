package android.ext;

import java.util.zip.ZipEntry;

/* JADX INFO: loaded from: classes.dex */
public class b1$w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ZipEntry f646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f648c;

    public b1$w(ZipEntry zipEntry, String str) {
        this.f646a = zipEntry;
        this.f647b = str;
    }

    public String toString() {
        return "Item [entry=" + this.f646a + ", extractHash=" + this.f647b + ", putHash=" + this.f648c + ']';
    }
}
