package coil3.size;

import coil3.size.Dimension;
import defpackage.rm1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class DimensionKt {
    public static final int Dimension(int i) {
        return Dimension.Pixels.m111constructorimpl(i);
    }

    public static final int pxOrElse(Dimension dimension, rm1 rm1Var) {
        return dimension instanceof Dimension.Pixels ? ((Dimension.Pixels) dimension).m116unboximpl() : ((Number) rm1Var.invoke()).intValue();
    }
}
