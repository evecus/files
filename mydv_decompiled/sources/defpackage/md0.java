package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class md0 extends f54 implements hn1 {
    public int J;
    public int K;
    public int L;
    public boolean M;
    public /* synthetic */ Object N;
    public final /* synthetic */ nd0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md0(nd0 nd0Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.O = nd0Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        md0 md0Var = new md0(this.O, fj0Var);
        md0Var.N = obj;
        return md0Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((md0) create((pj4) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        pj4 pj4Var;
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        String str2;
        nd0 nd0Var = this.O;
        e43 e43Var = nd0Var.I;
        m22 m22Var = nd0Var.K;
        boolean z = this.M;
        if (!z) {
            mu0.V(obj);
            pj4Var = (pj4) this.N;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (!z) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.L;
            i2 = this.K;
            i3 = this.J;
            pj4Var = (pj4) this.N;
            mu0.V(obj);
        }
        if (i3 >= Math.min(nd0Var.L + 10, m22Var.b)) {
            return wd5.a;
        }
        int i6 = i3 + 1;
        int a = m22Var.a(i3);
        switch (a) {
            case 0:
                str = "up";
                break;
            case 1:
                Object g = e43Var.g(i2);
                i2++;
                str = "down " + g;
                break;
            case 2:
                str = r7.x(m22Var.a(i6), m22Var.a(i3 + 2), "remove ", " ");
                i6 = i3 + 3;
                break;
            case 3:
                int a2 = m22Var.a(i6);
                int a3 = m22Var.a(i3 + 2);
                int a4 = m22Var.a(i3 + 3);
                StringBuilder D = hf1.D("move ", a2, " ", a3, " ");
                D.append(a4);
                str = D.toString();
                i6 = i3 + 4;
                break;
            case 4:
                str = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                int a5 = m22Var.a(i6);
                i5 = i2 + 1;
                str2 = "insertBottomUp " + a5 + " " + e43Var.g(i2);
                int i7 = i4;
                str = str2;
                i6 = i7;
                i2 = i5;
                break;
            case 6:
                i4 = i3 + 2;
                int a6 = m22Var.a(i6);
                i5 = i2 + 1;
                str2 = "insertTopDown " + a6 + " " + e43Var.g(i2);
                int i72 = i4;
                str = str2;
                i6 = i72;
                i2 = i5;
                break;
            case 7:
                Object g2 = e43Var.g(i2);
                g2.getClass();
                p70.A(2, g2);
                i2 += 2;
                str = "apply " + ((hn1) g2);
                break;
            case 8:
                str = "reuse " + nd0Var.J.g(i);
                i++;
                break;
            case 9:
                str = "recompose pending";
                break;
            default:
                str = hf1.u(a, "unknown op: ");
                break;
        }
        this.N = pj4Var;
        this.J = i6;
        this.K = i2;
        this.L = i;
        this.M = true;
        pj4Var.d(this, i3 + ": " + str);
        return el0.I;
    }
}
