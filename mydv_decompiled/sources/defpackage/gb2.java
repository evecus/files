package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gb2 implements vw2 {
    public final /* synthetic */ vw2 a;
    public final /* synthetic */ kb2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ vw2 d;

    public gb2(vw2 vw2Var, kb2 kb2Var, int i, vw2 vw2Var2) {
        this.b = kb2Var;
        this.c = i;
        this.d = vw2Var2;
        this.a = vw2Var;
    }

    @Override // defpackage.vw2
    public final Map a() {
        return this.a.a();
    }

    @Override // defpackage.vw2
    public final void b() {
        int i = this.c;
        kb2 kb2Var = this.b;
        kb2Var.L = i;
        this.d.b();
        if (kb2Var.I.P == null) {
            kb2Var.f(kb2Var.L);
        }
    }

    @Override // defpackage.vw2
    public final tm1 c() {
        return this.a.c();
    }

    @Override // defpackage.vw2
    public final hn1 d() {
        return this.a.d();
    }

    @Override // defpackage.vw2
    public final tm1 e() {
        return this.a.e();
    }

    @Override // defpackage.vw2
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override // defpackage.vw2
    public final int getWidth() {
        return this.a.getWidth();
    }
}
