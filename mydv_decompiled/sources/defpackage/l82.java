package defpackage;

import android.view.KeyEvent;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class l82 {
    public final KeyEvent a;

    public /* synthetic */ l82(KeyEvent keyEvent) {
        this.a = keyEvent;
    }

    public static final /* synthetic */ l82 a(KeyEvent keyEvent) {
        return new l82(keyEvent);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l82) {
            return j42.c(this.a, ((l82) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ")";
    }
}
