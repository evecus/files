package defpackage;

import javax.security.auth.Destroyable;

/* loaded from: classes2.dex */
public final class j00 extends jq implements Destroyable {
    public final /* synthetic */ byte J = 0;
    public final byte[] K;
    public volatile boolean L;

    public j00(pm1 pm1Var, byte[] bArr) {
        super(true);
        int length = bArr.length;
        boolean z = pm1Var.c;
        short s = pm1Var.a;
        int i = (pm1Var.b * 64) / 8;
        if (length == (16 * s) + i + ((s * 128) / 8) + 16 + i) {
            this.K = g4.s(bArr);
        } else {
            s83.t("'privateKey' has invalid length");
            throw null;
        }
    }

    private final synchronized void a() {
        if (!this.L) {
            this.L = true;
            g4.q(this.K);
        }
    }

    private final synchronized void b() {
        if (!this.L) {
            this.L = true;
            g4.q(this.K);
        }
    }

    @Override // javax.security.auth.Destroyable
    public final synchronized void destroy() {
        switch (this.J) {
            case 0:
                a();
                break;
            default:
                b();
                break;
        }
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        switch (this.J) {
        }
        return this.L;
    }

    public j00(i00 i00Var, byte[] bArr) {
        super(true);
        int length = bArr.length;
        i00Var.getClass();
        if (length == (i00Var.a / 8) + (i00Var.b * 2) + 12800 + 40) {
            this.K = g4.s(bArr);
        } else {
            s83.t("'privateKey' has invalid length");
            throw null;
        }
    }
}
