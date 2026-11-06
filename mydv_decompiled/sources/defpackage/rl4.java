package defpackage;

import com.github.mytv.dv.model.Author;
import com.github.mytv.dv.widget.WidgetUiKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rl4 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ float J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;

    public /* synthetic */ rl4(float f, int i, String str) {
        this.J = f;
        this.L = str;
        this.K = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wd5 WidgetProgress$lambda$1;
        byte b = this.I;
        int i = this.K;
        Object obj3 = this.L;
        float f = this.J;
        switch (b) {
            case 0:
                ((Integer) obj2).intValue();
                qm4.g((Author) obj3, f, (fe0) obj, mu0.X(i | 1));
                return wd5.a;
            default:
                WidgetProgress$lambda$1 = WidgetUiKt.WidgetProgress$lambda$1(f, (String) obj3, i, (fe0) obj, ((Integer) obj2).intValue());
                return WidgetProgress$lambda$1;
        }
    }

    public /* synthetic */ rl4(Author author, float f, int i) {
        this.L = author;
        this.J = f;
        this.K = i;
    }
}
