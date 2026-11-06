package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class ao0 implements b0 {
    public final nt0 I;
    public int J = 0;

    public ao0(nt0 nt0Var) {
        this.I = nt0Var;
    }

    @Override // defpackage.e0
    public final u0 d() {
        try {
            return j();
        } catch (IOException e) {
            j0.i(e.getMessage(), e);
            return null;
        }
    }

    @Override // defpackage.b0
    public final InputStream f() {
        String str;
        nt0 nt0Var = this.I;
        int g = nt0Var.g();
        if (g >= 1) {
            int read = nt0Var.read();
            this.J = read;
            if (read > 0) {
                if (g < 2) {
                    str = "zero length data with non-zero pad bits";
                } else if (read > 7) {
                    str = "pad bits cannot be greater than 7 or less than 0";
                }
            }
            return nt0Var;
        }
        str = "content octets cannot be empty";
        zy.i(str);
        return null;
    }

    @Override // defpackage.b0
    public final int h() {
        return this.J;
    }

    @Override // defpackage.uy1
    public final u0 j() {
        return a0.v(this.I.t());
    }
}
