/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.text.SpannableString
 *  android.text.style.URLSpan
 *  android.util.AndroidRuntimeException
 *  android.view.View
 *  android.view.WindowManager$BadTokenException
 *  android.widget.TextView
 */
package android.ext;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.ext.Tools;
import android.ext.e1;
import android.ext.f;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class DefensiveURLSpan
extends URLSpan {
    public DefensiveURLSpan(String string2) {
        super(string2);
    }

    public static void a(TextView textView) {
        DefensiveURLSpan.b(textView.getText());
    }

    public static void b(CharSequence uRLSpanArray) {
        if (uRLSpanArray instanceof SpannableString) {
            SpannableString spannableString = (SpannableString)uRLSpanArray;
            for (URLSpan uRLSpan : (URLSpan[])spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
                int n3 = spannableString.getSpanStart((Object)uRLSpan);
                int n4 = spannableString.getSpanEnd((Object)uRLSpan);
                spannableString.removeSpan((Object)uRLSpan);
                spannableString.setSpan((Object)new DefensiveURLSpan(uRLSpan.getURL()), n3, n4, 0);
            }
        }
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onClick(View view) {
        void var1_6;
        CharSequence charSequence;
        block14: {
            block11: {
                block12: {
                    block13: {
                        try {
                            super.onClick(view);
                            charSequence = null;
                        }
                        catch (SecurityException securityException) {
                        }
                        catch (WindowManager.BadTokenException badTokenException) {
                        }
                        catch (AndroidRuntimeException androidRuntimeException) {
                            // empty catch block
                        }
                        if (charSequence == null) break block13;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("failed onClick on URLSpan: ");
                        stringBuilder.append(this.getURL());
                        e1.s(stringBuilder.toString(), (Throwable)((Object)charSequence));
                        stringBuilder = Uri.parse((String)this.getURL());
                        Context context = view.getContext();
                        view = new Intent("android.intent.action.VIEW", (Uri)stringBuilder);
                        view.putExtra("com.android.browser.application_id", Tools.C0());
                        view.setFlags(0x10000000);
                        {
                            catch (ActivityNotFoundException activityNotFoundException) {
                                break block11;
                            }
                        }
                        try {
                            context.startActivity((Intent)view);
                        }
                        catch (Throwable throwable) {
                            try {
                                StringBuilder stringBuilder2 = new StringBuilder();
                                stringBuilder2.append("failed2 onClick on URLSpan: ");
                                stringBuilder2.append(this.getURL());
                                e1.s(stringBuilder2.toString(), (Throwable)((Object)charSequence));
                            }
                            catch (SecurityException securityException) {
                                break block12;
                            }
                        }
                    }
                    f.d();
                    return;
                }
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("failed onClick on URLSpan: ");
                ((StringBuilder)charSequence).append(this.getURL());
                charSequence = ((StringBuilder)charSequence).toString();
                break block14;
            }
            charSequence = "failed call activity";
        }
        e1.s((String)charSequence, (Throwable)var1_6);
    }
}

