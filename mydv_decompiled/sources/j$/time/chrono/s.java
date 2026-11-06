package j$.time.chrono;

import j$.time.LocalDateTime;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class s extends a implements Serializable {
    public static final s c = new s();
    private static final long serialVersionUID = -1440403870442975015L;

    private s() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.a
    public final m f(int i) {
        if (i == 0) {
            return t.BCE;
        }
        if (i == 1) {
            return t.CE;
        }
        j$.time.h.d("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.a
    public final String getCalendarType() {
        return "iso8601";
    }

    @Override // j$.time.chrono.a
    public final String getId() {
        return "ISO";
    }

    @Override // j$.time.chrono.a
    public final e h(LocalDateTime localDateTime) {
        return LocalDateTime.r(localDateTime);
    }

    public Object writeReplace() {
        return new e0((byte) 1, this);
    }
}
