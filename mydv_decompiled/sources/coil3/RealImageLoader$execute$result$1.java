package coil3;

import coil3.intercept.RealInterceptorChain;
import coil3.request.ImageRequest;
import coil3.size.Size;
import defpackage.dl0;
import defpackage.el0;
import defpackage.fj0;
import defpackage.hn1;
import defpackage.k05;
import defpackage.mu0;
import defpackage.rp0;
import defpackage.wd5;
import defpackage.zy;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@rp0(c = "coil3.RealImageLoader$execute$result$1", f = "RealImageLoader.kt", l = {143}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class RealImageLoader$execute$result$1 extends k05 implements hn1 {
    final /* synthetic */ Image $cachedPlaceholder;
    final /* synthetic */ EventListener $eventListener;
    final /* synthetic */ ImageRequest $request;
    final /* synthetic */ Size $size;
    int label;
    final /* synthetic */ RealImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$result$1(ImageRequest imageRequest, RealImageLoader realImageLoader, Size size, EventListener eventListener, Image image, fj0 fj0Var) {
        super(2, fj0Var);
        this.$request = imageRequest;
        this.this$0 = realImageLoader;
        this.$size = size;
        this.$eventListener = eventListener;
        this.$cachedPlaceholder = image;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new RealImageLoader$execute$result$1(this.$request, this.this$0, this.$size, this.$eventListener, this.$cachedPlaceholder, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(dl0 dl0Var, fj0 fj0Var) {
        return ((RealImageLoader$execute$result$1) create(dl0Var, fj0Var)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                mu0.V(obj);
                return obj;
            }
            zy.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mu0.V(obj);
        RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this.$request, this.this$0.getComponents().getInterceptors(), 0, this.$request, this.$size, this.$eventListener, this.$cachedPlaceholder != null);
        this.label = 1;
        Object proceed = realInterceptorChain.proceed(this);
        el0 el0Var = el0.I;
        return proceed == el0Var ? el0Var : proceed;
    }
}
