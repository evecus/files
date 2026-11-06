package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class w52 extends CancellationException {
    public final transient e62 I;

    public w52(String str, Throwable th, e62 e62Var) {
        super(str);
        this.I = e62Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w52)) {
            return false;
        }
        w52 w52Var = (w52) obj;
        if (!j42.c(w52Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = w52Var.I;
        if (obj2 == null) {
            obj2 = ta3.I;
        }
        Object obj3 = this.I;
        if (obj3 == null) {
            obj3 = ta3.I;
        }
        return j42.c(obj2, obj3) && j42.c(w52Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int hashCode = message.hashCode() * 31;
        Object obj = this.I;
        if (obj == null) {
            obj = ta3.I;
        }
        int hashCode2 = (obj.hashCode() + hashCode) * 31;
        Throwable cause = getCause();
        return hashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.I;
        if (obj == null) {
            obj = ta3.I;
        }
        sb.append(obj);
        return sb.toString();
    }
}
