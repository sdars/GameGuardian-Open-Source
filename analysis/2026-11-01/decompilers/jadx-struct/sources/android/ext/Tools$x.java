package android.ext;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public class Tools$x extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Handler f549a;

    public Tools$x(Handler handler) {
        super(handler.getLooper());
        this.f549a = handler;
    }

    public static Handler a(Handler handler) {
        return !(handler instanceof Tools$x) ? new Tools$x(handler) : handler;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            this.f549a.handleMessage(message);
        } catch (Throwable th) {
            e1.a(th);
        }
    }
}
