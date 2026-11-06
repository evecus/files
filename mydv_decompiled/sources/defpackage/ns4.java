package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class ns4 {
    public us4 a;
    public long b;
    public boolean c;
    public int d;

    public ns4(long j, us4 us4Var) {
        int i;
        int numberOfTrailingZeros;
        this.a = us4Var;
        this.b = j;
        ba4 ba4Var = ws4.a;
        if (j != 0) {
            us4 d = d();
            long j2 = d.K;
            long[] jArr = d.L;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = d.J;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = d.I;
                    if (j4 != 0) {
                        j2 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = numberOfTrailingZeros + j2;
            }
            synchronized (ws4.c) {
                i = ws4.f.a(j);
            }
        } else {
            i = -1;
        }
        this.d = i;
    }

    public static void q(ns4 ns4Var) {
        ws4.b.b(ns4Var);
    }

    public final void a() {
        synchronized (ws4.c) {
            b();
            p();
        }
    }

    public void b() {
        ws4.d = ws4.d.d(g());
    }

    public abstract void c();

    public us4 d() {
        return this.a;
    }

    public abstract tm1 e();

    public boolean f() {
        return false;
    }

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public tm1 i() {
        return null;
    }

    public final ns4 j() {
        lt4 lt4Var = ws4.b;
        ns4 ns4Var = (ns4) lt4Var.a();
        lt4Var.b(this);
        return ns4Var;
    }

    public void k() {
        mw2.Y();
        throw null;
    }

    public void l() {
        mw2.Y();
        throw null;
    }

    public void n(kw4 kw4Var) {
        ba4 ba4Var = ws4.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            ws4.u(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(us4 us4Var) {
        this.a = us4Var;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract ns4 u(tm1 tm1Var);

    public void m() {
    }
}
