package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ox implements uw2 {
    public static final ox b = new ox(0);
    public static final ox c = new ox(1);
    public static final yy0 d = new yy0(10);
    public static final ox e = new ox(2);
    public static final ox f = new ox(3);
    public final /* synthetic */ byte a;

    public /* synthetic */ ox(byte b2) {
        this.a = b2;
    }

    @Override // defpackage.uw2
    public final /* synthetic */ int maxIntrinsicHeight(b42 b42Var, List list, int i) {
        byte b2 = this.a;
        return i82.j(this, b42Var, list, i);
    }

    @Override // defpackage.uw2
    public final /* synthetic */ int maxIntrinsicWidth(b42 b42Var, List list, int i) {
        byte b2 = this.a;
        return i82.m(this, b42Var, list, i);
    }

    @Override // defpackage.uw2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo35measure3p2s80s(ww2 ww2Var, List list, long j) {
        byte b2 = this.a;
        p91 p91Var = p91.I;
        switch (b2) {
            case 0:
                return ww2Var.A(dh0.j(j), dh0.i(j), p91Var, new q4((byte) 13));
            case 1:
                return ww2Var.A(dh0.h(j), dh0.g(j), p91Var, d);
            case 2:
                return ww2Var.A(dh0.j(j), dh0.i(j), p91Var, new yy0((byte) 19));
            default:
                return ww2Var.A(dh0.f(j) ? dh0.h(j) : 0, dh0.e(j) ? dh0.g(j) : 0, p91Var, new ba4((byte) 24));
        }
    }

    @Override // defpackage.uw2
    public final /* synthetic */ int minIntrinsicHeight(b42 b42Var, List list, int i) {
        byte b2 = this.a;
        return i82.p(this, b42Var, list, i);
    }

    @Override // defpackage.uw2
    public final /* synthetic */ int minIntrinsicWidth(b42 b42Var, List list, int i) {
        byte b2 = this.a;
        return i82.s(this, b42Var, list, i);
    }
}
