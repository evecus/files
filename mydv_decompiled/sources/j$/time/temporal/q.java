package j$.time.temporal;

import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public abstract class q {
    public static final j$.time.format.a a = new j$.time.format.a(1);
    public static final j$.time.format.a b = new j$.time.format.a(2);
    public static final j$.time.format.a c = new j$.time.format.a(3);
    public static final j$.time.format.a d = new j$.time.format.a(4);
    public static final j$.time.format.a e = new j$.time.format.a(5);
    public static final j$.time.format.a f = new j$.time.format.a(6);
    public static final j$.time.format.a g = new j$.time.format.a(7);

    public static int a(m mVar, p pVar) {
        s f2 = mVar.f(pVar);
        if (f2.a < -2147483648L || f2.d > 2147483647L) {
            throw new r("Invalid field " + pVar + " for get() method, use getLong() instead");
        }
        long m = mVar.m(pVar);
        if (f2.d(m)) {
            return (int) m;
        }
        throw new j$.time.c("Invalid value for " + pVar + " (valid values " + f2 + "): " + m);
    }

    public static l b(l lVar, long j, TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            lVar = lVar.b(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return lVar.b(j2, temporalUnit);
    }

    public static Object c(m mVar, j$.time.format.a aVar) {
        if (aVar == a || aVar == b || aVar == c) {
            return null;
        }
        return aVar.a(mVar);
    }

    public static s d(m mVar, p pVar) {
        if (!(pVar instanceof a)) {
            Objects.a(pVar, "field");
            return pVar.e(mVar);
        }
        if (mVar.c(pVar)) {
            return ((a) pVar).b;
        }
        throw new r(j$.time.d.a("Unsupported field: ", pVar));
    }
}
