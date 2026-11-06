package defpackage;

import androidx.media3.common.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class p40 implements un1 {
    public final tk0 I;
    public final int J;
    public final ez K;

    public p40(tk0 tk0Var, int i, ez ezVar) {
        this.I = tk0Var;
        this.J = i;
        this.K = ezVar;
    }

    @Override // defpackage.un1
    public final zf1 a(tk0 tk0Var, int i, ez ezVar) {
        tk0 tk0Var2 = this.I;
        tk0 plus = tk0Var.plus(tk0Var2);
        ez ezVar2 = ez.I;
        ez ezVar3 = this.K;
        int i2 = this.J;
        if (ezVar == ezVar2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Log.LOG_LEVEL_OFF;
                            }
                        }
                    }
                }
                i = i2;
            }
            ezVar = ezVar3;
        }
        return (j42.c(plus, tk0Var2) && i == i2 && ezVar == ezVar3) ? this : e(plus, i, ezVar);
    }

    public String c() {
        return null;
    }

    @Override // defpackage.zf1
    public Object collect(ag1 ag1Var, fj0 fj0Var) {
        Object o0 = i42.o0(new ni(ag1Var, this, null, (byte) 2), fj0Var);
        return o0 == el0.I ? o0 : wd5.a;
    }

    public abstract Object d(bu3 bu3Var, fj0 fj0Var);

    public abstract p40 e(tk0 tk0Var, int i, ez ezVar);

    public zf1 f() {
        return null;
    }

    public k20 g(dl0 dl0Var) {
        int i = this.J;
        if (i == -3) {
            i = -2;
        }
        hn1 kyVar = new ky(this, null, (byte) 1);
        bu3 bu3Var = new bu3(qb.W(dl0Var, this.I), qb.g(i, 4, this.K));
        bu3Var.h0(gl0.K, bu3Var, kyVar);
        return bu3Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String c = c();
        if (c != null) {
            arrayList.add(c);
        }
        l91 l91Var = l91.I;
        tk0 tk0Var = this.I;
        if (tk0Var != l91Var) {
            arrayList.add("context=" + tk0Var);
        }
        int i = this.J;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        ez ezVar = ez.I;
        ez ezVar2 = this.K;
        if (ezVar2 != ezVar) {
            arrayList.add("onBufferOverflow=" + ezVar2);
        }
        return getClass().getSimpleName() + '[' + o70.Z0(arrayList, ", ", null, null, 0, null, 62) + ']';
    }
}
