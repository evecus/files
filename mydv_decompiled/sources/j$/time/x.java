package j$.time;

import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public abstract class x implements Serializable {
    public static final Map a;
    private static final long serialVersionUID = 8352817235686L;

    static {
        Map.Entry[] entryArr = {a.T("ACT", "Australia/Darwin"), a.T("AET", "Australia/Sydney"), a.T("AGT", "America/Argentina/Buenos_Aires"), a.T("ART", "Africa/Cairo"), a.T("AST", "America/Anchorage"), a.T("BET", "America/Sao_Paulo"), a.T("BST", "Asia/Dhaka"), a.T("CAT", "Africa/Harare"), a.T("CNT", "America/St_Johns"), a.T("CST", "America/Chicago"), a.T("CTT", "Asia/Shanghai"), a.T("EAT", "Africa/Addis_Ababa"), a.T("ECT", "Europe/Paris"), a.T("IET", "America/Indiana/Indianapolis"), a.T("IST", "Asia/Kolkata"), a.T("JST", "Asia/Tokyo"), a.T("MIT", "Pacific/Apia"), a.T("NET", "Asia/Yerevan"), a.T("NST", "Pacific/Auckland"), a.T("PLT", "Asia/Karachi"), a.T("PNT", "America/Phoenix"), a.T("PRT", "America/Puerto_Rico"), a.T("PST", "America/Los_Angeles"), a.T("SST", "Pacific/Guadalcanal"), a.T("VST", "Asia/Ho_Chi_Minh"), a.T("EST", "-05:00"), a.T("MST", "-07:00"), a.T("HST", "-10:00")};
        HashMap hashMap = new HashMap(28);
        for (int i = 0; i < 28; i++) {
            Map.Entry entry = entryArr[i];
            Object requireNonNull = Objects.requireNonNull(entry.getKey());
            if (hashMap.put(requireNonNull, Objects.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + requireNonNull);
            }
        }
        a = Collections.unmodifiableMap(hashMap);
    }

    public x() {
        if (getClass() != y.class && getClass() != z.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static x r(String str, boolean z) {
        Objects.a(str, "zoneId");
        return (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) ? y.v(str) : (str.startsWith("UTC") || str.startsWith("GMT")) ? t(str, 3, z) : str.startsWith("UT") ? t(str, 2, z) : z.v(str, z);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static x s(String str, y yVar) {
        Objects.a(yVar, "offset");
        if (str.isEmpty()) {
            return yVar;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            h.c("prefix should be GMT, UTC or UT, is: ".concat(str));
            return null;
        }
        if (yVar.b != 0) {
            str = str.concat(yVar.c);
        }
        return new z(str, new j$.time.zone.f(yVar));
    }

    public static x t(String str, int i, boolean z) {
        String substring = str.substring(0, i);
        if (str.length() == i) {
            return s(substring, y.f);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return z.v(str, z);
        }
        try {
            y v = y.v(str.substring(i));
            return v == y.f ? s(substring, v) : s(substring, v);
        } catch (c e) {
            throw new c("Invalid ID for offset-based ZoneId: ".concat(str), e);
        }
    }

    private Object writeReplace() {
        return new s((byte) 7, this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            return getId().equals(((x) obj).getId());
        }
        return false;
    }

    public abstract String getId();

    public int hashCode() {
        return getId().hashCode();
    }

    public abstract j$.time.zone.f q();

    public String toString() {
        return getId();
    }

    public abstract void u(DataOutput dataOutput);
}
