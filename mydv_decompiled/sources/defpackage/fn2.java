package defpackage;

import com.github.mytv.dv.model.LiveRoom;
import com.github.mytv.dv.widget.WidgetUiKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fn2 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ int J;
    public final /* synthetic */ String K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    public /* synthetic */ fn2(int i, i80 i80Var, lq1 lq1Var, String str, int i2, int i3) {
        this.J = i;
        this.N = i80Var;
        this.O = lq1Var;
        this.K = str;
        this.L = i2;
        this.M = i3;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wd5 WidgetIcon$lambda$0;
        byte b = this.I;
        Object obj3 = this.O;
        Object obj4 = this.N;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                un2.a((LiveRoom) obj4, this.J, this.L, this.K, (tm1) obj3, (fe0) obj, mu0.X(this.M | 1));
                return wd5.a;
            default:
                int intValue = ((Integer) obj2).intValue();
                WidgetIcon$lambda$0 = WidgetUiKt.WidgetIcon$lambda$0(this.J, (i80) obj4, (lq1) obj3, this.K, this.L, this.M, (fe0) obj, intValue);
                return WidgetIcon$lambda$0;
        }
    }

    public /* synthetic */ fn2(LiveRoom liveRoom, int i, int i2, String str, tm1 tm1Var, int i3) {
        this.N = liveRoom;
        this.J = i;
        this.L = i2;
        this.K = str;
        this.O = tm1Var;
        this.M = i3;
    }
}
