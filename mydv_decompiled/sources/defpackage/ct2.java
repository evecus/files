package defpackage;

/* loaded from: classes2.dex */
public final class ct2 extends zs2 {
    public final byte[] K;
    public final byte[] L;

    public ct2(at2 at2Var, byte[] bArr, byte[] bArr2) {
        super(false, at2Var);
        ys2 ys2Var = ys2.g[at2Var.b - 2];
        if (bArr.length != ys2Var.c) {
            s83.t("'t' has invalid length");
            throw null;
        }
        if (bArr2.length != 32) {
            s83.t("'rho' has invalid length");
            throw null;
        }
        byte[] s = g4.s(bArr);
        this.K = s;
        this.L = g4.s(bArr2);
        if (ys2Var.a(s)) {
            return;
        }
        s83.t("Modulus check failed for ML-KEM public key");
        throw null;
    }

    public ct2(at2 at2Var, byte[] bArr) {
        super(false, at2Var);
        ys2 ys2Var = ys2.g[at2Var.b - 2];
        if (bArr.length != ys2Var.e) {
            s83.t("'encoding' has invalid length");
            throw null;
        }
        byte[] x = g4.x(bArr, 0, bArr.length - 32);
        this.K = x;
        this.L = g4.x(bArr, bArr.length - 32, bArr.length);
        if (ys2Var.a(x)) {
            return;
        }
        s83.t("Modulus check failed for ML-KEM public key");
        throw null;
    }
}
