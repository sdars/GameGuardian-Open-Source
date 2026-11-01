package android.ext;

import android.app.AlertDialog;
import android.app.AlertDialog$Builder;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.fix.ListView;
import android.fix.TextView;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListAdapter;
import catch_.me_.if_.you_.can_.R$color;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$layout;
import catch_.me_.if_.you_.can_.R$string;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class PathSelector$c implements View$OnClickListener, AdapterView$OnItemClickListener, DialogInterface$OnClickListener {

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
    final /* synthetic */ PathSelector n;

    private PathSelector$c(PathSelector pathSelector) {
        this.n = pathSelector;
        this.k = Tools.e0(R$color.file_lua, -16755456);
        this.l = Tools.e0(R$color.file_txt, -16777131);
        this.m = Tools.e0(R$color.file_lasm, -16755371);
    }

    /* synthetic */ PathSelector$c(PathSelector pathSelector, PathSelector$a pathSelector$a) {
        this(pathSelector);
    }

    private void a(String str) {
        EditText editText = new EditText(Tools.f0());
        this.j = editText;
        editText.setText(str);
        f.o(f.b().setCustomTitle(Tools.i0(b2.f(R$string.folder_new), this.f329e.getAbsolutePath() + "/...")).setView(InternalKeyboard.e(editText, false)).setNegativeButton(b2.f(R$string.cancel), (DialogInterface$OnClickListener) null).setPositiveButton(b2.f(R$string.ok), this));
    }

    private void c(String str) {
        this.f329e = new File(this.f329e, str);
    }

    private void d(int i) {
        this.f327c.setSelection(i);
        this.f327c.post(new PathSelector$c$a(this, i));
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
        this.f325a.setImageDrawable(Tools.o0(z ? R$drawable.ic_sort_name_white_24dp : R$drawable.ic_sort_date_white_24dp));
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
            strArrD = d.b.f1511a;
        }
        ArrayList arrayListE = PathSelector.e(this.h, this.f329e, strArrD, null, this.f325a.getTag() == null);
        this.f330f.clear();
        this.f330f.setNotifyOnChange(false);
        Iterator it = arrayListE.iterator();
        while (it.hasNext()) {
            this.f330f.add(((PathSelector$d) it.next()).f335a);
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
            view = LayoutInflater.from(this.n.getContext()).inflate(R$layout.path_item, (ViewGroup) null);
            PathSelector$e pathSelector$e = new PathSelector$e();
            pathSelector$e.f338a = (TextView) view.findViewById(R$id.name);
            pathSelector$e.f339b = (TextView) view.findViewById(R$id.date);
            pathSelector$e.f340c = (TextView) view.findViewById(R$id.size);
            pathSelector$e.f341d = Config.m((ImageView) view.findViewById(R$id.icon));
            view.setTag(pathSelector$e);
        }
        try {
            file = (File) this.f330f.getItem(i);
        } catch (IndexOutOfBoundsException e2) {
            e1.s("Failed get item: " + i, e2);
        }
        if (file == null) {
            file = new File(this.f329e, "???");
        }
        PathSelector$e pathSelector$e2 = (PathSelector$e) view.getTag();
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
                    pathSelector$e2.f338a.setText(name);
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
                    ImageView imageView = pathSelector$e2.f341d;
                    if (z) {
                        i3 = R$drawable.ic_folder_outline_white_24dp;
                    } else {
                        i3 = R$drawable.ic_file_white_24dp;
                    }
                    imageView.setImageResource(i3);
                    TextView textView = pathSelector$e2.f340c;
                    if (j >= 0) {
                        strU = Tools.U(this.n.getContext(), j);
                    } else {
                        strU = "";
                    }
                    textView.setText(strU);
                    pathSelector$e2.f339b.setText(j2 > 0 ? DateFormat.format("yyyy-MM-dd kk:mm:ss", j2) : "");
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
        pathSelector$e2.f338a.setText(name);
        j = -1;
        ImageView imageView2 = pathSelector$e2.f341d;
        if (z) {
            i3 = R$drawable.ic_folder_outline_white_24dp;
        } else {
            i3 = R$drawable.ic_file_white_24dp;
        }
        imageView2.setImageResource(i3);
        TextView textView2 = pathSelector$e2.f340c;
        if (j >= 0) {
            strU = Tools.U(this.n.getContext(), j);
        } else {
            strU = "";
        }
        textView2.setText(strU);
        pathSelector$e2.f339b.setText(j2 > 0 ? DateFormat.format("yyyy-MM-dd kk:mm:ss", j2) : "");
        return view;
    }

    @Override // android.content.DialogInterface$OnClickListener
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
                    Tools.H1(PathSelector.c(file) ? R$string.folder_exists : R$string.folder_file);
                } else {
                    if (file.mkdirs()) {
                        y0.b(strTrim, 4);
                        i();
                        return;
                    }
                    Tools.H1(R$string.folder_failed);
                }
            } else {
                Tools.H1(R$string.folder_failed);
            }
            a(strTrim);
        }
    }

    @Override // android.view.View$OnClickListener
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
        Object tag = this.n.getTag();
        if (tag instanceof EditTextPath) {
            EditTextPath editTextPath = (EditTextPath) tag;
            this.i = editTextPath;
            View viewF = a.d.f(R$layout.path_selector, null);
            this.f326b = (TextView) viewF.findViewById(R$id.path);
            Config.m((ImageView) viewF.findViewById(R$id.add)).setOnClickListener(this);
            ImageView imageView = (ImageView) viewF.findViewById(R$id.sort);
            this.f325a = imageView;
            Config.m(imageView).setOnClickListener(this);
            g(PathSelector.f322a);
            Config.m((ImageView) viewF.findViewById(R$id.up)).setOnClickListener(this);
            this.f328d = (TextView) viewF.findViewById(R$id.failed);
            ListView listView = (ListView) viewF.findViewById(R$id.files);
            this.f327c = listView;
            PathSelector$c$b pathSelector$c$b = new PathSelector$c$b(this, this.n.getContext(), new ArrayList());
            this.f330f = pathSelector$c$b;
            listView.setAdapter((ListAdapter) pathSelector$c$b);
            listView.setOnItemClickListener(this);
            this.h = editTextPath.getPathType();
            File file2 = new File(editTextPath.getText().toString());
            this.f329e = file2;
            while (!PathSelector.c(this.f329e)) {
                h();
            }
            i();
            e(file2, this.h == 0);
            AlertDialog$Builder negativeButton = f.b().setView(viewF).setNegativeButton(b2.f(R$string.cancel), (DialogInterface$OnClickListener) null);
            if (this.h != 1) {
                negativeButton.setPositiveButton(b2.f(R$string.ok), this);
            }
            AlertDialog alertDialogCreate = negativeButton.create();
            this.f331g = alertDialogCreate;
            f.m(alertDialogCreate);
        }
    }

    @Override // android.widget.AdapterView$OnItemClickListener
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
}
