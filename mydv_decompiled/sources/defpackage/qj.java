package defpackage;

import android.graphics.Bitmap;
import com.github.mytv.dv.model.Author;
import com.github.mytv.dv.model.LiveRoom;
import com.github.mytv.dv.widget.DesktopWidgetsKt;
import com.github.mytv.dv.widget.WidgetMixItem;
import com.github.mytv.dv.widget.WidgetPalette;
import com.github.mytv.dv.widget.WidgetUiKt;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qj implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ int J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ qj(List list, int i, List list2) {
        this.I = (byte) 4;
        this.L = list;
        this.K = list2;
        this.J = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wd5 MixCompact$lambda$1;
        wd5 MixExpanded$lambda$1;
        wd5 WidgetTheme$lambda$1;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.J;
        Object obj3 = this.L;
        Object obj4 = this.K;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                rj.a((oj) obj4, (List) obj3, (fe0) obj, mu0.X(i | 1));
                return wd5Var;
            case 1:
                ((Integer) obj2).getClass();
                qg5.i((String) obj4, (l13) obj3, (fe0) obj, mu0.X(i | 1));
                return wd5Var;
            case 2:
                ((Integer) obj2).getClass();
                eu5.a((ml0) obj4, (l13) obj3, (fe0) obj, mu0.X(i | 1));
                return wd5Var;
            case 3:
                MixCompact$lambda$1 = DesktopWidgetsKt.MixCompact$lambda$1((WidgetMixItem) obj4, (Bitmap) obj3, i, (fe0) obj, ((Integer) obj2).intValue());
                return MixCompact$lambda$1;
            case 4:
                MixExpanded$lambda$1 = DesktopWidgetsKt.MixExpanded$lambda$1((List) obj3, (List) obj4, i, (fe0) obj, ((Integer) obj2).intValue());
                return MixExpanded$lambda$1;
            case 5:
                ((Integer) obj2).getClass();
                cw0.a((nd5) obj4, (tc0) obj3, (fe0) obj, mu0.X(i | 1));
                return wd5Var;
            case 6:
                ((Integer) obj2).getClass();
                ((dd2) obj4).b(i, obj3, (fe0) obj, mu0.X(1));
                return wd5Var;
            case 7:
                ((Integer) obj2).getClass();
                ((pf2) obj4).b(i, obj3, (fe0) obj, mu0.X(1));
                return wd5Var;
            case 8:
                ((Integer) obj2).getClass();
                ((lg2) obj4).b(i, obj3, (fe0) obj, mu0.X(1));
                return wd5Var;
            case 9:
                ((Integer) obj2).getClass();
                qg5.t((LiveRoom) obj4, (l13) obj3, (fe0) obj, mu0.X(i | 1));
                return wd5Var;
            case 10:
                ((Integer) obj2).intValue();
                he4.b((LiveRoom) obj4, (rm1) obj3, (fe0) obj, mu0.X(i | 1));
                return wd5Var;
            case 11:
                ((Integer) obj2).intValue();
                he4.p((Author) obj4, (rm1) obj3, (fe0) obj, mu0.X(i | 1));
                return wd5Var;
            case 12:
                fe0 fe0Var = (fe0) obj;
                ((Integer) obj2).getClass();
                int X = mu0.X(i | 1);
                qm4.n(X, fe0Var, (hx1) obj3, (String) obj4);
                return wd5Var;
            case 13:
                ((Integer) obj2).getClass();
                i42.Y((l13) obj4, (hn1) obj3, (fe0) obj, mu0.X(i | 1));
                return wd5Var;
            default:
                WidgetTheme$lambda$1 = WidgetUiKt.WidgetTheme$lambda$1((WidgetPalette) obj4, (hn1) obj3, i, (fe0) obj, ((Integer) obj2).intValue());
                return WidgetTheme$lambda$1;
        }
    }

    public /* synthetic */ qj(me2 me2Var, int i, Object obj, int i2, byte b) {
        this.I = b;
        this.K = me2Var;
        this.J = i;
        this.L = obj;
    }

    public /* synthetic */ qj(byte b, int i, Object obj, Object obj2) {
        this.I = b;
        this.K = obj;
        this.L = obj2;
        this.J = i;
    }
}
