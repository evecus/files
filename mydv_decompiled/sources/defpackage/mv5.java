package defpackage;

import android.graphics.Rect;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class mv5 {
    public final yv5 a;
    public o12[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public mv5(yv5 yv5Var) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = yv5Var;
        c(yv5Var);
    }

    public final void a() {
        o12[] o12VarArr = this.b;
        if (o12VarArr != null) {
            o12 o12Var = o12VarArr[0];
            o12 o12Var2 = o12VarArr[1];
            yv5 yv5Var = this.a;
            if (o12Var2 == null) {
                o12Var2 = yv5Var.a.i(2);
            }
            if (o12Var == null) {
                o12Var = yv5Var.a.i(1);
            }
            h(o12.a(o12Var, o12Var2));
            o12 o12Var3 = this.b[qi4.h(16)];
            if (o12Var3 != null) {
                g(o12Var3);
            }
            o12 o12Var4 = this.b[qi4.h(32)];
            if (o12Var4 != null) {
                e(o12Var4);
            }
            o12 o12Var5 = this.b[qi4.h(64)];
            if (o12Var5 != null) {
                i(o12Var5);
            }
        }
    }

    public abstract yv5 b();

    public void c(yv5 yv5Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> f = yv5Var.a.f(i);
            int h = qi4.h(i);
            this.c[h] = (Rect[]) f.toArray(new Rect[f.size()]);
            if (i != 8) {
                List<Rect> g = yv5Var.a.g(i);
                this.d[h] = (Rect[]) g.toArray(new Rect[g.size()]);
            }
        }
    }

    public void d(int i, o12 o12Var) {
        if (this.b == null) {
            this.b = new o12[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[qi4.h(i2)] = o12Var;
            }
        }
    }

    public abstract void f(o12 o12Var);

    public abstract void h(o12 o12Var);

    public mv5() {
        this(new yv5((yv5) null));
    }

    public void e(o12 o12Var) {
    }

    public void g(o12 o12Var) {
    }

    public void i(o12 o12Var) {
    }
}
