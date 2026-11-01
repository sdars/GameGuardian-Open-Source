package android.ext;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class Tools$i implements Runnable {
    Tools$i() {
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        Throwable thB1;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append("Context info. act - ");
        sb.append(Tools.v0(r.p));
        sb.append("; app - ");
        sb.append(Tools.v0(r.o));
        sb.append("; dae - ");
        sb.append(Tools.v0(MainService.context));
        sb.append("; bad - ");
        Throwable thB2 = Tools.b1(r.p);
        if (thB2 != null) {
            arrayList.add(thB2);
            i = 1;
        } else {
            i = 0;
        }
        Throwable thB3 = Tools.b1(r.o);
        if (thB3 != null) {
            i += 10;
            arrayList.add(thB3);
        }
        if (MainService.context != null && (thB1 = Tools.b1(MainService.context)) != null) {
            i += 100;
            arrayList.add(thB1);
        }
        sb.append(i);
        String string = sb.toString();
        if (i > 0) {
            RuntimeException runtimeException = new RuntimeException(string);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                runtimeException.addSuppressed((Throwable) it.next());
            }
            n0.h(Thread.currentThread(), runtimeException, false);
        }
        e1.d(string);
    }
}
