package b;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class b {

    public interface a {
        java.lang.Object a(org.xmlpull.v1.XmlPullParser r1, java.lang.String r2);
    }

    public static final java.util.HashMap a(java.io.InputStream r2) {
            org.xmlpull.v1.XmlPullParser r0 = android.util.Xml.newPullParser()
            java.lang.String r1 = "UTF-8"
            r0.setInput(r2, r1)
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object r2 = l(r0, r2)
            java.util.HashMap r2 = (java.util.HashMap) r2
            return r2
    }

    private static final boolean[] b(org.xmlpull.v1.XmlPullParser r5, java.lang.String r6, java.lang.String[] r7) {
            java.lang.String r7 = "num"
            r0 = 0
            java.lang.String r7 = r5.getAttributeValue(r0, r7)     // Catch: java.lang.NumberFormatException -> Lc3 java.lang.NullPointerException -> Lcb
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> Lc3 java.lang.NullPointerException -> Lcb
            r5.next()
            boolean[] r7 = new boolean[r7]
            int r1 = r5.getEventType()
            r2 = 0
        L15:
            r3 = 2
            java.lang.String r4 = "item"
            if (r1 != r3) goto L60
            java.lang.String r1 = r5.getName()
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L45
            java.lang.String r1 = "value"
            java.lang.String r1 = r5.getAttributeValue(r0, r1)     // Catch: java.lang.NumberFormatException -> L35 java.lang.NullPointerException -> L3d
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L35 java.lang.NullPointerException -> L3d
            boolean r1 = r1.booleanValue()     // Catch: java.lang.NumberFormatException -> L35 java.lang.NullPointerException -> L3d
            r7[r2] = r1     // Catch: java.lang.NumberFormatException -> L35 java.lang.NullPointerException -> L3d
            goto L9e
        L35:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r6 = "Not a number in value attribute in item"
            r5.<init>(r6)
            throw r5
        L3d:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r6 = "Need value attribute in item"
            r5.<init>(r6)
            throw r5
        L45:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Expected item tag at: "
            r7.append(r0)
            java.lang.String r5 = r5.getName()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L60:
            r3 = 3
            if (r1 != r3) goto L9e
            java.lang.String r1 = r5.getName()
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L6e
            return r7
        L6e:
            java.lang.String r1 = r5.getName()
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L7b
            int r2 = r2 + 1
            goto L9e
        L7b:
            org.xmlpull.v1.XmlPullParserException r7 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = " end tag at: "
            r0.append(r6)
            java.lang.String r5 = r5.getName()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r7.<init>(r5)
            throw r7
        L9e:
            int r1 = r5.next()
            r3 = 1
            if (r1 == r3) goto La7
            goto L15
        La7:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Document ended before "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = " end tag"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        Lc3:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r6 = "Not a number in num attribute in string-array"
            r5.<init>(r6)
            throw r5
        Lcb:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r6 = "Need num attribute in string-array"
            r5.<init>(r6)
            throw r5
    }

    private static final double[] c(org.xmlpull.v1.XmlPullParser r5, java.lang.String r6, java.lang.String[] r7) {
            java.lang.String r7 = "num"
            r0 = 0
            java.lang.String r7 = r5.getAttributeValue(r0, r7)     // Catch: java.lang.NumberFormatException -> Lbf java.lang.NullPointerException -> Lc7
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> Lbf java.lang.NullPointerException -> Lc7
            r5.next()
            double[] r7 = new double[r7]
            int r1 = r5.getEventType()
            r2 = 0
        L15:
            r3 = 2
            java.lang.String r4 = "item"
            if (r1 != r3) goto L5c
            java.lang.String r1 = r5.getName()
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L41
            java.lang.String r1 = "value"
            java.lang.String r1 = r5.getAttributeValue(r0, r1)     // Catch: java.lang.NumberFormatException -> L31 java.lang.NullPointerException -> L39
            double r3 = java.lang.Double.parseDouble(r1)     // Catch: java.lang.NumberFormatException -> L31 java.lang.NullPointerException -> L39
            r7[r2] = r3     // Catch: java.lang.NumberFormatException -> L31 java.lang.NullPointerException -> L39
            goto L9a
        L31:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r6 = "Not a number in value attribute in item"
            r5.<init>(r6)
            throw r5
        L39:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r6 = "Need value attribute in item"
            r5.<init>(r6)
            throw r5
        L41:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Expected item tag at: "
            r7.append(r0)
            java.lang.String r5 = r5.getName()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L5c:
            r3 = 3
            if (r1 != r3) goto L9a
            java.lang.String r1 = r5.getName()
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L6a
            return r7
        L6a:
            java.lang.String r1 = r5.getName()
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L77
            int r2 = r2 + 1
            goto L9a
        L77:
            org.xmlpull.v1.XmlPullParserException r7 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = " end tag at: "
            r0.append(r6)
            java.lang.String r5 = r5.getName()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r7.<init>(r5)
            throw r7
        L9a:
            int r1 = r5.next()
            r3 = 1
            if (r1 == r3) goto La3
            goto L15
        La3:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Document ended before "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = " end tag"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        Lbf:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r6 = "Not a number in num attribute in double-array"
            r5.<init>(r6)
            throw r5
        Lc7:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r6 = "Need num attribute in double-array"
            r5.<init>(r6)
            throw r5
    }

    private static final int[] d(org.xmlpull.v1.XmlPullParser r5, java.lang.String r6, java.lang.String[] r7) {
            java.lang.String r7 = "num"
            r0 = 0
            java.lang.String r7 = r5.getAttributeValue(r0, r7)     // Catch: java.lang.NumberFormatException -> Lbf java.lang.NullPointerException -> Lc7
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> Lbf java.lang.NullPointerException -> Lc7
            r5.next()
            int[] r7 = new int[r7]
            int r1 = r5.getEventType()
            r2 = 0
        L15:
            r3 = 2
            java.lang.String r4 = "item"
            if (r1 != r3) goto L5c
            java.lang.String r1 = r5.getName()
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L41
            java.lang.String r1 = "value"
            java.lang.String r1 = r5.getAttributeValue(r0, r1)     // Catch: java.lang.NumberFormatException -> L31 java.lang.NullPointerException -> L39
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L31 java.lang.NullPointerException -> L39
            r7[r2] = r1     // Catch: java.lang.NumberFormatException -> L31 java.lang.NullPointerException -> L39
            goto L9a
        L31:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r6 = "Not a number in value attribute in item"
            r5.<init>(r6)
            throw r5
        L39:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r6 = "Need value attribute in item"
            r5.<init>(r6)
            throw r5
        L41:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Expected item tag at: "
            r7.append(r0)
            java.lang.String r5 = r5.getName()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L5c:
            r3 = 3
            if (r1 != r3) goto L9a
            java.lang.String r1 = r5.getName()
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L6a
            return r7
        L6a:
            java.lang.String r1 = r5.getName()
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L77
            int r2 = r2 + 1
            goto L9a
        L77:
            org.xmlpull.v1.XmlPullParserException r7 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = " end tag at: "
            r0.append(r6)
            java.lang.String r5 = r5.getName()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r7.<init>(r5)
            throw r7
        L9a:
            int r1 = r5.next()
            r3 = 1
            if (r1 == r3) goto La3
            goto L15
        La3:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Document ended before "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = " end tag"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        Lbf:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r6 = "Not a number in num attribute in byte-array"
            r5.<init>(r6)
            throw r5
        Lc7:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r6 = "Need num attribute in byte-array"
            r5.<init>(r6)
            throw r5
    }

    private static final java.util.ArrayList e(org.xmlpull.v1.XmlPullParser r3, java.lang.String r4, java.lang.String[] r5, b.b.a r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r3.getEventType()
        L9:
            r2 = 2
            if (r1 != r2) goto L14
            java.lang.Object r1 = k(r3, r5, r6)
            r0.add(r1)
            goto L45
        L14:
            r2 = 3
            if (r1 != r2) goto L45
            java.lang.String r5 = r3.getName()
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L22
            return r0
        L22:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Expected "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = " end tag at: "
            r6.append(r4)
            java.lang.String r3 = r3.getName()
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r5.<init>(r3)
            throw r5
        L45:
            int r1 = r3.next()
            r2 = 1
            if (r1 == r2) goto L4d
            goto L9
        L4d:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Document ended before "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = " end tag"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
    }

    private static final long[] f(org.xmlpull.v1.XmlPullParser r5, java.lang.String r6, java.lang.String[] r7) {
            java.lang.String r7 = "num"
            r0 = 0
            java.lang.String r7 = r5.getAttributeValue(r0, r7)     // Catch: java.lang.NumberFormatException -> Lbf java.lang.NullPointerException -> Lc7
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> Lbf java.lang.NullPointerException -> Lc7
            r5.next()
            long[] r7 = new long[r7]
            int r1 = r5.getEventType()
            r2 = 0
        L15:
            r3 = 2
            java.lang.String r4 = "item"
            if (r1 != r3) goto L5c
            java.lang.String r1 = r5.getName()
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L41
            java.lang.String r1 = "value"
            java.lang.String r1 = r5.getAttributeValue(r0, r1)     // Catch: java.lang.NumberFormatException -> L31 java.lang.NullPointerException -> L39
            long r3 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L31 java.lang.NullPointerException -> L39
            r7[r2] = r3     // Catch: java.lang.NumberFormatException -> L31 java.lang.NullPointerException -> L39
            goto L9a
        L31:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r6 = "Not a number in value attribute in item"
            r5.<init>(r6)
            throw r5
        L39:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r6 = "Need value attribute in item"
            r5.<init>(r6)
            throw r5
        L41:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Expected item tag at: "
            r7.append(r0)
            java.lang.String r5 = r5.getName()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L5c:
            r3 = 3
            if (r1 != r3) goto L9a
            java.lang.String r1 = r5.getName()
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L6a
            return r7
        L6a:
            java.lang.String r1 = r5.getName()
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L77
            int r2 = r2 + 1
            goto L9a
        L77:
            org.xmlpull.v1.XmlPullParserException r7 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = " end tag at: "
            r0.append(r6)
            java.lang.String r5 = r5.getName()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r7.<init>(r5)
            throw r7
        L9a:
            int r1 = r5.next()
            r3 = 1
            if (r1 == r3) goto La3
            goto L15
        La3:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Document ended before "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = " end tag"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        Lbf:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r6 = "Not a number in num attribute in long-array"
            r5.<init>(r6)
            throw r5
        Lc7:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r6 = "Need num attribute in long-array"
            r5.<init>(r6)
            throw r5
    }

    private static final java.util.HashMap g(org.xmlpull.v1.XmlPullParser r3, java.lang.String r4, java.lang.String[] r5, b.b.a r6) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r3.getEventType()
        L9:
            r2 = 2
            if (r1 != r2) goto L17
            java.lang.Object r1 = k(r3, r5, r6)
            r2 = 0
            r2 = r5[r2]
            r0.put(r2, r1)
            goto L48
        L17:
            r2 = 3
            if (r1 != r2) goto L48
            java.lang.String r5 = r3.getName()
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L25
            return r0
        L25:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Expected "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = " end tag at: "
            r6.append(r4)
            java.lang.String r3 = r3.getName()
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r5.<init>(r3)
            throw r5
        L48:
            int r1 = r3.next()
            r2 = 1
            if (r1 == r2) goto L50
            goto L9
        L50:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Document ended before "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = " end tag"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
    }

    private static final java.lang.Object h(org.xmlpull.v1.XmlPullParser r4, java.lang.String r5) {
            r0 = 62
            java.lang.String r1 = "int"
            boolean r1 = r5.equals(r1)     // Catch: java.lang.NumberFormatException -> L5f java.lang.NullPointerException -> L79
            java.lang.String r2 = "value"
            r3 = 0
            if (r1 == 0) goto L1a
            java.lang.String r4 = r4.getAttributeValue(r3, r2)     // Catch: java.lang.NumberFormatException -> L5f java.lang.NullPointerException -> L79
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L5f java.lang.NullPointerException -> L79
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L5f java.lang.NullPointerException -> L79
            return r4
        L1a:
            java.lang.String r1 = "long"
            boolean r1 = r5.equals(r1)     // Catch: java.lang.NumberFormatException -> L5f java.lang.NullPointerException -> L79
            if (r1 == 0) goto L2b
            java.lang.String r4 = r4.getAttributeValue(r3, r2)     // Catch: java.lang.NumberFormatException -> L5f java.lang.NullPointerException -> L79
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L5f java.lang.NullPointerException -> L79
            return r4
        L2b:
            java.lang.String r1 = "float"
            boolean r1 = r5.equals(r1)     // Catch: java.lang.NumberFormatException -> L5f java.lang.NullPointerException -> L79
            if (r1 == 0) goto L3c
            java.lang.String r4 = r4.getAttributeValue(r3, r2)     // Catch: java.lang.NumberFormatException -> L5f java.lang.NullPointerException -> L79
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L5f java.lang.NullPointerException -> L79
            return r4
        L3c:
            java.lang.String r1 = "double"
            boolean r1 = r5.equals(r1)     // Catch: java.lang.NumberFormatException -> L5f java.lang.NullPointerException -> L79
            if (r1 == 0) goto L4d
            java.lang.String r4 = r4.getAttributeValue(r3, r2)     // Catch: java.lang.NumberFormatException -> L5f java.lang.NullPointerException -> L79
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L5f java.lang.NullPointerException -> L79
            return r4
        L4d:
            java.lang.String r1 = "boolean"
            boolean r1 = r5.equals(r1)     // Catch: java.lang.NumberFormatException -> L5f java.lang.NullPointerException -> L79
            if (r1 == 0) goto L5e
            java.lang.String r4 = r4.getAttributeValue(r3, r2)     // Catch: java.lang.NumberFormatException -> L5f java.lang.NullPointerException -> L79
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L5f java.lang.NullPointerException -> L79
            return r4
        L5e:
            return r3
        L5f:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Not a number in value attribute in <"
            r1.append(r2)
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            r4.<init>(r5)
            throw r4
        L79:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Need value attribute in <"
            r1.append(r2)
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            r4.<init>(r5)
            throw r4
    }

    private static final java.util.HashSet i(org.xmlpull.v1.XmlPullParser r3, java.lang.String r4, java.lang.String[] r5, b.b.a r6) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r1 = r3.getEventType()
        L9:
            r2 = 2
            if (r1 != r2) goto L14
            java.lang.Object r1 = k(r3, r5, r6)
            r0.add(r1)
            goto L45
        L14:
            r2 = 3
            if (r1 != r2) goto L45
            java.lang.String r5 = r3.getName()
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L22
            return r0
        L22:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Expected "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = " end tag at: "
            r6.append(r4)
            java.lang.String r3 = r3.getName()
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r5.<init>(r3)
            throw r5
        L45:
            int r1 = r3.next()
            r2 = 1
            if (r1 == r2) goto L4d
            goto L9
        L4d:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Document ended before "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = " end tag"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
    }

    private static final java.lang.String[] j(org.xmlpull.v1.XmlPullParser r5, java.lang.String r6, java.lang.String[] r7) {
            java.lang.String r7 = "num"
            r0 = 0
            java.lang.String r7 = r5.getAttributeValue(r0, r7)     // Catch: java.lang.NumberFormatException -> Lbb java.lang.NullPointerException -> Lc3
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> Lbb java.lang.NullPointerException -> Lc3
            r5.next()
            java.lang.String[] r7 = new java.lang.String[r7]
            int r1 = r5.getEventType()
            r2 = 0
        L15:
            r3 = 2
            java.lang.String r4 = "item"
            if (r1 != r3) goto L58
            java.lang.String r1 = r5.getName()
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L3d
            java.lang.String r1 = "value"
            java.lang.String r1 = r5.getAttributeValue(r0, r1)     // Catch: java.lang.NumberFormatException -> L2d java.lang.NullPointerException -> L35
            r7[r2] = r1     // Catch: java.lang.NumberFormatException -> L2d java.lang.NullPointerException -> L35
            goto L96
        L2d:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r6 = "Not a number in value attribute in item"
            r5.<init>(r6)
            throw r5
        L35:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r6 = "Need value attribute in item"
            r5.<init>(r6)
            throw r5
        L3d:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Expected item tag at: "
            r7.append(r0)
            java.lang.String r5 = r5.getName()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L58:
            r3 = 3
            if (r1 != r3) goto L96
            java.lang.String r1 = r5.getName()
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L66
            return r7
        L66:
            java.lang.String r1 = r5.getName()
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L73
            int r2 = r2 + 1
            goto L96
        L73:
            org.xmlpull.v1.XmlPullParserException r7 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = " end tag at: "
            r0.append(r6)
            java.lang.String r5 = r5.getName()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r7.<init>(r5)
            throw r7
        L96:
            int r1 = r5.next()
            r3 = 1
            if (r1 == r3) goto L9f
            goto L15
        L9f:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Document ended before "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = " end tag"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        Lbb:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r6 = "Not a number in num attribute in string-array"
            r5.<init>(r6)
            throw r5
        Lc3:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r6 = "Need num attribute in string-array"
            r5.<init>(r6)
            throw r5
    }

    private static final java.lang.Object k(org.xmlpull.v1.XmlPullParser r9, java.lang.String[] r10, b.b.a r11) {
            java.lang.String r0 = "name"
            r1 = 0
            java.lang.String r0 = r9.getAttributeValue(r1, r0)
            java.lang.String r2 = r9.getName()
            java.lang.String r3 = "null"
            boolean r3 = r2.equals(r3)
            r4 = 2
            r5 = 4
            r6 = 3
            r7 = 1
            r8 = 0
            if (r3 == 0) goto L1a
            goto L96
        L1a:
            java.lang.String r1 = "string"
            boolean r3 = r2.equals(r1)
            if (r3 == 0) goto L90
            java.lang.String r11 = ""
        L24:
            int r2 = r9.next()
            if (r2 == r7) goto L88
            if (r2 != r6) goto L54
            java.lang.String r2 = r9.getName()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L39
            r10[r8] = r0
            return r11
        L39:
            org.xmlpull.v1.XmlPullParserException r10 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Unexpected end tag in <string>: "
            r11.append(r0)
            java.lang.String r9 = r9.getName()
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.<init>(r9)
            throw r10
        L54:
            if (r2 != r5) goto L6a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            java.lang.String r11 = r9.getText()
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            goto L24
        L6a:
            if (r2 == r4) goto L6d
            goto L24
        L6d:
            org.xmlpull.v1.XmlPullParserException r10 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Unexpected start tag in <string>: "
            r11.append(r0)
            java.lang.String r9 = r9.getName()
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.<init>(r9)
            throw r10
        L88:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r10 = "Unexpected end of document in <string>"
            r9.<init>(r10)
            throw r9
        L90:
            java.lang.Object r1 = h(r9, r2)
            if (r1 == 0) goto L131
        L96:
            int r11 = r9.next()
            if (r11 == r7) goto L115
            java.lang.String r3 = ">: "
            if (r11 != r6) goto Lce
            java.lang.String r11 = r9.getName()
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto Lad
            r10[r8] = r0
            return r1
        Lad:
            org.xmlpull.v1.XmlPullParserException r10 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Unexpected end tag in <"
            r11.append(r0)
            r11.append(r2)
            r11.append(r3)
            java.lang.String r9 = r9.getName()
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.<init>(r9)
            throw r10
        Lce:
            if (r11 == r5) goto Lf4
            if (r11 == r4) goto Ld3
            goto L96
        Ld3:
            org.xmlpull.v1.XmlPullParserException r10 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Unexpected start tag in <"
            r11.append(r0)
            r11.append(r2)
            r11.append(r3)
            java.lang.String r9 = r9.getName()
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.<init>(r9)
            throw r10
        Lf4:
            org.xmlpull.v1.XmlPullParserException r10 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Unexpected text in <"
            r11.append(r0)
            r11.append(r2)
            r11.append(r3)
            java.lang.String r9 = r9.getName()
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.<init>(r9)
            throw r10
        L115:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Unexpected end of document in <"
            r10.append(r11)
            r10.append(r2)
            r11 = 62
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L131:
            java.lang.String r1 = "int-array"
            boolean r3 = r2.equals(r1)
            if (r3 == 0) goto L140
            int[] r9 = d(r9, r1, r10)
            r10[r8] = r0
            return r9
        L140:
            java.lang.String r1 = "long-array"
            boolean r3 = r2.equals(r1)
            if (r3 == 0) goto L14f
            long[] r9 = f(r9, r1, r10)
            r10[r8] = r0
            return r9
        L14f:
            java.lang.String r1 = "double-array"
            boolean r3 = r2.equals(r1)
            if (r3 == 0) goto L15e
            double[] r9 = c(r9, r1, r10)
            r10[r8] = r0
            return r9
        L15e:
            java.lang.String r1 = "string-array"
            boolean r3 = r2.equals(r1)
            if (r3 == 0) goto L16d
            java.lang.String[] r9 = j(r9, r1, r10)
            r10[r8] = r0
            return r9
        L16d:
            java.lang.String r1 = "boolean-array"
            boolean r3 = r2.equals(r1)
            if (r3 == 0) goto L17c
            boolean[] r9 = b(r9, r1, r10)
            r10[r8] = r0
            return r9
        L17c:
            java.lang.String r1 = "map"
            boolean r3 = r2.equals(r1)
            if (r3 == 0) goto L18e
            r9.next()
            java.util.HashMap r9 = g(r9, r1, r10, r11)
            r10[r8] = r0
            return r9
        L18e:
            java.lang.String r1 = "list"
            boolean r3 = r2.equals(r1)
            if (r3 == 0) goto L1a0
            r9.next()
            java.util.ArrayList r9 = e(r9, r1, r10, r11)
            r10[r8] = r0
            return r9
        L1a0:
            java.lang.String r1 = "set"
            boolean r3 = r2.equals(r1)
            if (r3 == 0) goto L1b2
            r9.next()
            java.util.HashSet r9 = i(r9, r1, r10, r11)
            r10[r8] = r0
            return r9
        L1b2:
            if (r11 == 0) goto L1bb
            java.lang.Object r9 = r11.a(r9, r2)
            r10[r8] = r0
            return r9
        L1bb:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Unknown tag: "
            r10.append(r11)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    private static final java.lang.Object l(org.xmlpull.v1.XmlPullParser r2, java.lang.String[] r3) {
            int r0 = r2.getEventType()
        L4:
            r1 = 2
            if (r0 != r1) goto Ld
            r0 = 0
            java.lang.Object r2 = k(r2, r3, r0)
            return r2
        Ld:
            r1 = 3
            if (r0 == r1) goto L3e
            r1 = 4
            if (r0 == r1) goto L23
            int r0 = r2.next()
            r1 = 1
            if (r0 == r1) goto L1b
            goto L4
        L1b:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r3 = "Unexpected end of document"
            r2.<init>(r3)
            throw r2
        L23:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected text: "
            r0.append(r1)
            java.lang.String r2 = r2.getText()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L3e:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected end tag at: "
            r0.append(r1)
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }
}
