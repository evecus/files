package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class sc {
    public final iu0 a;
    public long b = 9205357640488583168L;
    public final r61 c;
    public final jk3 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final wt0 i;

    public sc(Context context, iu0 iu0Var, long j, li3 li3Var) {
        this.a = iu0Var;
        r61 r61Var = new r61(context, qb.i0(j));
        this.c = r61Var;
        this.d = new jk3(wd5.a, q8.v0);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        r05 a = m05.a(new rc(this, (byte) 0));
        this.i = Build.VERSION.SDK_INT >= 31 ? new cx4(a, this, r61Var) : new dr1(a, this, r61Var, li3Var);
    }

    public final void a() {
        boolean z;
        r61 r61Var = this.c;
        EdgeEffect edgeEffect = r61Var.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = r61Var.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = r61Var.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = r61Var.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r17, defpackage.nc4 r19, defpackage.gj0 r20) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sc.b(long, nc4, gj0):java.lang.Object");
    }

    public final long c() {
        long j = this.b;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = ad4.q(this.g);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final void d() {
        if (this.e) {
            this.d.setValue(wd5.a);
        }
    }

    public final boolean e() {
        r61 r61Var = this.c;
        EdgeEffect edgeEffect = r61Var.d;
        if (edgeEffect != null && k21.D(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = r61Var.e;
        if (edgeEffect2 != null && k21.D(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = r61Var.f;
        if (edgeEffect3 != null && k21.D(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = r61Var.g;
        return (edgeEffect4 == null || k21.D(edgeEffect4) == 0.0f) ? false : true;
    }

    public final float f(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect b = this.c.b();
        return k21.D(b) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-k21.h0(b, -intBitsToFloat2, 1.0f - intBitsToFloat)) : Float.intBitsToFloat(i);
    }

    public final float g(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect c = this.c.c();
        return k21.D(c) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * k21.h0(c, intBitsToFloat2, 1.0f - intBitsToFloat) : Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect d = this.c.d();
        return k21.D(d) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-k21.h0(d, -intBitsToFloat2, intBitsToFloat)) : Float.intBitsToFloat(i);
    }

    public final float i(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect e = this.c.e();
        return k21.D(e) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * k21.h0(e, intBitsToFloat2, intBitsToFloat) : Float.intBitsToFloat(i);
    }

    public final void j(long j) {
        boolean a = fq4.a(this.g, 0L);
        boolean a2 = fq4.a(j, this.g);
        this.g = j;
        if (!a2) {
            long P = (mw2.P(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (mw2.P(Float.intBitsToFloat((int) (j >> 32))) << 32);
            r61 r61Var = this.c;
            r61Var.c = P;
            EdgeEffect edgeEffect = r61Var.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (P >> 32), (int) (P & 4294967295L));
            }
            EdgeEffect edgeEffect2 = r61Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (P >> 32), (int) (P & 4294967295L));
            }
            EdgeEffect edgeEffect3 = r61Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (P & 4294967295L), (int) (P >> 32));
            }
            EdgeEffect edgeEffect4 = r61Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (P & 4294967295L), (int) (P >> 32));
            }
            EdgeEffect edgeEffect5 = r61Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (P >> 32), (int) (P & 4294967295L));
            }
            EdgeEffect edgeEffect6 = r61Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (P >> 32), (int) (P & 4294967295L));
            }
            EdgeEffect edgeEffect7 = r61Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (P & 4294967295L), (int) (P >> 32));
            }
            EdgeEffect edgeEffect8 = r61Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & P), (int) (P >> 32));
            }
        }
        if (a || a2) {
            return;
        }
        a();
    }
}
