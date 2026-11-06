package j$.time.zone;

import j$.time.LocalTime;
import j$.time.l;
import j$.time.y;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    public final l a;
    public final byte b;
    public final j$.time.e c;
    public final LocalTime d;
    public final boolean e;
    public final d f;
    public final y g;
    public final y h;
    public final y i;

    public e(l lVar, int i, j$.time.e eVar, LocalTime localTime, boolean z, d dVar, y yVar, y yVar2, y yVar3) {
        this.a = lVar;
        this.b = (byte) i;
        this.c = eVar;
        this.d = localTime;
        this.e = z;
        this.f = dVar;
        this.g = yVar;
        this.h = yVar2;
        this.i = yVar3;
    }

    public static e a(DataInput dataInput) {
        LocalTime localTime;
        int readInt = dataInput.readInt();
        l t = l.t(readInt >>> 28);
        int i = ((264241152 & readInt) >>> 22) - 32;
        int i2 = (3670016 & readInt) >>> 19;
        j$.time.e q = i2 == 0 ? null : j$.time.e.q(i2);
        int i3 = (507904 & readInt) >>> 14;
        d dVar = d.values()[(readInt & 12288) >>> 12];
        int i4 = (readInt & 4080) >>> 4;
        int i5 = (readInt & 12) >>> 2;
        int i6 = readInt & 3;
        if (i3 == 31) {
            localTime = LocalTime.ofSecondOfDay(dataInput.readInt());
        } else {
            int i7 = i3 % 24;
            LocalTime localTime2 = LocalTime.e;
            j$.time.temporal.a.HOUR_OF_DAY.i(i7);
            localTime = LocalTime.h[i7];
        }
        y x = y.x(i4 == 255 ? dataInput.readInt() : (i4 - 128) * 900);
        y x2 = y.x(i5 == 3 ? dataInput.readInt() : (i5 * 1800) + x.b);
        y x3 = i6 == 3 ? y.x(dataInput.readInt()) : y.x((i6 * 1800) + x.b);
        boolean z = i3 == 24;
        Objects.a(t, "month");
        Objects.a(localTime, "time");
        Objects.a(dVar, "timeDefnition");
        if (i < -28 || i > 31 || i == 0) {
            j$.time.h.c("Day of month indicator must be between -28 and 31 inclusive excluding zero");
            return null;
        }
        if (z && !localTime.equals(LocalTime.g)) {
            j$.time.h.c("Time must be midnight when end of day flag is true");
            return null;
        }
        if (localTime.d == 0) {
            return new e(t, i, q, localTime, z, dVar, x, x2, x3);
        }
        j$.time.h.c("Time's nano-of-second must be zero");
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        int secondOfDay = this.e ? 86400 : this.d.toSecondOfDay();
        int i = this.g.b;
        int i2 = this.h.b - i;
        int i3 = this.i.b - i;
        byte b = secondOfDay % 3600 == 0 ? this.e ? (byte) 24 : this.d.a : (byte) 31;
        int i4 = i % 900 == 0 ? (i / 900) + 128 : 255;
        int i5 = (i2 == 0 || i2 == 1800 || i2 == 3600) ? i2 / 1800 : 3;
        int i6 = (i3 == 0 || i3 == 1800 || i3 == 3600) ? i3 / 1800 : 3;
        j$.time.e eVar = this.c;
        dataOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + ((eVar == null ? 0 : eVar.getValue()) << 19) + (b << 14) + (this.f.ordinal() << 12) + (i4 << 4) + (i5 << 2) + i6);
        if (b == 31) {
            dataOutput.writeInt(secondOfDay);
        }
        if (i4 == 255) {
            dataOutput.writeInt(i);
        }
        if (i5 == 3) {
            dataOutput.writeInt(this.h.b);
        }
        if (i6 == 3) {
            dataOutput.writeInt(this.i.b);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.f == eVar.f && this.d.equals(eVar.d) && this.e == eVar.e && this.g.equals(eVar.g) && this.h.equals(eVar.h) && this.i.equals(eVar.i);
    }

    public final int hashCode() {
        int secondOfDay = ((this.d.toSecondOfDay() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        j$.time.e eVar = this.c;
        return this.i.b ^ ((this.g.b ^ (this.f.ordinal() + (secondOfDay + ((eVar == null ? 7 : eVar.ordinal()) << 2)))) ^ this.h.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        sb.append(this.i.b - this.h.b > 0 ? "Gap " : "Overlap ");
        sb.append(this.h);
        sb.append(" to ");
        sb.append(this.i);
        sb.append(", ");
        j$.time.e eVar = this.c;
        if (eVar != null) {
            byte b = this.b;
            if (b == -1) {
                sb.append(eVar.name());
                sb.append(" on or before last day of ");
                sb.append(this.a.name());
            } else if (b < 0) {
                sb.append(eVar.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.b) - 1);
                sb.append(" of ");
                sb.append(this.a.name());
            } else {
                sb.append(eVar.name());
                sb.append(" on or after ");
                sb.append(this.a.name());
                sb.append(' ');
                sb.append((int) this.b);
            }
        } else {
            sb.append(this.a.name());
            sb.append(' ');
            sb.append((int) this.b);
        }
        sb.append(" at ");
        sb.append(this.e ? "24:00" : this.d.toString());
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }
}
