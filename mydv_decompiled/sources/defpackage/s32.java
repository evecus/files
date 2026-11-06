package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class s32 {
    public final bs2 a;
    public final g12 b;
    public boolean c;

    public s32(bs2 bs2Var, g12 g12Var) {
        this.a = bs2Var;
        this.b = g12Var;
    }

    public final boolean a(long j) {
        Object obj;
        ArrayList arrayList = (ArrayList) this.b.w();
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            if (rt0.p(((tp3) obj).d(), j)) {
                break;
            }
            i++;
        }
        tp3 tp3Var = (tp3) obj;
        if (tp3Var != null) {
            return tp3Var.a();
        }
        return false;
    }
}
