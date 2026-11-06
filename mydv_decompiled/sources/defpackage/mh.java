package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class mh implements zx0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mh(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.zx0
    public final void dispose() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((gt4) obj3).remove(obj2);
                ((ai) obj).d.k(obj2);
                break;
            case 1:
                ((vi2) obj3).k().b((ri2) obj2);
                vr3 vr3Var = (vr3) ((r24) obj).I;
                if (vr3Var != null) {
                    vr3Var.a();
                    break;
                }
                break;
            default:
                h94 h94Var = (h94) obj3;
                m94 m94Var = (m94) obj;
                if (h94Var.J.k(obj2) == m94Var) {
                    Map map = h94Var.I;
                    Map d = m94Var.d();
                    if (!d.isEmpty()) {
                        map.put(obj2, d);
                        break;
                    } else {
                        map.remove(obj2);
                        break;
                    }
                }
                break;
        }
    }
}
