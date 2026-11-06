package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ho implements zx0 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ p63 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public ho(sw0 sw0Var, p63 p63Var, gt4 gt4Var) {
        this.c = sw0Var;
        this.b = p63Var;
        this.d = gt4Var;
    }

    @Override // defpackage.zx0
    public final void dispose() {
        byte b = this.a;
        Object obj = this.d;
        p63 p63Var = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                Iterable iterable = (Iterable) ((fw4) ((q73) obj2).b.h.I).getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (j42.c((p63) it.next(), p63Var)) {
                            break;
                        }
                    }
                }
                ((hu2) obj).p.q();
                break;
            default:
                ((sw0) obj2).b().c(p63Var);
                ((gt4) obj).remove(p63Var);
                break;
        }
    }

    public ho(q73 q73Var, hu2 hu2Var, p63 p63Var) {
        this.c = q73Var;
        this.d = hu2Var;
        this.b = p63Var;
    }
}
