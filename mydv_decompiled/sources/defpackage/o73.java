package defpackage;

import android.os.Bundle;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class o73 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ r24 J;

    public /* synthetic */ o73(r24 r24Var, byte b) {
        this.I = b;
        this.J = r24Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        r24 r24Var = this.J;
        switch (b) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Object obj2 = r24Var.I;
                return Boolean.valueOf(obj2 == null || !((Bundle) obj2).containsKey(str));
            default:
                la5 la5Var = (la5) obj;
                la5Var.getClass();
                bf2 bf2Var = ((na5) la5Var).I;
                List list = (List) r24Var.I;
                if (list != null) {
                    list.add(bf2Var);
                } else {
                    list = p70.n0(bf2Var);
                }
                r24Var.I = list;
                return ka5.J;
        }
    }
}
