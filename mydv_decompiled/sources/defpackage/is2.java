package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class is2 extends an3 {
    public final /* synthetic */ byte J;
    public final Object K;

    public /* synthetic */ is2(Object obj, byte b) {
        this.J = b;
        this.K = obj;
    }

    @Override // defpackage.iu0
    public final float L() {
        byte b = this.J;
        Object obj = this.K;
        switch (b) {
            case 0:
                return ((hs2) obj).L();
            default:
                return ((AndroidComposeView) obj).getDensity().L();
        }
    }

    @Override // defpackage.an3
    public float a(gv1 gv1Var) {
        tm1 tm1Var;
        int f1;
        sh3 snapshotObserver;
        int f12;
        switch (this.J) {
            case 0:
                hn1 hn1Var = gv1Var.a;
                if (hn1Var != null) {
                    return ((Number) hn1Var.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                hs2 hs2Var = (hs2) this.K;
                if (hs2Var.W) {
                    return Float.NaN;
                }
                r24 r24Var = new r24();
                r24Var.I = hs2Var;
                while (true) {
                    c8 c8Var = ((hs2) r24Var.I).Y;
                    float f = (c8Var == null || (f12 = dq.f1((gv1[]) c8Var.c, gv1Var)) < 0) ? Float.NaN : ((float[]) c8Var.d)[f12];
                    boolean isNaN = Float.isNaN(f);
                    Object obj = r24Var.I;
                    if (!isNaN) {
                        ((hs2) obj).j0(hs2Var.q0(), gv1Var);
                        return gv1Var.a(f, ((hs2) r24Var.I).o0(), hs2Var.o0());
                    }
                    hs2 hs2Var2 = (hs2) obj;
                    hn1 hn1Var2 = hs2Var2.P;
                    if (hn1Var2 != null && (tm1Var = hs2Var2.Q) != null && ((Boolean) tm1Var.invoke(gv1Var)).booleanValue()) {
                        hs2 hs2Var3 = (hs2) r24Var.I;
                        n43 n43Var = hs2Var3.S;
                        if (n43Var == null) {
                            long[] jArr = ia4.a;
                            n43Var = new n43();
                            hs2Var3.S = n43Var;
                        }
                        Object g = n43Var.g(gv1Var);
                        if (g == null) {
                            g = new dn3(hs2Var3.r0(), hs2Var3, gv1Var);
                            n43Var.m(gv1Var, g);
                        }
                        dn3 dn3Var = (dn3) g;
                        dn3Var.I = hs2Var3.r0();
                        qh3 qh3Var = hs2Var.q0().V;
                        if (qh3Var != null && (snapshotObserver = qh3Var.getSnapshotObserver()) != null) {
                            snapshotObserver.a.d(dn3Var, hs2.b0, new yj((Object) hn1Var2, (Object) r24Var, (Object) gv1Var, (byte) 10));
                        }
                        ((hs2) r24Var.I).j0(hs2Var.q0(), gv1Var);
                        c8 c8Var2 = ((hs2) r24Var.I).Y;
                        float f2 = (c8Var2 == null || (f1 = dq.f1((gv1[]) c8Var2.c, gv1Var)) < 0) ? Float.NaN : ((float[]) c8Var2.d)[f1];
                        if (!Float.isNaN(f2)) {
                            return gv1Var.a(f2, ((hs2) r24Var.I).o0(), hs2Var.o0());
                        }
                    }
                    hs2 s0 = ((hs2) r24Var.I).s0();
                    if (s0 == null) {
                        ((hs2) r24Var.I).j0(hs2Var.q0(), gv1Var);
                        return Float.NaN;
                    }
                    r24Var.I = s0;
                }
                break;
            default:
                return super.a(gv1Var);
        }
    }

    @Override // defpackage.an3
    public final da2 b() {
        byte b = this.J;
        Object obj = this.K;
        switch (b) {
            case 0:
                return ((hs2) obj).getLayoutDirection();
            default:
                return ((AndroidComposeView) obj).getLayoutDirection();
        }
    }

    @Override // defpackage.an3
    public final int d() {
        byte b = this.J;
        Object obj = this.K;
        switch (b) {
            case 0:
                return ((hs2) obj).V();
            default:
                return ((AndroidComposeView) obj).getRoot().o0.p.I;
        }
    }

    @Override // defpackage.iu0
    public final float getDensity() {
        byte b = this.J;
        Object obj = this.K;
        switch (b) {
            case 0:
                return ((hs2) obj).getDensity();
            default:
                return ((AndroidComposeView) obj).getDensity().getDensity();
        }
    }
}
