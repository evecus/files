package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class wo1 implements Cloneable {
    public final ap1 I;
    public ap1 J;

    public wo1(ap1 ap1Var) {
        this.I = ap1Var;
        if (ap1Var.g()) {
            s83.t("Default instance must be immutable.");
            throw null;
        }
        this.J = ap1Var.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(List list, n32 n32Var) {
        Charset charset = p32.a;
        if (list instanceof jt3) {
            n32Var.addAll(list);
            return;
        }
        if (n32Var instanceof ArrayList) {
            ((ArrayList) n32Var).ensureCapacity(list.size() + n32Var.size());
        }
        int size = n32Var.size();
        for (Object obj : list) {
            if (obj == null) {
                String str = "Element at index " + (n32Var.size() - size) + " is null.";
                for (int size2 = n32Var.size() - 1; size2 >= size; size2--) {
                    n32Var.remove(size2);
                }
                zy.m(str);
                return;
            }
            n32Var.add(obj);
        }
    }

    public static void e(Object obj, Object obj2) {
        sx3 sx3Var = sx3.c;
        sx3Var.getClass();
        sx3Var.a(obj.getClass()).d(obj, obj2);
    }

    public final ap1 b() {
        ap1 c = c();
        c.getClass();
        if (ap1.f(c, true)) {
            return c;
        }
        throw new ud5();
    }

    public final ap1 c() {
        boolean g = this.J.g();
        ap1 ap1Var = this.J;
        if (!g) {
            return ap1Var;
        }
        ap1Var.getClass();
        sx3 sx3Var = sx3.c;
        sx3Var.getClass();
        sx3Var.a(ap1Var.getClass()).a(ap1Var);
        ap1Var.h();
        return this.J;
    }

    public final Object clone() {
        wo1 wo1Var = (wo1) this.I.c(5);
        wo1Var.J = c();
        return wo1Var;
    }

    public final void d() {
        if (this.J.g()) {
            return;
        }
        ap1 i = this.I.i();
        e(i, this.J);
        this.J = i;
    }
}
