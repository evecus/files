package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ki4 implements cj4, Iterable, w72 {
    public final n43 I;
    public lv2 J;
    public boolean K;
    public boolean L;

    public ki4() {
        long[] jArr = ia4.a;
        this.I = new n43();
    }

    @Override // defpackage.cj4
    public final void c(bj4 bj4Var, Object obj) {
        boolean z = obj instanceof v4;
        n43 n43Var = this.I;
        if (z && n43Var.c(bj4Var)) {
            Object g = n43Var.g(bj4Var);
            g.getClass();
            v4 v4Var = (v4) g;
            v4 v4Var2 = (v4) obj;
            String str = v4Var2.a;
            if (str == null) {
                str = v4Var.a;
            }
            dn1 dn1Var = v4Var2.b;
            if (dn1Var == null) {
                dn1Var = v4Var.b;
            }
            n43Var.m(bj4Var, new v4(str, dn1Var));
        } else {
            n43Var.m(bj4Var, obj);
        }
        bj4Var.getClass();
    }

    public final ki4 d() {
        ki4 ki4Var = new ki4();
        ki4Var.K = this.K;
        ki4Var.L = this.L;
        n43 n43Var = this.I;
        Object[] objArr = n43Var.b;
        Object[] objArr2 = n43Var.c;
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
                            int i4 = (i << 3) + i3;
                            ki4Var.I.m(objArr[i4], objArr2[i4]);
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
        return ki4Var;
    }

    public final Object e(bj4 bj4Var) {
        Object g = this.I.g(bj4Var);
        if (g != null) {
            return g;
        }
        zy.l(bj4Var, " - consider getOrElse or getOrNull", "Key not present: ");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki4)) {
            return false;
        }
        ki4 ki4Var = (ki4) obj;
        return this.I.equals(ki4Var.I) && this.K == ki4Var.K && this.L == ki4Var.L;
    }

    public final void f(ki4 ki4Var) {
        n43 n43Var = ki4Var.I;
        Object[] objArr = n43Var.b;
        Object[] objArr2 = n43Var.c;
        long[] jArr = n43Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        bj4 bj4Var = (bj4) obj;
                        n43 n43Var2 = this.I;
                        Object g = n43Var2.g(bj4Var);
                        bj4Var.getClass();
                        Object invoke = bj4Var.b.invoke(g, obj2);
                        if (invoke != null) {
                            n43Var2.m(bj4Var, invoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final int hashCode() {
        return pt1.o(this.L) + ((pt1.o(this.K) + (this.I.hashCode() * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        lv2 lv2Var = this.J;
        if (lv2Var == null) {
            lv2Var = new lv2(this.I);
            this.J = lv2Var;
        }
        return ((va1) lv2Var.entrySet()).iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.K) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.L) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        n43 n43Var = this.I;
        Object[] objArr = n43Var.b;
        Object[] objArr2 = n43Var.c;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((bj4) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
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
        return e21.P(this) + "{ " + ((Object) sb) + " }";
    }
}
