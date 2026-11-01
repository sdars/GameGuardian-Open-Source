package android.ext;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public class Config$o extends ContextWrapper {
    public Config$o(Context context) {
        super(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public String getOpPackageName() {
        e1.d("Use 2 " + Config.E + " instead of " + getBaseContext().getPackageName());
        return Config.E;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public String getPackageName() {
        e1.d("Use 1 " + Config.E + " instead of " + getBaseContext().getPackageName());
        return Config.E;
    }
}
