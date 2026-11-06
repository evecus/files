package defpackage;

import android.os.Bundle;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class m94 implements j94, w94 {
    public final /* synthetic */ k94 I;
    public xi2 J;
    public da K;

    public m94(k94 k94Var) {
        this.I = k94Var;
        Object e = k94Var.e("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = e instanceof Bundle ? (Bundle) e : null;
        if (bundle != null && this.K == null) {
            da daVar = new da(new v94(this, new q94(this, (byte) 1)));
            this.K = daVar;
            daVar.p(bundle);
        }
        k94Var.a("androidx.savedstate.SavedStateRegistry", new eq(this, (byte) 29));
    }

    @Override // defpackage.j94
    public final i94 a(String str, rm1 rm1Var) {
        return this.I.a(str, rm1Var);
    }

    @Override // defpackage.j94
    public final boolean c(Object obj) {
        return this.I.c(obj);
    }

    @Override // defpackage.j94
    public final Map d() {
        return this.I.d();
    }

    @Override // defpackage.j94
    public final Object e(String str) {
        return this.I.e(str);
    }

    @Override // defpackage.w94
    public final da g() {
        da daVar = this.K;
        if (daVar == null) {
            da daVar2 = new da(new v94(this, new q94(this, (byte) 1)));
            this.K = daVar2;
            daVar2.p(null);
            daVar = daVar2;
        }
        return (da) daVar.K;
    }

    @Override // defpackage.vi2
    public final li2 k() {
        xi2 xi2Var = this.J;
        if (xi2Var != null) {
            return xi2Var;
        }
        xi2 xi2Var2 = new xi2(this, false);
        this.J = xi2Var2;
        return xi2Var2;
    }
}
