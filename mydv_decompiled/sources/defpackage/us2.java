package defpackage;

/* loaded from: classes2.dex */
public final class us2 {
    public final i84 a = new i84(256);
    public final short b;
    public final byte c;
    public final byte d;
    public final byte e;
    public final int f;
    public final g12 g;

    public us2(int i) {
        char c;
        int i2 = 4;
        if (i != 2) {
            if (i == 3) {
                this.c = (byte) 6;
                this.d = (byte) 5;
                this.e = (byte) 4;
                this.b = (short) 128;
                i2 = 6;
            } else {
                if (i != 5) {
                    s83.t(r7.z("The mode ", i, "is not supported by Crystals Dilithium!"));
                    throw null;
                }
                i2 = 8;
                this.c = (byte) 8;
                this.d = (byte) 7;
                this.e = (byte) 2;
                this.b = (short) 96;
            }
            c = 0;
        } else {
            this.c = (byte) 4;
            this.d = (byte) 4;
            this.e = (byte) 2;
            this.b = (short) 96;
            c = 0;
        }
        this.g = new g12((byte) 29);
        this.f = (i2 * 320) + 32;
        if (c != 0 && c != 0) {
            throw new RuntimeException("Wrong Dilithium Gamma1!");
        }
    }
}
