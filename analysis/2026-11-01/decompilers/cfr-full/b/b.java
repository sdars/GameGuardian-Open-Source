/*
 * Decompiled with CFR 0.152.
 */
package b;

import android.util.Xml;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public abstract class b {
    public static final HashMap a(InputStream inputStream) {
        XmlPullParser xmlPullParser = Xml.newPullParser();
        xmlPullParser.setInput(inputStream, "UTF-8");
        return (HashMap)b.l(xmlPullParser, new String[1]);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final boolean[] b(XmlPullParser object, String charSequence, String[] object2) {
        int n3;
        try {
            n3 = Integer.parseInt(object.getAttributeValue(null, "num"));
        }
        catch (NumberFormatException numberFormatException) {
            throw new XmlPullParserException("Not a number in num attribute in string-array");
        }
        catch (NullPointerException nullPointerException) {
            throw new XmlPullParserException("Need num attribute in string-array");
        }
        object.next();
        object2 = new boolean[n3];
        int n4 = object.getEventType();
        int n5 = 0;
        while (true) {
            if (n4 == 2) {
                if (!object.getName().equals("item")) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("Expected item tag at: ");
                    ((StringBuilder)charSequence).append(object.getName());
                    throw new XmlPullParserException(((StringBuilder)charSequence).toString());
                }
                try {
                    object2[n5] = (String)((Object)Boolean.valueOf(object.getAttributeValue(null, "value")));
                    n3 = n5;
                }
                catch (NumberFormatException numberFormatException) {
                    throw new XmlPullParserException("Not a number in value attribute in item");
                }
                catch (NullPointerException nullPointerException) {
                    throw new XmlPullParserException("Need value attribute in item");
                }
            } else {
                n3 = n5;
                if (n4 == 3) {
                    if (object.getName().equals(charSequence)) {
                        return object2;
                    }
                    if (!object.getName().equals("item")) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Expected ");
                        ((StringBuilder)object2).append((String)charSequence);
                        ((StringBuilder)object2).append(" end tag at: ");
                        ((StringBuilder)object2).append(object.getName());
                        throw new XmlPullParserException(((StringBuilder)object2).toString());
                    }
                    n3 = n5 + 1;
                }
            }
            n4 = object.next();
            if (n4 == 1) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Document ended before ");
                ((StringBuilder)object).append((String)charSequence);
                ((StringBuilder)object).append(" end tag");
                throw new XmlPullParserException(((StringBuilder)object).toString());
            }
            n5 = n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final double[] c(XmlPullParser object, String charSequence, String[] object2) {
        int n3;
        try {
            n3 = Integer.parseInt(object.getAttributeValue(null, "num"));
        }
        catch (NumberFormatException numberFormatException) {
            throw new XmlPullParserException("Not a number in num attribute in double-array");
        }
        catch (NullPointerException nullPointerException) {
            throw new XmlPullParserException("Need num attribute in double-array");
        }
        object.next();
        object2 = new double[n3];
        int n4 = object.getEventType();
        int n5 = 0;
        while (true) {
            if (n4 == 2) {
                if (!object.getName().equals("item")) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("Expected item tag at: ");
                    ((StringBuilder)charSequence).append(object.getName());
                    throw new XmlPullParserException(((StringBuilder)charSequence).toString());
                }
                try {
                    object2[n5] = (String)Double.parseDouble(object.getAttributeValue(null, "value"));
                    n3 = n5;
                }
                catch (NumberFormatException numberFormatException) {
                    throw new XmlPullParserException("Not a number in value attribute in item");
                }
                catch (NullPointerException nullPointerException) {
                    throw new XmlPullParserException("Need value attribute in item");
                }
            } else {
                n3 = n5;
                if (n4 == 3) {
                    if (object.getName().equals(charSequence)) {
                        return object2;
                    }
                    if (!object.getName().equals("item")) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Expected ");
                        ((StringBuilder)object2).append((String)charSequence);
                        ((StringBuilder)object2).append(" end tag at: ");
                        ((StringBuilder)object2).append(object.getName());
                        throw new XmlPullParserException(((StringBuilder)object2).toString());
                    }
                    n3 = n5 + 1;
                }
            }
            n4 = object.next();
            if (n4 == 1) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Document ended before ");
                ((StringBuilder)object).append((String)charSequence);
                ((StringBuilder)object).append(" end tag");
                throw new XmlPullParserException(((StringBuilder)object).toString());
            }
            n5 = n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final int[] d(XmlPullParser object, String charSequence, String[] object2) {
        int n3;
        try {
            n3 = Integer.parseInt(object.getAttributeValue(null, "num"));
        }
        catch (NumberFormatException numberFormatException) {
            throw new XmlPullParserException("Not a number in num attribute in byte-array");
        }
        catch (NullPointerException nullPointerException) {
            throw new XmlPullParserException("Need num attribute in byte-array");
        }
        object.next();
        object2 = new int[n3];
        int n4 = object.getEventType();
        n3 = 0;
        while (true) {
            int n5;
            if (n4 == 2) {
                if (!object.getName().equals("item")) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("Expected item tag at: ");
                    ((StringBuilder)charSequence).append(object.getName());
                    throw new XmlPullParserException(((StringBuilder)charSequence).toString());
                }
                try {
                    object2[n3] = (String)Integer.parseInt(object.getAttributeValue(null, "value"));
                    n5 = n3;
                }
                catch (NumberFormatException numberFormatException) {
                    throw new XmlPullParserException("Not a number in value attribute in item");
                }
                catch (NullPointerException nullPointerException) {
                    throw new XmlPullParserException("Need value attribute in item");
                }
            } else {
                n5 = n3;
                if (n4 == 3) {
                    if (object.getName().equals(charSequence)) {
                        return object2;
                    }
                    if (!object.getName().equals("item")) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Expected ");
                        ((StringBuilder)object2).append((String)charSequence);
                        ((StringBuilder)object2).append(" end tag at: ");
                        ((StringBuilder)object2).append(object.getName());
                        throw new XmlPullParserException(((StringBuilder)object2).toString());
                    }
                    n5 = n3 + 1;
                }
            }
            n4 = object.next();
            if (n4 == 1) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Document ended before ");
                ((StringBuilder)object).append((String)charSequence);
                ((StringBuilder)object).append(" end tag");
                throw new XmlPullParserException(((StringBuilder)object).toString());
            }
            n3 = n5;
        }
    }

    private static final ArrayList e(XmlPullParser object, String string2, String[] object2, a a4) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n3 = object.getEventType();
        do {
            if (n3 == 2) {
                arrayList.add(b.k((XmlPullParser)object, (String[])object2, a4));
            } else if (n3 == 3) {
                if (object.getName().equals(string2)) {
                    return arrayList;
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Expected ");
                ((StringBuilder)object2).append(string2);
                ((StringBuilder)object2).append(" end tag at: ");
                ((StringBuilder)object2).append(object.getName());
                throw new XmlPullParserException(((StringBuilder)object2).toString());
            }
            n3 = object.next();
        } while (n3 != 1);
        object = new StringBuilder();
        ((StringBuilder)object).append("Document ended before ");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(" end tag");
        throw new XmlPullParserException(((StringBuilder)object).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final long[] f(XmlPullParser object, String charSequence, String[] object2) {
        int n3;
        try {
            n3 = Integer.parseInt(object.getAttributeValue(null, "num"));
        }
        catch (NumberFormatException numberFormatException) {
            throw new XmlPullParserException("Not a number in num attribute in long-array");
        }
        catch (NullPointerException nullPointerException) {
            throw new XmlPullParserException("Need num attribute in long-array");
        }
        object.next();
        object2 = new long[n3];
        int n4 = object.getEventType();
        int n5 = 0;
        while (true) {
            if (n4 == 2) {
                if (!object.getName().equals("item")) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("Expected item tag at: ");
                    ((StringBuilder)charSequence).append(object.getName());
                    throw new XmlPullParserException(((StringBuilder)charSequence).toString());
                }
                try {
                    object2[n5] = (String)Long.parseLong(object.getAttributeValue(null, "value"));
                    n3 = n5;
                }
                catch (NumberFormatException numberFormatException) {
                    throw new XmlPullParserException("Not a number in value attribute in item");
                }
                catch (NullPointerException nullPointerException) {
                    throw new XmlPullParserException("Need value attribute in item");
                }
            } else {
                n3 = n5;
                if (n4 == 3) {
                    if (object.getName().equals(charSequence)) {
                        return object2;
                    }
                    if (!object.getName().equals("item")) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Expected ");
                        ((StringBuilder)object2).append((String)charSequence);
                        ((StringBuilder)object2).append(" end tag at: ");
                        ((StringBuilder)object2).append(object.getName());
                        throw new XmlPullParserException(((StringBuilder)object2).toString());
                    }
                    n3 = n5 + 1;
                }
            }
            n4 = object.next();
            if (n4 == 1) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Document ended before ");
                ((StringBuilder)object).append((String)charSequence);
                ((StringBuilder)object).append(" end tag");
                throw new XmlPullParserException(((StringBuilder)object).toString());
            }
            n5 = n3;
        }
    }

    private static final HashMap g(XmlPullParser object, String string2, String[] object2, a a4) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        int n3 = object.getEventType();
        do {
            if (n3 == 2) {
                Object object3 = b.k((XmlPullParser)object, (String[])object2, a4);
                hashMap.put(object2[0], object3);
            } else if (n3 == 3) {
                if (object.getName().equals(string2)) {
                    return hashMap;
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Expected ");
                ((StringBuilder)object2).append(string2);
                ((StringBuilder)object2).append(" end tag at: ");
                ((StringBuilder)object2).append(object.getName());
                throw new XmlPullParserException(((StringBuilder)object2).toString());
            }
            n3 = object.next();
        } while (n3 != 1);
        object = new StringBuilder();
        ((StringBuilder)object).append("Document ended before ");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(" end tag");
        throw new XmlPullParserException(((StringBuilder)object).toString());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final Object h(XmlPullParser object, String string2) {
        void var1_6;
        try {
            boolean bl = var1_6.equals("int");
            if (bl) {
                return Integer.parseInt(object.getAttributeValue(null, "value"));
            }
            if (var1_6.equals("long")) {
                return Long.valueOf(object.getAttributeValue(null, "value"));
            }
            if (var1_6.equals("float")) {
                return Float.valueOf(object.getAttributeValue(null, "value"));
            }
            if (var1_6.equals("double")) {
                return Double.valueOf(object.getAttributeValue(null, "value"));
            }
            if (!var1_6.equals("boolean")) return null;
            return Boolean.valueOf(object.getAttributeValue(null, "value"));
        }
        catch (NumberFormatException numberFormatException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Not a number in value attribute in <");
            stringBuilder.append((String)var1_6);
            stringBuilder.append('>');
            throw new XmlPullParserException(stringBuilder.toString());
        }
        catch (NullPointerException nullPointerException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Need value attribute in <");
            stringBuilder.append((String)var1_6);
            stringBuilder.append('>');
            throw new XmlPullParserException(stringBuilder.toString());
        }
    }

    private static final HashSet i(XmlPullParser object, String string2, String[] object2, a a4) {
        HashSet<Object> hashSet = new HashSet<Object>();
        int n3 = object.getEventType();
        do {
            if (n3 == 2) {
                hashSet.add(b.k((XmlPullParser)object, (String[])object2, a4));
            } else if (n3 == 3) {
                if (object.getName().equals(string2)) {
                    return hashSet;
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Expected ");
                ((StringBuilder)object2).append(string2);
                ((StringBuilder)object2).append(" end tag at: ");
                ((StringBuilder)object2).append(object.getName());
                throw new XmlPullParserException(((StringBuilder)object2).toString());
            }
            n3 = object.next();
        } while (n3 != 1);
        object = new StringBuilder();
        ((StringBuilder)object).append("Document ended before ");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(" end tag");
        throw new XmlPullParserException(((StringBuilder)object).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final String[] j(XmlPullParser object, String charSequence, String[] object2) {
        int n3;
        try {
            n3 = Integer.parseInt(object.getAttributeValue(null, "num"));
        }
        catch (NumberFormatException numberFormatException) {
            throw new XmlPullParserException("Not a number in num attribute in string-array");
        }
        catch (NullPointerException nullPointerException) {
            throw new XmlPullParserException("Need num attribute in string-array");
        }
        object.next();
        object2 = new String[n3];
        int n4 = object.getEventType();
        n3 = 0;
        while (true) {
            int n5;
            if (n4 == 2) {
                if (!object.getName().equals("item")) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("Expected item tag at: ");
                    ((StringBuilder)charSequence).append(object.getName());
                    throw new XmlPullParserException(((StringBuilder)charSequence).toString());
                }
                try {
                    object2[n3] = object.getAttributeValue(null, "value");
                    n5 = n3;
                }
                catch (NumberFormatException numberFormatException) {
                    throw new XmlPullParserException("Not a number in value attribute in item");
                }
                catch (NullPointerException nullPointerException) {
                    throw new XmlPullParserException("Need value attribute in item");
                }
            } else {
                n5 = n3;
                if (n4 == 3) {
                    if (object.getName().equals(charSequence)) {
                        return object2;
                    }
                    if (!object.getName().equals("item")) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Expected ");
                        ((StringBuilder)object2).append((String)charSequence);
                        ((StringBuilder)object2).append(" end tag at: ");
                        ((StringBuilder)object2).append(object.getName());
                        throw new XmlPullParserException(((StringBuilder)object2).toString());
                    }
                    n5 = n3 + 1;
                }
            }
            n4 = object.next();
            if (n4 == 1) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Document ended before ");
                ((StringBuilder)object).append((String)charSequence);
                ((StringBuilder)object).append(" end tag");
                throw new XmlPullParserException(((StringBuilder)object).toString());
            }
            n3 = n5;
        }
    }

    private static final Object k(XmlPullParser object, String[] stringArray, a object2) {
        String string2;
        String string3;
        block23: {
            int n3;
            block22: {
                Object object3;
                block21: {
                    object3 = null;
                    string3 = object.getAttributeValue(null, "name");
                    string2 = object.getName();
                    if (!string2.equals("null")) break block21;
                    object2 = object3;
                    break block22;
                }
                if (string2.equals("string")) {
                    int n4;
                    object2 = "";
                    while ((n4 = object.next()) != 1) {
                        if (n4 == 3) {
                            if (object.getName().equals("string")) {
                                stringArray[0] = string3;
                                return object2;
                            }
                            stringArray = new StringBuilder();
                            stringArray.append("Unexpected end tag in <string>: ");
                            stringArray.append(object.getName());
                            throw new XmlPullParserException(stringArray.toString());
                        }
                        if (n4 == 4) {
                            object3 = new StringBuilder();
                            ((StringBuilder)object3).append((String)object2);
                            ((StringBuilder)object3).append(object.getText());
                            object2 = ((StringBuilder)object3).toString();
                            continue;
                        }
                        if (n4 != 2) continue;
                        stringArray = new StringBuilder();
                        stringArray.append("Unexpected start tag in <string>: ");
                        stringArray.append(object.getName());
                        throw new XmlPullParserException(stringArray.toString());
                    }
                    throw new XmlPullParserException("Unexpected end of document in <string>");
                }
                object3 = b.h((XmlPullParser)object, string2);
                if (object3 == null) break block23;
                object2 = object3;
            }
            while ((n3 = object.next()) != 1) {
                if (n3 == 3) {
                    if (object.getName().equals(string2)) {
                        stringArray[0] = string3;
                        return object2;
                    }
                    stringArray = new StringBuilder();
                    stringArray.append("Unexpected end tag in <");
                    stringArray.append(string2);
                    stringArray.append(">: ");
                    stringArray.append(object.getName());
                    throw new XmlPullParserException(stringArray.toString());
                }
                if (n3 != 4) {
                    if (n3 != 2) continue;
                    stringArray = new StringBuilder();
                    stringArray.append("Unexpected start tag in <");
                    stringArray.append(string2);
                    stringArray.append(">: ");
                    stringArray.append(object.getName());
                    throw new XmlPullParserException(stringArray.toString());
                }
                stringArray = new StringBuilder();
                stringArray.append("Unexpected text in <");
                stringArray.append(string2);
                stringArray.append(">: ");
                stringArray.append(object.getName());
                throw new XmlPullParserException(stringArray.toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Unexpected end of document in <");
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append('>');
            throw new XmlPullParserException(((StringBuilder)object).toString());
        }
        if (string2.equals("int-array")) {
            object = b.d((XmlPullParser)object, "int-array", stringArray);
            stringArray[0] = string3;
            return object;
        }
        if (string2.equals("long-array")) {
            object = b.f((XmlPullParser)object, "long-array", stringArray);
            stringArray[0] = string3;
            return object;
        }
        if (string2.equals("double-array")) {
            object = b.c((XmlPullParser)object, "double-array", stringArray);
            stringArray[0] = string3;
            return object;
        }
        if (string2.equals("string-array")) {
            object = b.j((XmlPullParser)object, "string-array", stringArray);
            stringArray[0] = string3;
            return object;
        }
        if (string2.equals("boolean-array")) {
            object = b.b((XmlPullParser)object, "boolean-array", stringArray);
            stringArray[0] = string3;
            return object;
        }
        if (string2.equals("map")) {
            object.next();
            object = b.g((XmlPullParser)object, "map", stringArray, (a)object2);
            stringArray[0] = string3;
            return object;
        }
        if (string2.equals("list")) {
            object.next();
            object = b.e((XmlPullParser)object, "list", stringArray, (a)object2);
            stringArray[0] = string3;
            return object;
        }
        if (string2.equals("set")) {
            object.next();
            object = b.i((XmlPullParser)object, "set", stringArray, (a)object2);
            stringArray[0] = string3;
            return object;
        }
        if (object2 != null) {
            object = object2.a((XmlPullParser)object, string2);
            stringArray[0] = string3;
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Unknown tag: ");
        ((StringBuilder)object).append(string2);
        throw new XmlPullParserException(((StringBuilder)object).toString());
    }

    private static final Object l(XmlPullParser xmlPullParser, String[] object) {
        block2: {
            block3: {
                int n3 = xmlPullParser.getEventType();
                do {
                    if (n3 == 2) {
                        return b.k(xmlPullParser, (String[])object, null);
                    }
                    if (n3 == 3) break block2;
                    if (n3 == 4) break block3;
                } while ((n3 = xmlPullParser.next()) != 1);
                throw new XmlPullParserException("Unexpected end of document");
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Unexpected text: ");
            ((StringBuilder)object).append(xmlPullParser.getText());
            throw new XmlPullParserException(((StringBuilder)object).toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Unexpected end tag at: ");
        ((StringBuilder)object).append(xmlPullParser.getName());
        throw new XmlPullParserException(((StringBuilder)object).toString());
    }

    public static interface a {
        public Object a(XmlPullParser var1, String var2);
    }
}

