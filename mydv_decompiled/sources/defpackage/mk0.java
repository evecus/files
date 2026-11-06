package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mk0 extends wt0 implements pi4 {
    public u95 K;
    public d55 L;
    public oh2 M;
    public boolean N;
    public td3 O;
    public u45 P;
    public mx1 Q;
    public ki1 R;

    public static void m0(oh2 oh2Var, String str, boolean z) {
        if (z) {
            m55 m55Var = oh2Var.e;
            xj0 xj0Var = oh2Var.v;
            if (m55Var == null) {
                int length = str.length();
                xj0Var.invoke(new d55(4, str, ui4.c(length, length)));
            } else {
                d55 g = oh2Var.d.g(p70.k0(new cu0(), new eb0(str, 1)));
                m55Var.a(null, g);
                xj0Var.invoke(g);
            }
        }
    }

    @Override // defpackage.pi4
    public final void applySemantics(cj4 cj4Var) {
        oj ojVar = this.L.a;
        d82[] d82VarArr = aj4.a;
        bj4 bj4Var = zi4.F;
        d82[] d82VarArr2 = aj4.a;
        d82 d82Var = d82VarArr2[18];
        bj4Var.getClass();
        cj4Var.c(bj4Var, ojVar);
        oj ojVar2 = this.K.a;
        bj4 bj4Var2 = zi4.G;
        d82 d82Var2 = d82VarArr2[19];
        bj4Var2.getClass();
        cj4Var.c(bj4Var2, ojVar2);
        long j = this.L.b;
        bj4 bj4Var3 = zi4.H;
        d82 d82Var3 = d82VarArr2[20];
        d65 d65Var = new d65(j);
        bj4Var3.getClass();
        cj4Var.c(bj4Var3, d65Var);
        xb xbVar = q8.g0;
        bj4 bj4Var4 = zi4.s;
        d82 d82Var4 = d82VarArr2[9];
        bj4Var4.getClass();
        cj4Var.c(bj4Var4, xbVar);
        vc h = x9.h(this.L.a);
        if (h != null) {
            bj4 bj4Var5 = zi4.t;
            d82 d82Var5 = d82VarArr2[10];
            bj4Var5.getClass();
            cj4Var.c(bj4Var5, h);
        }
        cj4Var.c(ii4.h, new v4(null, new lk0(this, (byte) 0)));
        int i = this.Q.d;
        if (i == 6) {
            ui0.a.getClass();
            aj4.b(cj4Var, ti0.c);
        } else if (i == 7 || i == 8) {
            ui0.a.getClass();
            aj4.b(cj4Var, ti0.b);
        } else if (i == 4) {
            ui0.a.getClass();
            aj4.b(cj4Var, ti0.d);
        }
        if (!this.N) {
            cj4Var.c(zi4.j, wd5.a);
        }
        boolean z = this.N;
        bj4 bj4Var6 = zi4.Q;
        d82 d82Var6 = d82VarArr2[28];
        Boolean valueOf = Boolean.valueOf(z);
        bj4Var6.getClass();
        cj4Var.c(bj4Var6, valueOf);
        aj4.a(cj4Var, new lk0(this, (byte) 1));
        if (z) {
            cj4Var.c(ii4.k, new v4(null, new lk0(this, (byte) 2)));
            cj4Var.c(ii4.o, new v4(null, new lk0(this, cj4Var)));
        }
        cj4Var.c(ii4.j, new v4(null, new j10(this, (byte) 1)));
        int i2 = this.Q.e;
        kk0 kk0Var = new kk0(this, (byte) 6);
        cj4Var.c(zi4.J, new lx1(i2));
        cj4Var.c(ii4.p, new v4(null, kk0Var));
        cj4Var.c(ii4.b, new v4(null, new kk0(this, (byte) 7)));
        cj4Var.c(ii4.c, new v4(null, new kk0(this, (byte) 1)));
        if (!d65.c(this.L.b)) {
            cj4Var.c(ii4.q, new v4(null, new kk0(this, (byte) 2)));
            if (this.N) {
                cj4Var.c(ii4.r, new v4(null, new kk0(this, (byte) 3)));
            }
        }
        if (this.N) {
            cj4Var.c(ii4.s, new v4(null, new kk0(this, (byte) 5)));
        }
    }

    @Override // defpackage.pi4
    public final boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override // defpackage.pi4
    public final boolean isImportantForBounds() {
        return true;
    }
}
