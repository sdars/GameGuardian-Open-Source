/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.ext.ArrayAdapter;
import android.ext.Config;
import android.ext.EditText;
import android.ext.EditTextPath;
import android.ext.InternalKeyboard;
import android.ext.Tools;
import android.ext.b2;
import android.ext.e1;
import android.ext.f;
import android.ext.n0;
import android.ext.r1;
import android.ext.u1;
import android.ext.y0;
import android.fix.Button;
import android.fix.ListView;
import android.fix.TextView;
import android.os.Build;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import d.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

public class PathSelector
extends Button
implements View.OnClickListener {
    static boolean a = true;

    public PathSelector(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void a(String string2, ArrayList arrayList, String string3, String string4) {
        if (string4 == null) {
            return;
        }
        int n3 = string3 == null ? 1 : 3;
        Object object = string4;
        for (int i3 = 0; i3 < n3; ++i3) {
            Throwable throwable2;
            block14: {
                Object object2;
                block13: {
                    block15: {
                        object2 = object;
                        if (i3 == 1) {
                            object2 = object;
                            try {
                                if (!string4.startsWith("/data/data/")) break block13;
                                object2 = new StringBuilder();
                                ((StringBuilder)object2).append(string3);
                                ((StringBuilder)object2).append(string4.substring(11));
                                object2 = ((StringBuilder)object2).toString();
                            }
                            catch (Throwable throwable2) {
                                break block14;
                            }
                        }
                        object = object2;
                        if (i3 != 2) break block15;
                        if (!string4.startsWith(string3)) break block13;
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("/data/data/");
                        ((StringBuilder)object2).append(string4.substring(string3.length()));
                        object = ((StringBuilder)object2).toString();
                    }
                    object2 = new File((String)object);
                    int n4 = 0;
                    while (true) {
                        Object object3;
                        if (!((String)(object3 = ((File)object2).getAbsolutePath())).startsWith(string2)) {
                            object2 = object;
                            break;
                        }
                        if ((((File)object2).isDirectory() || ((File)object2).isFile()) && !arrayList.contains(object3 = ((String)object3).substring(string2.length()).split("/", -1)[0])) {
                            arrayList.add(object3);
                        }
                        object3 = ((File)object2).getParentFile();
                        object2 = object;
                        if (object3 == null) break;
                        int n5 = ((File)object3).getAbsolutePath().length();
                        object2 = object;
                        if (n5 <= 1) break;
                        if (n4 >= 20) {
                            object2 = object;
                            break;
                        }
                        ++n4;
                        object2 = object3;
                    }
                }
                object = object2;
                continue;
            }
            e1.a(throwable2);
            return;
        }
    }

    private void b() {
        this.setText("...");
        this.setOnClickListener(this);
    }

    static boolean c(File file) {
        try {
            boolean bl = file.isDirectory();
            return bl;
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static String[] d(File stringArray) {
        ArrayList arrayList;
        String string2;
        StringBuilder stringBuilder;
        Object object;
        Object var4_2;
        block12: {
            var4_2 = null;
            try {
                object = stringArray.list();
            }
            catch (SecurityException securityException) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Failed list dir: ");
                ((StringBuilder)object).append(stringArray.getAbsolutePath());
                e1.s(((StringBuilder)object).toString(), securityException);
                object = null;
            }
            if (object != null) {
                return object;
            }
            try {
                object = stringArray.getAbsolutePath();
                if (((String)object).startsWith("/data/user/")) {
                    stringArray = new StringBuilder();
                    stringArray.append("/data/user/");
                    stringArray.append(((String)object).split("/", -1)[3]);
                    stringArray.append("/");
                    stringArray = stringArray.toString();
                } else {
                    stringArray = "/data/user/0/";
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append((String)object);
                stringBuilder.append('/');
                string2 = stringBuilder.toString();
                arrayList = new ArrayList();
                PathSelector.a(string2, arrayList, (String)stringArray, "/data/anr");
                PathSelector.a(string2, arrayList, (String)stringArray, "/data/app");
                PathSelector.a(string2, arrayList, (String)stringArray, "/data/app-lib");
                PathSelector.a(string2, arrayList, (String)stringArray, "/data/app-private");
                PathSelector.a(string2, arrayList, (String)stringArray, "/data/dalvik-cache/profiles");
                PathSelector.a(string2, arrayList, (String)stringArray, "/data/dalvik-cache/x86");
                PathSelector.a(string2, arrayList, (String)stringArray, "/data/dalvik-cache/armeabi");
                PathSelector.a(string2, arrayList, (String)stringArray, "/data/dalvik-cache/armeabi-v7a");
                PathSelector.a(string2, arrayList, (String)stringArray, "/data/dalvik-cache/arm");
                PathSelector.a(string2, arrayList, (String)stringArray, "/data/dalvik-cache/arm64-v8a");
                PathSelector.a(string2, arrayList, (String)stringArray, "/data/dalvik-cache/arm64");
                PathSelector.a(string2, arrayList, (String)stringArray, "/data/dalvik-cache/x86");
                PathSelector.a(string2, arrayList, (String)stringArray, "/data/dalvik-cache/x86_64");
                PathSelector.a(string2, arrayList, (String)stringArray, "/data/local/tmp");
                PathSelector.a(string2, arrayList, (String)stringArray, "/data/misc/user");
                PathSelector.a(string2, arrayList, (String)stringArray, "/data/misc/zoneinfo");
                PathSelector.a(string2, arrayList, (String)stringArray, "/data/resource-cache");
                PathSelector.a(string2, arrayList, (String)stringArray, "/data/security");
                PathSelector.a(string2, arrayList, (String)stringArray, "/data/system/cache");
                PathSelector.a(string2, arrayList, (String)stringArray, "/data/system/registered_services");
                PathSelector.a(string2, arrayList, (String)stringArray, "/data/system/shared_prefs");
                PathSelector.a(string2, arrayList, (String)stringArray, "/data/system/users");
                PathSelector.a(string2, arrayList, (String)stringArray, "/data/tmp");
                PathSelector.a(string2, arrayList, (String)stringArray, (String)stringArray);
                PathSelector.a(string2, arrayList, (String)stringArray, "/storage/emulated/legacy");
                PathSelector.a(string2, arrayList, (String)stringArray, "/storage/emulated/0");
                PathSelector.a(string2, arrayList, (String)stringArray, "/storage/emulated/sdcard0");
                PathSelector.a(string2, arrayList, (String)stringArray, "/storage/emulated/sdcard1");
                PathSelector.a(string2, arrayList, (String)stringArray, "/storage/sdcard0");
                PathSelector.a(string2, arrayList, (String)stringArray, "/storage/sdcard1");
                PathSelector.a(string2, arrayList, (String)stringArray, "/sdcard");
                PathSelector.a(string2, arrayList, (String)stringArray, Tools.K0());
                object = Tools.B0().getInstalledApplications(0).iterator();
                break block12;
            }
            catch (Throwable throwable) {}
            e1.a(throwable);
            return null;
        }
        while (object.hasNext()) {
            stringBuilder = (ApplicationInfo)object.next();
            PathSelector.a(string2, arrayList, (String)stringArray, ((ApplicationInfo)stringBuilder).dataDir);
            PathSelector.a(string2, arrayList, (String)stringArray, ((ApplicationInfo)stringBuilder).nativeLibraryDir);
            PathSelector.a(string2, arrayList, (String)stringArray, ((ApplicationInfo)stringBuilder).publicSourceDir);
            PathSelector.a(string2, arrayList, (String)stringArray, ((ApplicationInfo)stringBuilder).sourceDir);
            Object object2 = ((ApplicationInfo)stringBuilder).splitPublicSourceDirs;
            if (object2 != null) {
                int n3 = ((String[])object2).length;
                for (int i3 = 0; i3 < n3; ++i3) {
                    PathSelector.a(string2, arrayList, (String)stringArray, (String)object2[i3]);
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                PathSelector.a(string2, arrayList, (String)stringArray, u1.a((ApplicationInfo)stringBuilder));
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("/data/data/");
            ((StringBuilder)object2).append(((ApplicationInfo)stringBuilder).packageName);
            PathSelector.a(string2, arrayList, (String)stringArray, ((StringBuilder)object2).toString());
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("/data/app/");
            ((StringBuilder)object2).append(((ApplicationInfo)stringBuilder).packageName);
            ((StringBuilder)object2).append("-1/base.apk");
            PathSelector.a(string2, arrayList, (String)stringArray, ((StringBuilder)object2).toString());
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("/data/app/");
            ((StringBuilder)object2).append(((ApplicationInfo)stringBuilder).packageName);
            ((StringBuilder)object2).append("-2/base.apk");
            PathSelector.a(string2, arrayList, (String)stringArray, ((StringBuilder)object2).toString());
        }
        if (arrayList.size() != 0) return arrayList.toArray(new String[arrayList.size()]);
        return var4_2;
    }

    static ArrayList e(int n3, File object, String[] object2, String object3, boolean bl) {
        ArrayList<d> arrayList = new ArrayList<d>();
        for (int i3 = 0; i3 < ((String[])object2).length; ++i3) {
            Object object4 = object2[i3];
            String string2 = ((String)object4).toLowerCase(Locale.US);
            if (object3 != null && !string2.startsWith((String)object3)) continue;
            object4 = new File((File)object, (String)object4);
            boolean bl2 = PathSelector.c((File)object4);
            if (n3 == 0 && !bl2) continue;
            arrayList.add(new d((File)object4, string2, bl2));
        }
        if (arrayList.size() > 1) {
            object = new Comparator(bl){
                final boolean a;
                {
                    this.a = bl;
                }

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                public int a(d d4, d d5) {
                    Throwable throwable2;
                    block4: {
                        long l3;
                        boolean bl = d4.c;
                        boolean bl2 = d5.c;
                        int n3 = 1;
                        if (bl != bl2) {
                            if (!bl) return n3;
                            return -1;
                        }
                        try {
                            if (this.a) {
                                return r1.a(d4.b, d5.b);
                            }
                        }
                        catch (Throwable throwable2) {
                            break block4;
                        }
                        long l4 = d4.a.lastModified();
                        if (l4 <= (l3 = d5.a.lastModified())) return n3;
                        return -1;
                    }
                    e1.a(throwable2);
                    return 0;
                }
            };
            try {
                long l3 = -System.currentTimeMillis();
                Collections.sort(arrayList, object);
                long l4 = System.currentTimeMillis();
                object = new StringBuilder();
                ((StringBuilder)object).append("Sort ");
                ((StringBuilder)object).append(arrayList.size());
                ((StringBuilder)object).append(" in ");
                ((StringBuilder)object).append(l3 + l4);
                e1.d(((StringBuilder)object).toString());
            }
            catch (IllegalArgumentException illegalArgumentException) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Failed sort:\n");
                object3 = new Comparator((StringBuilder)object2){
                    final StringBuilder a;
                    {
                        this.a = stringBuilder;
                    }

                    public int a(d object, d d4) {
                        boolean bl = ((d)object).c;
                        boolean bl2 = d4.c;
                        int n3 = bl != bl2 ? (bl ? -1 : 1) : r1.a(((d)object).b, d4.b);
                        StringBuilder stringBuilder = this.a;
                        char c4 = 'F';
                        char c5 = bl ? (char)'D' : 'F';
                        stringBuilder.append(c5);
                        this.a.append(':');
                        this.a.append(object);
                        this.a.append(':');
                        this.a.append(((d)object).b);
                        this.a.append('\n');
                        object = this.a;
                        c5 = c4;
                        if (bl2) {
                            c5 = 'D';
                        }
                        ((StringBuilder)object).append(c5);
                        this.a.append(':');
                        this.a.append(d4);
                        this.a.append(':');
                        this.a.append(d4.b);
                        this.a.append('\n');
                        this.a.append(n3);
                        this.a.append('\n');
                        return n3;
                    }
                };
                try {
                    Collections.sort(arrayList, object3);
                }
                catch (IllegalArgumentException illegalArgumentException2) {
                    n0.i(((StringBuilder)object2).toString());
                }
                e1.a(illegalArgumentException);
            }
        }
        return arrayList;
    }

    public void onClick(View view) {
        new c(this).onClick(view);
    }

    private class c
    implements View.OnClickListener,
    AdapterView.OnItemClickListener,
    DialogInterface.OnClickListener {
        private ImageView a;
        private TextView b;
        ListView c;
        private TextView d;
        private File e;
        private ArrayAdapter f;
        private AlertDialog g;
        private int h;
        private android.widget.EditText i;
        private android.widget.EditText j;
        private int k;
        private int l;
        private int m;
        final PathSelector n;

        private c(PathSelector pathSelector) {
            this.n = pathSelector;
            this.k = Tools.e0(2130837512, -16755456);
            this.l = Tools.e0(2130837513, -16777131);
            this.m = Tools.e0(2130837511, -16755371);
        }

        private void a(String string2) {
            EditText editText = new EditText(Tools.f0());
            this.j = editText;
            editText.setText(string2);
            string2 = android.ext.f.b();
            String string3 = b2.f(2131296463);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.e.getAbsolutePath());
            stringBuilder.append("/...");
            android.ext.f.o(string2.setCustomTitle(Tools.i0(string3, stringBuilder.toString())).setView(InternalKeyboard.e((View)editText, false)).setNegativeButton((CharSequence)b2.f(2131296311), null).setPositiveButton((CharSequence)b2.f(2131296836), (DialogInterface.OnClickListener)this));
        }

        private void c(String string2) {
            this.e = new File(this.e, string2);
        }

        private void d(int n3) {
            this.c.setSelection(n3);
            this.c.post(new Runnable(this, n3){
                final int a;
                final c b;
                {
                    this.b = c4;
                    this.a = n3;
                }

                @Override
                public void run() {
                    this.b.c.setSelection(this.a);
                }
            });
        }

        private void e(File file, boolean bl) {
            int n3;
            block4: {
                ArrayAdapter arrayAdapter = this.f;
                int n4 = arrayAdapter.getCount();
                String string2 = file.getAbsolutePath().toLowerCase(Locale.US);
                int n5 = 0;
                for (n3 = 0; n3 < n4; ++n3) {
                    File file2 = (File)arrayAdapter.getItem(n3);
                    if (!file.equals(file2)) {
                        int n6 = n5;
                        if (bl == PathSelector.c(file2)) {
                            n6 = n5;
                            if (string2.compareTo(file2.getAbsolutePath().toLowerCase(Locale.US)) > 0) {
                                n6 = n3;
                            }
                        }
                        n5 = n6;
                        continue;
                    }
                    break block4;
                }
                n3 = n5;
            }
            this.d(n3);
        }

        private void f(boolean bl) {
            Object object = this.d;
            int n3 = 8;
            int n4 = bl ? 0 : 8;
            object.setVisibility(n4);
            object = this.c;
            n4 = n3;
            if (!bl) {
                n4 = 0;
            }
            object.setVisibility(n4);
        }

        private void g(boolean bl) {
            ImageView imageView = this.a;
            ImageView imageView2 = bl ? null : imageView;
            imageView.setTag((Object)imageView2);
            imageView2 = this.a;
            int n3 = bl ? 2130968652 : 2130968651;
            imageView2.setImageDrawable(Tools.o0(n3));
        }

        private void h() {
            File file;
            this.e = file = this.e.getParentFile();
            if (file == null) {
                this.e = new File("/");
            }
        }

        private void i() {
            this.b.setText(this.e.getAbsolutePath());
            Object object = PathSelector.d(this.e);
            boolean bl = object == null;
            this.f(bl);
            Object object2 = object;
            if (object == null) {
                object2 = d.b.a;
            }
            int n3 = this.h;
            object = this.e;
            bl = this.a.getTag() == null;
            object2 = PathSelector.e(n3, (File)object, (String[])object2, null, bl);
            this.f.clear();
            this.f.setNotifyOnChange(false);
            object = ((ArrayList)object2).iterator();
            while (object.hasNext()) {
                object2 = (d)object.next();
                this.f.add(((d)object2).a);
            }
            this.f.notifyDataSetChanged();
            this.f.setNotifyOnChange(true);
        }

        /*
         * Unable to fully structure code
         * Could not resolve type clashes
         */
        public View b(int var1_1, View var2_2, ViewGroup var3_4) {
            block12: {
                block11: {
                    block13: {
                        var11_5 = null;
                        var3_4 /* !! */  = var2_2;
                        if (var2_2 == null) {
                            var3_4 /* !! */  = LayoutInflater.from((Context)this.n.getContext()).inflate(2131099664, null);
                            var2_2 = new e();
                            var2_2.a = (TextView)var3_4 /* !! */ .findViewById(2131034337);
                            var2_2.b = (TextView)var3_4 /* !! */ .findViewById(2131034222);
                            var2_2.c = (TextView)var3_4 /* !! */ .findViewById(2131034405);
                            var2_2.d = Config.m((ImageView)var3_4 /* !! */ .findViewById(2131034289));
                            var3_4 /* !! */ .setTag(var2_2);
                        }
                        try {
                            var2_2 = (File)this.f.getItem(var1_1);
                        }
                        catch (IndexOutOfBoundsException var2_3) {
                            var12_6 /* !! */  = new StringBuilder();
                            var12_6 /* !! */ .append("Failed get item: ");
                            var12_6 /* !! */ .append(var1_1);
                            e1.s(var12_6 /* !! */ .toString(), var2_3);
                            var2_2 = var11_5;
                        }
                        var11_5 = var2_2;
                        if (var2_2 == null) {
                            var11_5 = new File(this.e, "???");
                        }
                        var12_6 /* !! */  = (e)var3_4 /* !! */ .getTag();
                        var2_2 = var11_5.getName();
                        if (var2_2.endsWith(".lua")) {
                            var1_1 = this.k;
lbl30:
                            // 3 sources

                            while (true) {
                                var3_4 /* !! */ .setBackgroundColor(var1_1);
                                break block11;
                                break;
                            }
                        }
                        if (!var2_2.endsWith(".txt")) break block13;
                        var1_1 = this.l;
                        ** GOTO lbl30
                    }
                    if (var2_2.endsWith(".lasm")) {
                        var1_1 = this.m;
                        ** continue;
                    }
                    var3_4 /* !! */ .setBackgroundColor(0);
                }
                var12_6 /* !! */ .a.setText((CharSequence)var2_2);
                var8_7 = -1L;
                var10_8 = PathSelector.c((File)var11_5);
                if (!var10_8) break block12;
                var4_9 = -1L;
                ** GOTO lbl52
            }
            try {
                var4_9 = var11_5.length();
lbl52:
                // 2 sources

                var6_10 = var11_5.lastModified();
            }
            catch (Throwable var13_11) {
                var2_2 = new StringBuilder();
                var2_2.append("Failed get info: ");
                var2_2.append(var11_5.getAbsolutePath());
                e1.s(var2_2.toString(), var13_11);
                var6_10 = -1L;
                var10_8 = false;
                var4_9 = var8_7;
            }
            var2_2 = var12_6 /* !! */ .d;
            var1_1 = var10_8 != false ? 2130968614 : 2130968611;
            var2_2.setImageResource(var1_1);
            var13_12 = var12_6 /* !! */ .c;
            var11_5 = "";
            var2_2 = var4_9 >= 0L ? Tools.U(this.n.getContext(), var4_9) : "";
            var13_12.setText((CharSequence)var2_2);
            var12_6 /* !! */  = var12_6 /* !! */ .b;
            var2_2 = var11_5;
            if (var6_10 > 0L) {
                var2_2 = DateFormat.format((CharSequence)"yyyy-MM-dd kk:mm:ss", (long)var6_10);
            }
            var12_6 /* !! */ .setText((CharSequence)var2_2);
            return var3_4 /* !! */ ;
        }

        /*
         * Unable to fully structure code
         */
        public void onClick(DialogInterface var1_1, int var2_2) {
            block10: {
                block11: {
                    block12: {
                        block6: {
                            block7: {
                                block9: {
                                    block8: {
                                        if (var1_1 != this.g) break block6;
                                        var3_3 = this.e.getAbsolutePath();
                                        var1_1 = var3_3;
                                        if (this.h != 2) break block7;
                                        var4_5 = new File(this.i.getText().toString()).getName();
                                        if (var4_5 == null) break block8;
                                        var1_1 = var4_5;
                                        if (var4_5.length() != 0) break block9;
                                    }
                                    var1_1 = "file.txt";
                                }
                                var4_5 = new StringBuilder();
                                var4_5.append(var3_3);
                                var4_5.append("/");
                                var4_5.append((String)var1_1);
                                var1_1 = var4_5.toString();
                            }
                            this.i.setText((CharSequence)var1_1);
                            break block10;
                        }
                        var1_1 = this.j;
                        if (var1_1 == null) break block10;
                        if ((var1_1 = var1_1.getText().toString().trim()).length() <= 0) ** GOTO lbl-1000
                        var3_4 = new File(this.e, (String)var1_1);
                        if (!var3_4.exists()) break block11;
                        if (!PathSelector.c(var3_4)) break block12;
                        var2_2 = 2131296460;
lbl31:
                        // 2 sources

                        while (true) {
                            Tools.H1(var2_2);
                            ** GOTO lbl43
                            break;
                        }
                    }
                    var2_2 = 2131296462;
                    ** while (true)
                }
                if (var3_4.mkdirs()) {
                    y0.b((String)var1_1, 4);
                    this.i();
                } else lbl-1000:
                // 2 sources

                {
                    Tools.H1(2131296461);
lbl43:
                    // 2 sources

                    this.a((String)var1_1);
                }
            }
        }

        public void onClick(View object) {
            int n3 = object.getId();
            if (n3 != 2131034114) {
                boolean bl = false;
                boolean bl2 = true;
                if (n3 != 2131034409) {
                    if (n3 != 2131034436) {
                        ListView listView;
                        Object object2;
                        object = this.n.getTag();
                        if (!(object instanceof EditTextPath)) {
                            return;
                        }
                        Object object3 = (EditTextPath)object;
                        this.i = object3;
                        object = a.d.f(2131099665, null);
                        this.b = (TextView)object.findViewById(2131034353);
                        Config.m((ImageView)object.findViewById(2131034114)).setOnClickListener((View.OnClickListener)this);
                        this.a = object2 = (ImageView)object.findViewById(2131034409);
                        Config.m(object2).setOnClickListener((View.OnClickListener)this);
                        this.g(a);
                        Config.m((ImageView)object.findViewById(2131034436)).setOnClickListener((View.OnClickListener)this);
                        this.d = (TextView)object.findViewById(2131034250);
                        this.c = listView = (ListView)object.findViewById(2131034253);
                        object2 = new ArrayAdapter(this, this.n.getContext(), new ArrayList()){
                            final c b;
                            {
                                this.b = c4;
                                super(context, list);
                            }

                            @Override
                            public View getView(int n3, View view, ViewGroup viewGroup) {
                                return this.b.b(n3, view, viewGroup);
                            }
                        };
                        this.f = object2;
                        listView.setAdapter((ListAdapter)object2);
                        listView.setOnItemClickListener(this);
                        this.h = ((EditTextPath)object3).getPathType();
                        this.e = object3 = new File(object3.getText().toString());
                        while (!PathSelector.c(this.e)) {
                            this.h();
                        }
                        this.i();
                        if (this.h == 0) {
                            bl = true;
                        }
                        this.e((File)object3, bl);
                        object = android.ext.f.b().setView(object).setNegativeButton((CharSequence)b2.f(2131296311), null);
                        if (this.h != 1) {
                            object.setPositiveButton((CharSequence)b2.f(2131296836), (DialogInterface.OnClickListener)this);
                        }
                        object = object.create();
                        this.g = object;
                        android.ext.f.m((AlertDialog)object);
                    } else {
                        object = this.e;
                        this.h();
                        this.i();
                        this.e((File)object, true);
                    }
                } else {
                    bl = this.a.getTag() != null ? bl2 : false;
                    a = bl;
                    this.g(bl);
                    this.i();
                    this.d(0);
                }
            } else {
                this.a("");
            }
        }

        public void onItemClick(AdapterView object, View object2, int n3, long l3) {
            if (n3 >= 0 && n3 < this.f.getCount()) {
                block6: {
                    try {
                        object = (File)this.f.getItem(n3);
                        if (object != null) break block6;
                        return;
                    }
                    catch (Exception exception) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Failed get Item: ");
                        ((StringBuilder)object2).append(n3);
                        e1.s(((StringBuilder)object2).toString(), exception);
                    }
                }
                if (PathSelector.c((File)object)) {
                    this.c(((File)object).getName());
                    this.i();
                    this.d(0);
                } else if (this.h != 0) {
                    this.i.setText((CharSequence)((File)object).getAbsolutePath());
                    Tools.D((DialogInterface)this.g);
                }
                return;
            }
        }
    }

    static class d {
        final File a;
        final String b;
        final boolean c;

        d(File file, String string2, boolean bl) {
            this.a = file;
            this.b = string2;
            this.c = bl;
        }
    }

    static class e {
        public TextView a;
        public TextView b;
        public TextView c;
        public ImageView d;

        e() {
        }
    }
}

