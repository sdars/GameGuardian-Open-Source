package android.ext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import luaj.LuaTable;
import luaj.LuaTable$i;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$getValues extends Script$BusyApiFunction {
    final ArrayList f0;
    long[] g0;
    int[] h0;
    int i0;
    final /* synthetic */ Script j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Script$getValues(Script script) {
        super(script);
        this.j0 = script;
        this.f0 = new ArrayList();
        this.g0 = null;
        this.h0 = null;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 1;
    }

    @Override // android.ext.Script$ApiFunction
    protected Varargs a3() {
        ArrayList arrayList = this.f0;
        LuaTable luaTable = new LuaTable();
        luaTable.R1(this.i0);
        ArrayList arrayList2 = Script.p0;
        int i = 0;
        if (arrayList2 != null) {
            Script.q0++;
            Script.p0 = null;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                luaTable.d2((LuaValue) arrayList.get(i), Script.n3(null, (c) it.next()));
                i++;
            }
        } else {
            Script.q0 += 100000;
            n0.h(Thread.currentThread(), new RuntimeException("memList is null " + Script.q0), false);
        }
        this.h0 = null;
        this.g0 = null;
        arrayList.clear();
        arrayList.trimToSize();
        return luaTable;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        LuaTable luaTableI = varargs.I(1);
        ArrayList arrayList = this.f0;
        this.h0 = null;
        this.g0 = null;
        int iD3 = luaTableI.d3() + luaTableI.e3();
        long[] jArrCopyOf = new long[iD3];
        int[] iArrCopyOf = new int[iD3];
        arrayList.clear();
        arrayList.ensureCapacity(iD3);
        z1$d z1_d = MainService.instance.v0;
        boolean z = z1_d != null ? z1_d.n : false;
        c cVar = new c(0L, 0L, 4);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (LuaTable$i luaTable$iS3 = luaTableI.s3(); luaTable$iS3.c(); luaTable$iS3 = luaTable$iS3) {
            if (luaTable$iS3.a() != 0) {
                i++;
            }
            LuaValue luaValueB = luaTable$iS3.b();
            Script.T3(cVar, luaTable$iS3.d().H0(), (byte) 2, z);
            if (i2 == jArrCopyOf.length) {
                i3++;
                int i4 = i2 >> 1;
                if (i4 < 10) {
                    i4 = 10;
                }
                n0.h(Thread.currentThread(), new RuntimeException("OF " + i3 + "; " + jArrCopyOf.length + "; " + luaTableI.d3() + " + " + luaTableI.e3() + "; " + luaValueB.h1() + ": " + luaValueB + "; " + luaTableI.V0() + "; " + luaTableI), false);
                int i5 = i4 + i2;
                long[] jArrCopyOf2 = Arrays.copyOf(jArrCopyOf, i5);
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i5);
                jArrCopyOf = jArrCopyOf2;
            }
            jArrCopyOf[i2] = cVar.f672a;
            iArrCopyOf[i2] = cVar.f674c & 127;
            arrayList.add(luaValueB);
            i2++;
            z = z;
        }
        this.i0 = i;
        if (iArrCopyOf.length != i2) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
        }
        this.h0 = iArrCopyOf;
        if (jArrCopyOf.length != i2) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
        }
        this.g0 = jArrCopyOf;
        if (i2 != 0) {
            return super.b3(varargs);
        }
        this.h0 = null;
        this.g0 = null;
        return new LuaTable();
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs c3(Varargs varargs) {
        MainService.instance.i.R(this.j0.t3(), this.h0, this.g0);
        this.h0 = null;
        this.g0 = null;
        return null;
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.getValues(table values) -> table || string with error";
    }
}
