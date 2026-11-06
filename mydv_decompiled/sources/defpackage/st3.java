package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class st3 implements vi2 {
    public static final st3 Q = new st3();
    public int I;
    public int J;
    public Handler M;
    public boolean K = true;
    public boolean L = true;
    public final xi2 N = new xi2(this, true);
    public final z1 O = new z1(this, 8);
    public final ep P = new ep((Object) this, (byte) 16);

    public final void a() {
        int i = this.J + 1;
        this.J = i;
        if (i == 1) {
            if (this.K) {
                this.N.e(ji2.ON_RESUME);
                this.K = false;
            } else {
                Handler handler = this.M;
                handler.getClass();
                handler.removeCallbacks(this.O);
            }
        }
    }

    @Override // defpackage.vi2
    public final li2 k() {
        return this.N;
    }
}
