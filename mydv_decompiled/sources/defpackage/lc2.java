package defpackage;

import java.io.FileInputStream;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lc2 implements ak4 {
    public static final lc2 I = new lc2();
    public static final ec2 J;

    static {
        ec2 o = ec2.o();
        o.getClass();
        J = o;
    }

    @Override // defpackage.ak4
    public final void a(Object obj, mp4 mp4Var) {
        ec2 ec2Var = (ec2) obj;
        ec2Var.getClass();
        int a = ec2Var.a(null);
        Logger logger = j70.b;
        if (a > 4096) {
            a = 4096;
        }
        h70 h70Var = new h70(mp4Var, a);
        ec2Var.l(h70Var);
        if (h70Var.f > 0) {
            h70Var.E();
        }
    }

    @Override // defpackage.ak4
    public final Object b() {
        return J;
    }

    @Override // defpackage.ak4
    public final Object f(FileInputStream fileInputStream) {
        try {
            return ec2.r(fileInputStream);
        } catch (x42 e) {
            throw new kl0("Cannot read proto.", e);
        }
    }
}
