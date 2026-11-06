package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class db2 implements vw2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ tm1 d;
    public final /* synthetic */ eb2 e;
    public final /* synthetic */ kb2 f;
    public final /* synthetic */ tm1 g;

    public db2(int i, int i2, Map map, tm1 tm1Var, eb2 eb2Var, kb2 kb2Var, tm1 tm1Var2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = tm1Var;
        this.e = eb2Var;
        this.f = kb2Var;
        this.g = tm1Var2;
    }

    @Override // defpackage.vw2
    public final Map a() {
        return this.c;
    }

    @Override // defpackage.vw2
    public final void b() {
        w02 w02Var;
        wa2 wa2Var = this.f.I;
        boolean N = this.e.N();
        tm1 tm1Var = this.g;
        if (!N || (w02Var = wa2Var.n0.c.K0) == null) {
            tm1Var.invoke(wa2Var.n0.c.X);
        } else {
            tm1Var.invoke(w02Var.X);
        }
    }

    @Override // defpackage.vw2
    public final tm1 c() {
        return null;
    }

    @Override // defpackage.vw2
    public final hn1 d() {
        return null;
    }

    @Override // defpackage.vw2
    public final tm1 e() {
        return this.d;
    }

    @Override // defpackage.vw2
    public final int getHeight() {
        return this.b;
    }

    @Override // defpackage.vw2
    public final int getWidth() {
        return this.a;
    }
}
