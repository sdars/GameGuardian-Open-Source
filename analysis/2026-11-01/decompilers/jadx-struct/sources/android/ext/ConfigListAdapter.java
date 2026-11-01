package android.ext;

import android.app.AlertDialog;
import android.app.AlertDialog$Builder;
import android.content.ComponentName;
import android.content.DialogInterface$OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
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
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView$LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;
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
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$layout;
import catch_.me_.if_.you_.can_.R$mipmap;
import catch_.me_.if_.you_.can_.R$string;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class ConfigListAdapter extends BaseAdapter implements AdapterView$OnItemClickListener {
    public static final String DEVS = "\td2dyno - __owner__, __design__, __pm__.\n\tEnyby - __code__, __pm__.\n\tTrasd - __tech__, __pm__.\n\tAqua - __creator__.\n".intern();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static long f47g = 0;
    static final int[] h = {R$string.help_faq_title, R$string.help_faq, -1, R$string.help_context_title, R$string.help_context, -1, R$string.help_basics_title, R$string.help_basics, 2, R$string.help_floating_icon_title, R$string.help_floating_icon_, -1, R$string.help_scripts_title, R$string.help_scripts, 21, R$string.help_exact_search_title, R$string.help_exact_search, -1, R$string.help_speedhack_title, R$string.help_speedhack, 1, R$string.help_group_search_title, R$string.help_group_search_, 6, R$string.help_range_search_title, R$string.help_range_search, 5, R$string.help_encrypted_search_title, R$string.help_encrypted_search, 7, R$string.search_unknown_value, R$string.help_fuzzy_search, 0, R$string.help_mask_search_title, R$string.help_mask_search, 8, R$string.help_fill_title, R$string.help_fill, 9, R$string.help_string_search_title, R$string.help_text_search, 12, R$string.help_xor_search_title, R$string.help_xor_search, 11, R$string.help_search_filter_title, R$string.help_search_filter, 20, R$string.help_memory_filter_title, R$string.help_memory_filter, 16, R$string.help_others_title, R$string.help_others, 4, R$string.help_typical_usage_title, R$string.help_typical_usage, 3, R$string.help_speed_up_title, R$string.help_speed_up, 10, R$string.help_games_protection_title, R$string.help_games_protection_, 14, R$string.help_hide_gg_title, R$string.help_games_protection_end, 24, R$string.help_hints_title, R$string.help_hints_0, -1, R$string.help_hex_colors_title, R$string.help_hex_colors, -1, R$string.help_pointer_search_title, R$string.help_pointer_search, 17, R$string.help_unaligned_title, R$string.help_unaligned, 22, R$string.help_formula_calculator_title, R$string.help_formula_calculator, 23, R$string.help_add_to_value_title, R$string.help_add_to_value, 13, R$string.unrandomizer, R$string.help_unrandomizer, 18, R$string.restart_game_without_protection, R$string.warn_restart_off_prot, 15, R$string.disable_protection, R$string.warn_patch_off_prot_, -1, R$string.work_without_root_title, R$string.work_without_root, 19, R$string.help_game_not_listed_title, R$string.help_game_not_listed_root, -1, R$string.help_force_close_title, R$string.daemon_killed, -1, R$string.help_lasm_title, R$string.help_lasm, 25};
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
    private Tools$a0 f53f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View[] f48a = d.b.f1512b;

    public ConfigListAdapter() {
        HotPoint hotPoint = MainService.instance.j;
        w(hotPoint.getLayoutAlpha(), hotPoint.getVanishingTime(), null, null, hotPoint.getSize());
        x();
    }

    public static void a(String str) {
        e1.d("mConfigTempPath onClick");
        View viewF = a.d.f(R$layout.temp_path_config, null);
        EditTextPath editTextPath = (EditTextPath) viewF.findViewById(R$id.temp_file_path);
        SharedPreferences sharedPreferencesM0 = Tools.M0();
        if (str == null) {
            str = sharedPreferencesM0.getString("temp-path", "");
        }
        editTextPath.setText(str);
        editTextPath.setDataType(4);
        editTextPath.setPathType(0);
        ((TextView) viewF.findViewById(R$id.temp_file_desc)).setText(b2.f(R$string.path_for_temp_files) + '\n' + b2.f(R$string.path_must_be));
        viewF.findViewById(R$id.path_selector).setTag(editTextPath);
        AlertDialog alertDialogCreate = f.b().setView(InternalKeyboard.e(viewF, false)).setPositiveButton(b2.f(R$string.confirm), (DialogInterface$OnClickListener) null).setNegativeButton(b2.f(R$string.cancel), (DialogInterface$OnClickListener) null).create();
        ConfigListAdapter$l configListAdapter$l = new ConfigListAdapter$l(editTextPath, alertDialogCreate);
        v2.a((Button) viewF.findViewById(R$id.typical_values), editTextPath);
        r(alertDialogCreate, configListAdapter$l, editTextPath);
    }

    public static void b() {
        if (f1.y()) {
            View viewF = a.d.f(R$layout.temp_path_config, null);
            EditTextPath editTextPath = (EditTextPath) viewF.findViewById(R$id.temp_file_path);
            SharedPreferences sharedPreferencesM0 = Tools.M0();
            editTextPath.setText(sharedPreferencesM0.getString("su", ""));
            editTextPath.setDataType(4);
            editTextPath.setPathType(1);
            editTextPath.setHint("su");
            ((TextView) viewF.findViewById(R$id.temp_file_desc)).setText(b2.f(R$string.su_command));
            CheckBox checkBox = (CheckBox) viewF.findViewById(R$id.use_sh);
            checkBox.setChecked(sharedPreferencesM0.getBoolean("sh", false));
            checkBox.setVisibility(0);
            viewF.findViewById(R$id.path_selector).setTag(editTextPath);
            AlertDialog alertDialogCreate = f.b().setView(InternalKeyboard.e(viewF, false)).setPositiveButton(b2.f(R$string.confirm), (DialogInterface$OnClickListener) null).setNegativeButton(b2.f(R$string.cancel), (DialogInterface$OnClickListener) null).create();
            ConfigListAdapter$o configListAdapter$o = new ConfigListAdapter$o(editTextPath, checkBox, alertDialogCreate);
            Button button = (Button) viewF.findViewById(R$id.typical_values);
            String[] strArr = {"su", "ku.sud", "/system/bin/su", "/system/xbin/su", "/su/bin/su", "/system/xbin/bstk/su", "/sbin/su", "/magisk/.core/bin/su", "/magisk/phh/bin/su"};
            button.setOnClickListener(new v2(strArr, strArr));
            button.setTag(editTextPath);
            r(alertDialogCreate, configListAdapter$o, editTextPath);
        }
    }

    static void c() {
        String[] strArr = new String[MainService.J0.length * 2];
        strArr[0] = b2.f(R$string.search) + ", " + b2.f(R$string.portrait);
        strArr[1] = b2.f(R$string.search) + ", " + b2.f(R$string.landscape);
        strArr[2] = b2.f(R$string.saved_list) + ", " + b2.f(R$string.portrait);
        strArr[3] = b2.f(R$string.saved_list) + ", " + b2.f(R$string.landscape);
        strArr[4] = b2.f(R$string.memory_editor) + ", " + b2.f(R$string.portrait);
        strArr[5] = b2.f(R$string.memory_editor) + ", " + b2.f(R$string.landscape);
        f.o(f.b().setItems(strArr, new ConfigListAdapter$g(strArr)).setNegativeButton(b2.f(R$string.cancel), (DialogInterface$OnClickListener) null));
    }

    static void d() {
        Tools.I1(R$string.loading, 0);
        n2.h(new ConfigListAdapter$p());
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
        String[] strArrE = k.e();
        Arrays.sort(strArrE, new ConfigListAdapter$q());
        String strF = b2.f(R$string.lang_code);
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
                                    localeD = k.d(str);
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
                                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(z1$d.s), 0, spannableStringBuilder.length(), 33);
                                                        int length2 = spannableStringBuilder.length();
                                                        spannableStringBuilder.append((CharSequence) " (");
                                                        spannableStringBuilder.append((CharSequence) str);
                                                        spannableStringBuilder.append(')');
                                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(z1$d.r), length2, spannableStringBuilder.length(), 33);
                                                        int length3 = spannableStringBuilder.length();
                                                        spannableStringBuilder.append((CharSequence) str2);
                                                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6f), length3, spannableStringBuilder.length(), 33);
                                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(z1$d.t), length3, spannableStringBuilder.length(), 33);
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
                        localeD = k.d(str);
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
                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(z1$d.s), 0, spannableStringBuilder2.length(), 33);
                                int length4 = spannableStringBuilder2.length();
                                spannableStringBuilder2.append((CharSequence) " (");
                                spannableStringBuilder2.append((CharSequence) str);
                                spannableStringBuilder2.append(')');
                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(z1$d.r), length4, spannableStringBuilder2.length(), 33);
                                int length5 = spannableStringBuilder2.length();
                                spannableStringBuilder2.append((CharSequence) str2);
                                spannableStringBuilder2.setSpan(new RelativeSizeSpan(0.6f), length5, spannableStringBuilder2.length(), 33);
                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(z1$d.t), length5, spannableStringBuilder2.length(), 33);
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
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(z1$d.s), 0, spannableStringBuilder3.length(), 33);
                                int length6 = spannableStringBuilder3.length();
                                spannableStringBuilder3.append((CharSequence) " (");
                                spannableStringBuilder3.append((CharSequence) str);
                                spannableStringBuilder3.append(')');
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(z1$d.r), length6, spannableStringBuilder3.length(), 33);
                                int length7 = spannableStringBuilder3.length();
                                spannableStringBuilder3.append((CharSequence) str2);
                                spannableStringBuilder3.setSpan(new RelativeSizeSpan(0.6f), length7, spannableStringBuilder3.length(), 33);
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(z1$d.t), length7, spannableStringBuilder3.length(), 33);
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
        g(configuration, k.d(k.b()), assets, displayMetrics);
        k.g();
        n2.i(new ConfigListAdapter$r(new ArrayAdapter(MainService.context, arrayList2), size, arrayList));
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
        return resources.getString(R$string.lang_code) + str;
    }

    public static DialogInterface$OnClickListener h() {
        return new ConfigListAdapter$i();
    }

    public static String i() {
        SharedPreferences sharedPreferencesM0 = Tools.M0();
        SharedPreferences$Editor sharedPreferences$EditorEdit = sharedPreferencesM0.edit();
        StringBuilder sb = new StringBuilder();
        long j2 = sharedPreferencesM0.getLong("mc", 0L);
        sharedPreferences$EditorEdit.remove("mc");
        if (j2 != 0) {
            sb.append("&mc=");
            sb.append('=');
            sb.append(Long.toHexString(j2));
        }
        sharedPreferences$EditorEdit.commit();
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
        if ((i3 == 1 && (r.n instanceof MainActivity)) || (i3 == 2 && (r.n instanceof ActivityMain))) {
            if (i2 != 3) {
                f.o(f.b().setCustomTitle(Tools.g0(R$string.hide_icons)).setMessage(b2.f(R$string.cannot_hide_launcher_icon)).setNegativeButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null));
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
        boolean z = false;
        try {
            String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
            boolean z2 = strArr != null && strArr.length > 0;
            try {
                FileInputStream fileInputStream = new FileInputStream("/proc/self/auxv");
                byte[] bArr = new byte[4096];
                int i2 = fileInputStream.read(bArr);
                fileInputStream.close();
                if (i2 <= 0) {
                    return z2;
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
                boolean z3 = z2;
                th = th;
                z = z3;
                e1.s("Failed check 64 client. Used: " + z, th);
                return z;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    static void m() {
        f.o(f.b().setCustomTitle(Tools.g0(R$string.app_name)).setMessage(b2.f(R$string.exit_confirm)).setPositiveButton(b2.f(R$string.restart), new p0(200, true)).setNegativeButton(b2.f(R$string.skip), (DialogInterface$OnClickListener) null));
    }

    private static void n() {
        new g2().i("mc", f47g, 0L).commit();
    }

    private void p(TextView textView) {
        int i2;
        switch (textView.getId()) {
            case R$id.config_autopause /* 2131034151 */:
                i2 = R$drawable.ic_pause_white_18dp;
                break;
            case R$id.config_history_limit /* 2131034168 */:
                i2 = R$drawable.ic_history_white_24dp;
                break;
            case R$id.config_icons_size /* 2131034173 */:
                i2 = R$drawable.ic_tooltip_edit_white_24dp;
                break;
            case R$id.config_saved_list_updates_interval /* 2131034193 */:
                i2 = R$drawable.ic_content_save_white_24dp;
                break;
            case R$id.config_speeds /* 2131034198 */:
                i2 = R$drawable.ic_speedometer_white_24dp;
                break;
            case R$id.config_time_jump_panel /* 2131034205 */:
                i2 = R$drawable.ic_fast_forward_white_24dp;
                break;
            case R$id.config_unrandomizer /* 2131034208 */:
                i2 = R$drawable.ic_dice_multiple_white_24dp;
                break;
            case R$id.config_use_small_list_items /* 2131034211 */:
                i2 = R$drawable.ic_format_list_bulleted_white_24dp;
                break;
            case R$id.help /* 2131034277 */:
                i2 = R$drawable.ic_help_circle_outline_white_24dp;
                break;
            case R$id.screenshot /* 2131034394 */:
                i2 = R$drawable.ic_cellphone_screenshot_white_24dp;
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

    private static void r(AlertDialog alertDialog, View$OnClickListener view$OnClickListener, android.widget.EditText editText) {
        alertDialog.setButton(-1, b2.f(R$string.confirm), new ConfigListAdapter$m(view$OnClickListener, alertDialog));
        f.l(alertDialog, new ConfigListAdapter$n(view$OnClickListener));
        f.n(alertDialog, editText);
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
        strArr[0] = b2.f(R$string.video_tutorials);
        ConfigListAdapter$h configListAdapter$h = new ConfigListAdapter$h();
        if (i4 == 0) {
            f.o(f.b().setItems(strArr, configListAdapter$h).setNegativeButton(b2.f(R$string.cancel), (DialogInterface$OnClickListener) null));
        } else {
            configListAdapter$h.onClick(null, i4);
        }
    }

    private void u() {
        new ConfigListAdapter$j(this, "loadLogcat").start();
    }

    static void v() {
        f.o(f.b().setCustomTitle(Tools.g0(R$string.screenshot)).setMessage(Tools.L1(b2.f(R$string.screenshot_prompt), 8)).setNegativeButton(b2.f(R$string.cancel), (DialogInterface$OnClickListener) null).setPositiveButton(b2.f(R$string.ok), new ConfigListAdapter$f()));
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

    public void l(boolean z) {
        if (!z) {
            if (this.f48a.length == 0) {
                return;
            }
            ListView listView = MainService.instance.Y;
            this.f53f = Tools.J0(listView);
            this.f48a = d.b.f1512b;
            notifyDataSetChanged();
            listView.setAdapter((ListAdapter) null);
            return;
        }
        if (this.f48a.length > 0) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) a.d.f(R$layout.service_config, null);
        this.f49b = new WeakReference((TextView) viewGroup.findViewById(R$id.game_section));
        this.f50c = new WeakReference((TextView) viewGroup.findViewById(R$id.config_icon_text));
        this.f51d = new WeakReference((ImageView) viewGroup.findViewById(R$id.config_icon_example));
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            try {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() != 8) {
                    if (childAt instanceof TextView) {
                        ((TextView) childAt).setText(b2.g(((TextView) childAt).getText().toString().trim()));
                        p((TextView) childAt);
                    }
                    childAt.setLayoutParams(new AbsListView$LayoutParams(-1, -2, 0));
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
        Tools$a0 tools$a0 = this.f53f;
        if (tools$a0 != null) {
            Tools.A1(MainService.instance.Y, tools$a0);
            MainService.instance.Y.post(new ConfigListAdapter$k(this, tools$a0));
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
        String strF = b2.f(R$string.game_settings);
        z1$d z1_d = MainService.instance.v0;
        String str = z1_d != null ? z1_d.f1433b : null;
        if (str != null) {
            strF = Tools.O1(strF) + " \"" + str + "\":";
        }
        textView.setText(strF);
    }

    @Override // android.widget.AdapterView$OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        int id;
        AlertDialog$Builder positiveButton;
        AlertDialog$Builder message;
        String strF;
        DialogInterface$OnClickListener configListAdapter$b;
        String strF2;
        AlertDialog$Builder view2;
        TimersEditor timersEditor;
        View viewF;
        Config$p$a configListAdapter$t;
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
        Config$p config$pB = Config.b(id);
        if (config$pB != null) {
            if (id != 2131034177) {
                if (id == 2131034173) {
                    configListAdapter$t = new ConfigListAdapter$t(this);
                }
                config$pB.b();
                return;
            }
            configListAdapter$t = new ConfigListAdapter$s(this);
            config$pB.f(configListAdapter$t);
            config$pB.b();
            return;
        }
        switch (id) {
            case R$id.about /* 2131034113 */:
                StringBuilder sb = new StringBuilder();
                sb.append("__version__ ");
                float f2 = 1;
                sb.append((108.5f * f2) - 7.1f);
                sb.append(" (");
                sb.append((int) (((f2 * 16586.3f) - 431.3f) + 0.5f));
                sb.append(")\n\n__developers__\n");
                sb.append(DEVS);
                sb.append("\n__special_thanks__\n\tdanilo_scala,\n\tYoungBai,\n\tKorean L,\n\tiAndroHacker,\n\tMobile46,\n\treduxpl,\n\tjan.eike.kottlarz,\n\ttimo.szillat,\n\tSubZero5,\n\tZuiXan,\n\tAlex,\n\tGanjar Sukmara,\n\tdd09david,\n\tvenomx961,\n\tchatzopoulosapostolos,\n\tWanderMax,\n\tIvan Maldonado,\n\tvesper7dd,\n\tSelfDestruct68,\n\tmallachri,\n\tAzhar Dripana,\n\tIlya Kushnir,\n\twasao0807,\n\tAlex NG,\n\tjeroen.wilmink,\n\tpodluka,\n\tAnty0,\n\tkiilerman496,\n\tthex3only,\n\tmustafayasir6,\n\tHavergal Samosir Jr.,\n\timpykid,\n\t28ado1,\n\tElectroz,\n\tvincensius.august,\n\tRuan Carlos,\n\tNurMarvin,\n\tSkullboyq,\n\tYakiaaa,\n\tag2s20150609,\n\tanitamoellerga,\n\tcoolapk_ooops,\n\tpandecheng,\n\tpkjisoo32,\n\tLeam19999,\n\tminecraft172zzz,\n\tTodd Justin York,\n\tGedablo,\n\trootddos511,\n\t楊萬林,\n\tchetraclr,\n\tcub.madrax,\n\tntnhiu,\n\tbuivanxia10,\n\twl02082201,\n\tBacklift,\n\tvonxom,\n\tPeter Cuevas H,\n\talg1.66336611,\n\tHoangthinh99hp,\n\tJackH4L,\n\tspacemaker2906,\n\tva3kama3eredeti,\n\tAustin Andrews,\n\tsaqibpiash,\n\tsuuyout,\n\tsljivics,\n\tDartel,\n\tdoungvichetra2,\n\t0968688218channa,\n\tCaptainTF,\n\tdbinkv1,\n\tronaldmoura,\n\tlafrite.cassee,\n\tJazeks,\n\tNightMareNivek,\n\tprefix309,\n\tmilad19s,\n\tliato.games,\n\tCmP,\n\t1701silentspawn,\n\tgood7773good7773good7773,\n\tATAA SY,\n\tkhiemhocrot.98,\n\ta0193143,\n\tYaroslav,\n\tzam5355,\n\tlonglix,\n\tsssidiki4,\n\tGeorge,\n\t冰鍊,\n\tFloatKey.");
                positiveButton = f.b().setCustomTitle(Tools.g0(R$string.about)).setMessage(b2.g(sb.toString())).setNeutralButton(b2.f(R$string.copy), new ConfigListAdapter$w(this)).setPositiveButton(b2.f(R$string.site), new r$n(null));
                strF2 = b2.f(R$string.ok);
                view2 = positiveButton.setNegativeButton(strF2, (DialogInterface$OnClickListener) null);
                f.o(view2);
                break;
            case R$id.changelog /* 2131034148 */:
                new ConfigListAdapter$a(this, "changelog").start();
                break;
            case R$id.config_clear_defaults /* 2131034155 */:
                message = f.b().setMessage(b2.f(R$string.reset_ignore));
                strF = b2.f(R$string.confirm);
                configListAdapter$b = new ConfigListAdapter$b(this);
                positiveButton = message.setPositiveButton(strF, configListAdapter$b);
                strF2 = b2.f(R$string.cancel);
                view2 = positiveButton.setNegativeButton(strF2, (DialogInterface$OnClickListener) null);
                f.o(view2);
                break;
            case R$id.config_clear_history /* 2131034156 */:
                message = f.b().setCustomTitle(Tools.g0(R$string.clear_history)).setMessage(b2.f(R$string.clear_history_warn));
                strF = b2.f(R$string.ok);
                configListAdapter$b = new ConfigListAdapter$e(this);
                positiveButton = message.setPositiveButton(strF, configListAdapter$b);
                strF2 = b2.f(R$string.cancel);
                view2 = positiveButton.setNegativeButton(strF2, (DialogInterface$OnClickListener) null);
                f.o(view2);
                break;
            case R$id.config_disable_protection /* 2131034160 */:
                if (f1.y()) {
                    positiveButton = f.b().setCustomTitle(Tools.g0(R$string.disable_protection)).setMessage(b2.f(R$string.warn_patch_off_prot_)).setPositiveButton(b2.f(R$string.ok), new ConfigListAdapter$d(this, mainService));
                    strF2 = b2.f(R$string.cancel);
                    view2 = positiveButton.setNegativeButton(strF2, (DialogInterface$OnClickListener) null);
                    f.o(view2);
                }
                break;
            case R$id.config_exit /* 2131034161 */:
                positiveButton = f.b().setCustomTitle(Tools.g0(R$string.exit)).setPositiveButton(b2.f(R$string.yes), new p0(300));
                strF2 = b2.f(R$string.no);
                view2 = positiveButton.setNegativeButton(strF2, (DialogInterface$OnClickListener) null);
                f.o(view2);
                break;
            case R$id.config_icon /* 2131034170 */:
                View viewF2 = a.d.f(R$layout.service_config_icon, null);
                SeekBar seekBar = (SeekBar) viewF2.findViewById(R$id.transparency);
                SeekBar seekBar2 = (SeekBar) viewF2.findViewById(R$id.hide);
                SeekBar seekBar3 = (SeekBar) viewF2.findViewById(R$id.size);
                TextView textView = (TextView) viewF2.findViewById(R$id.config_icon_text);
                ImageView imageView = (ImageView) viewF2.findViewById(R$id.config_icon_example);
                float layoutAlpha = mainService.j.getLayoutAlpha();
                int vanishingTime = mainService.j.getVanishingTime();
                int size = mainService.j.getSize();
                seekBar.setProgress(10 - ((int) (10.0f * layoutAlpha)));
                seekBar2.setProgress(vanishingTime < 0 ? seekBar2.getMax() : vanishingTime);
                seekBar3.setMax(12);
                seekBar3.setProgress(size);
                w(layoutAlpha, vanishingTime, textView, imageView, size);
                ConfigListAdapter$u configListAdapter$u = new ConfigListAdapter$u(this, seekBar, seekBar2, seekBar3, textView, imageView);
                seekBar.setOnSeekBarChangeListener(configListAdapter$u);
                seekBar2.setOnSeekBarChangeListener(configListAdapter$u);
                seekBar3.setOnSeekBarChangeListener(configListAdapter$u);
                view2 = f.b().setPositiveButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null).setView(viewF2);
                f.o(view2);
                break;
            case R$id.config_kill_game /* 2131034178 */:
                positiveButton = f.b().setCustomTitle(Tools.g0(R$string.kill_game)).setMessage(b2.f(R$string.kill_game_info_)).setPositiveButton(b2.f(R$string.yes), new ConfigListAdapter$v(this, mainService));
                strF2 = b2.f(R$string.no);
                view2 = positiveButton.setNegativeButton(strF2, (DialogInterface$OnClickListener) null);
                f.o(view2);
                break;
            case R$id.config_language /* 2131034179 */:
                d();
                break;
            case R$id.config_last_stats /* 2131034180 */:
                View viewF3 = a.d.f(R$layout.main_new_version, null);
                ((TextView) viewF3.findViewById(R$id.changelog)).setText(e1.f740f);
                positiveButton = f.b().setCustomTitle(Tools.g0(R$string.last_stats)).setView(viewF3);
                strF2 = b2.f(R$string.ok);
                view2 = positiveButton.setNegativeButton(strF2, (DialogInterface$OnClickListener) null);
                f.o(view2);
                break;
            case R$id.config_path /* 2131034185 */:
                a(null);
                break;
            case R$id.config_region_log /* 2131034190 */:
                h0.h();
                break;
            case R$id.config_reset /* 2131034191 */:
                mainService.r(true);
                break;
            case R$id.config_speedhack_functions /* 2131034196 */:
                timersEditor = MainService.instance.n0;
                timersEditor.h();
                break;
            case R$id.config_speeds /* 2131034198 */:
                try {
                    viewF = a.d.f(R$layout.list_speeds_config, null);
                } catch (IndexOutOfBoundsException e2) {
                    e1.a(e2);
                    MainService.I0();
                    viewF = null;
                }
                if (viewF != null) {
                    TextView textView2 = (TextView) viewF.findViewById(R$id.hint);
                    TextView textView3 = (TextView) viewF.findViewById(R$id.message);
                    textView3.setText(b2.g(textView3.getText().toString().trim()));
                    EditTextSpeeds editTextSpeeds = (EditTextSpeeds) viewF.findViewById(R$id.speeds);
                    TextView textView4 = (TextView) viewF.findViewById(R$id.default_);
                    textView4.setText(Tools.N1(R$string.default_) + ": " + d1.c());
                    textView4.setOnClickListener(new ConfigListAdapter$x(this, editTextSpeeds));
                    editTextSpeeds.setText(MainService.instance.k0.b());
                    editTextSpeeds.setDataType(16);
                    editTextSpeeds.setOnChangedListener(new ConfigListAdapter$y(this, editTextSpeeds, textView2));
                    f.q(f.b().setView(InternalKeyboard.d(viewF)).setPositiveButton(b2.f(R$string.confirm), new ConfigListAdapter$z(this, editTextSpeeds)).setNegativeButton(b2.f(R$string.cancel), (DialogInterface$OnClickListener) null), editTextSpeeds);
                }
                break;
            case R$id.config_su /* 2131034200 */:
                b();
                break;
            case R$id.config_toolbar_buttons /* 2131034206 */:
                c();
                break;
            case R$id.config_unrandomizer /* 2131034208 */:
                timersEditor = MainService.instance.o0;
                timersEditor.h();
                break;
            case R$id.donate /* 2131034228 */:
                new r$n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf25<;940grqdwh2").onClick(null, 0);
                break;
            case R$id.help /* 2131034277 */:
                s();
                break;
            case R$id.hide_icons /* 2131034284 */:
                CharSequence[] charSequenceArr = {b2.f(R$string.nothing) + " (" + b2.f(R$string.default_mark) + ')', b2.f(R$string.app_short_name_sw), b2.f(R$string.app_short_name_hw)};
                AlertDialog alertDialogCreate = f.b().setCustomTitle(Tools.g0(R$string.hide_icons)).setItems(charSequenceArr, new ConfigListAdapter$c(this)).create();
                ListView listView = alertDialogCreate.getListView();
                if (listView != null) {
                    Tools.e(listView, charSequenceArr, new Drawable[]{null, Tools.o0(R$mipmap.ic_sw_48dp), Tools.o0(R$mipmap.ic_hw_48dp)}, 48, 0);
                }
                f.m(alertDialogCreate);
                break;
            case R$id.screenshot /* 2131034394 */:
                v();
                break;
            case R$id.show_logcat /* 2131034403 */:
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
            strL1 = Tools.L1(b2.f(R$string.config_icon_text), Integer.valueOf(100 - ((int) (100.0f * f2))), i2 < 0 ? b2.f(R$string.icon_hide_never) : Tools.L1(b2.f(R$string.icon_hide_after), Integer.valueOf(i2)));
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
                Config$p config$pB = Config.b(id);
                boolean z = id == 2131034196 || id == 2131034208;
                if (config$pB != null) {
                    textView.setText(config$pB.toString());
                    z = config$pB.f45g;
                }
                if (z) {
                    textView.setBackgroundColor(-2137746366);
                }
            }
        }
    }
}
