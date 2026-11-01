/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package android.ext;

import android.ext.g2;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class a3 {
    private int[] a;
    private int b = 0;
    private final int c;

    public a3(int n3) {
        this.c = n3;
        this.a = new int[32];
    }

    private void b() {
        int n3 = this.b;
        Object object = this.a;
        Comparable<ByteBuffer> comparable = ByteBuffer.allocate(n3 * 4);
        ((ByteBuffer)comparable).order(ByteOrder.LITTLE_ENDIAN);
        for (int i3 = 0; i3 < n3; ++i3) {
            ((ByteBuffer)comparable).putInt(object[i3]);
        }
        String string2 = Base64.encodeToString((byte[])((ByteBuffer)comparable).array(), (int)11);
        object = new g2();
        comparable = new StringBuilder();
        ((StringBuilder)comparable).append("used-");
        ((StringBuilder)comparable).append(this.c);
        ((g2)object).j(((StringBuilder)comparable).toString(), string2).commit();
    }

    public void a(int n3) {
        int n4 = this.b;
        int[] nArray = this.a;
        for (int i3 = 0; i3 < n4; ++i3) {
            if (nArray[i3] != n3) continue;
            return;
        }
        int[] nArray2 = nArray;
        if (n4 == nArray.length) {
            this.a = nArray2 = Arrays.copyOf(nArray, nArray.length + 32);
        }
        nArray2[n4] = n3;
        this.b = n4 + 1;
        this.b();
    }
}

