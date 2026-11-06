package defpackage;

import android.R;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mf {
    public final nf a;
    public final jf b;
    public final jf c;
    public final View d;

    public mf(nf nfVar, jf jfVar, jf jfVar2, View view) {
        this.a = nfVar;
        this.b = jfVar;
        this.c = jfVar2;
        this.d = view;
    }

    public final boolean a(Menu menu) {
        v25 v25Var = (v25) this.b.invoke();
        if (j42.c(v25Var, null)) {
            return false;
        }
        menu.clear();
        List list = v25Var.a;
        int size = list.size();
        int i = 1;
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            u25 u25Var = (u25) list.get(i3);
            if (u25Var instanceof c35) {
                int i4 = i + 1;
                Object obj = u25Var.a;
                c35 c35Var = (c35) u25Var;
                MenuItem add = menu.add(i2, j42.c(obj, j16.t0) ? R.id.cut : j42.c(obj, j16.u0) ? R.id.copy : j42.c(obj, j16.v0) ? R.id.paste : j42.c(obj, j16.w0) ? R.id.selectAll : j42.c(obj, j16.x0) ? R.id.autofill : i, i, c35Var.b);
                add.setShowAsAction(2);
                add.setOnMenuItemClickListener(new lf(c35Var, this, (byte) 0));
                i = i4;
            } else if (u25Var instanceof j35) {
                if (Build.VERSION.SDK_INT >= 28) {
                    j35 j35Var = (j35) u25Var;
                    ck.a(menu, i, this.d.getContext(), j35Var.b, j35Var.c, j35Var.d);
                    i++;
                }
            } else if (u25Var instanceof h35) {
                i2++;
            }
        }
        return true;
    }
}
