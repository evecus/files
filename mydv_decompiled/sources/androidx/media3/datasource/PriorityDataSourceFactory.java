package androidx.media3.datasource;

import androidx.media3.common.PriorityTaskManager;
import androidx.media3.datasource.DataSource;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@Deprecated
/* loaded from: classes2.dex */
public final class PriorityDataSourceFactory implements DataSource.Factory {
    private final int priority;
    private final PriorityTaskManager priorityTaskManager;
    private final DataSource.Factory upstreamFactory;

    public PriorityDataSourceFactory(DataSource.Factory factory, PriorityTaskManager priorityTaskManager, int i) {
        this.upstreamFactory = factory;
        this.priorityTaskManager = priorityTaskManager;
        this.priority = i;
    }

    @Override // androidx.media3.datasource.DataSource.Factory
    public PriorityDataSource createDataSource() {
        return new PriorityDataSource(this.upstreamFactory.createDataSource(), this.priorityTaskManager, this.priority);
    }
}
