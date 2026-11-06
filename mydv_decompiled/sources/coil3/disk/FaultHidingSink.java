package coil3.disk;

import defpackage.cz;
import defpackage.eq4;
import defpackage.tm1;
import defpackage.u75;
import java.io.IOException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class FaultHidingSink implements eq4 {
    private final eq4 delegate;
    private boolean hasErrors;
    private final tm1 onException;

    public FaultHidingSink(eq4 eq4Var, tm1 tm1Var) {
        this.delegate = eq4Var;
        this.onException = tm1Var;
    }

    @Override // defpackage.eq4, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.delegate.close();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    @Override // defpackage.eq4, java.io.Flushable
    public void flush() {
        try {
            this.delegate.flush();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    @Override // defpackage.eq4
    public u75 timeout() {
        return this.delegate.timeout();
    }

    @Override // defpackage.eq4
    public void write(cz czVar, long j) {
        if (this.hasErrors) {
            czVar.skip(j);
            return;
        }
        try {
            this.delegate.write(czVar, j);
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }
}
