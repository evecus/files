package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class yw2 {
    public final int a;
    public final List b;
    public final long c;
    public final Object d;
    public final tv e;
    public final da2 f;
    public final boolean g = true;
    public final int h;
    public final int[] i;
    public int j;
    public int k;

    public yw2(int i, int i2, List list, long j, Object obj, tv tvVar, da2 da2Var) {
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.e = tvVar;
        this.f = da2Var;
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            bn3 bn3Var = (bn3) list.get(i4);
            i3 = Math.max(i3, !this.g ? bn3Var.J : bn3Var.I);
        }
        this.h = i3;
        this.i = new int[this.b.size() * 2];
        this.k = Integer.MIN_VALUE;
    }

    public final void a(int i) {
        this.j += i;
        int[] iArr = this.i;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.g;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        this.j = i;
        boolean z = this.g;
        this.k = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            bn3 bn3Var = (bn3) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.i;
            if (z) {
                tv tvVar = this.e;
                if (tvVar == null) {
                    throw hf1.q("null horizontalAlignment");
                }
                iArr[i6] = tvVar.a(bn3Var.I, i2, this.f);
                iArr[i6 + 1] = i;
                i4 = bn3Var.J;
            } else {
                iArr[i6] = i;
                iArr[i6 + 1] = Math.round((1.0f + 0.0f) * ((i3 - bn3Var.J) / 2.0f));
                i4 = bn3Var.I;
            }
            i += i4;
        }
    }
}
