package coil3;

import coil3.ComponentRegistry;
import coil3.RealImageLoader;
import coil3.fetch.ByteBufferFetcher;
import coil3.fetch.JarFileFetcher;
import coil3.map.FileMapper;
import defpackage.s24;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class RealImageLoader_jvmCommonKt {
    public static final ComponentRegistry.Builder addJvmComponents(ComponentRegistry.Builder builder, RealImageLoader.Options options) {
        return builder.add(new FileMapper(), s24.a(File.class)).add(new JarFileFetcher.Factory(), s24.a(Uri.class)).add(new ByteBufferFetcher.Factory(), s24.a(ByteBuffer.class));
    }
}
