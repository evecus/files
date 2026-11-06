package defpackage;

import java.util.List;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.connection.ConnectPlan;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class ls implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ ls(Object obj, Object obj2, Object obj3, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
        this.L = obj3;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        int i;
        List connectTls$lambda$0;
        m14 m14Var;
        m14 a;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj = this.L;
        Object obj2 = this.K;
        Object obj3 = this.J;
        switch (b) {
            case 0:
                ((ms) obj3).a();
                xq xqVar = (xq) ((ns) obj2).c;
                int i2 = ((p24) obj).I;
                do {
                    i = xqVar.get();
                } while (!xqVar.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
            case 1:
                ly lyVar = (ly) obj3;
                m14 j0 = ly.j0(lyVar, (na3) obj2, (k9) obj);
                if (j0 != null) {
                    break;
                }
                break;
            case 2:
                connectTls$lambda$0 = ConnectPlan.connectTls$lambda$0((CertificatePinner) obj3, (Handshake) obj2, (Address) obj);
                break;
            case 3:
                break;
            case 4:
                na3 na3Var = (na3) obj2;
                n24 n24Var = (n24) obj;
                n54 n54Var = na3.E0;
                ((tm1) obj3).invoke(n54Var);
                boolean c = j42.c(na3Var.r0, n54Var.W);
                boolean z = na3Var.u0 != n54Var.X;
                yg3 a2 = n54Var.W.a(n54Var.Y, n54Var.b0, n54Var.a0);
                n54Var.e0 = a2;
                boolean c2 = j42.c(na3Var.t0, a2.a());
                n24Var.I = !c2;
                if (!c || z || !c2) {
                    na3Var.r0 = n54Var.W;
                    na3Var.u0 = n54Var.X;
                    yg3 yg3Var = n54Var.e0;
                    m14 m14Var2 = m14.e;
                    if (yg3Var == null || (m14Var = yg3Var.a()) == null) {
                        m14Var = m14Var2;
                    }
                    na3Var.t0 = m14Var;
                    yg3 yg3Var2 = n54Var.e0;
                    if (yg3Var2 != null && (a = yg3Var2.a()) != null) {
                        v22 F = rt0.F(a);
                        m14Var2 = new m14(F.a, F.b, F.c, F.d);
                    }
                    na3Var.s0 = m14Var2;
                    if (na3Var.v0 && (z || (na3Var.u0 && !c))) {
                        na3Var.c0.I();
                    }
                }
                na3Var.v0 = true;
                break;
            default:
                a2 a2Var = (a2) obj3;
                a2Var.removeOnAttachStateChangeListener((bd) obj2);
                mu0.C(a2Var).a.remove((er5) obj);
                break;
        }
        return wd5Var;
    }
}
