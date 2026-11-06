package defpackage;

import com.github.mytv.dv.model.LiveRoom;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pm2 implements jn1 {
    public final /* synthetic */ List I;
    public final /* synthetic */ String J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ ki1 M;
    public final /* synthetic */ ki1 N;
    public final /* synthetic */ hn1 O;
    public final /* synthetic */ t43 P;

    public pm2(List list, String str, boolean z, boolean z2, ki1 ki1Var, ki1 ki1Var2, hn1 hn1Var, t43 t43Var) {
        this.I = list;
        this.J = str;
        this.K = z;
        this.L = z2;
        this.M = ki1Var;
        this.N = ki1Var2;
        this.O = hn1Var;
        this.P = t43Var;
    }

    @Override // defpackage.jn1
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        zd2 zd2Var = (zd2) obj;
        int intValue = ((Number) obj2).intValue();
        fe0 fe0Var = (fe0) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((go1) fe0Var).g(zd2Var) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((go1) fe0Var).e(intValue) ? 32 : 16;
        }
        boolean z = true;
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 147) != 146)) {
            LiveRoom liveRoom = (LiveRoom) this.I.get(intValue);
            go1Var.d0(474261395);
            String resolvedRoomId = liveRoom.getResolvedRoomId();
            String str = this.J;
            boolean c = j42.c(resolvedRoomId, str);
            ki1 ki1Var = j42.c(liveRoom.getResolvedRoomId(), str) ? this.M : null;
            Object Q = go1Var.Q();
            Object obj5 = de0.a;
            if (Q == obj5) {
                Q = new nm2(this.P, (byte) 0);
                go1Var.o0(Q);
            }
            tm1 tm1Var = (tm1) Q;
            hn1 hn1Var = this.O;
            boolean g = go1Var.g(hn1Var) | go1Var.i(liveRoom);
            int i2 = i & 112;
            if (((i2 ^ 48) <= 32 || !go1Var.e(intValue)) && (i & 48) != 32) {
                z = false;
            }
            boolean z2 = g | z;
            Object Q2 = go1Var.Q();
            if (z2 || Q2 == obj5) {
                Q2 = new om2(hn1Var, liveRoom, intValue);
                go1Var.o0(Q2);
            }
            eu5.k(liveRoom, intValue, c, this.K, this.L, ki1Var, this.N, tm1Var, (rm1) Q2, go1Var, i2 | 14155776 | LiveRoom.$stable);
            go1Var.q(false);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }
}
