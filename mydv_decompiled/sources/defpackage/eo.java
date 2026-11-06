package defpackage;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class eo implements jn1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ hu2 J;
    public final /* synthetic */ q73 K;

    public /* synthetic */ eo(hu2 hu2Var, q73 q73Var) {
        this.J = hu2Var;
        this.K = q73Var;
    }

    @Override // defpackage.jn1
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        jp jpVar = de0.a;
        final q73 q73Var = this.K;
        final hu2 hu2Var = this.J;
        fe0 fe0Var = (fe0) obj3;
        ((Integer) obj4).getClass();
        ((th) obj).getClass();
        ((p63) obj2).getClass();
        switch (b) {
            case 0:
                go1 go1Var = (go1) fe0Var;
                boolean i = go1Var.i(hu2Var) | go1Var.i(q73Var);
                Object Q = go1Var.Q();
                if (i || Q == jpVar) {
                    final byte b2 = 1;
                    Q = new rm1() { // from class: xn
                        @Override // defpackage.rm1
                        public final Object invoke() {
                            q34 q34Var;
                            byte b3 = b2;
                            wd5 wd5Var2 = wd5.a;
                            q73 q73Var2 = q73Var;
                            hu2 hu2Var2 = hu2Var;
                            switch (b3) {
                                case 0:
                                    q73Var2.a(mw2.W(((rr0) ((fw4) hu2Var2.h.q0.I).getValue()).K).getRoute(), new t5((byte) 10));
                                    return wd5Var2;
                                default:
                                    r34 r34Var = (r34) t34.b.getValue();
                                    if (r34Var == null || (q34Var = r34Var.a) == null) {
                                        q34Var = t34.h;
                                    }
                                    int i2 = q34Var.d;
                                    SharedPreferences sharedPreferences = t34.i;
                                    if (sharedPreferences == null) {
                                        j42.g0("prefs");
                                        throw null;
                                    }
                                    sharedPreferences.edit().putBoolean("license_agreed", true).putInt("license_agreed_version", i2).apply();
                                    fw4 fw4Var = t34.e;
                                    Boolean bool = Boolean.TRUE;
                                    fw4Var.getClass();
                                    fw4Var.i(null, bool);
                                    if (hu2Var2.D()) {
                                        q73Var2.a("profile_picker", new t5((byte) 11));
                                    } else {
                                        q73Var2.a(mw2.W(((rr0) ((fw4) hu2Var2.h.q0.I).getValue()).K).getRoute(), new t5((byte) 12));
                                    }
                                    return wd5Var2;
                            }
                        }
                    };
                    go1Var.o0(Q);
                }
                rm1 rm1Var = (rm1) Q;
                Object Q2 = go1Var.Q();
                if (Q2 == jpVar) {
                    Q2 = new u7((byte) 5);
                    go1Var.o0(Q2);
                }
                ci2.b(rm1Var, (rm1) Q2, null, go1Var, 48);
                break;
            default:
                go1 go1Var2 = (go1) fe0Var;
                boolean i2 = go1Var2.i(hu2Var) | go1Var2.i(q73Var);
                Object Q3 = go1Var2.Q();
                if (i2 || Q3 == jpVar) {
                    final byte b3 = 0;
                    Q3 = new rm1() { // from class: xn
                        @Override // defpackage.rm1
                        public final Object invoke() {
                            q34 q34Var;
                            byte b32 = b3;
                            wd5 wd5Var2 = wd5.a;
                            q73 q73Var2 = q73Var;
                            hu2 hu2Var2 = hu2Var;
                            switch (b32) {
                                case 0:
                                    q73Var2.a(mw2.W(((rr0) ((fw4) hu2Var2.h.q0.I).getValue()).K).getRoute(), new t5((byte) 10));
                                    return wd5Var2;
                                default:
                                    r34 r34Var = (r34) t34.b.getValue();
                                    if (r34Var == null || (q34Var = r34Var.a) == null) {
                                        q34Var = t34.h;
                                    }
                                    int i22 = q34Var.d;
                                    SharedPreferences sharedPreferences = t34.i;
                                    if (sharedPreferences == null) {
                                        j42.g0("prefs");
                                        throw null;
                                    }
                                    sharedPreferences.edit().putBoolean("license_agreed", true).putInt("license_agreed_version", i22).apply();
                                    fw4 fw4Var = t34.e;
                                    Boolean bool = Boolean.TRUE;
                                    fw4Var.getClass();
                                    fw4Var.i(null, bool);
                                    if (hu2Var2.D()) {
                                        q73Var2.a("profile_picker", new t5((byte) 11));
                                    } else {
                                        q73Var2.a(mw2.W(((rr0) ((fw4) hu2Var2.h.q0.I).getValue()).K).getRoute(), new t5((byte) 12));
                                    }
                                    return wd5Var2;
                            }
                        }
                    };
                    go1Var2.o0(Q3);
                }
                j16.i(hu2Var, (rm1) Q3, null, go1Var2, 8);
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ eo(q73 q73Var, hu2 hu2Var) {
        this.K = q73Var;
        this.J = hu2Var;
    }
}
