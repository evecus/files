package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class kh extends r92 implements tm1 {
    public final /* synthetic */ byte J;
    public final /* synthetic */ Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kh(Object obj, byte b) {
        super(1);
        this.J = b;
        this.K = obj;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.J;
        wd5 wd5Var = wd5.a;
        Object obj2 = this.K;
        switch (b) {
            case 0:
                return Boolean.valueOf(j42.c(obj, obj2));
            case 1:
                an3 an3Var = (an3) obj;
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    an3.g(an3Var, (bn3) arrayList.get(i), 0, 0);
                }
                return wd5Var;
            case 2:
                an3.g((an3) obj, (bn3) obj2, 0, 0);
                return wd5Var;
            case 3:
                gj gjVar = (gj) obj;
                float f = gjVar.b;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = gjVar.c;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = gjVar.d;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = gjVar.a;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return new x70(x70.b(qb.h(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, z80.x), (v80) obj2));
            case 4:
                y31 y31Var = (y31) obj;
                jr1 jr1Var = (jr1) obj2;
                yd ydVar = jr1Var.l;
                if (jr1Var.n && jr1Var.A && ydVar != null) {
                    pn S = y31Var.S();
                    long H = S.H();
                    S.q().f();
                    try {
                        ((pn) ((ep) S.b).J).q().k(ydVar);
                        jr1Var.c(y31Var);
                    } finally {
                        r7.H(S, H);
                    }
                } else {
                    jr1Var.c(y31Var);
                }
                return wd5Var;
            default:
                ((rj3) obj2).onDraw((y31) obj);
                return wd5Var;
        }
    }
}
