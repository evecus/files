package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class n implements j$.time.temporal.m, j$.time.temporal.n, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = -939150713474957432L;
    public final int a;
    public final int b;

    static {
        j$.time.format.s sVar = new j$.time.format.s();
        sVar.d("--");
        sVar.l(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        sVar.c('-');
        sVar.l(j$.time.temporal.a.DAY_OF_MONTH, 2);
        sVar.q(Locale.getDefault(), j$.time.format.z.SMART, null);
    }

    public n(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 13, this);
    }

    @Override // j$.time.temporal.m
    public final boolean c(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.MONTH_OF_YEAR || pVar == j$.time.temporal.a.DAY_OF_MONTH : pVar != null && pVar.d(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        n nVar = (n) obj;
        int i = this.a - nVar.a;
        return i == 0 ? this.b - nVar.b : i;
    }

    @Override // j$.time.temporal.m
    public final int d(j$.time.temporal.p pVar) {
        return f(pVar).a(m(pVar), pVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.a == nVar.a && this.b == nVar.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.s f(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return pVar.range();
        }
        if (pVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.q.d(this, pVar);
        }
        l t = l.t(this.a);
        t.getClass();
        int i = k.a[t.ordinal()];
        return j$.time.temporal.s.f(1L, i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : 28, l.t(this.a).s());
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l h(j$.time.temporal.l lVar) {
        if (!a.R(lVar).equals(j$.time.chrono.s.c)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        j$.time.temporal.l a = lVar.a(this.a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return a.a(Math.min(a.f(aVar).d, this.b), aVar);
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    @Override // j$.time.temporal.m
    public final Object i(j$.time.format.a aVar) {
        return aVar == j$.time.temporal.q.b ? j$.time.chrono.s.c : j$.time.temporal.q.c(this, aVar);
    }

    @Override // j$.time.temporal.m
    public final long m(j$.time.temporal.p pVar) {
        int i;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.f(this);
        }
        int i2 = m.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                throw new j$.time.temporal.r(d.a("Unsupported field: ", pVar));
            }
            i = this.a;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        sb.append(this.a < 10 ? "0" : "");
        sb.append(this.a);
        sb.append(this.b < 10 ? "-0" : "-");
        sb.append(this.b);
        return sb.toString();
    }
}
