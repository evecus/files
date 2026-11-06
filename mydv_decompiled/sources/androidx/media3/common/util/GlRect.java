package androidx.media3.common.util;

import defpackage.sp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class GlRect {
    public int bottom;
    public int left;
    public int right;
    public int top;

    public GlRect(int i, int i2, int i3, int i4) {
        sp0.o(i <= i3 && i2 <= i4);
        this.left = i;
        this.bottom = i2;
        this.right = i3;
        this.top = i4;
    }

    public GlRect(int i, int i2) {
        this(0, 0, i, i2);
    }
}
