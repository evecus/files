package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class cy {
    public final b53 a;

    public cy(byte b) {
        switch (b) {
            case 1:
                this.a = new b53(new ae2[16]);
                break;
            default:
                this.a = new b53(new bi0[16]);
                break;
        }
    }

    public void a(CancellationException cancellationException) {
        b53 b53Var = this.a;
        int i = b53Var.K;
        i10[] i10VarArr = new i10[i];
        for (int i2 = 0; i2 < i; i2++) {
            i10VarArr[i2] = ((bi0) b53Var.I[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            i10VarArr[i3].j(cancellationException);
        }
        if (b53Var.K == 0) {
            return;
        }
        t02.c("uncancelled requests present");
    }

    public void b() {
        b53 b53Var = this.a;
        u22 c0 = ut0.c0(0, b53Var.K);
        int i = c0.I;
        int i2 = c0.J;
        if (i <= i2) {
            while (true) {
                ((bi0) b53Var.I[i]).b.resumeWith(wd5.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        b53Var.h();
    }
}
