package a;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public class c$a extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f15a;

    public c$a(Context context) {
        super(context);
        this.f15a = context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("audio".equals(str)) {
            return null;
        }
        return this.f15a.getSystemService(str);
    }
}
