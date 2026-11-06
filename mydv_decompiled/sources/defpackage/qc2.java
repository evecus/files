package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qc2 implements uq1 {
    public static final qc2 b = new qc2(0);
    public static final qc2 c = new qc2(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ qc2(byte b2) {
        this.a = b2;
    }

    @Override // defpackage.uq1
    public final File a(Context context, String str) {
        switch (this.a) {
            case 0:
                return d4.t(context, str);
            default:
                return dq2.v0(context, str);
        }
    }

    @Override // defpackage.uq1
    public final Object b(Context context, String str) {
        byte b2 = this.a;
        byte b3 = 15;
        byte b4 = 12;
        o91 o91Var = o91.I;
        fj0 fj0Var = null;
        switch (b2) {
            case 0:
                lc2 lc2Var = lc2.I;
                pc2 pc2Var = new pc2(context, str, (byte) 0);
                os0 os0Var = sx0.a;
                dj0 H = i42.H(ur0.I.plus(ui4.b()));
                return new yp4(pc2Var, lc2Var, p70.j0(new r(o91Var, fj0Var, b3)), new j81(b4), H);
            default:
                pc2 pc2Var2 = new pc2(context, str, (byte) 2);
                os0 os0Var2 = sx0.a;
                dj0 H2 = i42.H(ur0.I.plus(ui4.b()));
                k04 k04Var = k04.s0;
                return new yr3(new yp4(new mq1(pc2Var2, (byte) 3), k04Var, p70.j0(new r(o91Var, fj0Var, b3)), new j81(b4), H2));
        }
    }
}
