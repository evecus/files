package defpackage;

import androidx.media3.common.util.Log;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class id2 {
    public final pd2 a;
    public final int b;
    public final int c;
    public final hd2 d;
    public final sd2 e;
    public final /* synthetic */ pd2 f;

    public id2(pd2 pd2Var, int i, int i2, hd2 hd2Var, sd2 sd2Var) {
        this.f = pd2Var;
        this.a = pd2Var;
        this.b = i;
        this.c = i2;
        this.d = hd2Var;
        this.e = sd2Var;
    }

    public final long a(int i, int i2) {
        int i3;
        pd2 pd2Var = this.a;
        int[] iArr = pd2Var.a;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = pd2Var.b;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 < 0) {
            s02.a("width must be >= 0");
        }
        return eh0.h(i3, i3, 0, Log.LOG_LEVEL_OFF);
    }

    public final nd2 b(int i) {
        yw0 b = this.e.b(i);
        int i2 = b.b;
        int size = ((List) b.c).size();
        int i3 = 0;
        int i4 = (size == 0 || i2 + size == this.b) ? 0 : this.c;
        md2[] md2VarArr = new md2[size];
        int i5 = 0;
        while (true) {
            List list = (List) b.c;
            if (i3 >= size) {
                return new nd2(i, md2VarArr, this.f, list, i4);
            }
            int i6 = (int) ((vr1) list.get(i3)).a;
            int i7 = i4;
            md2 o = this.d.o(i2 + i3, i5, i6, a(i5, i6), i7);
            i5 += i6;
            md2VarArr[i3] = o;
            i3++;
            i4 = i7;
        }
    }
}
