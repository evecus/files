package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hp0 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public byte J;
    public Object K;
    public Object L;
    public Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp0(String str, Context context, bh bhVar, t43 t43Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = str;
        this.M = context;
        this.N = bhVar;
        this.O = t43Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.O;
        Object obj3 = this.N;
        switch (b) {
            case 0:
                hp0 hp0Var = new hp0((List) obj3, (ArrayList) obj2, fj0Var);
                hp0Var.M = obj;
                return hp0Var;
            case 1:
                return new hp0((String) this.L, (Context) this.M, (bh) obj3, (t43) obj2, fj0Var);
            default:
                return new hp0((jh4) obj3, this.L, (ea5) obj2, fj0Var);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
        }
        return ((hp0) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bc, code lost:
    
        if (r6 == r7) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00bf, code lost:
    
        r6 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c7, code lost:
    
        if (r6 != r7) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c5, code lost:
    
        if (r6 == r7) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hp0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp0(jh4 jh4Var, Object obj, ea5 ea5Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.N = jh4Var;
        this.L = obj;
        this.O = ea5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp0(List list, ArrayList arrayList, fj0 fj0Var) {
        super(2, fj0Var);
        this.N = list;
        this.O = arrayList;
    }
}
