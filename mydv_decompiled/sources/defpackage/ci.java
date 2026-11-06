package defpackage;

import android.graphics.drawable.Animatable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ci extends d4 {
    public final /* synthetic */ byte d;
    public final Animatable e;

    public /* synthetic */ ci(Animatable animatable, byte b) {
        this.d = b;
        this.e = animatable;
    }

    @Override // defpackage.d4
    public final void K() {
        switch (this.d) {
            case 0:
                this.e.start();
                break;
            default:
                ((ki) this.e).start();
                break;
        }
    }

    @Override // defpackage.d4
    public final void L() {
        switch (this.d) {
            case 0:
                this.e.stop();
                break;
            default:
                ((ki) this.e).stop();
                break;
        }
    }
}
