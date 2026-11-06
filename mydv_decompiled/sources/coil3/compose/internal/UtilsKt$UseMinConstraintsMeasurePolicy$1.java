package coil3.compose.internal;

import defpackage.an3;
import defpackage.b42;
import defpackage.dh0;
import defpackage.i82;
import defpackage.p91;
import defpackage.pw2;
import defpackage.tm1;
import defpackage.uw2;
import defpackage.vw2;
import defpackage.wd5;
import defpackage.ww2;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class UtilsKt$UseMinConstraintsMeasurePolicy$1 implements uw2 {
    public static final UtilsKt$UseMinConstraintsMeasurePolicy$1 INSTANCE = new UtilsKt$UseMinConstraintsMeasurePolicy$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 measure_3p2s80s$lambda$0(an3 an3Var) {
        return wd5.a;
    }

    @Override // defpackage.uw2
    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(b42 b42Var, List list, int i) {
        return i82.j(this, b42Var, list, i);
    }

    @Override // defpackage.uw2
    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(b42 b42Var, List list, int i) {
        return i82.m(this, b42Var, list, i);
    }

    @Override // defpackage.uw2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo35measure3p2s80s(ww2 ww2Var, List<? extends pw2> list, long j) {
        return ww2Var.A(dh0.j(j), dh0.i(j), p91.I, new tm1() { // from class: coil3.compose.internal.a
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                wd5 measure_3p2s80s$lambda$0;
                measure_3p2s80s$lambda$0 = UtilsKt$UseMinConstraintsMeasurePolicy$1.measure_3p2s80s$lambda$0((an3) obj);
                return measure_3p2s80s$lambda$0;
            }
        });
    }

    @Override // defpackage.uw2
    public /* bridge */ /* synthetic */ int minIntrinsicHeight(b42 b42Var, List list, int i) {
        return i82.p(this, b42Var, list, i);
    }

    @Override // defpackage.uw2
    public /* bridge */ /* synthetic */ int minIntrinsicWidth(b42 b42Var, List list, int i) {
        return i82.s(this, b42Var, list, i);
    }
}
