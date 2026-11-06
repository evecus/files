package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ec5 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final mc3 b;
    public volatile int c = 0;

    public ec5(mc3 mc3Var, int i) {
        this.b = mc3Var;
        this.a = i;
    }

    public final int a(int i) {
        hz2 b = b();
        int a = b.a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = b.b;
        int i2 = a + b.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final hz2 b() {
        ThreadLocal threadLocal = d;
        hz2 hz2Var = (hz2) threadLocal.get();
        if (hz2Var == null) {
            hz2Var = new hz2();
            threadLocal.set(hz2Var);
        }
        iz2 iz2Var = (iz2) this.b.a;
        int a = iz2Var.a(6);
        if (a != 0) {
            int i = a + iz2Var.a;
            int i2 = (this.a * 4) + iz2Var.b.getInt(i) + i + 4;
            int i3 = iz2Var.b.getInt(i2) + i2;
            ByteBuffer byteBuffer = iz2Var.b;
            hz2Var.b = byteBuffer;
            if (byteBuffer != null) {
                hz2Var.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                hz2Var.c = i4;
                hz2Var.d = hz2Var.b.getShort(i4);
                return hz2Var;
            }
            hz2Var.a = 0;
            hz2Var.c = 0;
            hz2Var.d = 0;
        }
        return hz2Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        hz2 b = b();
        int a = b.a(4);
        sb.append(Integer.toHexString(a != 0 ? b.b.getInt(a + b.a) : 0));
        sb.append(", codepoints:");
        hz2 b2 = b();
        int a2 = b2.a(16);
        if (a2 != 0) {
            int i2 = a2 + b2.a;
            i = b2.b.getInt(b2.b.getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
