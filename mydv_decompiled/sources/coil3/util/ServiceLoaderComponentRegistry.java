package coil3.util;

import defpackage.gw2;
import defpackage.qj4;
import defpackage.u05;
import defpackage.uc2;
import java.util.List;
import java.util.ServiceLoader;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ServiceLoaderComponentRegistry {
    public static final ServiceLoaderComponentRegistry INSTANCE = new ServiceLoaderComponentRegistry();
    private static final uc2 fetchers$delegate = new u05(new gw2(24));
    private static final uc2 decoders$delegate = new u05(new gw2(25));

    private ServiceLoaderComponentRegistry() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List decoders_delegate$lambda$0() {
        return Collections_jvmCommonKt.toImmutableList(qj4.z(qj4.w(ServiceLoader.load(DecoderServiceLoaderTarget.class, DecoderServiceLoaderTarget.class.getClassLoader()).iterator())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List fetchers_delegate$lambda$0() {
        return Collections_jvmCommonKt.toImmutableList(qj4.z(qj4.w(ServiceLoader.load(FetcherServiceLoaderTarget.class, FetcherServiceLoaderTarget.class.getClassLoader()).iterator())));
    }

    public final List<DecoderServiceLoaderTarget> getDecoders() {
        return (List) decoders$delegate.getValue();
    }

    public final List<FetcherServiceLoaderTarget<?>> getFetchers() {
        return (List) fetchers$delegate.getValue();
    }

    public final void register(FetcherServiceLoaderTarget<?> fetcherServiceLoaderTarget) {
        throw new UnsupportedOperationException();
    }

    public final void register(DecoderServiceLoaderTarget decoderServiceLoaderTarget) {
        throw new UnsupportedOperationException();
    }
}
