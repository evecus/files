package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@t83("navigation")
/* loaded from: classes.dex */
public class p73 extends u83 {
    public final v83 c;

    public p73(v83 v83Var) {
        v83Var.getClass();
        this.c = v83Var;
    }

    @Override // defpackage.u83
    public final void d(List list, d83 d83Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p63 p63Var = (p63) it.next();
            i73 i73Var = p63Var.J;
            i73Var.getClass();
            k73 k73Var = (k73) i73Var;
            c8 c8Var = k73Var.J;
            r24 r24Var = new r24();
            r24Var.I = p63Var.P.a();
            n73 n73Var = k73Var.N;
            int i = n73Var.c;
            String str = n73Var.e;
            if (i == 0 && str == null) {
                c8Var.getClass();
                String valueOf = String.valueOf(c8Var.b);
                valueOf.getClass();
                if (n73Var.a.J.b == 0) {
                    valueOf = "the root navigation";
                }
                zy.e("no start destination defined via app:startDestination for ".concat(valueOf));
                return;
            }
            i73 b = str != null ? n73Var.b(str, false) : (i73) qb.y(n73Var.b, i);
            if (b == null) {
                String str2 = n73Var.d;
                if (str2 == null) {
                    str2 = n73Var.e;
                    if (str2 == null) {
                        str2 = String.valueOf(n73Var.c);
                    }
                    n73Var.d = str2;
                }
                str2.getClass();
                s83.t(r7.C("navigation destination ", str2, " is not a direct child of this NavGraph"));
                return;
            }
            c8 c8Var2 = b.J;
            if (str != null) {
                if (!str.equals((String) c8Var2.f)) {
                    h73 z = c8Var2.z(str);
                    Bundle bundle = z != null ? z.J : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle b0 = i42.b0((uj3[]) Arrays.copyOf(new uj3[0], 0));
                        b0.putAll(bundle);
                        Bundle bundle2 = (Bundle) r24Var.I;
                        if (bundle2 != null) {
                            b0.putAll(bundle2);
                        }
                        r24Var.I = b0;
                    }
                }
                if (b.d().isEmpty()) {
                    continue;
                } else {
                    ArrayList N = sv2.N(b.d(), new o73(r24Var, (byte) 0));
                    if (!N.isEmpty()) {
                        zl1.h("Cannot navigate to startDestination ", b, ". Missing required arguments [", N, 93);
                        return;
                    }
                }
            }
            this.c.b(b.I).d(p70.j0(b().b(b, b.c((Bundle) r24Var.I))), d83Var);
        }
    }

    @Override // defpackage.u83
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public k73 a() {
        return new k73(this);
    }
}
