package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class zh1 {
    public final di1 a;
    public final AndroidComposeView b;
    public final o43 c;
    public final o43 d;
    public boolean e;

    public zh1(di1 di1Var, AndroidComposeView androidComposeView) {
        this.a = di1Var;
        this.b = androidComposeView;
        o43 o43Var = ka4.a;
        this.c = new o43();
        this.d = new o43();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        this.b.registerOnEndApplyChangesListener(new va(0, this, zh1.class, "invalidateNodes", "invalidateNodes()V", 0, (byte) 1));
        this.e = true;
    }
}
