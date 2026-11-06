package coil3;

import android.graphics.Bitmap;
import coil3.ComponentRegistry;
import coil3.RealImageLoader;
import coil3.decode.Decoder;
import coil3.fetch.BitmapFetcher;
import coil3.fetch.ByteArrayFetcher;
import coil3.fetch.DataUriFetcher;
import coil3.fetch.Fetcher;
import coil3.fetch.FileUriFetcher;
import coil3.key.FileUriKeyer;
import coil3.key.UriKeyer;
import coil3.map.PathMapper;
import coil3.map.StringMapper;
import coil3.util.DecoderServiceLoaderTarget;
import coil3.util.FetcherServiceLoaderTarget;
import coil3.util.Logger;
import coil3.util.ServiceLoaderComponentRegistry;
import defpackage.dl0;
import defpackage.gw2;
import defpackage.i42;
import defpackage.o70;
import defpackage.ok3;
import defpackage.p70;
import defpackage.s24;
import defpackage.t72;
import defpackage.ui4;
import defpackage.uj3;
import defpackage.wk0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class RealImageLoaderKt {
    private static final int REQUEST_TYPE_ENQUEUE = 0;
    private static final int REQUEST_TYPE_EXECUTE = 1;
    private static final String TAG = "RealImageLoader";

    /* JADX INFO: Access modifiers changed from: private */
    public static final dl0 CoroutineScope(Logger logger) {
        return i42.H(p70.p0(ui4.b(), new RealImageLoaderKt$CoroutineScope$$inlined$CoroutineExceptionHandler$1(wk0.I, logger)));
    }

    public static final ComponentRegistry.Builder addCommonComponents(ComponentRegistry.Builder builder) {
        return builder.add(new StringMapper(), s24.a(String.class)).add(new PathMapper(), s24.a(ok3.class)).add(new FileUriKeyer(), s24.a(Uri.class)).add(new UriKeyer(), s24.a(Uri.class)).add(new FileUriFetcher.Factory(), s24.a(Uri.class)).add(new ByteArrayFetcher.Factory(), s24.a(byte[].class)).add(new DataUriFetcher.Factory(), s24.a(Uri.class)).add(new BitmapFetcher.Factory(), s24.a(Bitmap.class));
    }

    public static final ComponentRegistry.Builder addServiceLoaderComponents(ComponentRegistry.Builder builder, RealImageLoader.Options options) {
        if (ImageLoadersKt.getServiceLoaderEnabled(options)) {
            builder.addFetcherFactories(new gw2((byte) 18));
            builder.addDecoderFactories(new gw2((byte) 19));
        }
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List addServiceLoaderComponents$lambda$0() {
        t72 type;
        List k1 = o70.k1(ServiceLoaderComponentRegistry.INSTANCE.getFetchers(), new Comparator() { // from class: coil3.RealImageLoaderKt$addServiceLoaderComponents$lambda$0$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Integer.valueOf(((FetcherServiceLoaderTarget) t2).priority()).compareTo(Integer.valueOf(((FetcherServiceLoaderTarget) t).priority()));
            }
        });
        ArrayList arrayList = new ArrayList();
        int size = k1.size();
        for (int i = 0; i < size; i++) {
            FetcherServiceLoaderTarget fetcherServiceLoaderTarget = (FetcherServiceLoaderTarget) k1.get(i);
            fetcherServiceLoaderTarget.getClass();
            Fetcher.Factory factory = fetcherServiceLoaderTarget.factory();
            uj3 uj3Var = null;
            if (factory != null && (type = fetcherServiceLoaderTarget.type()) != null) {
                uj3Var = new uj3(factory, type);
            }
            if (uj3Var != null) {
                arrayList.add(uj3Var);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List addServiceLoaderComponents$lambda$1() {
        List k1 = o70.k1(ServiceLoaderComponentRegistry.INSTANCE.getDecoders(), new Comparator() { // from class: coil3.RealImageLoaderKt$addServiceLoaderComponents$lambda$1$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Integer.valueOf(((DecoderServiceLoaderTarget) t2).priority()).compareTo(Integer.valueOf(((DecoderServiceLoaderTarget) t).priority()));
            }
        });
        ArrayList arrayList = new ArrayList();
        int size = k1.size();
        for (int i = 0; i < size; i++) {
            Decoder.Factory factory = ((DecoderServiceLoaderTarget) k1.get(i)).factory();
            if (factory != null) {
                arrayList.add(factory);
            }
        }
        return arrayList;
    }
}
