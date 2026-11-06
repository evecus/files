package defpackage;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class q13 implements j13 {
    public static final int $stable = 0;
    private z12 _inspectorValues;

    @Override // defpackage.l13
    public boolean all(tm1 tm1Var) {
        return ((Boolean) tm1Var.invoke(this)).booleanValue();
    }

    public final z12 c() {
        z12 z12Var = this._inspectorValues;
        if (z12Var != null) {
            return z12Var;
        }
        z12 z12Var2 = new z12();
        z12Var2.d(s24.a(getClass()).c());
        inspectableProperties(z12Var2);
        this._inspectorValues = z12Var2;
        return z12Var2;
    }

    public k13 create() {
        return new sh1();
    }

    @Override // defpackage.l13
    public Object foldIn(Object obj, hn1 hn1Var) {
        return hn1Var.invoke(obj, this);
    }

    public final oj4 getInspectableElements() {
        return c().b();
    }

    public final String getNameFallback() {
        return c().a();
    }

    public final Object getValueOverride() {
        return c().c();
    }

    public void inspectableProperties(z12 z12Var) {
        Object[] declaredFields = getClass().getDeclaredFields();
        xi1 xi1Var = new xi1((byte) 5);
        declaredFields.getClass();
        if (declaredFields.length != 0) {
            declaredFields = Arrays.copyOf(declaredFields, declaredFields.length);
            if (declaredFields.length > 1) {
                Arrays.sort(declaredFields, xi1Var);
            }
        }
        List asList = Arrays.asList(declaredFields);
        asList.getClass();
        int size = asList.size();
        for (int i = 0; i < size; i++) {
            Field field = (Field) asList.get(i);
            if (!field.getDeclaringClass().isAssignableFrom(q13.class)) {
                try {
                    field.setAccessible(true);
                    z12Var.b().b(field.get(this), field.getName());
                } catch (IllegalAccessException | SecurityException unused) {
                }
            }
        }
    }

    @Override // defpackage.l13
    public /* synthetic */ l13 then(l13 l13Var) {
        return hf1.e(this, l13Var);
    }

    public void update(k13 k13Var) {
    }
}
