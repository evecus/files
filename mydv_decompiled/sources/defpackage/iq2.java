package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class iq2 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public byte J;
    public /* synthetic */ Object K;
    public Object L;
    public Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;
    public final /* synthetic */ Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq2(ContentResolver contentResolver, Uri uri, tw5 tw5Var, iz izVar, Context context, fj0 fj0Var) {
        super(2, fj0Var);
        this.M = contentResolver;
        this.N = uri;
        this.O = tw5Var;
        this.P = izVar;
        this.Q = context;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.Q;
        Object obj3 = this.P;
        Object obj4 = this.O;
        Object obj5 = this.N;
        switch (b) {
            case 0:
                iq2 iq2Var = new iq2((bh) obj5, (List) obj4, (s33) obj3, (fk3) obj2, fj0Var);
                iq2Var.K = obj;
                return iq2Var;
            default:
                iq2 iq2Var2 = new iq2((ContentResolver) this.M, (Uri) obj5, (tw5) obj4, (iz) obj3, (Context) obj2, fj0Var);
                iq2Var2.K = obj;
                return iq2Var2;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                ((iq2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return el0.I;
            default:
                return ((iq2) create((ag1) obj, (fj0) obj2)).invokeSuspend(wd5Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0072 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:9:0x002c, B:11:0x005d, B:16:0x006a, B:18:0x0072, B:27:0x0041, B:30:0x0056), top: B:4:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0095 -> B:11:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0123 -> B:36:0x00e7). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iq2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq2(bh bhVar, List list, s33 s33Var, fk3 fk3Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.N = bhVar;
        this.O = list;
        this.P = s33Var;
        this.Q = fk3Var;
    }
}
