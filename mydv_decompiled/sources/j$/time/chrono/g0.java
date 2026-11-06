package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalDateTime;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class g0 extends a implements Serializable {
    public static final g0 c = new g0();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private g0() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.a
    public final b d(int i) {
        return new i0(LocalDate.x(i - 543, 1, 1));
    }

    @Override // j$.time.chrono.a
    public final b e(j$.time.temporal.m mVar) {
        return mVar instanceof i0 ? (i0) mVar : new i0(LocalDate.s(mVar));
    }

    @Override // j$.time.chrono.a
    public final m f(int i) {
        if (i == 0) {
            return j0.BEFORE_BE;
        }
        if (i == 1) {
            return j0.BE;
        }
        j$.time.h.d("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.a
    public final String getCalendarType() {
        return "buddhist";
    }

    @Override // j$.time.chrono.a
    public final String getId() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.a
    public final e h(LocalDateTime localDateTime) {
        return super.h(localDateTime);
    }

    @Override // j$.time.chrono.a
    public final boolean isLeapYear(long j) {
        return s.c.isLeapYear(j - 543);
    }

    public final j$.time.temporal.s m(j$.time.temporal.a aVar) {
        int i = f0.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.s sVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.s.e(sVar.a + 6516, sVar.d + 6516);
        }
        if (i == 2) {
            j$.time.temporal.s sVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.s.f(1L, (-(sVar2.a + 543)) + 1, sVar2.d + 543);
        }
        if (i != 3) {
            return aVar.b;
        }
        j$.time.temporal.s sVar3 = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.s.e(sVar3.a + 543, sVar3.d + 543);
    }

    public Object writeReplace() {
        return new e0((byte) 1, this);
    }
}
