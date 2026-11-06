package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class lg3 extends ut0 {
    public int e;
    public int g;
    public int i;
    public jg3[] d = new jg3[16];
    public int[] f = new int[16];
    public Object[] h = new Object[16];

    public final void f0() {
        this.e = 0;
        this.g = 0;
        Arrays.fill(this.h, 0, this.i, (Object) null);
        this.i = 0;
    }

    public final void g0(ap apVar, wr4 wr4Var, j34 j34Var, kg3 kg3Var) {
        if (this.e != 0) {
            mo1 mo1Var = new mo1();
            mo1Var.d = this;
            lg3 lg3Var = (lg3) mo1Var.d;
            while (true) {
                jg3 jg3Var = lg3Var.d[mo1Var.a];
                bo1 b = jg3Var.b(mo1Var);
                ap apVar2 = apVar;
                wr4 wr4Var2 = wr4Var;
                j34 j34Var2 = j34Var;
                kg3 kg3Var2 = kg3Var;
                try {
                    jg3Var.a(mo1Var, apVar2, wr4Var2, j34Var2, kg3Var2);
                    int i = mo1Var.a;
                    int i2 = lg3Var.e;
                    if (i < i2) {
                        jg3 jg3Var2 = lg3Var.d[i];
                        mo1Var.b += jg3Var2.a;
                        mo1Var.c += jg3Var2.b;
                        int i3 = i + 1;
                        mo1Var.a = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        apVar = apVar2;
                        wr4Var = wr4Var2;
                        j34Var = j34Var2;
                        kg3Var = kg3Var2;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    jl2.c(th, kg3Var2, wr4Var2, b);
                    throw th;
                }
            }
        }
        f0();
    }

    public final boolean h0() {
        return this.e == 0;
    }

    public final void i0(jg3 jg3Var) {
        int i = this.e;
        jg3[] jg3VarArr = this.d;
        if (i == jg3VarArr.length) {
            jg3[] jg3VarArr2 = new jg3[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(jg3VarArr, 0, jg3VarArr2, 0, i);
            this.d = jg3VarArr2;
        }
        int i2 = this.g;
        int i3 = jg3Var.a;
        int i4 = jg3Var.b;
        int i5 = i2 + i3;
        int[] iArr = this.f;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            dq.O0(0, 0, length, iArr, iArr2);
            this.f = iArr2;
        }
        int i7 = this.i + i4;
        Object[] objArr = this.h;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.h = objArr2;
        }
        jg3[] jg3VarArr3 = this.d;
        int i9 = this.e;
        this.e = i9 + 1;
        jg3VarArr3[i9] = jg3Var;
        this.g += jg3Var.a;
        this.i += i4;
    }
}
