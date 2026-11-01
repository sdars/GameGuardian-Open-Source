/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.content.Context;
import android.ext.Config;
import android.ext.Tools;
import android.ext.e1;
import android.ext.g0;
import android.ext.n2;
import android.os.Handler;
import android.widget.Toast;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public abstract class p2 {
    private static volatile Toast a;
    private static final Object b;
    private static volatile WeakReference c;
    private static final Object d;
    private static volatile WeakReference e;
    private static Context f;
    private static Context g;

    static {
        b = new Object();
        d = new Object();
        new g0(new Runnable(){

            /*
             * Exception decompiling
             */
            @Override
            public void run() {
                /*
                 * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                 * 
                 * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 26->32)] java.lang.Throwable
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
                 *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
                 *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
                 *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
                 *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
                 *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
                 *     at org.benf.cfr.reader.Main.main(Main.java:54)
                 */
                throw new IllegalStateException("Decompilation failed");
            }
        }, "toastThread").start();
        f = null;
        g = null;
    }

    static /* synthetic */ Toast b() {
        return a;
    }

    static /* synthetic */ Toast c(Toast toast2) {
        a = toast2;
        return toast2;
    }

    private static void f(Toast toast2) {
        if (toast2 != null) {
            n2.i(new Runnable(toast2){
                final Toast a;
                {
                    this.a = toast2;
                }

                @Override
                public void run() {
                    try {
                        this.a.cancel();
                    }
                    catch (Throwable throwable) {
                        e1.s("Toast cancel", throwable);
                    }
                }
            });
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Toast g(Toast toast2) {
        Object object = Toast.class.getDeclaredField("mTN");
        ((AccessibleObject)object).setAccessible(true);
        Object object2 = ((Field)object).get(toast2);
        for (Field field : object2.getClass().getDeclaredFields()) {
            Throwable throwable2;
            block6: {
                block5: {
                    block4: {
                        try {
                            object = field.getName();
                            if (((String)object).equals("mShow") || ((String)object).equals("mHide")) break block4;
                            if (!((String)object).equals("mHandler")) continue;
                            ((AccessibleObject)field).setAccessible(true);
                            object = field.get(object2);
                            if (!(object instanceof Handler)) continue;
                            object = Tools.x.a((Handler)object);
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    ((AccessibleObject)field).setAccessible(true);
                    object = field.get(object2);
                    if (!(object instanceof Runnable)) continue;
                    object = Tools.z.a((Runnable)object);
                }
                field.set(object2, object);
                continue;
            }
            e1.a(throwable2);
            return toast2;
        }
        return toast2;
    }

    public static Context h() {
        Context context;
        Context context2 = context = Tools.f0();
        if (Config.vSpaceReal) {
            context2 = context;
            if (!Config.D) {
                context2 = f;
                if (context2 == null || context2 != context) {
                    g = Config.a(context);
                    f = context;
                }
                context2 = g;
            }
        }
        return context2;
    }

    public static void i() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void j(Toast object) {
        Object object2;
        WeakReference weakReference;
        Object object3 = d;
        synchronized (object3) {
            weakReference = c;
            weakReference = weakReference == null ? null : (Toast)weakReference.get();
            c = null;
            object2 = e;
            object2 = object2 == null ? null : (Runnable)((Reference)object2).get();
            e = null;
        }
        p2.g(object).show();
        Runnable runnable = new Runnable((Toast)object){
            final Toast a;
            {
                this.a = toast2;
            }

            @Override
            public void run() {
                p2.f(this.a);
            }
        };
        synchronized (object3) {
            WeakReference<Toast> weakReference2;
            c = weakReference2 = new WeakReference<Toast>((Toast)object);
            object = new WeakReference(runnable);
            e = object;
        }
        object = b;
        synchronized (object) {
            object3 = a;
            a = null;
        }
        p2.f((Toast)object3);
        p2.f((Toast)weakReference);
        object = n2.d();
        if (object2 != null) {
            object.removeCallbacks((Runnable)object2);
        }
        object.postDelayed(runnable, 3000L);
    }
}

