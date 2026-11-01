package android.ext;

import android.util.SparseIntArray;
import catch_.me_.if_.you_.can_.R$color;

/* JADX INFO: loaded from: classes.dex */
public class RegionList$b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static SparseIntArray f353f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f354g = 16777215;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f359e;

    public RegionList$b(int i, long j, long j2) {
        this.f355a = i;
        this.f356b = j;
        this.f357c = j2;
    }

    public static int c(RegionList$b regionList$b) {
        try {
            SparseIntArray sparseIntArray = f353f;
            if (sparseIntArray == null) {
                sparseIntArray = new SparseIntArray(8);
                sparseIntArray.append(4, Tools.d0(R$color.pointer_unknown));
                sparseIntArray.append(1, Tools.d0(R$color.pointer_executable_writable));
                sparseIntArray.append(2, Tools.d0(R$color.pointer_executable));
                sparseIntArray.append(16, Tools.d0(R$color.pointer_writable));
                sparseIntArray.append(8, Tools.d0(R$color.pointer_readable));
                f353f = sparseIntArray;
                f354g = Tools.d0(R$color.pointer_unknown);
            }
            int i = regionList$b != null ? sparseIntArray.get(regionList$b.d()) : 4;
            return i == 4 ? f354g : i;
        } catch (Throwable th) {
            e1.l("Failed getPointerColor for: " + regionList$b, th);
            return f354g;
        }
    }

    private int d() {
        int i = this.f355a;
        if ((i & 1536) == 1536) {
            return 1;
        }
        if ((i & 1024) == 1024) {
            return 2;
        }
        if ((i & 512) == 512) {
            return 16;
        }
        return (i & 256) == 256 ? 8 : 4;
    }

    public String a() {
        if (this.f359e == null) {
            return this.f358d;
        }
        return this.f359e + ":bss";
    }

    public String b() {
        return this.f358d;
    }

    public CharSequence e() {
        return RegionList.f346e[this.f355a & 255];
    }

    public String f() {
        int i = this.f355a;
        StringBuilder sb = new StringBuilder();
        sb.append((i & 256) == 256 ? "r" : "-");
        sb.append((i & 512) == 512 ? "w" : "-");
        sb.append((i & 1024) == 1024 ? "x" : "-");
        sb.append((i & 2048) == 2048 ? "s" : "p");
        return sb.toString();
    }

    public CharSequence g() {
        return Tools.t(toString(), RegionList.f347f[this.f355a & 255]);
    }

    public String toString() {
        return ((Object) RegionList.f346e[this.f355a & 255]) + ": " + c.G(this.f356b, 4) + '-' + c.G(this.f357c, 4) + ' ' + f() + " '" + this.f358d + '\'';
    }
}
