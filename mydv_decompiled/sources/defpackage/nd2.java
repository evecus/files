package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nd2 {
    public final int a;
    public final md2[] b;
    public final pd2 c;
    public final List d;
    public final int e;
    public final int f;
    public final int g;

    public nd2(int i, md2[] md2VarArr, pd2 pd2Var, List list, int i2) {
        this.a = i;
        this.b = md2VarArr;
        this.c = pd2Var;
        this.d = list;
        this.e = i2;
        int i3 = 0;
        for (md2 md2Var : md2VarArr) {
            i3 = Math.max(i3, md2Var.k);
        }
        this.f = i3;
        int i4 = i3 + this.e;
        this.g = i4 >= 0 ? i4 : 0;
    }

    public final md2[] a(int i, int i2, int i3) {
        md2[] md2VarArr = this.b;
        int length = md2VarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            md2 md2Var = md2VarArr[i4];
            int i7 = i5 + 1;
            int i8 = (int) ((vr1) this.d.get(i5)).a;
            md2Var.m(i, this.c.b[i6], i2, i3, this.a, i6);
            i6 += i8;
            i4++;
            i5 = i7;
        }
        return md2VarArr;
    }
}
