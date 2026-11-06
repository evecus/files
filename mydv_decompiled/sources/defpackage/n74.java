package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class n74 {
    public final List a;
    public final long b;
    public final mk2 c;

    /* JADX WARN: Multi-variable type inference failed */
    public n74(AbstractList abstractList, long j) {
        ArrayList arrayList;
        ArrayList arrayList2;
        char c;
        char c2;
        km0 km0Var;
        km0 km0Var2;
        List list;
        char c3;
        char c4;
        abstractList.getClass();
        this.a = abstractList;
        this.b = j;
        mk2 K = p70.K();
        char c5 = 3;
        char c6 = 2;
        if (abstractList.size() <= 0 || ((pd1) abstractList.get(0)).a.size() != 3) {
            arrayList = null;
            arrayList2 = null;
        } else {
            uj3 d = ((km0) ((pd1) abstractList.get(0)).a.get(1)).d(0.5f);
            km0 km0Var3 = (km0) d.I;
            km0 km0Var4 = (km0) d.J;
            arrayList2 = p70.n0(((pd1) abstractList.get(0)).a.get(0), km0Var3);
            arrayList = p70.n0(km0Var4, ((pd1) abstractList.get(0)).a.get(2));
        }
        int size = abstractList.size();
        if (size >= 0) {
            int i = 0;
            km0Var = null;
            km0Var2 = null;
            while (true) {
                if (i == 0 && arrayList != null) {
                    list = arrayList;
                } else if (i != this.a.size()) {
                    list = ((pd1) this.a.get(i)).a;
                } else {
                    if (arrayList2 == null) {
                        c = c5;
                        c2 = c6;
                        break;
                    }
                    list = arrayList2;
                }
                int size2 = list.size();
                int i2 = 0;
                while (i2 < size2) {
                    km0 km0Var5 = (km0) list.get(i2);
                    if (km0Var5.f()) {
                        c3 = c5;
                        if (km0Var2 != null) {
                            float[] fArr = km0Var2.a;
                            c4 = c6;
                            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
                            km0 km0Var6 = new km0(copyOf);
                            copyOf[6] = km0Var5.a();
                            copyOf[7] = km0Var5.b();
                            km0Var2 = km0Var6;
                        } else {
                            c4 = c6;
                        }
                    } else {
                        if (km0Var2 != null) {
                            K.add(km0Var2);
                        }
                        c3 = c5;
                        c4 = c6;
                        if (km0Var == null) {
                            km0Var = km0Var5;
                            km0Var2 = km0Var;
                        } else {
                            km0Var2 = km0Var5;
                        }
                    }
                    i2++;
                    c5 = c3;
                    c6 = c4;
                }
                c = c5;
                c2 = c6;
                if (i == size) {
                    break;
                }
                i++;
                c5 = c;
                c6 = c2;
            }
        } else {
            c = 3;
            c2 = 2;
            km0Var = null;
            km0Var2 = null;
        }
        if (km0Var2 == null || km0Var == null) {
            K.add(mw2.d(sp0.V(this.b), sp0.W(this.b), sp0.V(this.b), sp0.W(this.b), sp0.V(this.b), sp0.W(this.b), sp0.V(this.b), sp0.W(this.b)));
        } else {
            float[] fArr2 = km0Var2.a;
            float f = fArr2[0];
            float f2 = fArr2[1];
            float f3 = fArr2[c2];
            float f4 = fArr2[c];
            float f5 = fArr2[4];
            float f6 = fArr2[5];
            float[] fArr3 = km0Var.a;
            K.add(mw2.d(f, f2, f3, f4, f5, f6, fArr3[0], fArr3[1]));
        }
        mk2 D = p70.D(K);
        this.c = D;
        Object obj = D.get(D.c() - 1);
        int c7 = D.c();
        int i3 = 0;
        while (i3 < c7) {
            km0 km0Var7 = (km0) this.c.get(i3);
            km0 km0Var8 = (km0) obj;
            if (Math.abs(km0Var7.a[0] - km0Var8.a()) > 1.0E-4f || Math.abs(km0Var7.a[1] - km0Var8.b()) > 1.0E-4f) {
                s83.t("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
                throw null;
            }
            i3++;
            obj = km0Var7;
        }
    }

    public static float[] a(n74 n74Var, float[] fArr, int i) {
        char c;
        char c2;
        char c3;
        char c4;
        char c5 = 1;
        char c6 = 4;
        float[] fArr2 = (i & 1) != 0 ? new float[4] : fArr;
        mk2 mk2Var = n74Var.c;
        if (fArr2.length < 4) {
            s83.t("Required bounds size of 4");
            return null;
        }
        int c7 = mk2Var.c();
        float f = Float.MIN_VALUE;
        char c8 = 0;
        float f2 = Float.MAX_VALUE;
        float f3 = Float.MAX_VALUE;
        int i2 = 0;
        float f4 = Float.MIN_VALUE;
        while (i2 < c7) {
            km0 km0Var = (km0) mk2Var.get(i2);
            km0Var.getClass();
            boolean f5 = km0Var.f();
            float[] fArr3 = km0Var.a;
            if (f5) {
                fArr2[c8] = fArr3[c8];
                fArr2[c5] = fArr3[c5];
                fArr2[2] = fArr3[c8];
                fArr2[3] = fArr3[c5];
                c = c5;
                c2 = c6;
                c3 = c8;
                c4 = 2;
            } else {
                c = c5;
                float min = Math.min(fArr3[c8], km0Var.a());
                c2 = c6;
                float min2 = Math.min(fArr3[c], km0Var.b());
                c3 = c8;
                float max = Math.max(fArr3[c8], km0Var.a());
                float max2 = Math.max(fArr3[c], km0Var.b());
                c4 = 2;
                fArr2[c3] = Math.min(min, Math.min(fArr3[2], fArr3[c2]));
                fArr2[c] = Math.min(min2, Math.min(fArr3[3], fArr3[5]));
                fArr2[2] = Math.max(max, Math.max(fArr3[2], fArr3[c2]));
                fArr2[3] = Math.max(max2, Math.max(fArr3[3], fArr3[5]));
            }
            f2 = Math.min(f2, fArr2[c3]);
            f3 = Math.min(f3, fArr2[c]);
            f = Math.max(f, fArr2[c4]);
            f4 = Math.max(f4, fArr2[3]);
            i2++;
            c8 = c3;
            c6 = c2;
            c5 = c;
        }
        fArr2[c8] = f2;
        fArr2[c5] = f3;
        fArr2[2] = f;
        fArr2[3] = f4;
        return fArr2;
    }

    public final n74 b() {
        float[] a = a(this, null, 3);
        float f = a[2] - a[0];
        float f2 = a[3] - a[1];
        float max = Math.max(f, f2);
        return c(new m74(((max - f) / 2.0f) - a[0], max, ((max - f2) / 2.0f) - a[1]));
    }

    public final n74 c(jp3 jp3Var) {
        long j = this.b;
        long a = jp3Var.a(sp0.V(j), sp0.W(j));
        long a2 = rf1.a(Float.intBitsToFloat((int) (a >> 32)), Float.intBitsToFloat((int) (a & 4294967295L)));
        mk2 K = p70.K();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            K.add(((pd1) list.get(i)).a(jp3Var));
        }
        return new n74(p70.D(K), a2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n74)) {
            return false;
        }
        return this.a.equals(((n74) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[RoundedPolygon. Cubics = ");
        sb.append(o70.Z0(this.c, null, null, null, 0, null, 63));
        sb.append(" || Features = ");
        sb.append(o70.Z0(this.a, null, null, null, 0, null, 63));
        sb.append(" || Center = (");
        long j = this.b;
        sb.append(sp0.V(j));
        sb.append(", ");
        sb.append(sp0.W(j));
        sb.append(")]");
        return sb.toString();
    }
}
