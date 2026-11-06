package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class jg0 {
    public final v80 a;
    public final v80 b;
    public final v80 c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jg0(defpackage.v80 r10, defpackage.v80 r11, int r12) {
        /*
            r9 = this;
            long r0 = r10.b
            r2 = 12884901888(0x300000000, double:6.365987373E-314)
            boolean r0 = defpackage.o7.r(r0, r2)
            if (r0 == 0) goto L12
            v80 r0 = defpackage.i42.a0(r10)
            goto L13
        L12:
            r0 = r10
        L13:
            long r4 = r11.b
            boolean r1 = defpackage.o7.r(r4, r2)
            if (r1 == 0) goto L20
            v80 r1 = defpackage.i42.a0(r11)
            goto L21
        L20:
            r1 = r11
        L21:
            float[] r4 = defpackage.j42.m
            r5 = 3
            r6 = 0
            if (r12 != r5) goto L6d
            long r7 = r10.b
            boolean r12 = defpackage.o7.r(r7, r2)
            long r7 = r11.b
            boolean r2 = defpackage.o7.r(r7, r2)
            if (r12 == 0) goto L38
            if (r2 == 0) goto L38
            goto L6d
        L38:
            if (r12 != 0) goto L3c
            if (r2 == 0) goto L6d
        L3c:
            if (r12 == 0) goto L3f
            goto L40
        L3f:
            r10 = r11
        L40:
            v54 r10 = (defpackage.v54) r10
            it5 r10 = r10.d
            if (r12 == 0) goto L4b
            float[] r12 = r10.a()
            goto L4c
        L4b:
            r12 = r4
        L4c:
            if (r2 == 0) goto L52
            float[] r4 = r10.a()
        L52:
            r10 = 0
            r2 = r12[r10]
            r3 = r4[r10]
            float r2 = r2 / r3
            r3 = 1
            r6 = r12[r3]
            r7 = r4[r3]
            float r6 = r6 / r7
            r7 = 2
            r12 = r12[r7]
            r4 = r4[r7]
            float r12 = r12 / r4
            float[] r4 = new float[r5]
            r4[r10] = r2
            r4[r3] = r6
            r4[r7] = r12
            r6 = r4
        L6d:
            r9.<init>(r11, r0, r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jg0.<init>(v80, v80, int):void");
    }

    public long a(long j) {
        float h = x70.h(j);
        float g = x70.g(j);
        float e = x70.e(j);
        float d = x70.d(j);
        v80 v80Var = this.b;
        long d2 = v80Var.d(h, g, e);
        float intBitsToFloat = Float.intBitsToFloat((int) (d2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d2 & 4294967295L));
        float e2 = v80Var.e(h, g, e);
        float[] fArr = this.d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e2 *= fArr[2];
        }
        float f = intBitsToFloat;
        float f2 = intBitsToFloat2;
        return this.c.f(f, f2, e2, d, this.a);
    }

    public jg0(v80 v80Var, v80 v80Var2, v80 v80Var3, float[] fArr) {
        this.a = v80Var;
        this.b = v80Var2;
        this.c = v80Var3;
        this.d = fArr;
    }
}
