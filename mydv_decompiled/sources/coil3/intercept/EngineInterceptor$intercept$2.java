package coil3.intercept;

import coil3.EventListener;
import coil3.intercept.EngineInterceptor;
import coil3.intercept.Interceptor;
import coil3.memory.MemoryCache;
import coil3.memory.MemoryCacheService;
import coil3.request.ImageRequest;
import coil3.request.Options;
import coil3.request.SuccessResult;
import coil3.util.SystemCallbacks;
import coil3.util.UtilsKt;
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
@rp0(c = "coil3.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {77}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class EngineInterceptor$intercept$2 extends k05 implements hn1 {
    final /* synthetic */ MemoryCache.Key $cacheKey;
    final /* synthetic */ Interceptor.Chain $chain;
    final /* synthetic */ EventListener $eventListener;
    final /* synthetic */ Object $mappedData;
    final /* synthetic */ Options $options;
    final /* synthetic */ ImageRequest $request;
    int label;
    final /* synthetic */ EngineInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$2(EngineInterceptor engineInterceptor, ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, MemoryCache.Key key, Interceptor.Chain chain, fj0 fj0Var) {
        super(2, fj0Var);
        this.this$0 = engineInterceptor;
        this.$request = imageRequest;
        this.$mappedData = obj;
        this.$options = options;
        this.$eventListener = eventListener;
        this.$cacheKey = key;
        this.$chain = chain;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new EngineInterceptor$intercept$2(this.this$0, this.$request, this.$mappedData, this.$options, this.$eventListener, this.$cacheKey, this.$chain, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(dl0 dl0Var, fj0 fj0Var) {
        return ((EngineInterceptor$intercept$2) create(dl0Var, fj0Var)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        EngineInterceptor$intercept$2 engineInterceptor$intercept$2;
        SystemCallbacks systemCallbacks;
        MemoryCacheService memoryCacheService;
        int i = this.label;
        if (i == 0) {
            mu0.V(obj);
            EngineInterceptor engineInterceptor = this.this$0;
            ImageRequest imageRequest = this.$request;
            Object obj2 = this.$mappedData;
            Options options = this.$options;
            EventListener eventListener = this.$eventListener;
            this.label = 1;
            engineInterceptor$intercept$2 = this;
            obj = engineInterceptor.execute(imageRequest, obj2, options, eventListener, engineInterceptor$intercept$2);
            el0 el0Var = el0.I;
            if (obj == el0Var) {
                return el0Var;
            }
        } else {
            if (i != 1) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mu0.V(obj);
            engineInterceptor$intercept$2 = this;
        }
        EngineInterceptor.ExecuteResult executeResult = (EngineInterceptor.ExecuteResult) obj;
        systemCallbacks = engineInterceptor$intercept$2.this$0.systemCallbacks;
        systemCallbacks.registerMemoryPressureCallbacks();
        memoryCacheService = engineInterceptor$intercept$2.this$0.memoryCacheService;
        return new SuccessResult(executeResult.getImage(), engineInterceptor$intercept$2.$request, executeResult.getDataSource(), memoryCacheService.setCacheValue(engineInterceptor$intercept$2.$cacheKey, engineInterceptor$intercept$2.$request, executeResult) ? engineInterceptor$intercept$2.$cacheKey : null, executeResult.getDiskCacheKey(), executeResult.isSampled(), UtilsKt.isPlaceholderCached(engineInterceptor$intercept$2.$chain));
    }
}
