package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class BaseAdapterIndexer extends android.ext.BaseAdapterLC implements android.widget.SectionIndexer {
    public BaseAdapterIndexer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.widget.SectionIndexer
    public int getPositionForSection(int r6) {
            r5 = this;
            int r0 = r5.getCount()
            double r1 = (double) r0
            r3 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r1 = r1 / r3
            double r3 = (double) r6
            double r3 = r3 * r1
            int r6 = (int) r3
            if (r6 >= 0) goto Lf
            r6 = 0
        Lf:
            if (r6 < r0) goto L13
            int r6 = r0 + (-1)
        L13:
            return r6
    }

    @Override // android.widget.SectionIndexer
    public int getSectionForPosition(int r5) {
            r4 = this;
            int r0 = r4.getCount()
            double r0 = (double) r0
            r2 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r0 = r0 / r2
            double r2 = (double) r5
            double r2 = r2 / r0
            int r5 = (int) r2
            if (r5 >= 0) goto Le
            r5 = 0
        Le:
            r0 = 20
            if (r5 < r0) goto L14
            r5 = 19
        L14:
            return r5
    }

    @Override // android.widget.SectionIndexer
    public java.lang.Object[] getSections() {
            r7 = this;
            r0 = 20
            java.lang.Object[] r1 = new java.lang.Object[r0]
            int r2 = r7.getCount()
            double r2 = (double) r2
            r4 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r2 = r2 / r4
            r4 = 0
        Ld:
            if (r4 >= r0) goto L1c
            double r5 = (double) r4
            double r5 = r5 * r2
            int r5 = (int) r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1[r4] = r5
            int r4 = r4 + 1
            goto Ld
        L1c:
            return r1
    }
}
