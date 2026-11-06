package coil3.network.okhttp;

import coil3.network.NetworkClient;
import coil3.network.NetworkFetcher;
import coil3.network.okhttp.internal.CallFactoryNetworkClient;
import defpackage.eq;
import defpackage.gw2;
import defpackage.mo0;
import defpackage.rm1;
import defpackage.su0;
import defpackage.tm1;
import defpackage.wd3;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class OkHttpNetworkFetcher {
    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkClient OkHttpNetworkFetcherFactory$lambda$0() {
        return asNetworkClient(new OkHttpClient());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkClient OkHttpNetworkFetcherFactory$lambda$2(rm1 rm1Var) {
        return asNetworkClient((Call.Factory) rm1Var.invoke());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkClient OkHttpNetworkFetcherFactory$lambda$4(rm1 rm1Var) {
        return asNetworkClient((Call.Factory) rm1Var.invoke());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkClient OkHttpNetworkFetcherFactory$lambda$6(rm1 rm1Var) {
        return asNetworkClient((Call.Factory) rm1Var.invoke());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkClient OkHttpNetworkFetcherFactory$lambda$9(rm1 rm1Var) {
        return asNetworkClient((Call.Factory) rm1Var.invoke());
    }

    public static final NetworkClient asNetworkClient(Call.Factory factory) {
        return CallFactoryNetworkClient.m94boximpl(CallFactoryNetworkClient.m95constructorimpl(factory));
    }

    public static final NetworkFetcher.Factory factory() {
        return new NetworkFetcher.Factory(new gw2((byte) 11), null, null, null, 14, null);
    }

    public static /* synthetic */ NetworkFetcher.Factory factory$default(rm1 rm1Var, rm1 rm1Var2, tm1 tm1Var, rm1 rm1Var3, int i, Object obj) {
        if ((i & 1) != 0) {
            rm1Var = OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$11.INSTANCE;
        }
        if ((i & 2) != 0) {
            rm1Var2 = new wd3((byte) 1);
        }
        if ((i & 4) != 0) {
            tm1Var = OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$13.INSTANCE;
        }
        if ((i & 8) != 0) {
            rm1Var3 = new wd3((byte) 2);
        }
        return factory(rm1Var, rm1Var2, tm1Var, rm1Var3);
    }

    public static final NetworkFetcher.Factory factory(Call.Factory factory) {
        return new NetworkFetcher.Factory(new eq(factory, (byte) 24), null, null, null, 14, null);
    }

    public static final NetworkFetcher.Factory factory(rm1 rm1Var) {
        return new NetworkFetcher.Factory(new mo0(rm1Var, (byte) 6), null, null, null, 14, null);
    }

    public static final NetworkFetcher.Factory factory(rm1 rm1Var, rm1 rm1Var2) {
        return new NetworkFetcher.Factory(new mo0(rm1Var, (byte) 8), rm1Var2, null, null, 12, null);
    }

    @su0
    public static final /* synthetic */ NetworkFetcher.Factory factory(rm1 rm1Var, rm1 rm1Var2, tm1 tm1Var) {
        return new NetworkFetcher.Factory(new mo0(rm1Var, (byte) 5), rm1Var2, tm1Var, null, 8, null);
    }

    public static final NetworkFetcher.Factory factory(rm1 rm1Var, rm1 rm1Var2, tm1 tm1Var, rm1 rm1Var3) {
        return new NetworkFetcher.Factory(new mo0(rm1Var, (byte) 7), rm1Var2, tm1Var, rm1Var3);
    }

    public static /* synthetic */ NetworkFetcher.Factory factory$default(rm1 rm1Var, rm1 rm1Var2, tm1 tm1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            rm1Var = OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$7.INSTANCE;
        }
        if ((i & 2) != 0) {
            rm1Var2 = new wd3((byte) 3);
        }
        if ((i & 4) != 0) {
            tm1Var = OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$9.INSTANCE;
        }
        return factory(rm1Var, rm1Var2, tm1Var);
    }

    public static /* synthetic */ NetworkFetcher.Factory factory$default(rm1 rm1Var, rm1 rm1Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            rm1Var = OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$4.INSTANCE;
        }
        if ((i & 2) != 0) {
            rm1Var2 = new wd3((byte) 0);
        }
        return factory(rm1Var, rm1Var2);
    }
}
