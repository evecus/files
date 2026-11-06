package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class ac5 extends xb5 {
    public final Class m;
    public final Constructor n;
    public final Method o;
    public final Method p;
    public final Method q;
    public final Method r;
    public final Method s;

    public ac5() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = N(cls2);
            Class<?> cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = O(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.m = cls;
        this.n = constructor;
        this.o = method2;
        this.p = method3;
        this.q = method4;
        this.r = method5;
        this.s = method;
    }

    public static Method N(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final boolean K(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.o.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface L(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.m, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.s.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean M(Object obj) {
        try {
            return ((Boolean) this.q.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method O(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // defpackage.xb5, defpackage.ad4
    public final Typeface g(Context context, fk1 fk1Var, Resources resources, int i) {
        Object obj;
        Method method = this.o;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.g(context, fk1Var, resources, i);
        }
        try {
            obj = this.n.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            gk1[] gk1VarArr = fk1Var.a;
            int length = gk1VarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    gk1 gk1Var = gk1VarArr[i2];
                    String str = gk1Var.a;
                    int i3 = gk1Var.e;
                    int i4 = gk1Var.b;
                    boolean z = gk1Var.c;
                    FontVariationAxis[] fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(gk1Var.d);
                    ac5 ac5Var = this;
                    Context context2 = context;
                    if (ac5Var.K(context2, obj, str, i3, i4, z ? 1 : 0, fromFontVariationSettings)) {
                        i2++;
                        this = ac5Var;
                        context = context2;
                    } else {
                        try {
                            ac5Var.r.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else {
                    ac5 ac5Var2 = this;
                    if (ac5Var2.M(obj)) {
                        return ac5Var2.L(obj);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.xb5, defpackage.ad4
    public final Typeface h(Context context, sk1[] sk1VarArr, int i) {
        Object obj;
        Typeface L;
        boolean z;
        if (sk1VarArr.length >= 1) {
            Method method = this.o;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (sk1 sk1Var : sk1VarArr) {
                        if (sk1Var.f == 0) {
                            Uri uri = sk1Var.a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, kb4.S(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = DesugarCollections.unmodifiableMap(hashMap);
                    try {
                        obj = this.n.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = sk1VarArr.length;
                        int i2 = 0;
                        boolean z2 = false;
                        while (true) {
                            Method method2 = this.r;
                            if (i2 < length) {
                                sk1 sk1Var2 = sk1VarArr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(sk1Var2.a);
                                if (byteBuffer != null) {
                                    try {
                                        z = ((Boolean) this.p.invoke(obj, byteBuffer, Integer.valueOf(sk1Var2.b), null, Integer.valueOf(sk1Var2.c), Integer.valueOf(sk1Var2.d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z = false;
                                    }
                                    if (!z) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z2 = true;
                                }
                                i2++;
                                z2 = z2;
                            } else if (!z2) {
                                method2.invoke(obj, null);
                            } else if (M(obj) && (L = L(obj)) != null) {
                                return Typeface.create(L, i);
                            }
                        }
                    }
                } else {
                    sk1 n = ad4.n(sk1VarArr, i);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(n.a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(n.c).setItalic(n.d).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    } else if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // defpackage.ad4
    public final Typeface j(Context context, Resources resources, int i, String str, int i2) {
        Object obj;
        Method method = this.o;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.j(context, resources, i, str, i2);
        }
        try {
            obj = this.n.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!K(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.r.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (M(obj)) {
                return L(obj);
            }
        }
        return null;
    }
}
