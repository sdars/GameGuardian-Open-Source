package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class BaseAdapterLC extends android.widget.BaseAdapter implements android.view.View.OnLongClickListener {
    public BaseAdapterLC() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View r8) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            android.widget.ListView r2 = android.ext.Tools.w0(r8)
            if (r2 == 0) goto L22
            int r4 = r2.getPositionForView(r8)
            r1 = -1
            if (r4 != r1) goto L12
            return r0
        L12:
            android.widget.AdapterView$OnItemLongClickListener r1 = r2.getOnItemLongClickListener()
            if (r1 == 0) goto L20
            long r5 = r7.getItemId(r4)
            r3 = r8
            r1.onItemLongClick(r2, r3, r4, r5)
        L20:
            r8 = 1
            return r8
        L22:
            return r0
    }
}
