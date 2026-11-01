package android.ext;

import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.ActivityMain;
import catch_.me_.if_.you_.can_.MainActivity;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class ConfigListAdapter extends BaseAdapter implements AdapterView.OnItemClickListener {
    public static final String DEVS = "\td2dyno - __owner__, __design__, __pm__.\n\tEnyby - __code__, __pm__.\n\tTrasd - __tech__, __pm__.\n\tAqua - __creator__.\n".intern();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static long f47g = 0;
    static final int[] h = {2131296606, 2131296535, -1, 2131296526, 2131296525, -1, 2131296523, 2131296522, 2, 2131296613, 2131296611, -1, 2131296651, 2131296650, 21, 2131296531, 2131296530, -1, 2131296657, 2131296656, 1, 2131296630, 2131296628, 6, 2131296649, 2131296648, 5, 2131296529, 2131296528, 7, 2131296947, 2131296618, 0, 2131296641, 2131296640, 8, 2131296609, 2131296608, 9, 2131296658, 2131296659, 12, 2131296669, 2131296668, 11, 2131296653, 2131296652, 20, 2131296643, 2131296642, 16, 2131296645, 2131296644, 4, 2131296661, 2131296660, 3, 2131296655, 2131296654, 10, 2131296626, 2131296623, 14, 2131296633, 2131296625, 24, 2131296637, 2131296636, -1, 2131296632, 2131296631, -1, 2131296647, 2131296646, 17, 2131296663, 2131296662, 22, 2131296616, 2131296615, 23, 2131296521, 2131296520, 13, 2131297065, 2131296664, 18, 2131296906, 2131297100, 15, 2131296381, 2131297099, -1, 2131297106, 2131297105, 19, 2131296621, 2131296620, -1, 2131296614, 2131296360, -1, 2131296639, 2131296638, 25};
    static final String[] i = {"kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh24950vhdufk0xqnqrz0zlwk0nqrzq0fkdqjhv0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25570vshhg0kdfn0dqg0wlph0mxps0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh248;0krz0xvh0h|h0lfrq0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh248<0krz0vhdufk0hqfu|swhg0ydoxh0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh24970frpsduh0phwkrgv0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh24<40klvwru|0xvdjh0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25550h{dpsoh0ri0udqjh0vhdufk0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25590krz0wr0vhdufk0urxqghg0ydoxh0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh255<0krz0wr0xvh0rughuhg0jurxs0vhdufk0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh248<0krz0vhdufk0hqfu|swhg0ydoxh0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25960h{dpsoh0ri0wkh0pdvn0vhdufk0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh255:0krz0wr0xvh0iloo0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh24<50krz0wr0vshhg0xs0vhdufk0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25;60{ru0vhdufk0jxlgh0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28:80;330wh{w0vwulqj0kh{0dre0vhdufk0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26690rswlrq0dgg0wr0ydoxh0gr0qrw0uhsodfh0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26860lpsorvlrq0qhyhu0orvh0krsh0kdfn0ohyho0klgh0iurp0wkh0jdph0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26870lpsorvlrq0qhyhu0orvh0krsh0kdfn0fuhglwv0klgh0iurp0wkh0jdph0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26930lpsorvlrq0qhyhu0orvh0krsh0kdfn0fuhglwv0uhvwduw0zlwkrxw0surwhfwlrq0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26950lpsorvlrq0qhyhu0orvh0krsh0kdfn0fuhglwv0glvdeoh0surwhfwlrq0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28680:530xvh0urrw0iurp0yluwxdo0vsdfh0iru0klgh0jdphjxdugldq0yluwxdo{srvhg0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28;30iuhh0iluh0dyrlg0ghwhfwlrq0urrw0iurp0yluwxdo0vsdfh0yluwxdo{srvhg0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28;40dyrlg0ghwhfwlrq0urrw0iurp0yluwxdo0vsdfh0yluwxdo{srvhg0jdphjxdugldq2\r\rkwwsv=22jdphjxdugldq1qhw2iruxp2wdjv2dss0klgh2\r\rkwwsv=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28;80dyrlg0ghwhfwlrq0urrw0iurp0yluwxdo0vsdfh0pxowlsoh0dffrxqwv0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26;80uhvwduw0zlwkrxw0surwhfwlrq0uhsdlu0wkh0uherrw0uxq0jdphjxdugldq0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26;70uhvwduw0zlwkrxw0surwhfwlrq0uhsdlu0wkh0uherrw0uherrw0ghylfh0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh267:0krz0wr0vhdufk0ilowhu0lq0wkh0phpru|0hglwru0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26770krz0wr0txlfno|0vhdufk0iru0srlqwhuv0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26990xqudqgrpl}hu0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26;40uxvvldq0vorwv0kdfn0vwruh0xqudqgrpl}hu0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2qrurrw", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh27480ilowhuv0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2ilohv2fdwhjru|290oxd0vfulswv2\r\rkwws=22jdphjxdugldq1qhw2khos2", "kwws=22jdphjxdugldq1qhw2iruxp2ilohv2iloh2:970xqdoljqhg0vhdufk2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh286:0:630irupxod0fdofxodwru0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh286;0jxq0zdu0vkrrwlqj0jdphv0kdfn0sulfh0irupxod0fdofxodwru0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28680:530xvh0urrw0iurp0yluwxdo0vsdfh0iru0klgh0jdphjxdugldq0yluwxdo{srvhg0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28;30iuhh0iluh0dyrlg0ghwhfwlrq0urrw0iurp0yluwxdo0vsdfh0yluwxdo{srvhg0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28;40dyrlg0ghwhfwlrq0urrw0iurp0yluwxdo0vsdfh0yluwxdo{srvhg0jdphjxdugldq2\r\rkwwsv=22jdphjxdugldq1qhw2iruxp2wdjv2dss0klgh2\r\rkwwsv=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28;80dyrlg0ghwhfwlrq0urrw0iurp0yluwxdo0vsdfh0pxowlsoh0dffrxqwv0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh29470il{lqj0d0vfulsw0xvlqj0dvvhpeohu0jdphjxdugldq2"};
    private static boolean j = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f49b = new WeakReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference f50c = new WeakReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WeakReference f51d = new WeakReference(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f52e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Tools.a0 f53f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View[] f48a = d.b.f1510b;

    class a extends g0 {

        /* JADX INFO: renamed from: android.ext.ConfigListAdapter$a$a, reason: collision with other inner class name */
        class RunnableC0002a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ StringBuilder f55a;

            RunnableC0002a(StringBuilder sb) {
                this.f55a = sb;
            }

            @Override // java.lang.Runnable
            public void run() {
                Tools.u1(android.ext.f.m(android.ext.f.b().setCustomTitle(Tools.g0(2131296316)).setMessage(this.f55a.toString()).setNegativeButton(b2.f(2131296836), (DialogInterface.OnClickListener) null).create()));
            }
        }

        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            StringBuilder sb = new StringBuilder();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL(Tools.removeNewLinesChars("kwws=22jdphjxdugldq1qhw2yhuvlrq1w{w")).openStream()));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                bufferedReader.close();
            } catch (Throwable th) {
                e1.l("Load changelog", th);
                sb.append(th.toString());
            }
            n2.i(new RunnableC0002a(sb));
        }
    }

    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Config.f30c = 0L;
            Config.k();
        }
    }

    class c implements DialogInterface.OnClickListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            ConfigListAdapter.j(i);
        }
    }

    class d implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MainService f59a;

        d(MainService mainService) {
            this.f59a = mainService;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.f59a.i.s();
        }
    }

    class e implements DialogInterface.OnClickListener {
        e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            y0.c();
        }
    }

    class f implements DialogInterface.OnClickListener {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    MainService mainService = MainService.instance;
                    mainService.t();
                    mainService.j.m();
                    mainService.m1(false);
                } catch (Throwable th) {
                    e1.l("Failed restore after take screenshot", th);
                }
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MainService.instance.i.T0();
            }
        }

        f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            MainService mainService = MainService.instance;
            try {
                mainService.t();
                n2.d().postDelayed(new a(), 8000L);
                mainService.m1(true);
                mainService.j.e();
                n2.d().postDelayed(new b(), 300L);
            } catch (Throwable th) {
                e1.l("Failed take screenshot", th);
                try {
                    mainService.j.m();
                } catch (Throwable th2) {
                    e1.l("Failed restore after take screenshot", th2);
                }
            }
        }
    }

    class g implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String[] f64a;

        class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean[] f65a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f66b;

            a(boolean[] zArr, int i) {
                this.f65a = zArr;
                this.f66b = i;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i == -1 || i == -3) {
                    long j = -1;
                    if (i == -1) {
                        int i2 = 0;
                        while (true) {
                            boolean[] zArr = this.f65a;
                            if (i2 >= zArr.length) {
                                break;
                            }
                            j = zArr[i2] ? j | ((long) (1 << i2)) : j & ((long) (~(1 << i2)));
                            i2++;
                        }
                    }
                    if ((((long) ((1 << this.f65a.length) - 1)) & j) == 0) {
                        j |= 1;
                    }
                    Config.f29b[this.f66b] = j;
                    Config.k();
                }
                ConfigListAdapter.c();
            }
        }

        class b implements DialogInterface.OnMultiChoiceClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean[] f68a;

            b(boolean[] zArr) {
                this.f68a = zArr;
            }

            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public void onClick(DialogInterface dialogInterface, int i, boolean z) {
                this.f68a[i] = z;
            }
        }

        g(String[] strArr) {
            this.f64a = strArr;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            p1[] p1VarArr = MainService.J0[i / 2];
            int length = p1VarArr.length;
            CharSequence[] charSequenceArr = new CharSequence[length];
            Drawable[] drawableArr = new Drawable[p1VarArr.length];
            boolean[] zArr = new boolean[length];
            long j = Config.f29b[i];
            for (int i2 = 0; i2 < length; i2++) {
                charSequenceArr[i2] = p1VarArr[i2].toString();
                zArr[i2] = ((1 << i2) & j) != 0;
                drawableArr[i2] = p1VarArr[i2].c();
            }
            a aVar = new a(zArr, i);
            AlertDialog alertDialogCreate = android.ext.f.c(Tools.k0()).setCustomTitle(Tools.h0(this.f64a[i])).setMultiChoiceItems(charSequenceArr, zArr, new b(zArr)).setPositiveButton(b2.f(2131296917), aVar).setNeutralButton(b2.f(2131296898), aVar).setNegativeButton(b2.f(2131296311), aVar).create();
            ListView listView = alertDialogCreate.getListView();
            if (listView != null) {
                Tools.e(listView, charSequenceArr, drawableArr, Config.d(), 2131361799);
            }
            android.ext.f.m(alertDialogCreate);
        }
    }

    class h implements DialogInterface.OnClickListener {
        h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                new android.ext.r.n("kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2fdwhjru|250ylghr0wxwruldov2").onClick(dialogInterface, i);
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
                    str = str + b2.f(2131297086) + ":\n";
                }
                string = str + Tools.removeNewLinesChars(ConfigListAdapter.i[i3]);
            }
            if (iArr[i2] == 2131296613) {
                string = string.replace(b2.f(2131296916), b2.f(2131296280)) + "\nhttps://productforums.google.com/forum/#!topic/translate/1Pywh5vI1kE\n\n" + Tools.N1(2131297101) + ":\n" + Tools.removeNewLinesChars("kwwsv=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25730krz0wr0xvh0jdphjxdugldq0zlwkrxw0iordw0zlqgrz0jdphjxdugldq2");
            }
            View viewF = a.d.f(2131099658, null);
            TextView textView = (TextView) viewF.findViewById(2131034148);
            Tools.v1(textView, string);
            Tools.u(textView.getText());
            AlertDialog.Builder negativeButton = android.ext.f.b().setView(viewF).setNegativeButton(b2.f(2131296836), ConfigListAdapter.h());
            if (iArr[i2] == 2131297106) {
                negativeButton.setPositiveButton(2131296786, new android.ext.r.n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf24<7540yluwxdo0vsdfhv0wr0uxq0jdphjxdugldq0zlwkrxw0urrw2"));
            }
            android.ext.f.o(negativeButton);
            if (Config.C && iArr[i2] == 2131296621) {
                byte b2 = 2;
                try {
                    if ((Tools.Y(Config.E).flags & 2) == 0) {
                        android.ext.f.o(android.ext.f.b().setMessage(Tools.L1(b2.f(2131296819), Config.F, Config.F)).setNeutralButton(b2.f(2131296455), new android.ext.r.n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf24<7540yluwxdo0vsdfhv0wr0uxq0jdphjxdugldq0zlwkrxw0urrw2")).setNegativeButton(b2.f(2131296836), (DialogInterface.OnClickListener) null));
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
                        android.ext.f.o(android.ext.f.b().setMessage(b2.f(2131297089)).setNegativeButton(b2.f(2131296836), (DialogInterface.OnClickListener) null));
                    } catch (Throwable th2) {
                        e1.s("Failed check vSpace: " + Config.E, th2);
                    }
                }
            }
        }
    }

    class i implements DialogInterface.OnClickListener {
        i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            ConfigListAdapter.s();
        }
    }

    class j extends g0 {
        j(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Tools.K1("Logcat: " + b2.f(2131296754), 0);
            Tools.h(new GregorianCalendar().getTime().toString() + '\n' + h0.f(true), 3);
        }
    }

    class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Tools.a0 f71a;

        k(Tools.a0 a0Var) {
            this.f71a = a0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            Tools.A1(MainService.instance.Y, this.f71a);
        }
    }

    class l implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ EditTextPath f73a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AlertDialog f74b;

        l(EditTextPath editTextPath, AlertDialog alertDialog) {
            this.f73a = editTextPath;
            this.f74b = alertDialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String strQ1 = Tools.Q1(this.f73a.getText().toString().trim());
            if (strQ1.length() > 0) {
                if (!Tools.f1(strQ1)) {
                    return;
                } else {
                    y0.b(strQ1, 4);
                }
            }
            e1.d("save path: " + strQ1);
            new g2().k("temp-path", strQ1, "").commit();
            MainService mainService = MainService.instance;
            mainService.i.B0(mainService.I());
            mainService.q(true);
            Tools.D(this.f74b);
        }
    }

    class m implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f75a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AlertDialog f76b;

        m(View.OnClickListener onClickListener, AlertDialog alertDialog) {
            this.f75a = onClickListener;
            this.f76b = alertDialog;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.f75a.onClick(this.f76b.getButton(-1));
        }
    }

    class n implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f77a;

        n(View.OnClickListener onClickListener) {
            this.f77a = onClickListener;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Tools.s1(dialogInterface, -1, null, this.f77a);
        }
    }

    class o implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ EditTextPath f78a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckBox f79b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AlertDialog f80c;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f81a;

            /* JADX INFO: renamed from: android.ext.ConfigListAdapter$o$a$a, reason: collision with other inner class name */
            class RunnableC0003a implements Runnable {
                RunnableC0003a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    a aVar = a.this;
                    o oVar = o.this;
                    oVar.c(aVar.f81a, oVar.f79b.isChecked());
                }
            }

            a(String str) {
                this.f81a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.b();
                try {
                    e2.d dVarJ = e2.j(this.f81a);
                    if (dVarJ.f756a.contains("uid=0")) {
                        n2.i(new RunnableC0003a());
                    } else {
                        o.this.a(dVarJ.f756a);
                    }
                } catch (Throwable th) {
                    o.this.a(th.getMessage());
                }
                e2.f745a = "";
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MainService.instance != null) {
                    MainService.instance.t();
                }
                o.this.f80c.hide();
            }
        }

        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f80c.show();
            }
        }

        o(EditTextPath editTextPath, CheckBox checkBox, AlertDialog alertDialog) {
            this.f78a = editTextPath;
            this.f79b = checkBox;
            this.f80c = alertDialog;
        }

        void a(String str) {
            n2.i(new c());
            Tools.h(str + "\n\n" + e2.f745a, 0);
        }

        void b() {
            n2.i(new b());
        }

        void c(String str, boolean z) {
            e1.d("su path: " + str + "; sh: " + z);
            new g2().k("su", str, "").c("sh", z, false).commit();
            if (str.length() != 0) {
                y0.b(str, 4);
            }
            Tools.D(this.f80c);
            ConfigListAdapter.m();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String strTrim = this.f78a.getText().toString().trim();
            if (strTrim.length() <= 0) {
                c(strTrim, this.f79b.isChecked());
                return;
            }
            new n0.i(new a(strTrim), "CheckSu: " + strTrim).start();
        }
    }

    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConfigListAdapter.e();
        }
    }

    class q implements Comparator {
        q() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return (str + "_zzz").replace('-', '_').compareTo((str2 + "_zzz").replace('-', '_'));
        }
    }

    class r implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ListAdapter f86a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f87b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f88c;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    android.ext.k.i((String) r.this.f88c.get(i));
                    ConfigListAdapter.m();
                } catch (IndexOutOfBoundsException e2) {
                    e1.l("Failed get locale for index: " + i, e2);
                }
                Tools.D(dialogInterface);
            }
        }

        r(ListAdapter listAdapter, int i, List list) {
            this.f86a = listAdapter;
            this.f87b = i;
            this.f88c = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.f.o(android.ext.f.c(Tools.k0()).setCustomTitle(Tools.g0(2131296950)).setSingleChoiceItems(this.f86a, this.f87b, new a()));
        }
    }

    class s implements Config.p.a {
        s() {
        }

        @Override // android.ext.Config.p.a
        public int a(DialogInterface dialogInterface, int i) {
            if (i != 1 || InternalKeyboard.a()) {
                return i;
            }
            MainService.I0();
            return 0;
        }
    }

    class t implements Config.p.a {
        t() {
        }

        @Override // android.ext.Config.p.a
        public int a(DialogInterface dialogInterface, int i) {
            if (i != Config.o) {
                ConfigListAdapter.m();
            }
            return i;
        }
    }

    class u implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SeekBar f92a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SeekBar f93b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SeekBar f94c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f95d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ImageView f96e;

        u(SeekBar seekBar, SeekBar seekBar2, SeekBar seekBar3, TextView textView, ImageView imageView) {
            this.f92a = seekBar;
            this.f93b = seekBar2;
            this.f94c = seekBar3;
            this.f95d = textView;
            this.f96e = imageView;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            ConfigListAdapter.this.w((10 - this.f92a.getProgress()) / 10.0f, this.f93b.getMax() == this.f93b.getProgress() ? -1 : this.f93b.getProgress(), this.f95d, this.f96e, this.f94c.getProgress());
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    class v implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MainService f98a;

        v(MainService mainService) {
            this.f98a = mainService;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.f98a.v0();
        }
    }

    class w implements DialogInterface.OnClickListener {
        w() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("GG: ");
            float f2 = 1;
            sb.append((113.9f * f2) - 12.5f);
            sb.append(" (");
            sb.append((int) (((f2 * 16694.6f) - 539.6f) + 0.5f));
            sb.append("); Android: ");
            sb.append(Build.VERSION.RELEASE);
            sb.append(" (");
            sb.append(Build.VERSION.SDK_INT);
            sb.append(") [");
            sb.append(f1.x());
            sb.append(']');
            Tools.A(sb.toString(), false);
        }
    }

    class x implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ EditTextSpeeds f101a;

        x(EditTextSpeeds editTextSpeeds) {
            this.f101a = editTextSpeeds;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f101a.setText(d1.c());
        }
    }

    class y implements EditTextSpeeds.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ EditTextSpeeds f103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f104b;

        y(EditTextSpeeds editTextSpeeds, TextView textView) {
            this.f103a = editTextSpeeds;
            this.f104b = textView;
        }

        @Override // android.ext.EditTextSpeeds.a
        public void a(EditText editText, int i, int i2) {
            c();
        }

        @Override // android.ext.EditTextSpeeds.a
        public void b(EditText editText, CharSequence charSequence, int i, int i2, int i3) {
            c();
        }

        public void c() {
            String strL1;
            EditTextSpeeds editTextSpeeds = this.f103a;
            if (editTextSpeeds == null || this.f104b == null) {
                strL1 = "?";
            } else {
                try {
                    String strTrim = editTextSpeeds.getText().toString().trim();
                    int selectionStart = this.f103a.getSelectionStart();
                    if (selectionStart < 0) {
                        selectionStart = 0;
                    }
                    if (selectionStart >= strTrim.length()) {
                        selectionStart = strTrim.length() - 1;
                    }
                    int i = -1;
                    int iLastIndexOf = selectionStart <= 0 ? -1 : strTrim.lastIndexOf(59, selectionStart - 1);
                    if (iLastIndexOf >= 0) {
                        i = iLastIndexOf;
                    }
                    int iIndexOf = strTrim.indexOf(59, selectionStart);
                    if (iIndexOf < 0) {
                        iIndexOf = strTrim.length();
                    }
                    double dJ1 = Tools.j1(strTrim.substring(i + 1, iIndexOf));
                    if (dJ1 > 0.0d) {
                        d1.a aVarD = d1.d(dJ1);
                        strL1 = Tools.L1(b2.f(2131296977), Tools.g1(aVarD.f719b), Tools.g1(aVarD.f718a));
                    } else {
                        strL1 = "??";
                    }
                } catch (NumberFormatException unused) {
                    strL1 = "???";
                }
            }
            this.f104b.setText(strL1);
        }
    }

    class z implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ EditTextSpeeds f106a;

        z(EditTextSpeeds editTextSpeeds) {
            this.f106a = editTextSpeeds;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            String strTrim = this.f106a.getText().toString().trim();
            y0.b(strTrim, 16);
            MainService.instance.k0.g(strTrim);
        }
    }

    public ConfigListAdapter() {
        HotPoint hotPoint = MainService.instance.j;
        w(hotPoint.getLayoutAlpha(), hotPoint.getVanishingTime(), null, null, hotPoint.getSize());
        x();
    }

    public static void a(String str) {
        e1.d("mConfigTempPath onClick");
        View viewF = a.d.f(2131099688, null);
        EditTextPath editTextPath = (EditTextPath) viewF.findViewById(2131034423);
        SharedPreferences sharedPreferencesM0 = Tools.M0();
        if (str == null) {
            str = sharedPreferencesM0.getString("temp-path", "");
        }
        editTextPath.setText(str);
        editTextPath.setDataType(4);
        editTextPath.setPathType(0);
        ((TextView) viewF.findViewById(2131034422)).setText(b2.f(2131296852) + '\n' + b2.f(2131296853));
        viewF.findViewById(2131034354).setTag(editTextPath);
        AlertDialog alertDialogCreate = android.ext.f.b().setView(InternalKeyboard.e(viewF, false)).setPositiveButton(b2.f(2131296334), (DialogInterface.OnClickListener) null).setNegativeButton(b2.f(2131296311), (DialogInterface.OnClickListener) null).create();
        l lVar = new l(editTextPath, alertDialogCreate);
        v2.a((Button) viewF.findViewById(2131034434), editTextPath);
        r(alertDialogCreate, lVar, editTextPath);
    }

    public static void b() {
        if (f1.y()) {
            View viewF = a.d.f(2131099688, null);
            EditTextPath editTextPath = (EditTextPath) viewF.findViewById(2131034423);
            SharedPreferences sharedPreferencesM0 = Tools.M0();
            editTextPath.setText(sharedPreferencesM0.getString("su", ""));
            editTextPath.setDataType(4);
            editTextPath.setPathType(1);
            editTextPath.setHint("su");
            ((TextView) viewF.findViewById(2131034422)).setText(b2.f(2131297002));
            CheckBox checkBox = (CheckBox) viewF.findViewById(2131034437);
            checkBox.setChecked(sharedPreferencesM0.getBoolean("sh", false));
            checkBox.setVisibility(0);
            viewF.findViewById(2131034354).setTag(editTextPath);
            AlertDialog alertDialogCreate = android.ext.f.b().setView(InternalKeyboard.e(viewF, false)).setPositiveButton(b2.f(2131296334), (DialogInterface.OnClickListener) null).setNegativeButton(b2.f(2131296311), (DialogInterface.OnClickListener) null).create();
            o oVar = new o(editTextPath, checkBox, alertDialogCreate);
            Button button = (Button) viewF.findViewById(2131034434);
            String[] strArr = {"su", "ku.sud", "/system/bin/su", "/system/xbin/su", "/su/bin/su", "/system/xbin/bstk/su", "/sbin/su", "/magisk/.core/bin/su", "/magisk/phh/bin/su"};
            button.setOnClickListener(new v2(strArr, strArr));
            button.setTag(editTextPath);
            r(alertDialogCreate, oVar, editTextPath);
        }
    }

    static void c() {
        String[] strArr = new String[MainService.J0.length * 2];
        strArr[0] = b2.f(2131296942) + ", " + b2.f(2131296861);
        strArr[1] = b2.f(2131296942) + ", " + b2.f(2131296731);
        strArr[2] = b2.f(2131296921) + ", " + b2.f(2131296861);
        strArr[3] = b2.f(2131296921) + ", " + b2.f(2131296731);
        strArr[4] = b2.f(2131296772) + ", " + b2.f(2131296861);
        strArr[5] = b2.f(2131296772) + ", " + b2.f(2131296731);
        android.ext.f.o(android.ext.f.b().setItems(strArr, new g(strArr)).setNegativeButton(b2.f(2131296311), (DialogInterface.OnClickListener) null));
    }

    static void d() {
        Tools.I1(2131296754, 0);
        n2.h(new p());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x009b  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce A[Catch: all -> 0x01b3, TRY_LEAVE, TryCatch #4 {all -> 0x01b3, blocks: (B:32:0x00c1, B:35:0x00ce), top: B:87:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    static void e() {
        String str;
        Locale localeD;
        String strG;
        boolean zStartsWith;
        long j2;
        int i2;
        String str2;
        MainService mainService = MainService.instance;
        if (mainService == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        mainService.l.getDefaultDisplay().getMetrics(displayMetrics);
        Resources resources = MainService.context.getResources();
        Configuration configuration = resources.getConfiguration();
        AssetManager assets = resources.getAssets();
        String[] strArrE = android.ext.k.e();
        Arrays.sort(strArrE, new q());
        String strF = b2.f(2131296732);
        long jCurrentTimeMillis = System.currentTimeMillis();
        int length = strArrE.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int size = -1;
        while (i5 < length) {
            String str3 = strArrE[i5];
            int i6 = i4 + 1;
            if (str3 == null) {
                strArrE = strArrE;
            } else {
                try {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (jCurrentTimeMillis2 - jCurrentTimeMillis > 2000) {
                        try {
                            Tools.K1(((i6 * 100) / strArrE.length) + "%", i3);
                            jCurrentTimeMillis = jCurrentTimeMillis2;
                            try {
                                if (str3.length() == 0) {
                                    str = "en_US";
                                    try {
                                        "en_US".replace('_', '-');
                                    } catch (Throwable th) {
                                        th = th;
                                        map = map;
                                        strArrE = strArrE;
                                        strF = strF;
                                        e1.l("Failed check locale: " + str, th);
                                        i5++;
                                        map = map;
                                        i4 = i6;
                                        strArrE = strArrE;
                                        strF = strF;
                                        i3 = 0;
                                    }
                                } else {
                                    str = str3;
                                }
                                try {
                                    localeD = android.ext.k.d(str);
                                    strArrE = strArrE;
                                    try {
                                        strG = g(configuration, localeD, assets, displayMetrics);
                                        if (map.get(strG) != null) {
                                            zStartsWith = strG.startsWith(strF);
                                            strF = strF;
                                            j2 = jCurrentTimeMillis;
                                            i2 = size;
                                            if (zStartsWith || i2 != -1) {
                                                size = i2;
                                            } else {
                                                try {
                                                    size = arrayList.size();
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    map = map;
                                                    size = i2;
                                                    jCurrentTimeMillis = j2;
                                                    e1.l("Failed check locale: " + str, th);
                                                    i5++;
                                                    map = map;
                                                    i4 = i6;
                                                    strArrE = strArrE;
                                                    strF = strF;
                                                    i3 = 0;
                                                }
                                            }
                                            str2 = "";
                                            try {
                                                str2 = String.format(localeD, "\n[%,.1f | %.2e]", Double.valueOf(-1234.0d), Double.valueOf(-4.56E-78d));
                                            } catch (Throwable th3) {
                                                e1.a(th3);
                                            }
                                            try {
                                                map.put(strG, str);
                                                arrayList.add(str);
                                                try {
                                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                                    spannableStringBuilder.append((CharSequence) localeD.getDisplayName(localeD));
                                                    map = map;
                                                    try {
                                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(z1.d.s), 0, spannableStringBuilder.length(), 33);
                                                        int length2 = spannableStringBuilder.length();
                                                        spannableStringBuilder.append((CharSequence) " (");
                                                        spannableStringBuilder.append((CharSequence) str);
                                                        spannableStringBuilder.append(')');
                                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(z1.d.r), length2, spannableStringBuilder.length(), 33);
                                                        int length3 = spannableStringBuilder.length();
                                                        spannableStringBuilder.append((CharSequence) str2);
                                                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6f), length3, spannableStringBuilder.length(), 33);
                                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(z1.d.t), length3, spannableStringBuilder.length(), 33);
                                                        arrayList2.add(spannableStringBuilder);
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        try {
                                                            e1.a(th);
                                                            arrayList2.add(localeD.getDisplayName(localeD) + " (" + str + ')' + str2);
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            jCurrentTimeMillis = j2;
                                                            e1.l("Failed check locale: " + str, th);
                                                        }
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    map = map;
                                                }
                                                jCurrentTimeMillis = j2;
                                            } catch (Throwable th7) {
                                                th = th7;
                                                map = map;
                                                jCurrentTimeMillis = j2;
                                                e1.l("Failed check locale: " + str, th);
                                                i5++;
                                                map = map;
                                                i4 = i6;
                                                strArrE = strArrE;
                                                strF = strF;
                                                i3 = 0;
                                            }
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        strF = strF;
                                        e1.l("Failed check locale: " + str, th);
                                        i5++;
                                        map = map;
                                        i4 = i6;
                                        strArrE = strArrE;
                                        strF = strF;
                                        i3 = 0;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    strArrE = strArrE;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                str = str3;
                                e1.l("Failed check locale: " + str, th);
                                i5++;
                                map = map;
                                i4 = i6;
                                strArrE = strArrE;
                                strF = strF;
                                i3 = 0;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            map = map;
                            strArrE = strArrE;
                            strF = strF;
                            str = str3;
                            jCurrentTimeMillis = jCurrentTimeMillis2;
                            e1.l("Failed check locale: " + str, th);
                            i5++;
                            map = map;
                            i4 = i6;
                            strArrE = strArrE;
                            strF = strF;
                            i3 = 0;
                        }
                    } else {
                        if (str3.length() == 0) {
                            str = "en_US";
                            "en_US".replace('_', '-');
                        } else {
                            str = str3;
                        }
                        localeD = android.ext.k.d(str);
                        strArrE = strArrE;
                        strG = g(configuration, localeD, assets, displayMetrics);
                        if (map.get(strG) != null) {
                            zStartsWith = strG.startsWith(strF);
                            strF = strF;
                            j2 = jCurrentTimeMillis;
                            i2 = size;
                            if (zStartsWith) {
                                size = i2;
                                str2 = "";
                                str2 = String.format(localeD, "\n[%,.1f | %.2e]", Double.valueOf(-1234.0d), Double.valueOf(-4.56E-78d));
                                map.put(strG, str);
                                arrayList.add(str);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                spannableStringBuilder2.append((CharSequence) localeD.getDisplayName(localeD));
                                map = map;
                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(z1.d.s), 0, spannableStringBuilder2.length(), 33);
                                int length4 = spannableStringBuilder2.length();
                                spannableStringBuilder2.append((CharSequence) " (");
                                spannableStringBuilder2.append((CharSequence) str);
                                spannableStringBuilder2.append(')');
                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(z1.d.r), length4, spannableStringBuilder2.length(), 33);
                                int length5 = spannableStringBuilder2.length();
                                spannableStringBuilder2.append((CharSequence) str2);
                                spannableStringBuilder2.setSpan(new RelativeSizeSpan(0.6f), length5, spannableStringBuilder2.length(), 33);
                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(z1.d.t), length5, spannableStringBuilder2.length(), 33);
                                arrayList2.add(spannableStringBuilder2);
                                jCurrentTimeMillis = j2;
                            } else {
                                size = i2;
                                str2 = "";
                                str2 = String.format(localeD, "\n[%,.1f | %.2e]", Double.valueOf(-1234.0d), Double.valueOf(-4.56E-78d));
                                map.put(strG, str);
                                arrayList.add(str);
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                spannableStringBuilder3.append((CharSequence) localeD.getDisplayName(localeD));
                                map = map;
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(z1.d.s), 0, spannableStringBuilder3.length(), 33);
                                int length6 = spannableStringBuilder3.length();
                                spannableStringBuilder3.append((CharSequence) " (");
                                spannableStringBuilder3.append((CharSequence) str);
                                spannableStringBuilder3.append(')');
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(z1.d.r), length6, spannableStringBuilder3.length(), 33);
                                int length7 = spannableStringBuilder3.length();
                                spannableStringBuilder3.append((CharSequence) str2);
                                spannableStringBuilder3.setSpan(new RelativeSizeSpan(0.6f), length7, spannableStringBuilder3.length(), 33);
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(z1.d.t), length7, spannableStringBuilder3.length(), 33);
                                arrayList2.add(spannableStringBuilder3);
                                jCurrentTimeMillis = j2;
                            }
                        }
                    }
                } catch (Throwable th12) {
                    th = th12;
                }
                i5++;
                map = map;
                i4 = i6;
                strArrE = strArrE;
                strF = strF;
                i3 = 0;
            }
            strF = strF;
            i5++;
            map = map;
            i4 = i6;
            strArrE = strArrE;
            strF = strF;
            i3 = 0;
        }
        g(configuration, android.ext.k.d(android.ext.k.b()), assets, displayMetrics);
        android.ext.k.g();
        n2.i(new r(new ArrayAdapter(MainService.context, arrayList2), size, arrayList));
    }

    private static void f() {
        if (!Config.C || j) {
            return;
        }
        int i2 = 0;
        while (true) {
            int[] iArr = h;
            if (i2 >= iArr.length) {
                j = true;
                return;
            } else {
                if (iArr[i2] == 2131296620) {
                    iArr[i2] = 2131296619;
                }
                i2++;
            }
        }
    }

    private static String g(Configuration configuration, Locale locale, AssetManager assetManager, DisplayMetrics displayMetrics) {
        Resources resources;
        String str;
        Configuration configuration2 = new Configuration(configuration);
        q(configuration2, locale);
        try {
            resources = MainService.context.createConfigurationContext(configuration2).getResources();
        } catch (Throwable th) {
            e1.a(th);
            resources = null;
        }
        if (resources == null) {
            resources = new Resources(assetManager, displayMetrics, configuration2);
        }
        try {
            str = String.format(locale, "%,d;%,d;%e;%e;%e;%e;", 1234567890, -1234567890, Double.valueOf(1.23456E300d), Double.valueOf(-1.23456E300d), Double.valueOf(1.23456E-300d), Double.valueOf(-1.23456E-300d));
        } catch (Exception e2) {
            e1.a(e2);
            str = "";
        }
        return resources.getString(2131296732) + str;
    }

    public static DialogInterface.OnClickListener h() {
        return new i();
    }

    public static String i() {
        SharedPreferences sharedPreferencesM0 = Tools.M0();
        SharedPreferences.Editor editorEdit = sharedPreferencesM0.edit();
        StringBuilder sb = new StringBuilder();
        long j2 = sharedPreferencesM0.getLong("mc", 0L);
        editorEdit.remove("mc");
        if (j2 != 0) {
            sb.append("&mc=");
            sb.append('=');
            sb.append(Long.toHexString(j2));
        }
        editorEdit.commit();
        return sb.toString();
    }

    static void j(int i2) {
        int i3;
        if (i2 == 3) {
            try {
                i3 = Tools.M0().getInt("hide-icon", 0);
            } catch (Throwable th) {
                e1.l("Failed disable icon " + i2, th);
                return;
            }
        } else {
            i3 = i2;
        }
        if ((i3 == 1 && (android.ext.r.n instanceof MainActivity)) || (i3 == 2 && (android.ext.r.n instanceof ActivityMain))) {
            if (i2 != 3) {
                android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(2131296679)).setMessage(b2.f(2131296312)).setNegativeButton(b2.f(2131296836), (DialogInterface.OnClickListener) null));
                return;
            }
            return;
        }
        String strC0 = Tools.C0();
        PackageManager packageManagerB0 = Tools.B0();
        ComponentName componentName = new ComponentName(strC0, ActivityMain.class.getName());
        ComponentName componentName2 = new ComponentName(strC0, MainActivity.class.getName());
        e1.d("hide A: " + i3 + "; " + componentName2 + ": " + packageManagerB0.getComponentEnabledSetting(componentName2) + "; " + componentName + ": " + packageManagerB0.getComponentEnabledSetting(componentName) + ';');
        if (i2 == 3) {
            int i4 = 10;
            int i5 = (packageManagerB0.getComponentEnabledSetting(componentName2) == 2 ? 1 : 0) + (packageManagerB0.getComponentEnabledSetting(componentName) == 2 ? 10 : 0);
            if (i3 == 1) {
                i4 = 1;
            } else if (i3 != 2) {
                i4 = 0;
            }
            if (i5 == i4) {
                return;
            }
        }
        if (i3 != 1) {
            Tools.w1(1, componentName2, 1);
        }
        if (i3 != 2) {
            Tools.w1(3, componentName, 1);
        }
        if (i3 == 1) {
            Tools.w1(5, componentName2, 2);
        }
        if (i3 == 2) {
            Tools.w1(7, componentName, 2);
        }
        if (i3 != 1) {
            Tools.w1(9, componentName2, 1);
        }
        if (i3 != 2) {
            Tools.w1(11, componentName, 1);
        }
        e1.d("hide Z: " + i3 + "; " + componentName2 + ": " + packageManagerB0.getComponentEnabledSetting(componentName2) + "; " + componentName + ": " + packageManagerB0.getComponentEnabledSetting(componentName) + ';');
        if (i2 != 3) {
            new g2().g("hide-icon", i3, 0).commit();
        }
    }

    public static boolean k() {
        boolean z2 = false;
        try {
            String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
            boolean z3 = strArr != null && strArr.length > 0;
            try {
                FileInputStream fileInputStream = new FileInputStream("/proc/self/auxv");
                byte[] bArr = new byte[4096];
                int i2 = fileInputStream.read(bArr);
                fileInputStream.close();
                if (i2 <= 0) {
                    return z3;
                }
                if (i2 % 16 == 8) {
                    return false;
                }
                for (int i3 = 0; i3 < i2; i3 += 16) {
                    if (bArr[i3 + 4] != 0 || bArr[i3 + 5] != 0 || bArr[i3 + 6] != 0 || bArr[i3 + 7] != 0) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                boolean z4 = z3;
                th = th;
                z2 = z4;
                e1.s("Failed check 64 client. Used: " + z2, th);
                return z2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    static void m() {
        android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(2131296280)).setMessage(b2.f(2131296425)).setPositiveButton(b2.f(2131296904), new p0(200, true)).setNegativeButton(b2.f(2131296963), (DialogInterface.OnClickListener) null));
    }

    private static void n() {
        new g2().i("mc", f47g, 0L).commit();
    }

    private void p(TextView textView) {
        int i2;
        switch (textView.getId()) {
            case 2131034151:
                i2 = 2130968634;
                break;
            case 2131034168:
                i2 = 2130968626;
                break;
            case 2131034173:
                i2 = 2130968655;
                break;
            case 2131034193:
                i2 = 2130968600;
                break;
            case 2131034198:
                i2 = 2130968653;
                break;
            case 2131034205:
                i2 = 2130968609;
                break;
            case 2131034208:
                i2 = 2130968604;
                break;
            case 2131034211:
                i2 = 2130968617;
                break;
            case 2131034277:
                i2 = 2130968623;
                break;
            case 2131034394:
                i2 = 2130968594;
                break;
            default:
                i2 = 0;
                break;
        }
        if (i2 != 0) {
            Tools.c(textView, Tools.o0(i2), Config.d());
        }
    }

    public static void q(Configuration configuration, Locale locale) {
        try {
            configuration.setLocale(locale);
        } catch (Throwable th) {
            e1.a(th);
        }
        try {
            configuration.setLayoutDirection(locale);
        } catch (Throwable th2) {
            e1.a(th2);
        }
        try {
            configuration.locale = locale;
        } catch (Throwable th3) {
            e1.l("Failed set locale", th3);
        }
    }

    private static void r(AlertDialog alertDialog, View.OnClickListener onClickListener, android.widget.EditText editText) {
        alertDialog.setButton(-1, b2.f(2131296334), new m(onClickListener, alertDialog));
        android.ext.f.l(alertDialog, new n(onClickListener));
        android.ext.f.n(alertDialog, editText);
    }

    public static void s() {
        t(0);
    }

    public static void t(int i2) {
        f();
        String[] strArr = new String[(h.length / 3) + 1];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = h;
            if (i3 >= iArr.length) {
                break;
            }
            if (i3 % 3 == 0) {
                int i5 = (i3 / 3) + 1;
                int i6 = iArr[i3];
                if (i2 == i6 || i2 == iArr[i3 + 1]) {
                    i4 = i5;
                }
                strArr[i5] = b2.f(i6);
            }
            i3++;
        }
        strArr[0] = b2.f(2131297087);
        h hVar = new h();
        if (i4 == 0) {
            android.ext.f.o(android.ext.f.b().setItems(strArr, hVar).setNegativeButton(b2.f(2131296311), (DialogInterface.OnClickListener) null));
        } else {
            hVar.onClick(null, i4);
        }
    }

    private void u() {
        new j("loadLogcat").start();
    }

    static void v() {
        android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(2131296925)).setMessage(Tools.L1(b2.f(2131296927), 8)).setNegativeButton(b2.f(2131296311), (DialogInterface.OnClickListener) null).setPositiveButton(b2.f(2131296836), new f()));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f48a.length;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        View[] viewArr = this.f48a;
        return i2 >= viewArr.length ? new View(Tools.f0()) : viewArr[i2];
    }

    public void l(boolean z2) {
        if (!z2) {
            if (this.f48a.length == 0) {
                return;
            }
            ListView listView = MainService.instance.Y;
            this.f53f = Tools.J0(listView);
            this.f48a = d.b.f1510b;
            notifyDataSetChanged();
            listView.setAdapter((ListAdapter) null);
            return;
        }
        if (this.f48a.length > 0) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) a.d.f(2131099674, null);
        this.f49b = new WeakReference((TextView) viewGroup.findViewById(2131034275));
        this.f50c = new WeakReference((TextView) viewGroup.findViewById(2131034172));
        this.f51d = new WeakReference((ImageView) viewGroup.findViewById(2131034171));
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            try {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() != 8) {
                    if (childAt instanceof TextView) {
                        ((TextView) childAt).setText(b2.g(((TextView) childAt).getText().toString().trim()));
                        p((TextView) childAt);
                    }
                    childAt.setLayoutParams(new AbsListView.LayoutParams(-1, -2, 0));
                    arrayList.add(childAt);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Tools.O0((View) it.next());
        }
        this.f48a = (View[]) arrayList.toArray(new View[arrayList.size()]);
        notifyDataSetChanged();
        MainService mainService = MainService.instance;
        mainService.Y.setAdapter((ListAdapter) this);
        HotPoint hotPoint = mainService.j;
        o();
        w(hotPoint.getLayoutAlpha(), hotPoint.getVanishingTime(), null, null, hotPoint.getSize());
        Tools.a0 a0Var = this.f53f;
        if (a0Var != null) {
            Tools.A1(MainService.instance.Y, a0Var);
            MainService.instance.Y.post(new k(a0Var));
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        if (!this.f52e) {
            this.f52e = true;
            x();
            this.f52e = false;
        }
        super.notifyDataSetChanged();
    }

    void o() {
        TextView textView = (TextView) this.f49b.get();
        if (textView == null) {
            return;
        }
        String strF = b2.f(2131296510);
        z1.d dVar = MainService.instance.v0;
        String str = dVar != null ? dVar.f1433b : null;
        if (str != null) {
            strF = Tools.O1(strF) + " \"" + str + "\":";
        }
        textView.setText(strF);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        int id;
        AlertDialog.Builder positiveButton;
        AlertDialog.Builder message;
        String strF;
        DialogInterface.OnClickListener bVar;
        String strF2;
        AlertDialog.Builder view2;
        TimersEditor timersEditor;
        View viewF;
        Config.p.a tVar;
        if (view == null || (id = view.getId()) == -1) {
            return;
        }
        long j3 = 1 << (i2 % 63);
        long j4 = f47g;
        if ((j4 & j3) == 0) {
            f47g = j3 | j4;
            n();
        }
        MainService mainService = MainService.instance;
        Config.p pVarB = Config.b(id);
        if (pVarB != null) {
            if (id != 2131034177) {
                if (id == 2131034173) {
                    tVar = new t();
                }
                pVarB.b();
                return;
            }
            tVar = new s();
            pVarB.f(tVar);
            pVarB.b();
            return;
        }
        switch (id) {
            case 2131034113:
                StringBuilder sb = new StringBuilder();
                sb.append("__version__ ");
                float f2 = 1;
                sb.append((108.5f * f2) - 7.1f);
                sb.append(" (");
                sb.append((int) (((f2 * 16586.3f) - 431.3f) + 0.5f));
                sb.append(")\n\n__developers__\n");
                sb.append(DEVS);
                sb.append("\n__special_thanks__\n\tdanilo_scala,\n\tYoungBai,\n\tKorean L,\n\tiAndroHacker,\n\tMobile46,\n\treduxpl,\n\tjan.eike.kottlarz,\n\ttimo.szillat,\n\tSubZero5,\n\tZuiXan,\n\tAlex,\n\tGanjar Sukmara,\n\tdd09david,\n\tvenomx961,\n\tchatzopoulosapostolos,\n\tWanderMax,\n\tIvan Maldonado,\n\tvesper7dd,\n\tSelfDestruct68,\n\tmallachri,\n\tAzhar Dripana,\n\tIlya Kushnir,\n\twasao0807,\n\tAlex NG,\n\tjeroen.wilmink,\n\tpodluka,\n\tAnty0,\n\tkiilerman496,\n\tthex3only,\n\tmustafayasir6,\n\tHavergal Samosir Jr.,\n\timpykid,\n\t28ado1,\n\tElectroz,\n\tvincensius.august,\n\tRuan Carlos,\n\tNurMarvin,\n\tSkullboyq,\n\tYakiaaa,\n\tag2s20150609,\n\tanitamoellerga,\n\tcoolapk_ooops,\n\tpandecheng,\n\tpkjisoo32,\n\tLeam19999,\n\tminecraft172zzz,\n\tTodd Justin York,\n\tGedablo,\n\trootddos511,\n\t楊萬林,\n\tchetraclr,\n\tcub.madrax,\n\tntnhiu,\n\tbuivanxia10,\n\twl02082201,\n\tBacklift,\n\tvonxom,\n\tPeter Cuevas H,\n\talg1.66336611,\n\tHoangthinh99hp,\n\tJackH4L,\n\tspacemaker2906,\n\tva3kama3eredeti,\n\tAustin Andrews,\n\tsaqibpiash,\n\tsuuyout,\n\tsljivics,\n\tDartel,\n\tdoungvichetra2,\n\t0968688218channa,\n\tCaptainTF,\n\tdbinkv1,\n\tronaldmoura,\n\tlafrite.cassee,\n\tJazeks,\n\tNightMareNivek,\n\tprefix309,\n\tmilad19s,\n\tliato.games,\n\tCmP,\n\t1701silentspawn,\n\tgood7773good7773good7773,\n\tATAA SY,\n\tkhiemhocrot.98,\n\ta0193143,\n\tYaroslav,\n\tzam5355,\n\tlonglix,\n\tsssidiki4,\n\tGeorge,\n\t冰鍊,\n\tFloatKey.");
                positiveButton = android.ext.f.b().setCustomTitle(Tools.g0(2131296256)).setMessage(b2.g(sb.toString())).setNeutralButton(b2.f(2131296338), new w()).setPositiveButton(b2.f(2131296962), new android.ext.r.n(null));
                strF2 = b2.f(2131296836);
                view2 = positiveButton.setNegativeButton(strF2, (DialogInterface.OnClickListener) null);
                android.ext.f.o(view2);
                break;
            case 2131034148:
                new a("changelog").start();
                break;
            case 2131034155:
                message = android.ext.f.b().setMessage(b2.f(2131296900));
                strF = b2.f(2131296334);
                bVar = new b();
                positiveButton = message.setPositiveButton(strF, bVar);
                strF2 = b2.f(2131296311);
                view2 = positiveButton.setNegativeButton(strF2, (DialogInterface.OnClickListener) null);
                android.ext.f.o(view2);
                break;
            case 2131034156:
                message = android.ext.f.b().setCustomTitle(Tools.g0(2131296324)).setMessage(b2.f(2131296325));
                strF = b2.f(2131296836);
                bVar = new e();
                positiveButton = message.setPositiveButton(strF, bVar);
                strF2 = b2.f(2131296311);
                view2 = positiveButton.setNegativeButton(strF2, (DialogInterface.OnClickListener) null);
                android.ext.f.o(view2);
                break;
            case 2131034160:
                if (f1.y()) {
                    positiveButton = android.ext.f.b().setCustomTitle(Tools.g0(2131296381)).setMessage(b2.f(2131297099)).setPositiveButton(b2.f(2131296836), new d(mainService));
                    strF2 = b2.f(2131296311);
                    view2 = positiveButton.setNegativeButton(strF2, (DialogInterface.OnClickListener) null);
                    android.ext.f.o(view2);
                }
                break;
            case 2131034161:
                positiveButton = android.ext.f.b().setCustomTitle(Tools.g0(2131296424)).setPositiveButton(b2.f(2131297115), new p0(300));
                strF2 = b2.f(2131296805);
                view2 = positiveButton.setNegativeButton(strF2, (DialogInterface.OnClickListener) null);
                android.ext.f.o(view2);
                break;
            case 2131034170:
                View viewF2 = a.d.f(2131099676, null);
                SeekBar seekBar = (SeekBar) viewF2.findViewById(2131034430);
                SeekBar seekBar2 = (SeekBar) viewF2.findViewById(2131034283);
                SeekBar seekBar3 = (SeekBar) viewF2.findViewById(2131034405);
                TextView textView = (TextView) viewF2.findViewById(2131034172);
                ImageView imageView = (ImageView) viewF2.findViewById(2131034171);
                float layoutAlpha = mainService.j.getLayoutAlpha();
                int vanishingTime = mainService.j.getVanishingTime();
                int size = mainService.j.getSize();
                seekBar.setProgress(10 - ((int) (10.0f * layoutAlpha)));
                seekBar2.setProgress(vanishingTime < 0 ? seekBar2.getMax() : vanishingTime);
                seekBar3.setMax(12);
                seekBar3.setProgress(size);
                w(layoutAlpha, vanishingTime, textView, imageView, size);
                u uVar = new u(seekBar, seekBar2, seekBar3, textView, imageView);
                seekBar.setOnSeekBarChangeListener(uVar);
                seekBar2.setOnSeekBarChangeListener(uVar);
                seekBar3.setOnSeekBarChangeListener(uVar);
                view2 = android.ext.f.b().setPositiveButton(b2.f(2131296836), (DialogInterface.OnClickListener) null).setView(viewF2);
                android.ext.f.o(view2);
                break;
            case 2131034178:
                positiveButton = android.ext.f.b().setCustomTitle(Tools.g0(2131296726)).setMessage(b2.f(2131296728)).setPositiveButton(b2.f(2131297115), new v(mainService));
                strF2 = b2.f(2131296805);
                view2 = positiveButton.setNegativeButton(strF2, (DialogInterface.OnClickListener) null);
                android.ext.f.o(view2);
                break;
            case 2131034179:
                d();
                break;
            case 2131034180:
                View viewF3 = a.d.f(2131099658, null);
                ((TextView) viewF3.findViewById(2131034148)).setText(e1.f740f);
                positiveButton = android.ext.f.b().setCustomTitle(Tools.g0(2131296737)).setView(viewF3);
                strF2 = b2.f(2131296836);
                view2 = positiveButton.setNegativeButton(strF2, (DialogInterface.OnClickListener) null);
                android.ext.f.o(view2);
                break;
            case 2131034185:
                a(null);
                break;
            case 2131034190:
                h0.h();
                break;
            case 2131034191:
                mainService.r(true);
                break;
            case 2131034196:
                timersEditor = MainService.instance.n0;
                timersEditor.h();
                break;
            case 2131034198:
                try {
                    viewF = a.d.f(2131099655, null);
                } catch (IndexOutOfBoundsException e2) {
                    e1.a(e2);
                    MainService.I0();
                    viewF = null;
                }
                if (viewF != null) {
                    TextView textView2 = (TextView) viewF.findViewById(2131034285);
                    TextView textView3 = (TextView) viewF.findViewById(2131034328);
                    textView3.setText(b2.g(textView3.getText().toString().trim()));
                    EditTextSpeeds editTextSpeeds = (EditTextSpeeds) viewF.findViewById(2131034413);
                    TextView textView4 = (TextView) viewF.findViewById(2131034224);
                    textView4.setText(Tools.N1(2131296372) + ": " + d1.c());
                    textView4.setOnClickListener(new x(editTextSpeeds));
                    editTextSpeeds.setText(MainService.instance.k0.b());
                    editTextSpeeds.setDataType(16);
                    editTextSpeeds.setOnChangedListener(new y(editTextSpeeds, textView2));
                    android.ext.f.q(android.ext.f.b().setView(InternalKeyboard.d(viewF)).setPositiveButton(b2.f(2131296334), new z(editTextSpeeds)).setNegativeButton(b2.f(2131296311), (DialogInterface.OnClickListener) null), editTextSpeeds);
                }
                break;
            case 2131034200:
                b();
                break;
            case 2131034206:
                c();
                break;
            case 2131034208:
                timersEditor = MainService.instance.o0;
                timersEditor.h();
                break;
            case 2131034228:
                new android.ext.r.n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf25<;940grqdwh2").onClick(null, 0);
                break;
            case 2131034277:
                s();
                break;
            case 2131034284:
                CharSequence[] charSequenceArr = {b2.f(2131296820) + " (" + b2.f(2131296373) + ')', b2.f(2131296282), b2.f(2131296281)};
                AlertDialog alertDialogCreate = android.ext.f.b().setCustomTitle(Tools.g0(2131296679)).setItems(charSequenceArr, new c()).create();
                ListView listView = alertDialogCreate.getListView();
                if (listView != null) {
                    Tools.e(listView, charSequenceArr, new Drawable[]{null, Tools.o0(2131165191), Tools.o0(2131165188)}, 48, 0);
                }
                android.ext.f.m(alertDialogCreate);
                break;
            case 2131034394:
                v();
                break;
            case 2131034403:
                u();
                break;
            default:
                e1.p("Unknown id in config: " + id);
                break;
        }
    }

    void w(float f2, int i2, TextView textView, ImageView imageView, int i3) {
        String strL1;
        MainService mainService = MainService.instance;
        try {
            strL1 = Tools.L1(b2.f(2131296333), Integer.valueOf(100 - ((int) (100.0f * f2))), i2 < 0 ? b2.f(2131296687) : Tools.L1(b2.f(2131296686), Integer.valueOf(i2)));
        } catch (Throwable th) {
            e1.l("Fail setup string for icon config", th);
            strL1 = "fail";
        }
        TextView textView2 = (TextView) this.f50c.get();
        if (textView2 != null) {
            textView2.setText(strL1);
        }
        if (textView != null) {
            textView.setText(strL1);
        }
        mainService.j.setSize(i3);
        int sizePx = mainService.j.getSizePx();
        TimeJumpPanel timeJumpPanel = mainService.k;
        if (timeJumpPanel != null) {
            timeJumpPanel.setMinSize(sizePx);
        }
        ImageView imageView2 = (ImageView) this.f51d.get();
        if (imageView2 != null) {
            Tools.y1(imageView2, f2 * 255.0f);
            Config.q(imageView2, sizePx);
        }
        if (imageView != null) {
            Tools.y1(imageView, 255.0f * f2);
            Config.q(imageView, sizePx);
        }
        mainService.j.setLayoutAlpha(f2);
        mainService.j.setVanishingTime(i2);
        mainService.V(mainService.Y.getAdapter());
    }

    public void x() {
        for (View view : this.f48a) {
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                int id = view.getId();
                Config.p pVarB = Config.b(id);
                boolean z2 = id == 2131034196 || id == 2131034208;
                if (pVarB != null) {
                    textView.setText(pVarB.toString());
                    z2 = pVarB.f45g;
                }
                if (z2) {
                    textView.setBackgroundColor(-2137746366);
                }
            }
        }
    }
}
