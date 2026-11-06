package coil3.size;

import coil3.size.Dimension;
import defpackage.j42;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class SizeKt {
    public static final Size Size(int i, int i2) {
        return new Size(Dimension.Pixels.m110boximpl(DimensionKt.Dimension(i)), Dimension.Pixels.m110boximpl(DimensionKt.Dimension(i2)));
    }

    public static final boolean isOriginal(Size size) {
        return j42.c(size, Size.ORIGINAL);
    }

    public static final Size Size(Dimension dimension, int i) {
        return new Size(dimension, Dimension.Pixels.m110boximpl(DimensionKt.Dimension(i)));
    }

    public static final Size Size(int i, Dimension dimension) {
        return new Size(Dimension.Pixels.m110boximpl(DimensionKt.Dimension(i)), dimension);
    }
}
