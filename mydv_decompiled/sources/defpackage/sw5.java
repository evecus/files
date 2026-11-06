package defpackage;

import androidx.compose.runtime.Recomposer;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class sw5 implements ti2 {
    public final /* synthetic */ dj0 I;
    public final /* synthetic */ eg J;
    public final /* synthetic */ Recomposer K;
    public final /* synthetic */ r24 L;

    public sw5(dj0 dj0Var, eg egVar, Recomposer recomposer, r24 r24Var) {
        this.I = dj0Var;
        this.J = egVar;
        this.K = recomposer;
        this.L = r24Var;
    }

    @Override // defpackage.ti2
    public final void e(vi2 vi2Var, ji2 ji2Var) {
        switch (rw5.a[ji2Var.ordinal()]) {
            case 1:
                p70.g0(this.I, null, gl0.L, new ch(this.L, this.K, vi2Var, this, null, (byte) 5), 1);
                return;
            case 2:
                eg egVar = this.J;
                if (egVar != null) {
                    u92 u92Var = (u92) egVar.K;
                    synchronized (u92Var.b) {
                        try {
                            if (!u92Var.a()) {
                                ArrayList arrayList = (ArrayList) u92Var.c;
                                u92Var.c = (ArrayList) u92Var.d;
                                u92Var.d = arrayList;
                                u92Var.a = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((fj0) arrayList.get(i)).resumeWith(wd5.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                this.K.resumeCompositionFrameClock();
                return;
            case 3:
                this.K.pauseCompositionFrameClock();
                return;
            case 4:
                this.K.cancel();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                s83.v();
                return;
        }
    }
}
