package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xm0 implements Comparable, Serializable {
    public static final xm0 K = new xm0("", (byte) 0);
    public static final xm0 L = new xm0("", (byte) 1);
    public final Comparable I;
    public final /* synthetic */ byte J;

    public xm0(Comparable comparable, byte b) {
        this.J = b;
        this.I = comparable;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int b(xm0 xm0Var) {
        switch (this.J) {
            case 0:
                return xm0Var == this ? 0 : 1;
            case 1:
                return xm0Var == this ? 0 : -1;
            default:
                if (xm0Var == L) {
                    return 1;
                }
                if (xm0Var == K) {
                    return -1;
                }
                Comparable comparable = xm0Var.I;
                g04 g04Var = g04.K;
                int compareTo = this.I.compareTo(comparable);
                return compareTo != 0 ? compareTo : Boolean.compare(false, false);
        }
    }

    public final void c(StringBuilder sb) {
        switch (this.J) {
            case 0:
                throw new AssertionError();
            case 1:
                sb.append("(-∞");
                return;
            default:
                sb.append('[');
                sb.append(this.I);
                return;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        switch (this.J) {
            case 0:
                return ((xm0) obj) == this ? 0 : 1;
            case 1:
                return ((xm0) obj) == this ? 0 : -1;
            default:
                return b(obj);
        }
    }

    public final void d(StringBuilder sb) {
        switch (this.J) {
            case 0:
                sb.append("+∞)");
                return;
            case 1:
                throw new AssertionError();
            default:
                sb.append(this.I);
                sb.append(')');
                return;
        }
    }

    public final boolean e(Comparable comparable) {
        switch (this.J) {
            case 0:
                break;
            case 1:
                break;
            default:
                g04 g04Var = g04.K;
                if (this.I.compareTo(comparable) <= 0) {
                    break;
                }
                break;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xm0) {
            try {
                if (b((xm0) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        switch (this.J) {
            case 0:
                return System.identityHashCode(this);
            case 1:
                return System.identityHashCode(this);
            default:
                return this.I.hashCode();
        }
    }

    public final String toString() {
        switch (this.J) {
            case 0:
                return "+∞";
            case 1:
                return "-∞";
            default:
                return "\\" + this.I + "/";
        }
    }
}
