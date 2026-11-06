package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class d33 {
    public final n43 a;

    public /* synthetic */ d33(n43 n43Var) {
        this.a = n43Var;
    }

    public static final void a(n43 n43Var, Object obj, Object obj2) {
        int f = n43Var.f(obj);
        boolean z = f < 0;
        Object obj3 = z ? null : n43Var.c[f];
        if (obj3 != null) {
            if (obj3 instanceof e43) {
                e43 e43Var = (e43) obj3;
                e43Var.a(obj2);
                obj2 = e43Var;
            } else {
                Object[] objArr = ed3.a;
                e43 e43Var2 = new e43(2);
                e43Var2.a(obj3);
                e43Var2.a(obj2);
                obj2 = e43Var2;
            }
        }
        if (!z) {
            n43Var.c[f] = obj2;
            return;
        }
        int i = ~f;
        n43Var.b[i] = obj;
        n43Var.c[i] = obj2;
    }

    public static final Object b(n43 n43Var) {
        Object g = n43Var.g(null);
        if (g == null) {
            return null;
        }
        if (!(g instanceof e43)) {
            n43Var.k(null);
            return g;
        }
        e43 e43Var = (e43) g;
        Object f0 = e41.f0(e43Var);
        f0.getClass();
        if (e43Var.i()) {
            n43Var.k(null);
        }
        if (e43Var.b == 1) {
            n43Var.m(null, e43Var.f());
        }
        return f0;
    }

    public static final e43 c(n43 n43Var) {
        if (n43Var.i()) {
            e43 e43Var = ed3.b;
            e43Var.getClass();
            return e43Var;
        }
        e43 e43Var2 = new e43();
        Object[] objArr = n43Var.c;
        long[] jArr = n43Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof e43) {
                                e43Var2.b((e43) obj);
                            } else {
                                obj.getClass();
                                e43Var2.a(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return e43Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d33) {
            return this.a.equals(((d33) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ")";
    }
}
