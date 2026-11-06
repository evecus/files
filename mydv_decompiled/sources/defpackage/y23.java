package defpackage;

import androidx.media3.common.util.Log;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class y23 {
    public oj a;
    public kj1 b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List g;
    public mz2 h;
    public iu0 j;
    public m65 k;
    public zw l;
    public da2 m;
    public u55 n;
    public long q;
    public long i = u02.a;
    public int o = -1;
    public int p = -1;

    public y23(oj ojVar, m65 m65Var, kj1 kj1Var, int i, boolean z, int i2, int i3, List list) {
        this.a = ojVar;
        this.b = kj1Var;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.k = m65Var;
    }

    public final int a(int i, da2 da2Var) {
        int i2 = this.o;
        int i3 = this.p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long a = eh0.a(0, i, 0, Log.LOG_LEVEL_OFF);
        if (this.f > 1) {
            mz2 mz2Var = this.h;
            m65 m65Var = this.k;
            iu0 iu0Var = this.j;
            iu0Var.getClass();
            mz2 E = lq2.E(mz2Var, da2Var, m65Var, iu0Var, this.b);
            this.h = E;
            a = E.a(this.f, a);
        }
        int b = qi4.b(b(a, da2Var).e);
        int i4 = dh0.i(a);
        if (b < i4) {
            b = i4;
        }
        this.o = i;
        this.p = b;
        return b;
    }

    public final w23 b(long j, da2 da2Var) {
        zw e = e(da2Var);
        long q = rt0.q(j, this.d, this.c, e.c());
        boolean z = this.d;
        int i = this.c;
        int i2 = this.e;
        return new w23(e, q, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    public final boolean c(long j, da2 da2Var) {
        this.q = (this.q << 2) | 3;
        if (this.f > 1) {
            mz2 mz2Var = this.h;
            m65 m65Var = this.k;
            iu0 iu0Var = this.j;
            iu0Var.getClass();
            mz2 E = lq2.E(mz2Var, da2Var, m65Var, iu0Var, this.b);
            this.h = E;
            j = E.a(this.f, j);
        }
        u55 u55Var = this.n;
        if (u55Var != null) {
            w23 w23Var = u55Var.b;
            t55 t55Var = u55Var.a;
            if (!w23Var.a.a()) {
                da2 da2Var2 = t55Var.h;
                long j2 = t55Var.j;
                if (da2Var == da2Var2 && (dh0.b(j, j2) || (dh0.h(j) == dh0.h(j2) && dh0.j(j) == dh0.j(j2) && dh0.g(j) >= w23Var.e && !w23Var.c))) {
                    u55 u55Var2 = this.n;
                    u55Var2.getClass();
                    if (dh0.b(j, u55Var2.a.j)) {
                        return false;
                    }
                    u55 u55Var3 = this.n;
                    u55Var3.getClass();
                    this.n = f(da2Var, j, u55Var3.b);
                    return true;
                }
            }
        }
        this.n = f(da2Var, j, b(j, da2Var));
        return true;
    }

    public final void d(iu0 iu0Var) {
        long j;
        iu0 iu0Var2 = this.j;
        if (iu0Var != null) {
            int i = u02.b;
            j = u02.a(iu0Var.getDensity(), iu0Var.L());
        } else {
            j = u02.a;
        }
        if (iu0Var2 == null) {
            this.j = iu0Var;
            this.i = j;
        } else if (iu0Var == null || this.i != j) {
            this.j = iu0Var;
            this.i = j;
            this.q = (this.q << 2) | 1;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
    }

    public final zw e(da2 da2Var) {
        zw zwVar = this.l;
        if (zwVar == null || da2Var != this.m || zwVar.a()) {
            this.m = da2Var;
            oj ojVar = this.a;
            m65 z = ad4.z(this.k, da2Var);
            iu0 iu0Var = this.j;
            iu0Var.getClass();
            kj1 kj1Var = this.b;
            List list = this.g;
            if (list == null) {
                list = o91.I;
            }
            zwVar = new zw(ojVar, iu0Var, kj1Var, z, list, this.d);
        }
        this.l = zwVar;
        return zwVar;
    }

    public final u55 f(da2 da2Var, long j, w23 w23Var) {
        float min = Math.min(w23Var.a.c(), w23Var.d);
        oj ojVar = this.a;
        m65 m65Var = this.k;
        List list = this.g;
        if (list == null) {
            list = o91.I;
        }
        int i = this.e;
        boolean z = this.d;
        int i2 = this.c;
        iu0 iu0Var = this.j;
        iu0Var.getClass();
        return new u55(new t55(ojVar, m65Var, list, i, z, i2, iu0Var, da2Var, this.b, j), w23Var, eh0.d(j, (qi4.b(min) << 32) | (qi4.b(w23Var.e) & 4294967295L)));
    }

    public final void g(oj ojVar, m65 m65Var, kj1 kj1Var, int i, boolean z, int i2, int i3, List list) {
        this.a = ojVar;
        boolean d = m65Var.d(this.k);
        this.k = m65Var;
        if (!d) {
            this.q <<= 2;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
        this.b = kj1Var;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.q = (this.q << 2) | 2;
        this.l = null;
        this.n = null;
        this.p = -1;
        this.o = -1;
    }

    public final String toString() {
        t55 t55Var;
        Object obj = "null";
        String str = this.n != null ? "<TextLayoutResult>" : "null";
        String b = u02.b(this.i);
        long j = this.q;
        u55 u55Var = this.n;
        if (u55Var != null && (t55Var = u55Var.a) != null) {
            obj = new dh0(t55Var.j);
        }
        StringBuilder F = r7.F("MultiParagraphLayoutCache(textLayoutResult=", str, ", lastDensity=", b, ", history=");
        F.append(j);
        F.append(", constraints=");
        F.append(obj);
        F.append(")");
        return F.toString();
    }
}
