package coil3.intercept;

import coil3.ComponentRegistry;
import coil3.EventListener;
import coil3.fetch.SourceFetchResult;
import coil3.request.ImageRequest;
import coil3.request.Options;
import defpackage.dl0;
import defpackage.el0;
import defpackage.fj0;
import defpackage.hn1;
import defpackage.k05;
import defpackage.mu0;
import defpackage.r24;
import defpackage.rp0;
import defpackage.wd5;
import defpackage.zy;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@rp0(c = "coil3.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {131}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class EngineInterceptor$execute$executeResult$1 extends k05 implements hn1 {
    final /* synthetic */ r24 $components;
    final /* synthetic */ EventListener $eventListener;
    final /* synthetic */ r24 $fetchResult;
    final /* synthetic */ Object $mappedData;
    final /* synthetic */ r24 $options;
    final /* synthetic */ ImageRequest $request;
    int label;
    final /* synthetic */ EngineInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$execute$executeResult$1(EngineInterceptor engineInterceptor, r24 r24Var, r24 r24Var2, ImageRequest imageRequest, Object obj, r24 r24Var3, EventListener eventListener, fj0 fj0Var) {
        super(2, fj0Var);
        this.this$0 = engineInterceptor;
        this.$fetchResult = r24Var;
        this.$components = r24Var2;
        this.$request = imageRequest;
        this.$mappedData = obj;
        this.$options = r24Var3;
        this.$eventListener = eventListener;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new EngineInterceptor$execute$executeResult$1(this.this$0, this.$fetchResult, this.$components, this.$request, this.$mappedData, this.$options, this.$eventListener, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(dl0 dl0Var, fj0 fj0Var) {
        return ((EngineInterceptor$execute$executeResult$1) create(dl0Var, fj0Var)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object decode;
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
        EngineInterceptor engineInterceptor = this.this$0;
        SourceFetchResult sourceFetchResult = (SourceFetchResult) this.$fetchResult.I;
        ComponentRegistry componentRegistry = (ComponentRegistry) this.$components.I;
        ImageRequest imageRequest = this.$request;
        Object obj2 = this.$mappedData;
        Options options = (Options) this.$options.I;
        EventListener eventListener = this.$eventListener;
        this.label = 1;
        decode = engineInterceptor.decode(sourceFetchResult, componentRegistry, imageRequest, obj2, options, eventListener, this);
        el0 el0Var = el0.I;
        return decode == el0Var ? el0Var : decode;
    }
}
