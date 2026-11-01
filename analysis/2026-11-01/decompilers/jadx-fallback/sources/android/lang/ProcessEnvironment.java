package android.lang;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
abstract class ProcessEnvironment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.HashMap f1458a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.Map f1459b = null;

    private static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final java.lang.String f1460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final byte[] f1461b;

        protected a(java.lang.String r1, byte[] r2) {
                r0 = this;
                r0.<init>()
                r0.f1460a = r1
                r0.f1461b = r2
                return
        }

        public byte[] a() {
                r1 = this;
                byte[] r0 = r1.f1461b
                return r0
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof android.lang.ProcessEnvironment.a
                if (r0 == 0) goto L16
                byte[] r0 = r1.a()
                android.lang.ProcessEnvironment$a r2 = (android.lang.ProcessEnvironment.a) r2
                byte[] r2 = r2.a()
                boolean r2 = android.lang.ProcessEnvironment.a(r0, r2)
                if (r2 == 0) goto L16
                r2 = 1
                goto L17
            L16:
                r2 = 0
            L17:
                return r2
        }

        public int hashCode() {
                r1 = this;
                byte[] r0 = r1.a()
                int r0 = android.lang.ProcessEnvironment.b(r0)
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.f1460a
                return r0
        }
    }

    private static class b implements java.util.Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.Map.Entry f1462a;

        public b(java.util.Map.Entry r1) {
                r0 = this;
                r0.<init>()
                r0.f1462a = r1
                return
        }

        static /* synthetic */ java.util.Map.Entry a(android.lang.ProcessEnvironment.b r0) {
                java.util.Map$Entry r0 = r0.f1462a
                return r0
        }

        public java.lang.String b() {
                r1 = this;
                java.util.Map$Entry r0 = r1.f1462a
                java.lang.Object r0 = r0.getKey()
                android.lang.ProcessEnvironment$h r0 = (android.lang.ProcessEnvironment.h) r0
                java.lang.String r0 = r0.toString()
                return r0
        }

        public java.lang.String c() {
                r1 = this;
                java.util.Map$Entry r0 = r1.f1462a
                java.lang.Object r0 = r0.getValue()
                android.lang.ProcessEnvironment$g r0 = (android.lang.ProcessEnvironment.g) r0
                java.lang.String r0 = r0.toString()
                return r0
        }

        public java.lang.String d(java.lang.String r2) {
                r1 = this;
                java.util.Map$Entry r0 = r1.f1462a
                android.lang.ProcessEnvironment$g r2 = android.lang.ProcessEnvironment.g.c(r2)
                java.lang.Object r2 = r0.setValue(r2)
                android.lang.ProcessEnvironment$g r2 = (android.lang.ProcessEnvironment.g) r2
                java.lang.String r2 = r2.toString()
                return r2
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof android.lang.ProcessEnvironment.b
                if (r0 == 0) goto L12
                java.util.Map$Entry r0 = r1.f1462a
                android.lang.ProcessEnvironment$b r2 = (android.lang.ProcessEnvironment.b) r2
                java.util.Map$Entry r2 = r2.f1462a
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ java.lang.Object getKey() {
                r1 = this;
                java.lang.String r0 = r1.b()
                return r0
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ java.lang.Object getValue() {
                r1 = this;
                java.lang.String r0 = r1.c()
                return r0
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
                r1 = this;
                java.util.Map$Entry r0 = r1.f1462a
                int r0 = r0.hashCode()
                return r0
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ java.lang.Object setValue(java.lang.Object r1) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r1 = r0.d(r1)
                return r1
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.b()
                r0.append(r1)
                r1 = 61
                r0.append(r1)
                java.lang.String r1 = r2.c()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private static class c extends java.util.AbstractSet {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.Set f1463a;

        class a implements java.util.Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            java.util.Iterator f1464a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.lang.ProcessEnvironment.c f1465b;

            a(android.lang.ProcessEnvironment.c r1) {
                    r0 = this;
                    r0.f1465b = r1
                    r0.<init>()
                    java.util.Set r1 = android.lang.ProcessEnvironment.c.a(r1)
                    java.util.Iterator r1 = r1.iterator()
                    r0.f1464a = r1
                    return
            }

            public java.util.Map.Entry a() {
                    r2 = this;
                    android.lang.ProcessEnvironment$b r0 = new android.lang.ProcessEnvironment$b
                    java.util.Iterator r1 = r2.f1464a
                    java.lang.Object r1 = r1.next()
                    java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                    r0.<init>(r1)
                    return r0
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r1 = this;
                    java.util.Iterator r0 = r1.f1464a
                    boolean r0 = r0.hasNext()
                    return r0
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ java.lang.Object next() {
                    r1 = this;
                    java.util.Map$Entry r0 = r1.a()
                    return r0
            }

            @Override // java.util.Iterator
            public void remove() {
                    r1 = this;
                    java.util.Iterator r0 = r1.f1464a
                    r0.remove()
                    return
            }
        }

        class b implements java.util.Map.Entry {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.Object f1466a;

            b(java.lang.Object r1) {
                    r0 = this;
                    r0.f1466a = r1
                    r0.<init>()
                    return
            }

            public android.lang.ProcessEnvironment.h a() {
                    r1 = this;
                    java.lang.Object r0 = r1.f1466a
                    java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                    java.lang.Object r0 = r0.getKey()
                    android.lang.ProcessEnvironment$h r0 = android.lang.ProcessEnvironment.h.e(r0)
                    return r0
            }

            public android.lang.ProcessEnvironment.g b() {
                    r1 = this;
                    java.lang.Object r0 = r1.f1466a
                    java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                    java.lang.Object r0 = r0.getValue()
                    android.lang.ProcessEnvironment$g r0 = android.lang.ProcessEnvironment.g.e(r0)
                    return r0
            }

            public android.lang.ProcessEnvironment.g c(android.lang.ProcessEnvironment.g r1) {
                    r0 = this;
                    java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                    r1.<init>()
                    throw r1
            }

            @Override // java.util.Map.Entry
            public /* bridge */ /* synthetic */ java.lang.Object getKey() {
                    r1 = this;
                    android.lang.ProcessEnvironment$h r0 = r1.a()
                    return r0
            }

            @Override // java.util.Map.Entry
            public /* bridge */ /* synthetic */ java.lang.Object getValue() {
                    r1 = this;
                    android.lang.ProcessEnvironment$g r0 = r1.b()
                    return r0
            }

            @Override // java.util.Map.Entry
            public /* bridge */ /* synthetic */ java.lang.Object setValue(java.lang.Object r1) {
                    r0 = this;
                    android.lang.ProcessEnvironment$g r1 = (android.lang.ProcessEnvironment.g) r1
                    android.lang.ProcessEnvironment$g r1 = r0.c(r1)
                    return r1
            }
        }

        public c(java.util.Set r1) {
                r0 = this;
                r0.<init>()
                r0.f1463a = r1
                return
        }

        static /* synthetic */ java.util.Set a(android.lang.ProcessEnvironment.c r0) {
                java.util.Set r0 = r0.f1463a
                return r0
        }

        private static java.util.Map.Entry b(java.lang.Object r1) {
                boolean r0 = r1 instanceof android.lang.ProcessEnvironment.b
                if (r0 == 0) goto Lb
                android.lang.ProcessEnvironment$b r1 = (android.lang.ProcessEnvironment.b) r1
                java.util.Map$Entry r1 = android.lang.ProcessEnvironment.b.a(r1)
                return r1
            Lb:
                android.lang.ProcessEnvironment$c$b r0 = new android.lang.ProcessEnvironment$c$b
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                java.util.Set r0 = r1.f1463a
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                java.util.Set r0 = r1.f1463a
                java.util.Map$Entry r2 = b(r2)
                boolean r2 = r0.contains(r2)
                return r2
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof android.lang.ProcessEnvironment.c
                if (r0 == 0) goto L12
                java.util.Set r0 = r1.f1463a
                android.lang.ProcessEnvironment$c r2 = (android.lang.ProcessEnvironment.c) r2
                java.util.Set r2 = r2.f1463a
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
                r1 = this;
                java.util.Set r0 = r1.f1463a
                int r0 = r0.hashCode()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
                r1 = this;
                java.util.Set r0 = r1.f1463a
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator iterator() {
                r1 = this;
                android.lang.ProcessEnvironment$c$a r0 = new android.lang.ProcessEnvironment$c$a
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                java.util.Set r0 = r1.f1463a
                java.util.Map$Entry r2 = b(r2)
                boolean r2 = r0.remove(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                java.util.Set r0 = r1.f1463a
                int r0 = r0.size()
                return r0
        }
    }

    private static class d extends java.util.AbstractMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.util.Map f1467a;

        public d(java.util.Map r1) {
                r0 = this;
                r0.<init>()
                r0.f1467a = r1
                return
        }

        private static java.lang.String e(android.lang.ProcessEnvironment.g r0) {
                if (r0 != 0) goto L4
                r0 = 0
                goto L8
            L4:
                java.lang.String r0 = r0.toString()
            L8:
                return r0
        }

        public java.lang.String a(java.lang.Object r2) {
                r1 = this;
                java.util.Map r0 = r1.f1467a
                android.lang.ProcessEnvironment$h r2 = android.lang.ProcessEnvironment.h.e(r2)
                java.lang.Object r2 = r0.get(r2)
                android.lang.ProcessEnvironment$g r2 = (android.lang.ProcessEnvironment.g) r2
                java.lang.String r2 = e(r2)
                return r2
        }

        public java.lang.String b(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.util.Map r0 = r1.f1467a
                android.lang.ProcessEnvironment$h r2 = android.lang.ProcessEnvironment.h.c(r2)
                android.lang.ProcessEnvironment$g r3 = android.lang.ProcessEnvironment.g.c(r3)
                java.lang.Object r2 = r0.put(r2, r3)
                android.lang.ProcessEnvironment$g r2 = (android.lang.ProcessEnvironment.g) r2
                java.lang.String r2 = e(r2)
                return r2
        }

        public java.lang.String c(java.lang.Object r2) {
                r1 = this;
                java.util.Map r0 = r1.f1467a
                android.lang.ProcessEnvironment$h r2 = android.lang.ProcessEnvironment.h.e(r2)
                java.lang.Object r2 = r0.remove(r2)
                android.lang.ProcessEnvironment$g r2 = (android.lang.ProcessEnvironment.g) r2
                java.lang.String r2 = e(r2)
                return r2
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
                r1 = this;
                java.util.Map r0 = r1.f1467a
                r0.clear()
                return
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(java.lang.Object r2) {
                r1 = this;
                java.util.Map r0 = r1.f1467a
                android.lang.ProcessEnvironment$h r2 = android.lang.ProcessEnvironment.h.e(r2)
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(java.lang.Object r2) {
                r1 = this;
                java.util.Map r0 = r1.f1467a
                android.lang.ProcessEnvironment$g r2 = android.lang.ProcessEnvironment.g.e(r2)
                boolean r2 = r0.containsValue(r2)
                return r2
        }

        public byte[] d(int[] r8) {
                r7 = this;
                java.util.Map r0 = r7.f1467a
                int r0 = r0.size()
                int r0 = r0 * 2
                java.util.Map r1 = r7.f1467a
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L12:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L37
                java.lang.Object r2 = r1.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getKey()
                android.lang.ProcessEnvironment$h r3 = (android.lang.ProcessEnvironment.h) r3
                byte[] r3 = r3.a()
                int r3 = r3.length
                int r0 = r0 + r3
                java.lang.Object r2 = r2.getValue()
                android.lang.ProcessEnvironment$g r2 = (android.lang.ProcessEnvironment.g) r2
                byte[] r2 = r2.a()
                int r2 = r2.length
                int r0 = r0 + r2
                goto L12
            L37:
                byte[] r0 = new byte[r0]
                java.util.Map r1 = r7.f1467a
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
                r2 = 0
                r3 = 0
            L45:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L7a
                java.lang.Object r4 = r1.next()
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r5 = r4.getKey()
                android.lang.ProcessEnvironment$h r5 = (android.lang.ProcessEnvironment.h) r5
                byte[] r5 = r5.a()
                java.lang.Object r4 = r4.getValue()
                android.lang.ProcessEnvironment$g r4 = (android.lang.ProcessEnvironment.g) r4
                byte[] r4 = r4.a()
                int r6 = r5.length
                java.lang.System.arraycopy(r5, r2, r0, r3, r6)
                int r5 = r5.length
                int r3 = r3 + r5
                int r5 = r3 + 1
                r6 = 61
                r0[r3] = r6
                int r3 = r4.length
                java.lang.System.arraycopy(r4, r2, r0, r5, r3)
                int r3 = r4.length
                int r3 = r3 + 1
                int r3 = r3 + r5
                goto L45
            L7a:
                java.util.Map r1 = r7.f1467a
                int r1 = r1.size()
                r8[r2] = r1
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set entrySet() {
                r2 = this;
                android.lang.ProcessEnvironment$c r0 = new android.lang.ProcessEnvironment$c
                java.util.Map r1 = r2.f1467a
                java.util.Set r1 = r1.entrySet()
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object r1) {
                r0 = this;
                java.lang.String r1 = r0.a(r1)
                return r1
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
                r1 = this;
                java.util.Map r0 = r1.f1467a
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set keySet() {
                r2 = this;
                android.lang.ProcessEnvironment$e r0 = new android.lang.ProcessEnvironment$e
                java.util.Map r1 = r2.f1467a
                java.util.Set r1 = r1.keySet()
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r1 = r0.b(r1, r2)
                return r1
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ java.lang.Object remove(java.lang.Object r1) {
                r0 = this;
                java.lang.String r1 = r0.c(r1)
                return r1
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
                r1 = this;
                java.util.Map r0 = r1.f1467a
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Collection values() {
                r2 = this;
                android.lang.ProcessEnvironment$f r0 = new android.lang.ProcessEnvironment$f
                java.util.Map r1 = r2.f1467a
                java.util.Collection r1 = r1.values()
                r0.<init>(r1)
                return r0
        }
    }

    private static class e extends java.util.AbstractSet {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.Set f1468a;

        class a implements java.util.Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            java.util.Iterator f1469a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.lang.ProcessEnvironment.e f1470b;

            a(android.lang.ProcessEnvironment.e r1) {
                    r0 = this;
                    r0.f1470b = r1
                    r0.<init>()
                    java.util.Set r1 = android.lang.ProcessEnvironment.e.a(r1)
                    java.util.Iterator r1 = r1.iterator()
                    r0.f1469a = r1
                    return
            }

            public java.lang.String a() {
                    r1 = this;
                    java.util.Iterator r0 = r1.f1469a
                    java.lang.Object r0 = r0.next()
                    android.lang.ProcessEnvironment$h r0 = (android.lang.ProcessEnvironment.h) r0
                    java.lang.String r0 = r0.toString()
                    return r0
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r1 = this;
                    java.util.Iterator r0 = r1.f1469a
                    boolean r0 = r0.hasNext()
                    return r0
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ java.lang.Object next() {
                    r1 = this;
                    java.lang.String r0 = r1.a()
                    return r0
            }

            @Override // java.util.Iterator
            public void remove() {
                    r1 = this;
                    java.util.Iterator r0 = r1.f1469a
                    r0.remove()
                    return
            }
        }

        public e(java.util.Set r1) {
                r0 = this;
                r0.<init>()
                r0.f1468a = r1
                return
        }

        static /* synthetic */ java.util.Set a(android.lang.ProcessEnvironment.e r0) {
                java.util.Set r0 = r0.f1468a
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                java.util.Set r0 = r1.f1468a
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                java.util.Set r0 = r1.f1468a
                android.lang.ProcessEnvironment$h r2 = android.lang.ProcessEnvironment.h.e(r2)
                boolean r2 = r0.contains(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
                r1 = this;
                java.util.Set r0 = r1.f1468a
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator iterator() {
                r1 = this;
                android.lang.ProcessEnvironment$e$a r0 = new android.lang.ProcessEnvironment$e$a
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                java.util.Set r0 = r1.f1468a
                android.lang.ProcessEnvironment$h r2 = android.lang.ProcessEnvironment.h.e(r2)
                boolean r2 = r0.remove(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                java.util.Set r0 = r1.f1468a
                int r0 = r0.size()
                return r0
        }
    }

    private static class f extends java.util.AbstractCollection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.Collection f1471a;

        class a implements java.util.Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            java.util.Iterator f1472a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.lang.ProcessEnvironment.f f1473b;

            a(android.lang.ProcessEnvironment.f r1) {
                    r0 = this;
                    r0.f1473b = r1
                    r0.<init>()
                    java.util.Collection r1 = android.lang.ProcessEnvironment.f.a(r1)
                    java.util.Iterator r1 = r1.iterator()
                    r0.f1472a = r1
                    return
            }

            public java.lang.String a() {
                    r1 = this;
                    java.util.Iterator r0 = r1.f1472a
                    java.lang.Object r0 = r0.next()
                    android.lang.ProcessEnvironment$g r0 = (android.lang.ProcessEnvironment.g) r0
                    java.lang.String r0 = r0.toString()
                    return r0
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r1 = this;
                    java.util.Iterator r0 = r1.f1472a
                    boolean r0 = r0.hasNext()
                    return r0
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ java.lang.Object next() {
                    r1 = this;
                    java.lang.String r0 = r1.a()
                    return r0
            }

            @Override // java.util.Iterator
            public void remove() {
                    r1 = this;
                    java.util.Iterator r0 = r1.f1472a
                    r0.remove()
                    return
            }
        }

        public f(java.util.Collection r1) {
                r0 = this;
                r0.<init>()
                r0.f1471a = r1
                return
        }

        static /* synthetic */ java.util.Collection a(android.lang.ProcessEnvironment.f r0) {
                java.util.Collection r0 = r0.f1471a
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
                r1 = this;
                java.util.Collection r0 = r1.f1471a
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                java.util.Collection r0 = r1.f1471a
                android.lang.ProcessEnvironment$g r2 = android.lang.ProcessEnvironment.g.e(r2)
                boolean r2 = r0.contains(r2)
                return r2
        }

        @Override // java.util.Collection
        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof android.lang.ProcessEnvironment.f
                if (r0 == 0) goto L12
                java.util.Collection r0 = r1.f1471a
                android.lang.ProcessEnvironment$f r2 = (android.lang.ProcessEnvironment.f) r2
                java.util.Collection r2 = r2.f1471a
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }

        @Override // java.util.Collection
        public int hashCode() {
                r1 = this;
                java.util.Collection r0 = r1.f1471a
                int r0 = r0.hashCode()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                java.util.Collection r0 = r1.f1471a
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator iterator() {
                r1 = this;
                android.lang.ProcessEnvironment$f$a r0 = new android.lang.ProcessEnvironment$f$a
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                java.util.Collection r0 = r1.f1471a
                android.lang.ProcessEnvironment$g r2 = android.lang.ProcessEnvironment.g.e(r2)
                boolean r2 = r0.remove(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r1 = this;
                java.util.Collection r0 = r1.f1471a
                int r0 = r0.size()
                return r0
        }
    }

    private static class g extends android.lang.ProcessEnvironment.a implements java.lang.Comparable {
        protected g(java.lang.String r1, byte[] r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static android.lang.ProcessEnvironment.g c(java.lang.String r0) {
                android.lang.ProcessEnvironment.e(r0)
                android.lang.ProcessEnvironment$g r0 = f(r0)
                return r0
        }

        public static android.lang.ProcessEnvironment.g d(byte[] r2) {
                android.lang.ProcessEnvironment$g r0 = new android.lang.ProcessEnvironment$g
                java.lang.String r1 = new java.lang.String
                r1.<init>(r2)
                r0.<init>(r1, r2)
                return r0
        }

        public static android.lang.ProcessEnvironment.g e(java.lang.Object r0) {
                java.lang.String r0 = (java.lang.String) r0
                android.lang.ProcessEnvironment$g r0 = f(r0)
                return r0
        }

        public static android.lang.ProcessEnvironment.g f(java.lang.String r2) {
                android.lang.ProcessEnvironment$g r0 = new android.lang.ProcessEnvironment$g
                byte[] r1 = r2.getBytes()
                r0.<init>(r2, r1)
                return r0
        }

        public int b(android.lang.ProcessEnvironment.g r2) {
                r1 = this;
                byte[] r0 = r1.a()
                byte[] r2 = r2.a()
                int r2 = android.lang.ProcessEnvironment.d(r0, r2)
                return r2
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
                r0 = this;
                android.lang.ProcessEnvironment$g r1 = (android.lang.ProcessEnvironment.g) r1
                int r1 = r0.b(r1)
                return r1
        }

        @Override // android.lang.ProcessEnvironment.a
        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof android.lang.ProcessEnvironment.g
                if (r0 == 0) goto Lc
                boolean r2 = super.equals(r2)
                if (r2 == 0) goto Lc
                r2 = 1
                goto Ld
            Lc:
                r2 = 0
            Ld:
                return r2
        }
    }

    private static class h extends android.lang.ProcessEnvironment.a implements java.lang.Comparable {
        protected h(java.lang.String r1, byte[] r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static android.lang.ProcessEnvironment.h c(java.lang.String r0) {
                android.lang.ProcessEnvironment.c(r0)
                android.lang.ProcessEnvironment$h r0 = f(r0)
                return r0
        }

        public static android.lang.ProcessEnvironment.h d(byte[] r2) {
                android.lang.ProcessEnvironment$h r0 = new android.lang.ProcessEnvironment$h
                java.lang.String r1 = new java.lang.String
                r1.<init>(r2)
                r0.<init>(r1, r2)
                return r0
        }

        public static android.lang.ProcessEnvironment.h e(java.lang.Object r0) {
                java.lang.String r0 = (java.lang.String) r0
                android.lang.ProcessEnvironment$h r0 = f(r0)
                return r0
        }

        public static android.lang.ProcessEnvironment.h f(java.lang.String r2) {
                android.lang.ProcessEnvironment$h r0 = new android.lang.ProcessEnvironment$h
                byte[] r1 = r2.getBytes()
                r0.<init>(r2, r1)
                return r0
        }

        public int b(android.lang.ProcessEnvironment.h r2) {
                r1 = this;
                byte[] r0 = r1.a()
                byte[] r2 = r2.a()
                int r2 = android.lang.ProcessEnvironment.d(r0, r2)
                return r2
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
                r0 = this;
                android.lang.ProcessEnvironment$h r1 = (android.lang.ProcessEnvironment.h) r1
                int r1 = r0.b(r1)
                return r1
        }

        @Override // android.lang.ProcessEnvironment.a
        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof android.lang.ProcessEnvironment.h
                if (r0 == 0) goto Lc
                boolean r2 = super.equals(r2)
                if (r2 == 0) goto Lc
                r2 = 1
                goto Ld
            Lc:
                r2 = 0
            Ld:
                return r2
        }
    }

    static {
            byte[][] r0 = environ()
            java.util.HashMap r1 = new java.util.HashMap
            int r2 = r0.length
            int r2 = r2 / 2
            int r2 = r2 + 3
            r1.<init>(r2)
            android.lang.ProcessEnvironment.f1458a = r1
            int r1 = r0.length
            int r1 = r1 + (-1)
        L13:
            if (r1 <= 0) goto L2b
            java.util.HashMap r2 = android.lang.ProcessEnvironment.f1458a
            int r3 = r1 + (-1)
            r3 = r0[r3]
            android.lang.ProcessEnvironment$h r3 = android.lang.ProcessEnvironment.h.d(r3)
            r4 = r0[r1]
            android.lang.ProcessEnvironment$g r4 = android.lang.ProcessEnvironment.g.d(r4)
            r2.put(r3, r4)
            int r1 = r1 + (-2)
            goto L13
        L2b:
            android.lang.ProcessEnvironment$d r0 = new android.lang.ProcessEnvironment$d
            java.util.HashMap r1 = android.lang.ProcessEnvironment.f1458a
            r0.<init>(r1)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            android.lang.ProcessEnvironment.f1459b = r0
            return
    }

    static /* synthetic */ boolean a(byte[] r0, byte[] r1) {
            boolean r0 = g(r0, r1)
            return r0
    }

    static /* synthetic */ int b(byte[] r0) {
            int r0 = h(r0)
            return r0
    }

    static /* synthetic */ void c(java.lang.String r0) {
            l(r0)
            return
    }

    static /* synthetic */ int d(byte[] r0, byte[] r1) {
            int r0 = f(r0, r1)
            return r0
    }

    static /* synthetic */ void e(java.lang.String r0) {
            k(r0)
            return
    }

    private static native byte[][] environ();

    private static int f(byte[] r4, byte[] r5) {
            int r0 = r4.length
            int r1 = r5.length
            if (r0 >= r1) goto L6
            int r0 = r4.length
            goto L7
        L6:
            int r0 = r5.length
        L7:
            r1 = 0
        L8:
            if (r1 >= r0) goto L15
            r2 = r4[r1]
            r3 = r5[r1]
            if (r2 == r3) goto L12
            int r2 = r2 - r3
            return r2
        L12:
            int r1 = r1 + 1
            goto L8
        L15:
            int r4 = r4.length
            int r5 = r5.length
            int r4 = r4 - r5
            return r4
    }

    private static boolean g(byte[] r4, byte[] r5) {
            int r0 = r4.length
            int r1 = r5.length
            r2 = 0
            if (r0 == r1) goto L6
            return r2
        L6:
            r0 = 0
        L7:
            int r1 = r4.length
            if (r0 >= r1) goto L14
            r1 = r4[r0]
            r3 = r5[r0]
            if (r1 == r3) goto L11
            return r2
        L11:
            int r0 = r0 + 1
            goto L7
        L14:
            r4 = 1
            return r4
    }

    private static int h(byte[] r3) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r3.length
            if (r0 >= r2) goto Ld
            int r1 = r1 * 31
            r2 = r3[r0]
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L2
        Ld:
            return r1
    }

    static java.util.Map i(int r2) {
            android.lang.ProcessEnvironment$d r0 = new android.lang.ProcessEnvironment$d
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    static byte[] j(java.util.Map r0, int[] r1) {
            if (r0 != 0) goto L4
            r0 = 0
            goto La
        L4:
            android.lang.ProcessEnvironment$d r0 = (android.lang.ProcessEnvironment.d) r0
            byte[] r0 = r0.d(r1)
        La:
            return r0
    }

    private static void k(java.lang.String r3) {
            r0 = 0
            int r0 = r3.indexOf(r0)
            r1 = -1
            if (r0 != r1) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid environment variable value: \""
            r1.append(r2)
            r1.append(r3)
            r3 = 34
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static void l(java.lang.String r3) {
            r0 = 61
            int r0 = r3.indexOf(r0)
            r1 = -1
            if (r0 != r1) goto L11
            r0 = 0
            int r0 = r3.indexOf(r0)
            if (r0 != r1) goto L11
            return
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid environment variable name: \""
            r1.append(r2)
            r1.append(r3)
            r3 = 34
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }
}
