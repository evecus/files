package defpackage;

import android.util.Log;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.DataModelKt;
import com.github.mytv.dv.model.MixInfo;
import com.github.mytv.dv.model.MixStatis;
import com.github.mytv.dv.model.UserWorksResponse;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zw3 extends k05 implements hn1 {
    public boolean I;
    public final /* synthetic */ gx3 J;
    public final /* synthetic */ String K;
    public final /* synthetic */ long L;
    public final /* synthetic */ boolean M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw3(gx3 gx3Var, String str, long j, boolean z, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = gx3Var;
        this.K = str;
        this.L = j;
        this.M = z;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new zw3(this.J, this.K, this.L, this.M, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((zw3) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object q;
        MixStatis statis;
        gx3 gx3Var = this.J;
        fw4 fw4Var = gx3Var.J0;
        fw4 fw4Var2 = gx3Var.L0;
        boolean z = this.I;
        boolean z2 = this.M;
        try {
            if (!z) {
                mu0.V(obj);
                this.I = true;
                q = gx3Var.b.q(this.K, this.L, !z2, this);
                el0 el0Var = el0.I;
                if (q == el0Var) {
                    return el0Var;
                }
            } else {
                if (!z) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                q = ((h54) obj).I;
            }
            MixInfo mixInfo = (MixInfo) gx3Var.H0.getValue();
            boolean c = j42.c(mixInfo != null ? mixInfo.getMixId() : null, this.K);
            wd5 wd5Var = wd5.a;
            if (c) {
                long j = this.L;
                if (!(q instanceof g54)) {
                    UserWorksResponse userWorksResponse = (UserWorksResponse) q;
                    List<Aweme> filterPrimaryPlayableAwemes = DataModelKt.filterPrimaryPlayableAwemes(userWorksResponse.getAwemeList());
                    fw4 fw4Var3 = gx3Var.N0;
                    fw4Var.h(z2 ? gx3.p((List) fw4Var.getValue(), filterPrimaryPlayableAwemes) : filterPrimaryPlayableAwemes);
                    LinkedHashMap Y = sv2.Y((Map) fw4Var3.getValue());
                    int i = 0;
                    for (Object obj2 : filterPrimaryPlayableAwemes) {
                        int i2 = i + 1;
                        if (i < 0) {
                            p70.A0();
                            throw null;
                        }
                        Aweme aweme = (Aweme) obj2;
                        MixInfo mixInfo2 = aweme.getMixInfo();
                        int currentEpisode = (mixInfo2 == null || (statis = mixInfo2.getStatis()) == null) ? 0 : statis.getCurrentEpisode();
                        Y.put(aweme.getAwemeId(), new Integer(currentEpisode > 0 ? currentEpisode : (int) (i + j + 1)));
                        i = i2;
                    }
                    fw4Var3.i(null, Y);
                    if (gx3Var.R0) {
                        long j2 = j - 20;
                        if (j2 < 0) {
                            j2 = 0;
                        }
                        gx3Var.P0 = j2;
                        gx3Var.Q0 = j > 0 && !filterPrimaryPlayableAwemes.isEmpty();
                    } else {
                        gx3Var.Q0 = userWorksResponse.getHasMore();
                        Long cursor = userWorksResponse.getCursor();
                        gx3Var.P0 = cursor != null ? cursor.longValue() : ((List) fw4Var.getValue()).size();
                    }
                }
                Throwable a = h54.a(q);
                if (a != null) {
                    Log.e("ProfileViewModel", "加载合集视频失败: " + a.getMessage(), a);
                    gx3Var.S0.i(null, "加载合集视频失败");
                }
            }
            return wd5Var;
        } finally {
            fw4Var2.i(null, Boolean.FALSE);
        }
    }
}
