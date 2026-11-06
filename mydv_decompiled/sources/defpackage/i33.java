package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class i33 extends a3 {
    public transient h33 O;

    @Override // defpackage.a3, defpackage.v3
    public final Map d() {
        Map map = this.M;
        return map instanceof NavigableMap ? new j3(this, (NavigableMap) map) : map instanceof SortedMap ? new m3(this, (SortedMap) map) : new g3(this, map);
    }

    @Override // defpackage.a3, defpackage.v3
    public final Set f() {
        Map map = this.M;
        return map instanceof NavigableMap ? new k3(this, (NavigableMap) map) : map instanceof SortedMap ? new n3(this, (SortedMap) map) : new i3(this, map);
    }

    @Override // defpackage.a3
    public final Collection j() {
        return (List) this.O.get();
    }
}
