package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class jt extends ee3 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jt(Object obj, byte b) {
        super(false);
        this.d = b;
        this.e = obj;
    }

    @Override // defpackage.ee3
    public void a() {
        switch (this.d) {
            case 0:
                ((qd0) this.e).b();
                break;
        }
    }

    @Override // defpackage.ee3
    public final void b() {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((qd0) obj).c();
                return;
            case 1:
                tl1 tl1Var = (tl1) obj;
                tl1Var.e(true);
                if (!tl1Var.g.b) {
                    tl1Var.f.b().a();
                    return;
                }
                tl1Var.e(false);
                tl1Var.d(true);
                ArrayList arrayList = tl1Var.B;
                ArrayList arrayList2 = tl1Var.C;
                ArrayList arrayList3 = tl1Var.d;
                int size = (arrayList3 == null || arrayList3.isEmpty()) ? -1 : tl1Var.d.size() - 1;
                if (size >= 0) {
                    for (int size2 = tl1Var.d.size() - 1; size2 >= size; size2--) {
                        arrayList.add((mt) tl1Var.d.remove(size2));
                        arrayList2.add(Boolean.TRUE);
                    }
                    tl1Var.b = true;
                    try {
                        tl1Var.j(tl1Var.B, tl1Var.C);
                    } finally {
                        tl1Var.a();
                    }
                }
                tl1Var.k();
                ((HashMap) tl1Var.c.K).values().removeAll(Collections.singleton(null));
                return;
            default:
                ((q73) obj).b();
                return;
        }
    }

    @Override // defpackage.ee3
    public void c(gt gtVar) {
        switch (this.d) {
            case 0:
                iz izVar = ((qd0) this.e).e;
                if (izVar != null) {
                    izVar.d(gtVar);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ee3
    public void d(gt gtVar) {
        switch (this.d) {
            case 0:
                ((qd0) this.e).d();
                break;
        }
    }
}
