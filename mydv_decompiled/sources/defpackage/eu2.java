package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class eu2 implements ag1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ hu2 J;

    public /* synthetic */ eu2(hu2 hu2Var, byte b) {
        this.I = b;
        this.J = hu2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
    
        if (r10 == r9) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        if (defpackage.p70.D0(defpackage.ur0.I, new defpackage.kb5(r2, r4, 0), r3) == r9) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(boolean r11, defpackage.fj0 r12) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eu2.a(boolean, fj0):java.lang.Object");
    }

    @Override // defpackage.ag1
    public final Object emit(Object obj, fj0 fj0Var) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        hu2 hu2Var = this.J;
        switch (b) {
            case 0:
                break;
            case 1:
                List list = (List) obj;
                if (((Boolean) ((fw4) hu2Var.p.v0.I).getValue()).booleanValue() && ((Boolean) hu2Var.d.C.getValue()).booleanValue()) {
                    mb5 mb5Var = hu2Var.q;
                    mb5Var.getClass();
                    os0 os0Var = sx0.a;
                    Object D0 = p70.D0(ur0.I, new lb5(mb5Var, list, "mydv_watch_later", null), fj0Var);
                    el0 el0Var = el0.I;
                    if (D0 != el0Var) {
                        D0 = wd5Var;
                    }
                    if (D0 != el0Var) {
                        D0 = wd5Var;
                    }
                    if (D0 == el0Var) {
                        break;
                    }
                }
                break;
            case 2:
                hu2Var.G((String) obj);
                break;
            default:
                hu2Var.G((String) obj);
                break;
        }
        return wd5Var;
    }
}
