package defpackage;

import android.view.View;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qc extends f54 implements hn1 {
    public final /* synthetic */ byte J;
    public byte K;
    public /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qc(Object obj, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.J = b;
        this.M = obj;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.J;
        Object obj2 = this.M;
        switch (b) {
            case 0:
                qc qcVar = new qc((sc) obj2, fj0Var, (byte) 0);
                qcVar.L = obj;
                return qcVar;
            case 1:
                qc qcVar2 = new qc((tm1) obj2, fj0Var, (byte) 1);
                qcVar2.L = obj;
                return qcVar2;
            default:
                qc qcVar3 = new qc((View) obj2, fj0Var, (byte) 2);
                qcVar3.L = obj;
                return qcVar3;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.J;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return ((qc) create((q05) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 1:
                return ((qc) create((q05) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            default:
                return ((qc) create((pj4) obj, (fj0) obj2)).invokeSuspend(wd5Var);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x00ff -> B:41:0x0102). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
