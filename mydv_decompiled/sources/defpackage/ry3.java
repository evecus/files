package defpackage;

import android.webkit.WebStorage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ry3 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry3() {
        super(2, null);
        this.I = (byte) 1;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                ry3 ry3Var = new ry3(2, fj0Var, (byte) 0);
                ry3Var.J = obj;
                return ry3Var;
            default:
                ry3 ry3Var2 = new ry3(2, fj0Var, (byte) 1);
                ry3Var2.J = obj;
                return ry3Var2;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return ((ry3) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            default:
                return ((ry3) create((d14) obj, (fj0) obj2)).invokeSuspend(wd5Var);
        }
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object g54Var;
        switch (this.I) {
            case 0:
                mu0.V(obj);
                try {
                    WebStorage.getInstance().deleteAllData();
                    g54Var = wd5.a;
                } catch (Throwable th) {
                    g54Var = new g54(th);
                }
                return new h54(g54Var);
            default:
                mu0.V(obj);
                return Boolean.valueOf(((d14) this.J).compareTo(d14.M) > 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ry3(int i, fj0 fj0Var, byte b) {
        super(i, fj0Var);
        this.I = b;
    }
}
