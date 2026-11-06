package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ha implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ int J;
    public final /* synthetic */ Object K;

    public /* synthetic */ ha(int i, Collection collection) {
        this.I = (byte) 3;
        this.J = i;
        this.K = collection;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        boolean requestFocusViewFocusFix$lambda$0;
        byte b = this.I;
        Object obj2 = this.K;
        int i = this.J;
        switch (b) {
            case 0:
                requestFocusViewFocusFix$lambda$0 = AndroidComposeView.requestFocusViewFocusFix$lambda$0((n24) obj2, i, (ui1) obj);
                break;
            case 1:
                requestFocusViewFocusFix$lambda$0 = ((ui1) obj).r0(i);
                ((r24) obj2).I = Boolean.valueOf(requestFocusViewFocusFix$lambda$0);
                break;
            case 2:
                ze2 ze2Var = (ze2) obj;
                cs0 cs0Var = ((wd2) obj2).a;
                ns4 i2 = o63.i();
                o63.o(i2, o63.j(i2), i2 != null ? i2.e() : null);
                cs0Var.getClass();
                int i3 = ze2Var.a;
                if (i3 == -1) {
                    i3 = 2;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    ze2Var.a(i + i4);
                }
                return wd5.a;
            default:
                requestFocusViewFocusFix$lambda$0 = ((List) obj).addAll(i, (Collection) obj2);
                break;
        }
        return Boolean.valueOf(requestFocusViewFocusFix$lambda$0);
    }

    public /* synthetic */ ha(Object obj, int i, byte b) {
        this.I = b;
        this.K = obj;
        this.J = i;
    }
}
