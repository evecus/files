package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.y;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;
    public final long a;
    public final LocalDateTime b;
    public final y c;
    public final y d;

    public b(LocalDateTime localDateTime, y yVar, y yVar2) {
        localDateTime.getClass();
        this.a = j$.time.a.A(localDateTime, yVar);
        this.b = localDateTime;
        this.c = yVar;
        this.d = yVar2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((b) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.a == bVar.a && this.c.equals(bVar.c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.d.b, 16) ^ (this.b.hashCode() ^ this.c.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(this.d.b > this.c.b ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.b);
        sb.append(this.c);
        sb.append(" to ");
        sb.append(this.d);
        sb.append(']');
        return sb.toString();
    }

    public b(long j, y yVar, y yVar2) {
        this.a = j;
        this.b = LocalDateTime.u(j, 0, yVar);
        this.c = yVar;
        this.d = yVar2;
    }
}
