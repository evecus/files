package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class n25 extends q13 {
    public final oj a;
    public final m65 b;
    public final kj1 c;
    public final tm1 d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final List i;
    public final tm1 j;
    public final g80 k;
    public final tm1 l;

    public n25(oj ojVar, m65 m65Var, kj1 kj1Var, tm1 tm1Var, int i, boolean z, int i2, int i3, List list, tm1 tm1Var2, g80 g80Var, tm1 tm1Var3) {
        this.a = ojVar;
        this.b = m65Var;
        this.c = kj1Var;
        this.d = tm1Var;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = list;
        this.j = tm1Var2;
        this.k = g80Var;
        this.l = tm1Var3;
    }

    @Override // defpackage.q13
    public final k13 create() {
        q25 q25Var = new q25();
        q25Var.I = this.a;
        q25Var.J = this.b;
        q25Var.K = this.c;
        q25Var.L = this.d;
        q25Var.M = this.e;
        q25Var.N = this.f;
        q25Var.O = this.g;
        q25Var.P = this.h;
        q25Var.Q = this.i;
        q25Var.R = this.j;
        q25Var.S = this.k;
        q25Var.T = this.l;
        return q25Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n25)) {
            return false;
        }
        n25 n25Var = (n25) obj;
        return j42.c(this.k, n25Var.k) && j42.c(this.a, n25Var.a) && j42.c(this.b, n25Var.b) && j42.c(this.i, n25Var.i) && j42.c(this.c, n25Var.c) && this.d == n25Var.d && this.l == n25Var.l && this.e == n25Var.e && this.f == n25Var.f && this.g == n25Var.g && this.h == n25Var.h && this.j == n25Var.j;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + nt3.j(this.b, this.a.hashCode() * 31, 31)) * 31;
        tm1 tm1Var = this.d;
        int hashCode2 = (((((((((hashCode + (tm1Var != null ? tm1Var.hashCode() : 0)) * 31) + this.e) * 31) + (this.f ? 1231 : 1237)) * 31) + this.g) * 31) + this.h) * 31;
        List list = this.i;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        tm1 tm1Var2 = this.j;
        int hashCode4 = (hashCode3 + (tm1Var2 != null ? tm1Var2.hashCode() : 0)) * 961;
        g80 g80Var = this.k;
        int hashCode5 = (hashCode4 + (g80Var != null ? g80Var.hashCode() : 0)) * 31;
        tm1 tm1Var3 = this.l;
        return hashCode5 + (tm1Var3 != null ? tm1Var3.hashCode() : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r5.a.b(r2.a) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    @Override // defpackage.q13
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void update(defpackage.k13 r19) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n25.update(k13):void");
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
    }
}
