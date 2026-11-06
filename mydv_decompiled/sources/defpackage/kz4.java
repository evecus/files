package defpackage;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class kz4 implements MenuItem.OnMenuItemClickListener {
    public static final Class[] d = {MenuItem.class};
    public final /* synthetic */ byte a = 0;
    public Object b;
    public Object c;

    public kz4(oy2 oy2Var, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.c = oy2Var;
        this.b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.a) {
            case 0:
                Object obj = this.b;
                Method method = (Method) this.c;
                boolean z = false;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        z = ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    } else {
                        method.invoke(obj, menuItem);
                        z = true;
                    }
                } catch (Exception e) {
                    zl1.k(e);
                }
                return z;
            default:
                return ((MenuItem.OnMenuItemClickListener) this.b).onMenuItemClick(((oy2) this.c).g(menuItem));
        }
    }

    public /* synthetic */ kz4() {
    }
}
