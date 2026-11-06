package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wc2 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ l13 J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ boolean N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ tm1 P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ short R;
    public final /* synthetic */ Object S;
    public final /* synthetic */ Object T;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ wc2(String str, hx1 hx1Var, Enum[] enumArr, Enum r5, tm1 tm1Var, tm1 tm1Var2, l13 l13Var, boolean z, String str2, int i, int i2) {
        this.I = (byte) 2;
        this.K = str;
        this.L = hx1Var;
        this.S = enumArr;
        this.T = r5;
        this.P = tm1Var;
        this.M = tm1Var2;
        this.J = l13Var;
        this.N = z;
        this.O = str2;
        this.Q = i;
        this.R = i2;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.Q;
        Object obj3 = this.O;
        Object obj4 = this.M;
        Object obj5 = this.T;
        Object obj6 = this.S;
        Object obj7 = this.L;
        Object obj8 = this.K;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int X = mu0.X(i | 1);
                e21.e(this.J, (ag2) obj8, (ji3) obj7, (ip) obj6, (uv) obj5, (gf1) obj4, this.N, (sc) obj3, this.P, (fe0) obj, X, this.R);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int X2 = mu0.X(i | 1);
                e21.c(this.J, (ag2) obj8, (ji3) obj7, (mp) obj6, (tv) obj5, (gf1) obj4, this.N, (sc) obj3, this.P, (fe0) obj, X2, this.R);
                break;
            default:
                ((Integer) obj2).getClass();
                int X3 = mu0.X(i | 1);
                qm4.j((String) obj8, (hx1) obj7, (Enum[]) obj6, (Enum) obj5, this.P, (tm1) obj4, this.J, this.N, (String) obj3, (fe0) obj, X3, this.R);
                break;
        }
        return wd5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ wc2(l13 l13Var, ag2 ag2Var, ji3 ji3Var, Object obj, Object obj2, gf1 gf1Var, boolean z, sc scVar, tm1 tm1Var, int i, int i2, byte b) {
        this.I = b;
        this.J = l13Var;
        this.K = ag2Var;
        this.L = ji3Var;
        this.S = obj;
        this.T = obj2;
        this.M = gf1Var;
        this.N = z;
        this.O = scVar;
        this.P = tm1Var;
        this.Q = i;
        this.R = i2;
    }
}
