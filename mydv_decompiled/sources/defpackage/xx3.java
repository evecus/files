package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class xx3 {
    public final eh2 a;

    public xx3(rm1 rm1Var) {
        this.a = new eh2(rm1Var);
    }

    public ay3 a(Object obj) {
        return new ay3(this, obj, obj == null, null, null, true);
    }

    public dh5 b() {
        return this.a;
    }

    public final ay3 c(tm1 tm1Var) {
        return new ay3(this, null, false, null, tm1Var, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0032, code lost:
    
        if (r2 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0034, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0040, code lost:
    
        if (r2 == r1) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dh5 d(defpackage.ay3 r3, defpackage.dh5 r4) {
        /*
            r2 = this;
            boolean r2 = r4 instanceof defpackage.m51
            r0 = 0
            if (r2 == 0) goto L16
            boolean r2 = r3.e
            if (r2 == 0) goto L43
            r0 = r4
            m51 r0 = (defpackage.m51) r0
            jk3 r2 = r0.a
            java.lang.Object r4 = r3.a()
            r2.setValue(r4)
            goto L43
        L16:
            boolean r2 = r4 instanceof defpackage.qw4
            if (r2 == 0) goto L36
            boolean r2 = r3.b
            if (r2 != 0) goto L22
            java.lang.Object r2 = r3.f
            if (r2 == 0) goto L43
        L22:
            boolean r2 = r3.e
            if (r2 != 0) goto L43
            java.lang.Object r2 = r3.a()
            qw4 r4 = (defpackage.qw4) r4
            java.lang.Object r1 = r4.a
            boolean r2 = defpackage.j42.c(r2, r1)
            if (r2 == 0) goto L43
        L34:
            r0 = r4
            goto L43
        L36:
            boolean r2 = r4 instanceof defpackage.nf0
            if (r2 == 0) goto L43
            tm1 r2 = r3.d
            nf0 r4 = (defpackage.nf0) r4
            tm1 r1 = r4.a
            if (r2 != r1) goto L43
            goto L34
        L43:
            if (r0 != 0) goto L70
            boolean r2 = r3.e
            if (r2 == 0) goto L5c
            m51 r2 = new m51
            java.lang.Object r4 = r3.f
            q8 r3 = r3.c
            if (r3 != 0) goto L53
            q8 r3 = defpackage.q8.B0
        L53:
            jk3 r0 = new jk3
            r0.<init>(r4, r3)
            r2.<init>(r0)
            return r2
        L5c:
            tm1 r2 = r3.d
            if (r2 == 0) goto L66
            nf0 r3 = new nf0
            r3.<init>(r2)
            return r3
        L66:
            qw4 r2 = new qw4
            java.lang.Object r3 = r3.a()
            r2.<init>(r3)
            return r2
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xx3.d(ay3, dh5):dh5");
    }
}
