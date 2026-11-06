package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class b8 {
    public byte a;
    public int b;
    public Object c;
    public int d;

    /* JADX WARN: Multi-variable type inference failed */
    public b8(int i, int i2, int i3, Object obj) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof b8)) {
                return false;
            }
            b8 b8Var = (b8) obj;
            byte b = this.a;
            if (b != b8Var.a) {
                return false;
            }
            if (b != 8 || Math.abs(this.d - this.b) != 1 || this.d != b8Var.b || this.b != b8Var.d) {
                if (this.d != b8Var.d || this.b != b8Var.b) {
                    return false;
                }
                Object obj2 = this.c;
                Object obj3 = b8Var.c;
                if (obj2 != null) {
                    if (!obj2.equals(obj3)) {
                        return false;
                    }
                } else if (obj3 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        byte b = this.a;
        sb.append(b != 1 ? b != 2 ? b != 4 ? b != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
