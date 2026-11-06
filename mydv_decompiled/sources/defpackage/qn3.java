package defpackage;

import android.widget.Magnifier;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class qn3 implements on3 {
    public final Magnifier a;

    public qn3(Magnifier magnifier) {
        this.a = magnifier;
    }

    @Override // defpackage.on3
    public void a(long j, long j2, float f) {
        this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final void b() {
        this.a.dismiss();
    }

    public final long c() {
        return (this.a.getWidth() << 32) | (this.a.getHeight() & 4294967295L);
    }

    public final void d() {
        this.a.update();
    }
}
