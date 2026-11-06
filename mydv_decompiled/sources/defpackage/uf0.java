package defpackage;

import android.os.Build;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class uf0 {
    public final ExecutorService a = d4.p(false);
    public final os0 b = sx0.a;
    public final ExecutorService c = d4.p(true);
    public final j81 d = new j81((byte) 27);
    public final uu2 e = new uu2((byte) 15);
    public final int f;
    public final n84 g;

    public uf0(n84 n84Var) {
        this.f = Build.VERSION.SDK_INT == 23 ? 10 : 20;
        this.g = new n84((byte) 25);
    }
}
