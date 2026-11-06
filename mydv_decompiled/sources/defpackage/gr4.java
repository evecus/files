package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gr4 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ qr4 J;

    public /* synthetic */ gr4(iu0 iu0Var, qr4 qr4Var, t43 t43Var) {
        this.I = (byte) 2;
        this.J = qr4Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        int i;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        qr4 qr4Var = this.J;
        switch (b) {
            case 0:
                fk3 fk3Var = qr4Var.c;
                float floatValue = ((Float) obj).floatValue();
                z60 z60Var = qr4Var.b;
                float f = z60Var.a;
                float f2 = z60Var.b;
                float q = ut0.q(floatValue, f, f2);
                byte b2 = qr4Var.a;
                boolean z = false;
                if (b2 > 0 && (i = b2 + 1) >= 0) {
                    float f3 = q;
                    float f4 = f3;
                    int i2 = 0;
                    while (true) {
                        float G = vt0.G(z60Var.a, f2, i2 / i);
                        float f5 = G - q;
                        if (Math.abs(f5) <= f3) {
                            f3 = Math.abs(f5);
                            f4 = G;
                        }
                        if (i2 != i) {
                            i2++;
                        } else {
                            q = f4;
                        }
                    }
                }
                if (q != fk3Var.h()) {
                    if (q != fk3Var.h()) {
                        tm1 tm1Var = qr4Var.e;
                        if (tm1Var != null) {
                            tm1Var.invoke(Float.valueOf(q));
                        } else {
                            qr4Var.d(q);
                        }
                    }
                    z = true;
                }
                break;
            case 1:
                Float f6 = (Float) obj;
                float floatValue2 = f6.floatValue();
                tm1 tm1Var2 = qr4Var.e;
                if (tm1Var2 == null) {
                    qr4Var.d(floatValue2);
                    break;
                } else {
                    tm1Var2.invoke(f6);
                    break;
                }
            case 2:
                z22 z22Var = (z22) obj;
                qr4Var.l.i((int) (z22Var.a >> 32));
                qr4Var.m.i((int) (z22Var.a & 4294967295L));
                break;
            default:
                qr4Var.a(0.0f);
                qr4Var.p.invoke();
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ gr4(qr4 qr4Var, byte b) {
        this.I = b;
        this.J = qr4Var;
    }
}
