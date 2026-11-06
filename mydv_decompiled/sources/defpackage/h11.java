package defpackage;

import com.github.mytv.dv.model.SearchUserResponse;
import com.github.mytv.dv.model.SearchVideoWorkResponse;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class h11 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ n11 J;
    public final /* synthetic */ String K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h11(n11 n11Var, String str, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.J = n11Var;
        this.K = str;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                return new h11(this.J, this.K, fj0Var, (byte) 0);
            default:
                return new h11(this.J, this.K, fj0Var, (byte) 1);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((h11) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        String str = this.K;
        n11 n11Var = this.J;
        switch (b) {
            case 0:
                mu0.V(obj);
                z62 z62Var = n11Var.c;
                o63 o63Var = z62Var.b;
                return z62Var.b(str, SearchVideoWorkResponse.Companion.serializer());
            default:
                mu0.V(obj);
                z62 z62Var2 = n11Var.c;
                o63 o63Var2 = z62Var2.b;
                return z62Var2.b(str, SearchUserResponse.Companion.serializer());
        }
    }
}
