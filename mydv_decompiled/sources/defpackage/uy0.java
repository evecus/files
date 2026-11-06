package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class uy0 {
    public final n33 a;
    public final n33 b;

    static {
        Float valueOf = Float.valueOf(0.0f);
        uj3 uj3Var = new uj3(valueOf, valueOf);
        Float valueOf2 = Float.valueOf(0.5f);
        new uy0(uj3Var, new uj3(valueOf2, valueOf2));
    }

    public uy0(uj3... uj3VarArr) {
        this.a = new n33(uj3VarArr.length);
        this.b = new n33(uj3VarArr.length);
        int length = uj3VarArr.length;
        int i = 0;
        while (true) {
            n33 n33Var = this.a;
            if (i >= length) {
                sv2.b0(n33Var);
                sv2.b0(this.b);
                return;
            } else {
                n33Var.a(((Number) uj3VarArr[i].I).floatValue());
                this.b.a(((Number) uj3VarArr[i].J).floatValue());
                i++;
            }
        }
    }
}
