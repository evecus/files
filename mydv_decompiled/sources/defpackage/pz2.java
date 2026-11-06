package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pz2 {
    public final h13 a;
    public final int b;
    public final int c;
    public final int d;
    public final /* synthetic */ x81 e;

    public pz2(x81 x81Var, h13 h13Var, int i, int i2, int i3) {
        this.e = x81Var;
        this.a = h13Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final int a() {
        h13 h13Var = this.a;
        h13 h13Var2 = h13.BYTE;
        int i = this.d;
        if (h13Var != h13Var2) {
            return i;
        }
        qz2 qz2Var = (qz2) this.e.d;
        d61 d61Var = (d61) qz2Var.d;
        String str = (String) qz2Var.c;
        int i2 = this.b;
        return str.substring(i2, i + i2).getBytes(d61Var.a[this.c].charset()).length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        h13 h13Var = this.a;
        sb.append(h13Var);
        sb.append('(');
        qz2 qz2Var = (qz2) this.e.d;
        if (h13Var == h13.ECI) {
            d61 d61Var = (d61) qz2Var.d;
            sb.append(d61Var.a[this.c].charset().displayName());
        } else {
            String str = (String) qz2Var.c;
            int i = this.d;
            int i2 = this.b;
            String substring = str.substring(i2, i + i2);
            StringBuilder sb2 = new StringBuilder();
            for (int i3 = 0; i3 < substring.length(); i3++) {
                if (substring.charAt(i3) < ' ' || substring.charAt(i3) > '~') {
                    sb2.append('.');
                } else {
                    sb2.append(substring.charAt(i3));
                }
            }
            sb.append(sb2.toString());
        }
        sb.append(')');
        return sb.toString();
    }
}
