package defpackage;

import androidx.media3.common.C;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class d22 implements e22 {
    public final long I;
    public final int J;

    public d22(long j, int i) {
        this.I = j;
        this.J = i;
    }

    @Override // defpackage.e22
    public final a22 toInstant() {
        a22 a22Var = a22.K;
        a22 a22Var2 = a22.K;
        long j = a22Var2.I;
        long j2 = this.I;
        if (j2 >= j) {
            a22 a22Var3 = a22.L;
            if (j2 <= a22Var3.I) {
                long j3 = this.J;
                long j4 = j3 / C.NANOS_PER_SECOND;
                if ((j3 ^ C.NANOS_PER_SECOND) < 0 && j4 * C.NANOS_PER_SECOND != j3) {
                    j4--;
                }
                long j5 = j2 + j4;
                if ((j2 ^ j5) < 0 && (j4 ^ j2) >= 0) {
                    return j2 > 0 ? a22Var3 : a22Var2;
                }
                if (j5 >= -31557014167219200L) {
                    if (j5 <= 31556889864403199L) {
                        long j6 = j3 % C.NANOS_PER_SECOND;
                        return new a22(j5, (int) (j6 + ((((j6 ^ C.NANOS_PER_SECOND) & ((-j6) | j6)) >> 63) & C.NANOS_PER_SECOND)));
                    }
                }
            }
        }
        throw new b22("The parsed date is outside the range representable by Instant (Unix epoch second " + j2 + ')');
    }
}
