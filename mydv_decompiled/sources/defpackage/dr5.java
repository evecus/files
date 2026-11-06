package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.github.mytv.dv.R;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class dr5 {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final sq5 d = new sq5();

    public static zr5 a(View view) {
        WeakHashMap weakHashMap = a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            a = weakHashMap;
        }
        zr5 zr5Var = (zr5) weakHashMap.get(view);
        if (zr5Var != null) {
            return zr5Var;
        }
        zr5 zr5Var2 = new zr5(view);
        a.put(view, zr5Var2);
        return zr5Var2;
    }

    public static void b(View view, yv5 yv5Var) {
        WindowInsets b2 = yv5Var.b();
        if (b2 != null) {
            WindowInsets a2 = Build.VERSION.SDK_INT >= 30 ? ar5.a(view, b2) : tq5.a(view, b2);
            if (a2.equals(b2)) {
                return;
            }
            yv5.c(a2, view);
        }
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return zq5.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static String[] d(ql qlVar) {
        return Build.VERSION.SDK_INT >= 31 ? br5.a(qlVar) : (String[]) qlVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void e(int i, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = ((CharSequence) new rq5((byte) 1).a(view)) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add((CharSequence) new rq5((byte) 1).a(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add((CharSequence) new rq5((byte) 1).a(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static ki0 f(ql qlVar, ki0 ki0Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + ki0Var + ", view=" + ql.class.getSimpleName() + "[" + qlVar.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return br5.b(qlVar, ki0Var);
        }
        if (((s65) qlVar.getTag(R.id.tag_on_receive_content_listener)) == null) {
            return qlVar.d(ki0Var);
        }
        ki0 a2 = s65.a(qlVar, ki0Var);
        if (a2 == null) {
            return null;
        }
        return qlVar.d(a2);
    }

    public static void g(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            zq5.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void h(View view, y4 y4Var) {
        if (y4Var == null && (c(view) instanceof x4)) {
            y4Var = new y4();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(y4Var == null ? null : y4Var.getBridge());
    }

    public static void i(View view, CharSequence charSequence) {
        new rq5((byte) 1).b(view, charSequence);
        sq5 sq5Var = d;
        if (charSequence == null) {
            sq5Var.I.remove(view);
            view.removeOnAttachStateChangeListener(sq5Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(sq5Var);
        } else {
            sq5Var.I.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(sq5Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(sq5Var);
            }
        }
    }
}
