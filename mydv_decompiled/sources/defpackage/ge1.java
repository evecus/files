package defpackage;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class ge1 implements Closeable {
    public boolean I;
    public int J;
    public final ReentrantLock K = new ReentrantLock();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.K;
        reentrantLock.lock();
        try {
            if (this.I) {
                return;
            }
            this.I = true;
            if (this.J != 0) {
                return;
            }
            reentrantLock.unlock();
            e();
        } finally {
            reentrantLock.unlock();
        }
    }

    public abstract void e();

    public abstract int g(long j, byte[] bArr, int i, int i2);

    public abstract long n();

    public final long size() {
        ReentrantLock reentrantLock = this.K;
        reentrantLock.lock();
        try {
            if (this.I) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            return n();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final fe1 t(long j) {
        ReentrantLock reentrantLock = this.K;
        reentrantLock.lock();
        try {
            if (this.I) {
                throw new IllegalStateException("closed");
            }
            this.J++;
            reentrantLock.unlock();
            return new fe1(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
