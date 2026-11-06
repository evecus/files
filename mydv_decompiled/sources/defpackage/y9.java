package defpackage;

import android.view.autofill.AutofillId;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.audio.AudioOutput;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class y9 implements lp, ListenerSet.Event {
    public static /* bridge */ /* synthetic */ AutofillId d(Object obj) {
        return (AutofillId) obj;
    }

    public static /* synthetic */ void e() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void f(int i) {
        throw new yd5(i);
    }

    @Override // defpackage.lp
    public int b(int i, da2 da2Var) {
        return Math.round((1.0f + (da2Var == da2.I ? -1.0f : 1.0f)) * (i / 2.0f));
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AudioOutput.Listener) obj).onUnderrun();
    }
}
