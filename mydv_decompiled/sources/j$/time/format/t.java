package j$.time.format;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class t implements j$.time.temporal.m {
    public final /* synthetic */ j$.time.chrono.b a;
    public final /* synthetic */ j$.time.temporal.m b;
    public final /* synthetic */ j$.time.chrono.a c;
    public final /* synthetic */ j$.time.x d;

    public t(j$.time.chrono.b bVar, j$.time.temporal.m mVar, j$.time.chrono.a aVar, j$.time.x xVar) {
        this.a = bVar;
        this.b = mVar;
        this.c = aVar;
        this.d = xVar;
    }

    @Override // j$.time.temporal.m
    public final boolean c(j$.time.temporal.p pVar) {
        j$.time.chrono.b bVar = this.a;
        return (bVar == null || !pVar.isDateBased()) ? this.b.c(pVar) : bVar.c(pVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ int d(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.s f(j$.time.temporal.p pVar) {
        j$.time.chrono.b bVar = this.a;
        return (bVar == null || !pVar.isDateBased()) ? this.b.f(pVar) : bVar.f(pVar);
    }

    @Override // j$.time.temporal.m
    public final Object i(a aVar) {
        return aVar == j$.time.temporal.q.b ? this.c : aVar == j$.time.temporal.q.a ? this.d : aVar == j$.time.temporal.q.c ? this.b.i(aVar) : aVar.a(this);
    }

    @Override // j$.time.temporal.m
    public final long m(j$.time.temporal.p pVar) {
        j$.time.chrono.b bVar = this.a;
        return (bVar == null || !pVar.isDateBased()) ? this.b.m(pVar) : bVar.m(pVar);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.a aVar = this.c;
        if (aVar != null) {
            str = " with chronology " + aVar;
        } else {
            str = "";
        }
        j$.time.x xVar = this.d;
        if (xVar != null) {
            str2 = " with zone " + xVar;
        }
        return this.b + str + str2;
    }
}
