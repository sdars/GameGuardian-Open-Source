package b;

import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends PrintStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f1486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f1487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CharBuffer f1488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharsetDecoder f1489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Formatter f1490e;

    protected a() {
        super(new a$a());
        StringBuilder sb = new StringBuilder();
        this.f1486a = sb;
        this.f1490e = new Formatter(sb, (Locale) null);
    }

    private void a(boolean z) {
        int length = this.f1486a.length();
        int i = 0;
        while (i < length) {
            int iIndexOf = this.f1486a.indexOf("\n", i);
            if (iIndexOf == -1) {
                break;
            }
            b(this.f1486a.substring(i, iIndexOf));
            i = iIndexOf + 1;
        }
        if (!z) {
            this.f1486a.delete(0, i);
            return;
        }
        if (i < length || length == 0) {
            b(this.f1486a.substring(i));
        }
        this.f1486a.setLength(0);
    }

    @Override // java.io.PrintStream, java.lang.Appendable
    public synchronized PrintStream append(char c2) {
        try {
            print(c2);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // java.io.PrintStream, java.lang.Appendable
    public synchronized PrintStream append(CharSequence charSequence) {
        try {
            this.f1486a.append(charSequence);
            a(false);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // java.io.PrintStream, java.lang.Appendable
    public synchronized PrintStream append(CharSequence charSequence, int i, int i2) {
        try {
            this.f1486a.append(charSequence, i, i2);
            a(false);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    protected abstract void b(String str);

    @Override // java.io.PrintStream
    public boolean checkError() {
        return false;
    }

    @Override // java.io.PrintStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.PrintStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public synchronized void flush() {
        try {
            a(true);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.PrintStream
    public PrintStream format(String str, Object... objArr) {
        return format(Locale.getDefault(), str, objArr);
    }

    @Override // java.io.PrintStream
    public synchronized PrintStream format(Locale locale, String str, Object... objArr) {
        try {
            if (str == null) {
                throw new NullPointerException("format");
            }
            this.f1490e.format(locale, str, objArr);
            a(false);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // java.io.PrintStream
    public synchronized void print(char c2) {
        try {
            this.f1486a.append(c2);
            if (c2 == '\n') {
                a(false);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.PrintStream
    public synchronized void print(double d2) {
        try {
            this.f1486a.append(d2);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.PrintStream
    public synchronized void print(float f2) {
        try {
            this.f1486a.append(f2);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.PrintStream
    public synchronized void print(int i) {
        try {
            this.f1486a.append(i);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.PrintStream
    public synchronized void print(long j) {
        try {
            this.f1486a.append(j);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.PrintStream
    public synchronized void print(Object obj) {
        try {
            this.f1486a.append(obj);
            a(false);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.PrintStream
    public synchronized void print(String str) {
        try {
            this.f1486a.append(str);
            a(false);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.PrintStream
    public synchronized void print(boolean z) {
        try {
            this.f1486a.append(z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.PrintStream
    public synchronized void print(char[] cArr) {
        try {
            this.f1486a.append(cArr);
            a(false);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.PrintStream
    public PrintStream printf(String str, Object... objArr) {
        return format(str, objArr);
    }

    @Override // java.io.PrintStream
    public PrintStream printf(Locale locale, String str, Object... objArr) {
        return format(locale, str, objArr);
    }

    @Override // java.io.PrintStream
    public synchronized void println() {
        try {
            a(true);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.PrintStream
    public synchronized void println(char c2) {
        try {
            this.f1486a.append(c2);
            a(true);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.PrintStream
    public synchronized void println(double d2) {
        try {
            this.f1486a.append(d2);
            a(true);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.PrintStream
    public synchronized void println(float f2) {
        try {
            this.f1486a.append(f2);
            a(true);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.PrintStream
    public synchronized void println(int i) {
        try {
            this.f1486a.append(i);
            a(true);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.PrintStream
    public synchronized void println(long j) {
        try {
            this.f1486a.append(j);
            a(true);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.PrintStream
    public synchronized void println(Object obj) {
        try {
            this.f1486a.append(obj);
            a(true);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.PrintStream
    public synchronized void println(String str) {
        try {
            if (this.f1486a.length() != 0 || str == null) {
                this.f1486a.append(str);
                a(true);
            } else {
                int length = str.length();
                int i = 0;
                while (i < length) {
                    int iIndexOf = str.indexOf(10, i);
                    if (iIndexOf == -1) {
                        break;
                    }
                    b(str.substring(i, iIndexOf));
                    i = iIndexOf + 1;
                }
                if (i < length) {
                    b(str.substring(i));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.PrintStream
    public synchronized void println(boolean z) {
        try {
            this.f1486a.append(z);
            a(true);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.PrintStream
    public synchronized void println(char[] cArr) {
        try {
            this.f1486a.append(cArr);
            a(true);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.PrintStream
    protected void setError() {
    }

    @Override // java.io.PrintStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.PrintStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.PrintStream, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        CoderResult coderResultDecode;
        try {
            if (this.f1489d == null) {
                this.f1487b = ByteBuffer.allocate(80);
                this.f1488c = CharBuffer.allocate(80);
                CharsetDecoder charsetDecoderNewDecoder = Charset.defaultCharset().newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
                this.f1489d = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
            }
            int i3 = i2 + i;
            while (i < i3) {
                int iMin = Math.min(this.f1487b.remaining(), i3 - i);
                this.f1487b.put(bArr, i, iMin);
                i += iMin;
                this.f1487b.flip();
                do {
                    coderResultDecode = this.f1489d.decode(this.f1487b, this.f1488c, false);
                    this.f1488c.flip();
                    this.f1486a.append((CharSequence) this.f1488c);
                    this.f1488c.clear();
                } while (coderResultDecode.isOverflow());
                this.f1487b.compact();
            }
            a(false);
        } catch (Throwable th) {
            throw th;
        }
    }
}
