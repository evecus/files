package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class li5 {
    public final boolean a;
    public final ki5 b;
    public final int c;
    public final ip0[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public li5(boolean z, ki5 ki5Var) {
        int i;
        this.a = z;
        this.b = ki5Var;
        if (z && ki5Var.equals(ki5.I)) {
            zy.i("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int ordinal = ki5Var.ordinal();
        if (ordinal == 0) {
            i = 3;
        } else {
            if (ordinal != 1) {
                s83.v();
                throw null;
            }
            i = 2;
        }
        this.c = i;
        this.d = new ip0[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(long j, float f) {
        int i = (this.e + 1) % 20;
        this.e = i;
        ip0[] ip0VarArr = this.d;
        ip0 ip0Var = ip0VarArr[i];
        if (ip0Var != null) {
            ip0Var.a = j;
            ip0Var.b = f;
        } else {
            ip0 ip0Var2 = new ip0();
            ip0Var2.a = j;
            ip0Var2.b = f;
            ip0VarArr[i] = ip0Var2;
        }
    }

    public final float b() {
        boolean z;
        ki5 ki5Var;
        float[] fArr;
        int i;
        float[] fArr2;
        int i2;
        float f;
        float f2;
        float f3;
        int i3 = this.e;
        ip0[] ip0VarArr = this.d;
        ip0 ip0Var = ip0VarArr[i3];
        if (ip0Var == null) {
            return 0.0f;
        }
        int i4 = 0;
        ip0 ip0Var2 = ip0Var;
        do {
            ip0 ip0Var3 = ip0VarArr[i3];
            z = this.a;
            ki5Var = this.b;
            float[] fArr3 = this.f;
            fArr = this.g;
            if (ip0Var3 == null) {
                i = i4;
                fArr2 = fArr3;
                i2 = 1;
                f = 0.0f;
            } else {
                long j = ip0Var.a;
                i = i4;
                f = 0.0f;
                long j2 = ip0Var3.a;
                float f4 = j - j2;
                fArr2 = fArr3;
                i2 = 1;
                float abs = Math.abs(j2 - ip0Var2.a);
                ip0Var2 = (ki5Var == ki5.I || z) ? ip0Var3 : ip0Var;
                if (f4 <= 100.0f && abs <= 40.0f) {
                    fArr2[i] = ip0Var3.b;
                    fArr[i] = -f4;
                    if (i3 == 0) {
                        i3 = 20;
                    }
                    i3--;
                    i4 = i + 1;
                }
            }
            i4 = i;
            break;
        } while (i4 < 20);
        if (i4 < this.c) {
            return f;
        }
        int ordinal = ki5Var.ordinal();
        if (ordinal == 0) {
            try {
                float[] fArr4 = this.h;
                fb4.O(fArr, fArr2, i4, fArr4);
                f2 = fArr4[1];
            } catch (IllegalArgumentException unused) {
                f2 = f;
            }
            f3 = f2;
        } else {
            if (ordinal != i2) {
                s83.v();
                return f;
            }
            int i5 = i4 - i2;
            float f5 = fArr[i5];
            int i6 = i5;
            float f6 = f;
            while (i6 > 0) {
                int i7 = i6 - 1;
                float f7 = fArr[i7];
                if (f5 != f7) {
                    float f8 = (z ? -fArr2[i7] : fArr2[i6] - fArr2[i7]) / (f5 - f7);
                    float abs2 = (Math.abs(f8) * (f8 - (Math.signum(f6) * ((float) Math.sqrt(Math.abs(f6) * 2.0f))))) + f6;
                    if (i6 == i5) {
                        abs2 *= 0.5f;
                    }
                    f6 = abs2;
                }
                i6--;
                f5 = f7;
            }
            f3 = Math.signum(f6) * ((float) Math.sqrt(Math.abs(f6) * 2.0f));
        }
        return f3 * 1000.0f;
    }

    public final float c(float f) {
        if (f <= 0.0f) {
            q02.b("maximumVelocity should be a positive value. You specified=" + f);
        }
        float b = b();
        if (b == 0.0f || Float.isNaN(b)) {
            return 0.0f;
        }
        if (b <= 0.0f) {
            float f2 = -f;
            if (b < f2) {
                return f2;
            }
        } else if (b > f) {
            return f;
        }
        return b;
    }

    public final void d() {
        dq.X0(0, r0.length, null, this.d);
        this.e = 0;
    }

    public /* synthetic */ li5() {
        this(false, ki5.I);
    }

    public li5(boolean z) {
        this(z, ki5.J);
    }
}
