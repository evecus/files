package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class v54 extends v80 {
    public static final s83 r = new s83(13);
    public final it5 d;
    public final float e;
    public final float f;
    public final q95 g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final ty0 k;
    public final u54 l;
    public final r54 m;
    public final ty0 n;
    public final u54 o;
    public final r54 p;
    public final boolean q;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01df, code lost:
    
        if ((((r25 - r12) * r3) - ((r1 - r15) * r10)) >= 0.0f) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r44v1 */
    /* JADX WARN: Type inference failed for: r44v2 */
    /* JADX WARN: Type inference failed for: r44v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v54(java.lang.String r36, float[] r37, defpackage.it5 r38, float[] r39, defpackage.ty0 r40, defpackage.ty0 r41, float r42, float r43, defpackage.q95 r44, int r45) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v54.<init>(java.lang.String, float[], it5, float[], ty0, ty0, float, float, q95, int):void");
    }

    @Override // defpackage.v80
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.v80
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.v80
    public final boolean c() {
        return this.q;
    }

    @Override // defpackage.v80
    public final long d(float f, float f2, float f3) {
        double d = f;
        r54 r54Var = this.p;
        float b = (float) r54Var.b(d);
        float b2 = (float) r54Var.b(f2);
        float b3 = (float) r54Var.b(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * b3) + (fArr[3] * b2) + (fArr[0] * b);
        float f5 = (fArr[7] * b3) + (fArr[4] * b2) + (fArr[1] * b);
        return (Float.floatToRawIntBits(f4) << 32) | (4294967295L & Float.floatToRawIntBits(f5));
    }

    @Override // defpackage.v80
    public final float e(float f, float f2, float f3) {
        double d = f;
        r54 r54Var = this.p;
        float b = (float) r54Var.b(d);
        float b2 = (float) r54Var.b(f2);
        float b3 = (float) r54Var.b(f3);
        float[] fArr = this.i;
        return (fArr[8] * b3) + (fArr[5] * b2) + (fArr[2] * b);
    }

    @Override // defpackage.v80
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v54.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        v54 v54Var = (v54) obj;
        if (Float.compare(v54Var.e, this.e) != 0 || Float.compare(v54Var.f, this.f) != 0 || !j42.c(this.d, v54Var.d) || !Arrays.equals(this.h, v54Var.h)) {
            return false;
        }
        q95 q95Var = v54Var.g;
        q95 q95Var2 = this.g;
        if (q95Var2 != null) {
            return j42.c(q95Var2, q95Var);
        }
        if (q95Var == null) {
            return true;
        }
        if (j42.c(this.k, v54Var.k)) {
            return j42.c(this.n, v54Var.n);
        }
        return false;
    }

    @Override // defpackage.v80
    public final long f(float f, float f2, float f3, float f4, v80 v80Var) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        r54 r54Var = this.m;
        return qb.h((float) r54Var.b(f5), (float) r54Var.b(f6), (float) r54Var.b(f7), f4, v80Var);
    }

    @Override // defpackage.v80
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int floatToIntBits = (hashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int floatToIntBits2 = (floatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        q95 q95Var = this.g;
        int hashCode2 = floatToIntBits2 + (q95Var != null ? q95Var.hashCode() : 0);
        if (q95Var != null) {
            return hashCode2;
        }
        return this.n.hashCode() + ((this.k.hashCode() + (hashCode2 * 31)) * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v54(java.lang.String r19, float[] r20, defpackage.it5 r21, final defpackage.q95 r22, int r23) {
        /*
            r18 = this;
            r9 = r22
            double r0 = r9.a
            r2 = -4609434218613702656(0xc008000000000000, double:-3.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 != 0) goto Le
            r4 = r6
            goto Lf
        Le:
            r4 = r5
        Lf:
            double r7 = r9.g
            double r10 = r9.f
            r12 = -4611686018427387904(0xc000000000000000, double:-2.0)
            r14 = 0
            if (r4 == 0) goto L22
            t54 r4 = new t54
            r16 = r2
            r2 = 4
            r4.<init>()
            goto L44
        L22:
            r16 = r2
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 != 0) goto L2f
            t54 r4 = new t54
            r2 = 5
            r4.<init>()
            goto L44
        L2f:
            int r2 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r2 != 0) goto L3e
            int r2 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r2 != 0) goto L3e
            t54 r4 = new t54
            r2 = 6
            r4.<init>()
            goto L44
        L3e:
            t54 r4 = new t54
            r2 = 7
            r4.<init>()
        L44:
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 != 0) goto L4f
            t54 r0 = new t54
            r0.<init>()
        L4d:
            r6 = r0
            goto L6f
        L4f:
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 != 0) goto L59
            t54 r0 = new t54
            r0.<init>()
            goto L4d
        L59:
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r0 != 0) goto L68
            int r0 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r0 != 0) goto L68
            t54 r0 = new t54
            r1 = 2
            r0.<init>()
            goto L4d
        L68:
            t54 r0 = new t54
            r1 = 3
            r0.<init>()
            goto L4d
        L6f:
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r5 = r4
            r4 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r10 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v54.<init>(java.lang.String, float[], it5, q95, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v54(java.lang.String r18, float[] r19, defpackage.it5 r20, final double r21, float r23, float r24, int r25) {
        /*
            r17 = this;
            r1 = r21
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            s83 r3 = defpackage.v54.r
            if (r0 != 0) goto Lc
            r11 = r3
            goto L13
        Lc:
            s54 r4 = new s54
            r5 = 0
            r4.<init>()
            r11 = r4
        L13:
            if (r0 != 0) goto L17
        L15:
            r12 = r3
            goto L1e
        L17:
            s54 r3 = new s54
            r0 = 1
            r3.<init>()
            goto L15
        L1e:
            q95 r15 = new q95
            r7 = 0
            r9 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r0 = r15
            r0.<init>(r1, r3, r5, r7, r9)
            r10 = 0
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r13 = r23
            r14 = r24
            r16 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v54.<init>(java.lang.String, float[], it5, double, float, float, int):void");
    }
}
