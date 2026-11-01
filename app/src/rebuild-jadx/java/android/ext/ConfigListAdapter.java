package android.ext;

/* JADX INFO: loaded from: classes.dex */
public class ConfigListAdapter extends android.widget.BaseAdapter implements android.widget.AdapterView.OnItemClickListener {
    public static final java.lang.String DEVS = "\td2dyno - __owner__, __design__, __pm__.\n\tEnyby - __code__, __pm__.\n\tTrasd - __tech__, __pm__.\n\tAqua - __creator__.\n".intern();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static long f47g = 0;
    static final int[] h = {catch_.me_.if_.you_.can_.R.string.help_faq_title, catch_.me_.if_.you_.can_.R.string.help_faq, -1, catch_.me_.if_.you_.can_.R.string.help_context_title, catch_.me_.if_.you_.can_.R.string.help_context, -1, catch_.me_.if_.you_.can_.R.string.help_basics_title, catch_.me_.if_.you_.can_.R.string.help_basics, 2, catch_.me_.if_.you_.can_.R.string.help_floating_icon_title, catch_.me_.if_.you_.can_.R.string.help_floating_icon_, -1, catch_.me_.if_.you_.can_.R.string.help_scripts_title, catch_.me_.if_.you_.can_.R.string.help_scripts, 21, catch_.me_.if_.you_.can_.R.string.help_exact_search_title, catch_.me_.if_.you_.can_.R.string.help_exact_search, -1, catch_.me_.if_.you_.can_.R.string.help_speedhack_title, catch_.me_.if_.you_.can_.R.string.help_speedhack, 1, catch_.me_.if_.you_.can_.R.string.help_group_search_title, catch_.me_.if_.you_.can_.R.string.help_group_search_, 6, catch_.me_.if_.you_.can_.R.string.help_range_search_title, catch_.me_.if_.you_.can_.R.string.help_range_search, 5, catch_.me_.if_.you_.can_.R.string.help_encrypted_search_title, catch_.me_.if_.you_.can_.R.string.help_encrypted_search, 7, catch_.me_.if_.you_.can_.R.string.search_unknown_value, catch_.me_.if_.you_.can_.R.string.help_fuzzy_search, 0, catch_.me_.if_.you_.can_.R.string.help_mask_search_title, catch_.me_.if_.you_.can_.R.string.help_mask_search, 8, catch_.me_.if_.you_.can_.R.string.help_fill_title, catch_.me_.if_.you_.can_.R.string.help_fill, 9, catch_.me_.if_.you_.can_.R.string.help_string_search_title, catch_.me_.if_.you_.can_.R.string.help_text_search, 12, catch_.me_.if_.you_.can_.R.string.help_xor_search_title, catch_.me_.if_.you_.can_.R.string.help_xor_search, 11, catch_.me_.if_.you_.can_.R.string.help_search_filter_title, catch_.me_.if_.you_.can_.R.string.help_search_filter, 20, catch_.me_.if_.you_.can_.R.string.help_memory_filter_title, catch_.me_.if_.you_.can_.R.string.help_memory_filter, 16, catch_.me_.if_.you_.can_.R.string.help_others_title, catch_.me_.if_.you_.can_.R.string.help_others, 4, catch_.me_.if_.you_.can_.R.string.help_typical_usage_title, catch_.me_.if_.you_.can_.R.string.help_typical_usage, 3, catch_.me_.if_.you_.can_.R.string.help_speed_up_title, catch_.me_.if_.you_.can_.R.string.help_speed_up, 10, catch_.me_.if_.you_.can_.R.string.help_games_protection_title, catch_.me_.if_.you_.can_.R.string.help_games_protection_, 14, catch_.me_.if_.you_.can_.R.string.help_hide_gg_title, catch_.me_.if_.you_.can_.R.string.help_games_protection_end, 24, catch_.me_.if_.you_.can_.R.string.help_hints_title, catch_.me_.if_.you_.can_.R.string.help_hints_0, -1, catch_.me_.if_.you_.can_.R.string.help_hex_colors_title, catch_.me_.if_.you_.can_.R.string.help_hex_colors, -1, catch_.me_.if_.you_.can_.R.string.help_pointer_search_title, catch_.me_.if_.you_.can_.R.string.help_pointer_search, 17, catch_.me_.if_.you_.can_.R.string.help_unaligned_title, catch_.me_.if_.you_.can_.R.string.help_unaligned, 22, catch_.me_.if_.you_.can_.R.string.help_formula_calculator_title, catch_.me_.if_.you_.can_.R.string.help_formula_calculator, 23, catch_.me_.if_.you_.can_.R.string.help_add_to_value_title, catch_.me_.if_.you_.can_.R.string.help_add_to_value, 13, catch_.me_.if_.you_.can_.R.string.unrandomizer, catch_.me_.if_.you_.can_.R.string.help_unrandomizer, 18, catch_.me_.if_.you_.can_.R.string.restart_game_without_protection, catch_.me_.if_.you_.can_.R.string.warn_restart_off_prot, 15, catch_.me_.if_.you_.can_.R.string.disable_protection, catch_.me_.if_.you_.can_.R.string.warn_patch_off_prot_, -1, catch_.me_.if_.you_.can_.R.string.work_without_root_title, catch_.me_.if_.you_.can_.R.string.work_without_root, 19, catch_.me_.if_.you_.can_.R.string.help_game_not_listed_title, catch_.me_.if_.you_.can_.R.string.help_game_not_listed_root, -1, catch_.me_.if_.you_.can_.R.string.help_force_close_title, catch_.me_.if_.you_.can_.R.string.daemon_killed, -1, catch_.me_.if_.you_.can_.R.string.help_lasm_title, catch_.me_.if_.you_.can_.R.string.help_lasm, 25};
    static final java.lang.String[] i = {"kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh24950vhdufk0xqnqrz0zlwk0nqrzq0fkdqjhv0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25570vshhg0kdfn0dqg0wlph0mxps0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh248;0krz0xvh0h|h0lfrq0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh248<0krz0vhdufk0hqfu|swhg0ydoxh0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh24970frpsduh0phwkrgv0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh24<40klvwru|0xvdjh0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25550h{dpsoh0ri0udqjh0vhdufk0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25590krz0wr0vhdufk0urxqghg0ydoxh0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh255<0krz0wr0xvh0rughuhg0jurxs0vhdufk0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh248<0krz0vhdufk0hqfu|swhg0ydoxh0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25960h{dpsoh0ri0wkh0pdvn0vhdufk0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh255:0krz0wr0xvh0iloo0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh24<50krz0wr0vshhg0xs0vhdufk0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25;60{ru0vhdufk0jxlgh0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28:80;330wh{w0vwulqj0kh{0dre0vhdufk0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26690rswlrq0dgg0wr0ydoxh0gr0qrw0uhsodfh0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26860lpsorvlrq0qhyhu0orvh0krsh0kdfn0ohyho0klgh0iurp0wkh0jdph0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26870lpsorvlrq0qhyhu0orvh0krsh0kdfn0fuhglwv0klgh0iurp0wkh0jdph0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26930lpsorvlrq0qhyhu0orvh0krsh0kdfn0fuhglwv0uhvwduw0zlwkrxw0surwhfwlrq0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26950lpsorvlrq0qhyhu0orvh0krsh0kdfn0fuhglwv0glvdeoh0surwhfwlrq0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28680:530xvh0urrw0iurp0yluwxdo0vsdfh0iru0klgh0jdphjxdugldq0yluwxdo{srvhg0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28;30iuhh0iluh0dyrlg0ghwhfwlrq0urrw0iurp0yluwxdo0vsdfh0yluwxdo{srvhg0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28;40dyrlg0ghwhfwlrq0urrw0iurp0yluwxdo0vsdfh0yluwxdo{srvhg0jdphjxdugldq2\r\rkwwsv=22jdphjxdugldq1qhw2iruxp2wdjv2dss0klgh2\r\rkwwsv=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28;80dyrlg0ghwhfwlrq0urrw0iurp0yluwxdo0vsdfh0pxowlsoh0dffrxqwv0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26;80uhvwduw0zlwkrxw0surwhfwlrq0uhsdlu0wkh0uherrw0uxq0jdphjxdugldq0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26;70uhvwduw0zlwkrxw0surwhfwlrq0uhsdlu0wkh0uherrw0uherrw0ghylfh0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh267:0krz0wr0vhdufk0ilowhu0lq0wkh0phpru|0hglwru0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26770krz0wr0txlfno|0vhdufk0iru0srlqwhuv0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26990xqudqgrpl}hu0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26;40uxvvldq0vorwv0kdfn0vwruh0xqudqgrpl}hu0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2qrurrw", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh27480ilowhuv0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2ilohv2fdwhjru|290oxd0vfulswv2\r\rkwws=22jdphjxdugldq1qhw2khos2", "kwws=22jdphjxdugldq1qhw2iruxp2ilohv2iloh2:970xqdoljqhg0vhdufk2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh286:0:630irupxod0fdofxodwru0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh286;0jxq0zdu0vkrrwlqj0jdphv0kdfn0sulfh0irupxod0fdofxodwru0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28680:530xvh0urrw0iurp0yluwxdo0vsdfh0iru0klgh0jdphjxdugldq0yluwxdo{srvhg0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28;30iuhh0iluh0dyrlg0ghwhfwlrq0urrw0iurp0yluwxdo0vsdfh0yluwxdo{srvhg0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28;40dyrlg0ghwhfwlrq0urrw0iurp0yluwxdo0vsdfh0yluwxdo{srvhg0jdphjxdugldq2\r\rkwwsv=22jdphjxdugldq1qhw2iruxp2wdjv2dss0klgh2\r\rkwwsv=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28;80dyrlg0ghwhfwlrq0urrw0iurp0yluwxdo0vsdfh0pxowlsoh0dffrxqwv0jdphjxdugldq2", "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh29470il{lqj0d0vfulsw0xvlqj0dvvhpeohu0jdphjxdugldq2"};
    private static boolean j = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.ref.WeakReference f49b = new java.lang.ref.WeakReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.ref.WeakReference f50c = new java.lang.ref.WeakReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.ref.WeakReference f51d = new java.lang.ref.WeakReference(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f52e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private android.ext.Tools.a0 f53f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.view.View[] f48a = ggd.b.f1512b;

    class a extends android.ext.g0 {

        /* JADX INFO: renamed from: android.ext.ConfigListAdapter$a$a, reason: collision with other inner class name */
        class RunnableC0002a implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.StringBuilder f55a;

            RunnableC0002a(java.lang.StringBuilder sb) {
                this.f55a = sb;
            }

            @Override // java.lang.Runnable
            public void run() {
                android.ext.Tools.u1(android.ext.f.m(android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.change_log)).setMessage(this.f55a.toString()).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), (android.content.DialogInterface.OnClickListener) null).create()));
            }
        }

        a(java.lang.String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            try {
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.net.URL(android.ext.Tools.removeNewLinesChars("kwws=22jdphjxdugldq1qhw2yhuvlrq1w{w")).openStream()));
                while (true) {
                    java.lang.String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                bufferedReader.close();
            } catch (java.lang.Throwable th) {
                android.ext.e1.l("Load changelog", th);
                sb.append(th.toString());
            }
            android.ext.n2.i(new android.ext.ConfigListAdapter.a.RunnableC0002a(sb));
        }
    }

    class b implements android.content.DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            android.ext.Config.f30c = 0L;
            android.ext.Config.k();
        }
    }

    class c implements android.content.DialogInterface.OnClickListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            android.ext.ConfigListAdapter.j(i);
        }
    }

    class d implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f59a;

        d(android.ext.MainService mainService) {
            this.f59a = mainService;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            this.f59a.i.s();
        }
    }

    class e implements android.content.DialogInterface.OnClickListener {
        e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            android.ext.y0.c();
        }
    }

    class f implements android.content.DialogInterface.OnClickListener {

        class a implements java.lang.Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    android.ext.MainService mainService = android.ext.MainService.instance;
                    mainService.t();
                    mainService.j.m();
                    mainService.m1(false);
                } catch (java.lang.Throwable th) {
                    android.ext.e1.l("Failed restore after take screenshot", th);
                }
            }
        }

        class b implements java.lang.Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                android.ext.MainService.instance.i.T0();
            }
        }

        f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            android.ext.MainService mainService = android.ext.MainService.instance;
            try {
                mainService.t();
                android.ext.n2.d().postDelayed(new android.ext.ConfigListAdapter.f.a(), 8000L);
                mainService.m1(true);
                mainService.j.e();
                android.ext.n2.d().postDelayed(new android.ext.ConfigListAdapter.f.b(), 300L);
            } catch (java.lang.Throwable th) {
                android.ext.e1.l("Failed take screenshot", th);
                try {
                    mainService.j.m();
                } catch (java.lang.Throwable th2) {
                    android.ext.e1.l("Failed restore after take screenshot", th2);
                }
            }
        }
    }

    class g implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String[] f64a;

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean[] f65a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f66b;

            a(boolean[] zArr, int i) {
                this.f65a = zArr;
                this.f66b = i;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
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
                    android.ext.Config.f29b[this.f66b] = j;
                    android.ext.Config.k();
                }
                android.ext.ConfigListAdapter.c();
            }
        }

        class b implements android.content.DialogInterface.OnMultiChoiceClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean[] f68a;

            b(boolean[] zArr) {
                this.f68a = zArr;
            }

            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i, boolean z) {
                this.f68a[i] = z;
            }
        }

        g(java.lang.String[] strArr) {
            this.f64a = strArr;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            android.ext.p1[] p1VarArr = android.ext.MainService.J0[i / 2];
            int length = p1VarArr.length;
            java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[length];
            android.graphics.drawable.Drawable[] drawableArr = new android.graphics.drawable.Drawable[p1VarArr.length];
            boolean[] zArr = new boolean[length];
            long j = android.ext.Config.f29b[i];
            for (int i2 = 0; i2 < length; i2++) {
                charSequenceArr[i2] = p1VarArr[i2].toString();
                zArr[i2] = ((1 << i2) & j) != 0;
                drawableArr[i2] = p1VarArr[i2].c();
            }
            android.ext.ConfigListAdapter.g.a aVar = new android.ext.ConfigListAdapter.g.a(zArr, i);
            android.app.AlertDialog alertDialogCreate = android.ext.f.c(android.ext.Tools.k0()).setCustomTitle(android.ext.Tools.h0(this.f64a[i])).setMultiChoiceItems(charSequenceArr, zArr, new android.ext.ConfigListAdapter.g.b(zArr)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.save), aVar).setNeutralButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.reset_button), aVar).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cancel), aVar).create();
            android.widget.ListView listView = alertDialogCreate.getListView();
            if (listView != null) {
                android.ext.Tools.e(listView, charSequenceArr, drawableArr, android.ext.Config.d(), catch_.me_.if_.you_.can_.R.style.SmallText);
            }
            android.ext.f.m(alertDialogCreate);
        }
    }

    class h implements android.content.DialogInterface.OnClickListener {
        h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            if (i == 0) {
                new android.ext.r.n("kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2fdwhjru|250ylghr0wxwruldov2").onClick(dialogInterface, i);
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int[] iArr = android.ext.ConfigListAdapter.h;
            int i2 = (i - 1) * 3;
            sb.append(android.ext.b2.f(iArr[i2]));
            sb.append(":\n");
            sb.append(android.ext.b2.f(iArr[i2 + 1]));
            java.lang.String string = sb.toString();
            int i3 = iArr[i2 + 2];
            if (i3 >= 0) {
                java.lang.String str = string.trim() + "\n\n";
                if (str.charAt(str.length() - 3) != ':') {
                    str = str + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.video) + ":\n";
                }
                string = str + android.ext.Tools.removeNewLinesChars(android.ext.ConfigListAdapter.i[i3]);
            }
            if (iArr[i2] == catch_.me_.if_.you_.can_.R.string.help_floating_icon_title) {
                string = string.replace(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.s), android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.app_name)) + "\nhttps://productforums.google.com/forum/#!topic/translate/1Pywh5vI1kE\n\n" + android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.without_float) + ":\n" + android.ext.Tools.removeNewLinesChars("kwwsv=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25730krz0wr0xvh0jdphjxdugldq0zlwkrxw0iordw0zlqgrz0jdphjxdugldq2");
            }
            android.view.View viewF = gga.d.f(catch_.me_.if_.you_.can_.R.layout.main_new_version, null);
            android.widget.TextView textView = (android.widget.TextView) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.changelog);
            android.ext.Tools.v1(textView, string);
            android.ext.Tools.u(textView.getText());
            android.app.AlertDialog.Builder negativeButton = android.ext.f.b().setView(viewF).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), android.ext.ConfigListAdapter.h());
            if (iArr[i2] == catch_.me_.if_.you_.can_.R.string.work_without_root_title) {
                negativeButton.setPositiveButton(catch_.me_.if_.you_.can_.R.string.more, new android.ext.r.n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf24<7540yluwxdo0vsdfhv0wr0uxq0jdphjxdugldq0zlwkrxw0urrw2"));
            }
            android.ext.f.o(negativeButton);
            if (android.ext.Config.C && iArr[i2] == catch_.me_.if_.you_.can_.R.string.help_game_not_listed_title) {
                byte b2 = 2;
                try {
                    if ((android.ext.Tools.Y(android.ext.Config.E).flags & 2) == 0) {
                        android.ext.f.o(android.ext.f.b().setMessage(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.not_optimized2), android.ext.Config.F, android.ext.Config.F)).setNeutralButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.fix_it), new android.ext.r.n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf24<7540yluwxdo0vsdfhv0wr0uxq0jdphjxdugldq0zlwkrxw0urrw2")).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), (android.content.DialogInterface.OnClickListener) null));
                    }
                } catch (java.lang.Throwable th) {
                    android.ext.e1.s("Failed check vSpace: " + android.ext.Config.E, th);
                }
                byte b3 = android.ext.Config.G;
                if (b3 == 0) {
                    if (android.ext.ConfigListAdapter.k() && android.ext.Config.E.contains("64")) {
                        b2 = 1;
                    }
                    android.ext.Config.G = b2;
                    b3 = b2;
                }
                if (b3 == 1) {
                    try {
                        android.ext.f.o(android.ext.f.b().setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.vspace64)).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), (android.content.DialogInterface.OnClickListener) null));
                    } catch (java.lang.Throwable th2) {
                        android.ext.e1.s("Failed check vSpace: " + android.ext.Config.E, th2);
                    }
                }
            }
        }
    }

    class i implements android.content.DialogInterface.OnClickListener {
        i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            android.ext.ConfigListAdapter.s();
        }
    }

    class j extends android.ext.g0 {
        j(java.lang.String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            android.ext.Tools.K1("Logcat: " + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.loading), 0);
            android.ext.Tools.h(new java.util.GregorianCalendar().getTime().toString() + '\n' + android.ext.h0.f(true), 3);
        }
    }

    class k implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.Tools.a0 f71a;

        k(android.ext.Tools.a0 a0Var) {
            this.f71a = a0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.Tools.A1(android.ext.MainService.instance.Y, this.f71a);
        }
    }

    class l implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.EditTextPath f73a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.app.AlertDialog f74b;

        l(android.ext.EditTextPath editTextPath, android.app.AlertDialog alertDialog) {
            this.f73a = editTextPath;
            this.f74b = alertDialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            java.lang.String strQ1 = android.ext.Tools.Q1(this.f73a.getText().toString().trim());
            if (strQ1.length() > 0) {
                if (!android.ext.Tools.f1(strQ1)) {
                    return;
                } else {
                    android.ext.y0.b(strQ1, 4);
                }
            }
            android.ext.e1.d("save path: " + strQ1);
            new android.ext.g2().k("temp-path", strQ1, "").commit();
            android.ext.MainService mainService = android.ext.MainService.instance;
            mainService.i.B0(mainService.I());
            mainService.q(true);
            android.ext.Tools.D(this.f74b);
        }
    }

    class m implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.View.OnClickListener f75a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.app.AlertDialog f76b;

        m(android.view.View.OnClickListener onClickListener, android.app.AlertDialog alertDialog) {
            this.f75a = onClickListener;
            this.f76b = alertDialog;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            this.f75a.onClick(this.f76b.getButton(-1));
        }
    }

    class n implements android.content.DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.View.OnClickListener f77a;

        n(android.view.View.OnClickListener onClickListener) {
            this.f77a = onClickListener;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface dialogInterface) {
            android.ext.Tools.s1(dialogInterface, -1, null, this.f77a);
        }
    }

    class o implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.EditTextPath f78a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.widget.CheckBox f79b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.app.AlertDialog f80c;

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f81a;

            /* JADX INFO: renamed from: android.ext.ConfigListAdapter$o$a$a, reason: collision with other inner class name */
            class RunnableC0003a implements java.lang.Runnable {
                RunnableC0003a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    android.ext.ConfigListAdapter.o.a aVar = android.ext.ConfigListAdapter.o.a.this;
                    android.ext.ConfigListAdapter.o oVar = android.ext.ConfigListAdapter.o.this;
                    oVar.c(aVar.f81a, oVar.f79b.isChecked());
                }
            }

            a(java.lang.String str) {
                this.f81a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                android.ext.ConfigListAdapter.o.this.b();
                try {
                    android.ext.e2.d dVarJ = android.ext.e2.j(this.f81a);
                    if (dVarJ.f756a.contains("uid=0")) {
                        android.ext.n2.i(new android.ext.ConfigListAdapter.o.a.RunnableC0003a());
                    } else {
                        android.ext.ConfigListAdapter.o.this.a(dVarJ.f756a);
                    }
                } catch (java.lang.Throwable th) {
                    android.ext.ConfigListAdapter.o.this.a(th.getMessage());
                }
                android.ext.e2.f745a = "";
            }
        }

        class b implements java.lang.Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (android.ext.MainService.instance != null) {
                    android.ext.MainService.instance.t();
                }
                android.ext.ConfigListAdapter.o.this.f80c.hide();
            }
        }

        class c implements java.lang.Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                android.ext.ConfigListAdapter.o.this.f80c.show();
            }
        }

        o(android.ext.EditTextPath editTextPath, android.widget.CheckBox checkBox, android.app.AlertDialog alertDialog) {
            this.f78a = editTextPath;
            this.f79b = checkBox;
            this.f80c = alertDialog;
        }

        void a(java.lang.String str) {
            android.ext.n2.i(new android.ext.ConfigListAdapter.o.c());
            android.ext.Tools.h(str + "\n\n" + android.ext.e2.f745a, 0);
        }

        void b() {
            android.ext.n2.i(new android.ext.ConfigListAdapter.o.b());
        }

        void c(java.lang.String str, boolean z) {
            android.ext.e1.d("su path: " + str + "; sh: " + z);
            new android.ext.g2().k("su", str, "").c("sh", z, false).commit();
            if (str.length() != 0) {
                android.ext.y0.b(str, 4);
            }
            android.ext.Tools.D(this.f80c);
            android.ext.ConfigListAdapter.m();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            java.lang.String strTrim = this.f78a.getText().toString().trim();
            if (strTrim.length() <= 0) {
                c(strTrim, this.f79b.isChecked());
                return;
            }
            new android.ext.n0.i(new android.ext.ConfigListAdapter.o.a(strTrim), "CheckSu: " + strTrim).start();
        }
    }

    class p implements java.lang.Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.ConfigListAdapter.e();
        }
    }

    class q implements java.util.Comparator {
        q() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(java.lang.String str, java.lang.String str2) {
            return (str + "_zzz").replace('-', '_').compareTo((str2 + "_zzz").replace('-', '_'));
        }
    }

    class r implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.widget.ListAdapter f86a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f87b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.util.List f88c;

        class a implements android.content.DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                try {
                    android.ext.k.i((java.lang.String) android.ext.ConfigListAdapter.r.this.f88c.get(i));
                    android.ext.ConfigListAdapter.m();
                } catch (java.lang.IndexOutOfBoundsException e2) {
                    android.ext.e1.l("Failed get locale for index: " + i, e2);
                }
                android.ext.Tools.D(dialogInterface);
            }
        }

        r(android.widget.ListAdapter listAdapter, int i, java.util.List list) {
            this.f86a = listAdapter;
            this.f87b = i;
            this.f88c = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.f.o(android.ext.f.c(android.ext.Tools.k0()).setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.select_language)).setSingleChoiceItems(this.f86a, this.f87b, new android.ext.ConfigListAdapter.r.a()));
        }
    }

    class s implements android.ext.Config.p.a {
        s() {
        }

        @Override // android.ext.Config.p.a
        public int a(android.content.DialogInterface dialogInterface, int i) {
            if (i != 1 || android.ext.InternalKeyboard.a()) {
                return i;
            }
            android.ext.MainService.I0();
            return 0;
        }
    }

    class t implements android.ext.Config.p.a {
        t() {
        }

        @Override // android.ext.Config.p.a
        public int a(android.content.DialogInterface dialogInterface, int i) {
            if (i != android.ext.Config.o) {
                android.ext.ConfigListAdapter.m();
            }
            return i;
        }
    }

    class u implements android.widget.SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.widget.SeekBar f92a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.widget.SeekBar f93b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.widget.SeekBar f94c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ android.widget.TextView f95d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ android.widget.ImageView f96e;

        u(android.widget.SeekBar seekBar, android.widget.SeekBar seekBar2, android.widget.SeekBar seekBar3, android.widget.TextView textView, android.widget.ImageView imageView) {
            this.f92a = seekBar;
            this.f93b = seekBar2;
            this.f94c = seekBar3;
            this.f95d = textView;
            this.f96e = imageView;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
            android.ext.ConfigListAdapter.this.w((10 - this.f92a.getProgress()) / 10.0f, this.f93b.getMax() == this.f93b.getProgress() ? -1 : this.f93b.getProgress(), this.f95d, this.f96e, this.f94c.getProgress());
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        }
    }

    class v implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f98a;

        v(android.ext.MainService mainService) {
            this.f98a = mainService;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            this.f98a.v0();
        }
    }

    class w implements android.content.DialogInterface.OnClickListener {
        w() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("GG: ");
            float f2 = 1;
            sb.append((113.9f * f2) - 12.5f);
            sb.append(" (");
            sb.append((int) (((f2 * 16694.6f) - 539.6f) + 0.5f));
            sb.append("); Android: ");
            sb.append(android.os.Build.VERSION.RELEASE);
            sb.append(" (");
            sb.append(android.os.Build.VERSION.SDK_INT);
            sb.append(") [");
            sb.append(android.ext.f1.x());
            sb.append(']');
            android.ext.Tools.A(sb.toString(), false);
        }
    }

    class x implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.EditTextSpeeds f101a;

        x(android.ext.EditTextSpeeds editTextSpeeds) {
            this.f101a = editTextSpeeds;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            this.f101a.setText(android.ext.d1.c());
        }
    }

    class y implements android.ext.EditTextSpeeds.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.EditTextSpeeds f103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.widget.TextView f104b;

        y(android.ext.EditTextSpeeds editTextSpeeds, android.widget.TextView textView) {
            this.f103a = editTextSpeeds;
            this.f104b = textView;
        }

        @Override // android.ext.EditTextSpeeds.a
        public void a(android.ext.EditText editText, int i, int i2) {
            c();
        }

        @Override // android.ext.EditTextSpeeds.a
        public void b(android.ext.EditText editText, java.lang.CharSequence charSequence, int i, int i2, int i3) {
            c();
        }

        public void c() {
            java.lang.String strL1;
            android.ext.EditTextSpeeds editTextSpeeds = this.f103a;
            if (editTextSpeeds == null || this.f104b == null) {
                strL1 = "?";
            } else {
                try {
                    java.lang.String strTrim = editTextSpeeds.getText().toString().trim();
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
                    double dJ1 = android.ext.Tools.j1(strTrim.substring(i + 1, iIndexOf));
                    if (dJ1 > 0.0d) {
                        android.ext.d1.a aVarD = android.ext.d1.d(dJ1);
                        strL1 = android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.speed_info), android.ext.Tools.g1(aVarD.f719b), android.ext.Tools.g1(aVarD.f718a));
                    } else {
                        strL1 = "??";
                    }
                } catch (java.lang.NumberFormatException unused) {
                    strL1 = "???";
                }
            }
            this.f104b.setText(strL1);
        }
    }

    class z implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.EditTextSpeeds f106a;

        z(android.ext.EditTextSpeeds editTextSpeeds) {
            this.f106a = editTextSpeeds;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            java.lang.String strTrim = this.f106a.getText().toString().trim();
            android.ext.y0.b(strTrim, 16);
            android.ext.MainService.instance.k0.g(strTrim);
        }
    }

    public ConfigListAdapter() {
        android.ext.HotPoint hotPoint = android.ext.MainService.instance.j;
        w(hotPoint.getLayoutAlpha(), hotPoint.getVanishingTime(), null, null, hotPoint.getSize());
        x();
    }

    public static void a(java.lang.String str) {
        android.ext.e1.d("mConfigTempPath onClick");
        android.view.View viewF = gga.d.f(catch_.me_.if_.you_.can_.R.layout.temp_path_config, null);
        android.ext.EditTextPath editTextPath = (android.ext.EditTextPath) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.temp_file_path);
        android.content.SharedPreferences sharedPreferencesM0 = android.ext.Tools.M0();
        if (str == null) {
            str = sharedPreferencesM0.getString("temp-path", "");
        }
        editTextPath.setText(str);
        editTextPath.setDataType(4);
        editTextPath.setPathType(0);
        ((android.widget.TextView) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.temp_file_desc)).setText(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.path_for_temp_files) + '\n' + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.path_must_be));
        viewF.findViewById(catch_.me_.if_.you_.can_.R.id.path_selector).setTag(editTextPath);
        android.app.AlertDialog alertDialogCreate = android.ext.f.b().setView(android.ext.InternalKeyboard.e(viewF, false)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.confirm), (android.content.DialogInterface.OnClickListener) null).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cancel), (android.content.DialogInterface.OnClickListener) null).create();
        android.ext.ConfigListAdapter.l lVar = new android.ext.ConfigListAdapter.l(editTextPath, alertDialogCreate);
        android.ext.v2.a((android.widget.Button) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.typical_values), editTextPath);
        r(alertDialogCreate, lVar, editTextPath);
    }

    public static void b() {
        if (android.ext.f1.y()) {
            android.view.View viewF = gga.d.f(catch_.me_.if_.you_.can_.R.layout.temp_path_config, null);
            android.ext.EditTextPath editTextPath = (android.ext.EditTextPath) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.temp_file_path);
            android.content.SharedPreferences sharedPreferencesM0 = android.ext.Tools.M0();
            editTextPath.setText(sharedPreferencesM0.getString("su", ""));
            editTextPath.setDataType(4);
            editTextPath.setPathType(1);
            editTextPath.setHint("su");
            ((android.widget.TextView) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.temp_file_desc)).setText(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.su_command));
            android.widget.CheckBox checkBox = (android.widget.CheckBox) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.use_sh);
            checkBox.setChecked(sharedPreferencesM0.getBoolean("sh", false));
            checkBox.setVisibility(0);
            viewF.findViewById(catch_.me_.if_.you_.can_.R.id.path_selector).setTag(editTextPath);
            android.app.AlertDialog alertDialogCreate = android.ext.f.b().setView(android.ext.InternalKeyboard.e(viewF, false)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.confirm), (android.content.DialogInterface.OnClickListener) null).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cancel), (android.content.DialogInterface.OnClickListener) null).create();
            android.ext.ConfigListAdapter.o oVar = new android.ext.ConfigListAdapter.o(editTextPath, checkBox, alertDialogCreate);
            android.widget.Button button = (android.widget.Button) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.typical_values);
            java.lang.String[] strArr = {"su", "ku.sud", "/system/bin/su", "/system/xbin/su", "/su/bin/su", "/system/xbin/bstk/su", "/sbin/su", "/magisk/.core/bin/su", "/magisk/phh/bin/su"};
            button.setOnClickListener(new android.ext.v2(strArr, strArr));
            button.setTag(editTextPath);
            r(alertDialogCreate, oVar, editTextPath);
        }
    }

    static void c() {
        java.lang.String[] strArr = new java.lang.String[android.ext.MainService.J0.length * 2];
        strArr[0] = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.search) + ", " + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.portrait);
        strArr[1] = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.search) + ", " + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.landscape);
        strArr[2] = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.saved_list) + ", " + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.portrait);
        strArr[3] = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.saved_list) + ", " + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.landscape);
        strArr[4] = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.memory_editor) + ", " + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.portrait);
        strArr[5] = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.memory_editor) + ", " + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.landscape);
        android.ext.f.o(android.ext.f.b().setItems(strArr, new android.ext.ConfigListAdapter.g(strArr)).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cancel), (android.content.DialogInterface.OnClickListener) null));
    }

    static void d() {
        android.ext.Tools.I1(catch_.me_.if_.you_.can_.R.string.loading, 0);
        android.ext.n2.h(new android.ext.ConfigListAdapter.p());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x009b  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce A[Catch: all -> 0x01b3, TRY_LEAVE, TryCatch #4 {all -> 0x01b3, blocks: (B:32:0x00c1, B:35:0x00ce), top: B:87:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    static void e() {
        java.lang.String str;
        java.util.Locale localeD;
        java.lang.String strG;
        boolean zStartsWith;
        long j2;
        int i2;
        java.lang.String str2;
        android.ext.MainService mainService = android.ext.MainService.instance;
        if (mainService == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.HashMap map = new java.util.HashMap();
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        mainService.l.getDefaultDisplay().getMetrics(displayMetrics);
        android.content.res.Resources resources = android.ext.MainService.context.getResources();
        android.content.res.Configuration configuration = resources.getConfiguration();
        android.content.res.AssetManager assets = resources.getAssets();
        java.lang.String[] strArrE = android.ext.k.e();
        java.util.Arrays.sort(strArrE, new android.ext.ConfigListAdapter.q());
        java.lang.String strF = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.lang_code);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        int length = strArrE.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int size = -1;
        while (i5 < length) {
            java.lang.String str3 = strArrE[i5];
            int i6 = i4 + 1;
            if (str3 == null) {
                strArrE = strArrE;
            } else {
                try {
                    long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                    if (jCurrentTimeMillis2 - jCurrentTimeMillis > 2000) {
                        try {
                            android.ext.Tools.K1(((i6 * 100) / strArrE.length) + "%", i3);
                            jCurrentTimeMillis = jCurrentTimeMillis2;
                            try {
                                if (str3.length() == 0) {
                                    str = "en_US";
                                    try {
                                        "en_US".replace('_', '-');
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        map = map;
                                        strArrE = strArrE;
                                        strF = strF;
                                        android.ext.e1.l("Failed check locale: " + str, th);
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
                                                } catch (java.lang.Throwable th2) {
                                                    th = th2;
                                                    map = map;
                                                    size = i2;
                                                    jCurrentTimeMillis = j2;
                                                    android.ext.e1.l("Failed check locale: " + str, th);
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
                                                str2 = java.lang.String.format(localeD, "\n[%,.1f | %.2e]", java.lang.Double.valueOf(-1234.0d), java.lang.Double.valueOf(-4.56E-78d));
                                            } catch (java.lang.Throwable th3) {
                                                android.ext.e1.a(th3);
                                            }
                                            try {
                                                map.put(strG, str);
                                                arrayList.add(str);
                                                try {
                                                    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                                                    spannableStringBuilder.append((java.lang.CharSequence) localeD.getDisplayName(localeD));
                                                    map = map;
                                                    try {
                                                        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(android.ext.z1.d.s), 0, spannableStringBuilder.length(), 33);
                                                        int length2 = spannableStringBuilder.length();
                                                        spannableStringBuilder.append((java.lang.CharSequence) " (");
                                                        spannableStringBuilder.append((java.lang.CharSequence) str);
                                                        spannableStringBuilder.append(')');
                                                        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(android.ext.z1.d.r), length2, spannableStringBuilder.length(), 33);
                                                        int length3 = spannableStringBuilder.length();
                                                        spannableStringBuilder.append((java.lang.CharSequence) str2);
                                                        spannableStringBuilder.setSpan(new android.text.style.RelativeSizeSpan(0.6f), length3, spannableStringBuilder.length(), 33);
                                                        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(android.ext.z1.d.t), length3, spannableStringBuilder.length(), 33);
                                                        arrayList2.add(spannableStringBuilder);
                                                    } catch (java.lang.Throwable th4) {
                                                        th = th4;
                                                        try {
                                                            android.ext.e1.a(th);
                                                            arrayList2.add(localeD.getDisplayName(localeD) + " (" + str + ')' + str2);
                                                        } catch (java.lang.Throwable th5) {
                                                            th = th5;
                                                            jCurrentTimeMillis = j2;
                                                            android.ext.e1.l("Failed check locale: " + str, th);
                                                        }
                                                    }
                                                } catch (java.lang.Throwable th6) {
                                                    th = th6;
                                                    map = map;
                                                }
                                                jCurrentTimeMillis = j2;
                                            } catch (java.lang.Throwable th7) {
                                                th = th7;
                                                map = map;
                                                jCurrentTimeMillis = j2;
                                                android.ext.e1.l("Failed check locale: " + str, th);
                                                i5++;
                                                map = map;
                                                i4 = i6;
                                                strArrE = strArrE;
                                                strF = strF;
                                                i3 = 0;
                                            }
                                        }
                                    } catch (java.lang.Throwable th8) {
                                        th = th8;
                                        strF = strF;
                                        android.ext.e1.l("Failed check locale: " + str, th);
                                        i5++;
                                        map = map;
                                        i4 = i6;
                                        strArrE = strArrE;
                                        strF = strF;
                                        i3 = 0;
                                    }
                                } catch (java.lang.Throwable th9) {
                                    th = th9;
                                    strArrE = strArrE;
                                }
                            } catch (java.lang.Throwable th10) {
                                th = th10;
                                str = str3;
                                android.ext.e1.l("Failed check locale: " + str, th);
                                i5++;
                                map = map;
                                i4 = i6;
                                strArrE = strArrE;
                                strF = strF;
                                i3 = 0;
                            }
                        } catch (java.lang.Throwable th11) {
                            th = th11;
                            map = map;
                            strArrE = strArrE;
                            strF = strF;
                            str = str3;
                            jCurrentTimeMillis = jCurrentTimeMillis2;
                            android.ext.e1.l("Failed check locale: " + str, th);
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
                                str2 = java.lang.String.format(localeD, "\n[%,.1f | %.2e]", java.lang.Double.valueOf(-1234.0d), java.lang.Double.valueOf(-4.56E-78d));
                                map.put(strG, str);
                                arrayList.add(str);
                                android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder();
                                spannableStringBuilder2.append((java.lang.CharSequence) localeD.getDisplayName(localeD));
                                map = map;
                                spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(android.ext.z1.d.s), 0, spannableStringBuilder2.length(), 33);
                                int length4 = spannableStringBuilder2.length();
                                spannableStringBuilder2.append((java.lang.CharSequence) " (");
                                spannableStringBuilder2.append((java.lang.CharSequence) str);
                                spannableStringBuilder2.append(')');
                                spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(android.ext.z1.d.r), length4, spannableStringBuilder2.length(), 33);
                                int length5 = spannableStringBuilder2.length();
                                spannableStringBuilder2.append((java.lang.CharSequence) str2);
                                spannableStringBuilder2.setSpan(new android.text.style.RelativeSizeSpan(0.6f), length5, spannableStringBuilder2.length(), 33);
                                spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(android.ext.z1.d.t), length5, spannableStringBuilder2.length(), 33);
                                arrayList2.add(spannableStringBuilder2);
                                jCurrentTimeMillis = j2;
                            } else {
                                size = i2;
                                str2 = "";
                                str2 = java.lang.String.format(localeD, "\n[%,.1f | %.2e]", java.lang.Double.valueOf(-1234.0d), java.lang.Double.valueOf(-4.56E-78d));
                                map.put(strG, str);
                                arrayList.add(str);
                                android.text.SpannableStringBuilder spannableStringBuilder3 = new android.text.SpannableStringBuilder();
                                spannableStringBuilder3.append((java.lang.CharSequence) localeD.getDisplayName(localeD));
                                map = map;
                                spannableStringBuilder3.setSpan(new android.text.style.ForegroundColorSpan(android.ext.z1.d.s), 0, spannableStringBuilder3.length(), 33);
                                int length6 = spannableStringBuilder3.length();
                                spannableStringBuilder3.append((java.lang.CharSequence) " (");
                                spannableStringBuilder3.append((java.lang.CharSequence) str);
                                spannableStringBuilder3.append(')');
                                spannableStringBuilder3.setSpan(new android.text.style.ForegroundColorSpan(android.ext.z1.d.r), length6, spannableStringBuilder3.length(), 33);
                                int length7 = spannableStringBuilder3.length();
                                spannableStringBuilder3.append((java.lang.CharSequence) str2);
                                spannableStringBuilder3.setSpan(new android.text.style.RelativeSizeSpan(0.6f), length7, spannableStringBuilder3.length(), 33);
                                spannableStringBuilder3.setSpan(new android.text.style.ForegroundColorSpan(android.ext.z1.d.t), length7, spannableStringBuilder3.length(), 33);
                                arrayList2.add(spannableStringBuilder3);
                                jCurrentTimeMillis = j2;
                            }
                        }
                    }
                } catch (java.lang.Throwable th12) {
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
        android.ext.n2.i(new android.ext.ConfigListAdapter.r(new android.ext.ArrayAdapter(android.ext.MainService.context, arrayList2), size, arrayList));
    }

    private static void f() {
        if (!android.ext.Config.C || j) {
            return;
        }
        int i2 = 0;
        while (true) {
            int[] iArr = h;
            if (i2 >= iArr.length) {
                j = true;
                return;
            } else {
                if (iArr[i2] == catch_.me_.if_.you_.can_.R.string.help_game_not_listed_root) {
                    iArr[i2] = catch_.me_.if_.you_.can_.R.string.help_game_not_listed_noroot;
                }
                i2++;
            }
        }
    }

    private static java.lang.String g(android.content.res.Configuration configuration, java.util.Locale locale, android.content.res.AssetManager assetManager, android.util.DisplayMetrics displayMetrics) {
        android.content.res.Resources resources;
        java.lang.String str;
        android.content.res.Configuration configuration2 = new android.content.res.Configuration(configuration);
        q(configuration2, locale);
        try {
            resources = android.ext.MainService.context.createConfigurationContext(configuration2).getResources();
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
            resources = null;
        }
        if (resources == null) {
            resources = new android.content.res.Resources(assetManager, displayMetrics, configuration2);
        }
        try {
            str = java.lang.String.format(locale, "%,d;%,d;%e;%e;%e;%e;", 1234567890, -1234567890, java.lang.Double.valueOf(1.23456E300d), java.lang.Double.valueOf(-1.23456E300d), java.lang.Double.valueOf(1.23456E-300d), java.lang.Double.valueOf(-1.23456E-300d));
        } catch (java.lang.Exception e2) {
            android.ext.e1.a(e2);
            str = "";
        }
        return resources.getString(catch_.me_.if_.you_.can_.R.string.lang_code) + str;
    }

    public static android.content.DialogInterface.OnClickListener h() {
        return new android.ext.ConfigListAdapter.i();
    }

    public static java.lang.String i() {
        android.content.SharedPreferences sharedPreferencesM0 = android.ext.Tools.M0();
        android.content.SharedPreferences.Editor editorEdit = sharedPreferencesM0.edit();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        long j2 = sharedPreferencesM0.getLong("mc", 0L);
        editorEdit.remove("mc");
        if (j2 != 0) {
            sb.append("&mc=");
            sb.append('=');
            sb.append(java.lang.Long.toHexString(j2));
        }
        editorEdit.commit();
        return sb.toString();
    }

    static void j(int i2) {
        int i3;
        if (i2 == 3) {
            try {
                i3 = android.ext.Tools.M0().getInt("hide-icon", 0);
            } catch (java.lang.Throwable th) {
                android.ext.e1.l("Failed disable icon " + i2, th);
                return;
            }
        } else {
            i3 = i2;
        }
        if ((i3 == 1 && (android.ext.r.n instanceof catch_.me_.if_.you_.can_.MainActivity)) || (i3 == 2 && (android.ext.r.n instanceof catch_.me_.if_.you_.can_.ActivityMain))) {
            if (i2 != 3) {
                android.ext.f.o(android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.hide_icons)).setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cannot_hide_launcher_icon)).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), (android.content.DialogInterface.OnClickListener) null));
                return;
            }
            return;
        }
        java.lang.String strC0 = android.ext.Tools.C0();
        android.content.pm.PackageManager packageManagerB0 = android.ext.Tools.B0();
        android.content.ComponentName componentName = new android.content.ComponentName(strC0, catch_.me_.if_.you_.can_.ActivityMain.class.getName());
        android.content.ComponentName componentName2 = new android.content.ComponentName(strC0, catch_.me_.if_.you_.can_.MainActivity.class.getName());
        android.ext.e1.d("hide A: " + i3 + "; " + componentName2 + ": " + packageManagerB0.getComponentEnabledSetting(componentName2) + "; " + componentName + ": " + packageManagerB0.getComponentEnabledSetting(componentName) + ';');
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
            android.ext.Tools.w1(1, componentName2, 1);
        }
        if (i3 != 2) {
            android.ext.Tools.w1(3, componentName, 1);
        }
        if (i3 == 1) {
            android.ext.Tools.w1(5, componentName2, 2);
        }
        if (i3 == 2) {
            android.ext.Tools.w1(7, componentName, 2);
        }
        if (i3 != 1) {
            android.ext.Tools.w1(9, componentName2, 1);
        }
        if (i3 != 2) {
            android.ext.Tools.w1(11, componentName, 1);
        }
        android.ext.e1.d("hide Z: " + i3 + "; " + componentName2 + ": " + packageManagerB0.getComponentEnabledSetting(componentName2) + "; " + componentName + ": " + packageManagerB0.getComponentEnabledSetting(componentName) + ';');
        if (i2 != 3) {
            new android.ext.g2().g("hide-icon", i3, 0).commit();
        }
    }

    public static boolean k() {
        boolean z2 = false;
        try {
            java.lang.String[] strArr = android.os.Build.SUPPORTED_64_BIT_ABIS;
            boolean z3 = strArr != null && strArr.length > 0;
            try {
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream("/proc/self/auxv");
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
            } catch (java.lang.Throwable th) {
                boolean z4 = z3;
                th = th;
                z2 = z4;
                android.ext.e1.s("Failed check 64 client. Used: " + z2, th);
                return z2;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    static void m() {
        android.ext.f.o(android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.app_name)).setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.exit_confirm)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.restart), new android.ext.p0(200, true)).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.skip), (android.content.DialogInterface.OnClickListener) null));
    }

    private static void n() {
        new android.ext.g2().i("mc", f47g, 0L).commit();
    }

    private void p(android.widget.TextView textView) {
        int i2;
        switch (textView.getId()) {
            case catch_.me_.if_.you_.can_.R.id.config_autopause /* 2131034151 */:
                i2 = catch_.me_.if_.you_.can_.R.drawable.ic_pause_white_18dp;
                break;
            case catch_.me_.if_.you_.can_.R.id.config_history_limit /* 2131034168 */:
                i2 = catch_.me_.if_.you_.can_.R.drawable.ic_history_white_24dp;
                break;
            case catch_.me_.if_.you_.can_.R.id.config_icons_size /* 2131034173 */:
                i2 = catch_.me_.if_.you_.can_.R.drawable.ic_tooltip_edit_white_24dp;
                break;
            case catch_.me_.if_.you_.can_.R.id.config_saved_list_updates_interval /* 2131034193 */:
                i2 = catch_.me_.if_.you_.can_.R.drawable.ic_content_save_white_24dp;
                break;
            case catch_.me_.if_.you_.can_.R.id.config_speeds /* 2131034198 */:
                i2 = catch_.me_.if_.you_.can_.R.drawable.ic_speedometer_white_24dp;
                break;
            case catch_.me_.if_.you_.can_.R.id.config_time_jump_panel /* 2131034205 */:
                i2 = catch_.me_.if_.you_.can_.R.drawable.ic_fast_forward_white_24dp;
                break;
            case catch_.me_.if_.you_.can_.R.id.config_unrandomizer /* 2131034208 */:
                i2 = catch_.me_.if_.you_.can_.R.drawable.ic_dice_multiple_white_24dp;
                break;
            case catch_.me_.if_.you_.can_.R.id.config_use_small_list_items /* 2131034211 */:
                i2 = catch_.me_.if_.you_.can_.R.drawable.ic_format_list_bulleted_white_24dp;
                break;
            case catch_.me_.if_.you_.can_.R.id.help /* 2131034277 */:
                i2 = catch_.me_.if_.you_.can_.R.drawable.ic_help_circle_outline_white_24dp;
                break;
            case catch_.me_.if_.you_.can_.R.id.screenshot /* 2131034394 */:
                i2 = catch_.me_.if_.you_.can_.R.drawable.ic_cellphone_screenshot_white_24dp;
                break;
            default:
                i2 = 0;
                break;
        }
        if (i2 != 0) {
            android.ext.Tools.c(textView, android.ext.Tools.o0(i2), android.ext.Config.d());
        }
    }

    public static void q(android.content.res.Configuration configuration, java.util.Locale locale) {
        try {
            configuration.setLocale(locale);
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
        }
        try {
            configuration.setLayoutDirection(locale);
        } catch (java.lang.Throwable th2) {
            android.ext.e1.a(th2);
        }
        try {
            configuration.locale = locale;
        } catch (java.lang.Throwable th3) {
            android.ext.e1.l("Failed set locale", th3);
        }
    }

    private static void r(android.app.AlertDialog alertDialog, android.view.View.OnClickListener onClickListener, android.widget.EditText editText) {
        alertDialog.setButton(-1, android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.confirm), new android.ext.ConfigListAdapter.m(onClickListener, alertDialog));
        android.ext.f.l(alertDialog, new android.ext.ConfigListAdapter.n(onClickListener));
        android.ext.f.n(alertDialog, editText);
    }

    public static void s() {
        t(0);
    }

    public static void t(int i2) {
        f();
        java.lang.String[] strArr = new java.lang.String[(h.length / 3) + 1];
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
                strArr[i5] = android.ext.b2.f(i6);
            }
            i3++;
        }
        strArr[0] = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.video_tutorials);
        android.ext.ConfigListAdapter.h hVar = new android.ext.ConfigListAdapter.h();
        if (i4 == 0) {
            android.ext.f.o(android.ext.f.b().setItems(strArr, hVar).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cancel), (android.content.DialogInterface.OnClickListener) null));
        } else {
            hVar.onClick(null, i4);
        }
    }

    private void u() {
        new android.ext.ConfigListAdapter.j("loadLogcat").start();
    }

    static void v() {
        android.ext.f.o(android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.screenshot)).setMessage(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.screenshot_prompt), 8)).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cancel), (android.content.DialogInterface.OnClickListener) null).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), new android.ext.ConfigListAdapter.f()));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f48a.length;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i2) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i2, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View[] viewArr = this.f48a;
        return i2 >= viewArr.length ? new android.view.View(android.ext.Tools.f0()) : viewArr[i2];
    }

    public void l(boolean z2) {
        if (!z2) {
            if (this.f48a.length == 0) {
                return;
            }
            android.widget.ListView listView = android.ext.MainService.instance.Y;
            this.f53f = android.ext.Tools.J0(listView);
            this.f48a = ggd.b.f1512b;
            notifyDataSetChanged();
            listView.setAdapter((android.widget.ListAdapter) null);
            return;
        }
        if (this.f48a.length > 0) {
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) gga.d.f(catch_.me_.if_.you_.can_.R.layout.service_config, null);
        this.f49b = new java.lang.ref.WeakReference((android.widget.TextView) viewGroup.findViewById(catch_.me_.if_.you_.can_.R.id.game_section));
        this.f50c = new java.lang.ref.WeakReference((android.widget.TextView) viewGroup.findViewById(catch_.me_.if_.you_.can_.R.id.config_icon_text));
        this.f51d = new java.lang.ref.WeakReference((android.widget.ImageView) viewGroup.findViewById(catch_.me_.if_.you_.can_.R.id.config_icon_example));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            try {
                android.view.View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() != 8) {
                    if (childAt instanceof android.widget.TextView) {
                        ((android.widget.TextView) childAt).setText(android.ext.b2.g(((android.widget.TextView) childAt).getText().toString().trim()));
                        p((android.widget.TextView) childAt);
                    }
                    childAt.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2, 0));
                    arrayList.add(childAt);
                }
            } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            android.ext.Tools.O0((android.view.View) it.next());
        }
        this.f48a = (android.view.View[]) arrayList.toArray(new android.view.View[arrayList.size()]);
        notifyDataSetChanged();
        android.ext.MainService mainService = android.ext.MainService.instance;
        mainService.Y.setAdapter((android.widget.ListAdapter) this);
        android.ext.HotPoint hotPoint = mainService.j;
        o();
        w(hotPoint.getLayoutAlpha(), hotPoint.getVanishingTime(), null, null, hotPoint.getSize());
        android.ext.Tools.a0 a0Var = this.f53f;
        if (a0Var != null) {
            android.ext.Tools.A1(android.ext.MainService.instance.Y, a0Var);
            android.ext.MainService.instance.Y.post(new android.ext.ConfigListAdapter.k(a0Var));
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
        android.widget.TextView textView = (android.widget.TextView) this.f49b.get();
        if (textView == null) {
            return;
        }
        java.lang.String strF = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.game_settings);
        android.ext.z1.d dVar = android.ext.MainService.instance.v0;
        java.lang.String str = dVar != null ? dVar.f1433b : null;
        if (str != null) {
            strF = android.ext.Tools.O1(strF) + " \"" + str + "\":";
        }
        textView.setText(strF);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i2, long j2) {
        int id;
        android.app.AlertDialog.Builder positiveButton;
        android.app.AlertDialog.Builder message;
        java.lang.String strF;
        android.content.DialogInterface.OnClickListener bVar;
        java.lang.String strF2;
        android.app.AlertDialog.Builder view2;
        android.ext.TimersEditor timersEditor;
        android.view.View viewF;
        android.ext.Config.p.a tVar;
        if (view == null || (id = view.getId()) == -1) {
            return;
        }
        long j3 = 1 << (i2 % 63);
        long j4 = f47g;
        if ((j4 & j3) == 0) {
            f47g = j3 | j4;
            n();
        }
        android.ext.MainService mainService = android.ext.MainService.instance;
        android.ext.Config.p pVarB = android.ext.Config.b(id);
        if (pVarB != null) {
            if (id != catch_.me_.if_.you_.can_.R.id.config_keyboard) {
                if (id == catch_.me_.if_.you_.can_.R.id.config_icons_size) {
                    tVar = new android.ext.ConfigListAdapter.t();
                }
                pVarB.b();
                return;
            }
            tVar = new android.ext.ConfigListAdapter.s();
            pVarB.f(tVar);
            pVarB.b();
            return;
        }
        switch (id) {
            case catch_.me_.if_.you_.can_.R.id.about /* 2131034113 */:
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("__version__ ");
                float f2 = 1;
                sb.append((108.5f * f2) - 7.1f);
                sb.append(" (");
                sb.append((int) (((f2 * 16586.3f) - 431.3f) + 0.5f));
                sb.append(")\n\n__developers__\n");
                sb.append(DEVS);
                sb.append("\n__special_thanks__\n\tdanilo_scala,\n\tYoungBai,\n\tKorean L,\n\tiAndroHacker,\n\tMobile46,\n\treduxpl,\n\tjan.eike.kottlarz,\n\ttimo.szillat,\n\tSubZero5,\n\tZuiXan,\n\tAlex,\n\tGanjar Sukmara,\n\tdd09david,\n\tvenomx961,\n\tchatzopoulosapostolos,\n\tWanderMax,\n\tIvan Maldonado,\n\tvesper7dd,\n\tSelfDestruct68,\n\tmallachri,\n\tAzhar Dripana,\n\tIlya Kushnir,\n\twasao0807,\n\tAlex NG,\n\tjeroen.wilmink,\n\tpodluka,\n\tAnty0,\n\tkiilerman496,\n\tthex3only,\n\tmustafayasir6,\n\tHavergal Samosir Jr.,\n\timpykid,\n\t28ado1,\n\tElectroz,\n\tvincensius.august,\n\tRuan Carlos,\n\tNurMarvin,\n\tSkullboyq,\n\tYakiaaa,\n\tag2s20150609,\n\tanitamoellerga,\n\tcoolapk_ooops,\n\tpandecheng,\n\tpkjisoo32,\n\tLeam19999,\n\tminecraft172zzz,\n\tTodd Justin York,\n\tGedablo,\n\trootddos511,\n\t楊萬林,\n\tchetraclr,\n\tcub.madrax,\n\tntnhiu,\n\tbuivanxia10,\n\twl02082201,\n\tBacklift,\n\tvonxom,\n\tPeter Cuevas H,\n\talg1.66336611,\n\tHoangthinh99hp,\n\tJackH4L,\n\tspacemaker2906,\n\tva3kama3eredeti,\n\tAustin Andrews,\n\tsaqibpiash,\n\tsuuyout,\n\tsljivics,\n\tDartel,\n\tdoungvichetra2,\n\t0968688218channa,\n\tCaptainTF,\n\tdbinkv1,\n\tronaldmoura,\n\tlafrite.cassee,\n\tJazeks,\n\tNightMareNivek,\n\tprefix309,\n\tmilad19s,\n\tliato.games,\n\tCmP,\n\t1701silentspawn,\n\tgood7773good7773good7773,\n\tATAA SY,\n\tkhiemhocrot.98,\n\ta0193143,\n\tYaroslav,\n\tzam5355,\n\tlonglix,\n\tsssidiki4,\n\tGeorge,\n\t冰鍊,\n\tFloatKey.");
                positiveButton = android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.about)).setMessage(android.ext.b2.g(sb.toString())).setNeutralButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.copy), new android.ext.ConfigListAdapter.w()).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.site), new android.ext.r.n(null));
                strF2 = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok);
                view2 = positiveButton.setNegativeButton(strF2, (android.content.DialogInterface.OnClickListener) null);
                android.ext.f.o(view2);
                break;
            case catch_.me_.if_.you_.can_.R.id.changelog /* 2131034148 */:
                new android.ext.ConfigListAdapter.a("changelog").start();
                break;
            case catch_.me_.if_.you_.can_.R.id.config_clear_defaults /* 2131034155 */:
                message = android.ext.f.b().setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.reset_ignore));
                strF = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.confirm);
                bVar = new android.ext.ConfigListAdapter.b();
                positiveButton = message.setPositiveButton(strF, bVar);
                strF2 = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cancel);
                view2 = positiveButton.setNegativeButton(strF2, (android.content.DialogInterface.OnClickListener) null);
                android.ext.f.o(view2);
                break;
            case catch_.me_.if_.you_.can_.R.id.config_clear_history /* 2131034156 */:
                message = android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.clear_history)).setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.clear_history_warn));
                strF = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok);
                bVar = new android.ext.ConfigListAdapter.e();
                positiveButton = message.setPositiveButton(strF, bVar);
                strF2 = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cancel);
                view2 = positiveButton.setNegativeButton(strF2, (android.content.DialogInterface.OnClickListener) null);
                android.ext.f.o(view2);
                break;
            case catch_.me_.if_.you_.can_.R.id.config_disable_protection /* 2131034160 */:
                if (android.ext.f1.y()) {
                    positiveButton = android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.disable_protection)).setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.warn_patch_off_prot_)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), new android.ext.ConfigListAdapter.d(mainService));
                    strF2 = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cancel);
                    view2 = positiveButton.setNegativeButton(strF2, (android.content.DialogInterface.OnClickListener) null);
                    android.ext.f.o(view2);
                }
                break;
            case catch_.me_.if_.you_.can_.R.id.config_exit /* 2131034161 */:
                positiveButton = android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.exit)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.yes), new android.ext.p0(300));
                strF2 = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.no);
                view2 = positiveButton.setNegativeButton(strF2, (android.content.DialogInterface.OnClickListener) null);
                android.ext.f.o(view2);
                break;
            case catch_.me_.if_.you_.can_.R.id.config_icon /* 2131034170 */:
                android.view.View viewF2 = gga.d.f(catch_.me_.if_.you_.can_.R.layout.service_config_icon, null);
                android.widget.SeekBar seekBar = (android.widget.SeekBar) viewF2.findViewById(catch_.me_.if_.you_.can_.R.id.transparency);
                android.widget.SeekBar seekBar2 = (android.widget.SeekBar) viewF2.findViewById(catch_.me_.if_.you_.can_.R.id.hide);
                android.widget.SeekBar seekBar3 = (android.widget.SeekBar) viewF2.findViewById(catch_.me_.if_.you_.can_.R.id.size);
                android.widget.TextView textView = (android.widget.TextView) viewF2.findViewById(catch_.me_.if_.you_.can_.R.id.config_icon_text);
                android.widget.ImageView imageView = (android.widget.ImageView) viewF2.findViewById(catch_.me_.if_.you_.can_.R.id.config_icon_example);
                float layoutAlpha = mainService.j.getLayoutAlpha();
                int vanishingTime = mainService.j.getVanishingTime();
                int size = mainService.j.getSize();
                seekBar.setProgress(10 - ((int) (10.0f * layoutAlpha)));
                seekBar2.setProgress(vanishingTime < 0 ? seekBar2.getMax() : vanishingTime);
                seekBar3.setMax(12);
                seekBar3.setProgress(size);
                w(layoutAlpha, vanishingTime, textView, imageView, size);
                android.ext.ConfigListAdapter.u uVar = new android.ext.ConfigListAdapter.u(seekBar, seekBar2, seekBar3, textView, imageView);
                seekBar.setOnSeekBarChangeListener(uVar);
                seekBar2.setOnSeekBarChangeListener(uVar);
                seekBar3.setOnSeekBarChangeListener(uVar);
                view2 = android.ext.f.b().setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), (android.content.DialogInterface.OnClickListener) null).setView(viewF2);
                android.ext.f.o(view2);
                break;
            case catch_.me_.if_.you_.can_.R.id.config_kill_game /* 2131034178 */:
                positiveButton = android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.kill_game)).setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.kill_game_info_)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.yes), new android.ext.ConfigListAdapter.v(mainService));
                strF2 = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.no);
                view2 = positiveButton.setNegativeButton(strF2, (android.content.DialogInterface.OnClickListener) null);
                android.ext.f.o(view2);
                break;
            case catch_.me_.if_.you_.can_.R.id.config_language /* 2131034179 */:
                d();
                break;
            case catch_.me_.if_.you_.can_.R.id.config_last_stats /* 2131034180 */:
                android.view.View viewF3 = gga.d.f(catch_.me_.if_.you_.can_.R.layout.main_new_version, null);
                ((android.widget.TextView) viewF3.findViewById(catch_.me_.if_.you_.can_.R.id.changelog)).setText(android.ext.e1.f740f);
                positiveButton = android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.last_stats)).setView(viewF3);
                strF2 = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok);
                view2 = positiveButton.setNegativeButton(strF2, (android.content.DialogInterface.OnClickListener) null);
                android.ext.f.o(view2);
                break;
            case catch_.me_.if_.you_.can_.R.id.config_path /* 2131034185 */:
                a(null);
                break;
            case catch_.me_.if_.you_.can_.R.id.config_region_log /* 2131034190 */:
                android.ext.h0.h();
                break;
            case catch_.me_.if_.you_.can_.R.id.config_reset /* 2131034191 */:
                mainService.r(true);
                break;
            case catch_.me_.if_.you_.can_.R.id.config_speedhack_functions /* 2131034196 */:
                timersEditor = android.ext.MainService.instance.n0;
                timersEditor.h();
                break;
            case catch_.me_.if_.you_.can_.R.id.config_speeds /* 2131034198 */:
                try {
                    viewF = gga.d.f(catch_.me_.if_.you_.can_.R.layout.list_speeds_config, null);
                } catch (java.lang.IndexOutOfBoundsException e2) {
                    android.ext.e1.a(e2);
                    android.ext.MainService.I0();
                    viewF = null;
                }
                if (viewF != null) {
                    android.widget.TextView textView2 = (android.widget.TextView) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.hint);
                    android.widget.TextView textView3 = (android.widget.TextView) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.message);
                    textView3.setText(android.ext.b2.g(textView3.getText().toString().trim()));
                    android.ext.EditTextSpeeds editTextSpeeds = (android.ext.EditTextSpeeds) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.speeds);
                    android.widget.TextView textView4 = (android.widget.TextView) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.default_);
                    textView4.setText(android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.default_) + ": " + android.ext.d1.c());
                    textView4.setOnClickListener(new android.ext.ConfigListAdapter.x(editTextSpeeds));
                    editTextSpeeds.setText(android.ext.MainService.instance.k0.b());
                    editTextSpeeds.setDataType(16);
                    editTextSpeeds.setOnChangedListener(new android.ext.ConfigListAdapter.y(editTextSpeeds, textView2));
                    android.ext.f.q(android.ext.f.b().setView(android.ext.InternalKeyboard.d(viewF)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.confirm), new android.ext.ConfigListAdapter.z(editTextSpeeds)).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cancel), (android.content.DialogInterface.OnClickListener) null), editTextSpeeds);
                }
                break;
            case catch_.me_.if_.you_.can_.R.id.config_su /* 2131034200 */:
                b();
                break;
            case catch_.me_.if_.you_.can_.R.id.config_toolbar_buttons /* 2131034206 */:
                c();
                break;
            case catch_.me_.if_.you_.can_.R.id.config_unrandomizer /* 2131034208 */:
                timersEditor = android.ext.MainService.instance.o0;
                timersEditor.h();
                break;
            case catch_.me_.if_.you_.can_.R.id.donate /* 2131034228 */:
                new android.ext.r.n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf25<;940grqdwh2").onClick(null, 0);
                break;
            case catch_.me_.if_.you_.can_.R.id.help /* 2131034277 */:
                s();
                break;
            case catch_.me_.if_.you_.can_.R.id.hide_icons /* 2131034284 */:
                java.lang.CharSequence[] charSequenceArr = {android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.nothing) + " (" + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.default_mark) + ')', android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.app_short_name_sw), android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.app_short_name_hw)};
                android.app.AlertDialog alertDialogCreate = android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.hide_icons)).setItems(charSequenceArr, new android.ext.ConfigListAdapter.c()).create();
                android.widget.ListView listView = alertDialogCreate.getListView();
                if (listView != null) {
                    android.ext.Tools.e(listView, charSequenceArr, new android.graphics.drawable.Drawable[]{null, android.ext.Tools.o0(catch_.me_.if_.you_.can_.R.mipmap.ic_sw_48dp), android.ext.Tools.o0(catch_.me_.if_.you_.can_.R.mipmap.ic_hw_48dp)}, 48, 0);
                }
                android.ext.f.m(alertDialogCreate);
                break;
            case catch_.me_.if_.you_.can_.R.id.screenshot /* 2131034394 */:
                v();
                break;
            case catch_.me_.if_.you_.can_.R.id.show_logcat /* 2131034403 */:
                u();
                break;
            default:
                android.ext.e1.p("Unknown id in config: " + id);
                break;
        }
    }

    void w(float f2, int i2, android.widget.TextView textView, android.widget.ImageView imageView, int i3) {
        java.lang.String strL1;
        android.ext.MainService mainService = android.ext.MainService.instance;
        try {
            strL1 = android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.config_icon_text), java.lang.Integer.valueOf(100 - ((int) (100.0f * f2))), i2 < 0 ? android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.icon_hide_never) : android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.icon_hide_after), java.lang.Integer.valueOf(i2)));
        } catch (java.lang.Throwable th) {
            android.ext.e1.l("Fail setup string for icon config", th);
            strL1 = "fail";
        }
        android.widget.TextView textView2 = (android.widget.TextView) this.f50c.get();
        if (textView2 != null) {
            textView2.setText(strL1);
        }
        if (textView != null) {
            textView.setText(strL1);
        }
        mainService.j.setSize(i3);
        int sizePx = mainService.j.getSizePx();
        android.ext.TimeJumpPanel timeJumpPanel = mainService.k;
        if (timeJumpPanel != null) {
            timeJumpPanel.setMinSize(sizePx);
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) this.f51d.get();
        if (imageView2 != null) {
            android.ext.Tools.y1(imageView2, f2 * 255.0f);
            android.ext.Config.q(imageView2, sizePx);
        }
        if (imageView != null) {
            android.ext.Tools.y1(imageView, 255.0f * f2);
            android.ext.Config.q(imageView, sizePx);
        }
        mainService.j.setLayoutAlpha(f2);
        mainService.j.setVanishingTime(i2);
        mainService.V(mainService.Y.getAdapter());
    }

    public void x() {
        for (android.view.View view : this.f48a) {
            if (view instanceof android.widget.TextView) {
                android.widget.TextView textView = (android.widget.TextView) view;
                int id = view.getId();
                android.ext.Config.p pVarB = android.ext.Config.b(id);
                boolean z2 = id == catch_.me_.if_.you_.can_.R.id.config_speedhack_functions || id == catch_.me_.if_.you_.can_.R.id.config_unrandomizer;
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
