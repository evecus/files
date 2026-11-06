package defpackage;

import android.graphics.Typeface;
import androidx.media3.common.C;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bc5 extends ac5 {
    @Override // defpackage.ac5
    public final Typeface L(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.m, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.s.invoke(null, newInstance, C.SANS_SERIF_NAME, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            zl1.k(e);
            return null;
        }
    }

    @Override // defpackage.ac5
    public final Method O(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
