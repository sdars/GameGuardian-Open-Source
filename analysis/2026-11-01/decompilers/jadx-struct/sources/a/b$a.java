package a;

import android.content.Context;
import android.ext.e1;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
class b$a extends b {
    private Object mPackageInfo;

    b$a(Context context) {
        super(context);
        try {
            Context baseContext = getBaseContext();
            Class<?> cls = Class.forName("android.app.ContextImpl");
            if (cls.isInstance(baseContext)) {
                Field declaredField = cls.getDeclaredField("mPackageInfo");
                declaredField.setAccessible(true);
                this.mPackageInfo = declaredField.get(baseContext);
                e1.d("WBContext: " + this.mPackageInfo);
            }
        } catch (Throwable th) {
            e1.a(th);
        }
    }
}
