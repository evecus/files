package androidx.media3.common.util;

import android.os.Looper;
import android.text.TextUtils;
import defpackage.sp0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class Assertions {
    private Assertions() {
    }

    @Deprecated
    @Pure
    public static void checkArgument(boolean z) {
        sp0.o(z);
    }

    @Deprecated
    @Pure
    public static int checkIndex(int i, int i2, int i3) {
        if (i < i2 || i >= i3) {
            throw new IndexOutOfBoundsException();
        }
        return i;
    }

    @Deprecated
    @Pure
    public static void checkMainThread() {
        sp0.A(Looper.myLooper() == Looper.getMainLooper(), "Not in application's main thread");
    }

    @EnsuresNonNull({"#1"})
    @Deprecated
    @Pure
    public static String checkNotEmpty(String str) {
        sp0.o(!TextUtils.isEmpty(str));
        return str;
    }

    @EnsuresNonNull({"#1"})
    @Deprecated
    @Pure
    public static <T> T checkNotNull(T t, Object obj) {
        sp0.w(t, obj);
        return t;
    }

    @Deprecated
    @Pure
    public static void checkState(boolean z) {
        sp0.z(z);
    }

    @EnsuresNonNull({"#1"})
    @Deprecated
    @Pure
    public static <T> T checkStateNotNull(T t, Object obj) {
        sp0.w(t, obj);
        return t;
    }

    @Deprecated
    @Pure
    public static void checkArgument(boolean z, Object obj) {
        sp0.p(z, obj);
    }

    @EnsuresNonNull({"#1"})
    @Deprecated
    @Pure
    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    @Deprecated
    @Pure
    public static void checkState(boolean z, Object obj) {
        sp0.A(z, obj);
    }

    @EnsuresNonNull({"#1"})
    @Deprecated
    @Pure
    public static <T> T checkStateNotNull(T t) {
        t.getClass();
        return t;
    }

    @EnsuresNonNull({"#1"})
    @Deprecated
    @Pure
    public static String checkNotEmpty(String str, Object obj) {
        sp0.p(!TextUtils.isEmpty(str), obj);
        return str;
    }
}
