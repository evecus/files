package defpackage;

import android.text.TextUtils;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ej1 implements u81, hu4 {
    public static final ej1 K;
    public static final ej1 L;
    public static final ej1 M;
    public static final ej1 N;
    public static final ej1 O;
    public static final ej1 P;
    public static final ej1 Q;
    public static final ej1 R;
    public static final ej1 S;
    public static final ej1 T;
    public final /* synthetic */ byte I;
    public final String J;

    static {
        byte b = 0;
        K = new ej1("NONE", b);
        L = new ej1("FULL", b);
        byte b2 = 1;
        M = new ej1("VERTICAL", b2);
        N = new ej1("HORIZONTAL", b2);
        byte b3 = 2;
        O = new ej1("FLAT", b3);
        P = new ej1("HALF_OPENED", b3);
        byte b4 = 3;
        Q = new ej1("FOLD", b4);
        R = new ej1("HINGE", b4);
        byte b5 = 4;
        S = new ej1("TRANSFER", b5);
        T = new ej1("PRESENT", b5);
    }

    public /* synthetic */ ej1(String str, byte b) {
        this.I = b;
        this.J = str;
    }

    @Override // defpackage.hu4
    public Iterator g(iu4 iu4Var, CharSequence charSequence) {
        return new gu4(this, iu4Var, charSequence, (byte) 1);
    }

    @Override // defpackage.u81
    public boolean h(CharSequence charSequence, int i, int i2, ec5 ec5Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.J)) {
            return true;
        }
        ec5Var.c = (ec5Var.c & 3) | 4;
        return false;
    }

    public String toString() {
        byte b = this.I;
        String str = this.J;
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return str;
            default:
                return super.toString();
        }
    }

    @Override // defpackage.u81
    public Object b() {
        return this;
    }
}
