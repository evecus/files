package okhttp3.internal.idn;

import defpackage.tm1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class IdnaMappingTableKt {
    public static final int binarySearch(int i, int i2, tm1 tm1Var) {
        tm1Var.getClass();
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) / 2;
            int intValue = ((Number) tm1Var.invoke(Integer.valueOf(i4))).intValue();
            if (intValue < 0) {
                i3 = i4 - 1;
            } else {
                if (intValue <= 0) {
                    return i4;
                }
                i = i4 + 1;
            }
        }
        return (-i) - 1;
    }

    public static final int read14BitInt(String str, int i) {
        str.getClass();
        char charAt = str.charAt(i);
        return (charAt << 7) + str.charAt(i + 1);
    }
}
