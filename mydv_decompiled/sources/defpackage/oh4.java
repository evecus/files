package defpackage;

import android.view.View;
import android.view.ViewParent;
import androidx.media3.common.util.Log;
import com.github.mytv.dv.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class oh4 {
    public static hx1 a;

    public static final void a(fe0 fe0Var, l13 l13Var) {
        ox oxVar = ox.f;
        go1 go1Var = (go1) fe0Var;
        long j = go1Var.T;
        int i = (int) (j ^ (j >>> 32));
        l13 x0 = i42.x0(fe0Var, l13Var);
        am3 m = go1Var.m();
        xd0.c.getClass();
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.h0();
        if (go1Var2.S) {
            go1Var2.l(wa2.A0);
        } else {
            go1Var2.r0();
        }
        qi4.k(fe0Var, q8.c0, oxVar);
        qi4.k(fe0Var, q8.b0, m);
        qi4.j(fe0Var);
        qi4.k(fe0Var, q8.a0, x0);
        qi4.k(fe0Var, q8.d0, Integer.valueOf(i));
        go1Var2.q(true);
    }

    public static final c8 b(i62 i62Var, String str) {
        i62Var.getClass();
        str.getClass();
        return new c8(str, i62Var.a);
    }

    public static final int c(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void d(long j) {
        q65[] q65VarArr = p65.b;
        if ((j & 1095216660480L) == 0) {
            s02.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final String e(String str, Throwable th) {
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        String obj = jx4.g0(jx4.c0(message, '\n')).toString();
        return jx4.D(obj, "互动安全凭据", false) ? "请先在设置中补充互动安全凭据" : jx4.D(obj, "403", false) ? str.concat("失败，请检查 Cookie 或互动安全凭据") : jx4.L(obj) ? str.concat("失败") : r7.C(str, "失败：", jx4.f0(40, obj));
    }

    public static final ViewParent f(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final lh4 g(Object obj) {
        if (obj != qb.d) {
            return (lh4) obj;
        }
        zy.i("Does not contain segment");
        return null;
    }

    public static final hx1 h() {
        hx1 hx1Var = a;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.SkipNext", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(6.0f, 18.0f);
        epVar.y(8.5f, -6.0f);
        epVar.x(6.0f, 6.0f);
        epVar.M(12.0f);
        epVar.p();
        epVar.z(16.0f, 6.0f);
        epVar.M(12.0f);
        epVar.v(2.0f);
        epVar.L(6.0f);
        epVar.v(-2.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b = gx1Var.b();
        a = b;
        return b;
    }

    public static final long i(double d) {
        return p(4294967296L, (float) d);
    }

    public static final long j(int i) {
        return p(4294967296L, i);
    }

    public static final int k(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Object[] l(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        dq.T0(0, i, 6, objArr, objArr2);
        dq.Q0(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final boolean m(Object obj) {
        return obj == qb.d;
    }

    public static pj4 n(hn1 hn1Var) {
        pj4 pj4Var = new pj4();
        pj4Var.c(mu0.n(pj4Var, pj4Var, hn1Var));
        return pj4Var;
    }

    public static final ro0 o(float f) {
        Object obj;
        za1 za1Var = ro0.L;
        v2 o = hf1.o(za1Var, za1Var);
        if (o.hasNext()) {
            Object next = o.next();
            if (o.hasNext()) {
                float abs = Math.abs(((ro0) next).I - f);
                do {
                    Object next2 = o.next();
                    float abs2 = Math.abs(((ro0) next2).I - f);
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (o.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        ro0 ro0Var = (ro0) obj;
        return ro0Var == null ? ro0.J : ro0Var;
    }

    public static final long p(long j, float f) {
        long floatToRawIntBits = j | (Float.floatToRawIntBits(f) & 4294967295L);
        q65[] q65VarArr = p65.b;
        return floatToRawIntBits;
    }

    public static final Object[] q(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        dq.T0(0, i, 6, objArr, objArr2);
        dq.Q0(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] r(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        dq.T0(0, i, 6, objArr, objArr2);
        dq.Q0(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object s(ya4 ya4Var, boolean z, Object obj, hn1 hn1Var) {
        Object ub0Var;
        Object T;
        try {
            if (hn1Var instanceof fu) {
                p70.A(2, hn1Var);
                ub0Var = hn1Var.invoke(obj, ya4Var);
            } else {
                ub0Var = mu0.Y(hn1Var, obj, ya4Var);
            }
        } catch (mx0 e) {
            Throwable th = e.I;
            ya4Var.S(new ub0(th, false));
            throw th;
        } catch (Throwable th2) {
            ub0Var = new ub0(th2, false);
        }
        el0 el0Var = el0.I;
        if (ub0Var == el0Var || (T = ya4Var.T(ub0Var)) == p70.r) {
            return el0Var;
        }
        ya4Var.i0();
        if (!(T instanceof ub0)) {
            return p70.B0(T);
        }
        if (!z) {
            Throwable th3 = ((ub0) T).a;
            if ((th3 instanceof v75) && ((v75) th3).I == ya4Var) {
                if (ub0Var instanceof ub0) {
                    throw ((ub0) ub0Var).a;
                }
                return ub0Var;
            }
        }
        throw ((ub0) T).a;
    }

    public static final long t(String str, long j, long j2, long j3) {
        String str2;
        int i = h15.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long B = qx4.B(str2);
        if (B == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = B.longValue();
        if (j2 <= longValue && longValue <= j3) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
    }

    public static int u(int i, int i2, String str) {
        return (int) t(str, i, 1L, (i2 & 8) != 0 ? Log.LOG_LEVEL_OFF : 2097150);
    }

    public static final w12 v(o12 o12Var) {
        return new w12(o12Var.a, o12Var.b, o12Var.c, o12Var.d);
    }
}
