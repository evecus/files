package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bw3 implements a93 {
    public final /* synthetic */ t43 I;

    public bw3(t43 t43Var) {
        this.I = t43Var;
    }

    @Override // defpackage.a93
    public final long C(int i, long j) {
        if (Float.intBitsToFloat((int) (j & 4294967295L)) >= -5.0f) {
            return 0L;
        }
        this.I.setValue(Boolean.TRUE);
        return 0L;
    }

    @Override // defpackage.a93
    public final long V(int i, long j, long j2) {
        if (Float.intBitsToFloat((int) (4294967295L & j2)) <= 5.0f) {
            return 0L;
        }
        this.I.setValue(Boolean.FALSE);
        return 0L;
    }

    @Override // defpackage.a93
    public final Object g0(long j, long j2, fj0 fj0Var) {
        return new ji5(0L);
    }

    @Override // defpackage.a93
    public final Object w(long j, fj0 fj0Var) {
        return new ji5(0L);
    }
}
