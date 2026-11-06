package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ze2 {
    public final int a;
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ bf2 c;

    public ze2(bf2 bf2Var, int i) {
        this.c = bf2Var;
        this.a = i;
    }

    public final void a(int i) {
        bf2 bf2Var = this.c;
        u92 u92Var = bf2Var.c;
        if (u92Var == null) {
            return;
        }
        this.b.add(new ms3(u92Var, i, bf2Var.b, null));
    }
}
