package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ti4 {
    public final ki4 a;
    public final r33 b;

    public ti4(si4 si4Var, p22 p22Var) {
        List i;
        this.a = si4Var.d;
        i = si4Var.i((r4 & 1) != 0 ? !si4Var.b : false, (r4 & 2) == 0);
        this.b = new r33(i.size());
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            si4 si4Var2 = (si4) i.get(i2);
            if (p22Var.a(si4Var2.f)) {
                this.b.a(si4Var2.f);
            }
        }
    }
}
