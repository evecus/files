package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rg2 implements oe2 {
    public final /* synthetic */ zg2 a;
    public final /* synthetic */ xg2 b;
    public final /* synthetic */ rm1 c;
    public final /* synthetic */ li3 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ dl0 f;
    public final /* synthetic */ ir1 g;

    public rg2(zg2 zg2Var, xg2 xg2Var, c82 c82Var, li3 li3Var, float f, dl0 dl0Var, ir1 ir1Var) {
        this.a = zg2Var;
        this.b = xg2Var;
        this.c = c82Var;
        this.d = li3Var;
        this.e = f;
        this.f = dl0Var;
        this.g = ir1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oe2
    public final vw2 a(pe2 pe2Var, long j) {
        pd2 pd2Var;
        boolean z;
        Integer num;
        int b0;
        wy4 wy4Var = pe2Var.J;
        li3 li3Var = this.d;
        float f = li3Var.d;
        float f2 = li3Var.b;
        zg2 zg2Var = this.a;
        zg2Var.v.getValue();
        boolean z2 = zg2Var.a || wy4Var.N();
        mw2.u(j, pg3.I);
        xg2 xg2Var = this.b;
        if (xg2Var.d != null && dh0.b(xg2Var.b, j) && xg2Var.c == wy4Var.getDensity()) {
            pd2 pd2Var2 = xg2Var.d;
            pd2Var2.getClass();
            pd2Var = pd2Var2;
        } else {
            xg2Var.b = j;
            xg2Var.c = wy4Var.getDensity();
            pd2 pd2Var3 = (pd2) xg2Var.a.invoke(pe2Var, new dh0(j));
            xg2Var.d = pd2Var3;
            pd2Var = pd2Var3;
        }
        lg2 lg2Var = (lg2) this.c.invoke();
        wy4Var.getLayoutDirection();
        int X = wy4Var.X(f2);
        wy4Var.getLayoutDirection();
        pd2 pd2Var4 = pd2Var;
        int X2 = wy4Var.X(f);
        int X3 = wy4Var.X(i42.d0(li3Var, wy4Var.getLayoutDirection()));
        int g = (dh0.g(j) - X) - X2;
        long j2 = (X3 << 32) | (X & 4294967295L);
        int X4 = wy4Var.X(i42.c0(li3Var, wy4Var.getLayoutDirection()) + i42.d0(li3Var, wy4Var.getLayoutDirection()));
        int X5 = wy4Var.X(f + f2);
        p33 i = vt0.i(lg2Var, zg2Var.s, zg2Var.k);
        long a = dh0.a(j, eh0.g(X4, j), 0, eh0.f(X5, j), 0, 10);
        int X6 = wy4Var.X(this.e);
        boolean N = wy4Var.N();
        sg2 sg2Var = zg2Var.b;
        qg2 qg2Var = new qg2(zg2Var, i, lg2Var, pd2Var4, a, true, pe2Var, g, j2, X, X2, X6, this.f, z2, sg2Var != null ? sg2Var.m : null, this.g);
        vg2 vg2Var = zg2Var.c;
        int[] iArr = vg2Var.b;
        Object obj = vg2Var.g;
        iArr.getClass();
        if (iArr.length > 0) {
            z = 0;
            num = Integer.valueOf(iArr[0]);
        } else {
            z = 0;
            num = null;
        }
        int x = sv2.x(num != null ? num.intValue() : z, lg2Var, obj);
        if (!dq.L0(x, iArr)) {
            vg2Var.h.c(x);
            ns4 i2 = o63.i();
            tm1 e = i2 != null ? i2.e() : null;
            ns4 j3 = o63.j(i2);
            try {
                iArr = (int[]) vg2Var.a.invoke(Integer.valueOf(x), Integer.valueOf(iArr.length));
                o63.o(i2, j3, e);
                vg2Var.b = iArr;
                vg2Var.c.i(vg2.a(iArr));
            } catch (Throwable th) {
                o63.o(i2, j3, e);
                throw th;
            }
        }
        int[] iArr2 = vg2Var.d;
        int length = iArr.length;
        int i3 = qg2Var.r;
        if (length != i3) {
            yv yvVar = qg2Var.q;
            yvVar.k();
            int[] iArr3 = new int[i3];
            int i4 = z;
            while (i4 < i3) {
                if (i4 >= iArr.length || (b0 = iArr[i4]) == -1) {
                    b0 = i4 == 0 ? z : k21.b0(iArr3, i4 & 4294967295L) + 1;
                }
                iArr3[i4] = b0;
                yvVar.n(b0, i4);
                i4++;
            }
            iArr = iArr3;
        }
        if (iArr2.length != i3) {
            int[] iArr4 = new int[i3];
            int i5 = z;
            while (i5 < i3) {
                iArr4[i5] = i5 < iArr2.length ? iArr2[i5] : i5 == 0 ? z : iArr4[i5 - 1];
                i5++;
            }
            iArr2 = iArr4;
        }
        sg2 c0 = k21.c0(qg2Var, Math.round((N || !zg2Var.a) ? zg2Var.o : ((Number) ((cj) zg2Var.w.K).J.getValue()).floatValue()), iArr, iArr2, true);
        zg2Var.f(c0, wy4Var.N(), z);
        return c0;
    }
}
