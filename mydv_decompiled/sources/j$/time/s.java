package j$.time;

import androidx.media3.common.C;
import j$.util.Objects;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class s implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    public byte a;
    public Object b;

    public s(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    public static Object a(byte b, ObjectInput objectInput) {
        switch (b) {
            case 1:
                Duration duration = Duration.c;
                long readLong = objectInput.readLong();
                long readInt = objectInput.readInt();
                return Duration.d(a.S(readLong, a.V(readInt, C.NANOS_PER_SECOND)), (int) a.U(readInt, C.NANOS_PER_SECOND));
            case 2:
                Instant instant = Instant.c;
                return Instant.s(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.d;
                return LocalDate.x(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return LocalTime.A(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.c;
                LocalDate localDate2 = LocalDate.d;
                return LocalDateTime.t(LocalDate.x(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.A(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.c;
                LocalDate localDate3 = LocalDate.d;
                LocalDateTime t = LocalDateTime.t(LocalDate.x(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.A(objectInput));
                y z = y.z(objectInput);
                x xVar = (x) a(objectInput.readByte(), objectInput);
                Objects.a(xVar, "zone");
                if (!(xVar instanceof y) || z.equals(xVar)) {
                    return new b0(t, xVar, z);
                }
                h.c("ZoneId must match ZoneOffset");
                return null;
            case 7:
                int i = z.d;
                return x.r(objectInput.readUTF(), false);
            case 8:
                return y.z(objectInput);
            case 9:
                int i2 = q.c;
                return new q(LocalTime.A(objectInput), y.z(objectInput));
            case 10:
                int i3 = p.c;
                LocalDate localDate4 = LocalDate.d;
                return new p(LocalDateTime.t(LocalDate.x(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.A(objectInput)), y.z(objectInput));
            case 11:
                int i4 = u.b;
                return u.q(objectInput.readInt());
            case 12:
                int i5 = w.c;
                int readInt2 = objectInput.readInt();
                byte readByte = objectInput.readByte();
                j$.time.temporal.a.YEAR.i(readInt2);
                j$.time.temporal.a.MONTH_OF_YEAR.i(readByte);
                return new w(readInt2, readByte);
            case 13:
                int i6 = n.c;
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                l t2 = l.t(readByte2);
                Objects.a(t2, "month");
                j$.time.temporal.a.DAY_OF_MONTH.i(readByte3);
                if (readByte3 <= t2.s()) {
                    return new n(t2.getValue(), readByte3);
                }
                throw new c("Illegal value for DayOfMonth field, value " + ((int) readByte3) + " is not valid for month " + t2.name());
            case 14:
                r rVar = r.d;
                int readInt3 = objectInput.readInt();
                int readInt4 = objectInput.readInt();
                int readInt5 = objectInput.readInt();
                return ((readInt3 | readInt4) | readInt5) == 0 ? r.d : new r(readInt3, readInt4, readInt5);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.a = readByte;
        this.b = a(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.a);
                objectOutput.writeInt(duration.b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.a);
                objectOutput.writeInt(instant.b);
                return;
            case 3:
                LocalDate localDate = (LocalDate) obj;
                objectOutput.writeInt(localDate.a);
                objectOutput.writeByte(localDate.b);
                objectOutput.writeByte(localDate.c);
                return;
            case 4:
                ((LocalTime) obj).E(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                LocalDate localDate2 = localDateTime.a;
                objectOutput.writeInt(localDate2.a);
                objectOutput.writeByte(localDate2.b);
                objectOutput.writeByte(localDate2.c);
                localDateTime.b.E(objectOutput);
                return;
            case 6:
                b0 b0Var = (b0) obj;
                LocalDateTime localDateTime2 = b0Var.a;
                LocalDate localDate3 = localDateTime2.a;
                objectOutput.writeInt(localDate3.a);
                objectOutput.writeByte(localDate3.b);
                objectOutput.writeByte(localDate3.c);
                localDateTime2.b.E(objectOutput);
                b0Var.b.A(objectOutput);
                b0Var.c.u(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((z) obj).b);
                return;
            case 8:
                ((y) obj).A(objectOutput);
                return;
            case 9:
                q qVar = (q) obj;
                qVar.a.E(objectOutput);
                qVar.b.A(objectOutput);
                return;
            case 10:
                p pVar = (p) obj;
                LocalDateTime localDateTime3 = pVar.a;
                LocalDate localDate4 = localDateTime3.a;
                objectOutput.writeInt(localDate4.a);
                objectOutput.writeByte(localDate4.b);
                objectOutput.writeByte(localDate4.c);
                localDateTime3.b.E(objectOutput);
                pVar.b.A(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((u) obj).a);
                return;
            case 12:
                w wVar = (w) obj;
                objectOutput.writeInt(wVar.a);
                objectOutput.writeByte(wVar.b);
                return;
            case 13:
                n nVar = (n) obj;
                objectOutput.writeByte(nVar.a);
                objectOutput.writeByte(nVar.b);
                return;
            case 14:
                r rVar = (r) obj;
                objectOutput.writeInt(rVar.a);
                objectOutput.writeInt(rVar.b);
                objectOutput.writeInt(rVar.c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    public s() {
    }
}
