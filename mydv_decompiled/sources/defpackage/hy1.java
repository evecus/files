package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class hy1 {
    public Object[] a;
    public int b = 0;
    public gy1 c;

    public hy1(int i) {
        this.a = new Object[i * 2];
    }

    public final c34 a(boolean z) {
        gy1 gy1Var;
        gy1 gy1Var2;
        if (z && (gy1Var2 = this.c) != null) {
            throw gy1Var2.a();
        }
        c34 e = c34.e(this.b, this.a, this);
        if (!z || (gy1Var = this.c) == null) {
            return e;
        }
        throw gy1Var.a();
    }

    public final void b(Object obj, Object obj2) {
        int i = (this.b + 1) * 2;
        Object[] objArr = this.a;
        if (i > objArr.length) {
            this.a = Arrays.copyOf(objArr, ux1.b(objArr.length, i));
        }
        j42.k(obj, obj2);
        Object[] objArr2 = this.a;
        int i2 = this.b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
    }

    public final void c(Set set) {
        if (set instanceof Collection) {
            int size = (set.size() + this.b) * 2;
            Object[] objArr = this.a;
            if (size > objArr.length) {
                this.a = Arrays.copyOf(objArr, ux1.b(objArr.length, size));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            b(entry.getKey(), entry.getValue());
        }
    }
}
