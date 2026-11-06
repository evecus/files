package defpackage;

import java.io.InputStream;

/* loaded from: classes2.dex */
public abstract class jj2 extends InputStream {
    public final InputStream I;
    public final int J;

    public jj2(InputStream inputStream, int i) {
        this.I = inputStream;
        this.J = i;
    }

    public final void e() {
        InputStream inputStream = this.I;
        if (inputStream instanceof az1) {
            az1 az1Var = (az1) inputStream;
            az1Var.N = true;
            az1Var.g();
        }
    }
}
