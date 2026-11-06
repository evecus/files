package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gs2 implements vw2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ tm1 d;
    public final /* synthetic */ tm1 e;
    public final /* synthetic */ hs2 f;

    public gs2(int i, int i2, Map map, tm1 tm1Var, tm1 tm1Var2, hs2 hs2Var) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = tm1Var;
        this.e = tm1Var2;
        this.f = hs2Var;
    }

    @Override // defpackage.vw2
    public final Map a() {
        return this.c;
    }

    @Override // defpackage.vw2
    public final void b() {
        this.e.invoke(this.f.X);
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
