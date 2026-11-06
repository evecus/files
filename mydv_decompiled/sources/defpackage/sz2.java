package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class sz2 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;

    public /* synthetic */ sz2(int i, int i2, bn3 bn3Var) {
        this.I = (byte) 0;
        this.K = i;
        this.J = bn3Var;
        this.L = i2;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.L;
        int i2 = this.K;
        Object obj2 = this.J;
        switch (b) {
            case 0:
                an3.g((an3) obj, (bn3) obj2, mw2.P((i2 - r9.I) / 2.0f), mw2.P((i - r9.J) / 2.0f));
                break;
            case 1:
                an3.g((an3) obj, (bn3) obj2, i2, i);
                break;
            default:
                yd ydVar = (yd) obj2;
                yj3 yj3Var = (yj3) obj;
                td tdVar = yj3Var.a;
                int d = yj3Var.d(i2);
                int d2 = yj3Var.d(i);
                CharSequence charSequence = tdVar.e;
                if (d < 0 || d > d2 || d2 > charSequence.length()) {
                    int length = charSequence.length();
                    StringBuilder D = hf1.D("start(", d, ") or end(", d2, ") is out of range [0..");
                    D.append(length);
                    D.append("], or start > end!");
                    r02.a(D.toString());
                }
                Path path = new Path();
                s55 s55Var = tdVar.d;
                s55Var.f.getSelectionPath(d, d2, path);
                int i3 = s55Var.h;
                if (i3 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i3);
                }
                float f = yj3Var.f;
                long floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                ydVar.a.addPath(path, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ sz2(Object obj, int i, int i2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = i;
        this.L = i2;
    }
}
