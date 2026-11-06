package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jf implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ qf J;
    public final /* synthetic */ w25 K;

    public /* synthetic */ jf(qf qfVar, w25 w25Var, byte b) {
        this.I = b;
        this.J = qfVar;
        this.K = w25Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        byte b2 = 3;
        byte b3 = 2;
        w25 w25Var = this.K;
        qf qfVar = this.J;
        switch (b) {
            case 0:
                hf hfVar = qfVar.f;
                ce ceVar = new ce(w25Var, b3);
                r24 r24Var = new r24();
                qfVar.e.d("dataBuilder", hfVar, new ka(r24Var, ceVar, b2));
                Object obj = r24Var.I;
                if (obj != null) {
                    return (v25) obj;
                }
                j42.g0("result");
                throw null;
            case 1:
                hf hfVar2 = qfVar.g;
                jf jfVar = new jf(qfVar, w25Var, b3);
                r24 r24Var2 = new r24();
                qfVar.e.d("positioner", hfVar2, new ka(r24Var2, jfVar, b2));
                Object obj2 = r24Var2.I;
                if (obj2 != null) {
                    return (m14) obj2;
                }
                j42.g0("result");
                throw null;
            default:
                Object invoke = qfVar.c.invoke();
                ca2 ca2Var = (ca2) (((ca2) invoke).h() ? invoke : null);
                return ca2Var == null ? m14.e : w25Var.d(ca2Var).i(ca2Var.M(0L));
        }
    }
}
