/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.content.Context;
import android.ext.Config;
import android.fix.ImageButtonView;
import android.util.AttributeSet;
import android.view.View;

public class HexConverter
extends ImageButtonView
implements View.OnClickListener {
    private boolean a = true;

    public HexConverter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a();
    }

    private void a() {
        this.setOnClickListener(this);
        if (!this.isInEditMode()) {
            this.setImageResource(2130968588);
            Config.m(this);
        }
    }

    private String b(String string2, char c4, boolean bl) {
        int n3;
        int n4 = string2.length();
        int n5 = 0;
        int n6 = 0;
        if (bl) {
            int n7 = 0;
            while (n6 < n4 - 2 && string2.charAt(n6) == c4) {
                n7 = ++n6 & 0xFFFFFFFE;
            }
            n3 = n7;
        } else {
            n6 = n4 - 1;
            int n8 = n4;
            while (true) {
                n4 = n8;
                n3 = n5;
                if (n6 < 2) break;
                n4 = n8;
                n3 = n5;
                if (string2.charAt(n6) != c4) break;
                n8 = n6 + 1 & 0xFFFFFFFE;
                --n6;
            }
        }
        return string2.substring(n3, n4);
    }

    /*
     * Exception decompiling
     */
    public void onClick(View var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 9[TRYBLOCK] [9 : 495->506)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void setUseXor(boolean bl) {
        this.a = bl;
    }
}

