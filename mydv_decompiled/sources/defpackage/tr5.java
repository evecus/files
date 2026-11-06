package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class tr5 extends vl1 {
    public static tr5 d;
    public static final o63 e = new o63((byte) 21);
    public final Application c;

    public tr5(Application application) {
        super((byte) 2);
        this.c = application;
    }

    @Override // defpackage.vl1, defpackage.ur5
    public final qr5 a(Class cls) {
        Application application = this.c;
        if (application != null) {
            return d(cls, application);
        }
        zy.p("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // defpackage.vl1, defpackage.ur5
    public final qr5 b(Class cls, l33 l33Var) {
        if (this.c != null) {
            return a(cls);
        }
        Application application = (Application) l33Var.a.get(e);
        if (application != null) {
            return d(cls, application);
        }
        if (!rg.class.isAssignableFrom(cls)) {
            return rt0.l(cls);
        }
        s83.t("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final qr5 d(Class cls, Application application) {
        if (!rg.class.isAssignableFrom(cls)) {
            return rt0.l(cls);
        }
        try {
            qr5 qr5Var = (qr5) cls.getConstructor(Application.class).newInstance(application);
            qr5Var.getClass();
            return qr5Var;
        } catch (IllegalAccessException e2) {
            s83.o("Cannot create an instance of ", cls, e2);
            return null;
        } catch (InstantiationException e3) {
            s83.o("Cannot create an instance of ", cls, e3);
            return null;
        } catch (NoSuchMethodException e4) {
            s83.o("Cannot create an instance of ", cls, e4);
            return null;
        } catch (InvocationTargetException e5) {
            s83.o("Cannot create an instance of ", cls, e5);
            return null;
        }
    }
}
