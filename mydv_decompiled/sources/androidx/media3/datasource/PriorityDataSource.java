package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.datasource.DataSource;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class PriorityDataSource implements DataSource {
    private final int priority;
    private final PriorityTaskManager priorityTaskManager;
    private final DataSource upstream;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Factory implements DataSource.Factory {
        private final int priority;
        private final PriorityTaskManager priorityTaskManager;
        private final DataSource.Factory upstreamFactory;

        public Factory(DataSource.Factory factory, PriorityTaskManager priorityTaskManager, int i) {
            this.upstreamFactory = factory;
            this.priorityTaskManager = priorityTaskManager;
            this.priority = i;
        }

        @Override // androidx.media3.datasource.DataSource.Factory
        public PriorityDataSource createDataSource() {
            return new PriorityDataSource(this.upstreamFactory.createDataSource(), this.priorityTaskManager, this.priority);
        }
    }

    public PriorityDataSource(DataSource dataSource, PriorityTaskManager priorityTaskManager, int i) {
        dataSource.getClass();
        this.upstream = dataSource;
        priorityTaskManager.getClass();
        this.priorityTaskManager = priorityTaskManager;
        this.priority = i;
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(TransferListener transferListener) {
        transferListener.getClass();
        this.upstream.addTransferListener(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        this.upstream.close();
    }

    @Override // androidx.media3.datasource.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        return this.upstream.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.DataSource
    public Uri getUri() {
        return this.upstream.getUri();
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) {
        this.priorityTaskManager.proceedOrThrow(this.priority);
        return this.upstream.open(dataSpec);
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) {
        this.priorityTaskManager.proceedOrThrow(this.priority);
        return this.upstream.read(bArr, i, i2);
    }
}
