package j$.util.stream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class q5 extends g5 {
    public long b;
    public long c;
    public final /* synthetic */ r5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(r5 r5Var, l5 l5Var) {
        super(l5Var);
        this.d = r5Var;
        this.b = r5Var.l;
        long j = r5Var.m;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.k5, j$.util.stream.l5
    public final void accept(long j) {
        long j2 = this.b;
        if (j2 != 0) {
            this.b = j2 - 1;
            return;
        }
        long j3 = this.c;
        if (j3 > 0) {
            this.c = j3 - 1;
            this.a.accept(j);
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.l5
    public final void c(long j) {
        this.a.c(v3.y(j, this.d.l, this.c));
    }

    @Override // j$.util.stream.g5, j$.util.stream.l5
    public final boolean e() {
        return this.c == 0 || this.a.e();
    }
}
