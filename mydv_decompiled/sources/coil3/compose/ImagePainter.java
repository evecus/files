package coil3.compose;

import coil3.Image;
import defpackage.ep;
import defpackage.pn;
import defpackage.r7;
import defpackage.rj3;
import defpackage.y31;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ImagePainter extends rj3 {
    public static final int $stable = rj3.$stable;
    private final Image image;

    public ImagePainter(Image image) {
        this.image = image;
    }

    public final Image getImage() {
        return this.image;
    }

    @Override // defpackage.rj3
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo43getIntrinsicSizeNHjbRc() {
        int width = this.image.getWidth();
        float f = width > 0 ? width : Float.NaN;
        return (Float.floatToRawIntBits(this.image.getHeight() > 0 ? r6 : Float.NaN) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    @Override // defpackage.rj3
    public void onDraw(y31 y31Var) {
        int width = this.image.getWidth();
        float intBitsToFloat = width > 0 ? Float.intBitsToFloat((int) (y31Var.c() >> 32)) / width : 1.0f;
        int height = this.image.getHeight();
        float intBitsToFloat2 = height > 0 ? Float.intBitsToFloat((int) (y31Var.c() & 4294967295L)) / height : 1.0f;
        pn S = y31Var.S();
        long H = S.H();
        S.q().f();
        try {
            ((ep) S.b).H(intBitsToFloat, intBitsToFloat2, 0L);
            this.image.draw(ImagePainter_androidKt.getNativeCanvas(y31Var.S().q()));
        } finally {
            r7.H(S, H);
        }
    }
}
