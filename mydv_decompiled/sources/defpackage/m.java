package defpackage;

import androidx.compose.runtime.Recomposer;
import com.github.mytv.dv.model.Aweme;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class m extends k05 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public boolean J;
    public Object K;
    public /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Set set, boolean z, Aweme aweme, t43 t43Var, t43 t43Var2, t43 t43Var3, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = set;
        this.J = z;
        this.L = aweme;
        this.M = t43Var;
        this.N = t43Var2;
        this.O = t43Var3;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.O;
        Object obj3 = this.N;
        Object obj4 = this.M;
        switch (b) {
            case 0:
                return new m((s) this.K, (String) this.L, (String) obj4, (String) obj3, (String) obj2, fj0Var);
            case 1:
                m mVar = new m((Recomposer) obj4, (in1) obj3, (s13) obj2, fj0Var);
                mVar.L = obj;
                return mVar;
            default:
                return new m((Set) this.K, this.J, (Aweme) this.L, (t43) obj4, (t43) obj3, (t43) obj2, fj0Var);
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
                return ((m) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
            case 1:
                return ((m) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
            default:
                ((m) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                return wd5Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0122 A[Catch: all -> 0x0133, LOOP:1: B:69:0x0120->B:70:0x0122, LOOP_END, TryCatch #1 {all -> 0x0133, blocks: (B:68:0x0113, B:70:0x0122, B:72:0x0135), top: B:67:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0151  */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Recomposer recomposer, in1 in1Var, s13 s13Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.M = recomposer;
        this.N = in1Var;
        this.O = s13Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s sVar, String str, String str2, String str3, String str4, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = sVar;
        this.L = str;
        this.M = str2;
        this.N = str3;
        this.O = str4;
    }
}
