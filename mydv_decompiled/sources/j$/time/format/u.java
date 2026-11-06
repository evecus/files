package j$.time.format;

import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class u {
    public final j$.time.temporal.m a;
    public final DateTimeFormatter b;
    public int c;

    public u(j$.time.temporal.m mVar, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.a aVar = dateTimeFormatter.c;
        if (aVar != null) {
            j$.time.chrono.a aVar2 = (j$.time.chrono.a) mVar.i(j$.time.temporal.q.b);
            j$.time.x xVar = (j$.time.x) mVar.i(j$.time.temporal.q.a);
            j$.time.chrono.b bVar = null;
            aVar = Objects.equals(aVar, aVar2) ? null : aVar;
            Objects.equals(null, xVar);
            if (aVar != null) {
                j$.time.chrono.a aVar3 = aVar != null ? aVar : aVar2;
                if (aVar != null) {
                    if (mVar.c(j$.time.temporal.a.EPOCH_DAY)) {
                        bVar = aVar3.e(mVar);
                    } else if (aVar != j$.time.chrono.s.c || aVar2 != null) {
                        for (j$.time.temporal.a aVar4 : j$.time.temporal.a.values()) {
                            if (aVar4.isDateBased() && mVar.c(aVar4)) {
                                throw new j$.time.c("Unable to apply override chronology '" + aVar + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + mVar);
                            }
                        }
                    }
                }
                mVar = new t(bVar, mVar, aVar3, xVar);
            }
        }
        this.a = mVar;
        this.b = dateTimeFormatter;
    }

    public final Long a(j$.time.temporal.p pVar) {
        int i = this.c;
        j$.time.temporal.m mVar = this.a;
        if (i <= 0 || mVar.c(pVar)) {
            return Long.valueOf(mVar.m(pVar));
        }
        return null;
    }

    public final Object b(a aVar) {
        j$.time.temporal.m mVar = this.a;
        Object i = mVar.i(aVar);
        if (i != null || this.c != 0) {
            return i;
        }
        throw new j$.time.c("Unable to extract " + aVar + " from temporal " + mVar);
    }

    public final String toString() {
        return this.a.toString();
    }
}
