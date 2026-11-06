package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class a7 {
    public final String a;

    public a7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a7) {
            return j42.c(this.a, ((a7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
