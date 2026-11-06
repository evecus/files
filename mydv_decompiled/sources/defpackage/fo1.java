package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class fo1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fo1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                go1 go1Var = (go1) obj;
                go1Var.A--;
                break;
            default:
                jt4 jt4Var = (jt4) obj;
                jt4Var.k--;
                break;
        }
    }

    public final void b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((go1) obj).A++;
                break;
            default:
                ((jt4) obj).k++;
                break;
        }
    }
}
