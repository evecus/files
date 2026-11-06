package defpackage;

import coil3.network.internal.UtilsKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vc4 extends k63 {
    public final iy3 f;

    public vc4(iy3 iy3Var) {
        super(9979);
        this.f = iy3Var;
    }

    @Override // defpackage.k63
    public final h63 d(e63 e63Var) {
        return (j42.c(e63Var.f, "/") || j42.c(e63Var.f, "/search")) ? (h63) this.f.invoke() : k63.b(UtilsKt.MIME_TYPE_TEXT_PLAIN, 16, "404");
    }
}
