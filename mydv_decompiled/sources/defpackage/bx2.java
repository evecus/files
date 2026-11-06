package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bx2 implements pk0 {
    public final float a;
    public final Object b;
    public final Object c;

    public bx2(float[] fArr, float[] fArr2) {
        this.b = fArr;
        this.c = fArr2;
        float f = 0.0f;
        for (float f2 : fArr) {
            f += f2;
        }
        this.a = f;
    }

    @Override // defpackage.pk0
    public float a(long j, iu0 iu0Var) {
        return vt0.G(((pk0) this.b).a(j, iu0Var), ((pk0) this.c).a(j, iu0Var), this.a);
    }

    public float[] b() {
        return (float[]) this.b;
    }

    public float[] c() {
        return (float[]) this.c;
    }

    public float d() {
        return this.a;
    }

    public bx2(pk0 pk0Var, pk0 pk0Var2, float f) {
        this.b = pk0Var;
        this.c = pk0Var2;
        this.a = f;
    }
}
