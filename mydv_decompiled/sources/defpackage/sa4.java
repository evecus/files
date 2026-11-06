package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class sa4 {
    public static final Class a;
    public static final be5 b;
    public static final be5 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        sx3 sx3Var = sx3.c;
        be5 be5Var = null;
        try {
            cls = Class.forName("androidx.glance.appwidget.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            sx3 sx3Var2 = sx3.c;
            try {
                cls2 = Class.forName("androidx.glance.appwidget.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                be5Var = (be5) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = be5Var;
        c = new be5();
    }

    public static int a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h22)) {
            int i2 = 0;
            while (i < size) {
                i2 += j70.g(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        h22 h22Var = (h22) list;
        int i3 = 0;
        while (i < size) {
            i3 += j70.g(h22Var.f(i));
            i++;
        }
        return i3;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j70.e(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j70.e(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h22)) {
            int i2 = 0;
            while (i < size) {
                i2 += j70.g(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        h22 h22Var = (h22) list;
        int i3 = 0;
        while (i < size) {
            i3 += j70.g(h22Var.f(i));
            i++;
        }
        return i3;
    }

    public static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof lr2)) {
            int i2 = 0;
            while (i < size) {
                i2 += j70.g(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        lr2 lr2Var = (lr2) list;
        int i3 = 0;
        while (i < size) {
            i3 += j70.g(lr2Var.e(i));
            i++;
        }
        return i3;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h22)) {
            int i2 = 0;
            while (i < size) {
                i2 += j70.b(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        h22 h22Var = (h22) list;
        int i3 = 0;
        while (i < size) {
            i3 += j70.b(h22Var.f(i));
            i++;
        }
        return i3;
    }

    public static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof lr2)) {
            int i2 = 0;
            while (i < size) {
                i2 += j70.c(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        lr2 lr2Var = (lr2) list;
        int i3 = 0;
        while (i < size) {
            i3 += j70.c(lr2Var.e(i));
            i++;
        }
        return i3;
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h22)) {
            int i2 = 0;
            while (i < size) {
                i2 += j70.f(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        h22 h22Var = (h22) list;
        int i3 = 0;
        while (i < size) {
            i3 += j70.f(h22Var.f(i));
            i++;
        }
        return i3;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof lr2)) {
            int i2 = 0;
            while (i < size) {
                i2 += j70.g(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        lr2 lr2Var = (lr2) list;
        int i3 = 0;
        while (i < size) {
            i3 += j70.g(lr2Var.e(i));
            i++;
        }
        return i3;
    }

    public static void k(be5 be5Var, Object obj, Object obj2) {
        be5Var.getClass();
        ap1 ap1Var = (ap1) obj;
        zd5 zd5Var = ap1Var.unknownFields;
        zd5 zd5Var2 = ((ap1) obj2).unknownFields;
        zd5 zd5Var3 = zd5.f;
        if (!zd5Var3.equals(zd5Var2)) {
            if (zd5Var3.equals(zd5Var)) {
                int i = zd5Var.a + zd5Var2.a;
                int[] copyOf = Arrays.copyOf(zd5Var.b, i);
                System.arraycopy(zd5Var2.b, 0, copyOf, zd5Var.a, zd5Var2.a);
                Object[] copyOf2 = Arrays.copyOf(zd5Var.c, i);
                System.arraycopy(zd5Var2.c, 0, copyOf2, zd5Var.a, zd5Var2.a);
                zd5Var = new zd5(i, copyOf, copyOf2, true);
            } else {
                zd5Var.getClass();
                if (!zd5Var2.equals(zd5Var3)) {
                    if (!zd5Var.e) {
                        e1.a();
                        return;
                    }
                    int i2 = zd5Var.a + zd5Var2.a;
                    zd5Var.a(i2);
                    System.arraycopy(zd5Var2.b, 0, zd5Var.b, zd5Var.a, zd5Var2.a);
                    System.arraycopy(zd5Var2.c, 0, zd5Var.c, zd5Var.a, zd5Var2.a);
                    zd5Var.a = i2;
                }
            }
        }
        ap1Var.unknownFields = zd5Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof rw;
        j70 j70Var = (j70) uu2Var.I;
        int i2 = 0;
        if (z2) {
            if (z) {
                j70Var.u(i, 2);
                j70Var.w(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                j70Var.j(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        j70Var.u(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        j70Var.w(i3);
        while (i2 < list.size()) {
            j70Var.i(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof ry0;
        j70 j70Var = (j70) uu2Var.I;
        int i2 = 0;
        if (z2) {
            if (z) {
                j70Var.u(i, 2);
                j70Var.w(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                j70Var.n(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        j70Var.u(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        j70Var.w(i3);
        while (i2 < list.size()) {
            j70Var.o(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void o(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof h22;
        j70 j70Var = (j70) uu2Var.I;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    j70Var.p(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            j70Var.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += j70.g(((Integer) list.get(i4)).intValue());
            }
            j70Var.w(i3);
            while (i2 < list.size()) {
                j70Var.q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h22 h22Var = (h22) list;
        if (!z) {
            while (i2 < h22Var.K) {
                j70Var.p(i, h22Var.f(i2));
                i2++;
            }
            return;
        }
        j70Var.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < h22Var.K; i6++) {
            i5 += j70.g(h22Var.f(i6));
        }
        j70Var.w(i5);
        while (i2 < h22Var.K) {
            j70Var.q(h22Var.f(i2));
            i2++;
        }
    }

    public static void p(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof h22;
        j70 j70Var = (j70) uu2Var.I;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    j70Var.l(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            j70Var.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            j70Var.w(i3);
            while (i2 < list.size()) {
                j70Var.m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h22 h22Var = (h22) list;
        if (!z) {
            while (i2 < h22Var.K) {
                j70Var.l(i, h22Var.f(i2));
                i2++;
            }
            return;
        }
        j70Var.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < h22Var.K; i6++) {
            h22Var.f(i6);
            i5 += 4;
        }
        j70Var.w(i5);
        while (i2 < h22Var.K) {
            j70Var.m(h22Var.f(i2));
            i2++;
        }
    }

    public static void q(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof lr2;
        j70 j70Var = (j70) uu2Var.I;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    j70Var.n(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            j70Var.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            j70Var.w(i3);
            while (i2 < list.size()) {
                j70Var.o(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        lr2 lr2Var = (lr2) list;
        if (!z) {
            while (i2 < 0) {
                j70Var.n(i, lr2Var.e(i2));
                i2++;
            }
            return;
        }
        j70Var.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            lr2Var.e(i6);
            i5 += 8;
        }
        j70Var.w(i5);
        while (i2 < 0) {
            j70Var.o(lr2Var.e(i2));
            i2++;
        }
    }

    public static void r(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof pf1;
        j70 j70Var = (j70) uu2Var.I;
        int i2 = 0;
        if (z2) {
            if (z) {
                j70Var.u(i, 2);
                j70Var.w(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                j70Var.l(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        j70Var.u(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        j70Var.w(i3);
        while (i2 < list.size()) {
            j70Var.m(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void s(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof h22;
        j70 j70Var = (j70) uu2Var.I;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    j70Var.p(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            j70Var.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += j70.g(((Integer) list.get(i4)).intValue());
            }
            j70Var.w(i3);
            while (i2 < list.size()) {
                j70Var.q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h22 h22Var = (h22) list;
        if (!z) {
            while (i2 < h22Var.K) {
                j70Var.p(i, h22Var.f(i2));
                i2++;
            }
            return;
        }
        j70Var.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < h22Var.K; i6++) {
            i5 += j70.g(h22Var.f(i6));
        }
        j70Var.w(i5);
        while (i2 < h22Var.K) {
            j70Var.q(h22Var.f(i2));
            i2++;
        }
    }

    public static void t(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof lr2;
        j70 j70Var = (j70) uu2Var.I;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    j70Var.x(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            j70Var.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += j70.g(((Long) list.get(i4)).longValue());
            }
            j70Var.w(i3);
            while (i2 < list.size()) {
                j70Var.y(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        lr2 lr2Var = (lr2) list;
        if (!z) {
            while (i2 < 0) {
                j70Var.x(i, lr2Var.e(i2));
                i2++;
            }
            return;
        }
        j70Var.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            i5 += j70.g(lr2Var.e(i6));
        }
        j70Var.w(i5);
        while (i2 < 0) {
            j70Var.y(lr2Var.e(i2));
            i2++;
        }
    }

    public static void u(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof h22;
        j70 j70Var = (j70) uu2Var.I;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    j70Var.l(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            j70Var.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            j70Var.w(i3);
            while (i2 < list.size()) {
                j70Var.m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h22 h22Var = (h22) list;
        if (!z) {
            while (i2 < h22Var.K) {
                j70Var.l(i, h22Var.f(i2));
                i2++;
            }
            return;
        }
        j70Var.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < h22Var.K; i6++) {
            h22Var.f(i6);
            i5 += 4;
        }
        j70Var.w(i5);
        while (i2 < h22Var.K) {
            j70Var.m(h22Var.f(i2));
            i2++;
        }
    }

    public static void v(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof lr2;
        j70 j70Var = (j70) uu2Var.I;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    j70Var.n(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            j70Var.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            j70Var.w(i3);
            while (i2 < list.size()) {
                j70Var.o(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        lr2 lr2Var = (lr2) list;
        if (!z) {
            while (i2 < 0) {
                j70Var.n(i, lr2Var.e(i2));
                i2++;
            }
            return;
        }
        j70Var.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            lr2Var.e(i6);
            i5 += 8;
        }
        j70Var.w(i5);
        while (i2 < 0) {
            j70Var.o(lr2Var.e(i2));
            i2++;
        }
    }

    public static void w(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof h22;
        j70 j70Var = (j70) uu2Var.I;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    j70Var.v(i, (intValue >> 31) ^ (intValue << 1));
                    i2++;
                }
                return;
            }
            j70Var.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += j70.b(((Integer) list.get(i4)).intValue());
            }
            j70Var.w(i3);
            while (i2 < list.size()) {
                int intValue2 = ((Integer) list.get(i2)).intValue();
                j70Var.w((intValue2 >> 31) ^ (intValue2 << 1));
                i2++;
            }
            return;
        }
        h22 h22Var = (h22) list;
        if (!z) {
            while (i2 < h22Var.K) {
                int f = h22Var.f(i2);
                j70Var.v(i, (f >> 31) ^ (f << 1));
                i2++;
            }
            return;
        }
        j70Var.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < h22Var.K; i6++) {
            i5 += j70.b(h22Var.f(i6));
        }
        j70Var.w(i5);
        while (i2 < h22Var.K) {
            int f2 = h22Var.f(i2);
            j70Var.w((f2 >> 31) ^ (f2 << 1));
            i2++;
        }
    }

    public static void x(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof lr2;
        j70 j70Var = (j70) uu2Var.I;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    j70Var.x(i, (longValue >> 63) ^ (longValue << 1));
                    i2++;
                }
                return;
            }
            j70Var.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += j70.c(((Long) list.get(i4)).longValue());
            }
            j70Var.w(i3);
            while (i2 < list.size()) {
                long longValue2 = ((Long) list.get(i2)).longValue();
                j70Var.y((longValue2 >> 63) ^ (longValue2 << 1));
                i2++;
            }
            return;
        }
        lr2 lr2Var = (lr2) list;
        if (!z) {
            while (i2 < 0) {
                long e = lr2Var.e(i2);
                j70Var.x(i, (e >> 63) ^ (e << 1));
                i2++;
            }
            return;
        }
        j70Var.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            i5 += j70.c(lr2Var.e(i6));
        }
        j70Var.w(i5);
        while (i2 < 0) {
            long e2 = lr2Var.e(i2);
            j70Var.y((e2 >> 63) ^ (e2 << 1));
            i2++;
        }
    }

    public static void y(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof h22;
        j70 j70Var = (j70) uu2Var.I;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    j70Var.v(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            j70Var.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += j70.f(((Integer) list.get(i4)).intValue());
            }
            j70Var.w(i3);
            while (i2 < list.size()) {
                j70Var.w(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h22 h22Var = (h22) list;
        if (!z) {
            while (i2 < h22Var.K) {
                j70Var.v(i, h22Var.f(i2));
                i2++;
            }
            return;
        }
        j70Var.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < h22Var.K; i6++) {
            i5 += j70.f(h22Var.f(i6));
        }
        j70Var.w(i5);
        while (i2 < h22Var.K) {
            j70Var.w(h22Var.f(i2));
            i2++;
        }
    }

    public static void z(int i, List list, uu2 uu2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof lr2;
        j70 j70Var = (j70) uu2Var.I;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    j70Var.x(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            j70Var.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += j70.g(((Long) list.get(i4)).longValue());
            }
            j70Var.w(i3);
            while (i2 < list.size()) {
                j70Var.y(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        lr2 lr2Var = (lr2) list;
        if (!z) {
            while (i2 < 0) {
                j70Var.x(i, lr2Var.e(i2));
                i2++;
            }
            return;
        }
        j70Var.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            i5 += j70.g(lr2Var.e(i6));
        }
        j70Var.w(i5);
        while (i2 < 0) {
            j70Var.y(lr2Var.e(i2));
            i2++;
        }
    }

    public static Object j(Object obj, int i, n32 n32Var, Object obj2, be5 be5Var) {
        return obj2;
    }
}
