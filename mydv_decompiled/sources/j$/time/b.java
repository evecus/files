package j$.time;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class b extends a implements Serializable {
    private static final long serialVersionUID = 6740630888130243051L;
    public final x a;

    static {
        System.currentTimeMillis();
        y yVar = y.f;
    }

    public b(x xVar) {
        this.a = xVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.a.equals(((b) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.a + "]";
    }
}
