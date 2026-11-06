package defpackage;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gb extends gj0 {
    public r33 I;
    public fz J;
    public /* synthetic */ Object K;
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, fj0 fj0Var) {
        super(fj0Var);
        this.L = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return this.L.boundsUpdatesEventLoop$ui(this);
    }
}
