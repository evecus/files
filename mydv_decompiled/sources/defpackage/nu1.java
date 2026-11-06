package defpackage;

import android.content.Context;
import androidx.compose.runtime.Recomposer;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nu1 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 3;
    public byte J;
    public Object K;
    public Object L;
    public Object M;
    public /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu1(ph0 ph0Var, bh bhVar, bh bhVar2, t43 t43Var, t43 t43Var2, t43 t43Var3, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = ph0Var;
        this.L = bhVar;
        this.M = bhVar2;
        this.N = t43Var;
        this.O = t43Var2;
        this.P = t43Var3;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.O;
        Object obj3 = this.P;
        switch (b) {
            case 0:
                return new nu1((ph0) this.K, (bh) this.L, (bh) this.M, (t43) this.N, (t43) obj2, (t43) obj3, fj0Var);
            case 1:
                nu1 nu1Var = new nu1((k53) obj2, (tm1) obj3, fj0Var);
                nu1Var.N = obj;
                return nu1Var;
            case 2:
                return new nu1((we0) this.L, (vo) this.M, (Context) this.N, (Recomposer) obj2, (a85) obj3, fj0Var);
            case 3:
                return new nu1((Context) this.M, (String) this.N, (String) obj2, (String) obj3, fj0Var);
            default:
                return new nu1((is0) this.K, (List) this.L, (ExoPlayer) this.M, (HashMap) obj3, (t43) this.N, (t43) obj2, fj0Var);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((nu1) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:57|58|(2:144|145)(2:60|(1:62)(11:83|84|85|86|87|88|89|90|91|92|(4:93|94|95|(5:97|98|99|(2:101|102)(2:104|105)|103)(6:118|119|(1:131)(2:(2:124|(1:126)(2:127|(1:129)))|130)|64|65|(1:67)(3:68|69|(2:71|(1:75))(2:76|(1:78)))))))|63|64|65|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0119, code lost:
    
        if (r0 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x012c, code lost:
    
        if (r0 == r10) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x04cd, code lost:
    
        if (defpackage.bh.a(r0, r4, r2, null, null, r32, 12) == r10) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x04ea, code lost:
    
        if (defpackage.bh.a(r0, r3, r2, null, null, r32, 12) == r10) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        if (defpackage.rt0.n(32, r32) == r10) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x028b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02c4, code lost:
    
        r0 = "下载异常";
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c8 A[LOOP:0: B:43:0x0148->B:67:0x02c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c4  */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, vo] */
    /* JADX WARN: Type inference failed for: r2v19, types: [iq1, lo] */
    /* JADX WARN: Type inference failed for: r2v20 */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 1310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu1(we0 we0Var, vo voVar, Context context, Recomposer recomposer, a85 a85Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = we0Var;
        this.M = voVar;
        this.N = context;
        this.O = recomposer;
        this.P = a85Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu1(is0 is0Var, List list, ExoPlayer exoPlayer, HashMap hashMap, t43 t43Var, t43 t43Var2, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = is0Var;
        this.L = list;
        this.M = exoPlayer;
        this.P = hashMap;
        this.N = t43Var;
        this.O = t43Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu1(k53 k53Var, tm1 tm1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.O = k53Var;
        this.P = tm1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu1(Context context, String str, String str2, String str3, fj0 fj0Var) {
        super(2, fj0Var);
        this.M = context;
        this.N = str;
        this.O = str2;
        this.P = str3;
    }
}
