package coil3.compose;

import defpackage.c80;
import defpackage.l13;
import defpackage.ni0;
import defpackage.tx;
import defpackage.u8;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public interface SubcomposeAsyncImageScope extends tx {
    @Override // defpackage.tx
    /* synthetic */ l13 align(l13 l13Var, u8 u8Var);

    u8 getAlignment();

    float getAlpha();

    boolean getClipToBounds();

    c80 getColorFilter();

    String getContentDescription();

    ni0 getContentScale();

    AsyncImagePainter getPainter();

    @Override // defpackage.tx
    /* synthetic */ l13 matchParentSize(l13 l13Var);
}
