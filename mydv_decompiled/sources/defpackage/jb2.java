package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class jb2 implements uy4 {
    public final r33 a;
    public final /* synthetic */ kb2 b;
    public final /* synthetic */ Object c;

    public jb2(kb2 kb2Var, Object obj) {
        this.b = kb2Var;
        this.c = obj;
        int[] iArr = y22.a;
        this.a = new r33();
    }

    @Override // defpackage.uy4
    public final void a(o73 o73Var) {
        ja3 ja3Var;
        wa2 wa2Var = (wa2) this.b.R.g(this.c);
        k13 k13Var = (wa2Var == null || (ja3Var = wa2Var.n0) == null) ? null : ja3Var.f;
        if (k13Var == null || !k13Var.isAttached()) {
            return;
        }
        ad4.E(k13Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", o73Var);
    }

    @Override // defpackage.uy4
    public final long b(int i) {
        wa2 wa2Var = (wa2) this.b.R.g(this.c);
        if (wa2Var == null || !wa2Var.K()) {
            return 0L;
        }
        int i2 = ((a53) wa2Var.o()).I.K;
        if (i < 0 || i >= i2) {
            q02.d("Index (" + i + ") is out of bound of [0, " + i2 + ")");
        }
        if (!this.a.c(i)) {
            return 0L;
        }
        int i3 = ((wa2) ((a53) wa2Var.o()).get(i)).o0.p.I;
        return (((wa2) ((a53) wa2Var.o()).get(i)).o0.p.J & 4294967295L) | (i3 << 32);
    }

    @Override // defpackage.uy4
    public final int c() {
        wa2 wa2Var = (wa2) this.b.R.g(this.c);
        if (wa2Var != null) {
            return ((a53) wa2Var.o()).I.K;
        }
        return 0;
    }

    @Override // defpackage.uy4
    public final void d(int i, long j) {
        kb2 kb2Var = this.b;
        wa2 wa2Var = (wa2) kb2Var.R.g(this.c);
        if (wa2Var == null || !wa2Var.K()) {
            return;
        }
        int i2 = ((a53) wa2Var.o()).I.K;
        if (i < 0 || i >= i2) {
            q02.d("Index (" + i + ") is out of bound of [0, " + i2 + ")");
        }
        if (wa2Var.L()) {
            q02.a("Pre-measure called on node that is not placed");
        }
        wa2 wa2Var2 = kb2Var.I;
        wa2Var2.Y = true;
        za2.a(wa2Var).mo22measureAndLayout0kLqBqw((wa2) ((a53) wa2Var.o()).get(i), j);
        wa2Var2.Y = false;
        this.a.a(i);
    }

    @Override // defpackage.uy4
    public final void dispose() {
        this.b.g(this.c);
    }
}
