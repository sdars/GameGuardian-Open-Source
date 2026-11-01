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
import catch_.me_.if_.you_.can_.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
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
            To view partially-correct add '--show-bad-code' argument
        */
        public int compare(android.ext.PathSelector.d r6, android.ext.PathSelector.d r7) {
            /*
                r5 = this;
                boolean r0 = r6.f337c
                boolean r1 = r7.f337c
                r2 = 1
                r3 = -1
                if (r0 == r1) goto Lc
                if (r0 == 0) goto L2c
            La:
                r2 = -1
                goto L2c
            Lc:
                boolean r0 = r5.f323a     // Catch: java.lang.Throwable -> L19
                if (r0 == 0) goto L1b
                java.lang.String r6 = r6.f336b     // Catch: java.lang.Throwable -> L19
                java.lang.String r7 = r7.f336b     // Catch: java.lang.Throwable -> L19
                int r2 = android.ext.r1.a(r6, r7)     // Catch: java.lang.Throwable -> L19
                goto L2c
            L19:
                r6 = move-exception
                goto L2d
            L1b:
                java.io.File r6 = r6.f335a     // Catch: java.lang.Throwable -> L19
                long r0 = r6.lastModified()     // Catch: java.lang.Throwable -> L19
                java.io.File r6 = r7.f335a     // Catch: java.lang.Throwable -> L19
                long r6 = r6.lastModified()     // Catch: java.lang.Throwable -> L19
                int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r4 <= 0) goto L2c
                goto La
            L2c:
                return r2
            L2d:
                android.ext.e1.a(r6)
                r6 = 0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: android.ext.PathSelector.a.compare(android.ext.PathSelector$d, android.ext.PathSelector$d):int");
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
            this.k = Tools.e0(R.color.file_lua, -16755456);
            this.l = Tools.e0(R.color.file_txt, -16777131);
            this.m = Tools.e0(R.color.file_lasm, -16755371);
        }

        private void a(String str) {
            EditText editText = new EditText(Tools.f0());
            this.j = editText;
            editText.setText(str);
            f.o(ggf.b().setCustomTitle(Tools.i0(b2.f(R.string.folder_new), this.f329e.getAbsolutePath() + "/...")).setView(InternalKeyboard.e(editText, false)).setNegativeButton(b2.f(R.string.cancel), (DialogInterface.OnClickListener) null).setPositiveButton(b2.f(R.string.ok), this));
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
            this.f325a.setImageDrawable(Tools.o0(z ? R.drawable.ic_sort_name_white_24dp : R.drawable.ic_sort_date_white_24dp));
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
                strArrD = ggd.b.f1511a;
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
                view = LayoutInflater.from(PathSelector.this.getContext()).inflate(R.layout.path_item, (ViewGroup) null);
                e eVar = new e();
                eVar.f338a = (TextView) view.findViewById(R.id.name);
                eVar.f339b = (TextView) view.findViewById(R.id.date);
                eVar.f340c = (TextView) view.findViewById(R.id.size);
                eVar.f341d = Config.m((ImageView) view.findViewById(R.id.icon));
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
                            i3 = R.drawable.ic_folder_outline_white_24dp;
                        } else {
                            i3 = R.drawable.ic_file_white_24dp;
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
                i3 = R.drawable.ic_folder_outline_white_24dp;
            } else {
                i3 = R.drawable.ic_file_white_24dp;
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
                        Tools.H1(PathSelector.c(file) ? R.string.folder_exists : R.string.folder_file);
                    } else {
                        if (file.mkdirs()) {
                            y0.b(strTrim, 4);
                            i();
                            return;
                        }
                        Tools.H1(R.string.folder_failed);
                    }
                } else {
                    Tools.H1(R.string.folder_failed);
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
            if (id == R.id.add) {
                a("");
                return;
            }
            if (id == R.id.sort) {
                boolean z = this.f325a.getTag() != null;
                PathSelector.f322a = z;
                g(z);
                i();
                d(0);
                return;
            }
            if (id == R.id.up) {
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
                View viewF = gga.d.f(R.layout.path_selector, null);
                this.f326b = (TextView) viewF.findViewById(R.id.path);
                Config.m((ImageView) viewF.findViewById(R.id.add)).setOnClickListener(this);
                ImageView imageView = (ImageView) viewF.findViewById(R.id.sort);
                this.f325a = imageView;
                Config.m(imageView).setOnClickListener(this);
                g(PathSelector.f322a);
                Config.m((ImageView) viewF.findViewById(R.id.up)).setOnClickListener(this);
                this.f328d = (TextView) viewF.findViewById(R.id.failed);
                ListView listView = (ListView) viewF.findViewById(R.id.files);
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
                AlertDialog.Builder negativeButton = ggf.b().setView(viewF).setNegativeButton(b2.f(R.string.cancel), (DialogInterface.OnClickListener) null);
                if (this.h != 1) {
                    negativeButton.setPositiveButton(b2.f(R.string.ok), this);
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
