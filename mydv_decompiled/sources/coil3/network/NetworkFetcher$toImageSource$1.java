package coil3.network;

import defpackage.fj0;
import defpackage.gj0;
import defpackage.rp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@rp0(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {273}, m = "toImageSource", v = 1)
/* loaded from: classes2.dex */
public final class NetworkFetcher$toImageSource$1 extends gj0 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NetworkFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$toImageSource$1(NetworkFetcher networkFetcher, fj0 fj0Var) {
        super(fj0Var);
        this.this$0 = networkFetcher;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object imageSource;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        imageSource = this.this$0.toImageSource(null, this);
        return imageSource;
    }
}
