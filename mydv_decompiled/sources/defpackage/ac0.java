package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class ac0 implements u94 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nk b;

    public /* synthetic */ ac0(nk nkVar, byte b) {
        this.a = b;
        this.b = nkVar;
    }

    @Override // defpackage.u94
    public final Bundle a() {
        byte b = this.a;
        nk nkVar = this.b;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                gc0 gc0Var = nkVar.P;
                gc0Var.getClass();
                LinkedHashMap linkedHashMap = gc0Var.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(gc0Var.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(gc0Var.g));
                return bundle;
            default:
                Iterator it = ((ll1) nkVar.c0.J).K.c.o().iterator();
                while (it.hasNext()) {
                    r7.K(it.next());
                }
                nkVar.d0.e(ji2.ON_STOP);
                return new Bundle();
        }
    }
}
