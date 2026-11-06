package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class i95 {
    public final long a;
    public final long b;
    public final boolean c;

    public i95(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final i95 a(i95 i95Var) {
        return new i95(pd3.f(this.a, i95Var.a), Math.max(this.b, i95Var.b), this.c || i95Var.c);
    }
}
