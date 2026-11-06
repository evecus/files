package coil3.network;

import defpackage.fj0;
import defpackage.hn1;
import defpackage.k05;
import defpackage.r24;
import defpackage.rp0;
import defpackage.wd5;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@rp0(c = "coil3.network.NetworkFetcher$doFetch$fetchResult$1", f = "NetworkFetcher.kt", l = {110, 124}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class NetworkFetcher$doFetch$fetchResult$1 extends k05 implements hn1 {
    final /* synthetic */ r24 $cacheResponse;
    final /* synthetic */ NetworkRequest $networkRequest;
    final /* synthetic */ r24 $snapshot;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ NetworkFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$doFetch$fetchResult$1(r24 r24Var, NetworkFetcher networkFetcher, r24 r24Var2, NetworkRequest networkRequest, fj0 fj0Var) {
        super(2, fj0Var);
        this.$snapshot = r24Var;
        this.this$0 = networkFetcher;
        this.$cacheResponse = r24Var2;
        this.$networkRequest = networkRequest;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$1 = new NetworkFetcher$doFetch$fetchResult$1(this.$snapshot, this.this$0, this.$cacheResponse, this.$networkRequest, fj0Var);
        networkFetcher$doFetch$fetchResult$1.L$0 = obj;
        return networkFetcher$doFetch$fetchResult$1;
    }

    @Override // defpackage.hn1
    public final Object invoke(NetworkResponse networkResponse, fj0 fj0Var) {
        return ((NetworkFetcher$doFetch$fetchResult$1) create(networkResponse, fj0Var)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a8, code lost:
    
        if (r12 == r10) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        if (r12 == r10) goto L24;
     */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.L$0
            r5 = r0
            coil3.network.NetworkResponse r5 = (coil3.network.NetworkResponse) r5
            int r0 = r11.label
            java.lang.String r7 = "Content-Type"
            r8 = 2
            r1 = 1
            r9 = 0
            el0 r10 = defpackage.el0.I
            if (r0 == 0) goto L29
            if (r0 == r1) goto L20
            if (r0 != r8) goto L1a
            defpackage.mu0.V(r12)
            r6 = r11
            goto Lab
        L1a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r11)
            return r9
        L20:
            java.lang.Object r0 = r11.L$1
            r24 r0 = (defpackage.r24) r0
            defpackage.mu0.V(r12)
            r6 = r11
            goto L4b
        L29:
            defpackage.mu0.V(r12)
            r24 r0 = r11.$snapshot
            r12 = r1
            coil3.network.NetworkFetcher r1 = r11.this$0
            java.lang.Object r2 = r0.I
            coil3.disk.DiskCache$Snapshot r2 = (coil3.disk.DiskCache.Snapshot) r2
            r24 r3 = r11.$cacheResponse
            java.lang.Object r3 = r3.I
            coil3.network.NetworkResponse r3 = (coil3.network.NetworkResponse) r3
            coil3.network.NetworkRequest r4 = r11.$networkRequest
            r11.L$0 = r5
            r11.L$1 = r0
            r11.label = r12
            r6 = r11
            java.lang.Object r12 = coil3.network.NetworkFetcher.access$writeToDiskCache(r1, r2, r3, r4, r5, r6)
            if (r12 != r10) goto L4b
            goto Laa
        L4b:
            r0.I = r12
            coil3.network.NetworkFetcher r11 = r6.this$0
            coil3.network.NetworkFetcher.access$throwIfFailureResponseCode(r11, r5)
            r24 r11 = r6.$snapshot
            java.lang.Object r11 = r11.I
            if (r11 == 0) goto L9a
            r24 r12 = r6.$cacheResponse
            coil3.network.NetworkFetcher r0 = r6.this$0
            r11.getClass()
            coil3.disk.DiskCache$Snapshot r11 = (coil3.disk.DiskCache.Snapshot) r11
            coil3.network.NetworkResponse r11 = coil3.network.NetworkFetcher.access$toNetworkResponseOrNull(r0, r11)
            r12.I = r11
            coil3.fetch.SourceFetchResult r11 = new coil3.fetch.SourceFetchResult
            coil3.network.NetworkFetcher r12 = r6.this$0
            r24 r0 = r6.$snapshot
            java.lang.Object r0 = r0.I
            r0.getClass()
            coil3.disk.DiskCache$Snapshot r0 = (coil3.disk.DiskCache.Snapshot) r0
            coil3.decode.ImageSource r12 = coil3.network.NetworkFetcher.access$toImageSource(r12, r0)
            coil3.network.NetworkFetcher r0 = r6.this$0
            java.lang.String r1 = coil3.network.NetworkFetcher.access$getUrl$p(r0)
            r24 r2 = r6.$cacheResponse
            java.lang.Object r2 = r2.I
            coil3.network.NetworkResponse r2 = (coil3.network.NetworkResponse) r2
            if (r2 == 0) goto L90
            coil3.network.NetworkHeaders r2 = r2.getHeaders()
            if (r2 == 0) goto L90
            java.lang.String r9 = r2.get(r7)
        L90:
            java.lang.String r0 = r0.getMimeType(r1, r9)
            coil3.decode.DataSource r1 = coil3.decode.DataSource.NETWORK
            r11.<init>(r12, r0, r1)
            return r11
        L9a:
            coil3.network.NetworkResponseBody r11 = coil3.network.internal.UtilsKt.requireBody(r5)
            r6.L$0 = r5
            r6.L$1 = r9
            r6.label = r8
            java.lang.Object r12 = coil3.network.internal.UtilsKt.readBuffer(r11, r6)
            if (r12 != r10) goto Lab
        Laa:
            return r10
        Lab:
            cz r12 = (defpackage.cz) r12
            long r0 = r12.J
            r2 = 0
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 <= 0) goto Ld5
            coil3.fetch.SourceFetchResult r11 = new coil3.fetch.SourceFetchResult
            coil3.network.NetworkFetcher r0 = r6.this$0
            coil3.decode.ImageSource r12 = coil3.network.NetworkFetcher.access$toImageSource(r0, r12)
            coil3.network.NetworkFetcher r0 = r6.this$0
            java.lang.String r1 = coil3.network.NetworkFetcher.access$getUrl$p(r0)
            coil3.network.NetworkHeaders r2 = r5.getHeaders()
            java.lang.String r2 = r2.get(r7)
            java.lang.String r0 = r0.getMimeType(r1, r2)
            coil3.decode.DataSource r1 = coil3.decode.DataSource.NETWORK
            r11.<init>(r12, r0, r1)
            return r11
        Ld5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher$doFetch$fetchResult$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
