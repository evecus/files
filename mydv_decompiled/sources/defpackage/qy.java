package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class qy implements tm1 {
    public final /* synthetic */ long I;

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        k10 k10Var;
        Object g54Var;
        long j = this.I;
        ry ryVar = (ry) obj;
        tm1 tm1Var = ryVar.b;
        if (tm1Var != null && (k10Var = ryVar.a) != null) {
            try {
                g54Var = tm1Var.invoke(Long.valueOf(j));
            } catch (Throwable th) {
                g54Var = new g54(th);
            }
            k10Var.resumeWith(g54Var);
        }
        return wd5.a;
    }
}
