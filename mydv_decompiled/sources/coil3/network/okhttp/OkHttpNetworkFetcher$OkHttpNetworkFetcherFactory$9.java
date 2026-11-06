package coil3.network.okhttp;

import android.content.Context;
import coil3.network.ConnectivityChecker;
import coil3.network.ConnectivityCheckerKt;
import defpackage.tm1;
import defpackage.tn1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$9 extends tn1 implements tm1 {
    public static final OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$9 INSTANCE = new OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$9();

    public OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$9() {
        super(1, ConnectivityCheckerKt.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);
    }

    @Override // defpackage.tm1
    public final ConnectivityChecker invoke(Context context) {
        return ConnectivityCheckerKt.ConnectivityChecker(context);
    }
}
