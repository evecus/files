package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class hw4 extends mw4 {
    public a4 c;
    public int d;
    public int e;

    public hw4(long j, a4 a4Var) {
        super(j);
        this.c = a4Var;
    }

    @Override // defpackage.mw4
    public final void a(mw4 mw4Var) {
        synchronized (j42.r) {
            mw4Var.getClass();
            this.c = ((hw4) mw4Var).c;
            this.d = ((hw4) mw4Var).d;
            this.e = ((hw4) mw4Var).e;
        }
    }

    @Override // defpackage.mw4
    public final mw4 b(long j) {
        return new hw4(j, this.c);
    }
}
