package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ht4 extends mw4 {
    public om3 c;
    public int d;

    public ht4(long j, om3 om3Var) {
        super(j);
        this.c = om3Var;
    }

    @Override // defpackage.mw4
    public final void a(mw4 mw4Var) {
        mw4Var.getClass();
        ht4 ht4Var = (ht4) mw4Var;
        synchronized (mw2.l) {
            this.c = ht4Var.c;
            this.d = ht4Var.d;
        }
    }

    @Override // defpackage.mw4
    public final mw4 b(long j) {
        return new ht4(j, this.c);
    }
}
