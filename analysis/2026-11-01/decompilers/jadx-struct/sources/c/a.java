package c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a implements Menu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f1491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Resources f1492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList f1494d = new ArrayList();

    public a(Context context) {
        this.f1491a = context;
        this.f1492b = this.f1491a.getResources();
    }

    private int a(int i) {
        ArrayList arrayList = this.f1494d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((b) arrayList.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    private b b(int i, KeyEvent keyEvent) {
        boolean z = this.f1493c;
        ArrayList arrayList = this.f1494d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = (b) arrayList.get(i2);
            if (i == (z ? bVar.getAlphabeticShortcut() : bVar.getNumericShortcut())) {
                return bVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return add(0, 0, 0, i);
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return add(i, i2, i3, this.f1492b.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        b bVar = new b(c(), i, i2, 0, i3, charSequence);
        this.f1494d.add(i3, bVar);
        return bVar;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return add(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f1491a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f1492b.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f1492b.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return new c(this.f1491a, this, add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public Context c() {
        return this.f1491a;
    }

    @Override // android.view.Menu
    public void clear() {
        this.f1494d.clear();
        this.f1494d.trimToSize();
    }

    @Override // android.view.Menu
    public void close() {
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        int iA = a(i);
        if (iA < 0) {
            return null;
        }
        return (MenuItem) this.f1494d.get(iA);
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return (MenuItem) this.f1494d.get(i);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        ArrayList arrayList = this.f1494d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((b) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return b(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        int iA = a(i);
        if (iA < 0) {
            return false;
        }
        return ((b) this.f1494d.get(iA)).a();
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        b bVarB = b(i, keyEvent);
        if (bVarB == null) {
            return false;
        }
        return bVarB.a();
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        ArrayList arrayList = this.f1494d;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            if (((b) arrayList.get(i2)).getGroupId() == i) {
                arrayList.remove(i2);
                size--;
            } else {
                i2++;
            }
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        this.f1494d.remove(a(i));
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f1494d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = (b) arrayList.get(i2);
            if (bVar.getGroupId() == i) {
                bVar.setCheckable(z);
                bVar.b(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f1494d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = (b) arrayList.get(i2);
            if (bVar.getGroupId() == i) {
                bVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f1494d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = (b) arrayList.get(i2);
            if (bVar.getGroupId() == i) {
                bVar.setVisible(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1493c = z;
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1494d.size();
    }
}
