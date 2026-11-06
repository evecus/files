package defpackage;

import android.os.Trace;
import com.github.mytv.dv.model.Comment;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ke implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    public /* synthetic */ ke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
        this.L = obj3;
        this.M = obj4;
        this.N = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.String] */
    @Override // defpackage.rm1
    public final Object invoke() {
        List list;
        byte b = this.I;
        boolean z = false;
        wd5 wd5Var = wd5.a;
        Object obj = this.N;
        Object obj2 = this.M;
        Object obj3 = this.L;
        Object obj4 = this.K;
        Object obj5 = this.J;
        switch (b) {
            case 0:
                ((vq3) obj5).o((rm1) obj4, (zq3) obj3, (String) obj2, (da2) obj);
                return wd5Var;
            case 1:
                Comment comment = (Comment) obj5;
                ?? r0 = ((db0) obj4).a;
                Set set = (Set) obj3;
                tm1 tm1Var = (tm1) obj2;
                t43 t43Var = (t43) obj;
                if (comment.getReplyCommentTotal() > 0) {
                    boolean c = j42.c((String) t43Var.getValue(), r0);
                    t43Var.setValue(c ? null : r0);
                    if (!c && comment.getReplyComments() == null && !set.contains(comment.getCid())) {
                        tm1Var.invoke(comment);
                    }
                }
                return wd5Var;
            case 2:
                List list2 = (List) obj4;
                t43 t43Var2 = (t43) obj3;
                cw4 cw4Var = (cw4) obj2;
                t43 t43Var3 = (t43) obj;
                vf2 vf2Var = (vf2) o70.b1(((ag2) obj5).h().l);
                int i = vf2Var != null ? vf2Var.a : -1;
                go2 go2Var = (go2) o70.V0(((Number) t43Var2.getValue()).intValue(), list2);
                String str = go2Var != null ? go2Var.a : null;
                dn2 dn2Var = str != null ? (dn2) ((Map) cw4Var.getValue()).get(str) : null;
                int size = (dn2Var == null || (list = dn2Var.b) == null) ? 0 : list.size();
                boolean z2 = ((Boolean) t43Var3.getValue()).booleanValue() || (dn2Var != null && dn2Var.c);
                if (i >= size - 3 && size > 0 && dn2Var != null && dn2Var.d && !dn2Var.f && !z2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                hu2 hu2Var = (hu2) obj5;
                t43 t43Var4 = (t43) obj;
                ((t43) obj4).setValue("");
                ((t43) obj3).setValue("");
                ((t43) obj2).setValue("");
                rv4 rv4Var = hu2Var.C;
                if (rv4Var != null) {
                    rv4Var.e(null);
                }
                hu2Var.C = null;
                String i2 = hu2Var.d.i();
                fl4 fl4Var = hu2Var.h.b;
                fl4Var.H("");
                fl4Var.b();
                fw4 fw4Var = hu2Var.x;
                fw4Var.i(null, sv2.M(i2, (Map) fw4Var.getValue()));
                hu2Var.p.r();
                qm4.m(t43Var4, false);
                return wd5Var;
            default:
                dy4 dy4Var = (dy4) obj5;
                iu0 iu0Var = (iu0) obj4;
                ey4 ey4Var = (ey4) obj3;
                ey4 ey4Var2 = (ey4) obj2;
                p24 p24Var = (p24) obj;
                q44 q44Var = dy4Var.M;
                ux4 ux4Var = dy4Var.L;
                q44Var.getClass();
                Trace.beginSection("Compose:Styles:build");
                try {
                    q44Var.J = dy4Var;
                    q44Var.I = iu0Var.getDensity();
                    ey4 ey4Var3 = q44Var.K;
                    ey4 ey4Var4 = q44Var.L;
                    if (ey4Var4 != null) {
                        fy4.n.f(ey4Var4);
                    } else {
                        ey4Var4 = new ey4();
                    }
                    q44Var.K = ey4Var4;
                    q44Var.L = ey4Var3;
                    q44Var.Q = null;
                    ux4Var.a(q44Var);
                    q44Var.b();
                    Trace.endSection();
                    q44Var.h(0, ey4Var);
                    dy4Var.N = ey4Var;
                    dy4Var.O = ey4Var2;
                    p24Var.I = q44Var.d();
                    return wd5Var;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
        }
    }
}
