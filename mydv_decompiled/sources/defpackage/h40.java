package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class h40 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public /* synthetic */ Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h40(boolean z, pq5 pq5Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 12;
        this.J = z;
        this.K = pq5Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = 2;
        switch (this.I) {
            case 0:
                return new h40(this.K, fj0Var, (byte) 0);
            case 1:
                return new h40(this.K, fj0Var, (byte) 1);
            case 2:
                return new h40((ConstraintTrackingWorker) this.K, fj0Var, b);
            case 3:
                return new h40(this.K, fj0Var, (byte) 3);
            case 4:
                return new h40(this.K, fj0Var, (byte) 4);
            case 5:
                return new h40(this.K, fj0Var, (byte) 5);
            case 6:
                return new h40(this.K, fj0Var, (byte) 6);
            case 7:
                return new h40(this.K, fj0Var, (byte) 7);
            case 8:
                return new h40(this.K, fj0Var, (byte) 8);
            case 9:
                return new h40(this.K, fj0Var, (byte) 9);
            case 10:
                return new h40(this.K, fj0Var, (byte) 10);
            case 11:
                return new h40(this.K, fj0Var, (byte) 11);
            case 12:
                return new h40(this.J, (pq5) this.K, fj0Var);
            case 13:
                return new h40(this.K, fj0Var, (byte) 13);
            case 14:
                return new h40(this.K, fj0Var, (byte) 14);
            case 15:
                return new h40(this.K, fj0Var, (byte) 15);
            case 16:
                h40 h40Var = new h40(b, fj0Var);
                h40Var.K = obj;
                return h40Var;
            case 17:
                return new h40(this.K, fj0Var, (byte) 17);
            case 18:
                return new h40(this.K, fj0Var, (byte) 18);
            case 19:
                return new h40(this.K, fj0Var, (byte) 19);
            case 20:
                return new h40(this.K, fj0Var, (byte) 20);
            case 21:
                return new h40(this.K, fj0Var, (byte) 21);
            case 22:
                return new h40(this.K, fj0Var, (byte) 22);
            case 23:
                return new h40(this.K, fj0Var, (byte) 23);
            case 24:
                return new h40(this.K, fj0Var, (byte) 24);
            case 25:
                return new h40(this.K, fj0Var, (byte) 25);
            case 26:
                return new h40(this.K, fj0Var, (byte) 26);
            default:
                return new h40(this.K, fj0Var, (byte) 27);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
            case 1:
                ((h40) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 12:
                ((h40) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return ((h40) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:320:0x0626 -> B:318:0x0629). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 1680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h40.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h40(Object obj, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h40(int i, fj0 fj0Var) {
        super(i, fj0Var);
        this.I = (byte) 16;
    }
}
