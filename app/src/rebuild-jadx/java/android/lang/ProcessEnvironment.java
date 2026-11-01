package android.lang;

/* JADX INFO: loaded from: classes.dex */
abstract class ProcessEnvironment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.HashMap f1458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.Map f1459b;

    private static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final java.lang.String f1460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final byte[] f1461b;

        protected a(java.lang.String str, byte[] bArr) {
            this.f1460a = str;
            this.f1461b = bArr;
        }

        public byte[] a() {
            return this.f1461b;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof android.lang.ProcessEnvironment.a) && android.lang.ProcessEnvironment.g(a(), ((android.lang.ProcessEnvironment.a) obj).a());
        }

        public int hashCode() {
            return android.lang.ProcessEnvironment.h(a());
        }

        public java.lang.String toString() {
            return this.f1460a;
        }
    }

    private static class b implements java.util.Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.Map.Entry f1462a;

        public b(java.util.Map.Entry entry) {
            this.f1462a = entry;
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public java.lang.String getKey() {
            return ((android.lang.ProcessEnvironment.h) this.f1462a.getKey()).toString();
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public java.lang.String getValue() {
            return ((android.lang.ProcessEnvironment.g) this.f1462a.getValue()).toString();
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public java.lang.String setValue(java.lang.String str) {
            return ((android.lang.ProcessEnvironment.g) this.f1462a.setValue(android.lang.ProcessEnvironment.g.c(str))).toString();
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object obj) {
            return (obj instanceof android.lang.ProcessEnvironment.b) && this.f1462a.equals(((android.lang.ProcessEnvironment.b) obj).f1462a);
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f1462a.hashCode();
        }

        public java.lang.String toString() {
            return getKey() + '=' + getValue();
        }
    }

    private static class c extends java.util.AbstractSet {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.Set f1463a;

        class a implements java.util.Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            java.util.Iterator f1464a;

            a() {
                this.f1464a = android.lang.ProcessEnvironment.c.this.f1463a.iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public java.util.Map.Entry next() {
                return new android.lang.ProcessEnvironment.b((java.util.Map.Entry) this.f1464a.next());
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

        class b implements java.util.Map.Entry {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.Object f1466a;

            b(java.lang.Object obj) {
                this.f1466a = obj;
            }

            @Override // java.util.Map.Entry
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public android.lang.ProcessEnvironment.h getKey() {
                return android.lang.ProcessEnvironment.h.e(((java.util.Map.Entry) this.f1466a).getKey());
            }

            @Override // java.util.Map.Entry
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public android.lang.ProcessEnvironment.g getValue() {
                return android.lang.ProcessEnvironment.g.e(((java.util.Map.Entry) this.f1466a).getValue());
            }

            @Override // java.util.Map.Entry
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public android.lang.ProcessEnvironment.g setValue(android.lang.ProcessEnvironment.g gVar) {
                throw new java.lang.UnsupportedOperationException();
            }
        }

        public c(java.util.Set set) {
            this.f1463a = set;
        }

        private static java.util.Map.Entry b(java.lang.Object obj) {
            return obj instanceof android.lang.ProcessEnvironment.b ? ((android.lang.ProcessEnvironment.b) obj).f1462a : new android.lang.ProcessEnvironment.c.b(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f1463a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            return this.f1463a.contains(b(obj));
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(java.lang.Object obj) {
            return (obj instanceof android.lang.ProcessEnvironment.c) && this.f1463a.equals(((android.lang.ProcessEnvironment.c) obj).f1463a);
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
        public java.util.Iterator iterator() {
            return new android.lang.ProcessEnvironment.c.a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object obj) {
            return this.f1463a.remove(b(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f1463a.size();
        }
    }

    private static class d extends java.util.AbstractMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.util.Map f1467a;

        public d(java.util.Map map) {
            this.f1467a = map;
        }

        private static java.lang.String e(android.lang.ProcessEnvironment.g gVar) {
            if (gVar == null) {
                return null;
            }
            return gVar.toString();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.String get(java.lang.Object obj) {
            return e((android.lang.ProcessEnvironment.g) this.f1467a.get(android.lang.ProcessEnvironment.h.e(obj)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public java.lang.String put(java.lang.String str, java.lang.String str2) {
            return e((android.lang.ProcessEnvironment.g) this.f1467a.put(android.lang.ProcessEnvironment.h.c(str), android.lang.ProcessEnvironment.g.c(str2)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public java.lang.String remove(java.lang.Object obj) {
            return e((android.lang.ProcessEnvironment.g) this.f1467a.remove(android.lang.ProcessEnvironment.h.e(obj)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f1467a.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(java.lang.Object obj) {
            return this.f1467a.containsKey(android.lang.ProcessEnvironment.h.e(obj));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(java.lang.Object obj) {
            return this.f1467a.containsValue(android.lang.ProcessEnvironment.g.e(obj));
        }

        public byte[] d(int[] iArr) {
            int size = this.f1467a.size() * 2;
            for (java.util.Map.Entry entry : this.f1467a.entrySet()) {
                size = size + ((android.lang.ProcessEnvironment.h) entry.getKey()).a().length + ((android.lang.ProcessEnvironment.g) entry.getValue()).a().length;
            }
            byte[] bArr = new byte[size];
            int length = 0;
            for (java.util.Map.Entry entry2 : this.f1467a.entrySet()) {
                byte[] bArrA = ((android.lang.ProcessEnvironment.h) entry2.getKey()).a();
                byte[] bArrA2 = ((android.lang.ProcessEnvironment.g) entry2.getValue()).a();
                java.lang.System.arraycopy(bArrA, 0, bArr, length, bArrA.length);
                int length2 = length + bArrA.length;
                int i = length2 + 1;
                bArr[length2] = 61;
                java.lang.System.arraycopy(bArrA2, 0, bArr, i, bArrA2.length);
                length = bArrA2.length + 1 + i;
            }
            iArr[0] = this.f1467a.size();
            return bArr;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set entrySet() {
            return new android.lang.ProcessEnvironment.c(this.f1467a.entrySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f1467a.isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set keySet() {
            return new android.lang.ProcessEnvironment.e(this.f1467a.keySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f1467a.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Collection values() {
            return new android.lang.ProcessEnvironment.f(this.f1467a.values());
        }
    }

    private static class e extends java.util.AbstractSet {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.Set f1468a;

        class a implements java.util.Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            java.util.Iterator f1469a;

            a() {
                this.f1469a = android.lang.ProcessEnvironment.e.this.f1468a.iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public java.lang.String next() {
                return ((android.lang.ProcessEnvironment.h) this.f1469a.next()).toString();
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

        public e(java.util.Set set) {
            this.f1468a = set;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f1468a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            return this.f1468a.contains(android.lang.ProcessEnvironment.h.e(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f1468a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator iterator() {
            return new android.lang.ProcessEnvironment.e.a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object obj) {
            return this.f1468a.remove(android.lang.ProcessEnvironment.h.e(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f1468a.size();
        }
    }

    private static class f extends java.util.AbstractCollection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.Collection f1471a;

        class a implements java.util.Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            java.util.Iterator f1472a;

            a() {
                this.f1472a = android.lang.ProcessEnvironment.f.this.f1471a.iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public java.lang.String next() {
                return ((android.lang.ProcessEnvironment.g) this.f1472a.next()).toString();
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

        public f(java.util.Collection collection) {
            this.f1471a = collection;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f1471a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object obj) {
            return this.f1471a.contains(android.lang.ProcessEnvironment.g.e(obj));
        }

        @Override // java.util.Collection
        public boolean equals(java.lang.Object obj) {
            return (obj instanceof android.lang.ProcessEnvironment.f) && this.f1471a.equals(((android.lang.ProcessEnvironment.f) obj).f1471a);
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
        public java.util.Iterator iterator() {
            return new android.lang.ProcessEnvironment.f.a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(java.lang.Object obj) {
            return this.f1471a.remove(android.lang.ProcessEnvironment.g.e(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f1471a.size();
        }
    }

    private static class g extends android.lang.ProcessEnvironment.a implements java.lang.Comparable {
        protected g(java.lang.String str, byte[] bArr) {
            super(str, bArr);
        }

        public static android.lang.ProcessEnvironment.g c(java.lang.String str) {
            android.lang.ProcessEnvironment.k(str);
            return f(str);
        }

        public static android.lang.ProcessEnvironment.g d(byte[] bArr) {
            return new android.lang.ProcessEnvironment.g(new java.lang.String(bArr), bArr);
        }

        public static android.lang.ProcessEnvironment.g e(java.lang.Object obj) {
            return f((java.lang.String) obj);
        }

        public static android.lang.ProcessEnvironment.g f(java.lang.String str) {
            return new android.lang.ProcessEnvironment.g(str, str.getBytes());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(android.lang.ProcessEnvironment.g gVar) {
            return android.lang.ProcessEnvironment.f(a(), gVar.a());
        }

        @Override // android.lang.ProcessEnvironment.a
        public boolean equals(java.lang.Object obj) {
            return (obj instanceof android.lang.ProcessEnvironment.g) && super.equals(obj);
        }
    }

    private static class h extends android.lang.ProcessEnvironment.a implements java.lang.Comparable {
        protected h(java.lang.String str, byte[] bArr) {
            super(str, bArr);
        }

        public static android.lang.ProcessEnvironment.h c(java.lang.String str) {
            android.lang.ProcessEnvironment.l(str);
            return f(str);
        }

        public static android.lang.ProcessEnvironment.h d(byte[] bArr) {
            return new android.lang.ProcessEnvironment.h(new java.lang.String(bArr), bArr);
        }

        public static android.lang.ProcessEnvironment.h e(java.lang.Object obj) {
            return f((java.lang.String) obj);
        }

        public static android.lang.ProcessEnvironment.h f(java.lang.String str) {
            return new android.lang.ProcessEnvironment.h(str, str.getBytes());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(android.lang.ProcessEnvironment.h hVar) {
            return android.lang.ProcessEnvironment.f(a(), hVar.a());
        }

        @Override // android.lang.ProcessEnvironment.a
        public boolean equals(java.lang.Object obj) {
            return (obj instanceof android.lang.ProcessEnvironment.h) && super.equals(obj);
        }
    }

    static {
        byte[][] bArrEnviron = environ();
        f1458a = new java.util.HashMap((bArrEnviron.length / 2) + 3);
        for (int length = bArrEnviron.length - 1; length > 0; length -= 2) {
            f1458a.put(android.lang.ProcessEnvironment.h.d(bArrEnviron[length - 1]), android.lang.ProcessEnvironment.g.d(bArrEnviron[length]));
        }
        f1459b = java.util.Collections.unmodifiableMap(new android.lang.ProcessEnvironment.d(f1458a));
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

    static java.util.Map i(int i) {
        return new android.lang.ProcessEnvironment.d(new java.util.HashMap(i));
    }

    static byte[] j(java.util.Map map, int[] iArr) {
        if (map == null) {
            return null;
        }
        return ((android.lang.ProcessEnvironment.d) map).d(iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(java.lang.String str) {
        if (str.indexOf(0) == -1) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Invalid environment variable value: \"" + str + '\"');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(java.lang.String str) {
        if (str.indexOf(61) == -1 && str.indexOf(0) == -1) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Invalid environment variable name: \"" + str + '\"');
    }
}
