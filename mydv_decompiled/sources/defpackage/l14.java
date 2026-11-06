package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class l14 implements ti2 {
    public final /* synthetic */ byte I;
    public final Object J;

    public /* synthetic */ l14(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // defpackage.ti2
    public final void e(vi2 vi2Var, ji2 ji2Var) {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                w94 w94Var = (w94) obj;
                if (ji2Var != ji2.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                vi2Var.k().b(this);
                Bundle f = w94Var.g().f("androidx.savedstate.Restarter");
                if (f == null) {
                    return;
                }
                ArrayList<String> stringArrayList = f.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    zy.i("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i = 0;
                while (i < size) {
                    String str = stringArrayList.get(i);
                    i++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, l14.class.getClassLoader()).asSubclass(t94.class);
                        asSubclass.getClass();
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                newInstance.getClass();
                                ((mh2) ((t94) newInstance)).a(w94Var);
                            } catch (Exception e) {
                                s83.p(hf1.w("Failed to instantiate ", str2), e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        s83.p(r7.C("Class ", str2, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            case 1:
                nk nkVar = (nk) obj;
                if (nkVar.M == null) {
                    dc0 dc0Var = (dc0) nkVar.getLastNonConfigurationInstance();
                    if (dc0Var != null) {
                        nkVar.M = dc0Var.a;
                    }
                    if (nkVar.M == null) {
                        nkVar.M = new vr5();
                    }
                }
                nkVar.I.b(this);
                return;
            default:
                if (ji2Var != ji2.ON_CREATE) {
                    s83.k(ji2Var, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    vi2Var.k().b(this);
                    ((r94) obj).b();
                    return;
                }
        }
    }
}
