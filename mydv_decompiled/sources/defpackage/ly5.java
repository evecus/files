package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ly5 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ long J;
    public final /* synthetic */ String K;

    public /* synthetic */ ly5(long j, String str, byte b) {
        this.I = b;
        this.J = j;
        this.K = str;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        q84 Y;
        byte b = this.I;
        String str = this.K;
        long j = this.J;
        o84 o84Var = (o84) obj;
        switch (b) {
            case 0:
                o84Var.getClass();
                Y = o84Var.Y("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    Y.b(1, j);
                    Y.v(2, str);
                    Y.T();
                    int I = il2.I(o84Var);
                    Y.close();
                    return Integer.valueOf(I);
                } finally {
                }
            default:
                o84Var.getClass();
                Y = o84Var.Y("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    Y.b(1, j);
                    Y.v(2, str);
                    Y.T();
                    Y.close();
                    return wd5.a;
                } finally {
                }
        }
    }
}
