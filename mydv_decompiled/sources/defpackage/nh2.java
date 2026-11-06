package defpackage;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nh2 implements ti2 {
    public final /* synthetic */ byte I = 0;
    public final Object J;
    public final Object K;

    public nh2(ui2 ui2Var) {
        this.J = ui2Var;
        o60 o60Var = o60.c;
        Class<?> cls = ui2Var.getClass();
        m60 m60Var = (m60) o60Var.a.get(cls);
        this.K = m60Var == null ? o60Var.a(cls, null) : m60Var;
    }

    @Override // defpackage.ti2
    public final void e(vi2 vi2Var, ji2 ji2Var) {
        byte b = this.I;
        Object obj = this.J;
        Object obj2 = this.K;
        switch (b) {
            case 0:
                if (ji2Var == ji2.ON_START) {
                    ((li2) obj).b(this);
                    ((da) obj2).v();
                    break;
                }
                break;
            default:
                ui2 ui2Var = (ui2) obj;
                HashMap hashMap = ((m60) obj2).a;
                m60.a((List) hashMap.get(ji2Var), vi2Var, ji2Var, ui2Var);
                m60.a((List) hashMap.get(ji2.ON_ANY), vi2Var, ji2Var, ui2Var);
                break;
        }
    }

    public nh2(da daVar, li2 li2Var) {
        this.J = li2Var;
        this.K = daVar;
    }
}
