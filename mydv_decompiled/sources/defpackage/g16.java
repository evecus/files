package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class g16 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ r24 J;
    public final /* synthetic */ s04 K;
    public final /* synthetic */ r24 L;
    public final /* synthetic */ r24 M;

    public /* synthetic */ g16(s04 s04Var, r24 r24Var, r24 r24Var2, r24 r24Var3) {
        this.K = s04Var;
        this.J = r24Var;
        this.L = r24Var2;
        this.M = r24Var3;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        r24 r24Var = this.M;
        r24 r24Var2 = this.L;
        s04 s04Var = this.K;
        r24 r24Var3 = this.J;
        switch (b) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                long longValue = ((Long) obj2).longValue();
                if (intValue == 21589) {
                    if (longValue >= 1) {
                        byte readByte = s04Var.readByte();
                        boolean z = (readByte & 1) == 1;
                        boolean z2 = (readByte & 2) == 2;
                        boolean z3 = (readByte & 4) == 4;
                        long j = z ? 5L : 1L;
                        if (z2) {
                            j += 4;
                        }
                        if (z3) {
                            j += 4;
                        }
                        if (longValue >= j) {
                            if (z) {
                                r24Var3.I = Integer.valueOf(s04Var.g());
                            }
                            if (z2) {
                                r24Var2.I = Integer.valueOf(s04Var.g());
                            }
                            if (z3) {
                                r24Var.I = Integer.valueOf(s04Var.g());
                                break;
                            }
                        } else {
                            zl1.g("bad zip: extended timestamp extra too short");
                        }
                    } else {
                        zl1.g("bad zip: extended timestamp extra too short");
                    }
                    break;
                }
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                long longValue2 = ((Long) obj2).longValue();
                if (intValue2 == 1) {
                    if (r24Var3.I != null) {
                        zl1.g("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    } else if (longValue2 == 24) {
                        r24Var3.I = Long.valueOf(s04Var.n());
                        r24Var2.I = Long.valueOf(s04Var.n());
                        r24Var.I = Long.valueOf(s04Var.n());
                        break;
                    } else {
                        zl1.g("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    break;
                }
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ g16(r24 r24Var, s04 s04Var, r24 r24Var2, r24 r24Var3) {
        this.J = r24Var;
        this.K = s04Var;
        this.L = r24Var2;
        this.M = r24Var3;
    }
}
