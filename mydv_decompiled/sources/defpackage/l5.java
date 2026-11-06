package defpackage;

import android.app.LocaleManager;
import android.content.Intent;
import android.os.Build;
import android.os.LocaleList;
import android.os.PowerManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.common.PlaybackException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class l5 {
    public static OnBackInvokedDispatcher a(Toolbar toolbar) {
        return toolbar.findOnBackInvokedDispatcher();
    }

    public static final KeyEvent b(Intent intent) {
        return Build.VERSION.SDK_INT >= 33 ? (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT", KeyEvent.class) : (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
    }

    public static String c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean d(PowerManager powerManager) {
        return powerManager.isLowPowerStandbyEnabled() || powerManager.isDeviceLightIdleMode();
    }

    public static boolean e(m41 m41Var) {
        return m41Var.isSelectedChildViewEnabled();
    }

    public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static LocaleList g(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void h(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }

    public static final void i(vq3 vq3Var, Object obj) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (findOnBackInvokedDispatcher = vq3Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(PlaybackException.CUSTOM_ERROR_CODE_BASE, (OnBackInvokedCallback) obj);
    }

    public static final void j(vq3 vq3Var, hk hkVar) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (!r7.O(hkVar) || (findOnBackInvokedDispatcher = vq3Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(hkVar);
    }

    public static final void k(CursorAnchorInfo.Builder builder, m14 m14Var) {
        builder.setEditorBoundsInfo(ex.b().setEditorBounds(sp0.i0(m14Var)).setHandwritingBounds(sp0.i0(m14Var)).build());
    }

    public static final void l(CursorAnchorInfo.Builder builder, m14 m14Var) {
        builder.setEditorBoundsInfo(ex.b().setEditorBounds(sp0.i0(m14Var)).setHandwritingBounds(sp0.i0(m14Var)).build());
    }

    public static void m(m41 m41Var, boolean z) {
        m41Var.setSelectedChildViewEnabled(z);
    }

    public static void n(InputMethodManager inputMethodManager, View view) {
        inputMethodManager.startStylusHandwriting(view);
    }

    public static void o(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(PlaybackException.CUSTOM_ERROR_CODE_BASE, (OnBackInvokedCallback) obj2);
    }

    public static void p(Object obj, hk hkVar) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback(hkVar);
    }
}
