package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class bf2 {
    public final tm1 a;
    public u92 c;
    public int f;
    public final pn b = new pn((byte) 10);
    public int d = -1;
    public int e = -1;

    public bf2(tm1 tm1Var) {
        this.a = tm1Var;
    }

    public final af2 a(int i, long j, boolean z, tm1 tm1Var) {
        u92 u92Var = this.c;
        if (u92Var == null) {
            return s41.a;
        }
        ns3 ns3Var = (ns3) u92Var.d;
        boolean z2 = ns3Var instanceof se;
        ms3 ms3Var = new ms3(u92Var, i, this.b, tm1Var);
        ms3Var.d = new dh0(j);
        if (!z2) {
            ns3Var.a(ms3Var);
        } else if (z) {
            se seVar = (se) ns3Var;
            seVar.J.add(new pt3(1, ms3Var));
            if (!seVar.K) {
                seVar.K = true;
                seVar.I.post(seVar);
            }
        } else {
            se seVar2 = (se) ns3Var;
            seVar2.J.add(new pt3(0, ms3Var));
            if (!seVar2.K) {
                seVar2.K = true;
                seVar2.I.post(seVar2);
            }
        }
        z9.k("compose:lazy:schedule_prefetch:index", i);
        return ms3Var;
    }
}
