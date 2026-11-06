package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class l02 {
    public final LinkedHashMap a;

    public l02(byte b) {
        switch (b) {
            case 1:
                this.a = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public void a(k60 k60Var, tm1 tm1Var) {
        tm1Var.getClass();
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.containsKey(k60Var)) {
            s83.h(r7.C("A `initializer` with the same `clazz` has already been added: ", k60Var.b(), "."));
        } else {
            linkedHashMap.put(k60Var, new sr5(k60Var, tm1Var));
        }
    }

    public k02 b() {
        Collection values = this.a.values();
        values.getClass();
        sr5[] sr5VarArr = (sr5[]) values.toArray(new sr5[0]);
        return new k02((sr5[]) Arrays.copyOf(sr5VarArr, sr5VarArr.length));
    }
}
