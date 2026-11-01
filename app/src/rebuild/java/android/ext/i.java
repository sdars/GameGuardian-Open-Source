package android.ext;

import catch_.me_.if_.you_.can_.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static float f999a = (1 * 113.5f) - 12.1f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f1000b = "catch_#me_#if_#you_#can_".replace('#', '.').intern();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f1001c = "@ame@uardian".replace('@', 'G').intern();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f1002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f1003e;

    static {
        String strSubstring;
        try {
            strSubstring = MainActivity.class.getPackage().getName();
        } catch (Throwable th) {
            String strReplace = "Lcatch_/me_/if_/you_/can_;".replace('/', '.');
            strSubstring = strReplace.substring(1, strReplace.length() - 1);
            e1.a(th);
        }
        f1002d = strSubstring.intern();
        f1003e = "Lcar$GameGuardian~Lcar$".replace("Lcar$", "").split("~", 2)[0].intern();
    }

    public static final void a() {
    }
}
