package defpackage;

import java.io.Serializable;
import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class g00 implements Iterable, Serializable {
    public static final e00 J = new e00(p32.b);
    public static final n84 K;
    public int I;

    static {
        K = s9.a() ? new n84((byte) 21) : new n84((byte) 19);
    }

    public static int d(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            zy.o(r7.z("Beginning index: ", i, " < 0"));
            return 0;
        }
        if (i2 < i) {
            zy.o(r7.x(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        zy.o(r7.x(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public static e00 e(byte[] bArr, int i, int i2) {
        d(i, i + i2, bArr.length);
        return new e00(K.i(bArr, i, i2));
    }

    public abstract byte c(int i);

    public abstract void f(int i, byte[] bArr);

    public final int hashCode() {
        int i = this.I;
        if (i != 0) {
            return i;
        }
        int size = size();
        e00 e00Var = (e00) this;
        int h = e00Var.h();
        int i2 = size;
        for (int i3 = h; i3 < h + size; i3++) {
            i2 = (i2 * 31) + e00Var.L[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.I = i2;
        return i2;
    }

    public abstract int size();

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = kb4.p(this);
        } else {
            e00 e00Var = (e00) this;
            int d = d(0, 47, e00Var.size());
            concat = kb4.p(d == 0 ? J : new d00(e00Var.L, e00Var.h(), d)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return hf1.z(sb, concat, "\">");
    }
}
