package android.ext;

/* JADX INFO: loaded from: classes.dex */
class HotFrame$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ HotFrame f157a;

    HotFrame$a(HotFrame hotFrame) {
        this.f157a = hotFrame;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zPerformHapticFeedback;
        try {
            this.f157a.setHapticFeedbackEnabled(true);
            zPerformHapticFeedback = this.f157a.performHapticFeedback(0, 1);
            try {
                this.f157a.setHapticFeedbackEnabled(false);
            } catch (Throwable th) {
                th = th;
                e1.g("Failed make HapticFeedback", th);
                this.f157a.setHapticFeedbackEnabled(false);
            }
        } catch (Throwable th2) {
            th = th2;
            zPerformHapticFeedback = false;
        }
        e1.d("Real long click: " + zPerformHapticFeedback);
        MainService.instance.onLongClick(null);
    }
}
