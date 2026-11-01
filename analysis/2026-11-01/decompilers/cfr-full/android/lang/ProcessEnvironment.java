/*
 * Decompiled with CFR 0.152.
 */
package android.lang;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class ProcessEnvironment {
    private static final HashMap a;
    private static final Map b;

    static {
        byte[][] byArray = ProcessEnvironment.environ();
        a = new HashMap(byArray.length / 2 + 3);
        for (int i3 = byArray.length - 1; i3 > 0; i3 -= 2) {
            a.put(h.d(byArray[i3 - 1]), g.d(byArray[i3]));
        }
        b = Collections.unmodifiableMap(new d(a));
    }

    private static native byte[][] environ();

    private static int f(byte[] byArray, byte[] byArray2) {
        int n3 = byArray.length < byArray2.length ? byArray.length : byArray2.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            byte by = byArray[i3];
            byte by2 = byArray2[i3];
            if (by == by2) continue;
            return by - by2;
        }
        return byArray.length - byArray2.length;
    }

    private static boolean g(byte[] byArray, byte[] byArray2) {
        if (byArray.length != byArray2.length) {
            return false;
        }
        for (int i3 = 0; i3 < byArray.length; ++i3) {
            if (byArray[i3] == byArray2[i3]) continue;
            return false;
        }
        return true;
    }

    private static int h(byte[] byArray) {
        int n3 = 0;
        for (int i3 = 0; i3 < byArray.length; ++i3) {
            n3 = n3 * 31 + byArray[i3];
        }
        return n3;
    }

    static Map i(int n3) {
        return new d(new HashMap(n3));
    }

    static byte[] j(Map object, int[] nArray) {
        object = object == null ? null : (Object)((d)object).d(nArray);
        return object;
    }

    private static void k(String string2) {
        if (string2.indexOf(0) == -1) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid environment variable value: \"");
        stringBuilder.append(string2);
        stringBuilder.append('\"');
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static void l(String string2) {
        if (string2.indexOf(61) == -1 && string2.indexOf(0) == -1) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid environment variable name: \"");
        stringBuilder.append(string2);
        stringBuilder.append('\"');
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static abstract class a {
        protected final String a;
        protected final byte[] b;

        protected a(String string2, byte[] byArray) {
            this.a = string2;
            this.b = byArray;
        }

        public byte[] a() {
            return this.b;
        }

        public boolean equals(Object object) {
            boolean bl = object instanceof a && ProcessEnvironment.g(this.a(), ((a)object).a());
            return bl;
        }

        public int hashCode() {
            return ProcessEnvironment.h(this.a());
        }

        public String toString() {
            return this.a;
        }
    }

    private static class b
    implements Map.Entry {
        private final Map.Entry a;

        public b(Map.Entry entry) {
            this.a = entry;
        }

        public String b() {
            return ((h)this.a.getKey()).toString();
        }

        public String c() {
            return ((g)this.a.getValue()).toString();
        }

        public String d(String string2) {
            return this.a.setValue(g.c(string2)).toString();
        }

        @Override
        public boolean equals(Object object) {
            boolean bl = object instanceof b && this.a.equals(((b)object).a);
            return bl;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.b());
            stringBuilder.append('=');
            stringBuilder.append(this.c());
            return stringBuilder.toString();
        }
    }

    private static class c
    extends AbstractSet {
        private final Set a;

        public c(Set set) {
            this.a = set;
        }

        private static Map.Entry b(Object object) {
            if (object instanceof b) {
                return ((b)object).a;
            }
            return new Map.Entry(object){
                final Object a;
                {
                    this.a = object;
                }

                public h a() {
                    return h.e(((Map.Entry)this.a).getKey());
                }

                public g b() {
                    return g.e(((Map.Entry)this.a).getValue());
                }

                public g c(g g4) {
                    throw new UnsupportedOperationException();
                }
            };
        }

        @Override
        public void clear() {
            this.a.clear();
        }

        @Override
        public boolean contains(Object object) {
            return this.a.contains(c.b(object));
        }

        @Override
        public boolean equals(Object object) {
            boolean bl = object instanceof c && this.a.equals(((c)object).a);
            return bl;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override
        public Iterator iterator() {
            return new Iterator(this){
                Iterator a;
                final c b;
                {
                    this.b = c4;
                    this.a = c4.a.iterator();
                }

                public Map.Entry a() {
                    return new b((Map.Entry)this.a.next());
                }

                @Override
                public boolean hasNext() {
                    return this.a.hasNext();
                }

                @Override
                public void remove() {
                    this.a.remove();
                }
            };
        }

        @Override
        public boolean remove(Object object) {
            return this.a.remove(c.b(object));
        }

        @Override
        public int size() {
            return this.a.size();
        }
    }

    private static class d
    extends AbstractMap {
        private Map a;

        public d(Map map) {
            this.a = map;
        }

        private static String e(g object) {
            object = object == null ? null : ((a)object).toString();
            return object;
        }

        public String a(Object object) {
            return d.e((g)this.a.get(h.e(object)));
        }

        public String b(String string2, String string3) {
            return d.e(this.a.put(h.c(string2), g.c(string3)));
        }

        public String c(Object object) {
            return d.e((g)this.a.remove(h.e(object)));
        }

        @Override
        public void clear() {
            this.a.clear();
        }

        @Override
        public boolean containsKey(Object object) {
            return this.a.containsKey(h.e(object));
        }

        @Override
        public boolean containsValue(Object object) {
            return this.a.containsValue(g.e(object));
        }

        public byte[] d(int[] nArray) {
            int n3 = this.a.size() * 2;
            for (Map.Entry object2 : this.a.entrySet()) {
                n3 = n3 + ((h)object2.getKey()).a().length + ((g)object2.getValue()).a().length;
            }
            Object object3 = new byte[n3];
            Iterator iterator = this.a.entrySet().iterator();
            n3 = 0;
            while (iterator.hasNext()) {
                Object object = iterator.next();
                byte[] byArray = ((h)object.getKey()).a();
                object = ((g)object.getValue()).a();
                System.arraycopy(byArray, 0, object3, n3, byArray.length);
                int n4 = (n3 += byArray.length) + 1;
                object3[n3] = 61;
                System.arraycopy(object, 0, object3, n4, ((Object)object).length);
                n3 = ((Object)object).length + 1 + n4;
            }
            nArray[0] = this.a.size();
            return object3;
        }

        @Override
        public Set entrySet() {
            return new c(this.a.entrySet());
        }

        @Override
        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override
        public Set keySet() {
            return new e(this.a.keySet());
        }

        @Override
        public int size() {
            return this.a.size();
        }

        @Override
        public Collection values() {
            return new f(this.a.values());
        }
    }

    private static class e
    extends AbstractSet {
        private final Set a;

        public e(Set set) {
            this.a = set;
        }

        @Override
        public void clear() {
            this.a.clear();
        }

        @Override
        public boolean contains(Object object) {
            return this.a.contains(h.e(object));
        }

        @Override
        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override
        public Iterator iterator() {
            return new Iterator(this){
                Iterator a;
                final e b;
                {
                    this.b = e4;
                    this.a = e4.a.iterator();
                }

                public String a() {
                    return ((h)this.a.next()).toString();
                }

                @Override
                public boolean hasNext() {
                    return this.a.hasNext();
                }

                @Override
                public void remove() {
                    this.a.remove();
                }
            };
        }

        @Override
        public boolean remove(Object object) {
            return this.a.remove(h.e(object));
        }

        @Override
        public int size() {
            return this.a.size();
        }
    }

    private static class f
    extends AbstractCollection {
        private final Collection a;

        public f(Collection collection) {
            this.a = collection;
        }

        @Override
        public void clear() {
            this.a.clear();
        }

        @Override
        public boolean contains(Object object) {
            return this.a.contains(g.e(object));
        }

        @Override
        public boolean equals(Object object) {
            boolean bl = object instanceof f && this.a.equals(((f)object).a);
            return bl;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override
        public Iterator iterator() {
            return new Iterator(this){
                Iterator a;
                final f b;
                {
                    this.b = f4;
                    this.a = f4.a.iterator();
                }

                public String a() {
                    return ((g)this.a.next()).toString();
                }

                @Override
                public boolean hasNext() {
                    return this.a.hasNext();
                }

                @Override
                public void remove() {
                    this.a.remove();
                }
            };
        }

        @Override
        public boolean remove(Object object) {
            return this.a.remove(g.e(object));
        }

        @Override
        public int size() {
            return this.a.size();
        }
    }

    private static class g
    extends a
    implements Comparable {
        protected g(String string2, byte[] byArray) {
            super(string2, byArray);
        }

        public static g c(String string2) {
            ProcessEnvironment.k(string2);
            return g.f(string2);
        }

        public static g d(byte[] byArray) {
            return new g(new String(byArray), byArray);
        }

        public static g e(Object object) {
            return g.f((String)object);
        }

        public static g f(String string2) {
            return new g(string2, string2.getBytes());
        }

        public int b(g g4) {
            return ProcessEnvironment.f(this.a(), g4.a());
        }

        @Override
        public boolean equals(Object object) {
            boolean bl = object instanceof g && super.equals(object);
            return bl;
        }
    }

    private static class h
    extends a
    implements Comparable {
        protected h(String string2, byte[] byArray) {
            super(string2, byArray);
        }

        public static h c(String string2) {
            ProcessEnvironment.l(string2);
            return h.f(string2);
        }

        public static h d(byte[] byArray) {
            return new h(new String(byArray), byArray);
        }

        public static h e(Object object) {
            return h.f((String)object);
        }

        public static h f(String string2) {
            return new h(string2, string2.getBytes());
        }

        public int b(h h4) {
            return ProcessEnvironment.f(this.a(), h4.a());
        }

        @Override
        public boolean equals(Object object) {
            boolean bl = object instanceof h && super.equals(object);
            return bl;
        }
    }
}

