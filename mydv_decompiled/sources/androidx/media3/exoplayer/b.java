package androidx.media3.exoplayer;

import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.exoplayer.DefaultSuitableOutputChecker;
import androidx.media3.exoplayer.SuitableOutputChecker;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements BackgroundThreadStateHandler.StateChangeListener {
    public final /* synthetic */ byte I;
    public final /* synthetic */ SuitableOutputChecker.Callback J;

    public /* synthetic */ b(SuitableOutputChecker.Callback callback, byte b) {
        this.I = b;
        this.J = callback;
    }

    @Override // androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
    public final void onStateChanged(Object obj, Object obj2) {
        byte b = this.I;
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        SuitableOutputChecker.Callback callback = this.J;
        switch (b) {
            case 0:
                DefaultSuitableOutputChecker.ImplApi23.lambda$enable$0(callback, bool, bool2);
                break;
            default:
                DefaultSuitableOutputChecker.ImplApi35.lambda$enable$0(callback, bool, bool2);
                break;
        }
    }
}
