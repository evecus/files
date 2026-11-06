package defpackage;

import androidx.media3.common.util.Log;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class zu2 implements Map, Serializable, a82 {
    public static final zu2 V;
    public Object[] I;
    public Object[] J;
    public int[] K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public av2 R;
    public bv2 S;
    public av2 T;
    public boolean U;

    static {
        zu2 zu2Var = new zu2(0);
        zu2Var.U = true;
        V = zu2Var;
    }

    public zu2(int i) {
        if (i < 0) {
            s83.t("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.I = objArr;
        this.J = null;
        this.K = iArr;
        this.L = new int[highestOneBit];
        this.M = 2;
        this.N = 0;
        this.O = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int i = i(obj);
            int i2 = this.M * 2;
            int length = this.L.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.L;
                int i4 = iArr[i];
                if (i4 == 0) {
                    int i5 = this.N;
                    Object[] objArr = this.I;
                    if (i5 < objArr.length) {
                        int i6 = i5 + 1;
                        this.N = i6;
                        objArr[i5] = obj;
                        this.K[i5] = i;
                        iArr[i] = i6;
                        this.Q++;
                        this.P++;
                        if (i3 > this.M) {
                            this.M = i3;
                        }
                        return i5;
                    }
                    f(1);
                } else {
                    if (j42.c(this.I[i4 - 1], obj)) {
                        return -i4;
                    }
                    i3++;
                    if (i3 > i2) {
                        j(this.L.length * 2);
                        break;
                    }
                    i = i == 0 ? this.L.length - 1 : i - 1;
                }
            }
        }
    }

    public final zu2 b() {
        c();
        this.U = true;
        if (this.Q > 0) {
            return this;
        }
        zu2 zu2Var = V;
        zu2Var.getClass();
        return zu2Var;
    }

    public final void c() {
        if (this.U) {
            e1.a();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.N - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.K;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.L[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        vt0.U(this.I, 0, this.N);
        Object[] objArr = this.J;
        if (objArr != null) {
            vt0.U(objArr, 0, this.N);
        }
        this.Q = 0;
        this.N = 0;
        this.P++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final void d(boolean z) {
        int i;
        Object[] objArr = this.J;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.N;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.K;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.I;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.L[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        vt0.U(this.I, i3, i);
        if (objArr != null) {
            vt0.U(objArr, i3, this.N);
        }
        this.N = i3;
    }

    public final boolean e(Collection collection) {
        boolean c;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int g = g(entry.getKey());
                    if (g < 0) {
                        c = false;
                    } else {
                        Object[] objArr = this.J;
                        objArr.getClass();
                        c = j42.c(objArr[g], entry.getValue());
                    }
                    if (!c) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        av2 av2Var = this.T;
        if (av2Var != null) {
            return av2Var;
        }
        av2 av2Var2 = new av2(this, (byte) 0);
        this.T = av2Var2;
        return av2Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.Q == map.size() && e(map.entrySet());
    }

    public final void f(int i) {
        Object[] objArr = this.I;
        int length = objArr.length;
        int i2 = this.N;
        int i3 = length - i2;
        int i4 = i2 - this.Q;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Log.LOG_LEVEL_OFF : 2147483639;
            }
            this.I = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.J;
            this.J = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.K = Arrays.copyOf(this.K, i6);
            int highestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (highestOneBit > this.L.length) {
                j(highestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int i = i(obj);
        int i2 = this.M;
        while (true) {
            int i3 = this.L[i];
            if (i3 == 0) {
                return -1;
            }
            int i4 = i3 - 1;
            if (j42.c(this.I[i4], obj)) {
                return i4;
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            i = i == 0 ? this.L.length - 1 : i - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int g = g(obj);
        if (g < 0) {
            return null;
        }
        Object[] objArr = this.J;
        objArr.getClass();
        return objArr[g];
    }

    public final int h(Object obj) {
        int i = this.N;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.K[i] >= 0) {
                Object[] objArr = this.J;
                objArr.getClass();
                if (j42.c(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        vu2 vu2Var = new vu2(this, (byte) 0);
        int i = 0;
        while (vu2Var.hasNext()) {
            i += vu2Var.d();
        }
        return i;
    }

    public final int i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.O;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.Q == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.K[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r6) {
        /*
            r5 = this;
            int r0 = r5.P
            int r0 = r0 + 1
            r5.P = r0
            int r0 = r5.N
            int r1 = r5.Q
            r2 = 0
            if (r0 <= r1) goto L10
            r5.d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.L = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.O = r6
        L1c:
            int r6 = r5.N
            if (r2 >= r6) goto L4d
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.I
            r0 = r0[r2]
            int r0 = r5.i(r0)
            int r1 = r5.M
        L2c:
            int[] r3 = r5.L
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.K
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.String r5 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            defpackage.zy.i(r5)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu2.j(int):void");
    }

    public final void k(int i) {
        int i2;
        int i3;
        int i4;
        int[] iArr;
        Object[] objArr = this.I;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.J;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i5 = this.K[i];
        loop0: while (true) {
            int i6 = i5;
            int i7 = 0;
            do {
                i5 = i5 == 0 ? this.L.length - 1 : i5 - 1;
                int[] iArr2 = this.L;
                i2 = iArr2[i5];
                i7++;
                if (i7 > this.M) {
                    iArr2[i6] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i6] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    i4 = i(this.I[i3]) - i5;
                    iArr = this.L;
                }
            } while ((i4 & (iArr.length - 1)) < i7);
            iArr[i6] = i2;
            this.K[i3] = i6;
        }
        this.K[i] = -1;
        this.Q--;
        this.P++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        av2 av2Var = this.R;
        if (av2Var != null) {
            return av2Var;
        }
        av2 av2Var2 = new av2(this, (byte) 1);
        this.R = av2Var2;
        return av2Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a = a(obj);
        Object[] objArr = this.J;
        if (objArr == null) {
            int length = this.I.length;
            if (length < 0) {
                s83.t("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.J = objArr;
        }
        if (a >= 0) {
            objArr[a] = obj2;
            return null;
        }
        int i = (-a) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        c();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        f(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a = a(entry.getKey());
            Object[] objArr = this.J;
            if (objArr == null) {
                int length = this.I.length;
                if (length < 0) {
                    s83.t("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.J = objArr;
                }
            }
            if (a >= 0) {
                objArr[a] = entry.getValue();
            } else {
                int i = (-a) - 1;
                if (!j42.c(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int g = g(obj);
        if (g < 0) {
            return null;
        }
        Object[] objArr = this.J;
        objArr.getClass();
        Object obj2 = objArr[g];
        k(g);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.Q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sb = new StringBuilder((this.Q * 3) + 2);
        sb.append("{");
        int i = 0;
        vu2 vu2Var = new vu2(this, (byte) (0 == true ? 1 : 0));
        while (vu2Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            vu2Var.c(sb);
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        bv2 bv2Var = this.S;
        if (bv2Var != null) {
            return bv2Var;
        }
        bv2 bv2Var2 = new bv2(this);
        this.S = bv2Var2;
        return bv2Var2;
    }

    public zu2() {
        this(8);
    }
}
