package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
abstract class s0 {
    static int a(String str) {
        if (str != null && str.length() <= 40) {
            int iIndexOf = str.indexOf(10);
            if (iIndexOf >= 0) {
                str = str.substring(0, iIndexOf);
            }
            try {
                return Integer.parseInt(d(str));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    static String b(int i, long j) {
        return i + "\n" + j;
    }

    static boolean c(int i, long j, int i2, long j2) {
        if (i != i2) {
            return false;
        }
        return j <= 0 || j2 <= j;
    }

    private static String d(String str) {
        return str.endsWith("\r") ? str.substring(0, str.length() - 1) : str;
    }

    static long e(String str) {
        int iIndexOf;
        if (str == null || str.length() > 40 || (iIndexOf = str.indexOf(10)) < 0) {
            return -1L;
        }
        try {
            return Long.parseLong(d(str.substring(iIndexOf + 1)));
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }
}
