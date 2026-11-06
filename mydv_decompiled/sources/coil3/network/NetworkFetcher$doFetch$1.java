package coil3.network;

import androidx.media3.extractor.ts.TsExtractor;
import defpackage.fj0;
import defpackage.gj0;
import defpackage.rp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@rp0(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {84, 108, TsExtractor.TS_STREAM_TYPE_DTS_UHD}, m = "doFetch", v = 1)
/* loaded from: classes.dex */
public final class NetworkFetcher$doFetch$1 extends gj0 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NetworkFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$doFetch$1(NetworkFetcher networkFetcher, fj0 fj0Var) {
        super(fj0Var);
        this.this$0 = networkFetcher;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object doFetch;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        doFetch = this.this$0.doFetch(this);
        return doFetch;
    }
}
