package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class sb0 {
    public final Object a;
    public final f10 b;
    public final in1 c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ sb0(Object obj, f10 f10Var, in1 in1Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : f10Var, (i & 4) != 0 ? null : in1Var, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static sb0 a(sb0 sb0Var, f10 f10Var, Throwable th, int i) {
        Object obj = sb0Var.a;
        if ((i & 2) != 0) {
            f10Var = sb0Var.b;
        }
        f10 f10Var2 = f10Var;
        in1 in1Var = sb0Var.c;
        Object obj2 = sb0Var.d;
        if ((i & 16) != 0) {
            th = sb0Var.e;
        }
        return new sb0(obj, f10Var2, in1Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb0)) {
            return false;
        }
        sb0 sb0Var = (sb0) obj;
        return j42.c(this.a, sb0Var.a) && j42.c(this.b, sb0Var.b) && j42.c(this.c, sb0Var.c) && j42.c(this.d, sb0Var.d) && j42.c(this.e, sb0Var.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        f10 f10Var = this.b;
        int hashCode2 = (hashCode + (f10Var == null ? 0 : f10Var.hashCode())) * 31;
        in1 in1Var = this.c;
        int hashCode3 = (hashCode2 + (in1Var == null ? 0 : in1Var.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public sb0(Object obj, f10 f10Var, in1 in1Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = f10Var;
        this.c = in1Var;
        this.d = obj2;
        this.e = th;
    }
}
