import io, re, sys
p = 'app/src/rebuild/java/android/ext/ConfigListAdapter.java'
s = io.open(p, encoding='utf-8').read()
start = s.index('    static void e() {')
end = s.index('    private static void f() {')
new_e = '''    static void e() {
        MainService mainService = MainService.instance;
        if (mainService == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        mainService.l.getDefaultDisplay().getMetrics(displayMetrics);
        Resources resources = MainService.context.getResources();
        Configuration configuration = resources.getConfiguration();
        AssetManager assets = resources.getAssets();
        String[] strArrE = android.ext.k.e();
        Arrays.sort(strArrE, new q());
        String strF = b2.f(R.string.lang_code);
        long jCurrentTimeMillis = System.currentTimeMillis();
        int length = strArrE.length;
        int i4 = 0;
        int size = -1;
        for (int i5 = 0; i5 < length; i5++) {
            String str3 = strArrE[i5];
            int i6 = i4 + 1;
            i4 = i6;
            if (str3 == null) {
                continue;
            }
            String str = str3.length() == 0 ? "en_US" : str3;
            if (str3.length() == 0) {
                "en_US".replace('_', '-');
            }
            try {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (jCurrentTimeMillis2 - jCurrentTimeMillis > 2000) {
                    Tools.K1(((i6 * 100) / strArrE.length) + "%", 0);
                    jCurrentTimeMillis = jCurrentTimeMillis2;
                }
                Locale localeD = android.ext.k.d(str);
                String strG = g(configuration, localeD, assets, displayMetrics);
                if (map.get(strG) != null) {
                    continue;
                }
                if (strG.startsWith(strF) && size == -1) {
                    size = arrayList.size();
                }
                String str2 = "";
                try {
                    str2 = String.format(localeD, "\n[%,.1f | %.2e]", Double.valueOf(-1234.0d), Double.valueOf(-4.56E-78d));
                } catch (Throwable th3) {
                    e1.a(th3);
                }
                map.put(strG, str);
                arrayList.add(str);
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) localeD.getDisplayName(localeD));
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(z1.d.s), 0, spannableStringBuilder.length(), 33);
                    int length2 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) " (");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.append(')');
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(z1.d.r), length2, spannableStringBuilder.length(), 33);
                    int length3 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) str2);
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6f), length3, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(z1.d.t), length3, spannableStringBuilder.length(), 33);
                    arrayList2.add(spannableStringBuilder);
                } catch (Throwable th4) {
                    e1.a(th4);
                    arrayList2.add(localeD.getDisplayName(localeD) + " (" + str + ')' + str2);
                }
            } catch (Throwable th) {
                e1.l("Failed check locale: " + str, th);
            }
        }
        g(configuration, android.ext.k.d(android.ext.k.b()), assets, displayMetrics);
        android.ext.k.g();
        n2.i(new r(new ArrayAdapter(MainService.context, arrayList2), size, arrayList));
    }

'''
s = s[:start] + new_e + s[end:]
start = s.index('    public static boolean k() {')
end = s.index('    static void m() {')
new_k = '''    public static boolean k() {
        boolean z2 = false;
        try {
            String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
            boolean z3 = strArr != null && strArr.length > 0;
            try {
                FileInputStream fileInputStream = new FileInputStream("/proc/self/auxv");
                byte[] bArr = new byte[4096];
                int i2 = fileInputStream.read(bArr);
                fileInputStream.close();
                if (i2 <= 0) {
                    return z3;
                }
                if (i2 % 16 == 8) {
                    return false;
                }
                for (int i3 = 0; i3 < i2; i3 += 16) {
                    if (bArr[i3 + 4] != 0 || bArr[i3 + 5] != 0 || bArr[i3 + 6] != 0 || bArr[i3 + 7] != 0) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                z2 = z3;
                e1.s("Failed check 64 client. Used: " + z2, th);
                return z2;
            }
        } catch (Throwable th2) {
            e1.s("Failed check 64 client. Used: " + z2, th2);
            return z2;
        }
    }

'''
s = s[:start] + new_k + s[end:]
io.open(p, 'w', encoding='utf-8').write(s)
print('ok', len(s))
