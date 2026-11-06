package defpackage;

import com.github.mytv.dv.MainActivity;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ft2 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public byte J;
    public final /* synthetic */ Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ft2(Object obj, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = obj;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.K;
        switch (b) {
            case 0:
                return new ft2((gt2) obj2, fj0Var, (byte) 0);
            case 1:
                return new ft2((MainActivity) obj2, fj0Var, (byte) 1);
            case 2:
                return new ft2((ye4) obj2, fj0Var, (byte) 2);
            default:
                return new ft2((r05) obj2, fj0Var, (byte) 3);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
            case 0:
                ((ft2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return ((ft2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00bb -> B:46:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00c9 -> B:44:0x00cc). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ft2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
