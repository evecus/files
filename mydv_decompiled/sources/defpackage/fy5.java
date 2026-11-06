package defpackage;

import android.os.Build;
import androidx.media3.exoplayer.Renderer;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class fy5 {
    public boolean a;
    public UUID b;
    public ky5 c;
    public final LinkedHashSet d;

    public fy5(Class cls) {
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.b = randomUUID;
        String uuid = this.b.toString();
        uuid.getClass();
        this.c = new ky5(uuid, (sx5) null, cls.getName(), (String) null, (dp0) null, (dp0) null, 0L, 0L, 0L, (ch0) null, 0, (ut) null, 0L, 0L, 0L, 0L, false, (ug3) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(sv2.J(1));
        linkedHashSet.add(strArr[0]);
        this.d = linkedHashSet;
    }

    public final gy5 a() {
        gy5 b = b();
        ch0 ch0Var = this.c.j;
        boolean z = (Build.VERSION.SDK_INT >= 24 && ch0Var.b()) || ch0Var.e || ch0Var.c || ch0Var.d;
        ky5 ky5Var = this.c;
        if (ky5Var.q) {
            if (z) {
                s83.t("Expedited jobs only support network and storage constraints");
                return null;
            }
            if (ky5Var.g > 0) {
                s83.t("Expedited jobs cannot be delayed");
                return null;
            }
        }
        String str = ky5Var.x;
        if (str == null) {
            List X = jx4.X(ky5Var.c, new String[]{"."}, 6);
            String str2 = X.size() == 1 ? (String) X.get(0) : (String) o70.a1(X);
            if (str2.length() > 127) {
                str2 = jx4.f0(127, str2);
            }
            ky5Var.x = str2;
        } else if (str.length() > 127) {
            this.c.x = jx4.f0(127, str);
        }
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.b = randomUUID;
        String uuid = randomUUID.toString();
        uuid.getClass();
        ky5 ky5Var2 = this.c;
        this.c = new ky5(uuid, ky5Var2.b, ky5Var2.c, ky5Var2.d, new dp0(ky5Var2.e), new dp0(ky5Var2.f), ky5Var2.g, ky5Var2.h, ky5Var2.i, new ch0(ky5Var2.j), ky5Var2.k, ky5Var2.l, ky5Var2.m, ky5Var2.n, ky5Var2.o, ky5Var2.p, ky5Var2.q, ky5Var2.r, ky5Var2.s, ky5Var2.u, ky5Var2.v, ky5Var2.w, ky5Var2.x, ky5Var2.y, 524288);
        return b;
    }

    public gy5 b() {
        if (!this.a || !this.c.j.d) {
            return new ye3(this.b, this.c, this.d);
        }
        s83.t("Cannot set backoff criteria on an idle mode job");
        return null;
    }

    public final fy5 d() {
        TimeUnit.MINUTES.getClass();
        this.a = true;
        ky5 ky5Var = this.c;
        ky5Var.l = ut.I;
        String str = ky5.z;
        ky5Var.m = ut0.s(600000L, Renderer.DEFAULT_DURATION_TO_PROGRESS_US, 18000000L);
        return c();
    }

    public final fy5 e(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.c.g = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() > this.c.g) {
            return c();
        }
        s83.t("The given initial delay is too large and will cause an overflow!");
        return null;
    }

    public fy5 c() {
        return this;
    }
}
