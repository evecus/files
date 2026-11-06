package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ek0 implements uw2 {
    public final /* synthetic */ oh2 a;
    public final /* synthetic */ u45 b;
    public final /* synthetic */ ru5 c;
    public final /* synthetic */ dl0 d;
    public final /* synthetic */ tm1 e;
    public final /* synthetic */ d55 f;
    public final /* synthetic */ td3 g;
    public final /* synthetic */ iu0 h;
    public final /* synthetic */ fy i;
    public final /* synthetic */ int j;

    public ek0(oh2 oh2Var, u45 u45Var, ru5 ru5Var, dl0 dl0Var, tm1 tm1Var, d55 d55Var, td3 td3Var, iu0 iu0Var, fy fyVar, int i) {
        this.a = oh2Var;
        this.b = u45Var;
        this.c = ru5Var;
        this.d = dl0Var;
        this.e = tm1Var;
        this.f = d55Var;
        this.g = td3Var;
        this.h = iu0Var;
        this.i = fyVar;
        this.j = i;
    }

    @Override // defpackage.uw2
    public final /* synthetic */ int maxIntrinsicHeight(b42 b42Var, List list, int i) {
        return i82.j(this, b42Var, list, i);
    }

    @Override // defpackage.uw2
    public final int maxIntrinsicWidth(b42 b42Var, List list, int i) {
        oh2 oh2Var = this.a;
        oh2Var.a.a(b42Var.getLayoutDirection());
        zw zwVar = oh2Var.a.j;
        if (zwVar != null) {
            return qi4.b(zwVar.c());
        }
        zy.i("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02b2  */
    @Override // defpackage.uw2
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vw2 mo35measure3p2s80s(defpackage.ww2 r35, java.util.List r36, long r37) {
        /*
            Method dump skipped, instructions count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ek0.mo35measure3p2s80s(ww2, java.util.List, long):vw2");
    }

    @Override // defpackage.uw2
    public final /* synthetic */ int minIntrinsicHeight(b42 b42Var, List list, int i) {
        return i82.p(this, b42Var, list, i);
    }

    @Override // defpackage.uw2
    public final /* synthetic */ int minIntrinsicWidth(b42 b42Var, List list, int i) {
        return i82.s(this, b42Var, list, i);
    }
}
