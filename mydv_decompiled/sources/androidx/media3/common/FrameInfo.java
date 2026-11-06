package androidx.media3.common;

import defpackage.sp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class FrameInfo {
    public final Format format;
    public final long offsetToAddUs;

    public FrameInfo(Format format, long j) {
        sp0.p(format.colorInfo != null, "format colorInfo must be set");
        int i = format.width;
        sp0.m(i, "format width must be positive, but is: %s", i > 0);
        int i2 = format.height;
        sp0.m(i2, "format height must be positive, but is: %s", i2 > 0);
        this.format = format;
        this.offsetToAddUs = j;
    }
}
