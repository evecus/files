package okhttp3.internal.cache;

import defpackage.w72;
import defpackage.zy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.internal.cache.DiskLruCache;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DiskLruCache$snapshots$1 implements Iterator<DiskLruCache.Snapshot>, w72 {
    private final Iterator<DiskLruCache.Entry> delegate;
    private DiskLruCache.Snapshot nextSnapshot;
    private DiskLruCache.Snapshot removeSnapshot;
    final /* synthetic */ DiskLruCache this$0;

    public DiskLruCache$snapshots$1(DiskLruCache diskLruCache) {
        this.this$0 = diskLruCache;
        Iterator<DiskLruCache.Entry> it = new ArrayList(diskLruCache.getLruEntries$okhttp().values()).iterator();
        it.getClass();
        this.delegate = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        DiskLruCache.Snapshot snapshot$okhttp;
        if (this.nextSnapshot != null) {
            return true;
        }
        DiskLruCache diskLruCache = this.this$0;
        synchronized (diskLruCache) {
            if (diskLruCache.getClosed$okhttp()) {
                return false;
            }
            while (this.delegate.hasNext()) {
                DiskLruCache.Entry next = this.delegate.next();
                if (next != null && (snapshot$okhttp = next.snapshot$okhttp()) != null) {
                    this.nextSnapshot = snapshot$okhttp;
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.util.Iterator
    public DiskLruCache.Snapshot next() {
        if (!hasNext()) {
            zy.k();
            return null;
        }
        DiskLruCache.Snapshot snapshot = this.nextSnapshot;
        this.removeSnapshot = snapshot;
        this.nextSnapshot = null;
        snapshot.getClass();
        return snapshot;
    }

    @Override // java.util.Iterator
    public void remove() {
        DiskLruCache.Snapshot snapshot = this.removeSnapshot;
        if (snapshot == null) {
            zy.i("remove() before next()");
            return;
        }
        try {
            this.this$0.remove(snapshot.key());
        } catch (IOException unused) {
        } finally {
            this.removeSnapshot = null;
        }
    }
}
