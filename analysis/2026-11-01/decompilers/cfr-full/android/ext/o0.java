/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.d;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.ext.Config;
import android.ext.ConfigListAdapter;
import android.ext.EditTextPath;
import android.ext.InternalKeyboard;
import android.ext.MainService;
import android.ext.Script;
import android.ext.Tools;
import android.ext.b2;
import android.ext.c2;
import android.ext.f;
import android.ext.p1;
import android.ext.r;
import android.ext.v1;
import android.ext.y0;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.io.Writer;

public class o0
extends p1 {
    static boolean f = false;
    static boolean g = true;
    static boolean h = true;
    static boolean i = true;

    public o0() {
        super(2131296423, 2130968638);
    }

    @Override
    public void onClick(View view) {
        new b(this).onClick(view);
    }

    private class b
    implements DialogInterface.OnClickListener,
    DialogInterface.OnShowListener,
    DialogInterface.OnDismissListener,
    View.OnClickListener,
    View.OnLongClickListener {
        private AlertDialog a;
        private EditText b;
        private EditText c;
        private CheckBox d;
        private CheckBox e;
        private CheckBox f;
        private Button g;
        private View h;
        final o0 i;

        private b(o0 o02) {
            this.i = o02;
        }

        private void a() {
            boolean bl = f;
            Button button = this.g;
            int n3 = bl ? 2131296738 : 2131296786;
            button.setText((CharSequence)b2.f(n3));
            button = this.h;
            n3 = bl ? 0 : 8;
            button.setVisibility(n3);
        }

        public void onClick(DialogInterface object, int n3) {
            int n4;
            g = this.d.isChecked();
            h = this.e.isChecked();
            i = this.f.isChecked();
            Object object2 = this.c.getText().toString().trim();
            if (f) {
                if (!Tools.f1((String)object2)) {
                    return;
                }
                int n5 = n4 = g;
                if (h) {
                    n5 = n4 | 2;
                }
                n4 = n5;
                if (i) {
                    n4 = n5 | 4;
                }
            } else {
                n4 = 0;
            }
            y0.b((String)object2, 4);
            object = this.b;
            if (object == null) {
                return;
            }
            if (Tools.f1((String)(object = object.getText().toString().trim())) && Tools.a1(object)) {
                y0.b((String)object, 4);
                if (MainService.instance.b != null) {
                    android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(2131296417)).setMessage((CharSequence)b2.f(2131296276)).setPositiveButton((CharSequence)b2.f(2131296711), new DialogInterface.OnClickListener(this, n3){
                        final int a;
                        final b b;
                        {
                            this.b = b4;
                            this.a = n3;
                        }

                        public void onClick(DialogInterface dialogInterface, int n3) {
                            MainService.instance.P();
                            this.b.onClick(null, this.a);
                        }
                    }).setNegativeButton((CharSequence)b2.f(2131296805), null));
                    return;
                }
                MainService.instance.x((String)object, n4, (String)object2);
                Tools.D((DialogInterface)this.a);
                object2 = MainService.instance.f;
                if (object2 != null) {
                    ((c2)object2).write("loadfile(");
                    Script.Consts.d((Writer)object2, (String)object);
                    ((c2)object2).write(")()\n");
                }
            }
        }

        public void onClick(View object) {
            if (object != null && !(object.getTag() instanceof p1)) {
                int n3 = object.getId();
                if (n3 != 2131034246) {
                    if (n3 != 2131034248) {
                        if (n3 != 2131034278) {
                            this.onClick(null, -1);
                        } else {
                            StringBuilder stringBuilder;
                            Comparable<File> comparable = new File(Tools.K0(), "help.zip");
                            try {
                                Tools.M("he", (File)comparable);
                                object = null;
                            }
                            catch (RuntimeException runtimeException) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("");
                                stringBuilder.append(runtimeException.getMessage());
                                object = stringBuilder.toString();
                            }
                            stringBuilder = android.ext.f.b().setCustomTitle(Tools.g0(2131296532));
                            if (object == null) {
                                object = Tools.L1(b2.f(2131296533), ((File)comparable).getAbsolutePath());
                            } else {
                                comparable = new StringBuilder();
                                ((StringBuilder)comparable).append(Tools.N1(2131296534));
                                ((StringBuilder)comparable).append(": ");
                                ((StringBuilder)comparable).append((String)object);
                                object = ((StringBuilder)comparable).toString();
                            }
                            android.ext.f.o(stringBuilder.setMessage((CharSequence)object).setNegativeButton((CharSequence)b2.f(2131296836), null));
                        }
                    } else {
                        f ^= true;
                        this.a();
                    }
                } else {
                    new Script("print('gg =', gg)", 0, "").R3();
                }
            } else {
                if (!MainService.instance.i.d0()) {
                    return;
                }
                View view = a.d.f(2131099651, null);
                ((TextView)view.findViewById(2131034328)).setText((CharSequence)b2.f(2131296423));
                object = (EditTextPath)view.findViewById(2131034251);
                this.b = object;
                object.setText((CharSequence)v1.a("script-path", "-script", ".lua"));
                ((EditTextPath)object).setDataType(4);
                ((EditTextPath)object).setPathType(1);
                view.findViewById(2131034252).setTag(object);
                Config.m((ImageView)view.findViewById(2131034246)).setOnClickListener((View.OnClickListener)this);
                view.findViewById(2131034229).setOnClickListener((View.OnClickListener)new r.n("kwws=22jdphjxdugldq1qhw2iruxp2ilohv2fdwhjru|290oxd0vfulswv2"));
                view.findViewById(2131034277).setOnClickListener((View.OnClickListener)new r.n("kwws=22jdphjxdugldq1qhw2khos2"));
                view.findViewById(2131034278).setOnClickListener((View.OnClickListener)this);
                this.h = view.findViewById(2131034223);
                EditTextPath editTextPath = (EditTextPath)view.findViewById(2131034353);
                this.c = editTextPath;
                editTextPath.setText(v1.b(null, "script-debug"));
                editTextPath.setDataType(4);
                editTextPath.setPathType(0);
                view.findViewById(2131034354).setTag((Object)editTextPath);
                editTextPath = (CheckBox)view.findViewById(2131034226);
                this.d = editTextPath;
                editTextPath.setChecked(g);
                Tools.r1((View)editTextPath);
                editTextPath.setOnLongClickListener(this);
                editTextPath = (CheckBox)view.findViewById(2131034308);
                this.e = editTextPath;
                editTextPath.setChecked(h);
                editTextPath = (CheckBox)view.findViewById(2131034311);
                this.f = editTextPath;
                editTextPath.setChecked(i);
                editTextPath = (Button)view.findViewById(2131034248);
                this.g = editTextPath;
                editTextPath.setOnClickListener(this);
                this.a();
                view = android.ext.f.b().setView(InternalKeyboard.e(view, false)).setPositiveButton((CharSequence)b2.f(2131296422), (DialogInterface.OnClickListener)this).setNegativeButton((CharSequence)b2.f(2131296311), null).create();
                android.ext.f.l((AlertDialog)view, this);
                android.ext.f.k((AlertDialog)view, this);
                this.a = view;
                android.ext.f.n((AlertDialog)view, (EditText)object);
            }
        }

        public void onDismiss(DialogInterface dialogInterface) {
            dialogInterface = this.b;
            if (dialogInterface != null) {
                v1.c(dialogInterface.getText().toString(), "script-path", "-script", ".lua");
            }
            if ((dialogInterface = this.c) != null) {
                v1.b(dialogInterface.getText().toString().trim(), "script-debug");
            }
        }

        public boolean onLongClick(View view) {
            if (view == null) {
                return false;
            }
            if (view.getId() != 2131034226) {
                return false;
            }
            ConfigListAdapter.t(2131296638);
            return true;
        }

        public void onShow(DialogInterface dialogInterface) {
            Tools.s1(dialogInterface, -1, null, this);
        }
    }
}

