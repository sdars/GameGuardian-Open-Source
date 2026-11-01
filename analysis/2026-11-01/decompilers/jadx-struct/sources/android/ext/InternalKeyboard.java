package android.ext;

import android.content.Context;
import android.content.res.Resources;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.Keyboard$Key;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.Window;
import android.view.Window$Callback;
import android.view.WindowManager$LayoutParams;
import android.widget.ScrollView;
import catch_.me_.if_.you_.can_.R$dimen;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$layout;
import catch_.me_.if_.you_.can_.R$xml;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class InternalKeyboard extends a.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WeakReference f189g;
    private boolean h;
    private int i;

    public InternalKeyboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f186d = true;
        this.f187e = false;
        this.f188f = 0;
        this.f189g = new WeakReference(null);
        this.h = false;
        this.i = -1;
        f(context);
    }

    public static boolean a() {
        try {
            return a.d.f(R$layout.keyboard, null) != null;
        } catch (Throwable th) {
            e1.l("Check internal keyboard fail", th);
            return false;
        }
    }

    private void b(Window window, boolean z) {
        int iH;
        WindowManager$LayoutParams attributes = window.getAttributes();
        View decorView = window.getDecorView();
        int width = decorView.getWidth();
        try {
            decorView.measure(-2, -2);
            width = Math.max(width, decorView.getMeasuredWidth());
        } catch (Throwable th) {
            e1.a(th);
        }
        if (z) {
            int width2 = getWidth();
            try {
                measure(-2, -2);
                iH = Math.max(width2, getMeasuredWidth());
            } catch (Throwable th2) {
                e1.a(th2);
            }
        } else {
            iH = Tools.H();
        }
        width += iH;
        attributes.width = width;
        if (width >= MainService.context.getResources().getDisplayMetrics().widthPixels) {
            attributes.width = -1;
        }
        window.setAttributes(attributes);
    }

    private int c(boolean z, boolean z2, boolean z3, boolean z4) {
        if (!z) {
            return R$id.k_ext;
        }
        if (z2) {
            return R$id.k_hex;
        }
        if (z3) {
            return R$id.k_fn;
        }
        return z4 ? R$id.k_small : R$id.k_num;
    }

    public static View d(View view) {
        return e(view, true);
    }

    public static View e(View view, boolean z) {
        if (!a()) {
            return view;
        }
        KeyboardLayout keyboardLayout = (KeyboardLayout) a.d.f(R$layout.keyboard, null);
        ViewGroup viewGroup = (ViewGroup) keyboardLayout.findViewById(view instanceof ScrollView ? R$id.kbd_frame : R$id.kbd_scroll);
        viewGroup.addView(view);
        viewGroup.setVisibility(0);
        InternalKeyboard internalKeyboard = (InternalKeyboard) keyboardLayout.findViewById(R$id.keyboard);
        internalKeyboard.setAllowUseInternal(z);
        Object tag = view.getTag();
        if (tag instanceof InternalKeyboard$d) {
            internalKeyboard.setFlags(((InternalKeyboard$d) tag).f195a);
        }
        keyboardLayout.c();
        return keyboardLayout;
    }

    private void f(Context context) {
        this.f184b = false;
        this.f185c = false;
        if (isInEditMode()) {
            return;
        }
        try {
            setPreviewEnabled(false);
            setOnKeyboardActionListener(new InternalKeyboard$a(this));
        } catch (Throwable th) {
            e1.l("Failed init internal keyboard", th);
        }
    }

    private Window getWindow() {
        return (Window) this.f189g.get();
    }

    public static void i(View view, boolean z) {
        InternalKeyboard internalKeyboard = (InternalKeyboard) view.getRootView().findViewById(R$id.keyboard);
        if (internalKeyboard != null) {
            internalKeyboard.h(view, z);
            if (z) {
                return;
            }
            Tools.S0(view);
        }
    }

    private void m(Keyboard$Key keyboard$Key) {
        if ((this.f188f & 1) != 0 && ":".equals(keyboard$Key.label)) {
            n(keyboard$Key, "?");
        }
        if ((this.f188f & 2) != 0 && ";".equals(keyboard$Key.label)) {
            n(keyboard$Key, "*");
        }
        if ((this.f188f & 4) != 0 && "~".equals(keyboard$Key.label)) {
            n(keyboard$Key, "^");
        }
        if ((this.f188f & 8) == 0 || !"r".equals(keyboard$Key.label)) {
            return;
        }
        n(keyboard$Key, "$");
    }

    private void n(Keyboard$Key keyboard$Key, String str) {
        keyboard$Key.label = str;
        if (keyboard$Key.codes == null) {
            keyboard$Key.codes = new int[1];
        }
        keyboard$Key.codes[0] = str.charAt(0);
    }

    public static void o(View view, int i) {
        Tools.z1(view, new InternalKeyboard$c(i));
    }

    private void p() {
        this.f185c = !this.f185c;
        r();
    }

    private void q() {
        this.f184b = !this.f184b;
        r();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000b  */
    private void r() {
        boolean z;
        if (this.f186d) {
            z = (Config.B & 1) != 0;
        }
        setKeyboard(z);
    }

    private void s() {
        Config.b(R$id.config_kbd_small).f42d = (Config.B & 64) == 0 ? 1 : 0;
        Config.k();
        r();
    }

    private void setKeyboard(boolean z) {
        boolean z2 = this.f184b;
        boolean z3 = this.f185c;
        boolean z4 = (Config.B & 64) != 0;
        int i = this.f187e ? R$xml.empty : R$xml.keyboard;
        Keyboard keyboard = new Keyboard(MainService.context, i, c(z, z2, z3, z4));
        if (!this.f187e) {
            if (z2 && keyboard.getKeys().size() == 0) {
                keyboard = new Keyboard(MainService.context, i, c(z, false, z3, z4));
                z2 = false;
            }
            if (z3 && keyboard.getKeys().size() == 0) {
                keyboard = new Keyboard(MainService.context, i, c(z, z2, false, z4));
                z3 = false;
            }
            if (z4 && keyboard.getKeys().size() == 0) {
                keyboard = new Keyboard(MainService.context, i, c(z, z2, z3, false));
            }
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (Keyboard$Key keyboard$Key : keyboard.getKeys()) {
            if (keyboard$Key != null) {
                int i2 = keyboard$Key.y;
                sparseIntArray.put(i2, sparseIntArray.get(i2, 0) + 1);
                if (!z3) {
                    m(keyboard$Key);
                }
                int[] iArr = keyboard$Key.codes;
                if (iArr != null && iArr.length != 0) {
                    int i3 = iArr[0];
                    if (i3 == 5002) {
                        keyboard$Key.label = t1.f1251a;
                    }
                    if (i3 == 5003) {
                        keyboard$Key.label = String.valueOf(t1.f1252b);
                    }
                }
            }
        }
        Resources resources = getContext().getResources();
        ViewGroup$LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null && sparseIntArray.size() > 0) {
            layoutParams.width = Math.round(resources.getDimension(R$dimen.key_width) * sparseIntArray.valueAt(0));
            layoutParams.height = Math.round(resources.getDimension(R$dimen.key_height) * sparseIntArray.size());
            setLayoutParams(layoutParams);
            e1.d("Kbd: " + sparseIntArray.valueAt(0) + " x " + sparseIntArray.size() + "; " + layoutParams.width + 'x' + layoutParams.height + "; " + keyboard.getMinWidth() + 'x' + keyboard.getHeight());
        }
        if (this.h) {
            post(new InternalKeyboard$b(this, keyboard));
        } else {
            setKeyboard(keyboard);
        }
    }

    public void g(Window window) {
        this.f189g = new WeakReference(window);
        if (!this.f186d || (Config.B & 1) == 0) {
            window.clearFlags(131072);
        } else {
            window.addFlags(131072);
        }
        r();
        View decorView = window.getDecorView();
        Window$Callback callback = window.getCallback();
        if ((callback instanceof g3) && decorView.getWidth() == 0) {
            ((g3) callback).a(this);
        } else {
            j();
        }
    }

    public int getFlags() {
        return this.f188f;
    }

    public void h(View view, boolean z) {
        if (view != null) {
            try {
                Window window = getWindow();
                if (window != null) {
                    Tools.L(window, view, z);
                }
                if (z) {
                    setKeyboard(false);
                } else {
                    r();
                }
            } catch (Throwable th) {
                e1.l("Failed show/hide kbd: " + z, th);
            }
        }
    }

    public void j() {
        int i;
        Window window = getWindow();
        if (window == null || this.i == (i = MainService.context.getResources().getConfiguration().orientation)) {
            return;
        }
        this.i = i;
        b(window, i != 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0030. Please report as an issue. */
    void k(int i) {
        String str;
        int i2;
        String strValueOf;
        char c2;
        Window window = getWindow();
        if (window == null) {
            return;
        }
        View currentFocus = window.getCurrentFocus();
        if (currentFocus instanceof android.widget.EditText) {
            android.widget.EditText editText = (android.widget.EditText) currentFocus;
            int iMax = Math.max(editText.getSelectionStart(), 0);
            int iMax2 = Math.max(editText.getSelectionEnd(), 0);
            if (i >= 5000) {
                switch (i) {
                    case 5000:
                        i2 = 67;
                        str = null;
                        break;
                    case 5001:
                        i2 = 112;
                        str = null;
                        break;
                    case 5002:
                        strValueOf = t1.f1251a;
                        str = strValueOf;
                        i2 = 0;
                        break;
                    case 5003:
                        c2 = t1.f1252b;
                        break;
                    case 5004:
                    case 5005:
                        if (iMax != iMax2 || ((iMax != 0 || i != 5004) && (iMax != editText.getText().length() || i != 5005))) {
                            i2 = i == 5004 ? 21 : 22;
                            str = null;
                        }
                        str = null;
                        i2 = 0;
                        break;
                    case 5006:
                        q();
                        str = null;
                        i2 = 0;
                        break;
                    case 5007:
                        y0.i(editText);
                        str = null;
                        i2 = 0;
                        break;
                    case 5008:
                        Tools.o1(editText);
                        str = null;
                        i2 = 0;
                        break;
                    case 5009:
                        s();
                        str = null;
                        i2 = 0;
                        break;
                    case 5010:
                        p();
                        str = null;
                        i2 = 0;
                        break;
                    default:
                        str = null;
                        i2 = 0;
                        break;
                }
                if (str != null) {
                    editText.getText().replace(Math.min(iMax, iMax2), Math.max(iMax, iMax2), str, 0, str.length());
                    editText.setSelection(Math.max(editText.getSelectionStart(), editText.getSelectionEnd()));
                }
                if (i2 != 0) {
                    try {
                        editText.dispatchKeyEvent(new KeyEvent(0, i2));
                        editText.dispatchKeyEvent(new KeyEvent(1, i2));
                    } catch (Throwable th) {
                        e1.l("Failed send key to app", th);
                        return;
                    }
                }
            }
            c2 = (char) i;
            strValueOf = String.valueOf(c2);
            str = strValueOf;
            i2 = 0;
            if (str != null) {
                editText.getText().replace(Math.min(iMax, iMax2), Math.max(iMax, iMax2), str, 0, str.length());
                editText.setSelection(Math.max(editText.getSelectionStart(), editText.getSelectionEnd()));
            }
            if (i2 != 0) {
                editText.dispatchKeyEvent(new KeyEvent(0, i2));
                editText.dispatchKeyEvent(new KeyEvent(1, i2));
            }
        }
    }

    void l(int i, int[] iArr) {
        this.h = true;
        try {
            k(i);
            this.h = false;
        } catch (Throwable th) {
            this.h = false;
            throw th;
        }
    }

    @Override // android.view.View
    public void playSoundEffect(int i) {
        try {
            super.playSoundEffect(i);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEvent(int i) {
        try {
            super.sendAccessibilityEvent(i);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    public void setAllowUseInternal(boolean z) {
        this.f186d = z;
    }

    public void setFlags(int i) {
        this.f188f = i;
    }

    public void setHideKeyboard(boolean z) {
        boolean z2 = this.f187e;
        this.f187e = z;
        if (z2 != z) {
            r();
        }
    }

    public void t() {
        r();
        j();
    }
}
