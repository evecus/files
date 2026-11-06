package j$.time.temporal;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class u implements Serializable {
    public static final ConcurrentHashMap g = new ConcurrentHashMap(4, 2);
    public static final h h;
    private static final long serialVersionUID = -1177360819670808121L;
    public final j$.time.e a;
    public final int b;
    public final transient t c;
    public final transient t d;
    public final transient t e;
    public final transient t f;

    static {
        new u(j$.time.e.MONDAY, 4);
        a(j$.time.e.SUNDAY, 1);
        h = i.d;
    }

    public u(j$.time.e eVar, int i) {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.WEEKS;
        this.c = new t("DayOfWeek", this, chronoUnit, chronoUnit2, t.f);
        this.d = new t("WeekOfMonth", this, chronoUnit2, ChronoUnit.MONTHS, t.g);
        h hVar = i.d;
        this.e = new t("WeekOfWeekBasedYear", this, chronoUnit2, hVar, t.i);
        this.f = new t("WeekBasedYear", this, hVar, ChronoUnit.FOREVER, a.YEAR.b);
        Objects.a(eVar, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            j$.time.h.c("Minimal number of days is invalid");
            throw null;
        }
        this.a = eVar;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static u a(j$.time.e eVar, int i) {
        String str = eVar.toString() + i;
        ConcurrentHashMap concurrentHashMap = g;
        u uVar = (u) concurrentHashMap.get(str);
        if (uVar != null) {
            return uVar;
        }
        concurrentHashMap.putIfAbsent(str, new u(eVar, i));
        return (u) concurrentHashMap.get(str);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (this.a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i = this.b;
        if (i < 1 || i > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() {
        try {
            return a(this.a, this.b);
        } catch (IllegalArgumentException e) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e.getMessage());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && hashCode() == obj.hashCode();
    }

    public final int hashCode() {
        return (this.a.ordinal() * 7) + this.b;
    }

    public final String toString() {
        return "WeekFields[" + this.a + "," + this.b + "]";
    }
}
