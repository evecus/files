package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pa0 implements l13 {
    public final l13 a;
    public final l13 b;

    public pa0(l13 l13Var, l13 l13Var2) {
        this.a = l13Var;
        this.b = l13Var2;
    }

    @Override // defpackage.l13
    public final boolean all(tm1 tm1Var) {
        return this.a.all(tm1Var) && this.b.all(tm1Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pa0)) {
            return false;
        }
        pa0 pa0Var = (pa0) obj;
        return j42.c(this.a, pa0Var.a) && j42.c(this.b, pa0Var.b);
    }

    @Override // defpackage.l13
    public final Object foldIn(Object obj, hn1 hn1Var) {
        return this.b.foldIn(this.a.foldIn(obj, hn1Var), hn1Var);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.l13
    public final /* synthetic */ l13 then(l13 l13Var) {
        return hf1.e(this, l13Var);
    }

    public final String toString() {
        StringBuilder sb = (StringBuilder) foldIn(new StringBuilder("["), new bd0((byte) 17));
        sb.append("]");
        return sb.toString();
    }
}
