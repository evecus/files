package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class e0 implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    public byte a;
    public Object b;

    public e0(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object i;
        byte readByte = objectInput.readByte();
        this.a = readByte;
        switch (readByte) {
            case 1:
                ConcurrentHashMap concurrentHashMap = a.a;
                i = a.i(objectInput.readUTF());
                break;
            case 2:
                i = ((b) objectInput.readObject()).n((LocalTime) objectInput.readObject());
                break;
            case 3:
                i = ((e) objectInput.readObject()).g((j$.time.y) objectInput.readObject()).k((j$.time.x) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = x.d;
                int readInt = objectInput.readInt();
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                v.c.getClass();
                i = new x(LocalDate.x(readInt, readByte2, readByte3));
                break;
            case 5:
                y yVar = y.d;
                i = y.s(objectInput.readByte());
                break;
            case 6:
                o oVar = (o) objectInput.readObject();
                int readInt2 = objectInput.readInt();
                byte readByte4 = objectInput.readByte();
                byte readByte5 = objectInput.readByte();
                oVar.getClass();
                i = new q(oVar, readInt2, readByte4, readByte5);
                break;
            case 7:
                int readInt3 = objectInput.readInt();
                byte readByte6 = objectInput.readByte();
                byte readByte7 = objectInput.readByte();
                a0.c.getClass();
                i = new c0(LocalDate.x(readInt3 + 1911, readByte6, readByte7));
                break;
            case 8:
                int readInt4 = objectInput.readInt();
                byte readByte8 = objectInput.readByte();
                byte readByte9 = objectInput.readByte();
                g0.c.getClass();
                i = new i0(LocalDate.x(readInt4 - 543, readByte8, readByte9));
                break;
            case 9:
                int i2 = h.e;
                i = new h(a.i(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.b = i;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                objectOutput.writeUTF(((a) obj).getId());
                return;
            case 2:
                g gVar = (g) obj;
                objectOutput.writeObject(gVar.a);
                objectOutput.writeObject(gVar.b);
                return;
            case 3:
                l lVar = (l) obj;
                objectOutput.writeObject(lVar.a);
                objectOutput.writeObject(lVar.b);
                objectOutput.writeObject(lVar.c);
                return;
            case 4:
                x xVar = (x) obj;
                xVar.getClass();
                objectOutput.writeInt(j$.time.temporal.q.a(xVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(xVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(xVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((y) obj).a);
                return;
            case 6:
                q qVar = (q) obj;
                objectOutput.writeObject(qVar.a);
                objectOutput.writeInt(j$.time.temporal.q.a(qVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(qVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(qVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 7:
                c0 c0Var = (c0) obj;
                c0Var.getClass();
                objectOutput.writeInt(j$.time.temporal.q.a(c0Var, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(c0Var, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(c0Var, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                i0 i0Var = (i0) obj;
                i0Var.getClass();
                objectOutput.writeInt(j$.time.temporal.q.a(i0Var, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(i0Var, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(i0Var, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                h hVar = (h) obj;
                objectOutput.writeUTF(hVar.a.getId());
                objectOutput.writeInt(hVar.b);
                objectOutput.writeInt(hVar.c);
                objectOutput.writeInt(hVar.d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    public e0() {
    }
}
