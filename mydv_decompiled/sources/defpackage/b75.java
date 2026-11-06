package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class b75 {
    public final tk0 a;
    public final Object[] b;
    public final v65[] c;
    public int d;

    public b75(int i, tk0 tk0Var) {
        this.a = tk0Var;
        this.b = new Object[i];
        this.c = new v65[i];
    }

    public final void a(v65 v65Var, Object obj) {
        int i = this.d;
        this.b[i] = obj;
        this.d = i + 1;
        this.c[i] = v65Var;
    }

    public final void b(tk0 tk0Var) {
        v65[] v65VarArr = this.c;
        int length = v65VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            v65 v65Var = v65VarArr[length];
            v65Var.getClass();
            v65Var.O(this.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
