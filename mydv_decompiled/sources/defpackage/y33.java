package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class y33 extends cv2 implements z72 {
    public final q70 K;
    public Object L;

    public y33(q70 q70Var, Object obj, Object obj2) {
        super(obj, obj2);
        this.K = q70Var;
        this.L = obj2;
    }

    @Override // defpackage.cv2, java.util.Map.Entry
    public final Object getValue() {
        return this.L;
    }

    @Override // defpackage.cv2, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.L;
        this.L = obj;
        em3 em3Var = (em3) this.K.J;
        dm3 dm3Var = em3Var.L;
        Object obj3 = this.I;
        if (!dm3Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = em3Var.K;
        if (!z) {
            dm3Var.put(obj3, obj);
        } else {
            if (!z) {
                zy.k();
                return null;
            }
            ta5 ta5Var = em3Var.I[em3Var.J];
            Object obj4 = ta5Var.I[ta5Var.K];
            dm3Var.put(obj3, obj);
            em3Var.c(obj4 != null ? obj4.hashCode() : 0, dm3Var.K, obj4, 0);
        }
        em3Var.O = dm3Var.M;
        return obj2;
    }
}
