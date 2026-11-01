package android.ext;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
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
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class PathSelector extends Button implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean f322a = true;

    class a implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f323a;

        a(boolean z) {
            this.f323a = z;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
        
            if (r0 != false) goto L5;
         */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int compare(d dVar, d dVar2) {
            boolean z = dVar.f337c;
            int iA = 1;
            if (z == dVar2.f337c) {
                try {
                    if (this.f323a) {
                        iA = r1.a(dVar.f336b, dVar2.f336b);
                    } else if (dVar.f335a.lastModified() > dVar2.f335a.lastModified()) {
                    }
                    return iA;
                } catch (Throwable th) {
                    e1.a(th);
                    return 0;
                }
            }
            iA = -1;
            return iA;
        }
    }

    class b implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ StringBuilder f324a;

        b(StringBuilder sb) {
            this.f324a = sb;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            int iA;
            boolean z = dVar.f337c;
            boolean z2 = dVar2.f337c;
            if (z != z2) {
                iA = z ? -1 : 1;
            } else {
                iA = r1.a(dVar.f336b, dVar2.f336b);
            }
            this.f324a.append(z ? 'D' : 'F');
            this.f324a.append(':');
            this.f324a.append(dVar);
            this.f324a.append(':');
            this.f324a.append(dVar.f336b);
            this.f324a.append('\n');
            this.f324a.append(z2 ? 'D' : 'F');
            this.f324a.append(':');
            this.f324a.append(dVar2);
            this.f324a.append(':');
            this.f324a.append(dVar2.f336b);
            this.f324a.append('\n');
            this.f324a.append(iA);
            this.f324a.append('\n');
            return iA;
        }
    }

    private class c implements View.OnClickListener, AdapterView.OnItemClickListener, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ImageView f325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private TextView f326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ListView f327c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private TextView f328d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private File f329e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ArrayAdapter f330f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private AlertDialog f331g;
        private int h;
        private android.widget.EditText i;
        private android.widget.EditText j;
        private int k;
        private int l;
        private int m;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f332a;

            a(int i) {
                this.f332a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f327c.setSelection(this.f332a);
            }
        }

        class b extends ArrayAdapter {
            b(Context context, List list) {
                super(context, list);
            }

            @Override // android.ext.ArrayAdapter, android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                return c.this.b(i, view, viewGroup);
            }
        }

        private c() {
            this.k = Tools.e0(2130837512, -16755456);
            this.l = Tools.e0(2130837513, -16777131);
            this.m = Tools.e0(2130837511, -16755371);
        }

        private void a(String str) {
            EditText editText = new EditText(Tools.f0());
            this.j = editText;
            editText.setText(str);
            f.o(f.b().setCustomTitle(Tools.i0(b2.f(2131296463), this.f329e.getAbsolutePath() + "/...")).setView(InternalKeyboard.e(editText, false)).setNegativeButton(b2.f(2131296311), (DialogInterface.OnClickListener) null).setPositiveButton(b2.f(2131296836), this));
        }

        private void c(String str) {
            this.f329e = new File(this.f329e, str);
        }

        private void d(int i) {
            this.f327c.setSelection(i);
            this.f327c.post(new a(i));
        }

        private void e(File file, boolean z) {
            ArrayAdapter arrayAdapter = this.f330f;
            int count = arrayAdapter.getCount();
            String lowerCase = file.getAbsolutePath().toLowerCase(Locale.US);
            int i = 0;
            int i2 = 0;
            while (i < count) {
                File file2 = (File) arrayAdapter.getItem(i);
                if (file.equals(file2)) {
                    d(i);
                }
                if (z == PathSelector.c(file2) && lowerCase.compareTo(file2.getAbsolutePath().toLowerCase(Locale.US)) > 0) {
                    i2 = i;
                }
                i++;
            }
            i = i2;
            d(i);
        }

        private void f(boolean z) {
            this.f328d.setVisibility(z ? 0 : 8);
            this.f327c.setVisibility(z ? 8 : 0);
        }

        private void g(boolean z) {
            ImageView imageView = this.f325a;
            imageView.setTag(z ? null : imageView);
            this.f325a.setImageDrawable(Tools.o0(z ? 2130968652 : 2130968651));
        }

        private void h() {
            File parentFile = this.f329e.getParentFile();
            this.f329e = parentFile;
            if (parentFile == null) {
                this.f329e = new File("/");
            }
        }

        private void i() {
            this.f326b.setText(this.f329e.getAbsolutePath());
            String[] strArrD = PathSelector.d(this.f329e);
            f(strArrD == null);
            if (strArrD == null) {
                strArrD = d.b.f1509a;
            }
            ArrayList arrayListE = PathSelector.e(this.h, this.f329e, strArrD, null, this.f325a.getTag() == null);
            this.f330f.clear();
            this.f330f.setNotifyOnChange(false);
            Iterator it = arrayListE.iterator();
            while (it.hasNext()) {
                this.f330f.add(((d) it.next()).f335a);
            }
            this.f330f.notifyDataSetChanged();
            this.f330f.setNotifyOnChange(true);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:26:0x00b7 A[Catch: all -> 0x00c3, TryCatch #0 {all -> 0x00c3, blocks: (B:23:0x00af, B:27:0x00bb, B:26:0x00b7), top: B:44:0x00af }] */
        /* JADX WARN: Code duplicated, block: B:33:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:34:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:37:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:38:0x0101  */
        /* JADX WARN: Code duplicated, block: B:41:0x010b  */
        public View b(int i, View view, ViewGroup viewGroup) {
            int i2;
            long j;
            long j2;
            boolean z;
            int i3;
            String strU;
            boolean zC;
            long length;
            File file = null;
            if (view == null) {
                view = LayoutInflater.from(PathSelector.this.getContext()).inflate(2131099664, (ViewGroup) null);
                e eVar = new e();
                eVar.f338a = (TextView) view.findViewById(2131034337);
                eVar.f339b = (TextView) view.findViewById(2131034222);
                eVar.f340c = (TextView) view.findViewById(2131034405);
                eVar.f341d = Config.m((ImageView) view.findViewById(2131034289));
                view.setTag(eVar);
            }
            try {
                file = (File) this.f330f.getItem(i);
            } catch (IndexOutOfBoundsException e2) {
                e1.s("Failed get item: " + i, e2);
            }
            if (file == null) {
                file = new File(this.f329e, "???");
            }
            e eVar2 = (e) view.getTag();
            String name = file.getName();
            try {
                if (name.endsWith(".lua")) {
                    i2 = this.k;
                } else {
                    if (!name.endsWith(".txt")) {
                        if (name.endsWith(".lasm")) {
                            i2 = this.m;
                        } else {
                            view.setBackgroundColor(0);
                        }
                        eVar2.f338a.setText(name);
                        j = -1;
                        zC = PathSelector.c(file);
                        if (zC) {
                            length = -1;
                        } else {
                            length = file.length();
                        }
                        long jLastModified = file.lastModified();
                        z = zC;
                        j2 = jLastModified;
                        j = length;
                        ImageView imageView = eVar2.f341d;
                        if (z) {
                            i3 = 2130968614;
                        } else {
                            i3 = 2130968611;
                        }
                        imageView.setImageResource(i3);
                        TextView textView = eVar2.f340c;
                        if (j >= 0) {
                            strU = Tools.U(PathSelector.this.getContext(), j);
                        } else {
                            strU = "";
                        }
                        textView.setText(strU);
                        eVar2.f339b.setText(j2 > 0 ? DateFormat.format("yyyy-MM-dd kk:mm:ss", j2) : "");
                        return view;
                    }
                    i2 = this.l;
                }
                zC = PathSelector.c(file);
                if (zC) {
                    length = -1;
                } else {
                    length = file.length();
                }
                long jLastModified2 = file.lastModified();
                z = zC;
                j2 = jLastModified2;
                j = length;
            } catch (Throwable th) {
                e1.s("Failed get info: " + file.getAbsolutePath(), th);
                j2 = -1L;
                z = false;
            }
            view.setBackgroundColor(i2);
            eVar2.f338a.setText(name);
            j = -1;
            ImageView imageView2 = eVar2.f341d;
            if (z) {
                i3 = 2130968614;
            } else {
                i3 = 2130968611;
            }
            imageView2.setImageResource(i3);
            TextView textView2 = eVar2.f340c;
            if (j >= 0) {
                strU = Tools.U(PathSelector.this.getContext(), j);
            } else {
                strU = "";
            }
            textView2.setText(strU);
            eVar2.f339b.setText(j2 > 0 ? DateFormat.format("yyyy-MM-dd kk:mm:ss", j2) : "");
            return view;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface == this.f331g) {
                String absolutePath = this.f329e.getAbsolutePath();
                if (this.h == 2) {
                    String name = new File(this.i.getText().toString()).getName();
                    if (name == null || name.length() == 0) {
                        name = "file.txt";
                    }
                    absolutePath = absolutePath + "/" + name;
                }
                this.i.setText(absolutePath);
                return;
            }
            android.widget.EditText editText = this.j;
            if (editText != null) {
                String strTrim = editText.getText().toString().trim();
                if (strTrim.length() > 0) {
                    File file = new File(this.f329e, strTrim);
                    if (file.exists()) {
                        Tools.H1(PathSelector.c(file) ? 2131296460 : 2131296462);
                    } else {
                        if (file.mkdirs()) {
                            y0.b(strTrim, 4);
                            i();
                            return;
                        }
                        Tools.H1(2131296461);
                    }
                } else {
                    Tools.H1(2131296461);
                }
                a(strTrim);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            if (i < 0 || i >= this.f330f.getCount()) {
                return;
            }
            try {
                File file = (File) this.f330f.getItem(i);
                if (file == null) {
                    return;
                }
                if (PathSelector.c(file)) {
                    c(file.getName());
                    i();
                    d(0);
                } else if (this.h != 0) {
                    this.i.setText(file.getAbsolutePath());
                    Tools.D(this.f331g);
                }
            } catch (Exception e2) {
                e1.s("Failed get Item: " + i, e2);
            }
        }

        /* synthetic */ c(PathSelector pathSelector, a aVar) {
            this();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == 2131034114) {
                a("");
                return;
            }
            if (id == 2131034409) {
                boolean z = this.f325a.getTag() != null;
                PathSelector.f322a = z;
                g(z);
                i();
                d(0);
                return;
            }
            if (id == 2131034436) {
                File file = this.f329e;
                h();
                i();
                e(file, true);
                return;
            }
            Object tag = PathSelector.this.getTag();
            if (tag instanceof EditTextPath) {
                EditTextPath editTextPath = (EditTextPath) tag;
                this.i = editTextPath;
                View viewF = a.d.f(2131099665, null);
                this.f326b = (TextView) viewF.findViewById(2131034353);
                Config.m((ImageView) viewF.findViewById(2131034114)).setOnClickListener(this);
                ImageView imageView = (ImageView) viewF.findViewById(2131034409);
                this.f325a = imageView;
                Config.m(imageView).setOnClickListener(this);
                g(PathSelector.f322a);
                Config.m((ImageView) viewF.findViewById(2131034436)).setOnClickListener(this);
                this.f328d = (TextView) viewF.findViewById(2131034250);
                ListView listView = (ListView) viewF.findViewById(2131034253);
                this.f327c = listView;
                b bVar = new b(PathSelector.this.getContext(), new ArrayList());
                this.f330f = bVar;
                listView.setAdapter((ListAdapter) bVar);
                listView.setOnItemClickListener(this);
                this.h = editTextPath.getPathType();
                File file2 = new File(editTextPath.getText().toString());
                this.f329e = file2;
                while (!PathSelector.c(this.f329e)) {
                    h();
                }
                i();
                e(file2, this.h == 0);
                AlertDialog.Builder negativeButton = f.b().setView(viewF).setNegativeButton(b2.f(2131296311), (DialogInterface.OnClickListener) null);
                if (this.h != 1) {
                    negativeButton.setPositiveButton(b2.f(2131296836), this);
                }
                AlertDialog alertDialogCreate = negativeButton.create();
                this.f331g = alertDialogCreate;
                f.m(alertDialogCreate);
            }
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final File f335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f337c;

        d(File file, String str, boolean z) {
            this.f335a = file;
            this.f336b = str;
            this.f337c = z;
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f341d;

        e() {
        }
    }

    public PathSelector(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0034 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:12:0x0012, B:14:0x0018, B:19:0x0034, B:21:0x003a, B:22:0x0051, B:23:0x0057, B:26:0x0062, B:28:0x0068, B:33:0x0088, B:35:0x008e, B:30:0x006e, B:32:0x0085), top: B:44:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x003a A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:12:0x0012, B:14:0x0018, B:19:0x0034, B:21:0x003a, B:22:0x0051, B:23:0x0057, B:26:0x0062, B:28:0x0068, B:33:0x0088, B:35:0x008e, B:30:0x006e, B:32:0x0085), top: B:44:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0051 A[Catch: all -> 0x002e, PHI: r4
      0x0051: PHI (r4v6 java.lang.String) = (r4v5 java.lang.String), (r4v8 java.lang.String) binds: [B:18:0x0032, B:21:0x003a] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x002e, blocks: (B:12:0x0012, B:14:0x0018, B:19:0x0034, B:21:0x003a, B:22:0x0051, B:23:0x0057, B:26:0x0062, B:28:0x0068, B:33:0x0088, B:35:0x008e, B:30:0x006e, B:32:0x0085), top: B:44:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:12:0x0012, B:14:0x0018, B:19:0x0034, B:21:0x003a, B:22:0x0051, B:23:0x0057, B:26:0x0062, B:28:0x0068, B:33:0x0088, B:35:0x008e, B:30:0x006e, B:32:0x0085), top: B:44:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0068 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:12:0x0012, B:14:0x0018, B:19:0x0034, B:21:0x003a, B:22:0x0051, B:23:0x0057, B:26:0x0062, B:28:0x0068, B:33:0x0088, B:35:0x008e, B:30:0x006e, B:32:0x0085), top: B:44:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x006e A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:12:0x0012, B:14:0x0018, B:19:0x0034, B:21:0x003a, B:22:0x0051, B:23:0x0057, B:26:0x0062, B:28:0x0068, B:33:0x0088, B:35:0x008e, B:30:0x006e, B:32:0x0085), top: B:44:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0085 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:12:0x0012, B:14:0x0018, B:19:0x0034, B:21:0x003a, B:22:0x0051, B:23:0x0057, B:26:0x0062, B:28:0x0068, B:33:0x0088, B:35:0x008e, B:30:0x006e, B:32:0x0085), top: B:44:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #0 {all -> 0x002e, blocks: (B:12:0x0012, B:14:0x0018, B:19:0x0034, B:21:0x003a, B:22:0x0051, B:23:0x0057, B:26:0x0062, B:28:0x0068, B:33:0x0088, B:35:0x008e, B:30:0x006e, B:32:0x0085), top: B:44:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1 A[ADDED_TO_REGION, EDGE_INSN: B:50:0x00a1->B:41:0x00a1 BREAK  A[LOOP:1: B:23:0x0057->B:40:0x009f], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:21:0x003a, please report this as an issue */
    private static void a(String str, ArrayList arrayList, String str2, String str3) {
        File file;
        int i;
        String absolutePath;
        String str4;
        int i2;
        if (str3 == null) {
            return;
        }
        int i3 = str2 == null ? 1 : 3;
        String str5 = str3;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 == 1) {
                try {
                    if (str3.startsWith("/data/data/")) {
                        str5 = str2 + str3.substring(11);
                        if (i4 != 2) {
                            file = new File(str5);
                            i = 0;
                            while (true) {
                                absolutePath = file.getAbsolutePath();
                                if (absolutePath.startsWith(str)) {
                                    break;
                                }
                                if (file.isDirectory() || file.isFile()) {
                                    str4 = absolutePath.substring(str.length()).split("/", -1)[0];
                                    if (!arrayList.contains(str4)) {
                                        arrayList.add(str4);
                                    }
                                }
                                file = file.getParentFile();
                                if (file == null || file.getAbsolutePath().length() <= 1) {
                                    break;
                                }
                                i2 = i + 1;
                                if (i >= 20) {
                                    break;
                                } else {
                                    i = i2;
                                }
                            }
                        } else if (str3.startsWith(str2)) {
                            str5 = "/data/data/" + str3.substring(str2.length());
                            file = new File(str5);
                            i = 0;
                            while (true) {
                                absolutePath = file.getAbsolutePath();
                                if (absolutePath.startsWith(str)) {
                                    break;
                                    break;
                                }
                                if (file.isDirectory()) {
                                    str4 = absolutePath.substring(str.length()).split("/", -1)[0];
                                    if (!arrayList.contains(str4)) {
                                        arrayList.add(str4);
                                    }
                                } else {
                                    str4 = absolutePath.substring(str.length()).split("/", -1)[0];
                                    if (!arrayList.contains(str4)) {
                                        arrayList.add(str4);
                                    }
                                }
                                file = file.getParentFile();
                                if (file == null) {
                                    break;
                                }
                                break;
                                break;
                                i = i2;
                            }
                        }
                    }
                } catch (Throwable th) {
                    e1.a(th);
                    return;
                }
            } else if (i4 != 2) {
                file = new File(str5);
                i = 0;
                while (true) {
                    absolutePath = file.getAbsolutePath();
                    if (absolutePath.startsWith(str)) {
                        break;
                        break;
                    }
                    if (file.isDirectory()) {
                        str4 = absolutePath.substring(str.length()).split("/", -1)[0];
                        if (!arrayList.contains(str4)) {
                            arrayList.add(str4);
                        }
                    } else {
                        str4 = absolutePath.substring(str.length()).split("/", -1)[0];
                        if (!arrayList.contains(str4)) {
                            arrayList.add(str4);
                        }
                    }
                    file = file.getParentFile();
                    if (file == null) {
                        break;
                        break;
                    } else {
                        break;
                        break;
                    }
                    i = i2;
                }
            } else if (str3.startsWith(str2)) {
                str5 = "/data/data/" + str3.substring(str2.length());
                file = new File(str5);
                i = 0;
                while (true) {
                    absolutePath = file.getAbsolutePath();
                    if (absolutePath.startsWith(str)) {
                        break;
                        break;
                    }
                    if (file.isDirectory()) {
                        str4 = absolutePath.substring(str.length()).split("/", -1)[0];
                        if (!arrayList.contains(str4)) {
                            arrayList.add(str4);
                        }
                    } else {
                        str4 = absolutePath.substring(str.length()).split("/", -1)[0];
                        if (!arrayList.contains(str4)) {
                            arrayList.add(str4);
                        }
                    }
                    file = file.getParentFile();
                    if (file == null) {
                        break;
                        break;
                    } else {
                        break;
                        break;
                    }
                    i = i2;
                }
            }
        }
    }

    private void b() {
        setText("...");
        setOnClickListener(this);
    }

    static boolean c(File file) {
        try {
            return file.isDirectory();
        } catch (Throwable unused) {
            return false;
        }
    }

    static String[] d(File file) {
        String[] list;
        try {
            list = file.list();
        } catch (SecurityException e2) {
            e1.s("Failed list dir: " + file.getAbsolutePath(), e2);
            list = null;
        }
        if (list != null) {
            return list;
        }
        try {
            String absolutePath = file.getAbsolutePath();
            String str = absolutePath.startsWith("/data/user/") ? "/data/user/" + absolutePath.split("/", -1)[3] + "/" : "/data/user/0/";
            String str2 = absolutePath + '/';
            ArrayList arrayList = new ArrayList();
            a(str2, arrayList, str, "/data/anr");
            a(str2, arrayList, str, "/data/app");
            a(str2, arrayList, str, "/data/app-lib");
            a(str2, arrayList, str, "/data/app-private");
            a(str2, arrayList, str, "/data/dalvik-cache/profiles");
            a(str2, arrayList, str, "/data/dalvik-cache/x86");
            a(str2, arrayList, str, "/data/dalvik-cache/armeabi");
            a(str2, arrayList, str, "/data/dalvik-cache/armeabi-v7a");
            a(str2, arrayList, str, "/data/dalvik-cache/arm");
            a(str2, arrayList, str, "/data/dalvik-cache/arm64-v8a");
            a(str2, arrayList, str, "/data/dalvik-cache/arm64");
            a(str2, arrayList, str, "/data/dalvik-cache/x86");
            a(str2, arrayList, str, "/data/dalvik-cache/x86_64");
            a(str2, arrayList, str, "/data/local/tmp");
            a(str2, arrayList, str, "/data/misc/user");
            a(str2, arrayList, str, "/data/misc/zoneinfo");
            a(str2, arrayList, str, "/data/resource-cache");
            a(str2, arrayList, str, "/data/security");
            a(str2, arrayList, str, "/data/system/cache");
            a(str2, arrayList, str, "/data/system/registered_services");
            a(str2, arrayList, str, "/data/system/shared_prefs");
            a(str2, arrayList, str, "/data/system/users");
            a(str2, arrayList, str, "/data/tmp");
            a(str2, arrayList, str, str);
            a(str2, arrayList, str, "/storage/emulated/legacy");
            a(str2, arrayList, str, "/storage/emulated/0");
            a(str2, arrayList, str, "/storage/emulated/sdcard0");
            a(str2, arrayList, str, "/storage/emulated/sdcard1");
            a(str2, arrayList, str, "/storage/sdcard0");
            a(str2, arrayList, str, "/storage/sdcard1");
            a(str2, arrayList, str, "/sdcard");
            a(str2, arrayList, str, Tools.K0());
            for (ApplicationInfo applicationInfo : Tools.B0().getInstalledApplications(0)) {
                a(str2, arrayList, str, applicationInfo.dataDir);
                a(str2, arrayList, str, applicationInfo.nativeLibraryDir);
                a(str2, arrayList, str, applicationInfo.publicSourceDir);
                a(str2, arrayList, str, applicationInfo.sourceDir);
                String[] strArr = applicationInfo.splitPublicSourceDirs;
                if (strArr != null) {
                    for (String str3 : strArr) {
                        a(str2, arrayList, str, str3);
                    }
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    a(str2, arrayList, str, applicationInfo.deviceProtectedDataDir);
                }
                a(str2, arrayList, str, "/data/data/" + applicationInfo.packageName);
                a(str2, arrayList, str, "/data/app/" + applicationInfo.packageName + "-1/base.apk");
                a(str2, arrayList, str, "/data/app/" + applicationInfo.packageName + "-2/base.apk");
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        } catch (Throwable th) {
            e1.a(th);
            return null;
        }
    }

    static ArrayList e(int i, File file, String[] strArr, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            String lowerCase = str2.toLowerCase(Locale.US);
            if (str == null || lowerCase.startsWith(str)) {
                File file2 = new File(file, str2);
                boolean zC = c(file2);
                if (i != 0 || zC) {
                    arrayList.add(new d(file2, lowerCase, zC));
                }
            }
        }
        if (arrayList.size() > 1) {
            a aVar = new a(z);
            try {
                long j = -System.currentTimeMillis();
                Collections.sort(arrayList, aVar);
                e1.d("Sort " + arrayList.size() + " in " + (j + System.currentTimeMillis()));
            } catch (IllegalArgumentException e2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed sort:\n");
                try {
                    Collections.sort(arrayList, new b(sb));
                } catch (IllegalArgumentException unused) {
                    n0.i(sb.toString());
                }
                e1.a(e2);
            }
        }
        return arrayList;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        new c(this, null).onClick(view);
    }
}
