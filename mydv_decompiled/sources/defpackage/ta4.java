package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class ta4 {
    public static final Class a;
    public static final ce5 b;
    public static final ce5 c;
    public static final ce5 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = v(false);
        c = v(true);
        d = new ce5();
    }

    public static void A(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i70 i70Var = (i70) uu2Var.I;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                i70Var.y(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        i70Var.G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        i70Var.I(i3);
        while (i2 < list.size()) {
            i70Var.z(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void B(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i70 i70Var = (i70) uu2Var.I;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                i70Var.A(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        i70Var.G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += i70.k(((Integer) list.get(i4)).intValue());
        }
        i70Var.I(i3);
        while (i2 < list.size()) {
            i70Var.B(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void C(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i70 i70Var = (i70) uu2Var.I;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                i70Var.w(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        i70Var.G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        i70Var.I(i3);
        while (i2 < list.size()) {
            i70Var.x(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void D(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i70 i70Var = (i70) uu2Var.I;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                i70Var.y(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        i70Var.G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        i70Var.I(i3);
        while (i2 < list.size()) {
            i70Var.z(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void E(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i70 i70Var = (i70) uu2Var.I;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                i70Var.w(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        i70Var.G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        i70Var.I(i3);
        while (i2 < list.size()) {
            i70Var.x(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void F(int i, List list, uu2 uu2Var, ra4 ra4Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        uu2Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            uu2Var.S(i, list.get(i2), ra4Var);
        }
    }

    public static void G(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i70 i70Var = (i70) uu2Var.I;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                i70Var.A(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        i70Var.G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += i70.k(((Integer) list.get(i4)).intValue());
        }
        i70Var.I(i3);
        while (i2 < list.size()) {
            i70Var.B(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void H(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i70 i70Var = (i70) uu2Var.I;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                i70Var.J(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        i70Var.G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += i70.o(((Long) list.get(i4)).longValue());
        }
        i70Var.I(i3);
        while (i2 < list.size()) {
            i70Var.K(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void I(int i, List list, uu2 uu2Var, ra4 ra4Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        uu2Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((i70) uu2Var.I).D(i, (s3) list.get(i2), ra4Var);
        }
    }

    public static void J(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i70 i70Var = (i70) uu2Var.I;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                i70Var.w(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        i70Var.G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        i70Var.I(i3);
        while (i2 < list.size()) {
            i70Var.x(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void K(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i70 i70Var = (i70) uu2Var.I;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                i70Var.y(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        i70Var.G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        i70Var.I(i3);
        while (i2 < list.size()) {
            i70Var.z(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void L(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i70 i70Var = (i70) uu2Var.I;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i70Var.H(i, (intValue >> 31) ^ (intValue << 1));
                i2++;
            }
            return;
        }
        i70Var.G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += i70.n((intValue2 >> 31) ^ (intValue2 << 1));
        }
        i70Var.I(i3);
        while (i2 < list.size()) {
            int intValue3 = ((Integer) list.get(i2)).intValue();
            i70Var.I((intValue3 >> 31) ^ (intValue3 << 1));
            i2++;
        }
    }

    public static void M(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i70 i70Var = (i70) uu2Var.I;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                i70Var.J(i, (longValue >> 63) ^ (longValue << 1));
                i2++;
            }
            return;
        }
        i70Var.G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += i70.o((longValue2 >> 63) ^ (longValue2 << 1));
        }
        i70Var.I(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            i70Var.K((longValue3 >> 63) ^ (longValue3 << 1));
            i2++;
        }
    }

    public static void N(int i, List list, uu2 uu2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i70 i70Var = (i70) uu2Var.I;
        int i2 = 0;
        if (!(list instanceof ch2)) {
            while (i2 < list.size()) {
                i70Var.E(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        ch2 ch2Var = (ch2) list;
        while (i2 < list.size()) {
            Object k = ch2Var.k(i2);
            if (k instanceof String) {
                i70Var.E(i, (String) k);
            } else {
                i70Var.u(i, (f00) k);
            }
            i2++;
        }
    }

    public static void O(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i70 i70Var = (i70) uu2Var.I;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                i70Var.H(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        i70Var.G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += i70.n(((Integer) list.get(i4)).intValue());
        }
        i70Var.I(i3);
        while (i2 < list.size()) {
            i70Var.I(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void P(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i70 i70Var = (i70) uu2Var.I;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                i70Var.J(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        i70Var.G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += i70.o(((Long) list.get(i4)).longValue());
        }
        i70Var.I(i3);
        while (i2 < list.size()) {
            i70Var.K(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m = i70.m(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            m += i70.g((f00) list.get(i2));
        }
        return m;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (i70.m(i) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += i70.k(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return i70.h(i) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return i70.i(i) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (i70.m(i) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += i70.k(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int j(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (i70.m(i) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += i70.o(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int l(int i, List list, ra4 ra4Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m = i70.m(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int b2 = ((s3) list.get(i2)).b(ra4Var);
            m += i70.n(b2) + b2;
        }
        return m;
    }

    public static int m(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (i70.m(i) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Integer) list.get(i2)).intValue();
            i += i70.n((intValue >> 31) ^ (intValue << 1));
        }
        return i;
    }

    public static int o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (i70.m(i) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += i70.o((longValue >> 63) ^ (longValue << 1));
        }
        return i;
    }

    public static int q(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int m = i70.m(i) * size;
        if (!(list instanceof ch2)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof f00) {
                    int size2 = ((f00) obj).size();
                    m = i70.n(size2) + size2 + m;
                } else {
                    m = i70.l((String) obj) + m;
                }
                i2++;
            }
            return m;
        }
        ch2 ch2Var = (ch2) list;
        while (i2 < size) {
            Object k = ch2Var.k(i2);
            if (k instanceof f00) {
                int size3 = ((f00) k).size();
                m = i70.n(size3) + size3 + m;
            } else {
                m = i70.l((String) k) + m;
            }
            i2++;
        }
        return m;
    }

    public static int r(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (i70.m(i) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += i70.n(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (i70.m(i) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += i70.o(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static ce5 v(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (ce5) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void w(ce5 ce5Var, bp1 bp1Var, Object obj) {
        ce5Var.getClass();
        ae5 ae5Var = bp1Var.unknownFields;
        ae5 ae5Var2 = ((bp1) obj).unknownFields;
        if (!ae5Var2.equals(ae5.f)) {
            int i = ae5Var.a + ae5Var2.a;
            int[] copyOf = Arrays.copyOf(ae5Var.b, i);
            System.arraycopy(ae5Var2.b, 0, copyOf, ae5Var.a, ae5Var2.a);
            Object[] copyOf2 = Arrays.copyOf(ae5Var.c, i);
            System.arraycopy(ae5Var2.c, 0, copyOf2, ae5Var.a, ae5Var2.a);
            ae5Var = new ae5(i, copyOf, copyOf2, true);
        }
        bp1Var.unknownFields = ae5Var;
    }

    public static boolean x(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void y(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i70 i70Var = (i70) uu2Var.I;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                i70Var.t(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        i70Var.G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        i70Var.I(i3);
        while (i2 < list.size()) {
            i70Var.r(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void z(int i, List list, uu2 uu2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        uu2Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((i70) uu2Var.I).u(i, (f00) list.get(i2));
        }
    }
}
