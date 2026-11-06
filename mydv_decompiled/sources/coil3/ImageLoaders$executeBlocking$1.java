package coil3;

import coil3.request.ImageRequest;
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
@rp0(c = "coil3.ImageLoaders$executeBlocking$1", f = "imageLoaders.nonJsCommon.kt", l = {18}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class ImageLoaders$executeBlocking$1 extends k05 implements hn1 {
    final /* synthetic */ ImageRequest $request;
    final /* synthetic */ ImageLoader $this_executeBlocking;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaders$executeBlocking$1(ImageLoader imageLoader, ImageRequest imageRequest, fj0 fj0Var) {
        super(2, fj0Var);
        this.$this_executeBlocking = imageLoader;
        this.$request = imageRequest;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new ImageLoaders$executeBlocking$1(this.$this_executeBlocking, this.$request, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(dl0 dl0Var, fj0 fj0Var) {
        return ((ImageLoaders$executeBlocking$1) create(dl0Var, fj0Var)).invokeSuspend(wd5.a);
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
        ImageLoader imageLoader = this.$this_executeBlocking;
        ImageRequest imageRequest = this.$request;
        this.label = 1;
        Object execute = imageLoader.execute(imageRequest, this);
        el0 el0Var = el0.I;
        return execute == el0Var ? el0Var : execute;
    }
}
