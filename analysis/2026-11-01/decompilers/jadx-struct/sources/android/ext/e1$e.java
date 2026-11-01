package android.ext;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class e1$e {
    public static int a(String str, String str2) {
        return f(2, str, str2, null);
    }

    public static int b(String str, String str2, Throwable th) {
        return f(3, str, str2, th);
    }

    public static int c(String str, String str2) {
        return f(9, str, str2, null);
    }

    public static int d(String str, String str2, Throwable th) {
        return f(10, str, str2, th);
    }

    private static String e(String str) {
        if (str == null) {
            return "null";
        }
        return str.length() > 23 ? str.substring(0, 23) : str;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static int f(int i, String str, String str2, Throwable th) {
        String strE = e(str);
        if (str2 == null) {
            str2 = "null";
        }
        int length = str2.length();
        int i2 = 0;
        while (true) {
            int i3 = length - i2;
            if (i3 > 1023) {
                i3 = 1023;
            }
            int i4 = i3 + i2;
            String strSubstring = str2.substring(i2, i4);
            if (i == 2) {
                try {
                    Log.e(strE, strSubstring);
                } catch (OutOfMemoryError unused) {
                    Log.e(strE, "OOM for Log 1");
                }
            } else if (i != 3) {
                if (i == 6) {
                    Log.e(strE, strSubstring);
                } else if (i != 7) {
                    if (i == 9) {
                        Log.e(strE, strSubstring);
                    } else if (i == 10) {
                        if (i4 == length) {
                            try {
                                Log.e(strE, strSubstring, th);
                            } catch (OutOfMemoryError unused2) {
                                Log.e(strE, strSubstring);
                            }
                        } else {
                            Log.e(strE, strSubstring);
                        }
                    }
                } else if (i4 == length) {
                    Log.e(strE, strSubstring, th);
                } else {
                    Log.e(strE, strSubstring);
                }
            } else if (i4 == length) {
                Log.e(strE, strSubstring, th);
            } else {
                Log.e(strE, strSubstring);
            }
            if (i4 >= length) {
                return 0;
            }
            i2 = i4;
        }
    }

    public static int g(String str, String str2) {
        return f(6, str, str2, null);
    }

    public static int h(String str, String str2, Throwable th) {
        return f(7, str, str2, th);
    }
}
