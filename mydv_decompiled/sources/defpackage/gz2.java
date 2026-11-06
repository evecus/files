package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gz2 implements ra4 {
    public final s3 a;
    public final ce5 b;
    public final oc1 c;

    public gz2(ce5 ce5Var, oc1 oc1Var, s3 s3Var) {
        this.b = ce5Var;
        oc1Var.getClass();
        this.c = oc1Var;
        this.a = s3Var;
    }

    @Override // defpackage.ra4
    public final void a(Object obj) {
        this.b.getClass();
        ((bp1) obj).unknownFields.e = false;
        this.c.getClass();
        r7.K(obj);
        throw null;
    }

    @Override // defpackage.ra4
    public final boolean b(Object obj) {
        this.c.getClass();
        r7.K(obj);
        throw null;
    }

    @Override // defpackage.ra4
    public final Object c() {
        return ((xo1) ((bp1) this.a).d(5)).b();
    }

    @Override // defpackage.ra4
    public final boolean d(bp1 bp1Var, bp1 bp1Var2) {
        this.b.getClass();
        return bp1Var.unknownFields.equals(bp1Var2.unknownFields);
    }

    @Override // defpackage.ra4
    public final int e(bp1 bp1Var) {
        this.b.getClass();
        return bp1Var.unknownFields.hashCode();
    }

    @Override // defpackage.ra4
    public final void f(bp1 bp1Var, bp1 bp1Var2) {
        ta4.w(this.b, bp1Var, bp1Var2);
    }

    @Override // defpackage.ra4
    public final void g(Object obj, h60 h60Var, mc1 mc1Var) {
        this.b.getClass();
        bp1 bp1Var = (bp1) obj;
        if (bp1Var.unknownFields == ae5.f) {
            bp1Var.unknownFields = ae5.b();
        }
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.ra4
    public final int h(s3 s3Var) {
        this.b.getClass();
        ae5 ae5Var = ((bp1) s3Var).unknownFields;
        int i = ae5Var.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < ae5Var.a; i3++) {
            int i4 = ae5Var.b[i3] >>> 3;
            i2 += i70.f(3, (f00) ae5Var.c[i3]) + i70.n(i4) + i70.m(2) + (i70.m(1) * 2);
        }
        ae5Var.d = i2;
        return i2;
    }

    @Override // defpackage.ra4
    public final void i(uu2 uu2Var, Object obj) {
        this.c.getClass();
        r7.K(obj);
        throw null;
    }
}
