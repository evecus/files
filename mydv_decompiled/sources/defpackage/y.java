package defpackage;

/* loaded from: classes2.dex */
public final class y extends d1 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Class cls, byte b) {
        super(cls);
        this.c = b;
    }

    @Override // defpackage.d1
    public u0 h(x0 x0Var) {
        switch (this.c) {
            case 1:
                return x0Var.A();
            case 4:
                return x0Var.B();
            case 12:
                throw new IllegalStateException("unexpected implicit constructed encoding");
            case 14:
                return x0Var.C();
            case 17:
                return x0Var;
            case 18:
                return x0Var.D();
            default:
                return super.h(x0Var);
        }
    }

    @Override // defpackage.d1
    public u0 i(mn0 mn0Var) {
        switch (this.c) {
            case 0:
                return new cn0(mn0Var.I);
            case 1:
                return a0.v(mn0Var.I);
            case 2:
                byte[] bArr = mn0Var.I;
                if (bArr.length == 1) {
                    byte b = bArr[0];
                    return b == 0 ? c0.K : b == -1 ? c0.L : new c0(b);
                }
                s83.t("BOOLEAN value should have 1 byte in it");
                return null;
            case 3:
                byte[] bArr2 = mn0Var.I;
                int length = bArr2.length;
                if (length > 1) {
                    return new g0(bArr2);
                }
                if (length == 0) {
                    s83.t("ENUMERATED has zero length");
                    return null;
                }
                int i = bArr2[0] & 255;
                if (i >= 16) {
                    return new g0(bArr2);
                }
                g0[] g0VarArr = g0.K;
                g0 g0Var = g0VarArr[i];
                if (g0Var != null) {
                    return g0Var;
                }
                g0 g0Var2 = new g0(bArr2);
                g0VarArr[i] = g0Var2;
                return g0Var2;
            case 4:
            case 17:
            case 18:
            default:
                return super.i(mn0Var);
            case 5:
                return new gn0(mn0Var.I);
            case 6:
                return i0.x(mn0Var.I);
            case 7:
                return new in0(mn0Var.I);
            case 8:
                return new jn0(mn0Var.I);
            case 9:
                return new l0(mn0Var.I);
            case 10:
                if (mn0Var.I.length == 0) {
                    return kn0.J;
                }
                zy.i("malformed NULL encoding encountered");
                return null;
            case 11:
                return new ln0(mn0Var.I);
            case 12:
                return new o0(new in0(mn0Var.I));
            case 13:
                byte[] bArr3 = mn0Var.I;
                int length2 = bArr3.length;
                q0.w(length2);
                return q0.x(bArr3, length2, false);
            case 14:
                return mn0Var;
            case 15:
                return new on0(mn0Var.I);
            case 16:
                byte[] bArr4 = mn0Var.I;
                int length3 = bArr4.length;
                if (length3 <= 4096) {
                    return v0.v(bArr4, length3, false);
                }
                s83.t("exceeded relative OID contents length limit");
                return null;
            case 19:
                return new rn0(mn0Var.I);
            case 20:
                return c1.v(mn0Var.I);
            case 21:
                return new sn0(mn0Var.I);
            case 22:
                return new tn0(mn0Var.I);
            case 23:
                return new un0(mn0Var.I);
            case 24:
                return new vn0(mn0Var.I);
        }
    }
}
