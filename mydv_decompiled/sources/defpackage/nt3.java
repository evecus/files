package defpackage;

import android.view.View;
import android.view.ViewGroup;
import coil3.SingletonImageLoader;
import coil3.size.Dimension;
import coil3.size.DimensionKt;
import coil3.size.Size;
import coil3.size.ViewSizeResolver;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.EventListener;
import okhttp3.internal.connection.RealCall;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class nt3 {
    public static void a(SSLSocketFactory sSLSocketFactory) {
        sSLSocketFactory.getClass();
    }

    public static Object b(is4 is4Var, kc4 kc4Var, float f, lc4 lc4Var) {
        return is4Var.c(kc4Var, f, eu5.O, lc4Var);
    }

    public static void c(se seVar, ms3 ms3Var) {
        seVar.J.add(new pt3(1, ms3Var));
        if (seVar.K) {
            return;
        }
        seVar.K = true;
        seVar.I.post(seVar);
    }

    public static void d(SSLSocketFactory sSLSocketFactory) {
        sSLSocketFactory.getClass();
    }

    public static Dimension e(int i, int i2, int i3) {
        if (i == -2) {
            return Dimension.Undefined.INSTANCE;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            return Dimension.Pixels.m110boximpl(DimensionKt.Dimension(i4));
        }
        int i5 = i2 - i3;
        if (i5 > 0) {
            return Dimension.Pixels.m110boximpl(DimensionKt.Dimension(i5));
        }
        return null;
    }

    public static Size f(ViewSizeResolver viewSizeResolver) {
        ViewGroup.LayoutParams layoutParams = viewSizeResolver.getView().getLayoutParams();
        Dimension e = e(layoutParams != null ? layoutParams.width : -1, viewSizeResolver.getView().getWidth(), viewSizeResolver.getSubtractPadding() ? viewSizeResolver.getView().getPaddingRight() + viewSizeResolver.getView().getPaddingLeft() : 0);
        if (e == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = viewSizeResolver.getView().getLayoutParams();
        Dimension e2 = e(layoutParams2 != null ? layoutParams2.height : -1, viewSizeResolver.getView().getHeight(), viewSizeResolver.getSubtractPadding() ? viewSizeResolver.getView().getPaddingBottom() + viewSizeResolver.getView().getPaddingTop() : 0);
        if (e2 == null) {
            return null;
        }
        return new Size(e, e2);
    }

    public static /* synthetic */ byte h(int i) {
        byte b = 1;
        if (i != 1) {
            b = 2;
            if (i != 2) {
                if (i == 3) {
                    return (byte) 3;
                }
                throw null;
            }
        }
        return b;
    }

    public static /* synthetic */ int i(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public static int j(m65 m65Var, int i, int i2) {
        return (m65Var.hashCode() + i) * i2;
    }

    public static long k(long j, long j2, long j3, long j4) {
        return (j * j2) + j3 + j4;
    }

    public static x70 l(go1 go1Var, boolean z, long j) {
        go1Var.q(z);
        return new x70(j);
    }

    public static Object m(go1 go1Var, int i, boolean z, ss4 ss4Var) {
        go1Var.d0(i);
        go1Var.q(z);
        return ss4Var.d();
    }

    public static String n(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static /* synthetic */ void o(View view) {
        throw new ClassCastException();
    }

    public static /* synthetic */ void p(AtomicReference atomicReference, Object obj, SingletonImageLoader.Factory factory) {
        while (!atomicReference.compareAndSet(obj, factory) && atomicReference.get() == obj) {
        }
    }

    public static /* synthetic */ boolean q(Object obj, b25 b25Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ey5.b;
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, b25Var, null)) {
            if (atomicReferenceFieldUpdater.get(obj) != b25Var) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean r(List list) {
        return list != null;
    }

    public static /* synthetic */ boolean s(AtomicReference atomicReference, pw5 pw5Var, pw5 pw5Var2) {
        while (!atomicReference.compareAndSet(pw5Var, pw5Var2)) {
            if (atomicReference.get() != pw5Var) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean t(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean u(AtomicReferenceArray atomicReferenceArray, int i, b25 b25Var) {
        while (!atomicReferenceArray.compareAndSet(i, b25Var, null)) {
            if (atomicReferenceArray.get(i) != b25Var) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean v(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, RealCall realCall, Object obj, EventListener eventListener) {
        while (!atomicReferenceFieldUpdater.compareAndSet(realCall, obj, eventListener)) {
            if (atomicReferenceFieldUpdater.get(realCall) != obj) {
                return false;
            }
        }
        return true;
    }

    public static l13 x(l13 l13Var, float f) {
        if (f <= 0.0d) {
            o02.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return l13Var.then(new sc2(f, true));
    }
}
