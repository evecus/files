package defpackage;

import com.github.mytv.dv.model.Aweme;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class om5 extends k05 implements hn1 {
    public int I;
    public byte J;
    public final /* synthetic */ kq5 K;
    public final /* synthetic */ Aweme L;
    public final /* synthetic */ long M;
    public final /* synthetic */ long N;
    public final /* synthetic */ long O;
    public final /* synthetic */ Set P;
    public final /* synthetic */ hk3 Q;
    public final /* synthetic */ t43 R;
    public final /* synthetic */ t43 S;
    public final /* synthetic */ t43 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om5(kq5 kq5Var, Aweme aweme, long j, long j2, long j3, Set set, hk3 hk3Var, t43 t43Var, t43 t43Var2, t43 t43Var3, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = kq5Var;
        this.L = aweme;
        this.M = j;
        this.N = j2;
        this.O = j3;
        this.P = set;
        this.Q = hk3Var;
        this.R = t43Var;
        this.S = t43Var2;
        this.T = t43Var3;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new om5(this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((om5) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0167, code lost:
    
        if (defpackage.rt0.n(androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, r23) == r15) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c A[Catch: all -> 0x00ca, TryCatch #3 {all -> 0x00ca, blocks: (B:19:0x006e, B:25:0x0078, B:27:0x007c, B:30:0x0083, B:33:0x0090, B:35:0x00b3, B:38:0x00c6, B:43:0x00cd, B:45:0x00d9, B:51:0x00ee, B:57:0x00f2, B:58:0x010f, B:60:0x0115, B:66:0x0128, B:72:0x012c, B:75:0x0130, B:81:0x013f, B:82:0x0143, B:83:0x015a), top: B:18:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0130 A[Catch: all -> 0x00ca, TryCatch #3 {all -> 0x00ca, blocks: (B:19:0x006e, B:25:0x0078, B:27:0x007c, B:30:0x0083, B:33:0x0090, B:35:0x00b3, B:38:0x00c6, B:43:0x00cd, B:45:0x00d9, B:51:0x00ee, B:57:0x00f2, B:58:0x010f, B:60:0x0115, B:66:0x0128, B:72:0x012c, B:75:0x0130, B:81:0x013f, B:82:0x0143, B:83:0x015a), top: B:18:0x006e }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0167 -> B:9:0x016a). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.om5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
