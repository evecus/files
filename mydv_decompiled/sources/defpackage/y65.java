package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class y65 implements sk0 {
    public final ThreadLocal I;

    public y65(ThreadLocal threadLocal) {
        this.I = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y65) && this.I.equals(((y65) obj).I);
    }

    public final int hashCode() {
        return this.I.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.I + ')';
    }
}
