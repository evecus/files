package j$.util.stream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public abstract class i2 implements f2 {
    public final f2 a;
    public final f2 b;
    public final long c;

    public i2(f2 f2Var, f2 f2Var2) {
        this.a = f2Var;
        this.b = f2Var2;
        this.c = f2Var2.count() + f2Var.count();
    }

    @Override // j$.util.stream.f2
    public final f2 a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.f2
    public final long count() {
        return this.c;
    }

    @Override // j$.util.stream.f2
    public final int o() {
        return 2;
    }

    @Override // j$.util.stream.f2
    public /* bridge */ /* synthetic */ e2 a(int i) {
        return (e2) a(i);
    }
}
