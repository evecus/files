package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class sx2 implements Menu {
    public static final int[] y = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public qx2 e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public CharSequence m;
    public Drawable n;
    public View o;
    public ky2 v;
    public boolean x;
    public boolean l = false;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public final ArrayList t = new ArrayList();
    public final CopyOnWriteArrayList u = new CopyOnWriteArrayList();
    public boolean w = false;

    public sx2(Context context) {
        boolean z;
        boolean z2 = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = hr5.a;
            if (Build.VERSION.SDK_INT >= 28) {
                z = ck.M(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z) {
                z2 = true;
            }
        }
        this.d = z2;
    }

    public final ky2 a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            s83.t("order does not contain a valid category.");
            return null;
        }
        int i6 = (y[i5] << 16) | (65535 & i3);
        ky2 ky2Var = new ky2(this, i, i2, i3, i6, charSequence, this.l ? 1 : 0);
        ArrayList arrayList = this.f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((ky2) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, ky2Var);
        q(true);
        return ky2Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            ky2 a = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            a.setIcon(resolveInfo.loadIcon(packageManager));
            a.g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        ky2 a = a(i, i2, i3, charSequence);
        oy4 oy4Var = new oy4(this.a, this, a);
        a.o = oy4Var;
        oy4Var.setHeaderTitle(a.e);
        return oy4Var;
    }

    public final void b(vy2 vy2Var) {
        c(vy2Var, this.a);
    }

    public final void c(vy2 vy2Var, Context context) {
        this.u.add(new WeakReference(vy2Var));
        vy2Var.k(context, this);
        this.k = true;
    }

    @Override // android.view.Menu
    public final void clear() {
        ky2 ky2Var = this.v;
        if (ky2Var != null) {
            e(ky2Var);
        }
        this.f.clear();
        q(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        q(false);
    }

    @Override // android.view.Menu
    public final void close() {
        d(true);
    }

    public final void d(boolean z) {
        if (this.s) {
            return;
        }
        this.s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            vy2 vy2Var = (vy2) weakReference.get();
            if (vy2Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                vy2Var.a(this, z);
            }
        }
        this.s = false;
    }

    public boolean e(ky2 ky2Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == ky2Var) {
            z();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                vy2 vy2Var = (vy2) weakReference.get();
                if (vy2Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z = vy2Var.e(ky2Var);
                    if (z) {
                        break;
                    }
                }
            }
            y();
            if (z) {
                this.v = null;
            }
        }
        return z;
    }

    public boolean f(sx2 sx2Var, MenuItem menuItem) {
        qx2 qx2Var = this.e;
        return qx2Var != null && qx2Var.b(sx2Var, menuItem);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ky2 ky2Var = (ky2) arrayList.get(i2);
            if (ky2Var.a == i) {
                return ky2Var;
            }
            if (ky2Var.hasSubMenu() && (findItem = ky2Var.o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public boolean g(ky2 ky2Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        boolean z = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        z();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            vy2 vy2Var = (vy2) weakReference.get();
            if (vy2Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z = vy2Var.h(ky2Var);
                if (z) {
                    break;
                }
            }
        }
        y();
        if (z) {
            this.v = ky2Var;
        }
        return z;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f.get(i);
    }

    public final ky2 h(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.t;
        arrayList.clear();
        i(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (ky2) arrayList.get(0);
        }
        boolean o = o();
        for (int i2 = 0; i2 < size; i2++) {
            ky2 ky2Var = (ky2) arrayList.get(i2);
            char c = o ? ky2Var.j : ky2Var.h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (o && c == '\b' && i == 67))) {
                return ky2Var;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((ky2) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(ArrayList arrayList, int i, KeyEvent keyEvent) {
        boolean o = o();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ky2 ky2Var = (ky2) arrayList2.get(i2);
                if (ky2Var.hasSubMenu()) {
                    ky2Var.o.i(arrayList, i, keyEvent);
                }
                char c = o ? ky2Var.j : ky2Var.h;
                if ((modifiers & 69647) == ((o ? ky2Var.k : ky2Var.i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (o && c == '\b' && i == 67)) && ky2Var.isEnabled()) {
                        arrayList.add(ky2Var);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return h(i, keyEvent) != null;
    }

    public final void j() {
        ArrayList m = m();
        if (this.k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                vy2 vy2Var = (vy2) weakReference.get();
                if (vy2Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z |= vy2Var.d();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.j;
            if (z) {
                arrayList.clear();
                arrayList2.clear();
                int size = m.size();
                for (int i = 0; i < size; i++) {
                    ky2 ky2Var = (ky2) m.get(i);
                    if ((ky2Var.x & 32) == 32) {
                        arrayList.add(ky2Var);
                    } else {
                        arrayList2.add(ky2Var);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m());
            }
            this.k = false;
        }
    }

    public String k() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList m() {
        boolean z = this.h;
        ArrayList arrayList = this.g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            ky2 ky2Var = (ky2) arrayList2.get(i);
            if (ky2Var.isVisible()) {
                arrayList.add(ky2Var);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean n() {
        return this.w;
    }

    public boolean o() {
        return this.c;
    }

    public boolean p() {
        return this.d;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return r(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        ky2 h = h(i, keyEvent);
        boolean r = h != null ? r(h, null, i2) : false;
        if ((i2 & 2) != 0) {
            d(true);
        }
        return r;
    }

    public final void q(boolean z) {
        if (this.p) {
            this.q = true;
            if (z) {
                this.r = true;
                return;
            }
            return;
        }
        if (z) {
            this.h = true;
            this.k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        z();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            vy2 vy2Var = (vy2) weakReference.get();
            if (vy2Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                vy2Var.i();
            }
        }
        y();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(android.view.MenuItem r7, defpackage.vy2 r8, int r9) {
        /*
            r6 = this;
            ky2 r7 = (defpackage.ky2) r7
            r0 = 0
            if (r7 == 0) goto Ld2
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld2
        Ld:
            sx2 r1 = r7.n
            android.view.MenuItem$OnMenuItemClickListener r2 = r7.p
            r3 = 1
            if (r2 == 0) goto L1c
            boolean r2 = r2.onMenuItemClick(r7)
            if (r2 == 0) goto L1c
        L1a:
            r1 = r3
            goto L43
        L1c:
            boolean r2 = r1.f(r1, r7)
            if (r2 == 0) goto L23
            goto L1a
        L23:
            android.content.Intent r2 = r7.g
            if (r2 == 0) goto L35
            android.content.Context r1 = r1.a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L1a
        L2d:
            r1 = move-exception
            java.lang.String r2 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r2, r4, r1)
        L35:
            ly2 r1 = r7.A
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.b
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L1a
        L42:
            r1 = r0
        L43:
            ly2 r2 = r7.A
            if (r2 == 0) goto L51
            android.view.ActionProvider r4 = r2.b
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r3
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.e()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld1
            r6.d(r3)
            goto Ld1
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld1
            r6.d(r3)
            goto Ld1
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.d(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            oy4 r9 = new oy4
            android.content.Context r5 = r6.a
            r9.<init>(r5, r6, r7)
            r7.o = r9
            java.lang.CharSequence r5 = r7.e
            r9.setHeaderTitle(r5)
        L90:
            oy4 r7 = r7.o
            if (r4 == 0) goto L99
            android.view.ActionProvider r9 = r2.b
            r9.onPrepareSubMenu(r7)
        L99:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.u
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto La2
            goto Lcb
        La2:
            if (r8 == 0) goto La8
            boolean r0 = r8.c(r7)
        La8:
            java.util.Iterator r8 = r9.iterator()
        Lac:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lcb
            java.lang.Object r2 = r8.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r4 = r2.get()
            vy2 r4 = (defpackage.vy2) r4
            if (r4 != 0) goto Lc4
            r9.remove(r2)
            goto Lac
        Lc4:
            if (r0 != 0) goto Lac
            boolean r0 = r4.c(r7)
            goto Lac
        Lcb:
            r1 = r1 | r0
            if (r1 != 0) goto Ld1
            r6.d(r3)
        Ld1:
            return r1
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sx2.r(android.view.MenuItem, vy2, int):boolean");
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((ky2) arrayList.get(i3)).b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((ky2) arrayList.get(i3)).b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            q(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((ky2) arrayList.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        q(true);
    }

    public final void s(vy2 vy2Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            vy2 vy2Var2 = (vy2) weakReference.get();
            if (vy2Var2 == null || vy2Var2 == vy2Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ky2 ky2Var = (ky2) arrayList.get(i2);
            if (ky2Var.b == i) {
                ky2Var.x = (ky2Var.x & (-5)) | (z2 ? 4 : 0);
                ky2Var.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ky2 ky2Var = (ky2) arrayList.get(i2);
            if (ky2Var.b == i) {
                ky2Var.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ky2 ky2Var = (ky2) arrayList.get(i2);
            if (ky2Var.b == i) {
                int i3 = ky2Var.x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                ky2Var.x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            q(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        q(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(k());
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((oy4) item.getSubMenu()).t(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public final void u(Bundle bundle) {
        int size = this.f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((oy4) item.getSubMenu()).u(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(k(), sparseArray);
        }
    }

    public void v(qx2 qx2Var) {
        this.e = qx2Var;
    }

    public final void w(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i > 0) {
                this.m = this.b.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i2 > 0) {
                this.n = this.a.getDrawable(i2);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        q(false);
    }

    public final void x(boolean z) {
        this.x = z;
    }

    public final void y() {
        this.p = false;
        if (this.q) {
            this.q = false;
            q(this.r);
        }
    }

    public final void z() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.q = false;
        this.r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }

    public sx2 l() {
        return this;
    }
}
