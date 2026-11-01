/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.d;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.ext.ArrayAdapter;
import android.ext.Config;
import android.ext.EditText;
import android.ext.EditTextPath;
import android.ext.EditTextSpeeds;
import android.ext.FloatPanel;
import android.ext.HotPoint;
import android.ext.InternalKeyboard;
import android.ext.MainService;
import android.ext.TimeJumpPanel;
import android.ext.Tools;
import android.ext.b2;
import android.ext.d1;
import android.ext.e1;
import android.ext.e2;
import android.ext.f1;
import android.ext.g0;
import android.ext.g2;
import android.ext.h0;
import android.ext.k;
import android.ext.n0;
import android.ext.n2;
import android.ext.p0;
import android.ext.p1;
import android.ext.r;
import android.ext.v2;
import android.ext.y0;
import android.ext.z1;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
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
import d.b;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class ConfigListAdapter
extends BaseAdapter
implements AdapterView.OnItemClickListener {
    public static final String DEVS = "\td2dyno - __owner__, __design__, __pm__.\n\tEnyby - __code__, __pm__.\n\tTrasd - __tech__, __pm__.\n\tAqua - __creator__.\n".intern();
    public static long g = 0L;
    static final int[] h = new int[]{2131296606, 2131296535, -1, 2131296526, 2131296525, -1, 2131296523, 2131296522, 2, 2131296613, 2131296611, -1, 2131296651, 2131296650, 21, 2131296531, 2131296530, -1, 2131296657, 2131296656, 1, 2131296630, 2131296628, 6, 2131296649, 2131296648, 5, 2131296529, 2131296528, 7, 2131296947, 2131296618, 0, 2131296641, 2131296640, 8, 2131296609, 2131296608, 9, 2131296658, 2131296659, 12, 2131296669, 2131296668, 11, 2131296653, 2131296652, 20, 2131296643, 2131296642, 16, 2131296645, 2131296644, 4, 2131296661, 2131296660, 3, 2131296655, 2131296654, 10, 2131296626, 2131296623, 14, 2131296633, 2131296625, 24, 2131296637, 2131296636, -1, 2131296632, 2131296631, -1, 2131296647, 2131296646, 17, 2131296663, 2131296662, 22, 2131296616, 2131296615, 23, 2131296521, 2131296520, 13, 2131297065, 2131296664, 18, 2131296906, 2131297100, 15, 2131296381, 2131297099, -1, 2131297106, 2131297105, 19, 2131296621, 2131296620, -1, 2131296614, 2131296360, -1, 2131296639, 2131296638, 25};
    static final String[] i = new String[]{"kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh24950vhdufk0xqnqrz0zlwk0nqrzq0fkdqjhv0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25570vshhg0kdfn0dqg0wlph0mxps0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh248;0krz0xvh0h|h0lfrq0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh248<0krz0vhdufk0hqfu|swhg0ydoxh0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh24970frpsduh0phwkrgv0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh24<40klvwru|0xvdjh0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25550h{dpsoh0ri0udqjh0vhdufk0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25590krz0wr0vhdufk0urxqghg0ydoxh0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh255<0krz0wr0xvh0rughuhg0jurxs0vhdufk0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh248<0krz0vhdufk0hqfu|swhg0ydoxh0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25960h{dpsoh0ri0wkh0pdvn0vhdufk0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh255:0krz0wr0xvh0iloo0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh24<50krz0wr0vshhg0xs0vhdufk0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25;60{ru0vhdufk0jxlgh0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28:80;330wh{w0vwulqj0kh{0dre0vhdufk0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26690rswlrq0dgg0wr0ydoxh0gr0qrw0uhsodfh0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26860lpsorvlrq0qhyhu0orvh0krsh0kdfn0ohyho0klgh0iurp0wkh0jdph0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26870lpsorvlrq0qhyhu0orvh0krsh0kdfn0fuhglwv0klgh0iurp0wkh0jdph0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26930lpsorvlrq0qhyhu0orvh0krsh0kdfn0fuhglwv0uhvwduw0zlwkrxw0surwhfwlrq0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26950lpsorvlrq0qhyhu0orvh0krsh0kdfn0fuhglwv0glvdeoh0surwhfwlrq0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28680:530xvh0urrw0iurp0yluwxdo0vsdfh0iru0klgh0jdphjxdugldq0yluwxdo{srvhg0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28;30iuhh0iluh0dyrlg0ghwhfwlrq0urrw0iurp0yluwxdo0vsdfh0yluwxdo{srvhg0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28;40dyrlg0ghwhfwlrq0urrw0iurp0yluwxdo0vsdfh0yluwxdo{srvhg0jdphjxdugldq2\r\rkwwsv=22jdphjxdugldq1qhw2iruxp2wdjv2dss0klgh2\r\rkwwsv=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28;80dyrlg0ghwhfwlrq0urrw0iurp0yluwxdo0vsdfh0pxowlsoh0dffrxqwv0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26;80uhvwduw0zlwkrxw0surwhfwlrq0uhsdlu0wkh0uherrw0uxq0jdphjxdugldq0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26;70uhvwduw0zlwkrxw0surwhfwlrq0uhsdlu0wkh0uherrw0uherrw0ghylfh0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh267:0krz0wr0vhdufk0ilowhu0lq0wkh0phpru|0hglwru0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26770krz0wr0txlfno|0vhdufk0iru0srlqwhuv0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26990xqudqgrpl}hu0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26;40uxvvldq0vorwv0kdfn0vwruh0xqudqgrpl}hu0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2qrurrw", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh27480ilowhuv0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2ilohv2fdwhjru|290oxd0vfulswv2\r\rkwws=22jdphjxdugldq1qhw2khos2", "kwws=22jdphjxdugldq1qhw2iruxp2ilohv2iloh2:970xqdoljqhg0vhdufk2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh286:0:630irupxod0fdofxodwru0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh286;0jxq0zdu0vkrrwlqj0jdphv0kdfn0sulfh0irupxod0fdofxodwru0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28680:530xvh0urrw0iurp0yluwxdo0vsdfh0iru0klgh0jdphjxdugldq0yluwxdo{srvhg0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28;30iuhh0iluh0dyrlg0ghwhfwlrq0urrw0iurp0yluwxdo0vsdfh0yluwxdo{srvhg0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28;40dyrlg0ghwhfwlrq0urrw0iurp0yluwxdo0vsdfh0yluwxdo{srvhg0jdphjxdugldq2\r\rkwwsv=22jdphjxdugldq1qhw2iruxp2wdjv2dss0klgh2\r\rkwwsv=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28;80dyrlg0ghwhfwlrq0urrw0iurp0yluwxdo0vsdfh0pxowlsoh0dffrxqwv0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh29470il{lqj0d0vfulsw0xvlqj0dvvhpeohu0jdphjxdugldq2"};
    private static boolean j = false;
    private View[] a;
    private WeakReference b = new WeakReference<Object>(null);
    private WeakReference c = new WeakReference<Object>(null);
    private WeakReference d = new WeakReference<Object>(null);
    private boolean e = false;
    private Tools.a0 f = null;

    public ConfigListAdapter() {
        this.a = d.b.b;
        HotPoint hotPoint = MainService.instance.j;
        this.w(hotPoint.getLayoutAlpha(), hotPoint.getVanishingTime(), null, null, hotPoint.getSize());
        this.x();
    }

    public static void a(String charSequence) {
        e1.d("mConfigTempPath onClick");
        View view = a.d.f(2131099688, null);
        EditTextPath editTextPath = (EditTextPath)view.findViewById(2131034423);
        SharedPreferences sharedPreferences = Tools.M0();
        Object object = charSequence;
        if (charSequence == null) {
            object = sharedPreferences.getString("temp-path", "");
        }
        editTextPath.setText((CharSequence)object);
        editTextPath.setDataType(4);
        editTextPath.setPathType(0);
        object = (TextView)view.findViewById(2131034422);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(b2.f(2131296852));
        ((StringBuilder)charSequence).append('\n');
        ((StringBuilder)charSequence).append(b2.f(2131296853));
        object.setText((CharSequence)((StringBuilder)charSequence).toString());
        view.findViewById(2131034354).setTag((Object)editTextPath);
        charSequence = android.ext.f.b().setView(InternalKeyboard.e(view, false)).setPositiveButton((CharSequence)b2.f(2131296334), null).setNegativeButton((CharSequence)b2.f(2131296311), null).create();
        object = new View.OnClickListener(editTextPath, (AlertDialog)charSequence){
            final EditTextPath a;
            final AlertDialog b;
            {
                this.a = editTextPath;
                this.b = alertDialog;
            }

            public void onClick(View object) {
                object = Tools.Q1(this.a.getText().toString().trim());
                if (((String)object).length() > 0) {
                    if (!Tools.f1((String)object)) {
                        return;
                    }
                    y0.b((String)object, 4);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("save path: ");
                stringBuilder.append((String)object);
                e1.d(stringBuilder.toString());
                new g2().k("temp-path", (String)object, "").commit();
                object = MainService.instance;
                ((MainService)object).i.B0(((MainService)object).I());
                ((MainService)object).q(true);
                Tools.D((DialogInterface)this.b);
            }
        };
        v2.a((Button)view.findViewById(2131034434), (android.widget.EditText)editTextPath);
        ConfigListAdapter.r((AlertDialog)charSequence, (View.OnClickListener)object, (android.widget.EditText)editTextPath);
    }

    public static void b() {
        if (!f1.y()) {
            return;
        }
        String[] stringArray = a.d.f(2131099688, null);
        EditTextPath editTextPath = (EditTextPath)stringArray.findViewById(2131034423);
        SharedPreferences sharedPreferences = Tools.M0();
        editTextPath.setText(sharedPreferences.getString("su", ""));
        editTextPath.setDataType(4);
        editTextPath.setPathType(1);
        editTextPath.setHint("su");
        ((TextView)stringArray.findViewById(2131034422)).setText((CharSequence)b2.f(2131297002));
        Object object = (CheckBox)stringArray.findViewById(2131034437);
        object.setChecked(sharedPreferences.getBoolean("sh", false));
        object.setVisibility(0);
        stringArray.findViewById(2131034354).setTag((Object)editTextPath);
        sharedPreferences = android.ext.f.b().setView(InternalKeyboard.e((View)stringArray, false)).setPositiveButton((CharSequence)b2.f(2131296334), null).setNegativeButton((CharSequence)b2.f(2131296311), null).create();
        object = new View.OnClickListener(editTextPath, (CheckBox)object, (AlertDialog)sharedPreferences){
            final EditTextPath a;
            final CheckBox b;
            final AlertDialog c;
            {
                this.a = editTextPath;
                this.b = checkBox;
                this.c = alertDialog;
            }

            void a(String string2) {
                n2.i(new Runnable(this){
                    final o a;
                    {
                        this.a = o3;
                    }

                    @Override
                    public void run() {
                        this.a.c.show();
                    }
                });
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append("\n\n");
                stringBuilder.append(e2.a);
                Tools.h(stringBuilder.toString(), 0);
            }

            void b() {
                n2.i(new Runnable(this){
                    final o a;
                    {
                        this.a = o3;
                    }

                    @Override
                    public void run() {
                        if (MainService.instance != null) {
                            MainService.instance.t();
                        }
                        this.a.c.hide();
                    }
                });
            }

            void c(String string2, boolean bl) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("su path: ");
                stringBuilder.append(string2);
                stringBuilder.append("; sh: ");
                stringBuilder.append(bl);
                e1.d(stringBuilder.toString());
                new g2().k("su", string2, "").c("sh", bl, false).commit();
                if (string2.length() != 0) {
                    y0.b(string2, 4);
                }
                Tools.D((DialogInterface)this.c);
                ConfigListAdapter.m();
            }

            public void onClick(View object) {
                object = this.a.getText().toString().trim();
                if (((String)object).length() > 0) {
                    Runnable runnable = new Runnable(this, (String)object){
                        final String a;
                        final o b;
                        {
                            this.b = o3;
                            this.a = string2;
                        }

                        /*
                         * Enabled aggressive block sorting
                         * Enabled unnecessary exception pruning
                         * Enabled aggressive exception aggregation
                         */
                        @Override
                        public void run() {
                            block4: {
                                Throwable throwable2;
                                block3: {
                                    Runnable runnable;
                                    block2: {
                                        this.b.b();
                                        try {
                                            runnable = e2.j(this.a);
                                            if (!((e2.d)((Object)runnable)).a.contains("uid=0")) break block2;
                                            runnable = new Runnable(this){
                                                final a a;
                                                {
                                                    this.a = a4;
                                                }

                                                @Override
                                                public void run() {
                                                    a a4 = this.a;
                                                    o o3 = a4.b;
                                                    o3.c(a4.a, o3.b.isChecked());
                                                }
                                            };
                                            n2.i(runnable);
                                        }
                                        catch (Throwable throwable2) {
                                            break block3;
                                        }
                                    }
                                    this.b.a(((e2.d)((Object)runnable)).a);
                                    break block4;
                                }
                                this.b.a(throwable2.getMessage());
                            }
                            e2.a = "";
                        }
                    };
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("CheckSu: ");
                    stringBuilder.append((String)object);
                    new n0.i(runnable, stringBuilder.toString()).start();
                } else {
                    this.c((String)object, this.b.isChecked());
                }
            }
        };
        Button button = (Button)stringArray.findViewById(2131034434);
        stringArray = new String[]{"su", "ku.sud", "/system/bin/su", "/system/xbin/su", "/su/bin/su", "/system/xbin/bstk/su", "/sbin/su", "/magisk/.core/bin/su", "/magisk/phh/bin/su"};
        button.setOnClickListener((View.OnClickListener)new v2(stringArray, stringArray));
        button.setTag((Object)editTextPath);
        ConfigListAdapter.r((AlertDialog)sharedPreferences, (View.OnClickListener)object, (android.widget.EditText)editTextPath);
    }

    static void c() {
        CharSequence[] charSequenceArray = new String[MainService.J0.length * 2];
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(b2.f(2131296942));
        stringBuilder.append(", ");
        stringBuilder.append(b2.f(2131296861));
        charSequenceArray[0] = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(b2.f(2131296942));
        stringBuilder.append(", ");
        stringBuilder.append(b2.f(2131296731));
        charSequenceArray[1] = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(b2.f(2131296921));
        stringBuilder.append(", ");
        stringBuilder.append(b2.f(2131296861));
        charSequenceArray[2] = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(b2.f(2131296921));
        stringBuilder.append(", ");
        stringBuilder.append(b2.f(2131296731));
        charSequenceArray[3] = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(b2.f(2131296772));
        stringBuilder.append(", ");
        stringBuilder.append(b2.f(2131296861));
        charSequenceArray[4] = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(b2.f(2131296772));
        stringBuilder.append(", ");
        stringBuilder.append(b2.f(2131296731));
        charSequenceArray[5] = stringBuilder.toString();
        android.ext.f.o(android.ext.f.b().setItems(charSequenceArray, new DialogInterface.OnClickListener((String[])charSequenceArray){
            final String[] a;
            {
                this.a = stringArray;
            }

            public void onClick(DialogInterface drawableArray, int n3) {
                int n4 = n3 / 2;
                AlertDialog alertDialog = MainService.J0[n4];
                int n5 = ((p1[])alertDialog).length;
                CharSequence[] charSequenceArray = new CharSequence[n5];
                drawableArray = new Drawable[((p1[])alertDialog).length];
                Object object = new boolean[n5];
                long l3 = Config.b[n3];
                for (n4 = 0; n4 < n5; ++n4) {
                    charSequenceArray[n4] = alertDialog[n4].toString();
                    boolean bl = (1L << n4 & l3) != 0L;
                    object[n4] = bl;
                    drawableArray[n4] = alertDialog[n4].c();
                }
                alertDialog = new DialogInterface.OnClickListener(this, (boolean[])object, n3){
                    final boolean[] a;
                    final int b;
                    final g c;
                    {
                        this.c = g4;
                        this.a = blArray;
                        this.b = n3;
                    }

                    public void onClick(DialogInterface object, int n3) {
                        if (n3 == -1 || n3 == -3) {
                            long l3;
                            long l4 = l3 = -1L;
                            if (n3 == -1) {
                                n3 = 0;
                                while (true) {
                                    object = this.a;
                                    l4 = l3;
                                    if (n3 >= ((DialogInterface)object).length) break;
                                    l3 = object[n3] != false ? (l3 |= (long)(1 << n3)) : (l3 &= (long)(~(1 << n3)));
                                    ++n3;
                                }
                            }
                            l3 = l4;
                            if (((long)((1 << this.a.length) - 1) & l4) == 0L) {
                                l3 = l4 | 1L;
                            }
                            Config.b[this.b] = l3;
                            Config.k();
                        }
                        ConfigListAdapter.c();
                    }
                };
                alertDialog = android.ext.f.c(Tools.k0()).setCustomTitle(Tools.h0(this.a[n3])).setMultiChoiceItems(charSequenceArray, object, new DialogInterface.OnMultiChoiceClickListener(this, (boolean[])object){
                    final boolean[] a;
                    final g b;
                    {
                        this.b = g4;
                        this.a = blArray;
                    }

                    public void onClick(DialogInterface dialogInterface, int n3, boolean bl) {
                        this.a[n3] = bl;
                    }
                }).setPositiveButton((CharSequence)b2.f(2131296917), (DialogInterface.OnClickListener)alertDialog).setNeutralButton((CharSequence)b2.f(2131296898), (DialogInterface.OnClickListener)alertDialog).setNegativeButton((CharSequence)b2.f(2131296311), (DialogInterface.OnClickListener)alertDialog).create();
                object = alertDialog.getListView();
                if (object != null) {
                    Tools.e((ListView)object, charSequenceArray, drawableArray, Config.d(), 2131361799);
                }
                android.ext.f.m(alertDialog);
            }
        }).setNegativeButton((CharSequence)b2.f(2131296311), null));
    }

    static void d() {
        Tools.I1(2131296754, 0);
        n2.h(new Runnable(){

            @Override
            public void run() {
                ConfigListAdapter.e();
            }
        });
    }

    /*
     * Unable to fully structure code
     */
    static void e() {
        var12 = MainService.instance;
        if (var12 == null) {
            return;
        }
        var20_7 = new ArrayList<Object>();
        var19_8 = new ArrayList<Object>();
        var16_9 = new HashMap<String, Object>();
        var18_10 = new DisplayMetrics();
        var12.l.getDefaultDisplay().getMetrics(var18_10);
        var12 = MainService.context.getResources();
        var21_11 = var12.getConfiguration();
        var22_12 = var12.getAssets();
        var15_13 = k.e();
        Arrays.sort(var15_13, new Comparator(){

            public int a(String string2, String string3) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append("_zzz");
                string2 = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append(string3);
                stringBuilder.append("_zzz");
                string3 = stringBuilder.toString();
                return string2.replace('-', '_').compareTo(string3.replace('-', '_'));
            }
        });
        var14_14 = b2.f(2131296732);
        var8_15 = System.currentTimeMillis();
        var4_16 = var15_13.length;
        var2_17 = 0;
        var0_19 = -1;
        for (var1_18 = 0; var1_18 < var4_16; ++var1_18) {
            block31: {
                block28: {
                    block33: {
                        block32: {
                            block30: {
                                block29: {
                                    block27: {
                                        block34: {
                                            var12 = var15_13[var1_18];
                                            ++var2_17;
                                            if (var12 != null) break block34;
                                            var6_22 = var8_15;
                                            break block31;
                                        }
                                        var10_23 = System.currentTimeMillis();
                                        var6_22 = var8_15;
                                        if (var10_23 - var8_15 <= 2000L) break block27;
                                        try {
                                            var13_24 = new StringBuilder();
                                            var13_24.append(var2_17 * 100 / var15_13.length);
                                            var13_24.append("%");
                                            Tools.K1(var13_24.toString(), 0);
                                            var6_22 = var10_23;
                                        }
                                        catch (Throwable var17_28) {
                                            var13_24 = var12;
                                            var6_22 = var10_23;
                                            var12 = var17_28;
                                            break block28;
                                        }
                                    }
                                    var3_20 = var12.length();
                                    if (var3_20 != 0) break block29;
                                    var13_24 = "en_US";
                                    try {
                                        "en_US".replace('_', '-');
                                        break block30;
                                    }
                                    catch (Throwable var12_1) {
                                        break block28;
                                    }
lbl55:
                                    // 2 sources

                                    while (true) {
                                        var17_27 = var12;
                                        var12 = var13_24;
                                        var13_24 = var17_27;
                                        break block28;
                                        break;
                                    }
                                }
                                var13_24 = var12;
                            }
                            try {
                                var23_32 = k.d((String)var13_24);
                            }
                            catch (Throwable var12_6) {
                                break block28;
                            }
                            try {
                                var24_33 = ConfigListAdapter.g(var21_11, var23_32, var22_12, var18_10);
                                if (var16_9.get(var24_33) != null) break block31;
                                var5_21 = var24_33.startsWith(var14_14);
                                if (!var5_21 || var0_19 != -1) break block32;
                            }
                            catch (Throwable var12_5) {}
                            try {
                                var0_19 = var3_20 = var20_7.size();
                            }
                            catch (Throwable var12_2) {
                                break block28;
                            }
                        }
                        var12 = "";
                        try {
                            var12 = var17_27 = String.format(var23_32, "\n[%,.1f | %.2e]", new Object[]{-1234.0, -4.56E-78});
                            ** GOTO lbl87
                        }
                        catch (Throwable var17_29) {
                            e1.a(var17_29);
lbl87:
                            // 2 sources

                            var16_9.put(var24_33, var13_24);
                            var20_7.add(var13_24);
                        }
                        var17_27 = new SpannableStringBuilder();
                        var17_27.append((CharSequence)var23_32.getDisplayName(var23_32));
                        var24_33 = new ForegroundColorSpan(z1.d.s);
                        var3_20 = var17_27.length();
                        try {
                            var17_27.setSpan((Object)var24_33, 0, var3_20, 33);
                            var3_20 = var17_27.length();
                            var17_27.append((CharSequence)" (");
                            var17_27.append((CharSequence)var13_24);
                            var17_27.append(')');
                            var24_33 = new ForegroundColorSpan(z1.d.r);
                            var17_27.setSpan((Object)var24_33, var3_20, var17_27.length(), 33);
                            var3_20 = var17_27.length();
                            var17_27.append((CharSequence)var12);
                            var24_33 = new RelativeSizeSpan(0.6f);
                            var17_27.setSpan((Object)var24_33, var3_20, var17_27.length(), 33);
                            var24_33 = new ForegroundColorSpan(z1.d.t);
                            var17_27.setSpan((Object)var24_33, var3_20, var17_27.length(), 33);
                            var19_8.add(var17_27);
                            break block31;
                        }
                        catch (Throwable var17_30) {
                            break block33;
                        }
                        catch (Throwable var17_31) {
                            // empty catch block
                        }
                    }
                    try {
                        e1.a((Throwable)var17_27);
                        var17_27 = new StringBuilder();
                        var17_27.append(var23_32.getDisplayName(var23_32));
                        var17_27.append(" (");
                        var17_27.append((String)var13_24);
                        var17_27.append(')');
                        var17_27.append((String)var12);
                        var19_8.add(var17_27.toString());
                        break block31;
                    }
                    catch (Throwable var12_3) {
                        break block28;
                    }
                    {
                        catch (Throwable var12_4) {
                            break block28;
                        }
                    }
                    break block28;
                    catch (Throwable var13_25) {}
                    ** GOTO lbl55
                    catch (Throwable var13_26) {
                        var6_22 = var8_15;
                        ** continue;
                    }
                }
                var17_27 = new StringBuilder();
                var17_27.append("Failed check locale: ");
                var17_27.append((String)var13_24);
                e1.l(var17_27.toString(), (Throwable)var12);
            }
            var8_15 = var6_22;
        }
        ConfigListAdapter.g(var21_11, k.d(k.b()), var22_12, var18_10);
        k.g();
        n2.i(new Runnable((ListAdapter)new ArrayAdapter<E>(MainService.context, var19_8), var0_19, var20_7){
            final ListAdapter a;
            final int b;
            final List c;
            {
                this.a = listAdapter;
                this.b = n3;
                this.c = list;
            }

            @Override
            public void run() {
                android.ext.f.o(android.ext.f.c(Tools.k0()).setCustomTitle(Tools.g0(2131296950)).setSingleChoiceItems(this.a, this.b, new DialogInterface.OnClickListener(this){
                    final r a;
                    {
                        this.a = r3;
                    }

                    public void onClick(DialogInterface dialogInterface, int n3) {
                        try {
                            k.i((String)this.a.c.get(n3));
                            ConfigListAdapter.m();
                        }
                        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Failed get locale for index: ");
                            stringBuilder.append(n3);
                            e1.l(stringBuilder.toString(), indexOutOfBoundsException);
                        }
                        Tools.D(dialogInterface);
                    }
                }));
            }
        });
    }

    private static void f() {
        if (Config.C && !j) {
            int[] nArray;
            for (int i3 = 0; i3 < (nArray = h).length; ++i3) {
                if (nArray[i3] != 2131296620) continue;
                nArray[i3] = 2131296619;
            }
            j = true;
        }
    }

    private static String g(Configuration object, Locale serializable, AssetManager assetManager, DisplayMetrics displayMetrics) {
        Configuration configuration = new Configuration(object);
        ConfigListAdapter.q(configuration, (Locale)serializable);
        try {
            object = MainService.context.createConfigurationContext(configuration).getResources();
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            object = null;
        }
        Configuration configuration2 = object;
        if (object == null) {
            configuration2 = new Resources(assetManager, displayMetrics, configuration);
        }
        try {
            object = String.format((Locale)serializable, "%,d;%,d;%e;%e;%e;%e;", 1234567890, -1234567890, 1.23456E300, -1.23456E300, 1.23456E-300, -1.23456E-300);
        }
        catch (Exception exception) {
            e1.a(exception);
            object = "";
        }
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append(configuration2.getString(2131296732));
        ((StringBuilder)serializable).append((String)object);
        return ((StringBuilder)serializable).toString();
    }

    public static DialogInterface.OnClickListener h() {
        return new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n3) {
                ConfigListAdapter.s();
            }
        };
    }

    public static String i() {
        SharedPreferences sharedPreferences = Tools.M0();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        StringBuilder stringBuilder = new StringBuilder();
        long l3 = sharedPreferences.getLong("mc", 0L);
        editor.remove("mc");
        if (l3 != 0L) {
            stringBuilder.append("&mc=");
            stringBuilder.append('=');
            stringBuilder.append(Long.toHexString(l3));
        }
        editor.commit();
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void j(int n3) {
        Throwable throwable2;
        block16: {
            int n4;
            block15: {
                if (n3 == 3) {
                    try {
                        n4 = Tools.M0().getInt("hide-icon", 0);
                        break block15;
                    }
                    catch (Throwable throwable2) {
                        break block16;
                    }
                }
                n4 = n3;
            }
            if (n4 == 1 && android.ext.r.n instanceof MainActivity || n4 == 2 && android.ext.r.n instanceof ActivityMain) {
                if (n3 == 3) return;
                android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(2131296679)).setMessage((CharSequence)b2.f(2131296312)).setNegativeButton((CharSequence)b2.f(2131296836), null));
                return;
            }
            CharSequence charSequence = Tools.C0();
            Object object = Tools.B0();
            ComponentName componentName = new ComponentName((String)charSequence, ActivityMain.class.getName());
            ComponentName componentName2 = new ComponentName((String)charSequence, MainActivity.class.getName());
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("hide A: ");
            ((StringBuilder)charSequence).append(n4);
            ((StringBuilder)charSequence).append("; ");
            ((StringBuilder)charSequence).append(componentName2);
            ((StringBuilder)charSequence).append(": ");
            ((StringBuilder)charSequence).append(object.getComponentEnabledSetting(componentName2));
            ((StringBuilder)charSequence).append("; ");
            ((StringBuilder)charSequence).append(componentName);
            ((StringBuilder)charSequence).append(": ");
            ((StringBuilder)charSequence).append(object.getComponentEnabledSetting(componentName));
            ((StringBuilder)charSequence).append(';');
            e1.d(((StringBuilder)charSequence).toString());
            if (n3 == 3) {
                int n5 = object.getComponentEnabledSetting(componentName2) == 2 ? 1 : 0;
                int n6 = object.getComponentEnabledSetting(componentName);
                int n7 = 10;
                n6 = n6 == 2 ? 10 : 0;
                if (n4 == 1) {
                    n7 = 1;
                } else if (n4 != 2) {
                    n7 = 0;
                }
                if (n5 + n6 == n7) {
                    return;
                }
            }
            if (n4 != 1) {
                Tools.w1(1, componentName2, 1);
            }
            if (n4 != 2) {
                Tools.w1(3, componentName, 1);
            }
            if (n4 == 1) {
                Tools.w1(5, componentName2, 2);
            }
            if (n4 == 2) {
                Tools.w1(7, componentName, 2);
            }
            if (n4 != 1) {
                Tools.w1(9, componentName2, 1);
            }
            if (n4 != 2) {
                Tools.w1(11, componentName, 1);
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("hide Z: ");
            ((StringBuilder)charSequence).append(n4);
            ((StringBuilder)charSequence).append("; ");
            ((StringBuilder)charSequence).append(componentName2);
            ((StringBuilder)charSequence).append(": ");
            ((StringBuilder)charSequence).append(object.getComponentEnabledSetting(componentName2));
            ((StringBuilder)charSequence).append("; ");
            ((StringBuilder)charSequence).append(componentName);
            ((StringBuilder)charSequence).append(": ");
            ((StringBuilder)charSequence).append(object.getComponentEnabledSetting(componentName));
            ((StringBuilder)charSequence).append(';');
            e1.d(((StringBuilder)charSequence).toString());
            if (n3 == 3) return;
            object = new g2();
            ((g2)object).g("hide-icon", n4, 0).commit();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed disable icon ");
        stringBuilder.append(n3);
        e1.l(stringBuilder.toString(), throwable2);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean k() {
        boolean bl;
        block10: {
            void var4_4;
            block9: {
                block13: {
                    block12: {
                        int n3;
                        int n4;
                        Object[] objectArray;
                        block11: {
                            block8: {
                                block7: {
                                    bl = false;
                                    try {
                                        objectArray = Build.SUPPORTED_64_BIT_ABIS;
                                        if (objectArray == null) break block7;
                                    }
                                    catch (Throwable throwable) {
                                        break block9;
                                    }
                                    n4 = objectArray.length;
                                    if (n4 <= 0) break block7;
                                    bl = true;
                                    break block8;
                                }
                                bl = false;
                            }
                            try {
                                FileInputStream fileInputStream = new FileInputStream("/proc/self/auxv");
                                objectArray = new byte[4096];
                                n3 = ((InputStream)fileInputStream).read((byte[])objectArray);
                                ((InputStream)fileInputStream).close();
                                if (n3 <= 0) break block10;
                                if (n3 % 16 != 8) break block11;
                                return false;
                            }
                            catch (Throwable throwable) {}
                        }
                        for (n4 = 0; n4 < n3; n4 += 16) {
                            String string2;
                            if (objectArray[n4 + 4] == false && objectArray[n4 + 5] == false && objectArray[n4 + 6] == false && (string2 = objectArray[n4 + 7]) == false) {
                                continue;
                            }
                            break block12;
                        }
                        break block13;
                        break block9;
                    }
                    return false;
                }
                return true;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed check 64 client. Used: ");
            stringBuilder.append(bl);
            e1.s(stringBuilder.toString(), (Throwable)var4_4);
        }
        return bl;
    }

    static void m() {
        android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(2131296280)).setMessage((CharSequence)b2.f(2131296425)).setPositiveButton((CharSequence)b2.f(2131296904), (DialogInterface.OnClickListener)new p0(200, true)).setNegativeButton((CharSequence)b2.f(2131296963), null));
    }

    private static void n() {
        new g2().i("mc", g, 0L).commit();
    }

    private void p(TextView textView) {
        int n3;
        switch (textView.getId()) {
            default: {
                n3 = 0;
                break;
            }
            case 2131034394: {
                n3 = 2130968594;
                break;
            }
            case 2131034277: {
                n3 = 2130968623;
                break;
            }
            case 2131034211: {
                n3 = 2130968617;
                break;
            }
            case 2131034208: {
                n3 = 2130968604;
                break;
            }
            case 2131034205: {
                n3 = 2130968609;
                break;
            }
            case 2131034198: {
                n3 = 2130968653;
                break;
            }
            case 2131034193: {
                n3 = 2130968600;
                break;
            }
            case 2131034173: {
                n3 = 2130968655;
                break;
            }
            case 2131034168: {
                n3 = 2130968626;
                break;
            }
            case 2131034151: {
                n3 = 2130968634;
            }
        }
        if (n3 != 0) {
            Tools.c(textView, Tools.o0(n3), Config.d());
        }
    }

    public static void q(Configuration configuration, Locale locale) {
        try {
            configuration.setLocale(locale);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
        try {
            configuration.setLayoutDirection(locale);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
        try {
            configuration.locale = locale;
        }
        catch (Throwable throwable) {
            e1.l("Failed set locale", throwable);
        }
    }

    private static void r(AlertDialog alertDialog, View.OnClickListener onClickListener, android.widget.EditText editText) {
        alertDialog.setButton(-1, (CharSequence)b2.f(2131296334), new DialogInterface.OnClickListener(onClickListener, alertDialog){
            final View.OnClickListener a;
            final AlertDialog b;
            {
                this.a = onClickListener;
                this.b = alertDialog;
            }

            public void onClick(DialogInterface dialogInterface, int n3) {
                this.a.onClick((View)this.b.getButton(-1));
            }
        });
        android.ext.f.l(alertDialog, new DialogInterface.OnShowListener(onClickListener){
            final View.OnClickListener a;
            {
                this.a = onClickListener;
            }

            public void onShow(DialogInterface dialogInterface) {
                Tools.s1(dialogInterface, -1, null, this.a);
            }
        });
        android.ext.f.n(alertDialog, editText);
    }

    public static void s() {
        ConfigListAdapter.t(0);
    }

    public static void t(int n3) {
        Object object;
        ConfigListAdapter.f();
        CharSequence[] charSequenceArray = new String[h.length / 3 + 1];
        int n4 = 0;
        for (int i3 = 0; i3 < ((int[])(object = h)).length; ++i3) {
            int n5 = n4;
            if (i3 % 3 == 0) {
                n5 = i3 / 3 + 1;
                int n6 = object[i3];
                if (n3 == n6 || n3 == object[i3 + 1]) {
                    n4 = n5;
                }
                charSequenceArray[n5] = b2.f(n6);
                n5 = n4;
            }
            n4 = n5;
        }
        charSequenceArray[0] = b2.f(2131297087);
        object = new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface object, int n3) {
                if (n3 == 0) {
                    new r.n("kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2fdwhjru|250ylghr0wxwruldov2").onClick((DialogInterface)object, n3);
                } else {
                    object = new StringBuilder();
                    Object object2 = h;
                    int n4 = (n3 - 1) * 3;
                    ((StringBuilder)object).append(b2.f(object2[n4]));
                    ((StringBuilder)object).append(":\n");
                    ((StringBuilder)object).append(b2.f(object2[n4 + 1]));
                    Object object3 = ((StringBuilder)object).toString();
                    n3 = object2[n4 + 2];
                    object = object3;
                    if (n3 >= 0) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append(((String)object3).trim());
                        ((StringBuilder)object).append("\n\n");
                        object = object3 = ((StringBuilder)object).toString();
                        if (((String)object3).charAt(((String)object3).length() - 3) != ':') {
                            object = new StringBuilder();
                            ((StringBuilder)object).append((String)object3);
                            ((StringBuilder)object).append(b2.f(2131297086));
                            ((StringBuilder)object).append(":\n");
                            object = ((StringBuilder)object).toString();
                        }
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append((String)object);
                        ((StringBuilder)object3).append(Tools.removeNewLinesChars(i[n3]));
                        object = ((StringBuilder)object3).toString();
                    }
                    object3 = object;
                    if (object2[n4] == 2131296613) {
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append(((String)object).replace(b2.f(2131296916), b2.f(2131296280)));
                        ((StringBuilder)object3).append("\nhttps://productforums.google.com/forum/#!topic/translate/1Pywh5vI1kE\n\n");
                        ((StringBuilder)object3).append(Tools.N1(2131297101));
                        ((StringBuilder)object3).append(":\n");
                        ((StringBuilder)object3).append(Tools.removeNewLinesChars("kwwsv=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25730krz0wr0xvh0jdphjxdugldq0zlwkrxw0iordw0zlqgrz0jdphjxdugldq2"));
                        object3 = ((StringBuilder)object3).toString();
                    }
                    View view = a.d.f(2131099658, null);
                    object = (TextView)view.findViewById(2131034148);
                    Tools.v1((TextView)object, (String)object3);
                    Tools.u(object.getText());
                    object = android.ext.f.b().setView(view).setNegativeButton((CharSequence)b2.f(2131296836), ConfigListAdapter.h());
                    if (object2[n4] == 2131297106) {
                        object.setPositiveButton(2131296786, (DialogInterface.OnClickListener)new r.n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf24<7540yluwxdo0vsdfhv0wr0uxq0jdphjxdugldq0zlwkrxw0urrw2"));
                    }
                    android.ext.f.o((AlertDialog.Builder)object);
                    if (Config.C && object2[n4] == 2131296621) {
                        int n5 = 2;
                        try {
                            if ((Tools.Y((String)Config.E).flags & 2) == 0) {
                                object = android.ext.f.b().setMessage((CharSequence)Tools.L1(b2.f(2131296819), Config.F, Config.F));
                                object3 = b2.f(2131296455);
                                object2 = new r.n;
                                object2("kwws=22jdphjxdugldq1qhw2iruxp2wrslf24<7540yluwxdo0vsdfhv0wr0uxq0jdphjxdugldq0zlwkrxw0urrw2");
                                android.ext.f.o(object.setNeutralButton((CharSequence)object3, (DialogInterface.OnClickListener)object2).setNegativeButton((CharSequence)b2.f(2131296836), null));
                            }
                        }
                        catch (Throwable throwable) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append("Failed check vSpace: ");
                            ((StringBuilder)object).append(Config.E);
                            e1.s(((StringBuilder)object).toString(), throwable);
                        }
                        n3 = n4 = (int)Config.G;
                        if (n4 == 0) {
                            int n6 = n5;
                            if (ConfigListAdapter.k()) {
                                n6 = n5;
                                if (Config.E.contains("64")) {
                                    n6 = 1;
                                }
                            }
                            Config.G = (byte)n6;
                            n3 = n6;
                        }
                        if (n3 == 1) {
                            try {
                                android.ext.f.o(android.ext.f.b().setMessage((CharSequence)b2.f(2131297089)).setNegativeButton((CharSequence)b2.f(2131296836), null));
                            }
                            catch (Throwable throwable) {
                                object3 = new StringBuilder();
                                ((StringBuilder)object3).append("Failed check vSpace: ");
                                ((StringBuilder)object3).append(Config.E);
                                e1.s(((StringBuilder)object3).toString(), throwable);
                            }
                        }
                    }
                }
            }
        };
        if (n4 == 0) {
            android.ext.f.o(android.ext.f.b().setItems(charSequenceArray, (DialogInterface.OnClickListener)object).setNegativeButton((CharSequence)b2.f(2131296311), null));
        } else {
            object.onClick(null, n4);
        }
    }

    private void u() {
        new g0(this, "loadLogcat"){
            final ConfigListAdapter a;
            {
                this.a = configListAdapter;
                super(string2);
            }

            @Override
            public void run() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Logcat: ");
                stringBuilder.append(b2.f(2131296754));
                Tools.K1(stringBuilder.toString(), 0);
                stringBuilder = new StringBuilder();
                stringBuilder.append(new GregorianCalendar().getTime().toString());
                stringBuilder.append('\n');
                stringBuilder.append(h0.f(true));
                Tools.h(stringBuilder.toString(), 3);
            }
        }.start();
    }

    static void v() {
        android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(2131296925)).setMessage((CharSequence)Tools.L1(b2.f(2131296927), 8)).setNegativeButton((CharSequence)b2.f(2131296311), null).setPositiveButton((CharSequence)b2.f(2131296836), new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface object, int n3) {
                object = MainService.instance;
                try {
                    ((MainService)object).t();
                    Handler handler = n2.d();
                    Runnable runnable = new Runnable(this){
                        final f a;
                        {
                            this.a = f4;
                        }

                        @Override
                        public void run() {
                            try {
                                MainService mainService = MainService.instance;
                                mainService.t();
                                mainService.j.m();
                                mainService.m1(false);
                            }
                            catch (Throwable throwable) {
                                e1.l("Failed restore after take screenshot", throwable);
                            }
                        }
                    };
                    handler.postDelayed(runnable, 8000L);
                    ((MainService)object).m1(true);
                    ((MainService)object).j.e();
                    handler = n2.d();
                    runnable = new Runnable(this){
                        final f a;
                        {
                            this.a = f4;
                        }

                        @Override
                        public void run() {
                            MainService.instance.i.T0();
                        }
                    };
                    handler.postDelayed(runnable, 300L);
                    return;
                }
                catch (Throwable throwable) {
                    e1.l("Failed take screenshot", throwable);
                    try {
                        ((MainService)object).j.m();
                    }
                    catch (Throwable throwable2) {
                        e1.l("Failed restore after take screenshot", throwable2);
                    }
                    return;
                }
            }
        }));
    }

    public int getCount() {
        return this.a.length;
    }

    public Object getItem(int n3) {
        return null;
    }

    public long getItemId(int n3) {
        return n3;
    }

    public View getView(int n3, View viewArray, ViewGroup viewGroup) {
        viewArray = this.a;
        if (n3 >= viewArray.length) {
            return new View(Tools.f0());
        }
        return viewArray[n3];
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void l(boolean bl) {
        if (bl) {
            if (this.a.length > 0) {
                return;
            }
        } else {
            if (this.a.length == 0) {
                return;
            }
            ListView listView = MainService.instance.Y;
            this.f = Tools.J0(listView);
            this.a = d.b.b;
            this.notifyDataSetChanged();
            listView.setAdapter(null);
            return;
        }
        Object object = (ViewGroup)a.d.f(2131099674, null);
        this.b = new WeakReference<TextView>((TextView)object.findViewById(2131034275));
        this.c = new WeakReference<TextView>((TextView)object.findViewById(2131034172));
        this.d = new WeakReference<ImageView>((ImageView)object.findViewById(2131034171));
        Object object2 = new ArrayList();
        int n3 = 0;
        while (true) {
            block12: {
                if (n3 < object.getChildCount()) {
                    View view = object.getChildAt(n3);
                    if (view.getVisibility() != 8) {
                        if (view instanceof TextView) {
                            ((TextView)view).setText((CharSequence)b2.g(((TextView)view).getText().toString().trim()));
                            this.p((TextView)view);
                        }
                        AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(-1, -2, 0);
                        view.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
                        ((ArrayList)object2).add(view);
                    }
                    break block12;
                }
                object = ((ArrayList)object2).iterator();
                while (true) {
                    if (!object.hasNext()) {
                        this.a = ((ArrayList)object2).toArray(new View[((ArrayList)object2).size()]);
                        this.notifyDataSetChanged();
                        object2 = MainService.instance;
                        ((MainService)object2).Y.setAdapter((ListAdapter)this);
                        object2 = ((MainService)object2).j;
                        this.o();
                        this.w(((FloatPanel)((Object)object2)).getLayoutAlpha(), ((HotPoint)((Object)object2)).getVanishingTime(), null, null, ((HotPoint)((Object)object2)).getSize());
                        object2 = this.f;
                        if (object2 == null) return;
                        Tools.A1(MainService.instance.Y, (Tools.a0)object2);
                        MainService.instance.Y.post(new Runnable(this, (Tools.a0)object2){
                            final Tools.a0 a;
                            final ConfigListAdapter b;
                            {
                                this.b = configListAdapter;
                                this.a = a02;
                            }

                            @Override
                            public void run() {
                                Tools.A1(MainService.instance.Y, this.a);
                            }
                        });
                        return;
                    }
                    Tools.O0((View)object.next());
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {}
            }
            ++n3;
        }
    }

    public void notifyDataSetChanged() {
        if (!this.e) {
            this.e = true;
            this.x();
            this.e = false;
        }
        super.notifyDataSetChanged();
    }

    void o() {
        TextView textView = (TextView)this.b.get();
        if (textView == null) {
            return;
        }
        String string2 = b2.f(2131296510);
        Object object = MainService.instance.v0;
        object = object != null ? ((z1.d)object).b : null;
        CharSequence charSequence = string2;
        if (object != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(Tools.O1(string2));
            ((StringBuilder)charSequence).append(" \"");
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append("\":");
            charSequence = ((StringBuilder)charSequence).toString();
        }
        textView.setText(charSequence);
    }

    /*
     * Unable to fully structure code
     */
    public void onItemClick(AdapterView var1_1, View var2_3, int var3_4, long var4_5) {
        if (var2_3 == null) {
            return;
        }
        var7_6 = var2_3.getId();
        if (var7_6 == -1) {
            return;
        }
        var4_5 = ConfigListAdapter.g;
        var9_7 = 1L << var3_4 % 63;
        if ((var4_5 & var9_7) == 0L) {
            ConfigListAdapter.g = var9_7 | var4_5;
            ConfigListAdapter.n();
        }
        var12_8 = MainService.instance;
        var2_3 = Config.b(var7_6);
        if (var2_3 != null) {
            if (var7_6 == 2131034177) {
                var1_1 = new Config.p.a(this){
                    final ConfigListAdapter a;
                    {
                        this.a = configListAdapter;
                    }

                    @Override
                    public int a(DialogInterface dialogInterface, int n3) {
                        int n4 = n3;
                        if (n3 == 1) {
                            n4 = n3;
                            if (!InternalKeyboard.a()) {
                                MainService.I0();
                                n4 = 0;
                            }
                        }
                        return n4;
                    }
                };
lbl16:
                // 2 sources

                while (true) {
                    var2_3.f((Config.p.a)var1_1);
                    break;
                }
            } else if (var7_6 == 2131034173) {
                var1_1 = new Config.p.a(this){
                    final ConfigListAdapter a;
                    {
                        this.a = configListAdapter;
                    }

                    @Override
                    public int a(DialogInterface dialogInterface, int n3) {
                        if (n3 != Config.o) {
                            ConfigListAdapter.m();
                        }
                        return n3;
                    }
                };
                ** continue;
            }
            var2_3.b();
            return;
        }
        block1 : switch (var7_6) {
            default: {
                var1_1 = new StringBuilder();
                var1_1.append("Unknown id in config: ");
                var1_1.append(var7_6);
                e1.p(var1_1.toString());
                break;
            }
            case 2131034403: {
                this.u();
                break;
            }
            case 2131034394: {
                ConfigListAdapter.v();
                break;
            }
            case 2131034284: {
                var1_1 = new CharSequence[3];
                var2_3 = new StringBuilder();
                var2_3.append(b2.f(2131296820));
                var2_3.append(" (");
                var2_3.append(b2.f(2131296373));
                var2_3.append(')');
                var1_1[0] = var2_3.toString();
                var1_1[1] = b2.f(2131296282);
                var1_1[2] = b2.f(2131296281);
                var11_9 = android.ext.f.b().setCustomTitle(Tools.g0(2131296679)).setItems((CharSequence[])var1_1, new DialogInterface.OnClickListener(this){
                    final ConfigListAdapter a;
                    {
                        this.a = configListAdapter;
                    }

                    public void onClick(DialogInterface dialogInterface, int n3) {
                        ConfigListAdapter.j(n3);
                    }
                }).create();
                var2_3 = var11_9.getListView();
                if (var2_3 != null) {
                    Tools.e((ListView)var2_3, (CharSequence[])var1_1, new Drawable[]{null, Tools.o0(0x7F070007), Tools.o0(2131165188)}, 48, 0);
                }
                android.ext.f.m(var11_9);
                break;
            }
            case 2131034277: {
                ConfigListAdapter.s();
                break;
            }
            case 2131034228: {
                new r.n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf25<;940grqdwh2").onClick(null, 0);
                break;
            }
            case 2131034208: {
                var1_1 = MainService.instance.o0;
lbl69:
                // 2 sources

                while (true) {
                    var1_1.h();
                    break block1;
                    break;
                }
            }
            case 2131034206: {
                ConfigListAdapter.c();
                break;
            }
            case 2131034200: {
                ConfigListAdapter.b();
                break;
            }
            case 2131034198: {
                try {
                    var1_1 = a.d.f(2131099655, null);
                }
                catch (IndexOutOfBoundsException var1_2) {
                    e1.a(var1_2);
                    MainService.I0();
                    var1_1 = null;
                }
                if (var1_1 == null) break;
                var2_3 = (TextView)var1_1.findViewById(2131034285);
                var11_10 = (TextView)var1_1.findViewById(2131034328);
                var11_10.setText((CharSequence)b2.g(var11_10.getText().toString().trim()));
                var11_10 = (EditTextSpeeds)var1_1.findViewById(2131034413);
                var12_8 = (TextView)var1_1.findViewById(2131034224);
                var13_13 = new StringBuilder();
                var13_13.append(Tools.N1(2131296372));
                var13_13.append(": ");
                var13_13.append(d1.c());
                var12_8.setText((CharSequence)var13_13.toString());
                var12_8.setOnClickListener(new View.OnClickListener(this, (EditTextSpeeds)var11_10){
                    final EditTextSpeeds a;
                    final ConfigListAdapter b;
                    {
                        this.b = configListAdapter;
                        this.a = editTextSpeeds;
                    }

                    public void onClick(View view) {
                        this.a.setText(d1.c());
                    }
                });
                var11_10.setText((CharSequence)MainService.instance.k0.b());
                var11_10.setDataType(16);
                var11_10.setOnChangedListener(new EditTextSpeeds.a(this, (EditTextSpeeds)var11_10, (TextView)var2_3){
                    final EditTextSpeeds a;
                    final TextView b;
                    final ConfigListAdapter c;
                    {
                        this.c = configListAdapter;
                        this.a = editTextSpeeds;
                        this.b = textView;
                    }

                    @Override
                    public void a(EditText editText, int n3, int n4) {
                        this.c();
                    }

                    @Override
                    public void b(EditText editText, CharSequence charSequence, int n3, int n4, int n5) {
                        this.c();
                    }

                    public void c() {
                        Object object;
                        block15: {
                            block14: {
                                double d4;
                                int n3;
                                int n4;
                                block13: {
                                    int n5;
                                    block12: {
                                        block11: {
                                            object = this.a;
                                            if (object == null || this.b == null) break block14;
                                            object = object.getText().toString().trim();
                                            n3 = n4 = this.a.getSelectionStart();
                                            if (n4 < 0) {
                                                n3 = 0;
                                            }
                                            n4 = n3;
                                            if (n3 >= ((String)object).length()) {
                                                n4 = ((String)object).length() - 1;
                                            }
                                            n5 = -1;
                                            if (n4 > 0) break block11;
                                            n3 = -1;
                                            break block12;
                                        }
                                        n3 = ((String)object).lastIndexOf(59, n4 - 1);
                                    }
                                    if (n3 < 0) {
                                        n3 = n5;
                                    }
                                    n4 = n5 = ((String)object).indexOf(59, n4);
                                    if (n5 >= 0) break block13;
                                    try {
                                        n4 = ((String)object).length();
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        object = "???";
                                    }
                                }
                                if ((d4 = Tools.j1(((String)object).substring(n3 + 1, n4))) > 0.0) {
                                    object = d1.d(d4);
                                    object = Tools.L1(b2.f(2131296977), Tools.g1(((d1.a)object).b), Tools.g1(((d1.a)object).a));
                                }
                                object = "??";
                                break block15;
                                break block15;
                            }
                            object = "?";
                        }
                        this.b.setText((CharSequence)object);
                    }
                });
                android.ext.f.q(android.ext.f.b().setView(InternalKeyboard.d((View)var1_1)).setPositiveButton((CharSequence)b2.f(2131296334), new DialogInterface.OnClickListener(this, (EditTextSpeeds)var11_10){
                    final EditTextSpeeds a;
                    final ConfigListAdapter b;
                    {
                        this.b = configListAdapter;
                        this.a = editTextSpeeds;
                    }

                    public void onClick(DialogInterface object, int n3) {
                        object = this.a.getText().toString().trim();
                        y0.b((String)object, 16);
                        MainService.instance.k0.g((String)object);
                    }
                }).setNegativeButton((CharSequence)b2.f(2131296311), null), (EditText)var11_10);
                break;
            }
            case 2131034196: {
                var1_1 = MainService.instance.n0;
                ** continue;
            }
            case 2131034191: {
                var12_8.r(true);
                break;
            }
            case 2131034190: {
                h0.h();
                break;
            }
            case 2131034185: {
                ConfigListAdapter.a(null);
                break;
            }
            case 2131034180: {
                var1_1 = a.d.f(2131099658, null);
                ((TextView)var1_1.findViewById(2131034148)).setText((CharSequence)e1.f);
                var1_1 = android.ext.f.b().setCustomTitle(Tools.g0(2131296737)).setView((View)var1_1);
lbl123:
                // 2 sources

                while (true) {
                    var2_3 = b2.f(2131296836);
lbl125:
                    // 3 sources

                    while (true) {
                        var1_1 = var1_1.setNegativeButton((CharSequence)var2_3, null);
lbl127:
                        // 2 sources

                        while (true) {
                            android.ext.f.o((AlertDialog.Builder)var1_1);
                            break block1;
                            break;
                        }
                        break;
                    }
                    break;
                }
            }
            case 2131034179: {
                ConfigListAdapter.d();
                break;
            }
            case 2131034178: {
                var1_1 = android.ext.f.b().setCustomTitle(Tools.g0(2131296726)).setMessage((CharSequence)b2.f(2131296728)).setPositiveButton((CharSequence)b2.f(2131297115), new DialogInterface.OnClickListener(this, (MainService)var12_8){
                    final MainService a;
                    final ConfigListAdapter b;
                    {
                        this.b = configListAdapter;
                        this.a = mainService;
                    }

                    public void onClick(DialogInterface dialogInterface, int n3) {
                        this.a.v0();
                    }
                });
lbl135:
                // 2 sources

                while (true) {
                    var2_3 = b2.f(2131296805);
                    ** GOTO lbl125
                    break;
                }
            }
            case 2131034170: {
                var1_1 = a.d.f(2131099676, null);
                var13_14 = (SeekBar)var1_1.findViewById(2131034430);
                var2_3 = (SeekBar)var1_1.findViewById(2131034283);
                var11_11 = (SeekBar)var1_1.findViewById(2131034405);
                var15_15 = (TextView)var1_1.findViewById(2131034172);
                var14_16 = (ImageView)var1_1.findViewById(2131034171);
                var6_17 = var12_8.j.getLayoutAlpha();
                var7_6 = var12_8.j.getVanishingTime();
                var8_19 = var12_8.j.getSize();
                var13_14.setProgress(10 - (int)(10.0f * var6_17));
                var3_4 = var7_6 < 0 ? var2_3.getMax() : var7_6;
                var2_3.setProgress(var3_4);
                var11_11.setMax(12);
                var11_11.setProgress(var8_19);
                this.w(var6_17, var7_6, var15_15, var14_16, var8_19);
                var12_8 = new SeekBar.OnSeekBarChangeListener(this, var13_14, (SeekBar)var2_3, var11_11, var15_15, var14_16){
                    final SeekBar a;
                    final SeekBar b;
                    final SeekBar c;
                    final TextView d;
                    final ImageView e;
                    final ConfigListAdapter f;
                    {
                        this.f = configListAdapter;
                        this.a = seekBar;
                        this.b = seekBar2;
                        this.c = seekBar3;
                        this.d = textView;
                        this.e = imageView;
                    }

                    public void onProgressChanged(SeekBar seekBar, int n3, boolean bl) {
                        float f4 = (float)(10 - this.a.getProgress()) / 10.0f;
                        n3 = this.b.getMax() == this.b.getProgress() ? -1 : this.b.getProgress();
                        int n4 = this.c.getProgress();
                        this.f.w(f4, n3, this.d, this.e, n4);
                    }

                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }
                };
                var13_14.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)var12_8);
                var2_3.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)var12_8);
                var11_11.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)var12_8);
                var1_1 = android.ext.f.b().setPositiveButton((CharSequence)b2.f(2131296836), null).setView((View)var1_1);
                ** continue;
            }
            case 2131034161: {
                var1_1 = android.ext.f.b().setCustomTitle(Tools.g0(2131296424)).setPositiveButton((CharSequence)b2.f(2131297115), (DialogInterface.OnClickListener)new p0(300));
                ** continue;
            }
            case 2131034160: {
                if (!f1.y()) break;
                var1_1 = android.ext.f.b().setCustomTitle(Tools.g0(2131296381)).setMessage((CharSequence)b2.f(2131297099)).setPositiveButton((CharSequence)b2.f(2131296836), new DialogInterface.OnClickListener(this, (MainService)var12_8){
                    final MainService a;
                    final ConfigListAdapter b;
                    {
                        this.b = configListAdapter;
                        this.a = mainService;
                    }

                    public void onClick(DialogInterface dialogInterface, int n3) {
                        this.a.i.s();
                    }
                });
lbl166:
                // 2 sources

                while (true) {
                    var2_3 = b2.f(2131296311);
                    ** continue;
                    break;
                }
            }
            case 2131034156: {
                var2_3 = android.ext.f.b().setCustomTitle(Tools.g0(2131296324)).setMessage((CharSequence)b2.f(2131296325));
                var11_12 = b2.f(2131296836);
                var1_1 = new DialogInterface.OnClickListener(this){
                    final ConfigListAdapter a;
                    {
                        this.a = configListAdapter;
                    }

                    public void onClick(DialogInterface dialogInterface, int n3) {
                        y0.c();
                    }
                };
lbl173:
                // 2 sources

                while (true) {
                    var1_1 = var2_3.setPositiveButton((CharSequence)var11_12, (DialogInterface.OnClickListener)var1_1);
                    ** continue;
                    break;
                }
            }
            case 2131034155: {
                var2_3 = android.ext.f.b().setMessage((CharSequence)b2.f(2131296900));
                var11_12 = b2.f(2131296334);
                var1_1 = new DialogInterface.OnClickListener(this){
                    final ConfigListAdapter a;
                    {
                        this.a = configListAdapter;
                    }

                    public void onClick(DialogInterface dialogInterface, int n3) {
                        Config.c = 0L;
                        Config.k();
                    }
                };
                ** continue;
            }
            case 2131034148: {
                new g0(this, "changelog"){
                    final ConfigListAdapter a;
                    {
                        this.a = configListAdapter;
                        super(string2);
                    }

                    /*
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     */
                    @Override
                    public void run() {
                        StringBuilder stringBuilder;
                        block4: {
                            Throwable throwable2;
                            block3: {
                                BufferedReader bufferedReader;
                                stringBuilder = new StringBuilder();
                                try {
                                    Object object = new URL(Tools.removeNewLinesChars("kwws=22jdphjxdugldq1qhw2yhuvlrq1w{w"));
                                    InputStreamReader inputStreamReader = new InputStreamReader(((URL)object).openStream());
                                    bufferedReader = new BufferedReader(inputStreamReader);
                                    while ((object = bufferedReader.readLine()) != null) {
                                        stringBuilder.append((String)object);
                                        stringBuilder.append('\n');
                                    }
                                }
                                catch (Throwable throwable2) {
                                    break block3;
                                }
                                bufferedReader.close();
                                break block4;
                            }
                            e1.l("Load changelog", throwable2);
                            stringBuilder.append(throwable2.toString());
                        }
                        n2.i(new Runnable(this, stringBuilder){
                            final StringBuilder a;
                            final a b;
                            {
                                this.b = a4;
                                this.a = stringBuilder;
                            }

                            @Override
                            public void run() {
                                Tools.u1(android.ext.f.m(android.ext.f.b().setCustomTitle(Tools.g0(2131296316)).setMessage((CharSequence)this.a.toString()).setNegativeButton((CharSequence)b2.f(2131296836), null).create()));
                            }
                        });
                    }
                }.start();
                break;
            }
            case 2131034113: {
                var1_1 = new StringBuilder();
                var1_1.append("__version__ ");
                var6_18 = (float)true;
                var1_1.append(108.5f * var6_18 - 7.1f);
                var1_1.append(" (");
                var1_1.append((int)(var6_18 * 16586.3f - 431.3f + 0.5f));
                var1_1.append(")\n\n__developers__\n");
                var1_1.append(ConfigListAdapter.DEVS);
                var1_1.append("\n__special_thanks__\n\tdanilo_scala,\n\tYoungBai,\n\tKorean L,\n\tiAndroHacker,\n\tMobile46,\n\treduxpl,\n\tjan.eike.kottlarz,\n\ttimo.szillat,\n\tSubZero5,\n\tZuiXan,\n\tAlex,\n\tGanjar Sukmara,\n\tdd09david,\n\tvenomx961,\n\tchatzopoulosapostolos,\n\tWanderMax,\n\tIvan Maldonado,\n\tvesper7dd,\n\tSelfDestruct68,\n\tmallachri,\n\tAzhar Dripana,\n\tIlya Kushnir,\n\twasao0807,\n\tAlex NG,\n\tjeroen.wilmink,\n\tpodluka,\n\tAnty0,\n\tkiilerman496,\n\tthex3only,\n\tmustafayasir6,\n\tHavergal Samosir Jr.,\n\timpykid,\n\t28ado1,\n\tElectroz,\n\tvincensius.august,\n\tRuan Carlos,\n\tNurMarvin,\n\tSkullboyq,\n\tYakiaaa,\n\tag2s20150609,\n\tanitamoellerga,\n\tcoolapk_ooops,\n\tpandecheng,\n\tpkjisoo32,\n\tLeam19999,\n\tminecraft172zzz,\n\tTodd Justin York,\n\tGedablo,\n\trootddos511,\n\t楊萬林,\n\tchetraclr,\n\tcub.madrax,\n\tntnhiu,\n\tbuivanxia10,\n\twl02082201,\n\tBacklift,\n\tvonxom,\n\tPeter Cuevas H,\n\talg1.66336611,\n\tHoangthinh99hp,\n\tJackH4L,\n\tspacemaker2906,\n\tva3kama3eredeti,\n\tAustin Andrews,\n\tsaqibpiash,\n\tsuuyout,\n\tsljivics,\n\tDartel,\n\tdoungvichetra2,\n\t0968688218channa,\n\tCaptainTF,\n\tdbinkv1,\n\tronaldmoura,\n\tlafrite.cassee,\n\tJazeks,\n\tNightMareNivek,\n\tprefix309,\n\tmilad19s,\n\tliato.games,\n\tCmP,\n\t1701silentspawn,\n\tgood7773good7773good7773,\n\tATAA SY,\n\tkhiemhocrot.98,\n\ta0193143,\n\tYaroslav,\n\tzam5355,\n\tlonglix,\n\tsssidiki4,\n\tGeorge,\n\t冰鍊,\n\tFloatKey.");
                var1_1 = var1_1.toString();
                var1_1 = android.ext.f.b().setCustomTitle(Tools.g0(2131296256)).setMessage((CharSequence)b2.g((String)var1_1)).setNeutralButton((CharSequence)b2.f(2131296338), new DialogInterface.OnClickListener(this){
                    final ConfigListAdapter a;
                    {
                        this.a = configListAdapter;
                    }

                    public void onClick(DialogInterface object, int n3) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("GG: ");
                        float f4 = 1.0f;
                        ((StringBuilder)object).append(113.9f * f4 - 12.5f);
                        ((StringBuilder)object).append(" (");
                        ((StringBuilder)object).append((int)(f4 * 16694.6f - 539.6f + 0.5f));
                        ((StringBuilder)object).append("); Android: ");
                        ((StringBuilder)object).append(Build.VERSION.RELEASE);
                        ((StringBuilder)object).append(" (");
                        ((StringBuilder)object).append(Build.VERSION.SDK_INT);
                        ((StringBuilder)object).append(") [");
                        ((StringBuilder)object).append(f1.x());
                        ((StringBuilder)object).append(']');
                        Tools.A(((StringBuilder)object).toString(), false);
                    }
                }).setPositiveButton((CharSequence)b2.f(2131296962), (DialogInterface.OnClickListener)new r.n(null));
                ** continue;
            }
        }
    }

    void w(float f4, int n3, TextView object, ImageView imageView, int n4) {
        MainService mainService = MainService.instance;
        String string2 = n3 < 0 ? b2.f(2131296687) : Tools.L1(b2.f(2131296686), n3);
        try {
            string2 = Tools.L1(b2.f(2131296333), 100 - (int)(100.0f * f4), string2);
        }
        catch (Throwable throwable) {
            e1.l("Fail setup string for icon config", throwable);
            string2 = "fail";
        }
        TextView textView = (TextView)this.c.get();
        if (textView != null) {
            textView.setText((CharSequence)string2);
        }
        if (object != null) {
            object.setText((CharSequence)string2);
        }
        mainService.j.setSize(n4);
        n4 = mainService.j.getSizePx();
        object = mainService.k;
        if (object != null) {
            ((TimeJumpPanel)((Object)object)).setMinSize(n4);
        }
        if ((object = (ImageView)this.d.get()) != null) {
            Tools.y1((ImageView)object, f4 * 255.0f);
            Config.q((ImageView)object, n4);
        }
        if (imageView != null) {
            Tools.y1(imageView, 255.0f * f4);
            Config.q(imageView, n4);
        }
        mainService.j.setLayoutAlpha(f4);
        mainService.j.setVanishingTime(n3);
        mainService.V(mainService.Y.getAdapter());
    }

    public void x() {
        for (View view : this.a) {
            if (!(view instanceof TextView)) continue;
            TextView textView = (TextView)view;
            int n3 = view.getId();
            Config.p p3 = Config.b(n3);
            boolean bl = n3 == 2131034196 || n3 == 2131034208;
            if (p3 != null) {
                textView.setText((CharSequence)p3.toString());
                bl = p3.g;
            }
            if (!bl) continue;
            textView.setBackgroundColor(-2137746366);
        }
    }
}

