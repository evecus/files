package defpackage;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Build;
import androidx.media3.common.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class d04 extends xm4 implements t32 {
    public final List c;
    public final List d;
    public final long e;
    public final float f;

    public d04(List list, List list2, long j, float f) {
        this.c = list;
        this.d = list2;
        this.e = j;
        this.f = f;
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
            obj = new d04(arrayList, this.d, this.e, this.f);
        }
        if (!(obj instanceof d04)) {
            return null;
        }
        d04 d04Var = (d04) obj;
        return new d04(c5.V(list, d04Var.c, f), c5.W(this.d, d04Var.d, f), dq2.i0(this.e, d04Var.e, f), vt0.G(this.f, d04Var.f, f));
    }

    @Override // defpackage.xm4
    public final Shader c(long j) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j2 = this.e;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long q = ad4.q(j);
            intBitsToFloat = Float.intBitsToFloat((int) (q >> 32));
            intBitsToFloat2 = Float.intBitsToFloat((int) (q & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            intBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            intBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        float f = this.f;
        if (f == Float.POSITIVE_INFINITY) {
            f = fq4.b(j) / 2.0f;
        }
        float f2 = f;
        List list = this.c;
        List list2 = this.d;
        j42.m0(list, list2);
        if (Build.VERSION.SDK_INT < 29) {
            int q2 = j42.q(list);
            return new RadialGradient(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits)), f2, j42.L(q2, list), j42.M(list2, q2, list), mw2.R(0));
        }
        int size = list.size();
        long[] jArr = new long[size];
        for (int i3 = 0; i3 < size; i3++) {
            jArr[i3] = mw2.V(((x70) list.get(i3)).a);
        }
        return fr1.a.b(floatToRawIntBits, f2, jArr, list2 != null ? o70.o1(list2) : null, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d04)) {
            return false;
        }
        d04 d04Var = (d04) obj;
        return j42.c(this.c, d04Var.c) && j42.c(this.d, d04Var.d) && pd3.c(this.e, d04Var.e) && this.f == d04Var.f;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        List list = this.d;
        return jp0.o(this.f, (i82.Q(this.e) + ((hashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31, 31);
    }

    public final String toString() {
        long j = this.e;
        String str = "";
        String C = (9223372034707292159L & j) != 9205357640488583168L ? r7.C("center=", pd3.h(j), ", ") : "";
        float f = this.f;
        if ((Float.floatToRawIntBits(f) & Log.LOG_LEVEL_OFF) < 2139095040) {
            str = "radius=" + f + ", ";
        }
        return "RadialGradient(colors=" + this.c + ", stops=" + this.d + ", " + C + str + "tileMode=Clamp)";
    }

    public /* synthetic */ d04(List list, long j, float f) {
        this(list, null, j, f);
    }
}
