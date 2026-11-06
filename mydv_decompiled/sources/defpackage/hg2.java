package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hg2 implements fe2 {
    public final zg2 a;

    public hg2(zg2 zg2Var) {
        this.a = zg2Var;
    }

    @Override // defpackage.fe2
    public final int a() {
        return this.a.g().l;
    }

    @Override // defpackage.fe2
    public final int b() {
        return ((ug2) o70.a1(this.a.g().m)).a;
    }

    @Override // defpackage.fe2
    public final int c() {
        int i;
        zg2 zg2Var = this.a;
        int i2 = 0;
        if (zg2Var.g().m.isEmpty()) {
            return 0;
        }
        sg2 g = zg2Var.g();
        sg2 sg2Var = tg2.a;
        pg3 pg3Var = g.u;
        long j = g.n;
        pg3 pg3Var2 = pg3.I;
        int i3 = pg3Var == pg3Var2 ? (int) (j & 4294967295L) : (int) (j >> 32);
        sg2 g2 = zg2Var.g();
        List list = g2.m;
        if (!list.isEmpty()) {
            int size = list.size();
            int i4 = 0;
            while (i2 < size) {
                ug2 ug2Var = (ug2) list.get(i2);
                i4 += (int) (g2.u == pg3Var2 ? ug2Var.q & 4294967295L : ug2Var.q >> 32);
                i2++;
            }
            i2 = (i4 / list.size()) + g2.s;
        }
        if (i2 != 0 && (i = i3 / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.fe2
    public final boolean d() {
        return !this.a.g().m.isEmpty();
    }

    @Override // defpackage.fe2
    public final int e() {
        return this.a.c.c.h();
    }
}
