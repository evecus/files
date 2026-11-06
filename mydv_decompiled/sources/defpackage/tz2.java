package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class tz2 extends k13 implements ye0, na2 {
    public LinkedHashMap I;

    @Override // defpackage.na2
    public final /* synthetic */ int maxIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.i(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    public final /* synthetic */ int maxIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.l(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        float f = ((r11) j42.r(this, i32.c)).I;
        if (f < 0.0f) {
            f = 0.0f;
        }
        bn3 u = pw2Var.u(j);
        boolean z = isAttached() && !Float.isNaN(f) && r11.b(f, 0.0f) > 0;
        int X = !Float.isNaN(f) ? ww2Var.X(f) : 0;
        int i = u.I;
        if (z) {
            i = Math.max(i, X);
        }
        int i2 = u.J;
        if (z) {
            i2 = Math.max(i2, X);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.I;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.I = linkedHashMap;
            }
            xi5 xi5Var = i32.b;
            int round = Math.round((X - u.I) / 2.0f);
            if (round < 0) {
                round = 0;
            }
            linkedHashMap.put(xi5Var, Integer.valueOf(round));
            dv1 dv1Var = i32.a;
            int round2 = Math.round((X - u.J) / 2.0f);
            linkedHashMap.put(dv1Var, Integer.valueOf(round2 >= 0 ? round2 : 0));
        }
        Map map = this.I;
        if (map == null) {
            map = p91.I;
        }
        return ww2Var.A(i, i2, map, new sz2(i, i2, u));
    }

    @Override // defpackage.na2
    public final /* synthetic */ int minIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.o(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    public final /* synthetic */ int minIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.r(this, b42Var, a42Var, i);
    }
}
