package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class b5 implements g5 {
    public Object a;
    public Object b;

    public b5() {
        this.b = new int[2];
    }

    public void e() {
        hl hlVar = (hl) this.a;
        if (hlVar != null) {
            try {
                ((kl) this.b).S.unregisterReceiver(hlVar);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof nz4)) {
            return menuItem;
        }
        nz4 nz4Var = (nz4) menuItem;
        oo4 oo4Var = (oo4) this.b;
        if (oo4Var == null) {
            oo4Var = new oo4(0);
            this.b = oo4Var;
        }
        MenuItem menuItem2 = (MenuItem) oo4Var.get(nz4Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        oy2 oy2Var = new oy2((Context) this.a, nz4Var);
        ((oo4) this.b).put(nz4Var, oy2Var);
        return oy2Var;
    }

    public int[] h(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public String i() {
        String str = (String) this.a;
        if (str != null) {
            return str;
        }
        j42.g0("text");
        throw null;
    }

    public void j(String str) {
        this.a = str;
    }

    public abstract void k();

    public void l() {
        e();
        IntentFilter f = f();
        if (f.countActions() == 0) {
            return;
        }
        hl hlVar = (hl) this.a;
        if (hlVar == null) {
            hlVar = new hl(this, (byte) 0);
            this.a = hlVar;
        }
        ((kl) this.b).S.registerReceiver(hlVar, f);
    }

    public b5(Context context) {
        this.a = context;
    }

    public b5(kl klVar) {
        this.b = klVar;
    }
}
