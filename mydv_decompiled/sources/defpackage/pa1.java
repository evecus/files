package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pa1 extends r92 implements tm1 {
    public final /* synthetic */ byte J;
    public final /* synthetic */ sa1 K;
    public final /* synthetic */ long L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pa1(sa1 sa1Var, long j, byte b) {
        super(1);
        this.J = b;
        this.K = sa1Var;
        this.L = j;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        tm1 tm1Var;
        tm1 tm1Var2;
        long j;
        int ordinal;
        byte b = this.J;
        sa1 sa1Var = this.K;
        switch (b) {
            case 0:
                int ordinal2 = ((aa1) obj).ordinal();
                long j2 = this.L;
                if (ordinal2 == 0) {
                    i20 i20Var = sa1Var.M.a.c;
                    if (i20Var != null && (tm1Var = i20Var.b) != null) {
                        j2 = ((z22) tm1Var.invoke(new z22(j2))).a;
                    }
                } else if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        s83.v();
                        return null;
                    }
                    i20 i20Var2 = sa1Var.N.a.c;
                    if (i20Var2 != null && (tm1Var2 = i20Var2.b) != null) {
                        j2 = ((z22) tm1Var2.invoke(new z22(j2))).a;
                    }
                }
                return new z22(j2);
            default:
                aa1 aa1Var = (aa1) obj;
                if (sa1Var.S != null && sa1Var.getAlignment() != null && !j42.c(sa1Var.S, sa1Var.getAlignment()) && (ordinal = aa1Var.ordinal()) != 0 && ordinal != 1) {
                    if (ordinal != 2) {
                        s83.v();
                        return null;
                    }
                    i20 i20Var3 = sa1Var.N.a.c;
                    if (i20Var3 != null) {
                        tm1 tm1Var3 = i20Var3.b;
                        long j3 = this.L;
                        long j4 = ((z22) tm1Var3.invoke(new z22(j3))).a;
                        u8 alignment = sa1Var.getAlignment();
                        alignment.getClass();
                        da2 da2Var = da2.I;
                        long a = alignment.a(j3, j4, da2Var);
                        u8 u8Var = sa1Var.S;
                        u8Var.getClass();
                        j = r22.b(a, u8Var.a(j3, j4, da2Var));
                        return new r22(j);
                    }
                }
                j = 0;
                return new r22(j);
        }
    }
}
