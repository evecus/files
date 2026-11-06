package defpackage;

import android.view.ViewParent;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lr5 extends tn1 implements tm1 {
    public static final lr5 I = new lr5(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        ViewParent viewParent = (ViewParent) obj;
        viewParent.getClass();
        return viewParent.getParent();
    }
}
