package defpackage;

import androidx.media3.common.util.Log;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pg2 extends d1 {
    public final boolean c;
    public final lg2 d;
    public final pe2 e;
    public final pd2 f;
    public final /* synthetic */ qg2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg2(qg2 qg2Var, boolean z, lg2 lg2Var, pe2 pe2Var, pd2 pd2Var) {
        super((byte) 3);
        this.g = qg2Var;
        this.c = z;
        this.d = lg2Var;
        this.e = pe2Var;
        this.f = pd2Var;
    }

    public final ug2 o(int i, long j) {
        int i2;
        long h;
        lg2 lg2Var = this.d;
        Object c = lg2Var.c(i);
        Object u = lg2Var.b.u(i);
        pd2 pd2Var = this.f;
        int[] iArr = pd2Var.b;
        int length = iArr.length;
        int i3 = (int) (j >> 32);
        int i4 = length - 1;
        if (i3 <= i4) {
            i4 = i3;
        }
        int i5 = ((int) (j & 4294967295L)) - i3;
        int i6 = length - i4;
        if (i5 > i6) {
            i5 = i6;
        }
        if (i5 == 1) {
            i2 = iArr[i4];
        } else {
            int[] iArr2 = pd2Var.a;
            int i7 = (i4 + i5) - 1;
            i2 = (iArr2[i7] + iArr[i7]) - iArr2[i4];
        }
        if (this.c) {
            if (i2 < 0) {
                s02.a("width must be >= 0");
            }
            h = eh0.h(i2, i2, 0, Log.LOG_LEVEL_OFF);
        } else {
            if (i2 < 0) {
                s02.a("height must be >= 0");
            }
            h = eh0.h(0, Log.LOG_LEVEL_OFF, i2, i2);
        }
        long j2 = h;
        List l = l(this.e, i, j2);
        qg2 qg2Var = this.g;
        return new ug2(i, c, l, qg2Var.f, qg2Var.l, i4, i5, qg2Var.j, qg2Var.k, u, qg2Var.a.t, j2);
    }
}
