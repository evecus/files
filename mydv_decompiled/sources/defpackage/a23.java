package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class a23 implements z13 {
    public final Context I;
    public dj0 J;
    public final fk3 K = new fk3(1.0f);
    public rv4 L;

    public a23(Context context) {
        this.I = context;
    }

    @Override // defpackage.z13
    public final float A() {
        byte b;
        fj0 fj0Var;
        dw4 dw4Var;
        if (this.L == null) {
            Context context = this.I;
            n43 n43Var = uw5.a;
            synchronized (n43Var) {
                try {
                    Object g = n43Var.g(context);
                    b = 6;
                    fj0Var = null;
                    if (g == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        iz g2 = qb.g(-1, 6, null);
                        w84 w84Var = new w84(new iq2(contentResolver, uriFor, new tw5(g2, rt0.j(Looper.getMainLooper())), g2, context, null), (byte) 0);
                        fz4 b2 = ui4.b();
                        os0 os0Var = sx0.a;
                        g = sv2.V(w84Var, new dj0(p70.p0(b2, ju2.a)), new aw4(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        n43Var.m(context, g);
                    }
                    dw4Var = (dw4) g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.K.i(((Number) dw4Var.getValue()).floatValue());
            dj0 dj0Var = this.J;
            if (dj0Var == null) {
                zy.i("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.L = p70.g0(dj0Var, null, null, new ky(dw4Var, this, fj0Var, b), 3);
        }
        return this.K.h();
    }

    @Override // defpackage.tk0
    public final Object fold(Object obj, hn1 hn1Var) {
        return p70.Q(this, obj, hn1Var);
    }

    @Override // defpackage.tk0
    public final rk0 get(sk0 sk0Var) {
        return p70.R(this, sk0Var);
    }

    @Override // defpackage.rk0
    public final sk0 getKey() {
        return q8.t0;
    }

    @Override // defpackage.tk0
    public final tk0 minusKey(sk0 sk0Var) {
        return p70.m0(this, sk0Var);
    }

    @Override // defpackage.tk0
    public final tk0 plus(tk0 tk0Var) {
        return p70.p0(this, tk0Var);
    }
}
