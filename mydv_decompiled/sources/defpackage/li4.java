package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.Window;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class li4 {
    public static hx1 a;

    public static final lt3 a(String str, it3 it3Var) {
        if (jx4.L(str)) {
            s83.t("Blank serial names are prohibited");
            return null;
        }
        Object it = ((bv2) mt3.a.values()).iterator();
        while (((xu2) it).hasNext()) {
            KSerializer kSerializer = (KSerializer) ((yu2) it).next();
            if (str.equals(kSerializer.getDescriptor().a())) {
                StringBuilder E = r7.E("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                E.append(s24.a(kSerializer.getClass()).c());
                E.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                s83.t(kx4.p(E.toString()));
                return null;
            }
        }
        return new lt3(str, it3Var);
    }

    public static uj4 b(String str, qi4 qi4Var, SerialDescriptor[] serialDescriptorArr) {
        if (jx4.L(str)) {
            s83.t("Blank serial names are prohibited");
            return null;
        }
        if (qi4Var.equals(sx4.d)) {
            s83.t("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        l60 l60Var = new l60(str);
        return new uj4(str, qi4Var, l60Var.b.size(), dq.o1(serialDescriptorArr), l60Var);
    }

    public static final SerialDescriptor c(o63 o63Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        o63Var.getClass();
        if (!j42.c(serialDescriptor.e(), wj4.d)) {
            return serialDescriptor.isInline() ? c(o63Var, serialDescriptor.i(0)) : serialDescriptor;
        }
        a5.J(o63Var, serialDescriptor);
        return serialDescriptor;
    }

    public static final gk3 d(int i) {
        return new gk3(i);
    }

    public static final long e() {
        return Thread.currentThread().getId();
    }

    public static final Object f(ki4 ki4Var, bj4 bj4Var) {
        Object g = ki4Var.I.g(bj4Var);
        if (g == null) {
            return null;
        }
        return g;
    }

    public static final hx1 g() {
        hx1 hx1Var = a;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.VideoLibrary", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(4.0f, 6.0f);
        epVar.x(2.0f, 6.0f);
        epVar.M(14.0f);
        epVar.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        epVar.v(14.0f);
        epVar.M(-2.0f);
        epVar.x(4.0f, 20.0f);
        epVar.x(4.0f, 6.0f);
        epVar.p();
        epVar.z(20.0f, 2.0f);
        epVar.x(8.0f, 2.0f);
        epVar.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        epVar.M(12.0f);
        epVar.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        epVar.v(12.0f);
        epVar.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        epVar.x(22.0f, 4.0f);
        epVar.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        epVar.p();
        epVar.z(12.0f, 14.5f);
        epVar.M(-9.0f);
        epVar.y(6.0f, 4.5f);
        epVar.y(-6.0f, 4.5f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b = gx1Var.b();
        a = b;
        return b;
    }

    public static String h(String str, Object... objArr) {
        int indexOf;
        String sb;
        String valueOf = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder E = r7.E("<", str2, " threw ");
                    E.append(e.getClass().getName());
                    E.append(">");
                    sb = E.toString();
                }
            }
            objArr[i2] = sb;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i3)) != -1) {
            sb2.append((CharSequence) valueOf, i3, indexOf);
            sb2.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb2.append((CharSequence) valueOf, i3, valueOf.length());
        if (i < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb2.append(", ");
                sb2.append(objArr[i4]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List i(wr4 wr4Var, int i, wr4 wr4Var2, boolean z, boolean z2, boolean z3) {
        o91 o91Var;
        boolean z4;
        int i2;
        int i3;
        int t = wr4Var.t(i);
        int i4 = i + t;
        int f = wr4Var.f(wr4Var.q(i), wr4Var.b);
        int f2 = wr4Var.f(wr4Var.q(i4), wr4Var.b);
        int i5 = f2 - f;
        boolean z5 = i >= 0 && (wr4Var.b[(wr4Var.q(i) * 5) + 1] & 201326592) != 0;
        wr4Var2.v(t);
        wr4Var2.w(i5, wr4Var2.t);
        if (wr4Var.g < i4) {
            wr4Var.A(i4);
        }
        if (wr4Var.k < f2) {
            wr4Var.B(f2, i4);
        }
        int[] iArr = wr4Var2.b;
        int i6 = wr4Var2.t;
        int i7 = i6 * 5;
        dq.O0(i7, i * 5, i4 * 5, wr4Var.b, iArr);
        Object[] objArr = wr4Var2.c;
        int i8 = wr4Var2.i;
        System.arraycopy(wr4Var.c, f, objArr, i8, i5);
        int i9 = wr4Var2.v;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + t;
        int f3 = i8 - wr4Var2.f(i6, iArr);
        int i12 = wr4Var2.m;
        int i13 = wr4Var2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int[] iArr2 = iArr;
            int f4 = wr4Var2.f(i15, iArr) + f3;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = wr4Var2.k;
            }
            iArr2[(i15 * 5) + 4] = wr4.h(f4, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        wr4Var2.m = i14;
        int b = vr4.b(wr4Var.d, i, wr4Var.o());
        int b2 = vr4.b(wr4Var.d, i4, wr4Var.o());
        if (b < b2) {
            ArrayList arrayList = wr4Var.d;
            ArrayList arrayList2 = new ArrayList(b2 - b);
            for (int i17 = b; i17 < b2; i17++) {
                bo1 bo1Var = (bo1) arrayList.get(i17);
                bo1Var.a += i10;
                arrayList2.add(bo1Var);
            }
            wr4Var2.d.addAll(vr4.b(wr4Var2.d, wr4Var2.t, wr4Var2.o()), arrayList2);
            arrayList.subList(b, b2).clear();
            o91Var = arrayList2;
        } else {
            o91Var = o91.I;
        }
        if (!o91Var.isEmpty()) {
            HashMap hashMap = wr4Var.e;
            HashMap hashMap2 = wr4Var2.e;
            if (hashMap != null && hashMap2 != null) {
                int size = o91Var.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = wr4Var2.v;
        wr4Var2.P(i9);
        int F = wr4Var.F(i, wr4Var.b);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = F >= 0;
            if (z7) {
                wr4Var.Q();
                wr4Var.a(F - wr4Var.t);
                wr4Var.Q();
            }
            wr4Var.a(i - wr4Var.t);
            boolean I = wr4Var.I();
            if (z7) {
                wr4Var.N();
                wr4Var.i();
                wr4Var.N();
                wr4Var.i();
            }
            z4 = I;
        } else {
            boolean J = wr4Var.J(i, t);
            wr4Var.K(f, i5, i - 1);
            z4 = J;
        }
        if (z4) {
            ke0.a("Unexpectedly removed anchors");
        }
        int i20 = wr4Var2.o;
        int i21 = iArr3[i7 + 1];
        wr4Var2.o = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            wr4Var2.t = i11;
            wr4Var2.i = i8 + i5;
        }
        if (z6) {
            wr4Var2.V(i9);
        }
        return o91Var;
    }

    public static final void j(yd ydVar, mk2 mk2Var, float f, float f2) {
        boolean z;
        ydVar.e();
        Path path = ydVar.a;
        int c = mk2Var.c();
        boolean z2 = true;
        int i = 0;
        while (i < c) {
            km0 km0Var = (km0) mk2Var.get(i);
            if (z2) {
                float[] fArr = km0Var.a;
                path.moveTo(fArr[0], fArr[1]);
                z = false;
            } else {
                z = z2;
            }
            float[] fArr2 = km0Var.a;
            path.cubicTo(fArr2[2], fArr2[3], fArr2[4], fArr2[5], km0Var.a(), km0Var.b());
            i++;
            z2 = z;
        }
        path.close();
    }

    public static final float k(long j, float f, iu0 iu0Var) {
        float c;
        long b = p65.b(j);
        if (q65.a(b, 4294967296L)) {
            if (iu0Var.L() <= 1.05d) {
                return iu0Var.f0(j);
            }
            c = p65.c(j) / p65.c(iu0Var.B(f));
        } else {
            if (!q65.a(b, 8589934592L)) {
                return Float.NaN;
            }
            c = p65.c(j);
        }
        return c * f;
    }

    public static final void l(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(qb.i0(j)), i, i2, 33);
        }
    }

    public static void m(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            p10.f(window, z);
        } else if (i >= 30) {
            k5.c(window, z);
        } else {
            kb4.Z(window, z);
        }
    }

    public static final void n(Spannable spannable, long j, iu0 iu0Var, int i, int i2) {
        long b = p65.b(j);
        if (q65.a(b, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(mw2.P(iu0Var.f0(j)), false), i, i2, 33);
        } else if (q65.a(b, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(p65.c(j)), i, i2, 33);
        }
    }

    public static final void o(Spannable spannable, tq2 tq2Var, int i, int i2) {
        LocaleSpan localeSpan;
        if (tq2Var != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                localeSpan = g7.n(tq2Var);
            } else {
                localeSpan = new LocaleSpan((tq2Var.I.isEmpty() ? nn3.a.g().c() : tq2Var.c()).a);
            }
            spannable.setSpan(localeSpan, i, i2, 33);
        }
    }

    public static final pz5 p(i62 i62Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        qi4 e = serialDescriptor.e();
        if (e instanceof eq3) {
            return pz5.N;
        }
        if (j42.c(e, sx4.e)) {
            return pz5.L;
        }
        if (!j42.c(e, sx4.f)) {
            return pz5.K;
        }
        SerialDescriptor c = c(i62Var.b, serialDescriptor.i(0));
        qi4 e2 = c.e();
        if ((e2 instanceof it3) || j42.c(e2, xj4.d)) {
            return pz5.M;
        }
        throw mu0.d(c);
    }

    public static final uj3 q(Object obj, Object obj2) {
        return new uj3(obj, obj2);
    }

    public static yd r(y13 y13Var, float f, yd ydVar) {
        y13Var.getClass();
        mk2 K = p70.K();
        ArrayList arrayList = y13Var.a;
        int size = arrayList.size();
        km0 km0Var = null;
        int i = 0;
        km0 km0Var2 = null;
        while (i < size) {
            float[] fArr = new float[8];
            for (int i2 = 0; i2 < 8; i2++) {
                fArr[i2] = sg5.b(((km0) ((uj3) arrayList.get(i)).I).a[i2], ((km0) ((uj3) arrayList.get(i)).J).a[i2], f);
            }
            km0 km0Var3 = new km0(fArr);
            if (km0Var2 == null) {
                km0Var2 = km0Var3;
            }
            if (km0Var != null) {
                K.add(km0Var);
            }
            i++;
            km0Var = km0Var3;
        }
        if (km0Var != null && km0Var2 != null) {
            float[] fArr2 = km0Var.a;
            float f2 = fArr2[0];
            float f3 = fArr2[1];
            float f4 = fArr2[2];
            float f5 = fArr2[3];
            float f6 = fArr2[4];
            float f7 = fArr2[5];
            float[] fArr3 = km0Var2.a;
            K.add(mw2.d(f2, f3, f4, f5, f6, f7, fArr3[0], fArr3[1]));
        }
        j(ydVar, p70.D(K), 0.0f, 0.0f);
        return ydVar;
    }

    public static final double s(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static final String t(int i, long j) {
        if (j >= 0) {
            o7.k(i);
            String l = Long.toString(j, i);
            l.getClass();
            return l;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        o7.k(i);
        String l2 = Long.toString(j3, i);
        l2.getClass();
        o7.k(i);
        String l3 = Long.toString(j4, i);
        l3.getClass();
        return l2.concat(l3);
    }
}
