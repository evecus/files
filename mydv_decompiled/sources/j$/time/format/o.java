package j$.time.format;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class o implements f {
    public final j$.time.temporal.p a;
    public final b0 b;
    public final x c;
    public volatile j d;

    public o(j$.time.temporal.p pVar, b0 b0Var, x xVar) {
        this.a = pVar;
        this.b = b0Var;
        this.c = xVar;
    }

    @Override // j$.time.format.f
    public final boolean d(u uVar, StringBuilder sb) {
        Long a = uVar.a(this.a);
        if (a == null) {
            return false;
        }
        j$.time.chrono.a aVar = (j$.time.chrono.a) uVar.a.i(j$.time.temporal.q.b);
        String b = (aVar == null || aVar == j$.time.chrono.s.c) ? this.c.b(this.a, a.longValue(), this.b, uVar.b.b) : this.c.a(aVar, this.a, a.longValue(), this.b, uVar.b.b);
        if (b != null) {
            sb.append(b);
            return true;
        }
        if (this.d == null) {
            this.d = new j(this.a, 1, 19, a0.NORMAL);
        }
        return this.d.d(uVar, sb);
    }

    public final String toString() {
        b0 b0Var = b0.FULL;
        b0 b0Var2 = this.b;
        j$.time.temporal.p pVar = this.a;
        if (b0Var2 == b0Var) {
            return "Text(" + pVar + ")";
        }
        return "Text(" + pVar + "," + b0Var2 + ")";
    }
}
