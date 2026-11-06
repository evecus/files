package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public class dt implements e0, uy1 {
    public final int I;
    public final int J;
    public final a1 K;

    public dt(int i, int i2, a1 a1Var) {
        this.I = i;
        this.J = i2;
        this.K = a1Var;
    }

    @Override // defpackage.e0
    public final u0 d() {
        try {
            return j();
        } catch (IOException e) {
            throw new t0(e.getMessage(), (byte) 0);
        }
    }

    public u0 j() {
        return this.K.l(this.I, this.J);
    }
}
