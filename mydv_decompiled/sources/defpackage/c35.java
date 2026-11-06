package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class c35 extends u25 {
    public final String b;
    public final int c;
    public final tm1 d;

    public c35(Object obj, String str, int i, tm1 tm1Var) {
        super(obj);
        this.b = str;
        this.c = i;
        this.d = tm1Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.a);
        sb.append(", label=\"");
        sb.append(this.b);
        sb.append("\", leadingIcon=");
        return nt3.n(sb, this.c, ")");
    }
}
