package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wl3 extends fy5 {
    @Override // defpackage.fy5
    public final gy5 b() {
        if (this.a && this.c.j.d) {
            s83.t("Cannot set backoff criteria on an idle mode job");
            return null;
        }
        ky5 ky5Var = this.c;
        if (!ky5Var.q) {
            return new xl3(this.b, ky5Var, this.d);
        }
        s83.t("PeriodicWorkRequests cannot be expedited");
        return null;
    }

    @Override // defpackage.fy5
    public final fy5 c() {
        return this;
    }
}
