package defpackage;

import coil3.RealImageLoaderKt;
import coil3.network.CacheStrategy;
import coil3.network.ConcurrentRequestStrategy;
import coil3.network.NetworkClient;
import coil3.network.okhttp.OkHttpNetworkFetcher;
import coil3.util.ServiceLoaderComponentRegistry;
import com.github.mytv.dv.model.PlayAddr;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class gw2 implements rm1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ gw2(byte b) {
        this.I = b;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        CacheStrategy cacheStrategy;
        ConcurrentRequestStrategy concurrentRequestStrategy;
        NetworkClient OkHttpNetworkFetcherFactory$lambda$0;
        KSerializer _childSerializers$_anonymous_;
        List addServiceLoaderComponents$lambda$0;
        List addServiceLoaderComponents$lambda$1;
        List fetchers_delegate$lambda$0;
        List decoders_delegate$lambda$0;
        switch (this.I) {
            case 0:
                return new fw2(q80.f(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, Settings.DEFAULT_INITIAL_WINDOW_SIZE), new lc5(), new hn4(), g23.a);
            case 1:
                return new r11(0.0f);
            case 2:
                return new r11(0.0f);
            case 3:
                return wd5.a;
            case 4:
                return new x94();
            case 5:
                l02 l02Var = new l02((byte) 0);
                l02Var.a(s24.a(q63.class), new do2((byte) 11));
                return l02Var.b();
            case 6:
                return null;
            case 7:
                dj0 H = i42.H(l91.I);
                i42.e0(H, null);
                return H;
            case 8:
                cacheStrategy = CacheStrategy.DEFAULT;
                return cacheStrategy;
            case 9:
                concurrentRequestStrategy = ConcurrentRequestStrategy.UNCOORDINATED;
                return concurrentRequestStrategy;
            case 10:
                sx4 sx4Var = sx4.g;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                boolean z = false;
                if (jx4.L("kotlin.Unit")) {
                    s83.t("Blank serial names are prohibited");
                } else {
                    if (sx4Var == sx4.d) {
                        z = true;
                    }
                    if (!z) {
                        l60 l60Var = new l60("kotlin.Unit");
                        return new uj4("kotlin.Unit", sx4Var, l60Var.b.size(), dq.o1(serialDescriptorArr), l60Var);
                    }
                    s83.t("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                return null;
            case 11:
                OkHttpNetworkFetcherFactory$lambda$0 = OkHttpNetworkFetcher.OkHttpNetworkFetcherFactory$lambda$0();
                return OkHttpNetworkFetcherFactory$lambda$0;
            case 12:
                return new jh3();
            case 13:
                return g4.e();
            case 14:
                return null;
            case 15:
                _childSerializers$_anonymous_ = PlayAddr._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 16:
                return null;
            case 17:
                return new wd3((byte) 8);
            case 18:
                addServiceLoaderComponents$lambda$0 = RealImageLoaderKt.addServiceLoaderComponents$lambda$0();
                return addServiceLoaderComponents$lambda$0;
            case 19:
                addServiceLoaderComponents$lambda$1 = RealImageLoaderKt.addServiceLoaderComponents$lambda$1();
                return addServiceLoaderComponents$lambda$1;
            case 20:
                i51 i51Var = d64.a;
                return p70.A;
            case 21:
                return new h94(new LinkedHashMap());
            case 22:
            case 23:
                return null;
            case 24:
                fetchers_delegate$lambda$0 = ServiceLoaderComponentRegistry.fetchers_delegate$lambda$0();
                return fetchers_delegate$lambda$0;
            case 25:
                decoders_delegate$lambda$0 = ServiceLoaderComponentRegistry.decoders_delegate$lambda$0();
                return decoders_delegate$lambda$0;
            case 26:
                return new hn4();
            case 27:
                return zt4.d;
            case 28:
                return oc5.a;
            default:
                return bt0.a();
        }
    }

    public /* synthetic */ gw2(Object obj, byte b) {
        this.I = b;
    }
}
