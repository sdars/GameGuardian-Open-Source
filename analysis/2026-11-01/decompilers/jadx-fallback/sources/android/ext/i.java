package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static float f999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final java.lang.String f1000b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final java.lang.String f1001c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final java.lang.String f1002d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final java.lang.String f1003e = null;

    static {
            r0 = 1
            float r1 = (float) r0
            r2 = 1122172928(0x42e30000, float:113.5)
            float r1 = r1 * r2
            r2 = 1094818202(0x4141999a, float:12.1)
            float r1 = r1 - r2
            android.ext.i.f999a = r1
            java.lang.String r1 = "catch_#me_#if_#you_#can_"
            r2 = 35
            r3 = 46
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.String r1 = r1.intern()
            android.ext.i.f1000b = r1
            r1 = 64
            r2 = 71
            java.lang.String r4 = "@ame@uardian"
            java.lang.String r1 = r4.replace(r1, r2)
            java.lang.String r1 = r1.intern()
            android.ext.i.f1001c = r1
            java.lang.Class<catch_.me_.if_.you_.can_.MainActivity> r1 = catch_.me_.if_.you_.can_.MainActivity.class
            java.lang.Package r1 = r1.getPackage()     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = r1.getName()     // Catch: java.lang.Throwable -> L37
            goto L4c
        L37:
            r1 = move-exception
            java.lang.String r2 = "Lcatch_/me_/if_/you_/can_;"
            r4 = 47
            java.lang.String r2 = r2.replace(r4, r3)
            int r3 = r2.length()
            int r3 = r3 - r0
            java.lang.String r0 = r2.substring(r0, r3)
            android.ext.e1.a(r1)
        L4c:
            java.lang.String r0 = r0.intern()
            android.ext.i.f1002d = r0
            java.lang.String r0 = "Lcar$"
            java.lang.String r1 = ""
            java.lang.String r2 = "Lcar$GameGuardian~Lcar$"
            java.lang.String r0 = r2.replace(r0, r1)
            java.lang.String r1 = "~"
            r2 = 2
            java.lang.String[] r0 = r0.split(r1, r2)
            r1 = 0
            r0 = r0[r1]
            java.lang.String r0 = r0.intern()
            android.ext.i.f1003e = r0
            return
    }

    public static final void a() {
            return
    }
}
