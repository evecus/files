package defpackage;

/* loaded from: classes2.dex */
public final class i84 extends g82 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i84(int i) {
        super(i);
        if (i == 128 || i == 256) {
        } else {
            s83.t(r7.z("'bitStrength' ", i, " not supported for SHAKE"));
            throw null;
        }
    }

    @Override // defpackage.xw0
    public final int a(int i, byte[] bArr) {
        int i2 = this.e / 4;
        k(bArr, i, i2);
        i(this.e);
        return i2;
    }

    @Override // defpackage.xw0
    public final String c() {
        return "SHAKE" + this.e;
    }

    @Override // defpackage.g82, defpackage.xw0
    public final int d() {
        return this.e / 4;
    }

    @Override // defpackage.g82
    public final l95 h() {
        c();
        return new l95();
    }

    public final void k(byte[] bArr, int i, int i2) {
        if (!this.f) {
            g(15, 4);
        }
        j(bArr, i, i2 * 8);
    }
}
