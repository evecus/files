package defpackage;

import com.github.mytv.dv.model.LiveRoom;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class om2 implements rm1 {
    public final /* synthetic */ hn1 I;
    public final /* synthetic */ LiveRoom J;
    public final /* synthetic */ int K;

    public om2(hn1 hn1Var, LiveRoom liveRoom, int i) {
        this.I = hn1Var;
        this.J = liveRoom;
        this.K = i;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        this.I.invoke(this.J, Integer.valueOf(this.K));
        return wd5.a;
    }
}
