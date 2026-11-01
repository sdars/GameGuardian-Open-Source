/*
 * Decompiled with CFR 0.152.
 */
package b;

import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Formatter;
import java.util.Locale;

public abstract class a
extends PrintStream {
    private final StringBuilder a;
    private ByteBuffer b;
    private CharBuffer c;
    private CharsetDecoder d;
    private final Formatter e;

    protected a() {
        super(new OutputStream(){

            @Override
            public void write(int n3) {
                throw new AssertionError();
            }
        });
        StringBuilder stringBuilder;
        this.a = stringBuilder = new StringBuilder();
        this.e = new Formatter(stringBuilder, null);
    }

    private void a(boolean bl) {
        int n3;
        int n4 = this.a.length();
        int n5 = 0;
        while (n5 < n4 && (n3 = this.a.indexOf("\n", n5)) != -1) {
            this.b(this.a.substring(n5, n3));
            n5 = n3 + 1;
        }
        if (bl) {
            if (n5 < n4 || n4 == 0) {
                this.b(this.a.substring(n5));
            }
            this.a.setLength(0);
        } else {
            this.a.delete(0, n5);
        }
    }

    @Override
    public PrintStream append(char c4) {
        synchronized (this) {
            this.print(c4);
            return this;
        }
    }

    @Override
    public PrintStream append(CharSequence charSequence) {
        synchronized (this) {
            this.a.append(charSequence);
            this.a(false);
            return this;
        }
    }

    @Override
    public PrintStream append(CharSequence charSequence, int n3, int n4) {
        synchronized (this) {
            this.a.append(charSequence, n3, n4);
            this.a(false);
            return this;
        }
    }

    protected abstract void b(String var1);

    @Override
    public boolean checkError() {
        return false;
    }

    @Override
    public void close() {
    }

    @Override
    public void flush() {
        synchronized (this) {
            this.a(true);
            return;
        }
    }

    @Override
    public PrintStream format(String string2, Object ... objectArray) {
        return this.format(Locale.getDefault(), string2, objectArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PrintStream format(Locale serializable, String string2, Object ... objectArray) {
        synchronized (this) {
            Throwable throwable2;
            if (string2 != null) {
                try {
                    this.e.format((Locale)serializable, string2, objectArray);
                    this.a(false);
                    return this;
                }
                catch (Throwable throwable2) {}
            } else {
                serializable = new NullPointerException("format");
                throw serializable;
            }
            throw throwable2;
        }
    }

    @Override
    public void print(char c4) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        this.a.append(c4);
                        if (c4 != '\n') break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    this.a(false);
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public void print(double d4) {
        synchronized (this) {
            this.a.append(d4);
            return;
        }
    }

    @Override
    public void print(float f4) {
        synchronized (this) {
            this.a.append(f4);
            return;
        }
    }

    @Override
    public void print(int n3) {
        synchronized (this) {
            this.a.append(n3);
            return;
        }
    }

    @Override
    public void print(long l3) {
        synchronized (this) {
            this.a.append(l3);
            return;
        }
    }

    @Override
    public void print(Object object) {
        synchronized (this) {
            this.a.append(object);
            this.a(false);
            return;
        }
    }

    @Override
    public void print(String string2) {
        synchronized (this) {
            this.a.append(string2);
            this.a(false);
            return;
        }
    }

    @Override
    public void print(boolean bl) {
        synchronized (this) {
            this.a.append(bl);
            return;
        }
    }

    @Override
    public void print(char[] cArray) {
        synchronized (this) {
            this.a.append(cArray);
            this.a(false);
            return;
        }
    }

    @Override
    public PrintStream printf(String string2, Object ... objectArray) {
        return this.format(string2, objectArray);
    }

    @Override
    public PrintStream printf(Locale locale, String string2, Object ... objectArray) {
        return this.format(locale, string2, objectArray);
    }

    @Override
    public void println() {
        synchronized (this) {
            this.a(true);
            return;
        }
    }

    @Override
    public void println(char c4) {
        synchronized (this) {
            this.a.append(c4);
            this.a(true);
            return;
        }
    }

    @Override
    public void println(double d4) {
        synchronized (this) {
            this.a.append(d4);
            this.a(true);
            return;
        }
    }

    @Override
    public void println(float f4) {
        synchronized (this) {
            this.a.append(f4);
            this.a(true);
            return;
        }
    }

    @Override
    public void println(int n3) {
        synchronized (this) {
            this.a.append(n3);
            this.a(true);
            return;
        }
    }

    @Override
    public void println(long l3) {
        synchronized (this) {
            this.a.append(l3);
            this.a(true);
            return;
        }
    }

    @Override
    public void println(Object object) {
        synchronized (this) {
            this.a.append(object);
            this.a(true);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void println(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block7: {
                    block5: {
                        int n3;
                        int n4;
                        try {
                            int n5;
                            if (this.a.length() != 0 || string2 == null) break block5;
                            n4 = string2.length();
                            n3 = 0;
                            while (n3 < n4 && (n5 = string2.indexOf(10, n3)) != -1) {
                                this.b(string2.substring(n3, n5));
                                n3 = n5 + 1;
                            }
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                        if (n3 < n4) {
                            this.b(string2.substring(n3));
                        }
                        break block7;
                    }
                    this.a.append(string2);
                    this.a(true);
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public void println(boolean bl) {
        synchronized (this) {
            this.a.append(bl);
            this.a(true);
            return;
        }
    }

    @Override
    public void println(char[] cArray) {
        synchronized (this) {
            this.a.append(cArray);
            this.a(true);
            return;
        }
    }

    @Override
    protected void setError() {
    }

    @Override
    public void write(int n3) {
        this.write(new byte[]{(byte)n3}, 0, 1);
    }

    @Override
    public void write(byte[] byArray) {
        this.write(byArray, 0, byArray.length);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void write(byte[] byArray, int n3, int n4) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                Object object;
                block6: {
                    try {
                        if (this.d != null) break block6;
                        this.b = ByteBuffer.allocate(80);
                        this.c = CharBuffer.allocate(80);
                        object = Charset.defaultCharset().newDecoder();
                        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
                        this.d = ((CharsetDecoder)object).onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                n4 += n3;
                while (true) {
                    if (n3 >= n4) {
                        this.a(false);
                        return;
                    }
                    int n5 = Math.min(this.b.remaining(), n4 - n3);
                    this.b.put(byArray, n3, n5);
                    n3 += n5;
                    this.b.flip();
                    do {
                        object = this.d.decode(this.b, this.c, false);
                        this.c.flip();
                        this.a.append(this.c);
                        this.c.clear();
                    } while (((CoderResult)object).isOverflow());
                    this.b.compact();
                }
            }
            throw throwable2;
        }
    }
}

