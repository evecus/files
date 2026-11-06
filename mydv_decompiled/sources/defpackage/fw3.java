package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fw3 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ ag2 J;
    public final /* synthetic */ List K;

    public /* synthetic */ fw3(ag2 ag2Var, List list, byte b) {
        this.I = b;
        this.J = ag2Var;
        this.K = list;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        Integer num = null;
        List list = this.K;
        ag2 ag2Var = this.J;
        switch (b) {
            case 0:
                vf2 vf2Var = (vf2) o70.b1(ag2Var.h().l);
                int i = vf2Var != null ? vf2Var.a : -1;
                int X = p70.X(list) - 2;
                if (X < 0) {
                    X = 0;
                }
                return Boolean.valueOf(i >= X);
            case 1:
                Iterator it = ag2Var.h().l.iterator();
                if (it.hasNext()) {
                    Integer valueOf = Integer.valueOf(((vf2) it.next()).a);
                    while (true) {
                        num = valueOf;
                        while (it.hasNext()) {
                            valueOf = Integer.valueOf(((vf2) it.next()).a);
                            if (num.compareTo(valueOf) < 0) {
                                break;
                            }
                        }
                    }
                }
                return Boolean.valueOf((num != null ? num.intValue() : -1) >= list.size() + (-2));
            default:
                Iterator it2 = ag2Var.h().l.iterator();
                if (it2.hasNext()) {
                    Integer valueOf2 = Integer.valueOf(((vf2) it2.next()).a);
                    while (true) {
                        num = valueOf2;
                        while (it2.hasNext()) {
                            valueOf2 = Integer.valueOf(((vf2) it2.next()).a);
                            if (num.compareTo(valueOf2) < 0) {
                                break;
                            }
                        }
                    }
                }
                return Boolean.valueOf((num != null ? num.intValue() : -1) >= list.size() + (-3));
        }
    }
}
