package android.ext;

import android.content.SharedPreferences;
import android.fix.ToolbarButton;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class p1 implements View.OnClickListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f1170e = new long[3];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f1171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference f1173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1174d;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p1.this.e(view);
        }
    }

    public p1(int i, int i2) {
        this.f1172b = 0;
        this.f1173c = new WeakReference(null);
        this.f1174d = -1;
        this.f1171a = b2.f(i);
        this.f1172b = i2;
    }

    public static String d() {
        SharedPreferences sharedPreferencesM0 = Tools.M0();
        SharedPreferences.Editor editorEdit = sharedPreferencesM0.edit();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            String str = "m-" + i;
            long j = sharedPreferencesM0.getLong(str, 0L);
            editorEdit.remove(str);
            if (j != 0) {
                sb.append("&m");
                sb.append(i);
                sb.append('=');
                sb.append(Long.toHexString(j));
            }
        }
        editorEdit.commit();
        return sb.toString();
    }

    private static void f() {
        g2 g2Var = new g2();
        for (int i = 0; i < 3; i++) {
            g2Var.i("m-" + i, f1170e[i], 0L);
        }
        g2Var.commit();
    }

    public final ImageView a() {
        return b(false);
    }

    public ImageView b(boolean z) {
        ToolbarButton toolbarButton = new ToolbarButton(Tools.f0());
        toolbarButton.setIcon(this.f1172b);
        toolbarButton.setOnClickListener(!z ? this : new a());
        toolbarButton.setTag(this);
        return toolbarButton;
    }

    public Drawable c() {
        if (this.f1172b == 0) {
            return null;
        }
        Drawable drawable = (Drawable) this.f1173c.get();
        if (drawable != null) {
            return drawable;
        }
        Drawable drawableO0 = Tools.o0(this.f1172b);
        this.f1173c = new WeakReference(drawableO0);
        return drawableO0;
    }

    public void e(View view) {
        int i;
        int i2 = this.f1174d;
        if (i2 != -1 && (i = i2 / 64) >= 0 && i < 3) {
            long j = 1 << (i2 % 64);
            long[] jArr = f1170e;
            long j2 = jArr[i];
            if ((j2 & j) == 0) {
                jArr[i] = j | j2;
                f();
            }
        }
        onClick(view);
    }

    public void g(int i, int i2) {
        this.f1174d = (i * 64) + i2;
    }

    @Override // android.view.View.OnClickListener
    public abstract void onClick(View view);

    public String toString() {
        return this.f1171a;
    }

    public p1(String str) {
        this.f1172b = 0;
        this.f1173c = new WeakReference(null);
        this.f1174d = -1;
        this.f1171a = str;
    }
}
