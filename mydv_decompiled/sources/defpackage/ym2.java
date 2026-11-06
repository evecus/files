package defpackage;

import com.github.mytv.dv.model.LiveDanmakuMessage;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ym2 implements jn1 {
    public final /* synthetic */ List I;
    public final /* synthetic */ long J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ long L;
    public final /* synthetic */ long M;

    public ym2(List list, long j, boolean z, long j2, long j3) {
        this.I = list;
        this.J = j;
        this.K = z;
        this.L = j2;
        this.M = j3;
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
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 147) != 146)) {
            LiveDanmakuMessage liveDanmakuMessage = (LiveDanmakuMessage) this.I.get(intValue);
            go1Var.d0(-1293264124);
            String obj5 = jx4.g0(liveDanmakuMessage.getContent()).toString();
            if (jx4.L(obj5)) {
                go1Var.d0(-1292362707);
                go1Var.q(false);
            } else {
                go1Var.d0(-1293189167);
                String obj6 = jx4.g0(liveDanmakuMessage.getUserName()).toString();
                boolean f = go1Var.f(liveDanmakuMessage.getMessageId()) | go1Var.g(obj6) | go1Var.g(obj5) | go1Var.f(this.J);
                Object Q = go1Var.Q();
                if (f || Q == de0.a) {
                    mj mjVar = new mj();
                    int length = obj6.length();
                    StringBuilder sb = mjVar.I;
                    if (length > 0) {
                        lj ljVar = new lj(new yt4(this.J, 0L, qk1.O, null, null, null, null, 0L, null, null, null, 0L, null, null, 65530), sb.length(), 0, 12);
                        ArrayList arrayList = mjVar.J;
                        arrayList.add(ljVar);
                        mjVar.K.add(ljVar);
                        int size = arrayList.size() - 1;
                        try {
                            sb.append(obj6);
                            mjVar.e(size);
                            sb.append("：");
                        } catch (Throwable th) {
                            mjVar.e(size);
                            throw th;
                        }
                    }
                    sb.append(obj5);
                    Q = mjVar.f();
                    go1Var.o0(Q);
                }
                oj ojVar = (oj) Q;
                boolean z = this.K;
                long j = z ? hx2.a : this.L;
                qk1 qk1Var = qk1.M;
                l13 l13Var = i13.a;
                l13 E0 = i42.E0(nq4.e(l13Var, 1.0f), 0.0f, 1.0f, 1);
                if (z) {
                    l13Var = j42.u(l13Var, new c22((byte) 25));
                }
                r55.c(ojVar, E0.then(l13Var), j, this.M, qk1Var, 0L, 0L, 2, false, 1, 0, null, null, null, go1Var, 1572864);
                go1Var.q(false);
            }
            go1Var.q(false);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }
}
