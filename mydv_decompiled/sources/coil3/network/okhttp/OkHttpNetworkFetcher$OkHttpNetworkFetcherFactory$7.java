package coil3.network.okhttp;

import defpackage.rm1;
import defpackage.tn1;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$7 extends tn1 implements rm1 {
    public static final OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$7 INSTANCE = new OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$7();

    public OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$7() {
        super(0, OkHttpClient.class, "<init>", "<init>()V", 0);
    }

    @Override // defpackage.rm1
    public final OkHttpClient invoke() {
        return new OkHttpClient();
    }
}
