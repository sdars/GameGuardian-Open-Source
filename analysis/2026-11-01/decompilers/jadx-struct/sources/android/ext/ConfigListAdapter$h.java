package android.ext;

import android.app.AlertDialog$Builder;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.view.View;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$layout;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$h implements DialogInterface$OnClickListener {
    ConfigListAdapter$h() {
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            new r$n("kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2fdwhjru|250ylghr0wxwruldov2").onClick(dialogInterface, i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        int[] iArr = ConfigListAdapter.h;
        int i2 = (i - 1) * 3;
        sb.append(b2.f(iArr[i2]));
        sb.append(":\n");
        sb.append(b2.f(iArr[i2 + 1]));
        String string = sb.toString();
        int i3 = iArr[i2 + 2];
        if (i3 >= 0) {
            String str = string.trim() + "\n\n";
            if (str.charAt(str.length() - 3) != ':') {
                str = str + b2.f(R$string.video) + ":\n";
            }
            string = str + Tools.removeNewLinesChars(ConfigListAdapter.i[i3]);
        }
        if (iArr[i2] == 2131296613) {
            string = string.replace(b2.f(R$string.s), b2.f(R$string.app_name)) + "\nhttps://productforums.google.com/forum/#!topic/translate/1Pywh5vI1kE\n\n" + Tools.N1(R$string.without_float) + ":\n" + Tools.removeNewLinesChars("kwwsv=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25730krz0wr0xvh0jdphjxdugldq0zlwkrxw0iordw0zlqgrz0jdphjxdugldq2");
        }
        View viewF = a.d.f(R$layout.main_new_version, null);
        TextView textView = (TextView) viewF.findViewById(R$id.changelog);
        Tools.v1(textView, string);
        Tools.u(textView.getText());
        AlertDialog$Builder negativeButton = f.b().setView(viewF).setNegativeButton(b2.f(R$string.ok), ConfigListAdapter.h());
        if (iArr[i2] == 2131297106) {
            negativeButton.setPositiveButton(R$string.more, new r$n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf24<7540yluwxdo0vsdfhv0wr0uxq0jdphjxdugldq0zlwkrxw0urrw2"));
        }
        f.o(negativeButton);
        if (Config.C && iArr[i2] == 2131296621) {
            byte b2 = 2;
            try {
                if ((Tools.Y(Config.E).flags & 2) == 0) {
                    f.o(f.b().setMessage(Tools.L1(b2.f(R$string.not_optimized2), Config.F, Config.F)).setNeutralButton(b2.f(R$string.fix_it), new r$n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf24<7540yluwxdo0vsdfhv0wr0uxq0jdphjxdugldq0zlwkrxw0urrw2")).setNegativeButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null));
                }
            } catch (Throwable th) {
                e1.s("Failed check vSpace: " + Config.E, th);
            }
            byte b3 = Config.G;
            if (b3 == 0) {
                if (ConfigListAdapter.k() && Config.E.contains("64")) {
                    b2 = 1;
                }
                Config.G = b2;
                b3 = b2;
            }
            if (b3 == 1) {
                try {
                    f.o(f.b().setMessage(b2.f(R$string.vspace64)).setNegativeButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null));
                } catch (Throwable th2) {
                    e1.s("Failed check vSpace: " + Config.E, th2);
                }
            }
        }
    }
}
