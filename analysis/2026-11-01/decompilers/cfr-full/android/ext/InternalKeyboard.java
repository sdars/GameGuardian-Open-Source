/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.c;
import android.content.Context;
import android.content.res.Resources;
import android.ext.Config;
import android.ext.KeyboardLayout;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.e1;
import android.ext.g3;
import android.ext.t1;
import android.ext.y0;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ScrollView;
import java.lang.ref.WeakReference;

public class InternalKeyboard
extends c {
    private boolean b;
    private boolean c;
    private boolean d = true;
    private boolean e = false;
    private int f = 0;
    private WeakReference g = new WeakReference<Object>(null);
    private boolean h = false;
    private int i = -1;

    public InternalKeyboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f(context);
    }

    public static boolean a() {
        boolean bl = false;
        try {
            View view = a.d.f(2131099654, null);
            if (view != null) {
                bl = true;
            }
        }
        catch (Throwable throwable) {
            e1.l("Check internal keyboard fail", throwable);
        }
        return bl;
    }

    private void b(Window window, boolean bl) {
        int n3;
        WindowManager.LayoutParams layoutParams;
        block7: {
            int n4;
            block6: {
                layoutParams = window.getAttributes();
                View view = window.getDecorView();
                n3 = view.getWidth();
                try {
                    view.measure(-2, -2);
                    n3 = n4 = Math.max(n3, view.getMeasuredWidth());
                }
                catch (Throwable throwable) {
                    e1.a(throwable);
                }
                if (bl) {
                    n4 = this.getWidth();
                    try {
                        this.measure(-2, -2);
                        n4 = Math.max(n4, this.getMeasuredWidth());
                        break block6;
                    }
                    catch (Throwable throwable) {
                        e1.a(throwable);
                        break block7;
                    }
                }
                n4 = Tools.H();
            }
            n3 += n4;
        }
        layoutParams.width = n3;
        if (n3 >= MainService.context.getResources().getDisplayMetrics().widthPixels) {
            layoutParams.width = -1;
        }
        window.setAttributes(layoutParams);
    }

    private int c(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        int n3 = bl ? (bl2 ? 2131034298 : (bl3 ? 2131034297 : (bl4 ? 2131034300 : 2131034299))) : 2131034296;
        return n3;
    }

    public static View d(View view) {
        return InternalKeyboard.e(view, true);
    }

    public static View e(View object, boolean bl) {
        if (InternalKeyboard.a()) {
            KeyboardLayout keyboardLayout = (KeyboardLayout)a.d.f(2131099654, null);
            int n3 = object instanceof ScrollView ? 2131034301 : 2131034302;
            Object object2 = (ViewGroup)keyboardLayout.findViewById(n3);
            object2.addView(object);
            object2.setVisibility(0);
            object2 = (InternalKeyboard)keyboardLayout.findViewById(2131034303);
            ((InternalKeyboard)((Object)object2)).setAllowUseInternal(bl);
            object = object.getTag();
            if (object instanceof d) {
                ((InternalKeyboard)((Object)object2)).setFlags(((d)object).a);
            }
            keyboardLayout.c();
            return keyboardLayout;
        }
        return object;
    }

    private void f(Context object) {
        this.b = false;
        this.c = false;
        if (this.isInEditMode()) {
            return;
        }
        try {
            this.setPreviewEnabled(false);
            object = new KeyboardView.OnKeyboardActionListener(this){
                final InternalKeyboard a;
                {
                    this.a = internalKeyboard;
                }

                public void onKey(int n3, int[] nArray) {
                    this.a.l(n3, nArray);
                }

                public void onPress(int n3) {
                }

                public void onRelease(int n3) {
                }

                public void onText(CharSequence charSequence) {
                }

                public void swipeDown() {
                }

                public void swipeLeft() {
                }

                public void swipeRight() {
                }

                public void swipeUp() {
                }
            };
            this.setOnKeyboardActionListener((KeyboardView.OnKeyboardActionListener)object);
        }
        catch (Throwable throwable) {
            e1.l("Failed init internal keyboard", throwable);
        }
    }

    private Window getWindow() {
        return (Window)this.g.get();
    }

    public static void i(View view, boolean bl) {
        InternalKeyboard internalKeyboard = (InternalKeyboard)view.getRootView().findViewById(2131034303);
        if (internalKeyboard != null) {
            internalKeyboard.h(view, bl);
            if (!bl) {
                Tools.S0(view);
            }
        }
    }

    private void m(Keyboard.Key key) {
        if ((this.f & 1) != 0 && ":".equals(key.label)) {
            this.n(key, "?");
        }
        if ((this.f & 2) != 0 && ";".equals(key.label)) {
            this.n(key, "*");
        }
        if ((this.f & 4) != 0 && "~".equals(key.label)) {
            this.n(key, "^");
        }
        if ((this.f & 8) != 0 && "r".equals(key.label)) {
            this.n(key, "$");
        }
    }

    private void n(Keyboard.Key key, String string2) {
        key.label = string2;
        if (key.codes == null) {
            key.codes = new int[1];
        }
        key.codes[0] = string2.charAt(0);
    }

    public static void o(View view, int n3) {
        Tools.z1(view, new View.OnFocusChangeListener(n3){
            int a;
            final int b;
            {
                this.b = n3;
                this.a = -1;
            }

            public void onFocusChange(View object, boolean bl) {
                if ((Config.B & 1) == 0) {
                    return;
                }
                if ((object = (InternalKeyboard)object.getRootView().findViewById(2131034303)) != null) {
                    if (this.a == -1) {
                        this.a = ((InternalKeyboard)((Object)object)).getFlags();
                    }
                    int n3 = this.a;
                    int n4 = bl ? this.b : 0;
                    ((InternalKeyboard)((Object)object)).setFlags(n4 | n3);
                    ((InternalKeyboard)((Object)object)).t();
                }
            }
        });
    }

    private void p() {
        this.c ^= true;
        this.r();
    }

    private void q() {
        this.b ^= true;
        this.r();
    }

    private void r() {
        boolean bl;
        block3: {
            block2: {
                if (!this.d) break block2;
                int n3 = Config.B;
                bl = true;
                if ((n3 & 1) != 0) break block3;
            }
            bl = false;
        }
        this.setKeyboard(bl);
    }

    private void s() {
        int n3 = (Config.B & 0x40) == 0 ? 1 : 0;
        Config.b((int)2131034176).d = n3;
        Config.k();
        this.r();
    }

    private void setKeyboard(boolean bl) {
        Object object;
        boolean bl2 = this.b;
        boolean bl3 = this.c;
        boolean bl4 = (Config.B & 0x40) != 0;
        Object object2 = this.e ? 2131427328 : 2131427329;
        Keyboard keyboard = new Keyboard(MainService.context, object2, this.c(bl, bl2, bl3, bl4));
        boolean bl5 = bl3;
        Keyboard keyboard2 = keyboard;
        if (!this.e) {
            boolean bl6 = bl2;
            keyboard2 = keyboard;
            if (bl2) {
                bl6 = bl2;
                keyboard2 = keyboard;
                if (keyboard.getKeys().size() == 0) {
                    keyboard2 = new Keyboard(MainService.context, object2, this.c(bl, false, bl3, bl4));
                    bl6 = false;
                }
            }
            bl2 = bl3;
            keyboard = keyboard2;
            if (bl3) {
                bl2 = bl3;
                keyboard = keyboard2;
                if (keyboard2.getKeys().size() == 0) {
                    keyboard = new Keyboard(MainService.context, object2, this.c(bl, bl6, false, bl4));
                    bl2 = false;
                }
            }
            bl5 = bl2;
            keyboard2 = keyboard;
            if (bl4) {
                bl5 = bl2;
                keyboard2 = keyboard;
                if (keyboard.getKeys().size() == 0) {
                    keyboard2 = new Keyboard(MainService.context, object2, this.c(bl, bl6, bl2, false));
                    bl5 = bl2;
                }
            }
        }
        keyboard = new SparseIntArray();
        for (Keyboard.Key key : keyboard2.getKeys()) {
            if (key == null) continue;
            object2 = key.y;
            keyboard.put(object2, keyboard.get(object2, 0) + 1);
            if (!bl5) {
                this.m(key);
            }
            if ((object = (Object)key.codes) == null || ((Resources)object).length == 0) continue;
            object2 = object[0];
            if (object2 == 5002) {
                key.label = t1.a;
            }
            if (object2 != 5003) continue;
            key.label = String.valueOf(t1.b);
        }
        object = this.getContext().getResources();
        ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
        if (layoutParams != null && keyboard.size() > 0) {
            layoutParams.width = Math.round(object.getDimension(2130903043) * (float)keyboard.valueAt(0));
            layoutParams.height = Math.round(object.getDimension(2130903042) * (float)keyboard.size());
            this.setLayoutParams(layoutParams);
            object = new StringBuilder();
            ((StringBuilder)object).append("Kbd: ");
            ((StringBuilder)object).append(keyboard.valueAt(0));
            ((StringBuilder)object).append(" x ");
            ((StringBuilder)object).append(keyboard.size());
            ((StringBuilder)object).append("; ");
            ((StringBuilder)object).append(layoutParams.width);
            ((StringBuilder)object).append('x');
            ((StringBuilder)object).append(layoutParams.height);
            ((StringBuilder)object).append("; ");
            ((StringBuilder)object).append(keyboard2.getMinWidth());
            ((StringBuilder)object).append('x');
            ((StringBuilder)object).append(keyboard2.getHeight());
            e1.d(((StringBuilder)object).toString());
        }
        if (this.h) {
            this.post(new Runnable(this, keyboard2){
                final Keyboard a;
                final InternalKeyboard b;
                {
                    this.b = internalKeyboard;
                    this.a = keyboard;
                }

                @Override
                public void run() {
                    this.b.setKeyboard(this.a);
                }
            });
        } else {
            this.setKeyboard(keyboard2);
        }
    }

    public void g(Window window) {
        this.g = new WeakReference<Window>(window);
        if (this.d && (Config.B & 1) != 0) {
            window.addFlags(131072);
        } else {
            window.clearFlags(131072);
        }
        this.r();
        View view = window.getDecorView();
        window = window.getCallback();
        if (window instanceof g3 && view.getWidth() == 0) {
            ((g3)window).a(this);
        } else {
            this.j();
        }
    }

    public int getFlags() {
        return this.f;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void h(View view, boolean bl) {
        Throwable throwable2;
        block4: {
            block3: {
                if (view == null) return;
                try {
                    Window window = this.getWindow();
                    if (window == null) break block3;
                    Tools.L(window, view, bl);
                }
                catch (Throwable throwable2) {
                    break block4;
                }
            }
            if (bl) {
                this.setKeyboard(false);
                return;
            }
            this.r();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed show/hide kbd: ");
        stringBuilder.append(bl);
        e1.l(stringBuilder.toString(), throwable2);
    }

    public void j() {
        Window window = this.getWindow();
        if (window == null) {
            return;
        }
        int n3 = MainService.context.getResources().getConfiguration().orientation;
        if (this.i != n3) {
            this.i = n3;
            boolean bl = true;
            if (n3 == 1) {
                bl = false;
            }
            this.b(window, bl);
        }
    }

    /*
     * Unable to fully structure code
     */
    void k(int var1_1) {
        block22: {
            var5_2 = this.getWindow();
            if (var5_2 == null) {
                return;
            }
            if (!((var5_2 = var5_2.getCurrentFocus()) instanceof EditText)) {
                return;
            }
            var6_4 = (EditText)var5_2;
            var3_5 = Math.max(var6_4.getSelectionStart(), 0);
            var4_6 = Math.max(var6_4.getSelectionEnd(), 0);
            if (var1_1 < 5000) {
                var2_7 = (char)var1_1;
lbl11:
                // 2 sources

                while (true) {
                    var5_2 = String.valueOf(var2_7);
lbl13:
                    // 3 sources

                    while (true) {
                        var1_1 = 0;
                        break block22;
                        break;
                    }
                    break;
                }
            }
            switch (var1_1) {
                default: {
                    ** GOTO lbl36
                }
                case 5010: {
                    this.p();
                    ** GOTO lbl36
                }
                case 5009: {
                    this.s();
                    ** GOTO lbl36
                }
                case 5008: {
                    Tools.o1(var6_4);
                    ** GOTO lbl36
                }
                case 5007: {
                    y0.i(var6_4);
                    ** GOTO lbl36
                }
                case 5006: {
                    this.q();
                    ** GOTO lbl36
                }
                case 5004: 
                case 5005: {
                    if (var3_5 != var4_6 || (var3_5 != 0 || var1_1 != 5004) && (var3_5 != var6_4.getText().length() || var1_1 != 5005)) ** GOTO lbl38
lbl36:
                    // 7 sources

                    var5_2 = null;
                    ** GOTO lbl13
lbl38:
                    // 1 sources

                    var1_1 = var1_1 == 5004 ? 21 : 22;
lbl39:
                    // 3 sources

                    while (true) {
                        var5_2 = null;
                        break block22;
                        break;
                    }
                }
                case 5003: {
                    var2_7 = t1.b;
                    ** continue;
                }
                case 5002: {
                    var5_2 = t1.a;
                    ** continue;
                }
                case 5001: {
                    var1_1 = 112;
                    ** GOTO lbl39
                }
                case 5000: 
            }
            var1_1 = 67;
            ** while (true)
        }
        if (var5_2 != null) {
            var6_4.getText().replace(Math.min(var3_5, var4_6), Math.max(var3_5, var4_6), (CharSequence)var5_2, 0, var5_2.length());
            var6_4.setSelection(Math.max(var6_4.getSelectionStart(), var6_4.getSelectionEnd()));
        }
        if (var1_1 != 0) {
            try {
                var5_2 = new KeyEvent(0, var1_1);
                var6_4.dispatchKeyEvent((KeyEvent)var5_2);
                var5_2 = new KeyEvent(1, var1_1);
                var6_4.dispatchKeyEvent((KeyEvent)var5_2);
            }
            catch (Throwable var5_3) {
                e1.l("Failed send key to app", var5_3);
            }
        }
    }

    void l(int n3, int[] nArray) {
        this.h = true;
        try {
            this.k(n3);
            return;
        }
        finally {
            this.h = false;
        }
    }

    public void playSoundEffect(int n3) {
        try {
            super.playSoundEffect(n3);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    public void sendAccessibilityEvent(int n3) {
        try {
            super.sendAccessibilityEvent(n3);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    public void setAllowUseInternal(boolean bl) {
        this.d = bl;
    }

    public void setFlags(int n3) {
        this.f = n3;
    }

    public void setHideKeyboard(boolean bl) {
        boolean bl2 = this.e;
        this.e = bl;
        if (bl2 != bl) {
            this.r();
        }
    }

    public void t() {
        this.r();
        this.j();
    }

    public static class d {
        public int a;

        public d(int n3) {
            this.a = n3;
        }
    }

    public static abstract class e
    implements View.OnFocusChangeListener {
        protected abstract boolean a(View var1, boolean var2);

        public void onFocusChange(View view, boolean bl) {
            if ((Config.B & 1) == 0) {
                return;
            }
            InternalKeyboard internalKeyboard = (InternalKeyboard)view.getRootView().findViewById(2131034303);
            if (internalKeyboard != null) {
                boolean bl2 = this.a(view, bl);
                if (!bl2) {
                    bl = false;
                }
                internalKeyboard.h(view, bl);
                if (!bl2) {
                    Tools.S0(view);
                }
            }
        }
    }
}

