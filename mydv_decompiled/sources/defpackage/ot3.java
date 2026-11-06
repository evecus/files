package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ot3 {
    public int a;
    public sq[] b;

    public final void a(sq sqVar, int i) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            sq sqVar2 = this.b[i2];
            sqVar2.getClass();
            if (j42.n(0L, sqVar.getTimeoutAt$okio() - sqVar2.getTimeoutAt$okio()) <= 0) {
                break;
            }
            sqVar2.index = i;
            this.b[i] = sqVar2;
            i = i2;
        }
        this.b[i] = sqVar;
        sqVar.index = i;
    }

    public final void b(sq sqVar) {
        sq sqVar2;
        int i = sqVar.index;
        if (i == -1) {
            s83.t("Failed requirement.");
            return;
        }
        int i2 = this.a;
        sq sqVar3 = this.b[i2];
        sqVar3.getClass();
        sqVar.index = -1;
        this.b[i2] = null;
        this.a = i2 - 1;
        if (sqVar == sqVar3) {
            return;
        }
        int n = j42.n(0L, sqVar3.getTimeoutAt$okio() - sqVar.getTimeoutAt$okio());
        if (n == 0) {
            this.b[i] = sqVar3;
            sqVar3.index = i;
            return;
        }
        if (n >= 0) {
            a(sqVar3, i);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.a;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                sqVar2 = this.b[i3];
                sqVar2.getClass();
            } else {
                sqVar2 = this.b[i3];
                sqVar2.getClass();
                sq sqVar4 = this.b[i4];
                sqVar4.getClass();
                if (j42.n(0L, sqVar4.getTimeoutAt$okio() - sqVar2.getTimeoutAt$okio()) >= 0) {
                    sqVar2 = sqVar4;
                }
            }
            if (j42.n(0L, sqVar2.getTimeoutAt$okio() - sqVar3.getTimeoutAt$okio()) <= 0) {
                break;
            }
            int i6 = sqVar2.index;
            sqVar2.index = i;
            this.b[i] = sqVar2;
            i = i6;
        }
        this.b[i] = sqVar3;
        sqVar3.index = i;
    }
}
