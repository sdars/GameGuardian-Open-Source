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

/* JADX INFO: loaded from: classes.dex */
abstract class ProcessEnvironment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap f1458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f1459b;

    private static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final String f1460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final byte[] f1461b;

        protected a(String str, byte[] bArr) {
            this.f1460a = str;
            this.f1461b = bArr;
        }

        public byte[] a() {
            return this.f1461b;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && ProcessEnvironment.g(a(), ((a) obj).a());
        }

        public int hashCode() {
            return ProcessEnvironment.h(a());
        }

        public String toString() {
            return this.f1460a;
        }
    }

    private static class b implements Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map.Entry f1462a;

        public b(Map.Entry entry) {
            this.f1462a = entry;
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String getKey() {
            return ((h) this.f1462a.getKey()).toString();
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String getValue() {
            return ((g) this.f1462a.getValue()).toString();
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String setValue(String str) {
            return ((g) this.f1462a.setValue(g.c(str))).toString();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            return (obj instanceof b) && this.f1462a.equals(((b) obj).f1462a);
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f1462a.hashCode();
        }

        public String toString() {
            return getKey() + '=' + getValue();
        }
    }

    private static class c extends AbstractSet {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f1463a;

        class a implements Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Iterator f1464a;

            a() {
                this.f1464a = c.this.f1463a.iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return new b((Map.Entry) this.f1464a.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f1464a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f1464a.remove();
            }
        }

        class b implements Map.Entry {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f1466a;

            b(Object obj) {
                this.f1466a = obj;
            }

            @Override // java.util.Map.Entry
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h getKey() {
                return h.e(((Map.Entry) this.f1466a).getKey());
            }

            @Override // java.util.Map.Entry
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g getValue() {
                return g.e(((Map.Entry) this.f1466a).getValue());
            }

            @Override // java.util.Map.Entry
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public g setValue(g gVar) {
                throw new UnsupportedOperationException();
            }
        }

        public c(Set set) {
            this.f1463a = set;
        }

        private static Map.Entry b(Object obj) {
            return obj instanceof b ? ((b) obj).f1462a : new b(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f1463a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f1463a.contains(b(obj));
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return (obj instanceof c) && this.f1463a.equals(((c) obj).f1463a);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return this.f1463a.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f1463a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return this.f1463a.remove(b(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f1463a.size();
        }
    }

    private static class d extends AbstractMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map f1467a;

        public d(Map map) {
            this.f1467a = map;
        }

        private static String e(g gVar) {
            if (gVar == null) {
                return null;
            }
            return gVar.toString();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String get(Object obj) {
            return e((g) this.f1467a.get(h.e(obj)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String put(String str, String str2) {
            return e((g) this.f1467a.put(h.c(str), g.c(str2)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String remove(Object obj) {
            return e((g) this.f1467a.remove(h.e(obj)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f1467a.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f1467a.containsKey(h.e(obj));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(Object obj) {
            return this.f1467a.containsValue(g.e(obj));
        }

        public byte[] d(int[] iArr) {
            int size = this.f1467a.size() * 2;
            for (Map.Entry entry : this.f1467a.entrySet()) {
                size = size + ((h) entry.getKey()).a().length + ((g) entry.getValue()).a().length;
            }
            byte[] bArr = new byte[size];
            int length = 0;
            for (Map.Entry entry2 : this.f1467a.entrySet()) {
                byte[] bArrA = ((h) entry2.getKey()).a();
                byte[] bArrA2 = ((g) entry2.getValue()).a();
                System.arraycopy(bArrA, 0, bArr, length, bArrA.length);
                int length2 = length + bArrA.length;
                int i = length2 + 1;
                bArr[length2] = 61;
                System.arraycopy(bArrA2, 0, bArr, i, bArrA2.length);
                length = bArrA2.length + 1 + i;
            }
            iArr[0] = this.f1467a.size();
            return bArr;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            return new c(this.f1467a.entrySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f1467a.isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return new e(this.f1467a.keySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f1467a.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection values() {
            return new f(this.f1467a.values());
        }
    }

    private static class e extends AbstractSet {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f1468a;

        class a implements Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Iterator f1469a;

            a() {
                this.f1469a = e.this.f1468a.iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String next() {
                return ((h) this.f1469a.next()).toString();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f1469a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f1469a.remove();
            }
        }

        public e(Set set) {
            this.f1468a = set;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f1468a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f1468a.contains(h.e(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f1468a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return this.f1468a.remove(h.e(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f1468a.size();
        }
    }

    private static class f extends AbstractCollection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Collection f1471a;

        class a implements Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Iterator f1472a;

            a() {
                this.f1472a = f.this.f1471a.iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String next() {
                return ((g) this.f1472a.next()).toString();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f1472a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f1472a.remove();
            }
        }

        public f(Collection collection) {
            this.f1471a = collection;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f1471a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f1471a.contains(g.e(obj));
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            return (obj instanceof f) && this.f1471a.equals(((f) obj).f1471a);
        }

        @Override // java.util.Collection
        public int hashCode() {
            return this.f1471a.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f1471a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return this.f1471a.remove(g.e(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f1471a.size();
        }
    }

    private static class g extends a implements Comparable {
        protected g(String str, byte[] bArr) {
            super(str, bArr);
        }

        public static g c(String str) {
            ProcessEnvironment.k(str);
            return f(str);
        }

        public static g d(byte[] bArr) {
            return new g(new String(bArr), bArr);
        }

        public static g e(Object obj) {
            return f((String) obj);
        }

        public static g f(String str) {
            return new g(str, str.getBytes());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(g gVar) {
            return ProcessEnvironment.f(a(), gVar.a());
        }

        @Override // android.lang.ProcessEnvironment.a
        public boolean equals(Object obj) {
            return (obj instanceof g) && super.equals(obj);
        }
    }

    private static class h extends a implements Comparable {
        protected h(String str, byte[] bArr) {
            super(str, bArr);
        }

        public static h c(String str) {
            ProcessEnvironment.l(str);
            return f(str);
        }

        public static h d(byte[] bArr) {
            return new h(new String(bArr), bArr);
        }

        public static h e(Object obj) {
            return f((String) obj);
        }

        public static h f(String str) {
            return new h(str, str.getBytes());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(h hVar) {
            return ProcessEnvironment.f(a(), hVar.a());
        }

        @Override // android.lang.ProcessEnvironment.a
        public boolean equals(Object obj) {
            return (obj instanceof h) && super.equals(obj);
        }
    }

    static {
        byte[][] bArrEnviron = environ();
        f1458a = new HashMap((bArrEnviron.length / 2) + 3);
        for (int length = bArrEnviron.length - 1; length > 0; length -= 2) {
            f1458a.put(h.d(bArrEnviron[length - 1]), g.d(bArrEnviron[length]));
        }
        f1459b = Collections.unmodifiableMap(new d(f1458a));
    }

    private static native byte[][] environ();

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(byte[] bArr, byte[] bArr2) {
        int length = bArr.length < bArr2.length ? bArr.length : bArr2.length;
        for (int i = 0; i < length; i++) {
            byte b2 = bArr[i];
            byte b3 = bArr2[i];
            if (b2 != b3) {
                return b2 - b3;
            }
        }
        return bArr.length - bArr2.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(byte[] bArr) {
        int i = 0;
        for (byte b2 : bArr) {
            i = (i * 31) + b2;
        }
        return i;
    }

    static Map i(int i) {
        return new d(new HashMap(i));
    }

    static byte[] j(Map map, int[] iArr) {
        if (map == null) {
            return null;
        }
        return ((d) map).d(iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(String str) {
        if (str.indexOf(0) == -1) {
            return;
        }
        throw new IllegalArgumentException("Invalid environment variable value: \"" + str + '\"');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(String str) {
        if (str.indexOf(61) == -1 && str.indexOf(0) == -1) {
            return;
        }
        throw new IllegalArgumentException("Invalid environment variable name: \"" + str + '\"');
    }
}
