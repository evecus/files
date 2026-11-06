package defpackage;

/* loaded from: classes2.dex */
public final class xs2 extends k92 {
    public final byte[] J;

    public xs2(vs2 vs2Var, byte[] bArr) {
        super(false);
        int i;
        char c;
        byte b = vs2Var.a;
        new i84(256);
        if (b != 2) {
            if (b == 3) {
                i = 6;
            } else {
                if (b != 5) {
                    s83.t(r7.z("The mode ", b, "is not supported by Crystals Dilithium!"));
                    throw null;
                }
                i = 8;
            }
            c = 0;
        } else {
            i = 4;
            c = 0;
        }
        new g12((byte) 29);
        if (c != 0 && c != 0) {
            throw new RuntimeException("Wrong Dilithium Gamma1!");
        }
        if (bArr.length != (i * 320) + 32) {
            s83.t("'encoding' has invalid length");
            throw null;
        }
        g4.x(bArr, 0, 32);
        this.J = g4.x(bArr, 32, bArr.length);
    }

    public xs2(byte[] bArr, byte[] bArr2) {
        super(false);
        if (bArr == null) {
            zy.m("rho cannot be null");
            throw null;
        }
        if (bArr2 == null) {
            zy.m("t1 cannot be null");
            throw null;
        }
        g4.s(bArr);
        this.J = g4.s(bArr2);
    }
}
