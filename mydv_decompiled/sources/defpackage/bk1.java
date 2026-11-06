package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bk1 implements kh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bk1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.kh0
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ck1 ck1Var = (ck1) obj;
                if (ck1Var == null) {
                    ck1Var = new ck1(-3);
                }
                ((g12) this.b).Q(ck1Var);
                return;
            default:
                ck1 ck1Var2 = (ck1) obj;
                synchronized (dk1.c) {
                    try {
                        oo4 oo4Var = dk1.d;
                        ArrayList arrayList = (ArrayList) oo4Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        oo4Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((kh0) arrayList.get(i)).accept(ck1Var2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
