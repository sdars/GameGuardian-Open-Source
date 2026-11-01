package android.ext;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.WindowManager$BadTokenException;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class DefensiveURLSpan extends URLSpan {
    public DefensiveURLSpan(String str) {
        super(str);
    }

    public static void a(TextView textView) {
        b(textView.getText());
    }

    public static void b(CharSequence charSequence) {
        if (charSequence instanceof SpannableString) {
            SpannableString spannableString = (SpannableString) charSequence;
            for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
                int spanStart = spannableString.getSpanStart(uRLSpan);
                int spanEnd = spannableString.getSpanEnd(uRLSpan);
                spannableString.removeSpan(uRLSpan);
                spannableString.setSpan(new DefensiveURLSpan(uRLSpan.getURL()), spanStart, spanEnd, 0);
            }
        }
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        String str;
        try {
            try {
                super.onClick(view);
                e = null;
            } catch (ActivityNotFoundException e2) {
                e = e2;
                str = "failed call activity";
                e1.s(str, e);
                return;
            }
        } catch (AndroidRuntimeException e3) {
            e = e3;
        } catch (WindowManager$BadTokenException e4) {
            e = e4;
        } catch (SecurityException e5) {
            e = e5;
        }
        if (e != null) {
            try {
                e1.s("failed onClick on URLSpan: " + getURL(), e);
                Uri uri = Uri.parse(getURL());
                Context context = view.getContext();
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.putExtra("com.android.browser.application_id", Tools.C0());
                intent.setFlags(268435456);
                try {
                    context.startActivity(intent);
                } catch (Throwable unused) {
                    e1.s("failed2 onClick on URLSpan: " + getURL(), e);
                }
            } catch (SecurityException e6) {
                e = e6;
                str = "failed onClick on URLSpan: " + getURL();
                e1.s(str, e);
                return;
            }
        }
        f.d();
    }
}
