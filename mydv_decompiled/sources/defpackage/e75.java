package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class e75 {
    public final int a;
    public final js b;
    public final be c;
    public e75 d;
    public long e;
    public long f;
    public long g = Long.MIN_VALUE;
    public final /* synthetic */ f75 h;

    public e75(f75 f75Var, int i, js jsVar, be beVar) {
        this.h = f75Var;
        this.a = i;
        this.b = jsVar;
        this.c = beVar;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        g34 M = eg5.M(j, j2, j3, j4, this.h.f, this.b, fArr);
        if (M == null) {
            return;
        }
        this.c.invoke(M);
    }

    public final void b() {
        f75 f75Var = this.h;
        q33 q33Var = f75Var.a;
        int i = this.a;
        e75 e75Var = (e75) q33Var.g(i);
        if (e75Var != null) {
            if (e75Var == this) {
                e75 e75Var2 = this.d;
                this.d = null;
                if (e75Var2 != null) {
                    int d = q33Var.d(i);
                    Object[] objArr = q33Var.c;
                    Object obj = objArr[d];
                    q33Var.b[d] = i;
                    objArr[d] = e75Var2;
                    return;
                }
                wa2 U = ut0.U(this.b.getNode());
                if (U.K()) {
                    o14 rectManager = za2.a(U).getRectManager();
                    rectManager.getClass();
                    if (U.O != -4) {
                        tl tlVar = rectManager.c;
                        int d2 = rectManager.d(U);
                        long[] jArr = (long[]) tlVar.b;
                        int i2 = d2 + 2;
                        jArr[i2] = jArr[i2] & 8070450532247928831L;
                        return;
                    }
                    return;
                }
                return;
            }
            int d3 = q33Var.d(i);
            Object[] objArr2 = q33Var.c;
            Object obj2 = objArr2[d3];
            q33Var.b[d3] = i;
            objArr2[d3] = e75Var;
            while (true) {
                e75 e75Var3 = e75Var.d;
                if (e75Var3 == null) {
                    break;
                }
                if (e75Var3 == this) {
                    e75Var.d = this.d;
                    this.d = null;
                    return;
                }
                e75Var = e75Var3;
            }
        }
        e75 e75Var4 = f75Var.b;
        if (e75Var4 == this) {
            f75Var.b = e75Var4.d;
            this.d = null;
            return;
        }
        e75 e75Var5 = e75Var4 != null ? e75Var4.d : null;
        while (true) {
            e75 e75Var6 = e75Var4;
            e75Var4 = e75Var5;
            if (e75Var4 == null) {
                return;
            }
            if (e75Var4 == this) {
                if (e75Var6 != null) {
                    e75Var6.d = e75Var4.d;
                }
                this.d = null;
                return;
            }
            e75Var5 = e75Var4.d;
        }
    }
}
