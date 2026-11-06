package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class j42 {
    public static final tc0 d;
    public static final mj3 q;
    public static hx1 x;
    public static final q8 a = new q8(26);
    public static final Object[] b = new Object[0];
    public static final tc0 c = new tc0(-936671683, new dd0(0), false);
    public static final tc0 e = new tc0(117221998, new sg(11), false);
    public static final tc0 f = new tc0(581941102, new dd0(2), false);
    public static final tc0 g = new tc0(-34182284, new dd0(3), false);
    public static final ko3 h = new ko3(null, new vn3());
    public static final it5 i = new it5(0.31006f, 0.31616f);
    public static final it5 j = new it5(0.34567f, 0.3585f);
    public static final it5 k = new it5(0.32168f, 0.33767f);
    public static final it5 l = new it5(0.31271f, 0.32902f);
    public static final float[] m = {0.964212f, 1.0f, 0.825188f};
    public static final o63 n = new o63((byte) 4);
    public static final xb4 o = new xb4();
    public static final wb4 p = new wb4();
    public static final Object r = new Object();
    public static final ep s = new ep((Object) "NO_THREAD_ELEMENTS", (byte) 25);
    public static final yi4 t = new yi4(16);
    public static final yi4 u = new yi4(17);
    public static final yi4 v = new yi4(18);
    public static final bf1 w = new bf1();

    static {
        byte b2 = 1;
        d = new tc0(93621700, new dd0(b2), false);
        q = new mj3(b2);
    }

    public static final hx1 B() {
        hx1 hx1Var = x;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Outlined.ChatBubbleOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep p2 = hf1.p(20.0f, 2.0f, 4.0f, 2.0f);
        p2.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        p2.M(18.0f);
        p2.y(4.0f, -4.0f);
        p2.v(14.0f);
        p2.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        p2.x(22.0f, 4.0f);
        p2.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        p2.p();
        p2.z(20.0f, 16.0f);
        p2.x(6.0f, 16.0f);
        p2.y(-2.0f, 2.0f);
        p2.x(4.0f, 4.0f);
        p2.v(16.0f);
        p2.M(12.0f);
        p2.p();
        gx1.a(gx1Var, (ArrayList) p2.J, rt4Var);
        hx1 b2 = gx1Var.b();
        x = b2;
        return b2;
    }

    public static Drawable C(Context context, int i2) {
        return z44.d().f(context, i2);
    }

    public static final hw4 D(gt4 gt4Var) {
        hw4 hw4Var = gt4Var.I;
        hw4Var.getClass();
        return (hw4) ws4.t(hw4Var, gt4Var);
    }

    public static final int E(gt4 gt4Var) {
        hw4 hw4Var = gt4Var.I;
        hw4Var.getClass();
        return ((hw4) ws4.f(hw4Var)).e;
    }

    public static final boolean F(ki4 ki4Var) {
        bj4 bj4Var = zi4.s;
        n43 n43Var = ki4Var.I;
        Object g2 = n43Var.g(bj4Var);
        if (g2 == null) {
            g2 = null;
        }
        if (c(g2, q8.f0)) {
            return false;
        }
        return n43Var.b(ii4.g) || n43Var.b(ii4.h);
    }

    public static final boolean G(int i2, int i3, long j2) {
        int j3 = dh0.j(j2);
        if (i2 > dh0.h(j2) || j3 > i2) {
            return false;
        }
        return i3 <= dh0.g(j2) && dh0.i(j2) <= i3;
    }

    public static boolean H(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    public static final l13 I(l13 l13Var, in1 in1Var) {
        return l13Var.then(new ea2(in1Var));
    }

    public static final void J(ir5 ir5Var, wa2 wa2Var) {
        long M = wa2Var.n0.c.M(0L);
        int round = Math.round(Float.intBitsToFloat((int) (M >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (M & 4294967295L)));
        ir5Var.layout(round, round2, ir5Var.getMeasuredWidth() + round, ir5Var.getMeasuredHeight() + round2);
    }

    public static double K(double d2, double d3) {
        if (d2 < 0.0d || d2 > 100.0d) {
            return -1.0d;
        }
        double F0 = p70.F0(d2);
        double d4 = ((F0 + 5.0d) * d3) - 5.0d;
        if (d4 < 0.0d || d4 > 100.0d) {
            return -1.0d;
        }
        double X = X(d4, F0);
        double abs = Math.abs(X - d3);
        if (X < d3 && abs > 0.04d) {
            return -1.0d;
        }
        double c0 = ((p70.c0(d4 / 100.0d) * 116.0d) - 16.0d) + 0.4d;
        if (c0 < 0.0d || c0 > 100.0d) {
            return -1.0d;
        }
        return c0;
    }

    public static final int[] L(int i2, List list) {
        int i3;
        int i4 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i4 < size) {
                iArr[i4] = qb.i0(((x70) list.get(i4)).a);
                i4++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i2];
        int size2 = list.size() - 1;
        int size3 = list.size();
        int i5 = 0;
        while (i4 < size3) {
            long j2 = ((x70) list.get(i4)).a;
            if (x70.d(j2) == 0.0f) {
                if (i4 == 0) {
                    i3 = i5 + 1;
                    iArr2[i5] = qb.i0(x70.c(((x70) list.get(1)).a, 0.0f));
                } else if (i4 == size2) {
                    i3 = i5 + 1;
                    iArr2[i5] = qb.i0(x70.c(((x70) list.get(i4 - 1)).a, 0.0f));
                } else {
                    int i6 = i5 + 1;
                    iArr2[i5] = qb.i0(x70.c(((x70) list.get(i4 - 1)).a, 0.0f));
                    i5 += 2;
                    iArr2[i6] = qb.i0(x70.c(((x70) list.get(i4 + 1)).a, 0.0f));
                }
                i5 = i3;
            } else {
                iArr2[i5] = qb.i0(j2);
                i5++;
            }
            i4++;
        }
        return iArr2;
    }

    public static final float[] M(List list, int i2, List list2) {
        if (i2 == 0) {
            if (list != null) {
                return o70.o1(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i2];
        fArr[0] = list != null ? ((Number) list.get(0)).floatValue() : 0.0f;
        int size = list2.size() - 1;
        int i3 = 1;
        for (int i4 = 1; i4 < size; i4++) {
            long j2 = ((x70) list2.get(i4)).a;
            float floatValue = list != null ? ((Number) list.get(i4)).floatValue() : i4 / (list2.size() - 1);
            int i5 = i3 + 1;
            fArr[i3] = floatValue;
            if (x70.d(j2) == 0.0f) {
                i3 += 2;
                fArr[i5] = floatValue;
            } else {
                i3 = i5;
            }
        }
        fArr[i3] = list != null ? ((Number) list.get(list2.size() - 1)).floatValue() : 1.0f;
        return fArr;
    }

    public static int N(int i2, int... iArr) {
        for (int i3 : iArr) {
            i2 = Math.max(i2, i3);
        }
        return i2;
    }

    public static Comparable O(r11 r11Var, Comparable comparable) {
        comparable.getClass();
        return comparable.compareTo(r11Var) >= 0 ? comparable : r11Var;
    }

    public static Comparable P(r11 r11Var, Comparable comparable) {
        return r11Var.compareTo(comparable) <= 0 ? r11Var : comparable;
    }

    public static final boolean Q(gt4 gt4Var, tm1 tm1Var) {
        int i2;
        a4 a4Var;
        Object invoke;
        ns4 h2;
        boolean f2;
        do {
            synchronized (r) {
                hw4 hw4Var = gt4Var.I;
                hw4Var.getClass();
                hw4 hw4Var2 = (hw4) ws4.f(hw4Var);
                i2 = hw4Var2.d;
                a4Var = hw4Var2.c;
            }
            a4Var.getClass();
            rm3 h3 = a4Var.h();
            invoke = tm1Var.invoke(h3);
            a4 e2 = h3.e();
            if (c(e2, a4Var)) {
                break;
            }
            hw4 hw4Var3 = gt4Var.I;
            hw4Var3.getClass();
            synchronized (ws4.c) {
                h2 = ws4.h();
                f2 = f((hw4) ws4.x(hw4Var3, gt4Var, h2), i2, e2, true);
            }
            ws4.m(h2, gt4Var);
        } while (!f2);
        return ((Boolean) invoke).booleanValue();
    }

    public static final l13 R(l13 l13Var, a93 a93Var, d93 d93Var) {
        return l13Var.then(new e93(a93Var, d93Var));
    }

    public static void S(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static l13 T(l13 l13Var, rj3 rj3Var, u8 u8Var, ni0 ni0Var, float f2, c80 c80Var, int i2) {
        if ((i2 & 4) != 0) {
            u8Var = q8.N;
        }
        u8 u8Var2 = u8Var;
        if ((i2 & 16) != 0) {
            f2 = 1.0f;
        }
        return l13Var.then(new sj3(rj3Var, u8Var2, ni0Var, f2, c80Var));
    }

    public static double W(double d2, double d3) {
        return X(p70.F0(d2), p70.F0(d3));
    }

    public static double X(double d2, double d3) {
        double max = Math.max(d2, d3);
        if (max != d3) {
            d2 = d3;
        }
        return (max + 5.0d) / (d2 + 5.0d);
    }

    public static final void Y(tk0 tk0Var, Object obj) {
        if (obj == s) {
            return;
        }
        if (obj instanceof b75) {
            ((b75) obj).b(tk0Var);
            return;
        }
        Object fold = tk0Var.fold(null, u);
        fold.getClass();
        ((v65) fold).O(obj);
    }

    public static void Z(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static l13 a0(k45 k45Var, pg3 pg3Var, boolean z, boolean z2, t33 t33Var) {
        return new vb4(k45Var, pg3Var, z, z2, t33Var);
    }

    public static boolean b(float f2, Float f3) {
        return f3 != null && f2 == f3.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b0(defpackage.oc4 r9, long r10, defpackage.gj0 r12) {
        /*
            boolean r0 = r12 instanceof defpackage.yb4
            if (r0 == 0) goto L13
            r0 = r12
            yb4 r0 = (defpackage.yb4) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            yb4 r0 = new yb4
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.K
            int r1 = r0.L
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            o24 r9 = r0.J
            oc4 r10 = r0.I
            defpackage.mu0.V(r12)
            r7 = r9
            r9 = r10
            goto L54
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r9)
            r9 = 0
            return r9
        L32:
            defpackage.mu0.V(r12)
            o24 r7 = new o24
            r7.<init>()
            im5 r3 = new im5
            r8 = 0
            r4 = r9
            r5 = r10
            r3.<init>(r4, r5, r7, r8)
            r0.I = r4
            r0.J = r7
            r0.L = r2
            d53 r9 = defpackage.d53.I
            java.lang.Object r9 = r4.g(r9, r3, r0)
            el0 r10 = defpackage.el0.I
            if (r9 != r10) goto L53
            return r10
        L53:
            r9 = r4
        L54:
            float r10 = r7.I
            long r9 = r9.i(r10)
            pd3 r11 = new pd3
            r11.<init>(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j42.b0(oc4, long, gj0):java.lang.Object");
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static final long c0(long j2, float f2) {
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (j2 >> 32)) - f2);
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public static final v12 d(vu5 vu5Var, fe0 fe0Var) {
        return new v12(vu5Var, (iu0) ((go1) fe0Var).k(hf0.h));
    }

    public static String d0(Object obj, String str) {
        return str + obj;
    }

    public static final l13 e(l13 l13Var, float f2, boolean z) {
        return l13Var.then(new hq(f2, z));
    }

    public static final Object e0(tk0 tk0Var) {
        Object fold = tk0Var.fold(0, t);
        fold.getClass();
        return fold;
    }

    public static final boolean f(hw4 hw4Var, int i2, a4 a4Var, boolean z) {
        boolean z2;
        synchronized (r) {
            try {
                int i3 = hw4Var.d;
                if (i3 == i2) {
                    hw4Var.c = a4Var;
                    z2 = true;
                    if (z) {
                        hw4Var.e++;
                    }
                    hw4Var.d = i3 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static void f0() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static final l13 g(l13 l13Var, float f2, long j2, dn4 dn4Var) {
        return l13Var.then(new dx(f2, new rt4(j2), dn4Var));
    }

    public static void g0(String str) {
        vb0 vb0Var = new vb0(r7.C("lateinit property ", str, " has not been initialized"));
        Z(vb0Var, j42.class.getName());
        throw vb0Var;
    }

    public static final Object[] h0(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = b;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArr2[i2] = it.next();
            if (i3 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i4);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArr2, i3);
            }
            i2 = i3;
        }
    }

    public static final Object[] i0(Collection collection, Object[] objArr) {
        Object[] objArr2;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    newInstance.getClass();
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArr2[i2] = it.next();
                    if (i3 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i4);
                    } else if (!it.hasNext()) {
                        if (objArr2 != objArr) {
                            return Arrays.copyOf(objArr2, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static String j0(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (H(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (H(c2)) {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static void k(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static String k0(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (c2 >= 'a' && c2 <= 'z') {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static void l(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i2);
    }

    public static final Object l0(tk0 tk0Var, Object obj) {
        if (obj == null) {
            obj = e0(tk0Var);
        }
        return obj == 0 ? s : obj instanceof Integer ? tk0Var.fold(new b75(((Number) obj).intValue(), tk0Var), v) : ((v65) obj).F();
    }

    public static int m(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static final void m0(List list, List list2) {
        if (list2 == null) {
            if (list.size() >= 2) {
                return;
            }
            s83.t("colors must have length of at least 2 if colorStops is omitted.");
        } else {
            if (list.size() == list2.size()) {
                return;
            }
            s83.t("colors and colorStops arguments must have equal length.");
        }
    }

    public static int n(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static final void n0(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            zy.o(hf1.v("index (", i2, ") is out of bound of [0, ", i3, ")"));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [pb0] */
    public static pb0 o(final tm1... tm1VarArr) {
        if (tm1VarArr.length > 0) {
            return new Comparator() { // from class: pb0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    for (tm1 tm1Var : tm1VarArr) {
                        int p2 = j42.p((Comparable) tm1Var.invoke(obj), (Comparable) tm1Var.invoke(obj2));
                        if (p2 != 0) {
                            return p2;
                        }
                    }
                    return 0;
                }
            };
        }
        s83.t("Failed requirement.");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void o0(android.content.Context r16, java.util.concurrent.Executor r17, defpackage.du3 r18, boolean r19) {
        /*
            r1 = r16
            r5 = r18
            android.content.Context r0 = r1.getApplicationContext()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            android.content.res.AssetManager r4 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.sourceDir
            r0.<init>(r3)
            java.lang.String r6 = r0.getName()
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            r8 = 0
            android.content.pm.PackageInfo r9 = r0.getPackageInfo(r2, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld5
            java.io.File r10 = r1.getFilesDir()
            java.lang.String r3 = "ProfileInstaller"
            r11 = 1
            if (r19 != 0) goto L89
            java.io.File r0 = new java.io.File
            java.lang.String r7 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r10, r7)
            boolean r7 = r0.exists()
            if (r7 != 0) goto L40
        L3e:
            r0 = r8
            goto L6d
        L40:
            java.io.DataInputStream r7 = new java.io.DataInputStream     // Catch: java.io.IOException -> L3e
            java.io.FileInputStream r12 = new java.io.FileInputStream     // Catch: java.io.IOException -> L3e
            r12.<init>(r0)     // Catch: java.io.IOException -> L3e
            r7.<init>(r12)     // Catch: java.io.IOException -> L3e
            long r12 = r7.readLong()     // Catch: java.lang.Throwable -> L62
            r7.close()     // Catch: java.io.IOException -> L3e
            long r14 = r9.lastUpdateTime
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 != 0) goto L59
            r0 = r11
            goto L5a
        L59:
            r0 = r8
        L5a:
            if (r0 == 0) goto L6d
            r7 = 2
            r12 = 0
            r5.e(r7, r12)
            goto L6d
        L62:
            r0 = move-exception
            r12 = r0
            r7.close()     // Catch: java.lang.Throwable -> L68
            goto L6c
        L68:
            r0 = move-exception
            r12.addSuppressed(r0)     // Catch: java.io.IOException -> L3e
        L6c:
            throw r12     // Catch: java.io.IOException -> L3e
        L6d:
            if (r0 != 0) goto L70
            goto L89
        L70:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Skipping profile installation for "
            r0.<init>(r2)
            java.lang.String r2 = r1.getPackageName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            defpackage.qw3.c(r1, r8)
            goto Ld4
        L89:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r7 = "Installing profile for "
            r0.<init>(r7)
            java.lang.String r7 = r1.getPackageName()
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            java.io.File r7 = new java.io.File
            java.io.File r0 = new java.io.File
            java.lang.String r3 = "/data/misc/profiles/cur/0"
            r0.<init>(r3, r2)
            java.lang.String r2 = "primary.prof"
            r7.<init>(r0, r2)
            ew0 r2 = new ew0
            r3 = r4
            r4 = r17
            r2.<init>(r3, r4, r5, r6, r7)
            boolean r0 = r2.a()
            if (r0 != 0) goto Lbc
            r0 = r8
            goto Lcc
        Lbc:
            ew0 r0 = r2.c()
            r0.e()
            boolean r0 = r0.f()
            if (r0 == 0) goto Lcc
            S(r9, r10)
        Lcc:
            if (r0 == 0) goto Ld1
            if (r19 == 0) goto Ld1
            r8 = r11
        Ld1:
            defpackage.qw3.c(r1, r8)
        Ld4:
            return
        Ld5:
            r0 = move-exception
            r2 = 7
            r5.e(r2, r0)
            defpackage.qw3.c(r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j42.o0(android.content.Context, java.util.concurrent.Executor, du3, boolean):void");
    }

    public static int p(Comparable comparable, Comparable comparable2) {
        if (comparable == null) {
            return comparable2 == null ? 0 : -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final int q(List list) {
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int X = p70.X(list);
        for (int i3 = 1; i3 < X; i3++) {
            if (x70.d(((x70) list.get(i3)).a) == 0.0f) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object r(ye0 ye0Var, xx3 xx3Var) {
        if (!((k13) ye0Var).getNode().isAttached()) {
            q02.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        zl3 zl3Var = (zl3) ut0.U(ye0Var).j0;
        zl3Var.getClass();
        return p70.r0(zl3Var, xx3Var);
    }

    public static double s(double d2, double d3) {
        if (d2 < 0.0d || d2 > 100.0d) {
            return -1.0d;
        }
        double F0 = p70.F0(d2);
        double d4 = ((F0 + 5.0d) / d3) - 5.0d;
        if (d4 < 0.0d || d4 > 100.0d) {
            return -1.0d;
        }
        double X = X(F0, d4);
        double abs = Math.abs(X - d3);
        if (X < d3 && abs > 0.04d) {
            return -1.0d;
        }
        double c0 = ((p70.c0(d4 / 100.0d) * 116.0d) - 16.0d) - 0.4d;
        if (c0 < 0.0d || c0 > 100.0d) {
            return -1.0d;
        }
        return c0;
    }

    public static final l13 t(l13 l13Var, tm1 tm1Var) {
        return l13Var.then(new r31(tm1Var));
    }

    public static final l13 u(l13 l13Var, tm1 tm1Var) {
        return l13Var.then(new b41(tm1Var));
    }

    public static final l13 v(l13 l13Var, tm1 tm1Var) {
        return l13Var.then(new c41(tm1Var));
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:92)
        	at jadx.core.dex.visitors.regions.TernaryMod.replaceWithTernary(TernaryMod.java:340)
        	at jadx.core.dex.visitors.regions.TernaryMod.processOneBranchTernary(TernaryMod.java:272)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:77)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:57)
        */
    public static boolean w(java.lang.String r6, java.lang.String r7) {
        /*
            int r0 = r6.length()
            if (r6 != r7) goto L7
            goto L31
        L7:
            int r1 = r7.length()
            r2 = 0
            if (r0 == r1) goto Lf
            goto L30
        Lf:
            r1 = r2
        L10:
            if (r1 >= r0) goto L31
            char r3 = r6.charAt(r1)
            char r4 = r7.charAt(r1)
            if (r3 != r4) goto L1d
            goto L2d
        L1d:
            r3 = r3 | 32
            int r3 = r3 + (-97)
            char r3 = (char) r3
            r5 = 26
            if (r3 >= r5) goto L30
            r4 = r4 | 32
            int r4 = r4 + (-97)
            char r4 = (char) r4
            if (r3 != r4) goto L30
        L2d:
            int r1 = r1 + 1
            goto L10
        L30:
            return r2
        L31:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j42.w(java.lang.String, java.lang.String):boolean");
    }

    public static final l13 x(l13 l13Var, ki1 ki1Var) {
        return l13Var.then(new li1(ki1Var));
    }

    public static a10 y(int i2) {
        double d2;
        int i3;
        gs5 gs5Var = gs5.k;
        gs5Var.getClass();
        double i0 = p70.i0((16711680 & i2) >> 16);
        double i02 = p70.i0((65280 & i2) >> 8);
        double i03 = p70.i0(i2 & 255);
        double d3 = (0.18051042d * i03) + (0.35762064d * i02) + (0.41233895d * i0);
        double d4 = (0.0722d * i03) + (0.7152d * i02) + (0.2126d * i0);
        double d5 = (i03 * 0.95034478d) + (i02 * 0.11916382d) + (i0 * 0.01932141d);
        double d6 = gs5Var.i;
        double d7 = gs5Var.e;
        double d8 = gs5Var.b;
        double[][] dArr = a10.f;
        double[] dArr2 = dArr[0];
        double d9 = (dArr2[2] * d5) + (dArr2[1] * d4) + (dArr2[0] * d3);
        double[] dArr3 = dArr[1];
        double d10 = (dArr3[2] * d5) + (dArr3[1] * d4) + (dArr3[0] * d3);
        double[] dArr4 = dArr[2];
        double d11 = (d5 * dArr4[2]) + (d4 * dArr4[1]) + (d3 * dArr4[0]);
        double[] dArr5 = gs5Var.g;
        double d12 = dArr5[0] * d9;
        double d13 = dArr5[1] * d10;
        double d14 = dArr5[2] * d11;
        double d15 = gs5Var.h;
        double pow = Math.pow((Math.abs(d12) * d15) / 100.0d, 0.42d);
        double pow2 = Math.pow((Math.abs(d13) * d15) / 100.0d, 0.42d);
        double pow3 = Math.pow((Math.abs(d14) * d15) / 100.0d, 0.42d);
        if (d12 < 0.0d) {
            d2 = 0.0d;
            i3 = -1;
        } else if (d12 == 0.0d) {
            d2 = 0.0d;
            i3 = 0;
        } else {
            d2 = 0.0d;
            i3 = 1;
        }
        double d16 = ((i3 * 400.0d) * pow) / (pow + 27.13d);
        double d17 = (((d13 < d2 ? -1 : d13 == d2 ? 0 : 1) * 400.0d) * pow2) / (pow2 + 27.13d);
        double d18 = (((d14 < d2 ? -1 : d14 == d2 ? 0 : 1) * 400.0d) * pow3) / (pow3 + 27.13d);
        double d19 = ((((-12.0d) * d17) + (d16 * 11.0d)) + d18) / 11.0d;
        double p2 = r7.p(d18, 2.0d, d16 + d17, 9.0d);
        double d20 = d17 * 20.0d;
        double d21 = ((21.0d * d18) + ((d16 * 20.0d) + d20)) / 20.0d;
        double d22 = (((d16 * 40.0d) + d20) + d18) / 20.0d;
        double atan2 = (Math.atan2(p2, d19) * 57.29577951308232d) % 360.0d;
        if (atan2 < d2) {
            atan2 += 360.0d;
        }
        double d23 = atan2;
        double d24 = d23 * 0.017453292519943295d;
        double pow4 = Math.pow((d22 * gs5Var.c) / d8, gs5Var.j * d7) * 100.0d;
        double d25 = pow4 / 100.0d;
        Math.sqrt(d25);
        double d26 = d8 + 4.0d;
        double pow5 = Math.pow((Math.hypot(d19, p2) * (((((Math.cos(((d23 < 20.14d ? d23 + 360.0d : d23) * 0.017453292519943295d) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * gs5Var.f) * gs5Var.d)) / (d21 + 0.305d), 0.9d) * Math.pow(1.64d - Math.pow(0.29d, gs5Var.a), 0.73d);
        double sqrt = Math.sqrt(d25) * pow5;
        Math.sqrt((pow5 * d7) / d26);
        double log1p = Math.log1p(sqrt * d6 * 0.0228d) * 43.859649122807014d;
        return new a10(d23, sqrt, pow4, (1.7000000000000002d * pow4) / ((0.007d * pow4) + 1.0d), Math.cos(d24) * log1p, Math.sin(d24) * log1p);
    }

    public q2 A(r2 r2Var) {
        q2 q2Var;
        q2 q2Var2 = q2.c;
        synchronized (r2Var) {
            try {
                q2Var = r2Var.K;
                if (q2Var != q2Var2) {
                    r2Var.K = q2Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q2Var;
    }

    public void U(q2 q2Var, q2 q2Var2) {
        q2Var.b = q2Var2;
    }

    public void V(q2 q2Var, Thread thread) {
        q2Var.a = thread;
    }

    public int a(int i2, int i3, da2 da2Var) {
        return Math.round((1.0f - 1.0f) * ((i2 - i3) / 2.0f));
    }

    public boolean h(r2 r2Var, i2 i2Var, i2 i2Var2) {
        synchronized (r2Var) {
            try {
                if (r2Var.J != i2Var) {
                    return false;
                }
                r2Var.J = i2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean i(r2 r2Var, Object obj, Object obj2) {
        synchronized (r2Var) {
            try {
                if (r2Var.I != obj) {
                    return false;
                }
                r2Var.I = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean j(r2 r2Var, q2 q2Var, q2 q2Var2) {
        synchronized (r2Var) {
            try {
                if (r2Var.K != q2Var) {
                    return false;
                }
                r2Var.K = q2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public i2 z(r2 r2Var) {
        i2 i2Var;
        i2 i2Var2 = i2.d;
        synchronized (r2Var) {
            try {
                i2Var = r2Var.J;
                if (i2Var != i2Var2) {
                    r2Var.J = i2Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2Var;
    }
}
