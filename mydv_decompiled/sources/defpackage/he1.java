package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class he1 {
    public final boolean a;
    public final boolean b;
    public final ok3 c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;
    public final Map h;

    public he1(boolean z, boolean z2, ok3 ok3Var, Long l, Long l2, Long l3, Long l4, Map map) {
        map.getClass();
        this.a = z;
        this.b = z2;
        this.c = ok3Var;
        this.d = l;
        this.e = l2;
        this.f = l3;
        this.g = l4;
        this.h = sv2.X(map);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.a) {
            arrayList.add("isRegularFile");
        }
        if (this.b) {
            arrayList.add("isDirectory");
        }
        Long l = this.d;
        if (l != null) {
            arrayList.add("byteCount=" + l.longValue());
        }
        Long l2 = this.e;
        if (l2 != null) {
            arrayList.add("createdAt=" + l2.longValue());
        }
        Long l3 = this.f;
        if (l3 != null) {
            arrayList.add("lastModifiedAt=" + l3.longValue());
        }
        Long l4 = this.g;
        if (l4 != null) {
            arrayList.add("lastAccessedAt=" + l4.longValue());
        }
        Map map = this.h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return o70.Z0(arrayList, ", ", "FileMetadata(", ")", 0, null, 56);
    }

    public /* synthetic */ he1(boolean z, boolean z2, ok3 ok3Var, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, ok3Var, l, l2, l3, l4, p91.I);
    }
}
