package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class ad1 {
    public static vs1 a(jw5 jw5Var, FoldingFeature foldingFeature) {
        ej1 ej1Var;
        ej1 ej1Var2;
        jw5Var.getClass();
        foldingFeature.getClass();
        int type = foldingFeature.getType();
        if (type == 1) {
            ej1Var = ej1.Q;
        } else {
            if (type != 2) {
                return null;
            }
            ej1Var = ej1.R;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            ej1Var2 = ej1.O;
        } else {
            if (state != 2) {
                return null;
            }
            ej1Var2 = ej1.P;
        }
        Rect bounds = foldingFeature.getBounds();
        bounds.getClass();
        fx fxVar = new fx(bounds);
        Rect c = jw5Var.a.c();
        if (fxVar.a() == 0 && fxVar.b() == 0) {
            return null;
        }
        if (fxVar.b() != c.width() && fxVar.a() != c.height()) {
            return null;
        }
        if (fxVar.b() < c.width() && fxVar.a() < c.height()) {
            return null;
        }
        if (fxVar.b() == c.width() && fxVar.a() == c.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        bounds2.getClass();
        return new vs1(new fx(bounds2), ej1Var, ej1Var2);
    }

    public static iw5 b(jw5 jw5Var, WindowLayoutInfo windowLayoutInfo) {
        jw5Var.getClass();
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            vs1 a = foldingFeature instanceof FoldingFeature ? a(jw5Var, foldingFeature) : null;
            if (a != null) {
                arrayList.add(a);
            }
        }
        return new iw5(arrayList);
    }

    public static iw5 c(Context context, WindowLayoutInfo windowLayoutInfo) {
        nw5 nw5Var = n84.V0;
        nw5 nw5Var2 = ix.J;
        nw5 nw5Var3 = ku0.J;
        context.getClass();
        int i = Build.VERSION.SDK_INT;
        ju0 ju0Var = i >= 34 ? ku0.I : k04.Q;
        p70.u(1, 2, 4, 8, 16, 32, 64, 128);
        if (i >= 30) {
            if (i >= 34) {
                nw5Var = nw5Var3;
            } else if (i >= 30) {
                nw5Var = nw5Var2;
            }
            return b(nw5Var.f(context, ju0Var), windowLayoutInfo);
        }
        if (i < 29 || !(context instanceof Activity)) {
            zy.p("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            return null;
        }
        Activity activity = (Activity) context;
        if (i >= 34) {
            nw5Var = nw5Var3;
        } else if (i >= 30) {
            nw5Var = nw5Var2;
        }
        return b(nw5Var.c(activity, ju0Var), windowLayoutInfo);
    }
}
