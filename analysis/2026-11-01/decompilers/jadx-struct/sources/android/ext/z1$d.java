package android.ext;

import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R$color;
import catch_.me_.if_.you_.can_.R$drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class z1$d implements Comparable {
    private static WeakReference q;
    public static final int r = Tools.e0(R$color.process_pid, -5570561);
    public static final int s = Tools.e0(R$color.process_name, -1);
    public static final int t = Tools.e0(R$color.process_size, -5570646);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f1434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f1435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Drawable f1436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1438g;
    public int h;
    public boolean i;
    public boolean j;
    public long k;
    public boolean l;
    public int m;
    public boolean n;
    public int o;
    private volatile boolean p;

    public z1$d(z1$c z1_c, int i, int i2, String str, int i3, boolean z, int i4) {
        this.p = false;
        this.f1432a = str;
        this.f1433b = z1_c.f1428d;
        this.f1434c = z1_c.f1427c;
        String str2 = z1_c.f1429e;
        this.f1435d = str2 == null ? "" : str2;
        this.f1436e = null;
        this.f1437f = i;
        this.f1438g = i2;
        this.h = z1_c.h ? i2 : z1_c.f1426b;
        this.l = str.equals(z1_c.f1427c);
        this.i = z1_c.f1430f;
        this.j = z1_c.f1431g;
        this.m = i3;
        this.n = z;
        this.o = i4;
        if (z1_c.h) {
            this.p = true;
        }
    }

    private String e() {
        if (this.l) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(" (");
        sb.append(this.f1432a.replace(this.f1434c + ':', ""));
        sb.append(')');
        return sb.toString();
    }

    private void i(int i) {
        Drawable drawableR1;
        if (this.p) {
            return;
        }
        Drawable drawableL = z1.l(this.f1434c);
        if (drawableL != null) {
            synchronized (z1.f1415f) {
                if (i != 0) {
                    try {
                        if (i != z1.f1416g) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f1436e = drawableL;
                this.p = true;
                return;
            }
        }
        try {
            drawableR1 = Tools.R1(Tools.G0(Tools.X(Tools.Y(this.f1434c)), Tools.H()));
        } catch (Throwable unused) {
            e1.p("Failed load icon for " + this.f1434c);
            drawableR1 = null;
        }
        synchronized (z1.f1415f) {
            if (i != 0) {
                try {
                    if (i != z1.f1416g) {
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f1436e = drawableR1;
            if (drawableR1 != null) {
                z1.r(this.f1434c, drawableR1);
            }
            this.p = true;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(z1$d z1_d) {
        int i = this.m;
        int i2 = z1_d.m;
        if (i == i2) {
            boolean z = this.j;
            if (z == z1_d.j) {
                boolean z2 = this.i;
                if (z2 == z1_d.i) {
                    long j = this.k;
                    long j2 = z1_d.k;
                    if (j == j2) {
                        boolean z3 = this.l;
                        if (z3 == z1_d.l) {
                            if ((f() > 0) == (z1_d.f() > 0)) {
                                int i3 = this.f1437f;
                                int i4 = z1_d.f1437f;
                                if (i3 == i4) {
                                    return 0;
                                }
                                if (i3 > i4) {
                                    return -1;
                                }
                            } else if (f() <= 0) {
                                return -1;
                            }
                        } else if (z3) {
                            return -1;
                        }
                    } else if (j > j2) {
                        return -1;
                    }
                } else if (!z2) {
                    return -1;
                }
            } else if (z) {
                return -1;
            }
        } else if (i > i2) {
            return -1;
        }
        return 1;
    }

    public String d() {
        return "ProcessInfo [cmdline=" + this.f1432a + ", name=" + this.f1433b + ", packageName=" + this.f1434c + ", icon=" + this.f1436e + ", pid=" + this.f1437f + ", uid=" + this.f1438g + ", isSystem=" + this.i + ", isGame=" + this.j + ", weight=" + this.k + ", main=" + this.l + ", order=" + this.m + ", x64=" + this.n + ", rss=" + this.o + ", getTracer()=" + g() + ", getTrace()=" + f() + ']';
    }

    public int f() {
        SparseIntArray sparseIntArray = z1.h;
        int iIndexOfValue = sparseIntArray.indexOfValue(this.f1437f);
        return iIndexOfValue >= 0 ? sparseIntArray.keyAt(iIndexOfValue) : iIndexOfValue;
    }

    public int g() {
        return z1.h.get(this.f1437f);
    }

    public void h() {
        i(0);
    }

    public void j(TextView textView) {
        Drawable drawableL;
        if (textView == null) {
            return;
        }
        boolean z = this.p;
        Drawable drawableO0 = this.f1436e;
        if (drawableO0 == null && (drawableL = z1.l(this.f1434c)) != null) {
            this.f1436e = drawableL;
            z = true;
            this.p = true;
            drawableO0 = drawableL;
        }
        if (drawableO0 == null) {
            WeakReference weakReference = q;
            if (weakReference != null) {
                drawableO0 = (Drawable) weakReference.get();
            }
            if (drawableO0 == null) {
                drawableO0 = Tools.o0(R$drawable.empty);
                q = new WeakReference(drawableO0);
            }
        }
        Tools.c(textView, drawableO0, 48);
        if (z) {
            return;
        }
        n2.h(new z1$d$a(this, textView));
    }

    public void k() {
        ApplicationInfo applicationInfoY;
        if (this.f1438g == this.h) {
            return;
        }
        e1.p("vs app: " + this.h + " != " + this.f1438g);
        try {
            String strM = z1.i.m(this.f1438g);
            if (strM == null || (applicationInfoY = Tools.Y(strM)) == null || applicationInfoY.nativeLibraryDir == null) {
                return;
            }
            e1.p("vs: " + this.f1435d + " => " + applicationInfoY.nativeLibraryDir);
            this.f1435d = applicationInfoY.nativeLibraryDir;
        } catch (Throwable th) {
            e1.s("Failed get vs info for " + this.f1438g, th);
        }
    }

    public CharSequence l() {
        y yVar = new y();
        StringBuilder sb = new StringBuilder();
        if (g() > 0) {
            sb.append('#');
        }
        if (f() > 0) {
            sb.append('!');
        }
        if (!Config.C && this.f1438g != this.h) {
            sb.append('v');
        }
        if (this.f1437f > 1) {
            sb.append('[');
            sb.append(Integer.toString(this.f1437f));
            sb.append("] ");
        }
        yVar.a(Tools.t(sb.toString(), r));
        yVar.a(Tools.t(this.f1433b + e(), s));
        StringBuilder sb2 = new StringBuilder();
        if (this.n) {
            sb2.append(" [x64]");
        }
        if (this.o != 0) {
            sb2.append(" [");
            sb2.append(Tools.U(Tools.f0(), ((long) this.o) * 1024));
            sb2.append(']');
        }
        yVar.a(Tools.t(sb2.toString(), t));
        return yVar.d();
    }

    public String toString() {
        return l().toString();
    }
}
