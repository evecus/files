package defpackage;

import android.content.Context;
import androidx.glance.appwidget.AsyncRequestWorker;
import java.io.File;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jd extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public byte J;
    public Object K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jd(Object obj, Object obj2, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = obj;
        this.L = obj2;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.L;
        switch (b) {
            case 0:
                return new jd((md) this.K, (g12) obj2, fj0Var, (byte) 0);
            case 1:
                jd jdVar = new jd((AsyncRequestWorker) obj2, fj0Var, (byte) 1);
                jdVar.K = obj;
                return jdVar;
            case 2:
                return new jd((v52) this.K, (pm0) obj2, fj0Var, (byte) 2);
            case 3:
                return new jd((op2) this.K, (String) obj2, fj0Var, (byte) 3);
            case 4:
                return new jd((cq2) this.K, (String) obj2, fj0Var, (byte) 4);
            case 5:
                return new jd((v52) this.K, (vv2) obj2, fj0Var, (byte) 5);
            case 6:
                jd jdVar2 = new jd((p23) obj2, fj0Var, (byte) 6);
                jdVar2.K = obj;
                return jdVar2;
            case 7:
                return new jd((ye4) this.K, (String) obj2, fj0Var, (byte) 7);
            case 8:
                return new jd((mc3) obj2, fj0Var, (byte) 8);
            case 9:
                jd jdVar3 = new jd((yp4) obj2, fj0Var, (byte) 9);
                jdVar3.K = obj;
                return jdVar3;
            case 10:
                return new jd((v52) this.K, (ts3) obj2, fj0Var, (byte) 10);
            default:
                return new jd((Context) this.K, (File) obj2, fj0Var, (byte) 11);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 2:
                ((jd) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                break;
        }
        return ((jd) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:322:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:130:0x027c -> B:122:0x0243). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:281:0x05c0 -> B:275:0x05c3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x01b7 -> B:85:0x01ba). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 2062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jd(Object obj, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.L = obj;
    }
}
