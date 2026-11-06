package j$.time;

import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class z extends x {
    public static final /* synthetic */ int d = 0;
    private static final long serialVersionUID = 8386373296231747096L;
    public final String b;
    public final transient j$.time.zone.f c;

    public z(String str, j$.time.zone.f fVar) {
        this.b = str;
        this.c = fVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static z v(String str, boolean z) {
        j$.time.zone.f fVar;
        Objects.a(str, "zoneId");
        int length = str.length();
        if (length < 2) {
            throw new c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i == 0) && ((charAt < '0' || charAt > '9' || i == 0) && ((charAt != '~' || i == 0) && ((charAt != '.' || i == 0) && ((charAt != '_' || i == 0) && ((charAt != '+' || i == 0) && (charAt != '-' || i == 0))))))))) {
                throw new c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
            }
        }
        try {
            fVar = j$.time.zone.i.a(str);
        } catch (j$.time.zone.g e) {
            if (z) {
                throw e;
            }
            fVar = null;
        }
        return new z(str, fVar);
    }

    private Object writeReplace() {
        return new s((byte) 7, this);
    }

    @Override // j$.time.x
    public final String getId() {
        return this.b;
    }

    @Override // j$.time.x
    public final j$.time.zone.f q() {
        j$.time.zone.f fVar = this.c;
        return fVar != null ? fVar : j$.time.zone.i.a(this.b);
    }

    @Override // j$.time.x
    public final void u(DataOutput dataOutput) {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.b);
    }
}
