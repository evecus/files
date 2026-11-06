package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class x94 implements ur5 {
    public final Application a;
    public final tr5 b;
    public final Bundle c;
    public final li2 d;
    public final da e;

    public x94(Application application, nk nkVar, Bundle bundle) {
        tr5 tr5Var;
        this.e = (da) nkVar.L.K;
        this.d = nkVar.I;
        this.c = bundle;
        this.a = application;
        if (application != null) {
            tr5Var = tr5.d;
            if (tr5Var == null) {
                tr5Var = new tr5(application);
                tr5.d = tr5Var;
            }
        } else {
            tr5Var = new tr5(null);
        }
        this.b = tr5Var;
    }

    @Override // defpackage.ur5
    public final qr5 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        s83.t("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.ur5
    public final qr5 b(Class cls, l33 l33Var) {
        o63 o63Var = i42.q;
        LinkedHashMap linkedHashMap = l33Var.a;
        String str = (String) linkedHashMap.get(o63Var);
        if (str == null) {
            zy.i("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(qb.l) == null || linkedHashMap.get(qb.m) == null) {
            if (this.d != null) {
                return d(cls, str);
            }
            zy.i("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(tr5.e);
        boolean isAssignableFrom = rg.class.isAssignableFrom(cls);
        Constructor a = (!isAssignableFrom || application == null) ? y94.a(cls, y94.b) : y94.a(cls, y94.a);
        return a == null ? this.b.b(cls, l33Var) : (!isAssignableFrom || application == null) ? y94.b(cls, a, qb.C(l33Var)) : y94.b(cls, a, application, qb.C(l33Var));
    }

    @Override // defpackage.ur5
    public final qr5 c(k60 k60Var, l33 l33Var) {
        return b(sv2.B(k60Var), l33Var);
    }

    public final qr5 d(Class cls, String str) {
        n94 n94Var;
        li2 li2Var = this.d;
        if (li2Var == null) {
            zy.p("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean isAssignableFrom = rg.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor a = (!isAssignableFrom || application == null) ? y94.a(cls, y94.b) : y94.a(cls, y94.a);
        if (a == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            vl1 vl1Var = vl1.b;
            if (vl1Var == null) {
                vl1Var = new vl1((byte) 2);
                vl1.b = vl1Var;
            }
            return vl1Var.a(cls);
        }
        da daVar = this.e;
        daVar.getClass();
        Bundle f = daVar.f(str);
        if (f == null) {
            f = this.c;
        }
        if (f == null) {
            n94Var = new n94();
        } else {
            ClassLoader classLoader = n94.class.getClassLoader();
            classLoader.getClass();
            f.setClassLoader(classLoader);
            zu2 zu2Var = new zu2(f.size());
            for (String str2 : f.keySet()) {
                str2.getClass();
                zu2Var.put(str2, f.get(str2));
            }
            n94Var = new n94(zu2Var.b());
        }
        o94 o94Var = new o94(str, n94Var);
        o94Var.g(daVar, li2Var);
        ki2 ki2Var = ((xi2) li2Var).i;
        if (ki2Var == ki2.J || ki2Var.compareTo(ki2.L) >= 0) {
            daVar.v();
        } else {
            li2Var.a(new nh2(daVar, li2Var));
        }
        qr5 b = (!isAssignableFrom || application == null) ? y94.b(cls, a, n94Var) : y94.b(cls, a, application, n94Var);
        b.l("androidx.lifecycle.savedstate.vm.tag", o94Var);
        return b;
    }

    public x94() {
        this.b = new tr5(null);
    }
}
