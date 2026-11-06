package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class oq5 extends k05 implements hn1 {
    public boolean I;
    public final /* synthetic */ pq5 J;
    public final /* synthetic */ float K;
    public final /* synthetic */ float L;
    public final /* synthetic */ long M;
    public final /* synthetic */ long N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq5(pq5 pq5Var, float f, float f2, long j, long j2, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = pq5Var;
        this.K = f;
        this.L = f2;
        this.M = j;
        this.N = j2;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new oq5(this.J, this.K, this.L, this.M, this.N, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((oq5) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        boolean z = this.I;
        if (!z) {
            mu0.V(obj);
            ku4 g0 = qb.g0(1.0f, 400.0f, null, 4);
            final pq5 pq5Var = this.J;
            final float f = this.K;
            final float f2 = this.L;
            final long j = this.M;
            final long j2 = this.N;
            hn1 hn1Var = new hn1() { // from class: nq5
                @Override // defpackage.hn1
                public final Object invoke(Object obj2, Object obj3) {
                    float floatValue = ((Float) obj2).floatValue();
                    ((Float) obj3).getClass();
                    float f3 = f2;
                    float f4 = f;
                    float f5 = ((f3 - f4) * floatValue) + f4;
                    pq5 pq5Var2 = pq5.this;
                    pq5Var2.a.i(f5);
                    long j3 = j;
                    int i = (int) (j3 >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i);
                    long j4 = j2;
                    float intBitsToFloat2 = ((Float.intBitsToFloat((int) (j4 >> 32)) - Float.intBitsToFloat(i)) * floatValue) + intBitsToFloat;
                    int i2 = (int) (j3 & 4294967295L);
                    float intBitsToFloat3 = ((Float.intBitsToFloat((int) (j4 & 4294967295L)) - Float.intBitsToFloat(i2)) * floatValue) + Float.intBitsToFloat(i2);
                    pq5Var2.g((Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L));
                    return wd5.a;
                }
            };
            this.I = true;
            Object b = ad4.b(0.0f, 1.0f, g0, hn1Var, this, 4);
            el0 el0Var = el0.I;
            if (b == el0Var) {
                return el0Var;
            }
        } else {
            if (!z) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mu0.V(obj);
        }
        return wd5.a;
    }
}
