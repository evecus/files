package defpackage;

import android.content.Context;
import coil3.ImageLoader;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class o40 extends k05 implements hn1 {
    public ImageLoader I;
    public vj3 J;
    public int[] K;
    public double L;
    public int M;
    public int N;
    public int O;
    public byte P;
    public final /* synthetic */ boolean Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ Context S;
    public final /* synthetic */ r80 T;
    public final /* synthetic */ List U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o40(boolean z, int i, Context context, r80 r80Var, List list, fj0 fj0Var) {
        super(2, fj0Var);
        this.Q = z;
        this.R = i;
        this.S = context;
        this.T = r80Var;
        this.U = list;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new o40(this.Q, this.R, this.S, this.T, this.U, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((o40) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fb, code lost:
    
        r12 = r6;
        r6 = r11;
        r11 = r16;
        r10 = r9;
        r8 = r17;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0074  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x007e -> B:7:0x00fb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0084 -> B:7:0x00fb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x008a -> B:7:0x00fb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0090 -> B:7:0x00fb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0098 -> B:7:0x00fb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00e8 -> B:6:0x00e9). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o40.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
