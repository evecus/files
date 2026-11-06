package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class m74 implements jp3 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public m74(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.jp3
    public final long a(float f, float f2) {
        float f3 = f + this.a;
        float f4 = this.b;
        return rf1.a(f3 / f4, (f2 + this.c) / f4);
    }
}
