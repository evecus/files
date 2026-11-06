package coil3.network;

import coil3.decode.DataSource;
import coil3.decode.ImageSource;
import coil3.fetch.SourceFetchResult;
import coil3.network.internal.UtilsKt;
import defpackage.el0;
import defpackage.fj0;
import defpackage.hn1;
import defpackage.k05;
import defpackage.mu0;
import defpackage.rp0;
import defpackage.wd5;
import defpackage.zy;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@rp0(c = "coil3.network.NetworkFetcher$doFetch$2", f = "NetworkFetcher.kt", l = {141}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class NetworkFetcher$doFetch$2 extends k05 implements hn1 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NetworkFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$doFetch$2(NetworkFetcher networkFetcher, fj0 fj0Var) {
        super(2, fj0Var);
        this.this$0 = networkFetcher;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        NetworkFetcher$doFetch$2 networkFetcher$doFetch$2 = new NetworkFetcher$doFetch$2(this.this$0, fj0Var);
        networkFetcher$doFetch$2.L$0 = obj;
        return networkFetcher$doFetch$2;
    }

    @Override // defpackage.hn1
    public final Object invoke(NetworkResponse networkResponse, fj0 fj0Var) {
        return ((NetworkFetcher$doFetch$2) create(networkResponse, fj0Var)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        String str;
        NetworkResponse networkResponse = (NetworkResponse) this.L$0;
        int i = this.label;
        if (i == 0) {
            mu0.V(obj);
            NetworkFetcher networkFetcher = this.this$0;
            NetworkResponseBody requireBody = UtilsKt.requireBody(networkResponse);
            this.L$0 = networkResponse;
            this.label = 1;
            obj = networkFetcher.toImageSource(requireBody, this);
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
        }
        NetworkFetcher networkFetcher2 = this.this$0;
        str = networkFetcher2.url;
        return new SourceFetchResult((ImageSource) obj, networkFetcher2.getMimeType(str, networkResponse.getHeaders().get(UtilsKt.CONTENT_TYPE)), DataSource.NETWORK);
    }
}
