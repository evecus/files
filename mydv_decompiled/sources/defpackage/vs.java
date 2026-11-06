package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class vs implements b0 {
    public final a1 I;
    public ih0 J;

    public vs(a1 a1Var) {
        this.I = a1Var;
    }

    public static us a(a1 a1Var) {
        ih0 ih0Var = new ih0(a1Var);
        return new us(fb4.P(ih0Var), ih0Var.K);
    }

    @Override // defpackage.e0
    public final u0 d() {
        try {
            return a(this.I);
        } catch (IOException e) {
            j0.i(e.getMessage(), e);
            return null;
        }
    }

    @Override // defpackage.b0
    public final InputStream f() {
        ih0 ih0Var = new ih0(this.I);
        this.J = ih0Var;
        return ih0Var;
    }

    @Override // defpackage.b0
    public final int h() {
        return this.J.K;
    }

    @Override // defpackage.uy1
    public final u0 j() {
        return a(this.I);
    }
}
