package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class g64 implements ag1 {
    public final /* synthetic */ n24 I;
    public final /* synthetic */ ue J;
    public final /* synthetic */ ArrayList K;
    public final /* synthetic */ r24 L;
    public final /* synthetic */ dl0 M;

    public g64(n24 n24Var, ue ueVar, ArrayList arrayList, r24 r24Var, dl0 dl0Var) {
        this.I = n24Var;
        this.J = ueVar;
        this.K = arrayList;
        this.L = r24Var;
        this.M = dl0Var;
    }

    @Override // defpackage.ag1
    public final Object emit(Object obj, fj0 fj0Var) {
        c32 c32Var = (c32) obj;
        boolean z = c32Var instanceof xs3;
        ue ueVar = this.J;
        if (z) {
            if (ueVar.M) {
                ueVar.k0((xs3) c32Var);
            } else {
                ueVar.N.a(c32Var);
            }
        }
        boolean z2 = c32Var instanceof mv1;
        wd5 wd5Var = wd5.a;
        ArrayList arrayList = this.K;
        if (z2) {
            arrayList.add(c32Var);
        } else if (c32Var instanceof nv1) {
            arrayList.remove(((nv1) c32Var).a);
        } else {
            boolean z3 = c32Var instanceof th1;
            n24 n24Var = this.I;
            if (z3) {
                arrayList.add(c32Var);
                n24Var.I = true;
            } else if (c32Var instanceof uh1) {
                arrayList.remove(((uh1) c32Var).a);
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        n24Var.I = false;
                        break;
                    }
                    if (((c32) arrayList.get(i)) instanceof th1) {
                        break;
                    }
                    i++;
                }
            } else if (c32Var instanceof i31) {
                arrayList.add(c32Var);
            } else {
                if (!(c32Var instanceof j31)) {
                    if (c32Var instanceof h31) {
                        arrayList.remove(((h31) c32Var).a());
                    }
                    return wd5Var;
                }
                arrayList.remove(((j31) c32Var).a());
            }
        }
        c32 c32Var2 = (c32) o70.b1(arrayList);
        p64 j0 = ueVar.j0(false);
        r24 r24Var = this.L;
        if (!j42.c(r24Var.I, c32Var2)) {
            dl0 dl0Var = this.M;
            if (c32Var2 != null) {
                boolean z4 = c32Var2 instanceof mv1;
                float f = 0.0f;
                if (z4) {
                    if (j0.f instanceof l64) {
                        f = 0.08f;
                    }
                } else if (c32Var2 instanceof th1) {
                    if (j0.e instanceof j64) {
                        f = 0.1f;
                    }
                } else if ((c32Var2 instanceof i31) && (j0.g instanceof h64)) {
                    f = 0.16f;
                }
                qb5 qb5Var = c64.a;
                if (!z4) {
                    if (c32Var2 instanceof th1) {
                        qb5Var = new qb5(45, 0, m61.b);
                    } else if (c32Var2 instanceof i31) {
                        qb5Var = new qb5(45, 0, m61.b);
                    }
                }
                p70.g0(dl0Var, null, null, new f64(ueVar, f, qb5Var, null), 3);
            } else {
                c32 c32Var3 = (c32) r24Var.I;
                qb5 qb5Var2 = c64.a;
                if (!(c32Var3 instanceof mv1) && !(c32Var3 instanceof th1) && (c32Var3 instanceof i31)) {
                    qb5Var2 = new qb5(150, 0, m61.b);
                }
                p70.g0(dl0Var, null, null, new gu2(ueVar, qb5Var2, (fj0) null, (byte) 11), 3);
            }
            if (c32Var instanceof vh1) {
                p70.g0(dl0Var, null, null, new p(ueVar, null, (byte) 3), 3);
            }
            r24Var.I = c32Var2;
        }
        return wd5Var;
    }
}
