package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class m05 {
    public static final kp3 a = new kp3(o91.I, null);

    public static final r05 a(PointerInputEventHandler pointerInputEventHandler) {
        return new r05(null, null, null, pointerInputEventHandler);
    }

    public static final l13 b(l13 l13Var, Object obj, PointerInputEventHandler pointerInputEventHandler) {
        return l13Var.then(new l05(obj, null, null, pointerInputEventHandler, 6));
    }

    public static final l13 c(l13 l13Var, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        return l13Var.then(new l05(null, null, objArr, pointerInputEventHandler, 3));
    }
}
