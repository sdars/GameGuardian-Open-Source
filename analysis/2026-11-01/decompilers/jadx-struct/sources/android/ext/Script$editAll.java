package android.ext;

import catch_.me_.if_.you_.can_.R$string;
import java.io.Writer;
import java.util.ArrayList;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$editAll extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$editAll(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 2;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x023d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        char[] charArray;
        byte[] bArrH;
        String[] strArr;
        MainService mainService;
        Object obj;
        MainService mainService2;
        int i;
        byte[] bArr;
        String str;
        int i2;
        long j;
        int i3;
        long j2;
        long j3;
        if (!this.e0.c0) {
            throw new luaj.d("You must call gg.getResults before calling gg.editAll.");
        }
        try {
            String strD3 = Script.D3(varargs.E(1));
            int iF3 = Script.f3(varargs.D(2));
            int i4 = 0;
            i2$c i2_cX = i2.x(strD3, false);
            int i5 = i2_cX != null ? i2_cX.f1018b : 0;
            if (i2_cX != null) {
                strD3 = i2_cX.f1017a;
            }
            MainService mainService3 = MainService.instance;
            ArrayList arrayListS3 = Script.S3(this.e0.d0);
            if (arrayListS3 == null) {
                Script script = this.e0;
                if (!script.e0) {
                    script.e0 = true;
                    e1.p("editAll: no reply capture for seq " + ((int) this.e0.d0) + "; using the shared result list");
                }
            }
            t1$b t1_bW = null;
            d.a aVar = arrayListS3 == null ? mainService3.s0 : null;
            int i6 = arrayListS3 == null ? aVar.i() : arrayListS3.size();
            if (iF3 == 1 && t1.m(strD3)) {
                charArray = null;
                strArr = null;
                bArrH = t1.h(strD3);
            } else if ((iF3 & 6) != 0 && t1.m(strD3) && strD3.charAt(0) == ';') {
                bArrH = null;
                strArr = null;
                charArray = strD3.substring(1).toCharArray();
            } else if (strD3.indexOf(59) != -1) {
                String[] strArrSplit = strD3.split(";");
                if (strArrSplit.length == 0) {
                    charArray = null;
                    bArrH = null;
                    strArr = null;
                } else {
                    charArray = null;
                    bArrH = null;
                    strArr = strArrSplit;
                }
            } else {
                charArray = null;
                bArrH = null;
                strArr = null;
            }
            c cVar = new c();
            t1$b[] t1_bArr = strArr == null ? null : new t1$b[strArr.length];
            long j4 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i4 < i6) {
                if (arrayListS3 != null) {
                    try {
                        c cVar2 = (c) arrayListS3.get(i4);
                        if (cVar2 == null) {
                            mainService2 = mainService3;
                            arrayListS3 = arrayListS3;
                        } else {
                            mainService2 = mainService3;
                            try {
                                cVar.f672a = cVar2.f672a;
                                cVar.f674c = cVar2.f674c;
                            } catch (IndexOutOfBoundsException e2) {
                                e = e2;
                                e1.s("List changed", e);
                                mainService = mainService2;
                                mainService.i.C(this.e0.t3());
                                obj = new Object();
                                synchronized (obj) {
                                    try {
                                        n2.i(new Script$editAll$1(this, obj));
                                        Script.W3(obj);
                                        return LuaValue.I2(i8);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        }
                        str = strD3;
                        charArray = charArray;
                        bArr = bArrH;
                        i = i6;
                        strArr = strArr;
                        i4++;
                        strArr = strArr;
                        strD3 = str;
                        mainService3 = mainService2;
                        arrayListS3 = arrayListS3;
                        charArray = charArray;
                        bArrH = bArr;
                        i6 = i;
                    } catch (IndexOutOfBoundsException e3) {
                        e = e3;
                        mainService2 = mainService3;
                    }
                } else {
                    mainService2 = mainService3;
                    aVar.f(i4, cVar);
                }
                int i9 = cVar.f674c;
                if (i9 != iF3) {
                    str = strD3;
                    charArray = charArray;
                    bArr = bArrH;
                    i = i6;
                    strArr = strArr;
                } else {
                    if (bArrH != null) {
                        long j5 = j4 + 1;
                        long j6 = cVar.f672a;
                        int i10 = i6;
                        int i11 = j5 != j6 ? 0 : i7;
                        if (i11 < bArrH.length) {
                            j3 = ((long) bArrH[i11]) & 255;
                            i11++;
                        } else {
                            j3 = 0;
                        }
                        cVar.f673b = j3;
                        i7 = i11;
                        cVar = cVar;
                        charArray = charArray;
                        j4 = j6;
                        i = i10;
                        bArr = bArrH;
                        str = strD3;
                        strArr = strArr;
                    } else {
                        bArr = bArrH;
                        i = i6;
                        if (charArray != null) {
                            boolean z = i9 == 2;
                            long j7 = j4 + ((long) (z ? 2 : 4));
                            long j8 = cVar.f672a;
                            int i12 = j7 != j8 ? 0 : i7;
                            if (i12 < charArray.length) {
                                j = ((long) charArray[i12]) & 65535;
                                i12++;
                            } else {
                                j = 0;
                            }
                            cVar.f673b = j;
                            if (!z) {
                                if (i12 < charArray.length) {
                                    i3 = i12 + 1;
                                    j2 = (((long) charArray[i12]) & 65535) << 16;
                                } else {
                                    i3 = i12;
                                    j2 = 0;
                                }
                                cVar.f673b = j | j2;
                                i12 = i3;
                            }
                            str = strD3;
                            cVar = cVar;
                            charArray = charArray;
                            strArr = strArr;
                            i7 = i12;
                            i = i;
                            bArr = bArr;
                            j4 = j8;
                        } else {
                            if (strArr == null) {
                                if (t1_bW == null) {
                                    t1_bW = c.W(null, strD3, iF3, R$string.number_name, cVar.f672a);
                                }
                                i2 = i7;
                                str = strD3;
                            } else {
                                cVar = cVar;
                                charArray = charArray;
                                strArr = strArr;
                                i = i;
                                bArr = bArr;
                                int length = i4 % strArr.length;
                                str = strArr[length];
                                t1_bW = t1_bArr[length];
                                if (t1_bW == null) {
                                    t1_bW = c.W(null, str, iF3, R$string.number_name, cVar.f672a);
                                    t1_bArr[length] = t1_bW;
                                }
                                i2 = length;
                            }
                            cVar.f(null, t1_bW, str, cVar.f672a, "0", 0);
                            i7 = i2;
                        }
                    }
                    cVar.b(i5);
                    i8++;
                    cVar = new c();
                }
                i4++;
                strArr = strArr;
                strD3 = str;
                mainService3 = mainService2;
                arrayListS3 = arrayListS3;
                charArray = charArray;
                bArrH = bArr;
                i6 = i;
            }
            mainService = mainService3;
            mainService.i.C(this.e0.t3());
            obj = new Object();
            synchronized (obj) {
                n2.i(new Script$editAll$1(this, obj));
                Script.W3(obj);
            }
            return LuaValue.I2(i8);
        } catch (NumberFormatException e4) {
            return LuaValue.K2(Script.V3(e4));
        }
    }

    @Override // android.ext.Script$ApiFunction
    protected boolean d3(Writer writer, int i, LuaValue luaValue) {
        return (i == 2 && luaValue.h1()) ? Script$ApiFunction.g3(writer, this.e0.g0.f372b, luaValue) : super.d3(writer, i, luaValue);
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.editAll(string value, int type) -> count of changed || string with error";
    }
}
