package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a31 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ float J;
    public final /* synthetic */ Object K;

    public /* synthetic */ a31(float f, Object obj, byte b) {
        this.I = b;
        this.J = f;
        this.K = obj;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        boolean a;
        byte b = this.I;
        Object obj2 = this.K;
        float f = this.J;
        switch (b) {
            case 0:
                n24 n24Var = (n24) obj2;
                l31 l31Var = (l31) obj;
                boolean c = j42.c(l31Var.E(), "waiting");
                boolean z = false;
                if (l31Var.J() == null) {
                    a = false;
                } else {
                    pg3 J = l31Var.J();
                    J.getClass();
                    a = n31.a(J, f);
                }
                if (n24Var.I || (c && a)) {
                    z = true;
                }
                n24Var.I = z;
                return Boolean.valueOf(!z);
            default:
                Paint paint = (Paint) obj2;
                zh0 zh0Var = (zh0) obj;
                zh0Var.getClass();
                ya2 ya2Var = (ya2) zh0Var;
                pn pnVar = ya2Var.I.J;
                Canvas b2 = ba.b(pnVar.q());
                float f2 = -f;
                int saveLayer = b2.saveLayer(f2, f2, Float.intBitsToFloat((int) (pnVar.H() >> 32)) + f, Float.intBitsToFloat((int) (pnVar.H() & 4294967295L)) + f, paint);
                wx5.q(b2, zh0Var, 0.0f, f2);
                wx5.q(b2, zh0Var, 0.0f, f);
                wx5.q(b2, zh0Var, f2, 0.0f);
                wx5.q(b2, zh0Var, f, 0.0f);
                b2.restoreToCount(saveLayer);
                ya2Var.a();
                return wd5.a;
        }
    }
}
