package android.ext;

import catch_.me_.if_.you_.can_.R$string;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
class t1$a extends NumberFormatException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList f1258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f1259b;

    public t1$a(String str) {
        super(str);
        this.f1258a = null;
        this.f1259b = null;
    }

    void a(long j) {
        c(Tools.L1(b2.g("__d__"), Long.valueOf(j)));
    }

    void b(Object obj) {
        c(Tools.L1(b2.g("__d__"), obj));
    }

    void c(String str) {
        ArrayList arrayList = this.f1258a;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f1258a = arrayList;
        }
        arrayList.add(str);
    }

    void d() {
        String message;
        boolean z;
        if (this.f1259b == null && (message = getMessage()) != null) {
            int iIndexOf = message.indexOf(b2.f(R$string.locale_ui));
            if (iIndexOf > 0) {
                message = message.substring(0, iIndexOf);
                z = true;
            } else {
                z = false;
            }
            ArrayList<String> arrayList = this.f1258a;
            if (arrayList != null) {
                Collections.sort(arrayList, new t1$a$a(this));
                for (String str : arrayList) {
                    if (str != null) {
                        String strE3 = Script.E3(str);
                        if (!str.equals(strE3) && message.indexOf(str) >= 0) {
                            message = message.replace(str, strE3);
                            z = true;
                        }
                    }
                }
            }
            if (iIndexOf > 0) {
                message = message + b2.f(R$string.locale_script) + " (en_US):\n" + Tools.L1(t1.z(R$string.locale_desc), '.', ',');
            }
            if (z) {
                this.f1259b = message;
            }
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str = this.f1259b;
        return str != null ? str : super.getMessage();
    }
}
