package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class m22 {
    public int[] a;
    public int b;

    public final int a(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        dq2.J0("Index must be between 0 and size");
        throw null;
    }

    public final int b() {
        int i = this.b;
        if (i != 0) {
            return this.a[i - 1];
        }
        dq2.K0("IntList is empty.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m22) {
            m22 m22Var = (m22) obj;
            int i = m22Var.b;
            int i2 = this.b;
            if (i == i2) {
                int[] iArr = this.a;
                int[] iArr2 = m22Var.a;
                u22 c0 = ut0.c0(0, i2);
                int i3 = c0.I;
                int i4 = c0.J;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3] * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
            i2++;
        }
        return sb.toString();
    }
}
