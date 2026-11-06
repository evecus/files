package defpackage;

import com.github.mytv.dv.model.LiveRoom;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pn2 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ t43 J;
    public final /* synthetic */ hk3 K;
    public final /* synthetic */ t43 L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ t43 O;
    public final /* synthetic */ Object P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;
    public final /* synthetic */ t43 S;
    public final /* synthetic */ Object T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn2(is0 is0Var, hu2 hu2Var, t43 t43Var, hk3 hk3Var, t43 t43Var2, dl0 dl0Var, t43 t43Var3, t43 t43Var4, t43 t43Var5, t43 t43Var6, ki1 ki1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.P = is0Var;
        this.Q = hu2Var;
        this.J = t43Var;
        this.K = hk3Var;
        this.L = t43Var2;
        this.R = dl0Var;
        this.M = t43Var3;
        this.N = t43Var4;
        this.O = t43Var5;
        this.S = t43Var6;
        this.T = ki1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.T;
        Object obj3 = this.R;
        Object obj4 = this.Q;
        Object obj5 = this.P;
        switch (b) {
            case 0:
                s33 s33Var = (s33) this.S;
                s33 s33Var2 = (s33) obj2;
                hk3 hk3Var = this.K;
                t43 t43Var = this.O;
                return new pn2((pq5) obj5, (io2) obj4, this.J, this.L, (s33) obj3, s33Var, this.M, s33Var2, this.N, hk3Var, t43Var, fj0Var);
            default:
                return new pn2((is0) obj5, (hu2) obj4, this.J, this.K, this.L, (dl0) obj3, this.M, this.N, this.O, this.S, (ki1) obj2, fj0Var);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
            case 0:
                ((pn2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            default:
                ((pn2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        byte b2 = 1;
        Object obj2 = this.T;
        Object obj3 = this.R;
        t43 t43Var = this.L;
        hk3 hk3Var = this.K;
        t43 t43Var2 = this.J;
        Object obj4 = this.P;
        Object obj5 = this.Q;
        wd5 wd5Var = wd5.a;
        fj0 fj0Var = null;
        switch (b) {
            case 0:
                mu0.V(obj);
                io2 io2Var = (io2) obj5;
                s33 s33Var = (s33) this.S;
                io2Var.a = null;
                io2Var.b = null;
                io2Var.c = null;
                io2Var.d = null;
                io2Var.e = false;
                Boolean bool = Boolean.FALSE;
                t43Var2.setValue(bool);
                t43Var.setValue(null);
                ((gk3) ((s33) obj3)).i(1);
                gk3 gk3Var = (gk3) s33Var;
                gk3Var.i(gk3Var.h() + 1);
                this.M.setValue(false);
                gk3 gk3Var2 = (gk3) ((s33) obj2);
                gk3Var2.i(gk3Var2.h() + 1);
                un2.d(this.N, false);
                hk3Var.i(0L);
                this.O.setValue(bool);
                ((pq5) obj4).f();
                break;
            default:
                hu2 hu2Var = (hu2) obj5;
                op2 op2Var = hu2Var.n;
                mu0.V(obj);
                int o = ((is0) obj4).o();
                LiveRoom liveRoom = (LiveRoom) o70.V0(o, (List) t43Var2.getValue());
                if (liveRoom != null) {
                    qg5.x(hu2Var, hk3Var);
                    String resolvedRoomId = liveRoom.getResolvedRoomId();
                    t43Var.setValue(Boolean.FALSE);
                    LiveRoom liveRoom2 = (LiveRoom) ((fw4) op2Var.l.I).getValue();
                    if (j42.c(liveRoom2 != null ? liveRoom2.getResolvedRoomId() : null, resolvedRoomId)) {
                        op2Var.p(resolvedRoomId);
                        fw4 fw4Var = op2Var.M;
                        LiveRoom liveRoom3 = (LiveRoom) op2Var.k.getValue();
                        if (liveRoom3 != null) {
                            if (fw4Var.getValue() == null && !jx4.L(liveRoom3.getWebRid())) {
                                fw4Var.i(null, o91.I);
                            }
                            op2Var.q(liveRoom3);
                        }
                    } else {
                        op2Var.D(liveRoom, o);
                    }
                    if (!((Boolean) ((fw4) op2Var.s.I).getValue()).booleanValue()) {
                        qg5.y((dl0) obj3, this.M, this.N, this.O, this.S, (ki1) obj2);
                    }
                    List list = op2Var.e;
                    List list2 = (List) op2Var.t.getValue();
                    int intValue = ((Number) op2Var.f.getValue()).intValue();
                    if (!list2.isEmpty() && intValue >= 0 && intValue < list.size() && o >= list2.size() - 3) {
                        String str = ((go2) list.get(intValue)).a;
                        if (!j42.c(str, "follow")) {
                            p70.g0(o7.B(op2Var), null, null, new eg1(op2Var, str, fj0Var, b2), 3);
                            break;
                        }
                    }
                }
                break;
        }
        return wd5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn2(pq5 pq5Var, io2 io2Var, t43 t43Var, t43 t43Var2, s33 s33Var, s33 s33Var2, t43 t43Var3, s33 s33Var3, t43 t43Var4, hk3 hk3Var, t43 t43Var5, fj0 fj0Var) {
        super(2, fj0Var);
        this.P = pq5Var;
        this.Q = io2Var;
        this.J = t43Var;
        this.L = t43Var2;
        this.R = s33Var;
        this.S = s33Var2;
        this.M = t43Var3;
        this.T = s33Var3;
        this.N = t43Var4;
        this.K = hk3Var;
        this.O = t43Var5;
    }
}
