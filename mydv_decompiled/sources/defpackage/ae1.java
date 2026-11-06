package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ae1 {
    public static final /* synthetic */ int c = 0;
    public final yr4 a = new yr4(16);
    public boolean b;

    static {
        new ae1(0);
    }

    public ae1(int i) {
        a();
        a();
    }

    public static void b(i70 i70Var, cx5 cx5Var, int i, Object obj) {
        if (cx5Var == cx5.L) {
            i70Var.G(i, 3);
            ((s3) obj).c(i70Var);
            i70Var.G(i, 4);
        }
        i70Var.G(i, cx5Var.J);
        switch (cx5Var.ordinal()) {
            case 0:
                i70Var.z(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                i70Var.x(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                i70Var.K(((Long) obj).longValue());
                break;
            case 3:
                i70Var.K(((Long) obj).longValue());
                break;
            case 4:
                i70Var.B(((Integer) obj).intValue());
                break;
            case 5:
                i70Var.z(((Long) obj).longValue());
                break;
            case 6:
                i70Var.x(((Integer) obj).intValue());
                break;
            case 7:
                i70Var.r(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof f00)) {
                    i70Var.F((String) obj);
                    break;
                } else {
                    i70Var.v((f00) obj);
                    break;
                }
            case 9:
                ((s3) obj).c(i70Var);
                break;
            case 10:
                s3 s3Var = (s3) obj;
                i70Var.I(s3Var.a());
                s3Var.c(i70Var);
                break;
            case 11:
                if (!(obj instanceof f00)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    i70Var.I(length);
                    i70Var.s(bArr, 0, length);
                    break;
                } else {
                    i70Var.v((f00) obj);
                    break;
                }
            case 12:
                i70Var.I(((Integer) obj).intValue());
                break;
            case 13:
                i70Var.B(((Integer) obj).intValue());
                break;
            case 14:
                i70Var.x(((Integer) obj).intValue());
                break;
            case 15:
                i70Var.z(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i70Var.I((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                i70Var.K((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        yr4 yr4Var = this.a;
        if (!yr4Var.L) {
            if (yr4Var.J.size() > 0) {
                yr4Var.c(0).getKey().getClass();
                zl1.c();
                return;
            } else {
                Iterator it = yr4Var.d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    zl1.c();
                    return;
                }
            }
        }
        if (!yr4Var.L) {
            yr4Var.K = yr4Var.K.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(yr4Var.K);
            yr4Var.N = yr4Var.N.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(yr4Var.N);
            yr4Var.L = true;
        }
        this.b = true;
    }

    public final Object clone() {
        ae1 ae1Var = new ae1();
        yr4 yr4Var = this.a;
        if (yr4Var.J.size() > 0) {
            Map.Entry c2 = yr4Var.c(0);
            if (c2.getKey() != null) {
                zl1.c();
                return null;
            }
            c2.getValue();
            throw null;
        }
        Iterator it = yr4Var.d().iterator();
        if (!it.hasNext()) {
            return ae1Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            zl1.c();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ae1) {
            return this.a.equals(((ae1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ae1() {
    }
}
