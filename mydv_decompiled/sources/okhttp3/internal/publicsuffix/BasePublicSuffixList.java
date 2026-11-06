package okhttp3.internal.publicsuffix;

import defpackage.h00;
import defpackage.j42;
import defpackage.s04;
import defpackage.sv2;
import defpackage.ut4;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class BasePublicSuffixList implements PublicSuffixList {
    public h00 bytes;
    public h00 exceptionBytes;
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);
    private IOException readFailure;

    private final void readTheList() {
        try {
            s04 m = sv2.m(listSource());
            try {
                h00 i = m.i(m.readInt());
                h00 i2 = m.i(m.readInt());
                m.close();
                synchronized (this) {
                    i.getClass();
                    setBytes(i);
                    i2.getClass();
                    setExceptionBytes(i2);
                }
            } finally {
            }
        } finally {
            this.readCompleteLatch.countDown();
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    this.readFailure = e;
                    if (!z) {
                        return;
                    }
                }
            } finally {
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    public void ensureLoaded() {
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        if (this.bytes != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unable to load " + getPath() + " resource.");
        illegalStateException.initCause(this.readFailure);
        throw illegalStateException;
    }

    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    public h00 getBytes() {
        h00 h00Var = this.bytes;
        if (h00Var != null) {
            return h00Var;
        }
        j42.g0("bytes");
        throw null;
    }

    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    public h00 getExceptionBytes() {
        h00 h00Var = this.exceptionBytes;
        if (h00Var != null) {
            return h00Var;
        }
        j42.g0("exceptionBytes");
        throw null;
    }

    public abstract Object getPath();

    public abstract ut4 listSource();

    public void setBytes(h00 h00Var) {
        h00Var.getClass();
        this.bytes = h00Var;
    }

    public void setExceptionBytes(h00 h00Var) {
        h00Var.getClass();
        this.exceptionBytes = h00Var;
    }
}
