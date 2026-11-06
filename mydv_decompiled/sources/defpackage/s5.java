package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeProvider;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class s5 {
    public final AccessibilityNodeProvider a;

    public s5() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new r5(this);
        } else {
            this.a = new q5(this);
        }
    }

    public p5 b(int i) {
        return null;
    }

    public p5 c(int i) {
        return null;
    }

    public boolean d(int i, int i2, Bundle bundle) {
        return false;
    }

    public s5(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.a = accessibilityNodeProvider;
    }

    public void a(int i, p5 p5Var, String str, Bundle bundle) {
    }
}
