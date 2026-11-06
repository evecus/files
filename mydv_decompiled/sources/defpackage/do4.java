package defpackage;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class do4 {
    public static final /* synthetic */ int b = 0;
    public final pi5 a = pi5.J;

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (j42.c(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return j42.c(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (a((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean e(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2;
    }

    public static final boolean f(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return (sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true;
    }

    public static final boolean g(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0;
    }

    public static final boolean h(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0;
    }

    public final iw5 c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new iw5(o91.I);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        co4.d(sidecarDeviceState2, co4.b(sidecarDeviceState));
        return new iw5(d(co4.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList d(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vs1 i = i((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (i != null) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    public final vs1 i(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        ej1 ej1Var;
        ej1 ej1Var2 = ej1.O;
        sidecarDisplayFeature.getClass();
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new zg5(sidecarDisplayFeature, this.a, k04.J).S("Type must be either TYPE_FOLD or TYPE_HINGE", new yn4()).S("Feature bounds must not be 0", new zn4()).S("TYPE_FOLD must have 0 area", new ao4()).S("Feature be pinned to either left or top", new bo4()).i();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            ej1Var = ej1.Q;
        } else {
            if (type != 2) {
                return null;
            }
            ej1Var = ej1.R;
        }
        int b2 = co4.b(sidecarDeviceState);
        if (b2 == 0 || b2 == 1) {
            return null;
        }
        if (b2 == 2) {
            ej1Var2 = ej1.P;
        } else if (b2 != 3 && b2 == 4) {
            return null;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        rect.getClass();
        return new vs1(new fx(rect), ej1Var, ej1Var2);
    }
}
