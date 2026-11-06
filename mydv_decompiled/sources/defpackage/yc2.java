package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yc2 implements fe2 {
    public final wd2 a;

    public yc2(wd2 wd2Var) {
        this.a = wd2Var;
    }

    @Override // defpackage.fe2
    public final int a() {
        return this.a.g().q;
    }

    @Override // defpackage.fe2
    public final int b() {
        return ((md2) o70.a1(this.a.g().n)).a;
    }

    @Override // defpackage.fe2
    public final int c() {
        int i;
        wd2 wd2Var = this.a;
        int i2 = 0;
        if (wd2Var.g().n.isEmpty()) {
            return 0;
        }
        ld2 g = wd2Var.g();
        pg3 pg3Var = g.r;
        pg3 pg3Var2 = pg3.I;
        int g2 = (int) (pg3Var == pg3Var2 ? g.g() & 4294967295L : g.g() >> 32);
        ld2 g3 = wd2Var.g();
        pg3 pg3Var3 = g3.r;
        List list = g3.n;
        boolean z = pg3Var3 == pg3Var2;
        if (!list.isEmpty()) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < list.size()) {
                md2 md2Var = (md2) list.get(i3);
                int i6 = z ? md2Var.s : md2Var.t;
                if (i6 == -1) {
                    i3++;
                } else {
                    int i7 = 0;
                    while (i3 < list.size()) {
                        md2 md2Var2 = (md2) list.get(i3);
                        if ((z ? md2Var2.s : md2Var2.t) != i6) {
                            break;
                        }
                        i7 = Math.max(i7, (int) (z ? ((md2) list.get(i3)).q & 4294967295L : ((md2) list.get(i3)).q >> 32));
                        i3++;
                    }
                    i4 += i7;
                    i5++;
                }
            }
            i2 = (i4 / i5) + g3.t;
        }
        if (i2 != 0 && (i = g2 / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.fe2
    public final boolean d() {
        return !this.a.g().n.isEmpty();
    }

    @Override // defpackage.fe2
    public final int e() {
        return ((gk3) this.a.d.b).h();
    }
}
