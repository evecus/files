package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class lg implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ ir5 J;

    public /* synthetic */ lg(ir5 ir5Var, byte b) {
        this.I = b;
        this.J = ir5Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        ir5 ir5Var = this.J;
        switch (b) {
            case 0:
                qg.o(ir5Var);
                break;
            case 1:
                ir5Var.k0.E();
                break;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                ir5Var.m0.saveHierarchyState(sparseArray);
                break;
            case 3:
                ir5.p(ir5Var);
                break;
            default:
                ir5Var.p0.invoke(ir5Var.m0);
                break;
        }
        return wd5Var;
    }
}
