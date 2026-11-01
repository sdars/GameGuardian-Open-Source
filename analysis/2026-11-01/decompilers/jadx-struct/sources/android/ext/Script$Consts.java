package android.ext;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
class Script$Consts {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Script$Const[] f371a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Script$Const[] f372b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Script$Const[] f373c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Script$Const[] f374d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Script$Const[] f375e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Script$Const[] f376f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Script$Const[] f377g = null;
    Script$Const[] h = null;
    Script$Const[] i = null;
    Script$Const[] j = null;

    Script$Consts() {
    }

    static boolean a(Writer writer, Script$Const[] script$ConstArr, int i) {
        try {
            boolean z = true;
            for (Script$Const script$Const : script$ConstArr) {
                int i2 = script$Const.f370b;
                if ((i & i2) == i2) {
                    writer.write(script$Const.f369a);
                    i &= ~i2;
                    if (i != 0) {
                        writer.write(" | ");
                    }
                    z = false;
                }
            }
            if (z || i != 0) {
                writer.write(Integer.toString(i));
            }
            return true;
        } catch (IOException e2) {
            e1.s("Writer fail", e2);
            return false;
        }
    }

    static boolean b(Writer writer, long j) {
        String string;
        try {
            if (j == 0 || j == -1) {
                string = Long.toString(j);
            } else {
                writer.write("0x");
                string = Long.toHexString(j);
            }
            writer.write(string);
            return true;
        } catch (IOException e2) {
            e1.s("Writer fail", e2);
            return false;
        }
    }

    static boolean c(Writer writer, String str) {
        return d(writer, Script.E3(str));
    }

    static boolean d(Writer writer, String str) {
        try {
            writer.write("\"");
            if (str.length() <= 65535) {
                str = str.replace("\"", "\\\"");
            }
            writer.write(str);
            writer.write("\"");
            return true;
        } catch (IOException e2) {
            e1.s("Writer fail", e2);
            return false;
        }
    }
}
