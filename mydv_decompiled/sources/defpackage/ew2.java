package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ew2 implements dn4 {
    public final yd a;
    public yd b;
    public long c;

    public ew2(n74 n74Var) {
        yd a = ae.a();
        mk2 mk2Var = n74Var.c;
        long j = n74Var.b;
        li4.j(a, mk2Var, sp0.V(j), sp0.W(j));
        this.a = a;
        this.c = 9205357640488583168L;
    }

    @Override // defpackage.dn4
    public final yg3 a(long j, da2 da2Var, iu0 iu0Var) {
        yd ydVar;
        if (!fq4.a(j, this.c) || (ydVar = this.b) == null) {
            this.c = j;
            this.b = ae.a();
        } else {
            ydVar.e();
        }
        yd ydVar2 = this.b;
        ydVar2.getClass();
        hf1.h(ydVar2, this.a);
        float[] a = nw2.a();
        nw2.g(a, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), 4);
        ydVar2.f(a);
        ydVar2.g(pd3.e(ad4.q(j), ydVar2.a().b()));
        return new vg3(ydVar2);
    }
}
