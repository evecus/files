package defpackage;

import androidx.media3.common.util.Log;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class s4 {
    public t4[] I;
    public int J;
    public int K;
    public az4 L;

    public final t4 c() {
        t4 t4Var;
        az4 az4Var;
        synchronized (this) {
            try {
                t4[] t4VarArr = this.I;
                if (t4VarArr == null) {
                    t4VarArr = e();
                    this.I = t4VarArr;
                } else if (this.J >= t4VarArr.length) {
                    Object[] copyOf = Arrays.copyOf(t4VarArr, t4VarArr.length * 2);
                    this.I = (t4[]) copyOf;
                    t4VarArr = (t4[]) copyOf;
                }
                int i = this.K;
                do {
                    t4Var = t4VarArr[i];
                    if (t4Var == null) {
                        t4Var = d();
                        t4VarArr[i] = t4Var;
                    }
                    i++;
                    if (i >= t4VarArr.length) {
                        i = 0;
                    }
                } while (!t4Var.a(this));
                this.K = i;
                this.J++;
                az4Var = this.L;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (az4Var != null) {
            az4Var.u(1);
        }
        return t4Var;
    }

    public t4 d() {
        return new gw4();
    }

    public t4[] e() {
        return new gw4[2];
    }

    public final void f(t4 t4Var) {
        az4 az4Var;
        int i;
        fj0[] b;
        synchronized (this) {
            try {
                int i2 = this.J - 1;
                this.J = i2;
                az4Var = this.L;
                if (i2 == 0) {
                    this.K = 0;
                }
                t4Var.getClass();
                b = t4Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (fj0 fj0Var : b) {
            if (fj0Var != null) {
                fj0Var.resumeWith(wd5.a);
            }
        }
        if (az4Var != null) {
            az4Var.u(-1);
        }
    }

    public final az4 g() {
        az4 az4Var;
        synchronized (this) {
            az4Var = this.L;
            if (az4Var == null) {
                int i = this.J;
                az4Var = new az4(1, Log.LOG_LEVEL_OFF, ez.J);
                az4Var.b(Integer.valueOf(i));
                this.L = az4Var;
            }
        }
        return az4Var;
    }
}
