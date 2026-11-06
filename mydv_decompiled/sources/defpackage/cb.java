package defpackage;

import android.app.Notification;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class cb {
    public static void a(Notification.Action.Builder builder) {
        builder.setEmphasisHint(0);
    }

    public static final void b(si4 si4Var, AccessibilityEvent accessibilityEvent) {
        ki4 ki4Var = si4Var.d;
        Object g = ki4Var.I.g(zi4.M);
        if (g == null) {
            g = null;
        }
        if (g != null) {
            zl1.c();
        } else {
            Object g2 = ki4Var.I.g(zi4.I);
            accessibilityEvent.setTextChangeTypes((((d65) (g2 != null ? g2 : null)) != null ? 1 : 0) | accessibilityEvent.getTextChangeTypes());
        }
    }

    public static void c(Notification.Action.Builder builder) {
        builder.setStyleHint(0);
    }
}
