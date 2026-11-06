package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class oz4 implements o84 {
    public final hm1 I;

    public oz4(hm1 hm1Var) {
        hm1Var.getClass();
        this.I = hm1Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.I.close();
    }

    @Override // defpackage.o84
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final yz4 Y(String str) {
        str.getClass();
        hm1 hm1Var = this.I;
        hm1Var.getClass();
        String obj = jx4.g0(str).toString();
        if (obj.length() >= 3) {
            String upperCase = obj.substring(0, 3).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            int hashCode = upperCase.hashCode();
            if (hashCode == 79487 ? upperCase.equals("PRA") : !(hashCode == 81978 ? !upperCase.equals("SEL") : !(hashCode == 85954 && upperCase.equals("WIT")))) {
                wz4 wz4Var = new wz4(hm1Var, str);
                wz4Var.L = new int[0];
                wz4Var.M = new long[0];
                wz4Var.N = new double[0];
                wz4Var.O = new String[0];
                wz4Var.P = new byte[0][];
                return wz4Var;
            }
        }
        return new xz4(hm1Var, str);
    }
}
