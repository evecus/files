package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class rh extends r92 implements tm1 {
    public final /* synthetic */ byte J;
    public final /* synthetic */ sh K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rh(sh shVar, byte b) {
        super(1);
        this.J = b;
        this.K = shVar;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        bn3[] bn3VarArr;
        int i;
        wd5 wd5Var;
        int i2;
        byte b = this.J;
        wd5 wd5Var2 = wd5.a;
        int i3 = 0;
        sh shVar = this.K;
        switch (b) {
            case 0:
                an3 an3Var = (an3) obj;
                bn3[] bn3VarArr2 = shVar.c;
                bn3VarArr2.getClass();
                int i4 = shVar.e;
                int i5 = shVar.g;
                int length = bn3VarArr2.length;
                while (i3 < length) {
                    bn3 bn3Var = bn3VarArr2[i3];
                    if (bn3Var != null) {
                        bn3VarArr = bn3VarArr2;
                        i = i3;
                        long a = shVar.a.b.a((bn3Var.I << 32) | (bn3Var.J & 4294967295L), (i5 & 4294967295L) | (i4 << 32), da2.I);
                        an3.g(an3Var, bn3Var, (int) (a >> 32), (int) (a & 4294967295L));
                    } else {
                        bn3VarArr = bn3VarArr2;
                        i = i3;
                    }
                    i3 = i + 1;
                    bn3VarArr2 = bn3VarArr;
                }
                break;
            default:
                an3 an3Var2 = (an3) obj;
                bn3[] bn3VarArr3 = shVar.b;
                bn3VarArr3.getClass();
                int i6 = shVar.d;
                int i7 = shVar.f;
                int length2 = bn3VarArr3.length;
                while (i3 < length2) {
                    bn3 bn3Var2 = bn3VarArr3[i3];
                    if (bn3Var2 != null) {
                        u8 u8Var = shVar.a.b;
                        long j = (bn3Var2.J & 4294967295L) | (bn3Var2.I << 32);
                        wd5Var = wd5Var2;
                        i2 = i3;
                        long a2 = u8Var.a(j, (i6 << 32) | (i7 & 4294967295L), da2.I);
                        an3.g(an3Var2, bn3Var2, (int) (a2 >> 32), (int) (a2 & 4294967295L));
                    } else {
                        wd5Var = wd5Var2;
                        i2 = i3;
                    }
                    i3 = i2 + 1;
                    wd5Var2 = wd5Var;
                }
                break;
        }
        return wd5Var2;
    }
}
