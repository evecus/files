package defpackage;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jb0 extends AbstractMap implements Serializable {
    public static final Object R = new Object();
    public transient Object I;
    public transient int[] J;
    public transient Object[] K;
    public transient Object[] L;
    public transient int M;
    public transient int N;
    public transient hb0 O;
    public transient hb0 P;
    public transient t3 Q;

    public static jb0 a() {
        jb0 jb0Var = new jb0();
        jb0Var.M = Math.min(Math.max(3, 1), 1073741823);
        return jb0Var;
    }

    public static jb0 b(int i) {
        jb0 jb0Var = new jb0();
        sp0.p(i >= 0, "Expected size must be >= 0");
        jb0Var.M = Math.min(Math.max(i, 1), 1073741823);
        return jb0Var;
    }

    public final Map c() {
        Object obj = this.I;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (g()) {
            return;
        }
        this.M += 32;
        Map c = c();
        if (c != null) {
            this.M = Math.min(Math.max(size(), 3), 1073741823);
            c.clear();
            this.I = null;
            this.N = 0;
            return;
        }
        Arrays.fill(j(), 0, this.N, (Object) null);
        Arrays.fill(k(), 0, this.N, (Object) null);
        Object obj = this.I;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(i(), 0, this.N, 0);
        this.N = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map c = c();
        return c != null ? c.containsKey(obj) : e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map c = c();
        if (c != null) {
            return c.containsValue(obj);
        }
        for (int i = 0; i < this.N; i++) {
            if (jl2.z(obj, k()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.M & 31)) - 1;
    }

    public final int e(Object obj) {
        if (g()) {
            return -1;
        }
        int Y = ut0.Y(obj);
        int d = d();
        Object obj2 = this.I;
        Objects.requireNonNull(obj2);
        int h0 = c5.h0(Y & d, obj2);
        if (h0 == 0) {
            return -1;
        }
        int i = ~d;
        int i2 = Y & i;
        do {
            int i3 = h0 - 1;
            int i4 = i()[i3];
            if ((i4 & i) == i2 && jl2.z(obj, j()[i3])) {
                return i3;
            }
            h0 = i4 & d;
        } while (h0 != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        hb0 hb0Var = this.P;
        if (hb0Var != null) {
            return hb0Var;
        }
        hb0 hb0Var2 = new hb0(this, (byte) 0);
        this.P = hb0Var2;
        return hb0Var2;
    }

    public final void f(int i, int i2) {
        Object obj = this.I;
        Objects.requireNonNull(obj);
        int[] i3 = i();
        Object[] j = j();
        Object[] k = k();
        int size = size();
        int i4 = size - 1;
        if (i >= i4) {
            j[i] = null;
            k[i] = null;
            i3[i] = 0;
            return;
        }
        Object obj2 = j[i4];
        j[i] = obj2;
        k[i] = k[i4];
        j[i4] = null;
        k[i4] = null;
        i3[i] = i3[i4];
        i3[i4] = 0;
        int Y = ut0.Y(obj2) & i2;
        int h0 = c5.h0(Y, obj);
        if (h0 == size) {
            c5.i0(Y, i + 1, obj);
            return;
        }
        while (true) {
            int i5 = h0 - 1;
            int i6 = i3[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                i3[i5] = c5.Y(i6, i + 1, i2);
                return;
            }
            h0 = i7;
        }
    }

    public final boolean g() {
        return this.I == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map c = c();
        if (c != null) {
            return c.get(obj);
        }
        int e = e(obj);
        if (e == -1) {
            return null;
        }
        return k()[e];
    }

    public final Object h(Object obj) {
        if (!g()) {
            int d = d();
            Object obj2 = this.I;
            Objects.requireNonNull(obj2);
            int e0 = c5.e0(obj, null, d, obj2, i(), j(), null);
            if (e0 != -1) {
                Object obj3 = k()[e0];
                f(e0, d);
                this.N--;
                this.M += 32;
                return obj3;
            }
        }
        return R;
    }

    public final int[] i() {
        int[] iArr = this.J;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.K;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] k() {
        Object[] objArr = this.L;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        hb0 hb0Var = this.O;
        if (hb0Var != null) {
            return hb0Var;
        }
        hb0 hb0Var2 = new hb0(this, (byte) 1);
        this.O = hb0Var2;
        return hb0Var2;
    }

    public final int l(int i, int i2, int i3, int i4) {
        Object t = c5.t(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            c5.i0(i3 & i5, i4 + 1, t);
        }
        Object obj = this.I;
        Objects.requireNonNull(obj);
        int[] i6 = i();
        for (int i7 = 0; i7 <= i; i7++) {
            int h0 = c5.h0(i7, obj);
            while (h0 != 0) {
                int i8 = h0 - 1;
                int i9 = i6[i8];
                int i10 = ((~i) & i9) | i7;
                int i11 = i10 & i5;
                int h02 = c5.h0(i11, t);
                c5.i0(i11, h0, t);
                i6[i8] = c5.Y(i10, h02, i5);
                h0 = i9 & i;
            }
        }
        this.I = t;
        this.M = c5.Y(this.M, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fe -> B:43:0x00e4). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb0.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map c = c();
        if (c != null) {
            return c.remove(obj);
        }
        Object h = h(obj);
        if (h == R) {
            return null;
        }
        return h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map c = c();
        return c != null ? c.size() : this.N;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        t3 t3Var = this.Q;
        if (t3Var != null) {
            return t3Var;
        }
        t3 t3Var2 = new t3(this, (byte) 1);
        this.Q = t3Var2;
        return t3Var2;
    }
}
