package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fb2 implements vw2 {
    public final /* synthetic */ vw2 a;
    public final /* synthetic */ kb2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ vw2 d;

    public fb2(vw2 vw2Var, kb2 kb2Var, int i, vw2 vw2Var2) {
        this.b = kb2Var;
        this.c = i;
        this.d = vw2Var2;
        this.a = vw2Var;
    }

    @Override // defpackage.vw2
    public final Map a() {
        return this.a.a();
    }

    @Override // defpackage.vw2
    public final void b() {
        int i;
        int i2 = this.c;
        kb2 kb2Var = this.b;
        kb2Var.M = i2;
        this.d.b();
        b53 b53Var = kb2Var.U;
        n43 n43Var = kb2Var.T;
        long[] jArr = n43Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            Object obj = n43Var.b[i7];
                            uy4 uy4Var = (uy4) n43Var.c[i7];
                            int j2 = b53Var.j(obj);
                            if (j2 < 0 || j2 >= kb2Var.M) {
                                if (j2 >= 0) {
                                    Object obj2 = i42.p;
                                    i = i4;
                                    Object[] objArr = b53Var.I;
                                    Object obj3 = objArr[j2];
                                    objArr[j2] = obj2;
                                } else {
                                    i = i4;
                                }
                                if (kb2Var.R.b(obj)) {
                                    uy4Var.dispose();
                                }
                                n43Var.l(i7);
                                j >>= i;
                                i6++;
                                i4 = i;
                            }
                        }
                        i = i4;
                        j >>= i;
                        i6++;
                        i4 = i;
                    }
                    if (i5 != i4) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        kb2Var.f(kb2Var.L);
    }

    @Override // defpackage.vw2
    public final tm1 c() {
        return this.a.c();
    }

    @Override // defpackage.vw2
    public final hn1 d() {
        return this.a.d();
    }

    @Override // defpackage.vw2
    public final tm1 e() {
        return this.a.e();
    }

    @Override // defpackage.vw2
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override // defpackage.vw2
    public final int getWidth() {
        return this.a.getWidth();
    }
}
