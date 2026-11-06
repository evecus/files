package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sd2 {
    public final cd2 a;
    public final ArrayList b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final ArrayList g;
    public List h;
    public int i;

    public sd2(cd2 cd2Var) {
        this.a = cd2Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qd2(0, 0));
        this.b = arrayList;
        this.f = -1;
        this.g = new ArrayList();
        this.h = o91.I;
    }

    public final int a() {
        return ((int) Math.sqrt((d() * 1.0d) / this.i)) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        if (r9 < r7) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yw0 b(int r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd2.b(int):yw0");
    }

    public final int c(int i) {
        int i2;
        if (d() <= 0) {
            return 0;
        }
        if (i >= d()) {
            t02.a("ItemIndex > total count");
        }
        if (!this.a.f) {
            return i / this.i;
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        p70.q0(arrayList.size(), size);
        int i3 = size - 1;
        int i4 = 0;
        while (true) {
            if (i4 > i3) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + i3) >>> 1;
            int i5 = ((qd2) arrayList.get(i2)).a - i;
            if (i5 >= 0) {
                if (i5 <= 0) {
                    break;
                }
                i3 = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 < 0) {
            i2 = (-i2) - 2;
        }
        int a = a() * i2;
        int i6 = ((qd2) arrayList.get(i2)).a;
        if (i6 > i) {
            t02.a("currentItemIndex > itemIndex");
        }
        int i7 = 0;
        while (i6 < i) {
            int i8 = i6 + 1;
            int e = e(i6);
            i7 += e;
            int i9 = this.i;
            if (i7 >= i9) {
                if (i7 == i9) {
                    a++;
                    i7 = 0;
                } else {
                    a++;
                    i7 = e;
                }
            }
            if (a % a() == 0 && a / a() >= arrayList.size()) {
                arrayList.add(new qd2(i8 - (i7 > 0 ? 1 : 0), 0));
            }
            i6 = i8;
        }
        return e(i) + i7 > this.i ? a + 1 : a;
    }

    public final int d() {
        return this.a.e.a;
    }

    public final int e(int i) {
        x32 c = this.a.e.c(i);
        int i2 = i - c.a;
        return (int) ((vr1) ((zc2) c.c).b.invoke(rd2.a, Integer.valueOf(i2))).a;
    }
}
