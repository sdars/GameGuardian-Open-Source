package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$id;

/* JADX INFO: loaded from: classes.dex */
class r$e implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f1216a;

    r$e(r rVar) {
        this.f1216a = rVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0065 A[PHI: r4
      0x0065: PHI (r4v6 android.ext.Config$p) = (r4v2 android.ext.Config$p), (r4v8 android.ext.Config$p) binds: [B:33:0x0093, B:26:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        Config$p config$pB;
        int i2 = 1;
        switch (i) {
            case 0:
                r0.d(m2.f1074a);
                r.I();
                break;
            case 1:
                config$pB = Config.b(R$id.selinux);
                if ((Config.A & 4) != 0) {
                    i2 = 0;
                }
                config$pB.f42d = i2;
                Config.k();
                r.I();
                break;
            case 2:
                new z(this.f1216a).J();
                break;
            case 3:
                Config.b(R$id.config_float_type).f42d = -1;
                Config.b(R$id.config_float_flags).f42d = -1;
                Config.k();
                r.I();
                break;
            case 4:
                config$pB = Config.b(R$id.config_use_notification);
                if ((Config.B & 256) != 0) {
                    i2 = 0;
                }
                config$pB.f42d = i2;
                Config.k();
                r.I();
                break;
            case 5:
                Config.b(R$id.config_hot_key).b();
                break;
            case 6:
                this.f1216a.T();
                break;
            case 7:
                Config.f30c = 0L;
                Config.k();
                r.I();
                break;
            case 8:
                ConfigListAdapter.b();
                break;
            case 9:
                r.H();
                break;
            case 10:
                r.O();
                break;
            case 11:
                Config.b(R$id.config_prevent_unload).b();
                break;
            case 12:
                Config.b(R$id.config_acceleration).b();
                break;
            case 13:
                Config.b(R$id.config_vspace_root).b();
                break;
            case 14:
                Config.b(R$id.config_number_locale).b();
                break;
            default:
                r.I();
                break;
        }
    }
}
