package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lq3 implements h04, jq3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lq3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.jq3
    public final Object b(String str, tm1 tm1Var, gj0 gj0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((rq3) obj).b(str, tm1Var, gj0Var);
            default:
                return ((uz4) obj).b(str, tm1Var, gj0Var);
        }
    }

    @Override // defpackage.h04
    public final o84 c() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((rq3) obj).a;
            default:
                return ((uz4) obj).a;
        }
    }
}
