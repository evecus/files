package androidx.media3.exoplayer.hls;

import androidx.media3.datasource.DataSource;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DefaultHlsDataSourceFactory implements HlsDataSourceFactory {
    private final DataSource.Factory dataSourceFactory;

    public DefaultHlsDataSourceFactory(DataSource.Factory factory) {
        this.dataSourceFactory = factory;
    }

    @Override // androidx.media3.exoplayer.hls.HlsDataSourceFactory
    public DataSource createDataSource(int i) {
        return this.dataSourceFactory.createDataSource();
    }
}
