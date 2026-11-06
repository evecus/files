package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalDateTime;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class v extends a implements Serializable {
    public static final v c = new v();
    private static final long serialVersionUID = 459996390165777884L;

    private v() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.a
    public final b d(int i) {
        return new x(LocalDate.x(i, 1, 1));
    }

    @Override // j$.time.chrono.a
    public final b e(j$.time.temporal.m mVar) {
        return mVar instanceof x ? (x) mVar : new x(LocalDate.s(mVar));
    }

    @Override // j$.time.chrono.a
    public final m f(int i) {
        return y.s(i);
    }

    @Override // j$.time.chrono.a
    public final String getCalendarType() {
        return "japanese";
    }

    @Override // j$.time.chrono.a
    public final String getId() {
        return "Japanese";
    }

    @Override // j$.time.chrono.a
    public final e h(LocalDateTime localDateTime) {
        return super.h(localDateTime);
    }

    @Override // j$.time.chrono.a
    public final boolean isLeapYear(long j) {
        return s.c.isLeapYear(j);
    }

    public final j$.time.temporal.s m(j$.time.temporal.a aVar) {
        switch (u.a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                j$.time.h.b(aVar, "Unsupported field: ");
                return null;
            case 5:
                y[] yVarArr = y.e;
                int i = yVarArr[yVarArr.length - 1].b.a;
                int i2 = Http2Connection.DEGRADED_PONG_TIMEOUT_NS - yVarArr[yVarArr.length - 1].b.a;
                int i3 = yVarArr[0].b.a;
                int i4 = 1;
                while (true) {
                    y[] yVarArr2 = y.e;
                    if (i4 >= yVarArr2.length) {
                        return j$.time.temporal.s.f(1L, i2, 999999999 - i);
                    }
                    y yVar = yVarArr2[i4];
                    i2 = Math.min(i2, (yVar.b.a - i3) + 1);
                    i3 = yVar.b.a;
                    i4++;
                }
            case 6:
                y yVar2 = y.d;
                long j = j$.time.temporal.a.DAY_OF_YEAR.b.c;
                long j2 = j;
                for (y yVar3 : y.e) {
                    long min = Math.min(j2, (yVar3.b.lengthOfYear() - yVar3.b.v()) + 1);
                    j2 = yVar3.r() != null ? Math.min(min, yVar3.r().b.v() - 1) : min;
                }
                return j$.time.temporal.s.f(1L, j2, j$.time.temporal.a.DAY_OF_YEAR.b.d);
            case 7:
                return j$.time.temporal.s.e(x.d.a, 999999999L);
            case 8:
                long j3 = y.d.a;
                y[] yVarArr3 = y.e;
                return j$.time.temporal.s.e(j3, yVarArr3[yVarArr3.length - 1].a);
            default:
                return aVar.b;
        }
    }

    public Object writeReplace() {
        return new e0((byte) 1, this);
    }
}
