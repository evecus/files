package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class l65 {
    public final i80 a;
    public final p65 b;
    public final pk1 c;
    public final lj1 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l65(defpackage.i80 r3, defpackage.p65 r4, defpackage.pk1 r5, defpackage.lj1 r6, int r7) {
        /*
            r2 = this;
            r0 = r7 & 1
            if (r0 == 0) goto L8
            ze1 r3 = defpackage.o35.a
            ze1 r3 = defpackage.o35.a
        L8:
            r0 = r7 & 2
            r1 = 0
            if (r0 == 0) goto Le
            r4 = r1
        Le:
            r0 = r7 & 4
            if (r0 == 0) goto L13
            r5 = r1
        L13:
            r7 = r7 & 64
            if (r7 == 0) goto L18
            r6 = r1
        L18:
            r2.<init>(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l65.<init>(i80, p65, pk1, lj1, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l65)) {
            return false;
        }
        l65 l65Var = (l65) obj;
        return j42.c(this.a, l65Var.a) && j42.c(this.b, l65Var.b) && j42.c(this.c, l65Var.c) && j42.c(this.d, l65Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        p65 p65Var = this.b;
        int Q = (hashCode + (p65Var != null ? i82.Q(p65Var.a) : 0)) * 31;
        pk1 pk1Var = this.c;
        int i = (Q + (pk1Var != null ? pk1Var.a : (short) 0)) * 923521;
        lj1 lj1Var = this.d;
        return i + (lj1Var != null ? lj1Var.hashCode() : 0);
    }

    public final String toString() {
        return "TextStyle(color=" + this.a + ", fontSize=" + this.b + ", fontWeight=" + this.c + ", fontStyle=null, textDecoration=null, textAlign=null, fontFamily=" + this.d + ')';
    }

    public l65(i80 i80Var, p65 p65Var, pk1 pk1Var, lj1 lj1Var) {
        this.a = i80Var;
        this.b = p65Var;
        this.c = pk1Var;
        this.d = lj1Var;
    }
}
