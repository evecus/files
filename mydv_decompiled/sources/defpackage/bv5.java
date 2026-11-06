package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class bv5 extends WindowInsetsAnimation$Callback {
    public final wu5 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public bv5(wu5 wu5Var) {
        super(wu5Var.J);
        this.d = new HashMap();
        this.a = wu5Var;
    }

    public final ev5 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.d;
        ev5 ev5Var = (ev5) hashMap.get(windowInsetsAnimation);
        if (ev5Var != null) {
            return ev5Var;
        }
        ev5 ev5Var2 = new ev5(0, null, 0L);
        ev5Var2.a = new cv5(windowInsetsAnimation);
        hashMap.put(windowInsetsAnimation, ev5Var2);
        return ev5Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.a(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.b(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            ev5 a = a(windowInsetsAnimation);
            a.a.e(windowInsetsAnimation.getFraction());
            this.c.add(a);
        }
        return this.a.c(yv5.c(windowInsets, null), this.b).b();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        da d = this.a.d(a(windowInsetsAnimation), new da(bounds));
        d.getClass();
        r9.c();
        return r9.a(((o12) d.J).d(), ((o12) d.K).d());
    }
}
