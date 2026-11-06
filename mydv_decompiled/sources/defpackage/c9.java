package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class c9 {
    public final d9 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public d9 h;
    public boolean b = true;
    public final HashMap i = new HashMap();

    public c9(d9 d9Var) {
        this.a = d9Var;
    }

    public final void a(v8 v8Var, int i, na3 na3Var) {
        long j;
        float f = i;
        long floatToRawIntBits = Float.floatToRawIntBits(f) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f) & 4294967295L;
        loop0: while (true) {
            j = floatToRawIntBits | floatToRawIntBits2;
            do {
                j = b(na3Var, j);
                na3Var = na3Var.e0;
                na3Var.getClass();
                if (na3Var.equals(this.a.f())) {
                    break loop0;
                }
            } while (!c(na3Var).containsKey(v8Var));
            float d = d(na3Var, v8Var);
            long floatToRawIntBits3 = Float.floatToRawIntBits(d);
            long floatToRawIntBits4 = Float.floatToRawIntBits(d);
            floatToRawIntBits = floatToRawIntBits3 << 32;
            floatToRawIntBits2 = floatToRawIntBits4 & 4294967295L;
        }
        int round = Math.round(v8Var instanceof dv1 ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j >> 32)));
        HashMap hashMap = this.i;
        if (hashMap.containsKey(v8Var)) {
            int intValue = ((Number) sv2.E(v8Var, hashMap)).intValue();
            dv1 dv1Var = z8.a;
            round = ((Number) v8Var.a.invoke(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
        }
        hashMap.put(v8Var, Integer.valueOf(round));
    }

    public long b(na3 na3Var, long j) {
        mr1 mr1Var = na3Var.B0;
        if (mr1Var != null) {
            float[] b = mr1Var.b();
            if (!mr1Var.a0) {
                j = nw2.b(j, b);
            }
        }
        return sv2.Q(j, na3Var.n0);
    }

    public Map c(na3 na3Var) {
        return na3Var.r0().a();
    }

    public int d(na3 na3Var, v8 v8Var) {
        return na3Var.R(v8Var);
    }

    public final boolean e() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean f() {
        i();
        return this.h != null;
    }

    public final void g() {
        this.b = true;
        d9 d9Var = this.a;
        d9 g = d9Var.g();
        if (g == null) {
            return;
        }
        if (this.c) {
            g.O();
        } else if (this.e || this.d) {
            g.requestLayout();
        }
        if (this.f) {
            d9Var.O();
        }
        if (this.g) {
            d9Var.requestLayout();
        }
        g.a().g();
    }

    public final void h() {
        HashMap hashMap = this.i;
        hashMap.clear();
        v1 v1Var = new v1((Object) this, (byte) 3);
        d9 d9Var = this.a;
        d9Var.y(v1Var);
        hashMap.putAll(c(d9Var.f()));
        this.b = false;
    }

    public final void i() {
        c9 a;
        c9 a2;
        boolean e = e();
        d9 d9Var = this.a;
        if (!e) {
            d9 g = d9Var.g();
            if (g == null) {
                return;
            }
            d9Var = g.a().h;
            if (d9Var == null || !d9Var.a().e()) {
                d9 d9Var2 = this.h;
                if (d9Var2 == null || d9Var2.a().e()) {
                    return;
                }
                d9 g2 = d9Var2.g();
                if (g2 != null && (a2 = g2.a()) != null) {
                    a2.i();
                }
                d9 g3 = d9Var2.g();
                d9Var = (g3 == null || (a = g3.a()) == null) ? null : a.h;
            }
        }
        this.h = d9Var;
    }
}
