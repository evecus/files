package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class mg5 {
    public static final eg5 a;

    static {
        a = (t9.a == null || t9.b) ? hg5.i != null ? new hg5((byte) 1) : new eg5((byte) 1) : new eg5((byte) 0);
    }

    public static int a(int i, String str) {
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(str, i) < 65536) {
                        throw new jg5(r7.x(i, length, "Unpaired surrogate at index ", " of "));
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }
}
