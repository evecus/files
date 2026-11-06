package j$.time;

import androidx.media3.common.C;
import androidx.media3.common.PlaybackException;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class LocalTime implements j$.time.temporal.l, j$.time.temporal.n, Comparable<LocalTime>, Serializable {
    public static final LocalTime e;
    public static final LocalTime f;
    public static final LocalTime g;
    public static final LocalTime[] h = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            LocalTime[] localTimeArr = h;
            if (i >= localTimeArr.length) {
                LocalTime localTime = localTimeArr[0];
                g = localTime;
                LocalTime localTime2 = localTimeArr[12];
                e = localTime;
                f = new LocalTime(23, 59, 59, 999999999);
                return;
            }
            localTimeArr[i] = new LocalTime(i, 0, 0, 0);
            i++;
        }
    }

    public LocalTime(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    public static LocalTime A(DataInput dataInput) {
        int readInt;
        int i;
        int readByte = dataInput.readByte();
        byte b = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            i = 0;
            readInt = 0;
        } else {
            byte readByte2 = dataInput.readByte();
            if (readByte2 < 0) {
                ?? r7 = ~readByte2;
                readInt = 0;
                b = r7;
                i = 0;
            } else {
                byte readByte3 = dataInput.readByte();
                if (readByte3 < 0) {
                    i = ~readByte3;
                    readInt = 0;
                    b = readByte2;
                } else {
                    readInt = dataInput.readInt();
                    b = readByte2;
                    i = readByte3;
                }
            }
        }
        j$.time.temporal.a.HOUR_OF_DAY.i(readByte);
        j$.time.temporal.a.MINUTE_OF_HOUR.i(b);
        j$.time.temporal.a.SECOND_OF_MINUTE.i(i);
        j$.time.temporal.a.NANO_OF_SECOND.i(readInt);
        return r(readByte, b, i, readInt);
    }

    public static LocalTime now() {
        b c0 = a.c0();
        Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        x xVar = c0.a;
        Objects.a(ofEpochMilli, "instant");
        Objects.a(xVar, "zone");
        return u((((int) a.U(ofEpochMilli.a + xVar.q().d(ofEpochMilli).b, 86400L)) * C.NANOS_PER_SECOND) + ofEpochMilli.b);
    }

    public static LocalTime ofSecondOfDay(long j) {
        j$.time.temporal.a.SECOND_OF_DAY.i(j);
        int i = (int) (j / 3600);
        long j2 = j - (i * 3600);
        return r(i, (int) (j2 / 60), (int) (j2 - (r1 * 60)), 0);
    }

    public static LocalTime r(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? h[i] : new LocalTime(i, i2, i3, i4);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static LocalTime s(j$.time.temporal.m mVar) {
        LocalTime localTime = (LocalTime) mVar.i(j$.time.temporal.q.g);
        if (localTime != null) {
            return localTime;
        }
        throw new c("Unable to obtain LocalTime from TemporalAccessor: " + mVar + " of type " + mVar.getClass().getName());
    }

    public static LocalTime u(long j) {
        j$.time.temporal.a.NANO_OF_DAY.i(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / C.NANOS_PER_SECOND);
        return r(i, i2, i3, (int) (j3 - (i3 * C.NANOS_PER_SECOND)));
    }

    private Object writeReplace() {
        return new s((byte) 4, this);
    }

    public final long B() {
        return (this.c * C.NANOS_PER_SECOND) + (this.b * 60000000000L) + (this.a * 3600000000000L) + this.d;
    }

    @Override // j$.time.temporal.l
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final LocalTime a(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (LocalTime) pVar.h(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.i(j);
        switch (j.a[aVar.ordinal()]) {
            case 1:
                return D((int) j);
            case 2:
                return u(j);
            case 3:
                return D(((int) j) * 1000);
            case 4:
                return u(j * 1000);
            case 5:
                return D(((int) j) * PlaybackException.CUSTOM_ERROR_CODE_BASE);
            case 6:
                return u(j * 1000000);
            case 7:
                int i = (int) j;
                if (this.c != i) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.i(i);
                    return r(this.a, this.b, i, this.d);
                }
                return this;
            case 8:
                return z(j - toSecondOfDay());
            case 9:
                int i2 = (int) j;
                if (this.b != i2) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.i(i2);
                    return r(this.a, i2, this.c, this.d);
                }
                return this;
            case 10:
                return x(j - ((this.a * 60) + this.b));
            case 11:
                return w(j - (this.a % 12));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return w(j - (this.a % 12));
            case 13:
                int i3 = (int) j;
                if (this.a != i3) {
                    j$.time.temporal.a.HOUR_OF_DAY.i(i3);
                    return r(i3, this.b, this.c, this.d);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i4 = (int) j;
                if (this.a != i4) {
                    j$.time.temporal.a.HOUR_OF_DAY.i(i4);
                    return r(i4, this.b, this.c, this.d);
                }
                return this;
            case 15:
                return w((j - (this.a / 12)) * 12);
            default:
                throw new j$.time.temporal.r(d.a("Unsupported field: ", pVar));
        }
    }

    public final LocalTime D(int i) {
        if (this.d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.i(i);
        return r(this.a, this.b, this.c, i);
    }

    public final void E(DataOutput dataOutput) {
        if (this.d != 0) {
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(this.c);
            dataOutput.writeInt(this.d);
            return;
        }
        if (this.c != 0) {
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(~this.c);
            return;
        }
        byte b = this.b;
        byte b2 = this.a;
        if (b == 0) {
            dataOutput.writeByte(~b2);
        } else {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(~this.b);
        }
    }

    @Override // j$.time.temporal.m
    public final boolean c(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).l() : pVar != null && pVar.d(this);
    }

    @Override // j$.time.temporal.m
    public final int d(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? t(pVar) : j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l e(LocalDate localDate) {
        localDate.getClass();
        return (LocalTime) a.a(localDate, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.a == localTime.a && this.b == localTime.b && this.c == localTime.c && this.d == localTime.d) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.s f(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.d(this, pVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    public int getMinute() {
        return this.b;
    }

    public int getSecond() {
        return this.c;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l h(j$.time.temporal.l lVar) {
        return lVar.a(B(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int hashCode() {
        long B = B();
        return (int) (B ^ (B >>> 32));
    }

    @Override // j$.time.temporal.m
    public final Object i(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.b || aVar == j$.time.temporal.q.a || aVar == j$.time.temporal.q.e || aVar == j$.time.temporal.q.d) {
            return null;
        }
        if (aVar == j$.time.temporal.q.g) {
            return this;
        }
        if (aVar == j$.time.temporal.q.f) {
            return null;
        }
        return aVar == j$.time.temporal.q.c ? ChronoUnit.NANOS : aVar.a(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l l(long j, ChronoUnit chronoUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, chronoUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, chronoUnit);
    }

    @Override // j$.time.temporal.m
    public final long m(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.NANO_OF_DAY ? B() : pVar == j$.time.temporal.a.MICRO_OF_DAY ? B() / 1000 : t(pVar) : pVar.f(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final int compareTo(LocalTime localTime) {
        int compare = Integer.compare(this.a, localTime.a);
        return (compare == 0 && (compare = Integer.compare(this.b, localTime.b)) == 0 && (compare = Integer.compare(this.c, localTime.c)) == 0) ? Integer.compare(this.d, localTime.d) : compare;
    }

    public final int t(j$.time.temporal.p pVar) {
        switch (j.a[((j$.time.temporal.a) pVar).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                throw new j$.time.temporal.r("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.d / 1000;
            case 4:
                throw new j$.time.temporal.r("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.d / PlaybackException.CUSTOM_ERROR_CODE_BASE;
            case 6:
                return (int) (B() / 1000000);
            case 7:
                return this.c;
            case 8:
                return toSecondOfDay();
            case 9:
                return this.b;
            case 10:
                return (this.a * 60) + this.b;
            case 11:
                return this.a % 12;
            case 12:
                int i = this.a % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.a;
            case 14:
                byte b = this.a;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.a / 12;
            default:
                throw new j$.time.temporal.r(d.a("Unsupported field: ", pVar));
        }
    }

    public int toSecondOfDay() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        byte b2 = this.b;
        byte b3 = this.c;
        int i = this.d;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % PlaybackException.CUSTOM_ERROR_CODE_BASE == 0) {
                    sb.append(Integer.toString((i / PlaybackException.CUSTOM_ERROR_CODE_BASE) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + PlaybackException.CUSTOM_ERROR_CODE_BASE).substring(1));
                } else {
                    sb.append(Integer.toString(i + Http2Connection.DEGRADED_PONG_TIMEOUT_NS).substring(1));
                }
            }
        }
        return sb.toString();
    }

    public LocalTime truncatedTo(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.NANOS) {
            return this;
        }
        Duration duration = temporalUnit.getDuration();
        long j = duration.a;
        if (j > 86400) {
            throw new j$.time.temporal.r("Unit is too large to be used for truncation");
        }
        long j2 = duration.b;
        if (j < 0) {
            j++;
            j2 -= C.NANOS_PER_SECOND;
        }
        long S = a.S(a.W(j, C.NANOS_PER_SECOND), j2);
        if (86400000000000L % S == 0) {
            return u((B() / S) * S);
        }
        throw new j$.time.temporal.r("Unit must divide into a standard day without remainder");
    }

    @Override // j$.time.temporal.l
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final LocalTime b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalTime) temporalUnit.d(this, j);
        }
        switch (j.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return y(j);
            case 2:
                return y((j % 86400000000L) * 1000);
            case 3:
                return y((j % 86400000) * 1000000);
            case 4:
                return z(j);
            case 5:
                return x(j);
            case 6:
                return w(j);
            case 7:
                return w((j % 2) * 12);
            default:
                h.b(temporalUnit, "Unsupported unit: ");
                return null;
        }
    }

    public final LocalTime w(long j) {
        return j == 0 ? this : r(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final LocalTime x(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return r(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    public final LocalTime y(long j) {
        if (j != 0) {
            long B = B();
            long j2 = (((j % 86400000000000L) + B) + 86400000000000L) % 86400000000000L;
            if (B != j2) {
                return r((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / C.NANOS_PER_SECOND) % 60), (int) (j2 % C.NANOS_PER_SECOND));
            }
        }
        return this;
    }

    public final LocalTime z(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return r(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }
}
