package defpackage;

import android.text.Layout;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bx implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ long J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Serializable L;
    public final /* synthetic */ Object M;

    public /* synthetic */ bx(long j, float[] fArr, p24 p24Var, o24 o24Var) {
        this.I = (byte) 2;
        this.J = j;
        this.K = fArr;
        this.L = p24Var;
        this.M = o24Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        long j;
        int i;
        boolean z;
        float a;
        float f;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj2 = this.M;
        Serializable serializable = this.L;
        Object obj3 = this.K;
        switch (b) {
            case 0:
                m14 m14Var = (m14) obj3;
                r24 r24Var = (r24) serializable;
                long j2 = this.J;
                c80 c80Var = (c80) obj2;
                ya2 ya2Var = (ya2) ((zh0) obj);
                ya2Var.a();
                float f2 = m14Var.a;
                float f3 = m14Var.b;
                r10 r10Var = ya2Var.I;
                ((ep) r10Var.J.b).K(f2, f3);
                try {
                    r7.h(ya2Var, (tw1) r24Var.I, 0L, j2, 0L, 0L, 0.0f, c80Var, 0, 890);
                    return wd5Var;
                } finally {
                    ((ep) r10Var.J.b).K(-f2, -f3);
                }
            case 1:
                an3 an3Var = (an3) obj;
                hm5 hm5Var = new hm5((ArrayList) serializable, this.J, (pe2) obj2, (byte) 2);
                an3Var.I = true;
                hm5Var.invoke(an3Var);
                an3Var.I = false;
                ((qg2) obj3).a.u.getValue();
                return wd5Var;
            default:
                float[] fArr = (float[]) obj3;
                p24 p24Var = (p24) serializable;
                o24 o24Var = (o24) obj2;
                yj3 yj3Var = (yj3) obj;
                int i2 = yj3Var.b;
                td tdVar = yj3Var.a;
                int i3 = yj3Var.c;
                long j3 = this.J;
                int f4 = i2 > d65.f(j3) ? yj3Var.b : d65.f(j3);
                if (i3 >= d65.e(j3)) {
                    i3 = d65.e(j3);
                }
                long c = ui4.c(yj3Var.d(f4), yj3Var.d(i3));
                int i4 = p24Var.I;
                s55 s55Var = tdVar.d;
                int f5 = d65.f(c);
                int e = d65.e(c);
                Layout layout = s55Var.f;
                int length = layout.getText().length();
                if (f5 < 0) {
                    r02.a("startOffset must be > 0");
                }
                if (f5 >= length) {
                    r02.a("startOffset must be less than text length");
                }
                if (e <= f5) {
                    r02.a("endOffset must be greater than startOffset");
                }
                if (e > length) {
                    r02.a("endOffset must be smaller or equal to text length");
                }
                if (fArr.length - i4 < (e - f5) * 4) {
                    r02.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int g = s55Var.g(f5);
                int g2 = s55Var.g(e - 1);
                ev1 ev1Var = new ev1(s55Var);
                if (g <= g2) {
                    while (true) {
                        int lineStart = layout.getLineStart(g);
                        j = c;
                        int f6 = s55Var.f(g);
                        int max = Math.max(f5, lineStart);
                        int min = Math.min(e, f6);
                        float i5 = s55Var.i(g);
                        float e2 = s55Var.e(g);
                        boolean z2 = true;
                        boolean z3 = layout.getParagraphDirection(g) == 1;
                        int i6 = i4;
                        int i7 = max;
                        while (i7 < min) {
                            boolean isRtlCharAt = layout.isRtlCharAt(i7);
                            if (!z3 || isRtlCharAt) {
                                i = min;
                                if (z3 && isRtlCharAt) {
                                    float a2 = ev1Var.a(i7, false, false, false);
                                    z = z3;
                                    f = ev1Var.a(i7 + 1, z2, z2, false);
                                    a = a2;
                                } else {
                                    z = z3;
                                    if (z || !isRtlCharAt) {
                                        float a3 = ev1Var.a(i7, false, false, false);
                                        a = ev1Var.a(i7 + 1, z2, z2, false);
                                        f = a3;
                                    } else {
                                        float a4 = ev1Var.a(i7, false, false, z2);
                                        f = ev1Var.a(i7 + 1, z2, z2, z2);
                                        a = a4;
                                    }
                                }
                            } else {
                                i = min;
                                float a5 = ev1Var.a(i7, false, false, z2);
                                a = ev1Var.a(i7 + 1, z2, z2, z2);
                                z = z3;
                                f = a5;
                            }
                            fArr[i6] = f;
                            fArr[i6 + 1] = i5;
                            fArr[i6 + 2] = a;
                            fArr[i6 + 3] = e2;
                            i6 += 4;
                            i7++;
                            min = i;
                            z3 = z;
                            z2 = true;
                        }
                        if (g != g2) {
                            g++;
                            c = j;
                            i4 = i6;
                        }
                    }
                } else {
                    j = c;
                }
                int d = (d65.d(j) * 4) + p24Var.I;
                for (int i8 = p24Var.I; i8 < d; i8 += 4) {
                    int i9 = i8 + 1;
                    float f7 = fArr[i9];
                    float f8 = o24Var.I;
                    fArr[i9] = f7 + f8;
                    int i10 = i8 + 3;
                    fArr[i10] = fArr[i10] + f8;
                }
                p24Var.I = d;
                o24Var.I += tdVar.f;
                return wd5Var;
        }
    }

    public /* synthetic */ bx(Object obj, Serializable serializable, long j, Object obj2, byte b) {
        this.I = b;
        this.K = obj;
        this.L = serializable;
        this.J = j;
        this.M = obj2;
    }
}
