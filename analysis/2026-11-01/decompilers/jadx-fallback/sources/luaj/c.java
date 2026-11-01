package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class c extends luaj.d {
    public final int j;
    public final java.lang.String k;
    public final java.lang.String l;

    public c(int r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.j = r2
            r1.k = r4
            java.lang.String r2 = r1.e(r3)
            r1.l = r2
            java.lang.String r2 = r1.f()
            r1.h = r2
            return
    }

    c(luaj.c r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            int r0 = r2.j
            int r0 = r0 + (-1)
            r1.j = r0
            java.lang.String r0 = r2.k
            r1.k = r0
            java.lang.String r2 = r2.l
            r1.l = r2
            java.lang.String r2 = r1.f()
            r1.h = r2
            return
    }

    private java.lang.String e(java.lang.String r6) {
            r5 = this;
            if (r6 != 0) goto L2e
            java.lang.StackTraceElement[] r0 = r5.getStackTrace()
            if (r0 == 0) goto L2e
            int r1 = r0.length
            r2 = 1
        La:
            if (r2 >= r1) goto L2e
            r3 = r0[r2]
            java.lang.String r3 = r3.getClassName()
            if (r3 != 0) goto L15
            goto L2b
        L15:
            java.lang.String r4 = "LuaClosure"
            boolean r4 = r3.endsWith(r4)
            if (r4 == 0) goto L1e
            goto L2e
        L1e:
            java.lang.String r4 = "Lib$"
            boolean r4 = r3.contains(r4)
            if (r4 == 0) goto L2b
            java.lang.String r6 = luaj.LuaFunction.U2(r3)
            goto L2e
        L2b:
            int r2 = r2 + 1
            goto La
        L2e:
            return r6
    }

    private java.lang.String f() {
            r3 = this;
            java.lang.String r0 = r3.l
            java.lang.String r1 = "bad argument #"
            if (r0 != 0) goto L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r3.j
            if (r2 != 0) goto L12
            java.lang.String r1 = "calling method on bad self"
            goto L28
        L12:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            int r1 = r3.j
            r2.append(r1)
            java.lang.String r1 = ": "
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L28:
            r0.append(r1)
            java.lang.String r1 = r3.k
        L2d:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L87
        L35:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r3.j
            if (r2 != 0) goto L57
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "calling '"
            r1.append(r2)
            java.lang.String r2 = r3.l
            r1.append(r2)
            java.lang.String r2 = "' on bad self"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L77
        L57:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            int r1 = r3.j
            r2.append(r1)
            java.lang.String r1 = " to '"
            r2.append(r1)
            java.lang.String r1 = r3.l
            r2.append(r1)
            java.lang.String r1 = "'"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L77:
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            java.lang.String r1 = r3.k
            r0.append(r1)
            java.lang.String r1 = ")"
            goto L2d
        L87:
            return r0
    }
}
