package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class uj4 implements SerialDescriptor, p00 {
    public final String a;
    public final qi4 b;
    public final int c;
    public final HashSet d;
    public final String[] e;
    public final SerialDescriptor[] f;
    public final List[] g;
    public final boolean[] h;
    public final Map i;
    public final SerialDescriptor[] j;
    public final u05 k;

    public uj4(String str, qi4 qi4Var, int i, List list, l60 l60Var) {
        this.a = str;
        this.b = qi4Var;
        this.c = i;
        ArrayList arrayList = l60Var.b;
        this.d = o70.p1(arrayList);
        byte b = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.e = strArr;
        this.f = qb.z(l60Var.d);
        this.g = (List[]) l60Var.e.toArray(new List[0]);
        ArrayList arrayList2 = l60Var.f;
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        this.h = zArr;
        strArr.getClass();
        jz1 jz1Var = new jz1(new eq(strArr, b));
        ArrayList arrayList3 = new ArrayList(p70.J(jz1Var, 10));
        Iterator it2 = jz1Var.iterator();
        while (true) {
            v2 v2Var = (v2) it2;
            if (!((Iterator) v2Var.K).hasNext()) {
                this.i = sv2.W(arrayList3);
                this.j = qb.z(list);
                this.k = new u05(new q94(this, (byte) 5));
                return;
            }
            iz1 iz1Var = (iz1) v2Var.next();
            arrayList3.add(new uj3(iz1Var.b(), Integer.valueOf(iz1Var.a())));
        }
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.a;
    }

    @Override // defpackage.p00
    public final Set b() {
        return this.d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final qi4 e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof uj4) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.a.equals(serialDescriptor.a()) && Arrays.equals(this.j, ((uj4) obj).j)) {
                int f = serialDescriptor.f();
                int i2 = this.c;
                if (i2 == f) {
                    for (0; i < i2; i + 1) {
                        SerialDescriptor[] serialDescriptorArr = this.f;
                        i = (j42.c(serialDescriptorArr[i].a(), serialDescriptor.i(i).a()) && j42.c(serialDescriptorArr[i].e(), serialDescriptor.i(i).e())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return this.c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i) {
        return this.e[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return o91.I;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i) {
        return this.g[i];
    }

    public final int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor i(int i) {
        return this.f[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i) {
        return this.h[i];
    }

    public final String toString() {
        return mu0.W(this);
    }
}
