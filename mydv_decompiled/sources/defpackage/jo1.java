package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class jo1 implements rm1 {
    public final /* synthetic */ ko1 I;

    public jo1(ko1 ko1Var) {
        this.I = ko1Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        ArrayList arrayList = this.I.a;
        n43 n43Var = new n43(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            r82 r82Var = (r82) arrayList.get(i);
            Object obj = r82Var.b;
            int i2 = r82Var.a;
            d33.a(n43Var, obj != null ? new f62(Integer.valueOf(i2), r82Var.b) : Integer.valueOf(i2), r82Var);
        }
        return new d33(n43Var);
    }
}
