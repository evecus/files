package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lz4 {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ mz4 E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public ly2 z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public lz4(mz4 mz4Var, Menu menu) {
        this.E = mz4Var;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        mz4 mz4Var = this.E;
        Context context = mz4Var.c;
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.y != null) {
            if (context.isRestricted()) {
                zy.i("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            Object obj = mz4Var.d;
            if (obj == null) {
                obj = mz4.a(context);
                mz4Var.d = obj;
            }
            String str = this.y;
            kz4 kz4Var = new kz4();
            kz4Var.b = obj;
            Class<?> cls = obj.getClass();
            try {
                kz4Var.c = cls.getMethod(str, kz4.d);
                menuItem.setOnMenuItemClickListener(kz4Var);
            } catch (Exception e) {
                StringBuilder E = r7.E("Couldn't resolve menu item onClick handler ", str, " in class ");
                E.append(cls.getName());
                InflateException inflateException = new InflateException(E.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof ky2) {
                ky2 ky2Var = (ky2) menuItem;
                ky2Var.x = (ky2Var.x & (-5)) | 4;
            } else if (menuItem instanceof oy2) {
                oy2 oy2Var = (oy2) menuItem;
                nz4 nz4Var = oy2Var.c;
                try {
                    Method method = oy2Var.d;
                    if (method == null) {
                        method = nz4Var.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        oy2Var.d = method;
                    }
                    method.invoke(nz4Var, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, mz4.e, mz4Var.a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ly2 ly2Var = this.z;
        if (ly2Var != null) {
            if (menuItem instanceof nz4) {
                ((nz4) menuItem).a(ly2Var);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof nz4;
        if (z2) {
            ((nz4) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            x9.E(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((nz4) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            x9.O(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((nz4) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            x9.x(menuItem, c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((nz4) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            x9.K(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((nz4) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                x9.I(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((nz4) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                x9.H(menuItem, colorStateList);
            }
        }
    }
}
