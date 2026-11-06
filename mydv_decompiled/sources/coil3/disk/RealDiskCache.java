package coil3.disk;

import coil3.disk.DiskCache;
import coil3.disk.DiskLruCache;
import defpackage.er0;
import defpackage.h00;
import defpackage.jp;
import defpackage.ke1;
import defpackage.ok3;
import defpackage.tk0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class RealDiskCache implements DiskCache {
    public static final Companion Companion = new Companion(null);
    private static final int ENTRY_DATA = 1;
    private static final int ENTRY_METADATA = 0;
    private final DiskLruCache cache;
    private final ok3 directory;
    private final ke1 fileSystem;
    private final long maxSize;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class RealEditor implements DiskCache.Editor {
        private final DiskLruCache.Editor editor;

        public RealEditor(DiskLruCache.Editor editor) {
            this.editor = editor;
        }

        @Override // coil3.disk.DiskCache.Editor
        public void abort() {
            this.editor.abort();
        }

        @Override // coil3.disk.DiskCache.Editor
        public void commit() {
            this.editor.commit();
        }

        @Override // coil3.disk.DiskCache.Editor
        public RealSnapshot commitAndOpenSnapshot() {
            DiskLruCache.Snapshot commitAndGet = this.editor.commitAndGet();
            if (commitAndGet != null) {
                return new RealSnapshot(commitAndGet);
            }
            return null;
        }

        @Override // coil3.disk.DiskCache.Editor
        public ok3 getData() {
            return this.editor.file(1);
        }

        @Override // coil3.disk.DiskCache.Editor
        public ok3 getMetadata() {
            return this.editor.file(0);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class RealSnapshot implements DiskCache.Snapshot {
        private final DiskLruCache.Snapshot snapshot;

        public RealSnapshot(DiskLruCache.Snapshot snapshot) {
            this.snapshot = snapshot;
        }

        @Override // coil3.disk.DiskCache.Snapshot, java.lang.AutoCloseable
        public void close() {
            this.snapshot.close();
        }

        @Override // coil3.disk.DiskCache.Snapshot
        public RealEditor closeAndOpenEditor() {
            DiskLruCache.Editor closeAndEdit = this.snapshot.closeAndEdit();
            if (closeAndEdit != null) {
                return new RealEditor(closeAndEdit);
            }
            return null;
        }

        @Override // coil3.disk.DiskCache.Snapshot
        public ok3 getData() {
            return this.snapshot.file(1);
        }

        @Override // coil3.disk.DiskCache.Snapshot
        public ok3 getMetadata() {
            return this.snapshot.file(0);
        }
    }

    public RealDiskCache(long j, ok3 ok3Var, ke1 ke1Var, tk0 tk0Var) {
        this.maxSize = j;
        this.directory = ok3Var;
        this.fileSystem = ke1Var;
        this.cache = new DiskLruCache(getFileSystem(), getDirectory(), tk0Var, getMaxSize(), 3, 2);
    }

    private final String hash(String str) {
        h00 h00Var = h00.L;
        return jp.h(str).c("SHA-256").e();
    }

    @Override // coil3.disk.DiskCache
    public void clear() {
        this.cache.evictAll();
    }

    @Override // coil3.disk.DiskCache
    public ok3 getDirectory() {
        return this.directory;
    }

    @Override // coil3.disk.DiskCache
    public ke1 getFileSystem() {
        return this.fileSystem;
    }

    @Override // coil3.disk.DiskCache
    public long getMaxSize() {
        return this.maxSize;
    }

    @Override // coil3.disk.DiskCache
    public long getSize() {
        return this.cache.size();
    }

    @Override // coil3.disk.DiskCache
    public DiskCache.Editor openEditor(String str) {
        DiskLruCache.Editor edit = this.cache.edit(hash(str));
        if (edit != null) {
            return new RealEditor(edit);
        }
        return null;
    }

    @Override // coil3.disk.DiskCache
    public DiskCache.Snapshot openSnapshot(String str) {
        DiskLruCache.Snapshot snapshot = this.cache.get(hash(str));
        if (snapshot != null) {
            return new RealSnapshot(snapshot);
        }
        return null;
    }

    @Override // coil3.disk.DiskCache
    public boolean remove(String str) {
        return this.cache.remove(hash(str));
    }

    @Override // coil3.disk.DiskCache
    public void shutdown() {
        coil3.util.UtilsKt.closeQuietly(this.cache);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private Companion() {
        }
    }
}
