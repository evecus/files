package defpackage;

import android.os.Bundle;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class eb extends s5 {
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat b;

    public eb(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        this.b = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // defpackage.s5
    public final void a(int i, p5 p5Var, String str, Bundle bundle) {
        this.b.addExtraDataToAccessibilityNodeInfoHelper(i, p5Var, str, bundle);
    }

    @Override // defpackage.s5
    public final p5 b(int i) {
        p5 createNodeInfo;
        boolean z;
        int i2;
        int i3;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.b;
        createNodeInfo = androidComposeViewAccessibilityDelegateCompat.createNodeInfo(i);
        z = androidComposeViewAccessibilityDelegateCompat.sendingFocusAffectingEvent;
        if (z) {
            i2 = androidComposeViewAccessibilityDelegateCompat.accessibilityFocusedVirtualViewId;
            if (i == i2) {
                androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI = createNodeInfo;
            }
            i3 = androidComposeViewAccessibilityDelegateCompat.focusedVirtualViewId;
            if (i == i3) {
                androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI = createNodeInfo;
            }
        }
        return createNodeInfo;
    }

    @Override // defpackage.s5
    public final p5 c(int i) {
        int i2;
        int i3;
        int i4;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.b;
        if (i != 1) {
            if (i == 2) {
                i4 = androidComposeViewAccessibilityDelegateCompat.accessibilityFocusedVirtualViewId;
                return b(i4);
            }
            s83.t(hf1.u(i, "Unknown focus type: "));
            return null;
        }
        i2 = androidComposeViewAccessibilityDelegateCompat.focusedVirtualViewId;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        i3 = androidComposeViewAccessibilityDelegateCompat.focusedVirtualViewId;
        return b(i3);
    }

    @Override // defpackage.s5
    public final boolean d(int i, int i2, Bundle bundle) {
        boolean performActionHelper;
        performActionHelper = this.b.performActionHelper(i, i2, bundle);
        return performActionHelper;
    }
}
