package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class k02 implements ur5 {
    public final sr5[] a;

    public k02(sr5... sr5VarArr) {
        this.a = sr5VarArr;
    }

    @Override // defpackage.ur5
    public final qr5 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // defpackage.ur5
    public final qr5 b(Class cls, l33 l33Var) {
        sr5 sr5Var;
        tm1 tm1Var;
        k60 a = s24.a(cls);
        sr5[] sr5VarArr = this.a;
        sr5[] sr5VarArr2 = (sr5[]) Arrays.copyOf(sr5VarArr, sr5VarArr.length);
        int length = sr5VarArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                sr5Var = null;
                break;
            }
            sr5Var = sr5VarArr2[i];
            if (sr5Var.a.equals(a)) {
                break;
            }
            i++;
        }
        qr5 qr5Var = (sr5Var == null || (tm1Var = sr5Var.b) == null) ? null : (qr5) tm1Var.invoke(l33Var);
        if (qr5Var != null) {
            return qr5Var;
        }
        s83.h(hf1.w("No initializer set for given class ", a.b()));
        return null;
    }

    @Override // defpackage.ur5
    public final /* synthetic */ qr5 c(k60 k60Var, l33 l33Var) {
        return hf1.b(this, k60Var, l33Var);
    }
}
