package defpackage;

import android.animation.TypeEvaluator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jj implements TypeEvaluator {
    public kl3[] a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        kl3[] kl3VarArr = (kl3[]) obj;
        kl3[] kl3VarArr2 = (kl3[]) obj2;
        if (!il2.l(kl3VarArr, kl3VarArr2)) {
            s83.t("Can't interpolate between two incompatible pathData");
            return null;
        }
        if (!il2.l(this.a, kl3VarArr)) {
            this.a = il2.s(kl3VarArr);
        }
        int i = 0;
        while (true) {
            int length = kl3VarArr.length;
            kl3[] kl3VarArr3 = this.a;
            if (i >= length) {
                return kl3VarArr3;
            }
            kl3 kl3Var = kl3VarArr3[i];
            kl3 kl3Var2 = kl3VarArr[i];
            kl3 kl3Var3 = kl3VarArr2[i];
            kl3Var.getClass();
            kl3Var.a = kl3Var2.a;
            int i2 = 0;
            while (true) {
                float[] fArr = kl3Var2.b;
                if (i2 < fArr.length) {
                    kl3Var.b[i2] = (kl3Var3.b[i2] * f) + ((1.0f - f) * fArr[i2]);
                    i2++;
                }
            }
            i++;
        }
    }
}
