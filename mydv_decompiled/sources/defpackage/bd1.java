package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bd1 {
    public final lq1 a;
    public final lq1 b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ bd1(defpackage.lq1 r2, int r3) {
        /*
            r1 = this;
            r3 = r3 & 2
            jq1 r0 = defpackage.jq1.a
            if (r3 == 0) goto L7
            r2 = r0
        L7:
            r1.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bd1.<init>(lq1, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd1)) {
            return false;
        }
        bd1 bd1Var = (bd1) obj;
        return j42.c(this.a, bd1Var.a) && j42.c(this.b, bd1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExtractedSizeAndCornerModifiers(sizeAndCornerModifiers=" + this.a + ", nonSizeOrCornerModifiers=" + this.b + ')';
    }

    public bd1(lq1 lq1Var, lq1 lq1Var2) {
        this.a = lq1Var;
        this.b = lq1Var2;
    }
}
