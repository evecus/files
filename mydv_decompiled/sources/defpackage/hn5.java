package defpackage;

import com.github.mytv.dv.model.Aweme;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hn5 implements zx0 {
    public final /* synthetic */ hk3 a;
    public final /* synthetic */ hn1 b;
    public final /* synthetic */ Aweme c;
    public final /* synthetic */ t43 d;

    public hn5(hk3 hk3Var, hn1 hn1Var, Aweme aweme, t43 t43Var) {
        this.a = hk3Var;
        this.b = hn1Var;
        this.c = aweme;
        this.d = t43Var;
    }

    @Override // defpackage.zx0
    public final void dispose() {
        long h = ((Boolean) this.d.getValue()).booleanValue() ? 0L : this.a.h();
        hn1 hn1Var = this.b;
        if (hn1Var != null) {
            hn1Var.invoke(this.c.getAwemeId(), Long.valueOf(h));
        }
    }
}
