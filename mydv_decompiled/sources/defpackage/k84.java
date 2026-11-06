package defpackage;

import java.util.Arrays;
import javax.security.auth.Destroyable;

/* loaded from: classes2.dex */
public final class k84 extends jq implements Destroyable {
    public final bu J;
    public final bu K;
    public volatile boolean L;

    public k84(j84 j84Var, byte[] bArr) {
        super(true);
        int f = j84Var.a.f();
        int i = f * 4;
        if (bArr.length != i) {
            s83.t("private key encoding does not match parameters");
            throw null;
        }
        int i2 = f * 2;
        this.J = new bu(g4.x(bArr, 0, f), g4.x(bArr, f, i2), (byte) 3);
        int i3 = f * 3;
        this.K = new bu(g4.x(bArr, i2, i3), g4.x(bArr, i3, i), (byte) 2);
    }

    @Override // javax.security.auth.Destroyable
    public final synchronized void destroy() {
        if (!this.L) {
            this.L = true;
            Arrays.fill(this.J.b, (byte) 0);
            Arrays.fill(this.J.c, (byte) 0);
            Arrays.fill(this.K.b, (byte) 0);
            Arrays.fill(this.K.c, (byte) 0);
        }
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.L;
    }
}
