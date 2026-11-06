package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yb5 extends ad4 {
    public static final Class h;
    public static final Constructor i;
    public static final Method j;
    public static final Method k;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        i = constructor;
        h = cls;
        j = method2;
        k = method;
    }

    public static boolean I(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z) {
        try {
            return ((Boolean) j.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface J(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) k.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean K() {
        Method method = j;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    @Override // defpackage.ad4
    public final Typeface g(Context context, fk1 fk1Var, Resources resources, int i2) {
        Object obj;
        int i3;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (gk1 gk1Var : fk1Var.a) {
                int i4 = gk1Var.f;
                File C = kb4.C(context);
                if (C != null) {
                    try {
                        if (kb4.m(C, resources, i4)) {
                            try {
                                fileInputStream = new FileInputStream(C);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                i3 = (mappedByteBuffer != null && I(obj, mappedByteBuffer, gk1Var.e, gk1Var.b, gk1Var.c)) ? i3 + 1 : 0;
                            } finally {
                            }
                        }
                    } finally {
                        C.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return J(obj);
        }
        return null;
    }

    @Override // defpackage.ad4
    public final Typeface h(Context context, sk1[] sk1VarArr, int i2) {
        Object obj;
        try {
            obj = i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i3 = 0;
            oo4 oo4Var = new oo4(0);
            int length = sk1VarArr.length;
            while (true) {
                if (i3 < length) {
                    sk1 sk1Var = sk1VarArr[i3];
                    Uri uri = sk1Var.a;
                    ByteBuffer byteBuffer = (ByteBuffer) oo4Var.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = kb4.S(context, uri);
                        oo4Var.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !I(obj, byteBuffer, sk1Var.b, sk1Var.c, sk1Var.d)) {
                        break;
                    }
                    i3++;
                } else {
                    Typeface J = J(obj);
                    if (J != null) {
                        return Typeface.create(J, i2);
                    }
                }
            }
        }
        return null;
    }
}
