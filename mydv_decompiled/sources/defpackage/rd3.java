package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rd3 implements tm1 {
    public final /* synthetic */ float I;
    public final /* synthetic */ float J;

    public /* synthetic */ rd3(float f, float f2) {
        this.I = f;
        this.J = f2;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        z12 z12Var = (z12) obj;
        z12Var.a = "offset";
        fq fqVar = z12Var.c;
        fqVar.b(new r11(this.I), "x");
        fqVar.b(new r11(this.J), "y");
        return wd5.a;
    }
}
