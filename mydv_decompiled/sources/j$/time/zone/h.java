package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class h implements PrivilegedAction {
    public final /* synthetic */ List a;

    public h(List list) {
        this.a = list;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property == null) {
            i.b(new i());
            return null;
        }
        try {
            i iVar = (i) i.class.cast(Class.forName(property, true, i.class.getClassLoader()).newInstance());
            i.b(iVar);
            ((ArrayList) this.a).add(iVar);
            return null;
        } catch (Exception e) {
            throw new Error(e);
        }
    }
}
