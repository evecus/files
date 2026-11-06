package coil3.disk;

import coil3.util.FileSystems_androidKt;
import coil3.util.FileSystems_nonJsCommonKt;
import defpackage.ke1;
import defpackage.l91;
import defpackage.ok3;
import defpackage.s83;
import defpackage.su0;
import defpackage.tk0;
import defpackage.ut0;
import defpackage.vk0;
import defpackage.zy;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface DiskCache {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private ok3 directory;
        private long maxSizeBytes;
        private ke1 fileSystem = FileSystems_nonJsCommonKt.defaultFileSystem();
        private double maxSizePercent = 0.02d;
        private long minimumMaxSizeBytes = 10485760;
        private long maximumMaxSizeBytes = 262144000;
        private tk0 cleanupCoroutineContext = l91.I;

        public final DiskCache build() {
            long j;
            ok3 ok3Var = this.directory;
            if (ok3Var == null) {
                zy.i("directory == null");
                return null;
            }
            double d = this.maxSizePercent;
            if (d > 0.0d) {
                try {
                    j = ut0.s((long) (d * FileSystems_androidKt.remainingFreeSpaceBytes(this.fileSystem, ok3Var)), this.minimumMaxSizeBytes, this.maximumMaxSizeBytes);
                } catch (Exception unused) {
                    j = this.minimumMaxSizeBytes;
                }
            } else {
                j = this.maxSizeBytes;
            }
            return new RealDiskCache(j, ok3Var, this.fileSystem, this.cleanupCoroutineContext);
        }

        public final Builder cleanupCoroutineContext(tk0 tk0Var) {
            this.cleanupCoroutineContext = tk0Var;
            return this;
        }

        @su0
        public final Builder cleanupDispatcher(vk0 vk0Var) {
            return cleanupCoroutineContext(vk0Var);
        }

        public final Builder directory(ok3 ok3Var) {
            this.directory = ok3Var;
            return this;
        }

        public final Builder fileSystem(ke1 ke1Var) {
            this.fileSystem = ke1Var;
            return this;
        }

        public final Builder maxSizeBytes(long j) {
            if (j <= 0) {
                s83.t("size must be > 0.");
                return null;
            }
            this.maxSizePercent = 0.0d;
            this.maxSizeBytes = j;
            return this;
        }

        public final Builder maxSizePercent(double d) {
            if (0.0d > d || d > 1.0d) {
                s83.t("percent must be in the range [0.0, 1.0].");
                return null;
            }
            this.maxSizeBytes = 0L;
            this.maxSizePercent = d;
            return this;
        }

        public final Builder maximumMaxSizeBytes(long j) {
            if (j > 0) {
                this.maximumMaxSizeBytes = j;
                return this;
            }
            s83.t("size must be > 0.");
            return null;
        }

        public final Builder minimumMaxSizeBytes(long j) {
            if (j > 0) {
                this.minimumMaxSizeBytes = j;
                return this;
            }
            s83.t("size must be > 0.");
            return null;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Editor {
        void abort();

        void commit();

        Snapshot commitAndOpenSnapshot();

        ok3 getData();

        ok3 getMetadata();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Snapshot extends AutoCloseable {
        @Override // java.lang.AutoCloseable
        void close();

        Editor closeAndOpenEditor();

        ok3 getData();

        ok3 getMetadata();
    }

    void clear();

    ok3 getDirectory();

    ke1 getFileSystem();

    long getMaxSize();

    long getSize();

    Editor openEditor(String str);

    Snapshot openSnapshot(String str);

    boolean remove(String str);

    void shutdown();
}
