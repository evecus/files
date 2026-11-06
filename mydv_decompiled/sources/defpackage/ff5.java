package defpackage;

import android.content.Context;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ff5 extends k05 implements hn1 {
    public OkHttpClient I;
    public String J;
    public byte K;
    public final /* synthetic */ Context L;
    public final /* synthetic */ boolean M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff5(Context context, boolean z, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = context;
        this.M = z;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new ff5(this.L, this.M, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((ff5) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0070, code lost:
    
        if (r13 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x008b, code lost:
    
        if (r13 == r11) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0128, code lost:
    
        if (defpackage.p70.D0(r0, r2, r25) == r11) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0268, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0266, code lost:
    
        if (defpackage.p70.D0(r0, r2, r25) == r11) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0228, code lost:
    
        if (defpackage.p70.D0(r0, r17, r25) == r11) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0242, code lost:
    
        if (defpackage.p70.D0(r0, r2, r25) == r11) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010d A[LOOP:0: B:18:0x00a4->B:32:0x010d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010f A[EDGE_INSN: B:33:0x010f->B:34:0x010f BREAK  A[LOOP:0: B:18:0x00a4->B:32:0x010d], SYNTHETIC] */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
