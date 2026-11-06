package defpackage;

import java.io.InputStream;

/* loaded from: classes2.dex */
public final class ys implements s0 {
    public final /* synthetic */ byte I = 1;
    public Object J;

    public ys(a1 a1Var) {
        this.J = a1Var;
    }

    @Override // defpackage.s0
    public final InputStream c() {
        switch (this.I) {
            case 0:
                return new jh0((a1) this.J);
            default:
                return (nt0) this.J;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        defpackage.j0.i(r3.getMessage(), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x000b, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x000c, code lost:
    
        defpackage.j0.i(r3.getMessage(), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r3 = move-exception;
     */
    @Override // defpackage.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.u0 d() {
        /*
            r3 = this;
            byte r0 = r3.I
            r1 = 0
            switch(r0) {
                case 0: goto L14;
                default: goto L6;
            }
        L6:
            u0 r1 = r3.j()     // Catch: java.io.IOException -> Lb
            goto L13
        Lb:
            r3 = move-exception
            java.lang.String r0 = r3.getMessage()
            defpackage.j0.i(r0, r3)
        L13:
            return r1
        L14:
            java.lang.Object r3 = r3.J     // Catch: java.io.IOException -> L28
            a1 r3 = (defpackage.a1) r3     // Catch: java.io.IOException -> L28
            xs r0 = new xs     // Catch: java.io.IOException -> L28
            jh0 r2 = new jh0     // Catch: java.io.IOException -> L28
            r2.<init>(r3)     // Catch: java.io.IOException -> L28
            byte[] r3 = defpackage.fb4.P(r2)     // Catch: java.io.IOException -> L28
            r0.<init>(r3, r1)     // Catch: java.io.IOException -> L28
            r1 = r0
            goto L30
        L28:
            r3 = move-exception
            java.lang.String r0 = r3.getMessage()
            defpackage.j0.i(r0, r3)
        L30:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ys.d():u0");
    }

    @Override // defpackage.uy1
    public final u0 j() {
        switch (this.I) {
            case 0:
                return new xs(fb4.P(new jh0((a1) this.J)), null);
            default:
                return new mn0(((nt0) this.J).t());
        }
    }

    public /* synthetic */ ys() {
    }
}
