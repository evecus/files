package defpackage;

import android.content.Intent;
import android.media.session.MediaSession;
import android.view.KeyEvent;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jx2 extends MediaSession.Callback {
    public final /* synthetic */ kx2 a;

    public jx2(kx2 kx2Var) {
        this.a = kx2Var;
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        intent.getClass();
        KeyEvent b = l5.b(intent);
        if (b == null) {
            return super.onMediaButtonEvent(intent);
        }
        if (!r13.e.containsKey(Integer.valueOf(b.getKeyCode()))) {
            return super.onMediaButtonEvent(intent);
        }
        kx2 kx2Var = this.a;
        kx2Var.a.getWindow().getDecorView().post(new h8(kx2Var, b, (byte) 19));
        return true;
    }
}
