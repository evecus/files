package coil3;

import coil3.request.ImageRequest;
import defpackage.dl0;
import defpackage.el0;
import defpackage.fj0;
import defpackage.hn1;
import defpackage.k05;
import defpackage.kt0;
import defpackage.mu0;
import defpackage.p70;
import defpackage.rp0;
import defpackage.tk0;
import defpackage.wd5;
import defpackage.zy;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@rp0(c = "coil3.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {88}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class RealImageLoader$execute$2 extends k05 implements hn1 {
    final /* synthetic */ ImageRequest $request;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ RealImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$2(RealImageLoader realImageLoader, ImageRequest imageRequest, fj0 fj0Var) {
        super(2, fj0Var);
        this.this$0 = realImageLoader;
        this.$request = imageRequest;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        RealImageLoader$execute$2 realImageLoader$execute$2 = new RealImageLoader$execute$2(this.this$0, this.$request, fj0Var);
        realImageLoader$execute$2.L$0 = obj;
        return realImageLoader$execute$2;
    }

    @Override // defpackage.hn1
    public final Object invoke(dl0 dl0Var, fj0 fj0Var) {
        return ((RealImageLoader$execute$2) create(dl0Var, fj0Var)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        dl0 dl0Var = (dl0) this.L$0;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mu0.V(obj);
            return obj;
        }
        mu0.V(obj);
        kt0 job = RealImageLoader_androidKt.getDisposable(this.$request, p70.y(dl0Var, (tk0) this.this$0.getOptions().getMainCoroutineContextLazy().getValue(), new RealImageLoader$execute$2$job$1(this.this$0, this.$request, null), 2)).getJob();
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        Object M = job.M(this);
        el0 el0Var = el0.I;
        return M == el0Var ? el0Var : M;
    }
}
