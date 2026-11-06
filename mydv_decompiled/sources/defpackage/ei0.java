package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ei0 extends k13 implements hy, ye0, cx2 {
    public pg3 I;
    public final oc4 J;
    public boolean K;
    public oy L;
    public final bc4 M;
    public boolean O;
    public boolean Q;
    public final cy N = new cy((byte) 0);
    public long P = -1;

    public ei0(pg3 pg3Var, oc4 oc4Var, boolean z, oy oyVar, bc4 bc4Var) {
        this.I = pg3Var;
        this.J = oc4Var;
        this.K = z;
        this.L = oyVar;
        this.M = bc4Var;
    }

    public static boolean l0(ei0 ei0Var, m14 m14Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = ei0Var.k0();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long n0 = ei0Var.n0(m14Var, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (n0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (n0 & 4294967295L))) <= 0.5f;
    }

    @Override // defpackage.hy
    public final Object M(jy jyVar, ni niVar) {
        m14 m14Var = (m14) jyVar.invoke();
        wd5 wd5Var = wd5.a;
        if (m14Var != null && !l0(this, m14Var, 0L, 0L, 3)) {
            k10 k10Var = new k10(1, mu0.G(niVar));
            k10Var.t();
            bi0 bi0Var = new bi0(jyVar, k10Var);
            cy cyVar = this.N;
            b53 b53Var = cyVar.a;
            m14 m14Var2 = (m14) jyVar.invoke();
            if (m14Var2 == null) {
                k10Var.resumeWith(wd5Var);
            } else {
                k10Var.v(new be(cyVar, bi0Var, (byte) 5));
                u22 c0 = ut0.c0(0, b53Var.K);
                int i = c0.I;
                int i2 = c0.J;
                if (i <= i2) {
                    while (true) {
                        m14 m14Var3 = (m14) ((bi0) b53Var.I[i2]).a.invoke();
                        if (m14Var3 != null) {
                            m14 e = m14Var2.e(m14Var3);
                            if (e.equals(m14Var2)) {
                                b53Var.b(i2 + 1, bi0Var);
                                break;
                            }
                            if (!e.equals(m14Var3)) {
                                CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                int i3 = b53Var.K - 1;
                                if (i3 <= i2) {
                                    while (true) {
                                        ((bi0) b53Var.I[i2]).b.j(cancellationException);
                                        if (i3 == i2) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            }
                        }
                        if (i2 == i) {
                            break;
                        }
                        i2--;
                    }
                }
                b53Var.b(0, bi0Var);
                if (!this.Q) {
                    m0(0L);
                }
            }
            Object r = k10Var.r();
            if (r == el0.I) {
                return r;
            }
        }
        return wd5Var;
    }

    @Override // defpackage.k13
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.cx2
    public final void i(long j) {
        int m;
        long k0 = k0();
        this.P = j;
        int ordinal = this.I.ordinal();
        if (ordinal == 0) {
            m = j42.m((int) (j & 4294967295L), (int) (k0 & 4294967295L));
        } else {
            if (ordinal != 1) {
                s83.v();
                return;
            }
            m = j42.m((int) (j >> 32), (int) (k0 >> 32));
        }
        if (m >= 0) {
            return;
        }
        long j2 = !this.K ? this.I == pg3.I ? (((int) (k0 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L : (((int) (k0 >> 32)) - ((int) (j >> 32))) << 32 : 0L;
        m14 m14Var = (m14) this.M.invoke();
        if (m14Var == null || this.Q || this.O || !l0(this, m14Var, k0, 0L, 2) || l0(this, m14Var, 0L, j2, 1)) {
            return;
        }
        this.O = true;
        m0(j2);
    }

    @Override // defpackage.hy
    public final m14 j(m14 m14Var) {
        if (z22.b(this.P, -1L)) {
            t02.c("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return m14Var.i(n0(m14Var, k0(), 0L) ^ (-9223372034707292160L));
    }

    public final float j0(oy oyVar, long j) {
        float f;
        m14 m14Var;
        int compare;
        long j2 = this.P;
        b53 b53Var = this.N.a;
        int i = b53Var.K - 1;
        Object[] objArr = b53Var.I;
        if (i < objArr.length) {
            m14Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                m14 m14Var2 = (m14) ((bi0) objArr[i]).a.invoke();
                if (m14Var2 != null) {
                    long c = m14Var2.c();
                    long b0 = ut0.b0(k0());
                    f = 0.0f;
                    int ordinal = this.I.ordinal();
                    if (ordinal == 0) {
                        compare = Float.compare(Float.intBitsToFloat((int) (c & 4294967295L)), Float.intBitsToFloat((int) (b0 & 4294967295L)));
                    } else {
                        if (ordinal != 1) {
                            s83.v();
                            return 0.0f;
                        }
                        compare = Float.compare(Float.intBitsToFloat((int) (c >> 32)), Float.intBitsToFloat((int) (b0 >> 32)));
                    }
                    if (compare <= 0) {
                        m14Var = m14Var2;
                    } else if (m14Var == null) {
                        m14Var = m14Var2;
                    }
                }
                i--;
            }
        } else {
            f = 0.0f;
            m14Var = null;
        }
        if (m14Var == null) {
            m14 m14Var3 = this.O ? (m14) this.M.invoke() : null;
            if (m14Var3 == null) {
                return f;
            }
            m14Var = m14Var3;
        }
        long b02 = ut0.b0(j2);
        int ordinal2 = this.I.ordinal();
        if (ordinal2 == 0) {
            float f2 = m14Var.b;
            return oyVar.a(f2 - ((int) (j & 4294967295L)), m14Var.d - f2, Float.intBitsToFloat((int) (b02 & 4294967295L)));
        }
        if (ordinal2 == 1) {
            float f3 = m14Var.a;
            return oyVar.a(f3 - ((int) (j >> 32)), m14Var.c - f3, Float.intBitsToFloat((int) (b02 >> 32)));
        }
        s83.v();
        return f;
    }

    public final long k0() {
        long j = this.P;
        if (z22.b(j, -1L)) {
            return 0L;
        }
        return j;
    }

    public final void m0(long j) {
        oy oyVar = this.L;
        if (oyVar == null) {
            oyVar = (oy) j42.r(this, py.a);
        }
        oy oyVar2 = oyVar;
        if (this.Q) {
            t02.c("launchAnimation called when previous animation was running");
        }
        oy oyVar3 = this.L;
        if (oyVar3 == null) {
            oyVar3 = (oy) j42.r(this, py.a);
        }
        bf5 bf5Var = new bf5(oyVar3.b());
        p70.g0(getCoroutineScope(), null, gl0.L, new di0(this, bf5Var, oyVar2, j, null), 1);
    }

    public final long n0(m14 m14Var, long j, long j2) {
        long b0 = ut0.b0(j);
        int ordinal = this.I.ordinal();
        if (ordinal == 0) {
            oy oyVar = this.L;
            if (oyVar == null) {
                oyVar = (oy) j42.r(this, py.a);
            }
            float f = m14Var.b;
            float a = oyVar.a(f - ((int) (j2 & 4294967295L)), m14Var.d - f, Float.intBitsToFloat((int) (b0 & 4294967295L)));
            return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(a) & 4294967295L);
        }
        if (ordinal != 1) {
            s83.v();
            return 0L;
        }
        oy oyVar2 = this.L;
        if (oyVar2 == null) {
            oyVar2 = (oy) j42.r(this, py.a);
        }
        float f2 = m14Var.a;
        return (Float.floatToRawIntBits(oyVar2.a(f2 - ((int) (j2 >> 32)), m14Var.c - f2, Float.intBitsToFloat((int) (b0 >> 32)))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
    }
}
