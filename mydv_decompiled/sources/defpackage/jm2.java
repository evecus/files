package defpackage;

import android.content.Context;
import androidx.compose.runtime.Recomposer;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jm2 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 0;
    public byte J;
    public /* synthetic */ Object K;
    public Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object S;
    public final /* synthetic */ Object T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm2(vo voVar, Recomposer recomposer, q24 q24Var, fw4 fw4Var, Context context, y34 y34Var, a85 a85Var, z75 z75Var, dl0 dl0Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = voVar;
        this.M = recomposer;
        this.N = q24Var;
        this.O = fw4Var;
        this.P = context;
        this.Q = y34Var;
        this.R = a85Var;
        this.S = z75Var;
        this.T = dl0Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.T;
        Object obj3 = this.S;
        Object obj4 = this.R;
        Object obj5 = this.Q;
        Object obj6 = this.P;
        Object obj7 = this.O;
        Object obj8 = this.N;
        Object obj9 = this.M;
        switch (b) {
            case 0:
                jm2 jm2Var = new jm2((List) obj9, (op2) obj8, (ag2) obj7, (t43) obj6, (cw4) obj4, (t43) obj5, (ki1) obj3, (ki1) obj2, fj0Var);
                jm2Var.K = obj;
                return jm2Var;
            default:
                jm2 jm2Var2 = new jm2((vo) this.L, (Recomposer) obj9, (q24) obj8, (fw4) obj7, (Context) obj6, (y34) obj5, (a85) obj4, (z75) obj3, (dl0) obj2, fj0Var);
                jm2Var2.K = obj;
                return jm2Var2;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return ((jm2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            default:
                return ((jm2) create((d14) obj, (fj0) obj2)).invokeSuspend(wd5Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cb  */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jm2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm2(List list, op2 op2Var, ag2 ag2Var, t43 t43Var, cw4 cw4Var, t43 t43Var2, ki1 ki1Var, ki1 ki1Var2, fj0 fj0Var) {
        super(2, fj0Var);
        this.M = list;
        this.N = op2Var;
        this.O = ag2Var;
        this.P = t43Var;
        this.R = cw4Var;
        this.Q = t43Var2;
        this.S = ki1Var;
        this.T = ki1Var2;
    }
}
