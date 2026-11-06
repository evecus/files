package defpackage;

import java.io.File;
import java.io.FileOutputStream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xp4 extends gj0 {
    public yp4 I;
    public File J;
    public FileOutputStream K;
    public FileOutputStream L;
    public /* synthetic */ Object M;
    public final /* synthetic */ yp4 N;
    public int O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp4(yp4 yp4Var, gj0 gj0Var) {
        super(gj0Var);
        this.N = yp4Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.M = obj;
        this.O |= Integer.MIN_VALUE;
        return this.N.j(null, this);
    }
}
