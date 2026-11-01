package b;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class a extends java.io.PrintStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.StringBuilder f1486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.nio.ByteBuffer f1487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.nio.CharBuffer f1488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.nio.charset.CharsetDecoder f1489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.Formatter f1490e;

    /* JADX INFO: renamed from: b.a$a, reason: collision with other inner class name */
    class C0026a extends java.io.OutputStream {
        C0026a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.io.OutputStream
        public void write(int r1) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
        }
    }

    protected a() {
            r3 = this;
            b.a$a r0 = new b.a$a
            r0.<init>()
            r3.<init>(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r3.f1486a = r0
            java.util.Formatter r1 = new java.util.Formatter
            r2 = 0
            r1.<init>(r0, r2)
            r3.f1490e = r1
            return
    }

    private void a(boolean r6) {
            r5 = this;
            java.lang.StringBuilder r0 = r5.f1486a
            int r0 = r0.length()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L21
            java.lang.StringBuilder r3 = r5.f1486a
            java.lang.String r4 = "\n"
            int r3 = r3.indexOf(r4, r2)
            r4 = -1
            if (r3 == r4) goto L21
            java.lang.StringBuilder r4 = r5.f1486a
            java.lang.String r2 = r4.substring(r2, r3)
            r5.b(r2)
            int r2 = r3 + 1
            goto L8
        L21:
            if (r6 == 0) goto L36
            if (r2 < r0) goto L27
            if (r0 != 0) goto L30
        L27:
            java.lang.StringBuilder r6 = r5.f1486a
            java.lang.String r6 = r6.substring(r2)
            r5.b(r6)
        L30:
            java.lang.StringBuilder r6 = r5.f1486a
            r6.setLength(r1)
            goto L3b
        L36:
            java.lang.StringBuilder r6 = r5.f1486a
            r6.delete(r1, r2)
        L3b:
            return
    }

    @Override // java.io.PrintStream, java.lang.Appendable
    public synchronized java.io.PrintStream append(char r1) {
            r0 = this;
            monitor-enter(r0)
            r0.print(r1)     // Catch: java.lang.Throwable -> L6
            monitor-exit(r0)
            return r0
        L6:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // java.io.PrintStream, java.lang.Appendable
    public synchronized java.io.PrintStream append(java.lang.CharSequence r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.StringBuilder r0 = r1.f1486a     // Catch: java.lang.Throwable -> Lc
            r0.append(r2)     // Catch: java.lang.Throwable -> Lc
            r2 = 0
            r1.a(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return r1
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // java.io.PrintStream, java.lang.Appendable
    public synchronized java.io.PrintStream append(java.lang.CharSequence r2, int r3, int r4) {
            r1 = this;
            monitor-enter(r1)
            java.lang.StringBuilder r0 = r1.f1486a     // Catch: java.lang.Throwable -> Lc
            r0.append(r2, r3, r4)     // Catch: java.lang.Throwable -> Lc
            r2 = 0
            r1.a(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return r1
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // java.io.PrintStream, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(char r1) {
            r0 = this;
            java.io.PrintStream r1 = r0.append(r1)
            return r1
    }

    @Override // java.io.PrintStream, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1) {
            r0 = this;
            java.io.PrintStream r1 = r0.append(r1)
            return r1
    }

    @Override // java.io.PrintStream, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1, int r2, int r3) {
            r0 = this;
            java.io.PrintStream r1 = r0.append(r1, r2, r3)
            return r1
    }

    protected abstract void b(java.lang.String r1);

    @Override // java.io.PrintStream
    public boolean checkError() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.io.PrintStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    @Override // java.io.PrintStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public synchronized void flush() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.a(r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // java.io.PrintStream
    public java.io.PrintStream format(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.io.PrintStream r2 = r1.format(r0, r2, r3)
            return r2
    }

    @Override // java.io.PrintStream
    public synchronized java.io.PrintStream format(java.util.Locale r2, java.lang.String r3, java.lang.Object... r4) {
            r1 = this;
            monitor-enter(r1)
            if (r3 == 0) goto L10
            java.util.Formatter r0 = r1.f1490e     // Catch: java.lang.Throwable -> Le
            r0.format(r2, r3, r4)     // Catch: java.lang.Throwable -> Le
            r2 = 0
            r1.a(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = "format"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Le
            throw r2     // Catch: java.lang.Throwable -> Le
        L18:
            monitor-exit(r1)
            throw r2
    }

    @Override // java.io.PrintStream
    public synchronized void print(char r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.StringBuilder r0 = r1.f1486a     // Catch: java.lang.Throwable -> Lf
            r0.append(r2)     // Catch: java.lang.Throwable -> Lf
            r0 = 10
            if (r2 != r0) goto L11
            r2 = 0
            r1.a(r2)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L13
        L11:
            monitor-exit(r1)
            return
        L13:
            monitor-exit(r1)
            throw r2
    }

    @Override // java.io.PrintStream
    public synchronized void print(double r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.StringBuilder r0 = r1.f1486a     // Catch: java.lang.Throwable -> L8
            r0.append(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // java.io.PrintStream
    public synchronized void print(float r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.StringBuilder r0 = r1.f1486a     // Catch: java.lang.Throwable -> L8
            r0.append(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // java.io.PrintStream
    public synchronized void print(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.StringBuilder r0 = r1.f1486a     // Catch: java.lang.Throwable -> L8
            r0.append(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // java.io.PrintStream
    public synchronized void print(long r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.StringBuilder r0 = r1.f1486a     // Catch: java.lang.Throwable -> L8
            r0.append(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // java.io.PrintStream
    public synchronized void print(java.lang.Object r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.StringBuilder r0 = r1.f1486a     // Catch: java.lang.Throwable -> Lc
            r0.append(r2)     // Catch: java.lang.Throwable -> Lc
            r2 = 0
            r1.a(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // java.io.PrintStream
    public synchronized void print(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.StringBuilder r0 = r1.f1486a     // Catch: java.lang.Throwable -> Lc
            r0.append(r2)     // Catch: java.lang.Throwable -> Lc
            r2 = 0
            r1.a(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // java.io.PrintStream
    public synchronized void print(boolean r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.StringBuilder r0 = r1.f1486a     // Catch: java.lang.Throwable -> L8
            r0.append(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // java.io.PrintStream
    public synchronized void print(char[] r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.StringBuilder r0 = r1.f1486a     // Catch: java.lang.Throwable -> Lc
            r0.append(r2)     // Catch: java.lang.Throwable -> Lc
            r2 = 0
            r1.a(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // java.io.PrintStream
    public java.io.PrintStream printf(java.lang.String r1, java.lang.Object... r2) {
            r0 = this;
            java.io.PrintStream r1 = r0.format(r1, r2)
            return r1
    }

    @Override // java.io.PrintStream
    public java.io.PrintStream printf(java.util.Locale r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = this;
            java.io.PrintStream r1 = r0.format(r1, r2, r3)
            return r1
    }

    @Override // java.io.PrintStream
    public synchronized void println() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.a(r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // java.io.PrintStream
    public synchronized void println(char r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.StringBuilder r0 = r1.f1486a     // Catch: java.lang.Throwable -> Lc
            r0.append(r2)     // Catch: java.lang.Throwable -> Lc
            r2 = 1
            r1.a(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // java.io.PrintStream
    public synchronized void println(double r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.StringBuilder r0 = r1.f1486a     // Catch: java.lang.Throwable -> Lc
            r0.append(r2)     // Catch: java.lang.Throwable -> Lc
            r2 = 1
            r1.a(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // java.io.PrintStream
    public synchronized void println(float r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.StringBuilder r0 = r1.f1486a     // Catch: java.lang.Throwable -> Lc
            r0.append(r2)     // Catch: java.lang.Throwable -> Lc
            r2 = 1
            r1.a(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // java.io.PrintStream
    public synchronized void println(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.StringBuilder r0 = r1.f1486a     // Catch: java.lang.Throwable -> Lc
            r0.append(r2)     // Catch: java.lang.Throwable -> Lc
            r2 = 1
            r1.a(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // java.io.PrintStream
    public synchronized void println(long r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.StringBuilder r0 = r1.f1486a     // Catch: java.lang.Throwable -> Lc
            r0.append(r2)     // Catch: java.lang.Throwable -> Lc
            r2 = 1
            r1.a(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // java.io.PrintStream
    public synchronized void println(java.lang.Object r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.StringBuilder r0 = r1.f1486a     // Catch: java.lang.Throwable -> Lc
            r0.append(r2)     // Catch: java.lang.Throwable -> Lc
            r2 = 1
            r1.a(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // java.io.PrintStream
    public synchronized void println(java.lang.String r5) {
            r4 = this;
            monitor-enter(r4)
            java.lang.StringBuilder r0 = r4.f1486a     // Catch: java.lang.Throwable -> L25
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L31
            if (r5 == 0) goto L31
            int r0 = r5.length()     // Catch: java.lang.Throwable -> L25
            r1 = 0
        L10:
            if (r1 >= r0) goto L27
            r2 = 10
            int r2 = r5.indexOf(r2, r1)     // Catch: java.lang.Throwable -> L25
            r3 = -1
            if (r2 == r3) goto L27
            java.lang.String r1 = r5.substring(r1, r2)     // Catch: java.lang.Throwable -> L25
            r4.b(r1)     // Catch: java.lang.Throwable -> L25
            int r1 = r2 + 1
            goto L10
        L25:
            r5 = move-exception
            goto L3c
        L27:
            if (r1 >= r0) goto L3a
            java.lang.String r5 = r5.substring(r1)     // Catch: java.lang.Throwable -> L25
            r4.b(r5)     // Catch: java.lang.Throwable -> L25
            goto L3a
        L31:
            java.lang.StringBuilder r0 = r4.f1486a     // Catch: java.lang.Throwable -> L25
            r0.append(r5)     // Catch: java.lang.Throwable -> L25
            r5 = 1
            r4.a(r5)     // Catch: java.lang.Throwable -> L25
        L3a:
            monitor-exit(r4)
            return
        L3c:
            monitor-exit(r4)
            throw r5
    }

    @Override // java.io.PrintStream
    public synchronized void println(boolean r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.StringBuilder r0 = r1.f1486a     // Catch: java.lang.Throwable -> Lc
            r0.append(r2)     // Catch: java.lang.Throwable -> Lc
            r2 = 1
            r1.a(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // java.io.PrintStream
    public synchronized void println(char[] r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.StringBuilder r0 = r1.f1486a     // Catch: java.lang.Throwable -> Lc
            r0.append(r2)     // Catch: java.lang.Throwable -> Lc
            r2 = 1
            r1.a(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // java.io.PrintStream
    protected void setError() {
            r0 = this;
            return
    }

    @Override // java.io.PrintStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(int r4) {
            r3 = this;
            r0 = 1
            byte[] r1 = new byte[r0]
            byte r4 = (byte) r4
            r2 = 0
            r1[r2] = r4
            r3.write(r1, r2, r0)
            return
    }

    @Override // java.io.PrintStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            r2.write(r3, r1, r0)
            return
    }

    @Override // java.io.PrintStream, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] r5, int r6, int r7) {
            r4 = this;
            monitor-enter(r4)
            java.nio.charset.CharsetDecoder r0 = r4.f1489d     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L2a
            r0 = 80
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)     // Catch: java.lang.Throwable -> L28
            r4.f1487b = r1     // Catch: java.lang.Throwable -> L28
            java.nio.CharBuffer r0 = java.nio.CharBuffer.allocate(r0)     // Catch: java.lang.Throwable -> L28
            r4.f1488c = r0     // Catch: java.lang.Throwable -> L28
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()     // Catch: java.lang.Throwable -> L28
            java.nio.charset.CharsetDecoder r0 = r0.newDecoder()     // Catch: java.lang.Throwable -> L28
            java.nio.charset.CodingErrorAction r1 = java.nio.charset.CodingErrorAction.REPLACE     // Catch: java.lang.Throwable -> L28
            java.nio.charset.CharsetDecoder r0 = r0.onMalformedInput(r1)     // Catch: java.lang.Throwable -> L28
            java.nio.charset.CharsetDecoder r0 = r0.onUnmappableCharacter(r1)     // Catch: java.lang.Throwable -> L28
            r4.f1489d = r0     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r5 = move-exception
            goto L71
        L2a:
            int r7 = r7 + r6
        L2b:
            r0 = 0
            if (r6 >= r7) goto L6c
            java.nio.ByteBuffer r1 = r4.f1487b     // Catch: java.lang.Throwable -> L28
            int r1 = r1.remaining()     // Catch: java.lang.Throwable -> L28
            int r2 = r7 - r6
            int r1 = java.lang.Math.min(r1, r2)     // Catch: java.lang.Throwable -> L28
            java.nio.ByteBuffer r2 = r4.f1487b     // Catch: java.lang.Throwable -> L28
            r2.put(r5, r6, r1)     // Catch: java.lang.Throwable -> L28
            int r6 = r6 + r1
            java.nio.ByteBuffer r1 = r4.f1487b     // Catch: java.lang.Throwable -> L28
            r1.flip()     // Catch: java.lang.Throwable -> L28
        L45:
            java.nio.charset.CharsetDecoder r1 = r4.f1489d     // Catch: java.lang.Throwable -> L28
            java.nio.ByteBuffer r2 = r4.f1487b     // Catch: java.lang.Throwable -> L28
            java.nio.CharBuffer r3 = r4.f1488c     // Catch: java.lang.Throwable -> L28
            java.nio.charset.CoderResult r1 = r1.decode(r2, r3, r0)     // Catch: java.lang.Throwable -> L28
            java.nio.CharBuffer r2 = r4.f1488c     // Catch: java.lang.Throwable -> L28
            r2.flip()     // Catch: java.lang.Throwable -> L28
            java.lang.StringBuilder r2 = r4.f1486a     // Catch: java.lang.Throwable -> L28
            java.nio.CharBuffer r3 = r4.f1488c     // Catch: java.lang.Throwable -> L28
            r2.append(r3)     // Catch: java.lang.Throwable -> L28
            java.nio.CharBuffer r2 = r4.f1488c     // Catch: java.lang.Throwable -> L28
            r2.clear()     // Catch: java.lang.Throwable -> L28
            boolean r1 = r1.isOverflow()     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L45
            java.nio.ByteBuffer r0 = r4.f1487b     // Catch: java.lang.Throwable -> L28
            r0.compact()     // Catch: java.lang.Throwable -> L28
            goto L2b
        L6c:
            r4.a(r0)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r4)
            return
        L71:
            monitor-exit(r4)
            throw r5
    }
}
