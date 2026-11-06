package j$.util.stream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class i8 extends h5 implements n8 {
    public long b;
    public boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ h8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(h8 h8Var, l5 l5Var, boolean z) {
        super(l5Var);
        this.e = h8Var;
        this.d = z;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        if (!this.c) {
            boolean test = this.e.m.test(obj);
            this.c = !test;
            if (test) {
                z = false;
                z2 = this.d;
                if (z2 && !z) {
                    this.b++;
                }
                if (!z2 || z) {
                    this.a.accept((l5) obj);
                }
                return;
            }
        }
        z = true;
        z2 = this.d;
        if (z2) {
            this.b++;
        }
        if (z2) {
        }
        this.a.accept((l5) obj);
    }

    @Override // j$.util.stream.n8
    public final long h() {
        return this.b;
    }
}
