package defpackage;

import com.github.mytv.dv.model.DataModelKt;
import com.github.mytv.dv.model.MixInfo;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wv3 implements jn1 {
    public final /* synthetic */ List I;
    public final /* synthetic */ ki1 J;
    public final /* synthetic */ int K;
    public final /* synthetic */ ki1 L;
    public final /* synthetic */ tm1 M;

    public wv3(List list, ki1 ki1Var, int i, ki1 ki1Var2, tm1 tm1Var) {
        this.I = list;
        this.J = ki1Var;
        this.K = i;
        this.L = ki1Var2;
        this.M = tm1Var;
    }

    @Override // defpackage.jn1
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Object obj5 = (mg2) obj;
        int intValue = ((Number) obj2).intValue();
        fe0 fe0Var = (fe0) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((go1) fe0Var).g(obj5) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((go1) fe0Var).e(intValue) ? 32 : 16;
        }
        boolean z = true;
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 147) != 146)) {
            MixInfo mixInfo = (MixInfo) this.I.get(intValue);
            go1Var.d0(1112101156);
            l13 l13Var = i13.a;
            l13 then = nq4.e(l13Var, 1.0f).then(intValue == 0 ? j42.x(l13Var, this.J) : l13Var);
            int i2 = this.K;
            Object obj6 = de0.a;
            if (intValue < i2) {
                go1Var.d0(1112425663);
                if ((((i & 14) ^ 6) <= 4 || !go1Var.g(obj5)) && (i & 6) != 4) {
                    z = false;
                }
                ki1 ki1Var = this.L;
                boolean g = go1Var.g(ki1Var) | z;
                Object Q = go1Var.Q();
                if (g || Q == obj6) {
                    Q = new vv3(obj5, ki1Var, (byte) 0);
                    go1Var.o0(Q);
                }
                Map singletonMap = Collections.singletonMap(19, (rm1) Q);
                singletonMap.getClass();
                l13Var = r13.c(l13Var, singletonMap);
                go1Var.q(false);
            } else {
                go1Var.d0(1112779311);
                go1Var.q(false);
            }
            l13 then2 = then.then(l13Var);
            int max = Math.max(mixInfo.getStatis().getTotalEpisode(), Math.max(mixInfo.getStatis().getUpdatedToEpisode(), mixInfo.getStatis().getCurrentEpisode()));
            String str = (String) o70.U0(mixInfo.getCoverUrl().getUrlList());
            Object obj7 = this.M;
            boolean g2 = go1Var.g(obj7) | go1Var.i(mixInfo);
            Object Q2 = go1Var.Q();
            if (g2 || Q2 == obj6) {
                Q2 = new yu1(obj7, mixInfo, (byte) 2);
                go1Var.o0(Q2);
            }
            rm1 rm1Var = (rm1) Q2;
            String mixName = mixInfo.getMixName();
            if (jx4.L(mixName)) {
                mixName = "未命名合集";
            }
            String str2 = mixName;
            String z2 = max > 0 ? r7.z("共 ", max, " 集") : null;
            ml0 ml0Var = mw3.a;
            long playVv = mixInfo.getStatis().getPlayVv();
            Long valueOf = Long.valueOf(playVv);
            if (playVv <= 0) {
                valueOf = null;
            }
            eu5.b(str, rm1Var, then2, 0.0f, str2, null, null, z2, null, null, ml0Var, valueOf != null ? DataModelKt.formatCount(valueOf.longValue()) : null, il2.H(), 0L, go1Var, 0, 6, 25448);
            go1Var.q(false);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }
}
