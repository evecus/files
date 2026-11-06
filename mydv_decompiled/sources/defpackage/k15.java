package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class k15 {
    public int a;
    public ByteBuffer b;
    public int c;
    public int d;

    public k15() {
        if (l95.I == null) {
            l95.I = new l95();
        }
    }

    public final int a(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }
}
