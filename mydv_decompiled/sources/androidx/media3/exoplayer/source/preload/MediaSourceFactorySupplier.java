package androidx.media3.exoplayer.source.preload;

import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.cache.Cache;
import defpackage.gz4;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public interface MediaSourceFactorySupplier extends gz4 {
    @Override // defpackage.gz4
    /* synthetic */ Object get();

    MediaSourceFactorySupplier setCache(Cache cache);

    MediaSourceFactorySupplier setDataSourceFactory(DataSource.Factory factory);
}
