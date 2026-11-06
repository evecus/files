package defpackage;

/* loaded from: classes2.dex */
public final class qo1 extends n0 {
    public final po1[] I;

    public qo1(x0 x0Var) {
        this.I = new po1[x0Var.size()];
        for (int i = 0; i != x0Var.size(); i++) {
            this.I[i] = po1.m(x0Var.y(i));
        }
    }

    public static qo1 m(e0 e0Var) {
        if (e0Var instanceof qo1) {
            return (qo1) e0Var;
        }
        if (e0Var != null) {
            return new qo1(x0.x(e0Var));
        }
        return null;
    }

    @Override // defpackage.e0
    public final u0 d() {
        return new pn0(this.I, (byte) 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeneralNames:");
        String str = ix4.a;
        sb.append(str);
        int i = 0;
        while (true) {
            po1[] po1VarArr = this.I;
            if (i == po1VarArr.length) {
                return sb.toString();
            }
            sb.append("    ");
            sb.append(po1VarArr[i]);
            sb.append(str);
            i++;
        }
    }
}
