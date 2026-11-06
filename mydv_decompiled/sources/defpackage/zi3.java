package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class zi3 implements vw2 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final pg3 e;
    public final int f;
    public final int g;
    public final int h;
    public final yw2 i;
    public final yw2 j;
    public final float k;
    public final int l;
    public final boolean m;
    public final q8 n;
    public final vw2 o;
    public final boolean p;
    public final List q;
    public final List r;
    public final dl0 s;
    public final iu0 t;
    public final long u;

    public zi3(List list, int i, int i2, int i3, pg3 pg3Var, int i4, int i5, int i6, yw2 yw2Var, yw2 yw2Var2, float f, int i7, boolean z, q8 q8Var, vw2 vw2Var, boolean z2, List list2, List list3, dl0 dl0Var, iu0 iu0Var, long j) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = pg3Var;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = yw2Var;
        this.j = yw2Var2;
        this.k = f;
        this.l = i7;
        this.m = z;
        this.n = q8Var;
        this.o = vw2Var;
        this.p = z2;
        this.q = list2;
        this.r = list3;
        this.s = dl0Var;
        this.t = iu0Var;
        this.u = j;
    }

    @Override // defpackage.vw2
    public final Map a() {
        return this.o.a();
    }

    @Override // defpackage.vw2
    public final void b() {
        this.o.b();
    }

    @Override // defpackage.vw2
    public final tm1 c() {
        return this.o.c();
    }

    @Override // defpackage.vw2
    public final hn1 d() {
        return this.o.d();
    }

    @Override // defpackage.vw2
    public final tm1 e() {
        return this.o.e();
    }

    public final zi3 f(int i) {
        int i2;
        int i3 = this.b + this.c;
        if (this.p) {
            return null;
        }
        List list = this.a;
        if (list.isEmpty() || this.i == null || (i2 = this.l - i) < 0 || i2 >= i3) {
            return null;
        }
        float f = this.k - (i3 != 0 ? i / i3 : 0.0f);
        if (this.j == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        yw2 yw2Var = (yw2) o70.T0(list);
        yw2 yw2Var2 = (yw2) o70.a1(list);
        int i4 = this.g;
        int i5 = this.f;
        if (i < 0) {
            if (Math.min((yw2Var.j + i3) - i5, (yw2Var2.j + i3) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - yw2Var.j, i4 - yw2Var2.j) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((yw2) list.get(i6)).a(i);
        }
        List list2 = this.q;
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((yw2) list2.get(i7)).a(i);
        }
        List list3 = this.r;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            ((yw2) list3.get(i8)).a(i);
        }
        return new zi3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, f, i2, this.m || i > 0, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u);
    }

    public final long g() {
        vw2 vw2Var = this.o;
        return (vw2Var.getWidth() << 32) | (vw2Var.getHeight() & 4294967295L);
    }

    @Override // defpackage.vw2
    public final int getHeight() {
        return this.o.getHeight();
    }

    @Override // defpackage.vw2
    public final int getWidth() {
        return this.o.getWidth();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ zi3(int r24, int r25, int r26, defpackage.pg3 r27, int r28, int r29, int r30, defpackage.q8 r31, defpackage.vw2 r32, defpackage.dl0 r33, defpackage.iu0 r34, long r35) {
        /*
            r23 = this;
            r13 = 0
            r16 = 0
            o91 r1 = defpackage.o91.I
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r17 = r1
            r18 = r1
            r0 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r14 = r31
            r15 = r32
            r19 = r33
            r20 = r34
            r21 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi3.<init>(int, int, int, pg3, int, int, int, q8, vw2, dl0, iu0, long):void");
    }
}
