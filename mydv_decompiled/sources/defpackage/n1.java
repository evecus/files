package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class n1 extends tn1 implements tm1 {
    public final /* synthetic */ byte I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.I = b;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        Object[] objArr;
        Object[] objArr2;
        int i;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                u1 u1Var = (u1) this.receiver;
                w33 w33Var = u1Var.X;
                if (booleanValue) {
                    u1Var.t0();
                } else {
                    fj0 fj0Var = null;
                    if (u1Var.K != null) {
                        Object[] objArr3 = w33Var.c;
                        long[] jArr = w33Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            byte b2 = 0;
                            int i2 = 0;
                            while (true) {
                                long j = jArr[i2];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i3 = 8;
                                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                                    int i5 = 0;
                                    while (i5 < i4) {
                                        if ((255 & j) < 128) {
                                            i = i3;
                                            objArr2 = objArr3;
                                            p70.g0(u1Var.getCoroutineScope(), null, null, new s1(u1Var, (vs3) objArr3[(i2 << 3) + i5], fj0Var, b2), 3);
                                        } else {
                                            objArr2 = objArr3;
                                            i = i3;
                                        }
                                        j >>= i;
                                        i5++;
                                        i3 = i;
                                        objArr3 = objArr2;
                                    }
                                    objArr = objArr3;
                                    if (i4 != i3) {
                                    }
                                } else {
                                    objArr = objArr3;
                                }
                                if (i2 != length) {
                                    i2++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                        vs3 vs3Var = u1Var.Z;
                        if (vs3Var != null) {
                            p70.g0(u1Var.getCoroutineScope(), null, null, new s1(u1Var, vs3Var, fj0Var, (byte) 1), 3);
                        }
                    }
                    w33Var.a();
                    u1Var.Z = null;
                    u1Var.u0();
                }
                return wd5Var;
            case 1:
                ((td) this.receiver).d((o10) obj);
                return wd5Var;
            case 2:
                k51 k51Var = (k51) obj;
                k51Var.getClass();
                return ((h90) this.receiver).l(k51Var);
            case 3:
                k51 k51Var2 = (k51) obj;
                k51Var2.getClass();
                return ((h90) this.receiver).l(k51Var2);
            case 4:
                k51 k51Var3 = (k51) obj;
                k51Var3.getClass();
                return ((h90) this.receiver).l(k51Var3);
            case 5:
                k51 k51Var4 = (k51) obj;
                k51Var4.getClass();
                return ((h90) this.receiver).l(k51Var4);
            case 6:
                k51 k51Var5 = (k51) obj;
                k51Var5.getClass();
                return ((h90) this.receiver).l(k51Var5);
            case 7:
                k51 k51Var6 = (k51) obj;
                k51Var6.getClass();
                return ((h90) this.receiver).l(k51Var6);
            case 8:
                k51 k51Var7 = (k51) obj;
                k51Var7.getClass();
                return ((h90) this.receiver).l(k51Var7);
            case 9:
                k51 k51Var8 = (k51) obj;
                k51Var8.getClass();
                return ((h90) this.receiver).l(k51Var8);
            case 10:
                k51 k51Var9 = (k51) obj;
                k51Var9.getClass();
                return ((h90) this.receiver).l(k51Var9);
            case 11:
                k51 k51Var10 = (k51) obj;
                k51Var10.getClass();
                return ((h90) this.receiver).l(k51Var10);
            case 12:
                k51 k51Var11 = (k51) obj;
                k51Var11.getClass();
                return ((h90) this.receiver).l(k51Var11);
            case 13:
                k51 k51Var12 = (k51) obj;
                k51Var12.getClass();
                return ((h90) this.receiver).l(k51Var12);
            case 14:
                k51 k51Var13 = (k51) obj;
                k51Var13.getClass();
                return ((h90) this.receiver).l(k51Var13);
            case 15:
                k51 k51Var14 = (k51) obj;
                k51Var14.getClass();
                return ((h90) this.receiver).l(k51Var14);
            case 16:
                k51 k51Var15 = (k51) obj;
                k51Var15.getClass();
                return ((h90) this.receiver).l(k51Var15);
            case 17:
                k51 k51Var16 = (k51) obj;
                k51Var16.getClass();
                return ((h90) this.receiver).l(k51Var16);
            case 18:
                k51 k51Var17 = (k51) obj;
                k51Var17.getClass();
                return ((h90) this.receiver).l(k51Var17);
            case 19:
                k51 k51Var18 = (k51) obj;
                k51Var18.getClass();
                return ((h90) this.receiver).l(k51Var18);
            default:
                ((wm4) this.receiver).b.a.edit().putInt("global_seed_argb", ((Number) obj).intValue()).apply();
                return wd5Var;
        }
    }
}
