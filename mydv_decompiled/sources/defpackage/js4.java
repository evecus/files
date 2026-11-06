package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class js4 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ float J;
    public final /* synthetic */ o24 K;
    public final /* synthetic */ rb4 L;
    public final /* synthetic */ tm1 M;

    public /* synthetic */ js4(float f, o24 o24Var, rb4 rb4Var, tm1 tm1Var, byte b) {
        this.I = b;
        this.J = f;
        this.K = o24Var;
        this.L = rb4Var;
        this.M = tm1Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        float f;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        tm1 tm1Var = this.M;
        rb4 rb4Var = this.L;
        o24 o24Var = this.K;
        float f2 = this.J;
        aj ajVar = (aj) obj;
        switch (b) {
            case 0:
                float abs = Math.abs(((Number) ajVar.e.getValue()).floatValue());
                float abs2 = Math.abs(f2);
                jk3 jk3Var = ajVar.e;
                if (abs < abs2) {
                    ui4.e(ajVar, rb4Var, tm1Var, ((Number) jk3Var.getValue()).floatValue() - o24Var.I);
                    o24Var.I = ((Number) jk3Var.getValue()).floatValue();
                    break;
                } else {
                    float h = ui4.h(((Number) jk3Var.getValue()).floatValue(), f2);
                    ui4.e(ajVar, rb4Var, tm1Var, h - o24Var.I);
                    ajVar.a();
                    o24Var.I = h;
                    break;
                }
            default:
                float h2 = ui4.h(((Number) ajVar.e.getValue()).floatValue(), f2);
                float f3 = h2 - o24Var.I;
                try {
                    f = rb4Var.a(f3);
                } catch (CancellationException unused) {
                    ajVar.a();
                    f = 0.0f;
                }
                tm1Var.invoke(Float.valueOf(f));
                if (Math.abs(f3 - f) > 0.5f || h2 != ((Number) ajVar.e.getValue()).floatValue()) {
                    ajVar.a();
                }
                o24Var.I += f;
                break;
        }
        return wd5Var;
    }
}
