package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class zs4 extends mw4 {
    public int c;

    public zs4(long j, int i) {
        super(j);
        this.c = i;
    }

    @Override // defpackage.mw4
    public final void a(mw4 mw4Var) {
        mw4Var.getClass();
        this.c = ((zs4) mw4Var).c;
    }

    @Override // defpackage.mw4
    public final mw4 b(long j) {
        return new zs4(j, this.c);
    }
}
