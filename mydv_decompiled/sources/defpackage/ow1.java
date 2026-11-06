package defpackage;

import androidx.media3.exoplayer.RendererCapabilities;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class ow1 {
    public static final l13 a = nq4.k(i13.a, qi4.b);

    public static final void a(hx1 hx1Var, String str, l13 l13Var, long j, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-126890956);
        if ((i & 6) == 0) {
            i2 = (go1Var.g(hx1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.g(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.g(l13Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var.f(j) ? 2048 : 1024;
        }
        if (go1Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            go1Var.Y();
            if ((i & 1) != 0 && !go1Var.C()) {
                go1Var.W();
            }
            go1Var.r();
            b(ad4.y(hx1Var, go1Var), str, l13Var, j, go1Var, (i2 & 112) | 8 | (i2 & 896) | (i2 & 7168));
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new mw1(hx1Var, str, l13Var, j, i, (byte) 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0121, code lost:
    
        if (java.lang.Float.isInfinite(java.lang.Float.intBitsToFloat((int) (r3 & 4294967295L))) != false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.rj3 r16, java.lang.String r17, defpackage.l13 r18, long r19, defpackage.fe0 r21, int r22) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ow1.b(rj3, java.lang.String, l13, long, fe0, int):void");
    }
}
