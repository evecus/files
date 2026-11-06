package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class oc4 {
    public gc4 a;
    public sc b;
    public gf1 c;
    public pg3 d;
    public boolean e;
    public d93 f;
    public final fc4 g;
    public final bc4 h;
    public boolean i;
    public byte j = 1;
    public rb4 k = j42.o;
    public final mc4 l = new mc4(this);
    public final i9 m = new i9(this, 21);

    public oc4(gc4 gc4Var, sc scVar, gf1 gf1Var, pg3 pg3Var, boolean z, d93 d93Var, fc4 fc4Var, bc4 bc4Var) {
        this.a = gc4Var;
        this.b = scVar;
        this.c = gf1Var;
        this.d = pg3Var;
        this.e = z;
        this.f = d93Var;
        this.g = fc4Var;
        this.h = bc4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r11, defpackage.gj0 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.jc4
            if (r0 == 0) goto L13
            r0 = r13
            jc4 r0 = (defpackage.jc4) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            jc4 r0 = new jc4
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.J
            int r1 = r0.L
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            q24 r11 = r0.I
            defpackage.mu0.V(r13)     // Catch: java.lang.Throwable -> L29
            r5 = r10
            goto L58
        L29:
            r0 = move-exception
            r11 = r0
            r5 = r10
            goto L67
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r10)
            r10 = 0
            return r10
        L34:
            defpackage.mu0.V(r13)
            q24 r6 = new q24
            r6.<init>()
            r6.I = r11
            r10.i = r3
            d53 r13 = defpackage.d53.I     // Catch: java.lang.Throwable -> L64
            lc4 r4 = new lc4     // Catch: java.lang.Throwable -> L64
            r9 = 0
            r5 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L61
            r0.I = r6     // Catch: java.lang.Throwable -> L61
            r0.L = r3     // Catch: java.lang.Throwable -> L61
            java.lang.Object r10 = r5.g(r13, r4, r0)     // Catch: java.lang.Throwable -> L61
            el0 r11 = defpackage.el0.I
            if (r10 != r11) goto L57
            return r11
        L57:
            r11 = r6
        L58:
            r5.i = r2
            long r10 = r11.I
            ji5 r10 = defpackage.ji5.a(r10)
            return r10
        L61:
            r0 = move-exception
        L62:
            r11 = r0
            goto L67
        L64:
            r0 = move-exception
            r5 = r10
            goto L62
        L67:
            r5.i = r2
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oc4.a(long, gj0):java.lang.Object");
    }

    public final boolean b() {
        sc scVar;
        return this.a.c() || this.a.b() || ((scVar = this.b) != null && scVar.e());
    }

    public final Object c(long j, boolean z, k05 k05Var) {
        if (!z || !(this.c instanceof mr0)) {
            long b = ji5.b(j, 0.0f, 0.0f, this.d == pg3.J ? 1 : 2);
            nc4 nc4Var = new nc4(this, null, (byte) 0);
            sc scVar = this.b;
            el0 el0Var = el0.I;
            if (scVar == null || !b()) {
                Object invoke = nc4Var.invoke(ji5.a(b), k05Var);
                if (invoke == el0Var) {
                    return invoke;
                }
            } else {
                Object b2 = scVar.b(b, nc4Var, k05Var);
                if (b2 == el0Var) {
                    return b2;
                }
            }
        }
        return wd5.a;
    }

    public final long d(rb4 rb4Var, long j, int i) {
        h93 h93Var = this.f.a;
        h93 k0 = h93Var != null ? h93Var.k0() : null;
        long C = k0 != null ? k0.C(i, j) : 0L;
        long e = pd3.e(j, C);
        long f = f(i(rb4Var.a(h(f(pd3.a(e, 0.0f, this.d == pg3.J ? 1 : 2))))));
        fc4 fc4Var = this.g;
        if (fc4Var.isAttached()) {
            ut0.V(fc4Var).mo18dispatchOnScrollChangedk4lQ0M(f);
        }
        long e2 = pd3.e(e, f);
        h93 h93Var2 = this.f.a;
        h93 k02 = h93Var2 != null ? h93Var2.k0() : null;
        return pd3.f(pd3.f(C, f), k02 != null ? k02.V(i, f, e2) : 0L);
    }

    public final float e(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    public final long f(long j) {
        return this.e ? pd3.g(j, -1.0f) : j;
    }

    public final Object g(d53 d53Var, hn1 hn1Var, gj0 gj0Var) {
        Object d = this.a.d(d53Var, new o1((Object) this, (Object) hn1Var, (fj0) null, (byte) 14), gj0Var);
        return d == el0.I ? d : wd5.a;
    }

    public final float h(long j) {
        return Float.intBitsToFloat(this.d == pg3.J ? (int) (j >> 32) : (int) (j & 4294967295L));
    }

    public final long i(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == pg3.J) {
            return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
        }
        return (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final float j(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double atan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        pg3 pg3Var = this.d;
        if (atan2 >= 0.7853981633974483d) {
            if (pg3Var == pg3.I) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (pg3Var == pg3.J) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
