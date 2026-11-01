/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.Tools;
import android.ext.e1;
import android.ext.f1;
import android.ext.g0;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.zip.GZIPOutputStream;

public abstract class z2 {
    public static byte[] a(byte[] byArray) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(byArray.length);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        ((OutputStream)gZIPOutputStream).write(byArray);
        ((OutputStream)gZIPOutputStream).close();
        byArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return Base64.encode((byte[])byArray, (int)0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static boolean b(byte[] byArray) {
        try {
            Object object = new URL(Tools.removeNewLinesChars("kwws=22jdphjxdugldq1qhw2JJborjv2xvdjh1sks"));
            Object object2 = ((URL)object).openConnection();
            ((URLConnection)object2).setDoOutput(true);
            Object object3 = ((URLConnection)object2).getOutputStream();
            object = z2.a(byArray);
            ((OutputStream)object3).write((byte[])object);
            ((OutputStream)object3).close();
            Object object4 = new InputStreamReader(((URLConnection)object2).getInputStream());
            object3 = new BufferedReader((Reader)object4);
            object4 = new StringBuilder();
            while (true) {
                if ((object2 = ((BufferedReader)object3).readLine()) == null) {
                    boolean bl = "OK".equals(((StringBuilder)object4).toString());
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append("UsageStats compress from ");
                    ((StringBuilder)object3).append(byArray.length);
                    ((StringBuilder)object3).append(" to ");
                    ((StringBuilder)object3).append(((Object)object).length);
                    ((StringBuilder)object3).append(", sended: ");
                    ((StringBuilder)object3).append(bl);
                    e1.d(((StringBuilder)object3).toString());
                    return bl;
                }
                ((StringBuilder)object4).append((String)object2);
            }
        }
        catch (Exception exception) {}
        e1.g("UsageStats send fail", exception);
        return false;
    }

    public static boolean c(String string2) {
        return z2.d(string2, false);
    }

    public static boolean d(String object, boolean bl) {
        if (Boolean.TRUE.equals(f1.a)) {
            e1.d("NLV - log not sended");
            return true;
        }
        if (bl) {
            object = Executors.newSingleThreadExecutor().submit(new Callable((String)object){
                final String a;
                {
                    this.a = string2;
                }

                public Boolean a() {
                    return z2.b(this.a.getBytes());
                }
            });
            try {
                bl = (Boolean)object.get();
                return bl;
            }
            catch (Throwable throwable) {
                e1.s("sendLog", throwable);
                return false;
            }
        }
        new g0(new Runnable((String)object){
            final String a;
            {
                this.a = string2;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void run() {
                synchronized (this) {
                    z2.b(this.a.getBytes());
                    return;
                }
            }
        }, "sendLog").start();
        return true;
    }
}

