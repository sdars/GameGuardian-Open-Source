/*
 * Decompiled with CFR 0.152.
 */
package c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import c.b;
import c.c;
import java.util.ArrayList;
import java.util.List;

public class a
implements Menu {
    protected Context a;
    protected Resources b;
    private boolean c;
    private ArrayList d;

    public a(Context context) {
        this.a = context;
        this.d = new ArrayList();
        this.b = this.a.getResources();
    }

    private int a(int n3) {
        ArrayList arrayList = this.d;
        int n4 = arrayList.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            if (((b)arrayList.get(i3)).getItemId() != n3) continue;
            return i3;
        }
        return -1;
    }

    private b b(int n3, KeyEvent object) {
        boolean bl = this.c;
        object = this.d;
        int n4 = ((ArrayList)object).size();
        for (int i3 = 0; i3 < n4; ++i3) {
            b b4 = (b)((ArrayList)object).get(i3);
            char c4 = bl ? b4.getAlphabeticShortcut() : b4.getNumericShortcut();
            if (n3 != c4) continue;
            return b4;
        }
        return null;
    }

    public MenuItem add(int n3) {
        return this.add(0, 0, 0, n3);
    }

    public MenuItem add(int n3, int n4, int n5, int n6) {
        return this.add(n3, n4, n5, this.b.getString(n6));
    }

    public MenuItem add(int n3, int n4, int n5, CharSequence object) {
        object = new b(this.c(), n3, n4, 0, n5, (CharSequence)object);
        this.d.add(n5, object);
        return object;
    }

    public MenuItem add(CharSequence charSequence) {
        return this.add(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int n3, int n4, int n5, ComponentName componentName, Intent[] intentArray, Intent intent, int n6, MenuItem[] menuItemArray) {
        PackageManager packageManager = this.a.getPackageManager();
        int n7 = 0;
        List list = packageManager.queryIntentActivityOptions(componentName, intentArray, intent, 0);
        int n8 = list != null ? list.size() : 0;
        int n9 = n7;
        if ((n6 & 1) == 0) {
            this.removeGroup(n3);
            n9 = n7;
        }
        while (n9 < n8) {
            ResolveInfo resolveInfo = (ResolveInfo)list.get(n9);
            n6 = resolveInfo.specificIndex;
            componentName = n6 < 0 ? intent : intentArray[n6];
            Intent intent2 = new Intent((Intent)componentName);
            componentName = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(componentName.applicationInfo.packageName, componentName.name));
            componentName = this.add(n3, n4, n5, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArray != null && (n6 = resolveInfo.specificIndex) >= 0) {
                menuItemArray[n6] = componentName;
            }
            ++n9;
        }
        return n8;
    }

    public SubMenu addSubMenu(int n3) {
        return this.addSubMenu(0, 0, 0, this.b.getString(n3));
    }

    public SubMenu addSubMenu(int n3, int n4, int n5, int n6) {
        return this.addSubMenu(n3, n4, n5, this.b.getString(n6));
    }

    public SubMenu addSubMenu(int n3, int n4, int n5, CharSequence charSequence) {
        charSequence = this.add(n3, n4, n5, charSequence);
        return new c(this.a, this, (MenuItem)charSequence);
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return this.addSubMenu(0, 0, 0, charSequence);
    }

    public Context c() {
        return this.a;
    }

    public void clear() {
        this.d.clear();
        this.d.trimToSize();
    }

    public void close() {
    }

    public MenuItem findItem(int n3) {
        MenuItem menuItem = (n3 = this.a(n3)) < 0 ? null : (MenuItem)this.d.get(n3);
        return menuItem;
    }

    public MenuItem getItem(int n3) {
        return (MenuItem)this.d.get(n3);
    }

    public boolean hasVisibleItems() {
        ArrayList arrayList = this.d;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            if (!((b)arrayList.get(i3)).isVisible()) continue;
            return true;
        }
        return false;
    }

    public boolean isShortcutKey(int n3, KeyEvent keyEvent) {
        boolean bl = this.b(n3, keyEvent) != null;
        return bl;
    }

    public boolean performIdentifierAction(int n3, int n4) {
        if ((n3 = this.a(n3)) < 0) {
            return false;
        }
        return ((b)this.d.get(n3)).a();
    }

    public boolean performShortcut(int n3, KeyEvent object, int n4) {
        if ((object = this.b(n3, (KeyEvent)object)) == null) {
            return false;
        }
        return ((b)object).a();
    }

    public void removeGroup(int n3) {
        ArrayList arrayList = this.d;
        int n4 = arrayList.size();
        int n5 = 0;
        while (n5 < n4) {
            if (((b)arrayList.get(n5)).getGroupId() == n3) {
                arrayList.remove(n5);
                --n4;
                continue;
            }
            ++n5;
        }
    }

    public void removeItem(int n3) {
        this.d.remove(this.a(n3));
    }

    public void setGroupCheckable(int n3, boolean bl, boolean bl2) {
        ArrayList arrayList = this.d;
        int n4 = arrayList.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            b b4 = (b)arrayList.get(i3);
            if (b4.getGroupId() != n3) continue;
            b4.setCheckable(bl);
            b4.b(bl2);
        }
    }

    public void setGroupEnabled(int n3, boolean bl) {
        ArrayList arrayList = this.d;
        int n4 = arrayList.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            b b4 = (b)arrayList.get(i3);
            if (b4.getGroupId() != n3) continue;
            b4.setEnabled(bl);
        }
    }

    public void setGroupVisible(int n3, boolean bl) {
        ArrayList arrayList = this.d;
        int n4 = arrayList.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            b b4 = (b)arrayList.get(i3);
            if (b4.getGroupId() != n3) continue;
            b4.setVisible(bl);
        }
    }

    public void setQwertyMode(boolean bl) {
        this.c = bl;
    }

    public int size() {
        return this.d.size();
    }
}

