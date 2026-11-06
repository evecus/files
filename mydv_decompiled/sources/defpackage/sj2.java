package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class sj2 extends xm4 implements t32 {
    public final List c;
    public final List d;
    public final long e;
    public final long f;

    public sj2(List list, List list2, long j, long j2) {
        this.c = list;
        this.d = list2;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.t32
    public final Object b(Object obj, float f) {
        if (obj == null) {
            obj = new rt4(x70.f);
        }
        boolean z = obj instanceof rt4;
        List list = this.c;
        if (z) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                long j = ((x70) list.get(i)).a;
                arrayList.add(new x70(((rt4) obj).a));
            }
            obj = new sj2(arrayList, this.d, this.e, this.f);
        }
        if (!(obj instanceof sj2)) {
            return null;
        }
        sj2 sj2Var = (sj2) obj;
        return new sj2(c5.V(list, sj2Var.c, f), c5.W(this.d, sj2Var.d, f), c5.X(this.e, sj2Var.e, f), c5.X(this.f, sj2Var.f, f));
    }

    @Override // defpackage.xm4
    public final Shader c(long j) {
        long j2 = this.e;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float intBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.f;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float intBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float intBitsToFloat4 = Float.intBitsToFloat(i4);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L);
        List list = this.c;
        List list2 = this.d;
        j42.m0(list, list2);
        if (Build.VERSION.SDK_INT < 29) {
            int q = j42.q(list);
            return new LinearGradient(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)), Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits2 & 4294967295L)), j42.L(q, list), j42.M(list2, q, list), mw2.R(0));
        }
        int size = list.size();
        long[] jArr = new long[size];
        for (int i5 = 0; i5 < size; i5++) {
            jArr[i5] = mw2.V(((x70) list.get(i5)).a);
        }
        return fr1.a.a(floatToRawIntBits, floatToRawIntBits2, jArr, list2 != null ? o70.o1(list2) : null, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj2)) {
            return false;
        }
        sj2 sj2Var = (sj2) obj;
        return this.c.equals(sj2Var.c) && j42.c(this.d, sj2Var.d) && pd3.c(this.e, sj2Var.e) && pd3.c(this.f, sj2Var.f);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        List list = this.d;
        return (i82.Q(this.f) + ((i82.Q(this.e) + ((hashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        long j = this.e;
        String C = ((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 ? r7.C("start=", pd3.h(j), ", ") : "";
        long j2 = this.f;
        return "LinearGradient(colors=" + this.c + ", stops=" + this.d + ", " + C + (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 ? r7.C("end=", pd3.h(j2), ", ") : "") + "tileMode=Clamp)";
    }
}
