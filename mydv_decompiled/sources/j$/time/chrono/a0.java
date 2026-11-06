package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalDateTime;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class a0 extends a implements Serializable {
    public static final a0 c = new a0();
    private static final long serialVersionUID = 1039765215346859963L;

    private a0() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.a
    public final b d(int i) {
        return new c0(LocalDate.x(i + 1911, 1, 1));
    }

    @Override // j$.time.chrono.a
    public final b e(j$.time.temporal.m mVar) {
        return mVar instanceof c0 ? (c0) mVar : new c0(LocalDate.s(mVar));
    }

    @Override // j$.time.chrono.a
    public final m f(int i) {
        if (i == 0) {
            return d0.BEFORE_ROC;
        }
        if (i == 1) {
            return d0.ROC;
        }
        j$.time.h.d("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.a
    public final String getCalendarType() {
        return "roc";
    }

    @Override // j$.time.chrono.a
    public final String getId() {
        return "Minguo";
    }

    @Override // j$.time.chrono.a
    public final e h(LocalDateTime localDateTime) {
        return super.h(localDateTime);
    }

    @Override // j$.time.chrono.a
    public final boolean isLeapYear(long j) {
        return s.c.isLeapYear(j + 1911);
    }

    public final j$.time.temporal.s m(j$.time.temporal.a aVar) {
        int i = z.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.s sVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.s.e(sVar.a - 22932, sVar.d - 22932);
        }
        if (i == 2) {
            j$.time.temporal.s sVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.s.f(1L, sVar2.d - 1911, (-sVar2.a) + 1912);
        }
        if (i != 3) {
            return aVar.b;
        }
        j$.time.temporal.s sVar3 = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.s.e(sVar3.a - 1911, sVar3.d - 1911);
    }

    public Object writeReplace() {
        return new e0((byte) 1, this);
    }
}
