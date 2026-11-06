package defpackage;

import androidx.media3.common.util.Log;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hh1 implements p74 {
    public final ip a;
    public final mp b;
    public final float c;
    public final xl0 d;
    public final float e;
    public final fh1 f;

    public hh1(ip ipVar, mp mpVar, float f, xl0 xl0Var, float f2, fh1 fh1Var) {
        this.a = ipVar;
        this.b = mpVar;
        this.c = f;
        this.d = xl0Var;
        this.e = f2;
        this.f = fh1Var;
    }

    public static int f(List list, int i, int i2, int i3, fh1 fh1Var) {
        boolean z;
        boolean z2;
        long a = k22.a(0, 0);
        if (!list.isEmpty()) {
            int i4 = Log.LOG_LEVEL_OFF;
            op opVar = new op(fh1Var, eh0.a(0, i, 0, Log.LOG_LEVEL_OFF), i2, i3);
            a42 a42Var = (a42) o70.V0(0, list);
            int Q = a42Var != null ? a42Var.Q(i) : 0;
            int p = a42Var != null ? a42Var.p(Q) : 0;
            boolean z3 = true;
            if (list.size() > 1) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            int i5 = 0;
            if (opVar.b(z3, 0, k22.a(i, Log.LOG_LEVEL_OFF), a42Var == null ? null : new k22(k22.a(p, Q)), 0, 0, 0, false, false).b) {
                fh1Var.getClass();
                a = a;
            } else {
                int size = list.size();
                int i6 = i;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i9 >= size) {
                        break;
                    }
                    int i12 = i6 - p;
                    int i13 = i9 + 1;
                    int max = Math.max(i8, Q);
                    a42 a42Var2 = (a42) o70.V0(i13, list);
                    Q = a42Var2 != null ? a42Var2.Q(i) : 0;
                    int p2 = a42Var2 != null ? a42Var2.p(Q) + i2 : 0;
                    if (i9 + 2 < list.size()) {
                        i9 = i13;
                        z2 = z;
                    } else {
                        i9 = i13;
                        z2 = false;
                    }
                    int i14 = i9 - i11;
                    int i15 = i7;
                    int i16 = p2;
                    bh1 b = opVar.b(z2, i14, k22.a(i12, i4), a42Var2 == null ? null : new k22(k22.a(p2, Q)), i15, i5, max, false, false);
                    if (b.a) {
                        int i17 = max + i3 + i5;
                        opVar.a(b, a42Var2 != null, i15, i17, i12, i14);
                        int i18 = i16 - i2;
                        i7 = i15 + 1;
                        if (b.b) {
                            i10 = i9;
                            i5 = i17;
                            break;
                        }
                        i6 = i;
                        i11 = i9;
                        p = i18;
                        i5 = i17;
                        i8 = 0;
                    } else {
                        p = i16;
                        i6 = i12;
                        i7 = i15;
                        i8 = max;
                    }
                    i10 = i9;
                    i4 = Log.LOG_LEVEL_OFF;
                    z = true;
                }
                a = k22.a(i5 - i3, i10);
            }
        }
        return (int) (a >> 32);
    }

    @Override // defpackage.p74
    public final void a(int i, int[] iArr, int[] iArr2, ww2 ww2Var) {
        this.a.d(ww2Var, i, iArr, ww2Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.p74
    public final long b(int i, int i2, int i3, boolean z) {
        u74 u74Var = t74.a;
        return !z ? eh0.a(i, i2, 0, i3) : o7.v(i, i2, 0, i3);
    }

    @Override // defpackage.p74
    public final vw2 c(final bn3[] bn3VarArr, ww2 ww2Var, final int[] iArr, int i, final int i2, final int[] iArr2, final int i3, final int i4, final int i5) {
        final da2 da2Var = da2.I;
        return ww2Var.A(i, i2, p91.I, new tm1() { // from class: gh1
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                j42 j42Var;
                an3 an3Var = (an3) obj;
                int[] iArr3 = iArr2;
                int i6 = iArr3 != null ? iArr3[i3] : 0;
                int i7 = i4;
                for (int i8 = i7; i8 < i5; i8++) {
                    bn3 bn3Var = bn3VarArr[i8];
                    bn3Var.getClass();
                    Object z = bn3Var.z();
                    q74 q74Var = z instanceof q74 ? (q74) z : null;
                    if (q74Var == null || (j42Var = q74Var.c) == null) {
                        j42Var = this.d;
                    }
                    an3.g(an3Var, bn3Var, iArr[i8 - i7], j42Var.a(i2, bn3Var.U(), da2Var) + i6);
                }
                return wd5.a;
            }
        });
    }

    @Override // defpackage.p74
    public final int d(bn3 bn3Var) {
        return bn3Var.U();
    }

    @Override // defpackage.p74
    public final int e(bn3 bn3Var) {
        return bn3Var.V();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh1)) {
            return false;
        }
        hh1 hh1Var = (hh1) obj;
        return this.a.equals(hh1Var.a) && this.b.equals(hh1Var.b) && r11.c(this.c, hh1Var.c) && this.d.equals(hh1Var.d) && r11.c(this.e, hh1Var.e) && j42.c(this.f, hh1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((((((Float.floatToIntBits(this.e) + jp0.o(-1.0f, jp0.o(this.c, (this.b.hashCode() + ((this.a.hashCode() + 38161) * 31)) * 31, 31), 31)) * 31) + Log.LOG_LEVEL_OFF) * 31) + Log.LOG_LEVEL_OFF) * 31);
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.b + ", mainAxisSpacing=" + r11.d(this.c) + ", crossAxisAlignment=" + this.d + ", crossAxisArrangementSpacing=" + r11.d(this.e) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.f + ")";
    }
}
