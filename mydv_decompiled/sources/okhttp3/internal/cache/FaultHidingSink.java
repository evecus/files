package okhttp3.internal.cache;

import defpackage.cz;
import defpackage.eq4;
import defpackage.gl1;
import defpackage.tm1;
import java.io.IOException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class FaultHidingSink extends gl1 {
    private boolean hasErrors;
    private final tm1 onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaultHidingSink(eq4 eq4Var, tm1 tm1Var) {
        super(eq4Var);
        eq4Var.getClass();
        tm1Var.getClass();
        this.onException = tm1Var;
    }

    @Override // defpackage.gl1, defpackage.eq4, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    @Override // defpackage.gl1, defpackage.eq4, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    public final tm1 getOnException() {
        return this.onException;
    }

    @Override // defpackage.gl1, defpackage.eq4
    public void write(cz czVar, long j) {
        czVar.getClass();
        if (this.hasErrors) {
            czVar.skip(j);
            return;
        }
        try {
            super.write(czVar, j);
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }
}
