package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class w75 extends CancellationException {
    public final String I;
    public final int J;

    public w75(String str, int i) {
        super(str);
        this.I = str;
        this.J = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.I;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeoutCancellationException(");
        sb.append(this.I);
        sb.append(", ");
        return hf1.y(sb, this.J, ')');
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
