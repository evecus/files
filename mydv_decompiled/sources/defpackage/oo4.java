package defpackage;

import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class oo4 {
    public int[] I;
    public Object[] J;
    public int K;

    public oo4(int i) {
        this.I = i == 0 ? o7.e : new int[i];
        this.J = i == 0 ? o7.g : new Object[i << 1];
    }

    public final int a(Object obj) {
        int i = this.K * 2;
        Object[] objArr = this.J;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final int b(int i, Object obj) {
        int i2 = this.K;
        if (i2 == 0) {
            return -1;
        }
        int g = o7.g(i2, i, this.I);
        if (g < 0 || j42.c(obj, this.J[g << 1])) {
            return g;
        }
        int i3 = g + 1;
        while (i3 < i2 && this.I[i3] == i) {
            if (j42.c(obj, this.J[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = g - 1; i4 >= 0 && this.I[i4] == i; i4--) {
            if (j42.c(obj, this.J[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int c(Object obj) {
        return obj == null ? d() : b(obj.hashCode(), obj);
    }

    public final void clear() {
        int i = this.K;
        if (i > 0) {
            this.I = o7.e;
            this.J = o7.g;
            i = 0;
            this.K = 0;
        }
        if (i <= 0) {
            return;
        }
        y9.e();
    }

    public boolean containsKey(Object obj) {
        return c(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d() {
        int i = this.K;
        if (i == 0) {
            return -1;
        }
        int g = o7.g(i, 0, this.I);
        if (g < 0 || this.J[g << 1] == null) {
            return g;
        }
        int i2 = g + 1;
        while (i2 < i && this.I[i2] == 0) {
            if (this.J[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = g - 1; i3 >= 0 && this.I[i3] == 0; i3--) {
            if (this.J[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final Object e(int i) {
        if (i >= 0 && i < this.K) {
            return this.J[i << 1];
        }
        dq2.H0("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof oo4) {
                int i = this.K;
                if (i != ((oo4) obj).K) {
                    return false;
                }
                oo4 oo4Var = (oo4) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object e = e(i2);
                    Object h = h(i2);
                    Object obj2 = oo4Var.get(e);
                    if (h == null) {
                        if (obj2 != null || !oo4Var.containsKey(e)) {
                            return false;
                        }
                    } else if (!h.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.K != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.K;
            for (int i4 = 0; i4 < i3; i4++) {
                Object e2 = e(i4);
                Object h2 = h(i4);
                Object obj3 = ((Map) obj).get(e2);
                if (h2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(e2)) {
                        return false;
                    }
                } else if (!h2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.K)) {
            dq2.H0("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        Object[] objArr = this.J;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.I;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                dq.O0(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.J;
                dq.Q0(i3, i5 << 1, i2 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.J;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.I = Arrays.copyOf(iArr, i7);
            this.J = Arrays.copyOf(this.J, i7 << 1);
            if (i2 != this.K) {
                y9.e();
                return null;
            }
            if (i > 0) {
                dq.O0(0, 0, i, iArr, this.I);
                dq.Q0(0, 0, i3, objArr, this.J);
            }
            if (i < i4) {
                int i8 = i + 1;
                dq.O0(i, i8, i2, iArr, this.I);
                dq.Q0(i3, i8 << 1, i2 << 1, objArr, this.J);
            }
        }
        if (i2 == this.K) {
            this.K = i4;
            return obj;
        }
        y9.e();
        return null;
    }

    public final Object g(int i, Object obj) {
        if (i < 0 || i >= this.K) {
            dq2.H0("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.J;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public Object get(Object obj) {
        int c = c(obj);
        if (c >= 0) {
            return this.J[(c << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int c = c(obj);
        return c >= 0 ? this.J[(c << 1) + 1] : obj2;
    }

    public final Object h(int i) {
        if (i >= 0 && i < this.K) {
            return this.J[(i << 1) + 1];
        }
        dq2.H0("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final int hashCode() {
        int[] iArr = this.I;
        Object[] objArr = this.J;
        int i = this.K;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final boolean isEmpty() {
        return this.K <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.K;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int b = obj != null ? b(hashCode, obj) : d();
        if (b >= 0) {
            int i2 = (b << 1) + 1;
            Object[] objArr = this.J;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~b;
        int[] iArr = this.I;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.I = Arrays.copyOf(iArr, i4);
            this.J = Arrays.copyOf(this.J, i4 << 1);
            if (i != this.K) {
                y9.e();
                return null;
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.I;
            int i5 = i3 + 1;
            dq.O0(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.J;
            dq.Q0(i5 << 1, i3 << 1, this.K << 1, objArr2, objArr2);
        }
        int i6 = this.K;
        if (i == i6) {
            int[] iArr3 = this.I;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.J;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.K = i6 + 1;
                return null;
            }
        }
        y9.e();
        return null;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int c = c(obj);
        if (c < 0 || !j42.c(obj2, h(c))) {
            return false;
        }
        f(c);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int c = c(obj);
        if (c < 0 || !j42.c(obj2, h(c))) {
            return false;
        }
        g(c, obj3);
        return true;
    }

    public final int size() {
        return this.K;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.K * 28);
        sb.append('{');
        int i = this.K;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object e = e(i2);
            if (e != sb) {
                sb.append(e);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object h = h(i2);
            if (h != sb) {
                sb.append(h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int c = c(obj);
        if (c >= 0) {
            return f(c);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int c = c(obj);
        if (c >= 0) {
            return g(c, obj2);
        }
        return null;
    }
}
