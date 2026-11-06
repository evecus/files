package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class nj1 implements kj1 {
    public final yc a;
    public final zc b;
    public final da c;
    public final sj1 d;
    public final ep e;
    public final i9 f;

    public nj1(yc ycVar, zc zcVar) {
        da daVar = oj1.a;
        sj1 sj1Var = new sj1(oj1.b);
        ep epVar = new ep((byte) 14);
        this.a = ycVar;
        this.b = zcVar;
        this.c = daVar;
        this.d = sj1Var;
        this.e = epVar;
        this.f = new i9(this, (byte) 7);
    }

    public final jc5 a(gc5 gc5Var) {
        da daVar = this.c;
        m1 m1Var = new m1(this, gc5Var, (byte) 6);
        synchronized (((o63) daVar.J)) {
            jc5 jc5Var = (jc5) ((ss2) daVar.K).a(gc5Var);
            if (jc5Var != null) {
                if (jc5Var.a()) {
                    return jc5Var;
                }
            }
            try {
                jc5 jc5Var2 = (jc5) m1Var.invoke(new m1(daVar, gc5Var, (byte) 24));
                synchronized (((o63) daVar.J)) {
                    if (((ss2) daVar.K).a(gc5Var) == null && jc5Var2.a()) {
                        ((ss2) daVar.K).b(gc5Var, jc5Var2);
                    }
                }
                return jc5Var2;
            } catch (Exception e) {
                zl1.i("Could not load font", e);
                return null;
            }
        }
    }

    public final jc5 b(mj1 mj1Var, qk1 qk1Var, int i, int i2) {
        int i3 = this.b.a;
        return a(new gc5(mj1Var, (i3 == 0 || i3 == Integer.MAX_VALUE) ? qk1Var : new qk1(ut0.r(qk1Var.I + i3, 1, 1000)), i, i2, null));
    }
}
