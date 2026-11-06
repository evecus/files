package defpackage;

/* loaded from: classes2.dex */
public final class g84 extends g82 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g84(int i) {
        super(i);
        if (i == 224 || i == 256 || i == 384 || i == 512) {
        } else {
            s83.t(r7.z("'bitLength' ", i, " not supported for SHA-3"));
            throw null;
        }
    }

    @Override // defpackage.xw0
    public final int a(int i, byte[] bArr) {
        g(2, 2);
        j(bArr, i, this.e);
        i(this.e);
        return d();
    }

    @Override // defpackage.xw0
    public final String c() {
        return "SHA3-" + this.e;
    }
}
