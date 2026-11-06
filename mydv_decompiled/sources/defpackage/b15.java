package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b15 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ String J;
    public final /* synthetic */ int K;

    public /* synthetic */ b15(int i, String str) {
        this.I = (byte) 2;
        this.K = i;
        this.J = str;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        q84 Y;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        String str = this.J;
        int i = this.K;
        o84 o84Var = (o84) obj;
        switch (b) {
            case 0:
                o84Var.getClass();
                Y = o84Var.Y("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    Y.v(1, str);
                    Y.b(2, i);
                    return Y.T() ? new a15(Y.H(jl2.F(Y, "work_spec_id")), (int) Y.getLong(jl2.F(Y, "generation")), (int) Y.getLong(jl2.F(Y, "system_id"))) : null;
                } finally {
                }
            case 1:
                o84Var.getClass();
                Y = o84Var.Y("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    Y.v(1, str);
                    Y.b(2, i);
                    Y.T();
                    return wd5Var;
                } finally {
                }
            default:
                o84Var.getClass();
                Y = o84Var.Y("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    Y.b(1, i);
                    Y.v(2, str);
                    Y.T();
                    return wd5Var;
                } finally {
                }
        }
    }

    public /* synthetic */ b15(String str, int i, byte b) {
        this.I = b;
        this.J = str;
        this.K = i;
    }
}
