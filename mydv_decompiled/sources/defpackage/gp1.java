package defpackage;

import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gp1 {
    public static final gp1 g;
    public final int[] a;
    public final int[] b;
    public final hp1 c;
    public final short d;
    public final short e;
    public final boolean f;

    static {
        new gp1(4201, 4096, 1);
        new gp1(AnalyticsListener.EVENT_RENDERER_READY_CHANGED, 1024, 1);
        new gp1(67, 64, 1);
        new gp1(19, 16, 1);
        g = new gp1(285, 256, 0);
        new gp1(301, 256, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gp1(int i, int i2, int i3) {
        this.e = i;
        this.d = i2;
        this.f = i3;
        this.a = new int[i2];
        this.b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.a[i5] = i4;
            i4 *= 2;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.b[this.a[i6]] = i6;
        }
        this.c = new hp1(this, new int[]{0});
    }

    public final int a(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.b;
        return this.a[(iArr[i] + iArr[i2]) % (this.d - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.e));
        sb.append(',');
        return hf1.y(sb, this.d, ')');
    }
}
