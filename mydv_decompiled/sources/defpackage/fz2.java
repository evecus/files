package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fz2 implements qa4 {
    public final r3 a;
    public final be5 b;
    public final nc1 c;

    public fz2(be5 be5Var, nc1 nc1Var, r3 r3Var) {
        this.b = be5Var;
        nc1Var.getClass();
        this.c = nc1Var;
        this.a = r3Var;
    }

    @Override // defpackage.qa4
    public final void a(Object obj) {
        this.b.getClass();
        zd5 zd5Var = ((ap1) obj).unknownFields;
        if (zd5Var.e) {
            zd5Var.e = false;
        }
        this.c.getClass();
        r7.K(obj);
        throw null;
    }

    @Override // defpackage.qa4
    public final boolean b(Object obj) {
        this.c.getClass();
        r7.K(obj);
        throw null;
    }

    @Override // defpackage.qa4
    public final ap1 c() {
        r3 r3Var = this.a;
        return r3Var instanceof ap1 ? ((ap1) r3Var).i() : ((wo1) ((ap1) r3Var).c(5)).c();
    }

    @Override // defpackage.qa4
    public final void d(Object obj, Object obj2) {
        sa4.k(this.b, obj, obj2);
    }

    @Override // defpackage.qa4
    public final int e(ap1 ap1Var) {
        this.b.getClass();
        zd5 zd5Var = ap1Var.unknownFields;
        int i = zd5Var.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < zd5Var.a; i3++) {
            int i4 = zd5Var.b[i3] >>> 3;
            i2 += j70.a(3, (g00) zd5Var.c[i3]) + j70.f(i4) + j70.e(2) + (j70.e(1) * 2);
        }
        zd5Var.d = i2;
        return i2;
    }

    @Override // defpackage.qa4
    public final int f(ap1 ap1Var) {
        this.b.getClass();
        return ap1Var.unknownFields.hashCode();
    }

    @Override // defpackage.qa4
    public final void g(Object obj, byte[] bArr, int i, int i2, op opVar) {
        ap1 ap1Var = (ap1) obj;
        if (ap1Var.unknownFields == zd5.f) {
            ap1Var.unknownFields = zd5.c();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.qa4
    public final void h(uu2 uu2Var, Object obj) {
        this.c.getClass();
        r7.K(obj);
        throw null;
    }

    @Override // defpackage.qa4
    public final boolean i(ap1 ap1Var, ap1 ap1Var2) {
        this.b.getClass();
        return ap1Var.unknownFields.equals(ap1Var2.unknownFields);
    }

    @Override // defpackage.qa4
    public final void j(Object obj, h60 h60Var, lc1 lc1Var) {
        this.b.getClass();
        be5.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
