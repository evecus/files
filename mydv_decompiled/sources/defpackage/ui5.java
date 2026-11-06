package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class ui5 {
    public final yp a;
    public final yp b;
    public final yp c;

    public ui5(yp ypVar, yp ypVar2, yp ypVar3) {
        this.a = ypVar;
        this.b = ypVar2;
        this.c = ypVar3;
    }

    public abstract vi5 a();

    public final Class b(Class cls) {
        String name = cls.getName();
        yp ypVar = this.c;
        Class cls2 = (Class) ypVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        ypVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        yp ypVar = this.a;
        Method method = (Method) ypVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, ui5.class.getClassLoader()).getDeclaredMethod("read", ui5.class);
        ypVar.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method d(Class cls) {
        String name = cls.getName();
        yp ypVar = this.b;
        Method method = (Method) ypVar.get(name);
        if (method != null) {
            return method;
        }
        Class b = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b.getDeclaredMethod("write", cls, ui5.class);
        ypVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((vi5) this).e.readParcelable(vi5.class.getClassLoader());
    }

    public final wi5 g() {
        String readString = ((vi5) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (wi5) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e) {
            s83.p("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            s83.p("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            s83.p("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            s83.p("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    public abstract void h(int i);

    public final void i(wi5 wi5Var) {
        if (wi5Var == null) {
            ((vi5) this).e.writeString(null);
            return;
        }
        try {
            ((vi5) this).e.writeString(b(wi5Var.getClass()).getName());
            vi5 a = a();
            try {
                d(wi5Var.getClass()).invoke(null, wi5Var, a);
                Parcel parcel = a.e;
                int i = a.i;
                if (i >= 0) {
                    int i2 = a.d.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                s83.p("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                s83.p("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                s83.p("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                s83.p("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            s83.p(wi5Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
