package coil3.network;

import defpackage.fj0;
import defpackage.tm1;
import defpackage.tn1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class NetworkFetcher$fetch$2 extends tn1 implements tm1 {
    public NetworkFetcher$fetch$2(Object obj) {
        super(1, obj, NetworkFetcher.class, "doFetch", "doFetch(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.tm1
    public final Object invoke(fj0 fj0Var) {
        Object doFetch;
        doFetch = ((NetworkFetcher) this.receiver).doFetch(fj0Var);
        return doFetch;
    }
}
